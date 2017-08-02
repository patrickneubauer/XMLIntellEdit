/**
 */
package com.example.example.with.key._2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see com.example.example.with.key._2._2Factory
 * @model kind="package"
 * @generated
 */
public interface _2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "_2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://example.com/example-with-key-2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "_2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	_2Package eINSTANCE = com.example.example.with.key._2.impl._2PackageImpl.init();

	/**
	 * The meta object id for the '{@link com.example.example.with.key._2.impl.ColorTypeImpl <em>Color Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.example.with.key._2.impl.ColorTypeImpl
	 * @see com.example.example.with.key._2.impl._2PackageImpl#getColorType()
	 * @generated
	 */
	int COLOR_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_TYPE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Color Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Color Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.example.example.with.key._2.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.example.with.key._2.impl.DocumentRootImpl
	 * @see com.example.example.with.key._2.impl._2PackageImpl#getDocumentRoot()
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
	 * The feature id for the '<em><b>Root Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ROOT_ELEMENT = 3;

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
	 * The meta object id for the '{@link com.example.example.with.key._2.impl.ItemsTypeImpl <em>Items Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.example.with.key._2.impl.ItemsTypeImpl
	 * @see com.example.example.with.key._2.impl._2PackageImpl#getItemsType()
	 * @generated
	 */
	int ITEMS_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Shirt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMS_TYPE__SHIRT = 1;

	/**
	 * The feature id for the '<em><b>Hat</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMS_TYPE__HAT = 2;

	/**
	 * The number of structural features of the '<em>Items Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMS_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Items Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.example.example.with.key._2.impl.OrderTypeImpl <em>Order Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.example.with.key._2.impl.OrderTypeImpl
	 * @see com.example.example.with.key._2.impl._2PackageImpl#getOrderType()
	 * @generated
	 */
	int ORDER_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_TYPE__NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_TYPE__ITEMS = 1;

	/**
	 * The feature id for the '<em><b>Products</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_TYPE__PRODUCTS = 2;

	/**
	 * The number of structural features of the '<em>Order Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Order Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.example.example.with.key._2.impl.PriceTypeImpl <em>Price Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.example.with.key._2.impl.PriceTypeImpl
	 * @see com.example.example.with.key._2.impl._2PackageImpl#getPriceType()
	 * @generated
	 */
	int PRICE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE_TYPE__CURRENCY = 1;

	/**
	 * The number of structural features of the '<em>Price Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Price Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.example.example.with.key._2.impl.ProductOrderTypeImpl <em>Product Order Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.example.with.key._2.impl.ProductOrderTypeImpl
	 * @see com.example.example.with.key._2.impl._2PackageImpl#getProductOrderType()
	 * @generated
	 */
	int PRODUCT_ORDER_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ORDER_TYPE__QUANTITY = 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ORDER_TYPE__COLOR = 1;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ORDER_TYPE__NUMBER = 2;

	/**
	 * The number of structural features of the '<em>Product Order Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ORDER_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Product Order Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ORDER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.example.example.with.key._2.impl.ProductsTypeImpl <em>Products Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.example.with.key._2.impl.ProductsTypeImpl
	 * @see com.example.example.with.key._2.impl._2PackageImpl#getProductsType()
	 * @generated
	 */
	int PRODUCTS_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Product</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTS_TYPE__PRODUCT = 0;

	/**
	 * The number of structural features of the '<em>Products Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Products Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.example.example.with.key._2.impl.ProductTypeImpl <em>Product Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.example.with.key._2.impl.ProductTypeImpl
	 * @see com.example.example.with.key._2.impl._2PackageImpl#getProductType()
	 * @generated
	 */
	int PRODUCT_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE__NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Price</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE__PRICE = 2;

	/**
	 * The number of structural features of the '<em>Product Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Product Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link com.example.example.with.key._2.impl.RootElementTypeImpl <em>Root Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.example.with.key._2.impl.RootElementTypeImpl
	 * @see com.example.example.with.key._2.impl._2PackageImpl#getRootElementType()
	 * @generated
	 */
	int ROOT_ELEMENT_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Order</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_ELEMENT_TYPE__ORDER = 0;

	/**
	 * The number of structural features of the '<em>Root Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_ELEMENT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Root Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_ELEMENT_TYPE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link com.example.example.with.key._2.ColorType <em>Color Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color Type</em>'.
	 * @see com.example.example.with.key._2.ColorType
	 * @generated
	 */
	EClass getColorType();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.with.key._2.ColorType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.example.example.with.key._2.ColorType#getValue()
	 * @see #getColorType()
	 * @generated
	 */
	EAttribute getColorType_Value();

	/**
	 * Returns the meta object for class '{@link com.example.example.with.key._2.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see com.example.example.with.key._2.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link com.example.example.with.key._2.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see com.example.example.with.key._2.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link com.example.example.with.key._2.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see com.example.example.with.key._2.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link com.example.example.with.key._2.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see com.example.example.with.key._2.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link com.example.example.with.key._2.DocumentRoot#getRootElement <em>Root Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root Element</em>'.
	 * @see com.example.example.with.key._2.DocumentRoot#getRootElement()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RootElement();

	/**
	 * Returns the meta object for class '{@link com.example.example.with.key._2.ItemsType <em>Items Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Items Type</em>'.
	 * @see com.example.example.with.key._2.ItemsType
	 * @generated
	 */
	EClass getItemsType();

	/**
	 * Returns the meta object for the attribute list '{@link com.example.example.with.key._2.ItemsType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.example.example.with.key._2.ItemsType#getGroup()
	 * @see #getItemsType()
	 * @generated
	 */
	EAttribute getItemsType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link com.example.example.with.key._2.ItemsType#getShirt <em>Shirt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shirt</em>'.
	 * @see com.example.example.with.key._2.ItemsType#getShirt()
	 * @see #getItemsType()
	 * @generated
	 */
	EReference getItemsType_Shirt();

	/**
	 * Returns the meta object for the containment reference list '{@link com.example.example.with.key._2.ItemsType#getHat <em>Hat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hat</em>'.
	 * @see com.example.example.with.key._2.ItemsType#getHat()
	 * @see #getItemsType()
	 * @generated
	 */
	EReference getItemsType_Hat();

	/**
	 * Returns the meta object for class '{@link com.example.example.with.key._2.OrderType <em>Order Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order Type</em>'.
	 * @see com.example.example.with.key._2.OrderType
	 * @generated
	 */
	EClass getOrderType();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.with.key._2.OrderType#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see com.example.example.with.key._2.OrderType#getNumber()
	 * @see #getOrderType()
	 * @generated
	 */
	EAttribute getOrderType_Number();

	/**
	 * Returns the meta object for the containment reference '{@link com.example.example.with.key._2.OrderType#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Items</em>'.
	 * @see com.example.example.with.key._2.OrderType#getItems()
	 * @see #getOrderType()
	 * @generated
	 */
	EReference getOrderType_Items();

	/**
	 * Returns the meta object for the containment reference '{@link com.example.example.with.key._2.OrderType#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Products</em>'.
	 * @see com.example.example.with.key._2.OrderType#getProducts()
	 * @see #getOrderType()
	 * @generated
	 */
	EReference getOrderType_Products();

	/**
	 * Returns the meta object for class '{@link com.example.example.with.key._2.PriceType <em>Price Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Price Type</em>'.
	 * @see com.example.example.with.key._2.PriceType
	 * @generated
	 */
	EClass getPriceType();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.with.key._2.PriceType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.example.example.with.key._2.PriceType#getValue()
	 * @see #getPriceType()
	 * @generated
	 */
	EAttribute getPriceType_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.with.key._2.PriceType#getCurrency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency</em>'.
	 * @see com.example.example.with.key._2.PriceType#getCurrency()
	 * @see #getPriceType()
	 * @generated
	 */
	EAttribute getPriceType_Currency();

	/**
	 * Returns the meta object for class '{@link com.example.example.with.key._2.ProductOrderType <em>Product Order Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Order Type</em>'.
	 * @see com.example.example.with.key._2.ProductOrderType
	 * @generated
	 */
	EClass getProductOrderType();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.with.key._2.ProductOrderType#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see com.example.example.with.key._2.ProductOrderType#getQuantity()
	 * @see #getProductOrderType()
	 * @generated
	 */
	EAttribute getProductOrderType_Quantity();

	/**
	 * Returns the meta object for the containment reference '{@link com.example.example.with.key._2.ProductOrderType#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Color</em>'.
	 * @see com.example.example.with.key._2.ProductOrderType#getColor()
	 * @see #getProductOrderType()
	 * @generated
	 */
	EReference getProductOrderType_Color();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.with.key._2.ProductOrderType#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see com.example.example.with.key._2.ProductOrderType#getNumber()
	 * @see #getProductOrderType()
	 * @generated
	 */
	EAttribute getProductOrderType_Number();

	/**
	 * Returns the meta object for class '{@link com.example.example.with.key._2.ProductsType <em>Products Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Products Type</em>'.
	 * @see com.example.example.with.key._2.ProductsType
	 * @generated
	 */
	EClass getProductsType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.example.example.with.key._2.ProductsType#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Product</em>'.
	 * @see com.example.example.with.key._2.ProductsType#getProduct()
	 * @see #getProductsType()
	 * @generated
	 */
	EReference getProductsType_Product();

	/**
	 * Returns the meta object for class '{@link com.example.example.with.key._2.ProductType <em>Product Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Type</em>'.
	 * @see com.example.example.with.key._2.ProductType
	 * @generated
	 */
	EClass getProductType();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.with.key._2.ProductType#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see com.example.example.with.key._2.ProductType#getNumber()
	 * @see #getProductType()
	 * @generated
	 */
	EAttribute getProductType_Number();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.with.key._2.ProductType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.example.example.with.key._2.ProductType#getName()
	 * @see #getProductType()
	 * @generated
	 */
	EAttribute getProductType_Name();

	/**
	 * Returns the meta object for the containment reference '{@link com.example.example.with.key._2.ProductType#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Price</em>'.
	 * @see com.example.example.with.key._2.ProductType#getPrice()
	 * @see #getProductType()
	 * @generated
	 */
	EReference getProductType_Price();

	/**
	 * Returns the meta object for class '{@link com.example.example.with.key._2.RootElementType <em>Root Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Element Type</em>'.
	 * @see com.example.example.with.key._2.RootElementType
	 * @generated
	 */
	EClass getRootElementType();

	/**
	 * Returns the meta object for the containment reference '{@link com.example.example.with.key._2.RootElementType#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Order</em>'.
	 * @see com.example.example.with.key._2.RootElementType#getOrder()
	 * @see #getRootElementType()
	 * @generated
	 */
	EReference getRootElementType_Order();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	_2Factory get_2Factory();

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
		 * The meta object literal for the '{@link com.example.example.with.key._2.impl.ColorTypeImpl <em>Color Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.example.with.key._2.impl.ColorTypeImpl
		 * @see com.example.example.with.key._2.impl._2PackageImpl#getColorType()
		 * @generated
		 */
		EClass COLOR_TYPE = eINSTANCE.getColorType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR_TYPE__VALUE = eINSTANCE.getColorType_Value();

		/**
		 * The meta object literal for the '{@link com.example.example.with.key._2.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.example.with.key._2.impl.DocumentRootImpl
		 * @see com.example.example.with.key._2.impl._2PackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Root Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ROOT_ELEMENT = eINSTANCE.getDocumentRoot_RootElement();

		/**
		 * The meta object literal for the '{@link com.example.example.with.key._2.impl.ItemsTypeImpl <em>Items Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.example.with.key._2.impl.ItemsTypeImpl
		 * @see com.example.example.with.key._2.impl._2PackageImpl#getItemsType()
		 * @generated
		 */
		EClass ITEMS_TYPE = eINSTANCE.getItemsType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEMS_TYPE__GROUP = eINSTANCE.getItemsType_Group();

		/**
		 * The meta object literal for the '<em><b>Shirt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEMS_TYPE__SHIRT = eINSTANCE.getItemsType_Shirt();

		/**
		 * The meta object literal for the '<em><b>Hat</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEMS_TYPE__HAT = eINSTANCE.getItemsType_Hat();

		/**
		 * The meta object literal for the '{@link com.example.example.with.key._2.impl.OrderTypeImpl <em>Order Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.example.with.key._2.impl.OrderTypeImpl
		 * @see com.example.example.with.key._2.impl._2PackageImpl#getOrderType()
		 * @generated
		 */
		EClass ORDER_TYPE = eINSTANCE.getOrderType();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_TYPE__NUMBER = eINSTANCE.getOrderType_Number();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_TYPE__ITEMS = eINSTANCE.getOrderType_Items();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_TYPE__PRODUCTS = eINSTANCE.getOrderType_Products();

		/**
		 * The meta object literal for the '{@link com.example.example.with.key._2.impl.PriceTypeImpl <em>Price Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.example.with.key._2.impl.PriceTypeImpl
		 * @see com.example.example.with.key._2.impl._2PackageImpl#getPriceType()
		 * @generated
		 */
		EClass PRICE_TYPE = eINSTANCE.getPriceType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRICE_TYPE__VALUE = eINSTANCE.getPriceType_Value();

		/**
		 * The meta object literal for the '<em><b>Currency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRICE_TYPE__CURRENCY = eINSTANCE.getPriceType_Currency();

		/**
		 * The meta object literal for the '{@link com.example.example.with.key._2.impl.ProductOrderTypeImpl <em>Product Order Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.example.with.key._2.impl.ProductOrderTypeImpl
		 * @see com.example.example.with.key._2.impl._2PackageImpl#getProductOrderType()
		 * @generated
		 */
		EClass PRODUCT_ORDER_TYPE = eINSTANCE.getProductOrderType();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_ORDER_TYPE__QUANTITY = eINSTANCE.getProductOrderType_Quantity();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_ORDER_TYPE__COLOR = eINSTANCE.getProductOrderType_Color();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_ORDER_TYPE__NUMBER = eINSTANCE.getProductOrderType_Number();

		/**
		 * The meta object literal for the '{@link com.example.example.with.key._2.impl.ProductsTypeImpl <em>Products Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.example.with.key._2.impl.ProductsTypeImpl
		 * @see com.example.example.with.key._2.impl._2PackageImpl#getProductsType()
		 * @generated
		 */
		EClass PRODUCTS_TYPE = eINSTANCE.getProductsType();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCTS_TYPE__PRODUCT = eINSTANCE.getProductsType_Product();

		/**
		 * The meta object literal for the '{@link com.example.example.with.key._2.impl.ProductTypeImpl <em>Product Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.example.with.key._2.impl.ProductTypeImpl
		 * @see com.example.example.with.key._2.impl._2PackageImpl#getProductType()
		 * @generated
		 */
		EClass PRODUCT_TYPE = eINSTANCE.getProductType();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_TYPE__NUMBER = eINSTANCE.getProductType_Number();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_TYPE__NAME = eINSTANCE.getProductType_Name();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_TYPE__PRICE = eINSTANCE.getProductType_Price();

		/**
		 * The meta object literal for the '{@link com.example.example.with.key._2.impl.RootElementTypeImpl <em>Root Element Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.example.with.key._2.impl.RootElementTypeImpl
		 * @see com.example.example.with.key._2.impl._2PackageImpl#getRootElementType()
		 * @generated
		 */
		EClass ROOT_ELEMENT_TYPE = eINSTANCE.getRootElementType();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_ELEMENT_TYPE__ORDER = eINSTANCE.getRootElementType_Order();

	}

} //_2Package
