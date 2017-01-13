package mypackage;

import java.io.File;

import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchManager;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap; 
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
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
import org.eclipse.emf.mwe2.language.Mwe2StandaloneSetup;
import org.eclipse.emf.mwe2.language.factory.Mwe2ExecutionEngine;
import org.eclipse.emf.mwe2.launch.runtime.Mwe2Launcher;
import org.eclipse.emf.mwe2.launch.runtime.Mwe2Runner;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkingSet;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.wizards.IWizardCategory;
import org.eclipse.ui.wizards.IWizardDescriptor;
import org.eclipse.ui.wizards.IWizardRegistry;
import org.eclipse.xsd.ecore.XSDEcoreBuilder;
import org.eclipse.xtend.typesystem.emf.EcoreUtil2;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.XtextStandaloneSetup;
import org.eclipse.xtext.ui.shared.JdtHelper;
import org.eclipse.xtext.ui.util.IJdtHelper;
import org.eclipse.xtext.ui.wizard.IProjectCreator;
import org.eclipse.xtext.ui.wizard.IProjectInfo;
import org.eclipse.xtext.ui.wizard.XtextNewProjectWizard;
import org.eclipse.xtext.util.JavaVersion;
import org.eclipse.xtext.util.XtextVersion;
import org.eclipse.xtext.xtext.wizard.EPackageInfo;
import org.eclipse.xtext.xtext.wizard.Ecore2XtextConfiguration;
import org.eclipse.xtext.xtext.wizard.LanguageDescriptor;
import org.eclipse.xtext.xtext.wizard.LanguageDescriptor.FileExtensions;
import org.eclipse.xtext.xtext.wizard.WizardConfiguration;
import org.eclipse.xtext.xtext.wizard.ecore2xtext.Ecore2XtextGrammarCreator;
import org.eclipse.xtext.xtext.generator.model.project.BundleProjectConfig;
import org.eclipse.xtext.xtext.generator.model.project.XtextProjectConfig;
import org.eclipse.xtext.xtext.ui.wizard.ecore2xtext.NewXtextProjectFromEcoreWizard;
import org.eclipse.xtext.xtext.ui.wizard.project.NewXtextProjectWizard;
import org.eclipse.xtext.xtext.ui.wizard.project.XtextProjectCreator;
import org.eclipse.xtext.xtext.ui.wizard.project.XtextProjectInfo;
import org.junit.Test;

import com.google.common.collect.Lists;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.MembersInjector;

import at.ac.tuwien.big.xmltext.EcoreResourceGenerator;
import at.ac.tuwien.big.xmltext.EcoreToGenericEcoreTransformer;
import at.ac.tuwien.big.xmltext.XsdToEcoreTransformer;
import at.ac.tuwien.big.xmltext.ecoretransform.impl.TransformatorStructure;
import at.ac.tuwien.big.xmltext.ecoretransform.impl.TypeTransformatorStore;
import at.ac.tuwien.util.ObjectSerializer;


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
public class XsdToXtextGeneratorBroken {

	public static final String GENMODEL_FILE_NAME = "library3simple.genmodel";
	public static final String ECORE_FILE_NAME = "library3simple.ecore";
	public static final String ECORE_INIT_FILE_NAME = "library3base.ecore";
	public  static final String XSD_FILE_NAME = "library3.xsd";
	public  static final String XTEXT_GRAMMAR_FILE_NAME = "TheLibrary.xtext";
	
	/**
	 * ECLIPSE_WORKSPACE_LOCATION has to exactly match the workspace folder in
	 * which this projects resides
	 */
	private String WORKSPACE_LOCATION;
	/**
	 * Location of the Xtext main project
	 */
	private boolean useRuntimeProjectLocationForXText = true;
	//TODO: Leider geht es nicht anders
	private String XTEXT_DSL_PROJECT_LOCATION;
	private String TARGET_WORKSPACE_LOCATION;
	private String PROJECT_DIRECTORY;
	/**
	 * Name of this project
	 */
	private String PROJECT_NAME;
	
		
	
