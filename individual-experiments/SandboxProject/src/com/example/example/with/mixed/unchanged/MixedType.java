/**
 */
package com.example.example.with.mixed.unchanged;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mixed Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.example.example.with.mixed.unchanged.MixedType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link com.example.example.with.mixed.unchanged.MixedType#getSomeElement <em>Some Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.example.with.mixed.unchanged.UnchangedPackage#getMixedType()
 * @model extendedMetaData="name='mixedType' kind='mixed'"
 * @generated
 */
public interface MixedType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see com.example.example.with.mixed.unchanged.UnchangedPackage#getMixedType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Some Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Some Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Some Element</em>' attribute.
	 * @see #setSomeElement(String)
	 * @see com.example.example.with.mixed.unchanged.UnchangedPackage#getMixedType_SomeElement()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='someElement'"
	 * @generated
	 */
	String getSomeElement();

	/**
	 * Sets the value of the '{@link com.example.example.with.mixed.unchanged.MixedType#getSomeElement <em>Some Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Some Element</em>' attribute.
	 * @see #getSomeElement()
	 * @generated
	 */
	void setSomeElement(String value);

} // MixedType
