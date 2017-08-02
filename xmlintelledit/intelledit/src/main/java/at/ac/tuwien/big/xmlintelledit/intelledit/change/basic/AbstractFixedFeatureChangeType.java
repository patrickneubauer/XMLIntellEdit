package at.ac.tuwien.big.xmlintelledit.intelledit.change.basic;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import at.ac.tuwien.big.xmlintelledit.intelledit.change.Parameter;
import at.ac.tuwien.big.xmlintelledit.intelledit.transfer.EcoreTransferFunction;

public abstract class AbstractFixedFeatureChangeType<CT extends AbstractFixedFeatureChangeType<CT,C>, C extends FeatureChange<C>>
	extends ParameterHolderChangeType<CT,C> implements FeatureChangeType<CT, C> {
	private EObject eobj;
	private EStructuralFeature feat;
	
	protected abstract String getShortName();

	protected AbstractFixedFeatureChangeType(Resource res, EObject eobj, EStructuralFeature feat, Parameter<? super CT, ?>...  otherParameter) {
		super(res,otherParameter);
		this.eobj = eobj;
		this.feat = feat;
	}
	
	
	public String toString() {
		StringBuilder ret = new StringBuilder();
		ret.append(getShortName()+" "+feat.getName()+" of "+eobj);
		ret.append(getBaseString());
		return ret.toString();
	}
	

	protected AbstractFixedFeatureChangeType(AbstractFixedFeatureChangeType<CT, C> other) {
		super(other);
		this.eobj = other.eobj;
		this.feat = other.feat;
	}
	

	@Override
	public void transfer(EcoreTransferFunction transferFunc) {
		super.transfer(transferFunc);
		this.eobj = transferFunc.forward(eobj);
	}

	public EObject getEObject() {
		return eobj;
	}
	
	public EStructuralFeature getFeature() {
		return feat;
	}

	@Override
	public abstract C compile();

	
}
