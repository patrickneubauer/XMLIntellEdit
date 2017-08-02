package at.ac.tuwien.big.xmlintelledit.intelledit.change.basic;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import at.ac.tuwien.big.xmlintelledit.intelledit.change.BasicChange;

public interface FeatureChange<FC extends FeatureChange<FC>> extends BasicChange<FC> {

	
	@Override
	public Resource forResource();
	
	public EObject forObject();
	
	public EStructuralFeature forFeature();


	
}
