/**
 */
package com.example.example.with.group;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element3</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.example.example.with.group.Element3#getRepeatableElement1 <em>Repeatable Element1</em>}</li>
 *   <li>{@link com.example.example.with.group.Element3#getRepeatableElement2 <em>Repeatable Element2</em>}</li>
 *   <li>{@link com.example.example.with.group.Element3#getRepeatableElement3 <em>Repeatable Element3</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.example.with.group.GroupPackage#getElement3()
 * @model extendedMetaData="name='Element3' kind='elementOnly'"
 * @generated
 */
public interface Element3 extends EObject {
	/**
	 * Returns the value of the '<em><b>Repeatable Element1</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repeatable Element1</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeatable Element1</em>' attribute list.
	 * @see com.example.example.with.group.GroupPackage#getElement3_RepeatableElement1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="3"
	 *        extendedMetaData="kind='element' name='repeatableElement1'"
	 * @generated
	 */
	EList<String> getRepeatableElement1();

	/**
	 * Returns the value of the '<em><b>Repeatable Element2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repeatable Element2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeatable Element2</em>' attribute.
	 * @see #setRepeatableElement2(String)
	 * @see com.example.example.with.group.GroupPackage#getElement3_RepeatableElement2()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='repeatableElement2'"
	 * @generated
	 */
	String getRepeatableElement2();

	/**
	 * Sets the value of the '{@link com.example.example.with.group.Element3#getRepeatableElement2 <em>Repeatable Element2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeatable Element2</em>' attribute.
	 * @see #getRepeatableElement2()
	 * @generated
	 */
	void setRepeatableElement2(String value);

	/**
	 * Returns the value of the '<em><b>Repeatable Element3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repeatable Element3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeatable Element3</em>' attribute.
	 * @see #setRepeatableElement3(String)
	 * @see com.example.example.with.group.GroupPackage#getElement3_RepeatableElement3()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='repeatableElement3'"
	 * @generated
	 */
	String getRepeatableElement3();

	/**
	 * Sets the value of the '{@link com.example.example.with.group.Element3#getRepeatableElement3 <em>Repeatable Element3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeatable Element3</em>' attribute.
	 * @see #getRepeatableElement3()
	 * @generated
	 */
	void setRepeatableElement3(String value);

} // Element3
