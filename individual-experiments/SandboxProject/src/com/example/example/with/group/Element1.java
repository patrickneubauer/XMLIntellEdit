/**
 */
package com.example.example.with.group;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.example.example.with.group.Element1#getElement1Choice <em>Element1 Choice</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.example.with.group.GroupPackage#getElement1()
 * @model extendedMetaData="name='Element1' kind='elementOnly'"
 * @generated
 */
public interface Element1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Element1 Choice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element1 Choice</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element1 Choice</em>' containment reference.
	 * @see #setElement1Choice(Element1Choice)
	 * @see com.example.example.with.group.GroupPackage#getElement1_Element1Choice()
	 * @model containment="true"
	 * @generated
	 */
	Element1Choice getElement1Choice();

	/**
	 * Sets the value of the '{@link com.example.example.with.group.Element1#getElement1Choice <em>Element1 Choice</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element1 Choice</em>' containment reference.
	 * @see #getElement1Choice()
	 * @generated
	 */
	void setElement1Choice(Element1Choice value);

} // Element1
