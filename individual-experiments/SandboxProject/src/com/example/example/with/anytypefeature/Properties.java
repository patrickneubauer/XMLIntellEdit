/**
 */
package com.example.example.with.anytypefeature;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.example.example.with.anytypefeature.Properties#getAnything <em>Anything</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.example.with.anytypefeature.AnytypefeaturePackage#getProperties()
 * @model extendedMetaData="name='Properties' kind='elementOnly'"
 * @generated
 */
public interface Properties extends EObject {
	/**
	 * Returns the value of the '<em><b>Anything</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anything</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anything</em>' containment reference.
	 * @see #setAnything(EObject)
	 * @see com.example.example.with.anytypefeature.AnytypefeaturePackage#getProperties_Anything()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='anything'"
	 * @generated
	 */
	EObject getAnything();

	/**
	 * Sets the value of the '{@link com.example.example.with.anytypefeature.Properties#getAnything <em>Anything</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anything</em>' containment reference.
	 * @see #getAnything()
	 * @generated
	 */
	void setAnything(EObject value);

} // Properties
