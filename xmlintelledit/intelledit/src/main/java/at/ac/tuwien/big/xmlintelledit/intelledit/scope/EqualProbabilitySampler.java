package at.ac.tuwien.big.xmlintelledit.intelledit.scope;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class EqualProbabilitySampler<T> implements Iterator<T> {
	private List<T> base;
	private Random random = new Random();
	
	public EqualProbabilitySampler(List<T> base) {
		this.base = base;
	}
	
	
	@Override
	public boolean hasNext() {
		return !base.isEmpty();
	}
	
	@Override
	public T next() {
		return base.get(random.nextInt(base.size()));
	}

}
