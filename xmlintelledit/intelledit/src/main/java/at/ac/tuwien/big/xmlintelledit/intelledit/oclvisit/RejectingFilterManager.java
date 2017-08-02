package at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import at.ac.tuwien.big.xmlintelledit.intelledit.ecore.util.MyResource;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.FixAttempt;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.impl.ChangeSomethingImpl;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.impl.MakeTrueImpl;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.fixinggenerators.AllInstancesAttemptReferenceAdder;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.fixinggenerators.ApplyAllInstancesChanges;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.fixinggenerators.ApplyAnyAllInstancesChanges;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.fixinggenerators.ApplyChangePropertyCallChanges;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.fixinggenerators.ApplyFixRegexpChanges;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.fixinggenerators.ApplyMakeEqualChanges;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.fixinggenerators.BasicEqualOpQualityCalculator;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.fixinggenerators.BasicQualityCalculator;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.fixinggenerators.BooleanOpQualityCalculator;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.fixinggenerators.FakeIdentityExpressions;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.fixinggenerators.FixRegexpChanges;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.fixinggenerators.NumberToSetPropagation;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.fixinggenerators.PropagateBooleanChanges;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.fixinggenerators.PropagateCollectChanges;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.fixinggenerators.PropagateEqualChanges;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.fixinggenerators.PropagateIfChanges;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.fixinggenerators.PropagateIteratorChanges;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.fixinggenerators.PropagatePropertyCallExp;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.fixinggenerators.PropagateSetChanges;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.fixinggenerators.PropagateSetRelationChanges;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.fixinggenerators.PropagateSmallerNumberChanges;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.fixinggenerators.PropagateSumChanges;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.fixinggenerators.PropagateUnknownChange;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.fixinggenerators.PropertyCallAttemptReferenceAdder;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.fixinggenerators.SelectMoreOrLessChange;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.fixinggenerators.StringEqualityQualityCalculator;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.fixinggenerators.SwallowSelfChange;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.impl.FixActionMapImpl;
import at.ac.tuwien.big.xtext.util.IteratorUtils;

public class RejectingFilterManager {
	
	private List<RejectingFilter<?, ?>> rejectingFilters = new ArrayList<RejectingFilter<?,?>>();
	private Map<Class<?>,Map<String,List<RejectingFilter<?, ?>>>> rejectingFiltersByClass = new HashMap<>();
	
	private List<ObjectCollector<?, ?>> collectors = new ArrayList<ObjectCollector<?,?>>();
	private Map<Class<?>,Map<String,List<ObjectCollector<?, ?>>>> collectorsByClass = new HashMap<>();
	
	private List<FixingGenerator<?, ?>> fixingGenerators = new ArrayList<>();
	private Map<Class<?>,Map<String,List<FixingGenerator<?, ?>>>> fixingGeneratorsByClass = new HashMap<>();
	
	private List<FixingActionGenerator<?, ?>> fixingActionGenerators = new ArrayList<>();
	private Map<Class<?>,Map<String,List<FixingActionGenerator<?, ?>>>> fixingActionGeneratorsByClass = new HashMap<>();
	
	private List<QualityCalculator<?, ?>> qualityCalculators = new ArrayList<>();
	private Map<Class<?>,Map<String,List<QualityCalculator<?, ?>>>> qualityCalculatorsByClass = new HashMap<>();

	private List<FixAttemptReferenceAdder<?, ?>> attemptRefAdders = new ArrayList<>();
	private Map<Class<?>,Map<String,List<FixAttemptReferenceAdder<?, ?>>>> attemptRefAddersByClass = new HashMap<>();

	
	public<U extends SelectiveEvaluator<?, ?>> Map<String,List<U>> knowExpressionClass(Class<?> cl, Map<Class<?>,Map<String,List<U>>> map, List<U> base) {
		Map<String,List<U>> ret = map.get(cl);
		if (ret == null) {
			Map<String,List<U>> filters = new HashMap<>();
			for (U f: base) {
				if (f.getFilterClass() == null || (cl != null && f.getFilterClass().isAssignableFrom(cl))) {
					List<U> filterList = filters.get(f.getRequiredName());
					if (filterList == null) {
						filters.put(f.getRequiredName(), filterList = new ArrayList<>());
					}
					filterList.add(f);
				}
			}
			map.put(cl,ret = filters);
		}
		return ret;
	}
	
