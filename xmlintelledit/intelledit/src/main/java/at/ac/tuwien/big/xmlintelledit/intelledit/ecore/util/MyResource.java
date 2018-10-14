package at.ac.tuwien.big.xmlintelledit.intelledit.ecore.util;

import java.lang.ref.SoftReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.Stack;
import java.util.WeakHashMap;

import org.bouncycastle.jce.provider.JDKKeyFactory.EC;
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
import org.eclipse.emf.ecore.EPackage;
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
import at.ac.tuwien.big.xmlintelledit.util.AddCopyable;
import at.ac.tuwien.big.xmlintelledit.util.MapCorrespondingGetter;
import at.ac.tuwien.big.xmlintelledit.util.Spawnable;
import at.ac.tuwien.big.xtext.util.IteratorUtils;
import at.ac.tuwien.big.xtext.util.MyEcoreUtil;
import dk.brics.automaton.Automaton;
import dk.brics.automaton.Datatypes;

public class MyResource {

	private static class EClassInfo {
		private List<EClass> instanciableTypes = new ArrayList<>();
		private List<EClass> subTypesOrSelf = new ArrayList<>();
		private Map<String, OCLExpression[]> ownOclExpressions = new HashMap<>();
		private List<OCLExpression> totalOclExpressions = new ArrayList<>();
		private Map<String, Evaluable> ownEvaluators = new HashMap<>();
		private List<Evaluable<?, ?>> totalEvaluators = new ArrayList<>();
		private List<EStructuralFeature> classContainers = new ArrayList<>();
		private List<EStructuralFeature> totalClassContainers = new ArrayList<>();
	}

	public static class EcoreInfo {
		Map<EClass, EClassInfo> eclassMap = new HashMap<>();
		Map<OCLExpression, String> oclExpressionToId = new HashMap<>();
		Map<String, OCLExpression> idToOCLExpression = new HashMap<>();

		Map<Automaton, String> xmlExpressionToId = new HashMap<>();
		Map<String, Automaton> idToXmlExpression = new HashMap<>();

		Map<Evaluable, String> evaluableExpressionToId = new HashMap<>();
		Map<String, Evaluable> idToEvaluable = new HashMap<>();

		Set<Resource> knownResources = new HashSet<>();
		Set<EPackage> knownPackages = new HashSet<>();

		
		public void augmentWith(EPackage pkg) {
			Iterable<EClass> classes = IteratorUtils.filterType(pkg.getEClassifiers(),
					EClass.class);
			Set<EPackage> epackages = new HashSet<>();
			Stack<EPackage> packageStack = new Stack<>();
			packageStack.add(pkg);
			while (!packageStack.isEmpty()) {
				EPackage now = packageStack.pop();
				for (EClass cl: IteratorUtils.filterType(now.getEClassifiers(), EClass.class)) {
					cl.getEReferences().forEach(x->{
						if (x.getEType() instanceof EClass) {
							EClass subCl = (EClass)x.getEType();
							if (epackages.add(subCl.getEPackage())) {
								packageStack.add(subCl.getEPackage());
							}
						}
					});
				}
			}
			List<EClass> allClasses = new ArrayList<>();
			for (EPackage epkg: epackages) {
				for (EClass cl: IteratorUtils.filterType(epkg.getEClassifiers(), EClass.class)) {
					allClasses.add(cl);
				}
				this.knownPackages.add(epkg);
			}
			augmentWith(classes);
		}
		
		
		
