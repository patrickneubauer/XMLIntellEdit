package at.ac.tuwien.big.xmlintelledit.intelledit.search.local.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import at.ac.tuwien.big.xmlintelledit.intelledit.change.Change;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.Undoer;
import at.ac.tuwien.big.xmlintelledit.intelledit.ecore.util.MyResource;
import at.ac.tuwien.big.xmlintelledit.intelledit.evaluate.Evaluable;
import at.ac.tuwien.big.xmlintelledit.intelledit.evaluate.EvaluableManager;
import at.ac.tuwien.big.xmlintelledit.intelledit.evaluate.EvaluationState;
import at.ac.tuwien.big.xmlintelledit.intelledit.evaluate.impl.EvaluableManagerImpl;
import at.ac.tuwien.big.xmlintelledit.intelledit.evaluate.impl.MultiplicityEvaluable;
import at.ac.tuwien.big.xmlintelledit.intelledit.evaluate.impl.OCLExpressionEvaluable;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.FixAttempt;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.SetAdd;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.SetAddAny;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.SetRemove;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.SetRemoveAny;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.EvalResult;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.FixAttemptFeatureReferenceImpl;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.FixAttemptReference;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.FixAttemptReferenceImpl;
import at.ac.tuwien.big.xmlintelledit.intelledit.transfer.EcoreTransferFunction;
import at.ac.tuwien.big.xtext.util.MyEcoreUtil;

public class ViolatedConstraintsEvaluator implements ResourceEvaluator<Evaluation>{

	
	public static final int GRAMMAR_ERRORS = 8;