	public void initDefault() {
		addFixingActionGenerator(ApplyAllInstancesChanges.INSTANCE);
		addFixingActionGenerator(ApplyMakeEqualChanges.INSTANCE);
		addFixingActionGenerator(ApplyFixRegexpChanges.INSTANCE);
		addFixingActionGenerator(ApplyAnyAllInstancesChanges.INSTANCE);
		addFixingActionGenerator(ApplyChangePropertyCallChanges.INSTANCE);
		addFixingGenerators(FakeIdentityExpressions.INSTANCES);
		addFixingGenerator(PropagateSetChanges.INTERSECTION);
		addFixingGenerator(PropagateSetChanges.UNION);
		addFixingGenerator(PropagateSetChanges.MINUS);
		addFixingGenerators(PropagateSetRelationChanges.INSTANCES);
		addFixingGenerator(NumberToSetPropagation.INSTANCE);
		addFixingGenerator(PropagateBooleanChanges.INSTANCE);
		addFixingGenerator(FixRegexpChanges.INSTANCE);
		
		addFixingGenerator(PropagateEqualChanges.EQUAL);
		addFixingGenerator(PropagateIfChanges.INSTANCE);
		addFixingGenerator(PropagateEqualChanges.UNEQUAL);
		addFixingGenerator(PropagateSumChanges.INSTANCE);;
		addFixingGenerator(PropagateCollectChanges.INSTANCE);
		addFixingGenerator(PropagateIteratorChanges.EXISTS);
		addFixingGenerator(PropagateIteratorChanges.FORALL);
		addFixingGenerator(PropagatePropertyCallExp.INSTANCE);
		addFixingGenerator(PropagateSmallerNumberChanges.GREATER);
		addFixingGenerator(PropagateSmallerNumberChanges.GREATEREQUAL);
		addFixingGenerator(PropagateSmallerNumberChanges.SMALLER);
		addFixingGenerator(PropagateSmallerNumberChanges.SMALLEREQUAL);
		addFixingGenerator(SwallowSelfChange.INSTANCE);
		addFixingGenerator(SelectMoreOrLessChange.INSTANCE);
		addFixingGenerator(PropagateUnknownChange.INSTANCE);
		addQualityCalculator(BasicQualityCalculator.INSTANCE);
		addQualityCalculator(StringEqualityQualityCalculator.LEVENTHSTEIN);
		addQualityCalculator(BasicEqualOpQualityCalculator.INSTANCE);
		addQualityCalculator(BooleanOpQualityCalculator.INSTANCE);
		addFixAttemptReferenceAdder(AllInstancesAttemptReferenceAdder.INSTANCE);
		addFixAttemptReferenceAdder(PropertyCallAttemptReferenceAdder.INSTANCE);
	}
	
	public Map<String,List<RejectingFilter<?, ?>>> knownExpresionClassFilters(Class<?> cl) {
		return knowExpressionClass(cl, rejectingFiltersByClass, rejectingFilters);
	}
	
	public Map<String,List<FixingGenerator<?, ?>>> knownExpresionClassFixingGenerators(Class<?> cl) {
		return knowExpressionClass(cl, fixingGeneratorsByClass, fixingGenerators);
	}

	public Map<String,List<FixingActionGenerator<?, ?>>> knownExpresionClassFixingActionGenerators(Class<?> cl) {
		return knowExpressionClass(cl, fixingActionGeneratorsByClass, fixingActionGenerators);
	}
	
	public Map<String,List<ObjectCollector<?, ?>>> knownExpresionClassCollectors(Class<?> cl) {
		return knowExpressionClass(cl, collectorsByClass, collectors);
	}

	
	public Map<String,List<QualityCalculator<?, ?>>> knownQualityCalculators(Class<?> cl) {
		return knowExpressionClass(cl, qualityCalculatorsByClass, qualityCalculators);
	}
	

	public Map<String,List<FixAttemptReferenceAdder<?, ?>>> knownReferenceAdders(Class<?> cl) {
		return knowExpressionClass(cl, this.attemptRefAddersByClass, attemptRefAdders);
	}
	
	public Iterable<RejectingFilter<?, ?>> getPotentialFilters(Class<?> oclexprcl, String name) {
		Map<String,List<RejectingFilter<?, ?>>> map = knownExpresionClassFilters(oclexprcl);
		if (name == null) {
			return map.getOrDefault(null, Collections.emptyList());
		}
		return IteratorUtils.shallowUnion(map.getOrDefault(name, Collections.emptyList()),map.getOrDefault(null, Collections.emptyList()));
	}
	
