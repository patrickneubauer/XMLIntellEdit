package at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.fixinggenerators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.ocl.expressions.PropertyCallExp;

import at.ac.tuwien.big.xmlintelledit.intelledit.change.ParameterType;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.basic.FixedClearChangeType;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.basic.FixedSetConstantChangeType;
import at.ac.tuwien.big.xmlintelledit.intelledit.ecore.util.MyResource;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.Decrease;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.FixAttempt;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.Increase;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.MakeEqual;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.MakeFalse;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.MakeTrue;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.AbstractSelectiveEvaluator;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.EvalResult;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.ExpressionResult;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.FixActionMap;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.FixingActionGenerator;
import at.ac.tuwien.big.xtext.util.MyEcoreUtil;

public class ApplyMakeEqualChanges  extends AbstractSelectiveEvaluator<PropertyCallExp, Object> implements FixingActionGenerator<PropertyCallExp, Object> {

	public static ApplyMakeEqualChanges INSTANCE = new ApplyMakeEqualChanges();
	
	public static Collection wrapCollection(Object objOrCollection) {
		if (objOrCollection == null) {
			return Collections.emptyList();
		}
		if (objOrCollection instanceof Collection) {
			return (Collection)objOrCollection;
		}
		return Collections.singleton(objOrCollection);
	}
	
	public ApplyMakeEqualChanges() {
		super(PropertyCallExp.class, Object.class, true, null);
	}

	@Override
	public boolean addFixingPossibilitiesLocal(MyResource resource, FixAttempt singleAttemptForThis, EvalResult baseres, int priority, FixActionMap potentialFixChanges) {
		if (!(baseres instanceof ExpressionResult)) {
			return false;
		}
		ExpressionResult res = (ExpressionResult)baseres;
		PropertyCallExp expr = (PropertyCallExp) res.getExpression();
		Object target = null;
		if (singleAttemptForThis instanceof MakeEqual) {
			target = ((MakeEqual) singleAttemptForThis).border();
		} else if (singleAttemptForThis instanceof MakeTrue) {
			target = true;
		} else if (singleAttemptForThis instanceof MakeFalse) {
			target = false;
		} else if (singleAttemptForThis instanceof Increase){
			target = ((Increase)singleAttemptForThis).getAcceptableValueOrNull();
			if (target == null) {
				return false;
			}
		} else if (singleAttemptForThis instanceof Decrease) {
			target = ((Decrease)singleAttemptForThis).getAcceptableValueOrNull();
			if (target == null) { //TODO: Fix that ...
				return false;
			}
		} else {
			return false;
		}
		//Increase, Decrease, SetAdd, SetRemove ... everything should/could be handled here
		
		if (!(expr.getReferredProperty() instanceof EStructuralFeature)) {
			System.err.println("Strange referrend property " + expr.getReferredProperty());
			return false;
		}
		
		if (res.getSubResults().size() != 1 && res.getSubResults().size() != 2) {
			System.err.println("Wrong result size for PropertyExp: " + res.getSubResults().size());
			return false;
		}
		
		if (res.getSubResults().size() == 1) {
			//Normal property

			Object src = res.getSubResultValue(0);
			Collection srcObjs = wrapCollection(src);
			EStructuralFeature targetFeat = (EStructuralFeature)expr.getReferredProperty();
			EClassifier targetType = targetFeat.getEType();
			Class<?> targetClass = targetType.getInstanceClass();
			if (targetClass == null && targetType instanceof EClass) {
				targetClass = EObject.class;
			}
			if (targetClass == null && targetType instanceof EEnum) {
				targetClass = EEnumLiteral.class;
			}
			if (targetClass == null && targetType instanceof EDataType) {
				//TODO: Das ist nicht schön
				targetClass = Object.class;
			}
			//Convert ...
			if (targetClass != null && Number.class.isAssignableFrom(targetClass) && target instanceof Number) {
				target = MyEcoreUtil.getNumber((Class<? extends Number>)targetClass,(Number)target);
			}
			//Check types
			Collection allTargetObj = wrapCollection(target);
			for (Object singleTargetObj: allTargetObj) {
				if (targetClass != null && target != null && !targetClass.isAssignableFrom(target.getClass())) {
					System.err.println("Cannot apply fix of setting to target " + target + " in property "+ targetFeat+"! ("+targetClass+ " VS "+target.getClass()+")");
					return false;
				}
			}
			
			
			
			//TODO: Es gibt auch andere Fix-Möglichkeiten, z.B. die Source-Collection entsprechend zu ändern, 
			//so dass das passende rauskommt
			//So sicher nicht, das ist dann vielleicht der konkrete Fix ...
			for (Object srcObj: srcObjs) {
				EObject obj = (EObject)srcObj;
				
				if (FeatureMapUtil.isMany(obj, targetFeat)) {
					Collection curCol = (Collection)obj.eGet(targetFeat);
					potentialFixChanges.addFixingAction(priority, new FixedSetConstantChangeType<>(resource.getResource(),obj,targetFeat,
							ParameterType.equalProbability(Object.class, 
									new ArrayList<>(allTargetObj)))
							);
				} else {
					if (allTargetObj.isEmpty()) {
						potentialFixChanges.addFixingAction(priority, new FixedClearChangeType(resource.getResource(),obj, targetFeat));
					} else if (allTargetObj.size() == 1) {
						potentialFixChanges.addFixingAction(priority, 
								new FixedSetConstantChangeType<>(resource.getResource(),obj,targetFeat,
								ParameterType.equalProbability(Object.class, 
										Collections.singletonList(allTargetObj.iterator().next()))
								));
					} else {
						System.err.println("Wanting to set a single-valued property to more ...");
						potentialFixChanges.addFixingAction(priority, new FixedSetConstantChangeType<>(resource.getResource(),obj,targetFeat,
								ParameterType.equalProbability(Object.class, 
										Collections.singletonList(allTargetObj.iterator().next()))
								));
					}
				}
			}
			
			
			EEnumLiteral lit;
			Object javaObj;
			EObject obj;
			
			//TODO: I think this is not yet fully implemented
			
			// TODO Auto-generated method stub
			return true;
		} else {
			//In fact you need to just consider the second thing
			EvalResult evalResult = res.getSubResults().get(1);
			if (evalResult.getExpression() instanceof PropertyCallExp) {
				return addFixingPossibilities(resource, singleAttemptForThis, evalResult, priority, potentialFixChanges);
			}
			return false;
		}
		
	}

	@Override
	public int getBasePriority() {
		return FixingActionGenerator.DIRECT_FIX_PRIORITY;
	}

}
