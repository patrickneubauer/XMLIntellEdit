/**
 */
package com.example.example.with.extensions;

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extended Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.example.example.with.extensions.ExtendedAddress#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link com.example.example.with.extensions.ExtendedAddress#getLongitude <em>Longitude</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.example.with.extensions.ExtensionsPackage#getExtendedAddress()
 * @model extendedMetaData="name='ExtendedAddress' kind='elementOnly'"
 * @generated
 */
public interface ExtendedAddress extends Address {
	/**
	 * Returns the value of the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Latitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latitude</em>' attribute.
	 * @see #setLatitude(BigDecimal)
	 * @see com.example.example.with.extensions.ExtensionsPackage#getExtendedAddress_Latitude()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='attribute' name='latitude'"
	 * @generated
	 */
	BigDecimal getLatitude();

	/**
	 * Sets the value of the '{@link com.example.example.with.extensions.ExtendedAddress#getLatitude <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latitude</em>' attribute.
	 * @see #getLatitude()
	 * @generated
	 */
	void setLatitude(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Longitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longitude</em>' attribute.
	 * @see #setLongitude(BigDecimal)
	 * @see com.example.example.with.extensions.ExtensionsPackage#getExtendedAddress_Longitude()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='attribute' name='longitude'"
	 * @generated
	 */
	BigDecimal getLongitude();

	/**
	 * Sets the value of the '{@link com.example.example.with.extensions.ExtendedAddress#getLongitude <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitude</em>' attribute.
	 * @see #getLongitude()
	 * @generated
	 */
	void setLongitude(BigDecimal value);

} // ExtendedAddress
