package at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.fixinggenerators;

import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.FixAttempt;

public interface GetQualityFunc {
	
	public double getQuality(int index, FixAttempt attempt);

}
