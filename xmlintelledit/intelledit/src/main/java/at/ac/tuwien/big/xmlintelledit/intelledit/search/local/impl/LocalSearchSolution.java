package at.ac.tuwien.big.xmlintelledit.intelledit.search.local.impl;

import java.util.Stack;

import at.ac.tuwien.big.xmlintelledit.intelledit.change.Change;

public class LocalSearchSolution {
	private Stack<Change<?>> changes = new Stack<Change<?>>();
	
	public LocalSearchSolution(Stack<Change<?>> changes) {
		this.changes = changes;
	}
	
	public Stack<Change<?>> getChanges() {
		return changes;
	}
}
