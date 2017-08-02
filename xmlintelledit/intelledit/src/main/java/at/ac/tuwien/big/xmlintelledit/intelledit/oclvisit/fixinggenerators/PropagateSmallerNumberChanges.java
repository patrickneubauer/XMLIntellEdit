package at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.fixinggenerators;

import java.util.Collection;

import org.eclipse.ocl.expressions.OperationCallExp;

import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.FixAttempt;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.impl.DecreaseImpl;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.impl.IncreaseImpl;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.AbstractSelectiveEvaluator;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.ExpressionResult;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.FixingGenerator;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.fixinggenerators.PropagateBooleanChanges.OCLBooleanState;

public class PropagateSmallerNumberChanges  extends AbstractSelectiveEvaluator<OperationCallExp, Boolean> implements FixingGenerator<OperationCallExp, Boolean> {

	private Type type;
	
	private enum Type {
		SMALLER("<"),SMALLEREQUAL("<="),GREATER(">"),GREATEREQUAL(">=");
		
		private String name;
		
		private Type(String name) {
			this.name = name;
		}
		
		public Type inverse() {
			switch(this) {
			case SMALLER: return GREATEREQUAL;
			case SMALLEREQUAL: return GREATER;
			case GREATER: return SMALLEREQUAL;
			case GREATEREQUAL: return SMALLER;
			}
			throw new UnsupportedOperationException();
		}
		
		public String getName() {
			return name;
		}
	}
	
	public static final PropagateSmallerNumberChanges SMALLER = new PropagateSmallerNumberChanges(Type.SMALLER);
	public static final PropagateSmallerNumberChanges SMALLEREQUAL = new PropagateSmallerNumberChanges(Type.SMALLEREQUAL);
	public static final PropagateSmallerNumberChanges GREATER = new PropagateSmallerNumberChanges(Type.GREATER);
	public static final PropagateSmallerNumberChanges GREATEREQUAL = new PropagateSmallerNumberChanges(Type.GREATEREQUAL);
	
	public PropagateSmallerNumberChanges(Type type) {
		super(OperationCallExp.class, Boolean.class, true, type.getName());
		this.type = type;
	}

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
		if (wantState != OCLBooleanState.TRUE && wantState != OCLBooleanState.FALSE) {
			return false;
		}
		if (res.getSubResults().size() != 2) {
			System.err.println("Equal/Not-Equal has not size 2 as subresults!");
			return false;
		}
		Object leftResult = res.getSubResults().get(0).getResult();
		Object rightResult = res.getSubResults().get(1).getResult();
		FixAttempt fixerLeft;
		FixAttempt fixerRight;
		Type myType = type;
		if (wantState == OCLBooleanState.FALSE) {
			myType = type.inverse();
		}
		if (myType == Type.SMALLER || myType == Type.SMALLEREQUAL) {
			//Decrease first, increase second
			fixerLeft = new DecreaseImpl(rightResult, myType == Type.SMALLER);
			fixerRight = new IncreaseImpl(leftResult, myType == Type.SMALLER);
		} else {
			//Increase first, edecreasesecond
			fixerLeft = new IncreaseImpl(rightResult, myType == Type.GREATER);
			fixerRight = new DecreaseImpl(leftResult, myType == Type.GREATER);
		}
		fixAttemptsPerSub[0].add(fixerLeft);
		fixAttemptsPerSub[1].add(fixerRight);
		return true;
	}

}
