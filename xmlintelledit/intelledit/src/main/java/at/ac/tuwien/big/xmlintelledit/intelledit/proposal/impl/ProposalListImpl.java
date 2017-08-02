package at.ac.tuwien.big.xmlintelledit.intelledit.proposal.impl;

import java.util.PriorityQueue;
import java.util.WeakHashMap;

import at.ac.tuwien.big.xmlintelledit.intelledit.change.Change;
import at.ac.tuwien.big.xmlintelledit.intelledit.proposal.Proposal;
import at.ac.tuwien.big.xmlintelledit.intelledit.proposal.ProposalList;

public class ProposalListImpl<T extends Comparable<T>, U extends Proposal<T,U>> implements ProposalList<T,U>  {
	
	private int maxProposals = 20;
	private PriorityQueue<U> queue = new PriorityQueue<U>();
	private WeakHashMap<Change<?>,Boolean> knowChanges = new WeakHashMap<>();

	public boolean isEmpty() {
		return queue.isEmpty();
	}
	
	@Override
	public void addProposal(U prob) {
		if (knowChanges.containsKey(prob.getChange())) {
			return;
		}
		knowChanges.put(prob.getChange(), true);
		queue.add(prob);
		if (queue.size() > 2*getMaxProposals()) {
			PriorityQueue<U> newQueue = new PriorityQueue<>();
			for (int i = 0; i < getMaxProposals(); ++i) {
				newQueue.add(queue.poll());
			}
			queue = newQueue;
		}
	}

	@Override
	public void clearProposals() {
		knowChanges.clear();
		queue.clear();
	}

	@Override
	public Iterable<U> getProposals() {
		return queue;
	}

	@Override
	public int getMaxProposals() {
		return maxProposals;
	}

	@Override
	public void setMaxProposals(int proposals) {
		this.maxProposals = proposals;
	}

	@Override
	public void removeProposal(Proposal p) {
		queue.remove(p);
	}

}
