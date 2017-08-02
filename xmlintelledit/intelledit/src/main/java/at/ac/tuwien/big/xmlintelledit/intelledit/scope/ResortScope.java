package at.ac.tuwien.big.xmlintelledit.intelledit.scope;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import at.ac.tuwien.big.xmlintelledit.intelledit.transfer.EcoreTransferFunction;



public class ResortScope<Solution, Quality extends Comparable<Quality>> implements ValueScope<Solution, Quality> {
	private ValueScope<Solution, ?> base;
	private QualityProvider<Solution, Quality> qualityProvider;
	private Map<Solution, Quality> calculatedQualities = new HashMap<>();
	private int lookSize = 200;
	
	public ResortScope(ValueScope<Solution, ?> base, QualityProvider<Solution, Quality> provider, int lookSize) {
		this.base = base;
		this.qualityProvider = provider;
		this.lookSize = lookSize;
	}
	
	public static<Solution> ResortScope<Solution,DoubleQuality> defaultResortScope(ValueScope<Solution, ?> base, EObject forObject, EStructuralFeature forFeature, int forIndex) {
		return new ResortScope<Solution, DoubleQuality>(base, new ViolatedConstraintsQualityProvider(forObject,forFeature,forIndex), 200);
	}
	

	@Override
	public boolean contains(Solution sol) {
		return base.contains(sol);
	}

	@Override
	public Quality getQuality(Solution sol) {
		Quality calculated = calculatedQualities.get(sol);
		if (calculated == null) {
			calculatedQualities.put(sol, calculated = qualityProvider.provide(sol));
		}
		return calculated;
	}

	@Override
	public Iterator<Solution> iterator() {
		PriorityQueue<Solution> ret = new PriorityQueue<Solution>(new Comparator<Solution>() {

			@Override
			public int compare(Solution o1, Solution o2) {
				return -getQuality(o1).compareTo(getQuality(o2));
			}
		});
		Iterator<Solution> baseIter = base.iterator();
		for (int i = 0; i < lookSize && baseIter.hasNext(); ++i) {
			ret.add(baseIter.next());
		}
		
		return new Iterator<Solution>() {

			@Override
			public boolean hasNext() {
				return !ret.isEmpty();
			}

			@Override
			public Solution next() {
				Solution rsol = ret.poll();
				if (baseIter.hasNext()) {
					ret.add(baseIter.next());
				}
				return rsol;
			}
		};
	}

	@Override
	public boolean isFinite() {
		return base.isFinite();
	}

	@Override
	public Iterator<Solution> sample() {
		// TODO Implement "intelligent" sampling
		return base.sample();
	}

	@Override
	public void transfer(EcoreTransferFunction transferFunc) {
		base.transfer(transferFunc);
	}

}