	@Override
	/**
	 * First -violated constraints currently, costs, resolved constraints, removed violations, removed fulfilled, added constraints, added fulfilled, invalidated constraints
	 */
	public double[] evaluate(Change<?> ch, Evaluation ref) {
		Resource res = ch.forResource();
		MyResource myres = ch.forMyResource();
		//Validate ...
		EvaluableManager man = new EvaluableManagerImpl();
		Map extents = null;
		Map<Object, Map<Evaluable<?, ?>, Double>> curEvaluation = ref.eval;
		double resolvedViolations = 0.0;
		double removedViolations = 0.0;
		double addedViolations = 0.0;
		double wrongifyedViolations = 0.0;
		double removedFulfilled = 0.0;
		double addedFulfilled = 0.0;
		double grammarProblemsIntroduced = 0.0;
		Map<EAttribute,Map<Object,Set<Object>>> idOccurrences = ref.ids;
		synchronized(ref) {
			if (curEvaluation == null) {			
				curEvaluation = ref.eval = new HashMap<Object, Map<Evaluable<?,?>,Double>>();
				idOccurrences = ref.ids = new HashMap<EAttribute, Map<Object,Set<Object>>>();
			MyResource res_;
				
			
				for (EObject obj: myres.iterateAllContents()) {
					if (obj == null || obj.eClass() == null) {
						continue;
					}
					EClass curCl = obj.eClass();
					EAttribute idAttr = curCl.getEIDAttribute();
					if (idAttr != null) {
						Map<Object,Set<Object>> curMap = idOccurrences.get(idAttr);
						if (curMap == null) {
							idOccurrences.put(idAttr, curMap = new HashMap<>());
						}
						Object id = obj.eGet(idAttr);
						if (id != null) {
							Set<Object> curObjs = curMap.get(id);
							if (curObjs == null) {
								curMap.put(id, curObjs = new HashSet<Object>());
							}
							curObjs.add(obj);
						}
					}
					Collection<Evaluable<?, ?>> evalcol = myres.getApplicableEvaluators(obj);
					Map<Evaluable<?, ?>, Double> emap = new HashMap<>();
					curEvaluation.put(obj, emap);
					for (Evaluable expr: evalcol) {
						
						EvaluationState state = man.basicEvaluate(myres, expr, obj);
						if (state.getBasicResult() instanceof Boolean && ((Boolean)state.getBasicResult())) {
							emap.put(expr,1.0);
							continue;
						}
						state = man.fullEvaluate(myres, expr, obj);
						EvalResult evalRes = state.getResult();
						double q = state.getQuality();
						emap.put(expr, q);
						
					}
				}
			}
		}
		Map<Object, Map<Evaluable<?,?>, Double>> remaining = new HashMap<>(curEvaluation);
		Map<EAttribute,Map<Object,Set<Object>>> newidOccurrences = ref.ids;
		Resource[] resObj = new Resource[1];
		EcoreTransferFunction clonedFunc = ch.forMyResource().cloneFunc(resObj);
		Undoer undoer = ch.execute();
		double costs = ch.getCosts();
		double ret = 0.0;
		try {
			int haveContainer = 0;
			for (EObject obj: myres.iterateAllContents()) {
				if (obj == null || obj.eClass() == null) {
					continue;
				}
				if (obj.eContainer() == null) {
					++haveContainer;
				}
				
				EClass curCl = obj.eClass();
				EAttribute idAttr = curCl.getEIDAttribute();
				if (idAttr != null) {
					Map<Object,Set<Object>> curMap = newidOccurrences.get(idAttr);
					if (curMap == null) {
						newidOccurrences.put(idAttr, curMap = new HashMap<>());
					}
					Object id = obj.eGet(idAttr);
					if (id != null) {
						Set<Object> curObjs = curMap.get(id);
						if (curObjs == null) {
							curMap.put(id, curObjs = new HashSet<Object>());
						}
						curObjs.add(obj);
					}
				}
				Collection<Evaluable<?, ?>> evalcol = myres.getApplicableEvaluators(obj);
				Map<Evaluable<?, ?>, Double> emap =  curEvaluation.getOrDefault(obj,Collections.emptyMap());
				Map<Evaluable<?, ?>, Double> subremaining = new HashMap<>(remaining.getOrDefault(obj, Collections.emptyMap())); 
				for (Evaluable expr: evalcol) {
					Double cur = emap.get(expr);
					subremaining.remove(expr);
					EvaluationState state = man.basicEvaluate(myres, expr, obj);
					if (state.getBasicResult() instanceof Boolean && ((Boolean)state.getBasicResult())) {
						
						if (cur == null) {
							addedFulfilled+= 1.0;
						} else {
							resolvedViolations+= 1.0-cur;
						}
						continue;
					}
					state = man.fullEvaluate(myres, expr, obj);
					EvalResult evalRes = state.getResult();
					double q = state.getQuality();
					if (q  > 1.0) {
						System.err.println("Strange quality ...");
						q = 1.0;
					}
					ret+= 1.0-q;
					if (q < 1.0 && (cur == null || q < cur )) {
						if (expr instanceof MultiplicityEvaluable) {
							boolean isAdd = false;
							boolean isRemove = false;
							for (FixAttempt at: state.getResult().getPossibleFixes()) {
								if (at instanceof SetAddAny || at instanceof SetAdd) { 
									isAdd = true;
								}
								if (at instanceof SetRemoveAny || at instanceof SetRemove) {
									isRemove = true;
								}
							}
							if (isAdd) {
								grammarProblemsIntroduced+= 1.0-q;
							}
						}
					}
					if (cur == null) {
						addedViolations+= 1.0-q;
						addedFulfilled+= q;
					} else {
						if (cur > q) {
							//Quality now less --> bad
							wrongifyedViolations+= cur-q;
						} else {
							//Quality now better or equal --> good or ok
							resolvedViolations+= q-cur;
						}
					}
				}
				for (Double d: subremaining.values()) {
					removedViolations+= 1.0-d;
					removedFulfilled+= d;
				}
				remaining.remove(obj);
			}
			for (Map<Evaluable<?,?>,Double> map: remaining.values()) {
				for (Double q: map.values()) {
					removedViolations+= 1.0-q;
					removedFulfilled+= q;
				}
			}
			if (haveContainer == 0) {
				//No container - great problem!
				ret+= 99999999.0E10;
				grammarProblemsIntroduced+=1.0;
				resolvedViolations-=1.0E10;
			} else {
				ret+= haveContainer-1;
			}
		} finally {
			undoer.undo();
		}
		if (!ch.forMyResource().equalsTarget(clonedFunc)) {
			System.out.println(ch.forMyResource().getResource() + " VS "+clonedFunc.forwardResource()+" VS "+clonedFunc.backResource()+"!");
			ch.forMyResource().equalsTarget(clonedFunc);
			throw new RuntimeException();
		}
		Map<Object,Integer> oldviolationCount = new HashMap<Object, Integer>();
		Map<Object,Integer> newviolationCount = new HashMap<Object, Integer>();
		int removedIdViolations = 0;
		for (Entry<EAttribute, Map<Object, Set<Object>>> entry: idOccurrences.entrySet()) {
			for (Entry<Object,Set<Object>> entry2: entry.getValue().entrySet()) {
				if (entry2.getValue().size() > 1) {
					Set<Object> withoutRemoved = new HashSet<Object>(entry2.getValue());
					withoutRemoved.removeAll(remaining.keySet());
					for (Object o: entry2.getValue()) {
						oldviolationCount.put(o, oldviolationCount.getOrDefault(o, 0)+1);
					}
					if (withoutRemoved.size() > 1) {
						removedIdViolations+= entry2.getValue().size()-withoutRemoved.size();
					} else {
						removedIdViolations+= entry2.getValue().size();
					}
				}
			}
		}

		int addedIdViolations = 0;
		for (Entry<EAttribute, Map<Object, Set<Object>>> entry: newidOccurrences.entrySet()) {
			for (Entry<Object,Set<Object>> entry2: entry.getValue().entrySet()) {
				if (entry2.getValue().size() > 1) {
					Set<Object> withoutAdded = new HashSet<Object>(entry2.getValue());
					withoutAdded.retainAll(curEvaluation.keySet());
					
					for (Object o: entry2.getValue()) {
						newviolationCount.put(o, newviolationCount.getOrDefault(o, 0)+1);
					}
					if (withoutAdded.size() != entry2.getValue().size()) {
						if (withoutAdded.size() > 1) {
							addedIdViolations+= entry2.getValue().size()-withoutAdded.size();
						} else {
							addedIdViolations+= entry2.getValue().size();
						}
					}
				}
					
			}
		}
		int resolvedOrRemovedId = 0;
		int introducedOrAddedId = 0;
		for (Entry<Object, Integer> entry: oldviolationCount.entrySet()) {
			Integer newC = newviolationCount.getOrDefault(entry.getKey(),0);
			if (newC > entry.getValue()) {
				introducedOrAddedId+= newC-entry.getValue();
			} else {
				resolvedOrRemovedId+= entry.getValue()-newC;
			}
		}
		int haveIdViolations = 0;
		for (Entry<Object, Integer> entry: newviolationCount.entrySet()) {
			if (oldviolationCount.containsKey(entry.getKey())) {continue;}
			introducedOrAddedId+= entry.getValue();
			haveIdViolations+= entry.getValue();
		}
		int resolvedId = resolvedOrRemovedId-removedIdViolations;
		int introducedId = introducedOrAddedId-addedIdViolations;
		resolvedViolations+= resolvedId;
		removedViolations+= removedIdViolations;
		addedViolations+= addedIdViolations;
		wrongifyedViolations+= introducedId;
		ret+= haveIdViolations;
		return new double[]{-ret,costs, resolvedViolations, removedViolations, removedFulfilled, addedViolations, addedFulfilled, wrongifyedViolations, grammarProblemsIntroduced};
	}
	
