package at.ac.tuwien.big.xmlintelledit.intelledit.oclgen

import java.io.File
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

class OCL2ValidatorGenerator implements IGenerator {
	
	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		
		// TODO: This should be configurable
		val ecorePackageName = 'at.ac.tuwien.big.forms';
		val packageName = ecorePackageName + '.form.validation.ocl';
		val classOclExpressions = OclExtractor.getAllClassOCLExpressions(resource);

		for (classOclExpressionEntry : classOclExpressions.entrySet().filter(e | e.value.size() > 0)) {
			val className = classOclExpressionEntry.key.name;
			val validatorClassName = classOclExpressionEntry.key.name + 'Validator';
			val name = new File(packageName.replaceAll("\\.", "\\/") + "/" + validatorClassName + '.xtend');
			
			// TODO: Can we find out the structural feature that causes the error?
			val packageClassName = classOclExpressionEntry.key.getEPackage.name.toFirstUpper + "Package";
			val classNameLiteral = className.toUpperCase;
			// import «ecorePackageName».«packageClassName»;
			// «packageClassName».Literals.«classNameLiteral»
		
		
			for (oclExpressionEntry : classOclExpressionEntry.value.entrySet()) {
				val evaluatorClassName = oclExpressionEntry.key + 'BooleanExpressionEvaluator';
				val validatorFile = new File(packageName.replaceAll("\\.", "\\/") + "/" + evaluatorClassName + '.java');
				fsa.generateFile(
					validatorFile.toString,
					'''
						package «packageName»;
						
						import java.util.Map;
						import java.util.Set;
						import org.eclipse.emf.ecore.EClass;
						import org.eclipse.emf.ecore.EPackage;
						import org.eclipse.emf.ecore.EObject;
						import org.eclipse.emf.ecore.EStructuralFeature;
						import «ecorePackageName».«className»;
						
						public class «evaluatorClassName» implements at.ac.tuwien.big.xmlintelledit.intelledit.oclgen.OCLBooleanExpressionEvaluator<«className»> {
							
							public static final at.ac.tuwien.big.xmlintelledit.intelledit.oclgen.OCLBooleanExpressionEvaluator<«className»> INSTANCE = new «evaluatorClassName»();
							
							@Override
							public boolean isValid(«className» self) {
								final EPackage ePackage = self.eClass().getEPackage();
								final org.eclipse.ocl.EvaluationEnvironment evalEnv = org.eclipse.ocl.ecore.EcoreEnvironmentFactory.INSTANCE.createEvaluationEnvironment();
								final Map<EClass, Set<EObject>> extents = new org.eclipse.ocl.LazyExtentMap<EClass, EObject>((EObject) self) {
								
									// implements the inherited specification
									@Override
									protected boolean isInstance(EClass cls, EObject element) {
										return cls.isInstance(element);
									}
								};
						«OCL2JavaVisitor.toJava(classOclExpressionEntry.key, oclExpressionEntry.value.replaceAll("\\r|\\n", "").trim())»
							}
							
							@Override
							public EStructuralFeature findErrorFeature(«className» self) {
								return «ErrorFeatureFindingVisitor.findFeature(classOclExpressionEntry.key, oclExpressionEntry.value.replaceAll("\\r|\\n", "").trim())»;
							}
							
						}
					'''
					)
			}
		
			fsa.generateFile(
				name.toString,
				'''
				package «packageName»;
				
				import org.eclipse.xtext.validation.Check;
				import org.eclipse.xtext.validation.EValidatorRegistrar;
				import java.util.ArrayList;
				import org.eclipse.emf.ecore.EPackage;
				import org.eclipse.emf.ecore.EAttribute;
				import org.eclipse.emf.ecore.EStructuralFeature;
				import «ecorePackageName».«className»;
				
				import at.ac.tuwien.big.xmlintelledit.intelledit.oclgen.OCL2QuickfixSupport;
				import at.ac.tuwien.big.xmlintelledit.intelledit.oclgen.OCLBasedValidationQuickfix;
				
				public class «validatorClassName» extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {
					
					override void register(EValidatorRegistrar registrar) {
						// Do nothing to prevent registration and duplicate validation messages
					}
					
					override java.util.List<EPackage> getEPackages() {
					    val result = new ArrayList<EPackage>();
					    result.add(EPackage.Registry.INSTANCE.getEPackage("«classOclExpressionEntry.key.getEPackage.nsURI»"));
						return result;
					}
					
					def static EPackage getPackage() {
						return EPackage.Registry.INSTANCE.getEPackage("«classOclExpressionEntry.key.getEPackage.nsURI»");
					}
					«FOR oclExpressionEntry : classOclExpressionEntry.value.entrySet()»
						
						public static final String «oclExpressionEntry.key.toUpperCase»_ISSUE_KEY = "«oclExpressionEntry.key»Error";
						private static final at.ac.tuwien.big.xmlintelledit.intelledit.oclgen.OCLBooleanExpressionEvaluator<«className»> evaluator«oclExpressionEntry.key» = «packageName».«oclExpressionEntry.key»BooleanExpressionEvaluator.INSTANCE;
						
						@Check
						def void check«oclExpressionEntry.key»(«className» o) {
							if (!evaluator«oclExpressionEntry.key».isValid(o)) {
								val EStructuralFeature feature = evaluator«oclExpressionEntry.key».findErrorFeature(o);
								val userData = new ArrayList<String>();
								
								// We do this at runtime because later we might want to find out the error feature more dynamically
								if (feature != null && feature instanceof EAttribute) {
									val EAttribute attribute = feature as EAttribute;
									val Class<?> clazz = attribute.getEAttributeType().getInstanceClass();
									val list = new ArrayList<OCLBasedValidationQuickfix>();
									
									// Right now we only support boolean quickfixes
									if (clazz == boolean || clazz == Boolean) {
										val Boolean oldValue = o.eGet(feature, false) as Boolean;
										
										if (oldValue == null) {
											list.add(OCLBasedValidationQuickfix.fromValue(true, attribute.name));
											list.add(OCLBasedValidationQuickfix.fromValue(false, attribute.name));
										} else {
											if (Boolean.FALSE.equals(oldValue)) {
												list.add(OCLBasedValidationQuickfix.fromValue(true, attribute.name));
											} else if (Boolean.TRUE.equals(oldValue)) {
												list.add(OCLBasedValidationQuickfix.fromValue(false, attribute.name));
											}
											
											if (!feature.isRequired()) {
												list.add(OCLBasedValidationQuickfix.fromValue(null, attribute.name));
											}
										}
									}
									
									// Maybe we should remove validation since it could lead to filtering out quickfixes that could make sense locally
									if (!list.empty) {
										val original = o.eGet(feature, false);
										val deliver = o.eDeliver();
										o.eSetDeliver(false);
										
										try {
											for (quickfix : list) {
												quickfix.apply(o, attribute);
												if (evaluator«oclExpressionEntry.key».isValid(o)) {
													userData.add(OCL2QuickfixSupport.toString(quickfix));
												}
											}
										} finally {
											o.eSet(feature, original);
											o.eSetDeliver(deliver);
										}
									}
								}
								
								error("The OCL-Expression named '«oclExpressionEntry.key»' evaluated to false!", feature, «oclExpressionEntry.key.toUpperCase»_ISSUE_KEY, userData.toArray(newArrayOfSize(userData.size())));
							}
						}
					«ENDFOR»
				}'''	
			)
		}
	}
}
