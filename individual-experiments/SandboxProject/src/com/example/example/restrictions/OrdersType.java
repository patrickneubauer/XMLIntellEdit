/**
 */
package com.example.example.restrictions;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Orders Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.example.example.restrictions.OrdersType#getOrder <em>Order</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.example.restrictions.RestrictionsPackage#getOrdersType()
 * @model extendedMetaData="name='Orders_._type' kind='elementOnly'"
 * @generated
 */
public interface OrdersType extends EObject {
	/**
	 * Returns the value of the '<em><b>Order</b></em>' containment reference list.
	 * The list contents are of type {@link com.example.example.restrictions.OrderDetail}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' containment reference list.
	 * @see com.example.example.restrictions.RestrictionsPackage#getOrdersType_Order()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Order'"
	 * @generated
	 */
	EList<OrderDetail> getOrder();

} // OrdersType
