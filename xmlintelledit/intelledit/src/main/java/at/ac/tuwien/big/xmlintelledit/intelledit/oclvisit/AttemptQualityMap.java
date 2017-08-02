package at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.FixAttempt;
import at.ac.tuwien.big.xmlintelledit.intelledit.scope.helper.GetFunc;

public interface AttemptQualityMap {
	
	public Map<FixAttempt, Double> qualityMap();
	
	public Map<FixAttempt, List<GetFunc<Double>>> qualityGenerationMap();
	
	public double getDefault();
	
	public void setDefault(double def);
	
	public default void evalGenerationMap() {
		for (Entry<FixAttempt,List<GetFunc<Double>>> entry: qualityGenerationMap().entrySet()) {
			for (GetFunc<Double> func: entry.getValue()) {
				addQuality(entry.getKey(), func.get());
			}
		}
	}
	
	public default void addQualityGen(FixAttempt attempt, GetFunc<Double> func) {
		Map<FixAttempt, List<GetFunc<Double>>> map = qualityGenerationMap();
		List<GetFunc<Double>> list = map.get(attempt);
		if (list == null) {
			map.put(attempt, list = new ArrayList<GetFunc<Double>>());
		}
		list.add(func);
	}
	
	public default void addQuality(FixAttempt attempt, double quality) {
		Map<FixAttempt, Double> map = qualityMap();
		map.put(attempt, Math.max(quality, map.getOrDefault(attempt,0.0)));
	}

	public default double get(FixAttempt attempt) {
		return qualityMap().getOrDefault(attempt, getDefault());
	}
	
	public default Double getBasic(FixAttempt attempt) {
		return qualityMap().get(attempt);
	}
	

}
