package at.ac.tuwien.big.xmlintelledit.util;

import java.util.HashMap;
import java.util.Map;

public class MapCorrespondingGetter implements CorrespondingGetter {

	private Map<Object,Object> map = new HashMap<>();
	
	public MapCorrespondingGetter() {
		
	}
	
	public MapCorrespondingGetter(Map<Object,Object> map) {
		this.map = map;
	}
	
	public void put(Object from, Object to) {
		map.put(from,to);
	}
	
	@Override
	public <T> T getCorresponding(T from) {
		if (from == null) {
			return null;
		}
		T ret = (T)map.get(from);
		if (ret == null) {
			new Exception().printStackTrace();
			System.err.println("Nothing found for "+from+"!");
		}
		return ret;
	}

}
