package at.ac.tuwien.big.xmltext;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.antlr.runtime.tree.TreeIterator;
import org.apache.commons.io.FileUtils;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.codegen.ecore.generator.Generator;
import org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenModelGeneratorAdapterFactory;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EAttributeImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.mwe2.launch.runtime.Mwe2Launcher;
import org.eclipse.ui.IWorkingSet;
import org.eclipse.xsd.ecore.MapBuilder.Mapper;
import org.eclipse.xsd.ecore.XSDEcoreBuilder;
import org.eclipse.xtext.xtext.ui.wizard.ecore2xtext.EPackageInfo;
import org.eclipse.xtext.xtext.ui.wizard.ecore2xtext.Ecore2XtextDslProjectContributor;
import org.eclipse.xtext.xtext.ui.wizard.ecore2xtext.Ecore2XtextGrammarCreator;
import org.eclipse.xtext.xtext.ui.wizard.ecore2xtext.Ecore2XtextProjectCreator;
import org.eclipse.xtext.xtext.ui.wizard.ecore2xtext.Ecore2XtextProjectInfo;
import org.eclipse.xtext.xtext.ui.wizard.project.WizardContribution;
import org.eclipse.xtext.xtext.ui.wizard.project.XtextProjectCreator;
import org.junit.Test;

import com.google.common.collect.Lists;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.MembersInjector;

/**
 * HOW TO EXECUTE XSD TO XTEXT TRANSFORMATION:
 * (1) 		Run "runGeneratorPart1" as JUnit Test
 * (2)		Run "runGeneratorPart2" as JUnit Plugin (!) Test
 * (3.1) 	Import generated Xtext projects to current Eclipse workspace
 * (3.2) 	Select this project and refresh it
 * (3.3) 	Run "runGeneratorPart3" as JUnit Test
 * 
 * @author Patrick Neubauer - Initial contribution
 *
 */
@SuppressWarnings("restriction")
public class XMLTextExecutor {

	/**
	 * ECLIPSE_WORKSPACE_LOCATION has to exactly match the workspace folder in
	 * which this projects resides
	 */
	private String WORKSPACE_LOCATION;
	public String getWorkspaceLocation() {
		return WORKSPACE_LOCATION;
	}

	/**
	 * Location of the Xtext main project
	 */
	private String XTEXT_DSL_PROJECT_LOCATION;
	private String PROJECT_DIRECTORY;
	/**
	 * Name of this project
	 */
	private String PROJECT_NAME;

	public XMLTextExecutor() {
		// default constructor override
		System.out.println("Created an instance of " + this.getClass());
		
		String projectDirectory = XMLTextExecutor.class.getProtectionDomain().getCodeSource().getLocation().getPath();
		if (projectDirectory.endsWith("bin/")) {
			PROJECT_DIRECTORY = projectDirectory.substring(1, projectDirectory.length()-5);
		} else {
		    PROJECT_DIRECTORY = projectDirectory.substring(1, projectDirectory.length()-1);
		}
	    PROJECT_NAME = PROJECT_DIRECTORY.substring(
	    		PROJECT_DIRECTORY.lastIndexOf("/")+1, 
	    		PROJECT_DIRECTORY.length());
	    
		WORKSPACE_LOCATION = PROJECT_DIRECTORY.substring(0, PROJECT_DIRECTORY.lastIndexOf("/")+1);
		XTEXT_DSL_PROJECT_LOCATION = WORKSPACE_LOCATION;
	}
			
	public void adaptXtextGrammar(String xtextGrammarFileLocation) {
		// load generated ecore and xtext grammar and modify grammar to match desired grammar
		
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		URI fileURI = URI.createFileURI(Settings.ECORE_FILE_NAME);
		Resource resource = resourceSet.getResource(fileURI, true);
		EPackage rootPackage = (EPackage) resource.getContents().get(0);
		
		// lookup types of "java.lang.String"
		EList<EClassifier> eClassifiers = rootPackage.getEClassifiers();
		EList<EClassifier> eStringClassifiers = new BasicEList<EClassifier>();
		for (EClassifier eClassifier : eClassifiers) {
			if (eClassifier instanceof EDataType && eClassifier.getInstanceTypeName()!=null && eClassifier.getInstanceTypeName().equals("java.lang.String")) {
				eStringClassifiers.add(eClassifier);
			}
		}

		// load Xtext grammar
		String xTextGrammar = readStringFromFile(xtextGrammarFileLocation);
		
		// replace Xtext grammar to fit STRING terminals
		for (EClassifier eClassifier : eStringClassifiers) {
			xTextGrammar = xTextGrammar.replaceFirst("'" + eClassifier.getName() + "'", "STRING");
		}
		
		// write grammar back to drive
		writeStringToFile(xTextGrammar, xtextGrammarFileLocation, Settings.XTEXT_FILE_ENCODING);
		moveToTarget("../.metadata/.plugins/org.eclipse.core.resources/.projects/XMLTextFramework/generated/" + Settings.XTEXT_GRAMMAR_FILE_NAME, Settings.XTEXT_GRAMMAR_FILE_NAME);		
		
		System.out.println("Successfully adapted Xtext Grammar file: " + xtextGrammarFileLocation);

	}
	
