/**
 */
package com.example.example.with.key._2.impl;

import com.example.example.with.key._2.ColorType;
import com.example.example.with.key._2.DocumentRoot;
import com.example.example.with.key._2.ItemsType;
import com.example.example.with.key._2.OrderType;
import com.example.example.with.key._2.PriceType;
import com.example.example.with.key._2.ProductOrderType;
import com.example.example.with.key._2.ProductType;
import com.example.example.with.key._2.ProductsType;
import com.example.example.with.key._2.RootElementType;
import com.example.example.with.key._2._2Factory;
import com.example.example.with.key._2._2Package;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class _2PackageImpl extends EPackageImpl implements _2Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorTypeEClass = null;

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
	private EClass itemsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass priceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productOrderTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootElementTypeEClass = null;

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
	 * @see com.example.example.with.key._2._2Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private _2PackageImpl() {
		super(eNS_URI, _2Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link _2Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static _2Package init() {
		if (isInited) return (_2Package)EPackage.Registry.INSTANCE.getEPackage(_2Package.eNS_URI);

		// Obtain or create and register package
		_2PackageImpl the_2Package = (_2PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof _2PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new _2PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		the_2Package.createPackageContents();

		// Initialize created meta-data
		the_2Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		the_2Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(_2Package.eNS_URI, the_2Package);
		return the_2Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColorType() {
		return colorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColorType_Value() {
		return (EAttribute)colorTypeEClass.getEStructuralFeatures().get(0);
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
	public EReference getDocumentRoot_RootElement() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemsType() {
		return itemsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemsType_Group() {
		return (EAttribute)itemsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemsType_Shirt() {
		return (EReference)itemsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemsType_Hat() {
		return (EReference)itemsTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrderType() {
		return orderTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderType_Number() {
		return (EAttribute)orderTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrderType_Items() {
		return (EReference)orderTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrderType_Products() {
		return (EReference)orderTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPriceType() {
		return priceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPriceType_Value() {
		return (EAttribute)priceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPriceType_Currency() {
		return (EAttribute)priceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductOrderType() {
		return productOrderTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductOrderType_Quantity() {
		return (EAttribute)productOrderTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductOrderType_Color() {
		return (EReference)productOrderTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductOrderType_Number() {
		return (EAttribute)productOrderTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductsType() {
		return productsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductsType_Product() {
		return (EReference)productsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductType() {
		return productTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductType_Number() {
		return (EAttribute)productTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductType_Name() {
		return (EAttribute)productTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductType_Price() {
		return (EReference)productTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRootElementType() {
		return rootElementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRootElementType_Order() {
		return (EReference)rootElementTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _2Factory get_2Factory() {
		return (_2Factory)getEFactoryInstance();
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
		colorTypeEClass = createEClass(COLOR_TYPE);
		createEAttribute(colorTypeEClass, COLOR_TYPE__VALUE);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ROOT_ELEMENT);

		itemsTypeEClass = createEClass(ITEMS_TYPE);
		createEAttribute(itemsTypeEClass, ITEMS_TYPE__GROUP);
		createEReference(itemsTypeEClass, ITEMS_TYPE__SHIRT);
		createEReference(itemsTypeEClass, ITEMS_TYPE__HAT);

		orderTypeEClass = createEClass(ORDER_TYPE);
		createEAttribute(orderTypeEClass, ORDER_TYPE__NUMBER);
		createEReference(orderTypeEClass, ORDER_TYPE__ITEMS);
		createEReference(orderTypeEClass, ORDER_TYPE__PRODUCTS);

		priceTypeEClass = createEClass(PRICE_TYPE);
		createEAttribute(priceTypeEClass, PRICE_TYPE__VALUE);
		createEAttribute(priceTypeEClass, PRICE_TYPE__CURRENCY);

		productOrderTypeEClass = createEClass(PRODUCT_ORDER_TYPE);
		createEAttribute(productOrderTypeEClass, PRODUCT_ORDER_TYPE__QUANTITY);
		createEReference(productOrderTypeEClass, PRODUCT_ORDER_TYPE__COLOR);
		createEAttribute(productOrderTypeEClass, PRODUCT_ORDER_TYPE__NUMBER);

		productsTypeEClass = createEClass(PRODUCTS_TYPE);
		createEReference(productsTypeEClass, PRODUCTS_TYPE__PRODUCT);

		productTypeEClass = createEClass(PRODUCT_TYPE);
		createEAttribute(productTypeEClass, PRODUCT_TYPE__NUMBER);
		createEAttribute(productTypeEClass, PRODUCT_TYPE__NAME);
		createEReference(productTypeEClass, PRODUCT_TYPE__PRICE);

		rootElementTypeEClass = createEClass(ROOT_ELEMENT_TYPE);
		createEReference(rootElementTypeEClass, ROOT_ELEMENT_TYPE__ORDER);
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
		initEClass(colorTypeEClass, ColorType.class, "ColorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColorType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, ColorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RootElement(), this.getRootElementType(), null, "rootElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(itemsTypeEClass, ItemsType.class, "ItemsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getItemsType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ItemsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItemsType_Shirt(), this.getProductOrderType(), null, "shirt", null, 0, -1, ItemsType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getItemsType_Hat(), this.getProductOrderType(), null, "hat", null, 0, -1, ItemsType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(orderTypeEClass, OrderType.class, "OrderType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderType_Number(), theXMLTypePackage.getString(), "number", null, 1, 1, OrderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderType_Items(), this.getItemsType(), null, "items", null, 1, 1, OrderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderType_Products(), this.getProductsType(), null, "products", null, 1, 1, OrderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(priceTypeEClass, PriceType.class, "PriceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPriceType_Value(), theXMLTypePackage.getDecimal(), "value", null, 0, 1, PriceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPriceType_Currency(), theXMLTypePackage.getToken(), "currency", null, 0, 1, PriceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productOrderTypeEClass, ProductOrderType.class, "ProductOrderType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductOrderType_Quantity(), theXMLTypePackage.getInteger(), "quantity", null, 1, 1, ProductOrderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductOrderType_Color(), this.getColorType(), null, "color", null, 0, 1, ProductOrderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductOrderType_Number(), theXMLTypePackage.getInteger(), "number", null, 0, 1, ProductOrderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productsTypeEClass, ProductsType.class, "ProductsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductsType_Product(), this.getProductType(), null, "product", null, 1, -1, ProductsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productTypeEClass, ProductType.class, "ProductType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductType_Number(), theXMLTypePackage.getInteger(), "number", null, 1, 1, ProductType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ProductType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductType_Price(), this.getPriceType(), null, "price", null, 1, 1, ProductType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rootElementTypeEClass, RootElementType.class, "RootElementType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRootElementType_Order(), this.getOrderType(), null, "order", null, 1, 1, RootElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (colorTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ColorType",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getColorType_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
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
		  (getDocumentRoot_RootElement(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rootElement",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (itemsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ItemsType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getItemsType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });	
		addAnnotation
		  (getItemsType_Shirt(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "shirt",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getItemsType_Hat(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "hat",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (orderTypeEClass, 
		   source, 
		   new String[] {
			 "name", "OrderType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getOrderType_Number(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "number"
		   });	
		addAnnotation
		  (getOrderType_Items(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "items"
		   });	
		addAnnotation
		  (getOrderType_Products(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "products"
		   });	
		addAnnotation
		  (priceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "PriceType",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getPriceType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getPriceType_Currency(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "currency"
		   });	
		addAnnotation
		  (productOrderTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ProductOrderType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getProductOrderType_Quantity(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "quantity"
		   });	
		addAnnotation
		  (getProductOrderType_Color(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "color"
		   });	
		addAnnotation
		  (getProductOrderType_Number(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "number"
		   });	
		addAnnotation
		  (productsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ProductsType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getProductsType_Product(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "product"
		   });	
		addAnnotation
		  (productTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ProductType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getProductType_Number(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "number"
		   });	
		addAnnotation
		  (getProductType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });	
		addAnnotation
		  (getProductType_Price(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "price"
		   });	
		addAnnotation
		  (rootElementTypeEClass, 
		   source, 
		   new String[] {
			 "name", "rootElement_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getRootElementType_Order(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "order"
		   });
	}

} //_2PackageImpl
