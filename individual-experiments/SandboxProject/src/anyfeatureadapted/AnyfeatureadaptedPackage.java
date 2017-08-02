/**
 */
package anyfeatureadapted;

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
 * @see anyfeatureadapted.AnyfeatureadaptedFactory
 * @model kind="package"
 * @generated
 */
public interface AnyfeatureadaptedPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "anyfeatureadapted";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://example.com/example-with-anyfeatureadapted";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "anyfeatureadapted";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnyfeatureadaptedPackage eINSTANCE = anyfeatureadapted.impl.AnyfeatureadaptedPackageImpl.init();

	/**
	 * The meta object id for the '{@link anyfeatureadapted.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see anyfeatureadapted.impl.DocumentRootImpl
	 * @see anyfeatureadapted.impl.AnyfeatureadaptedPackageImpl#getDocumentRoot()
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
	 * The meta object id for the '{@link anyfeatureadapted.impl.Element1Impl <em>Element1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see anyfeatureadapted.impl.Element1Impl
	 * @see anyfeatureadapted.impl.AnyfeatureadaptedPackageImpl#getElement1()
	 * @generated
	 */
	int ELEMENT1 = 1;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT1__CITY = 0;

	/**
	 * The feature id for the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT1__STREET = 1;

	/**
	 * The number of structural features of the '<em>Element1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT1_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Element1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link anyfeatureadapted.impl.PropertiesImpl <em>Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see anyfeatureadapted.impl.PropertiesImpl
	 * @see anyfeatureadapted.impl.AnyfeatureadaptedPackageImpl#getProperties()
	 * @generated
	 */
	int PROPERTIES = 2;

	/**
	 * The feature id for the '<em><b>Any Generic Elem</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__ANY_GENERIC_ELEM = 0;

	/**
	 * The number of structural features of the '<em>Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link anyfeatureadapted.impl.RootElementTypeImpl <em>Root Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see anyfeatureadapted.impl.RootElementTypeImpl
	 * @see anyfeatureadapted.impl.AnyfeatureadaptedPackageImpl#getRootElementType()
	 * @generated
	 */
	int ROOT_ELEMENT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Element1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_ELEMENT_TYPE__ELEMENT1 = 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_ELEMENT_TYPE__PROPERTIES = 1;

	/**
	 * The number of structural features of the '<em>Root Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_ELEMENT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Root Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_ELEMENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link anyfeatureadapted.impl.AnyGenericConstructImpl <em>Any Generic Construct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see anyfeatureadapted.impl.AnyGenericConstructImpl
	 * @see anyfeatureadapted.impl.AnyfeatureadaptedPackageImpl#getAnyGenericConstruct()
	 * @generated
	 */
	int ANY_GENERIC_CONSTRUCT = 4;

	/**
	 * The number of structural features of the '<em>Any Generic Construct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_GENERIC_CONSTRUCT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Any Generic Construct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_GENERIC_CONSTRUCT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link anyfeatureadapted.impl.AnyGenericElementImpl <em>Any Generic Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see anyfeatureadapted.impl.AnyGenericElementImpl
	 * @see anyfeatureadapted.impl.AnyfeatureadaptedPackageImpl#getAnyGenericElement()
	 * @generated
	 */
	int ANY_GENERIC_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Elem Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_GENERIC_ELEMENT__ELEM_NAME = ANY_GENERIC_CONSTRUCT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Any Generic Attr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_GENERIC_ELEMENT__ANY_GENERIC_ATTR = ANY_GENERIC_CONSTRUCT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Elem Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_GENERIC_ELEMENT__ELEM_VALUE = ANY_GENERIC_CONSTRUCT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Child Elem</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_GENERIC_ELEMENT__CHILD_ELEM = ANY_GENERIC_CONSTRUCT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Any Generic Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_GENERIC_ELEMENT_FEATURE_COUNT = ANY_GENERIC_CONSTRUCT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Any Generic Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_GENERIC_ELEMENT_OPERATION_COUNT = ANY_GENERIC_CONSTRUCT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link anyfeatureadapted.impl.AnyGenericAttributeImpl <em>Any Generic Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see anyfeatureadapted.impl.AnyGenericAttributeImpl
	 * @see anyfeatureadapted.impl.AnyfeatureadaptedPackageImpl#getAnyGenericAttribute()
	 * @generated
	 */
	int ANY_GENERIC_ATTRIBUTE = 6;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_GENERIC_ATTRIBUTE__ATTR_NAME = 0;

	/**
	 * The feature id for the '<em><b>Attr Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_GENERIC_ATTRIBUTE__ATTR_VALUE = 1;

	/**
	 * The number of structural features of the '<em>Any Generic Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_GENERIC_ATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Any Generic Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_GENERIC_ATTRIBUTE_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link anyfeatureadapted.impl.AnyGenericTextImpl <em>Any Generic Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see anyfeatureadapted.impl.AnyGenericTextImpl
	 * @see anyfeatureadapted.impl.AnyfeatureadaptedPackageImpl#getAnyGenericText()
	 * @generated
	 */
	int ANY_GENERIC_TEXT = 7;

	/**
	 * The feature id for the '<em><b>Text Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_GENERIC_TEXT__TEXT_VALUE = ANY_GENERIC_CONSTRUCT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Any Generic Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_GENERIC_TEXT_FEATURE_COUNT = ANY_GENERIC_CONSTRUCT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Any Generic Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_GENERIC_TEXT_OPERATION_COUNT = ANY_GENERIC_CONSTRUCT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link anyfeatureadapted.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see anyfeatureadapted.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link anyfeatureadapted.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see anyfeatureadapted.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link anyfeatureadapted.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see anyfeatureadapted.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link anyfeatureadapted.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see anyfeatureadapted.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link anyfeatureadapted.DocumentRoot#getRootElement <em>Root Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root Element</em>'.
	 * @see anyfeatureadapted.DocumentRoot#getRootElement()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RootElement();

	/**
	 * Returns the meta object for class '{@link anyfeatureadapted.Element1 <em>Element1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element1</em>'.
	 * @see anyfeatureadapted.Element1
	 * @generated
	 */
	EClass getElement1();

	/**
	 * Returns the meta object for the attribute '{@link anyfeatureadapted.Element1#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see anyfeatureadapted.Element1#getCity()
	 * @see #getElement1()
	 * @generated
	 */
	EAttribute getElement1_City();

	/**
	 * Returns the meta object for the attribute '{@link anyfeatureadapted.Element1#getStreet <em>Street</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street</em>'.
	 * @see anyfeatureadapted.Element1#getStreet()
	 * @see #getElement1()
	 * @generated
	 */
	EAttribute getElement1_Street();

	/**
	 * Returns the meta object for class '{@link anyfeatureadapted.Properties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Properties</em>'.
	 * @see anyfeatureadapted.Properties
	 * @generated
	 */
	EClass getProperties();

	/**
	 * Returns the meta object for the containment reference list '{@link anyfeatureadapted.Properties#getAnyGenericElem <em>Any Generic Elem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Any Generic Elem</em>'.
	 * @see anyfeatureadapted.Properties#getAnyGenericElem()
	 * @see #getProperties()
	 * @generated
	 */
	EReference getProperties_AnyGenericElem();

	/**
	 * Returns the meta object for class '{@link anyfeatureadapted.RootElementType <em>Root Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Element Type</em>'.
	 * @see anyfeatureadapted.RootElementType
	 * @generated
	 */
	EClass getRootElementType();

	/**
	 * Returns the meta object for the containment reference '{@link anyfeatureadapted.RootElementType#getElement1 <em>Element1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element1</em>'.
	 * @see anyfeatureadapted.RootElementType#getElement1()
	 * @see #getRootElementType()
	 * @generated
	 */
	EReference getRootElementType_Element1();

	/**
	 * Returns the meta object for the containment reference '{@link anyfeatureadapted.RootElementType#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see anyfeatureadapted.RootElementType#getProperties()
	 * @see #getRootElementType()
	 * @generated
	 */
	EReference getRootElementType_Properties();

	/**
	 * Returns the meta object for class '{@link anyfeatureadapted.AnyGenericConstruct <em>Any Generic Construct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any Generic Construct</em>'.
	 * @see anyfeatureadapted.AnyGenericConstruct
	 * @generated
	 */
	EClass getAnyGenericConstruct();

	/**
	 * Returns the meta object for class '{@link anyfeatureadapted.AnyGenericElement <em>Any Generic Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any Generic Element</em>'.
	 * @see anyfeatureadapted.AnyGenericElement
	 * @generated
	 */
	EClass getAnyGenericElement();

	/**
	 * Returns the meta object for the attribute '{@link anyfeatureadapted.AnyGenericElement#getElemName <em>Elem Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elem Name</em>'.
	 * @see anyfeatureadapted.AnyGenericElement#getElemName()
	 * @see #getAnyGenericElement()
	 * @generated
	 */
	EAttribute getAnyGenericElement_ElemName();

	/**
	 * Returns the meta object for the containment reference list '{@link anyfeatureadapted.AnyGenericElement#getAnyGenericAttr <em>Any Generic Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Any Generic Attr</em>'.
	 * @see anyfeatureadapted.AnyGenericElement#getAnyGenericAttr()
	 * @see #getAnyGenericElement()
	 * @generated
	 */
	EReference getAnyGenericElement_AnyGenericAttr();

	/**
	 * Returns the meta object for the attribute '{@link anyfeatureadapted.AnyGenericElement#getElemValue <em>Elem Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elem Value</em>'.
	 * @see anyfeatureadapted.AnyGenericElement#getElemValue()
	 * @see #getAnyGenericElement()
	 * @generated
	 */
	EAttribute getAnyGenericElement_ElemValue();

	/**
	 * Returns the meta object for the containment reference list '{@link anyfeatureadapted.AnyGenericElement#getChildElem <em>Child Elem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Elem</em>'.
	 * @see anyfeatureadapted.AnyGenericElement#getChildElem()
	 * @see #getAnyGenericElement()
	 * @generated
	 */
	EReference getAnyGenericElement_ChildElem();

	/**
	 * Returns the meta object for class '{@link anyfeatureadapted.AnyGenericAttribute <em>Any Generic Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any Generic Attribute</em>'.
	 * @see anyfeatureadapted.AnyGenericAttribute
	 * @generated
	 */
	EClass getAnyGenericAttribute();

	/**
	 * Returns the meta object for the attribute '{@link anyfeatureadapted.AnyGenericAttribute#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see anyfeatureadapted.AnyGenericAttribute#getAttrName()
	 * @see #getAnyGenericAttribute()
	 * @generated
	 */
	EAttribute getAnyGenericAttribute_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link anyfeatureadapted.AnyGenericAttribute#getAttrValue <em>Attr Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Value</em>'.
	 * @see anyfeatureadapted.AnyGenericAttribute#getAttrValue()
	 * @see #getAnyGenericAttribute()
	 * @generated
	 */
	EAttribute getAnyGenericAttribute_AttrValue();

	/**
	 * Returns the meta object for class '{@link anyfeatureadapted.AnyGenericText <em>Any Generic Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any Generic Text</em>'.
	 * @see anyfeatureadapted.AnyGenericText
	 * @generated
	 */
	EClass getAnyGenericText();

	/**
	 * Returns the meta object for the attribute '{@link anyfeatureadapted.AnyGenericText#getTextValue <em>Text Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Value</em>'.
	 * @see anyfeatureadapted.AnyGenericText#getTextValue()
	 * @see #getAnyGenericText()
	 * @generated
	 */
	EAttribute getAnyGenericText_TextValue();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AnyfeatureadaptedFactory getAnyfeatureadaptedFactory();

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
		 * The meta object literal for the '{@link anyfeatureadapted.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see anyfeatureadapted.impl.DocumentRootImpl
		 * @see anyfeatureadapted.impl.AnyfeatureadaptedPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '{@link anyfeatureadapted.impl.Element1Impl <em>Element1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see anyfeatureadapted.impl.Element1Impl
		 * @see anyfeatureadapted.impl.AnyfeatureadaptedPackageImpl#getElement1()
		 * @generated
		 */
		EClass ELEMENT1 = eINSTANCE.getElement1();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT1__CITY = eINSTANCE.getElement1_City();

		/**
		 * The meta object literal for the '<em><b>Street</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT1__STREET = eINSTANCE.getElement1_Street();

		/**
		 * The meta object literal for the '{@link anyfeatureadapted.impl.PropertiesImpl <em>Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see anyfeatureadapted.impl.PropertiesImpl
		 * @see anyfeatureadapted.impl.AnyfeatureadaptedPackageImpl#getProperties()
		 * @generated
		 */
		EClass PROPERTIES = eINSTANCE.getProperties();

		/**
		 * The meta object literal for the '<em><b>Any Generic Elem</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTIES__ANY_GENERIC_ELEM = eINSTANCE.getProperties_AnyGenericElem();

		/**
		 * The meta object literal for the '{@link anyfeatureadapted.impl.RootElementTypeImpl <em>Root Element Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see anyfeatureadapted.impl.RootElementTypeImpl
		 * @see anyfeatureadapted.impl.AnyfeatureadaptedPackageImpl#getRootElementType()
		 * @generated
		 */
		EClass ROOT_ELEMENT_TYPE = eINSTANCE.getRootElementType();

		/**
		 * The meta object literal for the '<em><b>Element1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_ELEMENT_TYPE__ELEMENT1 = eINSTANCE.getRootElementType_Element1();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_ELEMENT_TYPE__PROPERTIES = eINSTANCE.getRootElementType_Properties();

		/**
		 * The meta object literal for the '{@link anyfeatureadapted.impl.AnyGenericConstructImpl <em>Any Generic Construct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see anyfeatureadapted.impl.AnyGenericConstructImpl
		 * @see anyfeatureadapted.impl.AnyfeatureadaptedPackageImpl#getAnyGenericConstruct()
		 * @generated
		 */
		EClass ANY_GENERIC_CONSTRUCT = eINSTANCE.getAnyGenericConstruct();

		/**
		 * The meta object literal for the '{@link anyfeatureadapted.impl.AnyGenericElementImpl <em>Any Generic Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see anyfeatureadapted.impl.AnyGenericElementImpl
		 * @see anyfeatureadapted.impl.AnyfeatureadaptedPackageImpl#getAnyGenericElement()
		 * @generated
		 */
		EClass ANY_GENERIC_ELEMENT = eINSTANCE.getAnyGenericElement();

		/**
		 * The meta object literal for the '<em><b>Elem Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANY_GENERIC_ELEMENT__ELEM_NAME = eINSTANCE.getAnyGenericElement_ElemName();

		/**
		 * The meta object literal for the '<em><b>Any Generic Attr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANY_GENERIC_ELEMENT__ANY_GENERIC_ATTR = eINSTANCE.getAnyGenericElement_AnyGenericAttr();

		/**
		 * The meta object literal for the '<em><b>Elem Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANY_GENERIC_ELEMENT__ELEM_VALUE = eINSTANCE.getAnyGenericElement_ElemValue();

		/**
		 * The meta object literal for the '<em><b>Child Elem</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANY_GENERIC_ELEMENT__CHILD_ELEM = eINSTANCE.getAnyGenericElement_ChildElem();

		/**
		 * The meta object literal for the '{@link anyfeatureadapted.impl.AnyGenericAttributeImpl <em>Any Generic Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see anyfeatureadapted.impl.AnyGenericAttributeImpl
		 * @see anyfeatureadapted.impl.AnyfeatureadaptedPackageImpl#getAnyGenericAttribute()
		 * @generated
		 */
		EClass ANY_GENERIC_ATTRIBUTE = eINSTANCE.getAnyGenericAttribute();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANY_GENERIC_ATTRIBUTE__ATTR_NAME = eINSTANCE.getAnyGenericAttribute_AttrName();

		/**
		 * The meta object literal for the '<em><b>Attr Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANY_GENERIC_ATTRIBUTE__ATTR_VALUE = eINSTANCE.getAnyGenericAttribute_AttrValue();

		/**
		 * The meta object literal for the '{@link anyfeatureadapted.impl.AnyGenericTextImpl <em>Any Generic Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see anyfeatureadapted.impl.AnyGenericTextImpl
		 * @see anyfeatureadapted.impl.AnyfeatureadaptedPackageImpl#getAnyGenericText()
		 * @generated
		 */
		EClass ANY_GENERIC_TEXT = eINSTANCE.getAnyGenericText();

		/**
		 * The meta object literal for the '<em><b>Text Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANY_GENERIC_TEXT__TEXT_VALUE = eINSTANCE.getAnyGenericText_TextValue();

	}

} //AnyfeatureadaptedPackage
