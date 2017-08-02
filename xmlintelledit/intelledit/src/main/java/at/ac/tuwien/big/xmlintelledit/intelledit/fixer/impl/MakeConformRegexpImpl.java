package at.ac.tuwien.big.xmlintelledit.intelledit.fixer.impl;

import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.MakeConformRegexp;
import dk.brics.automaton.Automaton;
import dk.brics.automaton.RegExp;

public class MakeConformRegexpImpl implements MakeConformRegexp {
	
	private Automaton automaton;
	private String desc;
	
	public MakeConformRegexpImpl(String expr) {
		this.automaton = new RegExp(expr).toAutomaton();
		this.desc = expr;
		 
	}
	
	
	public MakeConformRegexpImpl(Automaton automaton, String desc) {
		this.automaton = automaton;
		this.desc = desc;
	}

	@Override
	public boolean isFulfilled(Object obj) {
		return obj instanceof String && automaton.run((String)obj);
	}

	@Override
	public Automaton getAutomaton() {
		return automaton;
	}


	public String toString() {
		return "Make conform to "+desc;
	}

}
