package at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.fixinggenerators;

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
import at.ac.tuwien.big.xmlintelledit.intelledit.change.basic.FixedAddConstantChangeType;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.basic.FixedClearChangeType;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.basic.FixedDeleteConstantChangeType;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.basic.FixedSetConstantChangeType;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.parameter.StaticScopeParameterType;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.primitive.StringChangeScope;
import at.ac.tuwien.big.xmlintelledit.intelledit.ecore.util.MyResource;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.Decrease;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.FixAttempt;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.Increase;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.SetAdd;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.SetAddAny;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.SetRemove;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.SetRemoveAny;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.impl.ChangeSomethingImpl;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.AbstractSelectiveEvaluator;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.EvalResult;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.ExpressionResult;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.FixActionMap;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.FixingActionGenerator;

public class ApplyChangePropertyCallChanges  extends AbstractSelectiveEvaluator<PropertyCallExp, Object> implements FixingActionGenerator<PropertyCallExp, Object> {

	public ApplyChangePropertyCallChanges() {
		super(PropertyCallExp.class, Object.class, true, null);
	}
	
	public static ApplyChangePropertyCallChanges INSTANCE = new ApplyChangePropertyCallChanges();
	
	public static Collection wrapCollection(Object objOrCollection) {
		if (objOrCollection == null) {
			return Collections.emptyList();
		}
		if (objOrCollection instanceof Collection) {
			return (Collection)objOrCollection;
		}
		return Collections.singleton(objOrCollection);
	}
	

