/**
 */
package com.example.example.with.mixed.unchanged.impl;

import com.example.example.with.mixed.unchanged.CustomersType;
import com.example.example.with.mixed.unchanged.MixedType;
import com.example.example.with.mixed.unchanged.RootElementType;
import com.example.example.with.mixed.unchanged.UnchangedPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root Element Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.example.example.with.mixed.unchanged.impl.RootElementTypeImpl#getElement1 <em>Element1</em>}</li>
 *   <li>{@link com.example.example.with.mixed.unchanged.impl.RootElementTypeImpl#getElement2 <em>Element2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RootElementTypeImpl extends MinimalEObjectImpl.Container implements RootElementType {
	/**
	 * The cached value of the '{@link #getElement1() <em>Element1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement1()
	 * @generated
	 * @ordered
	 */
	protected MixedType element1;

	/**
	 * The cached value of the '{@link #getElement2() <em>Element2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement2()
	 * @generated
	 * @ordered
	 */
	protected CustomersType element2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootElementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnchangedPackage.Literals.ROOT_ELEMENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MixedType getElement1() {
		return element1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElement1(MixedType newElement1, NotificationChain msgs) {
		MixedType oldElement1 = element1;
		element1 = newElement1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnchangedPackage.ROOT_ELEMENT_TYPE__ELEMENT1, oldElement1, newElement1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement1(MixedType newElement1) {
		if (newElement1 != element1) {
			NotificationChain msgs = null;
			if (element1 != null)
				msgs = ((InternalEObject)element1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnchangedPackage.ROOT_ELEMENT_TYPE__ELEMENT1, null, msgs);
			if (newElement1 != null)
				msgs = ((InternalEObject)newElement1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnchangedPackage.ROOT_ELEMENT_TYPE__ELEMENT1, null, msgs);
			msgs = basicSetElement1(newElement1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnchangedPackage.ROOT_ELEMENT_TYPE__ELEMENT1, newElement1, newElement1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomersType getElement2() {
		return element2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElement2(CustomersType newElement2, NotificationChain msgs) {
		CustomersType oldElement2 = element2;
		element2 = newElement2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnchangedPackage.ROOT_ELEMENT_TYPE__ELEMENT2, oldElement2, newElement2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement2(CustomersType newElement2) {
		if (newElement2 != element2) {
			NotificationChain msgs = null;
			if (element2 != null)
				msgs = ((InternalEObject)element2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnchangedPackage.ROOT_ELEMENT_TYPE__ELEMENT2, null, msgs);
			if (newElement2 != null)
				msgs = ((InternalEObject)newElement2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnchangedPackage.ROOT_ELEMENT_TYPE__ELEMENT2, null, msgs);
			msgs = basicSetElement2(newElement2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnchangedPackage.ROOT_ELEMENT_TYPE__ELEMENT2, newElement2, newElement2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnchangedPackage.ROOT_ELEMENT_TYPE__ELEMENT1:
				return basicSetElement1(null, msgs);
			case UnchangedPackage.ROOT_ELEMENT_TYPE__ELEMENT2:
				return basicSetElement2(null, msgs);
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
			case UnchangedPackage.ROOT_ELEMENT_TYPE__ELEMENT1:
				return getElement1();
			case UnchangedPackage.ROOT_ELEMENT_TYPE__ELEMENT2:
				return getElement2();
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
			case UnchangedPackage.ROOT_ELEMENT_TYPE__ELEMENT1:
				setElement1((MixedType)newValue);
				return;
			case UnchangedPackage.ROOT_ELEMENT_TYPE__ELEMENT2:
				setElement2((CustomersType)newValue);
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
			case UnchangedPackage.ROOT_ELEMENT_TYPE__ELEMENT1:
				setElement1((MixedType)null);
				return;
			case UnchangedPackage.ROOT_ELEMENT_TYPE__ELEMENT2:
				setElement2((CustomersType)null);
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
			case UnchangedPackage.ROOT_ELEMENT_TYPE__ELEMENT1:
				return element1 != null;
			case UnchangedPackage.ROOT_ELEMENT_TYPE__ELEMENT2:
				return element2 != null;
		}
		return super.eIsSet(featureID);
	}

} //RootElementTypeImpl
