package at.ac.tuwien.big.ecoretransform.impl;

import at.ac.tuwien.big.ecoretransform.ValueTransformator;

public class IdentityValueTransformator<T> implements ValueTransformator<T, T> {

	private static final IdentityValueTransformator<Object> DEFAULT = new IdentityValueTransformator<Object>();
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static<T> IdentityValueTransformator<T> getInstance() {
		return (IdentityValueTransformator)DEFAULT;
	}
	
	
	@Override
	public T convertToEcore(T xml) {
		return xml;
	}

	@Override
	public T convertToXml(T xml) {
		return xml;
	}

}