	public Iterable<FixingGenerator<?, ?>> getPotentialFixingGenerators(Class<?> oclexprcl, String name) {
		Map<String,List<FixingGenerator<?, ?>>> map = knownExpresionClassFixingGenerators(oclexprcl);
		if (name == null) {
			return map.getOrDefault(null, Collections.emptyList());
		}
		return IteratorUtils.shallowUnion(map.getOrDefault(name, Collections.emptyList()),map.getOrDefault(null, Collections.emptyList()));
	}
	
	public Iterable<FixingActionGenerator<?, ?>> getPotentialFixingActionGenerators(Class<?> oclexprcl, String name) {
		Map<String,List<FixingActionGenerator<?, ?>>> map = knownExpresionClassFixingActionGenerators(oclexprcl);
		if (name == null) {
			return map.getOrDefault(null, Collections.emptyList());
		}
		return IteratorUtils.shallowUnion(map.getOrDefault(name, Collections.emptyList()),map.getOrDefault(null, Collections.emptyList()));
	}
	

	public Iterable<ObjectCollector<?, ?>> getPotentialCollectors(Class<?> oclexprcl, String name) {
		Map<String,List<ObjectCollector<?, ?>>> map = knownExpresionClassCollectors(oclexprcl);
		if (name == null) {
			return map.getOrDefault(null, Collections.emptyList());
		}
		return IteratorUtils.shallowUnion(map.getOrDefault(name, Collections.emptyList()),map.getOrDefault(null, Collections.emptyList()));
	}

	public Iterable<QualityCalculator<?, ?>> getPotentialQualityCalculators(Class<?> oclexprcl, String name) {
		Map<String,List<QualityCalculator<?, ?>>> map = knownQualityCalculators(oclexprcl);
		if (name == null) {
			return map.getOrDefault(null, Collections.emptyList());
		}
		return IteratorUtils.shallowUnion(map.getOrDefault(name, Collections.emptyList()),map.getOrDefault(null, Collections.emptyList()));
	}

	public Iterable<FixAttemptReferenceAdder<?, ?>> getPotentialAttemptReferenceAdders(Class<?> oclexprcl, String name) {
		Map<String,List<FixAttemptReferenceAdder<?, ?>>> map = knownReferenceAdders(oclexprcl);
		if (name == null) {
			return map.getOrDefault(null, Collections.emptyList());
		}
		return IteratorUtils.shallowUnion(map.getOrDefault(name, Collections.emptyList()),map.getOrDefault(null, Collections.emptyList()));
	}

	
	public static final boolean[] EMPTY_BOOLEAN = new boolean[]{}; 
	
	public boolean[] getRejected(EvalResult result)  {
		if (result instanceof ExpressionResult) {
			ExpressionResult exprRes = (ExpressionResult)result;
			boolean[] base = new boolean[exprRes.getSubResults().size()];
			String name = exprRes.getExpressionName();
			Object resultValue = result.getResult();
			Class<?> resultClass = (resultValue==null)?null:resultValue.getClass();
			for (RejectingFilter<?, ?> filter: getPotentialFilters(exprRes.getExpression().getClass(), name)) {
				if (resultClass == null) {
					if (!filter.acceptNullResult()) {
						continue;
					}
				} else {
					if (filter.getResultClass() != null && (resultClass == null || !filter.getResultClass().isAssignableFrom(resultClass))) {
						continue;
					}
				}
				//filter should accept it
				((RejectingFilter)filter).addReject(exprRes.getExpression(), resultValue, exprRes.getSubResults(), base);
			}
			return base;
		} else {
			return EMPTY_BOOLEAN;
		}
		
	}
	
