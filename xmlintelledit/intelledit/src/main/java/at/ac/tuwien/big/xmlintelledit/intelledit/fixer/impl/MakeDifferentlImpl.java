package at.ac.tuwien.big.xmlintelledit.intelledit.fixer.impl;

import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.MakeDifferent;

public class MakeDifferentlImpl extends BorderFixer<MakeDifferentlImpl> implements MakeDifferent {

	public MakeDifferentlImpl(Object border) {
		super(border);
	}
	

	@Override
	public boolean subEquals(MakeDifferentlImpl other) {
		return true;
	}

	@Override
	public int subHashCode() {
		return 0;
	}


	public String toString() {
		return "Make different from "+border();
	}

}
