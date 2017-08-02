package at.ac.tuwien.big.xmlintelledit.intelledit.change.primitive;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

import at.ac.tuwien.big.xmlintelledit.intelledit.scope.ValueScope;
import at.ac.tuwien.big.xmlintelledit.intelledit.transfer.EcoreTransferFunction;

/**Contains all strings with difference 1*/
public class StringGenScope implements ValueScope<String, Boolean> {
	
	private static final char[] replaceChars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_0123456789".toCharArray(); // "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_ 0123456789;,.+*/".toCharArray();
	
	private static final Set<Character> replaceCharSet = new HashSet<Character>();
	static {
		for (char c: replaceChars) {
			replaceCharSet.add(c);
		}
	}
	

	public static final Random random = new Random();

	public static final StringGenScope INSTANCE = new StringGenScope();
	
	@Override
	public boolean contains(String sol) {
		//TODO: Only if it consists only of the above chars
		for (int i = 0; i < sol.length(); ++i) {
			if (!replaceCharSet.contains(sol.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	@Override
	public Boolean getQuality(String sol) {
		return contains(sol);
	}

	@Override
	public Iterator<String> iterator() {
		return new Iterator<String>() {
			char[] curArray = new char[0];
			int[] curArrayInt = new int[0];

			@Override
			public boolean hasNext() {
				return true;
			}

			@Override
			public String next() {
				String ret = new String(curArray);
				// TODO Auto-generated method stub
				for (int i = curArrayInt.length-1; i >= 0; --i) {
					if (curArrayInt[i] < replaceChars.length-1) {
						++curArrayInt[i];
						curArray[i] = replaceChars[curArrayInt[i]];
						for (int j = i+1; j < curArrayInt.length; ++j) {
							curArrayInt[j] = 0;
							curArray[j] = replaceChars[curArrayInt[j]];
						}
						return ret;
					}
				}
				//Augment array
				curArrayInt = new int[curArrayInt.length+1];
				curArray = new char[curArray.length+1];
				for (int i = 0; i < curArrayInt.length; ++i) {
					curArray[i] = replaceChars[0];
				}
				return ret;
			}
		};
	}

	@Override
	public boolean isFinite() {
		return false;
	}
	

	@Override
	public ContinuousIterator<String> sample() {
		LogIntScope scope = LogIntScope.SMALLINSTANCE;
		return ()->{
			int len = Math.max(1,scope.sampled());
			char[] ret = new char[len];
			for (int i = 0; i < ret.length; ++i) {
				ret[i] = replaceChars[random.nextInt(replaceChars.length)];
			}
			return new String(ret);
		};
	}
	
	@Override
	public void transfer(EcoreTransferFunction transferFunc) {
	}

}
