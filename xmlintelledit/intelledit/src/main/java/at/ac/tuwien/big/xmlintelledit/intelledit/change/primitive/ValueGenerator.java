package at.ac.tuwien.big.xmlintelledit.intelledit.change.primitive;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import at.ac.tuwien.big.xmlintelledit.intelledit.ecore.util.MyResource;

public interface ValueGenerator<T> {

	
	public T generate(MyResource res, EObject obj, EStructuralFeature feat);
}
