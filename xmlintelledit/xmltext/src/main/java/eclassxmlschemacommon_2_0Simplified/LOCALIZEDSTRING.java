/**
 */
package eclassxmlschemacommon_2_0Simplified;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LOCALIZEDSTRING</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eclassxmlschemacommon_2_0Simplified.LOCALIZEDSTRING#getValue <em>Value</em>}</li>
 *   <li>{@link eclassxmlschemacommon_2_0Simplified.LOCALIZEDSTRING#getCountryCode <em>Country Code</em>}</li>
 *   <li>{@link eclassxmlschemacommon_2_0Simplified.LOCALIZEDSTRING#getLanguageCode <em>Language Code</em>}</li>
 * </ul>
 *
 * @see eclassxmlschemacommon_2_0Simplified.Eclassxmlschemacommon_2_0SimplifiedPackage#getLOCALIZEDSTRING()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='patternCountryCode patternLanguageCode'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot patternCountryCode='(self.countryCode=null) or self.countryCode.matches(\'[A-z]*\')' patternLanguageCode='self.languageCode.matches(\'[A-z]*\')'"
 * @generated
 */
public interface LOCALIZEDSTRING extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see eclassxmlschemacommon_2_0Simplified.Eclassxmlschemacommon_2_0SimplifiedPackage#getLOCALIZEDSTRING_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link eclassxmlschemacommon_2_0Simplified.LOCALIZEDSTRING#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Country Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country Code</em>' attribute.
	 * @see #setCountryCode(String)
	 * @see eclassxmlschemacommon_2_0Simplified.Eclassxmlschemacommon_2_0SimplifiedPackage#getLOCALIZEDSTRING_CountryCode()
	 * @model
	 * @generated
	 */
	String getCountryCode();

	/**
	 * Sets the value of the '{@link eclassxmlschemacommon_2_0Simplified.LOCALIZEDSTRING#getCountryCode <em>Country Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country Code</em>' attribute.
	 * @see #getCountryCode()
	 * @generated
	 */
	void setCountryCode(String value);

	/**
	 * Returns the value of the '<em><b>Language Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language Code</em>' attribute.
	 * @see #setLanguageCode(String)
	 * @see eclassxmlschemacommon_2_0Simplified.Eclassxmlschemacommon_2_0SimplifiedPackage#getLOCALIZEDSTRING_LanguageCode()
	 * @model required="true"
	 * @generated
	 */
	String getLanguageCode();

	/**
	 * Sets the value of the '{@link eclassxmlschemacommon_2_0Simplified.LOCALIZEDSTRING#getLanguageCode <em>Language Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language Code</em>' attribute.
	 * @see #getLanguageCode()
	 * @generated
	 */
	void setLanguageCode(String value);

} // LOCALIZEDSTRING