		public void augmentWith(Iterable<EClass> classes) {
			EcoreInfo ecoreInfo = this;
			Map<EClass, EClassInfo> eclassMap = ecoreInfo.eclassMap;
			OCL ocl = OCL.newInstance();
			Helper oclHelper = ocl.createOCLHelper();

			for (EClass subClass : classes) {

				EClassInfo subMap = eclassMap.get(subClass);
				;
				if (subMap == null) {
					eclassMap.put(subClass, subMap = new EClassInfo());
				}

				for (EClass supCl : IteratorUtils.shallowUnionObject(subClass.getEAllSuperTypes(), subClass)) {
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

				// Get OCL Expressions
				{
					for (EAttribute attr : subClass.getEAttributes()) {
						String standardType = getStandardType(attr);
						if (standardType != null) {
							loadAutomaton();
							Automaton automaton = Datatypes.get(standardType);
							String xmlId = "AUTO_" + subClass.getName() + "_" + attr.getName();
							ecoreInfo.xmlExpressionToId.put(automaton, xmlId);
							ecoreInfo.idToXmlExpression.put(xmlId, automaton);
							XmlDatatypeEvaluable eval = new XmlDatatypeEvaluable(attr, standardType, automaton);
							ecoreInfo.evaluableExpressionToId.put(eval, xmlId);
							ecoreInfo.idToEvaluable.put(xmlId, eval);
							subMap.ownEvaluators.put(xmlId, eval);
						}
					}

				}

				Map<String, String> expressionStrForClass = OclExtractor.getConstraintMap(subClass);
				Map<String, OCLExpression[]> expressionForClass = OclExtractor.convertToExpressionMsg(oclHelper,
						subClass, expressionStrForClass);
				for (Entry<String, OCLExpression[]> entry : expressionForClass.entrySet()) {
					String oclId = "EXPR_" + subClass.getName() + "_" + entry.getKey();
					ecoreInfo.oclExpressionToId.put(entry.getValue()[0], oclId);
					ecoreInfo.idToOCLExpression.put(oclId, entry.getValue()[0]);
					OCLExpression evalExpr = entry.getValue()[0];
					OCLExpression messageExpr = entry.getValue()[1];
					OCLExpression valueExpr = entry.getValue()[2]; // TODO: ...
																	// not yet
																	// implemented,
																	// check if
																	// always
																	// integer
																	// or real
																	// ocl
																	// expression
					OCLExpressionEvaluable eval = new OCLExpressionEvaluable(evalExpr, messageExpr);
					subMap.ownEvaluators.put(entry.getKey(), eval);
					ecoreInfo.evaluableExpressionToId.put(eval, oclId);
					ecoreInfo.idToEvaluable.put(oclId, eval);
				}
				subMap.ownOclExpressions = expressionForClass;

				for (EStructuralFeature feat : subClass.getEStructuralFeatures()) {
					if ((feat.getUpperBound() != -1 && feat.isMany()) || (feat.getLowerBound() != 0)) {
						String oclId = "MULT_" + subClass.getName() + "_" + feat.getName();
						MultiplicityEvaluable eval = new MultiplicityEvaluable(feat);
						subMap.ownEvaluators.put(oclId, eval);
						ecoreInfo.evaluableExpressionToId.put(eval, oclId);
						ecoreInfo.idToEvaluable.put(oclId, eval);
					}
				}

			}

			for (Entry<EClass, EClassInfo> entry : eclassMap.entrySet()) {
				EClassInfo info = entry.getValue();
				for (EReference ref : entry.getKey().getEReferences()) {
					if (ref.isContainment()) {
						EClassifier target = ref.getEType();
						EClassInfo targetEntry = eclassMap.get(target);
						if (targetEntry != null) {
							targetEntry.classContainers.add(ref);
						}
					}
				}
			}
			for (Entry<EClass, EClassInfo> entry : eclassMap.entrySet()) {
				EClassInfo info = entry.getValue();
				for (EClass cl : info.subTypesOrSelf) {
					EClassInfo subInfo = eclassMap.get(cl);
					for (OCLExpression[] expr : info.ownOclExpressions.values()) {
						subInfo.totalOclExpressions.add(expr[0]);
					}
					subInfo.totalEvaluators.addAll((Collection) info.ownEvaluators.values());// subInfo.totalEvaluators.addAll((Collection<?
																								// extends
																								// Evaluable<?,?>>)
																								// info.ownEvaluators.values());
					subInfo.totalEvaluators
							.addAll(predefinedEvaluables.getOrDefault(entry.getKey(), Collections.emptyList()));
					subInfo.totalClassContainers.addAll(info.classContainers);
				}
			}
		}


		public void augmentWith(Resource res) {
			this.knownResources.add(res);
			Iterable<EClass> classes = (Iterable<EClass>) (() -> IteratorUtils.filterType(res.getAllContents(),
					EClass.class));
			augmentWith(classes);
		}
		
		public List<Evaluable<?, ?>> getApplicableEvaluators(EClass from) {
			// TODO: ...
			return this.eclassMap.computeIfAbsent(from, x -> {
				EClassInfo ret = new EClassInfo();
				ret.totalEvaluators.addAll(predefinedEvaluables.getOrDefault(x, Collections.emptyList()));
				return ret;
			}).totalEvaluators;
		}

		public List<OCLExpression> getApplicableOCLExpressions(EClass from) {
			return this.eclassMap.getOrDefault(from, new EClassInfo()).totalOclExpressions;
		}

		public Automaton getAutomaton(String forId) {
			return this.idToXmlExpression.get(forId);
		}

		public Collection<EStructuralFeature> getContainersFor(EClass from) {
			return this.eclassMap.getOrDefault(from, new EClassInfo()).totalClassContainers;
		}

		public Evaluable<?, ?> getEvaluable(String forId) {
			return this.idToEvaluable.get(forId);
		}

		public OCLExpression getExpression(String forId) {
			return this.idToOCLExpression.get(forId);
		}

		public String getID(Evaluable expr) {
			return this.evaluableExpressionToId.get(expr);
		}

		public String getID(OCLExpression expr) {
			return this.oclExpressionToId.get(expr);
		}

		public List<EClass> getInstanciableTypes(EClass from) {
			return this.eclassMap.getOrDefault(from, new EClassInfo()).instanciableTypes;
		}

		public Collection<EClass> getKnownClasses() {
			return this.eclassMap.keySet();
		}
		
		public boolean knowsPackage(EPackage pkg) {
			return this.knownPackages.contains(pkg);
		}



		public boolean knowsResource(Resource res) {
			return this.knownResources.contains(res);
		}

	}

	static {

	}

	private static boolean loadedautomaton = false;

