/**
 */
package com.example.example.restrictions;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.example.example.restrictions.OrderDetail#getCustomerAddress <em>Customer Address</em>}</li>
 *   <li>{@link com.example.example.restrictions.OrderDetail#getCustomerAge <em>Customer Age</em>}</li>
 *   <li>{@link com.example.example.restrictions.OrderDetail#getCustomerContact1 <em>Customer Contact1</em>}</li>
 *   <li>{@link com.example.example.restrictions.OrderDetail#getCustomerFirstName <em>Customer First Name</em>}</li>
 *   <li>{@link com.example.example.restrictions.OrderDetail#getCustomerLastName <em>Customer Last Name</em>}</li>
 *   <li>{@link com.example.example.restrictions.OrderDetail#getCustomerNumber <em>Customer Number</em>}</li>
 *   <li>{@link com.example.example.restrictions.OrderDetail#getCustomerPassword <em>Customer Password</em>}</li>
 *   <li>{@link com.example.example.restrictions.OrderDetail#getCustomerUSState <em>Customer US State</em>}</li>
 *   <li>{@link com.example.example.restrictions.OrderDetail#getOrderID <em>Order ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.example.restrictions.RestrictionsPackage#getOrderDetail()
 * @model extendedMetaData="name='OrderDetail' kind='elementOnly'"
 * @generated
 */
public interface OrderDetail extends EObject {
	/**
	 * Returns the value of the '<em><b>Customer Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Address</em>' containment reference.
	 * @see #setCustomerAddress(RestrictedAddress)
	 * @see com.example.example.restrictions.RestrictionsPackage#getOrderDetail_CustomerAddress()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='customerAddress'"
	 * @generated
	 */
	RestrictedAddress getCustomerAddress();

	/**
	 * Sets the value of the '{@link com.example.example.restrictions.OrderDetail#getCustomerAddress <em>Customer Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Address</em>' containment reference.
	 * @see #getCustomerAddress()
	 * @generated
	 */
	void setCustomerAddress(RestrictedAddress value);

	/**
	 * Returns the value of the '<em><b>Customer Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Age</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Age</em>' attribute.
	 * @see #setCustomerAge(BigInteger)
	 * @see com.example.example.restrictions.RestrictionsPackage#getOrderDetail_CustomerAge()
	 * @model dataType="com.example.example.restrictions.CustomerAge"
	 *        extendedMetaData="kind='attribute' name='customerAge'"
	 * @generated
	 */
	BigInteger getCustomerAge();

	/**
	 * Sets the value of the '{@link com.example.example.restrictions.OrderDetail#getCustomerAge <em>Customer Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Age</em>' attribute.
	 * @see #getCustomerAge()
	 * @generated
	 */
	void setCustomerAge(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Customer Contact1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Contact1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Contact1</em>' attribute.
	 * @see #setCustomerContact1(BigInteger)
	 * @see com.example.example.restrictions.RestrictionsPackage#getOrderDetail_CustomerContact1()
	 * @model dataType="com.example.example.restrictions.CustomerContactNumber1"
	 *        extendedMetaData="kind='attribute' name='customerContact1'"
	 * @generated
	 */
	BigInteger getCustomerContact1();

	/**
	 * Sets the value of the '{@link com.example.example.restrictions.OrderDetail#getCustomerContact1 <em>Customer Contact1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Contact1</em>' attribute.
	 * @see #getCustomerContact1()
	 * @generated
	 */
	void setCustomerContact1(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Customer First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer First Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer First Name</em>' attribute.
	 * @see #setCustomerFirstName(String)
	 * @see com.example.example.restrictions.RestrictionsPackage#getOrderDetail_CustomerFirstName()
	 * @model dataType="com.example.example.restrictions.CustomerFirstName"
	 *        extendedMetaData="kind='attribute' name='customerFirstName'"
	 * @generated
	 */
	String getCustomerFirstName();

	/**
	 * Sets the value of the '{@link com.example.example.restrictions.OrderDetail#getCustomerFirstName <em>Customer First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer First Name</em>' attribute.
	 * @see #getCustomerFirstName()
	 * @generated
	 */
	void setCustomerFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Customer Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Last Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Last Name</em>' attribute.
	 * @see #setCustomerLastName(String)
	 * @see com.example.example.restrictions.RestrictionsPackage#getOrderDetail_CustomerLastName()
	 * @model dataType="com.example.example.restrictions.CustomerLastName"
	 *        extendedMetaData="kind='attribute' name='customerLastName'"
	 * @generated
	 */
	String getCustomerLastName();

	/**
	 * Sets the value of the '{@link com.example.example.restrictions.OrderDetail#getCustomerLastName <em>Customer Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Last Name</em>' attribute.
	 * @see #getCustomerLastName()
	 * @generated
	 */
	void setCustomerLastName(String value);

	/**
	 * Returns the value of the '<em><b>Customer Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Number</em>' attribute.
	 * @see #setCustomerNumber(String)
	 * @see com.example.example.restrictions.RestrictionsPackage#getOrderDetail_CustomerNumber()
	 * @model dataType="com.example.example.restrictions.CustomerNumber"
	 *        extendedMetaData="kind='attribute' name='customerNumber'"
	 * @generated
	 */
	String getCustomerNumber();

	/**
	 * Sets the value of the '{@link com.example.example.restrictions.OrderDetail#getCustomerNumber <em>Customer Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Number</em>' attribute.
	 * @see #getCustomerNumber()
	 * @generated
	 */
	void setCustomerNumber(String value);

	/**
	 * Returns the value of the '<em><b>Customer Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Password</em>' attribute.
	 * @see #setCustomerPassword(String)
	 * @see com.example.example.restrictions.RestrictionsPackage#getOrderDetail_CustomerPassword()
	 * @model dataType="com.example.example.restrictions.CustomerPassword"
	 *        extendedMetaData="kind='attribute' name='customerPassword'"
	 * @generated
	 */
	String getCustomerPassword();

	/**
	 * Sets the value of the '{@link com.example.example.restrictions.OrderDetail#getCustomerPassword <em>Customer Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Password</em>' attribute.
	 * @see #getCustomerPassword()
	 * @generated
	 */
	void setCustomerPassword(String value);

	/**
	 * Returns the value of the '<em><b>Customer US State</b></em>' attribute.
	 * The literals are from the enumeration {@link com.example.example.restrictions.USState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer US State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer US State</em>' attribute.
	 * @see com.example.example.restrictions.USState
	 * @see #isSetCustomerUSState()
	 * @see #unsetCustomerUSState()
	 * @see #setCustomerUSState(USState)
	 * @see com.example.example.restrictions.RestrictionsPackage#getOrderDetail_CustomerUSState()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='customerUSState'"
	 * @generated
	 */
	USState getCustomerUSState();

	/**
	 * Sets the value of the '{@link com.example.example.restrictions.OrderDetail#getCustomerUSState <em>Customer US State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer US State</em>' attribute.
	 * @see com.example.example.restrictions.USState
	 * @see #isSetCustomerUSState()
	 * @see #unsetCustomerUSState()
	 * @see #getCustomerUSState()
	 * @generated
	 */
	void setCustomerUSState(USState value);

	/**
	 * Unsets the value of the '{@link com.example.example.restrictions.OrderDetail#getCustomerUSState <em>Customer US State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCustomerUSState()
	 * @see #getCustomerUSState()
	 * @see #setCustomerUSState(USState)
	 * @generated
	 */
	void unsetCustomerUSState();

	/**
	 * Returns whether the value of the '{@link com.example.example.restrictions.OrderDetail#getCustomerUSState <em>Customer US State</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Customer US State</em>' attribute is set.
	 * @see #unsetCustomerUSState()
	 * @see #getCustomerUSState()
	 * @see #setCustomerUSState(USState)
	 * @generated
	 */
	boolean isSetCustomerUSState();

	/**
	 * Returns the value of the '<em><b>Order ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order ID</em>' attribute.
	 * @see #setOrderID(String)
	 * @see com.example.example.restrictions.RestrictionsPackage#getOrderDetail_OrderID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='orderID'"
	 * @generated
	 */
	String getOrderID();

	/**
	 * Sets the value of the '{@link com.example.example.restrictions.OrderDetail#getOrderID <em>Order ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order ID</em>' attribute.
	 * @see #getOrderID()
	 * @generated
	 */
	void setOrderID(String value);

} // OrderDetail
