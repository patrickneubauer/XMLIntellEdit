package at.ac.tuwien.big.xmlintelledit.intelledit.change.basic;

import java.util.Objects;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import at.ac.tuwien.big.xmlintelledit.intelledit.change.Change;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.Undoer;
import at.ac.tuwien.big.xmlintelledit.intelledit.transfer.EcoreTransferFunction;
import at.ac.tuwien.big.xtext.util.MyEcoreUtil;

public abstract class AbstractFeatureChange<FC extends AbstractFeatureChange<FC>> implements FeatureChange<FC> {
	
	private EStructuralFeature feat;
	private EObject eobj;
	private Resource res;
	
	public AbstractFeatureChange(AbstractFeatureChange<FC> from) {
		this.feat = from.feat;
		this.eobj = from.eobj;
		this.res = from.res;
	}

	public AbstractFeatureChange(EObject toObj, EStructuralFeature feat, Resource res2) {
		this.eobj = toObj;
		this.feat = feat;
		this.res = res2;
				
	}

	public String targetName(Object value) {
		return MyEcoreUtil.getEObjName(value);
	}

	@Override
	public void checkChange() {
		if (eobj instanceof EObject && ((EObject) eobj).eResource() == null) {
			throw new RuntimeException();
		}
	}
	
	@Override
	public Undoer executeRemoveEmpty() {
		return execute();
	}
	
	public Resource forResource() {
		return res;
	}
	
	protected abstract String getSimpleName();
	
	protected abstract String getAdditionalValueName();
	
	public String toString() {
		return toString((EObject)null);
	}
	
	public String getName(EObject context) {
		StringBuilder ret = new StringBuilder();
		ret.append(getSimpleName()+" "+MyEcoreUtil.getEObjName(eobj,context) +"." + feat.getName() + " "+getAdditionalValueName());
		return ret.toString();
	}
	public String getName(String  context) {
		StringBuilder ret = new StringBuilder();
		ret.append(getSimpleName()+" "+MyEcoreUtil.getEObjName(eobj,context) +"." + feat.getName() + " "+getAdditionalValueName());
		return ret.toString();
	}
	
	public String toString(EObject context) {
		StringBuilder ret = new StringBuilder();
		
		ret.append(getSimpleName()+" "+MyEcoreUtil.getEObjName(eobj,context) +"." + feat.getName() + " "+getAdditionalValueName());
		return ret.toString();
	}
	
	public String toString(String  context) {
		StringBuilder ret = new StringBuilder();
		
		ret.append(getSimpleName()+" "+MyEcoreUtil.getEObjName(eobj,context) +"." + feat.getName() + " "+getAdditionalValueName());
		return ret.toString();
	}

	@Override
	public abstract Undoer execute();
	
	@Override
	public abstract FC clone();
	
	@Override
	public void transfer(EcoreTransferFunction func) {
		if (eobj == func.forward(eobj) || res == func.forwardResource() || !res.equals(func.backResource())) {
			String errorStr = (eobj == func.forward(eobj))+","+(res == func.forwardResource())+","+(res != func.backResource());
			eobj = func.forward(eobj);
		}
		eobj = func.forward(eobj);
		res = func.forwardResource();
	}

	@Override
	public EObject forObject() {
		return eobj;
	}

	@Override
	public EStructuralFeature forFeature() {
		return feat;
	}
	
	public int hashCode() {
		return Objects.hashCode(feat)*237455+Objects.hashCode(eobj)*13486;
	}
	
	public abstract boolean equals(FC other);
	
	public boolean equals(Object other) {
		if (other == null || other.getClass() != this.getClass()) {
			return false;
		}
		AbstractFeatureChange afc = (AbstractFeatureChange)other;
		return this.getClass() == other.getClass() && Objects.equals(feat, afc.feat) && Objects.equals(eobj,afc.eobj) && equals((FC)afc);
	}
	



	@Override
	public void removeNonretained(Set<Change<?>> retain, Set<Change<?>> remove) {}

}
