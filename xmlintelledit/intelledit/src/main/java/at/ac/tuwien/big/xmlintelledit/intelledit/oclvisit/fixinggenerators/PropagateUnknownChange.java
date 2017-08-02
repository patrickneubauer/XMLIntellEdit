package at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.fixinggenerators;

import java.util.Collection;

import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.ChangeSomething;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.FixAttempt;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.impl.ChangeSomethingImpl;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.AbstractSelectiveEvaluator;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.ExpressionResult;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.FixingGenerator;

public class PropagateUnknownChange extends AbstractSelectiveEvaluator<Object, Object> implements FixingGenerator<Object, Object>{

	public PropagateUnknownChange() {
		super(Object.class, Object.class, true, null);
	}

	public static final PropagateUnknownChange INSTANCE = new PropagateUnknownChange();	
	
	@Override
	public boolean addFixingPossibilitiesLocal(FixAttempt singleAttemptForThis, ExpressionResult res, Object expr,
			Object result, Collection<FixAttempt>[] fixAttemptsPerSub) {
		if (singleAttemptForThis instanceof ChangeSomething) { 
			for (int i = 0; i < fixAttemptsPerSub.length; ++i) {
				fixAttemptsPerSub[i].add(ChangeSomethingImpl.INSTANCE);
			}
			return true;
		}
		return false;
	}

}