	@Override
	public boolean addFixingPossibilitiesLocal(MyResource resource, FixAttempt singleAttemptForThis, EvalResult baseres, int priority, FixActionMap potentialFixChanges) {
		if (!(baseres instanceof ExpressionResult)) {
			return false;
		}
		boolean shouldAdd = false;
		boolean shouldRemove = false;
		boolean shouldChange = false;
		Object addSpecific = null;
		Object removeSpecific = null;
		if (singleAttemptForThis instanceof ChangeSomethingImpl) {
			shouldAdd = shouldRemove = true;
			shouldChange = true;
		} else if (singleAttemptForThis instanceof SetAdd) {
			shouldAdd = true;
			addSpecific = ((SetAdd) singleAttemptForThis).border();
		} else if (singleAttemptForThis instanceof SetAddAny ) {
			shouldAdd = true;
		} else if (singleAttemptForThis instanceof SetRemove) {
			shouldRemove = true;
			removeSpecific = ((SetRemove) singleAttemptForThis).border();
		} else if (singleAttemptForThis instanceof SetRemoveAny) {
			shouldRemove = true;
		} else if (singleAttemptForThis instanceof Increase || singleAttemptForThis instanceof Decrease){
			//TODO: More specific ...
			shouldChange = true;
		} else {
			return false;
		}
		ExpressionResult res = (ExpressionResult)baseres;
		PropertyCallExp expr = (PropertyCallExp) res.getExpression();
		//Increase, Decrease, SetAdd, SetRemove ... everything should/could be handled here
		
		if (!(expr.getReferredProperty() instanceof EStructuralFeature)) {
			System.err.println("Strange referrend property " + expr.getReferredProperty());
			return false;
		}
		
		if (res.getSubResults().size() != 1) {
			System.err.println("Wrong result size for PropertyExp: " + res.getSubResults().size());
			return false;
		}
		
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
		
		ParameterType valueGeneratingParameter = null;
		
		//Hier muss irgendetwas pro Typ haben
		//Für Daten: Modifikatoren, Generatoren
		//Für Assoziationen: Generatoren - Modifikatoren unnötig
		if (addSpecific != null) {
			valueGeneratingParameter = ParameterType.constant(addSpecific);
		} else {
			valueGeneratingParameter = resource.defaultGenerator(targetFeat);
		}
		
				
		//TODO: Es gibt auch andere Fix-Möglichkeiten, z.B. die Source-Collection entsprechend zu ändern, 
		//so dass das passende rauskommt
		//So sicher nicht, das ist dann vielleicht der konkrete Fix ...
		for (Object srcObj: srcObjs) {
			if (!(srcObj instanceof EObject)) {
				System.err.println("Strange ...");
			}
			EObject obj = (EObject)srcObj;
			if (!targetFeat.getEContainingClass().isSuperTypeOf(obj.eClass())) {
				//Feature cannot be applied ...
				continue;
			}
			
			if (FeatureMapUtil.isMany(obj, targetFeat)) {
				Collection curCol = (Collection)obj.eGet(targetFeat);
				if (shouldRemove && removeSpecific == null) {
					potentialFixChanges.addFixingAction(priority, new FixedClearChangeType<>(resource.getResource(),obj, targetFeat));
				}
				if (shouldAdd) {
					potentialFixChanges.addFixingAction(priority, new FixedAddConstantChangeType<>(resource.getResource(),obj, targetFeat,
						valueGeneratingParameter));
				}
				if (shouldRemove) {
					if (removeSpecific == null) {
				potentialFixChanges.addFixingAction(priority, new FixedDeleteConstantChangeType<>(resource.getResource(),obj, targetFeat,
						ParameterType.equalProbabilityMultiFeat(targetClass, obj, targetFeat)
						));
					} else {
						potentialFixChanges.addFixingAction(priority, new FixedDeleteConstantChangeType<>(resource.getResource(),obj, targetFeat,
								ParameterType.constant(removeSpecific)));
					}
				}
				//TODO: Eigentlich bräuchte man auch noch etwas, wenn es Multi-Valued ist und man änder möchte ...
				
			} else {
				if (shouldRemove) {
					if (targetFeat.getEType().getInstanceClass() == String.class) {
						//Reduce length
						Object curValue = obj.eGet(targetFeat);
						if (curValue != null && targetType instanceof EDataType) {
							ParameterType changeType = new StaticScopeParameterType<>(String.class, StringChangeScope.getScope((String)curValue, false, false, true));
							String onlyThatLength = String.valueOf(curValue);
							if (changeType != null) {
							potentialFixChanges.addFixingAction(priority, 
									new FixedSetConstantChangeType<>(resource.getResource(),obj,targetFeat,
								changeType));
							}
						}
						 
					}
						
					potentialFixChanges.addFixingAction(priority, new FixedClearChangeType<>(resource.getResource(),obj, targetFeat));
				}
				if (shouldAdd) {
					if (targetFeat.getEType().getInstanceClass() == String.class) {
						//Reduce length
						Object curValue = obj.eGet(targetFeat);
						if (curValue != null && targetType instanceof EDataType) {
							ParameterType changeType = new StaticScopeParameterType<>(String.class, StringChangeScope.getScope((String)curValue, true, false, false));
							if (changeType != null) {
							potentialFixChanges.addFixingAction(priority, 
									new FixedSetConstantChangeType<>(resource.getResource(),obj,targetFeat,
								changeType));
							}
						}
						 
					}
					potentialFixChanges.addFixingAction(priority, 
							new FixedSetConstantChangeType<>(resource.getResource(),obj,targetFeat,
							valueGeneratingParameter));
				}
				if (shouldChange || (shouldRemove && shouldAdd)) {
					Object curValue = obj.eGet(targetFeat);
					if (curValue != null && targetType instanceof EDataType) {
						ParameterType changeType = resource.getChangeValueGenerator(targetFeat, targetClass, curValue);
						if (changeType != null) {
							potentialFixChanges.addFixingAction(priority, 
									new FixedSetConstantChangeType<>(resource.getResource(),obj,targetFeat,
								changeType));
						}
					}
				}
				
			}
		}
		
		
		EEnumLiteral lit;
		Object javaObj;
		EObject obj;
		
		//TODO: I think this is not yet fully implemented
		
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int getBasePriority() {
		return FixingActionGenerator.LOCAL_SEARCH_PRIORITY;
	}

}
