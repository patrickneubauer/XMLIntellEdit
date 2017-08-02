package at.ac.tuwien.big.xmlintelledit.intelledit.scope;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DeterministicSampler<T> implements Iterator<T> {
	//DeduceValue must be sorted!
	private double[] deduceValue;
	private double[] curValue;
	private List<T> base;
	
	public DeterministicSampler(List<T> base, double[] deduceValue) {
		this.base = base;
		this.deduceValue = deduceValue;
	}
	public void init(List<T> base, double[] deduceValue) {
		this.base = base;
		this.deduceValue = deduceValue;
		this.curValue = Arrays.copyOf(deduceValue, deduceValue.length);
	}
	
	private int curIndex;
	
	public T getValue() {
		int nextIndex = curIndex+1;
		if (nextIndex == base.size()) {
			nextIndex = 0;
		}
		if (curValue[curIndex] <= curValue[nextIndex]) {
			//Increase instead of deduce, whatever
			curValue[curIndex] +=deduceValue[curIndex];
			try {
				return base.get(curIndex);
			} finally {
				curIndex = nextIndex;
			}
		} else {
			curIndex = nextIndex;
			return getValue();
		}
	}

	@Override
	public boolean hasNext() {
		return !base.isEmpty();
	}

	@Override
	public T next() {
		return getValue();
	}

}
