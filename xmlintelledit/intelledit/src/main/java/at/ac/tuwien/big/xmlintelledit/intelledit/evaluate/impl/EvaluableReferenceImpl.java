package at.ac.tuwien.big.xmlintelledit.intelledit.evaluate.impl;

import java.util.Objects;

import at.ac.tuwien.big.xmlintelledit.intelledit.evaluate.Evaluable;
import at.ac.tuwien.big.xmlintelledit.intelledit.evaluate.EvaluationState;


public class EvaluableReferenceImpl<T extends EvaluationState<T>> implements EvaluableReference<T> {
	
	private Evaluable<?,T> evaluable;
	
	public EvaluableReferenceImpl(Evaluable<?,T> evaluable) {
		this.evaluable = evaluable;
	}

	@Override
	public Evaluable<?,T> getEvaluable() {
		return evaluable;
	}
	
	public boolean equals(Object other) {
		return (other instanceof EvaluableReferenceImpl) && Objects.equals(getEvaluable(),((EvaluableReference)other).getEvaluable());
	}
	
	public int hashCode() {
		return Objects.hashCode(evaluable);
	}

	public String toString() {
		return String.valueOf(evaluable);
	}
}
