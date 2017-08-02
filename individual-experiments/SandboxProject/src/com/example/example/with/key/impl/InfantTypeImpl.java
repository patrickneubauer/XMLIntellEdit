/**
 */
package com.example.example.with.key.impl;

import com.example.example.with.key.InfantType;
import com.example.example.with.key.KeyPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Infant Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.example.example.with.key.impl.InfantTypeImpl#getFullName <em>Full Name</em>}</li>
 *   <li>{@link com.example.example.with.key.impl.InfantTypeImpl#getAssociatedPassengerID <em>Associated Passenger ID</em>}</li>
 *   <li>{@link com.example.example.with.key.impl.InfantTypeImpl#getID <em>ID</em>}</li>
 *   <li>{@link com.example.example.with.key.impl.InfantTypeImpl#getSequenceNo <em>Sequence No</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InfantTypeImpl extends MinimalEObjectImpl.Container implements InfantType {
	/**
	 * The default value of the '{@link #getFullName() <em>Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullName()
	 * @generated
	 * @ordered
	 */
	protected static final String FULL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFullName() <em>Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullName()
	 * @generated
	 * @ordered
	 */
	protected String fullName = FULL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssociatedPassengerID() <em>Associated Passenger ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedPassengerID()
	 * @generated
	 * @ordered
	 */
	protected static final int ASSOCIATED_PASSENGER_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAssociatedPassengerID() <em>Associated Passenger ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedPassengerID()
	 * @generated
	 * @ordered
	 */
	protected int associatedPassengerID = ASSOCIATED_PASSENGER_ID_EDEFAULT;

	/**
	 * This is true if the Associated Passenger ID attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean associatedPassengerIDESet;

	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected int iD = ID_EDEFAULT;

	/**
	 * This is true if the ID attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDESet;

	/**
	 * The default value of the '{@link #getSequenceNo() <em>Sequence No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNo()
	 * @generated
	 * @ordered
	 */
	protected static final int SEQUENCE_NO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSequenceNo() <em>Sequence No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNo()
	 * @generated
	 * @ordered
	 */
	protected int sequenceNo = SEQUENCE_NO_EDEFAULT;

	/**
	 * This is true if the Sequence No attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sequenceNoESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfantTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KeyPackage.Literals.INFANT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFullName(String newFullName) {
		String oldFullName = fullName;
		fullName = newFullName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KeyPackage.INFANT_TYPE__FULL_NAME, oldFullName, fullName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAssociatedPassengerID() {
		return associatedPassengerID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociatedPassengerID(int newAssociatedPassengerID) {
		int oldAssociatedPassengerID = associatedPassengerID;
		associatedPassengerID = newAssociatedPassengerID;
		boolean oldAssociatedPassengerIDESet = associatedPassengerIDESet;
		associatedPassengerIDESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KeyPackage.INFANT_TYPE__ASSOCIATED_PASSENGER_ID, oldAssociatedPassengerID, associatedPassengerID, !oldAssociatedPassengerIDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAssociatedPassengerID() {
		int oldAssociatedPassengerID = associatedPassengerID;
		boolean oldAssociatedPassengerIDESet = associatedPassengerIDESet;
		associatedPassengerID = ASSOCIATED_PASSENGER_ID_EDEFAULT;
		associatedPassengerIDESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KeyPackage.INFANT_TYPE__ASSOCIATED_PASSENGER_ID, oldAssociatedPassengerID, ASSOCIATED_PASSENGER_ID_EDEFAULT, oldAssociatedPassengerIDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAssociatedPassengerID() {
		return associatedPassengerIDESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getID() {
		return iD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(int newID) {
		int oldID = iD;
		iD = newID;
		boolean oldIDESet = iDESet;
		iDESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KeyPackage.INFANT_TYPE__ID, oldID, iD, !oldIDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetID() {
		int oldID = iD;
		boolean oldIDESet = iDESet;
		iD = ID_EDEFAULT;
		iDESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KeyPackage.INFANT_TYPE__ID, oldID, ID_EDEFAULT, oldIDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetID() {
		return iDESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSequenceNo() {
		return sequenceNo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceNo(int newSequenceNo) {
		int oldSequenceNo = sequenceNo;
		sequenceNo = newSequenceNo;
		boolean oldSequenceNoESet = sequenceNoESet;
		sequenceNoESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KeyPackage.INFANT_TYPE__SEQUENCE_NO, oldSequenceNo, sequenceNo, !oldSequenceNoESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSequenceNo() {
		int oldSequenceNo = sequenceNo;
		boolean oldSequenceNoESet = sequenceNoESet;
		sequenceNo = SEQUENCE_NO_EDEFAULT;
		sequenceNoESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KeyPackage.INFANT_TYPE__SEQUENCE_NO, oldSequenceNo, SEQUENCE_NO_EDEFAULT, oldSequenceNoESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSequenceNo() {
		return sequenceNoESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KeyPackage.INFANT_TYPE__FULL_NAME:
				return getFullName();
			case KeyPackage.INFANT_TYPE__ASSOCIATED_PASSENGER_ID:
				return getAssociatedPassengerID();
			case KeyPackage.INFANT_TYPE__ID:
				return getID();
			case KeyPackage.INFANT_TYPE__SEQUENCE_NO:
				return getSequenceNo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case KeyPackage.INFANT_TYPE__FULL_NAME:
				setFullName((String)newValue);
				return;
			case KeyPackage.INFANT_TYPE__ASSOCIATED_PASSENGER_ID:
				setAssociatedPassengerID((Integer)newValue);
				return;
			case KeyPackage.INFANT_TYPE__ID:
				setID((Integer)newValue);
				return;
			case KeyPackage.INFANT_TYPE__SEQUENCE_NO:
				setSequenceNo((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case KeyPackage.INFANT_TYPE__FULL_NAME:
				setFullName(FULL_NAME_EDEFAULT);
				return;
			case KeyPackage.INFANT_TYPE__ASSOCIATED_PASSENGER_ID:
				unsetAssociatedPassengerID();
				return;
			case KeyPackage.INFANT_TYPE__ID:
				unsetID();
				return;
			case KeyPackage.INFANT_TYPE__SEQUENCE_NO:
				unsetSequenceNo();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case KeyPackage.INFANT_TYPE__FULL_NAME:
				return FULL_NAME_EDEFAULT == null ? fullName != null : !FULL_NAME_EDEFAULT.equals(fullName);
			case KeyPackage.INFANT_TYPE__ASSOCIATED_PASSENGER_ID:
				return isSetAssociatedPassengerID();
			case KeyPackage.INFANT_TYPE__ID:
				return isSetID();
			case KeyPackage.INFANT_TYPE__SEQUENCE_NO:
				return isSetSequenceNo();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (fullName: ");
		result.append(fullName);
		result.append(", associatedPassengerID: ");
		if (associatedPassengerIDESet) result.append(associatedPassengerID); else result.append("<unset>");
		result.append(", iD: ");
		if (iDESet) result.append(iD); else result.append("<unset>");
		result.append(", sequenceNo: ");
		if (sequenceNoESet) result.append(sequenceNo); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //InfantTypeImpl
