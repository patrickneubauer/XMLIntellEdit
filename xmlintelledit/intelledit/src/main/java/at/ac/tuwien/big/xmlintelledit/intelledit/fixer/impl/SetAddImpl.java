package at.ac.tuwien.big.xmlintelledit.intelledit.fixer.impl;

import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.SetAdd;

public class SetAddImpl extends BorderFixer<SetAddImpl>  implements SetAdd {

	public SetAddImpl(Object border) {
		super(border);
	}

	@Override
	public boolean subEquals(SetAddImpl other) {
		return true;
	}

	@Override
	public int subHashCode() {
		return 0;
	}

	public String toString() {
		return "Add object "+border();
	}


	

}
