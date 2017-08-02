package at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.fixinggenerators;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.ocl.expressions.PropertyCallExp;

import com.google.common.base.Objects;

import at.ac.tuwien.big.xmlintelledit.intelledit.change.ParameterType;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.basic.FixedReplaceConstantChangeType;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.basic.FixedSetConstantChangeType;
import at.ac.tuwien.big.xmlintelledit.intelledit.ecore.util.MyResource;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.FixAttempt;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.MakeConformRegexp;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.AbstractSelectiveEvaluator;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.EvalResult;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.ExpressionResult;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.FixActionMap;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.FixingActionGenerator;
import at.ac.tuwien.big.xmlintelledit.intelledit.simpleregexp.RegExpAlgorithm;
import at.ac.tuwien.big.xtext.util.IteratorUtils;
import at.ac.tuwien.big.xtext.util.MyEcoreUtil;
import dk.brics.automaton.Automaton;

public class ApplyFixRegexpChanges  extends AbstractSelectiveEvaluator<PropertyCallExp, Object> implements FixingActionGenerator<PropertyCallExp, Object> {

	public ApplyFixRegexpChanges() {
		super(PropertyCallExp.class, Object.class, true, null);
	}

	public static ApplyFixRegexpChanges INSTANCE = new ApplyFixRegexpChanges();

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
		if (!(singleAttemptForThis instanceof MakeConformRegexp)) {
			return false;
		}
		Automaton regexp = ((MakeConformRegexp)singleAttemptForThis).getAutomaton();
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
		RegExpAlgorithm algo = new RegExpAlgorithm((String)baseres.getResult(), regexp);
		//TODO: Es gibt auch andere Fix-Mï¿½glichkeiten, z.B. die Source-Collection entsprechend zu ï¿½ndern,
		//so dass das passende rauskommt
		//So sicher nicht, das ist dann vielleicht der konkrete Fix ...
		for (Object srcObj: srcObjs) {
			EObject obj = (EObject)srcObj;

			if (FeatureMapUtil.isMany(obj, targetFeat)) {
				int index = 0;
				for (Object o: MyEcoreUtil.getAsCollection(obj, targetFeat)) {
					if (Objects.equal(o, src)) {
						potentialFixChanges.addFixingAction(priority, new FixedReplaceConstantChangeType<>(resource.getResource(),obj,targetFeat,
								index,
								ParameterType.equalProbability(String.class,IteratorUtils.buildList(algo.getMainIteratorString(),100))));
					}
					++index;
				}
				return true;
			} else {
				potentialFixChanges.addFixingAction(priority, new FixedSetConstantChangeType<>(resource.getResource(),obj,targetFeat,
						ParameterType.equalProbability(String.class,IteratorUtils.buildList(algo.getMainIteratorString(),100))));
			}
		}
		return true;
	}

	@Override
	public int getBasePriority() {
		return FixingActionGenerator.DIRECT_FIX_PRIORITY;
	}

}