	/**
	 * INSTRUCTIONS: 
	 * (1) IMPORT PROJECTS GENERATED PROJECTS (see "runGeneratorPart2")
	 * (2) ADD "org.xtext.example.mydsl/scr" to project classpath
	 * (3) SELECT THIS PROJECT IN PROJECT BROWSER AND REFRESH IT
	 * (4) RUN THIS TEST AS JUNIT TEST
	 * 
	 * INPUT: MWE2 Workflow
	 * OUTPUT: MWE2 Workflow execution resulting in Xtext project enhancements
	 */
	@Test
	public void runGeneratorPart3() {
		// execute workflow
		executeMwe2Workflow("file:///" + WORKSPACE_LOCATION + Settings.LANGUAGE_PROJECT_NAME + "/src/" + Settings.LANGUAGE_PROJECT_NAME.replace('.', '/') + "/Generate" + Settings.LANGUAGE_NAME + ".mwe2");
	}
	
	public void copyAntlrParser() {
		moveToTarget("../.metadata/.plugins/org.eclipse.core.resources/.projects/XMLTextFramework/generated/" + Settings.ANTLR_FILE_NAME, "../" + Settings.LANGUAGE_PROJECT_NAME + "/" + Settings.ANTLR_FILE_NAME);
	}

	public void executeMwe2Workflow(String mweFileLocation) {
		Mwe2Launcher.main(new String[] { 
				mweFileLocation, "-p",
				"fileEncoding=".concat(Settings.MWE2_WORKFLOW_ENCODING)});
		System.out.println("Successfully executed MWE2 workflow: " + mweFileLocation);
	}
	
	public Resource createEcoreFromXSD(String xsdFileLocation, String ecoreFileLocation) {
		// XSD --> Ecore
		XSDEcoreBuilder xsdEcoreBuilder = new XSDEcoreBuilder();
		mapper = new EcoreXSDMapper();
		xsdEcoreBuilder.setMapper(mapper);
		Collection<Resource> ecoreResources = xsdEcoreBuilder.generateResources(URI.createFileURI(xsdFileLocation));

		System.out.println("Input: " + xsdFileLocation);
		

		Resource ret = null;
		// for every resource found (includes eventually referenced XSDs)
		for (Resource ecoreResource : ecoreResources) {
			try {
				if (ecoreResource.getClass().getName().contains("EcoreResourceFactoryImpl")) {
					// correct URI
					URI platformURI = URI.createPlatformPluginURI(xsdFileLocation, false);
					ecoreResource.setURI(platformURI);
					EPackage rootPackage = (EPackage) ecoreResource.getContents().get(0);
					mapper.setEcoreRoot(rootPackage);
					mapper.setEcorePackage(rootPackage);
					rootPackage.setNsURI(platformURI.toString());
					rootPackage.setName(rootPackage.getName().replace('.', '_')); // replace dot's with underscore's (otherwise: not well formed name)
					// save
					ecoreResource.save(new FileOutputStream(new File(ecoreFileLocation)), null);
					System.out.println("Finished generating ecore file: " + ecoreFileLocation);
					ret = ecoreResource;
				} else {
					mapper.setXSDRoot(ecoreResource.getContents().get(0));
				}
				
			} catch (IOException e) {
				System.out.println("FAILED to create Ecore from XSD");
				System.out.println(e);
			}
		}
		return ret;
	}// createEcoreFromXSD

	public GenModel createGenModelFromEcore(String ecoreLocation, String genModelLocation) {
		// Ecore --> genmodel
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		URI fileURI = URI.createFileURI(ecoreLocation);
		Resource resource = resourceSet.getResource(fileURI, true);
		EPackage rootPackage = (EPackage) resource.getContents().get(0);

		return createGenModel(rootPackage, ecoreLocation, genModelLocation);
	}// createGenModelFromEcore

