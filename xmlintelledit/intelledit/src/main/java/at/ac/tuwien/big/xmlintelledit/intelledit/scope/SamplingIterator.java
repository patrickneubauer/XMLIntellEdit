package at.ac.tuwien.big.xmlintelledit.intelledit.scope;

import java.util.Iterator;
import java.util.Random;

public class SamplingIterator<T> implements Iterator<T> {
	
	private Iterator<T> first;
	private Iterator<T> second;
	private SimpleMapValueScope<T> scope;
	
	public static Random random = new Random(72345L);
	
	public SamplingIterator(SimpleMapValueScope<T> scope) {
		this.scope = scope;
		this.first = scope.deterministicSampler();
		this.second = scope.completelyRandomSampler();
	}

	@Override
	public boolean hasNext() {
		return first.hasNext() && second.hasNext();
	}

	@Override
	public T next() {
		T firstTry = first.next();
		T secondTry = second.next();
		if (scope.getQuality(firstTry)*random.nextDouble() <= scope.getQuality(secondTry)*random.nextDouble()) {
			return firstTry;
		} else {
			return secondTry;
		}
	}

}
