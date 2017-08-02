package at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.fixinggenerators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.ocl.expressions.OperationCallExp;

import at.ac.tuwien.big.xmlintelledit.intelledit.change.basic.CreateObjectChangeType;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.basic.DeleteObjectChangeType;
import at.ac.tuwien.big.xmlintelledit.intelledit.ecore.util.MyResource;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.FixAttempt;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.SetAdd;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.SetAddAny;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.SetRemove;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.SetRemoveAny;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.AbstractSelectiveEvaluator;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.EvalResult;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.ExpressionResult;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.FixActionMap;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.FixingActionGenerator;

public class ApplyAllInstancesChanges  extends AbstractSelectiveEvaluator<OperationCallExp, Collection> implements FixingActionGenerator<OperationCallExp, Collection> {

	public ApplyAllInstancesChanges() {
		super(OperationCallExp.class, Collection.class, false, "allInstances");
	}
	
	public static ApplyAllInstancesChanges INSTANCE = new ApplyAllInstancesChanges();

	@Override
	public boolean addFixingPossibilitiesLocal(MyResource resource, FixAttempt singleAttemptForThis, EvalResult baseres, int realpriority,
			FixActionMap potentialFixChanges) {
		if (!(baseres instanceof ExpressionResult)) {
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
		
		
		if (singleAttemptForThis instanceof SetAddAny) {
			int amount = ((SetAddAny)singleAttemptForThis).targetSize();
			//Add so many objects
			CreateObjectChangeType co = CreateObjectChangeType.createObjectFromClasses(resource.getResource(), allInstancableTypes);
			potentialFixChanges.addFixingAction(realpriority, co);
		} else if (singleAttemptForThis instanceof SetAdd) {
			SetAdd sa = (SetAdd)singleAttemptForThis;
			//Doesn't make sense - maybe you could just do a retype?!
			//TODO: Evaluate whether a retype makes sense
			return false;
		} else if (singleAttemptForThis instanceof SetRemove) {
			SetRemove sr = (SetRemove)singleAttemptForThis;
			//TODO: Beside object deletion, a retype might make sense
			DeleteObjectChangeType co = DeleteObjectChangeType.createObjectFromObjects(resource.getResource(), 
					(EObject)sr.border());
			potentialFixChanges.addFixingAction(realpriority, co);
		} else if (singleAttemptForThis instanceof SetRemoveAny) {
			SetRemoveAny sr = (SetRemoveAny)singleAttemptForThis;
			int amount = sr.targetSize();
			//Add so many objects
			DeleteObjectChangeType co = DeleteObjectChangeType.createObjectFromObjects(resource.getResource(), 
				new ArrayList<>((Collection)resultValue));
			potentialFixChanges.addFixingAction(realpriority, co);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public int getBasePriority() {
		return FixingActionGenerator.DIRECT_FIX_PRIORITY;
	}

}
