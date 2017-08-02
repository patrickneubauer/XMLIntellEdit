/**
 */
package com.example.example.with.group;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element1 Choice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.example.example.with.group.Element1Choice#getRepeatableElement1 <em>Repeatable Element1</em>}</li>
 *   <li>{@link com.example.example.with.group.Element1Choice#getRepeatableElement2 <em>Repeatable Element2</em>}</li>
 *   <li>{@link com.example.example.with.group.Element1Choice#getRepeatableElement3 <em>Repeatable Element3</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.example.with.group.GroupPackage#getElement1Choice()
 * @model
 * @generated
 */
public interface Element1Choice extends EObject {
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
	 * @see com.example.example.with.group.GroupPackage#getElement1Choice_RepeatableElement1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='repeatableElement1' group='#group:0'"
	 * @generated
	 */
	EList<String> getRepeatableElement1();

	/**
	 * Returns the value of the '<em><b>Repeatable Element2</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repeatable Element2</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeatable Element2</em>' attribute list.
	 * @see com.example.example.with.group.GroupPackage#getElement1Choice_RepeatableElement2()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='repeatableElement2' group='#group:0'"
	 * @generated
	 */
	EList<String> getRepeatableElement2();

	/**
	 * Returns the value of the '<em><b>Repeatable Element3</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repeatable Element3</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeatable Element3</em>' attribute list.
	 * @see com.example.example.with.group.GroupPackage#getElement1Choice_RepeatableElement3()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='repeatableElement3' group='#group:0'"
	 * @generated
	 */
	EList<String> getRepeatableElement3();

} // Element1Choice
