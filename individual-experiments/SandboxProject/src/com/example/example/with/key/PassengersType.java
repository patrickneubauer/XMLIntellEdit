/**
 */
package com.example.example.with.key;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Passengers Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.example.example.with.key.PassengersType#getGroup <em>Group</em>}</li>
 *   <li>{@link com.example.example.with.key.PassengersType#getPassenger <em>Passenger</em>}</li>
 *   <li>{@link com.example.example.with.key.PassengersType#getInfant <em>Infant</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.example.with.key.KeyPackage#getPassengersType()
 * @model extendedMetaData="name='Passengers_._type' kind='elementOnly'"
 * @generated
 */
public interface PassengersType extends EObject {
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
	 * @see com.example.example.with.key.KeyPackage#getPassengersType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Passenger</b></em>' containment reference list.
	 * The list contents are of type {@link com.example.example.with.key.PassengerType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passenger</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger</em>' containment reference list.
	 * @see com.example.example.with.key.KeyPackage#getPassengersType_Passenger()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Passenger' group='#group:0'"
	 * @generated
	 */
	EList<PassengerType> getPassenger();

	/**
	 * Returns the value of the '<em><b>Infant</b></em>' containment reference list.
	 * The list contents are of type {@link com.example.example.with.key.InfantType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Infant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Infant</em>' containment reference list.
	 * @see com.example.example.with.key.KeyPackage#getPassengersType_Infant()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Infant' group='#group:0'"
	 * @generated
	 */
	EList<InfantType> getInfant();

} // PassengersType
