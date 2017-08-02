/**
 */
package com.example.example.referencesuntyped;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order Ref2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.example.example.referencesuntyped.OrderRef2#getOrderDetail2 <em>Order Detail2</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.example.referencesuntyped.ReferencesuntypedPackage#getOrderRef2()
 * @model extendedMetaData="name='OrderRef2' kind='empty'"
 * @generated
 */
public interface OrderRef2 extends EObject {
	/**
	 * Returns the value of the '<em><b>Order Detail2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Detail2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Detail2</em>' attribute.
	 * @see #setOrderDetail2(String)
	 * @see com.example.example.referencesuntyped.ReferencesuntypedPackage#getOrderRef2_OrderDetail2()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="kind='attribute' name='orderDetail2'"
	 * @generated
	 */
	String getOrderDetail2();

	/**
	 * Sets the value of the '{@link com.example.example.referencesuntyped.OrderRef2#getOrderDetail2 <em>Order Detail2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Detail2</em>' attribute.
	 * @see #getOrderDetail2()
	 * @generated
	 */
	void setOrderDetail2(String value);

} // OrderRef2
