/**
 */
package com.example.example.references.unchanged.impl;

import com.example.example.references.unchanged.OrderRef1;
import com.example.example.references.unchanged.UnchangedPackage;
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
 *   <li>{@link com.example.example.references.unchanged.impl.OrderRef1Impl#getOrderDetail1 <em>Order Detail1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrderRef1Impl extends MinimalEObjectImpl.Container implements OrderRef1 {
	/**
	 * The default value of the '{@link #getOrderDetail1() <em>Order Detail1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderDetail1()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDER_DETAIL1_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getOrderDetail1() <em>Order Detail1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderDetail1()
	 * @generated
	 * @ordered
	 */
	protected String orderDetail1 = ORDER_DETAIL1_EDEFAULT;

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
		return UnchangedPackage.Literals.ORDER_REF1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrderDetail1() {
		return orderDetail1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderDetail1(String newOrderDetail1) {
		String oldOrderDetail1 = orderDetail1;
		orderDetail1 = newOrderDetail1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnchangedPackage.ORDER_REF1__ORDER_DETAIL1, oldOrderDetail1, orderDetail1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UnchangedPackage.ORDER_REF1__ORDER_DETAIL1:
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
			case UnchangedPackage.ORDER_REF1__ORDER_DETAIL1:
				setOrderDetail1((String)newValue);
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
			case UnchangedPackage.ORDER_REF1__ORDER_DETAIL1:
				setOrderDetail1(ORDER_DETAIL1_EDEFAULT);
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
			case UnchangedPackage.ORDER_REF1__ORDER_DETAIL1:
				return ORDER_DETAIL1_EDEFAULT == null ? orderDetail1 != null : !ORDER_DETAIL1_EDEFAULT.equals(orderDetail1);
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
		result.append(" (orderDetail1: ");
		result.append(orderDetail1);
		result.append(')');
		return result.toString();
	}

} //OrderRef1Impl
