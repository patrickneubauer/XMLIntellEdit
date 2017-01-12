package at.ac.tuwien.big.ecoretransform;

import java.util.Collection;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;

public interface EReferenceTransformator {

	public EReference getXml();
	
	public EReference getEcore();
	
	public CollectionObjectTransformation getTransformation();

	public default Collection convertToEcore(Collection c, Transformator transformator) {
		return getTransformation().convertToEcore(c, transformator);
	}
	
	public default Collection convertToXml(Collection c, Transformator transformator) {
		return getTransformation().convertToXml(c, transformator);
	}
}
