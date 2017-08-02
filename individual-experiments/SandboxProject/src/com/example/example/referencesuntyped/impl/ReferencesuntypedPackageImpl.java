/**
 */
package com.example.example.referencesuntyped.impl;

import com.example.example.referencesuntyped.DocumentRoot;
import com.example.example.referencesuntyped.OrderDetail1;
import com.example.example.referencesuntyped.OrderDetail2;
import com.example.example.referencesuntyped.OrderRef1;
import com.example.example.referencesuntyped.OrderRef2;
import com.example.example.referencesuntyped.OrdersType;
import com.example.example.referencesuntyped.ReferencesuntypedFactory;
import com.example.example.referencesuntyped.ReferencesuntypedPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReferencesuntypedPackageImpl extends EPackageImpl implements ReferencesuntypedPackage {
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
	private EClass orderDetail1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderDetail2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderRef1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderRef2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ordersTypeEClass = null;

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
	 * @see com.example.example.referencesuntyped.ReferencesuntypedPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ReferencesuntypedPackageImpl() {
		super(eNS_URI, ReferencesuntypedFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ReferencesuntypedPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ReferencesuntypedPackage init() {
		if (isInited) return (ReferencesuntypedPackage)EPackage.Registry.INSTANCE.getEPackage(ReferencesuntypedPackage.eNS_URI);

		// Obtain or create and register package
		ReferencesuntypedPackageImpl theReferencesuntypedPackage = (ReferencesuntypedPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ReferencesuntypedPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ReferencesuntypedPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLNamespacePackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theReferencesuntypedPackage.createPackageContents();

		// Initialize created meta-data
		theReferencesuntypedPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theReferencesuntypedPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ReferencesuntypedPackage.eNS_URI, theReferencesuntypedPackage);
		return theReferencesuntypedPackage;
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
	public EClass getOrderDetail1() {
		return orderDetail1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderDetail1_CustomerAddress() {
		return (EAttribute)orderDetail1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderDetail1_CustomerContact() {
		return (EAttribute)orderDetail1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderDetail1_CustomerName() {
		return (EAttribute)orderDetail1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderDetail1_Name() {
		return (EAttribute)orderDetail1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrderDetail2() {
		return orderDetail2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderDetail2_CustomerName() {
		return (EAttribute)orderDetail2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderDetail2_Name() {
		return (EAttribute)orderDetail2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrderRef1() {
		return orderRef1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrderRef1_OrderDetail1() {
		return (EReference)orderRef1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrderRef2() {
		return orderRef2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderRef2_OrderDetail2() {
		return (EAttribute)orderRef2EClass.getEStructuralFeatures().get(0);
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
	public EReference getOrdersType_Order1() {
		return (EReference)ordersTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrdersType_Order2() {
		return (EReference)ordersTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrdersType_OrderReference1() {
		return (EReference)ordersTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrdersType_OrderReference2() {
		return (EReference)ordersTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferencesuntypedFactory getReferencesuntypedFactory() {
		return (ReferencesuntypedFactory)getEFactoryInstance();
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
		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ORDERS);

		orderDetail1EClass = createEClass(ORDER_DETAIL1);
		createEAttribute(orderDetail1EClass, ORDER_DETAIL1__CUSTOMER_ADDRESS);
		createEAttribute(orderDetail1EClass, ORDER_DETAIL1__CUSTOMER_CONTACT);
		createEAttribute(orderDetail1EClass, ORDER_DETAIL1__CUSTOMER_NAME);
		createEAttribute(orderDetail1EClass, ORDER_DETAIL1__NAME);

		orderDetail2EClass = createEClass(ORDER_DETAIL2);
		createEAttribute(orderDetail2EClass, ORDER_DETAIL2__CUSTOMER_NAME);
		createEAttribute(orderDetail2EClass, ORDER_DETAIL2__NAME);

		orderRef1EClass = createEClass(ORDER_REF1);
		createEReference(orderRef1EClass, ORDER_REF1__ORDER_DETAIL1);

		orderRef2EClass = createEClass(ORDER_REF2);
		createEAttribute(orderRef2EClass, ORDER_REF2__ORDER_DETAIL2);

		ordersTypeEClass = createEClass(ORDERS_TYPE);
		createEReference(ordersTypeEClass, ORDERS_TYPE__ORDER1);
		createEReference(ordersTypeEClass, ORDERS_TYPE__ORDER2);
		createEReference(ordersTypeEClass, ORDERS_TYPE__ORDER_REFERENCE1);
		createEReference(ordersTypeEClass, ORDERS_TYPE__ORDER_REFERENCE2);
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

		// Initialize classes, features, and operations; add parameters
		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Orders(), this.getOrdersType(), null, "orders", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(orderDetail1EClass, OrderDetail1.class, "OrderDetail1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderDetail1_CustomerAddress(), theXMLTypePackage.getString(), "customerAddress", null, 0, 1, OrderDetail1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderDetail1_CustomerContact(), theXMLTypePackage.getString(), "customerContact", null, 0, 1, OrderDetail1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderDetail1_CustomerName(), theXMLTypePackage.getString(), "customerName", null, 0, 1, OrderDetail1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderDetail1_Name(), theXMLTypePackage.getID(), "name", null, 0, 1, OrderDetail1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderDetail2EClass, OrderDetail2.class, "OrderDetail2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderDetail2_CustomerName(), theXMLTypePackage.getString(), "customerName", null, 0, 1, OrderDetail2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderDetail2_Name(), theXMLTypePackage.getID(), "name", null, 0, 1, OrderDetail2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderRef1EClass, OrderRef1.class, "OrderRef1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrderRef1_OrderDetail1(), ecorePackage.getEObject(), null, "orderDetail1", null, 0, 1, OrderRef1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderRef2EClass, OrderRef2.class, "OrderRef2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderRef2_OrderDetail2(), theXMLTypePackage.getIDREF(), "orderDetail2", null, 0, 1, OrderRef2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ordersTypeEClass, OrdersType.class, "OrdersType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrdersType_Order1(), this.getOrderDetail1(), null, "order1", null, 1, -1, OrdersType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrdersType_Order2(), this.getOrderDetail2(), null, "order2", null, 1, -1, OrdersType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrdersType_OrderReference1(), this.getOrderRef1(), null, "orderReference1", null, 1, -1, OrdersType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrdersType_OrderReference2(), this.getOrderRef2(), null, "orderReference2", null, 1, -1, OrdersType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (orderDetail1EClass, 
		   source, 
		   new String[] {
			 "name", "OrderDetail1",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getOrderDetail1_CustomerAddress(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "customerAddress"
		   });	
		addAnnotation
		  (getOrderDetail1_CustomerContact(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "customerContact"
		   });	
		addAnnotation
		  (getOrderDetail1_CustomerName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "customerName"
		   });	
		addAnnotation
		  (getOrderDetail1_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (orderDetail2EClass, 
		   source, 
		   new String[] {
			 "name", "OrderDetail2",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getOrderDetail2_CustomerName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "customerName"
		   });	
		addAnnotation
		  (getOrderDetail2_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (orderRef1EClass, 
		   source, 
		   new String[] {
			 "name", "OrderRef1",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getOrderRef1_OrderDetail1(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "orderDetail1"
		   });	
		addAnnotation
		  (orderRef2EClass, 
		   source, 
		   new String[] {
			 "name", "OrderRef2",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getOrderRef2_OrderDetail2(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "orderDetail2"
		   });	
		addAnnotation
		  (ordersTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Orders_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getOrdersType_Order1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Order1"
		   });	
		addAnnotation
		  (getOrdersType_Order2(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Order2"
		   });	
		addAnnotation
		  (getOrdersType_OrderReference1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OrderReference1"
		   });	
		addAnnotation
		  (getOrdersType_OrderReference2(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OrderReference2"
		   });
	}

} //ReferencesuntypedPackageImpl
