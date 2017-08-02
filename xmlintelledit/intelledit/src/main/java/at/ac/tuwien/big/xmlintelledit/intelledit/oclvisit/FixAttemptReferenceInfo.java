package at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import at.ac.tuwien.big.xmlintelledit.intelledit.evaluate.impl.EvaluableReference;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.FixAttempt;

public interface FixAttemptReferenceInfo {
	

	public Collection<FixAttemptReference> getFixAttemptReferences();
	
	public Map<FixAttempt,Set<EvaluableReference<?>>> getAssociatedAttempts(FixAttemptReference ref);
	
	public default boolean isEmpty() {
		for (FixAttemptReference ref: getFixAttemptReferences()) {
			if (!getAssociatedAttempts(ref).isEmpty()) {
				return false;
			}
		}
		return true;
	}
	
	public default void addFixAttemptReference(FixAttemptReference ref, EvaluableReference<?> cur, FixAttempt... attempt) {
		Map<FixAttempt, Set<EvaluableReference<?>>> map = new HashMap<>();
		for (FixAttempt at: attempt) {
			Set<EvaluableReference<?>> refSet = new HashSet<>();
			refSet.add(cur);
			map.put(at, refSet);			
		}
		addFixAttemptReference(ref, map);
	}
	
	public void addFixAttemptReference(FixAttemptReference ref, Map<FixAttempt, Set<EvaluableReference<?>>> attempts);

	public default void mergeWith(FixAttemptReferenceInfo fixAttemptReferenceInfo) {
		for (FixAttemptReference ref: fixAttemptReferenceInfo.getFixAttemptReferences()) {
			addFixAttemptReference(ref, fixAttemptReferenceInfo.getAssociatedAttempts(ref));
		}
	}

	public default String printString() {
		StringBuilder ret = new StringBuilder();
		ret.append("FixAttemptReferenceInfo: {\n");
		for (FixAttemptReference ref: getFixAttemptReferences()) {
			ret.append(ref.toString()+": [");
			boolean first = true;
			for (FixAttempt at: getAssociatedAttempts(ref).keySet()) {
				if (first) {first = false;} else {ret.append(", ");}
				ret.append(at);
			}
			ret.append("];\n");
		}
		ret.append("\n}");
		return ret.toString();
	}
	
	public default void printComplete() {
		System.out.println(printString());
	}

}
