package at.ac.tuwien.big.xtext.equalizer;

import org.eclipse.emf.ecore.resource.Resource;

public interface Synchronizer {
	
	public Resource getLeft();
	
	public Resource getRight();
	
	public void synchronize();

}
