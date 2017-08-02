package eu.artist.tosca.dsl.serializer.test;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryRegistryImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import tosca.util.ToscaResourceFactoryImpl;
import eu.artist.tosca.dsl.serializer.TMLSerializer;

/**
 * In case of TOSCA we want the following: XML --> XMI --> TML (or directly: XML
 * --> TML) and reverse (i.e., back to the TOSCA XML representation) TML --> XMI
 * --> XML (or directly: TML --> XML)
 * 
 * (!) Check if model resources are available before executing this test
 * 
 * @author pneubaue
 *
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SerializerTestDocumentRootLarge {

	ResourceSet resourceSet = null;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		resourceSet = new ResourceSetImpl();
		
		ResourceFactoryRegistryImpl.INSTANCE.getExtensionToFactoryMap()
			.put("tml", new ToscaResourceFactoryImpl());
	
		ResourceFactoryRegistryImpl.INSTANCE.getExtensionToFactoryMap()
			.put("xmi", new XMIResourceFactoryImpl());
		
		ResourceFactoryRegistryImpl.INSTANCE.getExtensionToFactoryMap()
			.put("xml", new XMLResourceFactoryImpl());
	}
	
	private static final String INPUT_MODEL = "models/DocumentRootLarge/DocumentRoot.xml"; // must end with .xml
	private static final String OUTPUT_MODEL_PATH = "models/DocumentRootLarge/generated/"; // must end with /

	@Test
	public void _1_xmlToXmiTest() throws IOException {
		URI inputModelResourceURI = URI.createFileURI(new File(INPUT_MODEL.substring(0, INPUT_MODEL.length() - 4).concat(".xml")).getAbsolutePath());		
		URI outputModelResourceURI = URI.createFileURI(new File(OUTPUT_MODEL_PATH + INPUT_MODEL.substring(INPUT_MODEL.lastIndexOf('/'), INPUT_MODEL.lastIndexOf('.')).concat(".xmi")).getAbsolutePath());
		TMLSerializer serializer = new TMLSerializer();
		serializer.writeOutput(inputModelResourceURI, outputModelResourceURI, XMLResource.OPTION_EXTENDED_META_DATA);
	}// xmlToXmiTest

	@Test
	public void _2_xmiToTmlTest() throws IOException {
		URI inputModelResourceURI = URI.createFileURI(new File(OUTPUT_MODEL_PATH + INPUT_MODEL.substring(INPUT_MODEL.lastIndexOf('/'), INPUT_MODEL.lastIndexOf('.')).concat(".xmi")).getAbsolutePath());
		URI outputModelResourceURI = URI.createFileURI(new File(OUTPUT_MODEL_PATH + INPUT_MODEL.substring(INPUT_MODEL.lastIndexOf('/'), INPUT_MODEL.lastIndexOf('.')).concat(".tml")).getAbsolutePath());
		TMLSerializer serializer = new TMLSerializer();
		serializer.writeOutput(inputModelResourceURI, outputModelResourceURI, XMLResource.OPTION_EXTENDED_META_DATA);
	}// xmiToTmlTest

	@Test
	public void _3_tmlToXmiTest() throws IOException {
		URI inputModelResourceURI = URI.createFileURI(new File(OUTPUT_MODEL_PATH + INPUT_MODEL.substring(INPUT_MODEL.lastIndexOf('/'), INPUT_MODEL.lastIndexOf('.')).concat(".tml")).getAbsolutePath());
		URI outputModelResourceURI = URI.createFileURI(new File(OUTPUT_MODEL_PATH + INPUT_MODEL.substring(INPUT_MODEL.lastIndexOf('/'), INPUT_MODEL.lastIndexOf('.')).concat("_reverse.xmi")).getAbsolutePath());
		TMLSerializer serializer = new TMLSerializer();
		serializer.writeOutput(inputModelResourceURI, outputModelResourceURI, XMLResource.OPTION_EXTENDED_META_DATA);
	}// tmlToXmiTest

	@Test
	public void _4_xmiToXmlTest() throws IOException {
		URI inputModelResourceURI = URI.createFileURI(new File(OUTPUT_MODEL_PATH + INPUT_MODEL.substring(INPUT_MODEL.lastIndexOf('/'), INPUT_MODEL.lastIndexOf('.')).concat(".xmi")).getAbsolutePath());
		URI outputModelResourceURI = URI.createFileURI(new File(OUTPUT_MODEL_PATH + INPUT_MODEL.substring(INPUT_MODEL.lastIndexOf('/'), INPUT_MODEL.lastIndexOf('.')).concat("_reverse.xml")).getAbsolutePath());
		TMLSerializer serializer = new TMLSerializer();
		serializer.writeOutput(inputModelResourceURI, outputModelResourceURI, XMLResource.OPTION_EXTENDED_META_DATA);
	}// xmiToXmlTest

	@Test
	public void _5_xmlToTmlDirectlyTest() throws IOException {
		URI inputModelResourceURI = URI.createFileURI(new File(OUTPUT_MODEL_PATH + INPUT_MODEL.substring(INPUT_MODEL.lastIndexOf('/'), INPUT_MODEL.lastIndexOf('.')).concat("_reverse.xml")).getAbsolutePath());
		URI outputModelResourceURI = URI.createFileURI(new File(OUTPUT_MODEL_PATH + INPUT_MODEL.substring(INPUT_MODEL.lastIndexOf('/'), INPUT_MODEL.lastIndexOf('.')).concat("_directly.tml")).getAbsolutePath());
		TMLSerializer serializer = new TMLSerializer();
		serializer.writeOutput(inputModelResourceURI, outputModelResourceURI, XMLResource.OPTION_EXTENDED_META_DATA);
	}// xmlToTmlDirectlyTest

	@Test
	public void _6_tmlToXmlDirectlyTest() throws IOException {
		URI inputModelResourceURI = URI.createFileURI(new File(OUTPUT_MODEL_PATH + INPUT_MODEL.substring(INPUT_MODEL.lastIndexOf('/'), INPUT_MODEL.lastIndexOf('.')).concat(".tml")).getAbsolutePath());
		URI outputModelResourceURI = URI.createFileURI(new File(OUTPUT_MODEL_PATH + INPUT_MODEL.substring(INPUT_MODEL.lastIndexOf('/'), INPUT_MODEL.lastIndexOf('.')).concat("_directly.xml")).getAbsolutePath());
		TMLSerializer serializer = new TMLSerializer();
		serializer.writeOutput(inputModelResourceURI, outputModelResourceURI, XMLResource.OPTION_EXTENDED_META_DATA);
	}// tmlToXmlDirectlyTest

}// SerializerTest
