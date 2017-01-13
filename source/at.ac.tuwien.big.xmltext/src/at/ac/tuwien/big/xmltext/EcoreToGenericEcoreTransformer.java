package at.ac.tuwien.big.xmltext;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.xsd.ecore.XSDEcoreBuilder;

import at.ac.tuwien.big.xmltext.ecoretransform.impl.TransformatorImpl;
import at.ac.tuwien.big.xmltext.ecoretransform.impl.TransformatorStructure;
import at.ac.tuwien.big.xmltext.ecoretransform.impl.TypeTransformatorStore;

public class EcoreToGenericEcoreTransformer {

	private Resource ecoreResource;
	private Resource result;
	private String targetName;
	private EClass rootClass;
	private TransformatorStructure struct;
	
	
	public void setXsdEcore(String xsdPath) {
		setXsdEcore(URI.createFileURI(xsdPath));
	}
	
	public void setXsdEcore(URI xsdPath) {
		ResourceSet rs = new ResourceSetImpl();
		setXsdEcore(rs.getResource(xsdPath, true));
	}
	
	public void setXsdEcore(Resource ecoreResource) {
		this.ecoreResource = ecoreResource;
	}
	
	public void setTargetFilename(String targetName) {
		this.targetName = targetName;
	}
	
	
	
	
	private void calcResult() {
		// XSD --> Ecore
		struct = TransformatorStructure.fromXmlEcore(new TypeTransformatorStore(),
				ecoreResource.getResourceSet(),
				ecoreResource, targetName);
		rootClass = struct.getEcoreRoot();
		this.result = struct.getEcoreResource();
	}
	
	public void saveResult() {
		try {
			result.save(new FileOutputStream(targetName), null);
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
	
	public Resource getEcoreInstance(Resource xmlInstance) {
		TransformatorImpl ret = new TransformatorImpl(struct);
		Resource ecoreInstance = new XMIResourceImpl();
		ret.xmlToEcore(xmlInstance,ecoreInstance);
		return ecoreInstance;
	}

}
