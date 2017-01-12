package at.ac.tuwien.big.ecoretransform;

import org.eclipse.emf.ecore.resource.Resource;

public interface TransformatorGenerator {

	
	public Transformator generateTransformator(Resource forXml);
}
