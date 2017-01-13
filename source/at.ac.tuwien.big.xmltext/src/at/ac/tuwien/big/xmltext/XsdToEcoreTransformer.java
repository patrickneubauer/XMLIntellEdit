package at.ac.tuwien.big.xmltext;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xsd.ecore.XSDEcoreBuilder;

public class XsdToEcoreTransformer {

	private URI xsdPath;
	private Resource result;
	
	
	public void setXsd(String xsdPath) {
		setXsd(URI.createFileURI(xsdPath));
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
					rootPackage.setName(rootPackage.getName().replace('.', '_').toLowerCase()); // replace dot's with underscore's (otherwise: not well formed name)
					// save
					this.result = ecoreResource;
					return;
				}
			
		}
	}
	
	public void saveResult(File location) {
		try {
			result.save(new FileOutputStream(location), null);
		} catch (IOException e) {
			System.out.println("FAILED to create Ecore from XSD");
			System.out.println(e);
		}
	}
	
	public Resource getResult() {
		if (result == null) {
			calcResult();
		}
		return result;
	}

}
