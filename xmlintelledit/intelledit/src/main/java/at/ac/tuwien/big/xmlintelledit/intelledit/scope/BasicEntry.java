package at.ac.tuwien.big.xmlintelledit.intelledit.scope;

import java.util.Map.Entry;

public class BasicEntry<X,Y> implements Entry<X, Y> {
	private X x;
	private Y y;
	
	public BasicEntry(X x, Y y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public X getKey() {
		return x;
	}

	@Override
	public Y getValue() {
		return y;
	}

	@Override
	public Y setValue(Y value) {
		throw new UnsupportedOperationException();
	}

}
