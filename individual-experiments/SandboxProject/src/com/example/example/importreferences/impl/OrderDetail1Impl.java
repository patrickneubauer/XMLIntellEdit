/**
 */
package com.example.example.importreferences.impl;

import com.example.example.importreferences.ImportreferencesPackage;
import com.example.example.importreferences.OrderDetail1;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order Detail1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.example.example.importreferences.impl.OrderDetail1Impl#getCustomerAddress <em>Customer Address</em>}</li>
 *   <li>{@link com.example.example.importreferences.impl.OrderDetail1Impl#getCustomerContact <em>Customer Contact</em>}</li>
 *   <li>{@link com.example.example.importreferences.impl.OrderDetail1Impl#getCustomerName <em>Customer Name</em>}</li>
 *   <li>{@link com.example.example.importreferences.impl.OrderDetail1Impl#getOrderID <em>Order ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrderDetail1Impl extends MinimalEObjectImpl.Container implements OrderDetail1 {
	/**
	 * The default value of the '{@link #getCustomerAddress() <em>Customer Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOMER_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomerAddress() <em>Customer Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerAddress()
	 * @generated
	 * @ordered
	 */
	protected String customerAddress = CUSTOMER_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustomerContact() <em>Customer Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerContact()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOMER_CONTACT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomerContact() <em>Customer Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerContact()
	 * @generated
	 * @ordered
	 */
	protected String customerContact = CUSTOMER_CONTACT_EDEFAULT;

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
	protected OrderDetail1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImportreferencesPackage.Literals.ORDER_DETAIL1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomerAddress() {
		return customerAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomerAddress(String newCustomerAddress) {
		String oldCustomerAddress = customerAddress;
		customerAddress = newCustomerAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImportreferencesPackage.ORDER_DETAIL1__CUSTOMER_ADDRESS, oldCustomerAddress, customerAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomerContact() {
		return customerContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomerContact(String newCustomerContact) {
		String oldCustomerContact = customerContact;
		customerContact = newCustomerContact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImportreferencesPackage.ORDER_DETAIL1__CUSTOMER_CONTACT, oldCustomerContact, customerContact));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ImportreferencesPackage.ORDER_DETAIL1__CUSTOMER_NAME, oldCustomerName, customerName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ImportreferencesPackage.ORDER_DETAIL1__ORDER_ID, oldOrderID, orderID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImportreferencesPackage.ORDER_DETAIL1__CUSTOMER_ADDRESS:
				return getCustomerAddress();
			case ImportreferencesPackage.ORDER_DETAIL1__CUSTOMER_CONTACT:
				return getCustomerContact();
			case ImportreferencesPackage.ORDER_DETAIL1__CUSTOMER_NAME:
				return getCustomerName();
			case ImportreferencesPackage.ORDER_DETAIL1__ORDER_ID:
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
			case ImportreferencesPackage.ORDER_DETAIL1__CUSTOMER_ADDRESS:
				setCustomerAddress((String)newValue);
				return;
			case ImportreferencesPackage.ORDER_DETAIL1__CUSTOMER_CONTACT:
				setCustomerContact((String)newValue);
				return;
			case ImportreferencesPackage.ORDER_DETAIL1__CUSTOMER_NAME:
				setCustomerName((String)newValue);
				return;
			case ImportreferencesPackage.ORDER_DETAIL1__ORDER_ID:
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
			case ImportreferencesPackage.ORDER_DETAIL1__CUSTOMER_ADDRESS:
				setCustomerAddress(CUSTOMER_ADDRESS_EDEFAULT);
				return;
			case ImportreferencesPackage.ORDER_DETAIL1__CUSTOMER_CONTACT:
				setCustomerContact(CUSTOMER_CONTACT_EDEFAULT);
				return;
			case ImportreferencesPackage.ORDER_DETAIL1__CUSTOMER_NAME:
				setCustomerName(CUSTOMER_NAME_EDEFAULT);
				return;
			case ImportreferencesPackage.ORDER_DETAIL1__ORDER_ID:
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
			case ImportreferencesPackage.ORDER_DETAIL1__CUSTOMER_ADDRESS:
				return CUSTOMER_ADDRESS_EDEFAULT == null ? customerAddress != null : !CUSTOMER_ADDRESS_EDEFAULT.equals(customerAddress);
			case ImportreferencesPackage.ORDER_DETAIL1__CUSTOMER_CONTACT:
				return CUSTOMER_CONTACT_EDEFAULT == null ? customerContact != null : !CUSTOMER_CONTACT_EDEFAULT.equals(customerContact);
			case ImportreferencesPackage.ORDER_DETAIL1__CUSTOMER_NAME:
				return CUSTOMER_NAME_EDEFAULT == null ? customerName != null : !CUSTOMER_NAME_EDEFAULT.equals(customerName);
			case ImportreferencesPackage.ORDER_DETAIL1__ORDER_ID:
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
		result.append(" (customerAddress: ");
		result.append(customerAddress);
		result.append(", customerContact: ");
		result.append(customerContact);
		result.append(", customerName: ");
		result.append(customerName);
		result.append(", orderID: ");
		result.append(orderID);
		result.append(')');
		return result.toString();
	}

} //OrderDetail1Impl
