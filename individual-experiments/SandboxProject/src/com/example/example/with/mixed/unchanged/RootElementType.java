/**
 */
package com.example.example.with.mixed.unchanged;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Element Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.example.example.with.mixed.unchanged.RootElementType#getElement1 <em>Element1</em>}</li>
 *   <li>{@link com.example.example.with.mixed.unchanged.RootElementType#getElement2 <em>Element2</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.example.with.mixed.unchanged.UnchangedPackage#getRootElementType()
 * @model extendedMetaData="name='rootElement_._type' kind='elementOnly'"
 * @generated
 */
public interface RootElementType extends EObject {
	/**
	 * Returns the value of the '<em><b>Element1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element1</em>' containment reference.
	 * @see #setElement1(MixedType)
	 * @see com.example.example.with.mixed.unchanged.UnchangedPackage#getRootElementType_Element1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='element1'"
	 * @generated
	 */
	MixedType getElement1();

	/**
	 * Sets the value of the '{@link com.example.example.with.mixed.unchanged.RootElementType#getElement1 <em>Element1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element1</em>' containment reference.
	 * @see #getElement1()
	 * @generated
	 */
	void setElement1(MixedType value);

	/**
	 * Returns the value of the '<em><b>Element2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element2</em>' containment reference.
	 * @see #setElement2(CustomersType)
	 * @see com.example.example.with.mixed.unchanged.UnchangedPackage#getRootElementType_Element2()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='element2'"
	 * @generated
	 */
	CustomersType getElement2();

	/**
	 * Sets the value of the '{@link com.example.example.with.mixed.unchanged.RootElementType#getElement2 <em>Element2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element2</em>' containment reference.
	 * @see #getElement2()
	 * @generated
	 */
	void setElement2(CustomersType value);

} // RootElementType