	public void augmentSet(Set<FixAttemptReference> toAdd) {
		int curSize;
		do {
			curSize = toAdd.size();
			Set<FixAttemptReference> next = new HashSet<FixAttemptReference>();
			for (FixAttemptReference ref: toAdd) {
				if (ref instanceof FixAttemptReferenceImpl) {
					FixAttemptReferenceImpl impl = (FixAttemptReferenceImpl)ref;
					//All set features
					
					EAttribute idAttr = null;
					if (!impl.isCompleteObject()) {
						idAttr = ref.forObject().eClass().getEIDAttribute();
						if (idAttr == null)  {
							EStructuralFeature esf = ref.forObject().eClass().getEStructuralFeature("name");
							if (esf instanceof EAttribute) {
								idAttr = (EAttribute)esf;
							}
						}
					}
					boolean ok = false;
					if (idAttr != null) {
						Collection col = MyEcoreUtil.getAsCollection(ref.forObject(), idAttr);
						if (!col.isEmpty()) {
							ok = true;
							next.add(new FixAttemptFeatureReferenceImpl(ref.forObject(), idAttr));
						}
					} 
					if (!ok) {
						for (EStructuralFeature feat: ref.forObject().eClass().getEAllStructuralFeatures()) {
							Collection col = MyEcoreUtil.getAsCollection(ref.forObject(), feat);
							if (feat instanceof EReference && ((EReference) feat).isContainment()) {
								for (Object o: col) {
									next.add(new FixAttemptReferenceImpl((EObject)o,idAttr==null));
								}
							}
							if (!col.isEmpty()) {
								next.add(new FixAttemptFeatureReferenceImpl(ref.forObject(), feat));
								int ind = 0;
								for (Object o: col) {
									next.add(new FixAttemptFeatureReferenceImpl(ref.forObject(), feat, ind, o));
									++ind;
								}
							}
						}
					}
				} else if (ref instanceof FixAttemptFeatureReferenceImpl) {
					FixAttemptFeatureReferenceImpl fref = (FixAttemptFeatureReferenceImpl)ref;
					if (((FixAttemptFeatureReferenceImpl) ref).getValueIndex() == -1) {
						Object val = ((FixAttemptFeatureReferenceImpl) ref).getValue();
						
						Collection col = MyEcoreUtil.getAsCollection(ref.forObject(), ((FixAttemptFeatureReferenceImpl) ref).getFeature());
						
						if (!col.isEmpty() && !col.contains(val)) {
							int ind = 0;
							for (Object o: col) {
								next.add(new FixAttemptFeatureReferenceImpl(ref.forObject(), ((FixAttemptFeatureReferenceImpl) ref).getFeature(), ind, o));
								++ind;
							}
						} else if (col.contains(val)) {
							int ind = 0;
							for (Object o: col) {
								if (o.equals(val)) {
									next.add(new FixAttemptFeatureReferenceImpl(ref.forObject(), ((FixAttemptFeatureReferenceImpl) ref).getFeature(), ind, o));
								}
								++ind;
							}
						}
					}
					if (fref.getFeature() instanceof EReference && ((EReference) fref.getFeature()).isContainment()) {
						Collection col = MyEcoreUtil.getAsCollection(ref.forObject(), fref.getFeature());
						for (Object o: col) {
							next.add(new FixAttemptReferenceImpl((EObject)o,false));
						}
					}
				}
			}
			toAdd.addAll(next);
		} while (curSize != toAdd.size());
	}