	private static WeakHashMap<Resource, MyResource> hashMaps = new WeakHashMap<>();

	private static Map<Resource, EcoreInfo> instancibleTypesMap = new HashMap<>();
	private static Map<EPackage, EcoreInfo> instancibleTypesMapPkg = new HashMap<>();

	private static Map<EClass, List<Evaluable<?, ?>>> predefinedEvaluables = new HashMap<>();

	private static Map<Class<?>, ValueScope<?, ?>> defaultGenScopes = new HashMap<>();

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
		defaultChangeScopes.put(Long.class, (x) -> (ValueScope) new LogLongChangeScope((Long) x));
		defaultChangeScopes.put(long.class, (x) -> (ValueScope) new LogLongChangeScope((Long) x));
		defaultChangeScopes.put(Integer.class, (x) -> (ValueScope) new LogIntChangeScope((Integer) x));
		defaultChangeScopes.put(int.class, (x) -> (ValueScope) new LogIntChangeScope((Integer) x));
		defaultChangeScopes.put(BigInteger.class, (x) -> (ValueScope) new LogBigIntegerChangeScope((BigInteger) x));
		defaultChangeScopes.put(Boolean.class, ScopePerValue.staticScopePerValue(BooleanScope.INSTANCE));
		defaultChangeScopes.put(boolean.class, ScopePerValue.staticScopePerValue(BooleanScope.INSTANCE));
		defaultChangeScopes.put(String.class,
				(x) -> (ValueScope) StringChangeScope.getScope((String) x, true, true, true));
	}

	private static Map<EClass, Map<EStructuralFeature, org.eclipse.ocl.expressions.OCLExpression>> derivations = new HashMap<>();

	public static void addEvaluable(EClass cl, Evaluable<?, ?> ev) {
		predefinedEvaluables.computeIfAbsent(cl, x -> new ArrayList<>()).add(ev);
	}

	public static synchronized MyResource get(Resource from) {
		MyResource ret = hashMaps.get(from);
		if (ret == null) {
			hashMaps.put(from, ret = new MyResource(from));
		}
		return ret;
	}

	public static org.eclipse.ocl.expressions.OCLExpression getDerivation(EClass cl, EStructuralFeature eprop) {
		return derivations.getOrDefault(cl, Collections.emptyMap()).get(eprop);
	}

	public static synchronized EcoreInfo getOrBuildEcoreInfo(EPackage pkg) {
		synchronized (pkg) {
			EcoreInfo ecoreInfo = instancibleTypesMapPkg.get(pkg);
			if (ecoreInfo == null) {
				instancibleTypesMapPkg.put(pkg, ecoreInfo = new EcoreInfo());
			} else if (ecoreInfo.knowsPackage(pkg)) {
				return ecoreInfo;
			}
			ecoreInfo.augmentWith(pkg);
			return ecoreInfo;
		}
	}

	public static String getStandardType(EAttribute cl) {
		EAnnotation annot = cl.getEAnnotation("http://big.tuwien.ac.at/standardXMLDatatype");
		if (annot != null) {
			return annot.getDetails().get("type");
		}
		return null;
	}

