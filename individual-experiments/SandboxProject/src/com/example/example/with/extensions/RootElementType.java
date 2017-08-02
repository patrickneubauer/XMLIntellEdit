/**
 */
package com.example.example.with.extensions;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Element Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.example.example.with.extensions.RootElementType#getExtendedAddress <em>Extended Address</em>}</li>
 *   <li>{@link com.example.example.with.extensions.RootElementType#getAddress <em>Address</em>}</li>
 *   <li>{@link com.example.example.with.extensions.RootElementType#getLanguage <em>Language</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.example.with.extensions.ExtensionsPackage#getRootElementType()
 * @model extendedMetaData="name='rootElement_._type' kind='elementOnly'"
 * @generated
 */
public interface RootElementType extends EObject {
	/**
	 * Returns the value of the '<em><b>Extended Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended Address</em>' containment reference.
	 * @see #setExtendedAddress(ExtendedAddress)
	 * @see com.example.example.with.extensions.ExtensionsPackage#getRootElementType_ExtendedAddress()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='extendedAddress'"
	 * @generated
	 */
	ExtendedAddress getExtendedAddress();

	/**
	 * Sets the value of the '{@link com.example.example.with.extensions.RootElementType#getExtendedAddress <em>Extended Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended Address</em>' containment reference.
	 * @see #getExtendedAddress()
	 * @generated
	 */
	void setExtendedAddress(ExtendedAddress value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' containment reference.
	 * @see #setAddress(Address)
	 * @see com.example.example.with.extensions.ExtensionsPackage#getRootElementType_Address()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='address'"
	 * @generated
	 */
	Address getAddress();

	/**
	 * Sets the value of the '{@link com.example.example.with.extensions.RootElementType#getAddress <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' containment reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(Address value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' containment reference.
	 * @see #setLanguage(Language)
	 * @see com.example.example.with.extensions.ExtensionsPackage#getRootElementType_Language()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='language'"
	 * @generated
	 */
	Language getLanguage();

	/**
	 * Sets the value of the '{@link com.example.example.with.extensions.RootElementType#getLanguage <em>Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' containment reference.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(Language value);

} // RootElementType
