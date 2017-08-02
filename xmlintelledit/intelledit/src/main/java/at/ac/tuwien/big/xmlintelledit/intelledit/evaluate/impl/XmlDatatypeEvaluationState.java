package at.ac.tuwien.big.xmlintelledit.intelledit.evaluate.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

import at.ac.tuwien.big.xmlintelledit.intelledit.change.ParameterType;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.basic.FixedReplaceConstantChangeType;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.basic.FixedSetConstantChangeType;
import at.ac.tuwien.big.xmlintelledit.intelledit.evaluate.EvaluationState;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.FixAttempt;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.impl.MakeConformRegexpImpl;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.EvalResult;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.FixAttemptFeatureReferenceImpl;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.FixingActionGenerator;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.SimpleResult;
import at.ac.tuwien.big.xmlintelledit.intelledit.simpleregexp.RegExpAlgorithm;
import at.ac.tuwien.big.xtext.util.MyEcoreUtil;
import dk.brics.automaton.Automaton;

public class XmlDatatypeEvaluationState implements EvaluationState<XmlDatatypeEvaluationState> {
	
	private EObject context;
	private EAttribute attr;
	private Automaton automaton;
	private XmlDatatypeEvaluable evaluable;
	

	public XmlDatatypeEvaluationState(XmlDatatypeEvaluable evaluable, EObject obj, EAttribute attr, Automaton automaton) {
		this.context = obj;
		this.attr = attr;
		this.automaton = automaton;
		this.evaluable = evaluable;
	}
	
	private EvalResult result;
	private double quality;

	@Override
	public void initParam() {
	}


	@Override
	public void reuseParam(XmlDatatypeEvaluationState from) {
	}


	@Override
	public Boolean evaluateBasic() {
		for (Object o: MyEcoreUtil.getAsCollection(context, attr)) {
			if (!automaton.run(String.valueOf(o))) {
				return false;
			}
		}
		return true;
	}


	@Override
	public Object evaluateFull() {
		return getResult().getResult();
	}


	@Override
	public EvalResult getResult() {

		if (result == null) {
			result = new SimpleResult(automaton);
			Collection c = MyEcoreUtil.getAsCollection(context, attr);
			if (c.isEmpty()) {
				quality = 1.0;
				result.setResult(true);
				return result;
			} else {
				boolean isMany = FeatureMapUtil.isMany(context, attr);
				int index = 0;
				double correct = 0;
				boolean allCorrect = true;
				for (Object o: c) {
					boolean subResult = automaton.run(String.valueOf(o));
					if (!subResult) {
						RegExpAlgorithm algo = new RegExpAlgorithm(String.valueOf(o), automaton);
						correct+= algo.getQuality();
						
						FixAttempt fix = new MakeConformRegexpImpl(automaton, evaluable.getDatatype());
						result.addPossibleFix(fix);
						
						FixAttemptFeatureReferenceImpl fref = isMany?new FixAttemptFeatureReferenceImpl(context, attr, index):new FixAttemptFeatureReferenceImpl(context, attr);
						result.getFixAttemptReferenceInfo().addFixAttemptReference(fref, new EvaluableReferenceImpl<>(evaluable),
								fix);
						List<String> readList = new ArrayList<>(100);
						{
							int i = 0;
							for (String str: algo.getAllStrings()) {
								readList.add(str);
								if (++i >= 100) {break;}
							}
						}
						if (isMany) {
							result.addPossibleFixingActions(Arrays.asList(
								new FixedReplaceConstantChangeType(context.eResource(),
										context, attr, index, ParameterType.equalProbability(String.class,
												readList))),FixingActionGenerator.DIRECT_FIX_PRIORITY);
						} else {
							result.addPossibleFixingActions(Arrays.asList(
									new FixedSetConstantChangeType(context.eResource(),
											context, attr, ParameterType.equalProbability(String.class,
													readList))),FixingActionGenerator.DIRECT_FIX_PRIORITY);
						}
						
						allCorrect = false;
					} else {
						correct+=1.0;
					}
					++index;
				}
				result.setResult(allCorrect);
				quality = correct/index;
			
			}
		}
		return result;
	}


	@Override
	public double getQuality() {
		getResult();
		return quality;
	}

}
