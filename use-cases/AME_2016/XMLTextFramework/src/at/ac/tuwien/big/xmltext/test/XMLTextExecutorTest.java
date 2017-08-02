package at.ac.tuwien.big.xmltext.test;

import java.io.FileOutputStream;
import java.io.IOException;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xtext.ui.wizard.ecore2xtext.Ecore2XtextProjectInfo;
import org.junit.Test;

import at.ac.tuwien.big.xmltext.AMEGroupEnhance;
import at.ac.tuwien.big.xmltext.Settings;
import at.ac.tuwien.big.xmltext.XMLTextExecutor;

@SuppressWarnings("restriction")
public class XMLTextExecutorTest {
	
	private XMLTextExecutor xmlTextExecutor = new XMLTextExecutor();
	
		
	/**
	 * RUN AS JUNIT TEST
	 * 
	 * INPUT: XSD
	 * OUTPUT: Ecore
	 */
	@Test
	public void runExecutorPart1() {
		xmlTextExecutor.createEcoreFromXSD(Settings.XSD_FILE_NAME, Settings.ECORE_FILE_NAME);
	}
	
	/**
	 * RUN AS JUNIT TEST
	 * 
	 * INPUT: Ecore
	 * OUTPUT: Ecore (refactored), GenModel (refactored), Java Model Code, Java Edit Code, Java Editor Code, and Java Test Code
	 */
	@Test
	public void runExecutorPart1and2() {
		Resource ecoreResource = xmlTextExecutor.createEcoreFromXSD(Settings.XSD_FILE_NAME, Settings.ECORE_FILE_NAME);
		xmlTextExecutor.refactorEcore(ecoreResource);
		xmlTextExecutor.generateJavaCode(Settings.REFACTORED_GENMODEL_FILE_NAME, Settings.REFACTORED_ECORE_FILE_NAME);
	}
	
	/**
	 * RUN AS JUNIT PLUGIN TEST
	 * 
	 * INPUT: Ecore (refactored) and GenModel (refactored)
	 * OUTPUT: Xtext Grammar (refactored)
	 */
	@Test
	public void runExecutorPart3() {
		xmlTextExecutor.copyAntlrParser();
		Ecore2XtextProjectInfo ecore2XtextProjectInfo = xmlTextExecutor.generateXtextGrammarAndWorkflow(Settings.REFACTORED_GENMODEL_FILE_NAME, Settings.REFACTORED_ECORE_FILE_NAME);
		xmlTextExecutor.generateXtextProjects(ecore2XtextProjectInfo);
	}
	
	/**
	 * RUN AS JUNIT TEST
	 * 
	 * INPUT: Ecore
	 * OUTPUT: Ecore (refactored), GenModel (refactored), Java Model Code, Java Edit Code, Java Editor Code, and Java Test Code
	 */
	@Test
	public void runExecutorPartAME() {
		Resource ecoreResource = xmlTextExecutor.createEcoreFromXSD(Settings.XSD_FILE_NAME, Settings.ECORE_FILE_NAME);
		xmlTextExecutor.createGenModelFromEcore(Settings.ECORE_FILE_NAME, Settings.GENMODEL_FILE_NAME);
		AMEGroupEnhance.refractorEcore(ecoreResource, xmlTextExecutor.getMapper());
		try {
			ecoreResource.save(new FileOutputStream(Settings.ECORE_FILE_NAME),null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//xmlTextExecutor.generateJavaCode(Settings.REFACTORED_GENMODEL_FILE_NAME, Settings.REFACTORED_ECORE_FILE_NAME);
		Ecore2XtextProjectInfo ecore2XtextProjectInfo = xmlTextExecutor.generateXtextGrammarAndWorkflow(Settings.GENMODEL_FILE_NAME, Settings.ECORE_FILE_NAME);
	}
	
	/**
	 * Manual steps after step 3:
	 * (1) IMPORT PROJECTS GENERATED PROJECTS
	 * (2) ADD "[Settings.LANGUAGE_PROJECT_NAME]/scr" to project classpath
	 * (3) SELECT THIS PROJECT IN PROJECT BROWSER AND REFRESH IT
	 * (4) RUN THIS TEST AS JUNIT TEST
	 */
	@Test
	public void generateMwe2Workflow() {
		xmlTextExecutor.executeMwe2Workflow("file:///" + xmlTextExecutor.getWorkspaceLocation() + Settings.LANGUAGE_PROJECT_NAME + "/src/" + Settings.LANGUAGE_PROJECT_NAME.replace('.', '/') + "/Generate" + Settings.LANGUAGE_NAME + ".mwe2");
	}
	
}
