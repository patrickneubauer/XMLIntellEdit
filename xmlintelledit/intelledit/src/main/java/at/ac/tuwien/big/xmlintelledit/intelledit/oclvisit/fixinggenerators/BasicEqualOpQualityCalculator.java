package at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.fixinggenerators;

import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.FixAttempt;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.MakeFalse;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.MakeTrue;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.impl.MakeDifferentlImpl;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.impl.MakeEqualImpl;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.EvalResult;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.ExpressionResult;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.QualityCalculator;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.RejectingFilterManager;

public class BasicEqualOpQualityCalculator implements QualityCalculator<Object, Boolean> {

		
	public BasicEqualOpQualityCalculator() {
	}
	
		
	public static BasicEqualOpQualityCalculator INSTANCE = new BasicEqualOpQualityCalculator();
	
	
	@Override
	public Class<Object> getFilterClass() {
		return null;
	}

	@Override
	public Class<Boolean> getResultClass() {
		return Boolean.class;
	}

	@Override
	public boolean acceptNullResult() {
		return false;
	}
	

	@Override
	public String getRequiredName() {
		return null;
	}

	@Override
	public Double getQualityCalculation(FixAttempt singleAttemptForThis, EvalResult baseRes, ExpressionResult res, Object expr, Boolean result, RejectingFilterManager man,
			GetQualityFunc qualityFunc) {
		if (res == null) {
			return null;
		}
		String name = res.getExpressionName();
		if (("=".equals(name) && (singleAttemptForThis instanceof MakeTrue)) || ("<>".equals(name) && (singleAttemptForThis instanceof MakeFalse))) {
			return Math.max(qualityFunc.getQuality(0, new MakeEqualImpl(res.getSubResultValue(1))),
					qualityFunc.getQuality(1, new MakeEqualImpl(res.getSubResultValue(0))));
		} else if (("<>".equals(name) && (singleAttemptForThis instanceof MakeTrue)) || ("=".equals(name) && (singleAttemptForThis instanceof MakeFalse))) {
			return Math.max(qualityFunc.getQuality(0, new MakeDifferentlImpl(res.getSubResultValue(1))),
					qualityFunc.getQuality(1, new MakeDifferentlImpl(res.getSubResultValue(0))));
		}
		return null;
	}


}
