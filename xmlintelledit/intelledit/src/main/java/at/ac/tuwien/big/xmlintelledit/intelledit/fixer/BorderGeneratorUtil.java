package at.ac.tuwien.big.xmlintelledit.intelledit.fixer;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;


public class BorderGeneratorUtil {

	

	public static Map<Class<?>,BorderGenerator<?>> borderGenerators = new HashMap<>();
	
	public static<T> void addGenerator(Class<T> cl, BorderGenerator<T> generator) {
		borderGenerators.put(cl,generator);
	}
	
	public static Object  getBelowOrNull(Object from) {
		if (from == null) {
			return null;
		}
		Class<?> cl = from.getClass();
		BorderGenerator<?> gen = borderGenerators.get(cl);
		if (gen != null) {
			return ((BorderGenerator)gen).getLowerBorder(from);
		}
		return null;
	}
	
	public static Object  getAboveOrNull(Object from) {
		if (from == null) {
			return null;
		}
		Class<?> cl = from.getClass();
		BorderGenerator<?> gen = borderGenerators.get(cl);
		if (gen != null) {
			return ((BorderGenerator)gen).getUpperBorder(from);
		}
		return null;
	}
	
	
	static {
		addGenerator(Long.class, (l)->{return new Long[]{l-1,l+1};});
		addGenerator(Integer.class, (l)->new Integer[]{l-1,l+1});
		addGenerator(BigInteger.class, (l)->new BigInteger[]{l.add(BigInteger.ONE),l.subtract(BigInteger.ONE)});
		//TODO for double: may not work in all cases
		addGenerator(Double.class, (l)->new Double[]{l-0.01,l+0.01});
	}
}
