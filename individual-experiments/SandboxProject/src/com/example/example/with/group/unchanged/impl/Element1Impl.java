/**
 */
package com.example.example.with.group.unchanged.impl;

import com.example.example.with.group.unchanged.Element1;
import com.example.example.with.group.unchanged.UnchangedPackage;

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
 * An implementation of the model object '<em><b>Element1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.example.example.with.group.unchanged.impl.Element1Impl#getGroup <em>Group</em>}</li>
 *   <li>{@link com.example.example.with.group.unchanged.impl.Element1Impl#getRepeatableElement1 <em>Repeatable Element1</em>}</li>
 *   <li>{@link com.example.example.with.group.unchanged.impl.Element1Impl#getRepeatableElement2 <em>Repeatable Element2</em>}</li>
 *   <li>{@link com.example.example.with.group.unchanged.impl.Element1Impl#getRepeatableElement3 <em>Repeatable Element3</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Element1Impl extends MinimalEObjectImpl.Container implements Element1 {
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
	protected Element1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnchangedPackage.Literals.ELEMENT1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, UnchangedPackage.ELEMENT1__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRepeatableElement1() {
		return getGroup().list(UnchangedPackage.Literals.ELEMENT1__REPEATABLE_ELEMENT1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRepeatableElement2() {
		return getGroup().list(UnchangedPackage.Literals.ELEMENT1__REPEATABLE_ELEMENT2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRepeatableElement3() {
		return getGroup().list(UnchangedPackage.Literals.ELEMENT1__REPEATABLE_ELEMENT3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnchangedPackage.ELEMENT1__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
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
			case UnchangedPackage.ELEMENT1__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case UnchangedPackage.ELEMENT1__REPEATABLE_ELEMENT1:
				return getRepeatableElement1();
			case UnchangedPackage.ELEMENT1__REPEATABLE_ELEMENT2:
				return getRepeatableElement2();
			case UnchangedPackage.ELEMENT1__REPEATABLE_ELEMENT3:
				return getRepeatableElement3();
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
			case UnchangedPackage.ELEMENT1__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case UnchangedPackage.ELEMENT1__REPEATABLE_ELEMENT1:
				getRepeatableElement1().clear();
				getRepeatableElement1().addAll((Collection<? extends String>)newValue);
				return;
			case UnchangedPackage.ELEMENT1__REPEATABLE_ELEMENT2:
				getRepeatableElement2().clear();
				getRepeatableElement2().addAll((Collection<? extends String>)newValue);
				return;
			case UnchangedPackage.ELEMENT1__REPEATABLE_ELEMENT3:
				getRepeatableElement3().clear();
				getRepeatableElement3().addAll((Collection<? extends String>)newValue);
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
			case UnchangedPackage.ELEMENT1__GROUP:
				getGroup().clear();
				return;
			case UnchangedPackage.ELEMENT1__REPEATABLE_ELEMENT1:
				getRepeatableElement1().clear();
				return;
			case UnchangedPackage.ELEMENT1__REPEATABLE_ELEMENT2:
				getRepeatableElement2().clear();
				return;
			case UnchangedPackage.ELEMENT1__REPEATABLE_ELEMENT3:
				getRepeatableElement3().clear();
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
			case UnchangedPackage.ELEMENT1__GROUP:
				return group != null && !group.isEmpty();
			case UnchangedPackage.ELEMENT1__REPEATABLE_ELEMENT1:
				return !getRepeatableElement1().isEmpty();
			case UnchangedPackage.ELEMENT1__REPEATABLE_ELEMENT2:
				return !getRepeatableElement2().isEmpty();
			case UnchangedPackage.ELEMENT1__REPEATABLE_ELEMENT3:
				return !getRepeatableElement3().isEmpty();
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

} //Element1Impl
