package at.ac.tuwien.big.xmlintelledit.intelledit.evaluate.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import at.ac.tuwien.big.xmlintelledit.intelledit.ecore.util.MyResource;
import at.ac.tuwien.big.xmlintelledit.intelledit.evaluate.Evaluable;
import at.ac.tuwien.big.xmlintelledit.intelledit.evaluate.EvaluableManager;
import at.ac.tuwien.big.xmlintelledit.intelledit.evaluate.EvaluationCallback;
import at.ac.tuwien.big.xmlintelledit.intelledit.evaluate.EvaluationState;

public class EvaluableManagerImpl implements EvaluableManager {
	
	private Map<Class<?>, EvaluationState<?>> lastStates = new HashMap<Class<?>, EvaluationState<?>>();

	@Override
	public void performTypicalEvaluation(MyResource resource, EObject forObject, EvaluationCallback callback) {
		Collection<Evaluable<?,?>> evaluable = resource.getApplicableEvaluators(forObject);
		for (Evaluable<?,? extends EvaluationState<?>> ev: evaluable) {
			if (ev instanceof MultiplicityEvaluable) {
				MultiplicityEvaluable me = (MultiplicityEvaluable)ev;
			}
			EvaluationState<?> state = ev.getState(resource,forObject);
			EvaluationState<?> lastState = lastStates.get(state.getClass());
			if (lastState == null) {
				state.initParam();
			} else {
				((EvaluationState)state).reuseParam(lastState);
			}
			Object ret = state.evaluateBasic();
			if (ret instanceof Boolean && ((Boolean)ret)) {
				callback.callbackSuccess(ev, state, ret);
			} else {
				state.evaluateFull();
				callback.callbackFailure(ev, state, ret, state.getResult());
			}
		}
	}

	@Override
	public EvaluationState basicEvaluate(MyResource res, Evaluable eval, EObject forObject) {
		EvaluationState<?> state = eval.getState(res, forObject);
		EvaluationState<?> lastState = lastStates.get(state.getClass());
		if (lastState == null) {
			state.initParam();
		} else {
			((EvaluationState)state).reuseParam(lastState);
		}
		Object ret = state.evaluateBasic();
		return state;
	}

	@Override
	public EvaluationState fullEvaluate(MyResource res, Evaluable eval, EObject forObject) {
		EvaluationState ret = basicEvaluate(res, eval, forObject);
		ret.evaluateFull();
		return ret;
	}

}
