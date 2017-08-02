package at.ac.tuwien.big.xmlintelledit.intelledit.change.primitive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class PrimitiveChanges {

	private static Map<Class<?>, List<ValueGenerator<?>>> generatorsPerClass = new HashMap<>();
	private static Map<Class<?>, List<ValueModificator<?>>> modificatorsPerClass = new HashMap<>();
	
	private static Random random = new Random();
	
	private static final String possibleCharsString = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_0123456789";
	private static final char[] possibleChars = possibleCharsString.toCharArray();
	
	{
		addGenerator(Integer.class, (x,y,z)->{return random.nextInt(20);});
		addGenerator(Long.class, (x,y,z)->{return random.nextInt(20);});
		addGenerator(Boolean.class, (x,y,z)->{return random.nextBoolean();});
		addGenerator(String.class, (x,y,z)->{
			int length = random.nextInt(10);
			StringBuilder builder = new StringBuilder();
			for (int i = 0; i < length; ++i) {
				builder.append(possibleChars[random.nextInt(possibleChars.length)]);
			}
			return builder.toString();});
	}
	
	public static void addGenerator(Class<?> cl, ValueGenerator<?> generator) {
		List<ValueGenerator<?>> curList = generatorsPerClass.get(cl);
		if (curList == null) {
			generatorsPerClass.put(cl, curList = new ArrayList<ValueGenerator<?>>());
		}
		curList.add(generator);
	}
	
	public static void addModificator(Class<?> cl, ValueModificator<?> modificator) {
		List<ValueModificator<?>> curList = modificatorsPerClass.get(cl);
		if (curList == null) {
			modificatorsPerClass.put(cl, curList = new ArrayList<ValueModificator<?>>());
		}
		curList.add(modificator);
	}
	
	public List<ValueGenerator<?>> getGenerators(Class<?> cl) {
		return generatorsPerClass.getOrDefault(cl, Collections.emptyList());
	}
	
	public List<ValueModificator<?>> getModificators(Class<?> cl) {
		return modificatorsPerClass.getOrDefault(cl, Collections.emptyList());
	}
}
