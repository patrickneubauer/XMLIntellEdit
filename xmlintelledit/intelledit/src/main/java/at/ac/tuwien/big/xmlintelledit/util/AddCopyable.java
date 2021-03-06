package at.ac.tuwien.big.xmlintelledit.util;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xtext.parser.CardinalityAwareEcoreFactory;

public interface AddCopyable {

	public void copyFrom(AddCopyable other, CorrespondingGetter getter);
	
	public Collection<? extends Spawnable<?>> getSpawned();
	
	public void addToPseudoContainment(Collection<EObject> addObjects);
}
