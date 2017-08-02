/**
 */
package com.example.example.restrictions.impl;

import com.example.example.restrictions.OrderDetail;
import com.example.example.restrictions.RestrictedAddress;
import com.example.example.restrictions.RestrictionsPackage;
import com.example.example.restrictions.USState;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order Detail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.example.example.restrictions.impl.OrderDetailImpl#getCustomerAddress <em>Customer Address</em>}</li>
 *   <li>{@link com.example.example.restrictions.impl.OrderDetailImpl#getCustomerAge <em>Customer Age</em>}</li>
 *   <li>{@link com.example.example.restrictions.impl.OrderDetailImpl#getCustomerContact1 <em>Customer Contact1</em>}</li>
 *   <li>{@link com.example.example.restrictions.impl.OrderDetailImpl#getCustomerFirstName <em>Customer First Name</em>}</li>
 *   <li>{@link com.example.example.restrictions.impl.OrderDetailImpl#getCustomerLastName <em>Customer Last Name</em>}</li>
 *   <li>{@link com.example.example.restrictions.impl.OrderDetailImpl#getCustomerNumber <em>Customer Number</em>}</li>
 *   <li>{@link com.example.example.restrictions.impl.OrderDetailImpl#getCustomerPassword <em>Customer Password</em>}</li>
 *   <li>{@link com.example.example.restrictions.impl.OrderDetailImpl#getCustomerUSState <em>Customer US State</em>}</li>
 *   <li>{@link com.example.example.restrictions.impl.OrderDetailImpl#getOrderID <em>Order ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrderDetailImpl extends MinimalEObjectImpl.Container implements OrderDetail {
	/**
	 * The cached value of the '{@link #getCustomerAddress() <em>Customer Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerAddress()
	 * @generated
	 * @ordered
	 */
	protected RestrictedAddress customerAddress;

	/**
	 * The default value of the '{@link #getCustomerAge() <em>Customer Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerAge()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger CUSTOMER_AGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomerAge() <em>Customer Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerAge()
	 * @generated
	 * @ordered
	 */
	protected BigInteger customerAge = CUSTOMER_AGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustomerContact1() <em>Customer Contact1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerContact1()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger CUSTOMER_CONTACT1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomerContact1() <em>Customer Contact1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerContact1()
	 * @generated
	 * @ordered
	 */
	protected BigInteger customerContact1 = CUSTOMER_CONTACT1_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustomerFirstName() <em>Customer First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOMER_FIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomerFirstName() <em>Customer First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerFirstName()
	 * @generated
	 * @ordered
	 */
	protected String customerFirstName = CUSTOMER_FIRST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustomerLastName() <em>Customer Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerLastName()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOMER_LAST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomerLastName() <em>Customer Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerLastName()
	 * @generated
	 * @ordered
	 */
	protected String customerLastName = CUSTOMER_LAST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustomerNumber() <em>Customer Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOMER_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomerNumber() <em>Customer Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerNumber()
	 * @generated
	 * @ordered
	 */
	protected String customerNumber = CUSTOMER_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustomerPassword() <em>Customer Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOMER_PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomerPassword() <em>Customer Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerPassword()
	 * @generated
	 * @ordered
	 */
	protected String customerPassword = CUSTOMER_PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustomerUSState() <em>Customer US State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerUSState()
	 * @generated
	 * @ordered
	 */
	protected static final USState CUSTOMER_US_STATE_EDEFAULT = USState.AK;

	/**
	 * The cached value of the '{@link #getCustomerUSState() <em>Customer US State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerUSState()
	 * @generated
	 * @ordered
	 */
	protected USState customerUSState = CUSTOMER_US_STATE_EDEFAULT;

	/**
	 * This is true if the Customer US State attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean customerUSStateESet;

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
	protected OrderDetailImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestrictionsPackage.Literals.ORDER_DETAIL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestrictedAddress getCustomerAddress() {
		return customerAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomerAddress(RestrictedAddress newCustomerAddress, NotificationChain msgs) {
		RestrictedAddress oldCustomerAddress = customerAddress;
		customerAddress = newCustomerAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RestrictionsPackage.ORDER_DETAIL__CUSTOMER_ADDRESS, oldCustomerAddress, newCustomerAddress);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomerAddress(RestrictedAddress newCustomerAddress) {
		if (newCustomerAddress != customerAddress) {
			NotificationChain msgs = null;
			if (customerAddress != null)
				msgs = ((InternalEObject)customerAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RestrictionsPackage.ORDER_DETAIL__CUSTOMER_ADDRESS, null, msgs);
			if (newCustomerAddress != null)
				msgs = ((InternalEObject)newCustomerAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RestrictionsPackage.ORDER_DETAIL__CUSTOMER_ADDRESS, null, msgs);
			msgs = basicSetCustomerAddress(newCustomerAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestrictionsPackage.ORDER_DETAIL__CUSTOMER_ADDRESS, newCustomerAddress, newCustomerAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getCustomerAge() {
		return customerAge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomerAge(BigInteger newCustomerAge) {
		BigInteger oldCustomerAge = customerAge;
		customerAge = newCustomerAge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestrictionsPackage.ORDER_DETAIL__CUSTOMER_AGE, oldCustomerAge, customerAge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getCustomerContact1() {
		return customerContact1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomerContact1(BigInteger newCustomerContact1) {
		BigInteger oldCustomerContact1 = customerContact1;
		customerContact1 = newCustomerContact1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestrictionsPackage.ORDER_DETAIL__CUSTOMER_CONTACT1, oldCustomerContact1, customerContact1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomerFirstName() {
		return customerFirstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomerFirstName(String newCustomerFirstName) {
		String oldCustomerFirstName = customerFirstName;
		customerFirstName = newCustomerFirstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestrictionsPackage.ORDER_DETAIL__CUSTOMER_FIRST_NAME, oldCustomerFirstName, customerFirstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomerLastName() {
		return customerLastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomerLastName(String newCustomerLastName) {
		String oldCustomerLastName = customerLastName;
		customerLastName = newCustomerLastName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestrictionsPackage.ORDER_DETAIL__CUSTOMER_LAST_NAME, oldCustomerLastName, customerLastName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomerNumber() {
		return customerNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomerNumber(String newCustomerNumber) {
		String oldCustomerNumber = customerNumber;
		customerNumber = newCustomerNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestrictionsPackage.ORDER_DETAIL__CUSTOMER_NUMBER, oldCustomerNumber, customerNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomerPassword() {
		return customerPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomerPassword(String newCustomerPassword) {
		String oldCustomerPassword = customerPassword;
		customerPassword = newCustomerPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestrictionsPackage.ORDER_DETAIL__CUSTOMER_PASSWORD, oldCustomerPassword, customerPassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public USState getCustomerUSState() {
		return customerUSState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomerUSState(USState newCustomerUSState) {
		USState oldCustomerUSState = customerUSState;
		customerUSState = newCustomerUSState == null ? CUSTOMER_US_STATE_EDEFAULT : newCustomerUSState;
		boolean oldCustomerUSStateESet = customerUSStateESet;
		customerUSStateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestrictionsPackage.ORDER_DETAIL__CUSTOMER_US_STATE, oldCustomerUSState, customerUSState, !oldCustomerUSStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCustomerUSState() {
		USState oldCustomerUSState = customerUSState;
		boolean oldCustomerUSStateESet = customerUSStateESet;
		customerUSState = CUSTOMER_US_STATE_EDEFAULT;
		customerUSStateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RestrictionsPackage.ORDER_DETAIL__CUSTOMER_US_STATE, oldCustomerUSState, CUSTOMER_US_STATE_EDEFAULT, oldCustomerUSStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCustomerUSState() {
		return customerUSStateESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RestrictionsPackage.ORDER_DETAIL__ORDER_ID, oldOrderID, orderID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RestrictionsPackage.ORDER_DETAIL__CUSTOMER_ADDRESS:
				return basicSetCustomerAddress(null, msgs);
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
			case RestrictionsPackage.ORDER_DETAIL__CUSTOMER_ADDRESS:
				return getCustomerAddress();
			case RestrictionsPackage.ORDER_DETAIL__CUSTOMER_AGE:
				return getCustomerAge();
			case RestrictionsPackage.ORDER_DETAIL__CUSTOMER_CONTACT1:
				return getCustomerContact1();
			case RestrictionsPackage.ORDER_DETAIL__CUSTOMER_FIRST_NAME:
				return getCustomerFirstName();
			case RestrictionsPackage.ORDER_DETAIL__CUSTOMER_LAST_NAME:
				return getCustomerLastName();
			case RestrictionsPackage.ORDER_DETAIL__CUSTOMER_NUMBER:
				return getCustomerNumber();
			case RestrictionsPackage.ORDER_DETAIL__CUSTOMER_PASSWORD:
				return getCustomerPassword();
			case RestrictionsPackage.ORDER_DETAIL__CUSTOMER_US_STATE:
				return getCustomerUSState();
			case RestrictionsPackage.ORDER_DETAIL__ORDER_ID:
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
			case RestrictionsPackage.ORDER_DETAIL__CUSTOMER_ADDRESS:
				setCustomerAddress((RestrictedAddress)newValue);
				return;
			case RestrictionsPackage.ORDER_DETAIL__CUSTOMER_AGE:
				setCustomerAge((BigInteger)newValue);
				return;
			case RestrictionsPackage.ORDER_DETAIL__CUSTOMER_CONTACT1:
				setCustomerContact1((BigInteger)newValue);
				return;
			case RestrictionsPackage.ORDER_DETAIL__CUSTOMER_FIRST_NAME:
				setCustomerFirstName((String)newValue);
				return;
			case RestrictionsPackage.ORDER_DETAIL__CUSTOMER_LAST_NAME:
				setCustomerLastName((String)newValue);
				return;
			case RestrictionsPackage.ORDER_DETAIL__CUSTOMER_NUMBER:
				setCustomerNumber((String)newValue);
				return;
			case RestrictionsPackage.ORDER_DETAIL__CUSTOMER_PASSWORD:
				setCustomerPassword((String)newValue);
				return;
			case RestrictionsPackage.ORDER_DETAIL__CUSTOMER_US_STATE:
				setCustomerUSState((USState)newValue);
				return;
			case RestrictionsPackage.ORDER_DETAIL__ORDER_ID:
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
			case RestrictionsPackage.ORDER_DETAIL__CUSTOMER_ADDRESS:
				setCustomerAddress((RestrictedAddress)null);
				return;
			case RestrictionsPackage.ORDER_DETAIL__CUSTOMER_AGE:
				setCustomerAge(CUSTOMER_AGE_EDEFAULT);
				return;
			case RestrictionsPackage.ORDER_DETAIL__CUSTOMER_CONTACT1:
				setCustomerContact1(CUSTOMER_CONTACT1_EDEFAULT);
				return;
			case RestrictionsPackage.ORDER_DETAIL__CUSTOMER_FIRST_NAME:
				setCustomerFirstName(CUSTOMER_FIRST_NAME_EDEFAULT);
				return;
			case RestrictionsPackage.ORDER_DETAIL__CUSTOMER_LAST_NAME:
				setCustomerLastName(CUSTOMER_LAST_NAME_EDEFAULT);
				return;
			case RestrictionsPackage.ORDER_DETAIL__CUSTOMER_NUMBER:
				setCustomerNumber(CUSTOMER_NUMBER_EDEFAULT);
				return;
			case RestrictionsPackage.ORDER_DETAIL__CUSTOMER_PASSWORD:
				setCustomerPassword(CUSTOMER_PASSWORD_EDEFAULT);
				return;
			case RestrictionsPackage.ORDER_DETAIL__CUSTOMER_US_STATE:
				unsetCustomerUSState();
				return;
			case RestrictionsPackage.ORDER_DETAIL__ORDER_ID:
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
			case RestrictionsPackage.ORDER_DETAIL__CUSTOMER_ADDRESS:
				return customerAddress != null;
			case RestrictionsPackage.ORDER_DETAIL__CUSTOMER_AGE:
				return CUSTOMER_AGE_EDEFAULT == null ? customerAge != null : !CUSTOMER_AGE_EDEFAULT.equals(customerAge);
			case RestrictionsPackage.ORDER_DETAIL__CUSTOMER_CONTACT1:
				return CUSTOMER_CONTACT1_EDEFAULT == null ? customerContact1 != null : !CUSTOMER_CONTACT1_EDEFAULT.equals(customerContact1);
			case RestrictionsPackage.ORDER_DETAIL__CUSTOMER_FIRST_NAME:
				return CUSTOMER_FIRST_NAME_EDEFAULT == null ? customerFirstName != null : !CUSTOMER_FIRST_NAME_EDEFAULT.equals(customerFirstName);
			case RestrictionsPackage.ORDER_DETAIL__CUSTOMER_LAST_NAME:
				return CUSTOMER_LAST_NAME_EDEFAULT == null ? customerLastName != null : !CUSTOMER_LAST_NAME_EDEFAULT.equals(customerLastName);
			case RestrictionsPackage.ORDER_DETAIL__CUSTOMER_NUMBER:
				return CUSTOMER_NUMBER_EDEFAULT == null ? customerNumber != null : !CUSTOMER_NUMBER_EDEFAULT.equals(customerNumber);
			case RestrictionsPackage.ORDER_DETAIL__CUSTOMER_PASSWORD:
				return CUSTOMER_PASSWORD_EDEFAULT == null ? customerPassword != null : !CUSTOMER_PASSWORD_EDEFAULT.equals(customerPassword);
			case RestrictionsPackage.ORDER_DETAIL__CUSTOMER_US_STATE:
				return isSetCustomerUSState();
			case RestrictionsPackage.ORDER_DETAIL__ORDER_ID:
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
		result.append(" (customerAge: ");
		result.append(customerAge);
		result.append(", customerContact1: ");
		result.append(customerContact1);
		result.append(", customerFirstName: ");
		result.append(customerFirstName);
		result.append(", customerLastName: ");
		result.append(customerLastName);
		result.append(", customerNumber: ");
		result.append(customerNumber);
		result.append(", customerPassword: ");
		result.append(customerPassword);
		result.append(", customerUSState: ");
		if (customerUSStateESet) result.append(customerUSState); else result.append("<unset>");
		result.append(", orderID: ");
		result.append(orderID);
		result.append(')');
		return result.toString();
	}

} //OrderDetailImpl
