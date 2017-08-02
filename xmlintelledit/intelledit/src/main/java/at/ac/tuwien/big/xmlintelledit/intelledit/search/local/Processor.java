package at.ac.tuwien.big.xmlintelledit.intelledit.search.local;

import at.ac.tuwien.big.xmlintelledit.intelledit.proposal.Proposal;

public interface Processor<T> {
	
	public Proposal<?, ?> process(T original, T processed, double... evaluationar);

}
