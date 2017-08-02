package at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import at.ac.tuwien.big.xmlintelledit.intelledit.change.ChangeType;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.FixAttempt;

public abstract class EvalResultBase implements EvalResult {
	private Object result;
	private EvalResult parent;
	private AttemptQualityMap qualityMap = new AttemptQualityMapImpl();
	private FixAttemptReferenceInfo fixAttemptRef = new  FixAttemptReferenceInfoImpl(); 
	
	public EvalResultBase() {
		
	}
	
	public EvalResultBase(Object result) {
		this.result = result;
	}
	
	public void setResult(Object result) {
		this.result = result;
	}
	 
	public Object getResult() {
		return result;
	}
	
	public AttemptQualityMap getQualityMap() {
		return qualityMap;
	}

	@Override
	public void setParent(EvalResult parent) {
		this.parent = parent;
	}

	@Override
	public EvalResult getParent() {
		return this.parent;
	}
	
	private Set<FixAttempt> possibleFixes = new HashSet<FixAttempt>();
	private Map<ChangeType<?,?>,Integer> possibleFixingActions = new HashMap<>();

	@Override
	public Collection<FixAttempt> getPossibleFixes() {
		return possibleFixes;
	}

	@Override
	public void addPossibleFixes(Collection<FixAttempt> attempts) {
		possibleFixes.addAll(attempts);
	}

	@Override
	public Map<ChangeType<?,?>,Integer> getPossibleFixingActionMap() {
		return possibleFixingActions;
	}

	@Override
	public void addPossibleFixingActions(Map<ChangeType<?,?>,Integer> changes) {
		for (Entry<ChangeType<?,?>,Integer> entry: changes.entrySet()) {
			possibleFixingActions.merge(entry.getKey(),entry.getValue(),(v,v1)->Math.max(v1,v));
		}
	}
	

	public FixAttemptReferenceInfo getFixAttemptReferenceInfo() {
		return fixAttemptRef;
	}
}