	public boolean calcMyErrorFixAttemptReference(MyResource myres, Set<FixAttemptReference> myAlgorithm, Set<FixAttemptReference> xtextAlgorithm) {
		EvaluableManager man = new EvaluableManagerImpl();
		boolean onlyMultiplicity = true;
		for (EObject obj: myres.iterateAllContents()) {
			Collection<Evaluable<?, ?>> evalcol = myres.getApplicableEvaluators(obj); 
			for (Evaluable expr: evalcol) {
				EvaluationState state = man.fullEvaluate(myres, expr, obj);
				if (state.getBasicResult() instanceof Boolean && ((Boolean)state.getBasicResult())) {
					continue;
				}
				myAlgorithm.addAll(state.getResult().getCompleteReferenceInfo().getFixAttemptReferences());
				if (expr instanceof OCLExpressionEvaluable) {
					xtextAlgorithm.add(new FixAttemptReferenceImpl(obj,true));
					onlyMultiplicity = false;
				} else if (expr instanceof MultiplicityEvaluable){
					xtextAlgorithm.add(new FixAttemptFeatureReferenceImpl(obj, ((MultiplicityEvaluable) expr).getFeature()));
				}
			}
		}
		augmentSet(myAlgorithm);
		augmentSet(xtextAlgorithm);
		return onlyMultiplicity;
	}

}
