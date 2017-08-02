package at.ac.tuwien.big.xmlintelledit.intelledit.scope.helper;

import java.util.Iterator;

public class CountingIterator implements Iterator<Integer> {
	private int curIndex;
	private int maxIndex;
	
	public CountingIterator(int maxIndexExclusive) {
		this.maxIndex = maxIndexExclusive;
	}

	@Override
	public boolean hasNext() {
		return curIndex < maxIndex;
	}

	@Override
	public Integer next() {
		return curIndex++;
	}

}
