package at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit;

import java.util.List;

import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.FixAttempt;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.fixinggenerators.GetQualityFunc;

public interface QualityCalculator<T,U> extends SelectiveEvaluator<T,U> {

	public Double getQualityCalculation(FixAttempt singleAttemptForThis, EvalResult baseRes, ExpressionResult res, T expr, U result, RejectingFilterManager man,
			GetQualityFunc qualityFunc);
	
	
	//FixAttempt --> could handle
	public default Double getQualityCalculation(FixAttempt singleAttemptForThis, EvalResult res, RejectingFilterManager man) {
		GetQualityFunc func = (ind,atm)->{
			List<EvalResult> subR = res.getSubResults();
			EvalResult s = subR.get(ind);
			if (s == null) {
				return 1.0;
			}
			return s.getQuality(atm,man);
		};
		if (res instanceof ExpressionResult) {
			ExpressionResult eres = (ExpressionResult)res;
			return getQualityCalculation(singleAttemptForThis, res, eres, (T)eres.getExpression(), (U)eres.getResult(), man, func);
		} else {
			return getQualityCalculation(singleAttemptForThis, res, null, null, null, man, func);
		}
		
	}

}
