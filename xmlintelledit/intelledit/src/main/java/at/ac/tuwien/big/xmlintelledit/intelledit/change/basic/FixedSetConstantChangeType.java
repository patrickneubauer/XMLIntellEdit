package at.ac.tuwien.big.xmlintelledit.intelledit.change.basic;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import at.ac.tuwien.big.xmlintelledit.intelledit.change.ParameterType;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.parameter.SimpleParameter;
import at.ac.tuwien.big.xmlintelledit.intelledit.transfer.EcoreTransferFunction;

public class FixedSetConstantChangeType<T> extends AbstractFixedFeatureChangeType<FixedSetConstantChangeType<T>,
	BasicSetConstantChange> {
	
	public FixedSetConstantChangeType(Resource res, EObject eobj, EStructuralFeature feat, 
				ParameterType<FixedSetConstantChangeType<T>, T> par) {
		super(res,eobj,feat,SimpleParameter.fromType(par, "value", 0));
	}

	

	protected FixedSetConstantChangeType(FixedSetConstantChangeType<T> other) {
		super(other);
	}

	@Override
	public BasicSetConstantChange compile() {
		return new BasicSetConstantChange(getResource(),getEObject(), getFeature(), get(0));
	}

	@Override
	public FixedSetConstantChangeType<T> clone() {
		return new FixedSetConstantChangeType<T>(this);
	}

	@Override
	protected String getShortName() {
		return "Set";
	}
	

	@Override
	public void transfer(EcoreTransferFunction transferFunc) {
		super.transfer(transferFunc);
	}

}
