/**
 */
package com.example.example.referencesuntyped;

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
 *   <li>{@link com.example.example.referencesuntyped.OrdersType#getOrder1 <em>Order1</em>}</li>
 *   <li>{@link com.example.example.referencesuntyped.OrdersType#getOrder2 <em>Order2</em>}</li>
 *   <li>{@link com.example.example.referencesuntyped.OrdersType#getOrderReference1 <em>Order Reference1</em>}</li>
 *   <li>{@link com.example.example.referencesuntyped.OrdersType#getOrderReference2 <em>Order Reference2</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.example.referencesuntyped.ReferencesuntypedPackage#getOrdersType()
 * @model extendedMetaData="name='Orders_._type' kind='elementOnly'"
 * @generated
 */
public interface OrdersType extends EObject {
	/**
	 * Returns the value of the '<em><b>Order1</b></em>' containment reference list.
	 * The list contents are of type {@link com.example.example.referencesuntyped.OrderDetail1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order1</em>' containment reference list.
	 * @see com.example.example.referencesuntyped.ReferencesuntypedPackage#getOrdersType_Order1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Order1'"
	 * @generated
	 */
	EList<OrderDetail1> getOrder1();

	/**
	 * Returns the value of the '<em><b>Order2</b></em>' containment reference list.
	 * The list contents are of type {@link com.example.example.referencesuntyped.OrderDetail2}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order2</em>' containment reference list.
	 * @see com.example.example.referencesuntyped.ReferencesuntypedPackage#getOrdersType_Order2()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Order2'"
	 * @generated
	 */
	EList<OrderDetail2> getOrder2();

	/**
	 * Returns the value of the '<em><b>Order Reference1</b></em>' containment reference list.
	 * The list contents are of type {@link com.example.example.referencesuntyped.OrderRef1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Reference1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Reference1</em>' containment reference list.
	 * @see com.example.example.referencesuntyped.ReferencesuntypedPackage#getOrdersType_OrderReference1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='OrderReference1'"
	 * @generated
	 */
	EList<OrderRef1> getOrderReference1();

	/**
	 * Returns the value of the '<em><b>Order Reference2</b></em>' containment reference list.
	 * The list contents are of type {@link com.example.example.referencesuntyped.OrderRef2}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Reference2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Reference2</em>' containment reference list.
	 * @see com.example.example.referencesuntyped.ReferencesuntypedPackage#getOrdersType_OrderReference2()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='OrderReference2'"
	 * @generated
	 */
	EList<OrderRef2> getOrderReference2();

} // OrdersType
