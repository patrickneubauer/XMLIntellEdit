package at.ac.tuwien.big.xmlintelledit.intelledit.scope;

import at.ac.tuwien.big.xmlintelledit.intelledit.transfer.ETransferrable;

public interface ComparablePair<T,U extends Comparable<U>> extends Comparable<ComparablePair<T,U>>, ETransferrable {
	
	public T getSolution();
	
	public U getQuality();
	
	@Override
	public default int compareTo(ComparablePair<T,U> other) {
		return getQuality().compareTo(other.getQuality());
	}

}
