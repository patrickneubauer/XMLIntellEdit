/**
 */
package com.example.example.with.key._2.impl;

import com.example.example.with.key._2.ItemsType;
import com.example.example.with.key._2.ProductOrderType;
import com.example.example.with.key._2._2Package;

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
 * An implementation of the model object '<em><b>Items Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.example.example.with.key._2.impl.ItemsTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link com.example.example.with.key._2.impl.ItemsTypeImpl#getShirt <em>Shirt</em>}</li>
 *   <li>{@link com.example.example.with.key._2.impl.ItemsTypeImpl#getHat <em>Hat</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ItemsTypeImpl extends MinimalEObjectImpl.Container implements ItemsType {
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
	protected ItemsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2Package.Literals.ITEMS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, _2Package.ITEMS_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductOrderType> getShirt() {
		return getGroup().list(_2Package.Literals.ITEMS_TYPE__SHIRT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductOrderType> getHat() {
		return getGroup().list(_2Package.Literals.ITEMS_TYPE__HAT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _2Package.ITEMS_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case _2Package.ITEMS_TYPE__SHIRT:
				return ((InternalEList<?>)getShirt()).basicRemove(otherEnd, msgs);
			case _2Package.ITEMS_TYPE__HAT:
				return ((InternalEList<?>)getHat()).basicRemove(otherEnd, msgs);
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
			case _2Package.ITEMS_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case _2Package.ITEMS_TYPE__SHIRT:
				return getShirt();
			case _2Package.ITEMS_TYPE__HAT:
				return getHat();
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
			case _2Package.ITEMS_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case _2Package.ITEMS_TYPE__SHIRT:
				getShirt().clear();
				getShirt().addAll((Collection<? extends ProductOrderType>)newValue);
				return;
			case _2Package.ITEMS_TYPE__HAT:
				getHat().clear();
				getHat().addAll((Collection<? extends ProductOrderType>)newValue);
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
			case _2Package.ITEMS_TYPE__GROUP:
				getGroup().clear();
				return;
			case _2Package.ITEMS_TYPE__SHIRT:
				getShirt().clear();
				return;
			case _2Package.ITEMS_TYPE__HAT:
				getHat().clear();
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
			case _2Package.ITEMS_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case _2Package.ITEMS_TYPE__SHIRT:
				return !getShirt().isEmpty();
			case _2Package.ITEMS_TYPE__HAT:
				return !getHat().isEmpty();
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

} //ItemsTypeImpl
