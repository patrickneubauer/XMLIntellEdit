/**
 */
package com.example.example.with.include;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.example.example.with.include.Customer#getCity <em>City</em>}</li>
 *   <li>{@link com.example.example.with.include.Customer#getCustomerName <em>Customer Name</em>}</li>
 *   <li>{@link com.example.example.with.include.Customer#getStreet <em>Street</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.example.with.include.IncludePackage#getCustomer()
 * @model extendedMetaData="name='Customer' kind='empty'"
 * @generated
 */
public interface Customer extends EObject {
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
	 * @see com.example.example.with.include.IncludePackage#getCustomer_City()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='city'"
	 * @generated
	 */
	String getCity();

	/**
	 * Sets the value of the '{@link com.example.example.with.include.Customer#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' attribute.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(String value);

	/**
	 * Returns the value of the '<em><b>Customer Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Name</em>' attribute.
	 * @see #setCustomerName(String)
	 * @see com.example.example.with.include.IncludePackage#getCustomer_CustomerName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='customerName'"
	 * @generated
	 */
	String getCustomerName();

	/**
	 * Sets the value of the '{@link com.example.example.with.include.Customer#getCustomerName <em>Customer Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Name</em>' attribute.
	 * @see #getCustomerName()
	 * @generated
	 */
	void setCustomerName(String value);

	/**
	 * Returns the value of the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Street</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Street</em>' attribute.
	 * @see #setStreet(String)
	 * @see com.example.example.with.include.IncludePackage#getCustomer_Street()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='street'"
	 * @generated
	 */
	String getStreet();

	/**
	 * Sets the value of the '{@link com.example.example.with.include.Customer#getStreet <em>Street</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Street</em>' attribute.
	 * @see #getStreet()
	 * @generated
	 */
	void setStreet(String value);

} // Customer
