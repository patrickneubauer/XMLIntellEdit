package at.ac.tuwien.big.xmlintelledit.intelledit.fixer;

public interface MakeTrue extends FixAttempt {

	
	@Override
	public default boolean isFulfilled(Object obj) {
		return (obj instanceof Boolean) && ((Boolean)obj);
	}
}
