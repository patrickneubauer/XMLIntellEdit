package at.ac.tuwien.big.xmlintelledit.intelledit.evaluate.impl;

import at.ac.tuwien.big.xmlintelledit.intelledit.evaluate.Evaluable;
import at.ac.tuwien.big.xmlintelledit.intelledit.evaluate.EvaluationState;

public interface EvaluableReference<T extends EvaluationState<T>> {
	
	public Evaluable<?,T> getEvaluable();

}
