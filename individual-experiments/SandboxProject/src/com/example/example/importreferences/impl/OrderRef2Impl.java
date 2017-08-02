/**
 */
package com.example.example.importreferences.impl;

import com.example.example.importreferences.ImportreferencesPackage;
import com.example.example.importreferences.OrderDetail2;
import com.example.example.importreferences.OrderRef2;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order Ref2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.example.example.importreferences.impl.OrderRef2Impl#getOrderDetail2 <em>Order Detail2</em>}</li>
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
	protected OrderDetail2 orderDetail2;

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
		return ImportreferencesPackage.Literals.ORDER_REF2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderDetail2 getOrderDetail2() {
		return orderDetail2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderDetail2(OrderDetail2 newOrderDetail2) {
		OrderDetail2 oldOrderDetail2 = orderDetail2;
		orderDetail2 = newOrderDetail2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImportreferencesPackage.ORDER_REF2__ORDER_DETAIL2, oldOrderDetail2, orderDetail2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImportreferencesPackage.ORDER_REF2__ORDER_DETAIL2:
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
			case ImportreferencesPackage.ORDER_REF2__ORDER_DETAIL2:
				setOrderDetail2((OrderDetail2)newValue);
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
			case ImportreferencesPackage.ORDER_REF2__ORDER_DETAIL2:
				setOrderDetail2((OrderDetail2)null);
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
			case ImportreferencesPackage.ORDER_REF2__ORDER_DETAIL2:
				return orderDetail2 != null;
		}
		return super.eIsSet(featureID);
	}

} //OrderRef2Impl
