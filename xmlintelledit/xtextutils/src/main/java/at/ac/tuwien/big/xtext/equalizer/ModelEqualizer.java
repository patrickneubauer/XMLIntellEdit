package at.ac.tuwien.big.xtext.equalizer;

public interface ModelEqualizer {
	
	/**Equalize s.t. the target corresponds to the source, 
	 * but only changes necessary are made
	 */
	public void equalize();
}
