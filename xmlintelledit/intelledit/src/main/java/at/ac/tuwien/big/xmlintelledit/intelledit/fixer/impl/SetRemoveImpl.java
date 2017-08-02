package at.ac.tuwien.big.xmlintelledit.intelledit.fixer.impl;

import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.SetRemove;

public class SetRemoveImpl extends BorderFixer<SetRemoveImpl> implements SetRemove {

	public SetRemoveImpl(Object border) {
		super(border);
	}

	@Override
	public boolean subEquals(SetRemoveImpl other) {
		return true;
	}

	@Override
	public int subHashCode() {
		return 0;
	}
	

	public String toString() {
		return "Remove object "+border();
	}


}
