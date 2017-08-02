/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage
 * @generated
 */
public class Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedValidator INSTANCE = new Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "isostdisois_13584_32ed_1techxmlschemaontomlSimplified";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ALTERNATIVEUNITS:
				return validateALTERNATIVEUNITS((ALTERNATIVEUNITS)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ANYTYPE:
				return validateANYTYPE((ANYTYPE)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.APOSTERIORICASEOF:
				return validateAPOSTERIORICASEOF((APOSTERIORICASEOF)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.APOSTERIORISEMANTICRELATIONSHIPS:
				return validateAPOSTERIORISEMANTICRELATIONSHIPS((APOSTERIORISEMANTICRELATIONSHIPS)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.APOSTERIORISEMANTICRELATIONSHIP:
				return validateAPOSTERIORISEMANTICRELATIONSHIP((APOSTERIORISEMANTICRELATIONSHIP)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.APOSTERIORIVIEWOF:
				return validateAPOSTERIORIVIEWOF((APOSTERIORIVIEWOF)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ARRAYTYPE:
				return validateARRAYTYPE((ARRAYTYPE)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ASSIGNEDVALUE:
				return validateASSIGNEDVALUE((ASSIGNEDVALUE)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.AUTHORS:
				return validateAUTHORS((AUTHORS)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.AXIS1PLACEMENTTYPE:
				return validateAXIS1PLACEMENTTYPE((AXIS1PLACEMENTTYPE)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.AXIS2PLACEMENT2DTYPE:
				return validateAXIS2PLACEMENT2DTYPE((AXIS2PLACEMENT2DTYPE)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.AXIS2PLACEMENT3DTYPE:
				return validateAXIS2PLACEMENT3DTYPE((AXIS2PLACEMENT3DTYPE)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.BAGTYPE:
				return validateBAGTYPE((BAGTYPE)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.BOOLEANTYPE:
				return validateBOOLEANTYPE((BOOLEANTYPE)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CARDINALITYCONSTRAINT:
				return validateCARDINALITYCONSTRAINT((CARDINALITYCONSTRAINT)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CATEGORIZATIONCLASS:
				return validateCATEGORIZATIONCLASS((CATEGORIZATIONCLASS)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSCONSTANTVALUES:
				return validateCLASSCONSTANTVALUES((CLASSCONSTANTVALUES)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSCONSTRAINT:
				return validateCLASSCONSTRAINT((CLASSCONSTRAINT)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSESREFERENCE:
				return validateCLASSESREFERENCE((CLASSESREFERENCE)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION:
				return validateCLASSEXTENSION((CLASSEXTENSION)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSIFICATION:
				return validateCLASSIFICATION((CLASSIFICATION)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSPRESENTATIONONPAPER:
				return validateCLASSPRESENTATIONONPAPER((CLASSPRESENTATIONONPAPER)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSPRESENTATIONONSCREEN:
				return validateCLASSPRESENTATIONONSCREEN((CLASSPRESENTATIONONSCREEN)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSREFERENCE:
				return validateCLASSREFERENCE((CLASSREFERENCE)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSREFERENCETYPE:
				return validateCLASSREFERENCETYPE((CLASSREFERENCETYPE)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS:
				return validateCLASS((CLASS)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSVALUEASSIGNMENT:
				return validateCLASSVALUEASSIGNMENT((CLASSVALUEASSIGNMENT)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONDITIONDET:
				return validateCONDITIONDET((CONDITIONDET)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONFIGURATIONCONTROLCONSTRAINT:
				return validateCONFIGURATIONCONTROLCONSTRAINT((CONFIGURATIONCONTROLCONSTRAINT)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONSTRAINTORCONSTRAINTID:
				return validateCONSTRAINTORCONSTRAINTID((CONSTRAINTORCONSTRAINTID)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONSTRAINTS:
				return validateCONSTRAINTS((CONSTRAINTS)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONSTRAINT:
				return validateCONSTRAINT((CONSTRAINT)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONTAINEDCLASSES:
				return validateCONTAINEDCLASSES((CONTAINEDCLASSES)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONTAINEDCLASSEXTENSIONS:
				return validateCONTAINEDCLASSEXTENSIONS((CONTAINEDCLASSEXTENSIONS)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONTAINEDDATATYPES:
				return validateCONTAINEDDATATYPES((CONTAINEDDATATYPES)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONTAINEDDOCUMENTS:
				return validateCONTAINEDDOCUMENTS((CONTAINEDDOCUMENTS)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONTAINEDPROPERTIES:
				return validateCONTAINEDPROPERTIES((CONTAINEDPROPERTIES)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONTAINEDSUPPLIERS:
				return validateCONTAINEDSUPPLIERS((CONTAINEDSUPPLIERS)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONTEXTDEPENDENTUNIT:
				return validateCONTEXTDEPENDENTUNIT((CONTEXTDEPENDENTUNIT)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONTEXTPARAMETERCONSTRAINTS:
				return validateCONTEXTPARAMETERCONSTRAINTS((CONTEXTPARAMETERCONSTRAINTS)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONTEXTPARAMICON:
				return validateCONTEXTPARAMICON((CONTEXTPARAMICON)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONTEXTRESTRICTIONCONSTRAINT:
				return validateCONTEXTRESTRICTIONCONSTRAINT((CONTEXTRESTRICTIONCONSTRAINT)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONVERSIONBASEDUNIT:
				return validateCONVERSIONBASEDUNIT((CONVERSIONBASEDUNIT)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CORRESPONDINGPROPERTIES:
				return validateCORRESPONDINGPROPERTIES((CORRESPONDINGPROPERTIES)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CREATEICON:
				return validateCREATEICON((CREATEICON)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DATATYPEREFERENCE:
				return validateDATATYPEREFERENCE((DATATYPEREFERENCE)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DATATYPESREFERENCE:
				return validateDATATYPESREFERENCE((DATATYPESREFERENCE)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DATATYPE:
				return validateDATATYPE((DATATYPE)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DATEDATATYPE:
				return validateDATEDATATYPE((DATEDATATYPE)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DATETIMEDATATYPE:
				return validateDATETIMEDATATYPE((DATETIMEDATATYPE)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DEPENDENTPDET:
				return validateDEPENDENTPDET((DEPENDENTPDET)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DERIVEDUNITELEMENT:
				return validateDERIVEDUNITELEMENT((DERIVEDUNITELEMENT)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DERIVEDUNIT:
				return validateDERIVEDUNIT((DERIVEDUNIT)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARIESREFERENCE:
				return validateDICTIONARIESREFERENCE((DICTIONARIESREFERENCE)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARYINSTANDARDFORMAT:
				return validateDICTIONARYINSTANDARDFORMAT((DICTIONARYINSTANDARDFORMAT)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARYREFERENCE:
				return validateDICTIONARYREFERENCE((DICTIONARYREFERENCE)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY:
				return validateDICTIONARY((DICTIONARY)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICUNITREFERENCE:
				return validateDICUNITREFERENCE((DICUNITREFERENCE)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICUNITSREFERENCE:
				return validateDICUNITSREFERENCE((DICUNITSREFERENCE)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICUNIT:
				return validateDICUNIT((DICUNIT)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICVALUE:
				return validateDICVALUE((DICVALUE)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DIMENSIONALEXPONENTS:
				return validateDIMENSIONALEXPONENTS((DIMENSIONALEXPONENTS)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DOCUMENTCONTENT:
				return validateDOCUMENTCONTENT((DOCUMENTCONTENT)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DOCUMENTIDENTIFIERNAMELABEL:
				return validateDOCUMENTIDENTIFIERNAMELABEL((DOCUMENTIDENTIFIERNAMELABEL)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DOCUMENTIDENTIFIER:
				return validateDOCUMENTIDENTIFIER((DOCUMENTIDENTIFIER)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DOCUMENTREFERENCE:
				return validateDOCUMENTREFERENCE((DOCUMENTREFERENCE)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DOCUMENTSREFERENCE:
				return validateDOCUMENTSREFERENCE((DOCUMENTSREFERENCE)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DOCUMENT:
				return validateDOCUMENT((DOCUMENT)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DOMAINCONSTRAINTS:
				return validateDOMAINCONSTRAINTS((DOMAINCONSTRAINTS)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DOMAINCONSTRAINT:
				return validateDOMAINCONSTRAINT((DOMAINCONSTRAINT)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ENUMERATIONCONSTRAINT:
				return validateENUMERATIONCONSTRAINT((ENUMERATIONCONSTRAINT)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION:
				return validateEXPLICITFUNCTIONALMODELCLASSEXTENSION((EXPLICITFUNCTIONALMODELCLASSEXTENSION)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITITEMCLASSEXTENSION:
				return validateEXPLICITITEMCLASSEXTENSION((EXPLICITITEMCLASSEXTENSION)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXTERNALFILES:
				return validateEXTERNALFILES((EXTERNALFILES)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXTERNALGRAPHICS:
				return validateEXTERNALGRAPHICS((EXTERNALGRAPHICS)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXTERNALRESOURCE:
				return validateEXTERNALRESOURCE((EXTERNALRESOURCE)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FILTER:
				return validateFILTER((FILTER)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF:
				return validateFMCLASSVIEWOF((FMCLASSVIEWOF)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FUNCTIONALMODELCLASS:
				return validateFUNCTIONALMODELCLASS((FUNCTIONALMODELCLASS)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.GENERALTEXT:
				return validateGENERALTEXT((GENERALTEXT)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.GEOMETRICCONTEXT:
				return validateGEOMETRICCONTEXT((GEOMETRICCONTEXT)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.GEOMETRICUNITCONTEXT:
				return validateGEOMETRICUNITCONTEXT((GEOMETRICUNITCONTEXT)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.GRAPHICS:
				return validateGRAPHICS((GRAPHICS)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER:
				return validateHEADER((HEADER)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HTTPFILE:
				return validateHTTPFILE((HTTPFILE)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.IDENTIFIEDDOCUMENT:
				return validateIDENTIFIEDDOCUMENT((IDENTIFIEDDOCUMENT)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ILLUSTRATION:
				return validateILLUSTRATION((ILLUSTRATION)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.INFORMATION:
				return validateINFORMATION((INFORMATION)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.INTCURRENCYTYPE:
				return validateINTCURRENCYTYPE((INTCURRENCYTYPE)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.INTDICVALUE:
				return validateINTDICVALUE((INTDICVALUE)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.INTEGRITYCONSTRAINT:
				return validateINTEGRITYCONSTRAINT((INTEGRITYCONSTRAINT)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.INTMEASURETYPE:
				return validateINTMEASURETYPE((INTMEASURETYPE)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.INTTYPE:
				return validateINTTYPE((INTTYPE)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF:
				return validateITEMCLASSCASEOF((ITEMCLASSCASEOF)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASS:
				return validateITEMCLASS((ITEMCLASS)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITSVALUES:
				return validateITSVALUES((ITSVALUES)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.KEYWORDLABEL:
				return validateKEYWORDLABEL((KEYWORDLABEL)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.KEYWORD:
				return validateKEYWORD((KEYWORD)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.LANGUAGE:
				return validateLANGUAGE((LANGUAGE)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.LEVEL:
				return validateLEVEL((LEVEL)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.LEVELTYPE:
				return validateLEVELTYPE((LEVELTYPE)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.LIBRARYIIMIDENTIFICATION:
				return validateLIBRARYIIMIDENTIFICATION((LIBRARYIIMIDENTIFICATION)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.LIBRARYINSTANDARDFORMAT:
				return validateLIBRARYINSTANDARDFORMAT((LIBRARYINSTANDARDFORMAT)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.LIBRARY:
				return validateLIBRARY((LIBRARY)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.LISTTYPE:
				return validateLISTTYPE((LISTTYPE)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.MAPPINGFUNCTION:
				return validateMAPPINGFUNCTION((MAPPINGFUNCTION)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.MATHEMATICALSTRING:
				return validateMATHEMATICALSTRING((MATHEMATICALSTRING)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.MESSAGE:
				return validateMESSAGE((MESSAGE)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NAMEDTYPE:
				return validateNAMEDTYPE((NAMEDTYPE)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NAMEDUNIT:
				return validateNAMEDUNIT((NAMEDUNIT)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONDEPENDENTPDET:
				return validateNONDEPENDENTPDET((NONDEPENDENTPDET)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONINSTANTIABLEFUNCTIONALVIEWCLASS:
				return validateNONINSTANTIABLEFUNCTIONALVIEWCLASS((NONINSTANTIABLEFUNCTIONALVIEWCLASS)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONQUANTITATIVECODETYPE:
				return validateNONQUANTITATIVECODETYPE((NONQUANTITATIVECODETYPE)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONQUANTITATIVEINTTYPE:
				return validateNONQUANTITATIVEINTTYPE((NONQUANTITATIVEINTTYPE)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONSIUNIT:
				return validateNONSIUNIT((NONSIUNIT)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONTRANSLATABLESTRINGTYPE:
				return validateNONTRANSLATABLESTRINGTYPE((NONTRANSLATABLESTRINGTYPE)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NUMBERTYPE:
				return validateNUMBERTYPE((NUMBERTYPE)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ONTOML:
				return validateONTOML((ONTOML)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ORGANIZATION:
				return validateORGANIZATION((ORGANIZATION)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PERSON:
				return validatePERSON((PERSON)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PLACEMENTTYPE:
				return validatePLACEMENTTYPE((PLACEMENTTYPE)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.POSTCONDITION:
				return validatePOSTCONDITION((POSTCONDITION)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PRECONDITION:
				return validatePRECONDITION((PRECONDITION)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PREFERREDNAMELABEL:
				return validatePREFERREDNAMELABEL((PREFERREDNAMELABEL)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PREFERREDNAME:
				return validatePREFERREDNAME((PREFERREDNAME)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROGRAMREFERENCETYPE:
				return validatePROGRAMREFERENCETYPE((PROGRAMREFERENCETYPE)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROPERTIESREFERENCE:
				return validatePROPERTIESREFERENCE((PROPERTIESREFERENCE)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROPERTYCLASSIFICATION:
				return validatePROPERTYCLASSIFICATION((PROPERTYCLASSIFICATION)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROPERTYCONSTRAINT:
				return validatePROPERTYCONSTRAINT((PROPERTYCONSTRAINT)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROPERTYMAPPING:
				return validatePROPERTYMAPPING((PROPERTYMAPPING)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROPERTYREFERENCE:
				return validatePROPERTYREFERENCE((PROPERTYREFERENCE)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROPERTY:
				return validatePROPERTY((PROPERTY)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROPERTYVALUERECOMMENDEDPRESENTATION:
				return validatePROPERTYVALUERECOMMENDEDPRESENTATION((PROPERTYVALUERECOMMENDEDPRESENTATION)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.RANGECONSTRAINT:
				return validateRANGECONSTRAINT((RANGECONSTRAINT)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.RATIONALMEASURETYPE:
				return validateRATIONALMEASURETYPE((RATIONALMEASURETYPE)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.RATIONALTYPE:
				return validateRATIONALTYPE((RATIONALTYPE)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REALCURRENCYTYPE:
				return validateREALCURRENCYTYPE((REALCURRENCYTYPE)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REALMEASURETYPE:
				return validateREALMEASURETYPE((REALMEASURETYPE)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REALTYPE:
				return validateREALTYPE((REALTYPE)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.RECOMMENDEDPRESENTATION:
				return validateRECOMMENDEDPRESENTATION((RECOMMENDEDPRESENTATION)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REFERENCEDDOCUMENT:
				return validateREFERENCEDDOCUMENT((REFERENCEDDOCUMENT)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REFERENCEDGRAPHICS:
				return validateREFERENCEDGRAPHICS((REFERENCEDGRAPHICS)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REMOTELOCATIONS:
				return validateREMOTELOCATIONS((REMOTELOCATIONS)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REMOTE_LOCATION:
				return validateRemoteLocation((RemoteLocation)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REPRESENTATIONPDET:
				return validateREPRESENTATIONPDET((REPRESENTATIONPDET)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REPRESENTATIONREFERENCETYPE:
				return validateREPRESENTATIONREFERENCETYPE((REPRESENTATIONREFERENCETYPE)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SETTYPE:
				return validateSETTYPE((SETTYPE)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SETWITHSUBSETCONSTRAINTTYPE:
				return validateSETWITHSUBSETCONSTRAINTTYPE((SETWITHSUBSETCONSTRAINTTYPE)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SHORTNAMELABEL:
				return validateSHORTNAMELABEL((SHORTNAMELABEL)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SHORTNAME:
				return validateSHORTNAME((SHORTNAME)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SIUNIT:
				return validateSIUNIT((SIUNIT)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SOURCEDOCUMENT:
				return validateSOURCEDOCUMENT((SOURCEDOCUMENT)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.STRINGDICVALUE:
				return validateSTRINGDICVALUE((STRINGDICVALUE)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.STRINGPATTERNCONSTRAINT:
				return validateSTRINGPATTERNCONSTRAINT((STRINGPATTERNCONSTRAINT)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.STRINGSIZECONSTRAINT:
				return validateSTRINGSIZECONSTRAINT((STRINGSIZECONSTRAINT)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.STRINGS:
				return validateSTRINGS((STRINGS)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.STRINGTYPE:
				return validateSTRINGTYPE((STRINGTYPE)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SUBCLASSCONSTRAINT:
				return validateSUBCLASSCONSTRAINT((SUBCLASSCONSTRAINT)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SUBSET:
				return validateSUBSET((SUBSET)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SUPPLIERREFERENCE:
				return validateSUPPLIERREFERENCE((SUPPLIERREFERENCE)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SUPPLIERSREFERENCE:
				return validateSUPPLIERSREFERENCE((SUPPLIERSREFERENCE)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SUPPLIER:
				return validateSUPPLIER((SUPPLIER)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SUPPORTEDVEP:
				return validateSUPPORTEDVEP((SUPPORTEDVEP)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SYNONYMOUSNAMELABEL:
				return validateSYNONYMOUSNAMELABEL((SYNONYMOUSNAMELABEL)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SYNONYMOUSNAME:
				return validateSYNONYMOUSNAME((SYNONYMOUSNAME)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SYNONYMOUSSYMBOLS:
				return validateSYNONYMOUSSYMBOLS((SYNONYMOUSSYMBOLS)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.TEXT:
				return validateTEXT((TEXT)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.TIMEDATATYPE:
				return validateTIMEDATATYPE((TIMEDATATYPE)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.TRANSLATABLESTRINGTYPE:
				return validateTRANSLATABLESTRINGTYPE((TRANSLATABLESTRINGTYPE)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.TRANSLATIONDATA:
				return validateTRANSLATIONDATA((TRANSLATIONDATA)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.TRANSLATION:
				return validateTRANSLATION((TRANSLATION)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.UNIT:
				return validateUNIT((UNIT)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.URITYPE:
				return validateURITYPE((URITYPE)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.VCVRANGE:
				return validateVCVRANGE((VCVRANGE)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.VIEWCONTROLVARIABLERANGE:
				return validateVIEWCONTROLVARIABLERANGE((VIEWCONTROLVARIABLERANGE)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.VIEWEXCHANGEPROTOCOLIDENTIFICATION:
				return validateVIEWEXCHANGEPROTOCOLIDENTIFICATION((VIEWEXCHANGEPROTOCOLIDENTIFICATION)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ILLUSTRATIONTYPE_TYPE:
				return validateILLUSTRATIONTYPEType((ILLUSTRATIONTYPEType)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SIPREFIX_TYPE:
				return validateSIPREFIXType((SIPREFIXType)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SIUNITNAME_TYPE:
				return validateSIUNITNAMEType((SIUNITNAMEType)value, diagnostics, context);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.STANDARDSIZE_TYPE:
				return validateSTANDARDSIZEType((STANDARDSIZEType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateALTERNATIVEUNITS(ALTERNATIVEUNITS alternativeunits, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(alternativeunits, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateANYTYPE(ANYTYPE anytype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(anytype, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAPOSTERIORICASEOF(APOSTERIORICASEOF aposterioricaseof, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(aposterioricaseof, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(aposterioricaseof, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(aposterioricaseof, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(aposterioricaseof, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(aposterioricaseof, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(aposterioricaseof, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(aposterioricaseof, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(aposterioricaseof, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(aposterioricaseof, diagnostics, context);
		if (result || diagnostics != null) result &= validateAPOSTERIORISEMANTICRELATIONSHIP_patternId(aposterioricaseof, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAPOSTERIORISEMANTICRELATIONSHIPS(APOSTERIORISEMANTICRELATIONSHIPS aposteriorisemanticrelationships, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aposteriorisemanticrelationships, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAPOSTERIORISEMANTICRELATIONSHIP(APOSTERIORISEMANTICRELATIONSHIP aposteriorisemanticrelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(aposteriorisemanticrelationship, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(aposteriorisemanticrelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(aposteriorisemanticrelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(aposteriorisemanticrelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(aposteriorisemanticrelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(aposteriorisemanticrelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(aposteriorisemanticrelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(aposteriorisemanticrelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(aposteriorisemanticrelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validateAPOSTERIORISEMANTICRELATIONSHIP_patternId(aposteriorisemanticrelationship, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the patternId constraint of '<em>APOSTERIORISEMANTICRELATIONSHIP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String APOSTERIORISEMANTICRELATIONSHIP__PATTERN_ID__EEXPRESSION = "self.id.matches('([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})(\\\\-([A-Z0-9:_\\\\.]{1,35})((\\\\-[019])(\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5}))?)?)?#CE\\\\-([A-Z0-9:_\\\\.]{1,71})#[0-9]{1,9}') or self.id.matches('([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#CE\\\\-([A-Z0-9:_\\\\.]{1,71})#[0-9]{1,9}') or self.id.matches('([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-\\\\-\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#CE\\\\-([A-Z0-9_:\\\\.]{1,71})#[0-9]{1,9}')";

	/**
	 * Validates the patternId constraint of '<em>APOSTERIORISEMANTICRELATIONSHIP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAPOSTERIORISEMANTICRELATIONSHIP_patternId(APOSTERIORISEMANTICRELATIONSHIP aposteriorisemanticrelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.APOSTERIORISEMANTICRELATIONSHIP,
				 aposteriorisemanticrelationship,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternId",
				 APOSTERIORISEMANTICRELATIONSHIP__PATTERN_ID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAPOSTERIORIVIEWOF(APOSTERIORIVIEWOF aposterioriviewof, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(aposterioriviewof, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(aposterioriviewof, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(aposterioriviewof, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(aposterioriviewof, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(aposterioriviewof, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(aposterioriviewof, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(aposterioriviewof, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(aposterioriviewof, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(aposterioriviewof, diagnostics, context);
		if (result || diagnostics != null) result &= validateAPOSTERIORISEMANTICRELATIONSHIP_patternId(aposterioriviewof, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateARRAYTYPE(ARRAYTYPE arraytype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arraytype, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateASSIGNEDVALUE(ASSIGNEDVALUE assignedvalue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assignedvalue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAUTHORS(AUTHORS authors, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(authors, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAXIS1PLACEMENTTYPE(AXIS1PLACEMENTTYPE axis1PLACEMENTTYPE, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(axis1PLACEMENTTYPE, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(axis1PLACEMENTTYPE, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(axis1PLACEMENTTYPE, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(axis1PLACEMENTTYPE, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(axis1PLACEMENTTYPE, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(axis1PLACEMENTTYPE, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(axis1PLACEMENTTYPE, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(axis1PLACEMENTTYPE, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(axis1PLACEMENTTYPE, diagnostics, context);
		if (result || diagnostics != null) result &= validateAXIS1PLACEMENTTYPE_patternClassRef(axis1PLACEMENTTYPE, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the patternClassRef constraint of '<em>AXIS1PLACEMENTTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String AXIS1PLACEMENTTYPE__PATTERN_CLASS_REF__EEXPRESSION = "(self.classRef=null) or self.classRef.matches('0112\\\\-1\\\\-\\\\-\\\\-13584_32_1#01\\\\-AXIS1_PLACEMENT#1')";

	/**
	 * Validates the patternClassRef constraint of '<em>AXIS1PLACEMENTTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAXIS1PLACEMENTTYPE_patternClassRef(AXIS1PLACEMENTTYPE axis1PLACEMENTTYPE, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.AXIS1PLACEMENTTYPE,
				 axis1PLACEMENTTYPE,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternClassRef",
				 AXIS1PLACEMENTTYPE__PATTERN_CLASS_REF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAXIS2PLACEMENT2DTYPE(AXIS2PLACEMENT2DTYPE axis2PLACEMENT2DTYPE, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(axis2PLACEMENT2DTYPE, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(axis2PLACEMENT2DTYPE, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(axis2PLACEMENT2DTYPE, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(axis2PLACEMENT2DTYPE, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(axis2PLACEMENT2DTYPE, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(axis2PLACEMENT2DTYPE, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(axis2PLACEMENT2DTYPE, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(axis2PLACEMENT2DTYPE, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(axis2PLACEMENT2DTYPE, diagnostics, context);
		if (result || diagnostics != null) result &= validateAXIS2PLACEMENT2DTYPE_patternClassRef(axis2PLACEMENT2DTYPE, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the patternClassRef constraint of '<em>AXIS2PLACEMENT2DTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String AXIS2PLACEMENT2DTYPE__PATTERN_CLASS_REF__EEXPRESSION = "(self.classRef=null) or self.classRef.matches('0112\\\\-1\\\\-\\\\-\\\\-13584_32_1#01\\\\-AXIS2_PLACEMENT_2D#1')";

	/**
	 * Validates the patternClassRef constraint of '<em>AXIS2PLACEMENT2DTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAXIS2PLACEMENT2DTYPE_patternClassRef(AXIS2PLACEMENT2DTYPE axis2PLACEMENT2DTYPE, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.AXIS2PLACEMENT2DTYPE,
				 axis2PLACEMENT2DTYPE,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternClassRef",
				 AXIS2PLACEMENT2DTYPE__PATTERN_CLASS_REF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAXIS2PLACEMENT3DTYPE(AXIS2PLACEMENT3DTYPE axis2PLACEMENT3DTYPE, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(axis2PLACEMENT3DTYPE, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(axis2PLACEMENT3DTYPE, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(axis2PLACEMENT3DTYPE, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(axis2PLACEMENT3DTYPE, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(axis2PLACEMENT3DTYPE, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(axis2PLACEMENT3DTYPE, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(axis2PLACEMENT3DTYPE, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(axis2PLACEMENT3DTYPE, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(axis2PLACEMENT3DTYPE, diagnostics, context);
		if (result || diagnostics != null) result &= validateAXIS2PLACEMENT3DTYPE_patternClassRef(axis2PLACEMENT3DTYPE, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the patternClassRef constraint of '<em>AXIS2PLACEMENT3DTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String AXIS2PLACEMENT3DTYPE__PATTERN_CLASS_REF__EEXPRESSION = "(self.classRef=null) or self.classRef.matches('0112\\\\-1\\\\-\\\\-\\\\-13584_32_1#01\\\\-AXIS2_PLACEMENT_3D#1')";

	/**
	 * Validates the patternClassRef constraint of '<em>AXIS2PLACEMENT3DTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAXIS2PLACEMENT3DTYPE_patternClassRef(AXIS2PLACEMENT3DTYPE axis2PLACEMENT3DTYPE, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.AXIS2PLACEMENT3DTYPE,
				 axis2PLACEMENT3DTYPE,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternClassRef",
				 AXIS2PLACEMENT3DTYPE__PATTERN_CLASS_REF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBAGTYPE(BAGTYPE bagtype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bagtype, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBOOLEANTYPE(BOOLEANTYPE booleantype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(booleantype, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(booleantype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(booleantype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(booleantype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(booleantype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(booleantype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(booleantype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(booleantype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(booleantype, diagnostics, context);
		if (result || diagnostics != null) result &= validateBOOLEANTYPE_maxLengthValueFormat(booleantype, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the maxLengthValueFormat constraint of '<em>BOOLEANTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BOOLEANTYPE__MAX_LENGTH_VALUE_FORMAT__EEXPRESSION = "(self.valueFormat = null) or self.valueFormat.size() <= 80";

	/**
	 * Validates the maxLengthValueFormat constraint of '<em>BOOLEANTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBOOLEANTYPE_maxLengthValueFormat(BOOLEANTYPE booleantype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.BOOLEANTYPE,
				 booleantype,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxLengthValueFormat",
				 BOOLEANTYPE__MAX_LENGTH_VALUE_FORMAT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCARDINALITYCONSTRAINT(CARDINALITYCONSTRAINT cardinalityconstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cardinalityconstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCATEGORIZATIONCLASS(CATEGORIZATIONCLASS categorizationclass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(categorizationclass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(categorizationclass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(categorizationclass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(categorizationclass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(categorizationclass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(categorizationclass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(categorizationclass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(categorizationclass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(categorizationclass, diagnostics, context);
		if (result || diagnostics != null) result &= validateCLASS_maxLengthRevision(categorizationclass, diagnostics, context);
		if (result || diagnostics != null) result &= validateCLASS_patternStatus(categorizationclass, diagnostics, context);
		if (result || diagnostics != null) result &= validateCLASS_patternId(categorizationclass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCLASSCONSTANTVALUES(CLASSCONSTANTVALUES classconstantvalues, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classconstantvalues, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCLASSCONSTRAINT(CLASSCONSTRAINT classconstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(classconstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(classconstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(classconstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(classconstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(classconstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(classconstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(classconstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(classconstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(classconstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateCONSTRAINT_patternConstraintId(classconstraint, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCLASSESREFERENCE(CLASSESREFERENCE classesreference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classesreference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCLASSEXTENSION(CLASSEXTENSION classextension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(classextension, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(classextension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(classextension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(classextension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(classextension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(classextension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(classextension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(classextension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(classextension, diagnostics, context);
		if (result || diagnostics != null) result &= validateCLASSEXTENSION_patternContentVersion(classextension, diagnostics, context);
		if (result || diagnostics != null) result &= validateCLASSEXTENSION_maxLengthContentVersion(classextension, diagnostics, context);
		if (result || diagnostics != null) result &= validateCLASSEXTENSION_maxLengthContentRevision(classextension, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the patternContentVersion constraint of '<em>CLASSEXTENSION</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASSEXTENSION__PATTERN_CONTENT_VERSION__EEXPRESSION = "(self.contentVersion=null) or self.contentVersion.matches('[0-9]+')";

	/**
	 * Validates the patternContentVersion constraint of '<em>CLASSEXTENSION</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCLASSEXTENSION_patternContentVersion(CLASSEXTENSION classextension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.CLASSEXTENSION,
				 classextension,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternContentVersion",
				 CLASSEXTENSION__PATTERN_CONTENT_VERSION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the maxLengthContentVersion constraint of '<em>CLASSEXTENSION</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASSEXTENSION__MAX_LENGTH_CONTENT_VERSION__EEXPRESSION = "(self.contentVersion = null) or self.contentVersion.size() <= 9";

	/**
	 * Validates the maxLengthContentVersion constraint of '<em>CLASSEXTENSION</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCLASSEXTENSION_maxLengthContentVersion(CLASSEXTENSION classextension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.CLASSEXTENSION,
				 classextension,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxLengthContentVersion",
				 CLASSEXTENSION__MAX_LENGTH_CONTENT_VERSION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the maxLengthContentRevision constraint of '<em>CLASSEXTENSION</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASSEXTENSION__MAX_LENGTH_CONTENT_REVISION__EEXPRESSION = "(self.contentRevision = null) or self.contentRevision.size() <= 3";

	/**
	 * Validates the maxLengthContentRevision constraint of '<em>CLASSEXTENSION</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCLASSEXTENSION_maxLengthContentRevision(CLASSEXTENSION classextension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.CLASSEXTENSION,
				 classextension,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxLengthContentRevision",
				 CLASSEXTENSION__MAX_LENGTH_CONTENT_REVISION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCLASSIFICATION(CLASSIFICATION classification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classification, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCLASSPRESENTATIONONPAPER(CLASSPRESENTATIONONPAPER classpresentationonpaper, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classpresentationonpaper, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCLASSPRESENTATIONONSCREEN(CLASSPRESENTATIONONSCREEN classpresentationonscreen, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classpresentationonscreen, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCLASSREFERENCE(CLASSREFERENCE classreference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(classreference, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(classreference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(classreference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(classreference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(classreference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(classreference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(classreference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(classreference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(classreference, diagnostics, context);
		if (result || diagnostics != null) result &= validateCLASSREFERENCE_patternClassRef(classreference, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the patternClassRef constraint of '<em>CLASSREFERENCE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASSREFERENCE__PATTERN_CLASS_REF__EEXPRESSION = "self.classRef.matches('([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})(\\\\-([A-Z0-9:_\\\\.]{1,35})((\\\\-[019])(\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5}))?)?)?#01\\\\-([A-Z0-9:_\\\\.]{1,71})#[0-9]{1,9}') or self.classRef.matches('([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#01\\\\-([A-Z0-9:_\\\\.]{1,71})#[0-9]{1,9}') or self.classRef.matches('([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-\\\\-\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#01\\\\-([A-Z0-9_:\\\\.]{1,71})#[0-9]{1,9}')";

	/**
	 * Validates the patternClassRef constraint of '<em>CLASSREFERENCE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCLASSREFERENCE_patternClassRef(CLASSREFERENCE classreference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.CLASSREFERENCE,
				 classreference,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternClassRef",
				 CLASSREFERENCE__PATTERN_CLASS_REF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCLASSREFERENCETYPE(CLASSREFERENCETYPE classreferencetype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classreferencetype, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCLASS(CLASS class_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(class_, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validateCLASS_maxLengthRevision(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validateCLASS_patternStatus(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validateCLASS_patternId(class_, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the maxLengthRevision constraint of '<em>CLASS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASS__MAX_LENGTH_REVISION__EEXPRESSION = "self.revision.size() <= 3";

	/**
	 * Validates the maxLengthRevision constraint of '<em>CLASS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCLASS_maxLengthRevision(CLASS class_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.CLASS,
				 class_,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxLengthRevision",
				 CLASS__MAX_LENGTH_REVISION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the patternStatus constraint of '<em>CLASS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASS__PATTERN_STATUS__EEXPRESSION = "(self.status=null) or self.status.matches('[^\\\\-]*') or self.status.matches('[^\\\\s]*')";

	/**
	 * Validates the patternStatus constraint of '<em>CLASS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCLASS_patternStatus(CLASS class_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.CLASS,
				 class_,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternStatus",
				 CLASS__PATTERN_STATUS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the patternId constraint of '<em>CLASS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASS__PATTERN_ID__EEXPRESSION = "self.id.matches('([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})(\\\\-([A-Z0-9:_\\\\.]{1,35})((\\\\-[019])(\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5}))?)?)?#01\\\\-([A-Z0-9:_\\\\.]{1,71})#[0-9]{1,9}') or self.id.matches('([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#01\\\\-([A-Z0-9:_\\\\.]{1,71})#[0-9]{1,9}') or self.id.matches('([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-\\\\-\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#01\\\\-([A-Z0-9_:\\\\.]{1,71})#[0-9]{1,9}')";

	/**
	 * Validates the patternId constraint of '<em>CLASS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCLASS_patternId(CLASS class_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.CLASS,
				 class_,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternId",
				 CLASS__PATTERN_ID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCLASSVALUEASSIGNMENT(CLASSVALUEASSIGNMENT classvalueassignment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classvalueassignment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCONDITIONDET(CONDITIONDET conditiondet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(conditiondet, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(conditiondet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(conditiondet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(conditiondet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(conditiondet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(conditiondet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(conditiondet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(conditiondet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(conditiondet, diagnostics, context);
		if (result || diagnostics != null) result &= validatePROPERTY_maxLengthRevision(conditiondet, diagnostics, context);
		if (result || diagnostics != null) result &= validatePROPERTY_patternStatus(conditiondet, diagnostics, context);
		if (result || diagnostics != null) result &= validatePROPERTY_patternId(conditiondet, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCONFIGURATIONCONTROLCONSTRAINT(CONFIGURATIONCONTROLCONSTRAINT configurationcontrolconstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(configurationcontrolconstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(configurationcontrolconstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(configurationcontrolconstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(configurationcontrolconstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(configurationcontrolconstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(configurationcontrolconstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(configurationcontrolconstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(configurationcontrolconstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(configurationcontrolconstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateCONSTRAINT_patternConstraintId(configurationcontrolconstraint, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCONSTRAINTORCONSTRAINTID(CONSTRAINTORCONSTRAINTID constraintorconstraintid, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(constraintorconstraintid, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(constraintorconstraintid, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(constraintorconstraintid, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(constraintorconstraintid, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(constraintorconstraintid, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(constraintorconstraintid, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(constraintorconstraintid, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(constraintorconstraintid, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(constraintorconstraintid, diagnostics, context);
		if (result || diagnostics != null) result &= validateCONSTRAINTORCONSTRAINTID_patternConstraintRef(constraintorconstraintid, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the patternConstraintRef constraint of '<em>CONSTRAINTORCONSTRAINTID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONSTRAINTORCONSTRAINTID__PATTERN_CONSTRAINT_REF__EEXPRESSION = "(self.constraintRef=null) or self.constraintRef.matches('([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})(\\\\-([A-Z0-9:_\\\\.]{1,35})((\\\\-[019])(\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5}))?)?)?#04\\\\-([A-Z0-9:_\\\\.]{1,71})#[0-9]{1,9}') or self.constraintRef.matches('([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#04\\\\-([A-Z0-9:_\\\\.]{1,71})#[0-9]{1,9}') or self.constraintRef.matches('([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-\\\\-\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#04\\\\-([A-Z0-9:_\\\\.]{1,71})#[0-9]{1,9}')";

	/**
	 * Validates the patternConstraintRef constraint of '<em>CONSTRAINTORCONSTRAINTID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCONSTRAINTORCONSTRAINTID_patternConstraintRef(CONSTRAINTORCONSTRAINTID constraintorconstraintid, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.CONSTRAINTORCONSTRAINTID,
				 constraintorconstraintid,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternConstraintRef",
				 CONSTRAINTORCONSTRAINTID__PATTERN_CONSTRAINT_REF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCONSTRAINTS(CONSTRAINTS constraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(constraints, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCONSTRAINT(CONSTRAINT constraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(constraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateCONSTRAINT_patternConstraintId(constraint, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the patternConstraintId constraint of '<em>CONSTRAINT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONSTRAINT__PATTERN_CONSTRAINT_ID__EEXPRESSION = "(self.constraintId=null) or self.constraintId.matches('([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})(\\\\-([A-Z0-9:_\\\\.]{1,35})((\\\\-[019])(\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5}))?)?)?#04\\\\-([A-Z0-9:_\\\\.]{1,71})#[0-9]{1,9}') or self.constraintId.matches('([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#04\\\\-([A-Z0-9:_\\\\.]{1,71})#[0-9]{1,9}') or self.constraintId.matches('([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-\\\\-\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#04\\\\-([A-Z0-9:_\\\\.]{1,71})#[0-9]{1,9}')";

	/**
	 * Validates the patternConstraintId constraint of '<em>CONSTRAINT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCONSTRAINT_patternConstraintId(CONSTRAINT constraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.CONSTRAINT,
				 constraint,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternConstraintId",
				 CONSTRAINT__PATTERN_CONSTRAINT_ID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCONTAINEDCLASSES(CONTAINEDCLASSES containedclasses, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(containedclasses, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCONTAINEDCLASSEXTENSIONS(CONTAINEDCLASSEXTENSIONS containedclassextensions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(containedclassextensions, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCONTAINEDDATATYPES(CONTAINEDDATATYPES containeddatatypes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(containeddatatypes, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCONTAINEDDOCUMENTS(CONTAINEDDOCUMENTS containeddocuments, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(containeddocuments, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCONTAINEDPROPERTIES(CONTAINEDPROPERTIES containedproperties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(containedproperties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCONTAINEDSUPPLIERS(CONTAINEDSUPPLIERS containedsuppliers, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(containedsuppliers, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCONTEXTDEPENDENTUNIT(CONTEXTDEPENDENTUNIT contextdependentunit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contextdependentunit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCONTEXTPARAMETERCONSTRAINTS(CONTEXTPARAMETERCONSTRAINTS contextparameterconstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contextparameterconstraints, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCONTEXTPARAMICON(CONTEXTPARAMICON contextparamicon, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contextparamicon, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCONTEXTRESTRICTIONCONSTRAINT(CONTEXTRESTRICTIONCONSTRAINT contextrestrictionconstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(contextrestrictionconstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(contextrestrictionconstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(contextrestrictionconstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(contextrestrictionconstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(contextrestrictionconstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(contextrestrictionconstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(contextrestrictionconstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(contextrestrictionconstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(contextrestrictionconstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateCONSTRAINT_patternConstraintId(contextrestrictionconstraint, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCONVERSIONBASEDUNIT(CONVERSIONBASEDUNIT conversionbasedunit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conversionbasedunit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCORRESPONDINGPROPERTIES(CORRESPONDINGPROPERTIES correspondingproperties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(correspondingproperties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCREATEICON(CREATEICON createicon, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(createicon, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDATATYPEREFERENCE(DATATYPEREFERENCE datatypereference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(datatypereference, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(datatypereference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(datatypereference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(datatypereference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(datatypereference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(datatypereference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(datatypereference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(datatypereference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(datatypereference, diagnostics, context);
		if (result || diagnostics != null) result &= validateDATATYPEREFERENCE_patternDatatypeRef(datatypereference, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the patternDatatypeRef constraint of '<em>DATATYPEREFERENCE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATATYPEREFERENCE__PATTERN_DATATYPE_REF__EEXPRESSION = "self.datatypeRef.matches('([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})(\\\\-([A-Z0-9:_\\\\.]{1,35})((\\\\-[019])(\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5}))?)?)?#09\\\\-([A-Z0-9:_\\\\.]{1,71})#[0-9]{1,9}') or self.datatypeRef.matches('([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#09\\\\-([A-Z0-9:_\\\\.]{1,71})#[0-9]{1,9}') or self.datatypeRef.matches('([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-\\\\-\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#09\\\\-([A-Z0-9:_\\\\.]{1,71})#[0-9]{1,9}')";

	/**
	 * Validates the patternDatatypeRef constraint of '<em>DATATYPEREFERENCE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDATATYPEREFERENCE_patternDatatypeRef(DATATYPEREFERENCE datatypereference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.DATATYPEREFERENCE,
				 datatypereference,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternDatatypeRef",
				 DATATYPEREFERENCE__PATTERN_DATATYPE_REF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDATATYPESREFERENCE(DATATYPESREFERENCE datatypesreference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(datatypesreference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDATATYPE(DATATYPE datatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(datatype, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(datatype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(datatype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(datatype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(datatype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(datatype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(datatype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(datatype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(datatype, diagnostics, context);
		if (result || diagnostics != null) result &= validateDATATYPE_maxLengthRevision(datatype, diagnostics, context);
		if (result || diagnostics != null) result &= validateDATATYPE_patternStatus(datatype, diagnostics, context);
		if (result || diagnostics != null) result &= validateDATATYPE_patternId(datatype, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the maxLengthRevision constraint of '<em>DATATYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATATYPE__MAX_LENGTH_REVISION__EEXPRESSION = "self.revision.size() <= 3";

	/**
	 * Validates the maxLengthRevision constraint of '<em>DATATYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDATATYPE_maxLengthRevision(DATATYPE datatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.DATATYPE,
				 datatype,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxLengthRevision",
				 DATATYPE__MAX_LENGTH_REVISION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the patternStatus constraint of '<em>DATATYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATATYPE__PATTERN_STATUS__EEXPRESSION = "(self.status=null) or self.status.matches('[^\\\\-]*') or self.status.matches('[^\\\\s]*')";

	/**
	 * Validates the patternStatus constraint of '<em>DATATYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDATATYPE_patternStatus(DATATYPE datatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.DATATYPE,
				 datatype,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternStatus",
				 DATATYPE__PATTERN_STATUS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the patternId constraint of '<em>DATATYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATATYPE__PATTERN_ID__EEXPRESSION = "self.id.matches('([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})(\\\\-([A-Z0-9:_\\\\.]{1,35})((\\\\-[019])(\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5}))?)?)?#09\\\\-([A-Z0-9:_\\\\.]{1,71})#[0-9]{1,9}') or self.id.matches('([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#09\\\\-([A-Z0-9:_\\\\.]{1,71})#[0-9]{1,9}') or self.id.matches('([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-\\\\-\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#09\\\\-([A-Z0-9:_\\\\.]{1,71})#[0-9]{1,9}')";

	/**
	 * Validates the patternId constraint of '<em>DATATYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDATATYPE_patternId(DATATYPE datatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.DATATYPE,
				 datatype,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternId",
				 DATATYPE__PATTERN_ID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDATEDATATYPE(DATEDATATYPE datedatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(datedatatype, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(datedatatype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(datedatatype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(datedatatype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(datedatatype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(datedatatype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(datedatatype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(datedatatype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(datedatatype, diagnostics, context);
		if (result || diagnostics != null) result &= validateDATEDATATYPE_maxLengthValueFormat(datedatatype, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the maxLengthValueFormat constraint of '<em>DATEDATATYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATEDATATYPE__MAX_LENGTH_VALUE_FORMAT__EEXPRESSION = "(self.valueFormat = null) or self.valueFormat.size() <= 80";

	/**
	 * Validates the maxLengthValueFormat constraint of '<em>DATEDATATYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDATEDATATYPE_maxLengthValueFormat(DATEDATATYPE datedatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.DATEDATATYPE,
				 datedatatype,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxLengthValueFormat",
				 DATEDATATYPE__MAX_LENGTH_VALUE_FORMAT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDATETIMEDATATYPE(DATETIMEDATATYPE datetimedatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(datetimedatatype, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(datetimedatatype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(datetimedatatype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(datetimedatatype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(datetimedatatype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(datetimedatatype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(datetimedatatype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(datetimedatatype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(datetimedatatype, diagnostics, context);
		if (result || diagnostics != null) result &= validateDATETIMEDATATYPE_maxLengthValueFormat(datetimedatatype, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the maxLengthValueFormat constraint of '<em>DATETIMEDATATYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATETIMEDATATYPE__MAX_LENGTH_VALUE_FORMAT__EEXPRESSION = "(self.valueFormat = null) or self.valueFormat.size() <= 80";

	/**
	 * Validates the maxLengthValueFormat constraint of '<em>DATETIMEDATATYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDATETIMEDATATYPE_maxLengthValueFormat(DATETIMEDATATYPE datetimedatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.DATETIMEDATATYPE,
				 datetimedatatype,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxLengthValueFormat",
				 DATETIMEDATATYPE__MAX_LENGTH_VALUE_FORMAT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDEPENDENTPDET(DEPENDENTPDET dependentpdet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dependentpdet, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dependentpdet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dependentpdet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dependentpdet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dependentpdet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dependentpdet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dependentpdet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dependentpdet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dependentpdet, diagnostics, context);
		if (result || diagnostics != null) result &= validatePROPERTY_maxLengthRevision(dependentpdet, diagnostics, context);
		if (result || diagnostics != null) result &= validatePROPERTY_patternStatus(dependentpdet, diagnostics, context);
		if (result || diagnostics != null) result &= validatePROPERTY_patternId(dependentpdet, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDERIVEDUNITELEMENT(DERIVEDUNITELEMENT derivedunitelement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(derivedunitelement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDERIVEDUNIT(DERIVEDUNIT derivedunit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(derivedunit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDICTIONARIESREFERENCE(DICTIONARIESREFERENCE dictionariesreference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dictionariesreference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDICTIONARYINSTANDARDFORMAT(DICTIONARYINSTANDARDFORMAT dictionaryinstandardformat, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dictionaryinstandardformat, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDICTIONARYREFERENCE(DICTIONARYREFERENCE dictionaryreference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dictionaryreference, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dictionaryreference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dictionaryreference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dictionaryreference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dictionaryreference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dictionaryreference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dictionaryreference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dictionaryreference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dictionaryreference, diagnostics, context);
		if (result || diagnostics != null) result &= validateDICTIONARYREFERENCE_patternDictionaryRef(dictionaryreference, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the patternDictionaryRef constraint of '<em>DICTIONARYREFERENCE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DICTIONARYREFERENCE__PATTERN_DICTIONARY_REF__EEXPRESSION = "self.dictionaryRef.matches('([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})(\\\\-([A-Z0-9:_\\\\.]{1,35})((\\\\-[019])(\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5}))?)?)?#11\\\\-([A-Z0-9:_\\\\.]{1,71})#[0-9]{1,9}') or self.dictionaryRef.matches('([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#11\\\\-([A-Z0-9:_\\\\.]{1,71})#[0-9]{1,9}') or self.dictionaryRef.matches('([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-\\\\-\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#11\\\\-([A-Z0-9:_\\\\.]{1,71})#[0-9]{1,9}')";

	/**
	 * Validates the patternDictionaryRef constraint of '<em>DICTIONARYREFERENCE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDICTIONARYREFERENCE_patternDictionaryRef(DICTIONARYREFERENCE dictionaryreference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.DICTIONARYREFERENCE,
				 dictionaryreference,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternDictionaryRef",
				 DICTIONARYREFERENCE__PATTERN_DICTIONARY_REF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDICTIONARY(DICTIONARY dictionary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dictionary, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDICUNITREFERENCE(DICUNITREFERENCE dicunitreference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dicunitreference, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dicunitreference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dicunitreference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dicunitreference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dicunitreference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dicunitreference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dicunitreference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dicunitreference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dicunitreference, diagnostics, context);
		if (result || diagnostics != null) result &= validateDICUNITREFERENCE_patternDicUnitRef(dicunitreference, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the patternDicUnitRef constraint of '<em>DICUNITREFERENCE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DICUNITREFERENCE__PATTERN_DIC_UNIT_REF__EEXPRESSION = "self.dicUnitRef.matches('([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})(\\\\-([A-Z0-9:_\\\\.]{1,35})((\\\\-[019])(\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5}))?)?)?#05\\\\-([A-Z0-9:_\\\\.]{1,71})#[0-9]{1,9}') or self.dicUnitRef.matches('([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#05\\\\-([A-Z0-9:_\\\\.]{1,71})#[0-9]{1,9}') or self.dicUnitRef.matches('([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-\\\\-\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#05\\\\-([A-Z0-9:_\\\\.]{1,71})#[0-9]{1,9}')";

	/**
	 * Validates the patternDicUnitRef constraint of '<em>DICUNITREFERENCE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDICUNITREFERENCE_patternDicUnitRef(DICUNITREFERENCE dicunitreference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.DICUNITREFERENCE,
				 dicunitreference,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternDicUnitRef",
				 DICUNITREFERENCE__PATTERN_DIC_UNIT_REF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDICUNITSREFERENCE(DICUNITSREFERENCE dicunitsreference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dicunitsreference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDICUNIT(DICUNIT dicunit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dicunit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dicunit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dicunit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dicunit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dicunit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dicunit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dicunit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dicunit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dicunit, diagnostics, context);
		if (result || diagnostics != null) result &= validateDICUNIT_patternUnitRef(dicunit, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the patternUnitRef constraint of '<em>DICUNIT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DICUNIT__PATTERN_UNIT_REF__EEXPRESSION = "(self.unitRef=null) or self.unitRef.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.unitRef.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.unitRef.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?')";

	/**
	 * Validates the patternUnitRef constraint of '<em>DICUNIT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDICUNIT_patternUnitRef(DICUNIT dicunit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.DICUNIT,
				 dicunit,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternUnitRef",
				 DICUNIT__PATTERN_UNIT_REF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDICVALUE(DICVALUE dicvalue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dicvalue, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dicvalue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dicvalue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dicvalue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dicvalue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dicvalue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dicvalue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dicvalue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dicvalue, diagnostics, context);
		if (result || diagnostics != null) result &= validateDICVALUE_patternStatus(dicvalue, diagnostics, context);
		if (result || diagnostics != null) result &= validateDICVALUE_patternValueMeaningId(dicvalue, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the patternStatus constraint of '<em>DICVALUE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DICVALUE__PATTERN_STATUS__EEXPRESSION = "(self.status=null) or self.status.matches('[^\\\\-]*') or self.status.matches('[^\\\\s]*')";

	/**
	 * Validates the patternStatus constraint of '<em>DICVALUE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDICVALUE_patternStatus(DICVALUE dicvalue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.DICVALUE,
				 dicvalue,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternStatus",
				 DICVALUE__PATTERN_STATUS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the patternValueMeaningId constraint of '<em>DICVALUE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DICVALUE__PATTERN_VALUE_MEANING_ID__EEXPRESSION = "(self.valueMeaningId=null) or self.valueMeaningId.matches('([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})(\\\\-([A-Z0-9:_\\\\.]{1,35})((\\\\-[019])(\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5}))?)?)?#07\\\\-([A-Z0-9:_\\\\.]{1,35})#[0-9]{1,9}') or self.valueMeaningId.matches('([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#07\\\\-([A-Z0-9:_\\\\.]{1,35})#[0-9]{1,9}') or self.valueMeaningId.matches('([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-\\\\-\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#07\\\\-([A-Z0-9:_\\\\.]{1,35})#[0-9]{1,9}')";

	/**
	 * Validates the patternValueMeaningId constraint of '<em>DICVALUE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDICVALUE_patternValueMeaningId(DICVALUE dicvalue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.DICVALUE,
				 dicvalue,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternValueMeaningId",
				 DICVALUE__PATTERN_VALUE_MEANING_ID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDIMENSIONALEXPONENTS(DIMENSIONALEXPONENTS dimensionalexponents, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dimensionalexponents, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDOCUMENTCONTENT(DOCUMENTCONTENT documentcontent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(documentcontent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(documentcontent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(documentcontent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(documentcontent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(documentcontent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(documentcontent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(documentcontent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(documentcontent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(documentcontent, diagnostics, context);
		if (result || diagnostics != null) result &= validateDOCUMENTCONTENT_maxLengthRevision(documentcontent, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the maxLengthRevision constraint of '<em>DOCUMENTCONTENT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DOCUMENTCONTENT__MAX_LENGTH_REVISION__EEXPRESSION = "self.revision.size() <= 3";

	/**
	 * Validates the maxLengthRevision constraint of '<em>DOCUMENTCONTENT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDOCUMENTCONTENT_maxLengthRevision(DOCUMENTCONTENT documentcontent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.DOCUMENTCONTENT,
				 documentcontent,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxLengthRevision",
				 DOCUMENTCONTENT__MAX_LENGTH_REVISION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDOCUMENTIDENTIFIERNAMELABEL(DOCUMENTIDENTIFIERNAMELABEL documentidentifiernamelabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(documentidentifiernamelabel, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(documentidentifiernamelabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(documentidentifiernamelabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(documentidentifiernamelabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(documentidentifiernamelabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(documentidentifiernamelabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(documentidentifiernamelabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(documentidentifiernamelabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(documentidentifiernamelabel, diagnostics, context);
		if (result || diagnostics != null) result &= validateDOCUMENTIDENTIFIERNAMELABEL_maxLengthValue(documentidentifiernamelabel, diagnostics, context);
		if (result || diagnostics != null) result &= validateDOCUMENTIDENTIFIERNAMELABEL_patternCountryCode(documentidentifiernamelabel, diagnostics, context);
		if (result || diagnostics != null) result &= validateDOCUMENTIDENTIFIERNAMELABEL_patternLanguageCode(documentidentifiernamelabel, diagnostics, context);
		if (result || diagnostics != null) result &= validateDOCUMENTIDENTIFIERNAMELABEL_minLengthLanguageCode(documentidentifiernamelabel, diagnostics, context);
		if (result || diagnostics != null) result &= validateDOCUMENTIDENTIFIERNAMELABEL_maxLengthLanguageCode(documentidentifiernamelabel, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the maxLengthValue constraint of '<em>DOCUMENTIDENTIFIERNAMELABEL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DOCUMENTIDENTIFIERNAMELABEL__MAX_LENGTH_VALUE__EEXPRESSION = "(self.value = null) or self.value.size() <= 255";

	/**
	 * Validates the maxLengthValue constraint of '<em>DOCUMENTIDENTIFIERNAMELABEL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDOCUMENTIDENTIFIERNAMELABEL_maxLengthValue(DOCUMENTIDENTIFIERNAMELABEL documentidentifiernamelabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.DOCUMENTIDENTIFIERNAMELABEL,
				 documentidentifiernamelabel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxLengthValue",
				 DOCUMENTIDENTIFIERNAMELABEL__MAX_LENGTH_VALUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the patternCountryCode constraint of '<em>DOCUMENTIDENTIFIERNAMELABEL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DOCUMENTIDENTIFIERNAMELABEL__PATTERN_COUNTRY_CODE__EEXPRESSION = "(self.countryCode=null) or self.countryCode.matches('[^\\\\-]*') or self.countryCode.matches('[^\\\\s]*')";

	/**
	 * Validates the patternCountryCode constraint of '<em>DOCUMENTIDENTIFIERNAMELABEL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDOCUMENTIDENTIFIERNAMELABEL_patternCountryCode(DOCUMENTIDENTIFIERNAMELABEL documentidentifiernamelabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.DOCUMENTIDENTIFIERNAMELABEL,
				 documentidentifiernamelabel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternCountryCode",
				 DOCUMENTIDENTIFIERNAMELABEL__PATTERN_COUNTRY_CODE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the patternLanguageCode constraint of '<em>DOCUMENTIDENTIFIERNAMELABEL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DOCUMENTIDENTIFIERNAMELABEL__PATTERN_LANGUAGE_CODE__EEXPRESSION = "(self.languageCode=null) or self.languageCode.matches('[^\\\\-]*') or self.languageCode.matches('[^\\\\s]*')";

	/**
	 * Validates the patternLanguageCode constraint of '<em>DOCUMENTIDENTIFIERNAMELABEL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDOCUMENTIDENTIFIERNAMELABEL_patternLanguageCode(DOCUMENTIDENTIFIERNAMELABEL documentidentifiernamelabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.DOCUMENTIDENTIFIERNAMELABEL,
				 documentidentifiernamelabel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternLanguageCode",
				 DOCUMENTIDENTIFIERNAMELABEL__PATTERN_LANGUAGE_CODE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the minLengthLanguageCode constraint of '<em>DOCUMENTIDENTIFIERNAMELABEL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DOCUMENTIDENTIFIERNAMELABEL__MIN_LENGTH_LANGUAGE_CODE__EEXPRESSION = "(self.languageCode = null) or self.languageCode.size() >= 2";

	/**
	 * Validates the minLengthLanguageCode constraint of '<em>DOCUMENTIDENTIFIERNAMELABEL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDOCUMENTIDENTIFIERNAMELABEL_minLengthLanguageCode(DOCUMENTIDENTIFIERNAMELABEL documentidentifiernamelabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.DOCUMENTIDENTIFIERNAMELABEL,
				 documentidentifiernamelabel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "minLengthLanguageCode",
				 DOCUMENTIDENTIFIERNAMELABEL__MIN_LENGTH_LANGUAGE_CODE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the maxLengthLanguageCode constraint of '<em>DOCUMENTIDENTIFIERNAMELABEL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DOCUMENTIDENTIFIERNAMELABEL__MAX_LENGTH_LANGUAGE_CODE__EEXPRESSION = "(self.languageCode = null) or self.languageCode.size() <= 3";

	/**
	 * Validates the maxLengthLanguageCode constraint of '<em>DOCUMENTIDENTIFIERNAMELABEL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDOCUMENTIDENTIFIERNAMELABEL_maxLengthLanguageCode(DOCUMENTIDENTIFIERNAMELABEL documentidentifiernamelabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.DOCUMENTIDENTIFIERNAMELABEL,
				 documentidentifiernamelabel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxLengthLanguageCode",
				 DOCUMENTIDENTIFIERNAMELABEL__MAX_LENGTH_LANGUAGE_CODE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDOCUMENTIDENTIFIER(DOCUMENTIDENTIFIER documentidentifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentidentifier, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDOCUMENTREFERENCE(DOCUMENTREFERENCE documentreference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(documentreference, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(documentreference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(documentreference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(documentreference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(documentreference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(documentreference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(documentreference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(documentreference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(documentreference, diagnostics, context);
		if (result || diagnostics != null) result &= validateDOCUMENTREFERENCE_patternDocumentRef(documentreference, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the patternDocumentRef constraint of '<em>DOCUMENTREFERENCE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DOCUMENTREFERENCE__PATTERN_DOCUMENT_REF__EEXPRESSION = "self.documentRef.matches('([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})(\\\\-([A-Z0-9:_\\\\.]{1,35})((\\\\-[019])(\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5}))?)?)?#10\\\\-([A-Z0-9:_\\\\.]{1,71})#[0-9]{1,9}') or self.documentRef.matches('([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#10\\\\-([A-Z0-9:_\\\\.]{1,71})#[0-9]{1,9}') or self.documentRef.matches('([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-\\\\-\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#10\\\\-([A-Z0-9:_\\\\.]{1,71})#[0-9]{1,9}')";

	/**
	 * Validates the patternDocumentRef constraint of '<em>DOCUMENTREFERENCE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDOCUMENTREFERENCE_patternDocumentRef(DOCUMENTREFERENCE documentreference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.DOCUMENTREFERENCE,
				 documentreference,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternDocumentRef",
				 DOCUMENTREFERENCE__PATTERN_DOCUMENT_REF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDOCUMENTSREFERENCE(DOCUMENTSREFERENCE documentsreference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentsreference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDOCUMENT(DOCUMENT document, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(document, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(document, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(document, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(document, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(document, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(document, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(document, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(document, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(document, diagnostics, context);
		if (result || diagnostics != null) result &= validateDOCUMENT_maxLengthRevision(document, diagnostics, context);
		if (result || diagnostics != null) result &= validateDOCUMENT_patternStatus(document, diagnostics, context);
		if (result || diagnostics != null) result &= validateDOCUMENT_patternId(document, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the maxLengthRevision constraint of '<em>DOCUMENT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DOCUMENT__MAX_LENGTH_REVISION__EEXPRESSION = "self.revision.size() <= 3";

	/**
	 * Validates the maxLengthRevision constraint of '<em>DOCUMENT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDOCUMENT_maxLengthRevision(DOCUMENT document, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.DOCUMENT,
				 document,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxLengthRevision",
				 DOCUMENT__MAX_LENGTH_REVISION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the patternStatus constraint of '<em>DOCUMENT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DOCUMENT__PATTERN_STATUS__EEXPRESSION = "(self.status=null) or self.status.matches('[^\\\\-]*') or self.status.matches('[^\\\\s]*')";

	/**
	 * Validates the patternStatus constraint of '<em>DOCUMENT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDOCUMENT_patternStatus(DOCUMENT document, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.DOCUMENT,
				 document,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternStatus",
				 DOCUMENT__PATTERN_STATUS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the patternId constraint of '<em>DOCUMENT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DOCUMENT__PATTERN_ID__EEXPRESSION = "self.id.matches('([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})(\\\\-([A-Z0-9:_\\\\.]{1,35})((\\\\-[019])(\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5}))?)?)?#10\\\\-([A-Z0-9:_\\\\.]{1,71})#[0-9]{1,9}') or self.id.matches('([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#10\\\\-([A-Z0-9:_\\\\.]{1,71})#[0-9]{1,9}') or self.id.matches('([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-\\\\-\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#10\\\\-([A-Z0-9:_\\\\.]{1,71})#[0-9]{1,9}')";

	/**
	 * Validates the patternId constraint of '<em>DOCUMENT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDOCUMENT_patternId(DOCUMENT document, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.DOCUMENT,
				 document,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternId",
				 DOCUMENT__PATTERN_ID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDOMAINCONSTRAINTS(DOMAINCONSTRAINTS domainconstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(domainconstraints, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDOMAINCONSTRAINT(DOMAINCONSTRAINT domainconstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(domainconstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMERATIONCONSTRAINT(ENUMERATIONCONSTRAINT enumerationconstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enumerationconstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEXPLICITFUNCTIONALMODELCLASSEXTENSION(EXPLICITFUNCTIONALMODELCLASSEXTENSION explicitfunctionalmodelclassextension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(explicitfunctionalmodelclassextension, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(explicitfunctionalmodelclassextension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(explicitfunctionalmodelclassextension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(explicitfunctionalmodelclassextension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(explicitfunctionalmodelclassextension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(explicitfunctionalmodelclassextension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(explicitfunctionalmodelclassextension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(explicitfunctionalmodelclassextension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(explicitfunctionalmodelclassextension, diagnostics, context);
		if (result || diagnostics != null) result &= validateCLASSEXTENSION_patternContentVersion(explicitfunctionalmodelclassextension, diagnostics, context);
		if (result || diagnostics != null) result &= validateCLASSEXTENSION_maxLengthContentVersion(explicitfunctionalmodelclassextension, diagnostics, context);
		if (result || diagnostics != null) result &= validateCLASSEXTENSION_maxLengthContentRevision(explicitfunctionalmodelclassextension, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEXPLICITITEMCLASSEXTENSION(EXPLICITITEMCLASSEXTENSION explicititemclassextension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(explicititemclassextension, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(explicititemclassextension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(explicititemclassextension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(explicititemclassextension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(explicititemclassextension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(explicititemclassextension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(explicititemclassextension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(explicititemclassextension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(explicititemclassextension, diagnostics, context);
		if (result || diagnostics != null) result &= validateCLASSEXTENSION_patternContentVersion(explicititemclassextension, diagnostics, context);
		if (result || diagnostics != null) result &= validateCLASSEXTENSION_maxLengthContentVersion(explicititemclassextension, diagnostics, context);
		if (result || diagnostics != null) result &= validateCLASSEXTENSION_maxLengthContentRevision(explicititemclassextension, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEXTERNALFILES(EXTERNALFILES externalfiles, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(externalfiles, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEXTERNALGRAPHICS(EXTERNALGRAPHICS externalgraphics, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(externalgraphics, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEXTERNALRESOURCE(EXTERNALRESOURCE externalresource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(externalresource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFILTER(FILTER filter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(filter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFMCLASSVIEWOF(FMCLASSVIEWOF fmclassviewof, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(fmclassviewof, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(fmclassviewof, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(fmclassviewof, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(fmclassviewof, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(fmclassviewof, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(fmclassviewof, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(fmclassviewof, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(fmclassviewof, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(fmclassviewof, diagnostics, context);
		if (result || diagnostics != null) result &= validateCLASS_maxLengthRevision(fmclassviewof, diagnostics, context);
		if (result || diagnostics != null) result &= validateCLASS_patternStatus(fmclassviewof, diagnostics, context);
		if (result || diagnostics != null) result &= validateCLASS_patternId(fmclassviewof, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFUNCTIONALMODELCLASS(FUNCTIONALMODELCLASS functionalmodelclass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(functionalmodelclass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(functionalmodelclass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(functionalmodelclass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(functionalmodelclass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(functionalmodelclass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(functionalmodelclass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(functionalmodelclass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(functionalmodelclass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(functionalmodelclass, diagnostics, context);
		if (result || diagnostics != null) result &= validateCLASS_maxLengthRevision(functionalmodelclass, diagnostics, context);
		if (result || diagnostics != null) result &= validateCLASS_patternStatus(functionalmodelclass, diagnostics, context);
		if (result || diagnostics != null) result &= validateCLASS_patternId(functionalmodelclass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGENERALTEXT(GENERALTEXT generaltext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(generaltext, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(generaltext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(generaltext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(generaltext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(generaltext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(generaltext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(generaltext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(generaltext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(generaltext, diagnostics, context);
		if (result || diagnostics != null) result &= validateGENERALTEXT_patternCountryCode(generaltext, diagnostics, context);
		if (result || diagnostics != null) result &= validateGENERALTEXT_patternLanguageCode(generaltext, diagnostics, context);
		if (result || diagnostics != null) result &= validateGENERALTEXT_minLengthLanguageCode(generaltext, diagnostics, context);
		if (result || diagnostics != null) result &= validateGENERALTEXT_maxLengthLanguageCode(generaltext, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the patternCountryCode constraint of '<em>GENERALTEXT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GENERALTEXT__PATTERN_COUNTRY_CODE__EEXPRESSION = "(self.countryCode=null) or self.countryCode.matches('[^\\\\-]*') or self.countryCode.matches('[^\\\\s]*')";

	/**
	 * Validates the patternCountryCode constraint of '<em>GENERALTEXT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGENERALTEXT_patternCountryCode(GENERALTEXT generaltext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.GENERALTEXT,
				 generaltext,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternCountryCode",
				 GENERALTEXT__PATTERN_COUNTRY_CODE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the patternLanguageCode constraint of '<em>GENERALTEXT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GENERALTEXT__PATTERN_LANGUAGE_CODE__EEXPRESSION = "(self.languageCode=null) or self.languageCode.matches('[^\\\\-]*') or self.languageCode.matches('[^\\\\s]*')";

	/**
	 * Validates the patternLanguageCode constraint of '<em>GENERALTEXT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGENERALTEXT_patternLanguageCode(GENERALTEXT generaltext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.GENERALTEXT,
				 generaltext,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternLanguageCode",
				 GENERALTEXT__PATTERN_LANGUAGE_CODE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the minLengthLanguageCode constraint of '<em>GENERALTEXT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GENERALTEXT__MIN_LENGTH_LANGUAGE_CODE__EEXPRESSION = "(self.languageCode = null) or self.languageCode.size() >= 2";

	/**
	 * Validates the minLengthLanguageCode constraint of '<em>GENERALTEXT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGENERALTEXT_minLengthLanguageCode(GENERALTEXT generaltext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.GENERALTEXT,
				 generaltext,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "minLengthLanguageCode",
				 GENERALTEXT__MIN_LENGTH_LANGUAGE_CODE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the maxLengthLanguageCode constraint of '<em>GENERALTEXT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GENERALTEXT__MAX_LENGTH_LANGUAGE_CODE__EEXPRESSION = "(self.languageCode = null) or self.languageCode.size() <= 3";

	/**
	 * Validates the maxLengthLanguageCode constraint of '<em>GENERALTEXT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGENERALTEXT_maxLengthLanguageCode(GENERALTEXT generaltext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.GENERALTEXT,
				 generaltext,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxLengthLanguageCode",
				 GENERALTEXT__MAX_LENGTH_LANGUAGE_CODE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGEOMETRICCONTEXT(GEOMETRICCONTEXT geometriccontext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(geometriccontext, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGEOMETRICUNITCONTEXT(GEOMETRICUNITCONTEXT geometricunitcontext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(geometricunitcontext, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGRAPHICS(GRAPHICS graphics, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(graphics, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHEADER(HEADER header, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(header, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(header, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(header, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(header, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(header, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(header, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(header, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(header, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(header, diagnostics, context);
		if (result || diagnostics != null) result &= validateHEADER_patternId(header, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the patternId constraint of '<em>HEADER</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String HEADER__PATTERN_ID__EEXPRESSION = "(self.id=null) or self.id.matches('([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})(\\\\-([A-Z0-9:_\\\\.]{1,35})((\\\\-[019])(\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5}))?)?)?#11\\\\-([A-Z0-9:_\\\\.]{1,71})#[0-9]{1,9}') or self.id.matches('([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#11\\\\-([A-Z0-9:_\\\\.]{1,71})#[0-9]{1,9}') or self.id.matches('([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-\\\\-\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#11\\\\-([A-Z0-9:_\\\\.]{1,71})#[0-9]{1,9}')";

	/**
	 * Validates the patternId constraint of '<em>HEADER</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHEADER_patternId(HEADER header, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.HEADER,
				 header,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternId",
				 HEADER__PATTERN_ID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHTTPFILE(HTTPFILE httpfile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(httpfile, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(httpfile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(httpfile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(httpfile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(httpfile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(httpfile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(httpfile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(httpfile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(httpfile, diagnostics, context);
		if (result || diagnostics != null) result &= validateHTTPFILE_patternFileName(httpfile, diagnostics, context);
		if (result || diagnostics != null) result &= validateHTTPFILE_maxLengthFileName(httpfile, diagnostics, context);
		if (result || diagnostics != null) result &= validateHTTPFILE_patternDirName(httpfile, diagnostics, context);
		if (result || diagnostics != null) result &= validateHTTPFILE_maxLengthDirName(httpfile, diagnostics, context);
		if (result || diagnostics != null) result &= validateHTTPFILE_patternCountryCode(httpfile, diagnostics, context);
		if (result || diagnostics != null) result &= validateHTTPFILE_patternLanguageCode(httpfile, diagnostics, context);
		if (result || diagnostics != null) result &= validateHTTPFILE_minLengthLanguageCode(httpfile, diagnostics, context);
		if (result || diagnostics != null) result &= validateHTTPFILE_maxLengthLanguageCode(httpfile, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the patternFileName constraint of '<em>HTTPFILE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String HTTPFILE__PATTERN_FILE_NAME__EEXPRESSION = "(self.fileName=null) or self.fileName.matches('[^\\\\s]*')";

	/**
	 * Validates the patternFileName constraint of '<em>HTTPFILE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHTTPFILE_patternFileName(HTTPFILE httpfile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.HTTPFILE,
				 httpfile,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternFileName",
				 HTTPFILE__PATTERN_FILE_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the maxLengthFileName constraint of '<em>HTTPFILE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String HTTPFILE__MAX_LENGTH_FILE_NAME__EEXPRESSION = "(self.fileName = null) or self.fileName.size() <= 128";

	/**
	 * Validates the maxLengthFileName constraint of '<em>HTTPFILE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHTTPFILE_maxLengthFileName(HTTPFILE httpfile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.HTTPFILE,
				 httpfile,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxLengthFileName",
				 HTTPFILE__MAX_LENGTH_FILE_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the patternDirName constraint of '<em>HTTPFILE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String HTTPFILE__PATTERN_DIR_NAME__EEXPRESSION = "(self.dirName=null) or self.dirName.matches('[^\\\\s]*')";

	/**
	 * Validates the patternDirName constraint of '<em>HTTPFILE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHTTPFILE_patternDirName(HTTPFILE httpfile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.HTTPFILE,
				 httpfile,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternDirName",
				 HTTPFILE__PATTERN_DIR_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the maxLengthDirName constraint of '<em>HTTPFILE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String HTTPFILE__MAX_LENGTH_DIR_NAME__EEXPRESSION = "(self.dirName = null) or self.dirName.size() <= 128";

	/**
	 * Validates the maxLengthDirName constraint of '<em>HTTPFILE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHTTPFILE_maxLengthDirName(HTTPFILE httpfile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.HTTPFILE,
				 httpfile,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxLengthDirName",
				 HTTPFILE__MAX_LENGTH_DIR_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the patternCountryCode constraint of '<em>HTTPFILE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String HTTPFILE__PATTERN_COUNTRY_CODE__EEXPRESSION = "(self.countryCode=null) or self.countryCode.matches('[^\\\\-]*') or self.countryCode.matches('[^\\\\s]*')";

	/**
	 * Validates the patternCountryCode constraint of '<em>HTTPFILE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHTTPFILE_patternCountryCode(HTTPFILE httpfile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.HTTPFILE,
				 httpfile,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternCountryCode",
				 HTTPFILE__PATTERN_COUNTRY_CODE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the patternLanguageCode constraint of '<em>HTTPFILE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String HTTPFILE__PATTERN_LANGUAGE_CODE__EEXPRESSION = "(self.languageCode=null) or self.languageCode.matches('[^\\\\-]*') or self.languageCode.matches('[^\\\\s]*')";

	/**
	 * Validates the patternLanguageCode constraint of '<em>HTTPFILE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHTTPFILE_patternLanguageCode(HTTPFILE httpfile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.HTTPFILE,
				 httpfile,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternLanguageCode",
				 HTTPFILE__PATTERN_LANGUAGE_CODE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the minLengthLanguageCode constraint of '<em>HTTPFILE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String HTTPFILE__MIN_LENGTH_LANGUAGE_CODE__EEXPRESSION = "(self.languageCode = null) or self.languageCode.size() >= 2";

	/**
	 * Validates the minLengthLanguageCode constraint of '<em>HTTPFILE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHTTPFILE_minLengthLanguageCode(HTTPFILE httpfile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.HTTPFILE,
				 httpfile,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "minLengthLanguageCode",
				 HTTPFILE__MIN_LENGTH_LANGUAGE_CODE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the maxLengthLanguageCode constraint of '<em>HTTPFILE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String HTTPFILE__MAX_LENGTH_LANGUAGE_CODE__EEXPRESSION = "(self.languageCode = null) or self.languageCode.size() <= 3";

	/**
	 * Validates the maxLengthLanguageCode constraint of '<em>HTTPFILE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHTTPFILE_maxLengthLanguageCode(HTTPFILE httpfile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.HTTPFILE,
				 httpfile,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxLengthLanguageCode",
				 HTTPFILE__MAX_LENGTH_LANGUAGE_CODE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIDENTIFIEDDOCUMENT(IDENTIFIEDDOCUMENT identifieddocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(identifieddocument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateILLUSTRATION(ILLUSTRATION illustration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(illustration, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(illustration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(illustration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(illustration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(illustration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(illustration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(illustration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(illustration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(illustration, diagnostics, context);
		if (result || diagnostics != null) result &= validateILLUSTRATION_patternCode(illustration, diagnostics, context);
		if (result || diagnostics != null) result &= validateILLUSTRATION_maxLengthCode(illustration, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the patternCode constraint of '<em>ILLUSTRATION</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ILLUSTRATION__PATTERN_CODE__EEXPRESSION = "self.code.matches('[^\\\\-]*') or self.code.matches('[^\\\\s]*')";

	/**
	 * Validates the patternCode constraint of '<em>ILLUSTRATION</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateILLUSTRATION_patternCode(ILLUSTRATION illustration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.ILLUSTRATION,
				 illustration,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternCode",
				 ILLUSTRATION__PATTERN_CODE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the maxLengthCode constraint of '<em>ILLUSTRATION</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ILLUSTRATION__MAX_LENGTH_CODE__EEXPRESSION = "self.code.size() <= 18";

	/**
	 * Validates the maxLengthCode constraint of '<em>ILLUSTRATION</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateILLUSTRATION_maxLengthCode(ILLUSTRATION illustration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.ILLUSTRATION,
				 illustration,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxLengthCode",
				 ILLUSTRATION__MAX_LENGTH_CODE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateINFORMATION(INFORMATION information, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(information, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(information, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(information, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(information, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(information, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(information, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(information, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(information, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(information, diagnostics, context);
		if (result || diagnostics != null) result &= validateINFORMATION_maxLengthRevision(information, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the maxLengthRevision constraint of '<em>INFORMATION</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INFORMATION__MAX_LENGTH_REVISION__EEXPRESSION = "self.revision.size() <= 3";

	/**
	 * Validates the maxLengthRevision constraint of '<em>INFORMATION</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateINFORMATION_maxLengthRevision(INFORMATION information, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.INFORMATION,
				 information,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxLengthRevision",
				 INFORMATION__MAX_LENGTH_REVISION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateINTCURRENCYTYPE(INTCURRENCYTYPE intcurrencytype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(intcurrencytype, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(intcurrencytype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(intcurrencytype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(intcurrencytype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(intcurrencytype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(intcurrencytype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(intcurrencytype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(intcurrencytype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(intcurrencytype, diagnostics, context);
		if (result || diagnostics != null) result &= validateINTCURRENCYTYPE_maxLengthValueFormat(intcurrencytype, diagnostics, context);
		if (result || diagnostics != null) result &= validateINTCURRENCYTYPE_maxLengthCurrency(intcurrencytype, diagnostics, context);
		if (result || diagnostics != null) result &= validateINTCURRENCYTYPE_patternCurrencyId(intcurrencytype, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the maxLengthValueFormat constraint of '<em>INTCURRENCYTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INTCURRENCYTYPE__MAX_LENGTH_VALUE_FORMAT__EEXPRESSION = "(self.valueFormat = null) or self.valueFormat.size() <= 80";

	/**
	 * Validates the maxLengthValueFormat constraint of '<em>INTCURRENCYTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateINTCURRENCYTYPE_maxLengthValueFormat(INTCURRENCYTYPE intcurrencytype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.INTCURRENCYTYPE,
				 intcurrencytype,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxLengthValueFormat",
				 INTCURRENCYTYPE__MAX_LENGTH_VALUE_FORMAT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the maxLengthCurrency constraint of '<em>INTCURRENCYTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INTCURRENCYTYPE__MAX_LENGTH_CURRENCY__EEXPRESSION = "(self.currency = null) or self.currency.size() <= 3";

	/**
	 * Validates the maxLengthCurrency constraint of '<em>INTCURRENCYTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateINTCURRENCYTYPE_maxLengthCurrency(INTCURRENCYTYPE intcurrencytype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.INTCURRENCYTYPE,
				 intcurrencytype,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxLengthCurrency",
				 INTCURRENCYTYPE__MAX_LENGTH_CURRENCY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the patternCurrencyId constraint of '<em>INTCURRENCYTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INTCURRENCYTYPE__PATTERN_CURRENCY_ID__EEXPRESSION = "(self.currencyId=null) or self.currencyId.matches('([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})(\\\\-([A-Z0-9:_\\\\.]{1,35})((\\\\-[019])(\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5}))?)?)?#08\\\\-([A-Z0-9:_\\\\.]{1,71})#[0-9]{1,9}') or self.currencyId.matches('([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#08\\\\-([A-Z0-9:_\\\\.]{1,71})#[0-9]{1,9}') or self.currencyId.matches('([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-\\\\-\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#08\\\\-([A-Z0-9:_\\\\.]{1,71})#[0-9]{1,9}')";

	/**
	 * Validates the patternCurrencyId constraint of '<em>INTCURRENCYTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateINTCURRENCYTYPE_patternCurrencyId(INTCURRENCYTYPE intcurrencytype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.INTCURRENCYTYPE,
				 intcurrencytype,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternCurrencyId",
				 INTCURRENCYTYPE__PATTERN_CURRENCY_ID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateINTDICVALUE(INTDICVALUE intdicvalue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(intdicvalue, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(intdicvalue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(intdicvalue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(intdicvalue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(intdicvalue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(intdicvalue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(intdicvalue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(intdicvalue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(intdicvalue, diagnostics, context);
		if (result || diagnostics != null) result &= validateDICVALUE_patternStatus(intdicvalue, diagnostics, context);
		if (result || diagnostics != null) result &= validateDICVALUE_patternValueMeaningId(intdicvalue, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateINTEGRITYCONSTRAINT(INTEGRITYCONSTRAINT integrityconstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(integrityconstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(integrityconstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(integrityconstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(integrityconstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(integrityconstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(integrityconstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(integrityconstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(integrityconstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(integrityconstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateCONSTRAINT_patternConstraintId(integrityconstraint, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateINTMEASURETYPE(INTMEASURETYPE intmeasuretype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(intmeasuretype, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(intmeasuretype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(intmeasuretype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(intmeasuretype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(intmeasuretype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(intmeasuretype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(intmeasuretype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(intmeasuretype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(intmeasuretype, diagnostics, context);
		if (result || diagnostics != null) result &= validateINTMEASURETYPE_maxLengthValueFormat(intmeasuretype, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the maxLengthValueFormat constraint of '<em>INTMEASURETYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INTMEASURETYPE__MAX_LENGTH_VALUE_FORMAT__EEXPRESSION = "(self.valueFormat = null) or self.valueFormat.size() <= 80";

	/**
	 * Validates the maxLengthValueFormat constraint of '<em>INTMEASURETYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateINTMEASURETYPE_maxLengthValueFormat(INTMEASURETYPE intmeasuretype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.INTMEASURETYPE,
				 intmeasuretype,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxLengthValueFormat",
				 INTMEASURETYPE__MAX_LENGTH_VALUE_FORMAT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateINTTYPE(INTTYPE inttype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(inttype, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(inttype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(inttype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(inttype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(inttype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(inttype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(inttype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(inttype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(inttype, diagnostics, context);
		if (result || diagnostics != null) result &= validateINTTYPE_maxLengthValueFormat(inttype, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the maxLengthValueFormat constraint of '<em>INTTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INTTYPE__MAX_LENGTH_VALUE_FORMAT__EEXPRESSION = "(self.valueFormat = null) or self.valueFormat.size() <= 80";

	/**
	 * Validates the maxLengthValueFormat constraint of '<em>INTTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateINTTYPE_maxLengthValueFormat(INTTYPE inttype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.INTTYPE,
				 inttype,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxLengthValueFormat",
				 INTTYPE__MAX_LENGTH_VALUE_FORMAT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateITEMCLASSCASEOF(ITEMCLASSCASEOF itemclasscaseof, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(itemclasscaseof, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(itemclasscaseof, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(itemclasscaseof, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(itemclasscaseof, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(itemclasscaseof, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(itemclasscaseof, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(itemclasscaseof, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(itemclasscaseof, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(itemclasscaseof, diagnostics, context);
		if (result || diagnostics != null) result &= validateCLASS_maxLengthRevision(itemclasscaseof, diagnostics, context);
		if (result || diagnostics != null) result &= validateCLASS_patternStatus(itemclasscaseof, diagnostics, context);
		if (result || diagnostics != null) result &= validateCLASS_patternId(itemclasscaseof, diagnostics, context);
		if (result || diagnostics != null) result &= validateITEMCLASSCASEOF_patternCodedName(itemclasscaseof, diagnostics, context);
		if (result || diagnostics != null) result &= validateITEMCLASSCASEOF_maxLengthCodedName(itemclasscaseof, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the patternCodedName constraint of '<em>ITEMCLASSCASEOF</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ITEMCLASSCASEOF__PATTERN_CODED_NAME__EEXPRESSION = "(self.codedName=null) or self.codedName.matches('[^\\\\-]*') or self.codedName.matches('[^\\\\s]*')";

	/**
	 * Validates the patternCodedName constraint of '<em>ITEMCLASSCASEOF</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateITEMCLASSCASEOF_patternCodedName(ITEMCLASSCASEOF itemclasscaseof, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.ITEMCLASSCASEOF,
				 itemclasscaseof,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternCodedName",
				 ITEMCLASSCASEOF__PATTERN_CODED_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the maxLengthCodedName constraint of '<em>ITEMCLASSCASEOF</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ITEMCLASSCASEOF__MAX_LENGTH_CODED_NAME__EEXPRESSION = "(self.codedName = null) or self.codedName.size() <= 35";

	/**
	 * Validates the maxLengthCodedName constraint of '<em>ITEMCLASSCASEOF</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateITEMCLASSCASEOF_maxLengthCodedName(ITEMCLASSCASEOF itemclasscaseof, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.ITEMCLASSCASEOF,
				 itemclasscaseof,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxLengthCodedName",
				 ITEMCLASSCASEOF__MAX_LENGTH_CODED_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateITEMCLASS(ITEMCLASS itemclass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(itemclass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(itemclass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(itemclass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(itemclass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(itemclass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(itemclass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(itemclass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(itemclass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(itemclass, diagnostics, context);
		if (result || diagnostics != null) result &= validateCLASS_maxLengthRevision(itemclass, diagnostics, context);
		if (result || diagnostics != null) result &= validateCLASS_patternStatus(itemclass, diagnostics, context);
		if (result || diagnostics != null) result &= validateCLASS_patternId(itemclass, diagnostics, context);
		if (result || diagnostics != null) result &= validateITEMCLASS_patternCodedName(itemclass, diagnostics, context);
		if (result || diagnostics != null) result &= validateITEMCLASS_maxLengthCodedName(itemclass, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the patternCodedName constraint of '<em>ITEMCLASS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ITEMCLASS__PATTERN_CODED_NAME__EEXPRESSION = "(self.codedName=null) or self.codedName.matches('[^\\\\-]*') or self.codedName.matches('[^\\\\s]*')";

	/**
	 * Validates the patternCodedName constraint of '<em>ITEMCLASS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateITEMCLASS_patternCodedName(ITEMCLASS itemclass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.ITEMCLASS,
				 itemclass,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternCodedName",
				 ITEMCLASS__PATTERN_CODED_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the maxLengthCodedName constraint of '<em>ITEMCLASS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ITEMCLASS__MAX_LENGTH_CODED_NAME__EEXPRESSION = "(self.codedName = null) or self.codedName.size() <= 35";

	/**
	 * Validates the maxLengthCodedName constraint of '<em>ITEMCLASS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateITEMCLASS_maxLengthCodedName(ITEMCLASS itemclass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.ITEMCLASS,
				 itemclass,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxLengthCodedName",
				 ITEMCLASS__MAX_LENGTH_CODED_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateITSVALUES(ITSVALUES itsvalues, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(itsvalues, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKEYWORDLABEL(KEYWORDLABEL keywordlabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(keywordlabel, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(keywordlabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(keywordlabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(keywordlabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(keywordlabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(keywordlabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(keywordlabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(keywordlabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(keywordlabel, diagnostics, context);
		if (result || diagnostics != null) result &= validateKEYWORDLABEL_maxLengthValue(keywordlabel, diagnostics, context);
		if (result || diagnostics != null) result &= validateKEYWORDLABEL_patternCountryCode(keywordlabel, diagnostics, context);
		if (result || diagnostics != null) result &= validateKEYWORDLABEL_patternLanguageCode(keywordlabel, diagnostics, context);
		if (result || diagnostics != null) result &= validateKEYWORDLABEL_minLengthLanguageCode(keywordlabel, diagnostics, context);
		if (result || diagnostics != null) result &= validateKEYWORDLABEL_maxLengthLanguageCode(keywordlabel, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the maxLengthValue constraint of '<em>KEYWORDLABEL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String KEYWORDLABEL__MAX_LENGTH_VALUE__EEXPRESSION = "(self.value = null) or self.value.size() <= 255";

	/**
	 * Validates the maxLengthValue constraint of '<em>KEYWORDLABEL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKEYWORDLABEL_maxLengthValue(KEYWORDLABEL keywordlabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.KEYWORDLABEL,
				 keywordlabel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxLengthValue",
				 KEYWORDLABEL__MAX_LENGTH_VALUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the patternCountryCode constraint of '<em>KEYWORDLABEL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String KEYWORDLABEL__PATTERN_COUNTRY_CODE__EEXPRESSION = "(self.countryCode=null) or self.countryCode.matches('[^\\\\-]*') or self.countryCode.matches('[^\\\\s]*')";

	/**
	 * Validates the patternCountryCode constraint of '<em>KEYWORDLABEL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKEYWORDLABEL_patternCountryCode(KEYWORDLABEL keywordlabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.KEYWORDLABEL,
				 keywordlabel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternCountryCode",
				 KEYWORDLABEL__PATTERN_COUNTRY_CODE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the patternLanguageCode constraint of '<em>KEYWORDLABEL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String KEYWORDLABEL__PATTERN_LANGUAGE_CODE__EEXPRESSION = "(self.languageCode=null) or self.languageCode.matches('[^\\\\-]*') or self.languageCode.matches('[^\\\\s]*')";

	/**
	 * Validates the patternLanguageCode constraint of '<em>KEYWORDLABEL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKEYWORDLABEL_patternLanguageCode(KEYWORDLABEL keywordlabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.KEYWORDLABEL,
				 keywordlabel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternLanguageCode",
				 KEYWORDLABEL__PATTERN_LANGUAGE_CODE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the minLengthLanguageCode constraint of '<em>KEYWORDLABEL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String KEYWORDLABEL__MIN_LENGTH_LANGUAGE_CODE__EEXPRESSION = "(self.languageCode = null) or self.languageCode.size() >= 2";

	/**
	 * Validates the minLengthLanguageCode constraint of '<em>KEYWORDLABEL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKEYWORDLABEL_minLengthLanguageCode(KEYWORDLABEL keywordlabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.KEYWORDLABEL,
				 keywordlabel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "minLengthLanguageCode",
				 KEYWORDLABEL__MIN_LENGTH_LANGUAGE_CODE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the maxLengthLanguageCode constraint of '<em>KEYWORDLABEL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String KEYWORDLABEL__MAX_LENGTH_LANGUAGE_CODE__EEXPRESSION = "(self.languageCode = null) or self.languageCode.size() <= 3";

	/**
	 * Validates the maxLengthLanguageCode constraint of '<em>KEYWORDLABEL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKEYWORDLABEL_maxLengthLanguageCode(KEYWORDLABEL keywordlabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.KEYWORDLABEL,
				 keywordlabel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxLengthLanguageCode",
				 KEYWORDLABEL__MAX_LENGTH_LANGUAGE_CODE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKEYWORD(KEYWORD keyword, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(keyword, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLANGUAGE(LANGUAGE language, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(language, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(language, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(language, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(language, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(language, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(language, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(language, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(language, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(language, diagnostics, context);
		if (result || diagnostics != null) result &= validateLANGUAGE_patternCountryCode(language, diagnostics, context);
		if (result || diagnostics != null) result &= validateLANGUAGE_patternLanguageCode(language, diagnostics, context);
		if (result || diagnostics != null) result &= validateLANGUAGE_minLengthLanguageCode(language, diagnostics, context);
		if (result || diagnostics != null) result &= validateLANGUAGE_maxLengthLanguageCode(language, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the patternCountryCode constraint of '<em>LANGUAGE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LANGUAGE__PATTERN_COUNTRY_CODE__EEXPRESSION = "(self.countryCode=null) or self.countryCode.matches('[^\\\\-]*') or self.countryCode.matches('[^\\\\s]*')";

	/**
	 * Validates the patternCountryCode constraint of '<em>LANGUAGE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLANGUAGE_patternCountryCode(LANGUAGE language, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.LANGUAGE,
				 language,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternCountryCode",
				 LANGUAGE__PATTERN_COUNTRY_CODE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the patternLanguageCode constraint of '<em>LANGUAGE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LANGUAGE__PATTERN_LANGUAGE_CODE__EEXPRESSION = "(self.languageCode=null) or self.languageCode.matches('[^\\\\-]*') or self.languageCode.matches('[^\\\\s]*')";

	/**
	 * Validates the patternLanguageCode constraint of '<em>LANGUAGE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLANGUAGE_patternLanguageCode(LANGUAGE language, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.LANGUAGE,
				 language,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternLanguageCode",
				 LANGUAGE__PATTERN_LANGUAGE_CODE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the minLengthLanguageCode constraint of '<em>LANGUAGE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LANGUAGE__MIN_LENGTH_LANGUAGE_CODE__EEXPRESSION = "(self.languageCode = null) or self.languageCode.size() >= 2";

	/**
	 * Validates the minLengthLanguageCode constraint of '<em>LANGUAGE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLANGUAGE_minLengthLanguageCode(LANGUAGE language, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.LANGUAGE,
				 language,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "minLengthLanguageCode",
				 LANGUAGE__MIN_LENGTH_LANGUAGE_CODE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the maxLengthLanguageCode constraint of '<em>LANGUAGE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LANGUAGE__MAX_LENGTH_LANGUAGE_CODE__EEXPRESSION = "(self.languageCode = null) or self.languageCode.size() <= 3";

	/**
	 * Validates the maxLengthLanguageCode constraint of '<em>LANGUAGE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLANGUAGE_maxLengthLanguageCode(LANGUAGE language, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.LANGUAGE,
				 language,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxLengthLanguageCode",
				 LANGUAGE__MAX_LENGTH_LANGUAGE_CODE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLEVEL(LEVEL level, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(level, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLEVELTYPE(LEVELTYPE leveltype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(leveltype, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLIBRARYIIMIDENTIFICATION(LIBRARYIIMIDENTIFICATION libraryiimidentification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(libraryiimidentification, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLIBRARYINSTANDARDFORMAT(LIBRARYINSTANDARDFORMAT libraryinstandardformat, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(libraryinstandardformat, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLIBRARY(LIBRARY library, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(library, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLISTTYPE(LISTTYPE listtype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(listtype, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMAPPINGFUNCTION(MAPPINGFUNCTION mappingfunction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mappingfunction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMATHEMATICALSTRING(MATHEMATICALSTRING mathematicalstring, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mathematicalstring, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMESSAGE(MESSAGE message, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(message, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(message, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(message, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(message, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(message, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(message, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(message, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(message, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(message, diagnostics, context);
		if (result || diagnostics != null) result &= validateMESSAGE_patternCode(message, diagnostics, context);
		if (result || diagnostics != null) result &= validateMESSAGE_maxLengthCode(message, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the patternCode constraint of '<em>MESSAGE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MESSAGE__PATTERN_CODE__EEXPRESSION = "self.code.matches('[^\\\\-]*') or self.code.matches('[^\\\\s]*')";

	/**
	 * Validates the patternCode constraint of '<em>MESSAGE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMESSAGE_patternCode(MESSAGE message, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.MESSAGE,
				 message,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternCode",
				 MESSAGE__PATTERN_CODE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the maxLengthCode constraint of '<em>MESSAGE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MESSAGE__MAX_LENGTH_CODE__EEXPRESSION = "self.code.size() <= 18";

	/**
	 * Validates the maxLengthCode constraint of '<em>MESSAGE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMESSAGE_maxLengthCode(MESSAGE message, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.MESSAGE,
				 message,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxLengthCode",
				 MESSAGE__MAX_LENGTH_CODE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNAMEDTYPE(NAMEDTYPE namedtype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedtype, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNAMEDUNIT(NAMEDUNIT namedunit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedunit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNONDEPENDENTPDET(NONDEPENDENTPDET nondependentpdet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(nondependentpdet, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(nondependentpdet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(nondependentpdet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(nondependentpdet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(nondependentpdet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(nondependentpdet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(nondependentpdet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(nondependentpdet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(nondependentpdet, diagnostics, context);
		if (result || diagnostics != null) result &= validatePROPERTY_maxLengthRevision(nondependentpdet, diagnostics, context);
		if (result || diagnostics != null) result &= validatePROPERTY_patternStatus(nondependentpdet, diagnostics, context);
		if (result || diagnostics != null) result &= validatePROPERTY_patternId(nondependentpdet, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNONINSTANTIABLEFUNCTIONALVIEWCLASS(NONINSTANTIABLEFUNCTIONALVIEWCLASS noninstantiablefunctionalviewclass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(noninstantiablefunctionalviewclass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(noninstantiablefunctionalviewclass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(noninstantiablefunctionalviewclass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(noninstantiablefunctionalviewclass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(noninstantiablefunctionalviewclass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(noninstantiablefunctionalviewclass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(noninstantiablefunctionalviewclass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(noninstantiablefunctionalviewclass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(noninstantiablefunctionalviewclass, diagnostics, context);
		if (result || diagnostics != null) result &= validateCLASS_maxLengthRevision(noninstantiablefunctionalviewclass, diagnostics, context);
		if (result || diagnostics != null) result &= validateCLASS_patternStatus(noninstantiablefunctionalviewclass, diagnostics, context);
		if (result || diagnostics != null) result &= validateCLASS_patternId(noninstantiablefunctionalviewclass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNONQUANTITATIVECODETYPE(NONQUANTITATIVECODETYPE nonquantitativecodetype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(nonquantitativecodetype, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(nonquantitativecodetype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(nonquantitativecodetype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(nonquantitativecodetype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(nonquantitativecodetype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(nonquantitativecodetype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(nonquantitativecodetype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(nonquantitativecodetype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(nonquantitativecodetype, diagnostics, context);
		if (result || diagnostics != null) result &= validateNONQUANTITATIVECODETYPE_maxLengthValueFormat(nonquantitativecodetype, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the maxLengthValueFormat constraint of '<em>NONQUANTITATIVECODETYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NONQUANTITATIVECODETYPE__MAX_LENGTH_VALUE_FORMAT__EEXPRESSION = "(self.valueFormat = null) or self.valueFormat.size() <= 80";

	/**
	 * Validates the maxLengthValueFormat constraint of '<em>NONQUANTITATIVECODETYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNONQUANTITATIVECODETYPE_maxLengthValueFormat(NONQUANTITATIVECODETYPE nonquantitativecodetype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.NONQUANTITATIVECODETYPE,
				 nonquantitativecodetype,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxLengthValueFormat",
				 NONQUANTITATIVECODETYPE__MAX_LENGTH_VALUE_FORMAT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNONQUANTITATIVEINTTYPE(NONQUANTITATIVEINTTYPE nonquantitativeinttype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(nonquantitativeinttype, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(nonquantitativeinttype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(nonquantitativeinttype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(nonquantitativeinttype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(nonquantitativeinttype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(nonquantitativeinttype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(nonquantitativeinttype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(nonquantitativeinttype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(nonquantitativeinttype, diagnostics, context);
		if (result || diagnostics != null) result &= validateNONQUANTITATIVEINTTYPE_maxLengthValueFormat(nonquantitativeinttype, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the maxLengthValueFormat constraint of '<em>NONQUANTITATIVEINTTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NONQUANTITATIVEINTTYPE__MAX_LENGTH_VALUE_FORMAT__EEXPRESSION = "(self.valueFormat = null) or self.valueFormat.size() <= 80";

	/**
	 * Validates the maxLengthValueFormat constraint of '<em>NONQUANTITATIVEINTTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNONQUANTITATIVEINTTYPE_maxLengthValueFormat(NONQUANTITATIVEINTTYPE nonquantitativeinttype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.NONQUANTITATIVEINTTYPE,
				 nonquantitativeinttype,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxLengthValueFormat",
				 NONQUANTITATIVEINTTYPE__MAX_LENGTH_VALUE_FORMAT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNONSIUNIT(NONSIUNIT nonsiunit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nonsiunit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNONTRANSLATABLESTRINGTYPE(NONTRANSLATABLESTRINGTYPE nontranslatablestringtype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(nontranslatablestringtype, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(nontranslatablestringtype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(nontranslatablestringtype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(nontranslatablestringtype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(nontranslatablestringtype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(nontranslatablestringtype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(nontranslatablestringtype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(nontranslatablestringtype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(nontranslatablestringtype, diagnostics, context);
		if (result || diagnostics != null) result &= validateNONTRANSLATABLESTRINGTYPE_maxLengthValueFormat(nontranslatablestringtype, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the maxLengthValueFormat constraint of '<em>NONTRANSLATABLESTRINGTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NONTRANSLATABLESTRINGTYPE__MAX_LENGTH_VALUE_FORMAT__EEXPRESSION = "(self.valueFormat = null) or self.valueFormat.size() <= 80";

	/**
	 * Validates the maxLengthValueFormat constraint of '<em>NONTRANSLATABLESTRINGTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNONTRANSLATABLESTRINGTYPE_maxLengthValueFormat(NONTRANSLATABLESTRINGTYPE nontranslatablestringtype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.NONTRANSLATABLESTRINGTYPE,
				 nontranslatablestringtype,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxLengthValueFormat",
				 NONTRANSLATABLESTRINGTYPE__MAX_LENGTH_VALUE_FORMAT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNUMBERTYPE(NUMBERTYPE numbertype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(numbertype, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(numbertype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(numbertype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(numbertype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(numbertype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(numbertype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(numbertype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(numbertype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(numbertype, diagnostics, context);
		if (result || diagnostics != null) result &= validateNUMBERTYPE_maxLengthValueFormat(numbertype, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the maxLengthValueFormat constraint of '<em>NUMBERTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NUMBERTYPE__MAX_LENGTH_VALUE_FORMAT__EEXPRESSION = "(self.valueFormat = null) or self.valueFormat.size() <= 80";

	/**
	 * Validates the maxLengthValueFormat constraint of '<em>NUMBERTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNUMBERTYPE_maxLengthValueFormat(NUMBERTYPE numbertype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.NUMBERTYPE,
				 numbertype,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxLengthValueFormat",
				 NUMBERTYPE__MAX_LENGTH_VALUE_FORMAT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateONTOML(ONTOML ontoml, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ontoml, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateORGANIZATION(ORGANIZATION organization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(organization, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePERSON(PERSON person, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(person, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePLACEMENTTYPE(PLACEMENTTYPE placementtype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(placementtype, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(placementtype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(placementtype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(placementtype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(placementtype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(placementtype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(placementtype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(placementtype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(placementtype, diagnostics, context);
		if (result || diagnostics != null) result &= validatePLACEMENTTYPE_patternClassRef(placementtype, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the patternClassRef constraint of '<em>PLACEMENTTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PLACEMENTTYPE__PATTERN_CLASS_REF__EEXPRESSION = "(self.classRef=null) or self.classRef.matches('0112\\\\-1\\\\-\\\\-\\\\-13584_32_1#01\\\\-PLACEMENT#1')";

	/**
	 * Validates the patternClassRef constraint of '<em>PLACEMENTTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePLACEMENTTYPE_patternClassRef(PLACEMENTTYPE placementtype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.PLACEMENTTYPE,
				 placementtype,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternClassRef",
				 PLACEMENTTYPE__PATTERN_CLASS_REF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePOSTCONDITION(POSTCONDITION postcondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(postcondition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePRECONDITION(PRECONDITION precondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(precondition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePREFERREDNAMELABEL(PREFERREDNAMELABEL preferrednamelabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(preferrednamelabel, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(preferrednamelabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(preferrednamelabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(preferrednamelabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(preferrednamelabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(preferrednamelabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(preferrednamelabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(preferrednamelabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(preferrednamelabel, diagnostics, context);
		if (result || diagnostics != null) result &= validatePREFERREDNAMELABEL_maxLengthValue(preferrednamelabel, diagnostics, context);
		if (result || diagnostics != null) result &= validatePREFERREDNAMELABEL_patternCountryCode(preferrednamelabel, diagnostics, context);
		if (result || diagnostics != null) result &= validatePREFERREDNAMELABEL_patternLanguageCode(preferrednamelabel, diagnostics, context);
		if (result || diagnostics != null) result &= validatePREFERREDNAMELABEL_minLengthLanguageCode(preferrednamelabel, diagnostics, context);
		if (result || diagnostics != null) result &= validatePREFERREDNAMELABEL_maxLengthLanguageCode(preferrednamelabel, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the maxLengthValue constraint of '<em>PREFERREDNAMELABEL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PREFERREDNAMELABEL__MAX_LENGTH_VALUE__EEXPRESSION = "(self.value = null) or self.value.size() <= 255";

	/**
	 * Validates the maxLengthValue constraint of '<em>PREFERREDNAMELABEL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePREFERREDNAMELABEL_maxLengthValue(PREFERREDNAMELABEL preferrednamelabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.PREFERREDNAMELABEL,
				 preferrednamelabel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxLengthValue",
				 PREFERREDNAMELABEL__MAX_LENGTH_VALUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the patternCountryCode constraint of '<em>PREFERREDNAMELABEL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PREFERREDNAMELABEL__PATTERN_COUNTRY_CODE__EEXPRESSION = "(self.countryCode=null) or self.countryCode.matches('[^\\\\-]*') or self.countryCode.matches('[^\\\\s]*')";

	/**
	 * Validates the patternCountryCode constraint of '<em>PREFERREDNAMELABEL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePREFERREDNAMELABEL_patternCountryCode(PREFERREDNAMELABEL preferrednamelabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.PREFERREDNAMELABEL,
				 preferrednamelabel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternCountryCode",
				 PREFERREDNAMELABEL__PATTERN_COUNTRY_CODE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the patternLanguageCode constraint of '<em>PREFERREDNAMELABEL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PREFERREDNAMELABEL__PATTERN_LANGUAGE_CODE__EEXPRESSION = "(self.languageCode=null) or self.languageCode.matches('[^\\\\-]*') or self.languageCode.matches('[^\\\\s]*')";

	/**
	 * Validates the patternLanguageCode constraint of '<em>PREFERREDNAMELABEL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePREFERREDNAMELABEL_patternLanguageCode(PREFERREDNAMELABEL preferrednamelabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.PREFERREDNAMELABEL,
				 preferrednamelabel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternLanguageCode",
				 PREFERREDNAMELABEL__PATTERN_LANGUAGE_CODE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the minLengthLanguageCode constraint of '<em>PREFERREDNAMELABEL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PREFERREDNAMELABEL__MIN_LENGTH_LANGUAGE_CODE__EEXPRESSION = "(self.languageCode = null) or self.languageCode.size() >= 2";

	/**
	 * Validates the minLengthLanguageCode constraint of '<em>PREFERREDNAMELABEL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePREFERREDNAMELABEL_minLengthLanguageCode(PREFERREDNAMELABEL preferrednamelabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.PREFERREDNAMELABEL,
				 preferrednamelabel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "minLengthLanguageCode",
				 PREFERREDNAMELABEL__MIN_LENGTH_LANGUAGE_CODE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the maxLengthLanguageCode constraint of '<em>PREFERREDNAMELABEL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PREFERREDNAMELABEL__MAX_LENGTH_LANGUAGE_CODE__EEXPRESSION = "(self.languageCode = null) or self.languageCode.size() <= 3";

	/**
	 * Validates the maxLengthLanguageCode constraint of '<em>PREFERREDNAMELABEL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePREFERREDNAMELABEL_maxLengthLanguageCode(PREFERREDNAMELABEL preferrednamelabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.PREFERREDNAMELABEL,
				 preferrednamelabel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxLengthLanguageCode",
				 PREFERREDNAMELABEL__MAX_LENGTH_LANGUAGE_CODE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePREFERREDNAME(PREFERREDNAME preferredname, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(preferredname, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePROGRAMREFERENCETYPE(PROGRAMREFERENCETYPE programreferencetype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(programreferencetype, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(programreferencetype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(programreferencetype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(programreferencetype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(programreferencetype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(programreferencetype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(programreferencetype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(programreferencetype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(programreferencetype, diagnostics, context);
		if (result || diagnostics != null) result &= validatePROGRAMREFERENCETYPE_patternClassRef(programreferencetype, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the patternClassRef constraint of '<em>PROGRAMREFERENCETYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROGRAMREFERENCETYPE__PATTERN_CLASS_REF__EEXPRESSION = "(self.classRef=null) or self.classRef.matches('0112\\\\-1\\\\-\\\\-\\\\-13584_32_1#01\\\\-PROGRAM_REFERENCE#1')";

	/**
	 * Validates the patternClassRef constraint of '<em>PROGRAMREFERENCETYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePROGRAMREFERENCETYPE_patternClassRef(PROGRAMREFERENCETYPE programreferencetype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.PROGRAMREFERENCETYPE,
				 programreferencetype,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternClassRef",
				 PROGRAMREFERENCETYPE__PATTERN_CLASS_REF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePROPERTIESREFERENCE(PROPERTIESREFERENCE propertiesreference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertiesreference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePROPERTYCLASSIFICATION(PROPERTYCLASSIFICATION propertyclassification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertyclassification, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePROPERTYCONSTRAINT(PROPERTYCONSTRAINT propertyconstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(propertyconstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(propertyconstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(propertyconstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(propertyconstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(propertyconstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(propertyconstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(propertyconstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(propertyconstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(propertyconstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateCONSTRAINT_patternConstraintId(propertyconstraint, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePROPERTYMAPPING(PROPERTYMAPPING propertymapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertymapping, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePROPERTYREFERENCE(PROPERTYREFERENCE propertyreference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(propertyreference, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(propertyreference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(propertyreference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(propertyreference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(propertyreference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(propertyreference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(propertyreference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(propertyreference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(propertyreference, diagnostics, context);
		if (result || diagnostics != null) result &= validatePROPERTYREFERENCE_patternPropertyRef(propertyreference, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the patternPropertyRef constraint of '<em>PROPERTYREFERENCE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROPERTYREFERENCE__PATTERN_PROPERTY_REF__EEXPRESSION = "self.propertyRef.matches('([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})(\\\\-([A-Z0-9:_\\\\.]{1,35})((\\\\-[019])(\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5}))?)?)?#02\\\\-([A-Z0-9:_\\\\.]{1,71})#[0-9]{1,9}') or self.propertyRef.matches('([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#02\\\\-([A-Z0-9:_\\\\.]{1,71})#[0-9]{1,9}') or self.propertyRef.matches('([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-\\\\-\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#02\\\\-([A-Z0-9:_\\\\.]{1,71})#[0-9]{1,9}')";

	/**
	 * Validates the patternPropertyRef constraint of '<em>PROPERTYREFERENCE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePROPERTYREFERENCE_patternPropertyRef(PROPERTYREFERENCE propertyreference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.PROPERTYREFERENCE,
				 propertyreference,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternPropertyRef",
				 PROPERTYREFERENCE__PATTERN_PROPERTY_REF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePROPERTY(PROPERTY property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(property, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(property, diagnostics, context);
		if (result || diagnostics != null) result &= validatePROPERTY_maxLengthRevision(property, diagnostics, context);
		if (result || diagnostics != null) result &= validatePROPERTY_patternStatus(property, diagnostics, context);
		if (result || diagnostics != null) result &= validatePROPERTY_patternId(property, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the maxLengthRevision constraint of '<em>PROPERTY</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROPERTY__MAX_LENGTH_REVISION__EEXPRESSION = "self.revision.size() <= 3";

	/**
	 * Validates the maxLengthRevision constraint of '<em>PROPERTY</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePROPERTY_maxLengthRevision(PROPERTY property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.PROPERTY,
				 property,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxLengthRevision",
				 PROPERTY__MAX_LENGTH_REVISION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the patternStatus constraint of '<em>PROPERTY</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROPERTY__PATTERN_STATUS__EEXPRESSION = "(self.status=null) or self.status.matches('[^\\\\-]*') or self.status.matches('[^\\\\s]*')";

	/**
	 * Validates the patternStatus constraint of '<em>PROPERTY</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePROPERTY_patternStatus(PROPERTY property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.PROPERTY,
				 property,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternStatus",
				 PROPERTY__PATTERN_STATUS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the patternId constraint of '<em>PROPERTY</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROPERTY__PATTERN_ID__EEXPRESSION = "self.id.matches('([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})(\\\\-([A-Z0-9:_\\\\.]{1,35})((\\\\-[019])(\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5}))?)?)?#02\\\\-([A-Z0-9:_\\\\.]{1,71})#[0-9]{1,9}') or self.id.matches('([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#02\\\\-([A-Z0-9:_\\\\.]{1,71})#[0-9]{1,9}') or self.id.matches('([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-\\\\-\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#02\\\\-([A-Z0-9:_\\\\.]{1,71})#[0-9]{1,9}')";

	/**
	 * Validates the patternId constraint of '<em>PROPERTY</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePROPERTY_patternId(PROPERTY property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.PROPERTY,
				 property,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternId",
				 PROPERTY__PATTERN_ID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePROPERTYVALUERECOMMENDEDPRESENTATION(PROPERTYVALUERECOMMENDEDPRESENTATION propertyvaluerecommendedpresentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(propertyvaluerecommendedpresentation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(propertyvaluerecommendedpresentation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(propertyvaluerecommendedpresentation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(propertyvaluerecommendedpresentation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(propertyvaluerecommendedpresentation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(propertyvaluerecommendedpresentation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(propertyvaluerecommendedpresentation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(propertyvaluerecommendedpresentation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(propertyvaluerecommendedpresentation, diagnostics, context);
		if (result || diagnostics != null) result &= validatePROPERTYVALUERECOMMENDEDPRESENTATION_maxLengthRecommendedPresentationFormat(propertyvaluerecommendedpresentation, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the maxLengthRecommendedPresentationFormat constraint of '<em>PROPERTYVALUERECOMMENDEDPRESENTATION</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROPERTYVALUERECOMMENDEDPRESENTATION__MAX_LENGTH_RECOMMENDED_PRESENTATION_FORMAT__EEXPRESSION = "self.recommendedPresentationFormat.size() <= 80";

	/**
	 * Validates the maxLengthRecommendedPresentationFormat constraint of '<em>PROPERTYVALUERECOMMENDEDPRESENTATION</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePROPERTYVALUERECOMMENDEDPRESENTATION_maxLengthRecommendedPresentationFormat(PROPERTYVALUERECOMMENDEDPRESENTATION propertyvaluerecommendedpresentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.PROPERTYVALUERECOMMENDEDPRESENTATION,
				 propertyvaluerecommendedpresentation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxLengthRecommendedPresentationFormat",
				 PROPERTYVALUERECOMMENDEDPRESENTATION__MAX_LENGTH_RECOMMENDED_PRESENTATION_FORMAT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRANGECONSTRAINT(RANGECONSTRAINT rangeconstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rangeconstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRATIONALMEASURETYPE(RATIONALMEASURETYPE rationalmeasuretype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(rationalmeasuretype, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(rationalmeasuretype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(rationalmeasuretype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(rationalmeasuretype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(rationalmeasuretype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(rationalmeasuretype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(rationalmeasuretype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(rationalmeasuretype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(rationalmeasuretype, diagnostics, context);
		if (result || diagnostics != null) result &= validateRATIONALMEASURETYPE_maxLengthValueFormat(rationalmeasuretype, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the maxLengthValueFormat constraint of '<em>RATIONALMEASURETYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RATIONALMEASURETYPE__MAX_LENGTH_VALUE_FORMAT__EEXPRESSION = "(self.valueFormat = null) or self.valueFormat.size() <= 80";

	/**
	 * Validates the maxLengthValueFormat constraint of '<em>RATIONALMEASURETYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRATIONALMEASURETYPE_maxLengthValueFormat(RATIONALMEASURETYPE rationalmeasuretype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.RATIONALMEASURETYPE,
				 rationalmeasuretype,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxLengthValueFormat",
				 RATIONALMEASURETYPE__MAX_LENGTH_VALUE_FORMAT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRATIONALTYPE(RATIONALTYPE rationaltype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(rationaltype, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(rationaltype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(rationaltype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(rationaltype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(rationaltype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(rationaltype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(rationaltype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(rationaltype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(rationaltype, diagnostics, context);
		if (result || diagnostics != null) result &= validateRATIONALTYPE_maxLengthValueFormat(rationaltype, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the maxLengthValueFormat constraint of '<em>RATIONALTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RATIONALTYPE__MAX_LENGTH_VALUE_FORMAT__EEXPRESSION = "(self.valueFormat = null) or self.valueFormat.size() <= 80";

	/**
	 * Validates the maxLengthValueFormat constraint of '<em>RATIONALTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRATIONALTYPE_maxLengthValueFormat(RATIONALTYPE rationaltype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.RATIONALTYPE,
				 rationaltype,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxLengthValueFormat",
				 RATIONALTYPE__MAX_LENGTH_VALUE_FORMAT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateREALCURRENCYTYPE(REALCURRENCYTYPE realcurrencytype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(realcurrencytype, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(realcurrencytype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(realcurrencytype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(realcurrencytype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(realcurrencytype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(realcurrencytype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(realcurrencytype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(realcurrencytype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(realcurrencytype, diagnostics, context);
		if (result || diagnostics != null) result &= validateREALCURRENCYTYPE_maxLengthValueFormat(realcurrencytype, diagnostics, context);
		if (result || diagnostics != null) result &= validateREALCURRENCYTYPE_maxLengthCurrency(realcurrencytype, diagnostics, context);
		if (result || diagnostics != null) result &= validateREALCURRENCYTYPE_patternCurrencyId(realcurrencytype, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the maxLengthValueFormat constraint of '<em>REALCURRENCYTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REALCURRENCYTYPE__MAX_LENGTH_VALUE_FORMAT__EEXPRESSION = "(self.valueFormat = null) or self.valueFormat.size() <= 80";

	/**
	 * Validates the maxLengthValueFormat constraint of '<em>REALCURRENCYTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateREALCURRENCYTYPE_maxLengthValueFormat(REALCURRENCYTYPE realcurrencytype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.REALCURRENCYTYPE,
				 realcurrencytype,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxLengthValueFormat",
				 REALCURRENCYTYPE__MAX_LENGTH_VALUE_FORMAT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the maxLengthCurrency constraint of '<em>REALCURRENCYTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REALCURRENCYTYPE__MAX_LENGTH_CURRENCY__EEXPRESSION = "(self.currency = null) or self.currency.size() <= 3";

	/**
	 * Validates the maxLengthCurrency constraint of '<em>REALCURRENCYTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateREALCURRENCYTYPE_maxLengthCurrency(REALCURRENCYTYPE realcurrencytype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.REALCURRENCYTYPE,
				 realcurrencytype,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxLengthCurrency",
				 REALCURRENCYTYPE__MAX_LENGTH_CURRENCY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the patternCurrencyId constraint of '<em>REALCURRENCYTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REALCURRENCYTYPE__PATTERN_CURRENCY_ID__EEXPRESSION = "(self.currencyId=null) or self.currencyId.matches('([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})(\\\\-([A-Z0-9:_\\\\.]{1,35})((\\\\-[019])(\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5}))?)?)?#08\\\\-([A-Z0-9:_\\\\.]{1,71})#[0-9]{1,9}') or self.currencyId.matches('([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#08\\\\-([A-Z0-9:_\\\\.]{1,71})#[0-9]{1,9}') or self.currencyId.matches('([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-\\\\-\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#08\\\\-([A-Z0-9:_\\\\.]{1,71})#[0-9]{1,9}')";

	/**
	 * Validates the patternCurrencyId constraint of '<em>REALCURRENCYTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateREALCURRENCYTYPE_patternCurrencyId(REALCURRENCYTYPE realcurrencytype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.REALCURRENCYTYPE,
				 realcurrencytype,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternCurrencyId",
				 REALCURRENCYTYPE__PATTERN_CURRENCY_ID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateREALMEASURETYPE(REALMEASURETYPE realmeasuretype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(realmeasuretype, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(realmeasuretype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(realmeasuretype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(realmeasuretype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(realmeasuretype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(realmeasuretype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(realmeasuretype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(realmeasuretype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(realmeasuretype, diagnostics, context);
		if (result || diagnostics != null) result &= validateREALMEASURETYPE_maxLengthValueFormat(realmeasuretype, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the maxLengthValueFormat constraint of '<em>REALMEASURETYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REALMEASURETYPE__MAX_LENGTH_VALUE_FORMAT__EEXPRESSION = "(self.valueFormat = null) or self.valueFormat.size() <= 80";

	/**
	 * Validates the maxLengthValueFormat constraint of '<em>REALMEASURETYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateREALMEASURETYPE_maxLengthValueFormat(REALMEASURETYPE realmeasuretype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.REALMEASURETYPE,
				 realmeasuretype,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxLengthValueFormat",
				 REALMEASURETYPE__MAX_LENGTH_VALUE_FORMAT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateREALTYPE(REALTYPE realtype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(realtype, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(realtype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(realtype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(realtype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(realtype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(realtype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(realtype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(realtype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(realtype, diagnostics, context);
		if (result || diagnostics != null) result &= validateREALTYPE_maxLengthValueFormat(realtype, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the maxLengthValueFormat constraint of '<em>REALTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REALTYPE__MAX_LENGTH_VALUE_FORMAT__EEXPRESSION = "(self.valueFormat = null) or self.valueFormat.size() <= 80";

	/**
	 * Validates the maxLengthValueFormat constraint of '<em>REALTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateREALTYPE_maxLengthValueFormat(REALTYPE realtype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.REALTYPE,
				 realtype,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxLengthValueFormat",
				 REALTYPE__MAX_LENGTH_VALUE_FORMAT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRECOMMENDEDPRESENTATION(RECOMMENDEDPRESENTATION recommendedpresentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(recommendedpresentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateREFERENCEDDOCUMENT(REFERENCEDDOCUMENT referenceddocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referenceddocument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateREFERENCEDGRAPHICS(REFERENCEDGRAPHICS referencedgraphics, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referencedgraphics, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateREMOTELOCATIONS(REMOTELOCATIONS remotelocations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(remotelocations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRemoteLocation(RemoteLocation remoteLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(remoteLocation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(remoteLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(remoteLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(remoteLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(remoteLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(remoteLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(remoteLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(remoteLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(remoteLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validateRemoteLocation_patternLanguage(remoteLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validateRemoteLocation_minLengthLanguage(remoteLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validateRemoteLocation_maxLengthLanguage(remoteLocation, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the patternLanguage constraint of '<em>Remote Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REMOTE_LOCATION__PATTERN_LANGUAGE__EEXPRESSION = "self.language.matches('[^\\\\-]*') or self.language.matches('[^\\\\s]*')";

	/**
	 * Validates the patternLanguage constraint of '<em>Remote Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRemoteLocation_patternLanguage(RemoteLocation remoteLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.REMOTE_LOCATION,
				 remoteLocation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternLanguage",
				 REMOTE_LOCATION__PATTERN_LANGUAGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the minLengthLanguage constraint of '<em>Remote Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REMOTE_LOCATION__MIN_LENGTH_LANGUAGE__EEXPRESSION = "self.language.size() >= 2";

	/**
	 * Validates the minLengthLanguage constraint of '<em>Remote Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRemoteLocation_minLengthLanguage(RemoteLocation remoteLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.REMOTE_LOCATION,
				 remoteLocation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "minLengthLanguage",
				 REMOTE_LOCATION__MIN_LENGTH_LANGUAGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the maxLengthLanguage constraint of '<em>Remote Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REMOTE_LOCATION__MAX_LENGTH_LANGUAGE__EEXPRESSION = "self.language.size() <= 3";

	/**
	 * Validates the maxLengthLanguage constraint of '<em>Remote Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRemoteLocation_maxLengthLanguage(RemoteLocation remoteLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.REMOTE_LOCATION,
				 remoteLocation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxLengthLanguage",
				 REMOTE_LOCATION__MAX_LENGTH_LANGUAGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateREPRESENTATIONPDET(REPRESENTATIONPDET representationpdet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(representationpdet, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(representationpdet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(representationpdet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(representationpdet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(representationpdet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(representationpdet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(representationpdet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(representationpdet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(representationpdet, diagnostics, context);
		if (result || diagnostics != null) result &= validatePROPERTY_maxLengthRevision(representationpdet, diagnostics, context);
		if (result || diagnostics != null) result &= validatePROPERTY_patternStatus(representationpdet, diagnostics, context);
		if (result || diagnostics != null) result &= validatePROPERTY_patternId(representationpdet, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateREPRESENTATIONREFERENCETYPE(REPRESENTATIONREFERENCETYPE representationreferencetype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(representationreferencetype, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(representationreferencetype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(representationreferencetype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(representationreferencetype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(representationreferencetype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(representationreferencetype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(representationreferencetype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(representationreferencetype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(representationreferencetype, diagnostics, context);
		if (result || diagnostics != null) result &= validateREPRESENTATIONREFERENCETYPE_patternClassRef(representationreferencetype, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the patternClassRef constraint of '<em>REPRESENTATIONREFERENCETYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REPRESENTATIONREFERENCETYPE__PATTERN_CLASS_REF__EEXPRESSION = "(self.classRef=null) or self.classRef.matches('0112\\\\-1\\\\-\\\\-\\\\-13584_32_1#01\\\\-REPRESENTATION_REFERENCE#1')";

	/**
	 * Validates the patternClassRef constraint of '<em>REPRESENTATIONREFERENCETYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateREPRESENTATIONREFERENCETYPE_patternClassRef(REPRESENTATIONREFERENCETYPE representationreferencetype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.REPRESENTATIONREFERENCETYPE,
				 representationreferencetype,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternClassRef",
				 REPRESENTATIONREFERENCETYPE__PATTERN_CLASS_REF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSETTYPE(SETTYPE settype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(settype, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSETWITHSUBSETCONSTRAINTTYPE(SETWITHSUBSETCONSTRAINTTYPE setwithsubsetconstrainttype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(setwithsubsetconstrainttype, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSHORTNAMELABEL(SHORTNAMELABEL shortnamelabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(shortnamelabel, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(shortnamelabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(shortnamelabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(shortnamelabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(shortnamelabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(shortnamelabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(shortnamelabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(shortnamelabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(shortnamelabel, diagnostics, context);
		if (result || diagnostics != null) result &= validateSHORTNAMELABEL_maxLengthValue(shortnamelabel, diagnostics, context);
		if (result || diagnostics != null) result &= validateSHORTNAMELABEL_patternCountryCode(shortnamelabel, diagnostics, context);
		if (result || diagnostics != null) result &= validateSHORTNAMELABEL_patternLanguageCode(shortnamelabel, diagnostics, context);
		if (result || diagnostics != null) result &= validateSHORTNAMELABEL_minLengthLanguageCode(shortnamelabel, diagnostics, context);
		if (result || diagnostics != null) result &= validateSHORTNAMELABEL_maxLengthLanguageCode(shortnamelabel, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the maxLengthValue constraint of '<em>SHORTNAMELABEL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SHORTNAMELABEL__MAX_LENGTH_VALUE__EEXPRESSION = "(self.value = null) or self.value.size() <= 30";

	/**
	 * Validates the maxLengthValue constraint of '<em>SHORTNAMELABEL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSHORTNAMELABEL_maxLengthValue(SHORTNAMELABEL shortnamelabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.SHORTNAMELABEL,
				 shortnamelabel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxLengthValue",
				 SHORTNAMELABEL__MAX_LENGTH_VALUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the patternCountryCode constraint of '<em>SHORTNAMELABEL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SHORTNAMELABEL__PATTERN_COUNTRY_CODE__EEXPRESSION = "(self.countryCode=null) or self.countryCode.matches('[^\\\\-]*') or self.countryCode.matches('[^\\\\s]*')";

	/**
	 * Validates the patternCountryCode constraint of '<em>SHORTNAMELABEL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSHORTNAMELABEL_patternCountryCode(SHORTNAMELABEL shortnamelabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.SHORTNAMELABEL,
				 shortnamelabel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternCountryCode",
				 SHORTNAMELABEL__PATTERN_COUNTRY_CODE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the patternLanguageCode constraint of '<em>SHORTNAMELABEL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SHORTNAMELABEL__PATTERN_LANGUAGE_CODE__EEXPRESSION = "(self.languageCode=null) or self.languageCode.matches('[^\\\\-]*') or self.languageCode.matches('[^\\\\s]*')";

	/**
	 * Validates the patternLanguageCode constraint of '<em>SHORTNAMELABEL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSHORTNAMELABEL_patternLanguageCode(SHORTNAMELABEL shortnamelabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.SHORTNAMELABEL,
				 shortnamelabel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternLanguageCode",
				 SHORTNAMELABEL__PATTERN_LANGUAGE_CODE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the minLengthLanguageCode constraint of '<em>SHORTNAMELABEL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SHORTNAMELABEL__MIN_LENGTH_LANGUAGE_CODE__EEXPRESSION = "(self.languageCode = null) or self.languageCode.size() >= 2";

	/**
	 * Validates the minLengthLanguageCode constraint of '<em>SHORTNAMELABEL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSHORTNAMELABEL_minLengthLanguageCode(SHORTNAMELABEL shortnamelabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.SHORTNAMELABEL,
				 shortnamelabel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "minLengthLanguageCode",
				 SHORTNAMELABEL__MIN_LENGTH_LANGUAGE_CODE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the maxLengthLanguageCode constraint of '<em>SHORTNAMELABEL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SHORTNAMELABEL__MAX_LENGTH_LANGUAGE_CODE__EEXPRESSION = "(self.languageCode = null) or self.languageCode.size() <= 3";

	/**
	 * Validates the maxLengthLanguageCode constraint of '<em>SHORTNAMELABEL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSHORTNAMELABEL_maxLengthLanguageCode(SHORTNAMELABEL shortnamelabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.SHORTNAMELABEL,
				 shortnamelabel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxLengthLanguageCode",
				 SHORTNAMELABEL__MAX_LENGTH_LANGUAGE_CODE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSHORTNAME(SHORTNAME shortname, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(shortname, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSIUNIT(SIUNIT siunit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(siunit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSOURCEDOCUMENT(SOURCEDOCUMENT sourcedocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sourcedocument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSTRINGDICVALUE(STRINGDICVALUE stringdicvalue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(stringdicvalue, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(stringdicvalue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stringdicvalue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stringdicvalue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(stringdicvalue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stringdicvalue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(stringdicvalue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(stringdicvalue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stringdicvalue, diagnostics, context);
		if (result || diagnostics != null) result &= validateDICVALUE_patternStatus(stringdicvalue, diagnostics, context);
		if (result || diagnostics != null) result &= validateDICVALUE_patternValueMeaningId(stringdicvalue, diagnostics, context);
		if (result || diagnostics != null) result &= validateSTRINGDICVALUE_patternValueCode(stringdicvalue, diagnostics, context);
		if (result || diagnostics != null) result &= validateSTRINGDICVALUE_maxLengthValueCode(stringdicvalue, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the patternValueCode constraint of '<em>STRINGDICVALUE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STRINGDICVALUE__PATTERN_VALUE_CODE__EEXPRESSION = "self.valueCode.matches('[^\\\\-]*') or self.valueCode.matches('[^\\\\s]*')";

	/**
	 * Validates the patternValueCode constraint of '<em>STRINGDICVALUE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSTRINGDICVALUE_patternValueCode(STRINGDICVALUE stringdicvalue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.STRINGDICVALUE,
				 stringdicvalue,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternValueCode",
				 STRINGDICVALUE__PATTERN_VALUE_CODE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the maxLengthValueCode constraint of '<em>STRINGDICVALUE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STRINGDICVALUE__MAX_LENGTH_VALUE_CODE__EEXPRESSION = "self.valueCode.size() <= 35";

	/**
	 * Validates the maxLengthValueCode constraint of '<em>STRINGDICVALUE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSTRINGDICVALUE_maxLengthValueCode(STRINGDICVALUE stringdicvalue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.STRINGDICVALUE,
				 stringdicvalue,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxLengthValueCode",
				 STRINGDICVALUE__MAX_LENGTH_VALUE_CODE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSTRINGPATTERNCONSTRAINT(STRINGPATTERNCONSTRAINT stringpatternconstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stringpatternconstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSTRINGSIZECONSTRAINT(STRINGSIZECONSTRAINT stringsizeconstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stringsizeconstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSTRINGS(STRINGS strings, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(strings, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSTRINGTYPE(STRINGTYPE stringtype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(stringtype, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(stringtype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stringtype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stringtype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(stringtype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stringtype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(stringtype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(stringtype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stringtype, diagnostics, context);
		if (result || diagnostics != null) result &= validateSTRINGTYPE_maxLengthValueFormat(stringtype, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the maxLengthValueFormat constraint of '<em>STRINGTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STRINGTYPE__MAX_LENGTH_VALUE_FORMAT__EEXPRESSION = "(self.valueFormat = null) or self.valueFormat.size() <= 80";

	/**
	 * Validates the maxLengthValueFormat constraint of '<em>STRINGTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSTRINGTYPE_maxLengthValueFormat(STRINGTYPE stringtype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.STRINGTYPE,
				 stringtype,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxLengthValueFormat",
				 STRINGTYPE__MAX_LENGTH_VALUE_FORMAT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSUBCLASSCONSTRAINT(SUBCLASSCONSTRAINT subclassconstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subclassconstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSUBSET(SUBSET subset, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subset, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSUPPLIERREFERENCE(SUPPLIERREFERENCE supplierreference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(supplierreference, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(supplierreference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(supplierreference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(supplierreference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(supplierreference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(supplierreference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(supplierreference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(supplierreference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(supplierreference, diagnostics, context);
		if (result || diagnostics != null) result &= validateSUPPLIERREFERENCE_patternSupplierRef(supplierreference, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the patternSupplierRef constraint of '<em>SUPPLIERREFERENCE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SUPPLIERREFERENCE__PATTERN_SUPPLIER_REF__EEXPRESSION = "self.supplierRef.matches('([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})(\\\\-([A-Z0-9:_\\\\.]{1,35})((\\\\-[019])(\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5}))?)?)?') or self.supplierRef.matches('([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})') or self.supplierRef.matches('([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-\\\\-\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})')";

	/**
	 * Validates the patternSupplierRef constraint of '<em>SUPPLIERREFERENCE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSUPPLIERREFERENCE_patternSupplierRef(SUPPLIERREFERENCE supplierreference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.SUPPLIERREFERENCE,
				 supplierreference,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternSupplierRef",
				 SUPPLIERREFERENCE__PATTERN_SUPPLIER_REF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSUPPLIERSREFERENCE(SUPPLIERSREFERENCE suppliersreference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(suppliersreference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSUPPLIER(SUPPLIER supplier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(supplier, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(supplier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(supplier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(supplier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(supplier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(supplier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(supplier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(supplier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(supplier, diagnostics, context);
		if (result || diagnostics != null) result &= validateSUPPLIER_maxLengthRevision(supplier, diagnostics, context);
		if (result || diagnostics != null) result &= validateSUPPLIER_patternStatus(supplier, diagnostics, context);
		if (result || diagnostics != null) result &= validateSUPPLIER_patternId(supplier, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the maxLengthRevision constraint of '<em>SUPPLIER</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SUPPLIER__MAX_LENGTH_REVISION__EEXPRESSION = "self.revision.size() <= 3";

	/**
	 * Validates the maxLengthRevision constraint of '<em>SUPPLIER</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSUPPLIER_maxLengthRevision(SUPPLIER supplier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.SUPPLIER,
				 supplier,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxLengthRevision",
				 SUPPLIER__MAX_LENGTH_REVISION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the patternStatus constraint of '<em>SUPPLIER</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SUPPLIER__PATTERN_STATUS__EEXPRESSION = "(self.status=null) or self.status.matches('[^\\\\-]*') or self.status.matches('[^\\\\s]*')";

	/**
	 * Validates the patternStatus constraint of '<em>SUPPLIER</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSUPPLIER_patternStatus(SUPPLIER supplier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.SUPPLIER,
				 supplier,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternStatus",
				 SUPPLIER__PATTERN_STATUS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the patternId constraint of '<em>SUPPLIER</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SUPPLIER__PATTERN_ID__EEXPRESSION = "self.id.matches('([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})(\\\\-([A-Z0-9:_\\\\.]{1,35})((\\\\-[019])(\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5}))?)?)?') or self.id.matches('([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})') or self.id.matches('([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-\\\\-\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})')";

	/**
	 * Validates the patternId constraint of '<em>SUPPLIER</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSUPPLIER_patternId(SUPPLIER supplier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.SUPPLIER,
				 supplier,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternId",
				 SUPPLIER__PATTERN_ID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSUPPORTEDVEP(SUPPORTEDVEP supportedvep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(supportedvep, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSYNONYMOUSNAMELABEL(SYNONYMOUSNAMELABEL synonymousnamelabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(synonymousnamelabel, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(synonymousnamelabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(synonymousnamelabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(synonymousnamelabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(synonymousnamelabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(synonymousnamelabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(synonymousnamelabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(synonymousnamelabel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(synonymousnamelabel, diagnostics, context);
		if (result || diagnostics != null) result &= validateSYNONYMOUSNAMELABEL_maxLengthValue(synonymousnamelabel, diagnostics, context);
		if (result || diagnostics != null) result &= validateSYNONYMOUSNAMELABEL_patternCountryCode(synonymousnamelabel, diagnostics, context);
		if (result || diagnostics != null) result &= validateSYNONYMOUSNAMELABEL_patternLanguageCode(synonymousnamelabel, diagnostics, context);
		if (result || diagnostics != null) result &= validateSYNONYMOUSNAMELABEL_minLengthLanguageCode(synonymousnamelabel, diagnostics, context);
		if (result || diagnostics != null) result &= validateSYNONYMOUSNAMELABEL_maxLengthLanguageCode(synonymousnamelabel, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the maxLengthValue constraint of '<em>SYNONYMOUSNAMELABEL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SYNONYMOUSNAMELABEL__MAX_LENGTH_VALUE__EEXPRESSION = "(self.value = null) or self.value.size() <= 255";

	/**
	 * Validates the maxLengthValue constraint of '<em>SYNONYMOUSNAMELABEL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSYNONYMOUSNAMELABEL_maxLengthValue(SYNONYMOUSNAMELABEL synonymousnamelabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.SYNONYMOUSNAMELABEL,
				 synonymousnamelabel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxLengthValue",
				 SYNONYMOUSNAMELABEL__MAX_LENGTH_VALUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the patternCountryCode constraint of '<em>SYNONYMOUSNAMELABEL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SYNONYMOUSNAMELABEL__PATTERN_COUNTRY_CODE__EEXPRESSION = "(self.countryCode=null) or self.countryCode.matches('[^\\\\-]*') or self.countryCode.matches('[^\\\\s]*')";

	/**
	 * Validates the patternCountryCode constraint of '<em>SYNONYMOUSNAMELABEL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSYNONYMOUSNAMELABEL_patternCountryCode(SYNONYMOUSNAMELABEL synonymousnamelabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.SYNONYMOUSNAMELABEL,
				 synonymousnamelabel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternCountryCode",
				 SYNONYMOUSNAMELABEL__PATTERN_COUNTRY_CODE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the patternLanguageCode constraint of '<em>SYNONYMOUSNAMELABEL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SYNONYMOUSNAMELABEL__PATTERN_LANGUAGE_CODE__EEXPRESSION = "(self.languageCode=null) or self.languageCode.matches('[^\\\\-]*') or self.languageCode.matches('[^\\\\s]*')";

	/**
	 * Validates the patternLanguageCode constraint of '<em>SYNONYMOUSNAMELABEL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSYNONYMOUSNAMELABEL_patternLanguageCode(SYNONYMOUSNAMELABEL synonymousnamelabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.SYNONYMOUSNAMELABEL,
				 synonymousnamelabel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternLanguageCode",
				 SYNONYMOUSNAMELABEL__PATTERN_LANGUAGE_CODE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the minLengthLanguageCode constraint of '<em>SYNONYMOUSNAMELABEL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SYNONYMOUSNAMELABEL__MIN_LENGTH_LANGUAGE_CODE__EEXPRESSION = "(self.languageCode = null) or self.languageCode.size() >= 2";

	/**
	 * Validates the minLengthLanguageCode constraint of '<em>SYNONYMOUSNAMELABEL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSYNONYMOUSNAMELABEL_minLengthLanguageCode(SYNONYMOUSNAMELABEL synonymousnamelabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.SYNONYMOUSNAMELABEL,
				 synonymousnamelabel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "minLengthLanguageCode",
				 SYNONYMOUSNAMELABEL__MIN_LENGTH_LANGUAGE_CODE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the maxLengthLanguageCode constraint of '<em>SYNONYMOUSNAMELABEL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SYNONYMOUSNAMELABEL__MAX_LENGTH_LANGUAGE_CODE__EEXPRESSION = "(self.languageCode = null) or self.languageCode.size() <= 3";

	/**
	 * Validates the maxLengthLanguageCode constraint of '<em>SYNONYMOUSNAMELABEL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSYNONYMOUSNAMELABEL_maxLengthLanguageCode(SYNONYMOUSNAMELABEL synonymousnamelabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.SYNONYMOUSNAMELABEL,
				 synonymousnamelabel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxLengthLanguageCode",
				 SYNONYMOUSNAMELABEL__MAX_LENGTH_LANGUAGE_CODE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSYNONYMOUSNAME(SYNONYMOUSNAME synonymousname, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(synonymousname, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSYNONYMOUSSYMBOLS(SYNONYMOUSSYMBOLS synonymoussymbols, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(synonymoussymbols, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTEXT(TEXT text, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(text, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTIMEDATATYPE(TIMEDATATYPE timedatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(timedatatype, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(timedatatype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(timedatatype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(timedatatype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(timedatatype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(timedatatype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(timedatatype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(timedatatype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(timedatatype, diagnostics, context);
		if (result || diagnostics != null) result &= validateTIMEDATATYPE_maxLengthValueFormat(timedatatype, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the maxLengthValueFormat constraint of '<em>TIMEDATATYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TIMEDATATYPE__MAX_LENGTH_VALUE_FORMAT__EEXPRESSION = "(self.valueFormat = null) or self.valueFormat.size() <= 80";

	/**
	 * Validates the maxLengthValueFormat constraint of '<em>TIMEDATATYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTIMEDATATYPE_maxLengthValueFormat(TIMEDATATYPE timedatatype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.TIMEDATATYPE,
				 timedatatype,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxLengthValueFormat",
				 TIMEDATATYPE__MAX_LENGTH_VALUE_FORMAT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTRANSLATABLESTRINGTYPE(TRANSLATABLESTRINGTYPE translatablestringtype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(translatablestringtype, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(translatablestringtype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(translatablestringtype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(translatablestringtype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(translatablestringtype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(translatablestringtype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(translatablestringtype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(translatablestringtype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(translatablestringtype, diagnostics, context);
		if (result || diagnostics != null) result &= validateTRANSLATABLESTRINGTYPE_maxLengthValueFormat(translatablestringtype, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the maxLengthValueFormat constraint of '<em>TRANSLATABLESTRINGTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TRANSLATABLESTRINGTYPE__MAX_LENGTH_VALUE_FORMAT__EEXPRESSION = "(self.valueFormat = null) or self.valueFormat.size() <= 80";

	/**
	 * Validates the maxLengthValueFormat constraint of '<em>TRANSLATABLESTRINGTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTRANSLATABLESTRINGTYPE_maxLengthValueFormat(TRANSLATABLESTRINGTYPE translatablestringtype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.TRANSLATABLESTRINGTYPE,
				 translatablestringtype,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxLengthValueFormat",
				 TRANSLATABLESTRINGTYPE__MAX_LENGTH_VALUE_FORMAT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTRANSLATIONDATA(TRANSLATIONDATA translationdata, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(translationdata, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(translationdata, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(translationdata, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(translationdata, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(translationdata, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(translationdata, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(translationdata, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(translationdata, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(translationdata, diagnostics, context);
		if (result || diagnostics != null) result &= validateTRANSLATIONDATA_maxLengthTranslationRevision(translationdata, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the maxLengthTranslationRevision constraint of '<em>TRANSLATIONDATA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TRANSLATIONDATA__MAX_LENGTH_TRANSLATION_REVISION__EEXPRESSION = "self.translationRevision.size() <= 3";

	/**
	 * Validates the maxLengthTranslationRevision constraint of '<em>TRANSLATIONDATA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTRANSLATIONDATA_maxLengthTranslationRevision(TRANSLATIONDATA translationdata, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.TRANSLATIONDATA,
				 translationdata,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxLengthTranslationRevision",
				 TRANSLATIONDATA__MAX_LENGTH_TRANSLATION_REVISION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTRANSLATION(TRANSLATION translation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(translation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUNIT(UNIT unit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateURITYPE(URITYPE uritype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(uritype, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(uritype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(uritype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(uritype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(uritype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(uritype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(uritype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(uritype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(uritype, diagnostics, context);
		if (result || diagnostics != null) result &= validateURITYPE_maxLengthValueFormat(uritype, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the maxLengthValueFormat constraint of '<em>URITYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String URITYPE__MAX_LENGTH_VALUE_FORMAT__EEXPRESSION = "(self.valueFormat = null) or self.valueFormat.size() <= 80";

	/**
	 * Validates the maxLengthValueFormat constraint of '<em>URITYPE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateURITYPE_maxLengthValueFormat(URITYPE uritype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.URITYPE,
				 uritype,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxLengthValueFormat",
				 URITYPE__MAX_LENGTH_VALUE_FORMAT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVCVRANGE(VCVRANGE vcvrange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vcvrange, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVIEWCONTROLVARIABLERANGE(VIEWCONTROLVARIABLERANGE viewcontrolvariablerange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(viewcontrolvariablerange, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVIEWEXCHANGEPROTOCOLIDENTIFICATION(VIEWEXCHANGEPROTOCOLIDENTIFICATION viewexchangeprotocolidentification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(viewexchangeprotocolidentification, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateILLUSTRATIONTYPEType(ILLUSTRATIONTYPEType illustrationtypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSIPREFIXType(SIPREFIXType siprefixType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSIUNITNAMEType(SIUNITNAMEType siunitnameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSTANDARDSIZEType(STANDARDSIZEType standardsizeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedValidator
