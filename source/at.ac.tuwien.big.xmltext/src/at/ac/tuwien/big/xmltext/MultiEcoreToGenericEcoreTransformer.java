package at.ac.tuwien.big.xmltext;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;
import java.util.WeakHashMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.GenericXMLResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.xsd.XSDDiagnostic;
import org.eclipse.xsd.XSDImport;
import org.eclipse.xsd.XSDInclude;
import org.eclipse.xsd.XSDSchema;
import org.eclipse.xsd.XSDSchemaContent;
import org.eclipse.xsd.XSDSchemaDirective;
import org.eclipse.xsd.ecore.XSDEcoreBuilder;

import at.ac.tuwien.big.xmltext.ecoretransform.impl.TransformatorImpl;
import at.ac.tuwien.big.xmltext.ecoretransform.impl.TransformatorStructure;
import at.ac.tuwien.big.xmltext.ecoretransform.impl.TypeTransformatorStore;

public class MultiEcoreToGenericEcoreTransformer {

	private List<Resource> ecoreResource = new ArrayList<Resource>();
	private List<Resource> result = new ArrayList<Resource>();
	private ResourceSet resourceSet;
	private String targetName;
	private EClass rootClass;
	private TransformatorStructure struct;
	private Map<String,EPackage> allpkg = new HashMap<>();
	
	
	public void addXsdEcore(String xsdPath) {
		try {
			addXsdEcore(URI.createFileURI(xsdPath));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	XSDEcoreBuilder xsdEcoreBuilder = new XSDEcoreBuilder();
	
	private Set<URI> loaded = new HashSet<URI>();
	private Set<URI> loaded2 = new HashSet<URI>();
	
	public String appendToUri(String fileuri, String appendix) {
		if (appendix.contains(":/")) {
			return appendix;
		}
		String[] sl = appendix.split("[/]");
		String str = fileuri.substring(0,fileuri.lastIndexOf("/"));
		System.out.println(Arrays.toString(sl));
		for (int i = 0; i < sl.length; ++i) {
			System.out.println(str);
			if ("..".equals(sl[i])) {
				str = str.substring(0,str.lastIndexOf("/"));
			} else if (".".equals(sl[i])) {
				//do nothing, current dir
			} else {
				str = str + "/"+sl[i];
			}
		}
		return str;
	}
	
	public String normalizedURI(String uri) {
		return URIConverter.INSTANCE.normalize(URI.createURI(uri)).toString();
	}
	
	public void addXsdEcore(URI xsdPath) {
		if (resourceSet == null) {
			resourceSet = new ResourceSetImpl();
		}
		if (!loaded.add(xsdPath)) {
			return;
		}
		xsdEcoreBuilder.setValidate(true);
		Collection<Resource> generatedResourcesS = xsdEcoreBuilder.generateResources(xsdPath);
		
		for (XSDDiagnostic diag: xsdEcoreBuilder.getDiagnostics()) {
	    	   System.err.println("XML Error in " +diag.getLine()+" of "+diag.getLocationURI()+":" +diag.getMessage());
		}
		XSDSchema schema = xsdEcoreBuilder.getRootSchema();


		   if (schema.getAllDiagnostics().isEmpty())
		   {
			   schema.validate();
		   }
		   if (schema.getAllDiagnostics().isEmpty())
		   {
		       /* No Unresolved directives */
		   }
		   else
		   {
		       for (XSDDiagnostic diag: schema.getAllDiagnostics()) {
		    	   System.err.println("XML Error in " +diag.getLine()+" of "+diag.getLocationURI()+":" +diag.getMessage());
		       }
		   }
		List<Resource> generatedResources = new ArrayList<Resource>(generatedResourcesS);
		/*Set<XSDSchema> allSchemas = new HashSet<>();
		Stack<XSDSchema> requireDo = new Stack<>();
		requireDo.add(schema);
		XSDSchema doS = requireDo.pop();
		for (XSDSchemaContent cont: doS.getContents()) {
			if (cont instanceof XSDImport) {
				XSDImport incl = (XSDImport)cont;
				incl.resolveTypeDefinition(incl.getNamespace(),"");
				XSDSchema schema2 = incl.getResolvedSchema();
				String str = xsdPath.toString();
				str = appendToUri(normalizedURI(str), incl.getSchemaLocation());
				URI newURI = URIConverter.INSTANCE.normalize(URI.createURI(str));
				System.out.println("Generated URI: "+newURI);
				addXsdEcore(newURI);
				
			}
			if (cont instanceof XSDInclude) {
				XSDInclude incl = (XSDInclude)cont;
				//incl.resolveTypeDefinition(incl.getNamespace(),"");
				XSDSchema schema2 = incl.getResolvedSchema();
				String str = xsdPath.toString();
				str = appendToUri(str, incl.getSchemaLocation());
				URI newURI = URIConverter.INSTANCE.normalize(URI.createURI(str));
				System.out.println("Generated URI: "+newURI);
				addXsdEcore(newURI);
			}
		}*/

		List<EPackage> genPkgs = new ArrayList<>();
		for (Entry<String,EPackage> entry: xsdEcoreBuilder.getTargetNamespaceToEPackageMap().entrySet()) {
			if (allpkg.putIfAbsent(entry.getValue().getNsURI(), entry.getValue()) == null)  {
				EPackage generatedPackage = entry.getValue();
				EPackage alternative = (EPackage) EPackageRegistryImpl.INSTANCE.putIfAbsent(generatedPackage.getNsURI(),
			            generatedPackage);
			    	System.out.println("Alternative to "+generatedPackage+": "+alternative);
			    	if (alternative == null)  {
				    	resourceSet.getPackageRegistry().put(generatedPackage.getNsURI(),
				            generatedPackage);
				        genPkgs.add(generatedPackage);
						System.out.println("Adding resource with URI "+generatedPackage.eResource().getURI());
						addXsdEcore(generatedPackage.eResource());
			    	} else {
						System.out.println("Adding ALTERNATIVE resource with URI "+generatedPackage.eResource().getURI());
						addXsdEcore(alternative.eResource());
			    		
			    	}
				//System.out.println("Associating "+entry.getValue().getNsURI()+" to "+entry.getValue());
				//addXsdEcore(entry.getValue().eResource());
			}
		}
		// register the packages loaded from XSD
		/*for (Resource res: generatedResources) {
			if (!loaded2.add(URIConverter.INSTANCE.normalize(res.getURI()))) {
				continue;
			}
			resourceSet.getResources().add(res);
			System.out.println("Have resource "+res);
			
			for (Object generatedEObject : (Iterable<EObject>)()->res.getAllContents()) {
			    if (generatedEObject instanceof EPackage) {
			    	EPackage generatedPackage = (EPackage) generatedEObject;
			    	System.out.println("Associating package "+generatedPackage.getNsURI()+" with "+generatedPackage);
			    	//TODO: Hier setze ich Sachen in die Global Registry, aber warum reicht das normale nicht aus?!
			    	
			    	EPackage alternative = (EPackage) EPackageRegistryImpl.INSTANCE.putIfAbsent(generatedPackage.getNsURI(),
			            generatedPackage);
			    	System.out.println("Alternative to "+generatedPackage+": "+alternative);
			    	if (alternative == null)  {
				    	resourceSet.getPackageRegistry().put(generatedPackage.getNsURI(),
				            generatedPackage);
				        genPkgs.add(generatedPackage);
						System.out.println("Adding resource with URI "+res.getURI());
						addXsdEcore(res);
			    	}
			    }
			}
		}*/
	}
	
	public void addXsdEcore(Resource ecoreResource) {
		if (resourceSet == null) {
			resourceSet = ecoreResource.getResourceSet();
		}
		if (!this.ecoreResource.contains(ecoreResource) && !resourceSet.getResources().contains(ecoreResource)) {
			resourceSet.getResources().add(ecoreResource);
		}
		this.ecoreResource.add(ecoreResource);
		
	}
	
	public void setTargetFilename(String targetName) {
		this.targetName = targetName;
	}
	

	public Resource loadXml(String xmlPath) {
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml", new GenericXMLResourceFactoryImpl());
		URI uri;
		try {
			uri = resourceSet.getURIConverter().normalize(URI.createFileURI(new File(xmlPath).getCanonicalFile().toString()));
			
			Resource resource = resourceSet.getResource(uri,true);
			resource.load(Collections.EMPTY_MAP);
			return simplifyInstance(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	private WeakHashMap<Resource, TransformatorImpl> transformators = new WeakHashMap<Resource, TransformatorImpl>();
	
	public TransformatorImpl getTransformator(Resource xmlRes) {
		TransformatorImpl ret = transformators.get(xmlRes);
		if (ret == null) {
			transformators.put(xmlRes, ret = new TransformatorImpl(struct));
		}
		return ret;
	}
	
	public Resource simplifyInstance(Resource xmlXmi) {
		Resource ret = new XMIResourceImpl(xmlXmi.getResourceSet().getURIConverter().normalize(URI.createURI(xmlXmi.getURI().toString()+".simple.xmi"))); // TODO: why this extension? Does it need to be equivalent to the one provided by the user?
		xmlXmi.getResourceSet().getResources().add(ret);
		TransformatorImpl trans = getTransformator(xmlXmi);
		trans.xmlToEcore(xmlXmi, ret);
		return ret;
	}
	
	public void rebuildXml(Resource ecore, Resource xml) {
		getTransformator(xml).ecoreToXml(ecore, xml);
	}
	
	
	
	private void calcResult() {
		// XSD --> Ecore
		struct = TransformatorStructure.fromXmlEcores(new TypeTransformatorStore(),
				resourceSet,
				ecoreResource, targetName);
		struct.getIdAttribute();
		rootClass = struct.getEcoreRoot();
		this.result = struct.getEcoreResources();
	}
	
	public void saveResult() {
		try {
			int ind = 0;
			for (Resource res: result) {
				if (res == null) {continue;}
				new File(targetName).mkdirs();
				System.out.println(targetName);
				System.out.println(res.getURI());
				System.out.println(res.getURI().lastSegment());
				String last = res.getURI().lastSegment();
				if (last == null) {
					last = String.valueOf(res.getURI()).replace(":", "")+".ecore";
				} else {
					last = last;
				}
				res.save(new FileOutputStream(targetName+File.separator+last), null);
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
	public List<Resource> getResult() {
		if (result == null || result.isEmpty()) {
			calcResult();
		}
		return result;
	}
	
	public EClass getRootClass() {
		if (result == null) {
			calcResult();
		}
		return rootClass;
	}
	
	public TransformatorImpl getInstanceTransformer(String xmlPath) {
		Resource xmiRes = new XMIResourceImpl();
		return getInstanceTransformer(resourceSet.getResource(URI.createFileURI(xmlPath), true),
				xmiRes);
	}
	
	public TransformatorImpl getInstanceTransformer(Resource xmlInstance, Resource emptyEcoreInstance) {
		AnyType s;
		TransformatorImpl ret = new TransformatorImpl(struct);
		ret.xmlToEcore(xmlInstance, emptyEcoreInstance);
		return ret;
	}
	
	public Resource getEcoreInstance(Resource xmlInstance) {
		TransformatorImpl ret = new TransformatorImpl(struct);
		Resource ecoreInstance = new XMIResourceImpl();
		ret.xmlToEcore(xmlInstance,ecoreInstance);
		return ecoreInstance;
	}

}
