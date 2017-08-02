package at.ac.tuwien.big.xmlintelledit.xmltext.ecoretransform;

public interface CollectionValueTransformation<Xml,Ecore> extends ValueTransformation<Xml,Ecore> {
	
	
	public CollectionValueTransformator<Xml, Ecore> getTransformator();
}
