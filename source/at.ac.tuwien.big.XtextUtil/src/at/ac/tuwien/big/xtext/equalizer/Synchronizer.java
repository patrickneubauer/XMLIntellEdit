package at.ac.tuwien.big.xtext.equalizer;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

public interface Synchronizer {
	
	public Resource getLeft();
	
	public Resource getRight();
	
	public void synchronize();

}
