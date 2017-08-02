package at.ac.tuwien.big.xmlintelledit.intelledit.change.basic;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import at.ac.tuwien.big.xmlintelledit.intelledit.change.ParameterType;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.parameter.SimpleParameter;

public class FixedMoveConstantChangeType<T> extends AbstractFixedFeatureChangeType<FixedMoveConstantChangeType<T>,
	BasicMoveConstantChange> {
	
	public FixedMoveConstantChangeType(Resource res, EObject eobj, EStructuralFeature feat, 
				ParameterType<FixedMoveConstantChangeType<T>, T> par) {
		super(res,eobj,feat,SimpleParameter.fromType(par, "value", 0));
	}

	protected FixedMoveConstantChangeType(FixedMoveConstantChangeType<T> other) {
		super(other);
	}

	@Override
	public BasicMoveConstantChange compile() {
		return new BasicMoveConstantChange(getResource(),getEObject(), getFeature(), get(0));
	}

	@Override
	public FixedMoveConstantChangeType<T> clone() {
		return new FixedMoveConstantChangeType<T>(this);
	}

	@Override
	protected String getShortName() {
		return "Move";
	}

}
