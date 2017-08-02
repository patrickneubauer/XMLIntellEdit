package at.ac.tuwien.big.xmlintelledit.intelledit.proposal.impl;

import java.util.List;

import at.ac.tuwien.big.xmlintelledit.intelledit.change.BasicChange;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.Change;
import at.ac.tuwien.big.xmlintelledit.intelledit.proposal.Proposal;

public class ProposalImpl<T extends Comparable<T>> implements Proposal<T,ProposalImpl<T>>, Comparable<ProposalImpl<T>> {
	
	private Source source;
	
	public ProposalImpl(Source source, Change<?> ch) {
		this.change = ch;
		this.source = source;
	}
	
	
	
	
	private Change<?> change;
	private T quality;
	private double curQuality;
	private double costs;
	
	@Override
	public Source getSource() {
		return source;
	}

	@Override
	public Change<?> getChange() {
		return change;
	}

	@Override
	public T getQuality() {
		return quality;
	}

	@Override
	public void setQuality(T quality) {
		this.quality = quality;
	}

	@Override
	public double getCurQuality() {
		return curQuality;
	}

	@Override
	public void setCurQuality(double quality) {
		this.curQuality = quality;
	}


	@Override
	public double getCosts() {
		return costs;
	}

	@Override
	public void setCosts(double costs) {
		this.costs = costs;
	}
	
	public String toString() {
		return "Proposal curQ: " + curQuality+", q: "+quality+", costs: "+costs+":\n"+change;
	}

	private List<BasicChange<?>> reducedBasic;
	
	@Override
	public List<BasicChange<?>> getBasicChanges() {
		if (reducedBasic == null) {
			reducedBasic = change.getReducedBasicChanges();
		}
		return reducedBasic;
	}


}
