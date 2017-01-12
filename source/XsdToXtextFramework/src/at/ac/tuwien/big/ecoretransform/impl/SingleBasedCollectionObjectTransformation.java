package at.ac.tuwien.big.ecoretransform.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import at.ac.tuwien.big.ecoretransform.CollectionObjectTransformation;
import at.ac.tuwien.big.ecoretransform.CollectionValueTransformator;
import at.ac.tuwien.big.ecoretransform.SingleObjectTransformation;
import at.ac.tuwien.big.ecoretransform.Transformator;
import at.ac.tuwien.big.ecoretransform.ValueTransformator;

public class SingleBasedCollectionObjectTransformation implements CollectionObjectTransformation {
	
	private SingleObjectTransformation base;
	
	public SingleBasedCollectionObjectTransformation(SingleObjectTransformation trafo) {
		this.base = trafo;
	}

	@Override
	public Collection<EObject> convertToEcore(Collection<EObject> xml, Transformator tf) {
		List<EObject> ret = new ArrayList<EObject>(xml.size());
		for (EObject obj: xml) {
			EObject eo = base.convertToEcore(obj,tf);
			if (eo != null) {
				ret.add(eo);
			}
		}
		return ret;
	}

	@Override
	public Collection<EObject> convertToXml(Collection<EObject> eobject, Transformator tf) {
		List<EObject> ret = new ArrayList<>(eobject.size());
		for (EObject obj: eobject) {
			EObject eo = base.convertToXml(obj,tf);
			if (eo != null) {
				ret.add(eo);
			}
		}
		return ret;
	}

	@Override
	public EClass getXmlClass() {
		return base.getXmlClass();
	}

	@Override
	public EClass getEcoreClass() {
		return base.getEcoreClass();
	}

}
