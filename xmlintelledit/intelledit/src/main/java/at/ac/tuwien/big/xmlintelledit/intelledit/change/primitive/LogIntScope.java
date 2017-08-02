package at.ac.tuwien.big.xmlintelledit.intelledit.change.primitive;

import java.util.Iterator;

import at.ac.tuwien.big.xmlintelledit.intelledit.scope.ValueScope;
import at.ac.tuwien.big.xmlintelledit.intelledit.transfer.EcoreTransferFunction;
import at.ac.tuwien.big.xtext.util.IteratorUtils;

public class LogIntScope implements ValueScope<Integer, Boolean>{
	private LogLongScope base = new LogLongScope();
	
	public static final LogIntScope INSTANCE  =new LogIntScope();
	
	public static final LogIntScope SMALLINSTANCE  =new LogIntScope();
	static {
		SMALLINSTANCE.base.setNextDecimalProbability(1, 200);
	}
	

	@Override
	public boolean contains(Integer sol) {
		return true;
	}

	@Override
	public Boolean getQuality(Integer sol) {
		return true;
	}

	@Override
	public Iterator<Integer> iterator() {
		return new Iterator<Integer>() {
			private int cur = 0;

			@Override
			public boolean hasNext() {
				return cur != Long.MIN_VALUE;
			}

			@Override
			public Integer next() {
				int ret = cur;
				if (cur <= 0) {
					cur = -cur;
					++cur;
				} else {
					cur = -cur;
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
	public Iterator<Integer> sample() {
		Iterator<Long> otherSampler = base.sample();
		return IteratorUtils.convert(otherSampler, (x)->(int)(long)x);
	}
	
	@Override
	public void transfer(EcoreTransferFunction transferFunc) {
	}

}
