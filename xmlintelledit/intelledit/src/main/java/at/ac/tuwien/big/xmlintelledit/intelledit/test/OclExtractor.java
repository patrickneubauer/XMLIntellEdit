package at.ac.tuwien.big.xmlintelledit.intelledit.test;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.mwe.utils.StandaloneSetup;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.ecore.OCL.Helper;
import org.eclipse.ocl.ecore.OCLExpression;
import org.eclipse.ocl.ecore.TupleLiteralExp;
import org.eclipse.ocl.ecore.delegate.OCLDelegateDomain;
import org.eclipse.ocl.ecore.delegate.OCLInvocationDelegateFactory;
import org.eclipse.ocl.ecore.delegate.OCLSettingDelegateFactory;


public class OclExtractor {
	
	static {
		//Just to be able to call everything for OCL
		new StandaloneSetup().setPlatformUri("./");
//		CompleteOCLStandaloneSetup.doSetup();
//		OCLinEcoreStandaloneSetup.doSetup();
//		OCLstdlibStandaloneSetup.doSetup();
		String oclDelegateURI = OCLDelegateDomain.OCL_DELEGATE_URI;
		EOperation.Internal.InvocationDelegate.Factory.Registry.INSTANCE.put(oclDelegateURI,
			new OCLInvocationDelegateFactory.Global());
		EStructuralFeature.Internal.SettingDelegate.Factory.Registry.INSTANCE.put(oclDelegateURI,
			new OCLSettingDelegateFactory.Global());
		OCL.initialize(null);
	}
	
	
	public static Map<String,OCLExpression> convertToExpression(Helper oclHelper, EClass context, Map<String,String> map) {
		Map<String, OCLExpression> expr = new HashMap<String, OCLExpression>();
		for (Entry<String,String> subEntr: map.entrySet()) {
			oclHelper.setContext(context);
			try {
				OCLExpression oclexpr = oclHelper.createQuery(subEntr.getValue());					
				expr.put(subEntr.getKey(), oclexpr);
			} catch (ParserException ex) {
				String str = Arrays.toString(ex.getStackTrace()).replace(",", "\n");
				System.out.println(str);
				throw new RuntimeException(ex);
			}
			
		}
		return expr;
	}
	
	public static OCLExpression[] getSubThings(OCLExpression base) {
		if (base instanceof org.eclipse.ocl.ecore.PropertyCallExp) {
			org.eclipse.ocl.ecore.PropertyCallExp pe = (org.eclipse.ocl.ecore.PropertyCallExp)base;
			if (!"status".equals(pe.getReferredProperty().getName())) {
				return new OCLExpression[]{base,null,null};
			}
			if (pe.getSource() instanceof TupleLiteralExp) {
				TupleLiteralExp tle = (TupleLiteralExp)pe.getSource();
				OCLExpression[] ret = new OCLExpression[3];
				for (org.eclipse.ocl.expressions.TupleLiteralPart<EClassifier, EStructuralFeature> part: tle.getPart()) {
					if ("status".equals(part.getAttribute().getName())) {
						ret[0] = (OCLExpression) part.getValue();
					} else if ("message".equals(part.getAttribute().getName())) {
						ret[1] = (OCLExpression) part.getValue();
					} else if ("??".equals(part.getAttribute().getName())) { //TODO: Implement me: severity ...
						ret[2] = (OCLExpression) part.getValue();
					}
				}
				return ret;
			}
		}
		return new OCLExpression[]{base,null,null};
	}

	
	public static Map<String,OCLExpression[]> convertToExpressionMsg(Helper oclHelper, EClass context, Map<String,String> map) {
		Map<String, OCLExpression[]> expr = new HashMap<>();
		for (Entry<String,String> subEntr: map.entrySet()) {
			oclHelper.setContext(context);
			try {
				OCLExpression[] ret = new OCLExpression[2];
				OCLExpression oclexpr = oclHelper.createQuery(subEntr.getValue());
				ret = getSubThings(oclexpr);
				expr.put(subEntr.getKey(), ret);
			} catch (ParserException ex) {
				String str = Arrays.toString(ex.getStackTrace()).replace(",", "\n");
				System.out.println(str);
				throw new RuntimeException(ex);
			}
			
		}
		return expr;
	}
	

	public static Map<EClass, Map<String, OCLExpression>> getAllOCLExpressions(Map<EClass, Map<String,String>> map) {
		Map<EClass, Map<String,OCLExpression>> ret = new HashMap<EClass, Map<String,OCLExpression>>();
		OCL ocl = OCL.newInstance();
		Helper oclHelper = ocl.createOCLHelper();
		
		for (Entry<EClass, Map<String,String>> entr: map.entrySet()) {
			Map<String,OCLExpression> expr = convertToExpression(oclHelper, entr.getKey(), entr.getValue());
			ret.put(entr.getKey(), expr);
		}
		return ret;
	}
	
