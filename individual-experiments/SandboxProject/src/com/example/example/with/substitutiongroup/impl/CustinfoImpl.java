/**
 */
package com.example.example.with.substitutiongroup.impl;

import com.example.example.with.substitutiongroup.Custinfo;
import com.example.example.with.substitutiongroup.SubstitutiongroupPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custinfo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.example.example.with.substitutiongroup.impl.CustinfoImpl#getNameGroup <em>Name Group</em>}</li>
 *   <li>{@link com.example.example.with.substitutiongroup.impl.CustinfoImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustinfoImpl extends MinimalEObjectImpl.Container implements Custinfo {
	/**
	 * The cached value of the '{@link #getNameGroup() <em>Name Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap nameGroup;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustinfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SubstitutiongroupPackage.Literals.CUSTINFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getNameGroup() {
		if (nameGroup == null) {
			nameGroup = new BasicFeatureMap(this, SubstitutiongroupPackage.CUSTINFO__NAME_GROUP);
		}
		return nameGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)getNameGroup().get(SubstitutiongroupPackage.Literals.CUSTINFO__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		((FeatureMap.Internal)getNameGroup()).set(SubstitutiongroupPackage.Literals.CUSTINFO__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SubstitutiongroupPackage.CUSTINFO__NAME_GROUP:
				return ((InternalEList<?>)getNameGroup()).basicRemove(otherEnd, msgs);
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
			case SubstitutiongroupPackage.CUSTINFO__NAME_GROUP:
				if (coreType) return getNameGroup();
				return ((FeatureMap.Internal)getNameGroup()).getWrapper();
			case SubstitutiongroupPackage.CUSTINFO__NAME:
				return getName();
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
			case SubstitutiongroupPackage.CUSTINFO__NAME_GROUP:
				((FeatureMap.Internal)getNameGroup()).set(newValue);
				return;
			case SubstitutiongroupPackage.CUSTINFO__NAME:
				setName((String)newValue);
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
			case SubstitutiongroupPackage.CUSTINFO__NAME_GROUP:
				getNameGroup().clear();
				return;
			case SubstitutiongroupPackage.CUSTINFO__NAME:
				setName(NAME_EDEFAULT);
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
			case SubstitutiongroupPackage.CUSTINFO__NAME_GROUP:
				return nameGroup != null && !nameGroup.isEmpty();
			case SubstitutiongroupPackage.CUSTINFO__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
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
		result.append(" (nameGroup: ");
		result.append(nameGroup);
		result.append(')');
		return result.toString();
	}

} //CustinfoImpl
