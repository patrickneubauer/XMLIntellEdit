package at.ac.tuwien.big.xmlintelledit.intelledit.search.local.impl;

import at.ac.tuwien.big.xmlintelledit.intelledit.change.Change;
import at.ac.tuwien.big.xmlintelledit.intelledit.search.local.ChangeQuickfix;

public class ChangeQuickfixImpl<T extends Change<T>, U extends Comparable<U>> implements ChangeQuickfix<T, U>{
	private U quality;
	private T change;
	
	public ChangeQuickfixImpl(T change) {
		this.change = change;
	}

	@Override
	public void setQuality(U quality) {
		this.quality = quality;
	}

	@Override
	public U getQuality() {
		return quality;
	}

	@Override
	public T getChange() {
		return change;
	}

}
