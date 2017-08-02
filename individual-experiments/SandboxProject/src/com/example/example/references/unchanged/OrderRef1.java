/**
 */
package com.example.example.references.unchanged;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order Ref1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.example.example.references.unchanged.OrderRef1#getOrderDetail1 <em>Order Detail1</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.example.references.unchanged.UnchangedPackage#getOrderRef1()
 * @model extendedMetaData="name='OrderRef1' kind='empty'"
 * @generated
 */
public interface OrderRef1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Order Detail1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Detail1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Detail1</em>' attribute.
	 * @see #setOrderDetail1(String)
	 * @see com.example.example.references.unchanged.UnchangedPackage#getOrderRef1_OrderDetail1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="kind='attribute' name='orderDetail1'"
	 * @generated
	 */
	String getOrderDetail1();

	/**
	 * Sets the value of the '{@link com.example.example.references.unchanged.OrderRef1#getOrderDetail1 <em>Order Detail1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Detail1</em>' attribute.
	 * @see #getOrderDetail1()
	 * @generated
	 */
	void setOrderDetail1(String value);

} // OrderRef1
