package at.ac.tuwien.big.xmlintelledit.intelledit.fixer.impl;

import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.MakeTrue;

public class MakeTrueImpl implements MakeTrue {

	public static final MakeTrueImpl INSTANCE = new MakeTrueImpl();
	
	public boolean equals(Object other) {
		return other instanceof MakeTrueImpl;
	}
	
	public int hashCode() {
		return 384647853;
	}
	
	public String toString() {
		return "Make true";
	}


}
