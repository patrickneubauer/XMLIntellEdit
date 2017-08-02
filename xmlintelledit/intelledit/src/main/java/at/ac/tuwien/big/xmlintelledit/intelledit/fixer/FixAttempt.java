package at.ac.tuwien.big.xmlintelledit.intelledit.fixer;

import java.util.Collection;

import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.fixinggenerators.PropagateBooleanChanges.OCLBooleanState;

public interface FixAttempt {

	
	public static void printFixAttempt(Collection[] col) {
		if (col == null) {
			System.err.println("Can't fix this");
		}
		for (int i = 0; i < col.length; ++i) {
			System.out.print("Parameter " + i+": FixAttempts {");
			boolean first = true;
			for (Object o: col[i]) {
				if (first) {first = false;} else {System.out.print(", ");}
				System.out.print(String.valueOf(o));
			}
			System.out.println("}");
		}
	}
	
	public boolean isFulfilled(Object obj);
	
	/**Make true for any object*/
	public default boolean isStrictMakeTrue() {
		return this instanceof MakeTrue || ((this instanceof MakeEqual) && (Boolean.TRUE.equals(((MakeEqual)this).border())));
	}
	
	/**Make true for any object*/
	public default boolean isStrictMakeFalse() {
		return this instanceof MakeTrue || ((this instanceof MakeEqual) && (Boolean.FALSE.equals(((MakeEqual)this).border())));
	}
	
	/**Make true if it is known the result is a boolean*/
	public default boolean isLooseMakeTrue() {
		return isStrictMakeTrue() || ((this instanceof MakeDifferent) && (Boolean.FALSE.equals(((MakeDifferent)this).border())));
	}
	
	/**Make true if it is known the result is a boolean*/
	public default boolean isLooseMakeFalse() {
		return isStrictMakeFalse() || ((this instanceof MakeDifferent) && (Boolean.TRUE.equals(((MakeDifferent)this).border())));
	}
	
	public default OCLBooleanState getWantBooleanStateIfExists() {
		return isLooseMakeTrue()?OCLBooleanState.TRUE:(isLooseMakeFalse()?OCLBooleanState.FALSE:null);
	}
	
	
}
