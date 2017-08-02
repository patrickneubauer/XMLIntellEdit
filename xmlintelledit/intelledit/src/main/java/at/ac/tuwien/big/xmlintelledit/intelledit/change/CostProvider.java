package at.ac.tuwien.big.xmlintelledit.intelledit.change;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;


public interface CostProvider {
	
	public static interface CostFunction<T> {
		public double getCosts(T from, T to);
	}
	
	public static final MapCostProvider DEFAULT_PROVIDER = MapCostProvider.DEFAULT_PROVIDER;
	
	
	public<T> CostFunction<? super T> getClFunction(Class<T> forClass);
	
	public default<T> CostFunction<? super T> getFunction(T forObject) {
		if (forObject == null) {
			return getClFunction((Class<T>)null);
		} else {
			return getClFunction((Class<T>)forObject.getClass());
		}
	}

	public double getCreateCosts(EClass cl);

	public double getDeleteCosts(EObject toDel);

}
