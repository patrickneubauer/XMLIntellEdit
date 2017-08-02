package at.ac.tuwien.big.xmlintelledit.intelledit.oclgen

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import java.io.File

class OCL2ScopeGenerator implements IGenerator {
	
	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		val ecorePackageName = 'at.ac.tuwien.big.forms';
		val packageName = ecorePackageName + '.form.scoping';
		val validatorPackage = ecorePackageName + '.form.validation.ocl';
		val referencesToConstraintsMap = OclExtractor.getScopingOCLExpressions(resource);
		
		val fileName = 'FormScopeProviderBase';
		val file = new File(packageName.replaceAll("\\.", "\\/") + "/" + fileName + '.java');
		fsa.generateFile(file.toString,
		'''
				package «packageName»;
				
				import java.util.*;
				
				import org.eclipse.emf.ecore.EObject;
				import org.eclipse.emf.ecore.EReference;
				import org.eclipse.xtext.resource.IEObjectDescription;
				import org.eclipse.xtext.scoping.IScope;
				import org.eclipse.xtext.scoping.Scopes;
				
				public class «fileName» extends org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider {
					
					private static final Map<String, Map<String, Map<String, Set<at.ac.tuwien.big.xmlintelledit.intelledit.oclgen.OCLBooleanExpressionEvaluator<?>>>>> map = new HashMap<>();
					
					static {
						Map<String, Map<String, Set<at.ac.tuwien.big.xmlintelledit.intelledit.oclgen.OCLBooleanExpressionEvaluator<?>>>> referencesMap;
						Map<String, Set<at.ac.tuwien.big.xmlintelledit.intelledit.oclgen.OCLBooleanExpressionEvaluator<?>>> eClassesMap;
						Set<at.ac.tuwien.big.xmlintelledit.intelledit.oclgen.OCLBooleanExpressionEvaluator<?>> evaluators;
						
						«FOR entry : referencesToConstraintsMap.entrySet»
							referencesMap = map.computeIfAbsent("«entry.key.getEClass.name»", key -> new HashMap<>());
							eClassesMap = referencesMap.computeIfAbsent("«entry.key.getEReference.name»", key -> new HashMap<>());
								«FOR relevantEntry : entry.value.entrySet»
									evaluators = eClassesMap.computeIfAbsent("«relevantEntry.key.name»", key -> new HashSet<>());
										«FOR constraintName : relevantEntry.value»
											evaluators.add(«validatorPackage».«constraintName»BooleanExpressionEvaluator.INSTANCE);
										«ENDFOR»
								«ENDFOR»
							
						«ENDFOR»
					}
					
					@Override
					public IScope getScope(EObject context, EReference reference) {
						IScope scope = super.getScope(context, reference);
						
						// Workaround by Bill
						StackTraceElement[] els = new Exception().getStackTrace();
						for (int i = 0; i < els.length; ++i) {
							if ("resolveLazyCrossReferences".equals(els[i].getMethodName())) {
								return scope;
							}
						}
						
						Map<String, Map<String, Set<at.ac.tuwien.big.xmlintelledit.intelledit.oclgen.OCLBooleanExpressionEvaluator<?>>>> referencesMap;
						Map<String, Set<at.ac.tuwien.big.xmlintelledit.intelledit.oclgen.OCLBooleanExpressionEvaluator<?>>> eClassesMap;
						Set<at.ac.tuwien.big.xmlintelledit.intelledit.oclgen.OCLBooleanExpressionEvaluator<?>> evaluators;
						
						referencesMap = map.get(context.eClass().getName());
						
						if (referencesMap != null) {
							eClassesMap = referencesMap.get(reference.getName());
							
							if (eClassesMap != null) {
								java.util.List<java.util.Map.Entry<EObject, at.ac.tuwien.big.xmlintelledit.intelledit.oclgen.OCLBooleanExpressionEvaluator[]>> parents = new java.util.ArrayList<>();
								EObject currentObject = context;
								while (currentObject != null) {
									evaluators = eClassesMap.get(currentObject.eClass().getName());
									
									if (evaluators != null && !evaluators.isEmpty()) {
										parents.add(new java.util.AbstractMap.SimpleEntry<>(currentObject, evaluators.toArray(new at.ac.tuwien.big.xmlintelledit.intelledit.oclgen.OCLBooleanExpressionEvaluator[evaluators.size()])));
									}
									
									currentObject = currentObject.eContainer();
								}
								
								if (!parents.isEmpty()) {
									java.util.Iterator<IEObjectDescription> iter = scope.getAllElements().iterator();
									java.util.List<EObject> results = new ArrayList<EObject>();
									
									final Object original = context.eGet(reference, false);
									final boolean deliver = context.eDeliver();
									context.eSetDeliver(false);
									
									try {
										// Mutate and check validations
										while (iter.hasNext()) {
											final IEObjectDescription oDesc = iter.next();
											
											context.eSet(reference, original);
											
											final EObject o = org.eclipse.emf.ecore.util.EcoreUtil.resolve(oDesc.getEObjectOrProxy(), context);
											context.eSet(reference, o);
											
											PARENTS: for (java.util.Map.Entry<EObject, at.ac.tuwien.big.xmlintelledit.intelledit.oclgen.OCLBooleanExpressionEvaluator[]> entry : parents) {
												final EObject parent = entry.getKey();
												for (at.ac.tuwien.big.xmlintelledit.intelledit.oclgen.OCLBooleanExpressionEvaluator evaluator : entry.getValue()) {
													if (!evaluator.isValid(parent)) {
														break PARENTS;
													}	
												}
												results.add(o);
											}
										}
									} finally {
										context.eSet(reference, original);
										context.eSetDeliver(deliver);
									}
									
									// Avoid filtering out all elements and instead deliver the original scope
									if (results.isEmpty()) {
										return scope;
									}
									
									return Scopes.scopeFor(results);
								}
							}
						}
				
						return scope;
					}
				}
			'''
		);
	}
	
}
