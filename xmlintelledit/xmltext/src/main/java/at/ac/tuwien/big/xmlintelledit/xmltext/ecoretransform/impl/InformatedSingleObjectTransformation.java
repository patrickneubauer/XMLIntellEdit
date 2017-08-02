package at.ac.tuwien.big.xmlintelledit.xmltext.ecoretransform.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import at.ac.tuwien.big.xmlintelledit.xmltext.ecoretransform.SingleObjectTransformation;
import at.ac.tuwien.big.xmlintelledit.xmltext.ecoretransform.SingleObjectTransformator;
import at.ac.tuwien.big.xmlintelledit.xmltext.ecoretransform.Transformator;

public class InformatedSingleObjectTransformation implements SingleObjectTransformation {

	private SingleObjectTransformator base;
	private EClass xmlClass;
	private EClass ecoreClass;
	
	public InformatedSingleObjectTransformation(EClass xmlClass, EClass ecoreClass, SingleObjectTransformator trafo) {
		this.xmlClass = xmlClass;
		this.ecoreClass = ecoreClass;
		this.base = trafo;
		;
	}
	
	@Override
	public EClass getXmlClass() {
		return xmlClass;
	}

	@Override
	public EClass getEcoreClass() {
		return ecoreClass;
	}

	@Override
	public EObject convertToEcore(EObject xml, Transformator transformator) {
		return base.convertToEcore(xml, transformator);
	}

	@Override
	public EObject convertToXml(EObject eobject, Transformator transformator) {
		return base.convertToXml(eobject, transformator);
	}

}
