/**
 */
package com.example.example.restrictions;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.example.example.restrictions.Address#getStreet <em>Street</em>}</li>
 *   <li>{@link com.example.example.restrictions.Address#getCity <em>City</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.example.restrictions.RestrictionsPackage#getAddress()
 * @model extendedMetaData="name='Address' kind='elementOnly'"
 * @generated
 */
public interface Address extends EObject {
	/**
	 * Returns the value of the '<em><b>Street</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Street</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Street</em>' attribute list.
	 * @see com.example.example.restrictions.RestrictionsPackage#getAddress_Street()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true" upper="3"
	 *        extendedMetaData="kind='element' name='street'"
	 * @generated
	 */
	EList<String> getStreet();

	/**
	 * Returns the value of the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>City</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' attribute.
	 * @see #setCity(String)
	 * @see com.example.example.restrictions.RestrictionsPackage#getAddress_City()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='city'"
	 * @generated
	 */
	String getCity();

	/**
	 * Sets the value of the '{@link com.example.example.restrictions.Address#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' attribute.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(String value);

} // Address
