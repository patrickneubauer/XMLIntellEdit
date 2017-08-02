package at.ac.tuwien.big.xmlintelledit.intelledit.fixer.impl;

import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.SetRemoveAny;

public class SetRemoveAnyImpl implements SetRemoveAny {
	
	private int targetSize;

	public SetRemoveAnyImpl(int targetSize) {
		this.targetSize = targetSize;
	}

	public boolean equals(Object other) {
		return (other instanceof SetRemoveAny) && equals((SetRemoveAny)other);
	}
	
	public boolean equals(SetRemoveAny other) {
		return targetSize == other.targetSize();
	}

	@Override
	public int targetSize() {
		return targetSize;
	}
	

	public String toString() {
		return "Remove until size of " + targetSize;
	}


}
