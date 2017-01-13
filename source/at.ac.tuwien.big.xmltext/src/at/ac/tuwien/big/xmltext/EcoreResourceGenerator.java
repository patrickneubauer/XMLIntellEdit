package at.ac.tuwien.big.xmltext;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Collections;

import org.eclipse.core.runtime.Path;
import org.eclipse.emf.codegen.ecore.generator.Generator;
import org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenModelGeneratorAdapterFactory;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

import mypackage.Settings;
import mypackage.XsdToXtextGenerator;

public class EcoreResourceGenerator {
	
	private String ecore;
	private String genModelLocation;
	private String projectName;
	private Resource ecoreResource;
	private Resource genModelResource;
	private GenModel genmodel = null;
	private String workspaceLocation;
	
	public EcoreResourceGenerator() {
		
	}
	
	public EcoreResourceGenerator(String ecore, String targetLocation, String projectName, String workspaceLocation) {
		setEcore(ecore);
		setGenModelLocation(targetLocation);
		setProjectName(projectName);
		setWorkspaceLocation(workspaceLocation);
	}
	
	public void setWorkspaceLocation(String workspace) {
		this.workspaceLocation = workspace;
		System.out.println("Workspace is set to "+workspace);
	}
	
	public void setEcore(String ecoreLocation) {
		this.ecore = ecoreLocation;
	}
	
	public void setGenModelLocation(String targetLocation) {
		this.genModelLocation = targetLocation;
	}
	
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
		
	private GenModel createGenModelFromEcore(String ecoreLocation, String genModelLocation) {
		// Ecore --> genmodel
		// Ecore --> genmodel
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		URI fileURI = resourceSet.getURIConverter().normalize(URI.createFileURI(ecoreLocation));
		Resource resource = resourceSet.getResource(fileURI, true);
		EPackage rootPackage = (EPackage) resource.getContents().get(0);

		return createGenModel(rootPackage, ecoreLocation, genModelLocation);
	}// createGenModelFromEcore

	private GenModel createGenModel(final EPackage rootPackage, final String ecoreLocation, final String genModelLocation) {
		String genModelDirectory = "/" + projectName + "/src";
		String genModelExtendsClass = "org.eclipse.emf.ecore.impl.MinimalEObjectImpl$Container";
		String genModelImporterId = "org.eclipse.emf.importer.ecore";
		String genModelXmlEncoding = Settings.MWE2_WORKFLOW_ENCODING;

		GenModel genModel = GenModelFactory.eINSTANCE.createGenModel();
		genModel.setComplianceLevel(GenJDKLevel.JDK80_LITERAL);
		genModel.setModelDirectory(genModelDirectory);
		genModel.getForeignModel().add(new Path(ecoreLocation).lastSegment());
		
		genModel.setModelName(rootPackage.getName());
		genModel.setRootExtendsClass(genModelExtendsClass);
		genModel.setImporterID(genModelImporterId);
		genModel.setCopyrightFields(false);
		genModel.setOperationReflection(true);
		genModel.setImportOrganizing(true);
		genModel.setModelPluginID(projectName);
		genModel.initialize(Collections.singleton(rootPackage));

		GenPackage genPackage = (GenPackage) genModel.getGenPackages().get(0);
		genPackage.setPrefix(rootPackage.getName());
		genPackage.setEcorePackage(rootPackage);

		try {
			// save *.genmodel
			URI genModelURI = URI.createFileURI(genModelLocation);
			final XMIResourceImpl genModelResource = new XMIResourceImpl(genModelURI);
			genModelResource.getDefaultSaveOptions().put(XMLResource.OPTION_ENCODING, genModelXmlEncoding);
			genModelResource.getContents().add(genModel);
			genModelResource.save(null);
			System.out.println("Finished generating genmodel file: " + genModelLocation);

		} catch (IOException e) {
			System.out.println("FAILED to generate GenModel");
			System.out.println(e);
		}

		return genModel;

	}// createGenModel

	private void calcGenmodel() {
		this.genmodel = createGenModelFromEcore(ecore, genModelLocation);
	}
	
	public GenModel getGenmodel() {
		if (genmodel == null) {
			calcGenmodel();
		}
		return genmodel;
	}
	
	public void generateModelCode() {
		// Genmodel + Ecore --> Java Code
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("genmodel", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());

		URI genModelFileURI = URI.createFileURI(genModelLocation);
		URIConverter converter = new ExtensibleURIConverterImpl();
		URI genModelFileURINormalized = converter.normalize(genModelFileURI);

		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(GenModelPackage.eNS_URI, GenModelPackage.eINSTANCE);
		resourceSet.getURIConverter().getURIMap().put(URI.createURI("platform:/resource/"), URI.createFileURI(workspaceLocation));

		try {
			Resource genModelResource = resourceSet.getResource(genModelFileURINormalized, true);
			genModelResource.load(null);
			Resource ecoreResource = resourceSet.getResource(converter.normalize(URI.createURI(ecore)), true);
			ecoreResource.load(null);

			if (genModelResource.getContents().size() != 1) {
				System.out.println("Resource has " + genModelResource.getContents().size() + " loaded objects");
			} else {
				GenModel genModel = (GenModel) genModelResource.getContents().get(0);

				GeneratorAdapterFactory.Descriptor.Registry.INSTANCE.addDescriptor(GenModelPackage.eNS_URI, GenModelGeneratorAdapterFactory.DESCRIPTOR);

				Generator generator = new Generator();
				generator.setInput(genModel);
				genModel.setCanGenerate(true);

				// Generate model code
				BasicMonitor.Printing monitor = new BasicMonitor.Printing(new PrintStream(Settings.JAVA_CODE_GENERATOR_LOG_FILE_LOCATION));
				generator.generate(genModel, GenBaseGeneratorAdapter.MODEL_PROJECT_TYPE, monitor);
				System.out.println("Finished generating model code for: " + genModelLocation);

				// Generate edit code
				generator.generate(genModel, GenBaseGeneratorAdapter.EDIT_PROJECT_TYPE, monitor);
				System.out.println("Finished generating edit code for: " + genModelLocation);

				// Generate editor code
				generator.generate(genModel, GenBaseGeneratorAdapter.EDITOR_PROJECT_TYPE, monitor);
				System.out.println("Finished generating editor code for: " + genModelLocation);

				// Generate test code
				generator.generate(genModel, GenBaseGeneratorAdapter.TESTS_PROJECT_TYPE, monitor);
				System.out.println("Finished generating test code for: " + genModelLocation);
			}
		} catch (IOException e) {
			System.out.println("FAILED to generate Java code");
			System.out.println(e);
		}
	}// generateCode

}
