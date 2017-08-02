/**
 */
package com.example.example.importreferences;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order Detail2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.example.example.importreferences.OrderDetail2#getCustomerName <em>Customer Name</em>}</li>
 *   <li>{@link com.example.example.importreferences.OrderDetail2#getOrderID <em>Order ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.example.importreferences.ImportreferencesPackage#getOrderDetail2()
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
	 * @see com.example.example.importreferences.ImportreferencesPackage#getOrderDetail2_CustomerName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='customerName'"
	 * @generated
	 */
	String getCustomerName();

	/**
	 * Sets the value of the '{@link com.example.example.importreferences.OrderDetail2#getCustomerName <em>Customer Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Name</em>' attribute.
	 * @see #getCustomerName()
	 * @generated
	 */
	void setCustomerName(String value);

	/**
	 * Returns the value of the '<em><b>Order ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order ID</em>' attribute.
	 * @see #setOrderID(String)
	 * @see com.example.example.importreferences.ImportreferencesPackage#getOrderDetail2_OrderID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='orderID'"
	 * @generated
	 */
	String getOrderID();

	/**
	 * Sets the value of the '{@link com.example.example.importreferences.OrderDetail2#getOrderID <em>Order ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order ID</em>' attribute.
	 * @see #getOrderID()
	 * @generated
	 */
	void setOrderID(String value);

} // OrderDetail2
