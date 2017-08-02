package at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit;

import java.util.List;

public interface RejectingFilter<T,U> extends SelectiveEvaluator<T,U> {
	
	
	
	
	public void addReject(T expr, U result, List<Object> param, boolean[] doReject);

}