package at.ac.tuwien.big.xmlintelledit.xmltext.ecoretransform.impl;

import at.ac.tuwien.big.xmlintelledit.xmltext.ecoretransform.SingleValueTransformation;
import at.ac.tuwien.big.xmlintelledit.xmltext.ecoretransform.ValueTransformator;

public class SingleValueTransformationImpl<T,U> implements SingleValueTransformation<T, U>{
	private Class<T> xmlClass;
	private Class<U> ecoreClass;
	private ValueTransformator<T, U> transformator;
	
	public SingleValueTransformationImpl(Class<T> xmlClass, Class<U> ecoreClass, ValueTransformator<T, U> transformator) {
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
	public ValueTransformator<T, U> getTransformator() {
		return transformator;
	}

}
