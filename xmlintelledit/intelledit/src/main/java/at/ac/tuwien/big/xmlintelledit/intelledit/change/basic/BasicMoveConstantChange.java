package at.ac.tuwien.big.xmlintelledit.intelledit.change.basic;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import at.ac.tuwien.big.xmlintelledit.intelledit.change.BasicChange;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.EObjectChangeMap;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.Undoer;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.FixAttemptFeatureReferenceImpl;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.FixAttemptReference;
import at.ac.tuwien.big.xmlintelledit.intelledit.transfer.EcoreTransferFunction;
import at.ac.tuwien.big.xtext.util.MyEcoreUtil;

public class BasicMoveConstantChange extends AbstractFeatureChange<BasicMoveConstantChange> implements FeatureChange<BasicMoveConstantChange> {

	private EObject targetContainer;
	
	/**Moved von der aktuellen Position dazu, dass targetFeat das neue EContainingFeature ist und targetValue der neue Container*/
	public BasicMoveConstantChange(Resource res, EObject toObj, EStructuralFeature targetContainingFeat, EObject targetValue) {
		super(toObj,targetContainingFeat,res);
		this.targetContainer = targetValue;
	}

	@Override
	public BasicMoveConstantChange clone() {
		return new BasicMoveConstantChange(forResource(),forObject(), forFeature(), targetContainer);
	}

	
	@Override
	public void transfer(EcoreTransferFunction func) {
		targetContainer = (EObject)func.transfer(targetContainer);
		super.transfer(func);
	}
	@Override
	public void checkChange() {
		super.checkChange();
		if (targetContainer.eResource() == null) {
			throw new RuntimeException();
		}
	}
	
	@Override
	public Undoer execute() {
		try {
			costs = 0.0;
			int inResource = this.forObject().eResource().getContents().indexOf(forObject());
			EStructuralFeature curContaining = forObject().eContainingFeature();
			EObject curContainer = forObject().eContainer();
			if (curContainer != null && curContainer.equals(targetContainer)) {
				return Undoer.EMPTY;
			}
			if (inResource>= 0) {
				forObject().eResource().getContents().remove(forObject());
			}
			int containerIndex;
			if (curContainer != null) {
				containerIndex = MyEcoreUtil.removeValueGetIndex(curContainer, curContaining, forObject());
			} else {
				containerIndex = -1;
			}
			MyEcoreUtil.addValue(targetContainer, forFeature(), forObject());
			costs+= costProvider().getFunction(forObject()).getCosts(null, forObject())+
						costProvider().getFunction(forObject()).getCosts(forObject(),null);
			
			return ()->{
				MyEcoreUtil.removeValue(targetContainer, forFeature(), forObject());
				if (containerIndex != -1) {
					MyEcoreUtil.addValue(curContainer, curContaining, containerIndex, forObject());
				}
				if (inResource >= 0) {
					forObject().eResource().getContents().add(inResource,forObject());
				}
			};
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
			return Undoer.EMPTY;
		}
	}
	

	@Override
	protected String getSimpleName() {
		return "Move from ";
	}

	@Override
	protected String getAdditionalValueName() {
		return " to "+targetName(targetContainer);
	}

	public int hashCode() {
		return super.hashCode()+Objects.hashCode(targetContainer);
	}
	

	@Override
	public boolean equals(BasicMoveConstantChange o) {
		return Objects.equals(targetContainer, o.targetContainer); 
	}
	

	@Override
	public void addFixReferencesLocal(Collection<FixAttemptReference> refs) {
		//TODO: Stimm tdas?!
		refs.add(new FixAttemptFeatureReferenceImpl(forObject(), forFeature(),
				-1, null));
	}
	
	@Override
	public void normalizeMap(EObjectChangeMap map) {
		List<BasicChange<?>> baseChanges = map.getFeatureChanges(forObject(), forFeature());
		baseChanges.add(this);
	}
	


	private double costs;
	
	@Override
	public double getCosts() {
		return costs;
	}
	

	@Override
	public boolean isIdentity() {
		return targetContainer.equals(forObject().eContainer());
	}
	
}
