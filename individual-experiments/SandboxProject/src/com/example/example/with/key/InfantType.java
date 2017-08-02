/**
 */
package com.example.example.with.key;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Infant Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.example.example.with.key.InfantType#getFullName <em>Full Name</em>}</li>
 *   <li>{@link com.example.example.with.key.InfantType#getAssociatedPassengerID <em>Associated Passenger ID</em>}</li>
 *   <li>{@link com.example.example.with.key.InfantType#getID <em>ID</em>}</li>
 *   <li>{@link com.example.example.with.key.InfantType#getSequenceNo <em>Sequence No</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.example.with.key.KeyPackage#getInfantType()
 * @model extendedMetaData="name='InfantType' kind='elementOnly'"
 * @generated
 */
public interface InfantType extends EObject {
	/**
	 * Returns the value of the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Full Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full Name</em>' attribute.
	 * @see #setFullName(String)
	 * @see com.example.example.with.key.KeyPackage#getInfantType_FullName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='FullName'"
	 * @generated
	 */
	String getFullName();

	/**
	 * Sets the value of the '{@link com.example.example.with.key.InfantType#getFullName <em>Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Name</em>' attribute.
	 * @see #getFullName()
	 * @generated
	 */
	void setFullName(String value);

	/**
	 * Returns the value of the '<em><b>Associated Passenger ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associated Passenger ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associated Passenger ID</em>' attribute.
	 * @see #isSetAssociatedPassengerID()
	 * @see #unsetAssociatedPassengerID()
	 * @see #setAssociatedPassengerID(int)
	 * @see com.example.example.with.key.KeyPackage#getInfantType_AssociatedPassengerID()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='attribute' name='AssociatedPassengerID'"
	 * @generated
	 */
	int getAssociatedPassengerID();

	/**
	 * Sets the value of the '{@link com.example.example.with.key.InfantType#getAssociatedPassengerID <em>Associated Passenger ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associated Passenger ID</em>' attribute.
	 * @see #isSetAssociatedPassengerID()
	 * @see #unsetAssociatedPassengerID()
	 * @see #getAssociatedPassengerID()
	 * @generated
	 */
	void setAssociatedPassengerID(int value);

	/**
	 * Unsets the value of the '{@link com.example.example.with.key.InfantType#getAssociatedPassengerID <em>Associated Passenger ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAssociatedPassengerID()
	 * @see #getAssociatedPassengerID()
	 * @see #setAssociatedPassengerID(int)
	 * @generated
	 */
	void unsetAssociatedPassengerID();

	/**
	 * Returns whether the value of the '{@link com.example.example.with.key.InfantType#getAssociatedPassengerID <em>Associated Passenger ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Associated Passenger ID</em>' attribute is set.
	 * @see #unsetAssociatedPassengerID()
	 * @see #getAssociatedPassengerID()
	 * @see #setAssociatedPassengerID(int)
	 * @generated
	 */
	boolean isSetAssociatedPassengerID();

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #isSetID()
	 * @see #unsetID()
	 * @see #setID(int)
	 * @see com.example.example.with.key.KeyPackage#getInfantType_ID()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='attribute' name='ID'"
	 * @generated
	 */
	int getID();

	/**
	 * Sets the value of the '{@link com.example.example.with.key.InfantType#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #isSetID()
	 * @see #unsetID()
	 * @see #getID()
	 * @generated
	 */
	void setID(int value);

	/**
	 * Unsets the value of the '{@link com.example.example.with.key.InfantType#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetID()
	 * @see #getID()
	 * @see #setID(int)
	 * @generated
	 */
	void unsetID();

	/**
	 * Returns whether the value of the '{@link com.example.example.with.key.InfantType#getID <em>ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID</em>' attribute is set.
	 * @see #unsetID()
	 * @see #getID()
	 * @see #setID(int)
	 * @generated
	 */
	boolean isSetID();

	/**
	 * Returns the value of the '<em><b>Sequence No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence No</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence No</em>' attribute.
	 * @see #isSetSequenceNo()
	 * @see #unsetSequenceNo()
	 * @see #setSequenceNo(int)
	 * @see com.example.example.with.key.KeyPackage#getInfantType_SequenceNo()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='attribute' name='SequenceNo'"
	 * @generated
	 */
	int getSequenceNo();

	/**
	 * Sets the value of the '{@link com.example.example.with.key.InfantType#getSequenceNo <em>Sequence No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence No</em>' attribute.
	 * @see #isSetSequenceNo()
	 * @see #unsetSequenceNo()
	 * @see #getSequenceNo()
	 * @generated
	 */
	void setSequenceNo(int value);

	/**
	 * Unsets the value of the '{@link com.example.example.with.key.InfantType#getSequenceNo <em>Sequence No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSequenceNo()
	 * @see #getSequenceNo()
	 * @see #setSequenceNo(int)
	 * @generated
	 */
	void unsetSequenceNo();

	/**
	 * Returns whether the value of the '{@link com.example.example.with.key.InfantType#getSequenceNo <em>Sequence No</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sequence No</em>' attribute is set.
	 * @see #unsetSequenceNo()
	 * @see #getSequenceNo()
	 * @see #setSequenceNo(int)
	 * @generated
	 */
	boolean isSetSequenceNo();

} // InfantType
