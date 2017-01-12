package at.ac.tuwien.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class ObjectSerializer {
	
	private Map<Object,ObjectInfo> allInfos = new IdentityHashMap<>();
	
	private Map<Class<?>, List<ObjectInfo>> objectInfosPerClass = new HashMap<>();
	
	private ObjectInfo nullObjectInfo = new ObjectInfo(null, 0, "null", this);
	
	private Set<String> names = new HashSet<>();
	
	public String getName(Object obj) {
		if (obj == null) {return "null";}
		int number = 1;
		String baseName = obj.getClass().getSimpleName();
		while (!names.add(baseName+number)) {
			++number;
		}
		return baseName+number;
	}
	
	public static String fullSerialize(Object o, int remainingDepth) {
		ObjectSerializer ret = new ObjectSerializer();
		ret.getInfo(o, remainingDepth);
		return ret.toString();
	}

	public ObjectInfo getInfo(Object o, int remainingDepth) {
		ObjectInfo ret = allInfos.get(o);
		if (o == null) {
			return nullObjectInfo;
		}
		if (ret == null) {
			List<ObjectInfo> curInfo = objectInfosPerClass.get(o.getClass());
			if (curInfo == null) {
				objectInfosPerClass.put(o.getClass(), curInfo = new ArrayList<ObjectInfo>());
			}
			String serialization = String.valueOf(o);
			ret = new ObjectInfo(o, remainingDepth, serialization, this);
			curInfo.add(ret);
			allInfos.put(o, ret);
		}
		ret.update(remainingDepth);
		return ret;
	}
	
	public String toString() {
		StringBuilder ret = new StringBuilder();
		List<Class<?>> sortedClasses = new ArrayList<>(objectInfosPerClass.keySet());
		Collections.sort(sortedClasses, new Comparator<Class<?>>() {

			@Override
			public int compare(Class<?> o1, Class<?> o2) {
				if (o1 == null) {return (o2 == null)?0:-1;}
				if (o2 == null) {return 1;}
				return String.valueOf(o1.getCanonicalName()).compareTo(String.valueOf(o2.getCanonicalName()));
			}
		});
		for (Class<?> c: sortedClasses) {
			List<ObjectInfo> infos = objectInfosPerClass.get(c);
			if (infos.isEmpty()) continue;
			boolean notPrimitive = false;
			for (ObjectInfo info: infos) {
				if (!info.isPrimitive()) {
					notPrimitive = true;
					break;
				}
			}
			if (!notPrimitive) {continue;}
			ret.append("For class " + c.getCanonicalName()+":\n");
			for (ObjectInfo info: infos) {
				if (info.isPrimitive()) {continue;}
				ret.append(info.toString());
				ret.append("\n");
			}
		}
		return ret.toString();
	}
	
	public static class A {
		private int a = 5;
		private B b = new B(); 
	}
	
	public static class B {
		private String bla = "Blablabla";
	}
	
	public static void main(String[] args) {
		ObjectSerializer test = new ObjectSerializer();
		test.getInfo(new A(), 5);
		System.out.println(test.toString());
	}

}
