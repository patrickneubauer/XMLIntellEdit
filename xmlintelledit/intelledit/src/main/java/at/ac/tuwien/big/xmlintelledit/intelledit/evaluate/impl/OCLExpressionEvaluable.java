package at.ac.tuwien.big.xmlintelledit.intelledit.evaluate.impl;

import java.util.Map;
import java.util.Objects;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.Environment;
import org.eclipse.ocl.EvaluationEnvironment;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.ecore.EvaluationVisitorImpl;
import org.eclipse.ocl.expressions.OCLExpression;

import at.ac.tuwien.big.xmlintelledit.intelledit.ecore.util.MyResource;
import at.ac.tuwien.big.xmlintelledit.intelledit.evaluate.Evaluable;
import at.ac.tuwien.big.xmlintelledit.intelledit.evaluate.EvaluationState;

public class OCLExpressionEvaluable implements Evaluable {
	
	private OCLExpression expr;
	private OCLExpression messageExpr;
	private static final EcoreEnvironmentFactory fact = EcoreEnvironmentFactory.INSTANCE;
	
	public OCLExpression getExpression() {
		return expr;
	}
			
	
	public OCLExpressionEvaluable(OCLExpression expr, OCLExpression messageExpr) {
		this.expr = expr;
		this.messageExpr = messageExpr;
	}

	@Override
	public EvaluationState getState(MyResource res, EObject obj) {
		return new OCLExpressionEvaluationState(res,this,obj);
	}
	
	public boolean equals(Object o) {
		return (o instanceof OCLExpressionEvaluable) && Objects.equals(expr, ((OCLExpressionEvaluable)o).expr);
	}

	public int hashCode() {
		return Objects.hashCode(expr);
	}

	@Override
	public OCLExpressionEvaluable clone() {
		return new OCLExpressionEvaluable(expr,messageExpr);
	}
	
	public String toString() {
		return String.valueOf(expr);
	}
	
	public String evaluateMessage(EObject context) {
		if (messageExpr == null) {
			return null;
		}
		EvaluationEnvironment env = fact.createEvaluationEnvironment();
		env.add(Environment.SELF_VARIABLE_NAME, context);
		Map extents = env.createExtentMap(context);
		EvaluationVisitorImpl evi = new EvaluationVisitorImpl(fact.createEnvironment(), env, extents);
		Object ret = evi.visitExpression(messageExpr);
		if (ret instanceof String) {
			return (String)ret;
		}
		return null;
	}
}
