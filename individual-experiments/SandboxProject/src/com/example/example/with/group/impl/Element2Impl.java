/**
 */
package com.example.example.with.group.impl;

import com.example.example.with.group.Element2;
import com.example.example.with.group.GroupPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.example.example.with.group.impl.Element2Impl#getModelGroupElement1 <em>Model Group Element1</em>}</li>
 *   <li>{@link com.example.example.with.group.impl.Element2Impl#getModelGroupElement2 <em>Model Group Element2</em>}</li>
 *   <li>{@link com.example.example.with.group.impl.Element2Impl#getModelGroupElement3 <em>Model Group Element3</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Element2Impl extends MinimalEObjectImpl.Container implements Element2 {
	/**
	 * The cached value of the '{@link #getModelGroupElement1() <em>Model Group Element1</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelGroupElement1()
	 * @generated
	 * @ordered
	 */
	protected EList<String> modelGroupElement1;

	/**
	 * The default value of the '{@link #getModelGroupElement2() <em>Model Group Element2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelGroupElement2()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_GROUP_ELEMENT2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelGroupElement2() <em>Model Group Element2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelGroupElement2()
	 * @generated
	 * @ordered
	 */
	protected String modelGroupElement2 = MODEL_GROUP_ELEMENT2_EDEFAULT;

	/**
	 * The default value of the '{@link #getModelGroupElement3() <em>Model Group Element3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelGroupElement3()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_GROUP_ELEMENT3_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelGroupElement3() <em>Model Group Element3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelGroupElement3()
	 * @generated
	 * @ordered
	 */
	protected String modelGroupElement3 = MODEL_GROUP_ELEMENT3_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Element2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GroupPackage.Literals.ELEMENT2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getModelGroupElement1() {
		if (modelGroupElement1 == null) {
			modelGroupElement1 = new EDataTypeEList<String>(String.class, this, GroupPackage.ELEMENT2__MODEL_GROUP_ELEMENT1);
		}
		return modelGroupElement1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModelGroupElement2() {
		return modelGroupElement2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelGroupElement2(String newModelGroupElement2) {
		String oldModelGroupElement2 = modelGroupElement2;
		modelGroupElement2 = newModelGroupElement2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupPackage.ELEMENT2__MODEL_GROUP_ELEMENT2, oldModelGroupElement2, modelGroupElement2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModelGroupElement3() {
		return modelGroupElement3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelGroupElement3(String newModelGroupElement3) {
		String oldModelGroupElement3 = modelGroupElement3;
		modelGroupElement3 = newModelGroupElement3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupPackage.ELEMENT2__MODEL_GROUP_ELEMENT3, oldModelGroupElement3, modelGroupElement3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GroupPackage.ELEMENT2__MODEL_GROUP_ELEMENT1:
				return getModelGroupElement1();
			case GroupPackage.ELEMENT2__MODEL_GROUP_ELEMENT2:
				return getModelGroupElement2();
			case GroupPackage.ELEMENT2__MODEL_GROUP_ELEMENT3:
				return getModelGroupElement3();
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
			case GroupPackage.ELEMENT2__MODEL_GROUP_ELEMENT1:
				getModelGroupElement1().clear();
				getModelGroupElement1().addAll((Collection<? extends String>)newValue);
				return;
			case GroupPackage.ELEMENT2__MODEL_GROUP_ELEMENT2:
				setModelGroupElement2((String)newValue);
				return;
			case GroupPackage.ELEMENT2__MODEL_GROUP_ELEMENT3:
				setModelGroupElement3((String)newValue);
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
			case GroupPackage.ELEMENT2__MODEL_GROUP_ELEMENT1:
				getModelGroupElement1().clear();
				return;
			case GroupPackage.ELEMENT2__MODEL_GROUP_ELEMENT2:
				setModelGroupElement2(MODEL_GROUP_ELEMENT2_EDEFAULT);
				return;
			case GroupPackage.ELEMENT2__MODEL_GROUP_ELEMENT3:
				setModelGroupElement3(MODEL_GROUP_ELEMENT3_EDEFAULT);
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
			case GroupPackage.ELEMENT2__MODEL_GROUP_ELEMENT1:
				return modelGroupElement1 != null && !modelGroupElement1.isEmpty();
			case GroupPackage.ELEMENT2__MODEL_GROUP_ELEMENT2:
				return MODEL_GROUP_ELEMENT2_EDEFAULT == null ? modelGroupElement2 != null : !MODEL_GROUP_ELEMENT2_EDEFAULT.equals(modelGroupElement2);
			case GroupPackage.ELEMENT2__MODEL_GROUP_ELEMENT3:
				return MODEL_GROUP_ELEMENT3_EDEFAULT == null ? modelGroupElement3 != null : !MODEL_GROUP_ELEMENT3_EDEFAULT.equals(modelGroupElement3);
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
		result.append(" (modelGroupElement1: ");
		result.append(modelGroupElement1);
		result.append(", modelGroupElement2: ");
		result.append(modelGroupElement2);
		result.append(", modelGroupElement3: ");
		result.append(modelGroupElement3);
		result.append(')');
		return result.toString();
	}

} //Element2Impl
