package at.ac.tuwien.big.xmltext;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;


public class CustomSerializer {
	
	/**
	 * Create a output model file from a given input model file
	 * Note: The metamodel is considered to be already registered
	 * 
	 * Possible input:	XMI, XML
	 * Possible output:	XMI, XML	
	 * 
	 * @param inputModelURI input model file location (URI)
	 * @param outputModelURI output model file location (URI)
	 * @param writeOptions options used to read the input file and write the output file
	 * @throws IOException is thrown, e.g., when input file or metamodel cannot be found
	 */
	public void writeOutput(URI inputModelURI, URI outputModelURI, String... writeOptions) throws IOException {
		// AMLText Standalone Setup if used in non-plugin project
				
		// enable load and save of XML documents (globally)	
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xml", new XMLResourceFactoryImpl());
		
		// create the resource set and add extended meta data to read/write options
		ResourceSet resourceSet = new ResourceSetImpl();
		

		// load input model from file		
		Resource inputResource = resourceSet.getResource(inputModelURI, true);
		writeOutput(inputResource, outputModelURI, writeOptions);
	}// writeOutput
	

	/**
	 * Create a output model file from a given input model file
	 * Note: The metamodel is considered to be already registered
	 * 
	 * Possible input:	XMI, XML
	 * Possible output:	XMI, XML	
	 * 
	 * @param inputModelURI input model file location (URI)
	 * @param outputModelURI output model file location (URI)
	 * @param writeOptions options used to read the input file and write the output file
	 * @throws IOException is thrown, e.g., when input file or metamodel cannot be found
	 */
	public void writeOutput(Resource inputResource, URI outputModelURI, String... writeOptions) throws IOException {
		// AMLText Standalone Setup if used in non-plugin project
				
		// enable load and save of XML documents (globally)	
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xml", new XMLResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

		ResourceSet resourceSet = inputResource.getResourceSet();
		// create output model resource by copying contents of input model
		Resource outputResource = resourceSet.createResource(outputModelURI);
		
		outputResource.getContents().add(EcoreUtil.copy(inputResource.getContents().get(0)));
		
		final ExtendedMetaData extendedMetaData = new BasicExtendedMetaData(resourceSet.getPackageRegistry());
		Map<Object,Object> optionsMap = new HashMap<Object,Object>();
		for (String option : writeOptions) {
			optionsMap.put(option, extendedMetaData);
		}
		
		// save output model to file
		outputResource.save(optionsMap);
	}// writeOutput
	
	/**
	 * Create a output model file from a given input model file
	 * Note: The metamodel is considered to be already registered
	 * 
	 * Possible input:	XMI, XML
	 * Possible output:	XMI, XML	
	 * 
	 * @param inputModelURI input model file location (URI)
	 * @param outputModelURI output model file location (URI)
	 * @param writeOptions options used to read the input file and write the output file
	 * @throws IOException is thrown, e.g., when input file or metamodel cannot be found
	 */
	public void writeOutput(Resource inputResource, String outputModelPath, String... writeOptions) throws IOException {
		URIConverter conv = URIConverter.INSTANCE;
		if (inputResource.getResourceSet() != null) {
			conv = inputResource.getResourceSet().getURIConverter();
		}
		writeOutput(inputResource,conv.normalize(URI.createFileURI(outputModelPath)),writeOptions);
	}// writeOutput

	/**
	 * Create a output model file from a given input model file
	 * Note: The metamodel is considered to be already registered
	 * 
	 * Possible input:	XMI, XML
	 * Possible output:	XMI, XML	
	 * 
	 * @param inputModelURI input model file location (URI)
	 * @param outputModelURI output model file location (URI)
	 * @param writeOptions options used to read the input file and write the output file
	 * @throws IOException is thrown, e.g., when input file or metamodel cannot be found
	 */
	public void writeOutput(Resource inputResource, File outputModelFile, String... writeOptions) throws IOException {
		URIConverter conv = URIConverter.INSTANCE;
		if (inputResource.getResourceSet() != null) {
			conv = inputResource.getResourceSet().getURIConverter();
		}
		writeOutput(inputResource,conv.normalize(URI.createFileURI(outputModelFile.getAbsolutePath())),writeOptions);
	}// writeOutput
	
	
	
	
	
}