package at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit;

import java.util.Collection;

import at.ac.tuwien.big.xmlintelledit.intelledit.ecore.util.MyResource;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.FixAttempt;

public interface FixingActionGenerator<T,U> extends SelectiveEvaluator<T, U> {

	/**You have to implement either this or the other!*/
	public default void addFixingPossibilities(MyResource resource, Collection<FixAttempt> allAttemptsForThis, EvalResult res, int treepriority,  FixActionMap potentialFixChanges) {
		for (FixAttempt at: allAttemptsForThis) {
			addFixingPossibilities(resource, at, res, treepriority, potentialFixChanges);
		}
	}
	
	
	
	public default boolean addFixingPossibilities(MyResource resource, FixAttempt singleAttemptForThis, EvalResult res, int treepriority, FixActionMap potentialFixChanges) {
		return addFixingPossibilitiesLocal(resource,singleAttemptForThis, res, getCompiledPriority(treepriority), potentialFixChanges);
	}
	
	public boolean addFixingPossibilitiesLocal(MyResource resource, FixAttempt singleAttemptForThis, EvalResult res, int realpriority, FixActionMap potentialFixChanges);
	
	/**
	 * 1-10000: For local search
	 * 20000+: For direct fixes - FixingActionGenerators handling Change should not have this priority
	 */
	public int getBasePriority();
	
	public default int getCompiledPriority(int treepriority) {
		int base = getBasePriority();
		int minimum = ((base-1)/10000)*10000+1;
		return Math.max(minimum,base+treepriority);
	}
	
	public static int LOCAL_SEARCH_PRIORITY = 10000;
	
	public static int DIRECT_FIX_PRIORITY = 20000;

	public static int MIN_DIRECT_FIX_PRIORITY = LOCAL_SEARCH_PRIORITY+1;
	
	public static int MIN_LOCAL_SEARCH_PRIORITY = 1;
	
	public static int getLowerPriority(int than) {
		if (than%10000<=1) {
			return than;
		}
		return than-1;
	}


	
}
