package eu.artist.tosca.dsl.serializer;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;

import tosca.ToscaPackage;
import eu.artist.tosca.dsl.ToscaDSLStandaloneSetup;

public class TMLSerializer {
	
	/**
	 * Create a output model file from a given input model file
	 * Note: The metamodel is considered to be already registered
	 * 
	 * Possible input:	XMI, XML, TML
	 * Possible output:	XMI, XML, TML	
	 * 
	 * @param inputModelURI input model file location (URI)
	 * @param outputModelURI output model file location (URI)
	 * @param writeOptions options used to read the input file and write the output file
	 * @throws IOException is thrown, e.g., when input file or metamodel cannot be found
	 */
	public void writeOutput(URI inputModelURI, URI outputModelURI, String... writeOptions) throws IOException {
		// TOSCA ML Standalone Setup if used in non-plugin project
		ToscaDSLStandaloneSetup.doSetup();
		ToscaPackage.eINSTANCE.eClass(); // instead of manually registering "tml"
		
		// enable load and save of XML documents (globally)			
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xml", new XMLResourceFactoryImpl());

		
		// create the resource set and add extended meta data to read/write options
		ResourceSet resourceSet = new ResourceSetImpl();
		final ExtendedMetaData extendedMetaData = new BasicExtendedMetaData(resourceSet.getPackageRegistry());
		Map<Object,Object> optionsMap = new HashMap<Object,Object>();
		for (String option : writeOptions) {
			optionsMap.put(option, extendedMetaData);
		}
		
		// load referenced model first?
//		URI referencedResourceModelURI = URI.createFileURI(new File("models/Moodle-by-Iaas/Definitions/modified/TOSCA-v1.0-BaseTypes-Definitions-modified.xml").getAbsolutePath());
//		Resource referencedResource = resourceSet.getResource(referencedResourceModelURI, true);
		
		// load input model from file
		Resource inputResource = resourceSet.getResource(inputModelURI, true);
		
		// resolve cross-references
		EcoreUtil.resolveAll(inputResource);		

		// create output model resource by copying contents of input model
		Resource outputResource = resourceSet.createResource(outputModelURI);
		outputResource.getContents().add(EcoreUtil.copy(inputResource.getContents().get(0)));
		
		// save output model to file
		outputResource.save(optionsMap);
	}// writeOutput
	
}
