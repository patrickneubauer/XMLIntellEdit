package at.ac.tuwien.big.xmlintelledit.intelledit.fixer.impl;

import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.Decrease;

public class DecreaseImpl extends BorderFixer<DecreaseImpl> implements Decrease {

	public DecreaseImpl(Object border, boolean exclusive) {
		super(border);
		this.exclusive = exclusive;
	}
	
	private boolean exclusive;

	@Override
	public boolean exclusive() {
		return exclusive;
	}

	@Override
	public boolean subEquals(DecreaseImpl other) {
		return exclusive == other.exclusive;
	}

	@Override
	public int subHashCode() {
		return (exclusive)?1:0;
	}


	public String toString() {
		return "Decrease to "+(exclusive?"below ":"")+border();
	}


}
