package at.ac.tuwien.big.xmlintelledit.xmltext.ecoretransform;

public interface ValueTransformator<Xml,Ecore> {
	
	public Ecore convertToEcore(Xml xml);
	
	public Xml convertToXml(Ecore eobject);

}
