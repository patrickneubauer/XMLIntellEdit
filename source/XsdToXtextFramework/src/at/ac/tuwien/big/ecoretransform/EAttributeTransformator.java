package at.ac.tuwien.big.ecoretransform;

import java.util.Collection;

import org.eclipse.emf.ecore.EAttribute;

public interface EAttributeTransformator {
	
	public EAttribute getXml();
	
	public EAttribute getEcore();
	
	public CollectionValueTransformation getTransformation();

	public default Collection convertToEcore(Collection c) {
		return getTransformation().getTransformator().convertToEcore(c);
	}
	
	public default Collection convertToXml(Collection c) {
		return getTransformation().getTransformator().convertToXml(c);
	}

}
