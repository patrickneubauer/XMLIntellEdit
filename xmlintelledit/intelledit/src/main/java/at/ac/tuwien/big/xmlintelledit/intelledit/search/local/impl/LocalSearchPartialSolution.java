package at.ac.tuwien.big.xmlintelledit.intelledit.search.local.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import org.eclipse.emf.ecore.EObject;

import at.ac.tuwien.big.xmlintelledit.intelledit.change.BasicChange;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.Change;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.ChangeType;

public class LocalSearchPartialSolution implements Comparable<LocalSearchPartialSolution> {
	
	private Stack<Change<?>> changes = new Stack<Change<?>>();
	private List<ChangeType<?, ? extends Change<?>>> directFixes = new ArrayList<>();
	private Map<EObject, Set<BasicChange<?>>> effectiveChanges = new HashMap<>();
	private int hashCode;
	private double costs;
	
	public int hashCode() {
		return hashCode;
	}
	
	private LocalSearchPartialSolution() {
		
	}
	
	public LocalSearchPartialSolution(Stack<Change<?>> changes, double quality, List<ChangeType<?, ? extends Change<?>>> list) {
		this.changes = changes;
		this.quality = improveQuality = quality;
		this.directFixes = list;
		costs = 0.0;
		for (Change<?> ch: changes) {
			costs+= ch.getCosts();
			addChange(ch);
		}
	}
	
	private void addChange(Change<?> ch) {
		for (BasicChange<?> bch: ch.getBaseChanges()) {
			Set<BasicChange<?>> changeSet = effectiveChanges.get(bch.forObject());
			if (changeSet == null) {
				effectiveChanges.put(bch.forObject(), changeSet = new HashSet<>());
			}
			if (changeSet.add(bch)) {
				hashCode+= bch.hashCode();
			}
		}
	}
	
	public LocalSearchPartialSolution added(Change<?> ch, double newQuality, List<ChangeType<?,? extends Change<?>>> newDirectFixes) {
		LocalSearchPartialSolution ret = new LocalSearchPartialSolution();
		ret.changes = new Stack<Change<?>>();
		ret.changes.addAll(ch.unbox());
		ret.changes.add(ch);
		ret.improveQuality = Math.max(newQuality,improveQuality);
		ret.quality = newQuality;
		ret.directFixes = newDirectFixes;
		ret.hashCode = hashCode;
		ret.effectiveChanges = new HashMap<EObject, Set<BasicChange<?>>>(effectiveChanges);
		ret.costs = 0.0;
		for (Change<?> c: ret.changes) {
			ret.costs+= c.getCosts();
			ret.addChange(c);
		} 
		ret.addChange(ch);
		return ret;
	}
	
	public boolean equals(Object o) {
		if (!(o instanceof LocalSearchPartialSolution)) {
			return false;
		}
		LocalSearchPartialSolution otherSol = (LocalSearchPartialSolution)o;
		return hashCode == otherSol.hashCode && effectiveChanges.equals(otherSol.effectiveChanges);
	}
	
	public Stack<Change<?>> getChanges() {
		return changes;
	}
	
	public List<ChangeType<?, ? extends Change<?>>> getDirectFixes() {
		return directFixes;
	}
	
	private double quality;
	
	public double getQuality() {
		return quality;
	}
	
	private double improveQuality;
	
	public double getImproveQuality() {
		return improveQuality;
	}
	
	public double getCosts() {
		return costs;
	}


	@Override
	public int compareTo(LocalSearchPartialSolution o) {
		if (this == o) {
			return 0;
		}
		int ret = Double.compare(quality, o.quality);
		if (ret == 0) {
			ret = Double.compare(costs, o.costs);
		}
		if (ret == 0) {
			ret = System.identityHashCode(this)-System.identityHashCode(o);
		}
		return ret;
	}

	public void clearFixes() {
		directFixes.clear();
	}

}
