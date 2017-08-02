/**
 */
package com.example.example.with.group.unchanged;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.example.example.with.group.unchanged.Element2#getModelGroupElement1 <em>Model Group Element1</em>}</li>
 *   <li>{@link com.example.example.with.group.unchanged.Element2#getModelGroupElement2 <em>Model Group Element2</em>}</li>
 *   <li>{@link com.example.example.with.group.unchanged.Element2#getModelGroupElement3 <em>Model Group Element3</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.example.with.group.unchanged.UnchangedPackage#getElement2()
 * @model extendedMetaData="name='Element2' kind='elementOnly'"
 * @generated
 */
public interface Element2 extends EObject {
	/**
	 * Returns the value of the '<em><b>Model Group Element1</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Group Element1</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Group Element1</em>' attribute list.
	 * @see com.example.example.with.group.unchanged.UnchangedPackage#getElement2_ModelGroupElement1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true" upper="3"
	 *        extendedMetaData="kind='element' name='modelGroupElement1'"
	 * @generated
	 */
	EList<String> getModelGroupElement1();

	/**
	 * Returns the value of the '<em><b>Model Group Element2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Group Element2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Group Element2</em>' attribute.
	 * @see #setModelGroupElement2(String)
	 * @see com.example.example.with.group.unchanged.UnchangedPackage#getElement2_ModelGroupElement2()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='modelGroupElement2'"
	 * @generated
	 */
	String getModelGroupElement2();

	/**
	 * Sets the value of the '{@link com.example.example.with.group.unchanged.Element2#getModelGroupElement2 <em>Model Group Element2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Group Element2</em>' attribute.
	 * @see #getModelGroupElement2()
	 * @generated
	 */
	void setModelGroupElement2(String value);

	/**
	 * Returns the value of the '<em><b>Model Group Element3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Group Element3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Group Element3</em>' attribute.
	 * @see #setModelGroupElement3(String)
	 * @see com.example.example.with.group.unchanged.UnchangedPackage#getElement2_ModelGroupElement3()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='modelGroupElement3'"
	 * @generated
	 */
	String getModelGroupElement3();

	/**
	 * Sets the value of the '{@link com.example.example.with.group.unchanged.Element2#getModelGroupElement3 <em>Model Group Element3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Group Element3</em>' attribute.
	 * @see #getModelGroupElement3()
	 * @generated
	 */
	void setModelGroupElement3(String value);

} // Element2
