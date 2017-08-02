package at.ac.tuwien.big.xmlintelledit.xmltext.ecoretransform;

import java.util.Collection;

import org.eclipse.emf.ecore.EAttribute;

@SuppressWarnings({"rawtypes", "unchecked"})
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
