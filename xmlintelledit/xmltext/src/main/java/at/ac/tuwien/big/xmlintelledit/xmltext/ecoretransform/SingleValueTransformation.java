package at.ac.tuwien.big.xmlintelledit.xmltext.ecoretransform;

import at.ac.tuwien.big.xmlintelledit.xmltext.ecoretransform.impl.SingleBasedCollectionValueTransformator;

public interface SingleValueTransformation<Xml,Ecore> extends ValueTransformation<Xml,Ecore> {

	
	public ValueTransformator<Xml, Ecore> getTransformator();

	public default CollectionValueTransformation<Xml, Ecore> asCollectionTransformation() {
		
		return new CollectionValueTransformation<Xml,Ecore>() {

			@Override
			public Class<Xml> getXmlClass() {
				return SingleValueTransformation.this.getXmlClass();
			}

			@Override
			public Class<Ecore> getEcoreClass() {
				return SingleValueTransformation.this.getEcoreClass();
			}

			@Override
			public CollectionValueTransformator<Xml, Ecore> getTransformator() {
				return new SingleBasedCollectionValueTransformator<>(SingleValueTransformation.this.getTransformator());
			}
			
		};
	}

}
