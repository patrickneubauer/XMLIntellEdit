package at.ac.tuwien.big.xmlintelledit.intelledit.change.primitive;

import java.util.Iterator;

public interface ContinuousIterator<T> extends Iterator<T> {
	
	public T next();
	
	public default boolean hasNext() {
		return true;
	}

}
