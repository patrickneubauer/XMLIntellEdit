/**
 */
package com.example.example.with.group.impl;

import com.example.example.with.group.Element3;
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
 * An implementation of the model object '<em><b>Element3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.example.example.with.group.impl.Element3Impl#getRepeatableElement1 <em>Repeatable Element1</em>}</li>
 *   <li>{@link com.example.example.with.group.impl.Element3Impl#getRepeatableElement2 <em>Repeatable Element2</em>}</li>
 *   <li>{@link com.example.example.with.group.impl.Element3Impl#getRepeatableElement3 <em>Repeatable Element3</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Element3Impl extends MinimalEObjectImpl.Container implements Element3 {
	/**
	 * The cached value of the '{@link #getRepeatableElement1() <em>Repeatable Element1</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatableElement1()
	 * @generated
	 * @ordered
	 */
	protected EList<String> repeatableElement1;

	/**
	 * The default value of the '{@link #getRepeatableElement2() <em>Repeatable Element2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatableElement2()
	 * @generated
	 * @ordered
	 */
	protected static final String REPEATABLE_ELEMENT2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepeatableElement2() <em>Repeatable Element2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatableElement2()
	 * @generated
	 * @ordered
	 */
	protected String repeatableElement2 = REPEATABLE_ELEMENT2_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepeatableElement3() <em>Repeatable Element3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatableElement3()
	 * @generated
	 * @ordered
	 */
	protected static final String REPEATABLE_ELEMENT3_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepeatableElement3() <em>Repeatable Element3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatableElement3()
	 * @generated
	 * @ordered
	 */
	protected String repeatableElement3 = REPEATABLE_ELEMENT3_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Element3Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GroupPackage.Literals.ELEMENT3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRepeatableElement1() {
		if (repeatableElement1 == null) {
			repeatableElement1 = new EDataTypeEList<String>(String.class, this, GroupPackage.ELEMENT3__REPEATABLE_ELEMENT1);
		}
		return repeatableElement1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRepeatableElement2() {
		return repeatableElement2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepeatableElement2(String newRepeatableElement2) {
		String oldRepeatableElement2 = repeatableElement2;
		repeatableElement2 = newRepeatableElement2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupPackage.ELEMENT3__REPEATABLE_ELEMENT2, oldRepeatableElement2, repeatableElement2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRepeatableElement3() {
		return repeatableElement3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepeatableElement3(String newRepeatableElement3) {
		String oldRepeatableElement3 = repeatableElement3;
		repeatableElement3 = newRepeatableElement3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupPackage.ELEMENT3__REPEATABLE_ELEMENT3, oldRepeatableElement3, repeatableElement3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GroupPackage.ELEMENT3__REPEATABLE_ELEMENT1:
				return getRepeatableElement1();
			case GroupPackage.ELEMENT3__REPEATABLE_ELEMENT2:
				return getRepeatableElement2();
			case GroupPackage.ELEMENT3__REPEATABLE_ELEMENT3:
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
			case GroupPackage.ELEMENT3__REPEATABLE_ELEMENT1:
				getRepeatableElement1().clear();
				getRepeatableElement1().addAll((Collection<? extends String>)newValue);
				return;
			case GroupPackage.ELEMENT3__REPEATABLE_ELEMENT2:
				setRepeatableElement2((String)newValue);
				return;
			case GroupPackage.ELEMENT3__REPEATABLE_ELEMENT3:
				setRepeatableElement3((String)newValue);
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
			case GroupPackage.ELEMENT3__REPEATABLE_ELEMENT1:
				getRepeatableElement1().clear();
				return;
			case GroupPackage.ELEMENT3__REPEATABLE_ELEMENT2:
				setRepeatableElement2(REPEATABLE_ELEMENT2_EDEFAULT);
				return;
			case GroupPackage.ELEMENT3__REPEATABLE_ELEMENT3:
				setRepeatableElement3(REPEATABLE_ELEMENT3_EDEFAULT);
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
			case GroupPackage.ELEMENT3__REPEATABLE_ELEMENT1:
				return repeatableElement1 != null && !repeatableElement1.isEmpty();
			case GroupPackage.ELEMENT3__REPEATABLE_ELEMENT2:
				return REPEATABLE_ELEMENT2_EDEFAULT == null ? repeatableElement2 != null : !REPEATABLE_ELEMENT2_EDEFAULT.equals(repeatableElement2);
			case GroupPackage.ELEMENT3__REPEATABLE_ELEMENT3:
				return REPEATABLE_ELEMENT3_EDEFAULT == null ? repeatableElement3 != null : !REPEATABLE_ELEMENT3_EDEFAULT.equals(repeatableElement3);
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
		result.append(" (repeatableElement1: ");
		result.append(repeatableElement1);
		result.append(", repeatableElement2: ");
		result.append(repeatableElement2);
		result.append(", repeatableElement3: ");
		result.append(repeatableElement3);
		result.append(')');
		return result.toString();
	}

} //Element3Impl
