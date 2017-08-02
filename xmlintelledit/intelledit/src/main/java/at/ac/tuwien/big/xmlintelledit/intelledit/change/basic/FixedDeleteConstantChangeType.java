package at.ac.tuwien.big.xmlintelledit.intelledit.change.basic;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

import at.ac.tuwien.big.xmlintelledit.intelledit.change.ParameterType;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.parameter.ConditionalScopeParameterType;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.parameter.SimpleParameter;
import at.ac.tuwien.big.xmlintelledit.intelledit.scope.helper.EvalFunc;

public class FixedDeleteConstantChangeType<T> extends AbstractFixedFeatureChangeType<FixedDeleteConstantChangeType<T>,
	BasicDeleteConstantChange> {

	public FixedDeleteConstantChangeType(Resource res, EObject eobj, EStructuralFeature feat, 
				ParameterType<FixedDeleteConstantChangeType<T>, T> par) {
		super(res,eobj,feat,SimpleParameter.fromType(par, "value", 0));
	}
	
	public static<U> EvalFunc<FixedDeleteConstantChangeType<U>, List<U>> evalFunc() {
		return new EvalFunc<FixedDeleteConstantChangeType<U>, List<U>>() {
			
		@Override
		public List<U> eval(FixedDeleteConstantChangeType<U> t) {
			if (t == null) {
				return Collections.emptyList();
			}
			if (FeatureMapUtil.isMany(t.getEObject(), t.getFeature())) {
				return (List<U>)t.getEObject().eGet(t.getFeature());
			} else {
				U ret = (U)t.getEObject().eGet(t.getFeature());
				if (ret == null) {
					return Collections.emptyList();
				} else {
					return Collections.singletonList(ret);
				}	
			}
		}
	};
	}

		
	
	public FixedDeleteConstantChangeType(Resource res, EObject eobj, EStructuralFeature feat) {
		this(res,eobj,feat,new ConditionalScopeParameterType<FixedDeleteConstantChangeType<T>, T>(
				(Class<T>)feat.getEType().getInstanceClass(),
				FixedDeleteConstantChangeType.<T>evalFunc()));
	}

	protected FixedDeleteConstantChangeType(FixedDeleteConstantChangeType<T> other) {
		super(other);
	}

	@Override
	public BasicDeleteConstantChange compile() {
		return new BasicDeleteConstantChange(getResource(),getEObject(), getFeature(), get(0));
	}

	@Override
	public FixedDeleteConstantChangeType<T> clone() {
		return new FixedDeleteConstantChangeType<T>(this);
	}

	@Override
	protected String getShortName() {
		return "Delete";
	}

}
