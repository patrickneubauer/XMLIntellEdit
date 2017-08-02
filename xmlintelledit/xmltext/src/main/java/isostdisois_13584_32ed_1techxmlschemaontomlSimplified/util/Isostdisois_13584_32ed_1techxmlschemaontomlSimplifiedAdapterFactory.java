/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage
 * @generated
 */
public class Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedSwitch<Adapter> modelSwitch =
		new Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedSwitch<Adapter>() {
			@Override
			public Adapter caseALTERNATIVEUNITS(ALTERNATIVEUNITS object) {
				return createALTERNATIVEUNITSAdapter();
			}
			@Override
			public Adapter caseANYTYPE(ANYTYPE object) {
				return createANYTYPEAdapter();
			}
			@Override
			public Adapter caseAPOSTERIORICASEOF(APOSTERIORICASEOF object) {
				return createAPOSTERIORICASEOFAdapter();
			}
			@Override
			public Adapter caseAPOSTERIORISEMANTICRELATIONSHIPS(APOSTERIORISEMANTICRELATIONSHIPS object) {
				return createAPOSTERIORISEMANTICRELATIONSHIPSAdapter();
			}
			@Override
			public Adapter caseAPOSTERIORISEMANTICRELATIONSHIP(APOSTERIORISEMANTICRELATIONSHIP object) {
				return createAPOSTERIORISEMANTICRELATIONSHIPAdapter();
			}
			@Override
			public Adapter caseAPOSTERIORIVIEWOF(APOSTERIORIVIEWOF object) {
				return createAPOSTERIORIVIEWOFAdapter();
			}
			@Override
			public Adapter caseARRAYTYPE(ARRAYTYPE object) {
				return createARRAYTYPEAdapter();
			}
			@Override
			public Adapter caseASSIGNEDVALUE(ASSIGNEDVALUE object) {
				return createASSIGNEDVALUEAdapter();
			}
			@Override
			public Adapter caseAUTHORS(AUTHORS object) {
				return createAUTHORSAdapter();
			}
			@Override
			public Adapter caseAXIS1PLACEMENTTYPE(AXIS1PLACEMENTTYPE object) {
				return createAXIS1PLACEMENTTYPEAdapter();
			}
			@Override
			public Adapter caseAXIS2PLACEMENT2DTYPE(AXIS2PLACEMENT2DTYPE object) {
				return createAXIS2PLACEMENT2DTYPEAdapter();
			}
			@Override
			public Adapter caseAXIS2PLACEMENT3DTYPE(AXIS2PLACEMENT3DTYPE object) {
				return createAXIS2PLACEMENT3DTYPEAdapter();
			}
			@Override
			public Adapter caseBAGTYPE(BAGTYPE object) {
				return createBAGTYPEAdapter();
			}
			@Override
			public Adapter caseBOOLEANTYPE(BOOLEANTYPE object) {
				return createBOOLEANTYPEAdapter();
			}
			@Override
			public Adapter caseCARDINALITYCONSTRAINT(CARDINALITYCONSTRAINT object) {
				return createCARDINALITYCONSTRAINTAdapter();
			}
			@Override
			public Adapter caseCATEGORIZATIONCLASS(CATEGORIZATIONCLASS object) {
				return createCATEGORIZATIONCLASSAdapter();
			}
			@Override
			public Adapter caseCLASSCONSTANTVALUES(CLASSCONSTANTVALUES object) {
				return createCLASSCONSTANTVALUESAdapter();
			}
			@Override
			public Adapter caseCLASSCONSTRAINT(CLASSCONSTRAINT object) {
				return createCLASSCONSTRAINTAdapter();
			}
			@Override
			public Adapter caseCLASSESREFERENCE(CLASSESREFERENCE object) {
				return createCLASSESREFERENCEAdapter();
			}
			@Override
			public Adapter caseCLASSEXTENSION(CLASSEXTENSION object) {
				return createCLASSEXTENSIONAdapter();
			}
			@Override
			public Adapter caseCLASSIFICATION(CLASSIFICATION object) {
				return createCLASSIFICATIONAdapter();
			}
			@Override
			public Adapter caseCLASSPRESENTATIONONPAPER(CLASSPRESENTATIONONPAPER object) {
				return createCLASSPRESENTATIONONPAPERAdapter();
			}
			@Override
			public Adapter caseCLASSPRESENTATIONONSCREEN(CLASSPRESENTATIONONSCREEN object) {
				return createCLASSPRESENTATIONONSCREENAdapter();
			}
			@Override
			public Adapter caseCLASSREFERENCE(CLASSREFERENCE object) {
				return createCLASSREFERENCEAdapter();
			}
			@Override
			public Adapter caseCLASSREFERENCETYPE(CLASSREFERENCETYPE object) {
				return createCLASSREFERENCETYPEAdapter();
			}
			@Override
			public Adapter caseCLASS(CLASS object) {
				return createCLASSAdapter();
			}
			@Override
			public Adapter caseCLASSVALUEASSIGNMENT(CLASSVALUEASSIGNMENT object) {
				return createCLASSVALUEASSIGNMENTAdapter();
			}
			@Override
			public Adapter caseCONDITIONDET(CONDITIONDET object) {
				return createCONDITIONDETAdapter();
			}
			@Override
			public Adapter caseCONFIGURATIONCONTROLCONSTRAINT(CONFIGURATIONCONTROLCONSTRAINT object) {
				return createCONFIGURATIONCONTROLCONSTRAINTAdapter();
			}
			@Override
			public Adapter caseCONSTRAINTORCONSTRAINTID(CONSTRAINTORCONSTRAINTID object) {
				return createCONSTRAINTORCONSTRAINTIDAdapter();
			}
			@Override
			public Adapter caseCONSTRAINTS(CONSTRAINTS object) {
				return createCONSTRAINTSAdapter();
			}
			@Override
			public Adapter caseCONSTRAINT(CONSTRAINT object) {
				return createCONSTRAINTAdapter();
			}
			@Override
			public Adapter caseCONTAINEDCLASSES(CONTAINEDCLASSES object) {
				return createCONTAINEDCLASSESAdapter();
			}
			@Override
			public Adapter caseCONTAINEDCLASSEXTENSIONS(CONTAINEDCLASSEXTENSIONS object) {
				return createCONTAINEDCLASSEXTENSIONSAdapter();
			}
			@Override
			public Adapter caseCONTAINEDDATATYPES(CONTAINEDDATATYPES object) {
				return createCONTAINEDDATATYPESAdapter();
			}
			@Override
			public Adapter caseCONTAINEDDOCUMENTS(CONTAINEDDOCUMENTS object) {
				return createCONTAINEDDOCUMENTSAdapter();
			}
			@Override
			public Adapter caseCONTAINEDPROPERTIES(CONTAINEDPROPERTIES object) {
				return createCONTAINEDPROPERTIESAdapter();
			}
			@Override
			public Adapter caseCONTAINEDSUPPLIERS(CONTAINEDSUPPLIERS object) {
				return createCONTAINEDSUPPLIERSAdapter();
			}
			@Override
			public Adapter caseCONTEXTDEPENDENTUNIT(CONTEXTDEPENDENTUNIT object) {
				return createCONTEXTDEPENDENTUNITAdapter();
			}
			@Override
			public Adapter caseCONTEXTPARAMETERCONSTRAINTS(CONTEXTPARAMETERCONSTRAINTS object) {
				return createCONTEXTPARAMETERCONSTRAINTSAdapter();
			}
			@Override
			public Adapter caseCONTEXTPARAMICON(CONTEXTPARAMICON object) {
				return createCONTEXTPARAMICONAdapter();
			}
			@Override
			public Adapter caseCONTEXTRESTRICTIONCONSTRAINT(CONTEXTRESTRICTIONCONSTRAINT object) {
				return createCONTEXTRESTRICTIONCONSTRAINTAdapter();
			}
			@Override
			public Adapter caseCONVERSIONBASEDUNIT(CONVERSIONBASEDUNIT object) {
				return createCONVERSIONBASEDUNITAdapter();
			}
			@Override
			public Adapter caseCORRESPONDINGPROPERTIES(CORRESPONDINGPROPERTIES object) {
				return createCORRESPONDINGPROPERTIESAdapter();
			}
			@Override
			public Adapter caseCREATEICON(CREATEICON object) {
				return createCREATEICONAdapter();
			}
			@Override
			public Adapter caseDATATYPEREFERENCE(DATATYPEREFERENCE object) {
				return createDATATYPEREFERENCEAdapter();
			}
			@Override
			public Adapter caseDATATYPESREFERENCE(DATATYPESREFERENCE object) {
				return createDATATYPESREFERENCEAdapter();
			}
			@Override
			public Adapter caseDATATYPE(DATATYPE object) {
				return createDATATYPEAdapter();
			}
			@Override
			public Adapter caseDATEDATATYPE(DATEDATATYPE object) {
				return createDATEDATATYPEAdapter();
			}
			@Override
			public Adapter caseDATETIMEDATATYPE(DATETIMEDATATYPE object) {
				return createDATETIMEDATATYPEAdapter();
			}
			@Override
			public Adapter caseDEPENDENTPDET(DEPENDENTPDET object) {
				return createDEPENDENTPDETAdapter();
			}
			@Override
			public Adapter caseDERIVEDUNITELEMENT(DERIVEDUNITELEMENT object) {
				return createDERIVEDUNITELEMENTAdapter();
			}
			@Override
			public Adapter caseDERIVEDUNIT(DERIVEDUNIT object) {
				return createDERIVEDUNITAdapter();
			}
			@Override
			public Adapter caseDICTIONARIESREFERENCE(DICTIONARIESREFERENCE object) {
				return createDICTIONARIESREFERENCEAdapter();
			}
			@Override
			public Adapter caseDICTIONARYINSTANDARDFORMAT(DICTIONARYINSTANDARDFORMAT object) {
				return createDICTIONARYINSTANDARDFORMATAdapter();
			}
			@Override
			public Adapter caseDICTIONARYREFERENCE(DICTIONARYREFERENCE object) {
				return createDICTIONARYREFERENCEAdapter();
			}
			@Override
			public Adapter caseDICTIONARY(DICTIONARY object) {
				return createDICTIONARYAdapter();
			}
			@Override
			public Adapter caseDICUNITREFERENCE(DICUNITREFERENCE object) {
				return createDICUNITREFERENCEAdapter();
			}
			@Override
			public Adapter caseDICUNITSREFERENCE(DICUNITSREFERENCE object) {
				return createDICUNITSREFERENCEAdapter();
			}
			@Override
			public Adapter caseDICUNIT(DICUNIT object) {
				return createDICUNITAdapter();
			}
			@Override
			public Adapter caseDICVALUE(DICVALUE object) {
				return createDICVALUEAdapter();
			}
			@Override
			public Adapter caseDIMENSIONALEXPONENTS(DIMENSIONALEXPONENTS object) {
				return createDIMENSIONALEXPONENTSAdapter();
			}
			@Override
			public Adapter caseDOCUMENTCONTENT(DOCUMENTCONTENT object) {
				return createDOCUMENTCONTENTAdapter();
			}
			@Override
			public Adapter caseDOCUMENTIDENTIFIERNAMELABEL(DOCUMENTIDENTIFIERNAMELABEL object) {
				return createDOCUMENTIDENTIFIERNAMELABELAdapter();
			}
			@Override
			public Adapter caseDOCUMENTIDENTIFIER(DOCUMENTIDENTIFIER object) {
				return createDOCUMENTIDENTIFIERAdapter();
			}
			@Override
			public Adapter caseDOCUMENTREFERENCE(DOCUMENTREFERENCE object) {
				return createDOCUMENTREFERENCEAdapter();
			}
			@Override
			public Adapter caseDOCUMENTSREFERENCE(DOCUMENTSREFERENCE object) {
				return createDOCUMENTSREFERENCEAdapter();
			}
			@Override
			public Adapter caseDOCUMENT(DOCUMENT object) {
				return createDOCUMENTAdapter();
			}
			@Override
			public Adapter caseDOMAINCONSTRAINTS(DOMAINCONSTRAINTS object) {
				return createDOMAINCONSTRAINTSAdapter();
			}
			@Override
			public Adapter caseDOMAINCONSTRAINT(DOMAINCONSTRAINT object) {
				return createDOMAINCONSTRAINTAdapter();
			}
			@Override
			public Adapter caseENUMERATIONCONSTRAINT(ENUMERATIONCONSTRAINT object) {
				return createENUMERATIONCONSTRAINTAdapter();
			}
			@Override
			public Adapter caseEXPLICITFUNCTIONALMODELCLASSEXTENSION(EXPLICITFUNCTIONALMODELCLASSEXTENSION object) {
				return createEXPLICITFUNCTIONALMODELCLASSEXTENSIONAdapter();
			}
			@Override
			public Adapter caseEXPLICITITEMCLASSEXTENSION(EXPLICITITEMCLASSEXTENSION object) {
				return createEXPLICITITEMCLASSEXTENSIONAdapter();
			}
			@Override
			public Adapter caseEXTERNALFILES(EXTERNALFILES object) {
				return createEXTERNALFILESAdapter();
			}
			@Override
			public Adapter caseEXTERNALGRAPHICS(EXTERNALGRAPHICS object) {
				return createEXTERNALGRAPHICSAdapter();
			}
			@Override
			public Adapter caseEXTERNALRESOURCE(EXTERNALRESOURCE object) {
				return createEXTERNALRESOURCEAdapter();
			}
			@Override
			public Adapter caseFILTER(FILTER object) {
				return createFILTERAdapter();
			}
			@Override
			public Adapter caseFMCLASSVIEWOF(FMCLASSVIEWOF object) {
				return createFMCLASSVIEWOFAdapter();
			}
			@Override
			public Adapter caseFUNCTIONALMODELCLASS(FUNCTIONALMODELCLASS object) {
				return createFUNCTIONALMODELCLASSAdapter();
			}
			@Override
			public Adapter caseGENERALTEXT(GENERALTEXT object) {
				return createGENERALTEXTAdapter();
			}
			@Override
			public Adapter caseGEOMETRICCONTEXT(GEOMETRICCONTEXT object) {
				return createGEOMETRICCONTEXTAdapter();
			}
			@Override
			public Adapter caseGEOMETRICUNITCONTEXT(GEOMETRICUNITCONTEXT object) {
				return createGEOMETRICUNITCONTEXTAdapter();
			}
			@Override
			public Adapter caseGRAPHICS(GRAPHICS object) {
				return createGRAPHICSAdapter();
			}
			@Override
			public Adapter caseHEADER(HEADER object) {
				return createHEADERAdapter();
			}
			@Override
			public Adapter caseHTTPFILE(HTTPFILE object) {
				return createHTTPFILEAdapter();
			}
			@Override
			public Adapter caseIDENTIFIEDDOCUMENT(IDENTIFIEDDOCUMENT object) {
				return createIDENTIFIEDDOCUMENTAdapter();
			}
			@Override
			public Adapter caseILLUSTRATION(ILLUSTRATION object) {
				return createILLUSTRATIONAdapter();
			}
			@Override
			public Adapter caseINFORMATION(INFORMATION object) {
				return createINFORMATIONAdapter();
			}
			@Override
			public Adapter caseINTCURRENCYTYPE(INTCURRENCYTYPE object) {
				return createINTCURRENCYTYPEAdapter();
			}
			@Override
			public Adapter caseINTDICVALUE(INTDICVALUE object) {
				return createINTDICVALUEAdapter();
			}
			@Override
			public Adapter caseINTEGRITYCONSTRAINT(INTEGRITYCONSTRAINT object) {
				return createINTEGRITYCONSTRAINTAdapter();
			}
			@Override
			public Adapter caseINTMEASURETYPE(INTMEASURETYPE object) {
				return createINTMEASURETYPEAdapter();
			}
			@Override
			public Adapter caseINTTYPE(INTTYPE object) {
				return createINTTYPEAdapter();
			}
			@Override
			public Adapter caseITEMCLASSCASEOF(ITEMCLASSCASEOF object) {
				return createITEMCLASSCASEOFAdapter();
			}
			@Override
			public Adapter caseITEMCLASS(ITEMCLASS object) {
				return createITEMCLASSAdapter();
			}
			@Override
			public Adapter caseITSVALUES(ITSVALUES object) {
				return createITSVALUESAdapter();
			}
			@Override
			public Adapter caseKEYWORDLABEL(KEYWORDLABEL object) {
				return createKEYWORDLABELAdapter();
			}
			@Override
			public Adapter caseKEYWORD(KEYWORD object) {
				return createKEYWORDAdapter();
			}
			@Override
			public Adapter caseLANGUAGE(LANGUAGE object) {
				return createLANGUAGEAdapter();
			}
			@Override
			public Adapter caseLEVEL(LEVEL object) {
				return createLEVELAdapter();
			}
			@Override
			public Adapter caseLEVELTYPE(LEVELTYPE object) {
				return createLEVELTYPEAdapter();
			}
			@Override
			public Adapter caseLIBRARYIIMIDENTIFICATION(LIBRARYIIMIDENTIFICATION object) {
				return createLIBRARYIIMIDENTIFICATIONAdapter();
			}
			@Override
			public Adapter caseLIBRARYINSTANDARDFORMAT(LIBRARYINSTANDARDFORMAT object) {
				return createLIBRARYINSTANDARDFORMATAdapter();
			}
			@Override
			public Adapter caseLIBRARY(LIBRARY object) {
				return createLIBRARYAdapter();
			}
			@Override
			public Adapter caseLISTTYPE(LISTTYPE object) {
				return createLISTTYPEAdapter();
			}
			@Override
			public Adapter caseMAPPINGFUNCTION(MAPPINGFUNCTION object) {
				return createMAPPINGFUNCTIONAdapter();
			}
			@Override
			public Adapter caseMATHEMATICALSTRING(MATHEMATICALSTRING object) {
				return createMATHEMATICALSTRINGAdapter();
			}
			@Override
			public Adapter caseMESSAGE(MESSAGE object) {
				return createMESSAGEAdapter();
			}
			@Override
			public Adapter caseNAMEDTYPE(NAMEDTYPE object) {
				return createNAMEDTYPEAdapter();
			}
			@Override
			public Adapter caseNAMEDUNIT(NAMEDUNIT object) {
				return createNAMEDUNITAdapter();
			}
			@Override
			public Adapter caseNONDEPENDENTPDET(NONDEPENDENTPDET object) {
				return createNONDEPENDENTPDETAdapter();
			}
			@Override
			public Adapter caseNONINSTANTIABLEFUNCTIONALVIEWCLASS(NONINSTANTIABLEFUNCTIONALVIEWCLASS object) {
				return createNONINSTANTIABLEFUNCTIONALVIEWCLASSAdapter();
			}
			@Override
			public Adapter caseNONQUANTITATIVECODETYPE(NONQUANTITATIVECODETYPE object) {
				return createNONQUANTITATIVECODETYPEAdapter();
			}
			@Override
			public Adapter caseNONQUANTITATIVEINTTYPE(NONQUANTITATIVEINTTYPE object) {
				return createNONQUANTITATIVEINTTYPEAdapter();
			}
			@Override
			public Adapter caseNONSIUNIT(NONSIUNIT object) {
				return createNONSIUNITAdapter();
			}
			@Override
			public Adapter caseNONTRANSLATABLESTRINGTYPE(NONTRANSLATABLESTRINGTYPE object) {
				return createNONTRANSLATABLESTRINGTYPEAdapter();
			}
			@Override
			public Adapter caseNUMBERTYPE(NUMBERTYPE object) {
				return createNUMBERTYPEAdapter();
			}
			@Override
			public Adapter caseONTOML(ONTOML object) {
				return createONTOMLAdapter();
			}
			@Override
			public Adapter caseORGANIZATION(ORGANIZATION object) {
				return createORGANIZATIONAdapter();
			}
			@Override
			public Adapter casePERSON(PERSON object) {
				return createPERSONAdapter();
			}
			@Override
			public Adapter casePLACEMENTTYPE(PLACEMENTTYPE object) {
				return createPLACEMENTTYPEAdapter();
			}
			@Override
			public Adapter casePOSTCONDITION(POSTCONDITION object) {
				return createPOSTCONDITIONAdapter();
			}
			@Override
			public Adapter casePRECONDITION(PRECONDITION object) {
				return createPRECONDITIONAdapter();
			}
			@Override
			public Adapter casePREFERREDNAMELABEL(PREFERREDNAMELABEL object) {
				return createPREFERREDNAMELABELAdapter();
			}
			@Override
			public Adapter casePREFERREDNAME(PREFERREDNAME object) {
				return createPREFERREDNAMEAdapter();
			}
			@Override
			public Adapter casePROGRAMREFERENCETYPE(PROGRAMREFERENCETYPE object) {
				return createPROGRAMREFERENCETYPEAdapter();
			}
			@Override
			public Adapter casePROPERTIESREFERENCE(PROPERTIESREFERENCE object) {
				return createPROPERTIESREFERENCEAdapter();
			}
			@Override
			public Adapter casePROPERTYCLASSIFICATION(PROPERTYCLASSIFICATION object) {
				return createPROPERTYCLASSIFICATIONAdapter();
			}
			@Override
			public Adapter casePROPERTYCONSTRAINT(PROPERTYCONSTRAINT object) {
				return createPROPERTYCONSTRAINTAdapter();
			}
			@Override
			public Adapter casePROPERTYMAPPING(PROPERTYMAPPING object) {
				return createPROPERTYMAPPINGAdapter();
			}
			@Override
			public Adapter casePROPERTYREFERENCE(PROPERTYREFERENCE object) {
				return createPROPERTYREFERENCEAdapter();
			}
			@Override
			public Adapter casePROPERTY(PROPERTY object) {
				return createPROPERTYAdapter();
			}
			@Override
			public Adapter casePROPERTYVALUERECOMMENDEDPRESENTATION(PROPERTYVALUERECOMMENDEDPRESENTATION object) {
				return createPROPERTYVALUERECOMMENDEDPRESENTATIONAdapter();
			}
			@Override
			public Adapter caseRANGECONSTRAINT(RANGECONSTRAINT object) {
				return createRANGECONSTRAINTAdapter();
			}
			@Override
			public Adapter caseRATIONALMEASURETYPE(RATIONALMEASURETYPE object) {
				return createRATIONALMEASURETYPEAdapter();
			}
			@Override
			public Adapter caseRATIONALTYPE(RATIONALTYPE object) {
				return createRATIONALTYPEAdapter();
			}
			@Override
			public Adapter caseREALCURRENCYTYPE(REALCURRENCYTYPE object) {
				return createREALCURRENCYTYPEAdapter();
			}
			@Override
			public Adapter caseREALMEASURETYPE(REALMEASURETYPE object) {
				return createREALMEASURETYPEAdapter();
			}
			@Override
			public Adapter caseREALTYPE(REALTYPE object) {
				return createREALTYPEAdapter();
			}
			@Override
			public Adapter caseRECOMMENDEDPRESENTATION(RECOMMENDEDPRESENTATION object) {
				return createRECOMMENDEDPRESENTATIONAdapter();
			}
			@Override
			public Adapter caseREFERENCEDDOCUMENT(REFERENCEDDOCUMENT object) {
				return createREFERENCEDDOCUMENTAdapter();
			}
			@Override
			public Adapter caseREFERENCEDGRAPHICS(REFERENCEDGRAPHICS object) {
				return createREFERENCEDGRAPHICSAdapter();
			}
			@Override
			public Adapter caseREMOTELOCATIONS(REMOTELOCATIONS object) {
				return createREMOTELOCATIONSAdapter();
			}
			@Override
			public Adapter caseRemoteLocation(RemoteLocation object) {
				return createRemoteLocationAdapter();
			}
			@Override
			public Adapter caseREPRESENTATIONPDET(REPRESENTATIONPDET object) {
				return createREPRESENTATIONPDETAdapter();
			}
			@Override
			public Adapter caseREPRESENTATIONREFERENCETYPE(REPRESENTATIONREFERENCETYPE object) {
				return createREPRESENTATIONREFERENCETYPEAdapter();
			}
			@Override
			public Adapter caseSETTYPE(SETTYPE object) {
				return createSETTYPEAdapter();
			}
			@Override
			public Adapter caseSETWITHSUBSETCONSTRAINTTYPE(SETWITHSUBSETCONSTRAINTTYPE object) {
				return createSETWITHSUBSETCONSTRAINTTYPEAdapter();
			}
			@Override
			public Adapter caseSHORTNAMELABEL(SHORTNAMELABEL object) {
				return createSHORTNAMELABELAdapter();
			}
			@Override
			public Adapter caseSHORTNAME(SHORTNAME object) {
				return createSHORTNAMEAdapter();
			}
			@Override
			public Adapter caseSIUNIT(SIUNIT object) {
				return createSIUNITAdapter();
			}
			@Override
			public Adapter caseSOURCEDOCUMENT(SOURCEDOCUMENT object) {
				return createSOURCEDOCUMENTAdapter();
			}
			@Override
			public Adapter caseSTRINGDICVALUE(STRINGDICVALUE object) {
				return createSTRINGDICVALUEAdapter();
			}
			@Override
			public Adapter caseSTRINGPATTERNCONSTRAINT(STRINGPATTERNCONSTRAINT object) {
				return createSTRINGPATTERNCONSTRAINTAdapter();
			}
			@Override
			public Adapter caseSTRINGSIZECONSTRAINT(STRINGSIZECONSTRAINT object) {
				return createSTRINGSIZECONSTRAINTAdapter();
			}
			@Override
			public Adapter caseSTRINGS(STRINGS object) {
				return createSTRINGSAdapter();
			}
			@Override
			public Adapter caseSTRINGTYPE(STRINGTYPE object) {
				return createSTRINGTYPEAdapter();
			}
			@Override
			public Adapter caseSUBCLASSCONSTRAINT(SUBCLASSCONSTRAINT object) {
				return createSUBCLASSCONSTRAINTAdapter();
			}
			@Override
			public Adapter caseSUBSET(SUBSET object) {
				return createSUBSETAdapter();
			}
			@Override
			public Adapter caseSUPPLIERREFERENCE(SUPPLIERREFERENCE object) {
				return createSUPPLIERREFERENCEAdapter();
			}
			@Override
			public Adapter caseSUPPLIERSREFERENCE(SUPPLIERSREFERENCE object) {
				return createSUPPLIERSREFERENCEAdapter();
			}
			@Override
			public Adapter caseSUPPLIER(SUPPLIER object) {
				return createSUPPLIERAdapter();
			}
			@Override
			public Adapter caseSUPPORTEDVEP(SUPPORTEDVEP object) {
				return createSUPPORTEDVEPAdapter();
			}
			@Override
			public Adapter caseSYNONYMOUSNAMELABEL(SYNONYMOUSNAMELABEL object) {
				return createSYNONYMOUSNAMELABELAdapter();
			}
			@Override
			public Adapter caseSYNONYMOUSNAME(SYNONYMOUSNAME object) {
				return createSYNONYMOUSNAMEAdapter();
			}
			@Override
			public Adapter caseSYNONYMOUSSYMBOLS(SYNONYMOUSSYMBOLS object) {
				return createSYNONYMOUSSYMBOLSAdapter();
			}
			@Override
			public Adapter caseTEXT(TEXT object) {
				return createTEXTAdapter();
			}
			@Override
			public Adapter caseTIMEDATATYPE(TIMEDATATYPE object) {
				return createTIMEDATATYPEAdapter();
			}
			@Override
			public Adapter caseTRANSLATABLESTRINGTYPE(TRANSLATABLESTRINGTYPE object) {
				return createTRANSLATABLESTRINGTYPEAdapter();
			}
			@Override
			public Adapter caseTRANSLATIONDATA(TRANSLATIONDATA object) {
				return createTRANSLATIONDATAAdapter();
			}
			@Override
			public Adapter caseTRANSLATION(TRANSLATION object) {
				return createTRANSLATIONAdapter();
			}
			@Override
			public Adapter caseUNIT(UNIT object) {
				return createUNITAdapter();
			}
			@Override
			public Adapter caseURITYPE(URITYPE object) {
				return createURITYPEAdapter();
			}
			@Override
			public Adapter caseVCVRANGE(VCVRANGE object) {
				return createVCVRANGEAdapter();
			}
			@Override
			public Adapter caseVIEWCONTROLVARIABLERANGE(VIEWCONTROLVARIABLERANGE object) {
				return createVIEWCONTROLVARIABLERANGEAdapter();
			}
			@Override
			public Adapter caseVIEWEXCHANGEPROTOCOLIDENTIFICATION(VIEWEXCHANGEPROTOCOLIDENTIFICATION object) {
				return createVIEWEXCHANGEPROTOCOLIDENTIFICATIONAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ALTERNATIVEUNITS <em>ALTERNATIVEUNITS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ALTERNATIVEUNITS
	 * @generated
	 */
	public Adapter createALTERNATIVEUNITSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ANYTYPE <em>ANYTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ANYTYPE
	 * @generated
	 */
	public Adapter createANYTYPEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.APOSTERIORICASEOF <em>APOSTERIORICASEOF</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.APOSTERIORICASEOF
	 * @generated
	 */
	public Adapter createAPOSTERIORICASEOFAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.APOSTERIORISEMANTICRELATIONSHIPS <em>APOSTERIORISEMANTICRELATIONSHIPS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.APOSTERIORISEMANTICRELATIONSHIPS
	 * @generated
	 */
	public Adapter createAPOSTERIORISEMANTICRELATIONSHIPSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.APOSTERIORISEMANTICRELATIONSHIP <em>APOSTERIORISEMANTICRELATIONSHIP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.APOSTERIORISEMANTICRELATIONSHIP
	 * @generated
	 */
	public Adapter createAPOSTERIORISEMANTICRELATIONSHIPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.APOSTERIORIVIEWOF <em>APOSTERIORIVIEWOF</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.APOSTERIORIVIEWOF
	 * @generated
	 */
	public Adapter createAPOSTERIORIVIEWOFAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ARRAYTYPE <em>ARRAYTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ARRAYTYPE
	 * @generated
	 */
	public Adapter createARRAYTYPEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ASSIGNEDVALUE <em>ASSIGNEDVALUE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ASSIGNEDVALUE
	 * @generated
	 */
	public Adapter createASSIGNEDVALUEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.AUTHORS <em>AUTHORS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.AUTHORS
	 * @generated
	 */
	public Adapter createAUTHORSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.AXIS1PLACEMENTTYPE <em>AXIS1PLACEMENTTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.AXIS1PLACEMENTTYPE
	 * @generated
	 */
	public Adapter createAXIS1PLACEMENTTYPEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.AXIS2PLACEMENT2DTYPE <em>AXIS2PLACEMENT2DTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.AXIS2PLACEMENT2DTYPE
	 * @generated
	 */
	public Adapter createAXIS2PLACEMENT2DTYPEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.AXIS2PLACEMENT3DTYPE <em>AXIS2PLACEMENT3DTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.AXIS2PLACEMENT3DTYPE
	 * @generated
	 */
	public Adapter createAXIS2PLACEMENT3DTYPEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.BAGTYPE <em>BAGTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.BAGTYPE
	 * @generated
	 */
	public Adapter createBAGTYPEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.BOOLEANTYPE <em>BOOLEANTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.BOOLEANTYPE
	 * @generated
	 */
	public Adapter createBOOLEANTYPEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CARDINALITYCONSTRAINT <em>CARDINALITYCONSTRAINT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CARDINALITYCONSTRAINT
	 * @generated
	 */
	public Adapter createCARDINALITYCONSTRAINTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CATEGORIZATIONCLASS <em>CATEGORIZATIONCLASS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CATEGORIZATIONCLASS
	 * @generated
	 */
	public Adapter createCATEGORIZATIONCLASSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASSCONSTANTVALUES <em>CLASSCONSTANTVALUES</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASSCONSTANTVALUES
	 * @generated
	 */
	public Adapter createCLASSCONSTANTVALUESAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASSCONSTRAINT <em>CLASSCONSTRAINT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASSCONSTRAINT
	 * @generated
	 */
	public Adapter createCLASSCONSTRAINTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASSESREFERENCE <em>CLASSESREFERENCE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASSESREFERENCE
	 * @generated
	 */
	public Adapter createCLASSESREFERENCEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASSEXTENSION <em>CLASSEXTENSION</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASSEXTENSION
	 * @generated
	 */
	public Adapter createCLASSEXTENSIONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASSIFICATION <em>CLASSIFICATION</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASSIFICATION
	 * @generated
	 */
	public Adapter createCLASSIFICATIONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASSPRESENTATIONONPAPER <em>CLASSPRESENTATIONONPAPER</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASSPRESENTATIONONPAPER
	 * @generated
	 */
	public Adapter createCLASSPRESENTATIONONPAPERAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASSPRESENTATIONONSCREEN <em>CLASSPRESENTATIONONSCREEN</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASSPRESENTATIONONSCREEN
	 * @generated
	 */
	public Adapter createCLASSPRESENTATIONONSCREENAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASSREFERENCE <em>CLASSREFERENCE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASSREFERENCE
	 * @generated
	 */
	public Adapter createCLASSREFERENCEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASSREFERENCETYPE <em>CLASSREFERENCETYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASSREFERENCETYPE
	 * @generated
	 */
	public Adapter createCLASSREFERENCETYPEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASS <em>CLASS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASS
	 * @generated
	 */
	public Adapter createCLASSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASSVALUEASSIGNMENT <em>CLASSVALUEASSIGNMENT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASSVALUEASSIGNMENT
	 * @generated
	 */
	public Adapter createCLASSVALUEASSIGNMENTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CONDITIONDET <em>CONDITIONDET</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CONDITIONDET
	 * @generated
	 */
	public Adapter createCONDITIONDETAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CONFIGURATIONCONTROLCONSTRAINT <em>CONFIGURATIONCONTROLCONSTRAINT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CONFIGURATIONCONTROLCONSTRAINT
	 * @generated
	 */
	public Adapter createCONFIGURATIONCONTROLCONSTRAINTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CONSTRAINTORCONSTRAINTID <em>CONSTRAINTORCONSTRAINTID</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CONSTRAINTORCONSTRAINTID
	 * @generated
	 */
	public Adapter createCONSTRAINTORCONSTRAINTIDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CONSTRAINTS <em>CONSTRAINTS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CONSTRAINTS
	 * @generated
	 */
	public Adapter createCONSTRAINTSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CONSTRAINT <em>CONSTRAINT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CONSTRAINT
	 * @generated
	 */
	public Adapter createCONSTRAINTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CONTAINEDCLASSES <em>CONTAINEDCLASSES</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CONTAINEDCLASSES
	 * @generated
	 */
	public Adapter createCONTAINEDCLASSESAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CONTAINEDCLASSEXTENSIONS <em>CONTAINEDCLASSEXTENSIONS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CONTAINEDCLASSEXTENSIONS
	 * @generated
	 */
	public Adapter createCONTAINEDCLASSEXTENSIONSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CONTAINEDDATATYPES <em>CONTAINEDDATATYPES</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CONTAINEDDATATYPES
	 * @generated
	 */
	public Adapter createCONTAINEDDATATYPESAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CONTAINEDDOCUMENTS <em>CONTAINEDDOCUMENTS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CONTAINEDDOCUMENTS
	 * @generated
	 */
	public Adapter createCONTAINEDDOCUMENTSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CONTAINEDPROPERTIES <em>CONTAINEDPROPERTIES</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CONTAINEDPROPERTIES
	 * @generated
	 */
	public Adapter createCONTAINEDPROPERTIESAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CONTAINEDSUPPLIERS <em>CONTAINEDSUPPLIERS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CONTAINEDSUPPLIERS
	 * @generated
	 */
	public Adapter createCONTAINEDSUPPLIERSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CONTEXTDEPENDENTUNIT <em>CONTEXTDEPENDENTUNIT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CONTEXTDEPENDENTUNIT
	 * @generated
	 */
	public Adapter createCONTEXTDEPENDENTUNITAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CONTEXTPARAMETERCONSTRAINTS <em>CONTEXTPARAMETERCONSTRAINTS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CONTEXTPARAMETERCONSTRAINTS
	 * @generated
	 */
	public Adapter createCONTEXTPARAMETERCONSTRAINTSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CONTEXTPARAMICON <em>CONTEXTPARAMICON</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CONTEXTPARAMICON
	 * @generated
	 */
	public Adapter createCONTEXTPARAMICONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CONTEXTRESTRICTIONCONSTRAINT <em>CONTEXTRESTRICTIONCONSTRAINT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CONTEXTRESTRICTIONCONSTRAINT
	 * @generated
	 */
	public Adapter createCONTEXTRESTRICTIONCONSTRAINTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CONVERSIONBASEDUNIT <em>CONVERSIONBASEDUNIT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CONVERSIONBASEDUNIT
	 * @generated
	 */
	public Adapter createCONVERSIONBASEDUNITAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CORRESPONDINGPROPERTIES <em>CORRESPONDINGPROPERTIES</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CORRESPONDINGPROPERTIES
	 * @generated
	 */
	public Adapter createCORRESPONDINGPROPERTIESAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CREATEICON <em>CREATEICON</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CREATEICON
	 * @generated
	 */
	public Adapter createCREATEICONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DATATYPEREFERENCE <em>DATATYPEREFERENCE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DATATYPEREFERENCE
	 * @generated
	 */
	public Adapter createDATATYPEREFERENCEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DATATYPESREFERENCE <em>DATATYPESREFERENCE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DATATYPESREFERENCE
	 * @generated
	 */
	public Adapter createDATATYPESREFERENCEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DATATYPE <em>DATATYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DATATYPE
	 * @generated
	 */
	public Adapter createDATATYPEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DATEDATATYPE <em>DATEDATATYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DATEDATATYPE
	 * @generated
	 */
	public Adapter createDATEDATATYPEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DATETIMEDATATYPE <em>DATETIMEDATATYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DATETIMEDATATYPE
	 * @generated
	 */
	public Adapter createDATETIMEDATATYPEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DEPENDENTPDET <em>DEPENDENTPDET</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DEPENDENTPDET
	 * @generated
	 */
	public Adapter createDEPENDENTPDETAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DERIVEDUNITELEMENT <em>DERIVEDUNITELEMENT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DERIVEDUNITELEMENT
	 * @generated
	 */
	public Adapter createDERIVEDUNITELEMENTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DERIVEDUNIT <em>DERIVEDUNIT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DERIVEDUNIT
	 * @generated
	 */
	public Adapter createDERIVEDUNITAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DICTIONARIESREFERENCE <em>DICTIONARIESREFERENCE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DICTIONARIESREFERENCE
	 * @generated
	 */
	public Adapter createDICTIONARIESREFERENCEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DICTIONARYINSTANDARDFORMAT <em>DICTIONARYINSTANDARDFORMAT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DICTIONARYINSTANDARDFORMAT
	 * @generated
	 */
	public Adapter createDICTIONARYINSTANDARDFORMATAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DICTIONARYREFERENCE <em>DICTIONARYREFERENCE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DICTIONARYREFERENCE
	 * @generated
	 */
	public Adapter createDICTIONARYREFERENCEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DICTIONARY <em>DICTIONARY</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DICTIONARY
	 * @generated
	 */
	public Adapter createDICTIONARYAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DICUNITREFERENCE <em>DICUNITREFERENCE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DICUNITREFERENCE
	 * @generated
	 */
	public Adapter createDICUNITREFERENCEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DICUNITSREFERENCE <em>DICUNITSREFERENCE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DICUNITSREFERENCE
	 * @generated
	 */
	public Adapter createDICUNITSREFERENCEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DICUNIT <em>DICUNIT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DICUNIT
	 * @generated
	 */
	public Adapter createDICUNITAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DICVALUE <em>DICVALUE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DICVALUE
	 * @generated
	 */
	public Adapter createDICVALUEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DIMENSIONALEXPONENTS <em>DIMENSIONALEXPONENTS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DIMENSIONALEXPONENTS
	 * @generated
	 */
	public Adapter createDIMENSIONALEXPONENTSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DOCUMENTCONTENT <em>DOCUMENTCONTENT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DOCUMENTCONTENT
	 * @generated
	 */
	public Adapter createDOCUMENTCONTENTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DOCUMENTIDENTIFIERNAMELABEL <em>DOCUMENTIDENTIFIERNAMELABEL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DOCUMENTIDENTIFIERNAMELABEL
	 * @generated
	 */
	public Adapter createDOCUMENTIDENTIFIERNAMELABELAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DOCUMENTIDENTIFIER <em>DOCUMENTIDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DOCUMENTIDENTIFIER
	 * @generated
	 */
	public Adapter createDOCUMENTIDENTIFIERAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DOCUMENTREFERENCE <em>DOCUMENTREFERENCE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DOCUMENTREFERENCE
	 * @generated
	 */
	public Adapter createDOCUMENTREFERENCEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DOCUMENTSREFERENCE <em>DOCUMENTSREFERENCE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DOCUMENTSREFERENCE
	 * @generated
	 */
	public Adapter createDOCUMENTSREFERENCEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DOCUMENT <em>DOCUMENT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DOCUMENT
	 * @generated
	 */
	public Adapter createDOCUMENTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DOMAINCONSTRAINTS <em>DOMAINCONSTRAINTS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DOMAINCONSTRAINTS
	 * @generated
	 */
	public Adapter createDOMAINCONSTRAINTSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DOMAINCONSTRAINT <em>DOMAINCONSTRAINT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DOMAINCONSTRAINT
	 * @generated
	 */
	public Adapter createDOMAINCONSTRAINTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ENUMERATIONCONSTRAINT <em>ENUMERATIONCONSTRAINT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ENUMERATIONCONSTRAINT
	 * @generated
	 */
	public Adapter createENUMERATIONCONSTRAINTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.EXPLICITFUNCTIONALMODELCLASSEXTENSION <em>EXPLICITFUNCTIONALMODELCLASSEXTENSION</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.EXPLICITFUNCTIONALMODELCLASSEXTENSION
	 * @generated
	 */
	public Adapter createEXPLICITFUNCTIONALMODELCLASSEXTENSIONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.EXPLICITITEMCLASSEXTENSION <em>EXPLICITITEMCLASSEXTENSION</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.EXPLICITITEMCLASSEXTENSION
	 * @generated
	 */
	public Adapter createEXPLICITITEMCLASSEXTENSIONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.EXTERNALFILES <em>EXTERNALFILES</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.EXTERNALFILES
	 * @generated
	 */
	public Adapter createEXTERNALFILESAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.EXTERNALGRAPHICS <em>EXTERNALGRAPHICS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.EXTERNALGRAPHICS
	 * @generated
	 */
	public Adapter createEXTERNALGRAPHICSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.EXTERNALRESOURCE <em>EXTERNALRESOURCE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.EXTERNALRESOURCE
	 * @generated
	 */
	public Adapter createEXTERNALRESOURCEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.FILTER <em>FILTER</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.FILTER
	 * @generated
	 */
	public Adapter createFILTERAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.FMCLASSVIEWOF <em>FMCLASSVIEWOF</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.FMCLASSVIEWOF
	 * @generated
	 */
	public Adapter createFMCLASSVIEWOFAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.FUNCTIONALMODELCLASS <em>FUNCTIONALMODELCLASS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.FUNCTIONALMODELCLASS
	 * @generated
	 */
	public Adapter createFUNCTIONALMODELCLASSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.GENERALTEXT <em>GENERALTEXT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.GENERALTEXT
	 * @generated
	 */
	public Adapter createGENERALTEXTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.GEOMETRICCONTEXT <em>GEOMETRICCONTEXT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.GEOMETRICCONTEXT
	 * @generated
	 */
	public Adapter createGEOMETRICCONTEXTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.GEOMETRICUNITCONTEXT <em>GEOMETRICUNITCONTEXT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.GEOMETRICUNITCONTEXT
	 * @generated
	 */
	public Adapter createGEOMETRICUNITCONTEXTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.GRAPHICS <em>GRAPHICS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.GRAPHICS
	 * @generated
	 */
	public Adapter createGRAPHICSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.HEADER <em>HEADER</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.HEADER
	 * @generated
	 */
	public Adapter createHEADERAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.HTTPFILE <em>HTTPFILE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.HTTPFILE
	 * @generated
	 */
	public Adapter createHTTPFILEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.IDENTIFIEDDOCUMENT <em>IDENTIFIEDDOCUMENT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.IDENTIFIEDDOCUMENT
	 * @generated
	 */
	public Adapter createIDENTIFIEDDOCUMENTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ILLUSTRATION <em>ILLUSTRATION</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ILLUSTRATION
	 * @generated
	 */
	public Adapter createILLUSTRATIONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.INFORMATION <em>INFORMATION</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.INFORMATION
	 * @generated
	 */
	public Adapter createINFORMATIONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.INTCURRENCYTYPE <em>INTCURRENCYTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.INTCURRENCYTYPE
	 * @generated
	 */
	public Adapter createINTCURRENCYTYPEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.INTDICVALUE <em>INTDICVALUE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.INTDICVALUE
	 * @generated
	 */
	public Adapter createINTDICVALUEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.INTEGRITYCONSTRAINT <em>INTEGRITYCONSTRAINT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.INTEGRITYCONSTRAINT
	 * @generated
	 */
	public Adapter createINTEGRITYCONSTRAINTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.INTMEASURETYPE <em>INTMEASURETYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.INTMEASURETYPE
	 * @generated
	 */
	public Adapter createINTMEASURETYPEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.INTTYPE <em>INTTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.INTTYPE
	 * @generated
	 */
	public Adapter createINTTYPEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ITEMCLASSCASEOF <em>ITEMCLASSCASEOF</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ITEMCLASSCASEOF
	 * @generated
	 */
	public Adapter createITEMCLASSCASEOFAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ITEMCLASS <em>ITEMCLASS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ITEMCLASS
	 * @generated
	 */
	public Adapter createITEMCLASSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ITSVALUES <em>ITSVALUES</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ITSVALUES
	 * @generated
	 */
	public Adapter createITSVALUESAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.KEYWORDLABEL <em>KEYWORDLABEL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.KEYWORDLABEL
	 * @generated
	 */
	public Adapter createKEYWORDLABELAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.KEYWORD <em>KEYWORD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.KEYWORD
	 * @generated
	 */
	public Adapter createKEYWORDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.LANGUAGE <em>LANGUAGE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.LANGUAGE
	 * @generated
	 */
	public Adapter createLANGUAGEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.LEVEL <em>LEVEL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.LEVEL
	 * @generated
	 */
	public Adapter createLEVELAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.LEVELTYPE <em>LEVELTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.LEVELTYPE
	 * @generated
	 */
	public Adapter createLEVELTYPEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.LIBRARYIIMIDENTIFICATION <em>LIBRARYIIMIDENTIFICATION</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.LIBRARYIIMIDENTIFICATION
	 * @generated
	 */
	public Adapter createLIBRARYIIMIDENTIFICATIONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.LIBRARYINSTANDARDFORMAT <em>LIBRARYINSTANDARDFORMAT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.LIBRARYINSTANDARDFORMAT
	 * @generated
	 */
	public Adapter createLIBRARYINSTANDARDFORMATAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.LIBRARY <em>LIBRARY</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.LIBRARY
	 * @generated
	 */
	public Adapter createLIBRARYAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.LISTTYPE <em>LISTTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.LISTTYPE
	 * @generated
	 */
	public Adapter createLISTTYPEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.MAPPINGFUNCTION <em>MAPPINGFUNCTION</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.MAPPINGFUNCTION
	 * @generated
	 */
	public Adapter createMAPPINGFUNCTIONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.MATHEMATICALSTRING <em>MATHEMATICALSTRING</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.MATHEMATICALSTRING
	 * @generated
	 */
	public Adapter createMATHEMATICALSTRINGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.MESSAGE <em>MESSAGE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.MESSAGE
	 * @generated
	 */
	public Adapter createMESSAGEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.NAMEDTYPE <em>NAMEDTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.NAMEDTYPE
	 * @generated
	 */
	public Adapter createNAMEDTYPEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.NAMEDUNIT <em>NAMEDUNIT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.NAMEDUNIT
	 * @generated
	 */
	public Adapter createNAMEDUNITAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.NONDEPENDENTPDET <em>NONDEPENDENTPDET</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.NONDEPENDENTPDET
	 * @generated
	 */
	public Adapter createNONDEPENDENTPDETAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.NONINSTANTIABLEFUNCTIONALVIEWCLASS <em>NONINSTANTIABLEFUNCTIONALVIEWCLASS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.NONINSTANTIABLEFUNCTIONALVIEWCLASS
	 * @generated
	 */
	public Adapter createNONINSTANTIABLEFUNCTIONALVIEWCLASSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.NONQUANTITATIVECODETYPE <em>NONQUANTITATIVECODETYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.NONQUANTITATIVECODETYPE
	 * @generated
	 */
	public Adapter createNONQUANTITATIVECODETYPEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.NONQUANTITATIVEINTTYPE <em>NONQUANTITATIVEINTTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.NONQUANTITATIVEINTTYPE
	 * @generated
	 */
	public Adapter createNONQUANTITATIVEINTTYPEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.NONSIUNIT <em>NONSIUNIT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.NONSIUNIT
	 * @generated
	 */
	public Adapter createNONSIUNITAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.NONTRANSLATABLESTRINGTYPE <em>NONTRANSLATABLESTRINGTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.NONTRANSLATABLESTRINGTYPE
	 * @generated
	 */
	public Adapter createNONTRANSLATABLESTRINGTYPEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.NUMBERTYPE <em>NUMBERTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.NUMBERTYPE
	 * @generated
	 */
	public Adapter createNUMBERTYPEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ONTOML <em>ONTOML</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ONTOML
	 * @generated
	 */
	public Adapter createONTOMLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ORGANIZATION <em>ORGANIZATION</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ORGANIZATION
	 * @generated
	 */
	public Adapter createORGANIZATIONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PERSON <em>PERSON</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PERSON
	 * @generated
	 */
	public Adapter createPERSONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PLACEMENTTYPE <em>PLACEMENTTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PLACEMENTTYPE
	 * @generated
	 */
	public Adapter createPLACEMENTTYPEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.POSTCONDITION <em>POSTCONDITION</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.POSTCONDITION
	 * @generated
	 */
	public Adapter createPOSTCONDITIONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PRECONDITION <em>PRECONDITION</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PRECONDITION
	 * @generated
	 */
	public Adapter createPRECONDITIONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PREFERREDNAMELABEL <em>PREFERREDNAMELABEL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PREFERREDNAMELABEL
	 * @generated
	 */
	public Adapter createPREFERREDNAMELABELAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PREFERREDNAME <em>PREFERREDNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PREFERREDNAME
	 * @generated
	 */
	public Adapter createPREFERREDNAMEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PROGRAMREFERENCETYPE <em>PROGRAMREFERENCETYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PROGRAMREFERENCETYPE
	 * @generated
	 */
	public Adapter createPROGRAMREFERENCETYPEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PROPERTIESREFERENCE <em>PROPERTIESREFERENCE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PROPERTIESREFERENCE
	 * @generated
	 */
	public Adapter createPROPERTIESREFERENCEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PROPERTYCLASSIFICATION <em>PROPERTYCLASSIFICATION</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PROPERTYCLASSIFICATION
	 * @generated
	 */
	public Adapter createPROPERTYCLASSIFICATIONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PROPERTYCONSTRAINT <em>PROPERTYCONSTRAINT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PROPERTYCONSTRAINT
	 * @generated
	 */
	public Adapter createPROPERTYCONSTRAINTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PROPERTYMAPPING <em>PROPERTYMAPPING</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PROPERTYMAPPING
	 * @generated
	 */
	public Adapter createPROPERTYMAPPINGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PROPERTYREFERENCE <em>PROPERTYREFERENCE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PROPERTYREFERENCE
	 * @generated
	 */
	public Adapter createPROPERTYREFERENCEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PROPERTY <em>PROPERTY</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PROPERTY
	 * @generated
	 */
	public Adapter createPROPERTYAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PROPERTYVALUERECOMMENDEDPRESENTATION <em>PROPERTYVALUERECOMMENDEDPRESENTATION</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PROPERTYVALUERECOMMENDEDPRESENTATION
	 * @generated
	 */
	public Adapter createPROPERTYVALUERECOMMENDEDPRESENTATIONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.RANGECONSTRAINT <em>RANGECONSTRAINT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.RANGECONSTRAINT
	 * @generated
	 */
	public Adapter createRANGECONSTRAINTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.RATIONALMEASURETYPE <em>RATIONALMEASURETYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.RATIONALMEASURETYPE
	 * @generated
	 */
	public Adapter createRATIONALMEASURETYPEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.RATIONALTYPE <em>RATIONALTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.RATIONALTYPE
	 * @generated
	 */
	public Adapter createRATIONALTYPEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.REALCURRENCYTYPE <em>REALCURRENCYTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.REALCURRENCYTYPE
	 * @generated
	 */
	public Adapter createREALCURRENCYTYPEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.REALMEASURETYPE <em>REALMEASURETYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.REALMEASURETYPE
	 * @generated
	 */
	public Adapter createREALMEASURETYPEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.REALTYPE <em>REALTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.REALTYPE
	 * @generated
	 */
	public Adapter createREALTYPEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.RECOMMENDEDPRESENTATION <em>RECOMMENDEDPRESENTATION</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.RECOMMENDEDPRESENTATION
	 * @generated
	 */
	public Adapter createRECOMMENDEDPRESENTATIONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.REFERENCEDDOCUMENT <em>REFERENCEDDOCUMENT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.REFERENCEDDOCUMENT
	 * @generated
	 */
	public Adapter createREFERENCEDDOCUMENTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.REFERENCEDGRAPHICS <em>REFERENCEDGRAPHICS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.REFERENCEDGRAPHICS
	 * @generated
	 */
	public Adapter createREFERENCEDGRAPHICSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.REMOTELOCATIONS <em>REMOTELOCATIONS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.REMOTELOCATIONS
	 * @generated
	 */
	public Adapter createREMOTELOCATIONSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.RemoteLocation <em>Remote Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.RemoteLocation
	 * @generated
	 */
	public Adapter createRemoteLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.REPRESENTATIONPDET <em>REPRESENTATIONPDET</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.REPRESENTATIONPDET
	 * @generated
	 */
	public Adapter createREPRESENTATIONPDETAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.REPRESENTATIONREFERENCETYPE <em>REPRESENTATIONREFERENCETYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.REPRESENTATIONREFERENCETYPE
	 * @generated
	 */
	public Adapter createREPRESENTATIONREFERENCETYPEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SETTYPE <em>SETTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SETTYPE
	 * @generated
	 */
	public Adapter createSETTYPEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SETWITHSUBSETCONSTRAINTTYPE <em>SETWITHSUBSETCONSTRAINTTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SETWITHSUBSETCONSTRAINTTYPE
	 * @generated
	 */
	public Adapter createSETWITHSUBSETCONSTRAINTTYPEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SHORTNAMELABEL <em>SHORTNAMELABEL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SHORTNAMELABEL
	 * @generated
	 */
	public Adapter createSHORTNAMELABELAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SHORTNAME <em>SHORTNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SHORTNAME
	 * @generated
	 */
	public Adapter createSHORTNAMEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SIUNIT <em>SIUNIT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SIUNIT
	 * @generated
	 */
	public Adapter createSIUNITAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SOURCEDOCUMENT <em>SOURCEDOCUMENT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SOURCEDOCUMENT
	 * @generated
	 */
	public Adapter createSOURCEDOCUMENTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.STRINGDICVALUE <em>STRINGDICVALUE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.STRINGDICVALUE
	 * @generated
	 */
	public Adapter createSTRINGDICVALUEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.STRINGPATTERNCONSTRAINT <em>STRINGPATTERNCONSTRAINT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.STRINGPATTERNCONSTRAINT
	 * @generated
	 */
	public Adapter createSTRINGPATTERNCONSTRAINTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.STRINGSIZECONSTRAINT <em>STRINGSIZECONSTRAINT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.STRINGSIZECONSTRAINT
	 * @generated
	 */
	public Adapter createSTRINGSIZECONSTRAINTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.STRINGS <em>STRINGS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.STRINGS
	 * @generated
	 */
	public Adapter createSTRINGSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.STRINGTYPE <em>STRINGTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.STRINGTYPE
	 * @generated
	 */
	public Adapter createSTRINGTYPEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SUBCLASSCONSTRAINT <em>SUBCLASSCONSTRAINT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SUBCLASSCONSTRAINT
	 * @generated
	 */
	public Adapter createSUBCLASSCONSTRAINTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SUBSET <em>SUBSET</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SUBSET
	 * @generated
	 */
	public Adapter createSUBSETAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SUPPLIERREFERENCE <em>SUPPLIERREFERENCE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SUPPLIERREFERENCE
	 * @generated
	 */
	public Adapter createSUPPLIERREFERENCEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SUPPLIERSREFERENCE <em>SUPPLIERSREFERENCE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SUPPLIERSREFERENCE
	 * @generated
	 */
	public Adapter createSUPPLIERSREFERENCEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SUPPLIER <em>SUPPLIER</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SUPPLIER
	 * @generated
	 */
	public Adapter createSUPPLIERAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SUPPORTEDVEP <em>SUPPORTEDVEP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SUPPORTEDVEP
	 * @generated
	 */
	public Adapter createSUPPORTEDVEPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SYNONYMOUSNAMELABEL <em>SYNONYMOUSNAMELABEL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SYNONYMOUSNAMELABEL
	 * @generated
	 */
	public Adapter createSYNONYMOUSNAMELABELAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SYNONYMOUSNAME <em>SYNONYMOUSNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SYNONYMOUSNAME
	 * @generated
	 */
	public Adapter createSYNONYMOUSNAMEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SYNONYMOUSSYMBOLS <em>SYNONYMOUSSYMBOLS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SYNONYMOUSSYMBOLS
	 * @generated
	 */
	public Adapter createSYNONYMOUSSYMBOLSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.TEXT <em>TEXT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.TEXT
	 * @generated
	 */
	public Adapter createTEXTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.TIMEDATATYPE <em>TIMEDATATYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.TIMEDATATYPE
	 * @generated
	 */
	public Adapter createTIMEDATATYPEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.TRANSLATABLESTRINGTYPE <em>TRANSLATABLESTRINGTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.TRANSLATABLESTRINGTYPE
	 * @generated
	 */
	public Adapter createTRANSLATABLESTRINGTYPEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.TRANSLATIONDATA <em>TRANSLATIONDATA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.TRANSLATIONDATA
	 * @generated
	 */
	public Adapter createTRANSLATIONDATAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.TRANSLATION <em>TRANSLATION</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.TRANSLATION
	 * @generated
	 */
	public Adapter createTRANSLATIONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.UNIT <em>UNIT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.UNIT
	 * @generated
	 */
	public Adapter createUNITAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.URITYPE <em>URITYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.URITYPE
	 * @generated
	 */
	public Adapter createURITYPEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.VCVRANGE <em>VCVRANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.VCVRANGE
	 * @generated
	 */
	public Adapter createVCVRANGEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.VIEWCONTROLVARIABLERANGE <em>VIEWCONTROLVARIABLERANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.VIEWCONTROLVARIABLERANGE
	 * @generated
	 */
	public Adapter createVIEWCONTROLVARIABLERANGEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.VIEWEXCHANGEPROTOCOLIDENTIFICATION <em>VIEWEXCHANGEPROTOCOLIDENTIFICATION</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.VIEWEXCHANGEPROTOCOLIDENTIFICATION
	 * @generated
	 */
	public Adapter createVIEWEXCHANGEPROTOCOLIDENTIFICATIONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedAdapterFactory
