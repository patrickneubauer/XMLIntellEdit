package at.ac.tuwien.big.xmlintelledit.intelledit.change.basic;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import at.ac.tuwien.big.xmlintelledit.intelledit.change.ParameterType;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.parameter.SimpleParameter;
import at.ac.tuwien.big.xmlintelledit.intelledit.ecore.util.MyResource;

public class FixedAddConstantChangeType<T> extends AbstractFixedFeatureChangeType<FixedAddConstantChangeType<T>,
	BasicAddConstantChange> {
	
	public FixedAddConstantChangeType(Resource res, EObject eobj, EStructuralFeature feat, 
				ParameterType<FixedAddConstantChangeType<T>, T> par) {
		super(res,eobj,feat,SimpleParameter.fromType(par, "value", 0));
	}
	
	public FixedAddConstantChangeType(Resource res, EObject eobj, EStructuralFeature feat) {
		this(res,eobj,feat,MyResource.get(res).defaultGenerator(feat));
	}
	
	

	protected FixedAddConstantChangeType(FixedAddConstantChangeType<T> other) {
		super(other);
	}

	@Override
	public BasicAddConstantChange compile() {
		return new BasicAddConstantChange(getResource(),getEObject(), getFeature(), get(0));
	}

	@Override
	public FixedAddConstantChangeType<T> clone() {
		return new FixedAddConstantChangeType<T>(this);
	}

	@Override
	protected String getShortName() {
		return "add";
	}

}
