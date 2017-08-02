package at.ac.tuwien.big.xmlintelledit.intelledit.change.basic;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import at.ac.tuwien.big.xmlintelledit.intelledit.change.ParameterType;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.parameter.SimpleParameter;
import at.ac.tuwien.big.xmlintelledit.intelledit.transfer.EcoreTransferFunction;

public class FixedReplaceConstantChangeType<T> extends AbstractFixedFeatureChangeType<FixedReplaceConstantChangeType<T>,
	BasicSetConstantChange> {
	
	private int index;
	
	public FixedReplaceConstantChangeType(Resource res, EObject eobj, EStructuralFeature feat,
			int index, ParameterType<FixedReplaceConstantChangeType<T>, T> par) {
		super(res,eobj,feat,SimpleParameter.fromType(par, "value", 0));
		this.index = index;
	}

	

	protected FixedReplaceConstantChangeType(FixedReplaceConstantChangeType<T> other) {
		super(other);
		this.index = other.index; 
		
	}

	@Override
	public BasicSetConstantChange compile() {
		return new BasicSetConstantChange(getResource(),getEObject(), getFeature(), index, get(0));
	}

	@Override
	public FixedReplaceConstantChangeType<T> clone() {
		return new FixedReplaceConstantChangeType<T>(this);
	}

	@Override
	protected String getShortName() {
		return "Replace "+index;
	}
	

	@Override
	public void transfer(EcoreTransferFunction transferFunc) {
		super.transfer(transferFunc);
	}

}
