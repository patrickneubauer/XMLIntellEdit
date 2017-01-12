package at.ac.tuwien.big.ecoretransform;

public interface ValueTransformation<Xml,Ecore> {
	
	public Class<Xml> getXmlClass();
	
	public Class<Ecore> getEcoreClass();
}
