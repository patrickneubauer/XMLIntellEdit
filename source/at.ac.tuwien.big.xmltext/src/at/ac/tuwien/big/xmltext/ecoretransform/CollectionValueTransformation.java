package at.ac.tuwien.big.xmltext.ecoretransform;

public interface CollectionValueTransformation<Xml,Ecore> extends ValueTransformation<Xml,Ecore> {
	
	
	public CollectionValueTransformator<Xml, Ecore> getTransformator();
}
