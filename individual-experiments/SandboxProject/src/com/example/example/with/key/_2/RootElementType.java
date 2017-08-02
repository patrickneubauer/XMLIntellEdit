/**
 */
package com.example.example.with.key._2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Element Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.example.example.with.key._2.RootElementType#getOrder <em>Order</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.example.with.key._2._2Package#getRootElementType()
 * @model extendedMetaData="name='rootElement_._type' kind='elementOnly'"
 * @generated
 */
public interface RootElementType extends EObject {
	/**
	 * Returns the value of the '<em><b>Order</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' containment reference.
	 * @see #setOrder(OrderType)
	 * @see com.example.example.with.key._2._2Package#getRootElementType_Order()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='order'"
	 * @generated
	 */
	OrderType getOrder();

	/**
	 * Sets the value of the '{@link com.example.example.with.key._2.RootElementType#getOrder <em>Order</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' containment reference.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(OrderType value);

} // RootElementType
