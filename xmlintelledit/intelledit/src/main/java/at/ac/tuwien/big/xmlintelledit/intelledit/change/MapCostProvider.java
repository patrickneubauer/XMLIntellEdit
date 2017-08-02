package at.ac.tuwien.big.xmlintelledit.intelledit.change;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import at.ac.tuwien.big.xtext.util.MyEcoreUtil;
import net.ricecode.similarity.LevenshteinDistanceStrategy;

public class MapCostProvider implements CostProvider{
	private CostFunction<Object> defaultFunction = new CostFunction<Object>() {

		@Override
		public double getCosts(Object from, Object to) {
			return Objects.equals(from, to)?0.01:1;
		}
	};
	
	
	
	static final MapCostProvider DEFAULT_PROVIDER = new MapCostProvider();
	static {
		LevenshteinDistanceStrategy strat = new LevenshteinDistanceStrategy();
		DEFAULT_PROVIDER.addFunction(String.class, (x,y)->{
			if (x == null || y == null) {
				return (x == y)?0.01:1.0;
			} else {
				double score = strat.score(x,y);
				return 0.01+0.99*(1.0-score)*Math.max(x.length(),y.length());
			}
		});
		CostFunction<Number> numberComparison = (x,y)->{
			if (x == null || y == null) {
				return (x == y)?0.01:1.0;
			}
			double xd = x.doubleValue();
			double yd = y.doubleValue();
			return 1.0-0.99*Math.exp(-Math.abs(xd-yd)/1000.0);
		};
		DEFAULT_PROVIDER.addFunction(BigInteger.class, numberComparison);
		DEFAULT_PROVIDER.addFunction(Double.class, numberComparison);
		DEFAULT_PROVIDER.addFunction(Integer.class, numberComparison);
		DEFAULT_PROVIDER.addFunction(Long.class, numberComparison);
		DEFAULT_PROVIDER.addFunction(Float.class, numberComparison);
		DEFAULT_PROVIDER.addFunction(Byte.class, numberComparison);
	}
	
	
	private Map<Class<?>, CostFunction<?>> costFunctions = new HashMap<>();
	private Map<EClass, Double> createCosts = new HashMap<EClass, Double>();
	private double defaultCreateCosts = 5;
	
	private Map<EClass, Double> deleteCosts = new HashMap<EClass, Double>();
	public double defaultDeleteCosts = 4;
	
	public void setDeleteCosts(EClass cl, double deleteCosts) {
		this.deleteCosts.put(cl, deleteCosts);
	}
	
	public void setCreateCosts(EClass cl, double createCosts) {
		this.createCosts.put(cl, createCosts);
	}
	 
	
	public<T> void addFunction(Class<T> clazz, CostFunction<? super T> func) {
		costFunctions.put(clazz, func);
	}

	@Override
	public <T> CostFunction<? super T> getClFunction(Class<T> forClass) {
		return (CostFunction<? super T>)costFunctions.getOrDefault(forClass, defaultFunction);
	}

	@Override
	public double getCreateCosts(EClass cl) {
		return createCosts.getOrDefault(cl, defaultCreateCosts);
	}

	@Override
	public double getDeleteCosts(EObject toDel) {
		if (toDel == null) {
			return 0.0;
		}
		double ret = deleteCosts.getOrDefault(toDel, defaultDeleteCosts);
		for (EStructuralFeature esf: toDel.eClass().getEAllStructuralFeatures()) {
			for (Object o: MyEcoreUtil.asCollection(toDel.eGet(esf))) {
				ret+= getFunction(o).getCosts(o, null);
			}
		}
		return ret;
	}
	

}
