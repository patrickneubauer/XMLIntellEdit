package at.ac.tuwien.big.xmlintelledit.intelledit.change.composite;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import at.ac.tuwien.big.xmlintelledit.intelledit.change.Change;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.ListUndoer;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.Undoer;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.FixAttemptReference;
import at.ac.tuwien.big.xmlintelledit.intelledit.transfer.EcoreTransferFunction;

public class CompositeChangeImpl implements Change<CompositeChangeImpl>{
	
	private List<Change<?>> subChanges;
	private Resource forResource;
	
	@Override
	public List<Change<?>> unbox() {
		return subChanges;
	}
	
	public int hashCode() {
		int ret = 0;
		int rretBla = 7;
		for (Change<?> ch: subChanges) {
			ret*=rretBla;
			ret+= ch.hashCode();
		}
		return ret;
	}
	
	public boolean equals(Object o) {
		if (subChanges.size() == 1) {
			if (subChanges.get(0).equals(o)) {
				return true;
			}
		}
		if (o instanceof CompositeChangeImpl) {
			CompositeChangeImpl cci = (CompositeChangeImpl)o;
			if (!Objects.equals(forResource(),cci.forResource())) {
				return false;
			}
			if (subChanges.size() != cci.subChanges.size()) {
				return false;
			}
			for (int i = 0; i < subChanges.size(); ++i) {
				if (!Objects.equals(subChanges.get(i), cci.subChanges.get(i))) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
	
	public CompositeChangeImpl(Resource res, List<Change<?>> changes) {
		this.forResource = res;
		this.subChanges = changes;
	}

	@Override
	public List<Change<?>> getSubChanges() {
		return subChanges;
	}

	@Override
	public CompositeChangeImpl clone() {
		List<Change<?>> cloned = new ArrayList<Change<?>>();
		for (Change<?> cur: subChanges) {
			cloned.add(cur.clone());
		}
		return new CompositeChangeImpl(forResource,cloned);
	}

	@Override
	public Resource forResource() {
		return forResource;
	}

	@Override
	public void transfer(EcoreTransferFunction func) {
		for (Change<?> ch: subChanges) {
			ch.transfer(func);
		}
		forResource = func.forwardResource();
	}
	
	public String toString() {
		return toString((EObject)null);
	}
	

	@Override
	public String toString(EObject context) {
		if (subChanges.isEmpty()) {
			return "[]";
		} else if (subChanges.size() == 1) {
			return "[\n"+Change.safeToString(subChanges.get(0),context)+"\n]";
		} else {
			StringBuilder ret = new StringBuilder();
			ret.append("Composite: [\n");
			{
				boolean first = true;
				for (Change<?> ch: subChanges) {
					if (first) {first = false;} else {ret.append(",\n");}
					ret.append(Change.safeToString(ch,context));
				}
			}
			ret.append("\n]");
			return ret.toString();
		}
	}

	@Override
	public void addFixReferencesLocal(Collection<FixAttemptReference> refs) {
	}

	@Override
	public void removeNonretained(Set<Change<?>> retain, Set<Change<?>> remove) {
		List<Integer> removeIndex = new ArrayList<Integer>();
		for (int i = 0; i < subChanges.size(); ++i) {
			if (remove.contains(subChanges.get(i))) {
				removeIndex.add(i-removeIndex.size());
				remove.remove(subChanges.get(i));
			}
		}
		for (Integer i: removeIndex) {
			subChanges.remove((int)i);
		}
		subChanges.retainAll(retain);
		for (Change<?> sb: subChanges) {
			sb.removeNonretained(retain,remove);
		}
	}
	
	private double costs = 0.0;
	
	public Undoer execute() {
		costs = 0.0;
		List<Undoer> undoList = new ArrayList<Undoer>();
		for (Change<?> sub: getSubChanges()) {
			undoList.add(sub.execute());
			costs+= sub.getCosts();
		}
		return ListUndoer.from(undoList);
	}


	@Override
	public Undoer executeRemoveEmpty() {
		costs = 0.0;
		List<Undoer> undoList = new ArrayList<Undoer>();
		Iterator<? extends Change<?>> iter = getSubChanges().iterator();
		while (iter.hasNext()) {
			Undoer undoer = iter.next().execute();
			if (undoer.isEmpty()) {
				iter.remove();
			} else {
				undoList.add(undoer);
			}
		}
		if (undoList.isEmpty()) {
			return Undoer.EMPTY;
		}
		return ListUndoer.from(undoList);
	}
	
	@Override
	public double getCosts() {
		return costs;
	}

	@Override
	public String getName(EObject context) {
		if (subChanges.isEmpty()) {
			return "No change";
		} else if (subChanges.size() == 1) {
			return (subChanges.get(0)==null)?"No change":subChanges.get(0).getName(context);
		}
		return "Multiple Changes";
	}

	@Override
	public boolean isIdentity() {
		for (Change<?> ch: getSubChanges()) {
			if (!ch.isIdentity()) {
				return false;
			}
		}
		return true;
	}

	@Override
	public void checkChange() {
		for (Change<?> sub: getSubChanges()) {
			sub.checkChange();
		}
	}



}
