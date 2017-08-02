package at.ac.tuwien.big.xmlintelledit.xmltext.ecoretransform;

import java.util.Collection;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

import at.ac.tuwien.big.xtext.util.MyEcoreUtil;

@SuppressWarnings({"rawtypes"})
public interface Transformator {
	
	public EObject xml2Eobject(EObject xmlObject);
	
	public EObject eobject2xml(EObject eobject);
	
	public void clearCompleted();
	
	public EObject getXmlObject(String id);
	
	public default String getId(EObject eobj) {
		EAttribute idAttribute = (eobj != null && eobj.eClass() != null && eobj.eClass().getEIDAttribute() != null)?eobj.eClass().getEIDAttribute():null;
		if (idAttribute == null) {
			return null;
		}
		Collection c = MyEcoreUtil.getAsCollection(eobj, idAttribute);
		if (c.isEmpty()) {
			return null;
		}
		return String.valueOf(c.iterator().next());
	}
}
