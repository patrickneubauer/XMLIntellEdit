package at.ac.tuwien.big.xmlintelledit.intelledit.change.primitive;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Random;
import java.util.WeakHashMap;

import at.ac.tuwien.big.xmlintelledit.intelledit.scope.ValueScope;
import at.ac.tuwien.big.xmlintelledit.intelledit.transfer.EcoreTransferFunction;

/**Contains all strings with difference 1*/
public class StringChangeScope implements ValueScope<String, Boolean> {
	
	private static final char[] replaceChars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ -_0123456789;,.+*/".toCharArray();
	
	private StringChangeScope(String base, boolean allowAdd, boolean allowChange, boolean allowDelete) {
		this.base = base;
		this.allowAdd = allowAdd;
		this.allowChange = allowChange;
		this.allowDelete = allowDelete;/*
		diffOne = new HashSet<String>();
		diffOne.add(base);
		if (allowChange) {
			for (int i = 0; i < base.length(); ++i) {
				char[] cs = base.toCharArray();
				for (int j = 0; j < replaceChars.length; ++j) {
					cs[i] = replaceChars[j];
					diffOne.add(compressed(new String(cs)));
				}
			}
		}
		if (allowAdd) {
			for (int i = 0; i < base.length()+1; ++i) {
				char[] cs = base.toCharArray();
				cs = Arrays.copyOf(cs, cs.length+1);
				for (int j = base.length(); j > i; --j) {
					cs[j] = cs[j-1];
				}
				for (int j = 0; j < replaceChars.length; ++j) {
					cs[i] = replaceChars[j];
					diffOne.add(compressed(new String(cs)));
				}
			}
		}
		if (allowDelete) {
			for (int i = 0; i < base.length(); ++i) {
				char[] cs = base.toCharArray();
				for (int j = i+1; j < base.length(); ++j) {
					cs[j-1] = cs[j];
				}
				cs = Arrays.copyOf(cs, cs.length-1);
				diffOne.add(compressed(new String(cs)));
			}
		}
		diffOneList.addAll(diffOne);*/
	}
	
	private static WeakHashMap<String, StringChangeScope[]> cache = new WeakHashMap<String, StringChangeScope[]>();
	private static WeakHashMap<String, String> stringCompressor = new WeakHashMap<String, String>();
	
	public static String compressed(String str) {
		String ret = stringCompressor.get(str);
		if (ret == null) {
			stringCompressor.put(str,str);
		}
		return ret;
	}
	
	public static StringChangeScope getScope(String str, boolean allowAdd, boolean allowChange, boolean allowDelete) {
		StringChangeScope[] arr = cache.get(str);
		if (arr == null) {
			cache.put(str, arr = new StringChangeScope[8]);
		}
		int number = (allowAdd?4:0)+(allowChange?2:0)+(allowDelete?1:0);
		if (arr[number] == null) {
			arr[number] = new StringChangeScope(str, allowAdd, allowChange, allowDelete);
		}
		return arr[number];
	}
	
	
	private String base;
	private boolean allowAdd = true;
	private boolean allowChange = true;
	private boolean allowDelete = true;
	/*private Set<String> diffOne = new HashSet<>();
	private List<String> diffOneList = new ArrayList<>();*/

	@Override
	public boolean contains(String sol) {
		if (Objects.equals(base,sol)) {
			return true;
		}
		if (sol == null) {
			return false;
		}
		if (base.length() == sol.length()) {
			if (allowChange) {
				boolean haveChange = false;
				for (int i = 0; i < base.length(); ++i) {
					if (base.charAt(i) != sol.charAt(i)) {
						if (haveChange) {
							return false;
						}
						haveChange = true;
					}
				}
				return true;
			} else {
				return false;
			}
		} else if (base.length() == sol.length()+1) { //Delete
			int startEqual = 0;
			int endEqual = sol.length()-1;
			for (;startEqual < sol.length(); ++startEqual) {
				if (base.charAt(startEqual) != sol.charAt(startEqual)) {
					break;
				}
			}
			for (;endEqual >= 0; --endEqual) {
				if (base.charAt(endEqual+1) != sol.charAt(endEqual)) {
					break;
				}
			}
			return startEqual+1>=endEqual;
		} else if (sol.length() == base.length()+1) { //Add
			int startEqual = 0;
			int endEqual = base.length()-1;
			for (;startEqual < base.length(); ++startEqual) {
				if (sol.charAt(startEqual) != base.charAt(startEqual)) {
					break;
				}
			}
			for (;endEqual >= 0; --endEqual) {
				if (sol.charAt(endEqual+1) != base.charAt(endEqual)) {
					break;
				}
			}
			return startEqual+1>=endEqual;
		} else {
			return false;
		}
	}

	@Override
	public Boolean getQuality(String sol) {
		return contains(sol);
	}
	
	public int getMaxIndex() {
		//Change, Delete, Add
		return (allowChange?base.length()*replaceChars.length:0)+
				(allowDelete?base.length():0)+(allowAdd?(base.length()+1)*replaceChars.length:0);
	}
	
	public String getIndexed(int idx) {
		if (allowChange && idx >= base.length()*replaceChars.length) {
			idx-= base.length()*replaceChars.length;
		} else if (allowChange){
			char[] c = base.toCharArray();
			c[idx/replaceChars.length] = replaceChars[idx%replaceChars.length];
			String ret = new String(c);
			return ret;
		} 
		if (allowDelete && idx >= base.length()) {
			idx-= base.length();
		} else if (allowDelete) {
			int delChar = idx;
				char[] cs = base.toCharArray();
			    for (int j = delChar+1; j < base.length(); ++j) {
				 cs[j-1] = cs[j];
			    }
			    cs = Arrays.copyOf(cs, cs.length-1);
			    return new String(cs);
		} 
		
		if (allowAdd) {
			int addPos = idx/replaceChars.length;
			char[] cs = base.toCharArray();
			cs = Arrays.copyOf(cs, cs.length+1);
			for (int j = base.length(); j > addPos; --j) {
				cs[j] = cs[j-1];
			}
			cs[addPos] = replaceChars[idx%replaceChars.length];
			return new String(cs);
		}
		throw new ArrayIndexOutOfBoundsException();
	}

	@Override
	public Iterator<String> iterator() {
		return new Iterator<String>() {
			int curIndex = 0;
			int maxIndex = getMaxIndex();

			@Override
			public boolean hasNext() {
				return curIndex < maxIndex;
			}

			@Override
			public String next() {
				String ret = getIndexed(curIndex);
				System.out.println("Evaluating "+base+" -> "+ret);
				++curIndex;
				return ret;
			}
		};
	}

	@Override
	public boolean isFinite() {
		return true;
	}

	@Override
	public Iterator<String> sample() {
		return new Iterator<String>() {
			
			private Random random = new Random();
			private int maxIndex = getMaxIndex();

			@Override
			public boolean hasNext() {
				return true;
			}

			@Override
			public String next() {
				String ret = getIndexed(random.nextInt(maxIndex));
				System.out.println("Random Evaluating "+base+" -> "+ret);
				return ret;
			}
		};
	}
	
	@Override
	public void transfer(EcoreTransferFunction transferFunc) {
	}

}
