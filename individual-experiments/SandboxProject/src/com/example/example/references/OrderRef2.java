/**
 */
package com.example.example.references;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order Ref2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.example.example.references.OrderRef2#getOrderDetail2 <em>Order Detail2</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.example.references.ReferencesPackage#getOrderRef2()
 * @model extendedMetaData="name='OrderRef2' kind='empty'"
 * @generated
 */
public interface OrderRef2 extends EObject {
	/**
	 * Returns the value of the '<em><b>Order Detail2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Detail2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Detail2</em>' reference.
	 * @see #setOrderDetail2(OrderDetail2)
	 * @see com.example.example.references.ReferencesPackage#getOrderRef2_OrderDetail2()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='attribute' name='orderDetail2'"
	 * @generated
	 */
	OrderDetail2 getOrderDetail2();

	/**
	 * Sets the value of the '{@link com.example.example.references.OrderRef2#getOrderDetail2 <em>Order Detail2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Detail2</em>' reference.
	 * @see #getOrderDetail2()
	 * @generated
	 */
	void setOrderDetail2(OrderDetail2 value);

} // OrderRef2
