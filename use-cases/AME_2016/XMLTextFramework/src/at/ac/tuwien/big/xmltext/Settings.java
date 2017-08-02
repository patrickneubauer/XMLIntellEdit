package at.ac.tuwien.big.xmltext;

public class Settings {
	public static String JAVA_CODE_GENERATOR_LOG_FILE_LOCATION = "JavaCodeGenerator.log";
	public static String XTEXT_PROJECT_GENERATOR_LOG_FILE_LOCATION = "XtextProjectGenerator.log";
	public static String LANGUAGE_ENCODING = "Cp1252";
	public static String MWE2_WORKFLOW_ENCODING = "UTF-8";
	public static String XTEXT_FILE_ENCODING = "UTF-8";
	public static String ANTLR_FILE_NAME = ".antlr-generator-3.2.0-patch.jar";
	
	// syntax customization
	public static String PROPERTY_MEMBER_OPEN_TERMINAL_SYMBOL = "{";
	public static String PROPERTY_MEMBER_CLOSE_TERMINAL_SYMBOL = "}";
	public static boolean DROP_TYPE_IN_TERMINAL = true;
	public static boolean SIMPLE_TERMINAL_FOR_MULTI_FEATURES = true;
	
	public static String GENMODEL_NAME = "Library3-refactored";
	public static String GENMODEL_PREFIX = "Library3";
	public static String GENMODEL_FILE_NAME = "library3.genmodel";
	public static String ECORE_FILE_NAME = "library3.ecore";
	public static String XSD_FILE_NAME = "library3.xsd";
	public static String XTEXT_GRAMMAR_FILE_NAME = "Library3.xtext";
	public static String LANGUAGE_NAME = "Library3";
	public static String LANGUAGE_PROJECT_NAME = "at.ac.tuwien.big.xmltext.library3";
	public static String LANGUAGE_FILE_EXTENSION = "library3text";
	public static String ROOT_ELEMENT_NAME = "LibraryType";
	
	public static String XTEXT_OUTPUT_GRAMMAR_FILE_NAME = "Library3-refractored.xtext";
	public static String REFACTORED_ECORE_FILE_NAME = ECORE_FILE_NAME.substring(0, ECORE_FILE_NAME.lastIndexOf(".")) + "-refactored.ecore";
	public static String REFACTORED_GENMODEL_FILE_NAME = GENMODEL_FILE_NAME.substring(0, GENMODEL_FILE_NAME.lastIndexOf(".")) + "-refactored.genmodel";
}
