package at.ac.tuwien.big.xmlintelledit.intelledit.fixer;

import dk.brics.automaton.Automaton;

public interface MakeConformRegexp extends FixAttempt {


	public Automaton getAutomaton();
}
