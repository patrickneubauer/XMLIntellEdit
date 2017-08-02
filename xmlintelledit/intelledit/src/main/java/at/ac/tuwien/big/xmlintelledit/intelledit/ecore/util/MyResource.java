package at.ac.tuwien.big.xmlintelledit.intelledit.ecore.util;

import java.lang.ref.SoftReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.WeakHashMap;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.ecore.OCL.Helper;
import org.eclipse.ocl.ecore.OCLExpression;
import org.eclipse.ocl.expressions.OperationCallExp;

import at.ac.tuwien.big.xmlintelledit.intelledit.change.ChangeType;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.CostProvider;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.ParameterType;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.basic.CreateObjectChangeType;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.basic.DeleteObjectChangeType;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.basic.EmptyChangeType;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.basic.FixedAddConstantChangeType;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.basic.FixedClearChangeType;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.basic.FixedDeleteConstantChangeType;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.basic.FixedSetConstantChangeType;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.parameter.StaticScopeParameterType;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.primitive.BooleanScope;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.primitive.LogBigIntegerChangeScope;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.primitive.LogBigIntegerScope;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.primitive.LogIntChangeScope;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.primitive.LogIntScope;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.primitive.LogLongChangeScope;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.primitive.LogLongScope;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.primitive.ScopePerValue;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.primitive.StringChangeScope;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.primitive.StringGenScope;
import at.ac.tuwien.big.xmlintelledit.intelledit.evaluate.Evaluable;
import at.ac.tuwien.big.xmlintelledit.intelledit.evaluate.impl.MultiplicityEvaluable;
import at.ac.tuwien.big.xmlintelledit.intelledit.evaluate.impl.OCLExpressionEvaluable;
import at.ac.tuwien.big.xmlintelledit.intelledit.evaluate.impl.XmlDatatypeEvaluable;
import at.ac.tuwien.big.xmlintelledit.intelledit.scope.EqualProbabilityScope;
import at.ac.tuwien.big.xmlintelledit.intelledit.scope.ValueScope;
import at.ac.tuwien.big.xmlintelledit.intelledit.scope.helper.EvalFunc;
import at.ac.tuwien.big.xmlintelledit.intelledit.test.OclExtractor;
import at.ac.tuwien.big.xmlintelledit.intelledit.transfer.EcoreMapTransferFunction;
import at.ac.tuwien.big.xmlintelledit.intelledit.transfer.EcoreTransferFunction;
import at.ac.tuwien.big.xtext.util.IteratorUtils;
import at.ac.tuwien.big.xtext.util.MyEcoreUtil;
import dk.brics.automaton.Automaton;
import dk.brics.automaton.Datatypes;

public class MyResource {
	
	private SoftReference<Resource> res;
	
	public MyResource(Resource from) {
		this.res = new SoftReference<Resource>(from);
		if (from == null) {
			System.out.println("Null resource!");
		}
	}
	
	static {
		
	}
	
	private static boolean loadedautomaton = false;
	