	public static Map<EClass, Map<String, String>> getAllClassOCLExpressions(Resource ecoreFile) {
		try {
			// TODO: we need to somehow pass that as parameter in or extract from registry?
			EPackage ePackage = (EPackage)ecoreFile.getContents().get(0);
			/*try {
				ePackage = (EPackage) Class.forName("at.ac.tuwien.big.forms.FormsPackage").getDeclaredField("eINSTANCE").get(null);
			} catch (Exception e) {
				
			}*/
			TreeIterator<EObject> iter = ecoreFile.getAllContents();
			return getAllClassOCLExpressions(iter, ePackage);
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
	
	public static Map<EClass, Map<String, OCLExpression>> getAllClassAndSubClassOCLExpressions(Resource ecoreFile) {
		return getAllClassAndSubclassOCLExpressions(ecoreFile, getAllOCLExpressions(getAllClassOCLExpressions(ecoreFile)));
	}
	
	public static Map<EClass, Map<String, OCLExpression>> getAllClassAndSubclassOCLExpressions(Resource res, Map<EClass, Map<String, OCLExpression>> oclExprs) {
		Map<EClass,Set<EClass>> subClasses = new HashMap<EClass, Set<EClass>>();
		 Map<EClass, Map<String, OCLExpression>> ret = new HashMap<EClass, Map<String,OCLExpression>>();
		for (EObject eobj: (Iterable<EObject>)()->res.getAllContents()) {
			if (eobj instanceof EClass) {
				EClass cl = (EClass)eobj;
				Set<EClass> scl = subClasses.get(cl);
				if (scl == null){
					subClasses.put(cl, scl = new HashSet<EClass>());
				}
				scl.add(cl);
				for (EClass supcl: cl.getEAllSuperTypes()) {
					Set<EClass> scl2 = subClasses.get(supcl);
					if (scl2 == null){
						subClasses.put(supcl, scl2 = new HashSet<EClass>());
					}
					scl2.add(cl);
				}
			}
		}
		for (Entry<EClass, Map<String, OCLExpression>> entry: oclExprs.entrySet()) {
			EClass cl = entry.getKey();
			for (EClass subCl: subClasses.get(cl)) {
				Map<String, OCLExpression> subret = ret.get(subCl);
				if (subret == null) {
					ret.put(subCl, subret = new HashMap<String, OCLExpression>());
				}
				for (Entry<String,OCLExpression> myEntry: entry.getValue().entrySet()) {
					String name = myEntry.getKey();
					if (subret.containsKey(name)) {
						int ind = 1;
						while (subret.containsKey(name+"_"+ind)) {
							++ind;
						}
						name = name+"_"+ind;
					}
					subret.put(name, myEntry.getValue());
				}
			}
		}
		return ret;
	}
	
	public static Resource getEcore(String ecoreFile) {
		return getEcore(new File(ecoreFile));
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

		Resource ecoreResource = resourceSet.getResource(resourceSet.getURIConverter().normalize(URI.createFileURI(ecoreFile.getAbsolutePath())), true);
		for (EObject eobj: (Iterable<EObject>)()->ecoreResource.getAllContents()) {
			if (eobj instanceof EPackage) {
				String uri = ((EPackage) eobj).getNsURI();
				System.out.println("Register package "+uri+" ==> "+eobj);
				resourceSet.getPackageRegistry().put(uri, eobj);
				EPackage.Registry.INSTANCE.put(uri, eobj);
			}
		}
		return ecoreResource;
	}
	
	public static Resource getXMI(String xmiFile, Resource ecoreRes) {
		return getXMI(new File(xmiFile), ecoreRes);
	}
	
	public static Resource getXMI(File xmiFile, Resource ecoreRes) {
		Resource xmiResource = null;
		try {
			xmiResource = ecoreRes.getResourceSet().getResource(ecoreRes.getResourceSet().getURIConverter().normalize(URI.createFileURI(xmiFile.getCanonicalPath())), true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return xmiResource;
	}
	
	
	public static Map<String, String> getConstraintMap(EClass eclass) {
		Map<String, String> constraintMap = new TreeMap<String, String>();
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
				if (constraintName == null || "".equals(constraintName)) {
					constraintName = "Constraint" + constraintNr;
				}
				if (constraintMap.containsKey(constraintName)) {
					int ind = 1;
					while (constraintMap.containsKey(constraintName+"_"+ind)) {
						++ind;
					}
					constraintName = constraintMap+"_"+ind;
				}
				constraintName = eclass.getName()+"."+constraintName;
				constraintMap.put(constraintName, oclExpr);
				++constraintNr;
			}
		}
		return constraintMap;
	}
	


	private static Map<EClass, Map<String, String>> getAllClassOCLExpressions(TreeIterator<EObject> iter, EPackage ePackage) {
		Map<EClass, Map<String, String>> ret = new HashMap<>();
		while (iter.hasNext()) {
			EObject cur = iter.next();

			// Fix the XMI generated EClasses
			if (cur instanceof EClassifier) {
				EClassifier cls = (EClassifier) cur;
				EClassifier base = ePackage.getEClassifier(cls.getName());
				if (base != null && base.getInstanceClass() != null) {
					cls.setInstanceClass(base.getInstanceClass());
				}
			}
			if (!(cur instanceof EClass)) {
				continue;
			}

			EClass eclass = (EClass) cur;
			Map<String, String> constraintMap = getConstraintMap(eclass);
			ret.put(eclass, constraintMap);
			
		}
		return ret;
	}

}
