/**
 */
package com.example.example.with.key._2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Items Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.example.example.with.key._2.ItemsType#getGroup <em>Group</em>}</li>
 *   <li>{@link com.example.example.with.key._2.ItemsType#getShirt <em>Shirt</em>}</li>
 *   <li>{@link com.example.example.with.key._2.ItemsType#getHat <em>Hat</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.example.with.key._2._2Package#getItemsType()
 * @model extendedMetaData="name='ItemsType' kind='elementOnly'"
 * @generated
 */
public interface ItemsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see com.example.example.with.key._2._2Package#getItemsType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Shirt</b></em>' containment reference list.
	 * The list contents are of type {@link com.example.example.with.key._2.ProductOrderType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shirt</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shirt</em>' containment reference list.
	 * @see com.example.example.with.key._2._2Package#getItemsType_Shirt()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='shirt' group='#group:0'"
	 * @generated
	 */
	EList<ProductOrderType> getShirt();

	/**
	 * Returns the value of the '<em><b>Hat</b></em>' containment reference list.
	 * The list contents are of type {@link com.example.example.with.key._2.ProductOrderType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hat</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hat</em>' containment reference list.
	 * @see com.example.example.with.key._2._2Package#getItemsType_Hat()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='hat' group='#group:0'"
	 * @generated
	 */
	EList<ProductOrderType> getHat();

} // ItemsType
