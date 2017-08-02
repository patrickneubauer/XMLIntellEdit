/**
 */
package com.example.example.with.mixed.unchanged.impl;

import com.example.example.with.mixed.unchanged.CustomersType;
import com.example.example.with.mixed.unchanged.UnchangedPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customers Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.example.example.with.mixed.unchanged.impl.CustomersTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link com.example.example.with.mixed.unchanged.impl.CustomersTypeImpl#getCustomer <em>Customer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomersTypeImpl extends MinimalEObjectImpl.Container implements CustomersType {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomersTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnchangedPackage.Literals.CUSTOMERS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, UnchangedPackage.CUSTOMERS_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getCustomer() {
		return (EObject)getMixed().get(UnchangedPackage.Literals.CUSTOMERS_TYPE__CUSTOMER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomer(EObject newCustomer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(UnchangedPackage.Literals.CUSTOMERS_TYPE__CUSTOMER, newCustomer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomer(EObject newCustomer) {
		((FeatureMap.Internal)getMixed()).set(UnchangedPackage.Literals.CUSTOMERS_TYPE__CUSTOMER, newCustomer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnchangedPackage.CUSTOMERS_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case UnchangedPackage.CUSTOMERS_TYPE__CUSTOMER:
				return basicSetCustomer(null, msgs);
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
			case UnchangedPackage.CUSTOMERS_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case UnchangedPackage.CUSTOMERS_TYPE__CUSTOMER:
				return getCustomer();
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
			case UnchangedPackage.CUSTOMERS_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case UnchangedPackage.CUSTOMERS_TYPE__CUSTOMER:
				setCustomer((EObject)newValue);
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
			case UnchangedPackage.CUSTOMERS_TYPE__MIXED:
				getMixed().clear();
				return;
			case UnchangedPackage.CUSTOMERS_TYPE__CUSTOMER:
				setCustomer((EObject)null);
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
			case UnchangedPackage.CUSTOMERS_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case UnchangedPackage.CUSTOMERS_TYPE__CUSTOMER:
				return getCustomer() != null;
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //CustomersTypeImpl
