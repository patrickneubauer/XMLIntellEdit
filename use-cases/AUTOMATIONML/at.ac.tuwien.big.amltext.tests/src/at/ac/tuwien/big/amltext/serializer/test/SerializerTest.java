package at.ac.tuwien.big.amltext.serializer.test;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import at.ac.tuwien.big.amltext.serializer.AMLTextSerializer;

/**
 * SerializerTest
 * 
 * Step-by-step round-trip: AMLText --> XMI --> XML --> XMI --> AMLText
 * Direct one-way: AMLText --> XML
 * Direct one-way: XML --> AMLText
 * 
 * (!) Check if model resources are available before executing this test
 * 
 * @author pneubaue
 *
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SerializerTest {

	private static final String INPUT_MODEL = "models/ExampleTopology.amltext"; // must end with .amltext
	private static final String OUTPUT_MODEL_PATH = "models/generated/"; // must end with /

	@Test
	public void _1_amltextToXmiTest() throws IOException {
		URI inputModelResourceURI = URI.createFileURI(new File(INPUT_MODEL).getAbsolutePath());		
		URI outputModelResourceURI = URI.createFileURI(new File(OUTPUT_MODEL_PATH + INPUT_MODEL.substring(INPUT_MODEL.lastIndexOf('/'), INPUT_MODEL.lastIndexOf('.')).concat(".xmi")).getAbsolutePath());
		AMLTextSerializer serializer = new AMLTextSerializer();
		serializer.writeOutput(inputModelResourceURI, outputModelResourceURI, XMLResource.OPTION_EXTENDED_META_DATA);
	}// amltextToXmiTest
	
	@Test
	public void _2_xmiToXmlTest() throws IOException {
		URI inputModelResourceURI = URI.createFileURI(new File(OUTPUT_MODEL_PATH + INPUT_MODEL.substring(INPUT_MODEL.lastIndexOf('/'), INPUT_MODEL.lastIndexOf('.')).concat(".xmi")).getAbsolutePath());
		URI outputModelResourceURI = URI.createFileURI(new File(OUTPUT_MODEL_PATH + INPUT_MODEL.substring(INPUT_MODEL.lastIndexOf('/'), INPUT_MODEL.lastIndexOf('.')).concat(".xml")).getAbsolutePath());
		AMLTextSerializer serializer = new AMLTextSerializer();
		serializer.writeOutput(inputModelResourceURI, outputModelResourceURI, XMLResource.OPTION_EXTENDED_META_DATA);
	}// xmiToXmlTest
	
	@Test
	public void _3_xmlToXmiTest() throws IOException {
		URI inputModelResourceURI = URI.createFileURI(new File(OUTPUT_MODEL_PATH + INPUT_MODEL.substring(INPUT_MODEL.lastIndexOf('/'), INPUT_MODEL.lastIndexOf('.')).concat(".xml")).getAbsolutePath());		
		URI outputModelResourceURI = URI.createFileURI(new File(OUTPUT_MODEL_PATH + INPUT_MODEL.substring(INPUT_MODEL.lastIndexOf('/'), INPUT_MODEL.lastIndexOf('.')).concat("_reverse.xmi")).getAbsolutePath());
		AMLTextSerializer serializer = new AMLTextSerializer();
		serializer.writeOutput(inputModelResourceURI, outputModelResourceURI, XMLResource.OPTION_EXTENDED_META_DATA);
	}// xmlToXmiTest
	
	@Test
	public void _4_xmiToAmltextTest() throws IOException {
		URI inputModelResourceURI = URI.createFileURI(new File(OUTPUT_MODEL_PATH + INPUT_MODEL.substring(INPUT_MODEL.lastIndexOf('/'), INPUT_MODEL.lastIndexOf('.')).concat("_reverse.xmi")).getAbsolutePath());
		URI outputModelResourceURI = URI.createFileURI(new File(OUTPUT_MODEL_PATH + INPUT_MODEL.substring(INPUT_MODEL.lastIndexOf('/'), INPUT_MODEL.lastIndexOf('.')).concat("_reverse.amltext")).getAbsolutePath());
		AMLTextSerializer serializer = new AMLTextSerializer();
		serializer.writeOutput(inputModelResourceURI, outputModelResourceURI, XMLResource.OPTION_EXTENDED_META_DATA);
	}// xmiToAmltextTest
	
	@Test
	public void _5_amltextToXmlDirectlyTest() throws IOException {
		URI inputModelResourceURI = URI.createFileURI(new File(OUTPUT_MODEL_PATH + INPUT_MODEL.substring(INPUT_MODEL.lastIndexOf('/'), INPUT_MODEL.lastIndexOf('.')).concat("_reverse.amltext")).getAbsolutePath());
		URI outputModelResourceURI = URI.createFileURI(new File(OUTPUT_MODEL_PATH + INPUT_MODEL.substring(INPUT_MODEL.lastIndexOf('/'), INPUT_MODEL.lastIndexOf('.')).concat("_directly.xml")).getAbsolutePath());
		AMLTextSerializer serializer = new AMLTextSerializer();
		serializer.writeOutput(inputModelResourceURI, outputModelResourceURI, XMLResource.OPTION_EXTENDED_META_DATA);
	}// amltextToXmlDirectlyTest

	@Test
	public void _6_xmlToAmltextDirectlyTest() throws IOException {
		URI inputModelResourceURI = URI.createFileURI(new File(OUTPUT_MODEL_PATH + INPUT_MODEL.substring(INPUT_MODEL.lastIndexOf('/'), INPUT_MODEL.lastIndexOf('.')).concat(".xml")).getAbsolutePath());
		URI outputModelResourceURI = URI.createFileURI(new File(OUTPUT_MODEL_PATH + INPUT_MODEL.substring(INPUT_MODEL.lastIndexOf('/'), INPUT_MODEL.lastIndexOf('.')).concat("_directly.amltext")).getAbsolutePath());
		AMLTextSerializer serializer = new AMLTextSerializer();
		serializer.writeOutput(inputModelResourceURI, outputModelResourceURI, XMLResource.OPTION_EXTENDED_META_DATA);
	}// xmlToAmltextDirectlyTest

}// SerializerTest
