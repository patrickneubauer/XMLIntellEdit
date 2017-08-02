/**
 */
package com.example.example.with.key.impl;

import com.example.example.with.key.KeyPackage;
import com.example.example.with.key.PassengerType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Passenger Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.example.example.with.key.impl.PassengerTypeImpl#getFullName <em>Full Name</em>}</li>
 *   <li>{@link com.example.example.with.key.impl.PassengerTypeImpl#getAssociatedInfantID <em>Associated Infant ID</em>}</li>
 *   <li>{@link com.example.example.with.key.impl.PassengerTypeImpl#getID <em>ID</em>}</li>
 *   <li>{@link com.example.example.with.key.impl.PassengerTypeImpl#getSequenceNo <em>Sequence No</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PassengerTypeImpl extends MinimalEObjectImpl.Container implements PassengerType {
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
	 * The default value of the '{@link #getAssociatedInfantID() <em>Associated Infant ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedInfantID()
	 * @generated
	 * @ordered
	 */
	protected static final int ASSOCIATED_INFANT_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAssociatedInfantID() <em>Associated Infant ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedInfantID()
	 * @generated
	 * @ordered
	 */
	protected int associatedInfantID = ASSOCIATED_INFANT_ID_EDEFAULT;

	/**
	 * This is true if the Associated Infant ID attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean associatedInfantIDESet;

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
	protected PassengerTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KeyPackage.Literals.PASSENGER_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, KeyPackage.PASSENGER_TYPE__FULL_NAME, oldFullName, fullName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAssociatedInfantID() {
		return associatedInfantID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociatedInfantID(int newAssociatedInfantID) {
		int oldAssociatedInfantID = associatedInfantID;
		associatedInfantID = newAssociatedInfantID;
		boolean oldAssociatedInfantIDESet = associatedInfantIDESet;
		associatedInfantIDESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KeyPackage.PASSENGER_TYPE__ASSOCIATED_INFANT_ID, oldAssociatedInfantID, associatedInfantID, !oldAssociatedInfantIDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAssociatedInfantID() {
		int oldAssociatedInfantID = associatedInfantID;
		boolean oldAssociatedInfantIDESet = associatedInfantIDESet;
		associatedInfantID = ASSOCIATED_INFANT_ID_EDEFAULT;
		associatedInfantIDESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KeyPackage.PASSENGER_TYPE__ASSOCIATED_INFANT_ID, oldAssociatedInfantID, ASSOCIATED_INFANT_ID_EDEFAULT, oldAssociatedInfantIDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAssociatedInfantID() {
		return associatedInfantIDESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, KeyPackage.PASSENGER_TYPE__ID, oldID, iD, !oldIDESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, KeyPackage.PASSENGER_TYPE__ID, oldID, ID_EDEFAULT, oldIDESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KeyPackage.PASSENGER_TYPE__SEQUENCE_NO, oldSequenceNo, sequenceNo, !oldSequenceNoESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, KeyPackage.PASSENGER_TYPE__SEQUENCE_NO, oldSequenceNo, SEQUENCE_NO_EDEFAULT, oldSequenceNoESet));
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
			case KeyPackage.PASSENGER_TYPE__FULL_NAME:
				return getFullName();
			case KeyPackage.PASSENGER_TYPE__ASSOCIATED_INFANT_ID:
				return getAssociatedInfantID();
			case KeyPackage.PASSENGER_TYPE__ID:
				return getID();
			case KeyPackage.PASSENGER_TYPE__SEQUENCE_NO:
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
			case KeyPackage.PASSENGER_TYPE__FULL_NAME:
				setFullName((String)newValue);
				return;
			case KeyPackage.PASSENGER_TYPE__ASSOCIATED_INFANT_ID:
				setAssociatedInfantID((Integer)newValue);
				return;
			case KeyPackage.PASSENGER_TYPE__ID:
				setID((Integer)newValue);
				return;
			case KeyPackage.PASSENGER_TYPE__SEQUENCE_NO:
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
			case KeyPackage.PASSENGER_TYPE__FULL_NAME:
				setFullName(FULL_NAME_EDEFAULT);
				return;
			case KeyPackage.PASSENGER_TYPE__ASSOCIATED_INFANT_ID:
				unsetAssociatedInfantID();
				return;
			case KeyPackage.PASSENGER_TYPE__ID:
				unsetID();
				return;
			case KeyPackage.PASSENGER_TYPE__SEQUENCE_NO:
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
			case KeyPackage.PASSENGER_TYPE__FULL_NAME:
				return FULL_NAME_EDEFAULT == null ? fullName != null : !FULL_NAME_EDEFAULT.equals(fullName);
			case KeyPackage.PASSENGER_TYPE__ASSOCIATED_INFANT_ID:
				return isSetAssociatedInfantID();
			case KeyPackage.PASSENGER_TYPE__ID:
				return isSetID();
			case KeyPackage.PASSENGER_TYPE__SEQUENCE_NO:
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
		result.append(", associatedInfantID: ");
		if (associatedInfantIDESet) result.append(associatedInfantID); else result.append("<unset>");
		result.append(", iD: ");
		if (iDESet) result.append(iD); else result.append("<unset>");
		result.append(", sequenceNo: ");
		if (sequenceNoESet) result.append(sequenceNo); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PassengerTypeImpl
