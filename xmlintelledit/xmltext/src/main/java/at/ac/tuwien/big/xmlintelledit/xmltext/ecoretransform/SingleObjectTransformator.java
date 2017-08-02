package at.ac.tuwien.big.xmlintelledit.xmltext.ecoretransform;

import org.eclipse.emf.ecore.EObject;

public interface SingleObjectTransformator {



	public EObject convertToEcore(EObject xml, Transformator transformator);
	
	public EObject convertToXml(EObject eobject, Transformator transformator);
}
