/**
 */
package com.example.example.importreferences;

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
 * <!-- begin-model-doc -->
 * 
 *    <div xmlns="http://www.w3.org/1999/xhtml">
 *     <h1>About the XML namespace</h1>
 * 
 *     <div class="bodytext">
 *      <p>
 *       This schema document describes the XML namespace, in a form
 *       suitable for import by other schema documents.
 *      </p>
 *      <p>
 *       See <a href="http://www.w3.org/XML/1998/namespace.html">
 *       http://www.w3.org/XML/1998/namespace.html</a> and
 *       <a href="http://www.w3.org/TR/REC-xml">
 *       http://www.w3.org/TR/REC-xml</a> for information 
 *       about this namespace.
 *      </p>
 *      <p>
 *       Note that local names in this namespace are intended to be
 *       defined only by the World Wide Web Consortium or its subgroups.
 *       The names currently defined in this namespace are listed below.
 *       They should not be used with conflicting semantics by any Working
 *       Group, specification, or document instance.
 *      </p>
 *      <p>   
 *       See further below in this document for more information about <a href="#usage">how to refer to this schema document from your own
 *       XSD schema documents</a> and about <a href="#nsversioning">the
 *       namespace-versioning policy governing this schema document</a>.
 *      </p>
 *     </div>
 *    </div>
 *   
 * 
 *    <div xmlns="http://www.w3.org/1999/xhtml">
 *    
 *     <h3>Father (in any context at all)</h3> 
 * 
 *     <div class="bodytext">
 *      <p>
 *       denotes Jon Bosak, the chair of 
 *       the original XML Working Group.  This name is reserved by 
 *       the following decision of the W3C XML Plenary and 
 *       XML Coordination groups:
 *      </p>
 *      <blockquote>
 *        <p>
 * 	In appreciation for his vision, leadership and
 * 	dedication the W3C XML Plenary on this 10th day of
 * 	February, 2000, reserves for Jon Bosak in perpetuity
 * 	the XML name "xml:Father".
 *        </p>
 *      </blockquote>
 *     </div>
 *    </div>
 *   
 * 
 *    <div id="usage" xml:id="usage" xmlns="http://www.w3.org/1999/xhtml">
 *     <h2>
 *       <a name="usage">About this schema document</a>
 *     </h2>
 * 
 *     <div class="bodytext">
 *      <p>
 *       This schema defines attributes and an attribute group suitable
 *       for use by schemas wishing to allow <code>xml:base</code>,
 *       <code>xml:lang</code>, <code>xml:space</code> or
 *       <code>xml:id</code> attributes on elements they define.
 *      </p>
 *      <p>
 *       To enable this, such a schema must import this schema for
 *       the XML namespace, e.g. as follows:
 *      </p>
 *      <pre>
 *           &lt;schema . . .&gt;
 *            . . .
 *            &lt;import namespace="http://www.w3.org/XML/1998/namespace"
 *                       schemaLocation="http://www.w3.org/2001/xml.xsd"/&gt;
 *      </pre>
 *      <p>
 *       or
 *      </p>
 *      <pre>
 *            &lt;import namespace="http://www.w3.org/XML/1998/namespace"
 *                       schemaLocation="http://www.w3.org/2009/01/xml.xsd"/&gt;
 *      </pre>
 *      <p>
 *       Subsequently, qualified reference to any of the attributes or the
 *       group defined below will have the desired effect, e.g.
 *      </p>
 *      <pre>
 *           &lt;type . . .&gt;
 *            . . .
 *            &lt;attributeGroup ref="xml:specialAttrs"/&gt;
 *      </pre>
 *      <p>
 *       will define a type which will schema-validate an instance element
 *       with any of those attributes.
 *      </p>
 *     </div>
 *    </div>
 *   
 * 
 *    <div id="nsversioning" xml:id="nsversioning" xmlns="http://www.w3.org/1999/xhtml">
 *     <h2>
 *       <a name="nsversioning">Versioning policy for this schema document</a>
 *     </h2>
 *     <div class="bodytext">
 *      <p>
 *       In keeping with the XML Schema WG's standard versioning
 *       policy, this schema document will persist at
 *       <a href="http://www.w3.org/2009/01/xml.xsd">
 *        http://www.w3.org/2009/01/xml.xsd</a>.
 *      </p>
 *      <p>
 *       At the date of issue it can also be found at
 *       <a href="http://www.w3.org/2001/xml.xsd">
 *        http://www.w3.org/2001/xml.xsd</a>.
 *      </p>
 *      <p>
 *       The schema document at that URI may however change in the future,
 *       in order to remain compatible with the latest version of XML
 *       Schema itself, or with the XML namespace itself.  In other words,
 *       if the XML Schema or XML namespaces change, the version of this
 *       document at <a href="http://www.w3.org/2001/xml.xsd">
 *        http://www.w3.org/2001/xml.xsd 
 *       </a> 
 *       will change accordingly; the version at 
 *       <a href="http://www.w3.org/2009/01/xml.xsd">
 *        http://www.w3.org/2009/01/xml.xsd 
 *       </a> 
 *       will not change.
 *      </p>
 *      <p>
 *       Previous dated (and unchanging) versions of this schema 
 *       document are at:
 *      </p>
 *      <ul>
 *       <li>
 *           <a href="http://www.w3.org/2009/01/xml.xsd">
 * 	http://www.w3.org/2009/01/xml.xsd</a>
 *         </li>
 *       <li>
 *           <a href="http://www.w3.org/2007/08/xml.xsd">
 * 	http://www.w3.org/2007/08/xml.xsd</a>
 *         </li>
 *       <li>
 *           <a href="http://www.w3.org/2004/10/xml.xsd">
 * 	http://www.w3.org/2004/10/xml.xsd</a>
 *         </li>
 *       <li>
 *           <a href="http://www.w3.org/2001/03/xml.xsd">
 * 	http://www.w3.org/2001/03/xml.xsd</a>
 *         </li>
 *      </ul>
 *     </div>
 *    </div>
 *   
 * <!-- end-model-doc -->
 * @see com.example.example.importreferences.ImportreferencesFactory
 * @model kind="package"
 * @generated
 */
