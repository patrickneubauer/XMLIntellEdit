package at.ac.tuwien.big.xmlintelledit.intelledit.proposal;

import java.util.Iterator;

public interface ProposalList<T extends Comparable<T>, U extends Proposal<T,U>> extends Iterable<U> {
	
	public void addProposal(U prob);
	
	public void clearProposals();
	
	public Iterable<U> getProposals();
	
	public default Iterator<U> iterator() {
		return getProposals().iterator();
	}
	
	public int getMaxProposals();
	
	public void setMaxProposals(int proposals);

	public boolean isEmpty();

	public void removeProposal(Proposal p);

}