	private GenModel createGenModel(final EPackage rootPackage, final String ecoreLocation, final String genModelLocation) {
		String genModelDirectory = "/" + PROJECT_NAME + "/src";
		String genModelExtendsClass = "org.eclipse.emf.ecore.impl.MinimalEObjectImpl$Container";
		String genModelImporterId = "org.eclipse.emf.importer.ecore";
		String genModelXmlEncoding = Settings.MWE2_WORKFLOW_ENCODING;

		GenModel genModel = GenModelFactory.eINSTANCE.createGenModel();
		genModel.setComplianceLevel(GenJDKLevel.JDK80_LITERAL);
		genModel.setModelDirectory(genModelDirectory);
		genModel.getForeignModel().add(new Path(ecoreLocation).lastSegment());
		genModel.setModelName(Settings.GENMODEL_NAME);
		genModel.setRootExtendsClass(genModelExtendsClass);
		genModel.setImporterID(genModelImporterId);
		genModel.setCopyrightFields(false);
		genModel.setOperationReflection(true);
		genModel.setImportOrganizing(true);
		genModel.setModelPluginID(PROJECT_NAME);
		genModel.initialize(Collections.singleton(rootPackage));

		GenPackage genPackage = (GenPackage) genModel.getGenPackages().get(0);
		genPackage.setPrefix(Settings.GENMODEL_PREFIX);
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

	public void generateJavaCode(String genModelLocation, String ecoreModelLocation) {
		// Genmodel + Ecore --> Java Code
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("genmodel", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());

		URI genModelFileURI = URI.createURI(genModelLocation);
		URIConverter converter = new ExtensibleURIConverterImpl();
		URI genModelFileURINormalized = converter.normalize(genModelFileURI);

		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(GenModelPackage.eNS_URI, GenModelPackage.eINSTANCE);
		resourceSet.getURIConverter().getURIMap().put(URI.createURI("platform:/resource/"), URI.createFileURI(WORKSPACE_LOCATION));

		try {
			Resource genModelResource = resourceSet.getResource(genModelFileURINormalized, true);
			genModelResource.load(null);
			Resource ecoreResource = resourceSet.getResource(converter.normalize(URI.createURI(ecoreModelLocation)), true);
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
	
	public void changeGrammar(File input, File output, EcoreXSDMapper mapper) {
		AMEEnhance.refractorGrammar(input,output,mapper);
	}
	
	private EcoreXSDMapper mapper;
	
	public EcoreXSDMapper getMapper() {
		return mapper;
	}

	public Ecore2XtextProjectInfo generateXtextGrammarAndWorkflow(String genModelLocation, String ecoreModelLocation) {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("genmodel", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());

		URI genModelFileURI = URI.createURI(genModelLocation);
		URIConverter converter = new ExtensibleURIConverterImpl();
		URI genModelFileURINormalized = converter.normalize(genModelFileURI);

		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(GenModelPackage.eNS_URI, GenModelPackage.eINSTANCE);
		resourceSet.getURIConverter().getURIMap().put(URI.createURI("platform:/resource/"), URI.createFileURI(WORKSPACE_LOCATION));

		Ecore2XtextProjectInfo ecore2XtextProjectInfo = null;

		try {
			Resource genModelResource = resourceSet.getResource(genModelFileURINormalized, true);
			genModelResource.load(null);
			Resource ecoreResource = resourceSet.getResource(converter.normalize(URI.createURI(ecoreModelLocation)), true);
			ecoreResource.load(null);

			if (genModelResource.getContents().size() != 1) {
				System.out.println("Resource has " + genModelResource.getContents().size() + " loaded objects");
			} else {

				EPackageChooser ePackageChooser = new EPackageChooser();

				URI genModelURI = URI.createPlatformResourceURI(PROJECT_NAME + "/" + genModelLocation, true);

				List<EPackageInfo> ePackageInfos = Lists.newArrayList();
				ePackageInfos.addAll(ePackageChooser.createEPackageInfosFromGenModel(genModelURI, genModelResource));

				ecore2XtextProjectInfo = buildEcore2XtextProjectInfo(ePackageInfos);

				// Generate Xtext Grammar
				Ecore2XtextGrammarCreator ecore2XtextGrammarCreator = new Ecore2XtextGrammarCreator();
				CharSequence grammar = ecore2XtextGrammarCreator.grammar(ecore2XtextProjectInfo);

				// Write Xtext Grammar to file				
				writeCharSequenceToFile(grammar, "temp/" + Settings.XTEXT_GRAMMAR_FILE_NAME, Settings.XTEXT_FILE_ENCODING);
				
				changeGrammar(new File("temp"+File.separator+Settings.XTEXT_GRAMMAR_FILE_NAME),
						new File("temp"+File.separator+Settings.XTEXT_OUTPUT_GRAMMAR_FILE_NAME),
						mapper);

				// Generate MWE Workflow
				CharSequence workflowCharSequence = buildWorkflowCharSequence(ecore2XtextProjectInfo);
				
				// Write MWE Workflow to file
				writeCharSequenceToFile(workflowCharSequence, "temp/" + "Generate" + ecore2XtextProjectInfo.getLanguageNameAbbreviation() + ".mwe2", Settings.MWE2_WORKFLOW_ENCODING);
				
				// Add WizardConfiguration to ecore2XtextProjectInfo
				String mweSnippet = readStringFromFile("temp/" + "Generate" + ecore2XtextProjectInfo.getLanguageNameAbbreviation() + ".mwe2");
				String[] requiredBundles = new String[0];		
				WizardContribution wizardContribution = new WizardContribution("Use Last API", mweSnippet, requiredBundles, "1");
				ecore2XtextProjectInfo.setWizardContribution(wizardContribution);
				
//				moveToTarget("../.metadata/.plugins/org.eclipse.core.resources/.projects/XMLTextFramework/generated/" + Settings.XTEXT_GRAMMAR_FILE_NAME, "../" + Settings.LANGUAGE_PROJECT_NAME + "/src/" + Settings.LANGUAGE_PROJECT_NAME.replace('.', '/') + "/" + Settings.XTEXT_GRAMMAR_FILE_NAME);
//				moveToTarget("../.metadata/.plugins/org.eclipse.core.resources/.projects/XMLTextFramework/generated/" + "Generate" + Settings.LANGUAGE_NAME + ".mwe2", "../" + Settings.LANGUAGE_PROJECT_NAME + "/src/" + Settings.LANGUAGE_PROJECT_NAME.replace('.', '/') + "/" + "Generate" + Settings.LANGUAGE_NAME + ".mwe2");
				//moveToTarget("../.metadata/.plugins/org.eclipse.core.resources/.projects/XMLTextFramework/generated/" + Settings.LANGUAGE_NAME + "Serializer.java", "../" + Settings.LANGUAGE_PROJECT_NAME + "/src/" + Settings.LANGUAGE_PROJECT_NAME.replace('.', '/') + "/serializer" +"/" + Settings.LANGUAGE_NAME + "Serializer.java");
				//moveToTarget("../.metadata/.plugins/org.eclipse.core.resources/.projects/XMLTextFramework/generated/" + Settings.LANGUAGE_NAME + "SerializerTest.java", "../" + Settings.LANGUAGE_PROJECT_NAME + ".tests" + "/src/" + Settings.LANGUAGE_PROJECT_NAME.replace('.', '/') + "/serializer/tests" +"/" + Settings.LANGUAGE_NAME + "SerializerTest.java");
				
				performSyntaxCustomization("../" + Settings.LANGUAGE_PROJECT_NAME + "/src/" + Settings.LANGUAGE_PROJECT_NAME.replace('.', '/') + "/" + Settings.XTEXT_GRAMMAR_FILE_NAME);

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return ecore2XtextProjectInfo;

	}// generateXtextProjects

	private void performSyntaxCustomization(String string) {
		// the goal is to perform this directly in the Xpand Ecore2XtextGrammarCreator.java (originally Ecore2Xtext.xpt) 
		java.nio.file.Path path = Paths.get(string);
		Charset charset = StandardCharsets.UTF_8;

		String content;
		try {
			content = new String(Files.readAllBytes(path), charset);
			
			// PropertyMemberOpenTerminalSymbol
			content = content.replaceAll("'\\{'", "'\\" + Settings.PROPERTY_MEMBER_OPEN_TERMINAL_SYMBOL + "'");
			// PropertyMemberCloseTerminalSymbol
			content = content.replaceAll("'\\}'", "'\\" + Settings.PROPERTY_MEMBER_CLOSE_TERMINAL_SYMBOL + "'");
			// DropTypeInTerminal
			if (Settings.DROP_TYPE_IN_TERMINAL) {
				// Example: 'LibraryType' ==> 'Library'
				// TODO content = content.replaceAll("'[A-Z][a-z](?=Type'", "'[A-Z][a-z]'"); 
			}
			// SimpleTerminalForMultiFeatures
			if (Settings.SIMPLE_TERMINAL_FOR_MULTI_FEATURES) {
				// Example: 'book' '{' book+=BookType ( "," book+=BookType)* '}' ==> book+=BookType ( "," book+=BookType)*
				// TODO 
			}
				
			
			Files.write(path, content.getBytes(charset));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testPerformSyntaxCustomization() {
		performSyntaxCustomization("../" + Settings.LANGUAGE_PROJECT_NAME + "/src/" + Settings.LANGUAGE_PROJECT_NAME.replace('.', '/') + "/" + Settings.XTEXT_GRAMMAR_FILE_NAME);
	}

	public void generateXtextProjects(Ecore2XtextProjectInfo ecore2XtextProjectInfo) {
		// Xtext Projects Generation
		try {
			BasicMonitor.Printing monitor = new BasicMonitor.Printing(new PrintStream(Settings.XTEXT_PROJECT_GENERATOR_LOG_FILE_LOCATION));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BasicMonitor.Printing monitor = new BasicMonitor.Printing(System.out);

		Injector injector = Guice.createInjector(new XtextProjectCreatorInjector());
		MembersInjector<Ecore2XtextProjectCreator> membersInjector = injector.getInstance(new Key<MembersInjector<Ecore2XtextProjectCreator>>() {
		});

		Ecore2XtextProjectCreator ecore2XtextProjectCreator = new Ecore2XtextProjectCreator();
		membersInjector.injectMembers(ecore2XtextProjectCreator);
		
		ecore2XtextProjectCreator.setProjectInfo(ecore2XtextProjectInfo);
		
		createXtextProjects(ecore2XtextProjectCreator, ecore2XtextProjectInfo);
//		copyGrammarAndWorkflowFiles(ecore2XtextProjectInfo);
//		moveToTarget("../.metadata/.plugins/org.eclipse.core.resources/.projects/XMLTextFramework/generated/" + Settings.XTEXT_GRAMMAR_FILE_NAME, "../" + Settings.LANGUAGE_PROJECT_NAME + "/src/" + Settings.LANGUAGE_PROJECT_NAME.replace('.', '/') + "/" + Settings.XTEXT_GRAMMAR_FILE_NAME);

	}

	/**
	 * When using Ecore2XtextProjectCreator this is not necessary anymore
	 * @param ecore2XtextProjectInfo
	 */
	@Deprecated
	private void copyGrammarAndWorkflowFiles(Ecore2XtextProjectInfo ecore2XtextProjectInfo) {
		try {
			FileUtils fileUtils = new FileUtils();
			String grammarFileName = ecore2XtextProjectInfo.getLanguageNameAbbreviation() + ".xtext";
			String workflowFileName = "Generate" + ecore2XtextProjectInfo.getLanguageNameAbbreviation() + ".mwe2";
			String[] projectSubpath = Settings.LANGUAGE_PROJECT_NAME.split("\\.");
			String destinationPath = "src";
			for (String folder : projectSubpath) {
				destinationPath = destinationPath + ("/" + folder);
			}
			
			String grammarFileTargetLocation = "../" + Settings.LANGUAGE_PROJECT_NAME + "/" + destinationPath + "/" + grammarFileName;
			String workflowFileTargetLocation = "../" + Settings.LANGUAGE_PROJECT_NAME + "/" + destinationPath + "/" + workflowFileName;
			
			fileUtils.copyFile(new File(grammarFileName), new File(grammarFileTargetLocation));
			fileUtils.copyFile(new File(workflowFileName), new File(workflowFileTargetLocation));
		} catch (IOException e) {
			
		}
	}

	private void createXtextProjects(Ecore2XtextProjectCreator ecore2XtextProjectCreator, Ecore2XtextProjectInfo ecore2XtextProjectInfo) {
		createXtextDslProject(ecore2XtextProjectCreator);
		createXtextDslUiProject(ecore2XtextProjectCreator);
		if (ecore2XtextProjectInfo.isCreateTestProject()) {
			createXtextTestProject(ecore2XtextProjectCreator);
		}
		if (ecore2XtextProjectInfo.isCreateFeatureProject()) {
			createXtextFeatureProject(ecore2XtextProjectCreator);
		}
	}

	private void createXtextDslProject(Ecore2XtextProjectCreator ecore2XtextProjectCreator) {
		try {
			Class[] cArg = new Class[1];
			cArg[0] = IProgressMonitor.class;

			Method m = ecore2XtextProjectCreator.getClass().getSuperclass().getDeclaredMethod("createDslProject", cArg);
			m.setAccessible(true);
			IProgressMonitor progressMonitor = new NullProgressMonitor();
			IProject project = (IProject) m.invoke(ecore2XtextProjectCreator, progressMonitor);
			if (project != null) {
				System.out.println("Successfully created Xtext DSL project: " + Settings.LANGUAGE_PROJECT_NAME);
			}
		} catch (Exception e) {
			System.out.println("FAILED to generate Xtext DSL project");
			System.out.println(e);
		}
	}
	
	private void createXtextDslUiProject(Ecore2XtextProjectCreator ecore2XtextProjectCreator) {
		try {
			Class[] cArg = new Class[1];
			cArg[0] = IProgressMonitor.class;

			Method m = ecore2XtextProjectCreator.getClass().getSuperclass().getDeclaredMethod("createDslUiProject", cArg);
			m.setAccessible(true);
			IProgressMonitor progressMonitor = new NullProgressMonitor();
			IProject project = (IProject) m.invoke(ecore2XtextProjectCreator, progressMonitor);
			if (project != null) {
				System.out.println("Successfully created Xtext DSL UI project: " + Settings.LANGUAGE_PROJECT_NAME + ".ui");
			}
		} catch (Exception e) {
			System.out.println("FAILED to generate Xtext DSL UI project");
			System.out.println(e);
		}
	}
	
	private void createXtextTestProject(Ecore2XtextProjectCreator ecore2XtextProjectCreator) {
		try {
			Class[] cArg = new Class[1];
			cArg[0] = IProgressMonitor.class;

			Method m = ecore2XtextProjectCreator.getClass().getSuperclass().getDeclaredMethod("createTestProject", cArg);
			m.setAccessible(true);
			IProgressMonitor progressMonitor = new NullProgressMonitor();
			IProject project = (IProject) m.invoke(ecore2XtextProjectCreator, progressMonitor);
			if (project != null) {
				System.out.println("Successfully created Xtext Test project: " + Settings.LANGUAGE_PROJECT_NAME + ".tests");
			}
		} catch (Exception e) {
			System.out.println("FAILED to generate Xtext Test project");
			System.out.println(e);
		}
	}
	
	private void createXtextFeatureProject(XtextProjectCreator xtextProjectCreator) {
		try {
			Class[] cArg = new Class[1];
			cArg[0] = SubMonitor.class;

			Method m = xtextProjectCreator.getClass().getSuperclass().getDeclaredMethod("createFeatureProject", cArg);
			m.setAccessible(true);

			IProgressMonitor progressMonitor = new NullProgressMonitor();
			SubMonitor subMonitor = SubMonitor.convert(progressMonitor, "Creating DSL projects" + PROJECT_NAME, 4);
			IProject project = (IProject) m.invoke(xtextProjectCreator, subMonitor);			

			
			if (project != null) {
				System.out.println("Successfully created Xtext Feature project: " + Settings.LANGUAGE_PROJECT_NAME + ".sdk");
			}
		} catch (Exception e) {
			System.out.println("FAILED to generate Xtext Feature project");
			System.out.println(e);
		}
	}

	private CharSequence buildWorkflowCharSequence(Ecore2XtextProjectInfo ecore2XtextProjectInfo) {
		Ecore2XtextDslProjectContributor ecore2XtextDslProjectContributor = new Ecore2XtextDslProjectContributor(ecore2XtextProjectInfo);
		ecore2XtextDslProjectContributor.setModelFolder("src");
		CharSequence workflowCharSequence = null;

		try {
			Method workflowMethod = ecore2XtextDslProjectContributor.getClass().getDeclaredMethod("workflow", null);
			workflowMethod.setAccessible(true);
			workflowCharSequence = (CharSequence) workflowMethod.invoke(ecore2XtextDslProjectContributor, null);
		} catch (Exception e) {
			System.out.println("FAILED to generate MWE workflow");
			System.out.println(e);
		}
		return workflowCharSequence;
	}

	@SuppressWarnings("restriction")
	private Ecore2XtextProjectInfo buildEcore2XtextProjectInfo(List<EPackageInfo> ePackageInfos) {
		Ecore2XtextProjectInfo ecore2XtextProjectInfo = new Ecore2XtextProjectInfo();
		ecore2XtextProjectInfo.setEPackageInfos(ePackageInfos);
		ecore2XtextProjectInfo.setDefaultEPackageInfo(ePackageInfos.get(0));
		EPackage ePackage = ePackageInfos.get(0).getEPackage();
		
		EClass rootElementClass = null;
		
		try {
			// find global feature (elements of DocumentRoot) --> currently only one is supported. 
			// To generate a more complete grammar it is necessary to produce a grammar for each of these elements and glue all these grammars together
			EClassifier documentRoot = ePackage.getEClassifier(Settings.ROOT_ELEMENT_NAME);
			
			Field eStructuralFeaturesField = documentRoot.getClass().getDeclaredField("eStructuralFeatures");
			eStructuralFeaturesField.setAccessible(true);
			EObjectContainmentWithInverseEList<EStructuralFeature> eStructuralFeaturesFieldValue = (EObjectContainmentWithInverseEList<EStructuralFeature>) eStructuralFeaturesField.get(documentRoot);
			List<EStructuralFeature> eStructuralFeaturesList = eStructuralFeaturesFieldValue.basicList();
			if (eStructuralFeaturesList.size() > 4) {
				System.out.println("ERROR: Not yet supported - DocumentRoot contains multiple global features.");
				System.exit(1); // not supported yet
			}
			EStructuralFeature globalFeature = null;
			for (EStructuralFeature eStructuralFeature : eStructuralFeaturesList) {
				if ( !eStructuralFeature.getName().equals("mixed") && !eStructuralFeature.getName().equals("xMLNSPrefixMap") && !eStructuralFeature.getName().equals("xSISchemaLocation")) {
					globalFeature = eStructuralFeature;
					System.out.println("Grammar global feature element found: " + globalFeature.getEType().getName());
				}
			}// for all features in DocumentRoot
			
			EClassifier rootElementClassifier = globalFeature.getEType();
			rootElementClass = (EClass) rootElementClassifier;
			
			
			// select global feature element for class (does not impact the generated grammar)
			Class <?> c = rootElementClass.getClass().getSuperclass(); 
			Field ePackageField = c.getDeclaredField("ePackage");
			ePackageField.setAccessible(true);		
			ePackageField.set(rootElementClass, ePackage);
			
			rootElementClass = (EClass)documentRoot;
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			System.out.println("FAILED to select root package for class");
			e.printStackTrace();
		}
		
		ecore2XtextProjectInfo.setRootElementClass(rootElementClass);

		// set other parameters
		ecore2XtextProjectInfo.setCreateEclipseRuntimeLaunchConfig(true);
		ecore2XtextProjectInfo.setCreateFeatureProject(true);
		ecore2XtextProjectInfo.setCreateTestProject(true);
		ecore2XtextProjectInfo.setEncoding(Settings.LANGUAGE_ENCODING);
		ecore2XtextProjectInfo.setFileExtension(Settings.LANGUAGE_FILE_EXTENSION);
		ecore2XtextProjectInfo.setLanguageName(Settings.LANGUAGE_PROJECT_NAME + "." + Settings.LANGUAGE_NAME);
		ecore2XtextProjectInfo.setProjectName(Settings.LANGUAGE_PROJECT_NAME);

		ecore2XtextProjectInfo.setProjectsRootLocation(new Path(XTEXT_DSL_PROJECT_LOCATION));
		
		// Workbench workbench = Workbench.getInstance();
		// ecore2XtextProjectInfo.setWorkbench(workbench);
		ecore2XtextProjectInfo.setWorkingSets(new IWorkingSet[0]);
		return ecore2XtextProjectInfo;
	}
	
	public static void copyEStructuralFeature(EStructuralFeature src, EStructuralFeature target) {
		target.setName(src.getName());
		target.setChangeable(src.isChangeable());
		target.setDerived(src.isDerived());
		//target.setDefaultValue(src.getDefaultValue());
		target.setLowerBound(src.getLowerBound());
		target.setUpperBound(src.getUpperBound());
		target.setTransient(src.isTransient());
		target.setUnique(src.isUnique());
		target.setUnsettable(src.isUnsettable());
		target.setVolatile(src.isVolatile());
	}
	
	/**
	 * Here, the following changes are performed on a given Ecore metamodel:
	 * - Remove all occurrences of ExtendedMetaData
	 * - Set volatile/derived/transient=false (everywhere)
	 * - Perform manual changes programmatically - see here: http://stackoverflow.com/questions/30034826/create-and-modify-ecore-files-and-their-instances-from-code
	 * (reason: these elements and attributes cause the Xtext Grammar Generator to not correctly generate grammar)
	 * 
	 * @param ecoreResource initial ecore metamodel
	 */
	public void refactorEcore(Resource ecoreResource) {
		org.eclipse.emf.common.util.TreeIterator<EObject> iter = ecoreResource.getAllContents();
		while (iter.hasNext()) {
			EObject next = iter.next();
			if (next instanceof EStructuralFeature) {
				EStructuralFeature esf = (EStructuralFeature)next;
				// Set volatile/derived/transient=false (everywhere)
				esf.setTransient(false);
				esf.setVolatile(false);
				esf.setDerived(false);
				EClassifier type = esf.getEType();
				//System.out.println(esf.getName());
				if (type instanceof EDataType) {
					//http://www.eclipse.org/emf/2003/XMLType#//IDREF
					if (!(type.eContainer() instanceof XMLTypePackage)) {
						continue;
					}
					XMLTypePackage pkg = (XMLTypePackage)type.eContainer();
					if (!"http://www.eclipse.org/emf/2003/XMLType".equals(pkg.getNsURI())) {
						continue;
					}
					
					if ("IDREF".equals(type.getName())) {
						
						EClass cl = (EClass)esf.eContainer();
						cl.getEStructuralFeatures().remove(esf);
						EReference ref = EcoreFactory.eINSTANCE.createEReference();
						copyEStructuralFeature(esf, ref);
						ref.setEType(EcorePackage.Literals.EOBJECT);
						ref.setLowerBound(0);
						cl.getEStructuralFeatures().add(ref);
					}
				}
				if (next instanceof EReference) {
					EReference ref = (EReference)next;
					
				}
			}
					
		}
		
//		moveToTarget("../.metadata/.plugins/org.eclipse.core.resources/.projects/XMLTextFramework/generated/" + Settings.REFACTORED_ECORE_FILE_NAME, Settings.REFACTORED_ECORE_FILE_NAME);
//		moveToTarget("../.metadata/.plugins/org.eclipse.core.resources/.projects/XMLTextFramework/generated/" + Settings.REFACTORED_GENMODEL_FILE_NAME, Settings.REFACTORED_GENMODEL_FILE_NAME);
		System.out.println("Finished refactoring ecore file: " + Settings.REFACTORED_ECORE_FILE_NAME);
	}

	private void writeCharSequenceToFile(CharSequence charSequence, String filePath, String encoding) {
		File file = new File(filePath);

		FileUtils fileUtils = new FileUtils();
		try {
			fileUtils.write(file, charSequence, encoding);
			System.out.println("Created file: " + filePath);
		} catch (Exception e) {
			System.out.println("FAILED to write character sequence to file " + filePath);
			System.out.println(e);
		}
	}
	
	private void writeStringToFile(String content, String filePath, String encoding) {
		File file = new File(filePath);

		FileUtils fileUtils = new FileUtils();
		try {
			fileUtils.writeStringToFile(file, content, encoding);
			System.out.println("Created file: " + filePath);
		} catch (Exception e) {
			System.out.println("FAILED to write String to file " + filePath);
			System.out.println(e);
		}
	}
	
	private String readStringFromFile(String filePath) {
		File file = new File(filePath);

		FileUtils fileUtils = new FileUtils();
		String fileContentString = null;
		try {
			fileContentString = fileUtils.readFileToString(file, Settings.MWE2_WORKFLOW_ENCODING);
			System.out.println("Read file: " + filePath);
		} catch (Exception e) {
			System.out.println("FAILED to read file " + filePath);
			System.out.println(e);
		}
		return fileContentString;
	}
	
	private void moveToTarget(String sourceFilePath, String targetFilePath) {
		File file = new File(sourceFilePath);

		FileUtils fileUtils = new FileUtils();
		String fileContentString = null;
		try {
			File sourceFile = new File(sourceFilePath);
			sourceFile.setLastModified(new Date().getTime());
			fileUtils.copyFile(new File(sourceFilePath), new File(targetFilePath));
			//System.out.println("Copied file: " + sourceFilePath);
			//System.out.println("To location: " + targetFilePath);
		} catch (Exception e) {
			System.out.println("FAILED to copy file " + sourceFilePath);
			System.out.println(e);
		}
	}

}
