/**
 */
package com.example.example.references.unchanged.impl;

import com.example.example.references.unchanged.OrderDetail2;
import com.example.example.references.unchanged.UnchangedPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order Detail2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.example.example.references.unchanged.impl.OrderDetail2Impl#getCustomerName <em>Customer Name</em>}</li>
 *   <li>{@link com.example.example.references.unchanged.impl.OrderDetail2Impl#getOrderID <em>Order ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrderDetail2Impl extends MinimalEObjectImpl.Container implements OrderDetail2 {
	/**
	 * The default value of the '{@link #getCustomerName() <em>Customer Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerName()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOMER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomerName() <em>Customer Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerName()
	 * @generated
	 * @ordered
	 */
	protected String customerName = CUSTOMER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrderID() <em>Order ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderID()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderID() <em>Order ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderID()
	 * @generated
	 * @ordered
	 */
	protected String orderID = ORDER_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderDetail2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnchangedPackage.Literals.ORDER_DETAIL2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomerName(String newCustomerName) {
		String oldCustomerName = customerName;
		customerName = newCustomerName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnchangedPackage.ORDER_DETAIL2__CUSTOMER_NAME, oldCustomerName, customerName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrderID() {
		return orderID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderID(String newOrderID) {
		String oldOrderID = orderID;
		orderID = newOrderID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnchangedPackage.ORDER_DETAIL2__ORDER_ID, oldOrderID, orderID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UnchangedPackage.ORDER_DETAIL2__CUSTOMER_NAME:
				return getCustomerName();
			case UnchangedPackage.ORDER_DETAIL2__ORDER_ID:
				return getOrderID();
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
			case UnchangedPackage.ORDER_DETAIL2__CUSTOMER_NAME:
				setCustomerName((String)newValue);
				return;
			case UnchangedPackage.ORDER_DETAIL2__ORDER_ID:
				setOrderID((String)newValue);
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
			case UnchangedPackage.ORDER_DETAIL2__CUSTOMER_NAME:
				setCustomerName(CUSTOMER_NAME_EDEFAULT);
				return;
			case UnchangedPackage.ORDER_DETAIL2__ORDER_ID:
				setOrderID(ORDER_ID_EDEFAULT);
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
			case UnchangedPackage.ORDER_DETAIL2__CUSTOMER_NAME:
				return CUSTOMER_NAME_EDEFAULT == null ? customerName != null : !CUSTOMER_NAME_EDEFAULT.equals(customerName);
			case UnchangedPackage.ORDER_DETAIL2__ORDER_ID:
				return ORDER_ID_EDEFAULT == null ? orderID != null : !ORDER_ID_EDEFAULT.equals(orderID);
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
		result.append(" (customerName: ");
		result.append(customerName);
		result.append(", orderID: ");
		result.append(orderID);
		result.append(')');
		return result.toString();
	}

} //OrderDetail2Impl
