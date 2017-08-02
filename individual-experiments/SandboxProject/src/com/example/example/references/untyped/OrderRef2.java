/**
 */
package com.example.example.references.untyped;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order Ref2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.example.example.references.untyped.OrderRef2#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.example.references.untyped.UntypedPackage#getOrderRef2()
 * @model extendedMetaData="name='OrderRef2' kind='empty'"
 * @generated
 */
public interface OrderRef2 extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' reference.
	 * @see #setName(EObject)
	 * @see com.example.example.references.untyped.UntypedPackage#getOrderRef2_Name()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='attribute' name='orderDetail2'"
	 * @generated
	 */
	EObject getName();

	/**
	 * Sets the value of the '{@link com.example.example.references.untyped.OrderRef2#getName <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(EObject value);

} // OrderRef2
