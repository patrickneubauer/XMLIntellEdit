package at.ac.tuwien.big.xmlintelledit.intelledit.change.basic;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

public class FixedClearChangeType<T> extends AbstractFixedFeatureChangeType<FixedClearChangeType<T>,
	BasicClearConstantChange> {
	
 	protected FixedClearChangeType(FixedClearChangeType<T> other) {
		super(other);
	}
 	
 	public FixedClearChangeType(Resource res, EObject obj, EStructuralFeature feat) {
 		super(res,obj,feat);
	}

	@Override
	public BasicClearConstantChange compile() {
		return new BasicClearConstantChange(getResource(),getEObject(), getFeature());
	}

	@Override
	public FixedClearChangeType<T> clone() {
		return new FixedClearChangeType<T>(this);
	}

	@Override
	protected String getShortName() {
		return "Clear";
	}

}
