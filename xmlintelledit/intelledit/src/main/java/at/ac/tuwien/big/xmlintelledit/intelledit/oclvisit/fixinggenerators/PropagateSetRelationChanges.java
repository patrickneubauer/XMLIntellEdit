package at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.fixinggenerators;

import java.util.Collection;

import org.eclipse.ocl.expressions.OperationCallExp;

import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.FixAttempt;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.impl.ChangeSomethingImpl;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.impl.MakeEqualImpl;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.impl.SetAddAnyImpl;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.impl.SetAddImpl;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.impl.SetRemoveAnyImpl;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.impl.SetRemoveImpl;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.AbstractSelectiveEvaluator;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.ExpressionResult;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.FixingGenerator;

public class PropagateSetRelationChanges  extends AbstractSelectiveEvaluator<OperationCallExp, Boolean> implements FixingGenerator<OperationCallExp, Boolean> {

	private enum Type {
		INCLUDESALL("includesAll"), EXCLUDESALL("excludesAll"), INCLUDES("includes"), EXCLUDES("excludes");
		
		private String oclName;
		
		private Type(String oclName) {
			this.oclName = oclName;
		}
	}
	private Type type;
	
	public static final PropagateSetRelationChanges INCLUDESALL = new
			PropagateSetRelationChanges(Type.INCLUDESALL);
	public static final PropagateSetRelationChanges EXCLUDESALL = new
			PropagateSetRelationChanges(Type.EXCLUDESALL);
	public  static final PropagateSetRelationChanges INCLUDES = new
			PropagateSetRelationChanges(Type.INCLUDES);
	public  static final PropagateSetRelationChanges EXCLUDES = new
			PropagateSetRelationChanges(Type.EXCLUDES);
	public static final PropagateSetRelationChanges[] INSTANCES = new PropagateSetRelationChanges[]{
		INCLUDES,INCLUDESALL,EXCLUDES,EXCLUDESALL	
	};
	
	
	public PropagateSetRelationChanges(Type type) {
		super(OperationCallExp.class, Boolean.class, true, type.oclName);
		this.type = type;
	}

	@Override
	public boolean addFixingPossibilitiesLocal(FixAttempt singleAttemptForThis, ExpressionResult res, OperationCallExp expr,
			Boolean result, Collection<FixAttempt>[] fixAttemptsPerSub) {
		boolean makeTrue;
		if (singleAttemptForThis.isLooseMakeTrue()) {
			makeTrue = true;
		} else if (singleAttemptForThis.isLooseMakeFalse()) {
			makeTrue = false;
		} else {
			return false;
		}
		boolean isSet = type == Type.INCLUDESALL || type == Type.EXCLUDESALL;
		boolean isInclude = type == Type.INCLUDES || type == Type.INCLUDESALL;
		Collection firstSet = res.getSourceResultAsCollection();
		Collection sndSet = isSet?res.getResultAsCollection(1):res.convertResultToCollection(1);
		boolean shouldInclude = (makeTrue && isInclude) || (!makeTrue && !isInclude);
		if (shouldInclude) {
			//Include everything from the second set in the first set
			for (Object o: sndSet) {
				fixAttemptsPerSub[0].add(new SetAddImpl(o));
			}
			//Delete everything from the second set
			if (isSet) {
				fixAttemptsPerSub[1].add(new SetRemoveAnyImpl(0));
				//Especially the things not contained
				for (Object o: sndSet) {
					if (!firstSet.contains(o)) {
						fixAttemptsPerSub[1].add(new SetRemoveImpl(o));
					}
				}
			} else {
				for (Object o: firstSet) {
					fixAttemptsPerSub[1].add(new MakeEqualImpl(o));
				}
			}
		} else {
			//Exclude something from the second set in the first set
			fixAttemptsPerSub[0].add(new SetRemoveAnyImpl(0));
			for (Object o: sndSet) {
				if (firstSet.contains(o)) {
					fixAttemptsPerSub[0].add(new SetRemoveImpl(o));
				}
			}
			//Include elements in the second set
			if (isSet) {
				fixAttemptsPerSub[1].add(new SetAddAnyImpl(Integer.MAX_VALUE));
			} else {
				fixAttemptsPerSub[1].add(new ChangeSomethingImpl());
			}
		}
		return true;
	}
	

}
 