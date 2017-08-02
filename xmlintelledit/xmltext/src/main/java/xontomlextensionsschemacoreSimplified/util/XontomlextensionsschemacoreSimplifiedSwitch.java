/**
 */
package xontomlextensionsschemacoreSimplified.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import xontomlextensionsschemacoreSimplified.CONTAINEDEAINSTANCES;
import xontomlextensionsschemacoreSimplified.CONTAINEDEATEMPLATES;
import xontomlextensionsschemacoreSimplified.CONTAINEDRELATIONDEPRECATION;
import xontomlextensionsschemacoreSimplified.DEPRECATION;
import xontomlextensionsschemacoreSimplified.EAREFERENCE;
import xontomlextensionsschemacoreSimplified.EATEMPLATE;
import xontomlextensionsschemacoreSimplified.EAVALUATION;
import xontomlextensionsschemacoreSimplified.ENTITYEXTENDEDATTRIBUTES;
import xontomlextensionsschemacoreSimplified.EXTENSIONS;
import xontomlextensionsschemacoreSimplified.XontomlextensionsschemacoreSimplifiedPackage;

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
 * @see xontomlextensionsschemacoreSimplified.XontomlextensionsschemacoreSimplifiedPackage
 * @generated
 */
public class XontomlextensionsschemacoreSimplifiedSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XontomlextensionsschemacoreSimplifiedPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XontomlextensionsschemacoreSimplifiedSwitch() {
		if (modelPackage == null) {
			modelPackage = XontomlextensionsschemacoreSimplifiedPackage.eINSTANCE;
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
			case XontomlextensionsschemacoreSimplifiedPackage.CONTAINEDEAINSTANCES: {
				CONTAINEDEAINSTANCES containedeainstances = (CONTAINEDEAINSTANCES)theEObject;
				T result = caseCONTAINEDEAINSTANCES(containedeainstances);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XontomlextensionsschemacoreSimplifiedPackage.CONTAINEDEATEMPLATES: {
				CONTAINEDEATEMPLATES containedeatemplates = (CONTAINEDEATEMPLATES)theEObject;
				T result = caseCONTAINEDEATEMPLATES(containedeatemplates);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XontomlextensionsschemacoreSimplifiedPackage.CONTAINEDRELATIONDEPRECATION: {
				CONTAINEDRELATIONDEPRECATION containedrelationdeprecation = (CONTAINEDRELATIONDEPRECATION)theEObject;
				T result = caseCONTAINEDRELATIONDEPRECATION(containedrelationdeprecation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XontomlextensionsschemacoreSimplifiedPackage.DEPRECATION: {
				DEPRECATION deprecation = (DEPRECATION)theEObject;
				T result = caseDEPRECATION(deprecation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XontomlextensionsschemacoreSimplifiedPackage.EAREFERENCE: {
				EAREFERENCE eareference = (EAREFERENCE)theEObject;
				T result = caseEAREFERENCE(eareference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XontomlextensionsschemacoreSimplifiedPackage.EATEMPLATE: {
				EATEMPLATE eatemplate = (EATEMPLATE)theEObject;
				T result = caseEATEMPLATE(eatemplate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XontomlextensionsschemacoreSimplifiedPackage.EAVALUATION: {
				EAVALUATION eavaluation = (EAVALUATION)theEObject;
				T result = caseEAVALUATION(eavaluation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XontomlextensionsschemacoreSimplifiedPackage.ENTITYEXTENDEDATTRIBUTES: {
				ENTITYEXTENDEDATTRIBUTES entityextendedattributes = (ENTITYEXTENDEDATTRIBUTES)theEObject;
				T result = caseENTITYEXTENDEDATTRIBUTES(entityextendedattributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XontomlextensionsschemacoreSimplifiedPackage.EXTENSIONS: {
				EXTENSIONS extensions = (EXTENSIONS)theEObject;
				T result = caseEXTENSIONS(extensions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CONTAINEDEAINSTANCES</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CONTAINEDEAINSTANCES</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCONTAINEDEAINSTANCES(CONTAINEDEAINSTANCES object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CONTAINEDEATEMPLATES</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CONTAINEDEATEMPLATES</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCONTAINEDEATEMPLATES(CONTAINEDEATEMPLATES object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CONTAINEDRELATIONDEPRECATION</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CONTAINEDRELATIONDEPRECATION</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCONTAINEDRELATIONDEPRECATION(CONTAINEDRELATIONDEPRECATION object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DEPRECATION</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DEPRECATION</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDEPRECATION(DEPRECATION object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EAREFERENCE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EAREFERENCE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAREFERENCE(EAREFERENCE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EATEMPLATE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EATEMPLATE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEATEMPLATE(EATEMPLATE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EAVALUATION</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EAVALUATION</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAVALUATION(EAVALUATION object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ENTITYEXTENDEDATTRIBUTES</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ENTITYEXTENDEDATTRIBUTES</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseENTITYEXTENDEDATTRIBUTES(ENTITYEXTENDEDATTRIBUTES object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EXTENSIONS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EXTENSIONS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEXTENSIONS(EXTENSIONS object) {
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

} //XontomlextensionsschemacoreSimplifiedSwitch
