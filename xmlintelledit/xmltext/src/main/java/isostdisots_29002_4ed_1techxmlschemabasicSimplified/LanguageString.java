/**
 */
package isostdisots_29002_4ed_1techxmlschemabasicSimplified;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Language String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link isostdisots_29002_4ed_1techxmlschemabasicSimplified.LanguageString#getContent <em>Content</em>}</li>
 *   <li>{@link isostdisots_29002_4ed_1techxmlschemabasicSimplified.LanguageString#getLanguageRef <em>Language Ref</em>}</li>
 *   <li>{@link isostdisots_29002_4ed_1techxmlschemabasicSimplified.LanguageString#getLanguageCode <em>Language Code</em>}</li>
 *   <li>{@link isostdisots_29002_4ed_1techxmlschemabasicSimplified.LanguageString#getCountryCode <em>Country Code</em>}</li>
 * </ul>
 *
 * @see isostdisots_29002_4ed_1techxmlschemabasicSimplified.Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage#getLanguageString()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='patternLanguageRef patternLanguageCode patternCountryCode'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot patternLanguageRef='(self.languageRef=null) or self.languageRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.languageRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.languageRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\')' patternLanguageCode='(self.languageCode=null) or self.languageCode.matches(\'[a-z]{2}\') or self.languageCode.matches(\'[a-z]{3}\')' patternCountryCode='(self.countryCode=null) or self.countryCode.matches(\'[A-Z]{2}\')'"
 * @generated
 */
public interface LanguageString extends EObject {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see isostdisots_29002_4ed_1techxmlschemabasicSimplified.Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage#getLanguageString_Content()
	 * @model required="true"
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link isostdisots_29002_4ed_1techxmlschemabasicSimplified.LanguageString#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

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
	 * @see isostdisots_29002_4ed_1techxmlschemabasicSimplified.Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage#getLanguageString_LanguageRef()
	 * @model
	 * @generated
	 */
	String getLanguageRef();

	/**
	 * Sets the value of the '{@link isostdisots_29002_4ed_1techxmlschemabasicSimplified.LanguageString#getLanguageRef <em>Language Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language Ref</em>' attribute.
	 * @see #getLanguageRef()
	 * @generated
	 */
	void setLanguageRef(String value);

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
	 * @see isostdisots_29002_4ed_1techxmlschemabasicSimplified.Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage#getLanguageString_LanguageCode()
	 * @model
	 * @generated
	 */
	String getLanguageCode();

	/**
	 * Sets the value of the '{@link isostdisots_29002_4ed_1techxmlschemabasicSimplified.LanguageString#getLanguageCode <em>Language Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language Code</em>' attribute.
	 * @see #getLanguageCode()
	 * @generated
	 */
	void setLanguageCode(String value);

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
	 * @see isostdisots_29002_4ed_1techxmlschemabasicSimplified.Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage#getLanguageString_CountryCode()
	 * @model
	 * @generated
	 */
	String getCountryCode();

	/**
	 * Sets the value of the '{@link isostdisots_29002_4ed_1techxmlschemabasicSimplified.LanguageString#getCountryCode <em>Country Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country Code</em>' attribute.
	 * @see #getCountryCode()
	 * @generated
	 */
	void setCountryCode(String value);

} // LanguageString
