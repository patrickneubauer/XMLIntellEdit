package at.ac.tuwien.big.xmlintelledit.intelledit.fixer.impl;

import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.ChangeSomething;

public class ChangeSomethingImpl implements ChangeSomething {
	
	public static final ChangeSomething INSTANCE = new ChangeSomethingImpl();
	
	public String toString() {
		return "Change something";
	}

}
