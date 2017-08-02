package at.ac.tuwien.big.xmlintelledit.intelledit.search.local;

import at.ac.tuwien.big.xmlintelledit.intelledit.proposal.Proposal;

public interface CurQualityProvider {
	
	public double getQuality(Proposal<?, ?> prop);

}
