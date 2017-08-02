/**
 */
package eclassxmlschemacommon_2_0Simplified;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LOCALE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eclassxmlschemacommon_2_0Simplified.LOCALE#getCountryRef <em>Country Ref</em>}</li>
 *   <li>{@link eclassxmlschemacommon_2_0Simplified.LOCALE#getLanguageRef <em>Language Ref</em>}</li>
 * </ul>
 *
 * @see eclassxmlschemacommon_2_0Simplified.Eclassxmlschemacommon_2_0SimplifiedPackage#getLOCALE()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='patternCountryRef patternLanguageRef'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot patternCountryRef='(self.countryRef=null) or self.countryRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.countryRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.countryRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\')' patternLanguageRef='(self.languageRef=null) or self.languageRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.languageRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.languageRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\')'"
 * @generated
 */
public interface LOCALE extends EObject {
	/**
	 * Returns the value of the '<em><b>Country Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country Ref</em>' attribute.
	 * @see #setCountryRef(String)
	 * @see eclassxmlschemacommon_2_0Simplified.Eclassxmlschemacommon_2_0SimplifiedPackage#getLOCALE_CountryRef()
	 * @model
	 * @generated
	 */
	String getCountryRef();

	/**
	 * Sets the value of the '{@link eclassxmlschemacommon_2_0Simplified.LOCALE#getCountryRef <em>Country Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country Ref</em>' attribute.
	 * @see #getCountryRef()
	 * @generated
	 */
	void setCountryRef(String value);

	/**
	 * Returns the value of the '<em><b>Language Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language Ref</em>' attribute.
	 * @see #setLanguageRef(String)
	 * @see eclassxmlschemacommon_2_0Simplified.Eclassxmlschemacommon_2_0SimplifiedPackage#getLOCALE_LanguageRef()
	 * @model
	 * @generated
	 */
	String getLanguageRef();

	/**
	 * Sets the value of the '{@link eclassxmlschemacommon_2_0Simplified.LOCALE#getLanguageRef <em>Language Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language Ref</em>' attribute.
	 * @see #getLanguageRef()
	 * @generated
	 */
	void setLanguageRef(String value);

} // LOCALE
