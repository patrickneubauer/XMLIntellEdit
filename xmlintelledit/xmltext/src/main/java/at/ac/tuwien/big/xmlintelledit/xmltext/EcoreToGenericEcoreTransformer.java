package at.ac.tuwien.big.xmlintelledit.xmltext;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.GenericXMLResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.xsd.ecore.XSDEcoreBuilder;

import at.ac.tuwien.big.xmlintelledit.xmltext.ecoretransform.impl.TransformatorImpl;
import at.ac.tuwien.big.xmlintelledit.xmltext.ecoretransform.impl.TransformatorStructure;
import at.ac.tuwien.big.xmlintelledit.xmltext.ecoretransform.impl.TypeTransformatorStore;

public class EcoreToGenericEcoreTransformer {

	private Resource ecoreResource;
	private Resource result;
	private String targetName;
	private EClass rootClass;
	private TransformatorStructure struct;
	
	private static URI createFileURI(String path) {
		return new ResourceSetImpl().getURIConverter().normalize(URI.createFileURI(path));
	}
	
	public void setXsdEcore(String xsdPath) {
		setXsdEcore(createFileURI(xsdPath));
	}
	
	public void setXsdEcore(URI xsdPath) {
		ResourceSet resourceSet = new ResourceSetImpl();
		//resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xsd", new XSDResourceFactoryImpl());
		XSDEcoreBuilder xsdEcoreBuilder = new XSDEcoreBuilder();
		Collection<Resource> generatedResources = xsdEcoreBuilder.generateResources(xsdPath);
		List<EPackage> genPkgs = new ArrayList<>();
		// register the packages loaded from XSD
		Resource ret = null;
		for (Resource res: generatedResources) {
			for (Object generatedEObject : (Iterable<EObject>)()->res.getAllContents()) {
			    if (generatedEObject instanceof EPackage) {
			    	if (ret == null) {
			    		ret = res;
			    	}
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
						resourceSet.getResources().add(res);
			    	}
			    }
			}
		}
		try {
			ret = resourceSet.getResource(xsdPath, true);
		} catch (Exception e) {
			System.err.println("Could not get correct resource");
		}
		setXsdEcore(ret);
	}
	
	public void setXsdEcore(Resource ecoreResource) {
		this.ecoreResource = ecoreResource;
		
	}
	
	public void setTargetFilename(String targetName) {
		this.targetName = targetName;
	}
	

	public Resource loadXml(String xmlPath) {
		ResourceSet resourceSet = ecoreResource.getResourceSet();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml", new GenericXMLResourceFactoryImpl());
		URI uri = resourceSet.getURIConverter().normalize(URI.createFileURI(xmlPath));
		Resource resource = resourceSet.getResource(uri,true);
		try {
			resource.load(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return simplifyInstance(resource);
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
		Resource ret = new XMIResourceImpl(xmlXmi.getResourceSet().getURIConverter().normalize(URI.createURI(xmlXmi.getURI().toString()+".simple.xmi")));
		xmlXmi.getResourceSet().getResources().add(ret);
		TransformatorImpl trans = getTransformator(xmlXmi);
		trans.xmlToEcore(xmlXmi, ret);
		return ret;
	}
	
	public void rebuildXml(Resource ecore, Resource xml) {
		getTransformator(xml).ecoreToXml(ecore, xml);
	}
	
	public void setResult(Resource ecoreResult) {
		struct = TransformatorStructure.withKnownResult(new TypeTransformatorStore(), 
				ecoreResource.getResourceSet(),
				ecoreResource, ecoreResult);
		struct.getIdAttribute();
		rootClass = struct.getEcoreRoot();
		this.result = ecoreResult;
	}
	 
	
	private void calcResult() {
		// XSD --> Ecore
		struct = TransformatorStructure.fromXmlEcore(new TypeTransformatorStore(),
				ecoreResource.getResourceSet(),
				ecoreResource, targetName);
		struct.getIdAttribute();
		rootClass = struct.getEcoreRoot();
		this.result = struct.getEcoreResources().iterator().next();
		if (result.getResourceSet() == null) {
			ecoreResource.getResourceSet().getResources().add(result);
		}
	}
	
	public void saveResult() {
		try {
			getResult().save(new FileOutputStream(targetName), null);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
	public Resource getResult() {
		if (result == null) {
			calcResult();
		}
		return result;
	}
	
	public Resource getXSD() {
		return ecoreResource;
	}
	
	public EClass getRootClass() {
		if (result == null) {
			calcResult();
		}
		return rootClass;
	}
	
	public TransformatorImpl getInstanceTransformer(String xmlPath) {
		Resource xmiRes = new XMIResourceImpl();
		return getInstanceTransformer(getResult().getResourceSet().getResource(URI.createFileURI(xmlPath), true),
				xmiRes);
	}
	
	public TransformatorImpl getInstanceTransformer(Resource xmlInstance, Resource emptyEcoreInstance) {
		TransformatorImpl ret = new TransformatorImpl(struct);
		ret.xmlToEcore(xmlInstance, emptyEcoreInstance);
		return ret;
	}
	
	public TransformatorImpl newInstanceTransformer() {
		return new TransformatorImpl(struct);
	}
	
	public Resource getEcoreInstance(Resource xmlInstance) {
		TransformatorImpl ret = new TransformatorImpl(struct);
		Resource ecoreInstance = new XMIResourceImpl();
		ret.xmlToEcore(xmlInstance,ecoreInstance);
		return ecoreInstance;
	}

}