	public XsdToXtextGeneratorBroken() {
		// default constructor override
		System.out.println("Created an instance of " + this.getClass());
		
		String projectDirectory = XsdToXtextGeneratorBroken.class.getProtectionDomain().getCodeSource().getLocation().getPath();
		if (projectDirectory.endsWith("bin/")) {
			PROJECT_DIRECTORY = projectDirectory.substring(1, projectDirectory.length()-5);
		} else {
		    PROJECT_DIRECTORY = projectDirectory.substring(1, projectDirectory.length()-1);
		}
	    PROJECT_NAME = PROJECT_DIRECTORY.substring(
	    		PROJECT_DIRECTORY.lastIndexOf("/")+1, 
	    		PROJECT_DIRECTORY.length());
		IWorkspace space = ResourcesPlugin.getWorkspace();
		IPath rootPath = space.getRoot().getLocation();
		File file = rootPath.toFile();
		WORKSPACE_LOCATION = PROJECT_DIRECTORY.substring(0, PROJECT_DIRECTORY.lastIndexOf("/")+1);
		try {
			TARGET_WORKSPACE_LOCATION = file.getCanonicalPath();
		} catch (IOException e) {
			TARGET_WORKSPACE_LOCATION = WORKSPACE_LOCATION;
			e.printStackTrace();
		} 
		if (useRuntimeProjectLocationForXText) {
			XTEXT_DSL_PROJECT_LOCATION = TARGET_WORKSPACE_LOCATION;
		} else {
			XTEXT_DSL_PROJECT_LOCATION = WORKSPACE_LOCATION;			
		}
		System.out.println("Xtext DSL Project Location: "+XTEXT_DSL_PROJECT_LOCATION);
	}
	
	public void printWizardIds(IWizardCategory cat) {
		for (IWizardDescriptor d: cat.getWizards()) {
			System.out.println(d.getId());
		}
		for (IWizardCategory sc: cat.getCategories())  {
			printWizardIds(sc);
		}
	}
	
