/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedFactoryImpl extends EFactoryImpl implements Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedFactory init() {
		try {
			Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedFactory theIsostdisois_13584_32ed_1techxmlschemaontomlSimplifiedFactory = (Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedFactory)EPackage.Registry.INSTANCE.getEFactory(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.eNS_URI);
			if (theIsostdisois_13584_32ed_1techxmlschemaontomlSimplifiedFactory != null) {
				return theIsostdisois_13584_32ed_1techxmlschemaontomlSimplifiedFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ALTERNATIVEUNITS: return createALTERNATIVEUNITS();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ANYTYPE: return createANYTYPE();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.APOSTERIORICASEOF: return createAPOSTERIORICASEOF();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.APOSTERIORISEMANTICRELATIONSHIPS: return createAPOSTERIORISEMANTICRELATIONSHIPS();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.APOSTERIORISEMANTICRELATIONSHIP: return createAPOSTERIORISEMANTICRELATIONSHIP();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.APOSTERIORIVIEWOF: return createAPOSTERIORIVIEWOF();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ARRAYTYPE: return createARRAYTYPE();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ASSIGNEDVALUE: return createASSIGNEDVALUE();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.AUTHORS: return createAUTHORS();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.AXIS1PLACEMENTTYPE: return createAXIS1PLACEMENTTYPE();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.AXIS2PLACEMENT2DTYPE: return createAXIS2PLACEMENT2DTYPE();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.AXIS2PLACEMENT3DTYPE: return createAXIS2PLACEMENT3DTYPE();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.BAGTYPE: return createBAGTYPE();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.BOOLEANTYPE: return createBOOLEANTYPE();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CARDINALITYCONSTRAINT: return createCARDINALITYCONSTRAINT();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CATEGORIZATIONCLASS: return createCATEGORIZATIONCLASS();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSCONSTANTVALUES: return createCLASSCONSTANTVALUES();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSCONSTRAINT: return createCLASSCONSTRAINT();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSESREFERENCE: return createCLASSESREFERENCE();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION: return createCLASSEXTENSION();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSIFICATION: return createCLASSIFICATION();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSPRESENTATIONONPAPER: return createCLASSPRESENTATIONONPAPER();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSPRESENTATIONONSCREEN: return createCLASSPRESENTATIONONSCREEN();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSREFERENCE: return createCLASSREFERENCE();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSREFERENCETYPE: return createCLASSREFERENCETYPE();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS: return createCLASS();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSVALUEASSIGNMENT: return createCLASSVALUEASSIGNMENT();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONDITIONDET: return createCONDITIONDET();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONFIGURATIONCONTROLCONSTRAINT: return createCONFIGURATIONCONTROLCONSTRAINT();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONSTRAINTORCONSTRAINTID: return createCONSTRAINTORCONSTRAINTID();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONSTRAINTS: return createCONSTRAINTS();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONSTRAINT: return createCONSTRAINT();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONTAINEDCLASSES: return createCONTAINEDCLASSES();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONTAINEDCLASSEXTENSIONS: return createCONTAINEDCLASSEXTENSIONS();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONTAINEDDATATYPES: return createCONTAINEDDATATYPES();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONTAINEDDOCUMENTS: return createCONTAINEDDOCUMENTS();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONTAINEDPROPERTIES: return createCONTAINEDPROPERTIES();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONTAINEDSUPPLIERS: return createCONTAINEDSUPPLIERS();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONTEXTDEPENDENTUNIT: return createCONTEXTDEPENDENTUNIT();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONTEXTPARAMETERCONSTRAINTS: return createCONTEXTPARAMETERCONSTRAINTS();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONTEXTPARAMICON: return createCONTEXTPARAMICON();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONTEXTRESTRICTIONCONSTRAINT: return createCONTEXTRESTRICTIONCONSTRAINT();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONVERSIONBASEDUNIT: return createCONVERSIONBASEDUNIT();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CORRESPONDINGPROPERTIES: return createCORRESPONDINGPROPERTIES();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CREATEICON: return createCREATEICON();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DATATYPEREFERENCE: return createDATATYPEREFERENCE();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DATATYPESREFERENCE: return createDATATYPESREFERENCE();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DATATYPE: return createDATATYPE();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DATEDATATYPE: return createDATEDATATYPE();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DATETIMEDATATYPE: return createDATETIMEDATATYPE();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DEPENDENTPDET: return createDEPENDENTPDET();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DERIVEDUNITELEMENT: return createDERIVEDUNITELEMENT();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DERIVEDUNIT: return createDERIVEDUNIT();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARIESREFERENCE: return createDICTIONARIESREFERENCE();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARYINSTANDARDFORMAT: return createDICTIONARYINSTANDARDFORMAT();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARYREFERENCE: return createDICTIONARYREFERENCE();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY: return createDICTIONARY();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICUNITREFERENCE: return createDICUNITREFERENCE();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICUNITSREFERENCE: return createDICUNITSREFERENCE();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICUNIT: return createDICUNIT();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICVALUE: return createDICVALUE();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DIMENSIONALEXPONENTS: return createDIMENSIONALEXPONENTS();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DOCUMENTCONTENT: return createDOCUMENTCONTENT();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DOCUMENTIDENTIFIERNAMELABEL: return createDOCUMENTIDENTIFIERNAMELABEL();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DOCUMENTIDENTIFIER: return createDOCUMENTIDENTIFIER();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DOCUMENTREFERENCE: return createDOCUMENTREFERENCE();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DOCUMENTSREFERENCE: return createDOCUMENTSREFERENCE();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DOCUMENT: return createDOCUMENT();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DOMAINCONSTRAINTS: return createDOMAINCONSTRAINTS();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DOMAINCONSTRAINT: return createDOMAINCONSTRAINT();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ENUMERATIONCONSTRAINT: return createENUMERATIONCONSTRAINT();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION: return createEXPLICITFUNCTIONALMODELCLASSEXTENSION();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITITEMCLASSEXTENSION: return createEXPLICITITEMCLASSEXTENSION();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXTERNALFILES: return createEXTERNALFILES();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXTERNALGRAPHICS: return createEXTERNALGRAPHICS();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXTERNALRESOURCE: return createEXTERNALRESOURCE();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FILTER: return createFILTER();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF: return createFMCLASSVIEWOF();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FUNCTIONALMODELCLASS: return createFUNCTIONALMODELCLASS();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.GENERALTEXT: return createGENERALTEXT();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.GEOMETRICCONTEXT: return createGEOMETRICCONTEXT();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.GEOMETRICUNITCONTEXT: return createGEOMETRICUNITCONTEXT();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.GRAPHICS: return createGRAPHICS();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER: return createHEADER();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HTTPFILE: return createHTTPFILE();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.IDENTIFIEDDOCUMENT: return createIDENTIFIEDDOCUMENT();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ILLUSTRATION: return createILLUSTRATION();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.INFORMATION: return createINFORMATION();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.INTCURRENCYTYPE: return createINTCURRENCYTYPE();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.INTDICVALUE: return createINTDICVALUE();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.INTEGRITYCONSTRAINT: return createINTEGRITYCONSTRAINT();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.INTMEASURETYPE: return createINTMEASURETYPE();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.INTTYPE: return createINTTYPE();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF: return createITEMCLASSCASEOF();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASS: return createITEMCLASS();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITSVALUES: return createITSVALUES();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.KEYWORDLABEL: return createKEYWORDLABEL();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.KEYWORD: return createKEYWORD();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.LANGUAGE: return createLANGUAGE();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.LEVEL: return createLEVEL();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.LEVELTYPE: return createLEVELTYPE();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.LIBRARYIIMIDENTIFICATION: return createLIBRARYIIMIDENTIFICATION();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.LIBRARYINSTANDARDFORMAT: return createLIBRARYINSTANDARDFORMAT();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.LIBRARY: return createLIBRARY();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.LISTTYPE: return createLISTTYPE();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.MAPPINGFUNCTION: return createMAPPINGFUNCTION();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.MATHEMATICALSTRING: return createMATHEMATICALSTRING();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.MESSAGE: return createMESSAGE();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NAMEDTYPE: return createNAMEDTYPE();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NAMEDUNIT: return createNAMEDUNIT();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONDEPENDENTPDET: return createNONDEPENDENTPDET();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONINSTANTIABLEFUNCTIONALVIEWCLASS: return createNONINSTANTIABLEFUNCTIONALVIEWCLASS();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONQUANTITATIVECODETYPE: return createNONQUANTITATIVECODETYPE();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONQUANTITATIVEINTTYPE: return createNONQUANTITATIVEINTTYPE();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONSIUNIT: return createNONSIUNIT();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONTRANSLATABLESTRINGTYPE: return createNONTRANSLATABLESTRINGTYPE();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NUMBERTYPE: return createNUMBERTYPE();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ONTOML: return createONTOML();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ORGANIZATION: return createORGANIZATION();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PERSON: return createPERSON();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PLACEMENTTYPE: return createPLACEMENTTYPE();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.POSTCONDITION: return createPOSTCONDITION();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PRECONDITION: return createPRECONDITION();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PREFERREDNAMELABEL: return createPREFERREDNAMELABEL();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PREFERREDNAME: return createPREFERREDNAME();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROGRAMREFERENCETYPE: return createPROGRAMREFERENCETYPE();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROPERTIESREFERENCE: return createPROPERTIESREFERENCE();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROPERTYCLASSIFICATION: return createPROPERTYCLASSIFICATION();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROPERTYCONSTRAINT: return createPROPERTYCONSTRAINT();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROPERTYMAPPING: return createPROPERTYMAPPING();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROPERTYREFERENCE: return createPROPERTYREFERENCE();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROPERTY: return createPROPERTY();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROPERTYVALUERECOMMENDEDPRESENTATION: return createPROPERTYVALUERECOMMENDEDPRESENTATION();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.RANGECONSTRAINT: return createRANGECONSTRAINT();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.RATIONALMEASURETYPE: return createRATIONALMEASURETYPE();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.RATIONALTYPE: return createRATIONALTYPE();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REALCURRENCYTYPE: return createREALCURRENCYTYPE();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REALMEASURETYPE: return createREALMEASURETYPE();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REALTYPE: return createREALTYPE();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.RECOMMENDEDPRESENTATION: return createRECOMMENDEDPRESENTATION();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REFERENCEDDOCUMENT: return createREFERENCEDDOCUMENT();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REFERENCEDGRAPHICS: return createREFERENCEDGRAPHICS();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REMOTELOCATIONS: return createREMOTELOCATIONS();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REMOTE_LOCATION: return createRemoteLocation();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REPRESENTATIONPDET: return createREPRESENTATIONPDET();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REPRESENTATIONREFERENCETYPE: return createREPRESENTATIONREFERENCETYPE();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SETTYPE: return createSETTYPE();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SETWITHSUBSETCONSTRAINTTYPE: return createSETWITHSUBSETCONSTRAINTTYPE();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SHORTNAMELABEL: return createSHORTNAMELABEL();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SHORTNAME: return createSHORTNAME();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SIUNIT: return createSIUNIT();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SOURCEDOCUMENT: return createSOURCEDOCUMENT();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.STRINGDICVALUE: return createSTRINGDICVALUE();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.STRINGPATTERNCONSTRAINT: return createSTRINGPATTERNCONSTRAINT();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.STRINGSIZECONSTRAINT: return createSTRINGSIZECONSTRAINT();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.STRINGS: return createSTRINGS();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.STRINGTYPE: return createSTRINGTYPE();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SUBCLASSCONSTRAINT: return createSUBCLASSCONSTRAINT();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SUBSET: return createSUBSET();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SUPPLIERREFERENCE: return createSUPPLIERREFERENCE();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SUPPLIERSREFERENCE: return createSUPPLIERSREFERENCE();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SUPPLIER: return createSUPPLIER();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SUPPORTEDVEP: return createSUPPORTEDVEP();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SYNONYMOUSNAMELABEL: return createSYNONYMOUSNAMELABEL();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SYNONYMOUSNAME: return createSYNONYMOUSNAME();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SYNONYMOUSSYMBOLS: return createSYNONYMOUSSYMBOLS();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.TEXT: return createTEXT();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.TIMEDATATYPE: return createTIMEDATATYPE();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.TRANSLATABLESTRINGTYPE: return createTRANSLATABLESTRINGTYPE();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.TRANSLATIONDATA: return createTRANSLATIONDATA();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.TRANSLATION: return createTRANSLATION();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.UNIT: return createUNIT();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.URITYPE: return createURITYPE();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.VCVRANGE: return createVCVRANGE();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.VIEWCONTROLVARIABLERANGE: return createVIEWCONTROLVARIABLERANGE();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.VIEWEXCHANGEPROTOCOLIDENTIFICATION: return createVIEWEXCHANGEPROTOCOLIDENTIFICATION();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ILLUSTRATIONTYPE_TYPE:
				return createILLUSTRATIONTYPETypeFromString(eDataType, initialValue);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SIPREFIX_TYPE:
				return createSIPREFIXTypeFromString(eDataType, initialValue);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SIUNITNAME_TYPE:
				return createSIUNITNAMETypeFromString(eDataType, initialValue);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.STANDARDSIZE_TYPE:
				return createSTANDARDSIZETypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ILLUSTRATIONTYPE_TYPE:
				return convertILLUSTRATIONTYPETypeToString(eDataType, instanceValue);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SIPREFIX_TYPE:
				return convertSIPREFIXTypeToString(eDataType, instanceValue);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SIUNITNAME_TYPE:
				return convertSIUNITNAMETypeToString(eDataType, instanceValue);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.STANDARDSIZE_TYPE:
				return convertSTANDARDSIZETypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ALTERNATIVEUNITS createALTERNATIVEUNITS() {
		ALTERNATIVEUNITSImpl alternativeunits = new ALTERNATIVEUNITSImpl();
		return alternativeunits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ANYTYPE createANYTYPE() {
		ANYTYPEImpl anytype = new ANYTYPEImpl();
		return anytype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APOSTERIORICASEOF createAPOSTERIORICASEOF() {
		APOSTERIORICASEOFImpl aposterioricaseof = new APOSTERIORICASEOFImpl();
		return aposterioricaseof;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APOSTERIORISEMANTICRELATIONSHIPS createAPOSTERIORISEMANTICRELATIONSHIPS() {
		APOSTERIORISEMANTICRELATIONSHIPSImpl aposteriorisemanticrelationships = new APOSTERIORISEMANTICRELATIONSHIPSImpl();
		return aposteriorisemanticrelationships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APOSTERIORISEMANTICRELATIONSHIP createAPOSTERIORISEMANTICRELATIONSHIP() {
		APOSTERIORISEMANTICRELATIONSHIPImpl aposteriorisemanticrelationship = new APOSTERIORISEMANTICRELATIONSHIPImpl();
		return aposteriorisemanticrelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APOSTERIORIVIEWOF createAPOSTERIORIVIEWOF() {
		APOSTERIORIVIEWOFImpl aposterioriviewof = new APOSTERIORIVIEWOFImpl();
		return aposterioriviewof;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARRAYTYPE createARRAYTYPE() {
		ARRAYTYPEImpl arraytype = new ARRAYTYPEImpl();
		return arraytype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASSIGNEDVALUE createASSIGNEDVALUE() {
		ASSIGNEDVALUEImpl assignedvalue = new ASSIGNEDVALUEImpl();
		return assignedvalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AUTHORS createAUTHORS() {
		AUTHORSImpl authors = new AUTHORSImpl();
		return authors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AXIS1PLACEMENTTYPE createAXIS1PLACEMENTTYPE() {
		AXIS1PLACEMENTTYPEImpl axis1PLACEMENTTYPE = new AXIS1PLACEMENTTYPEImpl();
		return axis1PLACEMENTTYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AXIS2PLACEMENT2DTYPE createAXIS2PLACEMENT2DTYPE() {
		AXIS2PLACEMENT2DTYPEImpl axis2PLACEMENT2DTYPE = new AXIS2PLACEMENT2DTYPEImpl();
		return axis2PLACEMENT2DTYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AXIS2PLACEMENT3DTYPE createAXIS2PLACEMENT3DTYPE() {
		AXIS2PLACEMENT3DTYPEImpl axis2PLACEMENT3DTYPE = new AXIS2PLACEMENT3DTYPEImpl();
		return axis2PLACEMENT3DTYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BAGTYPE createBAGTYPE() {
		BAGTYPEImpl bagtype = new BAGTYPEImpl();
		return bagtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BOOLEANTYPE createBOOLEANTYPE() {
		BOOLEANTYPEImpl booleantype = new BOOLEANTYPEImpl();
		return booleantype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CARDINALITYCONSTRAINT createCARDINALITYCONSTRAINT() {
		CARDINALITYCONSTRAINTImpl cardinalityconstraint = new CARDINALITYCONSTRAINTImpl();
		return cardinalityconstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CATEGORIZATIONCLASS createCATEGORIZATIONCLASS() {
		CATEGORIZATIONCLASSImpl categorizationclass = new CATEGORIZATIONCLASSImpl();
		return categorizationclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLASSCONSTANTVALUES createCLASSCONSTANTVALUES() {
		CLASSCONSTANTVALUESImpl classconstantvalues = new CLASSCONSTANTVALUESImpl();
		return classconstantvalues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLASSCONSTRAINT createCLASSCONSTRAINT() {
		CLASSCONSTRAINTImpl classconstraint = new CLASSCONSTRAINTImpl();
		return classconstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLASSESREFERENCE createCLASSESREFERENCE() {
		CLASSESREFERENCEImpl classesreference = new CLASSESREFERENCEImpl();
		return classesreference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLASSEXTENSION createCLASSEXTENSION() {
		CLASSEXTENSIONImpl classextension = new CLASSEXTENSIONImpl();
		return classextension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLASSIFICATION createCLASSIFICATION() {
		CLASSIFICATIONImpl classification = new CLASSIFICATIONImpl();
		return classification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLASSPRESENTATIONONPAPER createCLASSPRESENTATIONONPAPER() {
		CLASSPRESENTATIONONPAPERImpl classpresentationonpaper = new CLASSPRESENTATIONONPAPERImpl();
		return classpresentationonpaper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLASSPRESENTATIONONSCREEN createCLASSPRESENTATIONONSCREEN() {
		CLASSPRESENTATIONONSCREENImpl classpresentationonscreen = new CLASSPRESENTATIONONSCREENImpl();
		return classpresentationonscreen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLASSREFERENCE createCLASSREFERENCE() {
		CLASSREFERENCEImpl classreference = new CLASSREFERENCEImpl();
		return classreference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLASSREFERENCETYPE createCLASSREFERENCETYPE() {
		CLASSREFERENCETYPEImpl classreferencetype = new CLASSREFERENCETYPEImpl();
		return classreferencetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLASS createCLASS() {
		CLASSImpl class_ = new CLASSImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLASSVALUEASSIGNMENT createCLASSVALUEASSIGNMENT() {
		CLASSVALUEASSIGNMENTImpl classvalueassignment = new CLASSVALUEASSIGNMENTImpl();
		return classvalueassignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONDITIONDET createCONDITIONDET() {
		CONDITIONDETImpl conditiondet = new CONDITIONDETImpl();
		return conditiondet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONFIGURATIONCONTROLCONSTRAINT createCONFIGURATIONCONTROLCONSTRAINT() {
		CONFIGURATIONCONTROLCONSTRAINTImpl configurationcontrolconstraint = new CONFIGURATIONCONTROLCONSTRAINTImpl();
		return configurationcontrolconstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONSTRAINTORCONSTRAINTID createCONSTRAINTORCONSTRAINTID() {
		CONSTRAINTORCONSTRAINTIDImpl constraintorconstraintid = new CONSTRAINTORCONSTRAINTIDImpl();
		return constraintorconstraintid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONSTRAINTS createCONSTRAINTS() {
		CONSTRAINTSImpl constraints = new CONSTRAINTSImpl();
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONSTRAINT createCONSTRAINT() {
		CONSTRAINTImpl constraint = new CONSTRAINTImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONTAINEDCLASSES createCONTAINEDCLASSES() {
		CONTAINEDCLASSESImpl containedclasses = new CONTAINEDCLASSESImpl();
		return containedclasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONTAINEDCLASSEXTENSIONS createCONTAINEDCLASSEXTENSIONS() {
		CONTAINEDCLASSEXTENSIONSImpl containedclassextensions = new CONTAINEDCLASSEXTENSIONSImpl();
		return containedclassextensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONTAINEDDATATYPES createCONTAINEDDATATYPES() {
		CONTAINEDDATATYPESImpl containeddatatypes = new CONTAINEDDATATYPESImpl();
		return containeddatatypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONTAINEDDOCUMENTS createCONTAINEDDOCUMENTS() {
		CONTAINEDDOCUMENTSImpl containeddocuments = new CONTAINEDDOCUMENTSImpl();
		return containeddocuments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONTAINEDPROPERTIES createCONTAINEDPROPERTIES() {
		CONTAINEDPROPERTIESImpl containedproperties = new CONTAINEDPROPERTIESImpl();
		return containedproperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONTAINEDSUPPLIERS createCONTAINEDSUPPLIERS() {
		CONTAINEDSUPPLIERSImpl containedsuppliers = new CONTAINEDSUPPLIERSImpl();
		return containedsuppliers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONTEXTDEPENDENTUNIT createCONTEXTDEPENDENTUNIT() {
		CONTEXTDEPENDENTUNITImpl contextdependentunit = new CONTEXTDEPENDENTUNITImpl();
		return contextdependentunit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONTEXTPARAMETERCONSTRAINTS createCONTEXTPARAMETERCONSTRAINTS() {
		CONTEXTPARAMETERCONSTRAINTSImpl contextparameterconstraints = new CONTEXTPARAMETERCONSTRAINTSImpl();
		return contextparameterconstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONTEXTPARAMICON createCONTEXTPARAMICON() {
		CONTEXTPARAMICONImpl contextparamicon = new CONTEXTPARAMICONImpl();
		return contextparamicon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONTEXTRESTRICTIONCONSTRAINT createCONTEXTRESTRICTIONCONSTRAINT() {
		CONTEXTRESTRICTIONCONSTRAINTImpl contextrestrictionconstraint = new CONTEXTRESTRICTIONCONSTRAINTImpl();
		return contextrestrictionconstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONVERSIONBASEDUNIT createCONVERSIONBASEDUNIT() {
		CONVERSIONBASEDUNITImpl conversionbasedunit = new CONVERSIONBASEDUNITImpl();
		return conversionbasedunit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CORRESPONDINGPROPERTIES createCORRESPONDINGPROPERTIES() {
		CORRESPONDINGPROPERTIESImpl correspondingproperties = new CORRESPONDINGPROPERTIESImpl();
		return correspondingproperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CREATEICON createCREATEICON() {
		CREATEICONImpl createicon = new CREATEICONImpl();
		return createicon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DATATYPEREFERENCE createDATATYPEREFERENCE() {
		DATATYPEREFERENCEImpl datatypereference = new DATATYPEREFERENCEImpl();
		return datatypereference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DATATYPESREFERENCE createDATATYPESREFERENCE() {
		DATATYPESREFERENCEImpl datatypesreference = new DATATYPESREFERENCEImpl();
		return datatypesreference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DATATYPE createDATATYPE() {
		DATATYPEImpl datatype = new DATATYPEImpl();
		return datatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DATEDATATYPE createDATEDATATYPE() {
		DATEDATATYPEImpl datedatatype = new DATEDATATYPEImpl();
		return datedatatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DATETIMEDATATYPE createDATETIMEDATATYPE() {
		DATETIMEDATATYPEImpl datetimedatatype = new DATETIMEDATATYPEImpl();
		return datetimedatatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEPENDENTPDET createDEPENDENTPDET() {
		DEPENDENTPDETImpl dependentpdet = new DEPENDENTPDETImpl();
		return dependentpdet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DERIVEDUNITELEMENT createDERIVEDUNITELEMENT() {
		DERIVEDUNITELEMENTImpl derivedunitelement = new DERIVEDUNITELEMENTImpl();
		return derivedunitelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DERIVEDUNIT createDERIVEDUNIT() {
		DERIVEDUNITImpl derivedunit = new DERIVEDUNITImpl();
		return derivedunit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DICTIONARIESREFERENCE createDICTIONARIESREFERENCE() {
		DICTIONARIESREFERENCEImpl dictionariesreference = new DICTIONARIESREFERENCEImpl();
		return dictionariesreference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DICTIONARYINSTANDARDFORMAT createDICTIONARYINSTANDARDFORMAT() {
		DICTIONARYINSTANDARDFORMATImpl dictionaryinstandardformat = new DICTIONARYINSTANDARDFORMATImpl();
		return dictionaryinstandardformat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DICTIONARYREFERENCE createDICTIONARYREFERENCE() {
		DICTIONARYREFERENCEImpl dictionaryreference = new DICTIONARYREFERENCEImpl();
		return dictionaryreference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DICTIONARY createDICTIONARY() {
		DICTIONARYImpl dictionary = new DICTIONARYImpl();
		return dictionary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DICUNITREFERENCE createDICUNITREFERENCE() {
		DICUNITREFERENCEImpl dicunitreference = new DICUNITREFERENCEImpl();
		return dicunitreference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DICUNITSREFERENCE createDICUNITSREFERENCE() {
		DICUNITSREFERENCEImpl dicunitsreference = new DICUNITSREFERENCEImpl();
		return dicunitsreference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DICUNIT createDICUNIT() {
		DICUNITImpl dicunit = new DICUNITImpl();
		return dicunit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DICVALUE createDICVALUE() {
		DICVALUEImpl dicvalue = new DICVALUEImpl();
		return dicvalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DIMENSIONALEXPONENTS createDIMENSIONALEXPONENTS() {
		DIMENSIONALEXPONENTSImpl dimensionalexponents = new DIMENSIONALEXPONENTSImpl();
		return dimensionalexponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DOCUMENTCONTENT createDOCUMENTCONTENT() {
		DOCUMENTCONTENTImpl documentcontent = new DOCUMENTCONTENTImpl();
		return documentcontent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DOCUMENTIDENTIFIERNAMELABEL createDOCUMENTIDENTIFIERNAMELABEL() {
		DOCUMENTIDENTIFIERNAMELABELImpl documentidentifiernamelabel = new DOCUMENTIDENTIFIERNAMELABELImpl();
		return documentidentifiernamelabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DOCUMENTIDENTIFIER createDOCUMENTIDENTIFIER() {
		DOCUMENTIDENTIFIERImpl documentidentifier = new DOCUMENTIDENTIFIERImpl();
		return documentidentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DOCUMENTREFERENCE createDOCUMENTREFERENCE() {
		DOCUMENTREFERENCEImpl documentreference = new DOCUMENTREFERENCEImpl();
		return documentreference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DOCUMENTSREFERENCE createDOCUMENTSREFERENCE() {
		DOCUMENTSREFERENCEImpl documentsreference = new DOCUMENTSREFERENCEImpl();
		return documentsreference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DOCUMENT createDOCUMENT() {
		DOCUMENTImpl document = new DOCUMENTImpl();
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DOMAINCONSTRAINTS createDOMAINCONSTRAINTS() {
		DOMAINCONSTRAINTSImpl domainconstraints = new DOMAINCONSTRAINTSImpl();
		return domainconstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DOMAINCONSTRAINT createDOMAINCONSTRAINT() {
		DOMAINCONSTRAINTImpl domainconstraint = new DOMAINCONSTRAINTImpl();
		return domainconstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMERATIONCONSTRAINT createENUMERATIONCONSTRAINT() {
		ENUMERATIONCONSTRAINTImpl enumerationconstraint = new ENUMERATIONCONSTRAINTImpl();
		return enumerationconstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EXPLICITFUNCTIONALMODELCLASSEXTENSION createEXPLICITFUNCTIONALMODELCLASSEXTENSION() {
		EXPLICITFUNCTIONALMODELCLASSEXTENSIONImpl explicitfunctionalmodelclassextension = new EXPLICITFUNCTIONALMODELCLASSEXTENSIONImpl();
		return explicitfunctionalmodelclassextension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EXPLICITITEMCLASSEXTENSION createEXPLICITITEMCLASSEXTENSION() {
		EXPLICITITEMCLASSEXTENSIONImpl explicititemclassextension = new EXPLICITITEMCLASSEXTENSIONImpl();
		return explicititemclassextension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EXTERNALFILES createEXTERNALFILES() {
		EXTERNALFILESImpl externalfiles = new EXTERNALFILESImpl();
		return externalfiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EXTERNALGRAPHICS createEXTERNALGRAPHICS() {
		EXTERNALGRAPHICSImpl externalgraphics = new EXTERNALGRAPHICSImpl();
		return externalgraphics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EXTERNALRESOURCE createEXTERNALRESOURCE() {
		EXTERNALRESOURCEImpl externalresource = new EXTERNALRESOURCEImpl();
		return externalresource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FILTER createFILTER() {
		FILTERImpl filter = new FILTERImpl();
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FMCLASSVIEWOF createFMCLASSVIEWOF() {
		FMCLASSVIEWOFImpl fmclassviewof = new FMCLASSVIEWOFImpl();
		return fmclassviewof;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FUNCTIONALMODELCLASS createFUNCTIONALMODELCLASS() {
		FUNCTIONALMODELCLASSImpl functionalmodelclass = new FUNCTIONALMODELCLASSImpl();
		return functionalmodelclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GENERALTEXT createGENERALTEXT() {
		GENERALTEXTImpl generaltext = new GENERALTEXTImpl();
		return generaltext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GEOMETRICCONTEXT createGEOMETRICCONTEXT() {
		GEOMETRICCONTEXTImpl geometriccontext = new GEOMETRICCONTEXTImpl();
		return geometriccontext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GEOMETRICUNITCONTEXT createGEOMETRICUNITCONTEXT() {
		GEOMETRICUNITCONTEXTImpl geometricunitcontext = new GEOMETRICUNITCONTEXTImpl();
		return geometricunitcontext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GRAPHICS createGRAPHICS() {
		GRAPHICSImpl graphics = new GRAPHICSImpl();
		return graphics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HEADER createHEADER() {
		HEADERImpl header = new HEADERImpl();
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPFILE createHTTPFILE() {
		HTTPFILEImpl httpfile = new HTTPFILEImpl();
		return httpfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDENTIFIEDDOCUMENT createIDENTIFIEDDOCUMENT() {
		IDENTIFIEDDOCUMENTImpl identifieddocument = new IDENTIFIEDDOCUMENTImpl();
		return identifieddocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ILLUSTRATION createILLUSTRATION() {
		ILLUSTRATIONImpl illustration = new ILLUSTRATIONImpl();
		return illustration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INFORMATION createINFORMATION() {
		INFORMATIONImpl information = new INFORMATIONImpl();
		return information;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INTCURRENCYTYPE createINTCURRENCYTYPE() {
		INTCURRENCYTYPEImpl intcurrencytype = new INTCURRENCYTYPEImpl();
		return intcurrencytype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INTDICVALUE createINTDICVALUE() {
		INTDICVALUEImpl intdicvalue = new INTDICVALUEImpl();
		return intdicvalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INTEGRITYCONSTRAINT createINTEGRITYCONSTRAINT() {
		INTEGRITYCONSTRAINTImpl integrityconstraint = new INTEGRITYCONSTRAINTImpl();
		return integrityconstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INTMEASURETYPE createINTMEASURETYPE() {
		INTMEASURETYPEImpl intmeasuretype = new INTMEASURETYPEImpl();
		return intmeasuretype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INTTYPE createINTTYPE() {
		INTTYPEImpl inttype = new INTTYPEImpl();
		return inttype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ITEMCLASSCASEOF createITEMCLASSCASEOF() {
		ITEMCLASSCASEOFImpl itemclasscaseof = new ITEMCLASSCASEOFImpl();
		return itemclasscaseof;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ITEMCLASS createITEMCLASS() {
		ITEMCLASSImpl itemclass = new ITEMCLASSImpl();
		return itemclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ITSVALUES createITSVALUES() {
		ITSVALUESImpl itsvalues = new ITSVALUESImpl();
		return itsvalues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KEYWORDLABEL createKEYWORDLABEL() {
		KEYWORDLABELImpl keywordlabel = new KEYWORDLABELImpl();
		return keywordlabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KEYWORD createKEYWORD() {
		KEYWORDImpl keyword = new KEYWORDImpl();
		return keyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LANGUAGE createLANGUAGE() {
		LANGUAGEImpl language = new LANGUAGEImpl();
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LEVEL createLEVEL() {
		LEVELImpl level = new LEVELImpl();
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LEVELTYPE createLEVELTYPE() {
		LEVELTYPEImpl leveltype = new LEVELTYPEImpl();
		return leveltype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LIBRARYIIMIDENTIFICATION createLIBRARYIIMIDENTIFICATION() {
		LIBRARYIIMIDENTIFICATIONImpl libraryiimidentification = new LIBRARYIIMIDENTIFICATIONImpl();
		return libraryiimidentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LIBRARYINSTANDARDFORMAT createLIBRARYINSTANDARDFORMAT() {
		LIBRARYINSTANDARDFORMATImpl libraryinstandardformat = new LIBRARYINSTANDARDFORMATImpl();
		return libraryinstandardformat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LIBRARY createLIBRARY() {
		LIBRARYImpl library = new LIBRARYImpl();
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LISTTYPE createLISTTYPE() {
		LISTTYPEImpl listtype = new LISTTYPEImpl();
		return listtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MAPPINGFUNCTION createMAPPINGFUNCTION() {
		MAPPINGFUNCTIONImpl mappingfunction = new MAPPINGFUNCTIONImpl();
		return mappingfunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MATHEMATICALSTRING createMATHEMATICALSTRING() {
		MATHEMATICALSTRINGImpl mathematicalstring = new MATHEMATICALSTRINGImpl();
		return mathematicalstring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MESSAGE createMESSAGE() {
		MESSAGEImpl message = new MESSAGEImpl();
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NAMEDTYPE createNAMEDTYPE() {
		NAMEDTYPEImpl namedtype = new NAMEDTYPEImpl();
		return namedtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NAMEDUNIT createNAMEDUNIT() {
		NAMEDUNITImpl namedunit = new NAMEDUNITImpl();
		return namedunit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NONDEPENDENTPDET createNONDEPENDENTPDET() {
		NONDEPENDENTPDETImpl nondependentpdet = new NONDEPENDENTPDETImpl();
		return nondependentpdet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NONINSTANTIABLEFUNCTIONALVIEWCLASS createNONINSTANTIABLEFUNCTIONALVIEWCLASS() {
		NONINSTANTIABLEFUNCTIONALVIEWCLASSImpl noninstantiablefunctionalviewclass = new NONINSTANTIABLEFUNCTIONALVIEWCLASSImpl();
		return noninstantiablefunctionalviewclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NONQUANTITATIVECODETYPE createNONQUANTITATIVECODETYPE() {
		NONQUANTITATIVECODETYPEImpl nonquantitativecodetype = new NONQUANTITATIVECODETYPEImpl();
		return nonquantitativecodetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NONQUANTITATIVEINTTYPE createNONQUANTITATIVEINTTYPE() {
		NONQUANTITATIVEINTTYPEImpl nonquantitativeinttype = new NONQUANTITATIVEINTTYPEImpl();
		return nonquantitativeinttype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NONSIUNIT createNONSIUNIT() {
		NONSIUNITImpl nonsiunit = new NONSIUNITImpl();
		return nonsiunit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NONTRANSLATABLESTRINGTYPE createNONTRANSLATABLESTRINGTYPE() {
		NONTRANSLATABLESTRINGTYPEImpl nontranslatablestringtype = new NONTRANSLATABLESTRINGTYPEImpl();
		return nontranslatablestringtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUMBERTYPE createNUMBERTYPE() {
		NUMBERTYPEImpl numbertype = new NUMBERTYPEImpl();
		return numbertype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ONTOML createONTOML() {
		ONTOMLImpl ontoml = new ONTOMLImpl();
		return ontoml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORGANIZATION createORGANIZATION() {
		ORGANIZATIONImpl organization = new ORGANIZATIONImpl();
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PERSON createPERSON() {
		PERSONImpl person = new PERSONImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PLACEMENTTYPE createPLACEMENTTYPE() {
		PLACEMENTTYPEImpl placementtype = new PLACEMENTTYPEImpl();
		return placementtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public POSTCONDITION createPOSTCONDITION() {
		POSTCONDITIONImpl postcondition = new POSTCONDITIONImpl();
		return postcondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRECONDITION createPRECONDITION() {
		PRECONDITIONImpl precondition = new PRECONDITIONImpl();
		return precondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PREFERREDNAMELABEL createPREFERREDNAMELABEL() {
		PREFERREDNAMELABELImpl preferrednamelabel = new PREFERREDNAMELABELImpl();
		return preferrednamelabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PREFERREDNAME createPREFERREDNAME() {
		PREFERREDNAMEImpl preferredname = new PREFERREDNAMEImpl();
		return preferredname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROGRAMREFERENCETYPE createPROGRAMREFERENCETYPE() {
		PROGRAMREFERENCETYPEImpl programreferencetype = new PROGRAMREFERENCETYPEImpl();
		return programreferencetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROPERTIESREFERENCE createPROPERTIESREFERENCE() {
		PROPERTIESREFERENCEImpl propertiesreference = new PROPERTIESREFERENCEImpl();
		return propertiesreference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROPERTYCLASSIFICATION createPROPERTYCLASSIFICATION() {
		PROPERTYCLASSIFICATIONImpl propertyclassification = new PROPERTYCLASSIFICATIONImpl();
		return propertyclassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROPERTYCONSTRAINT createPROPERTYCONSTRAINT() {
		PROPERTYCONSTRAINTImpl propertyconstraint = new PROPERTYCONSTRAINTImpl();
		return propertyconstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROPERTYMAPPING createPROPERTYMAPPING() {
		PROPERTYMAPPINGImpl propertymapping = new PROPERTYMAPPINGImpl();
		return propertymapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROPERTYREFERENCE createPROPERTYREFERENCE() {
		PROPERTYREFERENCEImpl propertyreference = new PROPERTYREFERENCEImpl();
		return propertyreference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROPERTY createPROPERTY() {
		PROPERTYImpl property = new PROPERTYImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROPERTYVALUERECOMMENDEDPRESENTATION createPROPERTYVALUERECOMMENDEDPRESENTATION() {
		PROPERTYVALUERECOMMENDEDPRESENTATIONImpl propertyvaluerecommendedpresentation = new PROPERTYVALUERECOMMENDEDPRESENTATIONImpl();
		return propertyvaluerecommendedpresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RANGECONSTRAINT createRANGECONSTRAINT() {
		RANGECONSTRAINTImpl rangeconstraint = new RANGECONSTRAINTImpl();
		return rangeconstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RATIONALMEASURETYPE createRATIONALMEASURETYPE() {
		RATIONALMEASURETYPEImpl rationalmeasuretype = new RATIONALMEASURETYPEImpl();
		return rationalmeasuretype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RATIONALTYPE createRATIONALTYPE() {
		RATIONALTYPEImpl rationaltype = new RATIONALTYPEImpl();
		return rationaltype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REALCURRENCYTYPE createREALCURRENCYTYPE() {
		REALCURRENCYTYPEImpl realcurrencytype = new REALCURRENCYTYPEImpl();
		return realcurrencytype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REALMEASURETYPE createREALMEASURETYPE() {
		REALMEASURETYPEImpl realmeasuretype = new REALMEASURETYPEImpl();
		return realmeasuretype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REALTYPE createREALTYPE() {
		REALTYPEImpl realtype = new REALTYPEImpl();
		return realtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RECOMMENDEDPRESENTATION createRECOMMENDEDPRESENTATION() {
		RECOMMENDEDPRESENTATIONImpl recommendedpresentation = new RECOMMENDEDPRESENTATIONImpl();
		return recommendedpresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REFERENCEDDOCUMENT createREFERENCEDDOCUMENT() {
		REFERENCEDDOCUMENTImpl referenceddocument = new REFERENCEDDOCUMENTImpl();
		return referenceddocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REFERENCEDGRAPHICS createREFERENCEDGRAPHICS() {
		REFERENCEDGRAPHICSImpl referencedgraphics = new REFERENCEDGRAPHICSImpl();
		return referencedgraphics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REMOTELOCATIONS createREMOTELOCATIONS() {
		REMOTELOCATIONSImpl remotelocations = new REMOTELOCATIONSImpl();
		return remotelocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoteLocation createRemoteLocation() {
		RemoteLocationImpl remoteLocation = new RemoteLocationImpl();
		return remoteLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REPRESENTATIONPDET createREPRESENTATIONPDET() {
		REPRESENTATIONPDETImpl representationpdet = new REPRESENTATIONPDETImpl();
		return representationpdet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REPRESENTATIONREFERENCETYPE createREPRESENTATIONREFERENCETYPE() {
		REPRESENTATIONREFERENCETYPEImpl representationreferencetype = new REPRESENTATIONREFERENCETYPEImpl();
		return representationreferencetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SETTYPE createSETTYPE() {
		SETTYPEImpl settype = new SETTYPEImpl();
		return settype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SETWITHSUBSETCONSTRAINTTYPE createSETWITHSUBSETCONSTRAINTTYPE() {
		SETWITHSUBSETCONSTRAINTTYPEImpl setwithsubsetconstrainttype = new SETWITHSUBSETCONSTRAINTTYPEImpl();
		return setwithsubsetconstrainttype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SHORTNAMELABEL createSHORTNAMELABEL() {
		SHORTNAMELABELImpl shortnamelabel = new SHORTNAMELABELImpl();
		return shortnamelabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SHORTNAME createSHORTNAME() {
		SHORTNAMEImpl shortname = new SHORTNAMEImpl();
		return shortname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SIUNIT createSIUNIT() {
		SIUNITImpl siunit = new SIUNITImpl();
		return siunit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SOURCEDOCUMENT createSOURCEDOCUMENT() {
		SOURCEDOCUMENTImpl sourcedocument = new SOURCEDOCUMENTImpl();
		return sourcedocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STRINGDICVALUE createSTRINGDICVALUE() {
		STRINGDICVALUEImpl stringdicvalue = new STRINGDICVALUEImpl();
		return stringdicvalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STRINGPATTERNCONSTRAINT createSTRINGPATTERNCONSTRAINT() {
		STRINGPATTERNCONSTRAINTImpl stringpatternconstraint = new STRINGPATTERNCONSTRAINTImpl();
		return stringpatternconstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STRINGSIZECONSTRAINT createSTRINGSIZECONSTRAINT() {
		STRINGSIZECONSTRAINTImpl stringsizeconstraint = new STRINGSIZECONSTRAINTImpl();
		return stringsizeconstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STRINGS createSTRINGS() {
		STRINGSImpl strings = new STRINGSImpl();
		return strings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STRINGTYPE createSTRINGTYPE() {
		STRINGTYPEImpl stringtype = new STRINGTYPEImpl();
		return stringtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SUBCLASSCONSTRAINT createSUBCLASSCONSTRAINT() {
		SUBCLASSCONSTRAINTImpl subclassconstraint = new SUBCLASSCONSTRAINTImpl();
		return subclassconstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SUBSET createSUBSET() {
		SUBSETImpl subset = new SUBSETImpl();
		return subset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SUPPLIERREFERENCE createSUPPLIERREFERENCE() {
		SUPPLIERREFERENCEImpl supplierreference = new SUPPLIERREFERENCEImpl();
		return supplierreference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SUPPLIERSREFERENCE createSUPPLIERSREFERENCE() {
		SUPPLIERSREFERENCEImpl suppliersreference = new SUPPLIERSREFERENCEImpl();
		return suppliersreference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SUPPLIER createSUPPLIER() {
		SUPPLIERImpl supplier = new SUPPLIERImpl();
		return supplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SUPPORTEDVEP createSUPPORTEDVEP() {
		SUPPORTEDVEPImpl supportedvep = new SUPPORTEDVEPImpl();
		return supportedvep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SYNONYMOUSNAMELABEL createSYNONYMOUSNAMELABEL() {
		SYNONYMOUSNAMELABELImpl synonymousnamelabel = new SYNONYMOUSNAMELABELImpl();
		return synonymousnamelabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SYNONYMOUSNAME createSYNONYMOUSNAME() {
		SYNONYMOUSNAMEImpl synonymousname = new SYNONYMOUSNAMEImpl();
		return synonymousname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SYNONYMOUSSYMBOLS createSYNONYMOUSSYMBOLS() {
		SYNONYMOUSSYMBOLSImpl synonymoussymbols = new SYNONYMOUSSYMBOLSImpl();
		return synonymoussymbols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TEXT createTEXT() {
		TEXTImpl text = new TEXTImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TIMEDATATYPE createTIMEDATATYPE() {
		TIMEDATATYPEImpl timedatatype = new TIMEDATATYPEImpl();
		return timedatatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRANSLATABLESTRINGTYPE createTRANSLATABLESTRINGTYPE() {
		TRANSLATABLESTRINGTYPEImpl translatablestringtype = new TRANSLATABLESTRINGTYPEImpl();
		return translatablestringtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRANSLATIONDATA createTRANSLATIONDATA() {
		TRANSLATIONDATAImpl translationdata = new TRANSLATIONDATAImpl();
		return translationdata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRANSLATION createTRANSLATION() {
		TRANSLATIONImpl translation = new TRANSLATIONImpl();
		return translation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UNIT createUNIT() {
		UNITImpl unit = new UNITImpl();
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URITYPE createURITYPE() {
		URITYPEImpl uritype = new URITYPEImpl();
		return uritype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VCVRANGE createVCVRANGE() {
		VCVRANGEImpl vcvrange = new VCVRANGEImpl();
		return vcvrange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VIEWCONTROLVARIABLERANGE createVIEWCONTROLVARIABLERANGE() {
		VIEWCONTROLVARIABLERANGEImpl viewcontrolvariablerange = new VIEWCONTROLVARIABLERANGEImpl();
		return viewcontrolvariablerange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VIEWEXCHANGEPROTOCOLIDENTIFICATION createVIEWEXCHANGEPROTOCOLIDENTIFICATION() {
		VIEWEXCHANGEPROTOCOLIDENTIFICATIONImpl viewexchangeprotocolidentification = new VIEWEXCHANGEPROTOCOLIDENTIFICATIONImpl();
		return viewexchangeprotocolidentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ILLUSTRATIONTYPEType createILLUSTRATIONTYPETypeFromString(EDataType eDataType, String initialValue) {
		ILLUSTRATIONTYPEType result = ILLUSTRATIONTYPEType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertILLUSTRATIONTYPETypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SIPREFIXType createSIPREFIXTypeFromString(EDataType eDataType, String initialValue) {
		SIPREFIXType result = SIPREFIXType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSIPREFIXTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SIUNITNAMEType createSIUNITNAMETypeFromString(EDataType eDataType, String initialValue) {
		SIUNITNAMEType result = SIUNITNAMEType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSIUNITNAMETypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STANDARDSIZEType createSTANDARDSIZETypeFromString(EDataType eDataType, String initialValue) {
		STANDARDSIZEType result = STANDARDSIZEType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSTANDARDSIZETypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage getIsostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage() {
		return (Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage getPackage() {
		return Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.eINSTANCE;
	}

} //Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedFactoryImpl
