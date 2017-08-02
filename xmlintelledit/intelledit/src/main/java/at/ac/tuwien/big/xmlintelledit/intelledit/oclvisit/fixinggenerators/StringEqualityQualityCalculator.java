package at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.fixinggenerators;

import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.FixAttempt;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.MakeEqual;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.EvalResult;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.ExpressionResult;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.QualityCalculator;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.RejectingFilterManager;
import net.ricecode.similarity.LevenshteinDistanceStrategy;
import net.ricecode.similarity.SimilarityStrategy;

public class StringEqualityQualityCalculator implements QualityCalculator<Object, String> {

	public static interface StringDistanceMetric {
		public double getQuality(String first, String second);
	}
	
	private StringDistanceMetric metric;
	
	public StringEqualityQualityCalculator(StringDistanceMetric metric) {
		this.metric = metric;
	}
	
	public static StringEqualityQualityCalculator getCalculator(SimilarityStrategy strategy) {
		// TODO Auto-generated constructor stub
		return new StringEqualityQualityCalculator((first,second)->strategy.score(first, second));
	}
	
	public static StringEqualityQualityCalculator LEVENTHSTEIN = getCalculator(new LevenshteinDistanceStrategy());
	
	
	@Override
	public Class<Object> getFilterClass() {
		return null;
	}

	@Override
	public Class<String> getResultClass() {
		return String.class;
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
	public Double getQualityCalculation(FixAttempt singleAttemptForThis, EvalResult baseRes, ExpressionResult res,
			Object expr, String result, RejectingFilterManager man, GetQualityFunc qualityFunc) {
		if (singleAttemptForThis instanceof MakeEqual) {
			Object otherString = ((MakeEqual) singleAttemptForThis).border();
			if (otherString instanceof String) {
				String otherStr = (String)otherString;
				if (result == null || otherStr == null) {
					System.err.println("Should not happen");
					new Exception().printStackTrace();
				}
				return metric.getQuality(result, otherStr);
			}
		}
		return null;
	}


}
