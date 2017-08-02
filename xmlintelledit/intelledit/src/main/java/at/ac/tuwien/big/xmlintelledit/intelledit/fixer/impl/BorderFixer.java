package at.ac.tuwien.big.xmlintelledit.intelledit.fixer.impl;

import java.util.Objects;

import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.FixAttempt;

public abstract class BorderFixer<T extends BorderFixer<T>> implements FixAttempt {
	
	public BorderFixer(Object border) {
		this.border = border;
	}
	
	private Object border;
	
	public Object border() {
		return border;
	}
	
	public void setBorder(Object border) {
		this.border = border;
	}
	
	public boolean equals(Object other) {
		if (other == null  || other.getClass() != getClass()) {
			return false;
		}
		T otherT = (T)other;
		if (!Objects.equals(border, otherT.border())) {
			return false;
		}
		return subEquals(otherT);
	}
	
	public int hashCode() {
		return Objects.hashCode(border) + getClass().hashCode()*2357+subHashCode()*19247;
	}
	
	public abstract boolean subEquals(T other);
	
	public abstract int subHashCode();

}


