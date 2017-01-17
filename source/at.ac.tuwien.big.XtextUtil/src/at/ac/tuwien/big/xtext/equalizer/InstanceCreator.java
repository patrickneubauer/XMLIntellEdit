package at.ac.tuwien.big.xtext.equalizer;

import java.util.Collection;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import at.ac.tuwien.big.xtext.util.MyEcoreUtil;


public interface InstanceCreator extends Creater<EObject, EClass> {
	
	InstanceCreator DEFAULT = new InstanceCreator() {
		
		@Override
		public EObject createInstance(EClass cl) {
			return MyEcoreUtil.createInstanceStatic(cl);
		}
	};

	public EObject createInstance(EClass cl);
	
	@Override
	public default EObject create(EClass cl) {
		return createInstance(cl);
	}

	public default EObject copyBasic(EObject targetObject) {
		EObject ret = createInstance(targetObject.eClass());
		for (EStructuralFeature esf: targetObject.eClass().getEAllStructuralFeatures()) {
			if (esf.isMany()) {
				ret.eSet(esf, new BasicEList((Collection)targetObject.eGet(esf)));
			} else {
				if (targetObject.eIsSet(esf)) {
					ret.eSet(esf, targetObject.eGet(esf));
				} else {
					ret.eUnset(esf);
				}
			}
		}
		return ret;
	}

}
