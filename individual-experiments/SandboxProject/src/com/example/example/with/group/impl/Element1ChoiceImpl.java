/**
 */
package com.example.example.with.group.impl;

import com.example.example.with.group.Element1Choice;
import com.example.example.with.group.GroupPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element1 Choice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.example.example.with.group.impl.Element1ChoiceImpl#getRepeatableElement1 <em>Repeatable Element1</em>}</li>
 *   <li>{@link com.example.example.with.group.impl.Element1ChoiceImpl#getRepeatableElement2 <em>Repeatable Element2</em>}</li>
 *   <li>{@link com.example.example.with.group.impl.Element1ChoiceImpl#getRepeatableElement3 <em>Repeatable Element3</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Element1ChoiceImpl extends MinimalEObjectImpl.Container implements Element1Choice {
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
	 * The cached value of the '{@link #getRepeatableElement2() <em>Repeatable Element2</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatableElement2()
	 * @generated
	 * @ordered
	 */
	protected EList<String> repeatableElement2;
	/**
	 * The cached value of the '{@link #getRepeatableElement3() <em>Repeatable Element3</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatableElement3()
	 * @generated
	 * @ordered
	 */
	protected EList<String> repeatableElement3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Element1ChoiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GroupPackage.Literals.ELEMENT1_CHOICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRepeatableElement1() {
		if (repeatableElement1 == null) {
			repeatableElement1 = new EDataTypeEList<String>(String.class, this, GroupPackage.ELEMENT1_CHOICE__REPEATABLE_ELEMENT1);
		}
		return repeatableElement1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRepeatableElement2() {
		if (repeatableElement2 == null) {
			repeatableElement2 = new EDataTypeEList<String>(String.class, this, GroupPackage.ELEMENT1_CHOICE__REPEATABLE_ELEMENT2);
		}
		return repeatableElement2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRepeatableElement3() {
		if (repeatableElement3 == null) {
			repeatableElement3 = new EDataTypeEList<String>(String.class, this, GroupPackage.ELEMENT1_CHOICE__REPEATABLE_ELEMENT3);
		}
		return repeatableElement3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GroupPackage.ELEMENT1_CHOICE__REPEATABLE_ELEMENT1:
				return getRepeatableElement1();
			case GroupPackage.ELEMENT1_CHOICE__REPEATABLE_ELEMENT2:
				return getRepeatableElement2();
			case GroupPackage.ELEMENT1_CHOICE__REPEATABLE_ELEMENT3:
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
			case GroupPackage.ELEMENT1_CHOICE__REPEATABLE_ELEMENT1:
				getRepeatableElement1().clear();
				getRepeatableElement1().addAll((Collection<? extends String>)newValue);
				return;
			case GroupPackage.ELEMENT1_CHOICE__REPEATABLE_ELEMENT2:
				getRepeatableElement2().clear();
				getRepeatableElement2().addAll((Collection<? extends String>)newValue);
				return;
			case GroupPackage.ELEMENT1_CHOICE__REPEATABLE_ELEMENT3:
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
			case GroupPackage.ELEMENT1_CHOICE__REPEATABLE_ELEMENT1:
				getRepeatableElement1().clear();
				return;
			case GroupPackage.ELEMENT1_CHOICE__REPEATABLE_ELEMENT2:
				getRepeatableElement2().clear();
				return;
			case GroupPackage.ELEMENT1_CHOICE__REPEATABLE_ELEMENT3:
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
			case GroupPackage.ELEMENT1_CHOICE__REPEATABLE_ELEMENT1:
				return repeatableElement1 != null && !repeatableElement1.isEmpty();
			case GroupPackage.ELEMENT1_CHOICE__REPEATABLE_ELEMENT2:
				return repeatableElement2 != null && !repeatableElement2.isEmpty();
			case GroupPackage.ELEMENT1_CHOICE__REPEATABLE_ELEMENT3:
				return repeatableElement3 != null && !repeatableElement3.isEmpty();
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

} //Element1ChoiceImpl
