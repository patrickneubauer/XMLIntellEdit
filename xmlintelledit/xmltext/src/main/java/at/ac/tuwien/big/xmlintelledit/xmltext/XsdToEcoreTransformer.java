package at.ac.tuwien.big.xmlintelledit.xmltext;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.GenericXMLResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.xsd.ecore.XSDEcoreBuilder;

public class XsdToEcoreTransformer {

	private URI xsdPath;
	private Resource result;
	
	
	public void setXsd(String xsdPath) {
		setXsd(URIConverter.INSTANCE.normalize(URI.createFileURI(xsdPath)));
	}
	
	public void setXsd(URI xsdPath) {
		this.xsdPath = xsdPath;
		result = null;
	}
	
	
	private void calcResult() {
		// XSD --> Ecore
		XSDEcoreBuilder xsdEcoreBuilder = new XSDEcoreBuilder();
		Collection<Resource> ecoreResources = xsdEcoreBuilder.generateResources(xsdPath);

		System.out.println("Input: " + xsdPath);

		// for every resource found (includes eventually referenced XSDs)
		for (Resource ecoreResource : ecoreResources) {
				if (ecoreResource.getClass().getName().contains("EcoreResourceFactoryImpl")) {
					ecoreResource.setURI(xsdPath);
					EPackage rootPackage = (EPackage) ecoreResource.getContents().get(0);
					rootPackage.setNsURI(xsdPath.toString());
					EPackageRegistryImpl.INSTANCE.putIfAbsent(rootPackage.getNsURI(),
						            rootPackage);
					rootPackage.setName(rootPackage.getName().replace('.', '_').toLowerCase()); // replace dot's with underscore's (otherwise: not well formed name)
					// save
					this.result = ecoreResource;
					return;
				}
			
		}
	}
	
	public Resource loadXml(String xmlPath) {
		ResourceSet resourceSet = getResult().getResourceSet();
		resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml", new GenericXMLResourceFactoryImpl());
		Resource resource = resourceSet.getResource(resourceSet.getURIConverter().normalize(URI.createFileURI(xmlPath)), true);
		try {
			//Map<Object,Object> optionsMap = new HashMap<Object,Object>();
			resource.load(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resource;
	}
	
	public Resource loadXmlAsXmi(String xmlPath) {
		return convertToXmi(loadXml(xmlPath));
	}
	
	public Resource convertToXmi(Resource xmlResource) {
		Resource xmiResource = new XMIResourceImpl(xmlResource.getResourceSet().getURIConverter().normalize(
				URI.createURI(xmlResource.getURI().toString()+".xmi")));
		xmiResource.getContents().addAll(EcoreUtil.copyAll(xmlResource.getContents()));
		xmlResource.getResourceSet().getResources().add(xmiResource);
		return xmiResource;
	}
	
	public void saveResult(File location) {
		try {
			getResult().save(new FileOutputStream(location), null);
		} catch (IOException e) {
			System.out.println("FAILED to create Ecore from XSD");
			System.out.println(e);
		}
	}
	
	
	public void saveResult(String location, boolean withoutDocumentRoot, String...trueOptions) {
		saveInstance(getResult(), location, withoutDocumentRoot, trueOptions);
	}
	
	public void saveInstance(Resource resource, String location, boolean withoutDocumentRoot, String...trueOptions) {
		try {
			Map<Object,Object> optionsMap = new HashMap<Object,Object>();
			optionsMap.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
			if (withoutDocumentRoot) {
				optionsMap.put(XMLResource.OPTION_SUPPRESS_DOCUMENT_ROOT, Boolean.TRUE);
			}
			for (String str: trueOptions) {
				optionsMap.put(str, Boolean.TRUE);	
			}
			resource.save(new FileOutputStream(location), optionsMap);
		} catch (IOException e) {
			System.out.println("FAILED to create Ecore from XSD");
			System.out.println(e);
		}
	}

	public void saveInstance(Resource res, String location, String... trueOptions) {
		saveInstance(res,location,true,trueOptions);
	}
	
	public void saveResult(String location, String... trueOptions) {
		saveResult(location,true,trueOptions);
	}
	
	public Resource getResult() {
		if (result == null) {
			calcResult();
		}
		return result;
	}
	
	public static void main(String[] args) {
		XsdToEcoreTransformer transformer = new XsdToEcoreTransformer();
		transformer.setXsd("library3.xsd");
		transformer.getResult();
		transformer.saveResult("library3.fake.ecore");
	}

}
