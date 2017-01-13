package at.ac.tuwien.big.xmltext.ecoretransform.impl;

import at.ac.tuwien.big.xmltext.ecoretransform.CollectionValueTransformation;
import at.ac.tuwien.big.xmltext.ecoretransform.CollectionValueTransformator;
import at.ac.tuwien.big.xmltext.ecoretransform.SingleValueTransformation;
import at.ac.tuwien.big.xmltext.ecoretransform.ValueTransformator;

public class CollectionValueTransformationImpl<T,U> implements CollectionValueTransformation<T, U>{
	private Class<T> xmlClass;
	private Class<U> ecoreClass;
	private CollectionValueTransformator<T, U> transformator;
	
	public CollectionValueTransformationImpl(Class<T> xmlClass, Class<U> ecoreClass, ValueTransformator<T, U> transformator) {
		this.xmlClass = xmlClass;
		this.ecoreClass = ecoreClass;
		this.transformator = new SingleBasedCollectionValueTransformator<>(transformator);
	}
	
	public CollectionValueTransformationImpl(Class<T> xmlClass, Class<U> ecoreClass, CollectionValueTransformator<T, U> transformator) {
		this.xmlClass = xmlClass;
		this.ecoreClass = ecoreClass;
		this.transformator = transformator;
	}

	@Override
	public Class<T> getXmlClass() {
		return xmlClass;
	}

	@Override
	public Class<U> getEcoreClass() {
		return ecoreClass;
	}

	@Override
	public CollectionValueTransformator<T, U> getTransformator() {
		return transformator;
	}

}
