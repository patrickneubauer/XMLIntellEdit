/**
 */
package com.example.example.referencesuntyped.impl;

import com.example.example.referencesuntyped.OrderRef2;
import com.example.example.referencesuntyped.ReferencesuntypedPackage;
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
 *   <li>{@link com.example.example.referencesuntyped.impl.OrderRef2Impl#getOrderDetail2 <em>Order Detail2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrderRef2Impl extends MinimalEObjectImpl.Container implements OrderRef2 {
	/**
	 * The default value of the '{@link #getOrderDetail2() <em>Order Detail2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderDetail2()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDER_DETAIL2_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getOrderDetail2() <em>Order Detail2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderDetail2()
	 * @generated
	 * @ordered
	 */
	protected String orderDetail2 = ORDER_DETAIL2_EDEFAULT;

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
		return ReferencesuntypedPackage.Literals.ORDER_REF2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrderDetail2() {
		return orderDetail2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderDetail2(String newOrderDetail2) {
		String oldOrderDetail2 = orderDetail2;
		orderDetail2 = newOrderDetail2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferencesuntypedPackage.ORDER_REF2__ORDER_DETAIL2, oldOrderDetail2, orderDetail2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReferencesuntypedPackage.ORDER_REF2__ORDER_DETAIL2:
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
			case ReferencesuntypedPackage.ORDER_REF2__ORDER_DETAIL2:
				setOrderDetail2((String)newValue);
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
			case ReferencesuntypedPackage.ORDER_REF2__ORDER_DETAIL2:
				setOrderDetail2(ORDER_DETAIL2_EDEFAULT);
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
			case ReferencesuntypedPackage.ORDER_REF2__ORDER_DETAIL2:
				return ORDER_DETAIL2_EDEFAULT == null ? orderDetail2 != null : !ORDER_DETAIL2_EDEFAULT.equals(orderDetail2);
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
		result.append(" (orderDetail2: ");
		result.append(orderDetail2);
		result.append(')');
		return result.toString();
	}

} //OrderRef2Impl
