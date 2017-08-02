/**
 */
package eclassxmlschemacommon_2_0Simplified.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import eclassxmlschemacommon_2_0Simplified.ADVANCEDPROPERTYPATH;
import eclassxmlschemacommon_2_0Simplified.BASICPROPERTYPATH;
import eclassxmlschemacommon_2_0Simplified.Contact;
import eclassxmlschemacommon_2_0Simplified.Eclassxmlschemacommon_2_0SimplifiedPackage;
import eclassxmlschemacommon_2_0Simplified.IDENTIFICATION;
import eclassxmlschemacommon_2_0Simplified.LOCALE;
import eclassxmlschemacommon_2_0Simplified.LOCALIZEDSTRING;
import eclassxmlschemacommon_2_0Simplified.NUMERICVALUE;
import eclassxmlschemacommon_2_0Simplified.PARTY;
import eclassxmlschemacommon_2_0Simplified.PROPERTYELM;
import eclassxmlschemacommon_2_0Simplified.PROPERTYPATH;
import eclassxmlschemacommon_2_0Simplified.QUERYAMOUNT;
import eclassxmlschemacommon_2_0Simplified.TYPEDSTRING;
import eclassxmlschemacommon_2_0Simplified.TargetValues;
import eclassxmlschemacommon_2_0Simplified.UNITMAPPING;
import eclassxmlschemacommon_2_0Simplified.VALUEMAPPING;
import eclassxmlschemacommon_2_0Simplified.VALUEREF;

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
 * @see eclassxmlschemacommon_2_0Simplified.Eclassxmlschemacommon_2_0SimplifiedPackage
 * @generated
 */
public class Eclassxmlschemacommon_2_0SimplifiedSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Eclassxmlschemacommon_2_0SimplifiedPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Eclassxmlschemacommon_2_0SimplifiedSwitch() {
		if (modelPackage == null) {
			modelPackage = Eclassxmlschemacommon_2_0SimplifiedPackage.eINSTANCE;
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
			case Eclassxmlschemacommon_2_0SimplifiedPackage.ADVANCEDPROPERTYPATH: {
				ADVANCEDPROPERTYPATH advancedpropertypath = (ADVANCEDPROPERTYPATH)theEObject;
				T result = caseADVANCEDPROPERTYPATH(advancedpropertypath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eclassxmlschemacommon_2_0SimplifiedPackage.BASICPROPERTYPATH: {
				BASICPROPERTYPATH basicpropertypath = (BASICPROPERTYPATH)theEObject;
				T result = caseBASICPROPERTYPATH(basicpropertypath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eclassxmlschemacommon_2_0SimplifiedPackage.CONTACT: {
				Contact contact = (Contact)theEObject;
				T result = caseContact(contact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eclassxmlschemacommon_2_0SimplifiedPackage.IDENTIFICATION: {
				IDENTIFICATION identification = (IDENTIFICATION)theEObject;
				T result = caseIDENTIFICATION(identification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eclassxmlschemacommon_2_0SimplifiedPackage.LOCALE: {
				LOCALE locale = (LOCALE)theEObject;
				T result = caseLOCALE(locale);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eclassxmlschemacommon_2_0SimplifiedPackage.LOCALIZEDSTRING: {
				LOCALIZEDSTRING localizedstring = (LOCALIZEDSTRING)theEObject;
				T result = caseLOCALIZEDSTRING(localizedstring);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eclassxmlschemacommon_2_0SimplifiedPackage.NUMERICVALUE: {
				NUMERICVALUE numericvalue = (NUMERICVALUE)theEObject;
				T result = caseNUMERICVALUE(numericvalue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eclassxmlschemacommon_2_0SimplifiedPackage.PARTY: {
				PARTY party = (PARTY)theEObject;
				T result = casePARTY(party);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eclassxmlschemacommon_2_0SimplifiedPackage.PROPERTYELM: {
				PROPERTYELM propertyelm = (PROPERTYELM)theEObject;
				T result = casePROPERTYELM(propertyelm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eclassxmlschemacommon_2_0SimplifiedPackage.PROPERTYPATH: {
				PROPERTYPATH propertypath = (PROPERTYPATH)theEObject;
				T result = casePROPERTYPATH(propertypath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eclassxmlschemacommon_2_0SimplifiedPackage.QUERYAMOUNT: {
				QUERYAMOUNT queryamount = (QUERYAMOUNT)theEObject;
				T result = caseQUERYAMOUNT(queryamount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eclassxmlschemacommon_2_0SimplifiedPackage.TARGET_VALUES: {
				TargetValues targetValues = (TargetValues)theEObject;
				T result = caseTargetValues(targetValues);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eclassxmlschemacommon_2_0SimplifiedPackage.TYPEDSTRING: {
				TYPEDSTRING typedstring = (TYPEDSTRING)theEObject;
				T result = caseTYPEDSTRING(typedstring);
				if (result == null) result = caseLOCALIZEDSTRING(typedstring);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eclassxmlschemacommon_2_0SimplifiedPackage.UNITMAPPING: {
				UNITMAPPING unitmapping = (UNITMAPPING)theEObject;
				T result = caseUNITMAPPING(unitmapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eclassxmlschemacommon_2_0SimplifiedPackage.VALUEMAPPING: {
				VALUEMAPPING valuemapping = (VALUEMAPPING)theEObject;
				T result = caseVALUEMAPPING(valuemapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eclassxmlschemacommon_2_0SimplifiedPackage.VALUEREF: {
				VALUEREF valueref = (VALUEREF)theEObject;
				T result = caseVALUEREF(valueref);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ADVANCEDPROPERTYPATH</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ADVANCEDPROPERTYPATH</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseADVANCEDPROPERTYPATH(ADVANCEDPROPERTYPATH object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BASICPROPERTYPATH</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BASICPROPERTYPATH</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBASICPROPERTYPATH(BASICPROPERTYPATH object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContact(Contact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IDENTIFICATION</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IDENTIFICATION</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIDENTIFICATION(IDENTIFICATION object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LOCALE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LOCALE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLOCALE(LOCALE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LOCALIZEDSTRING</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LOCALIZEDSTRING</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLOCALIZEDSTRING(LOCALIZEDSTRING object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NUMERICVALUE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NUMERICVALUE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNUMERICVALUE(NUMERICVALUE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PARTY</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PARTY</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePARTY(PARTY object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PROPERTYELM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PROPERTYELM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePROPERTYELM(PROPERTYELM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PROPERTYPATH</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PROPERTYPATH</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePROPERTYPATH(PROPERTYPATH object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>QUERYAMOUNT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QUERYAMOUNT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQUERYAMOUNT(QUERYAMOUNT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target Values</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target Values</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetValues(TargetValues object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TYPEDSTRING</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TYPEDSTRING</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTYPEDSTRING(TYPEDSTRING object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UNITMAPPING</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UNITMAPPING</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUNITMAPPING(UNITMAPPING object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VALUEMAPPING</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VALUEMAPPING</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVALUEMAPPING(VALUEMAPPING object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VALUEREF</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VALUEREF</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVALUEREF(VALUEREF object) {
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

} //Eclassxmlschemacommon_2_0SimplifiedSwitch
