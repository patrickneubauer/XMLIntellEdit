package at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.fixinggenerators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.ocl.expressions.IteratorExp;

import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.FixAttempt;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.impl.MakeFalseImpl;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.impl.MakeTrueImpl;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.impl.SetRemoveImpl;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.AbstractSelectiveEvaluator;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.EvalResult;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.ExpressionResult;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.FixingGenerator;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.fixinggenerators.PropagateBooleanChanges.OCLBooleanState;

public class PropagateIteratorChanges   extends AbstractSelectiveEvaluator<IteratorExp, Boolean> implements FixingGenerator<IteratorExp, Boolean> {
	
	private enum Type {
		EXISTS("exists"),FORALL("forAll"),ONE("one");
		
		private String str;
		
		private Type(String str) {
			this.str = str;
		}
		
		public String getStr() {
			return str;
		}
	}
	
	private Type type;
	
	public PropagateIteratorChanges(Type type) {
		super(IteratorExp.class, Boolean.class, true, type.str);
		this.type = type;
	}
	
	/**Seltsamerweise sind die Fixes bei beiden dieselben, auch wenn es unterschiedlich ist, was alles
	 * erfüllt werden muss
	 */
	
	public static final PropagateIteratorChanges FORALL = new PropagateIteratorChanges(Type.FORALL);
	public static final PropagateIteratorChanges EXISTS = new PropagateIteratorChanges(Type.EXISTS);
	public static final PropagateIteratorChanges ONE = new PropagateIteratorChanges(Type.ONE);

	@Override
	public boolean addFixingPossibilitiesLocal(FixAttempt singleAttemptForThis, ExpressionResult res, IteratorExp expr,
			Boolean result, Collection<FixAttempt>[] fixAttemptsPerSub) {
		OCLBooleanState wantState = singleAttemptForThis.getWantBooleanStateIfExists();
		if (wantState == null || wantState == OCLBooleanState.NULL) {return false;}
		String haveName = expr.getName();
		OCLBooleanState curResult = OCLBooleanState.fromObject(res.getResult());
		if (curResult == null) {
			return false;
		}
		if (wantState == curResult) {
			return true;
		}
		//Remove wrong from collection
		Object srcObj = res.getSubResultValue(0);
		Collection srcCol;
		if (!(srcObj instanceof Collection)) {
			srcCol = Collections.singleton(srcObj);
		} else {
			srcCol = (Collection)srcObj;
		}
		EvalResult srcRes = res.getSubResults().get(0);
		List<Object> indexedList = new ArrayList<>(srcCol);
		
		
		List<OCLBooleanState> subStates = res.getSubBooleanStateIfExists();
		FixAttempt attempt = wantState.getFixAttempt();
		if (type == Type.ONE) {
			int foundTrue = 0;
			for (int i = 1; i < fixAttemptsPerSub.length; ++i) {
				OCLBooleanState state = subStates.get(i);
				if (state != null && state == OCLBooleanState.TRUE) {
					++foundTrue;
				}
			}
			if (wantState == OCLBooleanState.FALSE) {
				//Make more true OR more false
				for (int i = 1; i < fixAttemptsPerSub.length; ++i) {
					OCLBooleanState sub = subStates.get(i);
					if (sub != OCLBooleanState.TRUE) {
						fixAttemptsPerSub[i].add(MakeTrueImpl.INSTANCE);
					} else {
						fixAttemptsPerSub[i].add(MakeFalseImpl.INSTANCE);
					}
					srcRes.addPossibleFix(new SetRemoveImpl(indexedList.get(i-1)));
					//TODO: For forall/false, exists/true, you might want to add some element ...
				}
				return true;
			} else {
				if (foundTrue == 0) {
					//Make more true
					for (int i = 1; i < fixAttemptsPerSub.length; ++i) {
						OCLBooleanState sub = subStates.get(i);
						fixAttemptsPerSub[i].add(MakeTrueImpl.INSTANCE);
					}
				} else if (foundTrue > 1) {
					//Make more false
					for (int i = 1; i < fixAttemptsPerSub.length; ++i) {
						OCLBooleanState sub = subStates.get(i);
						fixAttemptsPerSub[i].add(MakeFalseImpl.INSTANCE);
					}
					
				}
				return true;
			}
		} else {
				
			for (int i = 1; i < fixAttemptsPerSub.length; ++i) {
				OCLBooleanState sub = subStates.get(i);
				fixAttemptsPerSub[i].add(attempt);
				srcRes.addPossibleFix(new SetRemoveImpl(indexedList.get(i-1)));
				//TODO: For forall/false, exists/true, you might want to add some element ...
			}
			return true;
		}
	}

}
