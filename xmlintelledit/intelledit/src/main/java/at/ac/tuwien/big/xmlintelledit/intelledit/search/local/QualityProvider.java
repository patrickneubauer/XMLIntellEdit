package at.ac.tuwien.big.xmlintelledit.intelledit.search.local;

import at.ac.tuwien.big.xmlintelledit.intelledit.proposal.Proposal;

public interface QualityProvider<T extends Comparable<T>> {

	public T getQuality(Proposal<T, ?> prop);
}
