package at.ac.tuwien.big.xmlintelledit.intelledit.evaluate;

import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.EvalResult;

public interface EvaluationState<T extends EvaluationState<T>> {
	
	public void initParam();
	
	public void reuseParam(T from);
	
	public Object evaluateBasic();
	
	public default Object getBasicResult() {
		return getResult().getResult();
	}
	
	public Object evaluateFull();
	
	public EvalResult getResult();
	
	public double getQuality();

	
}
