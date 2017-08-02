package at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.fixinggenerators;

import java.util.Collection;

import org.eclipse.ocl.expressions.OperationCallExp;

import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.FixAttempt;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.impl.MakeDifferentlImpl;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.impl.MakeEqualImpl;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.AbstractSelectiveEvaluator;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.ExpressionResult;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.FixingGenerator;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.fixinggenerators.PropagateBooleanChanges.OCLBooleanState;

public class PropagateEqualChanges  extends AbstractSelectiveEvaluator<OperationCallExp, Boolean> implements FixingGenerator<OperationCallExp, Boolean> {

	private boolean isEqual;
	
	public PropagateEqualChanges(boolean isEqual) {
		super(OperationCallExp.class, Boolean.class, true, isEqual?"=":"<>");
		this.isEqual = isEqual;
	}

	public static final PropagateEqualChanges EQUAL = new PropagateEqualChanges(true);
	public static final PropagateEqualChanges UNEQUAL = new PropagateEqualChanges(false);
	
	@Override
	public boolean addFixingPossibilitiesLocal(FixAttempt singleAttemptForThis, ExpressionResult res, OperationCallExp expr,
			Boolean result, Collection<FixAttempt>[] fixAttemptsPerSub) {
		OCLBooleanState wantState = singleAttemptForThis.getWantBooleanStateIfExists();
		OCLBooleanState curState = res.getResultAsState();
		if (wantState == null || curState == null) {
			return false;
		}	
		if (wantState == curState) {
			return true;
		}
		if (res.getSubResults().size() != 2) {
			System.err.println("Equal/Not-Equal has not size 2 as subresults!");
			return false;
		}
		Object leftResult = res.getSubResults().get(0).getResult();
		Object rightResult = res.getSubResults().get(1).getResult();
		FixAttempt fixerLeft;
		FixAttempt fixerRight;
		if ((wantState == OCLBooleanState.TRUE && isEqual) || (wantState == OCLBooleanState.FALSE && !isEqual)) {
			fixerLeft = new MakeEqualImpl(res.getSubResultValue(1));
			fixerRight = new MakeEqualImpl(res.getSubResultValue(0));
		} else if ((wantState == OCLBooleanState.FALSE && !isEqual) || (wantState == OCLBooleanState.TRUE && isEqual)) {
			fixerLeft = new MakeDifferentlImpl(res.getSubResultValue(1));
			fixerRight = new MakeDifferentlImpl(res.getSubResultValue(0));
		} else {
			return false;
		}
		fixAttemptsPerSub[0].add(fixerLeft);
		fixAttemptsPerSub[1].add(fixerRight);
		return true;
	}

}
