package at.ac.tuwien.big.xmlintelledit.intelledit.fixer.impl;

import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.MakeFalse;

public class MakeFalseImpl implements MakeFalse {

	public static MakeFalseImpl INSTANCE = new MakeFalseImpl();
	
	public boolean equals(Object other) {
		return other instanceof MakeFalseImpl;
	}
	
	public int hashCode() {
		return 384637853;
	}
	
	public String toString() {
		return "Make false";
	}

}
