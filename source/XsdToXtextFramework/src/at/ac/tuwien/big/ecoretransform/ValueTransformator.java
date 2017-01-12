package at.ac.tuwien.big.ecoretransform;

public interface ValueTransformator<Xml,Ecore> {
	
	public Ecore convertToEcore(Xml xml);
	
	public Xml convertToXml(Ecore eobject);

}
