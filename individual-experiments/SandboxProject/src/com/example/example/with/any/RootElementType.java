/**
 */
package com.example.example.with.any;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Element Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.example.example.with.any.RootElementType#getElement1 <em>Element1</em>}</li>
 *   <li>{@link com.example.example.with.any.RootElementType#getElement2 <em>Element2</em>}</li>
 *   <li>{@link com.example.example.with.any.RootElementType#getElement3 <em>Element3</em>}</li>
 *   <li>{@link com.example.example.with.any.RootElementType#getAny <em>Any</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.example.with.any.AnyPackage#getRootElementType()
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
	 * @see com.example.example.with.any.AnyPackage#getRootElementType_Element1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='element1'"
	 * @generated
	 */
	Element1 getElement1();

	/**
	 * Sets the value of the '{@link com.example.example.with.any.RootElementType#getElement1 <em>Element1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element1</em>' containment reference.
	 * @see #getElement1()
	 * @generated
	 */
	void setElement1(Element1 value);

	/**
	 * Returns the value of the '<em><b>Element2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element2</em>' containment reference.
	 * @see #setElement2(Element2)
	 * @see com.example.example.with.any.AnyPackage#getRootElementType_Element2()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='element2'"
	 * @generated
	 */
	Element2 getElement2();

	/**
	 * Sets the value of the '{@link com.example.example.with.any.RootElementType#getElement2 <em>Element2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element2</em>' containment reference.
	 * @see #getElement2()
	 * @generated
	 */
	void setElement2(Element2 value);

	/**
	 * Returns the value of the '<em><b>Element3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element3</em>' containment reference.
	 * @see #setElement3(Element3)
	 * @see com.example.example.with.any.AnyPackage#getRootElementType_Element3()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='element3'"
	 * @generated
	 */
	Element3 getElement3();

	/**
	 * Sets the value of the '{@link com.example.example.with.any.RootElementType#getElement3 <em>Element3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element3</em>' containment reference.
	 * @see #getElement3()
	 * @generated
	 */
	void setElement3(Element3 value);

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see com.example.example.with.any.AnyPackage#getRootElementType_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##any' name=':3' processing='skip'"
	 * @generated
	 */
	FeatureMap getAny();

} // RootElementType
