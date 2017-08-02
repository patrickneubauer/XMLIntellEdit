package at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.fixinggenerators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.ocl.expressions.OperationCallExp;

import at.ac.tuwien.big.xmlintelledit.intelledit.change.basic.CreateObjectChangeType;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.basic.DeleteObjectChangeType;
import at.ac.tuwien.big.xmlintelledit.intelledit.ecore.util.MyResource;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.ChangeSomething;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.FixAttempt;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.AbstractSelectiveEvaluator;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.EvalResult;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.ExpressionResult;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.FixActionMap;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.FixingActionGenerator;

public class ApplyAnyAllInstancesChanges  extends AbstractSelectiveEvaluator<OperationCallExp, Collection> implements FixingActionGenerator<OperationCallExp, Collection> {

	public ApplyAnyAllInstancesChanges() {
		super(OperationCallExp.class, Collection.class, false, "allInstances");
	}
	
	public static ApplyAnyAllInstancesChanges INSTANCE = new ApplyAnyAllInstancesChanges();

	@Override
	public boolean addFixingPossibilitiesLocal(MyResource resource, FixAttempt singleAttemptForThis, EvalResult baseres, int realpriority,
			FixActionMap potentialFixChanges) {
		if (!(baseres instanceof ExpressionResult)) {
			return false;
		}
		if (!(singleAttemptForThis instanceof ChangeSomething)) {
			return false;
		}
		ExpressionResult res = (ExpressionResult)baseres;
		Object resultValue = res.getResult();
		EClass allInstanceType = null;
		//TODO: Es gibt wohl was besseres ...
		org.eclipse.ocl.ecore.OperationCallExp opExp = (org.eclipse.ocl.ecore.OperationCallExp) res.getExpression();
		EOperation op = opExp.getReferredOperation();
		EClassifier ecl = op.getEType();
		if (!(ecl instanceof EClass)) {
			System.err.println("Strange operation allInstances type: " + ecl);
			return false;
		}
		EClass cl = (EClass)ecl;
		List<EClass> allInstancableTypes = resource.getInstancibleTypes(cl);
		
		
		DeleteObjectChangeType deleteobject = DeleteObjectChangeType.createObjectFromObjects(resource.getResource(), 
				new ArrayList<>((Collection)resultValue));
		potentialFixChanges.addFixingAction(realpriority, deleteobject);
		
		CreateObjectChangeType co = CreateObjectChangeType.createObjectFromClasses(resource.getResource(), allInstancableTypes);
		potentialFixChanges.addFixingAction(realpriority, co);
		return true;
	}

	@Override
	public int getBasePriority() {
		return FixingActionGenerator.LOCAL_SEARCH_PRIORITY;
	}

}
