/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage
 * @generated
 */
public class Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedSwitch() {
		if (modelPackage == null) {
			modelPackage = Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ALTERNATIVEUNITS: {
				ALTERNATIVEUNITS alternativeunits = (ALTERNATIVEUNITS)theEObject;
				T result = caseALTERNATIVEUNITS(alternativeunits);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ANYTYPE: {
				ANYTYPE anytype = (ANYTYPE)theEObject;
				T result = caseANYTYPE(anytype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.APOSTERIORICASEOF: {
				APOSTERIORICASEOF aposterioricaseof = (APOSTERIORICASEOF)theEObject;
				T result = caseAPOSTERIORICASEOF(aposterioricaseof);
				if (result == null) result = caseAPOSTERIORISEMANTICRELATIONSHIP(aposterioricaseof);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.APOSTERIORISEMANTICRELATIONSHIPS: {
				APOSTERIORISEMANTICRELATIONSHIPS aposteriorisemanticrelationships = (APOSTERIORISEMANTICRELATIONSHIPS)theEObject;
				T result = caseAPOSTERIORISEMANTICRELATIONSHIPS(aposteriorisemanticrelationships);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.APOSTERIORISEMANTICRELATIONSHIP: {
				APOSTERIORISEMANTICRELATIONSHIP aposteriorisemanticrelationship = (APOSTERIORISEMANTICRELATIONSHIP)theEObject;
				T result = caseAPOSTERIORISEMANTICRELATIONSHIP(aposteriorisemanticrelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.APOSTERIORIVIEWOF: {
				APOSTERIORIVIEWOF aposterioriviewof = (APOSTERIORIVIEWOF)theEObject;
				T result = caseAPOSTERIORIVIEWOF(aposterioriviewof);
				if (result == null) result = caseAPOSTERIORISEMANTICRELATIONSHIP(aposterioriviewof);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ARRAYTYPE: {
				ARRAYTYPE arraytype = (ARRAYTYPE)theEObject;
				T result = caseARRAYTYPE(arraytype);
				if (result == null) result = caseANYTYPE(arraytype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ASSIGNEDVALUE: {
				ASSIGNEDVALUE assignedvalue = (ASSIGNEDVALUE)theEObject;
				T result = caseASSIGNEDVALUE(assignedvalue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.AUTHORS: {
				AUTHORS authors = (AUTHORS)theEObject;
				T result = caseAUTHORS(authors);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.AXIS1PLACEMENTTYPE: {
				AXIS1PLACEMENTTYPE axis1PLACEMENTTYPE = (AXIS1PLACEMENTTYPE)theEObject;
				T result = caseAXIS1PLACEMENTTYPE(axis1PLACEMENTTYPE);
				if (result == null) result = caseANYTYPE(axis1PLACEMENTTYPE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.AXIS2PLACEMENT2DTYPE: {
				AXIS2PLACEMENT2DTYPE axis2PLACEMENT2DTYPE = (AXIS2PLACEMENT2DTYPE)theEObject;
				T result = caseAXIS2PLACEMENT2DTYPE(axis2PLACEMENT2DTYPE);
				if (result == null) result = caseANYTYPE(axis2PLACEMENT2DTYPE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.AXIS2PLACEMENT3DTYPE: {
				AXIS2PLACEMENT3DTYPE axis2PLACEMENT3DTYPE = (AXIS2PLACEMENT3DTYPE)theEObject;
				T result = caseAXIS2PLACEMENT3DTYPE(axis2PLACEMENT3DTYPE);
				if (result == null) result = caseANYTYPE(axis2PLACEMENT3DTYPE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.BAGTYPE: {
				BAGTYPE bagtype = (BAGTYPE)theEObject;
				T result = caseBAGTYPE(bagtype);
				if (result == null) result = caseANYTYPE(bagtype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.BOOLEANTYPE: {
				BOOLEANTYPE booleantype = (BOOLEANTYPE)theEObject;
				T result = caseBOOLEANTYPE(booleantype);
				if (result == null) result = caseANYTYPE(booleantype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CARDINALITYCONSTRAINT: {
				CARDINALITYCONSTRAINT cardinalityconstraint = (CARDINALITYCONSTRAINT)theEObject;
				T result = caseCARDINALITYCONSTRAINT(cardinalityconstraint);
				if (result == null) result = caseDOMAINCONSTRAINT(cardinalityconstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CATEGORIZATIONCLASS: {
				CATEGORIZATIONCLASS categorizationclass = (CATEGORIZATIONCLASS)theEObject;
				T result = caseCATEGORIZATIONCLASS(categorizationclass);
				if (result == null) result = caseCLASS(categorizationclass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSCONSTANTVALUES: {
				CLASSCONSTANTVALUES classconstantvalues = (CLASSCONSTANTVALUES)theEObject;
				T result = caseCLASSCONSTANTVALUES(classconstantvalues);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSCONSTRAINT: {
				CLASSCONSTRAINT classconstraint = (CLASSCONSTRAINT)theEObject;
				T result = caseCLASSCONSTRAINT(classconstraint);
				if (result == null) result = caseCONSTRAINT(classconstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSESREFERENCE: {
				CLASSESREFERENCE classesreference = (CLASSESREFERENCE)theEObject;
				T result = caseCLASSESREFERENCE(classesreference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION: {
				CLASSEXTENSION classextension = (CLASSEXTENSION)theEObject;
				T result = caseCLASSEXTENSION(classextension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSIFICATION: {
				CLASSIFICATION classification = (CLASSIFICATION)theEObject;
				T result = caseCLASSIFICATION(classification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSPRESENTATIONONPAPER: {
				CLASSPRESENTATIONONPAPER classpresentationonpaper = (CLASSPRESENTATIONONPAPER)theEObject;
				T result = caseCLASSPRESENTATIONONPAPER(classpresentationonpaper);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSPRESENTATIONONSCREEN: {
				CLASSPRESENTATIONONSCREEN classpresentationonscreen = (CLASSPRESENTATIONONSCREEN)theEObject;
				T result = caseCLASSPRESENTATIONONSCREEN(classpresentationonscreen);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSREFERENCE: {
				CLASSREFERENCE classreference = (CLASSREFERENCE)theEObject;
				T result = caseCLASSREFERENCE(classreference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSREFERENCETYPE: {
				CLASSREFERENCETYPE classreferencetype = (CLASSREFERENCETYPE)theEObject;
				T result = caseCLASSREFERENCETYPE(classreferencetype);
				if (result == null) result = caseANYTYPE(classreferencetype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS: {
				CLASS class_ = (CLASS)theEObject;
				T result = caseCLASS(class_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSVALUEASSIGNMENT: {
				CLASSVALUEASSIGNMENT classvalueassignment = (CLASSVALUEASSIGNMENT)theEObject;
				T result = caseCLASSVALUEASSIGNMENT(classvalueassignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONDITIONDET: {
				CONDITIONDET conditiondet = (CONDITIONDET)theEObject;
				T result = caseCONDITIONDET(conditiondet);
				if (result == null) result = casePROPERTY(conditiondet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONFIGURATIONCONTROLCONSTRAINT: {
				CONFIGURATIONCONTROLCONSTRAINT configurationcontrolconstraint = (CONFIGURATIONCONTROLCONSTRAINT)theEObject;
				T result = caseCONFIGURATIONCONTROLCONSTRAINT(configurationcontrolconstraint);
				if (result == null) result = caseCLASSCONSTRAINT(configurationcontrolconstraint);
				if (result == null) result = caseCONSTRAINT(configurationcontrolconstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONSTRAINTORCONSTRAINTID: {
				CONSTRAINTORCONSTRAINTID constraintorconstraintid = (CONSTRAINTORCONSTRAINTID)theEObject;
				T result = caseCONSTRAINTORCONSTRAINTID(constraintorconstraintid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONSTRAINTS: {
				CONSTRAINTS constraints = (CONSTRAINTS)theEObject;
				T result = caseCONSTRAINTS(constraints);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONSTRAINT: {
				CONSTRAINT constraint = (CONSTRAINT)theEObject;
				T result = caseCONSTRAINT(constraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONTAINEDCLASSES: {
				CONTAINEDCLASSES containedclasses = (CONTAINEDCLASSES)theEObject;
				T result = caseCONTAINEDCLASSES(containedclasses);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONTAINEDCLASSEXTENSIONS: {
				CONTAINEDCLASSEXTENSIONS containedclassextensions = (CONTAINEDCLASSEXTENSIONS)theEObject;
				T result = caseCONTAINEDCLASSEXTENSIONS(containedclassextensions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONTAINEDDATATYPES: {
				CONTAINEDDATATYPES containeddatatypes = (CONTAINEDDATATYPES)theEObject;
				T result = caseCONTAINEDDATATYPES(containeddatatypes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONTAINEDDOCUMENTS: {
				CONTAINEDDOCUMENTS containeddocuments = (CONTAINEDDOCUMENTS)theEObject;
				T result = caseCONTAINEDDOCUMENTS(containeddocuments);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONTAINEDPROPERTIES: {
				CONTAINEDPROPERTIES containedproperties = (CONTAINEDPROPERTIES)theEObject;
				T result = caseCONTAINEDPROPERTIES(containedproperties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONTAINEDSUPPLIERS: {
				CONTAINEDSUPPLIERS containedsuppliers = (CONTAINEDSUPPLIERS)theEObject;
				T result = caseCONTAINEDSUPPLIERS(containedsuppliers);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONTEXTDEPENDENTUNIT: {
				CONTEXTDEPENDENTUNIT contextdependentunit = (CONTEXTDEPENDENTUNIT)theEObject;
				T result = caseCONTEXTDEPENDENTUNIT(contextdependentunit);
				if (result == null) result = caseNAMEDUNIT(contextdependentunit);
				if (result == null) result = caseUNIT(contextdependentunit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONTEXTPARAMETERCONSTRAINTS: {
				CONTEXTPARAMETERCONSTRAINTS contextparameterconstraints = (CONTEXTPARAMETERCONSTRAINTS)theEObject;
				T result = caseCONTEXTPARAMETERCONSTRAINTS(contextparameterconstraints);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONTEXTPARAMICON: {
				CONTEXTPARAMICON contextparamicon = (CONTEXTPARAMICON)theEObject;
				T result = caseCONTEXTPARAMICON(contextparamicon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONTEXTRESTRICTIONCONSTRAINT: {
				CONTEXTRESTRICTIONCONSTRAINT contextrestrictionconstraint = (CONTEXTRESTRICTIONCONSTRAINT)theEObject;
				T result = caseCONTEXTRESTRICTIONCONSTRAINT(contextrestrictionconstraint);
				if (result == null) result = casePROPERTYCONSTRAINT(contextrestrictionconstraint);
				if (result == null) result = caseCONSTRAINT(contextrestrictionconstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONVERSIONBASEDUNIT: {
				CONVERSIONBASEDUNIT conversionbasedunit = (CONVERSIONBASEDUNIT)theEObject;
				T result = caseCONVERSIONBASEDUNIT(conversionbasedunit);
				if (result == null) result = caseNAMEDUNIT(conversionbasedunit);
				if (result == null) result = caseUNIT(conversionbasedunit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CORRESPONDINGPROPERTIES: {
				CORRESPONDINGPROPERTIES correspondingproperties = (CORRESPONDINGPROPERTIES)theEObject;
				T result = caseCORRESPONDINGPROPERTIES(correspondingproperties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CREATEICON: {
				CREATEICON createicon = (CREATEICON)theEObject;
				T result = caseCREATEICON(createicon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DATATYPEREFERENCE: {
				DATATYPEREFERENCE datatypereference = (DATATYPEREFERENCE)theEObject;
				T result = caseDATATYPEREFERENCE(datatypereference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DATATYPESREFERENCE: {
				DATATYPESREFERENCE datatypesreference = (DATATYPESREFERENCE)theEObject;
				T result = caseDATATYPESREFERENCE(datatypesreference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DATATYPE: {
				DATATYPE datatype = (DATATYPE)theEObject;
				T result = caseDATATYPE(datatype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DATEDATATYPE: {
				DATEDATATYPE datedatatype = (DATEDATATYPE)theEObject;
				T result = caseDATEDATATYPE(datedatatype);
				if (result == null) result = caseANYTYPE(datedatatype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DATETIMEDATATYPE: {
				DATETIMEDATATYPE datetimedatatype = (DATETIMEDATATYPE)theEObject;
				T result = caseDATETIMEDATATYPE(datetimedatatype);
				if (result == null) result = caseANYTYPE(datetimedatatype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DEPENDENTPDET: {
				DEPENDENTPDET dependentpdet = (DEPENDENTPDET)theEObject;
				T result = caseDEPENDENTPDET(dependentpdet);
				if (result == null) result = casePROPERTY(dependentpdet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DERIVEDUNITELEMENT: {
				DERIVEDUNITELEMENT derivedunitelement = (DERIVEDUNITELEMENT)theEObject;
				T result = caseDERIVEDUNITELEMENT(derivedunitelement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DERIVEDUNIT: {
				DERIVEDUNIT derivedunit = (DERIVEDUNIT)theEObject;
				T result = caseDERIVEDUNIT(derivedunit);
				if (result == null) result = caseUNIT(derivedunit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARIESREFERENCE: {
				DICTIONARIESREFERENCE dictionariesreference = (DICTIONARIESREFERENCE)theEObject;
				T result = caseDICTIONARIESREFERENCE(dictionariesreference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARYINSTANDARDFORMAT: {
				DICTIONARYINSTANDARDFORMAT dictionaryinstandardformat = (DICTIONARYINSTANDARDFORMAT)theEObject;
				T result = caseDICTIONARYINSTANDARDFORMAT(dictionaryinstandardformat);
				if (result == null) result = caseDICTIONARY(dictionaryinstandardformat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARYREFERENCE: {
				DICTIONARYREFERENCE dictionaryreference = (DICTIONARYREFERENCE)theEObject;
				T result = caseDICTIONARYREFERENCE(dictionaryreference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY: {
				DICTIONARY dictionary = (DICTIONARY)theEObject;
				T result = caseDICTIONARY(dictionary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICUNITREFERENCE: {
				DICUNITREFERENCE dicunitreference = (DICUNITREFERENCE)theEObject;
				T result = caseDICUNITREFERENCE(dicunitreference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICUNITSREFERENCE: {
				DICUNITSREFERENCE dicunitsreference = (DICUNITSREFERENCE)theEObject;
				T result = caseDICUNITSREFERENCE(dicunitsreference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICUNIT: {
				DICUNIT dicunit = (DICUNIT)theEObject;
				T result = caseDICUNIT(dicunit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICVALUE: {
				DICVALUE dicvalue = (DICVALUE)theEObject;
				T result = caseDICVALUE(dicvalue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DIMENSIONALEXPONENTS: {
				DIMENSIONALEXPONENTS dimensionalexponents = (DIMENSIONALEXPONENTS)theEObject;
				T result = caseDIMENSIONALEXPONENTS(dimensionalexponents);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DOCUMENTCONTENT: {
				DOCUMENTCONTENT documentcontent = (DOCUMENTCONTENT)theEObject;
				T result = caseDOCUMENTCONTENT(documentcontent);
				if (result == null) result = caseEXTERNALRESOURCE(documentcontent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DOCUMENTIDENTIFIERNAMELABEL: {
				DOCUMENTIDENTIFIERNAMELABEL documentidentifiernamelabel = (DOCUMENTIDENTIFIERNAMELABEL)theEObject;
				T result = caseDOCUMENTIDENTIFIERNAMELABEL(documentidentifiernamelabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DOCUMENTIDENTIFIER: {
				DOCUMENTIDENTIFIER documentidentifier = (DOCUMENTIDENTIFIER)theEObject;
				T result = caseDOCUMENTIDENTIFIER(documentidentifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DOCUMENTREFERENCE: {
				DOCUMENTREFERENCE documentreference = (DOCUMENTREFERENCE)theEObject;
				T result = caseDOCUMENTREFERENCE(documentreference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DOCUMENTSREFERENCE: {
				DOCUMENTSREFERENCE documentsreference = (DOCUMENTSREFERENCE)theEObject;
				T result = caseDOCUMENTSREFERENCE(documentsreference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DOCUMENT: {
				DOCUMENT document = (DOCUMENT)theEObject;
				T result = caseDOCUMENT(document);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DOMAINCONSTRAINTS: {
				DOMAINCONSTRAINTS domainconstraints = (DOMAINCONSTRAINTS)theEObject;
				T result = caseDOMAINCONSTRAINTS(domainconstraints);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DOMAINCONSTRAINT: {
				DOMAINCONSTRAINT domainconstraint = (DOMAINCONSTRAINT)theEObject;
				T result = caseDOMAINCONSTRAINT(domainconstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ENUMERATIONCONSTRAINT: {
				ENUMERATIONCONSTRAINT enumerationconstraint = (ENUMERATIONCONSTRAINT)theEObject;
				T result = caseENUMERATIONCONSTRAINT(enumerationconstraint);
				if (result == null) result = caseDOMAINCONSTRAINT(enumerationconstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION: {
				EXPLICITFUNCTIONALMODELCLASSEXTENSION explicitfunctionalmodelclassextension = (EXPLICITFUNCTIONALMODELCLASSEXTENSION)theEObject;
				T result = caseEXPLICITFUNCTIONALMODELCLASSEXTENSION(explicitfunctionalmodelclassextension);
				if (result == null) result = caseCLASSEXTENSION(explicitfunctionalmodelclassextension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITITEMCLASSEXTENSION: {
				EXPLICITITEMCLASSEXTENSION explicititemclassextension = (EXPLICITITEMCLASSEXTENSION)theEObject;
				T result = caseEXPLICITITEMCLASSEXTENSION(explicititemclassextension);
				if (result == null) result = caseCLASSEXTENSION(explicititemclassextension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXTERNALFILES: {
				EXTERNALFILES externalfiles = (EXTERNALFILES)theEObject;
				T result = caseEXTERNALFILES(externalfiles);
				if (result == null) result = caseEXTERNALRESOURCE(externalfiles);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXTERNALGRAPHICS: {
				EXTERNALGRAPHICS externalgraphics = (EXTERNALGRAPHICS)theEObject;
				T result = caseEXTERNALGRAPHICS(externalgraphics);
				if (result == null) result = caseGRAPHICS(externalgraphics);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXTERNALRESOURCE: {
				EXTERNALRESOURCE externalresource = (EXTERNALRESOURCE)theEObject;
				T result = caseEXTERNALRESOURCE(externalresource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FILTER: {
				FILTER filter = (FILTER)theEObject;
				T result = caseFILTER(filter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF: {
				FMCLASSVIEWOF fmclassviewof = (FMCLASSVIEWOF)theEObject;
				T result = caseFMCLASSVIEWOF(fmclassviewof);
				if (result == null) result = caseCLASS(fmclassviewof);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FUNCTIONALMODELCLASS: {
				FUNCTIONALMODELCLASS functionalmodelclass = (FUNCTIONALMODELCLASS)theEObject;
				T result = caseFUNCTIONALMODELCLASS(functionalmodelclass);
				if (result == null) result = caseCLASS(functionalmodelclass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.GENERALTEXT: {
				GENERALTEXT generaltext = (GENERALTEXT)theEObject;
				T result = caseGENERALTEXT(generaltext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.GEOMETRICCONTEXT: {
				GEOMETRICCONTEXT geometriccontext = (GEOMETRICCONTEXT)theEObject;
				T result = caseGEOMETRICCONTEXT(geometriccontext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.GEOMETRICUNITCONTEXT: {
				GEOMETRICUNITCONTEXT geometricunitcontext = (GEOMETRICUNITCONTEXT)theEObject;
				T result = caseGEOMETRICUNITCONTEXT(geometricunitcontext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.GRAPHICS: {
				GRAPHICS graphics = (GRAPHICS)theEObject;
				T result = caseGRAPHICS(graphics);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER: {
				HEADER header = (HEADER)theEObject;
				T result = caseHEADER(header);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HTTPFILE: {
				HTTPFILE httpfile = (HTTPFILE)theEObject;
				T result = caseHTTPFILE(httpfile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.IDENTIFIEDDOCUMENT: {
				IDENTIFIEDDOCUMENT identifieddocument = (IDENTIFIEDDOCUMENT)theEObject;
				T result = caseIDENTIFIEDDOCUMENT(identifieddocument);
				if (result == null) result = caseSOURCEDOCUMENT(identifieddocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ILLUSTRATION: {
				ILLUSTRATION illustration = (ILLUSTRATION)theEObject;
				T result = caseILLUSTRATION(illustration);
				if (result == null) result = caseEXTERNALRESOURCE(illustration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.INFORMATION: {
				INFORMATION information = (INFORMATION)theEObject;
				T result = caseINFORMATION(information);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.INTCURRENCYTYPE: {
				INTCURRENCYTYPE intcurrencytype = (INTCURRENCYTYPE)theEObject;
				T result = caseINTCURRENCYTYPE(intcurrencytype);
				if (result == null) result = caseANYTYPE(intcurrencytype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.INTDICVALUE: {
				INTDICVALUE intdicvalue = (INTDICVALUE)theEObject;
				T result = caseINTDICVALUE(intdicvalue);
				if (result == null) result = caseDICVALUE(intdicvalue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.INTEGRITYCONSTRAINT: {
				INTEGRITYCONSTRAINT integrityconstraint = (INTEGRITYCONSTRAINT)theEObject;
				T result = caseINTEGRITYCONSTRAINT(integrityconstraint);
				if (result == null) result = casePROPERTYCONSTRAINT(integrityconstraint);
				if (result == null) result = caseCONSTRAINT(integrityconstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.INTMEASURETYPE: {
				INTMEASURETYPE intmeasuretype = (INTMEASURETYPE)theEObject;
				T result = caseINTMEASURETYPE(intmeasuretype);
				if (result == null) result = caseANYTYPE(intmeasuretype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.INTTYPE: {
				INTTYPE inttype = (INTTYPE)theEObject;
				T result = caseINTTYPE(inttype);
				if (result == null) result = caseANYTYPE(inttype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF: {
				ITEMCLASSCASEOF itemclasscaseof = (ITEMCLASSCASEOF)theEObject;
				T result = caseITEMCLASSCASEOF(itemclasscaseof);
				if (result == null) result = caseCLASS(itemclasscaseof);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASS: {
				ITEMCLASS itemclass = (ITEMCLASS)theEObject;
				T result = caseITEMCLASS(itemclass);
				if (result == null) result = caseCLASS(itemclass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITSVALUES: {
				ITSVALUES itsvalues = (ITSVALUES)theEObject;
				T result = caseITSVALUES(itsvalues);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.KEYWORDLABEL: {
				KEYWORDLABEL keywordlabel = (KEYWORDLABEL)theEObject;
				T result = caseKEYWORDLABEL(keywordlabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.KEYWORD: {
				KEYWORD keyword = (KEYWORD)theEObject;
				T result = caseKEYWORD(keyword);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.LANGUAGE: {
				LANGUAGE language = (LANGUAGE)theEObject;
				T result = caseLANGUAGE(language);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.LEVEL: {
				LEVEL level = (LEVEL)theEObject;
				T result = caseLEVEL(level);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.LEVELTYPE: {
				LEVELTYPE leveltype = (LEVELTYPE)theEObject;
				T result = caseLEVELTYPE(leveltype);
				if (result == null) result = caseANYTYPE(leveltype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.LIBRARYIIMIDENTIFICATION: {
				LIBRARYIIMIDENTIFICATION libraryiimidentification = (LIBRARYIIMIDENTIFICATION)theEObject;
				T result = caseLIBRARYIIMIDENTIFICATION(libraryiimidentification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.LIBRARYINSTANDARDFORMAT: {
				LIBRARYINSTANDARDFORMAT libraryinstandardformat = (LIBRARYINSTANDARDFORMAT)theEObject;
				T result = caseLIBRARYINSTANDARDFORMAT(libraryinstandardformat);
				if (result == null) result = caseLIBRARY(libraryinstandardformat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.LIBRARY: {
				LIBRARY library = (LIBRARY)theEObject;
				T result = caseLIBRARY(library);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.LISTTYPE: {
				LISTTYPE listtype = (LISTTYPE)theEObject;
				T result = caseLISTTYPE(listtype);
				if (result == null) result = caseANYTYPE(listtype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.MAPPINGFUNCTION: {
				MAPPINGFUNCTION mappingfunction = (MAPPINGFUNCTION)theEObject;
				T result = caseMAPPINGFUNCTION(mappingfunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.MATHEMATICALSTRING: {
				MATHEMATICALSTRING mathematicalstring = (MATHEMATICALSTRING)theEObject;
				T result = caseMATHEMATICALSTRING(mathematicalstring);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.MESSAGE: {
				MESSAGE message = (MESSAGE)theEObject;
				T result = caseMESSAGE(message);
				if (result == null) result = caseEXTERNALRESOURCE(message);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NAMEDTYPE: {
				NAMEDTYPE namedtype = (NAMEDTYPE)theEObject;
				T result = caseNAMEDTYPE(namedtype);
				if (result == null) result = caseANYTYPE(namedtype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NAMEDUNIT: {
				NAMEDUNIT namedunit = (NAMEDUNIT)theEObject;
				T result = caseNAMEDUNIT(namedunit);
				if (result == null) result = caseUNIT(namedunit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONDEPENDENTPDET: {
				NONDEPENDENTPDET nondependentpdet = (NONDEPENDENTPDET)theEObject;
				T result = caseNONDEPENDENTPDET(nondependentpdet);
				if (result == null) result = casePROPERTY(nondependentpdet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONINSTANTIABLEFUNCTIONALVIEWCLASS: {
				NONINSTANTIABLEFUNCTIONALVIEWCLASS noninstantiablefunctionalviewclass = (NONINSTANTIABLEFUNCTIONALVIEWCLASS)theEObject;
				T result = caseNONINSTANTIABLEFUNCTIONALVIEWCLASS(noninstantiablefunctionalviewclass);
				if (result == null) result = caseCLASS(noninstantiablefunctionalviewclass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONQUANTITATIVECODETYPE: {
				NONQUANTITATIVECODETYPE nonquantitativecodetype = (NONQUANTITATIVECODETYPE)theEObject;
				T result = caseNONQUANTITATIVECODETYPE(nonquantitativecodetype);
				if (result == null) result = caseANYTYPE(nonquantitativecodetype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONQUANTITATIVEINTTYPE: {
				NONQUANTITATIVEINTTYPE nonquantitativeinttype = (NONQUANTITATIVEINTTYPE)theEObject;
				T result = caseNONQUANTITATIVEINTTYPE(nonquantitativeinttype);
				if (result == null) result = caseANYTYPE(nonquantitativeinttype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONSIUNIT: {
				NONSIUNIT nonsiunit = (NONSIUNIT)theEObject;
				T result = caseNONSIUNIT(nonsiunit);
				if (result == null) result = caseNAMEDUNIT(nonsiunit);
				if (result == null) result = caseUNIT(nonsiunit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NONTRANSLATABLESTRINGTYPE: {
				NONTRANSLATABLESTRINGTYPE nontranslatablestringtype = (NONTRANSLATABLESTRINGTYPE)theEObject;
				T result = caseNONTRANSLATABLESTRINGTYPE(nontranslatablestringtype);
				if (result == null) result = caseANYTYPE(nontranslatablestringtype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.NUMBERTYPE: {
				NUMBERTYPE numbertype = (NUMBERTYPE)theEObject;
				T result = caseNUMBERTYPE(numbertype);
				if (result == null) result = caseANYTYPE(numbertype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ONTOML: {
				ONTOML ontoml = (ONTOML)theEObject;
				T result = caseONTOML(ontoml);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ORGANIZATION: {
				ORGANIZATION organization = (ORGANIZATION)theEObject;
				T result = caseORGANIZATION(organization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PERSON: {
				PERSON person = (PERSON)theEObject;
				T result = casePERSON(person);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PLACEMENTTYPE: {
				PLACEMENTTYPE placementtype = (PLACEMENTTYPE)theEObject;
				T result = casePLACEMENTTYPE(placementtype);
				if (result == null) result = caseANYTYPE(placementtype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.POSTCONDITION: {
				POSTCONDITION postcondition = (POSTCONDITION)theEObject;
				T result = casePOSTCONDITION(postcondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PRECONDITION: {
				PRECONDITION precondition = (PRECONDITION)theEObject;
				T result = casePRECONDITION(precondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PREFERREDNAMELABEL: {
				PREFERREDNAMELABEL preferrednamelabel = (PREFERREDNAMELABEL)theEObject;
				T result = casePREFERREDNAMELABEL(preferrednamelabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PREFERREDNAME: {
				PREFERREDNAME preferredname = (PREFERREDNAME)theEObject;
				T result = casePREFERREDNAME(preferredname);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROGRAMREFERENCETYPE: {
				PROGRAMREFERENCETYPE programreferencetype = (PROGRAMREFERENCETYPE)theEObject;
				T result = casePROGRAMREFERENCETYPE(programreferencetype);
				if (result == null) result = caseANYTYPE(programreferencetype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROPERTIESREFERENCE: {
				PROPERTIESREFERENCE propertiesreference = (PROPERTIESREFERENCE)theEObject;
				T result = casePROPERTIESREFERENCE(propertiesreference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROPERTYCLASSIFICATION: {
				PROPERTYCLASSIFICATION propertyclassification = (PROPERTYCLASSIFICATION)theEObject;
				T result = casePROPERTYCLASSIFICATION(propertyclassification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROPERTYCONSTRAINT: {
				PROPERTYCONSTRAINT propertyconstraint = (PROPERTYCONSTRAINT)theEObject;
				T result = casePROPERTYCONSTRAINT(propertyconstraint);
				if (result == null) result = caseCONSTRAINT(propertyconstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROPERTYMAPPING: {
				PROPERTYMAPPING propertymapping = (PROPERTYMAPPING)theEObject;
				T result = casePROPERTYMAPPING(propertymapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROPERTYREFERENCE: {
				PROPERTYREFERENCE propertyreference = (PROPERTYREFERENCE)theEObject;
				T result = casePROPERTYREFERENCE(propertyreference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROPERTY: {
				PROPERTY property = (PROPERTY)theEObject;
				T result = casePROPERTY(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROPERTYVALUERECOMMENDEDPRESENTATION: {
				PROPERTYVALUERECOMMENDEDPRESENTATION propertyvaluerecommendedpresentation = (PROPERTYVALUERECOMMENDEDPRESENTATION)theEObject;
				T result = casePROPERTYVALUERECOMMENDEDPRESENTATION(propertyvaluerecommendedpresentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.RANGECONSTRAINT: {
				RANGECONSTRAINT rangeconstraint = (RANGECONSTRAINT)theEObject;
				T result = caseRANGECONSTRAINT(rangeconstraint);
				if (result == null) result = caseDOMAINCONSTRAINT(rangeconstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.RATIONALMEASURETYPE: {
				RATIONALMEASURETYPE rationalmeasuretype = (RATIONALMEASURETYPE)theEObject;
				T result = caseRATIONALMEASURETYPE(rationalmeasuretype);
				if (result == null) result = caseANYTYPE(rationalmeasuretype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.RATIONALTYPE: {
				RATIONALTYPE rationaltype = (RATIONALTYPE)theEObject;
				T result = caseRATIONALTYPE(rationaltype);
				if (result == null) result = caseANYTYPE(rationaltype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REALCURRENCYTYPE: {
				REALCURRENCYTYPE realcurrencytype = (REALCURRENCYTYPE)theEObject;
				T result = caseREALCURRENCYTYPE(realcurrencytype);
				if (result == null) result = caseANYTYPE(realcurrencytype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REALMEASURETYPE: {
				REALMEASURETYPE realmeasuretype = (REALMEASURETYPE)theEObject;
				T result = caseREALMEASURETYPE(realmeasuretype);
				if (result == null) result = caseANYTYPE(realmeasuretype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REALTYPE: {
				REALTYPE realtype = (REALTYPE)theEObject;
				T result = caseREALTYPE(realtype);
				if (result == null) result = caseANYTYPE(realtype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.RECOMMENDEDPRESENTATION: {
				RECOMMENDEDPRESENTATION recommendedpresentation = (RECOMMENDEDPRESENTATION)theEObject;
				T result = caseRECOMMENDEDPRESENTATION(recommendedpresentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REFERENCEDDOCUMENT: {
				REFERENCEDDOCUMENT referenceddocument = (REFERENCEDDOCUMENT)theEObject;
				T result = caseREFERENCEDDOCUMENT(referenceddocument);
				if (result == null) result = caseSOURCEDOCUMENT(referenceddocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REFERENCEDGRAPHICS: {
				REFERENCEDGRAPHICS referencedgraphics = (REFERENCEDGRAPHICS)theEObject;
				T result = caseREFERENCEDGRAPHICS(referencedgraphics);
				if (result == null) result = caseGRAPHICS(referencedgraphics);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REMOTELOCATIONS: {
				REMOTELOCATIONS remotelocations = (REMOTELOCATIONS)theEObject;
				T result = caseREMOTELOCATIONS(remotelocations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REMOTE_LOCATION: {
				RemoteLocation remoteLocation = (RemoteLocation)theEObject;
				T result = caseRemoteLocation(remoteLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REPRESENTATIONPDET: {
				REPRESENTATIONPDET representationpdet = (REPRESENTATIONPDET)theEObject;
				T result = caseREPRESENTATIONPDET(representationpdet);
				if (result == null) result = casePROPERTY(representationpdet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REPRESENTATIONREFERENCETYPE: {
				REPRESENTATIONREFERENCETYPE representationreferencetype = (REPRESENTATIONREFERENCETYPE)theEObject;
				T result = caseREPRESENTATIONREFERENCETYPE(representationreferencetype);
				if (result == null) result = caseANYTYPE(representationreferencetype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SETTYPE: {
				SETTYPE settype = (SETTYPE)theEObject;
				T result = caseSETTYPE(settype);
				if (result == null) result = caseANYTYPE(settype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SETWITHSUBSETCONSTRAINTTYPE: {
				SETWITHSUBSETCONSTRAINTTYPE setwithsubsetconstrainttype = (SETWITHSUBSETCONSTRAINTTYPE)theEObject;
				T result = caseSETWITHSUBSETCONSTRAINTTYPE(setwithsubsetconstrainttype);
				if (result == null) result = caseANYTYPE(setwithsubsetconstrainttype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SHORTNAMELABEL: {
				SHORTNAMELABEL shortnamelabel = (SHORTNAMELABEL)theEObject;
				T result = caseSHORTNAMELABEL(shortnamelabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SHORTNAME: {
				SHORTNAME shortname = (SHORTNAME)theEObject;
				T result = caseSHORTNAME(shortname);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SIUNIT: {
				SIUNIT siunit = (SIUNIT)theEObject;
				T result = caseSIUNIT(siunit);
				if (result == null) result = caseNAMEDUNIT(siunit);
				if (result == null) result = caseUNIT(siunit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SOURCEDOCUMENT: {
				SOURCEDOCUMENT sourcedocument = (SOURCEDOCUMENT)theEObject;
				T result = caseSOURCEDOCUMENT(sourcedocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.STRINGDICVALUE: {
				STRINGDICVALUE stringdicvalue = (STRINGDICVALUE)theEObject;
				T result = caseSTRINGDICVALUE(stringdicvalue);
				if (result == null) result = caseDICVALUE(stringdicvalue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.STRINGPATTERNCONSTRAINT: {
				STRINGPATTERNCONSTRAINT stringpatternconstraint = (STRINGPATTERNCONSTRAINT)theEObject;
				T result = caseSTRINGPATTERNCONSTRAINT(stringpatternconstraint);
				if (result == null) result = caseDOMAINCONSTRAINT(stringpatternconstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.STRINGSIZECONSTRAINT: {
				STRINGSIZECONSTRAINT stringsizeconstraint = (STRINGSIZECONSTRAINT)theEObject;
				T result = caseSTRINGSIZECONSTRAINT(stringsizeconstraint);
				if (result == null) result = caseDOMAINCONSTRAINT(stringsizeconstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.STRINGS: {
				STRINGS strings = (STRINGS)theEObject;
				T result = caseSTRINGS(strings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.STRINGTYPE: {
				STRINGTYPE stringtype = (STRINGTYPE)theEObject;
				T result = caseSTRINGTYPE(stringtype);
				if (result == null) result = caseANYTYPE(stringtype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SUBCLASSCONSTRAINT: {
				SUBCLASSCONSTRAINT subclassconstraint = (SUBCLASSCONSTRAINT)theEObject;
				T result = caseSUBCLASSCONSTRAINT(subclassconstraint);
				if (result == null) result = caseDOMAINCONSTRAINT(subclassconstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SUBSET: {
				SUBSET subset = (SUBSET)theEObject;
				T result = caseSUBSET(subset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SUPPLIERREFERENCE: {
				SUPPLIERREFERENCE supplierreference = (SUPPLIERREFERENCE)theEObject;
				T result = caseSUPPLIERREFERENCE(supplierreference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SUPPLIERSREFERENCE: {
				SUPPLIERSREFERENCE suppliersreference = (SUPPLIERSREFERENCE)theEObject;
				T result = caseSUPPLIERSREFERENCE(suppliersreference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SUPPLIER: {
				SUPPLIER supplier = (SUPPLIER)theEObject;
				T result = caseSUPPLIER(supplier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SUPPORTEDVEP: {
				SUPPORTEDVEP supportedvep = (SUPPORTEDVEP)theEObject;
				T result = caseSUPPORTEDVEP(supportedvep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SYNONYMOUSNAMELABEL: {
				SYNONYMOUSNAMELABEL synonymousnamelabel = (SYNONYMOUSNAMELABEL)theEObject;
				T result = caseSYNONYMOUSNAMELABEL(synonymousnamelabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SYNONYMOUSNAME: {
				SYNONYMOUSNAME synonymousname = (SYNONYMOUSNAME)theEObject;
				T result = caseSYNONYMOUSNAME(synonymousname);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SYNONYMOUSSYMBOLS: {
				SYNONYMOUSSYMBOLS synonymoussymbols = (SYNONYMOUSSYMBOLS)theEObject;
				T result = caseSYNONYMOUSSYMBOLS(synonymoussymbols);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.TEXT: {
				TEXT text = (TEXT)theEObject;
				T result = caseTEXT(text);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.TIMEDATATYPE: {
				TIMEDATATYPE timedatatype = (TIMEDATATYPE)theEObject;
				T result = caseTIMEDATATYPE(timedatatype);
				if (result == null) result = caseANYTYPE(timedatatype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.TRANSLATABLESTRINGTYPE: {
				TRANSLATABLESTRINGTYPE translatablestringtype = (TRANSLATABLESTRINGTYPE)theEObject;
				T result = caseTRANSLATABLESTRINGTYPE(translatablestringtype);
				if (result == null) result = caseANYTYPE(translatablestringtype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.TRANSLATIONDATA: {
				TRANSLATIONDATA translationdata = (TRANSLATIONDATA)theEObject;
				T result = caseTRANSLATIONDATA(translationdata);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.TRANSLATION: {
				TRANSLATION translation = (TRANSLATION)theEObject;
				T result = caseTRANSLATION(translation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.UNIT: {
				UNIT unit = (UNIT)theEObject;
				T result = caseUNIT(unit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.URITYPE: {
				URITYPE uritype = (URITYPE)theEObject;
				T result = caseURITYPE(uritype);
				if (result == null) result = caseANYTYPE(uritype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.VCVRANGE: {
				VCVRANGE vcvrange = (VCVRANGE)theEObject;
				T result = caseVCVRANGE(vcvrange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.VIEWCONTROLVARIABLERANGE: {
				VIEWCONTROLVARIABLERANGE viewcontrolvariablerange = (VIEWCONTROLVARIABLERANGE)theEObject;
				T result = caseVIEWCONTROLVARIABLERANGE(viewcontrolvariablerange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.VIEWEXCHANGEPROTOCOLIDENTIFICATION: {
				VIEWEXCHANGEPROTOCOLIDENTIFICATION viewexchangeprotocolidentification = (VIEWEXCHANGEPROTOCOLIDENTIFICATION)theEObject;
				T result = caseVIEWEXCHANGEPROTOCOLIDENTIFICATION(viewexchangeprotocolidentification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ALTERNATIVEUNITS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ALTERNATIVEUNITS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseALTERNATIVEUNITS(ALTERNATIVEUNITS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ANYTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ANYTYPE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseANYTYPE(ANYTYPE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APOSTERIORICASEOF</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APOSTERIORICASEOF</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPOSTERIORICASEOF(APOSTERIORICASEOF object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APOSTERIORISEMANTICRELATIONSHIPS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APOSTERIORISEMANTICRELATIONSHIPS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPOSTERIORISEMANTICRELATIONSHIPS(APOSTERIORISEMANTICRELATIONSHIPS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APOSTERIORISEMANTICRELATIONSHIP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APOSTERIORISEMANTICRELATIONSHIP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPOSTERIORISEMANTICRELATIONSHIP(APOSTERIORISEMANTICRELATIONSHIP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APOSTERIORIVIEWOF</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APOSTERIORIVIEWOF</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPOSTERIORIVIEWOF(APOSTERIORIVIEWOF object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ARRAYTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ARRAYTYPE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseARRAYTYPE(ARRAYTYPE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ASSIGNEDVALUE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ASSIGNEDVALUE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseASSIGNEDVALUE(ASSIGNEDVALUE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AUTHORS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AUTHORS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAUTHORS(AUTHORS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AXIS1PLACEMENTTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AXIS1PLACEMENTTYPE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAXIS1PLACEMENTTYPE(AXIS1PLACEMENTTYPE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AXIS2PLACEMENT2DTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AXIS2PLACEMENT2DTYPE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAXIS2PLACEMENT2DTYPE(AXIS2PLACEMENT2DTYPE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AXIS2PLACEMENT3DTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AXIS2PLACEMENT3DTYPE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAXIS2PLACEMENT3DTYPE(AXIS2PLACEMENT3DTYPE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BAGTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BAGTYPE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBAGTYPE(BAGTYPE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BOOLEANTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BOOLEANTYPE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBOOLEANTYPE(BOOLEANTYPE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CARDINALITYCONSTRAINT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CARDINALITYCONSTRAINT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCARDINALITYCONSTRAINT(CARDINALITYCONSTRAINT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CATEGORIZATIONCLASS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CATEGORIZATIONCLASS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCATEGORIZATIONCLASS(CATEGORIZATIONCLASS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CLASSCONSTANTVALUES</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CLASSCONSTANTVALUES</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCLASSCONSTANTVALUES(CLASSCONSTANTVALUES object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CLASSCONSTRAINT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CLASSCONSTRAINT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCLASSCONSTRAINT(CLASSCONSTRAINT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CLASSESREFERENCE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CLASSESREFERENCE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCLASSESREFERENCE(CLASSESREFERENCE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CLASSEXTENSION</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CLASSEXTENSION</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCLASSEXTENSION(CLASSEXTENSION object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CLASSIFICATION</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CLASSIFICATION</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCLASSIFICATION(CLASSIFICATION object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CLASSPRESENTATIONONPAPER</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CLASSPRESENTATIONONPAPER</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCLASSPRESENTATIONONPAPER(CLASSPRESENTATIONONPAPER object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CLASSPRESENTATIONONSCREEN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CLASSPRESENTATIONONSCREEN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCLASSPRESENTATIONONSCREEN(CLASSPRESENTATIONONSCREEN object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CLASSREFERENCE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CLASSREFERENCE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCLASSREFERENCE(CLASSREFERENCE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CLASSREFERENCETYPE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CLASSREFERENCETYPE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCLASSREFERENCETYPE(CLASSREFERENCETYPE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CLASS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CLASS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCLASS(CLASS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CLASSVALUEASSIGNMENT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CLASSVALUEASSIGNMENT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCLASSVALUEASSIGNMENT(CLASSVALUEASSIGNMENT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CONDITIONDET</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CONDITIONDET</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCONDITIONDET(CONDITIONDET object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CONFIGURATIONCONTROLCONSTRAINT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CONFIGURATIONCONTROLCONSTRAINT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCONFIGURATIONCONTROLCONSTRAINT(CONFIGURATIONCONTROLCONSTRAINT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CONSTRAINTORCONSTRAINTID</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CONSTRAINTORCONSTRAINTID</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCONSTRAINTORCONSTRAINTID(CONSTRAINTORCONSTRAINTID object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CONSTRAINTS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CONSTRAINTS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCONSTRAINTS(CONSTRAINTS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CONSTRAINT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CONSTRAINT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCONSTRAINT(CONSTRAINT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CONTAINEDCLASSES</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CONTAINEDCLASSES</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCONTAINEDCLASSES(CONTAINEDCLASSES object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CONTAINEDCLASSEXTENSIONS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CONTAINEDCLASSEXTENSIONS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCONTAINEDCLASSEXTENSIONS(CONTAINEDCLASSEXTENSIONS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CONTAINEDDATATYPES</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CONTAINEDDATATYPES</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCONTAINEDDATATYPES(CONTAINEDDATATYPES object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CONTAINEDDOCUMENTS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CONTAINEDDOCUMENTS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCONTAINEDDOCUMENTS(CONTAINEDDOCUMENTS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CONTAINEDPROPERTIES</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CONTAINEDPROPERTIES</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCONTAINEDPROPERTIES(CONTAINEDPROPERTIES object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CONTAINEDSUPPLIERS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CONTAINEDSUPPLIERS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCONTAINEDSUPPLIERS(CONTAINEDSUPPLIERS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CONTEXTDEPENDENTUNIT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CONTEXTDEPENDENTUNIT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCONTEXTDEPENDENTUNIT(CONTEXTDEPENDENTUNIT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CONTEXTPARAMETERCONSTRAINTS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CONTEXTPARAMETERCONSTRAINTS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCONTEXTPARAMETERCONSTRAINTS(CONTEXTPARAMETERCONSTRAINTS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CONTEXTPARAMICON</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CONTEXTPARAMICON</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCONTEXTPARAMICON(CONTEXTPARAMICON object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CONTEXTRESTRICTIONCONSTRAINT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CONTEXTRESTRICTIONCONSTRAINT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCONTEXTRESTRICTIONCONSTRAINT(CONTEXTRESTRICTIONCONSTRAINT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CONVERSIONBASEDUNIT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CONVERSIONBASEDUNIT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCONVERSIONBASEDUNIT(CONVERSIONBASEDUNIT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CORRESPONDINGPROPERTIES</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CORRESPONDINGPROPERTIES</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCORRESPONDINGPROPERTIES(CORRESPONDINGPROPERTIES object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CREATEICON</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CREATEICON</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCREATEICON(CREATEICON object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DATATYPEREFERENCE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DATATYPEREFERENCE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDATATYPEREFERENCE(DATATYPEREFERENCE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DATATYPESREFERENCE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DATATYPESREFERENCE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDATATYPESREFERENCE(DATATYPESREFERENCE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DATATYPE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DATATYPE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDATATYPE(DATATYPE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DATEDATATYPE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DATEDATATYPE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDATEDATATYPE(DATEDATATYPE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DATETIMEDATATYPE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DATETIMEDATATYPE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDATETIMEDATATYPE(DATETIMEDATATYPE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DEPENDENTPDET</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DEPENDENTPDET</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDEPENDENTPDET(DEPENDENTPDET object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DERIVEDUNITELEMENT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DERIVEDUNITELEMENT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDERIVEDUNITELEMENT(DERIVEDUNITELEMENT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DERIVEDUNIT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DERIVEDUNIT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDERIVEDUNIT(DERIVEDUNIT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DICTIONARIESREFERENCE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DICTIONARIESREFERENCE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDICTIONARIESREFERENCE(DICTIONARIESREFERENCE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DICTIONARYINSTANDARDFORMAT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DICTIONARYINSTANDARDFORMAT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDICTIONARYINSTANDARDFORMAT(DICTIONARYINSTANDARDFORMAT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DICTIONARYREFERENCE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DICTIONARYREFERENCE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDICTIONARYREFERENCE(DICTIONARYREFERENCE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DICTIONARY</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DICTIONARY</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDICTIONARY(DICTIONARY object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DICUNITREFERENCE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DICUNITREFERENCE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDICUNITREFERENCE(DICUNITREFERENCE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DICUNITSREFERENCE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DICUNITSREFERENCE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDICUNITSREFERENCE(DICUNITSREFERENCE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DICUNIT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DICUNIT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDICUNIT(DICUNIT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DICVALUE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DICVALUE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDICVALUE(DICVALUE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DIMENSIONALEXPONENTS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DIMENSIONALEXPONENTS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDIMENSIONALEXPONENTS(DIMENSIONALEXPONENTS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DOCUMENTCONTENT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DOCUMENTCONTENT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDOCUMENTCONTENT(DOCUMENTCONTENT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DOCUMENTIDENTIFIERNAMELABEL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DOCUMENTIDENTIFIERNAMELABEL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDOCUMENTIDENTIFIERNAMELABEL(DOCUMENTIDENTIFIERNAMELABEL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DOCUMENTIDENTIFIER</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DOCUMENTIDENTIFIER</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDOCUMENTIDENTIFIER(DOCUMENTIDENTIFIER object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DOCUMENTREFERENCE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DOCUMENTREFERENCE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDOCUMENTREFERENCE(DOCUMENTREFERENCE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DOCUMENTSREFERENCE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DOCUMENTSREFERENCE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDOCUMENTSREFERENCE(DOCUMENTSREFERENCE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DOCUMENT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DOCUMENT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDOCUMENT(DOCUMENT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DOMAINCONSTRAINTS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DOMAINCONSTRAINTS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDOMAINCONSTRAINTS(DOMAINCONSTRAINTS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DOMAINCONSTRAINT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DOMAINCONSTRAINT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDOMAINCONSTRAINT(DOMAINCONSTRAINT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ENUMERATIONCONSTRAINT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ENUMERATIONCONSTRAINT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseENUMERATIONCONSTRAINT(ENUMERATIONCONSTRAINT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EXPLICITFUNCTIONALMODELCLASSEXTENSION</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EXPLICITFUNCTIONALMODELCLASSEXTENSION</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEXPLICITFUNCTIONALMODELCLASSEXTENSION(EXPLICITFUNCTIONALMODELCLASSEXTENSION object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EXPLICITITEMCLASSEXTENSION</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EXPLICITITEMCLASSEXTENSION</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEXPLICITITEMCLASSEXTENSION(EXPLICITITEMCLASSEXTENSION object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EXTERNALFILES</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EXTERNALFILES</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEXTERNALFILES(EXTERNALFILES object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EXTERNALGRAPHICS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EXTERNALGRAPHICS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEXTERNALGRAPHICS(EXTERNALGRAPHICS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EXTERNALRESOURCE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EXTERNALRESOURCE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEXTERNALRESOURCE(EXTERNALRESOURCE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FILTER</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FILTER</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFILTER(FILTER object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FMCLASSVIEWOF</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FMCLASSVIEWOF</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFMCLASSVIEWOF(FMCLASSVIEWOF object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FUNCTIONALMODELCLASS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FUNCTIONALMODELCLASS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFUNCTIONALMODELCLASS(FUNCTIONALMODELCLASS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GENERALTEXT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GENERALTEXT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGENERALTEXT(GENERALTEXT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GEOMETRICCONTEXT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GEOMETRICCONTEXT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGEOMETRICCONTEXT(GEOMETRICCONTEXT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GEOMETRICUNITCONTEXT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GEOMETRICUNITCONTEXT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGEOMETRICUNITCONTEXT(GEOMETRICUNITCONTEXT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GRAPHICS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GRAPHICS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGRAPHICS(GRAPHICS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HEADER</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HEADER</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHEADER(HEADER object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HTTPFILE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HTTPFILE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHTTPFILE(HTTPFILE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IDENTIFIEDDOCUMENT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IDENTIFIEDDOCUMENT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIDENTIFIEDDOCUMENT(IDENTIFIEDDOCUMENT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ILLUSTRATION</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ILLUSTRATION</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseILLUSTRATION(ILLUSTRATION object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>INFORMATION</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>INFORMATION</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseINFORMATION(INFORMATION object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>INTCURRENCYTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>INTCURRENCYTYPE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseINTCURRENCYTYPE(INTCURRENCYTYPE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>INTDICVALUE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>INTDICVALUE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseINTDICVALUE(INTDICVALUE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>INTEGRITYCONSTRAINT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>INTEGRITYCONSTRAINT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseINTEGRITYCONSTRAINT(INTEGRITYCONSTRAINT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>INTMEASURETYPE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>INTMEASURETYPE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseINTMEASURETYPE(INTMEASURETYPE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>INTTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>INTTYPE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseINTTYPE(INTTYPE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ITEMCLASSCASEOF</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ITEMCLASSCASEOF</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseITEMCLASSCASEOF(ITEMCLASSCASEOF object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ITEMCLASS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ITEMCLASS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseITEMCLASS(ITEMCLASS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ITSVALUES</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ITSVALUES</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseITSVALUES(ITSVALUES object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KEYWORDLABEL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KEYWORDLABEL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKEYWORDLABEL(KEYWORDLABEL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KEYWORD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KEYWORD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKEYWORD(KEYWORD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LANGUAGE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LANGUAGE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLANGUAGE(LANGUAGE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LEVEL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LEVEL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLEVEL(LEVEL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LEVELTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LEVELTYPE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLEVELTYPE(LEVELTYPE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LIBRARYIIMIDENTIFICATION</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LIBRARYIIMIDENTIFICATION</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLIBRARYIIMIDENTIFICATION(LIBRARYIIMIDENTIFICATION object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LIBRARYINSTANDARDFORMAT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LIBRARYINSTANDARDFORMAT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLIBRARYINSTANDARDFORMAT(LIBRARYINSTANDARDFORMAT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LIBRARY</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LIBRARY</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLIBRARY(LIBRARY object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LISTTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LISTTYPE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLISTTYPE(LISTTYPE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MAPPINGFUNCTION</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MAPPINGFUNCTION</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMAPPINGFUNCTION(MAPPINGFUNCTION object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MATHEMATICALSTRING</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MATHEMATICALSTRING</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMATHEMATICALSTRING(MATHEMATICALSTRING object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MESSAGE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MESSAGE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMESSAGE(MESSAGE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NAMEDTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NAMEDTYPE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNAMEDTYPE(NAMEDTYPE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NAMEDUNIT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NAMEDUNIT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNAMEDUNIT(NAMEDUNIT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NONDEPENDENTPDET</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NONDEPENDENTPDET</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNONDEPENDENTPDET(NONDEPENDENTPDET object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NONINSTANTIABLEFUNCTIONALVIEWCLASS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NONINSTANTIABLEFUNCTIONALVIEWCLASS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNONINSTANTIABLEFUNCTIONALVIEWCLASS(NONINSTANTIABLEFUNCTIONALVIEWCLASS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NONQUANTITATIVECODETYPE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NONQUANTITATIVECODETYPE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNONQUANTITATIVECODETYPE(NONQUANTITATIVECODETYPE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NONQUANTITATIVEINTTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NONQUANTITATIVEINTTYPE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNONQUANTITATIVEINTTYPE(NONQUANTITATIVEINTTYPE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NONSIUNIT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NONSIUNIT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNONSIUNIT(NONSIUNIT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NONTRANSLATABLESTRINGTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NONTRANSLATABLESTRINGTYPE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNONTRANSLATABLESTRINGTYPE(NONTRANSLATABLESTRINGTYPE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NUMBERTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NUMBERTYPE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNUMBERTYPE(NUMBERTYPE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ONTOML</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ONTOML</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseONTOML(ONTOML object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ORGANIZATION</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ORGANIZATION</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseORGANIZATION(ORGANIZATION object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PERSON</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PERSON</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePERSON(PERSON object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PLACEMENTTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PLACEMENTTYPE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePLACEMENTTYPE(PLACEMENTTYPE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>POSTCONDITION</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>POSTCONDITION</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePOSTCONDITION(POSTCONDITION object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PRECONDITION</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PRECONDITION</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePRECONDITION(PRECONDITION object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PREFERREDNAMELABEL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PREFERREDNAMELABEL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePREFERREDNAMELABEL(PREFERREDNAMELABEL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PREFERREDNAME</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PREFERREDNAME</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePREFERREDNAME(PREFERREDNAME object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PROGRAMREFERENCETYPE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PROGRAMREFERENCETYPE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePROGRAMREFERENCETYPE(PROGRAMREFERENCETYPE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PROPERTIESREFERENCE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PROPERTIESREFERENCE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePROPERTIESREFERENCE(PROPERTIESREFERENCE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PROPERTYCLASSIFICATION</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PROPERTYCLASSIFICATION</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePROPERTYCLASSIFICATION(PROPERTYCLASSIFICATION object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PROPERTYCONSTRAINT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PROPERTYCONSTRAINT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePROPERTYCONSTRAINT(PROPERTYCONSTRAINT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PROPERTYMAPPING</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PROPERTYMAPPING</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePROPERTYMAPPING(PROPERTYMAPPING object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PROPERTYREFERENCE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PROPERTYREFERENCE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePROPERTYREFERENCE(PROPERTYREFERENCE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PROPERTY</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PROPERTY</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePROPERTY(PROPERTY object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PROPERTYVALUERECOMMENDEDPRESENTATION</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PROPERTYVALUERECOMMENDEDPRESENTATION</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePROPERTYVALUERECOMMENDEDPRESENTATION(PROPERTYVALUERECOMMENDEDPRESENTATION object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RANGECONSTRAINT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RANGECONSTRAINT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRANGECONSTRAINT(RANGECONSTRAINT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RATIONALMEASURETYPE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RATIONALMEASURETYPE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRATIONALMEASURETYPE(RATIONALMEASURETYPE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RATIONALTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RATIONALTYPE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRATIONALTYPE(RATIONALTYPE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>REALCURRENCYTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>REALCURRENCYTYPE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseREALCURRENCYTYPE(REALCURRENCYTYPE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>REALMEASURETYPE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>REALMEASURETYPE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseREALMEASURETYPE(REALMEASURETYPE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>REALTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>REALTYPE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseREALTYPE(REALTYPE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RECOMMENDEDPRESENTATION</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RECOMMENDEDPRESENTATION</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRECOMMENDEDPRESENTATION(RECOMMENDEDPRESENTATION object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>REFERENCEDDOCUMENT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>REFERENCEDDOCUMENT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseREFERENCEDDOCUMENT(REFERENCEDDOCUMENT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>REFERENCEDGRAPHICS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>REFERENCEDGRAPHICS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseREFERENCEDGRAPHICS(REFERENCEDGRAPHICS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>REMOTELOCATIONS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>REMOTELOCATIONS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseREMOTELOCATIONS(REMOTELOCATIONS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remote Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remote Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoteLocation(RemoteLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>REPRESENTATIONPDET</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>REPRESENTATIONPDET</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseREPRESENTATIONPDET(REPRESENTATIONPDET object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>REPRESENTATIONREFERENCETYPE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>REPRESENTATIONREFERENCETYPE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseREPRESENTATIONREFERENCETYPE(REPRESENTATIONREFERENCETYPE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SETTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SETTYPE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSETTYPE(SETTYPE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SETWITHSUBSETCONSTRAINTTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SETWITHSUBSETCONSTRAINTTYPE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSETWITHSUBSETCONSTRAINTTYPE(SETWITHSUBSETCONSTRAINTTYPE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SHORTNAMELABEL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SHORTNAMELABEL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSHORTNAMELABEL(SHORTNAMELABEL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SHORTNAME</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SHORTNAME</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSHORTNAME(SHORTNAME object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SIUNIT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SIUNIT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSIUNIT(SIUNIT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SOURCEDOCUMENT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SOURCEDOCUMENT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSOURCEDOCUMENT(SOURCEDOCUMENT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>STRINGDICVALUE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>STRINGDICVALUE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSTRINGDICVALUE(STRINGDICVALUE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>STRINGPATTERNCONSTRAINT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>STRINGPATTERNCONSTRAINT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSTRINGPATTERNCONSTRAINT(STRINGPATTERNCONSTRAINT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>STRINGSIZECONSTRAINT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>STRINGSIZECONSTRAINT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSTRINGSIZECONSTRAINT(STRINGSIZECONSTRAINT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>STRINGS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>STRINGS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSTRINGS(STRINGS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>STRINGTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>STRINGTYPE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSTRINGTYPE(STRINGTYPE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SUBCLASSCONSTRAINT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SUBCLASSCONSTRAINT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSUBCLASSCONSTRAINT(SUBCLASSCONSTRAINT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SUBSET</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SUBSET</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSUBSET(SUBSET object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SUPPLIERREFERENCE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SUPPLIERREFERENCE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSUPPLIERREFERENCE(SUPPLIERREFERENCE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SUPPLIERSREFERENCE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SUPPLIERSREFERENCE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSUPPLIERSREFERENCE(SUPPLIERSREFERENCE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SUPPLIER</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SUPPLIER</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSUPPLIER(SUPPLIER object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SUPPORTEDVEP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SUPPORTEDVEP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSUPPORTEDVEP(SUPPORTEDVEP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SYNONYMOUSNAMELABEL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SYNONYMOUSNAMELABEL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSYNONYMOUSNAMELABEL(SYNONYMOUSNAMELABEL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SYNONYMOUSNAME</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SYNONYMOUSNAME</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSYNONYMOUSNAME(SYNONYMOUSNAME object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SYNONYMOUSSYMBOLS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SYNONYMOUSSYMBOLS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSYNONYMOUSSYMBOLS(SYNONYMOUSSYMBOLS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TEXT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TEXT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTEXT(TEXT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TIMEDATATYPE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TIMEDATATYPE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTIMEDATATYPE(TIMEDATATYPE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TRANSLATABLESTRINGTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TRANSLATABLESTRINGTYPE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTRANSLATABLESTRINGTYPE(TRANSLATABLESTRINGTYPE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TRANSLATIONDATA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TRANSLATIONDATA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTRANSLATIONDATA(TRANSLATIONDATA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TRANSLATION</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TRANSLATION</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTRANSLATION(TRANSLATION object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UNIT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UNIT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUNIT(UNIT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>URITYPE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>URITYPE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseURITYPE(URITYPE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VCVRANGE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VCVRANGE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVCVRANGE(VCVRANGE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VIEWCONTROLVARIABLERANGE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VIEWCONTROLVARIABLERANGE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVIEWCONTROLVARIABLERANGE(VIEWCONTROLVARIABLERANGE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VIEWEXCHANGEPROTOCOLIDENTIFICATION</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VIEWEXCHANGEPROTOCOLIDENTIFICATION</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVIEWEXCHANGEPROTOCOLIDENTIFICATION(VIEWEXCHANGEPROTOCOLIDENTIFICATION object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedSwitch
