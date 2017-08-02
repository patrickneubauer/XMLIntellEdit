package at.ac.tuwien.big.xmlintelledit.xmltext.ecoretransform.impl;

import org.eclipse.emf.ecore.EReference;

import at.ac.tuwien.big.xmlintelledit.xmltext.ecoretransform.CollectionObjectTransformation;
import at.ac.tuwien.big.xmlintelledit.xmltext.ecoretransform.EReferenceTransformator;

public class EReferenceTransformatorImpl implements EReferenceTransformator {
	
	private EReference xml;
	private EReference ecore;
	private CollectionObjectTransformation transformation;
	
	public EReferenceTransformatorImpl(EReference xml, EReference ecore, CollectionObjectTransformation transformation) {
		this.xml = xml;
		this.ecore = ecore;
		this.transformation = transformation;
	}
	
	@Override
	public EReference getXml() {
		return xml;
	}

	@Override
	public EReference getEcore() {
		return ecore;
	}

	@Override
	public CollectionObjectTransformation getTransformation() {
		return transformation;
	}

}
