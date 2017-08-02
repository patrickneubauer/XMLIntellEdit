/**
 */
package com.example.example.references;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order Ref1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.example.example.references.OrderRef1#getOrderDetail1 <em>Order Detail1</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.example.references.ReferencesPackage#getOrderRef1()
 * @model extendedMetaData="name='OrderRef1' kind='empty'"
 * @generated
 */
public interface OrderRef1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Order Detail1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Detail1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Detail1</em>' reference.
	 * @see #setOrderDetail1(OrderDetail1)
	 * @see com.example.example.references.ReferencesPackage#getOrderRef1_OrderDetail1()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='attribute' name='orderDetail1'"
	 * @generated
	 */
	OrderDetail1 getOrderDetail1();

	/**
	 * Sets the value of the '{@link com.example.example.references.OrderRef1#getOrderDetail1 <em>Order Detail1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Detail1</em>' reference.
	 * @see #getOrderDetail1()
	 * @generated
	 */
	void setOrderDetail1(OrderDetail1 value);

} // OrderRef1
