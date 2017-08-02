/**
 */
package com.example.example.with.key.impl;

import com.example.example.with.key.InfantType;
import com.example.example.with.key.KeyPackage;
import com.example.example.with.key.PassengerType;
import com.example.example.with.key.PassengersType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Passengers Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.example.example.with.key.impl.PassengersTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link com.example.example.with.key.impl.PassengersTypeImpl#getPassenger <em>Passenger</em>}</li>
 *   <li>{@link com.example.example.with.key.impl.PassengersTypeImpl#getInfant <em>Infant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PassengersTypeImpl extends MinimalEObjectImpl.Container implements PassengersType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PassengersTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KeyPackage.Literals.PASSENGERS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, KeyPackage.PASSENGERS_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PassengerType> getPassenger() {
		return getGroup().list(KeyPackage.Literals.PASSENGERS_TYPE__PASSENGER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InfantType> getInfant() {
		return getGroup().list(KeyPackage.Literals.PASSENGERS_TYPE__INFANT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KeyPackage.PASSENGERS_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case KeyPackage.PASSENGERS_TYPE__PASSENGER:
				return ((InternalEList<?>)getPassenger()).basicRemove(otherEnd, msgs);
			case KeyPackage.PASSENGERS_TYPE__INFANT:
				return ((InternalEList<?>)getInfant()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KeyPackage.PASSENGERS_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case KeyPackage.PASSENGERS_TYPE__PASSENGER:
				return getPassenger();
			case KeyPackage.PASSENGERS_TYPE__INFANT:
				return getInfant();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case KeyPackage.PASSENGERS_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case KeyPackage.PASSENGERS_TYPE__PASSENGER:
				getPassenger().clear();
				getPassenger().addAll((Collection<? extends PassengerType>)newValue);
				return;
			case KeyPackage.PASSENGERS_TYPE__INFANT:
				getInfant().clear();
				getInfant().addAll((Collection<? extends InfantType>)newValue);
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
			case KeyPackage.PASSENGERS_TYPE__GROUP:
				getGroup().clear();
				return;
			case KeyPackage.PASSENGERS_TYPE__PASSENGER:
				getPassenger().clear();
				return;
			case KeyPackage.PASSENGERS_TYPE__INFANT:
				getInfant().clear();
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
			case KeyPackage.PASSENGERS_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case KeyPackage.PASSENGERS_TYPE__PASSENGER:
				return !getPassenger().isEmpty();
			case KeyPackage.PASSENGERS_TYPE__INFANT:
				return !getInfant().isEmpty();
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
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //PassengersTypeImpl
