package at.ac.tuwien.big.xmlintelledit.intelledit.proposal;

import java.util.List;

import at.ac.tuwien.big.xmlintelledit.intelledit.change.BasicChange;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.Change;
import at.ac.tuwien.big.xmlintelledit.intelledit.proposal.impl.ProposalImpl;

public interface Proposal<T extends Comparable<T>, U extends Proposal<T,U>>  extends Comparable<U> {
	
	public enum Source {
		LOCAL,GENETIC
	}
	
	public Source getSource();
	
	public Change<?> getChange();
	
	public T getQuality();
	
	public void setQuality(T quality);
	
	public double getCurQuality();
	
	public void setCurQuality(double quality);
	
	public static<T extends Comparable<T>> ProposalImpl<T> fromChange(Source source, Change<?> ch) {
		return new ProposalImpl<T>(source,ch);
	}
	/*
	public default void revalidateIfNecessary() {
		if (needRevalidate()) {
			revalidate();
	}
	}
	
	public boolean needRevalidate();

	public void revalidate(MyResource newResource, EcoreTransferFunction transfer, );*/	
	
	
	public default int compareTo(U other) {
		int ret = -Double.compare(getCurQuality(), other.getCurQuality());
		if (ret != 0) {
			return ret;
		}
		ret = -getQuality().compareTo(other.getQuality());
		if (ret != 0) {
			return ret;
		}
		ret = Double.compare(getCosts(),other.getCosts());
		return ret;
	}

	public double getCosts();
	
	public void setCosts(double costs);

	public List<BasicChange<?>> getBasicChanges();

}
