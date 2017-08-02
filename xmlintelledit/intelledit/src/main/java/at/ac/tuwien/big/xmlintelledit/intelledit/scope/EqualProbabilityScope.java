package at.ac.tuwien.big.xmlintelledit.intelledit.scope;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import at.ac.tuwien.big.xmlintelledit.intelledit.transfer.ETransferrable;
import at.ac.tuwien.big.xmlintelledit.intelledit.transfer.EcoreTransferFunction;

public class EqualProbabilityScope<T> implements ValueScope<T,Boolean>{
	
	private List<T> t;
	
	private EqualProbabilityScope(List<T> t) {
		this.t = t;
	}
	
	public String toString() {
		if (t.size() == 1) {
			return "Choose always " + t.iterator().next();
		} else {
			StringBuilder ret = new StringBuilder();
			ret.append("Choose equally between: [");
			{
				boolean first = true;
				for (T o: t) {
					if (first) {first = false;} else {ret.append(t);}
					ret.append(o);
				}
			}
			ret.append("]");
			return ret.toString();
		}
	}
	
	public void setList(List<T> newList) {
		this.t = newList;
	}
	
	public static<T> EqualProbabilityScope<T> fromList(List<T> list) {
		return new EqualProbabilityScope<>(list);
	}
	
	public static<T> EqualProbabilityScope<T> fromArray(T... array) {
		return fromList(Arrays.asList(array));
	}

	@Override
	public boolean contains(T sol) {
		return t.contains(sol);
	}

	@Override
	public Boolean getQuality(T sol) {
		return t.contains(sol);
	}

	@Override
	public Iterator<T> iterator() {
		return t.iterator();
	}

	@Override
	public boolean isFinite() {
		return true;
	}

	@Override
	public Iterator<T> sample() {
		return new EqualProbabilitySampler<T>(t);
	}

	@Override
	public T sampled() {
		if (t.isEmpty()) {return null;}
		return sample().next();
	}

	@Override
	public void transfer(EcoreTransferFunction transferFunc) {
		t = ETransferrable.transfer(t, transferFunc);
	}

}
