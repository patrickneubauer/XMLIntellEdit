package at.ac.tuwien.big.xmlintelledit.intelledit.oclgen;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.EcoreUtil2;

public class OclExtractor {

	public static Map<EClass, Map<String, String>> getAllClassOCLExpressions(Resource ecoreFile) {
		try {
			// TODO: we need to somehow pass that as parameter in or extract from registry?
			EPackage ePackage = (EPackage) Class.forName("at.ac.tuwien.big.forms.FormsPackage").getDeclaredField("eINSTANCE").get(null);
			TreeIterator<EObject> iter = ecoreFile.getAllContents();
			return getAllClassOCLExpressions(iter, ePackage);
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
	
	public static List<OCLBasedQuickfixDefinition> getQuickfixableOCLExpressions(Resource ecoreFile) {
		List<OCLBasedQuickfixDefinition> list = new ArrayList<OCLBasedQuickfixDefinition>();
		Map<EClass, Map<String, String>> expressions = getAllClassOCLExpressions(ecoreFile);

		for (Map.Entry<EClass, Map<String, String>> entry : expressions.entrySet()) {
			final EClass elementClass = entry.getKey();
			
			for (Map.Entry<String, String> expressionEntry : entry.getValue().entrySet()) {
				Set<EStructuralFeature> features = ErrorFeatureFindingVisitor.findFeatures(elementClass, expressionEntry.getValue());
				Iterator<EStructuralFeature> iter = features.iterator();
				EStructuralFeature feature;
				
				if (features.size() == 1 && iter.hasNext() && (feature = iter.next()) instanceof EAttribute) {
					EAttribute attribute = (EAttribute) feature;
					Class<?> clazz = attribute.getEType().getInstanceClass();
					
					// We only support boolean for now
					if (clazz != boolean.class && clazz != Boolean.class) {
						continue;
					}
					
					list.add(new OCLBasedQuickfixDefinition(expressionEntry.getKey(), elementClass, attribute));
				}
			}
		}
		
		return list;
	}
	
	public static Map<EClassReference, Map<EClass, Set<String>>> getScopingOCLExpressions(Resource ecoreFile) {
		// For each reference the relevant OCL expressions
		Map<EClassReference, Map<EClass, Set<String>>> map = new TreeMap<>();
		
		try {
			Map<EClass, Map<String, String>> expressions = getAllClassOCLExpressions(ecoreFile);
			Map<EClassReference, Set<ScopingOCLConstraintEntry>> scopingConstraintEntries = new HashMap<>();
			
			for (Map.Entry<EClass, Map<String, String>> entry : expressions.entrySet()) {
				final EClass eClass = entry.getKey();
				for (Map.Entry<String, String> expressionEntry : entry.getValue().entrySet()) {
					final String constraintName = expressionEntry.getKey();
					Set<EClassReference> relevant = RelevantReferencesFindingVisitor.findRelevantReferences(eClass, expressionEntry.getValue());
					
					for (EClassReference ref : relevant) {
						Set<ScopingOCLConstraintEntry> constraintEntries = scopingConstraintEntries.computeIfAbsent(ref, key -> new HashSet<>());
						constraintEntries.add(new ScopingOCLConstraintEntry(eClass, constraintName));
					}
				}
			}
	
			for (Map.Entry<EClass, Map<String, String>> entry : expressions.entrySet()) {
				EClass eClass = entry.getKey();
				List<EReference> references = eClass.getEAllReferences();
				
				for (EReference ref : references) {
					for (EClass currentEClass : EcoreUtil2.getCompatibleTypesOf(eClass)) {
						if (!ref.getEContainingClass().isSuperTypeOf(currentEClass)) {
							continue;
						}
						
						Map<EClass, Set<String>> relevantMap = new TreeMap<>(Comparator.comparing(EClass::getInstanceClassName));
						EClassReference eClassRef = new EClassReference(ref.getEContainingClass(), ref);
						Set<ScopingOCLConstraintEntry> constraintEntries = scopingConstraintEntries.get(eClassRef);
						
						// Only consider references that occur in OCL expressions
						if (constraintEntries != null && !constraintEntries.isEmpty()) {
							for (ScopingOCLConstraintEntry scopingEntry : constraintEntries) {
								Set<String> constraintNames = relevantMap.computeIfAbsent(scopingEntry.getEClass(), key -> new TreeSet<>());
								constraintNames.add(scopingEntry.getConstraintName());
							}
							
							map.put(new EClassReference(currentEClass, ref), relevantMap);
						}
					}
				}
			}
			
			return map;
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
	
	public static Resource getEcore(File ecoreFile) {
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource.Factory.Registry reg = resourceSet.getResourceFactoryRegistry();		
		reg.getExtensionToFactoryMap().put(
				"xmi", 
				new XMIResourceFactoryImpl());
		reg.getExtensionToFactoryMap().put(
				"ecore", 
				new EcoreResourceFactoryImpl());
		
		//Register ecore file
		final ExtendedMetaData extendedMetaData = new BasicExtendedMetaData(resourceSet.getPackageRegistry());
		resourceSet.getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, extendedMetaData);

		Resource ecoreResource = resourceSet.getResource(URI.createFileURI(ecoreFile.getAbsolutePath()), true);
		return ecoreResource;
	}

	private static Map<EClass, Map<String, String>> getAllClassOCLExpressions(TreeIterator<EObject> iter, EPackage ePackage) {
		Map<EClass, Map<String, String>> ret = new HashMap<>();
		while (iter.hasNext()) {
			EObject cur = iter.next();

			// Fix the XMI generated EClasses
			if (cur instanceof EClassifier) {
				EClassifier cls = (EClassifier) cur;
				cls.setInstanceClass(ePackage.getEClassifier(cls.getName()).getInstanceClass());
			}
			if (!(cur instanceof EClass)) {
				continue;
			}

			EClass eclass = (EClass) cur;

			Map<String, String> constraintMap = new TreeMap<String, String>();
			ret.put(eclass, constraintMap);
			int constraintNr = 1;
			for (EAnnotation eann : eclass.getEAnnotations()) {
				if (eann.getSource() == null) {
					continue;
				}
				if (!eann.getSource().startsWith("http://www.eclipse.org/emf/2002/Ecore/OCL")) {
					// Not an OCL expression
					continue;
				}
				String constraintName = null;
				String oclExpr = null;
				for (Entry<String, String> entry : eann.getDetails().entrySet()) {
					constraintName = entry.getKey();
					oclExpr = entry.getValue();
					// System.out.println("Constraint "+ constraintName+" for "
					// + eclass.getName()+": "+oclExpr);
					if (constraintName == null) {
						constraintName = "Constraint" + constraintNr;
					}
					constraintMap.put(constraintName, oclExpr);
					++constraintNr;
				}

			}
		}
		return ret;
	}

}
