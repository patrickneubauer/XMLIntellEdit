package at.ac.tuwien.big.xmlintelledit.intelledit.fixer;

import java.util.Objects;

public interface MakeDifferent extends FixAttempt {

	
	public Object border();

	@Override
	public default boolean isFulfilled(Object obj) {
		return !Objects.equals(obj, border());
	}
}
