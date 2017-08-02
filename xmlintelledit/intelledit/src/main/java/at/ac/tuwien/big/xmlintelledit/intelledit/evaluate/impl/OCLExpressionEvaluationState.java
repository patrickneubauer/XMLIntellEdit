package at.ac.tuwien.big.xmlintelledit.intelledit.evaluate.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.Environment;
import org.eclipse.ocl.EvaluationEnvironment;
import org.eclipse.ocl.EvaluationVisitor;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;

import at.ac.tuwien.big.xmlintelledit.intelledit.ecore.util.MyResource;
import at.ac.tuwien.big.xmlintelledit.intelledit.evaluate.EvaluationState;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.impl.MakeTrueImpl;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.EvalResult;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.RejectingFilterManager;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.TracingEvaluationVisitor;

public class OCLExpressionEvaluationState implements EvaluationState<OCLExpressionEvaluationState> {
	
	private OCLExpressionEvaluable eval;
	private EObject obj;
	private RejectingFilterManager man;
	private Map extents;
	private EvaluationEnvironment env;
	private static final EcoreEnvironmentFactory fact = EcoreEnvironmentFactory.INSTANCE;
	private MyResource res;

	public OCLExpressionEvaluationState(MyResource res, OCLExpressionEvaluable eval, EObject obj) {
		this.eval = eval;
		this.obj = obj;
		this.res = res;
	}
	
	public void initParam() {
		man = new RejectingFilterManager();
		man.initDefault();
		
		env = fact.createEvaluationEnvironment();
		env.add(Environment.SELF_VARIABLE_NAME, obj);
		extents = env.createExtentMap(obj);
	};

	TracingEvaluationVisitor evalVisitor = null;
	Object returnedValue = null;
	Double quality = null;
	boolean fullEval = false;

	@Override
	public Object evaluateBasic() {
		EvaluationVisitor ev = fact
				.createEvaluationVisitor(fact.createEnvironment(), env, extents);			
		evalVisitor = new TracingEvaluationVisitor(ev);
		Object ret = eval.getExpression().accept(evalVisitor);
		returnedValue = ret;
		return ret;
	}


	@Override
	public Object evaluateFull() {
		if (evalVisitor == null) {
			evaluateBasic();
		}
		/*if (eval.toString().contains("self.designSpeed.<=(self.providedBy.designSpeed).and(if self.type.=(serviceexample::ServiceType::IMPORTANT) then self.designSpeed.<=(self.providedBy.backup.designSpeed) else self.type.=(serviceexample::ServiceType::WEAKCONTRACT).or(self.providedBy.backup.<>(null)) endif)")) {
			System.out.println("Expression!");
		}*/
		man.calculateEverything(res,evalVisitor.getTopResult());
		fullEval = true;
		return returnedValue;
	}


	@Override
	public EvalResult getResult() {
		return evalVisitor.getTopResult();
	}


	@Override
	public double getQuality() {
		if (quality == null) {
			try {
				if (!fullEval) {
					evaluateFull();
				}
				quality = man.calculateSingleQuality(getResult(), MakeTrueImpl.INSTANCE);
			} catch (Exception e) {
				return 0.0;
			}
		}
		return quality;
	}

	@Override
	public void reuseParam(OCLExpressionEvaluationState from) {
		man = from.man;
		extents = from.extents;
		env = fact.createEvaluationEnvironment();
		env.add(Environment.SELF_VARIABLE_NAME, obj);		
	}

	

}
