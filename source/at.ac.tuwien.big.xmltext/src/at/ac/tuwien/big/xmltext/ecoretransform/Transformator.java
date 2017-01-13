package at.ac.tuwien.big.xmltext.ecoretransform;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

public interface Transformator {
	
	public EObject xml2Eobject(EObject xmlObject);
	
	public EObject eobject2xml(EObject eobject);
	
	public void clearCompleted();

}
