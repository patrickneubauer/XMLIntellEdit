package at.ac.tuwien.big.xmlintelledit.intelledit.transfer;

import java.util.Collection;
import java.util.Iterator;

public interface SimpleDualMap<X,Y> {

	public void put(X x, Y y);
	
	public Y getValue(X x);
	
	public X getSource(Y y);
		
	public default Iterator<? extends X> sourceIterator() {
		return getDomain().iterator();
	}
	
	public Collection<? extends X> getDomain();
	
	public default Iterator<? extends Y> valueIterator() {
		return getRange().iterator();
	}
	
	public Collection<? extends Y> getRange();
	
	public default boolean containsKey(X key) {
		return getValue(key) == null;
	}
	
	public default boolean containsValue(Y value) {
		X ret = getSource(value);
		return ret != null;
	}
	
	public default Y getValueOrDefault(X x, Y y) {
		Y ret = getValue(x);
		if (ret == null) {
			return y;
		}
		return ret;
	}
	

	public void clear();
}
