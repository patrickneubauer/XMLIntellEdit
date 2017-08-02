/**
 */
package com.example.example.with.mixed;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.example.example.with.mixed.ModelType#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.example.with.mixed.MixedPackage#getModelType()
 * @model extendedMetaData="name='Model_._type' kind='elementOnly'"
 * @generated
 */
public interface ModelType extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link com.example.example.with.mixed.MyElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see com.example.example.with.mixed.MixedPackage#getModelType_Elements()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='elements'"
	 * @generated
	 */
	EList<MyElement> getElements();

} // ModelType
