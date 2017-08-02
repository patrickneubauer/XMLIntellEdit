package at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.fixinggenerators;

import java.util.Collection;

import org.eclipse.ocl.expressions.OperationCallExp;

import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.FixAttempt;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.AbstractSelectiveEvaluator;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.ExpressionResult;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.FixingGenerator;

public class FakeIdentityExpressions extends AbstractSelectiveEvaluator<OperationCallExp, Object>  implements FixingGenerator<OperationCallExp, Object> {

	public FakeIdentityExpressions(String requiredName) {
		super(OperationCallExp.class, Object.class, true, requiredName);
	}
	
	public static final FakeIdentityExpressions OCLASTYPE = new FakeIdentityExpressions("oclAsType");
	
	public static final FakeIdentityExpressions[] INSTANCES = new FakeIdentityExpressions[]{
			OCLASTYPE
	};

	@Override
	public boolean addFixingPossibilitiesLocal(FixAttempt singleAttemptForThis, ExpressionResult res, OperationCallExp expr,
			Object result, Collection<FixAttempt>[] fixAttemptsPerSub) {
		fixAttemptsPerSub[0].add(singleAttemptForThis);
		return true;
	}


}
