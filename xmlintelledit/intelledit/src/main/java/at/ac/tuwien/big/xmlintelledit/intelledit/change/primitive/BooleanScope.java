package at.ac.tuwien.big.xmlintelledit.intelledit.change.primitive;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

import at.ac.tuwien.big.xmlintelledit.intelledit.scope.ValueScope;
import at.ac.tuwien.big.xmlintelledit.intelledit.transfer.EcoreTransferFunction;

public class BooleanScope implements ValueScope<Boolean, Boolean> {
	
	public static final BooleanScope INSTANCE  = new BooleanScope();

	@Override
	public boolean contains(Boolean sol) {
		return true;
	}

	@Override
	public Boolean getQuality(Boolean sol) {
		return true;
	}

	@Override
	public Iterator<Boolean> iterator() {
		return Arrays.asList(true,false).iterator();
	}

	@Override
	public boolean isFinite() {
		return true;
	}
	
	private static Random random = new Random();

	@Override
	public ContinuousIterator<Boolean> sample() {
		return ()->random.nextBoolean();
	}

	@Override
	public void transfer(EcoreTransferFunction transferFunc) {
	}


}
