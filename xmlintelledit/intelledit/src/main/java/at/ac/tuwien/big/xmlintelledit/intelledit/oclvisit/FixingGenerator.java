package at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;

import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.FixAttempt;

public interface FixingGenerator<T,U> extends  SelectiveEvaluator<T,U> {

	/**You have to implement either this or the other!*/
	public default void addFixingPossibilities(Map<FixAttempt,Boolean> allAttemptsForThis, ExpressionResult res, T expr, U result, Collection<FixAttempt>[] fixAttemptsPerSub) {
		for (Entry<FixAttempt,Boolean> at: allAttemptsForThis.entrySet()) {
			if (at.getKey().isFulfilled(res.getResult())) {
				continue;
			}
			if (addFixingPossibilitiesLocal(at.getKey(), res, expr, result, fixAttemptsPerSub)) {
				at.setValue(true);
			}
		}
	}
	
	public boolean addFixingPossibilitiesLocal(FixAttempt singleAttemptForThis, ExpressionResult res, T expr, U result, Collection<FixAttempt>[] fixAttemptsPerSub);
	
	public default boolean addFixingPossibilities(FixAttempt singleAttemptForThis, ExpressionResult res, Collection<FixAttempt>[] fixAttemptsPerSub) {
		if (singleAttemptForThis.isFulfilled(res.getResult())) {
			return true;
		}
		return addFixingPossibilitiesLocal(singleAttemptForThis, res, (T)res.getExpression(), (U)res.getResult(), fixAttemptsPerSub);
	}
	
	//FixAttempt --> could handle
	public default void addFixingPossibilities(Map<FixAttempt,Boolean> allAttemptsForThis, ExpressionResult res, Collection<FixAttempt>[] fixAttemptsPerSub) {
		addFixingPossibilities(allAttemptsForThis, res, (T)res.getExpression(), (U)res.getResult(), fixAttemptsPerSub);
	}

	
	
}
