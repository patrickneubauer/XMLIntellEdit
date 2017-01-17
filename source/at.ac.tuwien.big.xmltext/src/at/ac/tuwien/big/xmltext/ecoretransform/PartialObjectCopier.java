package at.ac.tuwien.big.xmltext.ecoretransform;

import org.eclipse.emf.ecore.EObject;

import at.ac.tuwien.big.xmltext.ecoretransform.impl.TransformatorImpl;

public interface PartialObjectCopier {
	
	public void copyFrom(TransformatorImpl transformator, EObject from, EObject to);

}
