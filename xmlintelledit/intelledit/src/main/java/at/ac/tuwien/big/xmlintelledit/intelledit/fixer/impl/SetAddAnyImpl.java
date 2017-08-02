package at.ac.tuwien.big.xmlintelledit.intelledit.fixer.impl;

import java.util.Collection;

import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.SetAddAny;

public class SetAddAnyImpl implements SetAddAny {
	
	private int amount;

	public SetAddAnyImpl(int targetSize) {
		this.amount = targetSize;
	}

	public boolean equals(Object other) {
		return (other instanceof SetAddAny) && equals((SetAddAny)other);
	}
	
	public boolean equals(SetAddAny other) {
		return amount == other.targetSize();
	}

	@Override
	public int targetSize() {
		return amount;
	}

	@Override
	public boolean isFulfilled(Object obj) {
		return (obj instanceof Collection) && ((Collection)obj).size() >= targetSize();
	}
	
	public String toString() {
		return "Add until size of " + amount;
	}

}
