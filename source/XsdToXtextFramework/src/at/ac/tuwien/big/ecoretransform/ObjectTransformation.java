package at.ac.tuwien.big.ecoretransform;

import org.eclipse.emf.ecore.EClass;

public interface ObjectTransformation {
	
	public EClass getXmlClass();
	
	public EClass getEcoreClass();

}
