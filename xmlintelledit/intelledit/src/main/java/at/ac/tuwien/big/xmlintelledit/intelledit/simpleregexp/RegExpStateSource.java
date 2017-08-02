package at.ac.tuwien.big.xmlintelledit.intelledit.simpleregexp;

import dk.brics.automaton.Transition;

public class RegExpStateSource {
	private RegExpState source;
	private RegExpState target;
	private Transition transition;
	private int costs;
	private ACTION_TYPE type;
	
	public static enum ACTION_TYPE {
		CONTINUE, REMOVE, REPLACE, INSERT, INIT;
	}
	
	public RegExpStateSource(RegExpState source, RegExpState target, Transition transition, int costs, ACTION_TYPE type) {
		this.source = source;
		this.target = target;
		this.transition = transition; 
		this.costs = costs;
		this.type = type;
	}
	
	public RegExpState getSource() {
		return source;
	}
	
	public RegExpState getTarget() {
		return target;
	}
	
	public Transition getTransition() {
		return transition;
	}
	
	public int getCosts() {
		return costs;
	}
	
	public ACTION_TYPE getType() {
		return type;
	}
	
	public String toString() {
		return ((type==ACTION_TYPE.INIT)?"":(source.getSources().get(0).toString()+" "))+type.name();
	}

	public Iterable<Character> getChars() {
		return transition.getChars();
	}
	
}
