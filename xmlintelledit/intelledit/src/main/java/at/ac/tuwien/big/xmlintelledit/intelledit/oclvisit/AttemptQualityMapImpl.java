package at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.FixAttempt;
import at.ac.tuwien.big.xmlintelledit.intelledit.scope.helper.GetFunc;

public class AttemptQualityMapImpl implements AttemptQualityMap {
	private Map<FixAttempt,Double> qualityMap = new HashMap<FixAttempt, Double>();
	private Map<FixAttempt, List<GetFunc<Double>>> qualityGenerationMap = new HashMap<>();
	private double def;

	@Override
	public Map<FixAttempt, Double> qualityMap() {
		return qualityMap;
	}

	@Override
	public double getDefault() {
		return def;
	}

	@Override
	public void setDefault(double def) {
		this.def = def;
	}

	@Override
	public Map<FixAttempt, List<GetFunc<Double>>> qualityGenerationMap() {
		return qualityGenerationMap;
	}

}
