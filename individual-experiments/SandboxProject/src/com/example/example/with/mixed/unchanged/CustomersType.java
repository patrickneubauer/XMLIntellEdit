/**
 */
package com.example.example.with.mixed.unchanged;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customers Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.example.example.with.mixed.unchanged.CustomersType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link com.example.example.with.mixed.unchanged.CustomersType#getCustomer <em>Customer</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.example.with.mixed.unchanged.UnchangedPackage#getCustomersType()
 * @model extendedMetaData="name='customersType' kind='mixed'"
 * @generated
 */
public interface CustomersType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see com.example.example.with.mixed.unchanged.UnchangedPackage#getCustomersType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Customer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' containment reference.
	 * @see #setCustomer(EObject)
	 * @see com.example.example.with.mixed.unchanged.UnchangedPackage#getCustomersType_Customer()
	 * @model containment="true" required="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='customer'"
	 * @generated
	 */
	EObject getCustomer();

	/**
	 * Sets the value of the '{@link com.example.example.with.mixed.unchanged.CustomersType#getCustomer <em>Customer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer</em>' containment reference.
	 * @see #getCustomer()
	 * @generated
	 */
	void setCustomer(EObject value);

} // CustomersType