	public void calculateFixes(EvalResult result)  {
		if (result.getPossibleFixes().isEmpty()) {
			return;
		}
		Map<FixAttempt,Boolean> handledFixes = new HashMap<FixAttempt, Boolean>();
		for (FixAttempt att: result.getPossibleFixes()) {
			handledFixes.put(att, false);
		}
		if (result instanceof ExpressionResult) {
			ExpressionResult exprRes = (ExpressionResult)result;
			Collection<FixAttempt>[] base = new Collection[exprRes.getSubResults().size()];
			for (int i = 0; i < base.length; ++i) {
				base[i] = new HashSet<FixAttempt>();
			}
			String name = exprRes.getExpressionName();
			Object resultValue = result.getResult();
			Class<?> resultClass = (resultValue==null)?null:resultValue.getClass();
			for (FixingGenerator<?, ?> filter: getPotentialFixingGenerators(exprRes.getExpression().getClass(), name)) {
				if (resultClass == null) {
					if (!filter.acceptNullResult()) {
						continue;
					}
				} else {
					if (filter.getResultClass() != null && !filter.getResultClass().isAssignableFrom(resultClass)) {
						continue;
					}
				}
				//filter should accept it
				((FixingGenerator)filter).addFixingPossibilities(handledFixes,exprRes,base);
			}
			boolean hasUnhandledFix = false;
			for (Boolean attemptSuccessful: handledFixes.values()) {
				if (!attemptSuccessful) {
					hasUnhandledFix = true;
				}
			}
			
			for (int i = 0; i < base.length; ++i) {
				EvalResult subRes = exprRes.getSubResults().get(i);
				if (subRes != null) {
					if (hasUnhandledFix) {
						subRes.addPossibleFixes(Collections.singleton(ChangeSomethingImpl.INSTANCE));
					}
					subRes.addPossibleFixes(base[i]);
					calculateFixes(subRes);
				}
			}
		}
	}
	
	
	public void calculateFixingActions(MyResource res, EvalResult result, int treepriority)  {
		try {
			if (result == null || result.getPossibleFixes().isEmpty()) {
				return;
			}
			FixActionMap base = new FixActionMapImpl();
			String name = null;
			Class<?> expressionClass = null;
			if (result instanceof ExpressionResult) {
				name = ((ExpressionResult) result).getExpressionName();
				expressionClass = ((ExpressionResult)result).getExpression().getClass();
			}
			Object resultValue = result.getResult();
			Class<?> resultClass = (resultValue==null)?null:resultValue.getClass();
			Iterable<FixingActionGenerator<?, ?>> iterable;
			
			for (FixingActionGenerator<?, ?> filter: getPotentialFixingActionGenerators(expressionClass, name)) {
				if (resultClass == null) {
					if (!filter.acceptNullResult()) {
						continue;
					}
				} else {
					if (filter.getResultClass() != null && !filter.getResultClass().isAssignableFrom(resultClass)) {
						continue;
					}
				}
				//filter should accept it
				((FixingActionGenerator)filter).addFixingPossibilities(res, result.getPossibleFixes(),result,treepriority,base);
			}
			result.addPossibleFixingActions(base);
		} finally {
			try {
				for (EvalResult sub: result.getSubResults()) {
					calculateFixingActions(res, sub, treepriority-1);
				}
			} catch (Exception e) {
				 e.printStackTrace();
			 }
		}
		
	}
	

	
	public void collect(EvalResult result, ObjectCollection collection)  {
		try {
			if (result == null || result.getPossibleFixes().isEmpty()) {
				return;
			}
			String name = null;
			Class<?> expressionClass = null;
			if (result instanceof ExpressionResult) {
				name = ((ExpressionResult) result).getExpressionName();
				expressionClass = ((ExpressionResult)result).getExpression().getClass();
			}
			Object resultValue = result.getResult();
			Class<?> resultClass = (resultValue==null)?null:resultValue.getClass();
			for (ObjectCollector<?, ?> filter: getPotentialCollectors(expressionClass, name)) {
				if (resultClass == null) {
					if (!filter.acceptNullResult()) {
						continue;
					}
				} else {
					if (filter.getResultClass() != null && !filter.getResultClass().isAssignableFrom(resultClass)) {
						continue;
					}
				}
				//filter should accept it
				((ObjectCollector)filter).collect(result, collection);
			}
		} finally {
			for (EvalResult sub: result.getSubResults()) {
				collect(sub, collection);
			}
		}
		
	}
	
	private<T extends SelectiveEvaluator<?,?>> void addToMap(T evaluator, Map<Class<?>, Map<String, List<T>>> map) {
		//TODO: Das passt schon so, dass es nichts macht ... vielleicht später ändern
	}
	
	public void addQualityCalculator(QualityCalculator<?, ?> filter) {
		qualityCalculators.add(filter);
		addToMap(filter,qualityCalculatorsByClass);
	}
	
	
	public void addFilter(RejectingFilter<?, ?> filter) {
		rejectingFilters.add(filter);
		addToMap(filter,rejectingFiltersByClass);
	}
	
	public void addFixingGenerators(FixingGenerator<?, ?>... generators) {
		for (int i = 0; i < generators.length; ++i) {
			addFixingGenerator(generators[i]);
		}
	}
	
