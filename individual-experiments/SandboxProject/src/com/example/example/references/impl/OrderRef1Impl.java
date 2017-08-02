/**
 */
package com.example.example.references.impl;

import com.example.example.references.OrderDetail1;
import com.example.example.references.OrderRef1;
import com.example.example.references.ReferencesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order Ref1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.example.example.references.impl.OrderRef1Impl#getOrderDetail1 <em>Order Detail1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrderRef1Impl extends MinimalEObjectImpl.Container implements OrderRef1 {
	/**
	 * The cached value of the '{@link #getOrderDetail1() <em>Order Detail1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderDetail1()
	 * @generated
	 * @ordered
	 */
	protected OrderDetail1 orderDetail1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderRef1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReferencesPackage.Literals.ORDER_REF1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderDetail1 getOrderDetail1() {
		return orderDetail1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderDetail1(OrderDetail1 newOrderDetail1) {
		OrderDetail1 oldOrderDetail1 = orderDetail1;
		orderDetail1 = newOrderDetail1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferencesPackage.ORDER_REF1__ORDER_DETAIL1, oldOrderDetail1, orderDetail1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReferencesPackage.ORDER_REF1__ORDER_DETAIL1:
				return getOrderDetail1();
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
			case ReferencesPackage.ORDER_REF1__ORDER_DETAIL1:
				setOrderDetail1((OrderDetail1)newValue);
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
			case ReferencesPackage.ORDER_REF1__ORDER_DETAIL1:
				setOrderDetail1((OrderDetail1)null);
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
			case ReferencesPackage.ORDER_REF1__ORDER_DETAIL1:
				return orderDetail1 != null;
		}
		return super.eIsSet(featureID);
	}

} //OrderRef1Impl
