package at.ac.tuwien.big.xmlintelledit.intelledit.transfer;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SimpleDualMapImpl<X,Y> implements SimpleDualMap<X, Y> {
	private Map<X,Y> valueMap = new HashMap<>();
	private Map<Y,X> sourceMap = new HashMap<>();

	@Override
	public void put(X x, Y y) {
		sourceMap.put(y, x);
		valueMap.put(x, y);
	}

	@Override
	public Y getValue(X x) {
		return valueMap.get(x);
	}

	@Override
	public X getSource(Y y) {
		return sourceMap.get(y);
	}
	
	@Override
	public Collection<? extends X> getDomain() {
		return valueMap.keySet();
	}


	@Override
	public Collection<? extends Y> getRange() {
		return sourceMap.keySet();
	}

	@Override
	public void clear() {
		valueMap.clear();
		sourceMap.clear();
	}
}
