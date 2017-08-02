package at.ac.tuwien.big.xmlintelledit.intelledit.change.primitive;

import java.math.BigInteger;
import java.util.Iterator;

import at.ac.tuwien.big.xmlintelledit.intelledit.scope.ValueScope;
import at.ac.tuwien.big.xmlintelledit.intelledit.transfer.EcoreTransferFunction;

public class LogBigIntegerChangeScope implements ValueScope<BigInteger, Boolean> {
	private LogIntScope base = LogIntScope.INSTANCE;
	
	private BigInteger curValue;
	
	public LogBigIntegerChangeScope(BigInteger curValue)  {
		this.curValue = curValue;
		if (this.curValue == null) {
			this.curValue = BigInteger.ZERO;
		}
	}

	@Override
	public boolean contains(BigInteger sol) {
		return true;
	}

	@Override
	public Boolean getQuality(BigInteger sol) {
		return true;
	}

	private Iterator<BigInteger> addIter(Iterator<Integer> base) {
		return new Iterator<BigInteger>() {

			@Override
			public boolean hasNext() {
				return base.hasNext();
			}

			@Override
			public BigInteger next() {
				return curValue.add(BigInteger.valueOf(base.next()));
			}
			
		};
	}
	
	@Override
	public Iterator<BigInteger> iterator() {
		return addIter(base.iterator());
	}

	@Override
	public boolean isFinite() {
		return false;
	}

	@Override
	public Iterator<BigInteger> sample() {
		return addIter(base.sample());
	}
	
	@Override
	public void transfer(EcoreTransferFunction transferFunc) {
	}

}
