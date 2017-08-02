package at.ac.tuwien.big.xmlintelledit.xmltext;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;

import at.ac.tuwien.big.xmlintelledit.xmltext.ConstraintEvalUtil.PropertyCount;
import at.ac.tuwien.big.xmlintelledit.xmltext.maybedeprecated.Settings;
import at.ac.tuwien.big.xmlintelledit.xmltext.maybedeprecated.XsdToXtextGenerator;

// TODO move to a test class
public class MainGenerator {
	{
	}

	
	private static void testLibrary3Example() {
		XsdToEcoreTransformer transformer = new XsdToEcoreTransformer();
		transformer.setXsd(XsdToXtextGenerator.XSD_FILE_NAME);
		Resource xsdResource = transformer.getResult();
		EcoreToGenericEcoreTransformer simplifiedTransformer = new EcoreToGenericEcoreTransformer();
		simplifiedTransformer.setTargetFilename(XsdToXtextGenerator.ECORE_FILE_NAME);
		simplifiedTransformer.setXsdEcore(xsdResource);
		Resource ecoreResource = simplifiedTransformer.getResult();
		EClass ecoreRoot = simplifiedTransformer.getRootClass();
		simplifiedTransformer.saveResult();
		Resource complexXmi = transformer.loadXmlAsXmi("examples/library3.xml");
		transformer.saveInstance(complexXmi, "examples/library3complex.xmi");
		Resource simplifiedXmi = simplifiedTransformer.loadXml("examples/library3.xml");
		CustomSerializer serializer = new CustomSerializer();
		
		try {
			serializer.writeOutput(simplifiedXmi, "examples/library3simpl.xmi");
			serializer.writeOutput(simplifiedXmi, "examples/library3simpl.xml");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (true) {return;}
		File current = new File("").getAbsoluteFile();
		System.out.println("Current: "+current);
		EcoreResourceGenerator generator = new EcoreResourceGenerator(XsdToXtextGenerator.ECORE_FILE_NAME,
				XsdToXtextGenerator.GENMODEL_FILE_NAME, Settings.LANGUAGE_PROJECT_NAME,current.getParentFile().getAbsolutePath());
		generator.generateModelCode();
	}
	
	private static void testEClassBasicExample90() {
		XsdToEcoreTransformer transformer = new XsdToEcoreTransformer();
		transformer.setXsd("examples/eclassXML/dictionary.xsd");
		Resource xsdResource = transformer.getResult();
		
		
		MultiEcoreToGenericEcoreTransformer simplifiedTransformer = new MultiEcoreToGenericEcoreTransformer();
		simplifiedTransformer.setTargetFilename("examples/dictionarySimple");
		simplifiedTransformer.addXsdEcore("examples/eclassXML/dictionary.xsd");
		simplifiedTransformer.getResult();
		EClass ecoreRoot = simplifiedTransformer.getRootClass();
		simplifiedTransformer.saveResult();
		//Resource complexXmi = transformer.loadXmlAsXmi("ontoML/eClass9_1_BASIC_EN_SG_90.xml");
		//transformer.saveInstance(complexXmi, "ontoML/eClass9_1_BASIC_EN_SG_90_complex.xmi");
		Resource simplifiedXmi = simplifiedTransformer.loadXml("examples/eclassXML/eClass9_1_BASIC_EN_SG_90.xml");
		CustomSerializer serializer = new CustomSerializer();
		
		try {
			serializer.writeOutput(simplifiedXmi, "examples/eclassXML/eClass9_1_BASIC_EN_SG_90_simple.xmi");			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (true) {return;}
		File current = new File("").getAbsoluteFile();
		System.out.println("Current: "+current);
		EcoreResourceGenerator generator = new EcoreResourceGenerator(XsdToXtextGenerator.ECORE_FILE_NAME,
				XsdToXtextGenerator.GENMODEL_FILE_NAME, Settings.LANGUAGE_PROJECT_NAME,current.getParentFile().getAbsolutePath());
		generator.generateModelCode();
	}
	
//	@Test // TODO remove or move to test class
	public static void testEClassBasicExample27() {
		/*XsdToEcoreTransformer transformer = new XsdToEcoreTransformer();
		transformer.setXsd("examples/eclassXML/dictionary.xsd");
		Rsource xsdResource = transformer.getResult();*/
		
		
		MultiEcoreToGenericEcoreTransformer simplifiedTransformer = new MultiEcoreToGenericEcoreTransformer();
		simplifiedTransformer.setTargetFilename("examples/EXTREMO-ECLASS-CASE-STUDY/eClassDictionary");
		simplifiedTransformer.addXsdEcore("examples/EXTREMO-ECLASS-CASE-STUDY/eclassXML/dictionary.xsd");
		simplifiedTransformer.getResult();
//		simplifiedTransformer.printResourceStats();
		EClass ecoreRoot = simplifiedTransformer.getRootClass();
		simplifiedTransformer.saveResult();
		//Resource complexXmi = transformer.loadXmlAsXmi("ontoML/eClass9_1_BASIC_EN_SG_90.xml");
		//transformer.saveInstance(complexXmi, "ontoML/eClass9_1_BASIC_EN_SG_90_complex.xmi");
		Resource simplifiedXmi = simplifiedTransformer.loadXml("examples/EXTREMO-ECLASS-CASE-STUDY/eclassXML/eClass9_1_BASIC_EN_SG_27.xml");
		// compute number of validated constraints
		PropertyCount propertyCount = ConstraintEvalUtil.countResource(simplifiedXmi);
		System.out.println("XMI has " + ConstraintEvalUtil.getNumberOfConstraintInstances(simplifiedXmi) + " instances of OCL validations.");
		System.out.println("XMI has " + ConstraintEvalUtil.countResource(simplifiedXmi) + "  instances of EObject.");
		System.out.println("XMI has " + propertyCount.dataPropertyNum + "  instances of data properties.");
		System.out.println("XMI has " + propertyCount.objectPropertyNum + "  instances of object properties.");
		
		CustomSerializer serializer = new CustomSerializer();
		//urn:iso:std:iso:is:13584:-32:ed-1:tech:xml-schema:ontoml
		//urn:iso:std:iso:is:13584:-32:ed-1:tech:xml-schema:ontoml
		try {
			serializer.writeOutput(simplifiedXmi, "examples/EXTREMO-ECLASS-CASE-STUDY/eclassXML/eClass9_1_BASIC_EN_SG_27.xmi");
			// complete round-trip
			serializer.writeOutput(simplifiedXmi, "examples/EXTREMO-ECLASS-CASE-STUDY/eclassXML/eClass9_1_BASIC_EN_SG_27_ROUND_TRIP.xml");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO: is the following deprecated?
//		if (true) {return;}
//		File current = new File("").getAbsoluteFile();
//		System.out.println("Current: "+current);
//		EcoreResourceGenerator generator = new EcoreResourceGenerator("examples/EXTREMO-ECLASS-CASE-STUDY/dictonarySimple.ecore",
//				"examples/EXTREMO-ECLASS-CASE-STUDY/dictonarySimple.genmodel", "org.xtext.example.dictionarysimpletest",current.getParentFile().getAbsolutePath());
//		generator.generateModelCode();
	}
	
	private static void testNamespace() {
		XsdToEcoreTransformer transformer = new XsdToEcoreTransformer();
		transformer.setXsd("examples/namespaceExample.xsd");
		Resource xsdResource = transformer.getResult();
		
		
		MultiEcoreToGenericEcoreTransformer simplifiedTransformer = new MultiEcoreToGenericEcoreTransformer();
		simplifiedTransformer.setTargetFilename("examples/namespaceExampleSimple");
		simplifiedTransformer.addXsdEcore("examples/namespaceExample.xsd");
		EClass ecoreRoot = simplifiedTransformer.getRootClass();
		simplifiedTransformer.getResult();
		simplifiedTransformer.saveResult();
		//Resource complexXmi = transformer.loadXmlAsXmi("ontoML/eClass9_1_BASIC_EN_SG_90.xml");
		//transformer.saveInstance(complexXmi, "ontoML/eClass9_1_BASIC_EN_SG_90_complex.xmi");
		Resource simplifiedXmi = simplifiedTransformer.loadXml("examples/namespaceExample.xml");
		CustomSerializer serializer = new CustomSerializer();
		
		try {
			serializer.writeOutput(simplifiedXmi, "examples/namespaceExample_simple.xmi");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (true) {return;}
		File current = new File("").getAbsoluteFile();
		System.out.println("Current: "+current);
		EcoreResourceGenerator generator = new EcoreResourceGenerator(XsdToXtextGenerator.ECORE_FILE_NAME,
				XsdToXtextGenerator.GENMODEL_FILE_NAME, Settings.LANGUAGE_PROJECT_NAME,current.getParentFile().getAbsolutePath());
		generator.generateModelCode();
	}
	

	private static void testBGFExample() {
		XsdToEcoreTransformer transformer = new XsdToEcoreTransformer();
		transformer.setXsd("bgf/bgf.xsd");
		Resource xsdResource = transformer.getResult();
		EcoreToGenericEcoreTransformer simplifiedTransformer = new EcoreToGenericEcoreTransformer();
		simplifiedTransformer.setTargetFilename("bgf/bgfbla.ecore");
		simplifiedTransformer.setXsdEcore(xsdResource);
		Resource ecoreResource = simplifiedTransformer.getResult();
		EClass ecoreRoot = simplifiedTransformer.getRootClass();
		simplifiedTransformer.saveResult();
		Resource complexXmi = transformer.loadXmlAsXmi("bgf/ada-kellogg.xml");
		transformer.saveInstance(complexXmi, "bgf/ada-kelloggcomplex.xmi");
		transformer.saveInstance(complexXmi, "bgf/ada-kelloggcomplex.xml");
		Resource simplifiedXmi = simplifiedTransformer.loadXml("bgf/ada-kellogg.xml");
		CustomSerializer serializer = new CustomSerializer();
		
		try {
			serializer.writeOutput(simplifiedXmi, "bgf/ada-kelloggsimple.xmi");
			serializer.writeOutput(simplifiedXmi, "bgf/ada-kelloggsimple.xml");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (true) {return;}
		File current = new File("").getAbsoluteFile();
		System.out.println("Current: "+current);
		EcoreResourceGenerator generator = new EcoreResourceGenerator(XsdToXtextGenerator.ECORE_FILE_NAME,
				XsdToXtextGenerator.GENMODEL_FILE_NAME, Settings.LANGUAGE_PROJECT_NAME,current.getParentFile().getAbsolutePath());
		generator.generateModelCode();
	}
	
	public static void main(String[] args) {
		//testBGFExample();
	/*	testEClassBasicExample90();*/
		testEClassBasicExample27();
		/*testNamespace();*/
	}
}
