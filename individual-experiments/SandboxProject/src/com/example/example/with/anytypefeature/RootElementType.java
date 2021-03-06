/**
 */
package com.example.example.with.anytypefeature;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Element Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.example.example.with.anytypefeature.RootElementType#getElement1 <em>Element1</em>}</li>
 *   <li>{@link com.example.example.with.anytypefeature.RootElementType#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.example.with.anytypefeature.AnytypefeaturePackage#getRootElementType()
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
	 * @see #setElement1(Element1)
	 * @see com.example.example.with.anytypefeature.AnytypefeaturePackage#getRootElementType_Element1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='element1'"
	 * @generated
	 */
	Element1 getElement1();

	/**
	 * Sets the value of the '{@link com.example.example.with.anytypefeature.RootElementType#getElement1 <em>Element1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element1</em>' containment reference.
	 * @see #getElement1()
	 * @generated
	 */
	void setElement1(Element1 value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference.
	 * @see #setProperties(Properties)
	 * @see com.example.example.with.anytypefeature.AnytypefeaturePackage#getRootElementType_Properties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='properties'"
	 * @generated
	 */
	Properties getProperties();

	/**
	 * Sets the value of the '{@link com.example.example.with.anytypefeature.RootElementType#getProperties <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' containment reference.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(Properties value);

} // RootElementType
