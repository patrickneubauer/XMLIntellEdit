package at.ac.tuwien.big.xmltext.ecoretransform;

import java.util.Collection;

public interface CollectionValueTransformator<Xml,Ecore> {
	

	public Collection<Ecore> convertToEcore(Collection<Xml> xml);
	
	public Collection<Xml> convertToXml(Collection<Ecore> eobject);

}
