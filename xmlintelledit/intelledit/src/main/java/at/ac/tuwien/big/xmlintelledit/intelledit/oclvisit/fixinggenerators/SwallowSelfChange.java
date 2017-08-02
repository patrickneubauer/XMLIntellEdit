package at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.fixinggenerators;

import java.util.Collection;

import org.eclipse.ocl.expressions.VariableExp;

import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.FixAttempt;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.AbstractSelectiveEvaluator;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.ExpressionResult;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.FixingGenerator;

public class SwallowSelfChange extends AbstractSelectiveEvaluator<VariableExp, Object> implements FixingGenerator<VariableExp, Object> {

	public SwallowSelfChange() {
		super(VariableExp.class, null, false, null);
		// TODO Auto-generated constructor stub
	}
	
	public static SwallowSelfChange INSTANCE = new SwallowSelfChange();
	
	@Override
	public boolean addFixingPossibilitiesLocal(FixAttempt singleAttemptForThis, ExpressionResult res, VariableExp expr,
			Object result, Collection<FixAttempt>[] fixAttemptsPerSub) {
		if (expr.getReferredVariable() != null && "self".equals(expr.getReferredVariable().getName())) {
			return true;
		}
		return false;
	}


}
