package at.ac.tuwien.big.xmlintelledit.intelledit.transfer;

import java.util.Map;
import java.util.Map.Entry;


public class MapTransferFunction<T> implements TransferFunction<T> {
	private SimpleDualMap<T, T> map = new SimpleDualMapImpl<T, T>();
	
	protected MapTransferFunction() {
		
	}
	
	protected MapTransferFunction(Map<T,T> fromMap) {
		for (Entry<T,T> entr: fromMap.entrySet()) {
			map.put(entr.getKey(), entr.getValue());
		}
	}
	
	public static<T> MapTransferFunction<T> fromMap(Map<T,T> map) {
		return new MapTransferFunction<T>(map);
	}

	@Override
	public T forward(T from) {
		T ret =  map.getValue(from);
		return (ret==null)?from:ret;
	}

	@Override
	public T back(T to) {
		T ret = map.getSource(to);
		return (ret == null)?to:ret;
	}

}