	@Test
	public void runConstructor() {
		
		ILaunchManager manager = DebugPlugin.getDefault().getLaunchManager();
		try {
			for (ILaunchConfiguration config: manager.getLaunchConfigurations()) {
				System.out.println(config);
			}
			for (ILaunchConfiguration config: manager.getLaunchConfigurations()) {
				System.out.println(config);
			}
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Mwe2StandaloneSetup setup = new Mwe2StandaloneSetup();
		Injector injector = setup.createInjectorAndDoEMFRegistration();
		Mwe2Runner runner = injector.getInstance(Mwe2Runner.class);
		
		String mweFileLocation = new File("C:\\Users\\Robert\\Documents\\eclipseMars\\eclipseEcore2ASP\\junit-workspace\\org.xtext.example.testdsl\\src\\org\\xtext\\example\\testdsl\\GenerateTestDSL.mwe2").getAbsolutePath();
		Map<String,String> pars = new HashMap<String, String>();
		pars.put("fileEncoding", "UTF-8");
		runner.run(URI.createFileURI(mweFileLocation),pars);
		
		/*Mwe2Launcher.main(new String[] { 
				org.eclipse.emf.common.util.URI.createFileURI(mweFileLocation).toString(), "-p",
				"fileEncoding=UTF-8"});*/
		
		/*
		String id = "";
		IWizardRegistry registry = PlatformUI.getWorkbench().getNewWizardRegistry();
		IWizardDescriptor wizardDescriptor = registry.findWizard("org.eclipse.xtext.xtext.ui.wizard.ecore2xtext.NewXtextProjectFromEcoreWizard");
		
		
		NewXtextProjectFromEcoreWizard wizard = null;
		try {
			wizard = (NewXtextProjectFromEcoreWizard)wizardDescriptor.createWizard();
			wizard.init(PlatformUI.getWorkbench(), new StructuredSelection());
			wizard.addPages();
		} catch (CoreException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		

		
		WizardDialog dialog = new WizardDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell(), wizard);
		dialog.setTitle(wizard.getWindowTitle());
		dialog.setBlockOnOpen(true);
		dialog.open();
		try {
			Method m = wizard.getClass().getDeclaredMethod("getProjectInfo");
			m.setAccessible(true);
			XtextProjectInfo info = (XtextProjectInfo)m.invoke(wizard);
			System.out.println(ObjectSerializer.fullSerialize(info, 5));
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
	}
	
	public Resource simplifyEcore(Resource ecoreResource, String targetName, EClass[] rootClass) {
		EcoreToGenericEcoreTransformer transformer = new EcoreToGenericEcoreTransformer();
		transformer.setTargetFilename(targetName);
		transformer.setXsdEcore(ecoreResource);
		Resource result = transformer.getResult();
		rootClass[0] = transformer.getRootClass();
		transformer.saveResult();
		return result;
		/*TransformatorStructure struct = TransformatorStructure.fromXmlEcore(new TypeTransformatorStore(), ecoreResource.getResourceSet(),
				ecoreResource, targetName);
		rootClass[0] = struct.getEcoreRoot();
		rootClass[0] = struct.getEcoreRoot();
		Resource ecoreRResource = struct.getEcoreResource();
		try {
			ecoreRResource.save(new FileOutputStream(new File(ECORE_FILE_NAME)), null);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return ecoreRResource;*/
	}

	/**
	 * RUN AS JUNIT TEST
	 * 
	 * INPUT: XSD
	 * OUTPUT: Ecore, GenModel, Java Model Code, Java Edit Code, Java Editor Code, and Java Test Code, Xtext Grammar (adapted), MWE2 Workflow
	 */ 
	@Test
	public void runGeneratorPart1() {
		XsdToXtextGeneratorBroken xsdToXtextGenerator = new XsdToXtextGeneratorBroken();
		Resource ecoreResource = createEcoreFromXSD(XSD_FILE_NAME, ECORE_INIT_FILE_NAME);
		EClass[] rootClass = new EClass[1];
		ecoreResource = simplifyEcore(ecoreResource,ECORE_FILE_NAME,rootClass);
		
		EcoreResourceGenerator generator = new EcoreResourceGenerator(ECORE_FILE_NAME, GENMODEL_FILE_NAME, PROJECT_NAME, WORKSPACE_LOCATION);
		GenModel genModel = generator.getGenmodel();
		
		
		URI genmodelFileURI = URI.createFileURI(GENMODEL_FILE_NAME);
		String sub1 = null;
		try {
			sub1 = new File(GENMODEL_FILE_NAME).getCanonicalFile().getParentFile().getName();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		File testTarget = new File(TARGET_WORKSPACE_LOCATION+File.separator+sub1+File.separator+GENMODEL_FILE_NAME);
		copyFile(new File(GENMODEL_FILE_NAME).getAbsolutePath(), testTarget.getAbsolutePath());
		

		File testTarget2 = new File(TARGET_WORKSPACE_LOCATION+File.separator+sub1+File.separator+ECORE_FILE_NAME);
		copyFile(new File(ECORE_FILE_NAME).getAbsolutePath(), testTarget2.getAbsolutePath());
		

		File testTarget3 = new File(TARGET_WORKSPACE_LOCATION+File.separator+sub1+File.separator+ECORE_INIT_FILE_NAME);
		copyFile(new File(ECORE_INIT_FILE_NAME).getAbsolutePath(), testTarget3.getAbsolutePath());

		generator.generateModelCode();
		
		XtextProjectInfo Ecore2XtextConfiguration = generateXtextGrammarAndWorkflow(GENMODEL_FILE_NAME, ecoreResource, rootClass[0]);
		
	
		
		
		String mweFileLocation = new File(XTEXT_DSL_PROJECT_LOCATION+File.separator+Settings.LANGUAGE_PROJECT_NAME + "/src/" + Settings.LANGUAGE_PROJECT_NAME.replace('.', '/') + "/Generate" + Settings.LANGUAGE_NAME + ".mwe2").getAbsolutePath();
		System.out.println("I assume the mwe file location is in "+mweFileLocation);
		//copyFile("../" + Settings.LANGUAGE_PROJECT_NAME + "/src/" + Settings.LANGUAGE_PROJECT_NAME.replace('.', '/') + "/" + XTEXT_GRAMMAR_FILE_NAME,XTEXT_GRAMMAR_FILE_NAME);
		if (!new File(mweFileLocation).exists()) {
			System.err.println("But it is not there ...");
			File temp = new File(TARGET_WORKSPACE_LOCATION+File.separator+Settings.LANGUAGE_PROJECT_NAME + "/src/" + Settings.LANGUAGE_PROJECT_NAME.replace('.', '/') + "/Generate" + Settings.LANGUAGE_NAME + ".mwe2"); 
			if (temp.exists()) {
				System.err.println("Bug: Could not create the xtext projects in "+XTEXT_DSL_PROJECT_LOCATION);
				mweFileLocation = temp.getAbsolutePath();
			}
		}
		
		ILaunchManager manager = DebugPlugin.getDefault().getLaunchManager();
		try {
			for (ILaunchConfiguration config: manager.getLaunchConfigurations()) {
				System.out.println(config);

				if (config.getName().equals("Generate"+Settings.LANGUAGE_NAME+".mwe2")) {
					System.out.println("Launching "+config.getName());
					config.launch("RUN_MODE", new NullProgressMonitor());
					
				}
			}
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (new File(mweFileLocation).exists()) {
			Injector injector = new Mwe2StandaloneSetup().createInjectorAndDoEMFRegistration();
			Map<String,String> properties = new HashMap<>();
			Mwe2Runner runner = injector.getInstance(Mwe2Runner.class);
			runner.run(URI.createFileURI(mweFileLocation), properties);
			Mwe2Launcher.main(new String[] { 
				URI.createFileURI(mweFileLocation).toString(), "-p",
				"fileEncoding=".concat(Settings.MWE2_WORKFLOW_ENCODING)});
		}
		//executeMwe2Workflow("file:///" + WORKSPACE_LOCATION + Settings.LANGUAGE_PROJECT_NAME + "/src/" + Settings.LANGUAGE_PROJECT_NAME.replace('.', '/') + "/Generate" + Settings.LANGUAGE_NAME + ".mwe2");
		//adaptXtextGrammar("../" + Settings.LANGUAGE_PROJECT_NAME + "/src/" + Settings.LANGUAGE_PROJECT_NAME.replace('.', '/') + "/" + XTEXT_GRAMMAR_FILE_NAME);
		
	}
	
	/**
	 * RUN AS JUNIT PLUGIN TEST
	 * 
	 * INPUT: Ecore and GenModel
	 * OUTPUT: Xtext DSL project, Xtext SDK project, Xtext Tests project, Xtext UI project
	 */
	@Test
	public void runGeneratorPart2() {
		/*XtextProjectInfo Ecore2XtextConfiguration = generateXtextGrammarAndWorkflow(GENMODEL_FILE_NAME, ECORE_FILE_NAME); // doing this again .. TODO: avoid this
		//generateXtextProjects(Ecore2XtextConfiguration);
		// copy adapted Xtext grammar to project
		copyFile(XTEXT_GRAMMAR_FILE_NAME, "../" + Settings.LANGUAGE_PROJECT_NAME + "/src/" + Settings.LANGUAGE_PROJECT_NAME.replace('.', '/') + "/" + XTEXT_GRAMMAR_FILE_NAME);*/
	}
		
	private void adaptXtextGrammar(String xtextGrammarFileLocation) {
		// load generated ecore and xtext grammar and modify grammar to match desired grammar
		
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		URI fileURI = resourceSet.getURIConverter().normalize(URI.createFileURI(ECORE_FILE_NAME));
		Resource resource = resourceSet.getResource(fileURI, true);
		EPackage rootPackage = (EPackage) resource.getContents().get(0);
		
		// lookup types of "java.lang.String"
		EList<EClassifier> eClassifiers = rootPackage.getEClassifiers();
		EList<EClassifier> eStringClassifiers = new BasicEList<EClassifier>();
		for (EClassifier eClassifier : eClassifiers) {
			if (eClassifier instanceof EDataType && eClassifier.getInstanceTypeName().equals("java.lang.String")) {
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
		//executeMwe2Workflow("file:///" + WORKSPACE_LOCATION + Settings.LANGUAGE_PROJECT_NAME + "/src/" + Settings.LANGUAGE_PROJECT_NAME.replace('.', '/') + "/Generate" + Settings.LANGUAGE_NAME + ".mwe2");
	}
	
	public void executeMwe2Workflow(String mweFileLocation) {
		Mwe2Launcher.main(new String[] { 
				mweFileLocation, "-p",
				"fileEncoding=".concat(Settings.MWE2_WORKFLOW_ENCODING)});
		System.out.println("Successfully executed MWE2 workflow: " + mweFileLocation);
	}

	public Resource createEcoreFromXSD(String xsdFileLocation, String ecoreFileLocation) {
		XsdToEcoreTransformer transformer = new XsdToEcoreTransformer();
		transformer.setXsd(xsdFileLocation);
		Resource ret = transformer.getResult();
		transformer.saveResult(new File(ecoreFileLocation));
		return ret;
		// XSD --> Ecore
		/*XSDEcoreBuilder xsdEcoreBuilder = new XSDEcoreBuilder();
		URI platformUri = URIConverter.INSTANCE.normalize(URI.createFileURI(xsdFileLocation));
		Collection<Resource> ecoreResources = xsdEcoreBuilder.generateResources(platformUri);

		System.out.println("Input: " + xsdFileLocation);

		// for every resource found (includes eventually referenced XSDs)
		for (Resource ecoreResource : ecoreResources) {
			try {
				if (ecoreResource.getClass().getName().contains("EcoreResourceFactoryImpl")) {
					// correct URI
					//URI platformURI = URI.createPlatformPluginURI(xsdFileLocation, false);
					ecoreResource.setURI(platformUri);
					EPackage rootPackage = (EPackage) ecoreResource.getContents().get(0);
					rootPackage.setNsURI(platformUri.toString());
					rootPackage.setName(rootPackage.getName().replace('.', '_').toLowerCase()); // replace dot's with underscore's (otherwise: not well formed name)
					// save
					ecoreResource.save(new FileOutputStream(new File(ecoreFileLocation)), null);
					System.out.println("Finished generating ecore file: " + ecoreFileLocation);

					return ecoreResource;
				}
			} catch (IOException e) {
				System.out.println("FAILED to create Ecore from XSD");
				System.out.println(e);
			}
		}
		return null;*/
	}// createEcoreFromXSD



	@SuppressWarnings("restriction")
	private XtextProjectInfo generateXtextGrammarAndWorkflow(String genModelLocation, Resource ecoreResource, EClass ecoreResourceRoot) {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("genmodel", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());

		URI genModelFileURI = URI.createURI(genModelLocation);
		URIConverter converter = new ExtensibleURIConverterImpl();
		URI genModelFileURINormalized = converter.normalize(genModelFileURI);

		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(GenModelPackage.eNS_URI, GenModelPackage.eINSTANCE);
		resourceSet.getURIConverter().getURIMap().put(URI.createURI("platform:/resource/"), URI.createFileURI(WORKSPACE_LOCATION));

		XtextProjectInfo ecore2XtextConfiguration = null;
		
		
		IWizardRegistry registry = PlatformUI.getWorkbench().getNewWizardRegistry();
		IWizardDescriptor wizardDescriptor = registry.findWizard("org.eclipse.xtext.xtext.ui.wizard.ecore2xtext.NewXtextProjectFromEcoreWizard");
		

		
		NewXtextProjectFromEcoreWizard wizard = null;
		try {
			wizard = (NewXtextProjectFromEcoreWizard)wizardDescriptor.createWizard();
			wizard.init(PlatformUI.getWorkbench(), new StructuredSelection());
			wizard.addPages();
		} catch (CoreException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		

		
		/*WizardDialog dialog = new WizardDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell(), wizard);
		dialog.setTitle(wizard.getWindowTitle());
		dialog.setBlockOnOpen(true);
		dialog.open();*/
		


		try {
			Resource genModelResource = resourceSet.getResource(genModelFileURINormalized, true);
			genModelResource.load(null);

			if (genModelResource.getContents().size() != 1) {
				System.out.println("Resource has " + genModelResource.getContents().size() + " loaded objects");
			} else {

				EPackageChooser ePackageChooser = new EPackageChooser();

				URI genModelURI = URI.createPlatformResourceURI(PROJECT_NAME + "/" + genModelLocation, true);

				List<EPackageInfo> ePackageInfos = Lists.newArrayList();
				ePackageInfos.addAll(ePackageChooser.createEPackageInfosFromGenModel(genModelURI, genModelResource));

				ecore2XtextConfiguration = buildEcore2XtextConfiguration(new XtextProjectInfo(),ePackageInfos,ecoreResourceRoot);

				// Generate Xtext Grammar
				Ecore2XtextGrammarCreator ecore2XtextGrammarCreator = new Ecore2XtextGrammarCreator();
				
				
				/*XtextProjectCreator creator = new XtextProjectCreator();
				
				ecore2XtextProjectInfo.setCreateTestProject(true);
				ecore2XteinfoxtProjectInfo.setEncoding(Settings.LANGUAGE_ENCODING);
				ecore2XtextProjectInfo.setFileExtension(Settings.LANGUAGE_FILE_EXTENSION);
				ecore2XtextProjectInfo.setLanguageName(Settings.LANGUAGE_PROJECT_NAME + "." + Settings.LANGUAGE_NAME);
				ecore2XtextProjectInfo.setProjectName(Settings.LANGUAGE_PROJECT_NAME);				
				// Workbench workbench = Workbench.getInstance();
				// ecore2XtextProjectInfo.setWorkbench(workbench);
				ecore2XtextProjectInfo.setWorkingSets(new IWorkingSet[0]);
				
				JdtHelper jdthelper = new JdtHelper();*/
				
				
				CharSequence grammar = ecore2XtextGrammarCreator.grammar(ecore2XtextConfiguration);
						
				
				{
					ecore2XtextConfiguration.getUiProject().setEnabled(true);
					ecore2XtextConfiguration.getIdeProject().setEnabled(true);
					System.out.println(ObjectSerializer.fullSerialize(ecore2XtextConfiguration, 5));
					Field creatorField = XtextNewProjectWizard.class.getDeclaredField("creator");
					creatorField.setAccessible(true);
					IProjectCreator creator = (IProjectCreator)creatorField.get(wizard);
					creator.setProjectInfo(ecore2XtextConfiguration);
					creator.run(new NullProgressMonitor());
					
				}
				
				
				//ecore2XtextConfiguration.getRuntimeProject().setEnabled(true);
				
				
				// Write Xtext Grammar to file				
				/*writeCharSequenceToFile(grammar, XTEXT_GRAMMAR_FILE_NAME, Settings.XTEXT_FILE_ENCODING);
				
				//ecore2XtextConfiguration.getTargetPlatformProject().setEnabled(true);
				//ecore2XtextConfiguration.getRuntimeProject().getConfig().getUiProject().setEnabled(true);
				//ecore2XtextConfiguration.getParentProject().setEnabled(true);
				//ecore2XtextConfiguration.getP2Project().setEnabled(true);
				

				// Generate MWE Workflow
				CharSequence workflowCharSequence = buildWorkflowCharSequence(ecore2XtextConfiguration);
				
				// Write MWE Workflow to file
				writeCharSequenceToFile(workflowCharSequence, "Generate" + ecore2XtextConfiguration.getLanguage().getSimpleName() + ".mwe2", Settings.MWE2_WORKFLOW_ENCODING);
				
				// Add WizardConfiguration to Ecore2XtextConfiguration
				String mweSnippet = readStringFromFile("Generate" + ecore2XtextConfiguration.getLanguage().getSimpleName() + ".mwe2");
				String[] requiredBundles = new String[0];		
				WizardContribution wizardContribution = new WizardContribution("Use Last API", mweSnippet, requiredBundles, "1");
				ecore2XtextConfiguration.setWizardContribution(wizardContribution);*/

			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		return ecore2XtextConfiguration;

	}// generateXtextProjects
/*
	public void generateXtextProjects(Ecore2XtextConfiguration Ecore2XtextConfiguration) {
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
		
		ecore2XtextProjectCreator.setProjectInfo(Ecore2XtextConfiguration);
		
		createXtextProjects(ecore2XtextProjectCreator, Ecore2XtextConfiguration);
//		copyGrammarAndWorkflowFiles(Ecore2XtextConfiguration);

	}*/

	/**
	 * When using Ecore2XtextProjectCreator this is not necessary anymore
	 * @param ecore2XtextConfiguration
	 */
	/*@Deprecated
	private void copyGrammarAndWorkflowFiles(Ecore2XtextConfiguration Ecore2XtextConfiguration) {
		try {
			FileUtils fileUtils = new FileUtils();
			String grammarFileName = Ecore2XtextConfiguration.getLanguageNameAbbreviation() + ".xtext";
			String workflowFileName = "Generate" + Ecore2XtextConfiguration.getLanguageNameAbbreviation() + ".mwe2";
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
	}*//*

	private void createXtextProjects(Ecore2XtextProjectCreator ecore2XtextProjectCreator, Ecore2XtextConfiguration Ecore2XtextConfiguration) {
		createXtextDslProject(ecore2XtextProjectCreator);
		createXtextDslUiProject(ecore2XtextProjectCreator);
		if (Ecore2XtextConfiguration.isCreateTestProject()) {
			createXtextTestProject(ecore2XtextProjectCreator);
		}
		if (Ecore2XtextConfiguration.isCreateFeatureProject()) {
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
	}*//*

*//*
	
	private CharSequence buildWorkflowCharSequence(Ecore2XtextConfiguration ecore2XtextConfiguration) {
		
		Ecore2XtextDslProjectContributor ecore2XtextDslProjectContributor = new Ecore2XtextDslProjectContributor(ecore2XtextConfiguration);
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
	}*/
	
	

	@SuppressWarnings("restriction")
	private XtextProjectInfo buildEcore2XtextConfiguration(XtextProjectInfo info, List<EPackageInfo> ePackageInfos, EClass rootClass) {
		XtextProjectCreator creator = new XtextProjectCreator();
		info.setEncoding(Charset.defaultCharset());
		info.setJavaVersion(JavaVersion.JAVA8);
		info.setXtextVersion(XtextVersion.getCurrent());
		info.setBaseName(Settings.LANGUAGE_PROJECT_NAME + "." + Settings.LANGUAGE_NAME);
		info.setProjectName(Settings.LANGUAGE_PROJECT_NAME);
		Ecore2XtextConfiguration config = info.getEcore2Xtext();
		//EPackageInfo epkginfo = new EPackageInfo(ePackage, ePackageImportURI, genmodelURI, ePackageJavaFQN, bundleID);
		config.getEPackageInfos().addAll(ePackageInfos);
		EPackageInfo defaultEPackageInfo = ePackageInfos.iterator().next();
		config.setDefaultEPackageInfo(defaultEPackageInfo);
		info.setRootLocation(XTEXT_DSL_PROJECT_LOCATION);
		System.out.println("Set Root location to "+XTEXT_DSL_PROJECT_LOCATION);
		LanguageDescriptor ld = info.getLanguage();
		
		FileExtensions fe = new FileExtensions(Arrays.asList(Settings.LANGUAGE_FILE_EXTENSION));
		ld.setFileExtensions(fe);
		ld.setName(Settings.LANGUAGE_PROJECT_NAME + "." + Settings.LANGUAGE_NAME);
		
		// Workbench workbench = Workbench.getInstance();
		// Ecore2XtextConfiguration.setWorkbench(workbench);
		List<IWorkingSet> workingSets = new ArrayList<IWorkingSet>();
		info.setWorkingSets(workingSets);
		
		creator.setProjectInfo(info);

		
		config.setRootElementClass(rootClass);
		

		
		return info;
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
	
	private void copyFile(String sourceFilePath, String targetFilePath) {
		File file = new File(sourceFilePath);

		FileUtils fileUtils = new FileUtils();
		String fileContentString = null;
		try {
			System.out.println("Trying to copy file: " + sourceFilePath);
			System.out.println("To location: " + targetFilePath);
			fileUtils.copyFile(new File(sourceFilePath), new File(targetFilePath));
			
		} catch (Exception e) {
			System.out.println("FAILED to copy file " + sourceFilePath);
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		
		{
			Mwe2StandaloneSetup setup = new Mwe2StandaloneSetup();
			Injector injector = setup.createInjectorAndDoEMFRegistration();
			Mwe2Runner runner = injector.getInstance(Mwe2Runner.class);
		
			String mweFileLocation = new File("C:\\Users\\Robert\\Documents\\eclipseMars\\eclipseEcore2ASP\\junit-workspace\\org.xtext.example.testdsl\\src\\org\\xtext\\example\\testdsl\\GenerateTestDSL.mwe2").getAbsolutePath();
			Map<String,String> pars = new HashMap<String, String>();
			pars.put("fileEncoding", "UTF-8");
			runner.run(URI.createFileURI(mweFileLocation),pars);
		}
		
		
		
		XtextStandaloneSetup setup = new XtextStandaloneSetup();
		
		Injector injector = setup.createInjectorAndDoEMFRegistration();
		MembersInjector<XtextProjectCreator> membersInjector = injector.getInstance(new Key<MembersInjector<XtextProjectCreator>>() {
		});
		
		XtextProjectCreator creator = injector.getInstance(XtextProjectCreator.class);
		creator.setProjectInfo(new XtextProjectInfo());
		try {
			creator.run(new NullProgressMonitor());
		} catch (InvocationTargetException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
