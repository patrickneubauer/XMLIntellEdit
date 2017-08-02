package at.ac.tuwien.big.xmlintelledit.intelledit.fixer;

import java.util.Collection;

public interface SetRemoveAny extends FixAttempt {
	
	/**How many should be deleted*/
	public int targetSize();
	

	@Override
	public default boolean isFulfilled(Object obj) {
		return ((obj instanceof Collection) && ((Collection)obj).size() <= targetSize());
	}

}