public interface ImportreferencesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "importreferences";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://example.com/example-importreferences";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "importreferences";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ImportreferencesPackage eINSTANCE = com.example.example.importreferences.impl.ImportreferencesPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.example.example.importreferences.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.example.importreferences.impl.DocumentRootImpl
	 * @see com.example.example.importreferences.impl.ImportreferencesPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 0;

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
	 * The meta object id for the '{@link com.example.example.importreferences.impl.OrderDetail1Impl <em>Order Detail1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.example.importreferences.impl.OrderDetail1Impl
	 * @see com.example.example.importreferences.impl.ImportreferencesPackageImpl#getOrderDetail1()
	 * @generated
	 */
	int ORDER_DETAIL1 = 1;

	/**
	 * The feature id for the '<em><b>Customer Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_DETAIL1__CUSTOMER_ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Customer Contact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_DETAIL1__CUSTOMER_CONTACT = 1;

	/**
	 * The feature id for the '<em><b>Customer Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_DETAIL1__CUSTOMER_NAME = 2;

	/**
	 * The feature id for the '<em><b>Order ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_DETAIL1__ORDER_ID = 3;

	/**
	 * The number of structural features of the '<em>Order Detail1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_DETAIL1_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Order Detail1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_DETAIL1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.example.example.importreferences.impl.OrderDetail2Impl <em>Order Detail2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.example.importreferences.impl.OrderDetail2Impl
	 * @see com.example.example.importreferences.impl.ImportreferencesPackageImpl#getOrderDetail2()
	 * @generated
	 */
	int ORDER_DETAIL2 = 2;

	/**
	 * The feature id for the '<em><b>Customer Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_DETAIL2__CUSTOMER_NAME = 0;

	/**
	 * The feature id for the '<em><b>Order ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_DETAIL2__ORDER_ID = 1;

	/**
	 * The number of structural features of the '<em>Order Detail2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_DETAIL2_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Order Detail2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_DETAIL2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.example.example.importreferences.impl.OrderRef1Impl <em>Order Ref1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.example.importreferences.impl.OrderRef1Impl
	 * @see com.example.example.importreferences.impl.ImportreferencesPackageImpl#getOrderRef1()
	 * @generated
	 */
	int ORDER_REF1 = 3;

	/**
	 * The feature id for the '<em><b>Order Detail1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_REF1__ORDER_DETAIL1 = 0;

	/**
	 * The number of structural features of the '<em>Order Ref1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_REF1_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Order Ref1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_REF1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.example.example.importreferences.impl.OrderRef2Impl <em>Order Ref2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.example.importreferences.impl.OrderRef2Impl
	 * @see com.example.example.importreferences.impl.ImportreferencesPackageImpl#getOrderRef2()
	 * @generated
	 */
	int ORDER_REF2 = 4;

	/**
	 * The feature id for the '<em><b>Order Detail2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_REF2__ORDER_DETAIL2 = 0;

	/**
	 * The number of structural features of the '<em>Order Ref2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_REF2_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Order Ref2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_REF2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.example.example.importreferences.impl.OrdersTypeImpl <em>Orders Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.example.importreferences.impl.OrdersTypeImpl
	 * @see com.example.example.importreferences.impl.ImportreferencesPackageImpl#getOrdersType()
	 * @generated
	 */
	int ORDERS_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Order1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERS_TYPE__ORDER1 = 0;

	/**
	 * The feature id for the '<em><b>Order2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERS_TYPE__ORDER2 = 1;

	/**
	 * The feature id for the '<em><b>Order Reference1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERS_TYPE__ORDER_REFERENCE1 = 2;

	/**
	 * The feature id for the '<em><b>Order Reference2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERS_TYPE__ORDER_REFERENCE2 = 3;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERS_TYPE__IMPORTED_NAMESPACE = 4;

	/**
	 * The number of structural features of the '<em>Orders Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERS_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Orders Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERS_TYPE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link com.example.example.importreferences.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see com.example.example.importreferences.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link com.example.example.importreferences.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see com.example.example.importreferences.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link com.example.example.importreferences.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see com.example.example.importreferences.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link com.example.example.importreferences.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see com.example.example.importreferences.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link com.example.example.importreferences.DocumentRoot#getOrders <em>Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Orders</em>'.
	 * @see com.example.example.importreferences.DocumentRoot#getOrders()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Orders();

	/**
	 * Returns the meta object for class '{@link com.example.example.importreferences.OrderDetail1 <em>Order Detail1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order Detail1</em>'.
	 * @see com.example.example.importreferences.OrderDetail1
	 * @generated
	 */
	EClass getOrderDetail1();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.importreferences.OrderDetail1#getCustomerAddress <em>Customer Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer Address</em>'.
	 * @see com.example.example.importreferences.OrderDetail1#getCustomerAddress()
	 * @see #getOrderDetail1()
	 * @generated
	 */
	EAttribute getOrderDetail1_CustomerAddress();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.importreferences.OrderDetail1#getCustomerContact <em>Customer Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer Contact</em>'.
	 * @see com.example.example.importreferences.OrderDetail1#getCustomerContact()
	 * @see #getOrderDetail1()
	 * @generated
	 */
	EAttribute getOrderDetail1_CustomerContact();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.importreferences.OrderDetail1#getCustomerName <em>Customer Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer Name</em>'.
	 * @see com.example.example.importreferences.OrderDetail1#getCustomerName()
	 * @see #getOrderDetail1()
	 * @generated
	 */
	EAttribute getOrderDetail1_CustomerName();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.importreferences.OrderDetail1#getOrderID <em>Order ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order ID</em>'.
	 * @see com.example.example.importreferences.OrderDetail1#getOrderID()
	 * @see #getOrderDetail1()
	 * @generated
	 */
	EAttribute getOrderDetail1_OrderID();

	/**
	 * Returns the meta object for class '{@link com.example.example.importreferences.OrderDetail2 <em>Order Detail2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order Detail2</em>'.
	 * @see com.example.example.importreferences.OrderDetail2
	 * @generated
	 */
	EClass getOrderDetail2();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.importreferences.OrderDetail2#getCustomerName <em>Customer Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer Name</em>'.
	 * @see com.example.example.importreferences.OrderDetail2#getCustomerName()
	 * @see #getOrderDetail2()
	 * @generated
	 */
	EAttribute getOrderDetail2_CustomerName();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.importreferences.OrderDetail2#getOrderID <em>Order ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order ID</em>'.
	 * @see com.example.example.importreferences.OrderDetail2#getOrderID()
	 * @see #getOrderDetail2()
	 * @generated
	 */
	EAttribute getOrderDetail2_OrderID();

	/**
	 * Returns the meta object for class '{@link com.example.example.importreferences.OrderRef1 <em>Order Ref1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order Ref1</em>'.
	 * @see com.example.example.importreferences.OrderRef1
	 * @generated
	 */
	EClass getOrderRef1();

	/**
	 * Returns the meta object for the reference '{@link com.example.example.importreferences.OrderRef1#getOrderDetail1 <em>Order Detail1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order Detail1</em>'.
	 * @see com.example.example.importreferences.OrderRef1#getOrderDetail1()
	 * @see #getOrderRef1()
	 * @generated
	 */
	EReference getOrderRef1_OrderDetail1();

	/**
	 * Returns the meta object for class '{@link com.example.example.importreferences.OrderRef2 <em>Order Ref2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order Ref2</em>'.
	 * @see com.example.example.importreferences.OrderRef2
	 * @generated
	 */
	EClass getOrderRef2();

	/**
	 * Returns the meta object for the reference '{@link com.example.example.importreferences.OrderRef2#getOrderDetail2 <em>Order Detail2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order Detail2</em>'.
	 * @see com.example.example.importreferences.OrderRef2#getOrderDetail2()
	 * @see #getOrderRef2()
	 * @generated
	 */
	EReference getOrderRef2_OrderDetail2();

	/**
	 * Returns the meta object for class '{@link com.example.example.importreferences.OrdersType <em>Orders Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orders Type</em>'.
	 * @see com.example.example.importreferences.OrdersType
	 * @generated
	 */
	EClass getOrdersType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.example.example.importreferences.OrdersType#getOrder1 <em>Order1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Order1</em>'.
	 * @see com.example.example.importreferences.OrdersType#getOrder1()
	 * @see #getOrdersType()
	 * @generated
	 */
	EReference getOrdersType_Order1();

	/**
	 * Returns the meta object for the containment reference list '{@link com.example.example.importreferences.OrdersType#getOrder2 <em>Order2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Order2</em>'.
	 * @see com.example.example.importreferences.OrdersType#getOrder2()
	 * @see #getOrdersType()
	 * @generated
	 */
	EReference getOrdersType_Order2();

	/**
	 * Returns the meta object for the containment reference list '{@link com.example.example.importreferences.OrdersType#getOrderReference1 <em>Order Reference1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Order Reference1</em>'.
	 * @see com.example.example.importreferences.OrdersType#getOrderReference1()
	 * @see #getOrdersType()
	 * @generated
	 */
	EReference getOrdersType_OrderReference1();

	/**
	 * Returns the meta object for the containment reference list '{@link com.example.example.importreferences.OrdersType#getOrderReference2 <em>Order Reference2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Order Reference2</em>'.
	 * @see com.example.example.importreferences.OrdersType#getOrderReference2()
	 * @see #getOrdersType()
	 * @generated
	 */
	EReference getOrdersType_OrderReference2();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.importreferences.OrdersType#getImportedNamespace <em>Imported Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imported Namespace</em>'.
	 * @see com.example.example.importreferences.OrdersType#getImportedNamespace()
	 * @see #getOrdersType()
	 * @generated
	 */
	EAttribute getOrdersType_ImportedNamespace();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ImportreferencesFactory getImportreferencesFactory();

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
		 * The meta object literal for the '{@link com.example.example.importreferences.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.example.importreferences.impl.DocumentRootImpl
		 * @see com.example.example.importreferences.impl.ImportreferencesPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '{@link com.example.example.importreferences.impl.OrderDetail1Impl <em>Order Detail1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.example.importreferences.impl.OrderDetail1Impl
		 * @see com.example.example.importreferences.impl.ImportreferencesPackageImpl#getOrderDetail1()
		 * @generated
		 */
		EClass ORDER_DETAIL1 = eINSTANCE.getOrderDetail1();

		/**
		 * The meta object literal for the '<em><b>Customer Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_DETAIL1__CUSTOMER_ADDRESS = eINSTANCE.getOrderDetail1_CustomerAddress();

		/**
		 * The meta object literal for the '<em><b>Customer Contact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_DETAIL1__CUSTOMER_CONTACT = eINSTANCE.getOrderDetail1_CustomerContact();

		/**
		 * The meta object literal for the '<em><b>Customer Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_DETAIL1__CUSTOMER_NAME = eINSTANCE.getOrderDetail1_CustomerName();

		/**
		 * The meta object literal for the '<em><b>Order ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_DETAIL1__ORDER_ID = eINSTANCE.getOrderDetail1_OrderID();

		/**
		 * The meta object literal for the '{@link com.example.example.importreferences.impl.OrderDetail2Impl <em>Order Detail2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.example.importreferences.impl.OrderDetail2Impl
		 * @see com.example.example.importreferences.impl.ImportreferencesPackageImpl#getOrderDetail2()
		 * @generated
		 */
		EClass ORDER_DETAIL2 = eINSTANCE.getOrderDetail2();

		/**
		 * The meta object literal for the '<em><b>Customer Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_DETAIL2__CUSTOMER_NAME = eINSTANCE.getOrderDetail2_CustomerName();

		/**
		 * The meta object literal for the '<em><b>Order ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_DETAIL2__ORDER_ID = eINSTANCE.getOrderDetail2_OrderID();

		/**
		 * The meta object literal for the '{@link com.example.example.importreferences.impl.OrderRef1Impl <em>Order Ref1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.example.importreferences.impl.OrderRef1Impl
		 * @see com.example.example.importreferences.impl.ImportreferencesPackageImpl#getOrderRef1()
		 * @generated
		 */
		EClass ORDER_REF1 = eINSTANCE.getOrderRef1();

		/**
		 * The meta object literal for the '<em><b>Order Detail1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_REF1__ORDER_DETAIL1 = eINSTANCE.getOrderRef1_OrderDetail1();

		/**
		 * The meta object literal for the '{@link com.example.example.importreferences.impl.OrderRef2Impl <em>Order Ref2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.example.importreferences.impl.OrderRef2Impl
		 * @see com.example.example.importreferences.impl.ImportreferencesPackageImpl#getOrderRef2()
		 * @generated
		 */
		EClass ORDER_REF2 = eINSTANCE.getOrderRef2();

		/**
		 * The meta object literal for the '<em><b>Order Detail2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_REF2__ORDER_DETAIL2 = eINSTANCE.getOrderRef2_OrderDetail2();

		/**
		 * The meta object literal for the '{@link com.example.example.importreferences.impl.OrdersTypeImpl <em>Orders Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.example.importreferences.impl.OrdersTypeImpl
		 * @see com.example.example.importreferences.impl.ImportreferencesPackageImpl#getOrdersType()
		 * @generated
		 */
		EClass ORDERS_TYPE = eINSTANCE.getOrdersType();

		/**
		 * The meta object literal for the '<em><b>Order1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDERS_TYPE__ORDER1 = eINSTANCE.getOrdersType_Order1();

		/**
		 * The meta object literal for the '<em><b>Order2</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDERS_TYPE__ORDER2 = eINSTANCE.getOrdersType_Order2();

		/**
		 * The meta object literal for the '<em><b>Order Reference1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDERS_TYPE__ORDER_REFERENCE1 = eINSTANCE.getOrdersType_OrderReference1();

		/**
		 * The meta object literal for the '<em><b>Order Reference2</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDERS_TYPE__ORDER_REFERENCE2 = eINSTANCE.getOrdersType_OrderReference2();

		/**
		 * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDERS_TYPE__IMPORTED_NAMESPACE = eINSTANCE.getOrdersType_ImportedNamespace();

	}

} //ImportreferencesPackage
