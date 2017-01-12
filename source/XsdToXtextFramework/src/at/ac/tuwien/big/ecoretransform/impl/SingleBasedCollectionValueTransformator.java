package at.ac.tuwien.big.ecoretransform.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import at.ac.tuwien.big.ecoretransform.CollectionValueTransformator;
import at.ac.tuwien.big.ecoretransform.ValueTransformator;

public class SingleBasedCollectionValueTransformator<Xml,Ecore> implements CollectionValueTransformator<Xml, Ecore> {
	
	private ValueTransformator<Xml, Ecore> base;
	
	public SingleBasedCollectionValueTransformator(ValueTransformator<Xml, Ecore> trafo) {
		this.base = trafo;
	}

	@Override
	public Collection<Ecore> convertToEcore(Collection<Xml> xml) {
		List<Ecore> ret = new ArrayList<Ecore>(xml.size());
		for (Xml obj: xml) {
			Ecore o = base.convertToEcore(obj);
			if (o != null) {
				ret.add(o);
			}
		}
		return ret;
	}

	@Override
	public Collection<Xml> convertToXml(Collection<Ecore> eobject) {
		List<Xml> ret = new ArrayList<>(eobject.size());
		for (Ecore obj: eobject) {
			Xml o = base.convertToXml(obj);
			if (o != null) {
				ret.add(o);
			}
		}
		return ret;
	}

}
