package at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import at.ac.tuwien.big.xmlintelledit.intelledit.change.Change;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.ChangeType;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.FixAttempt;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.fixinggenerators.PropagateBooleanChanges.OCLBooleanState;

public interface EvalResult {
	
	public Object getResult();
	
	public void setParent(EvalResult parent);
	
	public EvalResult getParent();
	
	public Collection<FixAttempt> getPossibleFixes();
	
	public AttemptQualityMap getQualityMap();
	
	public default boolean isOk() {
		Object result = getResult();
		for (FixAttempt at: getPossibleFixes()) {
			if (!at.isFulfilled(result)) {
				return false;
			}
		}
		return true;
	}
	
	public default void maxQuality(FixAttempt attempt, double compareQuality) {
		getQualityMap().addQuality(attempt, compareQuality);
	}
	
	public default double getQuality(FixAttempt attempt, RejectingFilterManager man) {
		Double curQuality = getQualityMap().getBasic(attempt);
		if (curQuality == null) {
			curQuality = man.calculateSingleQuality(this,attempt);
			getQualityMap().addQuality(attempt, curQuality);
		}
		return curQuality;
	}
	
	public void addPossibleFixes(Collection<FixAttempt> attempts);
	
	public List<EvalResult> getSubResults();
	
	public default Collection<ChangeType<?,?>> getPossibleFixingAction(int minPriority) {
		Collection<ChangeType<?,?>> ret = new ArrayList<>();
		for (Entry<ChangeType<?,?>,Integer> entry: getPossibleFixingActionMap().entrySet()) {
			if (entry.getValue() >= minPriority) {
				ret.add(entry.getKey());
			}
		}
		return ret;
	}
	
	public Map<ChangeType<?,?>, Integer> getPossibleFixingActionMap();
	
	public void addPossibleFixingActions(Map<ChangeType<?,?>, Integer> base);
	
	public default void addPossibleFixingActions(FixActionMap base)  {
		addPossibleFixingActions(base.priorityMap());
	}
	
	public default void addPossibleFixingActions(Collection<ChangeType<?,?>> base, int priority) {
		Map<ChangeType<?,?>,Integer> map = new HashMap<>();
		for (ChangeType<?,?> ch: base) {
			map.put(ch,priority);
		}
		addPossibleFixingActions(map);
	}

	public default List<OCLBooleanState> getSubBooleanStateIfExists() {
		return Collections.emptyList();
	}

	public default void addPossibleFix(FixAttempt fixAttempt) {
		addPossibleFixes(Collections.singleton(fixAttempt));
	}
	
	public String getName();

	public default String getWriteName() {
		return getName();
	}
	
	
	
	public default  void printAllFixAttempts() {
		StringBuilder ret = new StringBuilder();
		ret.append(getWriteName()+": "+getResult()+" - Fix with {");
		boolean first = true;
		for (FixAttempt attempt: getPossibleFixes()) {
			if (first) {first = false;} else {ret.append(", ");}
			ret.append(attempt);
		}
		ret.append("}");
		System.out.println(ret);
		for (EvalResult res: getSubResults()) {
			if (res == null) {
				System.out.println("<skipped>");
			} else {
				res.printAllFixAttempts();
			}
		}
	}
	
	public default void getAllFixingActions(int minpriority, List<ChangeType<?, ? extends Change<?>>> allActions) {
		allActions.addAll(getPossibleFixingAction(minpriority));
		for (EvalResult res: getSubResults()) {
			if (res != null) {
				res.getAllFixingActions(minpriority, allActions);
			}
		}
	}
	
	public default List<ChangeType<?,? extends Change<?>>> getAllDirectFixingActions() {
		return getAllFixingActions(FixingActionGenerator.MIN_DIRECT_FIX_PRIORITY);
	}
	
	public default List<ChangeType<?,? extends Change<?>>> getAllFixingActions() {
		return getAllFixingActions(FixingActionGenerator.MIN_LOCAL_SEARCH_PRIORITY);
	}
	
	public default List<ChangeType<?,? extends Change<?>>> getAllFixingActions(int minPriority) {
		List<ChangeType<?, ? extends Change<?>>> ret = new ArrayList<>();
		getAllFixingActions(minPriority, ret);
		return ret;
	}
	

	public default  void printAllDirectFixingActions() {
		StringBuilder ret = new StringBuilder();
		ret.append(getWriteName()+": "+getResult()+" - Direct Fixing Action with {");
		boolean first = true;
		for (ChangeType<?, ?> attempt: getPossibleFixingAction(10001)) {
			if (first) {first = false;} else {ret.append(", ");}
			ret.append(attempt);
		}
		ret.append("}");
		System.out.println(ret);
		for (EvalResult res: getSubResults()) {
			if (res == null) {
				System.out.println("<skipped>");
			} else {
				res.printAllDirectFixingActions();
			}
		}
	}
	


	public default  void printAllFixingActions() {
		StringBuilder ret = new StringBuilder();
		ret.append(getWriteName()+": "+getResult()+" - Fixing Action with {");
		boolean first = true;
		for (ChangeType<?, ?> attempt: getPossibleFixingAction(0)) {
			if (first) {first = false;} else {ret.append(", ");}
			ret.append(attempt);
		}
		ret.append("}");
		System.out.println(ret);
		for (EvalResult res: getSubResults()) {
			if (res == null) {
				System.out.println("<skipped>");
			} else {
				res.printAllFixingActions();
			}
		}
	}

	public void setResult(Object value);

	public Object getExpression();
	
	public FixAttemptReferenceInfo getFixAttemptReferenceInfo();
	
	public default void totalCompleteReferenceInfo(FixAttemptReferenceInfo info) {
		info.mergeWith(getFixAttemptReferenceInfo());
		for (EvalResult sub: getSubResults()) {
			sub.totalCompleteReferenceInfo(info);
		}
	}
	
	public default FixAttemptReferenceInfo getCompleteReferenceInfo() {
		FixAttemptReferenceInfo ret = new FixAttemptReferenceInfoImpl();
		totalCompleteReferenceInfo(ret);
		return ret;
	}
}
