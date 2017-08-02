/**
 */
package com.example.example.references.untyped;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Common Identifier Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.example.example.references.untyped.CommonIdentifierType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.example.references.untyped.UntypedPackage#getCommonIdentifierType()
 * @model
 * @generated
 */
public interface CommonIdentifierType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.example.example.references.untyped.UntypedPackage#getCommonIdentifierType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.ID"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.example.example.references.untyped.CommonIdentifierType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // CommonIdentifierType
