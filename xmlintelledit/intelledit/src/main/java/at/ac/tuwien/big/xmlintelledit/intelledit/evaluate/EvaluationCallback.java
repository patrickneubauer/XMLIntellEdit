package at.ac.tuwien.big.xmlintelledit.intelledit.evaluate;

import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.EvalResult;

public interface EvaluationCallback<T extends EvaluationState<T>> {
	
	public void callbackSuccess(Evaluable<?,T> evaluable, T state, Object result);
	
	public void callbackFailure(Evaluable<?,T> evaluable, T state, Object result, EvalResult res);

}
