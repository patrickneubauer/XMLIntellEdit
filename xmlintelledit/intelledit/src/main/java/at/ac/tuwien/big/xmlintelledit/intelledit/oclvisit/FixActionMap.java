package at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;

import at.ac.tuwien.big.xmlintelledit.intelledit.change.ChangeType;

public interface FixActionMap {
	
	public Map<ChangeType<?, ?>, Integer> priorityMap();
	
	public default void addFixingAction(int priority, ChangeType<?,?> potentialFix) {
		Map<ChangeType<?, ?>,Integer> map = priorityMap();
		map.put(potentialFix, Math.max(priority, map.getOrDefault(potentialFix,Integer.MIN_VALUE)));
	}
	
	public default Collection<ChangeType<?,?>> getChangesWithPriority(int minPriority) {
		Collection<ChangeType<?,?>> ret  = new ArrayList<>();
		for (Entry<ChangeType<?,?>, Integer> entry: priorityMap().entrySet()) {
			if (entry.getValue() >= minPriority) {
				ret.add(entry.getKey());
			}
		}
		return ret;
	}

}