	private static void loadAutomaton() {
		if (!loadedautomaton) {
			synchronized(MyResource.class) {
				if (!loadedautomaton) {
					loadedautomaton = true;
					try {
						Method m = Datatypes.class.getDeclaredMethod("buildAll");
						m.setAccessible(true);
						m.invoke(null);
					} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException
							| SecurityException e) {
						e.printStackTrace();
					} catch (Exception e) {
						System.out.println("TODO: Er kann das nicht vollständig machen, weil er keine Dateien hat ... "+e.getMessage());
					}
				}
			}
		}
	}
	
	private void checkRes(Resource from) {

	}
	
	private static WeakHashMap<Resource, MyResource> hashMaps = new WeakHashMap<Resource, MyResource>();
	
	public static synchronized MyResource get(Resource from) {
		MyResource ret = hashMaps.get(from);
		if (ret == null) {
			hashMaps.put(from, ret = new MyResource(from));
		}
		return ret;
	}
	
	public Resource getResource() {
		return res.get();
	}
	
	private List<EStructuralFeature> feat = null;
	private List<EClass> clsl = null;
	
	
	
	private void calcFeatures(Resource res) {
		synchronized(res) { 
			feat = new ArrayList<EStructuralFeature>();
			clsl = new ArrayList<>();
			TreeIterator<EObject> iter = res.getAllContents();
			while (iter.hasNext()) {
				EObject next = iter.next();
				if (next instanceof EClass) {
					
					EClass storedClass = (EClass)next;
					clsl.add(storedClass);
					feat.addAll(storedClass.getEStructuralFeatures());
					if (feat.contains(null)) {
						System.out.println("Why does an EClass contain null feature?!");
					}
				}
			}
		}
	}
	
	public void knowEcore(Resource ecoreRes) {
		calcFeatures(ecoreRes);
	}
	
	public synchronized List<EStructuralFeature> getAllFeatures() {
		if (feat == null) {
				List<EObject> allInst = getAllInstances(null);
				for (EObject obj: allInst) {
					if (obj.eClass() != null) {
						EClass cl = obj.eClass();
						calcFeatures(cl.eResource());
						return feat;
					}
				}
				System.err.println("Have no (suitable?) available object ...");
				return Collections.emptyList();
			
		}
		return feat;
	}
	
	public synchronized  List<EClass> getAllClasses() {
		if (clsl == null) {
			synchronized(this) {
				List<EObject> allInst = getAllInstances(null);
				for (EObject obj: allInst) {
					if (obj.eClass() != null) {
						EClass cl = obj.eClass();
						calcFeatures(cl.eResource());
						return clsl ;
					}
				}
				System.err.println("Have no (suitable?) available object ...");
				return Collections.emptyList();
			}
			
		}
		return clsl ;
	}
	
	public synchronized  void objectRemoved(EObject eobj) {
		if (evalFunc == null) {
			return;
		}
		if (eobj == null) {
			return;
		}
		EClass cl = eobj.eClass();
		if (cl == null) {
			return;
		}
		for (EClass allCl: IteratorUtils.shallowUnionObject(cl.getEAllSuperTypes(), cl)) {
			allObjectMap.getOrDefault(allCl, Collections.emptyList()).remove(eobj);
		}
		allObjs.remove(eobj);
	}
	
	public synchronized  void objectAdded(EObject eobj) {
		if (evalFunc == null) {
			return;
		}
		if (eobj == null) {
			return;
		}
		EClass cl = eobj.eClass();
		if (cl == null) {
			return;
		}
		for (EClass allCl: IteratorUtils.shallowUnionObject(cl.getEAllSuperTypes(), cl)) {
			List<EObject> eobjL = allObjectMap.get(allCl);
			if (eobjL == null) {
				allObjectMap.put(allCl, eobjL = new ArrayList<EObject>());
			}
			eobjL.add(eobj);
			allObjs.add(eobj);
		}
		
	}
	
	public synchronized List<EObject> getAllInstances(EClass forClass) {
		return getClassInstanceFunc().eval(forClass);
	}
	
	private Map<EClass, List<EObject>> allGenerated = new HashMap<EClass, List<EObject>>();

	public synchronized EObject createInstance(EClass targetType) {
		return MyEcoreUtil.createInstanceStatic(targetType);
	}
	
	public EObject getAndTrackCreated(EClass targetType) {
		EObject ret = getPrecreatedInstance(targetType);
		trackCreated(ret);
		return ret;
	}
	
	
	
	public EObject getPrecreatedInstance(EClass targetType) {
		List<EObject> gen = allGenerated.get(targetType);
		if (gen == null) {
			allGenerated.put(targetType, gen = new ArrayList<EObject>());
		}
		for (EObject newGen: gen) {
			if (newGen.eResource() == null) {
				return newGen;
			}
		}
		EObject eobj = createInstance(targetType);
		gen.add(eobj);
		return eobj;
	}

	
	public List<EObject> getAllInstancesPlusOne(EClass targetType) {
		List<EObject> ret = new ArrayList<EObject>(getAllInstances(targetType));
		mainLoop: for (EClass sub: getInstancibleTypes(targetType)) {
			List<EObject> gen = allGenerated.get(sub);
			if (gen == null) {
				allGenerated.put(sub, gen = new ArrayList<EObject>());
			}
			for (EObject newGen: gen) {
				if (newGen.eResource() == null) {
					ret.add(newGen);
					continue mainLoop;
				}
			}
			EObject eobj = createInstance(sub);
			gen.add(eobj);
			ret.add(eobj);
		}
		return ret;
	}
	
	
	private EvalFunc<EClass, List<EStructuralFeature>> featureEvalFunc = (x)->x.getEAllStructuralFeatures();
	
	public EvalFunc<EClass, List<EStructuralFeature>> getFeatureEvalFunc() {
		return featureEvalFunc;
	}
	
	
	private Map<EClass, List<EObject>> allObjectMap = new HashMap<>();
	private List<EObject> allObjs = new ArrayList<>();
	private EvalFunc<EClass, List<EObject>> evalFunc;
	
	private EcoreInfo instancibleTypes = null;
	
	private static class EClassInfo {
		private List<EClass> instanciableTypes = new ArrayList<EClass>();
		private List<EClass> subTypesOrSelf = new ArrayList<EClass>();
		private Map<String,OCLExpression[]> ownOclExpressions = new HashMap<>();
		private List<OCLExpression> totalOclExpressions = new ArrayList<OCLExpression>();
		private Map<String,Evaluable> ownEvaluators = new HashMap<>();
		private List<Evaluable<?,?>> totalEvaluators = new ArrayList<>();
		private List<EStructuralFeature> classContainers = new ArrayList<>();
		private List<EStructuralFeature> totalClassContainers = new ArrayList<>();
	}
	
	public static class EcoreInfo {
		Map<EClass, EClassInfo> eclassMap = new HashMap<EClass, MyResource.EClassInfo>();
		Map<OCLExpression,String> oclExpressionToId = new HashMap<>();
		Map<String,OCLExpression> idToOCLExpression = new HashMap<>();
		
		Map<Automaton,String> xmlExpressionToId = new HashMap<>();
		Map<String,Automaton> idToXmlExpression = new HashMap<>();
		
		Map<Evaluable,String> evaluableExpressionToId = new HashMap<>();
		Map<String,Evaluable> idToEvaluable = new HashMap<>();
		
		public List<EClass> getInstanciableTypes(EClass from) {
			return eclassMap.getOrDefault(from, new EClassInfo()).instanciableTypes;
		}
		
		public List<OCLExpression> getApplicableOCLExpressions(EClass from) {
			return eclassMap.getOrDefault(from, new EClassInfo()).totalOclExpressions;
		}
		
		public String getID(OCLExpression expr) {
			return oclExpressionToId.get(expr);
		}
		
		public String getID(Evaluable expr) {
			return evaluableExpressionToId.get(expr);
		}
		
		public Evaluable<?,?> getEvaluable(String forId) {
			return idToEvaluable.get(forId);
		}
		
		public OCLExpression getExpression(String forId) {
			return idToOCLExpression.get(forId);
		}
		
		public Automaton getAutomaton(String forId) {
			return idToXmlExpression.get(forId);
		}

		public Collection<EStructuralFeature> getContainersFor(EClass from) {
			return eclassMap.getOrDefault(from, new EClassInfo()).totalClassContainers;
		}

		public List<Evaluable<?,?>> getApplicableEvaluators(EClass from) {
			return eclassMap.getOrDefault(from, new EClassInfo()).totalEvaluators;
		}
	}
	
	private static Map<Resource, EcoreInfo> instancibleTypesMap = new HashMap<>();
	
	public List<EClass> getInstancibleTypes(EClass from) {
		if (from == null) {
			return Collections.emptyList();
		}
		if (instancibleTypes == null) {
			if (from.eResource() == null) {
				System.err.println("EClass without resource!");
				return Collections.emptyList();
			}
			instancibleTypes = getOrBuildEcoreInfo(from.eResource());
		}
		return instancibleTypes.getInstanciableTypes(from); 
	}
	

	public Collection<EStructuralFeature> getContainersFor(EClass from) {
		if (from == null) {
			return Collections.emptyList();
		}
		if (instancibleTypes == null) {
			if (from.eResource() == null) {
				System.err.println("EClass without resource!");
				return Collections.emptyList();
			}
			instancibleTypes = getOrBuildEcoreInfo(from.eResource());
		}
		return instancibleTypes.getContainersFor(from);
	}
	
	public synchronized List<OCLExpression> getApplicableOCLExpressions(EClass from) {
		if (from == null) {
			return Collections.emptyList();
		}
		if (instancibleTypes == null) {
			if (from.eResource() == null) {
				System.err.println("EClass without resource!");
				return Collections.emptyList();
			}
			instancibleTypes = getOrBuildEcoreInfo(from.eResource());
		}
		return instancibleTypes.getApplicableOCLExpressions(from);
	}
	



	public Collection<Evaluable<?,?>> getApplicableEvaluators(EObject from) {
		if (from == null || from.eClass() == null) {
			return Collections.emptyList();
		}
		if (instancibleTypes == null) {
			if (from.eClass().eResource() == null) {
				System.err.println("EClass without resource!");
				return Collections.emptyList();
			}
			instancibleTypes = getOrBuildEcoreInfo(from.eClass().eResource());
		}
		return instancibleTypes.getApplicableEvaluators(from.eClass());
	}
	

	private EcoreInfo getExistingEcoreInfo() {
		return instancibleTypes;
	}
	
	public ParameterType defaultGenerator(EStructuralFeature targetFeat) {
		ParameterType valueGeneratingParameter = null;
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
		//Hier muss irgendetwas pro Typ haben
		//Für Daten: Modifikatoren, Generatoren
		//Für Assoziationen: Generatoren - Modifikatoren unnötig
		if (targetType instanceof EEnum) {
			EEnum base = (EEnum)targetType;
			List<Object> eliteralValue = new ArrayList<Object>();
			for (EEnumLiteral lit: base.getELiterals()) {
				eliteralValue.add(lit.getInstance());
			}
			valueGeneratingParameter = ParameterType.equalProbability((Class<Object>)targetClass, eliteralValue);
		} else if (targetType instanceof EClass) {
			valueGeneratingParameter = ParameterType.equalProbability((Class)targetClass, 
					(List)this.getAllInstances((EClass)targetType)
					);
			if (targetFeat instanceof EReference) {
				EReference ref = (EReference)targetFeat;
				if (ref.isContainment()) {
					//You can also add something
					valueGeneratingParameter = ParameterType.equalProbability((Class)targetClass, 
							(List)this.getAllInstancesPlusOne((EClass)targetType)
							);
				}
			}
			//Also, you should be able to create something
		} else if (targetType instanceof EDataType) {
			valueGeneratingParameter = this.getGenValueGenerator(targetFeat, targetClass);
		} 
		return valueGeneratingParameter;		
	}
	
	public ParameterType defaultModifier(EStructuralFeature targetFeat, EObject curObj) {
		ParameterType valueGeneratingParameter = null;
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
		//Hier muss irgendetwas pro Typ haben
		//Für Daten: Modifikatoren, Generatoren
		//Für Assoziationen: Generatoren - Modifikatoren unnötig
		if (targetType instanceof EEnum) {
			EEnum base = (EEnum)targetType;
			List<Object> eliteralValue = new ArrayList<Object>();
			for (EEnumLiteral lit: base.getELiterals()) {
				eliteralValue.add(lit.getInstance());
			}
			valueGeneratingParameter = ParameterType.equalProbability((Class)targetClass, eliteralValue);
		} else if (targetType instanceof EClass) {
			valueGeneratingParameter = ParameterType.equalProbability((Class)targetClass, 
					(List)this.getAllInstances((EClass)targetType)
					);
			if (targetFeat instanceof EReference) {
				EReference ref = (EReference)targetFeat;
				if (ref.isContainment()) {
					//You can also add something
					valueGeneratingParameter = ParameterType.equalProbability((Class)targetClass, 
							(List)this.getAllInstancesPlusOne((EClass)targetType)
							);
				}
			}
			//Also, you should be able to create something
		} else if (targetType instanceof EDataType) {
			valueGeneratingParameter = this.getDynamicChangeValueGenerator(targetFeat, targetClass, curObj);
		} 
		return valueGeneratingParameter;		
	}
	
	public String getStandardType(EAttribute cl) {
		EAnnotation annot = cl.getEAnnotation("http://big.tuwien.ac.at/standardXMLDatatype");
		if (annot != null) {
			return annot.getDetails().get("type");
		}
		return null;
	}
	
	public synchronized EcoreInfo getOrBuildEcoreInfo(Resource res) {
		synchronized(res) {
		EcoreInfo ecoreInfo = instancibleTypesMap.get(res);;
		if (ecoreInfo == null) {
			instancibleTypesMap.put(res, ecoreInfo = new EcoreInfo());
		} else {
			return ecoreInfo;
		}
		Map<EClass, EClassInfo> eclassMap = ecoreInfo.eclassMap;
		OCL ocl = OCL.newInstance();
		Helper oclHelper = ocl.createOCLHelper();
	
		for (EClass subClass: (Iterable<EClass>)(()->IteratorUtils.filterType(res.getAllContents(),EClass.class))) {
			
			EClassInfo subMap = eclassMap.get(subClass);;
			if (subMap == null) {
				eclassMap.put(subClass, subMap = new EClassInfo());
			}
			
			for (EClass supCl: IteratorUtils.shallowUnionObject(subClass.getEAllSuperTypes(), subClass)) {
				EClassInfo supMap = eclassMap.get(supCl);
				if (supMap == null) {
					eclassMap.put(supCl, supMap = new EClassInfo());
				}
				supMap.subTypesOrSelf.add(subClass);
				if (subClass.isAbstract()) {
					continue;
				}
				supMap.instanciableTypes.add(subClass);
			}
			
			
			//Get OCL Expressions
			{
				for (EAttribute attr: subClass.getEAttributes()) {
					String standardType = getStandardType(attr);
					if (standardType != null) {
						loadAutomaton();
						Automaton automaton = Datatypes.get(standardType);
						String xmlId = "AUTO_"+subClass.getName()+"_"+attr.getName();
						ecoreInfo.xmlExpressionToId.put(automaton,xmlId);
						ecoreInfo.idToXmlExpression.put(xmlId,automaton);
						XmlDatatypeEvaluable eval = new XmlDatatypeEvaluable(attr,standardType,automaton);
						ecoreInfo.evaluableExpressionToId.put(eval, xmlId);
						ecoreInfo.idToEvaluable.put(xmlId, eval);
						subMap.ownEvaluators.put(xmlId, eval);
					}
				}
					
			}
			
			Map<String,String> expressionStrForClass = OclExtractor.getConstraintMap(subClass);
			Map<String,OCLExpression[]> expressionForClass = OclExtractor.convertToExpressionMsg(oclHelper, subClass, expressionStrForClass);
			for (Entry<String,OCLExpression[]> entry: expressionForClass.entrySet()) {
				String oclId = "EXPR_"+subClass.getName()+"_"+entry.getKey();
				ecoreInfo.oclExpressionToId.put(entry.getValue()[0], oclId);
				ecoreInfo.idToOCLExpression.put(oclId,entry.getValue()[0]);
				OCLExpression evalExpr = entry.getValue()[0];
				OCLExpression messageExpr = entry.getValue()[1];
				OCLExpression valueExpr = entry.getValue()[2]; //TODO: ... not yet implemented, check if always integer or real ocl expression
				OCLExpressionEvaluable eval = new OCLExpressionEvaluable(evalExpr,messageExpr);
				subMap.ownEvaluators.put(entry.getKey(), eval);
				ecoreInfo.evaluableExpressionToId.put(eval, oclId);
				ecoreInfo.idToEvaluable.put(oclId, eval);
			}
			subMap.ownOclExpressions = expressionForClass;
			
			for (EStructuralFeature feat: subClass.getEStructuralFeatures()) {
				if ((feat.getUpperBound() != -1 && feat.isMany()) || (feat.getLowerBound() != 0)) {
					String oclId = "MULT_"+subClass.getName()+"_"+feat.getName();
					MultiplicityEvaluable eval = new MultiplicityEvaluable(feat);
					subMap.ownEvaluators.put(oclId, eval);
					ecoreInfo.evaluableExpressionToId.put(eval,oclId);
					ecoreInfo.idToEvaluable.put(oclId, eval);
				}
			}
			
						
			
		}
		
		for (Entry<EClass, EClassInfo> entry: eclassMap.entrySet()) {
			EClassInfo info = entry.getValue();
			for (EReference ref: entry.getKey().getEReferences()) {
				if (ref.isContainment()) {
					EClassifier target = ref.getEType();
					EClassInfo targetEntry = eclassMap.get(target);
					if (targetEntry != null) {
						targetEntry.classContainers.add(ref);
					}
				}
			}
		}
		for (Entry<EClass, EClassInfo> entry: eclassMap.entrySet()) {
			EClassInfo info = entry.getValue();
			for (EClass cl: info.subTypesOrSelf) {
				EClassInfo subInfo = eclassMap.get(cl);
				for (OCLExpression[] expr: info.ownOclExpressions.values()) {
					subInfo.totalOclExpressions.add(expr[0]);
				}
				subInfo.totalEvaluators.addAll((Collection<? extends Evaluable<?,?>>) info.ownEvaluators.values());
				subInfo.totalClassContainers.addAll(info.classContainers);
			}
		}
		return ecoreInfo;
		}
	}
	
	/*
	public Map<EClass, EClassInfo> getEClassInfoMap(Resource my) {
		EObject anyObj = null;
		Resource myEcoreResource = null;
		for (EObject obj: ((Iterable<EObject>)(()->my.getAllContents()))) {
			EClass cl = obj.eClass();
			if (cl != null && cl.eResource() != null) {
				myEcoreResource = cl.eResource();
				break;
			}
		}
		Map<EClass, EClassInfo> eclassInfoMap = null;
		if (myEcoreResource != null) {
			eclassInfoMap = instancibleTypesMap.get(myEcoreResource);
		}
		if (eclassInfoMap == null) {
			eclassInfoMap = new HashMap<EClass, MyResource.EClassInfo>();
		}
		if (myEcoreResource != null) {
			instancibleTypesMap.put(myEcoreResource, eclassInfoMap);
		} 
		return eclassInfoMap;
	}*/

	public EvalFunc<EClass, List<EObject>> getClassInstanceFunc() {
		if (evalFunc == null) {
			evalFunc = new EvalFunc<EClass, List<EObject>>() {
				{
					Iterator<EObject> iter = getResource().getAllContents();
					while (iter.hasNext()) {
						EObject next = iter.next();
						EClass cl = next.eClass();
						if (cl == null) {continue;}
						for (EClass allCl: IteratorUtils.shallowUnionObject(cl.getEAllSuperTypes(), cl)) {
							List<EObject> eobjL = allObjectMap.get(allCl);
							if (eobjL == null) {
								allObjectMap.put(allCl, eobjL = new ArrayList<EObject>());
							}
							eobjL.add(next);
							allObjs.add(next);
						}
					}
				}
				

				@Override
				public List<EObject> eval(EClass t) {
					if (t == null) {
						return allObjs;
					}
					List<EObject> ret = allObjectMap.get(t);
					if (ret == null) {
						allObjectMap.put(t, ret = new ArrayList<EObject>());
					}
					return ret;
				}
			};
		}
		return evalFunc;
	}
	
	public void trackCreated(EObject obj) {
		EvalFunc<EClass, List<EObject>> instances = getClassInstanceFunc();
		for (EClass cl: obj.eClass().getEAllSuperTypes()) {
			instances.eval(cl).add(obj);
		}
	}
	
	public void trackDeleted(EObject obj) {
		EvalFunc<EClass, List<EObject>> instances = getClassInstanceFunc();
		for (EClass cl: obj.eClass().getEAllSuperTypes()) {
			instances.eval(cl).remove(obj);
		}
	}
	
	private Map<EStructuralFeature,ValueScope<?,?>> customGenScopes = new HashMap<EStructuralFeature, ValueScope<?,?>>();
	private Map<EStructuralFeature,ScopePerValue<?>> customChangeScopes = new HashMap<>();
	
		
	private static Map<Class<?>, ValueScope<?,?>> defaultGenScopes = new HashMap<>();
	static {
		defaultGenScopes.put(Long.class, LogLongScope.INSTANCE);
		defaultGenScopes.put(long.class, LogLongScope.INSTANCE);
		defaultGenScopes.put(Integer.class, LogIntScope.INSTANCE);
		defaultGenScopes.put(int.class, LogIntScope.INSTANCE);
		defaultGenScopes.put(BigInteger.class, LogBigIntegerScope.INSTANCE);
		defaultGenScopes.put(Boolean.class, BooleanScope.INSTANCE);
		defaultGenScopes.put(boolean.class, BooleanScope.INSTANCE);
		defaultGenScopes.put(String.class, StringGenScope.INSTANCE);
	}
	
	private static Map<Class<?>, ScopePerValue<?>> defaultChangeScopes = new HashMap<>();
	static {
		defaultChangeScopes.put(Long.class, (x)->(ValueScope)new LogLongChangeScope((long)(Long)x));
		defaultChangeScopes.put(long.class, (x)->(ValueScope)new LogLongChangeScope((long)(Long)x));
		defaultChangeScopes.put(Integer.class, (x)->(ValueScope)new LogIntChangeScope((int)(Integer)x));
		defaultChangeScopes.put(int.class, (x)->(ValueScope)new LogIntChangeScope((int)(Integer)x));
		defaultChangeScopes.put(BigInteger.class, (x)->(ValueScope)new LogBigIntegerChangeScope((BigInteger)x));
		defaultChangeScopes.put(Boolean.class, ScopePerValue.staticScopePerValue(BooleanScope.INSTANCE));
		defaultChangeScopes.put(boolean.class, ScopePerValue.staticScopePerValue(BooleanScope.INSTANCE));
		defaultChangeScopes.put(String.class, (x)->(ValueScope)StringChangeScope.getScope((String)x, true, true, true));
	}
	
	public void setCustomChangeScope(EStructuralFeature forFeature, ScopePerValue<?> scope) {
		customChangeScopes.put(forFeature, scope);
	}
	
	public void setCustomGenScope(EStructuralFeature forFeature, ValueScope<?, ?> scope) {
		customGenScopes.put(forFeature, scope);
	}
	
	public<T> ValueScope<T,?> getDefaultGenScope(EClassifier type, Class<?> cl) {
		ValueScope<T, ?> ret = (ValueScope<T, ?>) defaultGenScopes.get(cl);
		if (ret == null) {
			if (type instanceof EEnum) {
				List<Object> eliteralValue = new ArrayList<Object>();
				for (EEnumLiteral lit: ((EEnum)type).getELiterals()) {
					eliteralValue.add(lit.getInstance());
				}
				ret = (ValueScope)EqualProbabilityScope.fromList(eliteralValue);
			} else if (type instanceof EClass) {
				ret = (ValueScope)EqualProbabilityScope.fromList(this.getAllInstancesPlusOne((EClass)type));
			}
		}
		return ret;
	}
	
	public<T> ScopePerValue<T> getDefaultChangeScope(EClassifier type, Class<?> cl) {
		ScopePerValue<T> ret = (ScopePerValue<T>) defaultChangeScopes.get(cl);
		if (ret == null) {
			ValueScope<T, ?> genScope = getDefaultGenScope(type, cl);
			if (genScope != null) {
				ret = (x)->genScope;
			}
		}
		return ret;
	}
	
	public ParameterType getGenValueGenerator(EStructuralFeature targetFeat, Class<?> targetClass) {
		ValueScope<?, ?> scope = customGenScopes.get(targetFeat);
		if (scope == null) {
			scope = getDefaultGenScope(targetFeat.getEType(),targetClass);
		}
		if (scope == null) {
			System.err.println("No scope for feature " + targetFeat + " in class " +targetClass + " found!");
			return null;
		}
		return new StaticScopeParameterType(targetClass, scope);
	}

	public ParameterType getChangeValueGenerator(EStructuralFeature targetFeat, Class<?> targetClass, Object curValue) {
		ScopePerValue<?> scopePerValue = customChangeScopes.get(targetFeat);
		if (scopePerValue == null) {
			scopePerValue = getDefaultChangeScope(targetFeat.getEType(),targetClass);
		}
		if (scopePerValue == null) {
			System.err.println("No scope per value for feature " + targetFeat + " in class " +targetClass + " found!");
			return null;
		}
		ValueScope<?, ?> scope = ((ScopePerValue)scopePerValue).getScope(curValue);
		if (scope == null) {
			System.err.println("No change scope for feature " + targetFeat + " in class " +targetClass + " found!");
			return null;
		} 
		return new StaticScopeParameterType(targetClass, scope);
	}
	
	public ParameterType getDynamicChangeValueGenerator(EStructuralFeature targetFeat, Class<?> targetClass, EObject curValue) {
		ScopePerValue<?> scopePerValue = customChangeScopes.get(targetFeat);
		if (scopePerValue == null) {
			scopePerValue = getDefaultChangeScope(targetFeat.getEType(),targetClass);
		}
		if (scopePerValue == null) {
			System.err.println("No scope per value for feature " + targetFeat + " in class " +targetClass + " found!");
			return null;
		}
		ValueScope<?, ?> scope = ((ScopePerValue)scopePerValue).getDynamicScope(curValue,targetFeat);
		if (scope == null) {
			System.err.println("No change scope for feature " + targetFeat + " in class " +targetClass + " found!");
			return null;
		} 
		return new StaticScopeParameterType(targetClass, scope);
	}

	public Resource clone() {
		return clone(new EcoreUtil.Copier());
	}
	
	public Resource clone(Copier copier) {
		if (res.get() == null) {
			return this.getResource();
		}
		Resource newResource = new ResourceImpl();
		newResource.setURI(getResource().getURI());
		/*for (EObject eobj: (Iterable<EObject>)()->getResource().getAllContents()) {
			copier.copy(eobj);
		}*/
		newResource.getContents().addAll(copier.copyAll(getResource().getContents()));
		copier.copyReferences();
		MyResource ret = MyResource.get(newResource);
		ret.setCostProvider(getCostProvider());
		return ret.getResource();
	}

	public String getExpressionId(OCLExpression expr) {
		return getExistingEcoreInfo().getID(expr);
	}


	public String getEvaluableId(Evaluable evaluable) {
		return getExistingEcoreInfo().getID(evaluable);
	}
	
	public EClass getAllInstancesType(OperationCallExp opExp) {
		// TODO Etwas besseres
		EOperation op = (EOperation) opExp.getReferredOperation();
		EClassifier ecl = op.getEType();
		if (!(ecl instanceof EClass)) {
			System.err.println("Strange operation allInstances type: " + ecl);
			return null;
		}
		EClass cl = (EClass)ecl;
		return cl;
	}

	public Iterable<EObject> iterateAllContents() {
		return ()->getResource().getAllContents();
	}
	
	public ChangeType<?,?> getRandomChange(EObject eobj, EStructuralFeature toChange, Random random) {
		//Randomly add
		if (toChange.isMany()) { //Randomly add or delete
			Collection curCol = MyEcoreUtil.getAsCollection(eobj, toChange);
			int curSize = curCol.size();
			//Intentionally violating constraints to emulate setting specific things ...
			boolean mayTakeDelete =  curSize >= toChange.getLowerBound() && curSize > 0;
			boolean mayTakeAdd = curSize <= toChange.getUpperBound();
			if (mayTakeDelete && (!mayTakeAdd || random.nextBoolean())) {
				//Delete change
				ChangeType<?, ?> deleteChange = new FixedDeleteConstantChangeType<>(getResource(),eobj,toChange);
				return deleteChange;
			} else {
				ChangeType<?, ?> addChange = new FixedAddConstantChangeType(getResource(),eobj,toChange);
				return addChange;
			} 
		} else {
			Collection curCol = MyEcoreUtil.getAsCollection(eobj, toChange);
			if (curCol.isEmpty()) {
				//Generate
				ChangeType<?, ?> addChange = new FixedAddConstantChangeType(getResource(),eobj,toChange);
				return addChange;
			} else {
				if (toChange.getLowerBound() == 0 && random.nextInt(5)==0) {
					ChangeType<?, ?> setChange = new FixedClearChangeType<>(getResource(),eobj,toChange);
					return setChange;
				}
				//Set
				ChangeType<?, ?> setChange = new FixedSetConstantChangeType(getResource(),eobj,toChange,this.defaultModifier(toChange,eobj));
				return setChange;
			}
		}
	}

	public ChangeType<?, ?> randomChange(Random random) {
		//randomly select a class or feature
		for (int i = 0; i < 10; ++i) {
			List<EStructuralFeature> allFeat  = getAllFeatures();
			List<EClass> allClass = getAllClasses();
			int randomIndex = random.nextInt(allFeat.size()+allClass.size());
			if (randomIndex < allFeat.size()) {
				EStructuralFeature toChange = allFeat.get(randomIndex);
				List<EObject> instances = getAllInstances(toChange.getEContainingClass());
				if (instances.isEmpty()) {
					//Cannot do anything
					continue;
				}
				EObject eobj = instances.get(random.nextInt(instances.size()));
				return getRandomChange(eobj, toChange, random);
			}
			randomIndex-= allFeat.size();
			EClass randomClass = allClass.get(randomIndex);
			List<EObject> instance = getAllInstances(randomClass);
			if (!instance.isEmpty() && random.nextBoolean()) {
				//Delete
				ChangeType<?, ?> delete = DeleteObjectChangeType.createObjectFromObjects(getResource(), instance);
				return delete;
			}
			//Create
			if (!randomClass.isAbstract()) {
				ChangeType<?, ?> create = CreateObjectChangeType.createObjectFromClasses(getResource(),randomClass);
				return create;
			}
		}
		
		//randomly select and object and do something
		for (int i = 0; i < 10; ++i) {
			List<EObject> allInst = getAllInstances(null);
			EObject robj = allInst.get(random.nextInt(allInst.size()));
			List<EStructuralFeature> esf = robj.eClass().getEAllStructuralFeatures();
			if (esf.isEmpty()) {
				continue;
			}
			EStructuralFeature randomFeat = esf.get(random.nextInt(esf.size()));
			return getRandomChange(robj, randomFeat, random);
		}
		
		return new EmptyChangeType(getResource());
	}
	
	private CostProvider prov = CostProvider.DEFAULT_PROVIDER;
	
	public void setCostProvider(CostProvider prov) {
		this.prov = prov;
	}

	public CostProvider getCostProvider() {
		return prov;
	}
	
	public boolean objequals(EObject from, EObject to, EcoreTransferFunction etf) {
		if (from.eClass() != to.eClass()) {
			return false;
		}
		if (from.eResource() != etf.backResource() || to.eResource() != etf.forwardResource()) {
			return false;
		}
		EClass cl = from.eClass();
		for (EStructuralFeature ref: cl.getEAllStructuralFeatures()) {
			Collection srccol = MyEcoreUtil.getAsCollection(from,ref);
			Collection trgcol = MyEcoreUtil.getAsCollection(to,ref);
			if (srccol.size() != trgcol.size()) {
				return false;
			}
			Iterator srciter = srccol.iterator();
			Iterator trgiter = trgcol.iterator();
			while  (srciter.hasNext()) {
				if (!trgiter.hasNext()) {
					return false;
				}
				Object first = srciter.next();
				Object target = trgiter.next();
				if (first instanceof EObject) {
					if (target != etf.forward((EObject)first)) {
						etf.forward((EObject)first);
						etf.forward((EObject)first);
						return false;
					}
					if (ref instanceof EReference && ((EReference) ref).isContainment()) {
						if (!objequals((EObject)first, (EObject)target, etf)) {
							return false;
						}
					}
				} else {
					if (first == null) {
						if (target != null) {
							return false;
						}
					} else {
						if (!first.equals(target)) {
							return false;
						}
					}
				}
			}
			if (trgiter.hasNext()) {
				return false;
			}
		}
		return true;
	}



	public boolean equalsRes(MyResource myResource) {
		List<EObject> first = new ArrayList<EObject>();
		List<EObject> second = new ArrayList<EObject>();
		for (EObject eobj: iterateAllContents()) {
			first.add(eobj);
		}
		for (EObject eobj: myResource.iterateAllContents()) {
			second.add(eobj);
		}
		if (first.size() != second.size()) {
			return false;
		}
		Map<EObject,EObject> eobjMap = new HashMap<EObject, EObject>();
		for (int i = 0; i < first.size(); ++i) {
			eobjMap.put(first.get(i),second.get(i));
		}
		return equals(myResource, new EcoreMapTransferFunction(getResource(), myResource.getResource(), eobjMap));
	}
	
	public boolean equals(MyResource cloned, EcoreTransferFunction etf) {
		if (getResource().getContents().size() != cloned.getResource().getContents().size()) {
			return false;
		}
		for (EObject eobj: iterateAllContents()) {
			EObject target = etf.forward(eobj);
			if (target == null || target.eResource() == null) {
				return false;
			}
			if (!objequals(eobj,target,etf)) {
				return false;
			}
		}
		EcoreTransferFunction back = etf.inverse();
		for (EObject rev: cloned.iterateAllContents()) {
			EObject source = back.forward(rev);
			if (source == null || source.eResource() == null) {
				return false;
			}
			if (!objequals(rev,source,back)) {
				return false;
			}
		}
		return true;
	}

	public EcoreTransferFunction cloneFunc(Resource[] resourceRef) {
		EcoreUtil.Copier copier = new EcoreUtil.Copier();
		Resource cloned = clone(copier);
		resourceRef[0] = cloned;
		return new EcoreMapTransferFunction(getResource(),cloned,copier);
	}

	public boolean equalsTarget(EcoreTransferFunction cf) {
		if (getResource().equals(cf.forwardResource())) {
			return equals(MyResource.get(cf.backResource()), cf.inverse());
		} else {
			return equals(MyResource.get(cf.forwardResource()), cf);
		}
	}

	public void checkResource() {
		for (EObject eobj: iterateAllContents()) {
			if (eobj.eResource() == null) {
				throw new RuntimeException("Null Resource in my resource!!");
			}
		}
	}









}
