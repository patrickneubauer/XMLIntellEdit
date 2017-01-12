package at.ac.tuwien.big.ecoretransform.impl;

import org.eclipse.emf.ecore.EAttribute;

import at.ac.tuwien.big.ecoretransform.CollectionValueTransformation;
import at.ac.tuwien.big.ecoretransform.EAttributeTransformator;

public class EAttributeTransformatorImpl implements EAttributeTransformator {
	
	private EAttribute xml;
	private EAttribute ecore;
	private CollectionValueTransformation transformation;
	
	public EAttributeTransformatorImpl(EAttribute xml, EAttribute ecore, CollectionValueTransformation transformation) {
		this.xml = xml;
		this.ecore = ecore;
		this.transformation = transformation;
	}

	@Override
	public EAttribute getXml() {
		return xml;
	}

	@Override
	public EAttribute getEcore() {
		return ecore;
	}

	@Override
	public CollectionValueTransformation getTransformation() {
		return transformation;
	}

}
