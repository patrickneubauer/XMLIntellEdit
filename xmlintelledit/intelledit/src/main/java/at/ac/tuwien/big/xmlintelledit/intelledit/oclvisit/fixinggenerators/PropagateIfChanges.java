package at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.fixinggenerators;

import java.util.Collection;

import org.eclipse.ocl.ecore.IfExp;

import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.FixAttempt;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.impl.MakeFalseImpl;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.impl.MakeTrueImpl;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.AbstractSelectiveEvaluator;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.ExpressionResult;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.FixingGenerator;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.fixinggenerators.PropagateBooleanChanges.OCLBooleanState;

public class PropagateIfChanges   extends AbstractSelectiveEvaluator<IfExp, Object> implements FixingGenerator<IfExp, Object> {
	
	public PropagateIfChanges() {
		super(IfExp.class, Object.class, true,null);
	}
	
	/**Seltsamerweise sind die Fixes bei beiden dieselben, auch wenn es unterschiedlich ist, was alles
	 * erfüllt werden muss
	 */
	
	public static final PropagateIfChanges INSTANCE = new PropagateIfChanges();

	@Override
	public boolean addFixingPossibilitiesLocal(FixAttempt singleAttemptForThis, ExpressionResult res, IfExp expr,
			Object result, Collection<FixAttempt>[] fixAttemptsPerSub) {
		OCLBooleanState bs = res.getResultAsState();
		if (bs == OCLBooleanState.NULL) {
			fixAttemptsPerSub[0].add(MakeTrueImpl.INSTANCE);
			fixAttemptsPerSub[0].add(MakeFalseImpl.INSTANCE);
		} else if (bs == OCLBooleanState.TRUE){
			fixAttemptsPerSub[0].add(MakeFalseImpl.INSTANCE);
		} else if (bs == OCLBooleanState.FALSE) {
			//System.out.println("faps before: " + fixAttemptsPerSub[0]);
			fixAttemptsPerSub[0].add(MakeTrueImpl.INSTANCE);
			//FixAttempt makeTrue = MakeTrueImpl.INSTANCE;
			//System.out.println("faps after: " + fixAttemptsPerSub[0]);
			//System.out.println("MakeTrue: "+MakeTrueImpl.INSTANCE);
		} else {
			return false;
		}
		
		for (int i = 1; i < fixAttemptsPerSub.length; ++i) {
			fixAttemptsPerSub[i].add(singleAttemptForThis);
		}
		return true;
	}

}
