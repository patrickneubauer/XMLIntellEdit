/**
 */
package com.example.example.restrictions.impl;

import com.example.example.restrictions.Address;
import com.example.example.restrictions.DocumentRoot;
import com.example.example.restrictions.OrderDetail;
import com.example.example.restrictions.OrdersType;
import com.example.example.restrictions.RestrictedAddress;
import com.example.example.restrictions.RestrictionsFactory;
import com.example.example.restrictions.RestrictionsPackage;
import com.example.example.restrictions.USState;

import com.example.example.restrictions.util.RestrictionsValidator;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RestrictionsPackageImpl extends EPackageImpl implements RestrictionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderDetailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ordersTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restrictedAddressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum usStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType customerAgeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType customerContactNumber1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType customerFirstNameEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType customerLastNameEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType customerNumberEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType customerPasswordEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType usStateObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.example.example.restrictions.RestrictionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RestrictionsPackageImpl() {
		super(eNS_URI, RestrictionsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RestrictionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RestrictionsPackage init() {
		if (isInited) return (RestrictionsPackage)EPackage.Registry.INSTANCE.getEPackage(RestrictionsPackage.eNS_URI);

		// Obtain or create and register package
		RestrictionsPackageImpl theRestrictionsPackage = (RestrictionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RestrictionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RestrictionsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRestrictionsPackage.createPackageContents();

		// Initialize created meta-data
		theRestrictionsPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theRestrictionsPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return RestrictionsValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theRestrictionsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RestrictionsPackage.eNS_URI, theRestrictionsPackage);
		return theRestrictionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddress() {
		return addressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddress_Street() {
		return (EAttribute)addressEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddress_City() {
		return (EAttribute)addressEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Orders() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrderDetail() {
		return orderDetailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrderDetail_CustomerAddress() {
		return (EReference)orderDetailEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderDetail_CustomerAge() {
		return (EAttribute)orderDetailEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderDetail_CustomerContact1() {
		return (EAttribute)orderDetailEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderDetail_CustomerFirstName() {
		return (EAttribute)orderDetailEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderDetail_CustomerLastName() {
		return (EAttribute)orderDetailEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderDetail_CustomerNumber() {
		return (EAttribute)orderDetailEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderDetail_CustomerPassword() {
		return (EAttribute)orderDetailEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderDetail_CustomerUSState() {
		return (EAttribute)orderDetailEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderDetail_OrderID() {
		return (EAttribute)orderDetailEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrdersType() {
		return ordersTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrdersType_Order() {
		return (EReference)ordersTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRestrictedAddress() {
		return restrictedAddressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUSState() {
		return usStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCustomerAge() {
		return customerAgeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCustomerContactNumber1() {
		return customerContactNumber1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCustomerFirstName() {
		return customerFirstNameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCustomerLastName() {
		return customerLastNameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCustomerNumber() {
		return customerNumberEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCustomerPassword() {
		return customerPasswordEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUSStateObject() {
		return usStateObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestrictionsFactory getRestrictionsFactory() {
		return (RestrictionsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		addressEClass = createEClass(ADDRESS);
		createEAttribute(addressEClass, ADDRESS__STREET);
		createEAttribute(addressEClass, ADDRESS__CITY);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ORDERS);

		orderDetailEClass = createEClass(ORDER_DETAIL);
		createEReference(orderDetailEClass, ORDER_DETAIL__CUSTOMER_ADDRESS);
		createEAttribute(orderDetailEClass, ORDER_DETAIL__CUSTOMER_AGE);
		createEAttribute(orderDetailEClass, ORDER_DETAIL__CUSTOMER_CONTACT1);
		createEAttribute(orderDetailEClass, ORDER_DETAIL__CUSTOMER_FIRST_NAME);
		createEAttribute(orderDetailEClass, ORDER_DETAIL__CUSTOMER_LAST_NAME);
		createEAttribute(orderDetailEClass, ORDER_DETAIL__CUSTOMER_NUMBER);
		createEAttribute(orderDetailEClass, ORDER_DETAIL__CUSTOMER_PASSWORD);
		createEAttribute(orderDetailEClass, ORDER_DETAIL__CUSTOMER_US_STATE);
		createEAttribute(orderDetailEClass, ORDER_DETAIL__ORDER_ID);

		ordersTypeEClass = createEClass(ORDERS_TYPE);
		createEReference(ordersTypeEClass, ORDERS_TYPE__ORDER);

		restrictedAddressEClass = createEClass(RESTRICTED_ADDRESS);

		// Create enums
		usStateEEnum = createEEnum(US_STATE);

		// Create data types
		customerAgeEDataType = createEDataType(CUSTOMER_AGE);
		customerContactNumber1EDataType = createEDataType(CUSTOMER_CONTACT_NUMBER1);
		customerFirstNameEDataType = createEDataType(CUSTOMER_FIRST_NAME);
		customerLastNameEDataType = createEDataType(CUSTOMER_LAST_NAME);
		customerNumberEDataType = createEDataType(CUSTOMER_NUMBER);
		customerPasswordEDataType = createEDataType(CUSTOMER_PASSWORD);
		usStateObjectEDataType = createEDataType(US_STATE_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		restrictedAddressEClass.getESuperTypes().add(this.getAddress());

		// Initialize classes, features, and operations; add parameters
		initEClass(addressEClass, Address.class, "Address", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddress_Street(), theXMLTypePackage.getString(), "street", null, 1, 3, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddress_City(), theXMLTypePackage.getString(), "city", null, 1, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Orders(), this.getOrdersType(), null, "orders", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(orderDetailEClass, OrderDetail.class, "OrderDetail", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrderDetail_CustomerAddress(), this.getRestrictedAddress(), null, "customerAddress", null, 1, 1, OrderDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderDetail_CustomerAge(), this.getCustomerAge(), "customerAge", null, 0, 1, OrderDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderDetail_CustomerContact1(), this.getCustomerContactNumber1(), "customerContact1", null, 0, 1, OrderDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderDetail_CustomerFirstName(), this.getCustomerFirstName(), "customerFirstName", null, 0, 1, OrderDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderDetail_CustomerLastName(), this.getCustomerLastName(), "customerLastName", null, 0, 1, OrderDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderDetail_CustomerNumber(), this.getCustomerNumber(), "customerNumber", null, 0, 1, OrderDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderDetail_CustomerPassword(), this.getCustomerPassword(), "customerPassword", null, 0, 1, OrderDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderDetail_CustomerUSState(), this.getUSState(), "customerUSState", null, 0, 1, OrderDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderDetail_OrderID(), theXMLTypePackage.getID(), "orderID", null, 0, 1, OrderDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ordersTypeEClass, OrdersType.class, "OrdersType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrdersType_Order(), this.getOrderDetail(), null, "order", null, 1, -1, OrdersType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(restrictedAddressEClass, RestrictedAddress.class, "RestrictedAddress", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(usStateEEnum, USState.class, "USState");
		addEEnumLiteral(usStateEEnum, USState.AK);
		addEEnumLiteral(usStateEEnum, USState.LT);
		addEEnumLiteral(usStateEEnum, USState.UZ);

		// Initialize data types
		initEDataType(customerAgeEDataType, BigInteger.class, "CustomerAge", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(customerContactNumber1EDataType, BigInteger.class, "CustomerContactNumber1", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(customerFirstNameEDataType, String.class, "CustomerFirstName", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(customerLastNameEDataType, String.class, "CustomerLastName", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(customerNumberEDataType, String.class, "CustomerNumber", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(customerPasswordEDataType, String.class, "CustomerPassword", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(usStateObjectEDataType, USState.class, "USStateObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (addressEClass, 
		   source, 
		   new String[] {
			 "name", "Address",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getAddress_Street(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "street"
		   });	
		addAnnotation
		  (getAddress_City(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "city"
		   });	
		addAnnotation
		  (customerAgeEDataType, 
		   source, 
		   new String[] {
			 "name", "CustomerAge",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer",
			 "minInclusive", "18",
			 "maxInclusive", "65"
		   });	
		addAnnotation
		  (customerContactNumber1EDataType, 
		   source, 
		   new String[] {
			 "name", "CustomerContactNumber1",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer",
			 "pattern", "[0-9][0-9][0-9][0-9][0-9]"
		   });	
		addAnnotation
		  (customerFirstNameEDataType, 
		   source, 
		   new String[] {
			 "name", "CustomerFirstName",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "minLength", "8"
		   });	
		addAnnotation
		  (customerLastNameEDataType, 
		   source, 
		   new String[] {
			 "name", "CustomerLastName",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "length", "10"
		   });	
		addAnnotation
		  (customerNumberEDataType, 
		   source, 
		   new String[] {
			 "name", "CustomerNumber",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "whiteSpace", "collapse"
		   });	
		addAnnotation
		  (customerPasswordEDataType, 
		   source, 
		   new String[] {
			 "name", "CustomerPassword",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "pattern", "[a-zA-Z0-9]{8}"
		   });	
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });	
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });	
		addAnnotation
		  (getDocumentRoot_Orders(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Orders",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (orderDetailEClass, 
		   source, 
		   new String[] {
			 "name", "OrderDetail",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getOrderDetail_CustomerAddress(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "customerAddress"
		   });	
		addAnnotation
		  (getOrderDetail_CustomerAge(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "customerAge"
		   });	
		addAnnotation
		  (getOrderDetail_CustomerContact1(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "customerContact1"
		   });	
		addAnnotation
		  (getOrderDetail_CustomerFirstName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "customerFirstName"
		   });	
		addAnnotation
		  (getOrderDetail_CustomerLastName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "customerLastName"
		   });	
		addAnnotation
		  (getOrderDetail_CustomerNumber(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "customerNumber"
		   });	
		addAnnotation
		  (getOrderDetail_CustomerPassword(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "customerPassword"
		   });	
		addAnnotation
		  (getOrderDetail_CustomerUSState(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "customerUSState"
		   });	
		addAnnotation
		  (getOrderDetail_OrderID(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "orderID"
		   });	
		addAnnotation
		  (ordersTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Orders_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getOrdersType_Order(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Order"
		   });	
		addAnnotation
		  (restrictedAddressEClass, 
		   source, 
		   new String[] {
			 "name", "RestrictedAddress",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (usStateEEnum, 
		   source, 
		   new String[] {
			 "name", "USState"
		   });	
		addAnnotation
		  (usStateObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "USState:Object",
			 "baseType", "USState"
		   });
	}

} //RestrictionsPackageImpl
