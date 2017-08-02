package at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.impl;

import java.util.HashMap;
import java.util.Map;

import at.ac.tuwien.big.xmlintelledit.intelledit.change.ChangeType;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.FixActionMap;

public class FixActionMapImpl implements FixActionMap {
	private Map<ChangeType<?, ?>, Integer> map = new HashMap<ChangeType<?,?>, Integer>();

	@Override
	public Map<ChangeType<?, ?>, Integer> priorityMap() {
		return map;
	}

}
