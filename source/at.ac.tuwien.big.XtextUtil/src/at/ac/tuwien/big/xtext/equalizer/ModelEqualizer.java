package at.ac.tuwien.big.xtext.equalizer;

import org.eclipse.emf.ecore.resource.Resource;

public interface ModelEqualizer {
	
	/**Equalize s.t. the target corresponds to the source, 
	 * but only changes necessary are made
	 */
	public void equalize();
}
