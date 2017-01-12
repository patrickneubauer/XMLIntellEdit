package at.ac.tuwien.util;

import java.io.File;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.net.URI;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.ibm.icu.math.BigDecimal;

public class ObjectInfo {
	
	private Map<String,List<ObjectInfo>> otherObjects = new TreeMap<>();
	private boolean isSimple;
	private boolean isPrimitive;
	private Object referredObject;	
	private int curDepth;
	private ObjectSerializer serializer;
	private String serialization;
	private String myName;
	
	public ObjectInfo(Object referredObject, int remainingDepth, String serialization, ObjectSerializer serializer) {
		if (referredObject instanceof String) {
			this.serialization = "\""+serialization+"\"";
		} else {
			this.serialization = serialization;
		}
		this.curDepth = remainingDepth;
		this.serializer = serializer;
		this.referredObject = referredObject;
		if (referredObject == null || referredObject instanceof File || referredObject instanceof Path ||
				referredObject instanceof URI || referredObject instanceof URI || referredObject instanceof Boolean
				|| referredObject instanceof Integer || referredObject instanceof BigInteger || referredObject instanceof
				BigDecimal || referredObject instanceof Float || referredObject instanceof String || referredObject instanceof Character
				|| referredObject instanceof Double) {
			isPrimitive = true;
		} else {
			isSimple = true;
			this.myName = serializer.getName(referredObject);
		}
		
	}
	
	static List<Object> flattenCol(Collection c) {
		List<Object> ret = new ArrayList<Object>();
		for (Object o: c) {
			if (o instanceof Entry){
				ret.add("Key: "+((Entry) o).getKey());
				o = ((Entry) o).getValue();
			} 
			if (o instanceof Collection) {
				ret.addAll(flattenCol((Collection)o));
			} else {
				ret.add(o);
			}
		}
		return ret;
	}
	
	public void update(int remainingDepth) {
		if (!isSimple || isPrimitive || remainingDepth <= 0) {
			return;
		}
		isSimple = false;
		Class<?> cl = referredObject.getClass();
		for (Field field: cl.getDeclaredFields()) {
			field.setAccessible(true);
			Object obj;
			try {
				obj = field.get(referredObject);
				String name = cl.getSimpleName()+"."+field.getName();
				List<ObjectInfo> objInf = otherObjects.get(name);
				if (objInf == null) {
					otherObjects.put(name, objInf = new ArrayList<ObjectInfo>());
				}
				List<Object> objects = Collections.singletonList(obj);
				if (obj instanceof Map) {
					try {
						obj = ((Map) obj).entrySet();
					} catch (UnsupportedOperationException e) {
						
					}
				}
				if (obj instanceof Collection) {
					objects = flattenCol((Collection)obj);
				}
				for (Object o: objects) {
					objInf.add(serializer.getInfo(o,remainingDepth-1));
				}
			} catch (IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	public String simpleSerialize() {
		if (referredObject == null) {return "null";} else {return isPrimitive?serialization:myName;}
	}
	
	public String toString(List<ObjectInfo> infos) {
		if (infos.size() == 1) {
			return infos.get(0).simpleSerialize();
		} else {
			StringBuilder ret = new StringBuilder();
			ret.append("[");
			for (int i = 0; i < infos.size(); ++i) {
				if (i > 0) {ret.append(", ");}
				ret.append(infos.get(i).simpleSerialize());
			}
			ret.append("]");
			return ret.toString();
		}
	}
	
	public String toString() {
		if (referredObject == null) {
			return "Null Object";
		}
		StringBuilder ret = new StringBuilder();
		ret.append("Object " + myName + " ("+referredObject+")\n");
		for (Entry<String,List<ObjectInfo>> entr: otherObjects.entrySet()) {
			if (entr.getValue().isEmpty()) {continue;}
			ret.append(entr.getKey()+" = "+toString(entr.getValue())+"\n");
		}
		return ret.toString();
	}

	public boolean isPrimitive() {
		return isPrimitive;
	}

}
