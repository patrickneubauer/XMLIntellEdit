package at.ac.tuwien.big.xmltext;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xml.type.XMLTypeDocumentRoot;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.ecore.xml.type.impl.XMLTypeDocumentRootImpl;

import mypackage.Settings;
import mypackage.XsdToXtextGenerator;

public class MainGenerator2 {

	public static void main(String[] args) {
		
		String XSD_FILE_NAME = "simpleany.xsd";
		String ECORE_FILE_NAME = "simpleany.ecore";
		
		XsdToEcoreTransformer transformer = new XsdToEcoreTransformer();
		transformer.setXsd(XSD_FILE_NAME);
		Resource xsdResource = transformer.getResult();
		EcoreToGenericEcoreTransformer simplifiedTransformer = new EcoreToGenericEcoreTransformer();
		simplifiedTransformer.setTargetFilename(ECORE_FILE_NAME);
		simplifiedTransformer.setXsdEcore(xsdResource);
		Resource ecoreResource = simplifiedTransformer.getResult();
		EClass ecoreRoot = simplifiedTransformer.getRootClass();
		simplifiedTransformer.saveResult();
		CustomSerializer serializer = new CustomSerializer();
		Resource complexXmi = transformer.loadXmlAsXmi("simpleany.xml");
		try {
			serializer.writeOutput(complexXmi, "simpleanycomplex.xmi");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//transformer.saveInstance(complexXmi, "simpleanycomplex.xmi");
		Resource simplifiedXmi = simplifiedTransformer.loadXml("simpleany.xml");
		
		try {
			serializer.writeOutput(simplifiedXmi, "simpleanysimple.xmi");
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
}
