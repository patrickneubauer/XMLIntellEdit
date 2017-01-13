package at.ac.tuwien.big.xmltext.ecoretransform;

public interface ValueTransformator<Xml,Ecore> {
	
	public Ecore convertToEcore(Xml xml);
	
	public Xml convertToXml(Ecore eobject);

}
