package at.ac.tuwien.big.xmltext;

import java.io.File;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;

import mypackage.Settings;
import mypackage.XsdToXtextGenerator;

public class MainGenerator {

	public static void main(String[] args) {
		XsdToEcoreTransformer transformer = new XsdToEcoreTransformer();
		transformer.setXsd(XsdToXtextGenerator.XSD_FILE_NAME);
		Resource xsdResource = transformer.getResult();
		EcoreToGenericEcoreTransformer simplifiedTransformer = new EcoreToGenericEcoreTransformer();
		simplifiedTransformer.setTargetFilename(XsdToXtextGenerator.ECORE_FILE_NAME);
		simplifiedTransformer.setXsdEcore(xsdResource);
		Resource ecoreResource = simplifiedTransformer.getResult();
		EClass ecoreRoot = simplifiedTransformer.getRootClass();
		File current = new File("").getAbsoluteFile();
		System.out.println("Current: "+current);
		EcoreResourceGenerator generator = new EcoreResourceGenerator(XsdToXtextGenerator.ECORE_FILE_NAME,
				XsdToXtextGenerator.GENMODEL_FILE_NAME, Settings.LANGUAGE_PROJECT_NAME,current.getParentFile().getAbsolutePath());
		generator.generateModelCode();
	}
}
