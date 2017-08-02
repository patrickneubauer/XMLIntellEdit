/**
 */
package com.example.example.references.untyped;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order Ref1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.example.example.references.untyped.OrderRef1#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.example.references.untyped.UntypedPackage#getOrderRef1()
 * @model extendedMetaData="name='OrderRef1' kind='empty'"
 * @generated
 */
public interface OrderRef1 extends EObject {
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
	 * @see com.example.example.references.untyped.UntypedPackage#getOrderRef1_Name()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='attribute' name='orderDetail1'"
	 * @generated
	 */
	EObject getName();

	/**
	 * Sets the value of the '{@link com.example.example.references.untyped.OrderRef1#getName <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(EObject value);

} // OrderRef1
