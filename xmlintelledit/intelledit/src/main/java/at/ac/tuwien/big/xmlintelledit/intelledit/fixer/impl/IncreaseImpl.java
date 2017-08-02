package at.ac.tuwien.big.xmlintelledit.intelledit.fixer.impl;

import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.Increase;

public class IncreaseImpl extends BorderFixer<IncreaseImpl> implements Increase {

	public IncreaseImpl(Object border, boolean exclusive) {
		super(border);
		this.exclusive = exclusive;
	}
	
	private boolean exclusive;

	@Override
	public boolean exclusive() {
		return exclusive;
	}

	@Override
	public boolean subEquals(IncreaseImpl other) {
		return exclusive == other.exclusive;
	}

	@Override
	public int subHashCode() {
		return (exclusive)?1:0;
	}


	public String toString() {
		return "Increase to "+(exclusive?"above ":"")+border();
	}
	

}
