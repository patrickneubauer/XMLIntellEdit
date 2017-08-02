package at.ac.tuwien.big.xmlintelledit.intelledit.scope;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class RandomSampler<T> implements Iterator<T> {
	private List<T> list;
	
	private static Random random = new Random(12357745L);
	
	public RandomSampler(List<T> list) {
		this.list = list;
	}

	@Override
	public boolean hasNext() {
		return !list.isEmpty();
	}

	@Override
	public T next() {
		return list.get(random.nextInt(list.size()));
	}

}
