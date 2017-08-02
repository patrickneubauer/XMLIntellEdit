/**
 */
package com.example.example.referencesuntypedimports.impl;

import com.example.example.referencesuntypedimports.OrderRef2;
import com.example.example.referencesuntypedimports.ReferencesuntypedimportsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order Ref2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.example.example.referencesuntypedimports.impl.OrderRef2Impl#getOrderDetail2 <em>Order Detail2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrderRef2Impl extends MinimalEObjectImpl.Container implements OrderRef2 {
	/**
	 * The cached value of the '{@link #getOrderDetail2() <em>Order Detail2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderDetail2()
	 * @generated
	 * @ordered
	 */
	protected EObject orderDetail2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderRef2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReferencesuntypedimportsPackage.Literals.ORDER_REF2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getOrderDetail2() {
		return orderDetail2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderDetail2(EObject newOrderDetail2) {
		EObject oldOrderDetail2 = orderDetail2;
		orderDetail2 = newOrderDetail2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferencesuntypedimportsPackage.ORDER_REF2__ORDER_DETAIL2, oldOrderDetail2, orderDetail2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReferencesuntypedimportsPackage.ORDER_REF2__ORDER_DETAIL2:
				return getOrderDetail2();
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
			case ReferencesuntypedimportsPackage.ORDER_REF2__ORDER_DETAIL2:
				setOrderDetail2((EObject)newValue);
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
			case ReferencesuntypedimportsPackage.ORDER_REF2__ORDER_DETAIL2:
				setOrderDetail2((EObject)null);
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
			case ReferencesuntypedimportsPackage.ORDER_REF2__ORDER_DETAIL2:
				return orderDetail2 != null;
		}
		return super.eIsSet(featureID);
	}

} //OrderRef2Impl
