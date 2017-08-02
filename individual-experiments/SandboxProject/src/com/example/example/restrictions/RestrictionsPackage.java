/**
 */
package com.example.example.restrictions;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.example.example.restrictions.RestrictionsFactory
 * @model kind="package"
 * @generated
 */
public interface RestrictionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "restrictions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://example.com/example-restrictions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "restrictions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RestrictionsPackage eINSTANCE = com.example.example.restrictions.impl.RestrictionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.example.example.restrictions.impl.AddressImpl <em>Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.example.restrictions.impl.AddressImpl
	 * @see com.example.example.restrictions.impl.RestrictionsPackageImpl#getAddress()
	 * @generated
	 */
	int ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Street</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__STREET = 0;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__CITY = 1;

	/**
	 * The number of structural features of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.example.example.restrictions.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.example.restrictions.impl.DocumentRootImpl
	 * @see com.example.example.restrictions.impl.RestrictionsPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 1;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Orders</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ORDERS = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.example.example.restrictions.impl.OrderDetailImpl <em>Order Detail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.example.restrictions.impl.OrderDetailImpl
	 * @see com.example.example.restrictions.impl.RestrictionsPackageImpl#getOrderDetail()
	 * @generated
	 */
	int ORDER_DETAIL = 2;

	/**
	 * The feature id for the '<em><b>Customer Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_DETAIL__CUSTOMER_ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Customer Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_DETAIL__CUSTOMER_AGE = 1;

	/**
	 * The feature id for the '<em><b>Customer Contact1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_DETAIL__CUSTOMER_CONTACT1 = 2;

	/**
	 * The feature id for the '<em><b>Customer First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_DETAIL__CUSTOMER_FIRST_NAME = 3;

	/**
	 * The feature id for the '<em><b>Customer Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_DETAIL__CUSTOMER_LAST_NAME = 4;

	/**
	 * The feature id for the '<em><b>Customer Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_DETAIL__CUSTOMER_NUMBER = 5;

	/**
	 * The feature id for the '<em><b>Customer Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_DETAIL__CUSTOMER_PASSWORD = 6;

	/**
	 * The feature id for the '<em><b>Customer US State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_DETAIL__CUSTOMER_US_STATE = 7;

	/**
	 * The feature id for the '<em><b>Order ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_DETAIL__ORDER_ID = 8;

	/**
	 * The number of structural features of the '<em>Order Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_DETAIL_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Order Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_DETAIL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.example.example.restrictions.impl.OrdersTypeImpl <em>Orders Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.example.restrictions.impl.OrdersTypeImpl
	 * @see com.example.example.restrictions.impl.RestrictionsPackageImpl#getOrdersType()
	 * @generated
	 */
	int ORDERS_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Order</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERS_TYPE__ORDER = 0;

	/**
	 * The number of structural features of the '<em>Orders Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Orders Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.example.example.restrictions.impl.RestrictedAddressImpl <em>Restricted Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.example.restrictions.impl.RestrictedAddressImpl
	 * @see com.example.example.restrictions.impl.RestrictionsPackageImpl#getRestrictedAddress()
	 * @generated
	 */
	int RESTRICTED_ADDRESS = 4;

	/**
	 * The feature id for the '<em><b>Street</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTED_ADDRESS__STREET = ADDRESS__STREET;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTED_ADDRESS__CITY = ADDRESS__CITY;

	/**
	 * The number of structural features of the '<em>Restricted Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTED_ADDRESS_FEATURE_COUNT = ADDRESS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Restricted Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTED_ADDRESS_OPERATION_COUNT = ADDRESS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.example.example.restrictions.USState <em>US State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.example.restrictions.USState
	 * @see com.example.example.restrictions.impl.RestrictionsPackageImpl#getUSState()
	 * @generated
	 */
	int US_STATE = 5;

	/**
	 * The meta object id for the '<em>Customer Age</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see com.example.example.restrictions.impl.RestrictionsPackageImpl#getCustomerAge()
	 * @generated
	 */
	int CUSTOMER_AGE = 6;

	/**
	 * The meta object id for the '<em>Customer Contact Number1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see com.example.example.restrictions.impl.RestrictionsPackageImpl#getCustomerContactNumber1()
	 * @generated
	 */
	int CUSTOMER_CONTACT_NUMBER1 = 7;

	/**
	 * The meta object id for the '<em>Customer First Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.example.example.restrictions.impl.RestrictionsPackageImpl#getCustomerFirstName()
	 * @generated
	 */
	int CUSTOMER_FIRST_NAME = 8;

	/**
	 * The meta object id for the '<em>Customer Last Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.example.example.restrictions.impl.RestrictionsPackageImpl#getCustomerLastName()
	 * @generated
	 */
	int CUSTOMER_LAST_NAME = 9;

	/**
	 * The meta object id for the '<em>Customer Number</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.example.example.restrictions.impl.RestrictionsPackageImpl#getCustomerNumber()
	 * @generated
	 */
	int CUSTOMER_NUMBER = 10;

	/**
	 * The meta object id for the '<em>Customer Password</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.example.example.restrictions.impl.RestrictionsPackageImpl#getCustomerPassword()
	 * @generated
	 */
	int CUSTOMER_PASSWORD = 11;

	/**
	 * The meta object id for the '<em>US State Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.example.restrictions.USState
	 * @see com.example.example.restrictions.impl.RestrictionsPackageImpl#getUSStateObject()
	 * @generated
	 */
	int US_STATE_OBJECT = 12;


	/**
	 * Returns the meta object for class '{@link com.example.example.restrictions.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address</em>'.
	 * @see com.example.example.restrictions.Address
	 * @generated
	 */
	EClass getAddress();

	/**
	 * Returns the meta object for the attribute list '{@link com.example.example.restrictions.Address#getStreet <em>Street</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Street</em>'.
	 * @see com.example.example.restrictions.Address#getStreet()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Street();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.restrictions.Address#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see com.example.example.restrictions.Address#getCity()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_City();

	/**
	 * Returns the meta object for class '{@link com.example.example.restrictions.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see com.example.example.restrictions.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link com.example.example.restrictions.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see com.example.example.restrictions.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link com.example.example.restrictions.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see com.example.example.restrictions.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link com.example.example.restrictions.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see com.example.example.restrictions.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link com.example.example.restrictions.DocumentRoot#getOrders <em>Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Orders</em>'.
	 * @see com.example.example.restrictions.DocumentRoot#getOrders()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Orders();

	/**
	 * Returns the meta object for class '{@link com.example.example.restrictions.OrderDetail <em>Order Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order Detail</em>'.
	 * @see com.example.example.restrictions.OrderDetail
	 * @generated
	 */
	EClass getOrderDetail();

	/**
	 * Returns the meta object for the containment reference '{@link com.example.example.restrictions.OrderDetail#getCustomerAddress <em>Customer Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Customer Address</em>'.
	 * @see com.example.example.restrictions.OrderDetail#getCustomerAddress()
	 * @see #getOrderDetail()
	 * @generated
	 */
	EReference getOrderDetail_CustomerAddress();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.restrictions.OrderDetail#getCustomerAge <em>Customer Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer Age</em>'.
	 * @see com.example.example.restrictions.OrderDetail#getCustomerAge()
	 * @see #getOrderDetail()
	 * @generated
	 */
	EAttribute getOrderDetail_CustomerAge();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.restrictions.OrderDetail#getCustomerContact1 <em>Customer Contact1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer Contact1</em>'.
	 * @see com.example.example.restrictions.OrderDetail#getCustomerContact1()
	 * @see #getOrderDetail()
	 * @generated
	 */
	EAttribute getOrderDetail_CustomerContact1();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.restrictions.OrderDetail#getCustomerFirstName <em>Customer First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer First Name</em>'.
	 * @see com.example.example.restrictions.OrderDetail#getCustomerFirstName()
	 * @see #getOrderDetail()
	 * @generated
	 */
	EAttribute getOrderDetail_CustomerFirstName();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.restrictions.OrderDetail#getCustomerLastName <em>Customer Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer Last Name</em>'.
	 * @see com.example.example.restrictions.OrderDetail#getCustomerLastName()
	 * @see #getOrderDetail()
	 * @generated
	 */
	EAttribute getOrderDetail_CustomerLastName();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.restrictions.OrderDetail#getCustomerNumber <em>Customer Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer Number</em>'.
	 * @see com.example.example.restrictions.OrderDetail#getCustomerNumber()
	 * @see #getOrderDetail()
	 * @generated
	 */
	EAttribute getOrderDetail_CustomerNumber();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.restrictions.OrderDetail#getCustomerPassword <em>Customer Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer Password</em>'.
	 * @see com.example.example.restrictions.OrderDetail#getCustomerPassword()
	 * @see #getOrderDetail()
	 * @generated
	 */
	EAttribute getOrderDetail_CustomerPassword();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.restrictions.OrderDetail#getCustomerUSState <em>Customer US State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer US State</em>'.
	 * @see com.example.example.restrictions.OrderDetail#getCustomerUSState()
	 * @see #getOrderDetail()
	 * @generated
	 */
	EAttribute getOrderDetail_CustomerUSState();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.restrictions.OrderDetail#getOrderID <em>Order ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order ID</em>'.
	 * @see com.example.example.restrictions.OrderDetail#getOrderID()
	 * @see #getOrderDetail()
	 * @generated
	 */
	EAttribute getOrderDetail_OrderID();

	/**
	 * Returns the meta object for class '{@link com.example.example.restrictions.OrdersType <em>Orders Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orders Type</em>'.
	 * @see com.example.example.restrictions.OrdersType
	 * @generated
	 */
	EClass getOrdersType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.example.example.restrictions.OrdersType#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Order</em>'.
	 * @see com.example.example.restrictions.OrdersType#getOrder()
	 * @see #getOrdersType()
	 * @generated
	 */
	EReference getOrdersType_Order();

	/**
	 * Returns the meta object for class '{@link com.example.example.restrictions.RestrictedAddress <em>Restricted Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Restricted Address</em>'.
	 * @see com.example.example.restrictions.RestrictedAddress
	 * @generated
	 */
	EClass getRestrictedAddress();

	/**
	 * Returns the meta object for enum '{@link com.example.example.restrictions.USState <em>US State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>US State</em>'.
	 * @see com.example.example.restrictions.USState
	 * @generated
	 */
	EEnum getUSState();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Customer Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Customer Age</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='CustomerAge' baseType='http://www.eclipse.org/emf/2003/XMLType#integer' minInclusive='18' maxInclusive='65'"
	 * @generated
	 */
	EDataType getCustomerAge();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Customer Contact Number1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Customer Contact Number1</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='CustomerContactNumber1' baseType='http://www.eclipse.org/emf/2003/XMLType#integer' pattern='[0-9][0-9][0-9][0-9][0-9]'"
	 * @generated
	 */
	EDataType getCustomerContactNumber1();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Customer First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Customer First Name</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='CustomerFirstName' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='8'"
	 * @generated
	 */
	EDataType getCustomerFirstName();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Customer Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Customer Last Name</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='CustomerLastName' baseType='http://www.eclipse.org/emf/2003/XMLType#string' length='10'"
	 * @generated
	 */
	EDataType getCustomerLastName();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Customer Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Customer Number</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='CustomerNumber' baseType='http://www.eclipse.org/emf/2003/XMLType#string' whiteSpace='collapse'"
	 * @generated
	 */
	EDataType getCustomerNumber();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Customer Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Customer Password</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='CustomerPassword' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[a-zA-Z0-9]{8}'"
	 * @generated
	 */
	EDataType getCustomerPassword();

	/**
	 * Returns the meta object for data type '{@link com.example.example.restrictions.USState <em>US State Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>US State Object</em>'.
	 * @see com.example.example.restrictions.USState
	 * @model instanceClass="com.example.example.restrictions.USState"
	 *        extendedMetaData="name='USState:Object' baseType='USState'"
	 * @generated
	 */
	EDataType getUSStateObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RestrictionsFactory getRestrictionsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.example.example.restrictions.impl.AddressImpl <em>Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.example.restrictions.impl.AddressImpl
		 * @see com.example.example.restrictions.impl.RestrictionsPackageImpl#getAddress()
		 * @generated
		 */
		EClass ADDRESS = eINSTANCE.getAddress();

		/**
		 * The meta object literal for the '<em><b>Street</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__STREET = eINSTANCE.getAddress_Street();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__CITY = eINSTANCE.getAddress_City();

		/**
		 * The meta object literal for the '{@link com.example.example.restrictions.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.example.restrictions.impl.DocumentRootImpl
		 * @see com.example.example.restrictions.impl.RestrictionsPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Orders</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ORDERS = eINSTANCE.getDocumentRoot_Orders();

		/**
		 * The meta object literal for the '{@link com.example.example.restrictions.impl.OrderDetailImpl <em>Order Detail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.example.restrictions.impl.OrderDetailImpl
		 * @see com.example.example.restrictions.impl.RestrictionsPackageImpl#getOrderDetail()
		 * @generated
		 */
		EClass ORDER_DETAIL = eINSTANCE.getOrderDetail();

		/**
		 * The meta object literal for the '<em><b>Customer Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_DETAIL__CUSTOMER_ADDRESS = eINSTANCE.getOrderDetail_CustomerAddress();

		/**
		 * The meta object literal for the '<em><b>Customer Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_DETAIL__CUSTOMER_AGE = eINSTANCE.getOrderDetail_CustomerAge();

		/**
		 * The meta object literal for the '<em><b>Customer Contact1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_DETAIL__CUSTOMER_CONTACT1 = eINSTANCE.getOrderDetail_CustomerContact1();

		/**
		 * The meta object literal for the '<em><b>Customer First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_DETAIL__CUSTOMER_FIRST_NAME = eINSTANCE.getOrderDetail_CustomerFirstName();

		/**
		 * The meta object literal for the '<em><b>Customer Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_DETAIL__CUSTOMER_LAST_NAME = eINSTANCE.getOrderDetail_CustomerLastName();

		/**
		 * The meta object literal for the '<em><b>Customer Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_DETAIL__CUSTOMER_NUMBER = eINSTANCE.getOrderDetail_CustomerNumber();

		/**
		 * The meta object literal for the '<em><b>Customer Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_DETAIL__CUSTOMER_PASSWORD = eINSTANCE.getOrderDetail_CustomerPassword();

		/**
		 * The meta object literal for the '<em><b>Customer US State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_DETAIL__CUSTOMER_US_STATE = eINSTANCE.getOrderDetail_CustomerUSState();

		/**
		 * The meta object literal for the '<em><b>Order ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_DETAIL__ORDER_ID = eINSTANCE.getOrderDetail_OrderID();

		/**
		 * The meta object literal for the '{@link com.example.example.restrictions.impl.OrdersTypeImpl <em>Orders Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.example.restrictions.impl.OrdersTypeImpl
		 * @see com.example.example.restrictions.impl.RestrictionsPackageImpl#getOrdersType()
		 * @generated
		 */
		EClass ORDERS_TYPE = eINSTANCE.getOrdersType();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDERS_TYPE__ORDER = eINSTANCE.getOrdersType_Order();

		/**
		 * The meta object literal for the '{@link com.example.example.restrictions.impl.RestrictedAddressImpl <em>Restricted Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.example.restrictions.impl.RestrictedAddressImpl
		 * @see com.example.example.restrictions.impl.RestrictionsPackageImpl#getRestrictedAddress()
		 * @generated
		 */
		EClass RESTRICTED_ADDRESS = eINSTANCE.getRestrictedAddress();

		/**
		 * The meta object literal for the '{@link com.example.example.restrictions.USState <em>US State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.example.restrictions.USState
		 * @see com.example.example.restrictions.impl.RestrictionsPackageImpl#getUSState()
		 * @generated
		 */
		EEnum US_STATE = eINSTANCE.getUSState();

		/**
		 * The meta object literal for the '<em>Customer Age</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see com.example.example.restrictions.impl.RestrictionsPackageImpl#getCustomerAge()
		 * @generated
		 */
		EDataType CUSTOMER_AGE = eINSTANCE.getCustomerAge();

		/**
		 * The meta object literal for the '<em>Customer Contact Number1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see com.example.example.restrictions.impl.RestrictionsPackageImpl#getCustomerContactNumber1()
		 * @generated
		 */
		EDataType CUSTOMER_CONTACT_NUMBER1 = eINSTANCE.getCustomerContactNumber1();

		/**
		 * The meta object literal for the '<em>Customer First Name</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.example.example.restrictions.impl.RestrictionsPackageImpl#getCustomerFirstName()
		 * @generated
		 */
		EDataType CUSTOMER_FIRST_NAME = eINSTANCE.getCustomerFirstName();

		/**
		 * The meta object literal for the '<em>Customer Last Name</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.example.example.restrictions.impl.RestrictionsPackageImpl#getCustomerLastName()
		 * @generated
		 */
		EDataType CUSTOMER_LAST_NAME = eINSTANCE.getCustomerLastName();

		/**
		 * The meta object literal for the '<em>Customer Number</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.example.example.restrictions.impl.RestrictionsPackageImpl#getCustomerNumber()
		 * @generated
		 */
		EDataType CUSTOMER_NUMBER = eINSTANCE.getCustomerNumber();

		/**
		 * The meta object literal for the '<em>Customer Password</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.example.example.restrictions.impl.RestrictionsPackageImpl#getCustomerPassword()
		 * @generated
		 */
		EDataType CUSTOMER_PASSWORD = eINSTANCE.getCustomerPassword();

		/**
		 * The meta object literal for the '<em>US State Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.example.restrictions.USState
		 * @see com.example.example.restrictions.impl.RestrictionsPackageImpl#getUSStateObject()
		 * @generated
		 */
		EDataType US_STATE_OBJECT = eINSTANCE.getUSStateObject();

	}

} //RestrictionsPackage
