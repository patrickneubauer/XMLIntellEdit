package at.ac.tuwien.big.xmlintelledit.intelledit.fixer;

/**I don't know what to do, but change the value because it might be relevant
 * This change needs to be propagated
 * */
public interface ChangeSomething extends FixAttempt {



	@Override
	public default boolean isFulfilled(Object obj) {
		return false;
	}
}
