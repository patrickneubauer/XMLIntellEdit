package at.ac.tuwien.big.xmlintelledit.xmltext.ecoretransform;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;

public interface CollectionObjectTransformation extends ObjectTransformation {


	public Collection<EObject> convertToEcore(Collection<EObject> xml, Transformator transformator);
	
	public Collection<EObject> convertToXml(Collection<EObject> eobject, Transformator transformator);
}
