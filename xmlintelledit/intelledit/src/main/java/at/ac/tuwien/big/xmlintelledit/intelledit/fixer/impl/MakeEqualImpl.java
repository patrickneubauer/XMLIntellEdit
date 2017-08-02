package at.ac.tuwien.big.xmlintelledit.intelledit.fixer.impl;

import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.MakeEqual;

public class MakeEqualImpl extends BorderFixer<MakeEqualImpl> implements MakeEqual {

	public MakeEqualImpl(Object border) {
		super(border);;
	}
	

	@Override
	public boolean subEquals(MakeEqualImpl other) {
		return true;
	}

	@Override
	public int subHashCode() {
		return 0;
	}
	
	public String toString() {
		return "Make equal to "+border();
	}



}
