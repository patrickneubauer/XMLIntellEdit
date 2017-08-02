package at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import at.ac.tuwien.big.xmlintelledit.intelledit.evaluate.impl.EvaluableReference;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.FixAttempt;

public class FixAttemptReferenceInfoImpl implements FixAttemptReferenceInfo {
	
	private Map<FixAttemptReference, Map<FixAttempt,Set<EvaluableReference<?>>>> fixAttemptReferences = 
			new HashMap<>();

	@Override
	public Collection<FixAttemptReference> getFixAttemptReferences() {
		return fixAttemptReferences.keySet();
	}

	@Override
	public Map<FixAttempt,Set<EvaluableReference<?>>> getAssociatedAttempts(FixAttemptReference ref) {
		return fixAttemptReferences.getOrDefault(ref, Collections.emptyMap());
	}

	@Override
	public void addFixAttemptReference(FixAttemptReference ref, Map<FixAttempt,Set<EvaluableReference<?>>> attempts) {
		Map<FixAttempt,Set<EvaluableReference<?>>> fixAttempts = fixAttemptReferences.get(ref);
		if (fixAttempts == null) {
			fixAttemptReferences.put(ref, fixAttempts = new HashMap<>());
		}
		for (Entry<FixAttempt,Set<EvaluableReference<?>>> entry: attempts.entrySet()) {
			Set<EvaluableReference<?>> refs = fixAttempts.get(entry.getKey());
			if (refs == null) {
				fixAttempts.put(entry.getKey(),refs = new HashSet<>());
			}
			refs.addAll(entry.getValue());
		}
	}
	
	public String toString() {
		return printString();
	}

}
