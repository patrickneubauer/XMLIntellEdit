package at.ac.tuwien.big.xmlintelledit.intelledit.oclgen;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.parser.IEncodingProvider;
import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule;

import at.ac.tuwien.big.xmlintelledit.intelledit.oclgen.OCL2ValidatorGenerator;

public class OCL2ValidatorGeneratorModule extends
		AbstractGenericResourceRuntimeModule {

	@Override
	protected String getLanguageName() {
		return "org.eclipse.ocl.ecore.EcorePackage";
	}

	@Override
	protected String getFileExtensions() {
		return "ecore";
	}

	public Class<? extends IGenerator> bindIGenerator() {
		return OCL2ValidatorGenerator.class;
	}

	public Class<? extends IEncodingProvider> bindIEncodingProvider() {
		return Utf8EncodingProvider.class;
	}

	public Class<? extends ResourceSet> bindResourceSet() {
		return ResourceSetImpl.class;
	}

}