	private static void loadAutomaton() {
		if (!loadedautomaton) {
			synchronized (MyResource.class) {
				if (!loadedautomaton) {
					loadedautomaton = true;
					try {
						Method m = Datatypes.class.getDeclaredMethod("buildAll");
						m.setAccessible(true);
						m.invoke(null);
					} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException
							| NoSuchMethodException | SecurityException e) {
						e.printStackTrace();
					} catch (Exception e) {
						System.out.println("TODO: Er kann das nicht vollständig machen, weil er keine Dateien hat ... "
								+ e.getMessage());
					}
				}
			}
		}
	}

	public static void putDerivation(EClass cl, EStructuralFeature feat,
			org.eclipse.ocl.expressions.OCLExpression expr) {
		derivations.computeIfAbsent(cl, x -> new HashMap<>()).put(feat, expr);
	}

	public static void putDerivation(EClass cl, EStructuralFeature feat, String derivation) {
		OCLExpression expr = OclExtractor.getExpression(cl, derivation);
		putDerivation(cl, feat, expr);
	}

	private SoftReference<Resource> res;

	private List<EStructuralFeature> feat = null;

	private List<EClass> clsl = null;

	private Map<EClass, List<EObject>> allGenerated = new HashMap<>();

	private EvalFunc<EClass, List<EStructuralFeature>> featureEvalFunc = (x) -> x.getEAllStructuralFeatures();

	private Map<EClass, List<EObject>> allObjectMap = new HashMap<>();
	private List<EObject> allObjs = new ArrayList<>();
	private EvalFunc<EClass, List<EObject>> evalFunc;

	private EcoreInfo instancibleTypes = null;

	private Set<Resource> knownResources = new HashSet<>();

	private Map<EStructuralFeature, ValueScope<?, ?>> customGenScopes = new HashMap<>();

	private Map<EStructuralFeature, ScopePerValue<?>> customChangeScopes = new HashMap<>();

	private CostProvider prov = CostProvider.DEFAULT_PROVIDER;

	public MyResource(Resource from) {
		this.res = new SoftReference<>(from);
		if (from == null) {
			System.out.println("Null resource!");
		}
	}

	private void calcFeatures(Resource res) {
		synchronized (res) {
			this.feat = new ArrayList<>();
			this.clsl = new ArrayList<>();
			TreeIterator<EObject> iter = res.getAllContents();
			while (iter.hasNext()) {
				EObject next = iter.next();
				if (next instanceof EClass) {

					EClass storedClass = (EClass) next;
					this.clsl.add(storedClass);
					this.feat.addAll(storedClass.getEStructuralFeatures());
					if (this.feat.contains(null)) {
						System.out.println("Why does an EClass contain null feature?!");
					}
				}
			}
		}
	}

	private void checkRes(Resource from) {

	}

	public void checkResource() {
		for (EObject eobj : iterateAllContents()) {
			if (eobj.eResource() == null) {
				throw new RuntimeException("Null Resource in my resource!!");
			}
		}
	}

	@Override
	public Resource clone() {
		return clone(new EcoreUtil.Copier());
	}

	public Resource clone(Copier copier) {
		if (this.res.get() == null) {
			return this.getResource();
		}
		Resource newResource = new ResourceImpl();
		/*System.out.println("Creating new Resource: "+newResource);
		new Exception().printStackTrace();*/
		newResource.setURI(getResource().getURI());
		/*
		 * for (EObject eobj:
		 * (Iterable<EObject>)()->getResource().getAllContents()) {
		 * copier.copy(eobj); }
		 */
		Set<EObject> addCopy = new HashSet<EObject>();
		getResource().getAllContents().forEachRemaining(x->{
			if (x instanceof AddCopyable) {
				AddCopyable ac =(AddCopyable)x;
				ac.addToPseudoContainment(addCopy);
			}
		});
		 
		Collection<EObject> copyAll = copier.copyAll(addCopy);
		newResource.getContents().addAll(copier.copyAll(getResource().getContents()));
		newResource.getContents().addAll(copyAll);
		MapCorrespondingGetter mcg = new MapCorrespondingGetter(new HashMap<>(copier));
		MyResource ret = MyResource.get(newResource);
		mcg.put(this, ret);
		Set<Spawnable<?>> allSpawnables = new HashSet<>();
		for (Entry<EObject, EObject> entry : copier.entrySet()) {
			if (entry.getKey() instanceof AddCopyable) {
				// Not very good ...
				AddCopyable from = (AddCopyable) entry.getKey();
				allSpawnables.addAll(from.getSpawned());
			}
		}
		for (Spawnable<?> spawnable : allSpawnables) {
			mcg.put(spawnable, spawnable.spawnNew());
		}
		for (Entry<EObject, EObject> entry : copier.entrySet()) {
			if (entry.getKey() instanceof AddCopyable && entry.getValue() instanceof AddCopyable) {
				AddCopyable from = (AddCopyable) entry.getKey();
				AddCopyable to = (AddCopyable) entry.getValue();
				to.copyFrom(from, mcg);
				//System.out.println("Target resource: " + entry.getValue().eResource());
			}
		}
		copier.copyReferences();

		ret.setCostProvider(getCostProvider());
		return ret.getResource();
	}

	public EcoreTransferFunction cloneFunc(Resource[] resourceRef) {
		EcoreUtil.Copier copier = new EcoreUtil.Copier();
		Resource cloned = clone(copier);
		resourceRef[0] = cloned;
		return new EcoreMapTransferFunction(getResource(), cloned, copier);
	}

	public synchronized EObject createInstance(EClass targetType) {
		return MyEcoreUtil.createInstanceStatic(targetType);
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
			// TODO: Das ist nicht schön
			targetClass = Object.class;
		}
		// Hier muss irgendetwas pro Typ haben
		// Für Daten: Modifikatoren, Generatoren
		// Für Assoziationen: Generatoren - Modifikatoren unnötig
		if (targetType instanceof EEnum) {
			EEnum base = (EEnum) targetType;
			List<Object> eliteralValue = new ArrayList<>();
			for (EEnumLiteral lit : base.getELiterals()) {
				eliteralValue.add(lit.getInstance());
			}
			valueGeneratingParameter = ParameterType.equalProbability((Class<Object>) targetClass, eliteralValue);
		} else if (targetType instanceof EClass) {
			valueGeneratingParameter = ParameterType.equalProbability((Class) targetClass,
					(List) this.getAllInstances((EClass) targetType));
			if (targetFeat instanceof EReference) {
				EReference ref = (EReference) targetFeat;
				if (ref.isContainment()) {
					// You can also add something
					valueGeneratingParameter = ParameterType.equalProbability((Class) targetClass,
							(List) this.getAllInstancesPlusOne((EClass) targetType));
				}
			}
			// Also, you should be able to create something
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
			// TODO: Das ist nicht schön
			targetClass = Object.class;
		}
		// Hier muss irgendetwas pro Typ haben
		// Für Daten: Modifikatoren, Generatoren
		// Für Assoziationen: Generatoren - Modifikatoren unnötig
		if (targetType instanceof EEnum) {
			EEnum base = (EEnum) targetType;
			List<Object> eliteralValue = new ArrayList<>();
			for (EEnumLiteral lit : base.getELiterals()) {
				eliteralValue.add(lit.getInstance());
			}
			valueGeneratingParameter = ParameterType.equalProbability((Class) targetClass, eliteralValue);
		} else if (targetType instanceof EClass) {
			valueGeneratingParameter = ParameterType.equalProbability((Class) targetClass,
					(List) this.getAllInstances((EClass) targetType));
			if (targetFeat instanceof EReference) {
				EReference ref = (EReference) targetFeat;
				if (ref.isContainment()) {
					// You can also add something
					valueGeneratingParameter = ParameterType.equalProbability((Class) targetClass,
							(List) this.getAllInstancesPlusOne((EClass) targetType));
				}
			}
			// Also, you should be able to create something
		} else if (targetType instanceof EDataType) {
			valueGeneratingParameter = this.getDynamicChangeValueGenerator(targetFeat, targetClass, curObj);
		}
		return valueGeneratingParameter;
	}

	public boolean equals(MyResource cloned, EcoreTransferFunction etf) {
		/*if (getResource().getContents().size() != cloned.getResource().getContents().size()) {
			return false;
		}*/
		for (EObject eobj : iterateAllContents()) {
			EObject target = etf.forward(eobj);
			if (target == null || target.eResource() == null) {
				return false;
			}
			if (!objequals(eobj, target, etf)) {
				return false;
			}
		}
		EcoreTransferFunction back = etf.inverse();
		for (EObject rev : cloned.iterateAllContents()) {
			EObject source = back.forward(rev);
			if (source == null || source.eResource() == null) {
				return false;
			}
			if (!objequals(rev, source, back)) {
				return false;
			}
		}
		return true;
	}

	/*
	 * public Map<EClass, EClassInfo> getEClassInfoMap(Resource my) { EObject
	 * anyObj = null; Resource myEcoreResource = null; for (EObject obj:
	 * ((Iterable<EObject>)(()->my.getAllContents()))) { EClass cl =
	 * obj.eClass(); if (cl != null && cl.eResource() != null) { myEcoreResource
	 * = cl.eResource(); break; } } Map<EClass, EClassInfo> eclassInfoMap =
	 * null; if (myEcoreResource != null) { eclassInfoMap =
	 * instancibleTypesMap.get(myEcoreResource); } if (eclassInfoMap == null) {
	 * eclassInfoMap = new HashMap<EClass, MyResource.EClassInfo>(); } if
	 * (myEcoreResource != null) { instancibleTypesMap.put(myEcoreResource,
	 * eclassInfoMap); } return eclassInfoMap; }
	 */

	public boolean equalsRes(MyResource myResource) {
		List<EObject> first = new ArrayList<>();
		List<EObject> second = new ArrayList<>();
		for (EObject eobj : iterateAllContents()) {
			first.add(eobj);
		}
		for (EObject eobj : myResource.iterateAllContents()) {
			second.add(eobj);
		}
		if (first.size() != second.size()) {
			return false;
		}
		Map<EObject, EObject> eobjMap = new HashMap<>();
		for (int i = 0; i < first.size(); ++i) {
			eobjMap.put(first.get(i), second.get(i));
		}
		return equals(myResource, new EcoreMapTransferFunction(getResource(), myResource.getResource(), eobjMap));
	}

	public boolean equalsTarget(EcoreTransferFunction cf) {
		if (getResource().equals(cf.forwardResource())) {
			return equals(MyResource.get(cf.backResource()), cf.inverse());
		} else {
			return equals(MyResource.get(cf.forwardResource()), cf);
		}
	}

	public synchronized List<EClass> getAllClasses() {
		if (this.clsl == null) {
			synchronized (this) {
				List<EObject> allInst = getAllInstances(null);
				for (EObject obj : allInst) {
					if (obj.eClass() != null) {
						EClass cl = obj.eClass();
						calcFeatures(cl.eResource());
						return this.clsl;
					}
				}
				System.err.println("Have no (suitable?) available object ...");
				return Collections.emptyList();
			}

		}
		return this.clsl;
	}

	public synchronized List<EStructuralFeature> getAllFeatures() {
		if (this.feat == null) {
			List<EObject> allInst = getAllInstances(null);
			for (EObject obj : allInst) {
				if (obj.eClass() != null) {
					EClass cl = obj.eClass();
					calcFeatures(cl.eResource());
					return this.feat;
				}
			}
			System.err.println("Have no (suitable?) available object ...");
			return Collections.emptyList();

		}
		return this.feat;
	}
	public synchronized List<EObject> getAllInstances(EClass forClass) {
		return getClassInstanceFunc().eval(forClass);
	}

	public List<EObject> getAllInstancesPlusOne(EClass targetType) {
		List<EObject> ret = new ArrayList<>(getAllInstances(targetType));
		mainLoop: for (EClass sub : getInstancibleTypes(targetType)) {
			List<EObject> gen = this.allGenerated.get(sub);
			if (gen == null) {
				this.allGenerated.put(sub, gen = new ArrayList<>());
			}
			for (EObject newGen : gen) {
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
	public EClass getAllInstancesType(OperationCallExp opExp) {
		// TODO Etwas besseres
		EOperation op = (EOperation) opExp.getReferredOperation();
		EClassifier ecl = op.getEType();
		if (!(ecl instanceof EClass)) {
			System.err.println("Strange operation allInstances type: " + ecl);
			return null;
		}
		EClass cl = (EClass) ecl;
		return cl;
	}

	public EObject getAndTrackCreated(EClass targetType) {
		EObject ret = getPrecreatedInstance(targetType);
		trackCreated(ret);
		return ret;
	}
	public Collection<Evaluable<?, ?>> getApplicableEvaluators(EObject from) {
		if (from == null || from.eClass() == null) {
			return Collections.emptyList();
		}
		Resource res = from.eClass().eResource();
		if (this.instancibleTypes == null) {
			if (res == null) {
				System.err.println("EClass without resource!");
				return Collections.emptyList();
			}
			this.instancibleTypes = getOrBuildEcoreInfo(from.eClass().getEPackage());
		} else if (!this.instancibleTypes.knowsResource(res)) {
			this.instancibleTypes.augmentWith(res);
		}
		return this.instancibleTypes.getApplicableEvaluators(from.eClass());
	}

	public synchronized List<OCLExpression> getApplicableOCLExpressions(EClass from) {
		if (from == null) {
			return Collections.emptyList();
		}
		if (this.instancibleTypes == null) {
			if (from.eResource() == null) {
				System.err.println("EClass without resource!");
				return Collections.emptyList();
			}
			this.instancibleTypes = getOrBuildEcoreInfo(from.eResource());
		}
		return this.instancibleTypes.getApplicableOCLExpressions(from);
	}

	public ParameterType getChangeValueGenerator(EStructuralFeature targetFeat, Class<?> targetClass, Object curValue) {
		ScopePerValue<?> scopePerValue = this.customChangeScopes.get(targetFeat);
		if (scopePerValue == null) {
			scopePerValue = getDefaultChangeScope(targetFeat.getEType(), targetClass);
		}
		if (scopePerValue == null) {
			System.err.println("No scope per value for feature " + targetFeat + " in class " + targetClass + " found!");
			return null;
		}
		ValueScope<?, ?> scope = ((ScopePerValue) scopePerValue).getScope(curValue);
		if (scope == null) {
			System.err.println("No change scope for feature " + targetFeat + " in class " + targetClass + " found!");
			return null;
		}
		return new StaticScopeParameterType(targetClass, scope);
	}

	public EvalFunc<EClass, List<EObject>> getClassInstanceFunc() {
		if (this.evalFunc == null) {
			this.evalFunc = new EvalFunc<EClass, List<EObject>>() {
				{
					Iterator<EObject> iter = getResource().getAllContents();
					while (iter.hasNext()) {
						EObject next = iter.next();
						EClass cl = next.eClass();
						if (cl == null) {
							continue;
						}
						for (EClass allCl : IteratorUtils.shallowUnionObject(cl.getEAllSuperTypes(), cl)) {
							List<EObject> eobjL = MyResource.this.allObjectMap.get(allCl);
							if (eobjL == null) {
								MyResource.this.allObjectMap.put(allCl, eobjL = new ArrayList<>());
							}
							eobjL.add(next);
							MyResource.this.allObjs.add(next);
						}
					}
				}

				@Override
				public List<EObject> eval(EClass t) {
					if (t == null) {
						return MyResource.this.allObjs;
					}
					List<EObject> ret = MyResource.this.allObjectMap.get(t);
					if (ret == null) {
						MyResource.this.allObjectMap.put(t, ret = new ArrayList<>());
					}
					return ret;
				}
			};
		}
		return this.evalFunc;
	}

	public Collection<EStructuralFeature> getContainersFor(EClass from) {
		if (from == null) {
			return Collections.emptyList();
		}
		if (this.instancibleTypes == null) {
			if (from.eResource() == null) {
				System.err.println("EClass without resource!");
				return Collections.emptyList();
			}
			this.instancibleTypes = getOrBuildEcoreInfo(from.eResource());
		}
		return this.instancibleTypes.getContainersFor(from);
	}

	public CostProvider getCostProvider() {
		return this.prov;
	}

	public <T> ScopePerValue<T> getDefaultChangeScope(EClassifier type, Class<?> cl) {
		ScopePerValue<T> ret = (ScopePerValue<T>) defaultChangeScopes.get(cl);
		if (ret == null) {
			ValueScope<T, ?> genScope = getDefaultGenScope(type, cl);
			if (genScope != null) {
				ret = (x) -> genScope;
			}
		}
		return ret;
	}

	public <T> ValueScope<T, ?> getDefaultGenScope(EClassifier type, Class<?> cl) {
		ValueScope<T, ?> ret = (ValueScope<T, ?>) defaultGenScopes.get(cl);
		if (ret == null) {
			if (type instanceof EEnum) {
				List<Object> eliteralValue = new ArrayList<>();
				for (EEnumLiteral lit : ((EEnum) type).getELiterals()) {
					eliteralValue.add(lit.getInstance());
				}
				ret = (ValueScope) EqualProbabilityScope.fromList(eliteralValue);
			} else if (type instanceof EClass) {
				ret = (ValueScope) EqualProbabilityScope.fromList(this.getAllInstancesPlusOne((EClass) type));
			}
		}
		return ret;
	}

	public ParameterType getDynamicChangeValueGenerator(EStructuralFeature targetFeat, Class<?> targetClass,
			EObject curValue) {
		ScopePerValue<?> scopePerValue = this.customChangeScopes.get(targetFeat);
		if (scopePerValue == null) {
			scopePerValue = getDefaultChangeScope(targetFeat.getEType(), targetClass);
		}
		if (scopePerValue == null) {
			System.err.println("No scope per value for feature " + targetFeat + " in class " + targetClass + " found!");
			return null;
		}
		ValueScope<?, ?> scope = ((ScopePerValue) scopePerValue).getDynamicScope(curValue, targetFeat);
		if (scope == null) {
			System.err.println("No change scope for feature " + targetFeat + " in class " + targetClass + " found!");
			return null;
		}
		return new StaticScopeParameterType(targetClass, scope);
	}

	public String getEvaluableId(Evaluable evaluable) {
		return getExistingEcoreInfo().getID(evaluable);
	}

	private EcoreInfo getExistingEcoreInfo() {
		return this.instancibleTypes;
	}

	public String getExpressionId(OCLExpression expr) {
		return getExistingEcoreInfo().getID(expr);
	}

	public EvalFunc<EClass, List<EStructuralFeature>> getFeatureEvalFunc() {
		return this.featureEvalFunc;
	}

	public ParameterType getGenValueGenerator(EStructuralFeature targetFeat, Class<?> targetClass) {
		ValueScope<?, ?> scope = this.customGenScopes.get(targetFeat);
		if (scope == null) {
			scope = getDefaultGenScope(targetFeat.getEType(), targetClass);
		}
		if (scope == null) {
			System.err.println("No scope for feature " + targetFeat + " in class " + targetClass + " found!");
			return null;
		}
		return new StaticScopeParameterType(targetClass, scope);
	}

	public List<EClass> getInstancibleTypes(EClass from) {
		if (from == null) {
			return Collections.emptyList();
		}
		if (this.instancibleTypes == null) {
			if (from.eResource() == null) {
				System.err.println("EClass without resource!");
				return Collections.emptyList();
			}
			this.instancibleTypes = getOrBuildEcoreInfo(from.eResource());
		}
		return this.instancibleTypes.getInstanciableTypes(from);
	}


	public synchronized EcoreInfo getOrBuildEcoreInfo(Resource res) {
		synchronized (res) {
			EcoreInfo ecoreInfo = instancibleTypesMap.get(res);
			if (ecoreInfo == null) {
				instancibleTypesMap.put(res, ecoreInfo = new EcoreInfo());
			} else if (ecoreInfo.knowsResource(res)) {
				return ecoreInfo;
			}
			ecoreInfo.augmentWith(res);
			return ecoreInfo;
		}
	}

	
	public EObject getPrecreatedInstance(EClass targetType) {
		List<EObject> gen = this.allGenerated.get(targetType);
		if (gen == null) {
			this.allGenerated.put(targetType, gen = new ArrayList<>());
		}
		for (EObject newGen : gen) {
			if (newGen.eResource() == null) {
				return newGen;
			}
		}
		EObject eobj = createInstance(targetType);
		gen.add(eobj);
		return eobj;
	}

	public ChangeType<?, ?> getRandomChange(EObject eobj, EStructuralFeature toChange, Random random) {
		// Randomly add
		if (toChange.isMany()) { // Randomly add or delete
			Collection curCol = MyEcoreUtil.getAsCollection(eobj, toChange);
			int curSize = curCol.size();
			// Intentionally violating constraints to emulate setting specific
			// things ...
			boolean mayTakeDelete = curSize >= toChange.getLowerBound() && curSize > 0;
			boolean mayTakeAdd = curSize <= toChange.getUpperBound();
			if (mayTakeDelete && (!mayTakeAdd || random.nextBoolean())) {
				// Delete change
				ChangeType<?, ?> deleteChange = new FixedDeleteConstantChangeType<>(getResource(), eobj, toChange);
				return deleteChange;
			} else {
				ChangeType<?, ?> addChange = new FixedAddConstantChangeType(getResource(), eobj, toChange);
				return addChange;
			}
		} else {
			Collection curCol = MyEcoreUtil.getAsCollection(eobj, toChange);
			if (curCol.isEmpty()) {
				// Generate
				ChangeType<?, ?> addChange = new FixedAddConstantChangeType(getResource(), eobj, toChange);
				return addChange;
			} else {
				if (toChange.getLowerBound() == 0 && random.nextInt(5) == 0) {
					ChangeType<?, ?> setChange = new FixedClearChangeType<>(getResource(), eobj, toChange);
					return setChange;
				}
				// Set
				ChangeType<?, ?> setChange = new FixedSetConstantChangeType(getResource(), eobj, toChange,
						this.defaultModifier(toChange, eobj));
				return setChange;
			}
		}
	}

	public Resource getResource() {
		return this.res.get();
	}

	public Iterable<EObject> iterateAllContents() {
		return () -> getResource().getAllContents();
	}

	public void knowEcore(Resource ecoreRes) {
		calcFeatures(ecoreRes);
	}

	public synchronized void objectAdded(EObject eobj) {
		if (this.evalFunc == null) {
			return;
		}
		if (eobj == null) {
			return;
		}
		EClass cl = eobj.eClass();
		if (cl == null) {
			return;
		}
		for (EClass allCl : IteratorUtils.shallowUnionObject(cl.getEAllSuperTypes(), cl)) {
			List<EObject> eobjL = this.allObjectMap.get(allCl);
			if (eobjL == null) {
				this.allObjectMap.put(allCl, eobjL = new ArrayList<>());
			}
			eobjL.add(eobj);
			this.allObjs.add(eobj);
		}

	}

	public synchronized void objectRemoved(EObject eobj) {
		if (this.evalFunc == null) {
			return;
		}
		if (eobj == null) {
			return;
		}
		EClass cl = eobj.eClass();
		if (cl == null) {
			return;
		}
		for (EClass allCl : IteratorUtils.shallowUnionObject(cl.getEAllSuperTypes(), cl)) {
			this.allObjectMap.getOrDefault(allCl, Collections.emptyList()).remove(eobj);
		}
		this.allObjs.remove(eobj);
	}

	public boolean objequals(EObject from, EObject to, EcoreTransferFunction etf) {
		if (from.eClass() != to.eClass()) {
			return false;
		}
		if (from.eResource() != etf.backResource() || to.eResource() != etf.forwardResource()) {
			return false;
		}
		EClass cl = from.eClass();
		for (EStructuralFeature ref : cl.getEAllStructuralFeatures()) {
			Collection srccol = MyEcoreUtil.getAsCollection(from, ref);
			Collection trgcol = MyEcoreUtil.getAsCollection(to, ref);
			if (srccol.size() != trgcol.size()) {
				return false;
			}
			Iterator srciter = srccol.iterator();
			Iterator trgiter = trgcol.iterator();
			while (srciter.hasNext()) {
				if (!trgiter.hasNext()) {
					return false;
				}
				Object first = srciter.next();
				Object target = trgiter.next();
				if (first instanceof EObject) {
					if (target != etf.forward((EObject) first)) {
						etf.forward((EObject) first);
						etf.forward((EObject) first);
						return false;
					}
					if (ref instanceof EReference && ((EReference) ref).isContainment()) {
						if (!objequals((EObject) first, (EObject) target, etf)) {
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

	public ChangeType<?, ?> randomChange(Random random) {
		// randomly select a class or feature
		for (int i = 0; i < 10; ++i) {
			List<EStructuralFeature> allFeat = getAllFeatures();
			List<EClass> allClass = getAllClasses();
			int randomIndex = random.nextInt(allFeat.size() + allClass.size());
			if (randomIndex < allFeat.size()) {
				EStructuralFeature toChange = allFeat.get(randomIndex);
				List<EObject> instances = getAllInstances(toChange.getEContainingClass());
				if (instances.isEmpty()) {
					// Cannot do anything
					continue;
				}
				EObject eobj = instances.get(random.nextInt(instances.size()));
				return getRandomChange(eobj, toChange, random);
			}
			randomIndex -= allFeat.size();
			EClass randomClass = allClass.get(randomIndex);
			List<EObject> instance = getAllInstances(randomClass);
			if (!instance.isEmpty() && random.nextBoolean()) {
				// Delete
				ChangeType<?, ?> delete = DeleteObjectChangeType.createObjectFromObjects(getResource(), instance);
				return delete;
			}
			// Create
			if (!randomClass.isAbstract()) {
				ChangeType<?, ?> create = CreateObjectChangeType.createObjectFromClasses(getResource(), randomClass);
				return create;
			}
		}

		// randomly select and object and do something
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

	public void setCostProvider(CostProvider prov) {
		this.prov = prov;
	}

	public void setCustomChangeScope(EStructuralFeature forFeature, ScopePerValue<?> scope) {
		this.customChangeScopes.put(forFeature, scope);
	}

	public void setCustomGenScope(EStructuralFeature forFeature, ValueScope<?, ?> scope) {
		this.customGenScopes.put(forFeature, scope);
	}

	public void trackCreated(EObject obj) {
		EvalFunc<EClass, List<EObject>> instances = getClassInstanceFunc();
		for (EClass cl : obj.eClass().getEAllSuperTypes()) {
			instances.eval(cl).add(obj);
		}
	}

	public void trackDeleted(EObject obj) {
		EvalFunc<EClass, List<EObject>> instances = getClassInstanceFunc();
		for (EClass cl : obj.eClass().getEAllSuperTypes()) {
			instances.eval(cl).remove(obj);
		}
	}

}
