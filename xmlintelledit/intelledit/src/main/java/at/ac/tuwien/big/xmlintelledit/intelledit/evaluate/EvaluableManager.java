package at.ac.tuwien.big.xmlintelledit.intelledit.evaluate;

import org.eclipse.emf.ecore.EObject;

import at.ac.tuwien.big.xmlintelledit.intelledit.ecore.util.MyResource;

/**Manages Evaluation for an Object*/
public interface EvaluableManager {

	
	void performTypicalEvaluation(MyResource resource, EObject forObject, EvaluationCallback callback);
	
	EvaluationState basicEvaluate(MyResource res, Evaluable eval, EObject forObject);
	
	EvaluationState fullEvaluate(MyResource res, Evaluable eval, EObject forObject);
}