	public void addFixingGenerator(FixingGenerator<?, ?> generator) {
		fixingGenerators.add(generator);
		addToMap(generator,fixingGeneratorsByClass);
	}
	
	public void addCollector(ObjectCollector<?, ?> collector) {
		collectors.add(collector);
		addToMap(collector,collectorsByClass);
	}
	
	public void addFixingActionGenerator(FixingActionGenerator<?, ?> generator) {
		fixingActionGenerators.add(generator);
		addToMap(generator, fixingActionGeneratorsByClass);
	}
	
	public void addFixAttemptReferenceAdder(FixAttemptReferenceAdder<?, ?> adder) {
		this.attemptRefAdders.add(adder);
		addToMap(adder, attemptRefAddersByClass);
	}
	
	
	public void reduce(EvalResult anyres) {
		if (anyres instanceof ExpressionResult) {
			ExpressionResult res = (ExpressionResult)anyres;
			boolean[] rejected = getRejected(res);
			{
				for (int i = 0; i < res.getSubResults().size(); ++i) {
					if (rejected[i]) {
						res.getSubResults().set(i, null);
					} else {
						EvalResult subResult = res.getSubResults().get(i);
						if (subResult != null) {
							reduce(subResult);
						}
					}
				}
			}
		}
	}
	
	private ObjectCollection objectCollection = new ObjectCollection();
	
	public ObjectCollection getObjectCollection() {
		return objectCollection;
	}
	
	public void calculateEverything(MyResource res, EvalResult forResult) {
		calculateEverything(res, forResult, MakeTrueImpl.INSTANCE);
	}
	
	public void calculateEverything(MyResource res, EvalResult forResult, FixAttempt fixAttempt) {
		if (fixAttempt != null) {
			forResult.addPossibleFix(fixAttempt);
		}
		calculateFixes(forResult);
		reduce(forResult);
		calculateFixingActions(res, forResult,-1);
		collect(forResult, objectCollection);
		calculateFixAttemptReferences(res, forResult);
	}



	public void calculateFixAttemptReferences(MyResource res, EvalResult evalResult) {
		if (evalResult instanceof ExpressionResult) {
			ExpressionResult eres = (ExpressionResult)evalResult;
			if (eres.isOk()) {
				return;
			}
			for (EvalResult subr: eres.getSubResults()) {
				calculateFixAttemptReferences(res, subr);
			}
		} 



		String name = null;
		Class<?> expressionClass = null;
		if (evalResult instanceof ExpressionResult) {
			name = ((ExpressionResult) evalResult).getExpressionName();
			expressionClass = ((ExpressionResult)evalResult).getExpression().getClass();
		}
		Object resultValue = evalResult.getResult();
		Class<?> resultClass = (resultValue==null)?null:resultValue.getClass();
		for (FixAttemptReferenceAdder<?, ?> filter: getPotentialAttemptReferenceAdders(expressionClass, name)) {
			if (resultClass == null) {
				if (!filter.acceptNullResult()) {
					continue;
				}
			} else {
				if (filter.getResultClass() != null && !filter.getResultClass().isAssignableFrom(resultClass)) {
					continue;
				}
			}
			//filter should accept it
			((FixAttemptReferenceAdder)filter).addFixAttemptReferences(res, evalResult, this);
		}
		
	}
	
	
	public Double calculateSingleQuality(EvalResult evalResult, FixAttempt attempt) {
		if (evalResult instanceof ExpressionResult) {
			ExpressionResult eres = (ExpressionResult)evalResult;
			if (eres.isOk()) {
				return 1.0;
			}
		}

		String name = null;
		Class<?> expressionClass = null;
		if (evalResult instanceof ExpressionResult) {
			name = ((ExpressionResult) evalResult).getExpressionName();
			expressionClass = ((ExpressionResult)evalResult).getExpression().getClass();
		}
		Object resultValue = evalResult.getResult();
		Class<?> resultClass = (resultValue==null)?null:resultValue.getClass();
		double ret = 0.0;
		for (QualityCalculator<?, ?> filter: getPotentialQualityCalculators(expressionClass, name)) {
			if (resultClass == null && !filter.acceptNullResult()) {
				continue;
			}
			if (filter.getResultClass() != null && (resultClass == null || !filter.getResultClass().isAssignableFrom(resultClass))) {
				continue;
			}
			Double quality = filter.getQualityCalculation(attempt, evalResult, this);
			if (quality != null) {
				ret = Math.max(ret,quality);
			}
		}
		return ret;
	}
	
	

}
