package at.ac.tuwien.big.xmlintelledit.intelledit.change.basic;


import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

import at.ac.tuwien.big.xmlintelledit.intelledit.change.BasicChange;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.Change;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.EObjectChangeMap;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.Undoer;
import at.ac.tuwien.big.xmlintelledit.intelledit.ecore.util.MyResource;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.FixAttemptReference;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.FixAttemptReferenceImpl;
import at.ac.tuwien.big.xmlintelledit.intelledit.transfer.EcoreTransferFunction;

public class CreateObjectChange implements ObjectChange<CreateObjectChange> {
	
	private EClass cl;
	private Resource res;
	private BasicMoveConstantChange container;
	
	public CreateObjectChange(EClass cl, Resource res/*, BasicMoveConstantChange container*/) {
		this.cl = cl;
		this.res = res;
		this.container = container;
	}

	@Override
	public CreateObjectChange clone() {
		return new CreateObjectChange(cl,res/*,container==null?null:container.clone()*/);
	}

	@Override
	public void transfer(EcoreTransferFunction func) {
		res = func.other(res);
		if (container != null) {
			container.transfer(func);
		}
	}
	
	@Override
	public Resource forResource() {
		return res;
	}

	private double costs;
	

	@Override
	public void checkChange() {
		
	}
	
	@Override
	public Undoer execute() {
		if (true) return Undoer.EMPTY;
		EObject created = null;
		Undoer subUndoer = null;
		try {
			
			created = MyResource.get(res).getAndTrackCreated(cl);
			costs+= costProvider().getCreateCosts(cl);
			if (container == null) {
				res.getContents().add(created);
			}
			if (container != null) {
				subUndoer = container.execute();
				costs+= container.getCosts();
			}
		} catch (Exception e) {
			System.err.println("Could not create Object of class " + cl.getName()+": "+e.getMessage());
			created = EcoreUtil.create(cl);
		}
		Undoer subUndoerf = subUndoer;
		EObject fcreated = created;
		return ()->{
			if (subUndoerf != null) {
				subUndoerf.undo();
			}
			if (fcreated.eContainer() == null) {
				res.getContents().remove(fcreated);
			} else {
				EcoreUtil.delete(fcreated);
			}
			MyResource.get(res).trackDeleted(fcreated);
		};
	}

	@Override
	public EObject forObject() {
		return null;
	}
	
	public int hashCode() {
		return 2348*Objects.hashCode(cl);
	}
	

	@Override
	public boolean equals(Object o) {
		return (o instanceof CreateObjectChange) && ((CreateObjectChange)o).cl == cl; 
	}
	

	@Override
	public void addFixReferencesLocal(Collection<FixAttemptReference> refs) {
		refs.add(new FixAttemptReferenceImpl(forObject(),true));
	}


	@Override
	public void normalizeMap(EObjectChangeMap map) {
		map.clearChanges(forObject());
		List<BasicChange<?>> baseChanges = map.getPureObjectChanges(forObject());
		baseChanges.add(this);
	}
	

	@Override
	public double getCosts() {
		return costs;
	}
	
	@Override
	public void removeNonretained(Set<Change<?>> retain, Set<Change<?>> remove) {}

	@Override
	public String toString(EObject context) {
		return "Create Object of Class " + cl.getName();
	}
	
	public String getName(EObject eobj) {
		return "Create "+cl.getName();
	}

	@Override
	public boolean isIdentity() {
		return false;
	}

	@Override
	public Undoer executeRemoveEmpty() {
		return execute();
	}
}
