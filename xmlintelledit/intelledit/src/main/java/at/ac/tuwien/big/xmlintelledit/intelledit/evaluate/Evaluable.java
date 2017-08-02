package at.ac.tuwien.big.xmlintelledit.intelledit.evaluate;

import org.eclipse.emf.ecore.EObject;

import at.ac.tuwien.big.xmlintelledit.intelledit.ecore.util.MyResource;

public interface Evaluable<U extends Evaluable<U,T>,T extends EvaluationState<T>> {
	
	public T getState(MyResource res, EObject obj);

}
