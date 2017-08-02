/**
 */
package com.example.example.references;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order Detail2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.example.example.references.OrderDetail2#getCustomerName <em>Customer Name</em>}</li>
 *   <li>{@link com.example.example.references.OrderDetail2#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.example.references.ReferencesPackage#getOrderDetail2()
 * @model extendedMetaData="name='OrderDetail2' kind='empty'"
 * @generated
 */
public interface OrderDetail2 extends EObject {
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
	 * @see com.example.example.references.ReferencesPackage#getOrderDetail2_CustomerName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='customerName'"
	 * @generated
	 */
	String getCustomerName();

	/**
	 * Sets the value of the '{@link com.example.example.references.OrderDetail2#getCustomerName <em>Customer Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Name</em>' attribute.
	 * @see #getCustomerName()
	 * @generated
	 */
	void setCustomerName(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.example.example.references.ReferencesPackage#getOrderDetail2_Name()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='orderID'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.example.example.references.OrderDetail2#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // OrderDetail2
