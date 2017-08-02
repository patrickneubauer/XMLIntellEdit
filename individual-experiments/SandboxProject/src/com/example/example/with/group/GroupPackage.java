/**
 */
package com.example.example.with.group;

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
 * @see com.example.example.with.group.GroupFactory
 * @model kind="package"
 * @generated
 */
public interface GroupPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "group";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://example.com/example-with-group";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "group";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GroupPackage eINSTANCE = com.example.example.with.group.impl.GroupPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.example.example.with.group.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.example.with.group.impl.DocumentRootImpl
	 * @see com.example.example.with.group.impl.GroupPackageImpl#getDocumentRoot()
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
	 * The meta object id for the '{@link com.example.example.with.group.impl.Element1Impl <em>Element1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.example.with.group.impl.Element1Impl
	 * @see com.example.example.with.group.impl.GroupPackageImpl#getElement1()
	 * @generated
	 */
	int ELEMENT1 = 1;

	/**
	 * The feature id for the '<em><b>Element1 Choice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT1__ELEMENT1_CHOICE = 0;

	/**
	 * The number of structural features of the '<em>Element1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT1_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Element1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.example.example.with.group.impl.Element2Impl <em>Element2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.example.with.group.impl.Element2Impl
	 * @see com.example.example.with.group.impl.GroupPackageImpl#getElement2()
	 * @generated
	 */
	int ELEMENT2 = 2;

	/**
	 * The feature id for the '<em><b>Model Group Element1</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT2__MODEL_GROUP_ELEMENT1 = 0;

	/**
	 * The feature id for the '<em><b>Model Group Element2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT2__MODEL_GROUP_ELEMENT2 = 1;

	/**
	 * The feature id for the '<em><b>Model Group Element3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT2__MODEL_GROUP_ELEMENT3 = 2;

	/**
	 * The number of structural features of the '<em>Element2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT2_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Element2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.example.example.with.group.impl.Element3Impl <em>Element3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.example.with.group.impl.Element3Impl
	 * @see com.example.example.with.group.impl.GroupPackageImpl#getElement3()
	 * @generated
	 */
	int ELEMENT3 = 3;

	/**
	 * The feature id for the '<em><b>Repeatable Element1</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT3__REPEATABLE_ELEMENT1 = 0;

	/**
	 * The feature id for the '<em><b>Repeatable Element2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT3__REPEATABLE_ELEMENT2 = 1;

	/**
	 * The feature id for the '<em><b>Repeatable Element3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT3__REPEATABLE_ELEMENT3 = 2;

	/**
	 * The number of structural features of the '<em>Element3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT3_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Element3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT3_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.example.example.with.group.impl.RootElementTypeImpl <em>Root Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.example.with.group.impl.RootElementTypeImpl
	 * @see com.example.example.with.group.impl.GroupPackageImpl#getRootElementType()
	 * @generated
	 */
	int ROOT_ELEMENT_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Element1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_ELEMENT_TYPE__ELEMENT1 = 0;

	/**
	 * The feature id for the '<em><b>Element2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_ELEMENT_TYPE__ELEMENT2 = 1;

	/**
	 * The feature id for the '<em><b>Element3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_ELEMENT_TYPE__ELEMENT3 = 2;

	/**
	 * The number of structural features of the '<em>Root Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_ELEMENT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Root Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_ELEMENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.example.example.with.group.impl.Element1ChoiceImpl <em>Element1 Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.example.with.group.impl.Element1ChoiceImpl
	 * @see com.example.example.with.group.impl.GroupPackageImpl#getElement1Choice()
	 * @generated
	 */
	int ELEMENT1_CHOICE = 5;

	/**
	 * The feature id for the '<em><b>Repeatable Element1</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT1_CHOICE__REPEATABLE_ELEMENT1 = 0;

	/**
	 * The feature id for the '<em><b>Repeatable Element2</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT1_CHOICE__REPEATABLE_ELEMENT2 = 1;

	/**
	 * The feature id for the '<em><b>Repeatable Element3</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT1_CHOICE__REPEATABLE_ELEMENT3 = 2;

	/**
	 * The number of structural features of the '<em>Element1 Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT1_CHOICE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Element1 Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT1_CHOICE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link com.example.example.with.group.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see com.example.example.with.group.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link com.example.example.with.group.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see com.example.example.with.group.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link com.example.example.with.group.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see com.example.example.with.group.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link com.example.example.with.group.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see com.example.example.with.group.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link com.example.example.with.group.DocumentRoot#getRootElement <em>Root Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root Element</em>'.
	 * @see com.example.example.with.group.DocumentRoot#getRootElement()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RootElement();

	/**
	 * Returns the meta object for class '{@link com.example.example.with.group.Element1 <em>Element1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element1</em>'.
	 * @see com.example.example.with.group.Element1
	 * @generated
	 */
	EClass getElement1();

	/**
	 * Returns the meta object for the containment reference '{@link com.example.example.with.group.Element1#getElement1Choice <em>Element1 Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element1 Choice</em>'.
	 * @see com.example.example.with.group.Element1#getElement1Choice()
	 * @see #getElement1()
	 * @generated
	 */
	EReference getElement1_Element1Choice();

	/**
	 * Returns the meta object for class '{@link com.example.example.with.group.Element2 <em>Element2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element2</em>'.
	 * @see com.example.example.with.group.Element2
	 * @generated
	 */
	EClass getElement2();

	/**
	 * Returns the meta object for the attribute list '{@link com.example.example.with.group.Element2#getModelGroupElement1 <em>Model Group Element1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Model Group Element1</em>'.
	 * @see com.example.example.with.group.Element2#getModelGroupElement1()
	 * @see #getElement2()
	 * @generated
	 */
	EAttribute getElement2_ModelGroupElement1();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.with.group.Element2#getModelGroupElement2 <em>Model Group Element2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Group Element2</em>'.
	 * @see com.example.example.with.group.Element2#getModelGroupElement2()
	 * @see #getElement2()
	 * @generated
	 */
	EAttribute getElement2_ModelGroupElement2();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.with.group.Element2#getModelGroupElement3 <em>Model Group Element3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Group Element3</em>'.
	 * @see com.example.example.with.group.Element2#getModelGroupElement3()
	 * @see #getElement2()
	 * @generated
	 */
	EAttribute getElement2_ModelGroupElement3();

	/**
	 * Returns the meta object for class '{@link com.example.example.with.group.Element3 <em>Element3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element3</em>'.
	 * @see com.example.example.with.group.Element3
	 * @generated
	 */
	EClass getElement3();

	/**
	 * Returns the meta object for the attribute list '{@link com.example.example.with.group.Element3#getRepeatableElement1 <em>Repeatable Element1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Repeatable Element1</em>'.
	 * @see com.example.example.with.group.Element3#getRepeatableElement1()
	 * @see #getElement3()
	 * @generated
	 */
	EAttribute getElement3_RepeatableElement1();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.with.group.Element3#getRepeatableElement2 <em>Repeatable Element2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeatable Element2</em>'.
	 * @see com.example.example.with.group.Element3#getRepeatableElement2()
	 * @see #getElement3()
	 * @generated
	 */
	EAttribute getElement3_RepeatableElement2();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.with.group.Element3#getRepeatableElement3 <em>Repeatable Element3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeatable Element3</em>'.
	 * @see com.example.example.with.group.Element3#getRepeatableElement3()
	 * @see #getElement3()
	 * @generated
	 */
	EAttribute getElement3_RepeatableElement3();

	/**
	 * Returns the meta object for class '{@link com.example.example.with.group.RootElementType <em>Root Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Element Type</em>'.
	 * @see com.example.example.with.group.RootElementType
	 * @generated
	 */
	EClass getRootElementType();

	/**
	 * Returns the meta object for the containment reference '{@link com.example.example.with.group.RootElementType#getElement1 <em>Element1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element1</em>'.
	 * @see com.example.example.with.group.RootElementType#getElement1()
	 * @see #getRootElementType()
	 * @generated
	 */
	EReference getRootElementType_Element1();

	/**
	 * Returns the meta object for the containment reference '{@link com.example.example.with.group.RootElementType#getElement2 <em>Element2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element2</em>'.
	 * @see com.example.example.with.group.RootElementType#getElement2()
	 * @see #getRootElementType()
	 * @generated
	 */
	EReference getRootElementType_Element2();

	/**
	 * Returns the meta object for the containment reference '{@link com.example.example.with.group.RootElementType#getElement3 <em>Element3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element3</em>'.
	 * @see com.example.example.with.group.RootElementType#getElement3()
	 * @see #getRootElementType()
	 * @generated
	 */
	EReference getRootElementType_Element3();

	/**
	 * Returns the meta object for class '{@link com.example.example.with.group.Element1Choice <em>Element1 Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element1 Choice</em>'.
	 * @see com.example.example.with.group.Element1Choice
	 * @generated
	 */
	EClass getElement1Choice();

	/**
	 * Returns the meta object for the attribute list '{@link com.example.example.with.group.Element1Choice#getRepeatableElement1 <em>Repeatable Element1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Repeatable Element1</em>'.
	 * @see com.example.example.with.group.Element1Choice#getRepeatableElement1()
	 * @see #getElement1Choice()
	 * @generated
	 */
	EAttribute getElement1Choice_RepeatableElement1();

	/**
	 * Returns the meta object for the attribute list '{@link com.example.example.with.group.Element1Choice#getRepeatableElement2 <em>Repeatable Element2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Repeatable Element2</em>'.
	 * @see com.example.example.with.group.Element1Choice#getRepeatableElement2()
	 * @see #getElement1Choice()
	 * @generated
	 */
	EAttribute getElement1Choice_RepeatableElement2();

	/**
	 * Returns the meta object for the attribute list '{@link com.example.example.with.group.Element1Choice#getRepeatableElement3 <em>Repeatable Element3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Repeatable Element3</em>'.
	 * @see com.example.example.with.group.Element1Choice#getRepeatableElement3()
	 * @see #getElement1Choice()
	 * @generated
	 */
	EAttribute getElement1Choice_RepeatableElement3();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GroupFactory getGroupFactory();

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
		 * The meta object literal for the '{@link com.example.example.with.group.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.example.with.group.impl.DocumentRootImpl
		 * @see com.example.example.with.group.impl.GroupPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '{@link com.example.example.with.group.impl.Element1Impl <em>Element1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.example.with.group.impl.Element1Impl
		 * @see com.example.example.with.group.impl.GroupPackageImpl#getElement1()
		 * @generated
		 */
		EClass ELEMENT1 = eINSTANCE.getElement1();

		/**
		 * The meta object literal for the '<em><b>Element1 Choice</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT1__ELEMENT1_CHOICE = eINSTANCE.getElement1_Element1Choice();

		/**
		 * The meta object literal for the '{@link com.example.example.with.group.impl.Element2Impl <em>Element2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.example.with.group.impl.Element2Impl
		 * @see com.example.example.with.group.impl.GroupPackageImpl#getElement2()
		 * @generated
		 */
		EClass ELEMENT2 = eINSTANCE.getElement2();

		/**
		 * The meta object literal for the '<em><b>Model Group Element1</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT2__MODEL_GROUP_ELEMENT1 = eINSTANCE.getElement2_ModelGroupElement1();

		/**
		 * The meta object literal for the '<em><b>Model Group Element2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT2__MODEL_GROUP_ELEMENT2 = eINSTANCE.getElement2_ModelGroupElement2();

		/**
		 * The meta object literal for the '<em><b>Model Group Element3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT2__MODEL_GROUP_ELEMENT3 = eINSTANCE.getElement2_ModelGroupElement3();

		/**
		 * The meta object literal for the '{@link com.example.example.with.group.impl.Element3Impl <em>Element3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.example.with.group.impl.Element3Impl
		 * @see com.example.example.with.group.impl.GroupPackageImpl#getElement3()
		 * @generated
		 */
		EClass ELEMENT3 = eINSTANCE.getElement3();

		/**
		 * The meta object literal for the '<em><b>Repeatable Element1</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT3__REPEATABLE_ELEMENT1 = eINSTANCE.getElement3_RepeatableElement1();

		/**
		 * The meta object literal for the '<em><b>Repeatable Element2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT3__REPEATABLE_ELEMENT2 = eINSTANCE.getElement3_RepeatableElement2();

		/**
		 * The meta object literal for the '<em><b>Repeatable Element3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT3__REPEATABLE_ELEMENT3 = eINSTANCE.getElement3_RepeatableElement3();

		/**
		 * The meta object literal for the '{@link com.example.example.with.group.impl.RootElementTypeImpl <em>Root Element Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.example.with.group.impl.RootElementTypeImpl
		 * @see com.example.example.with.group.impl.GroupPackageImpl#getRootElementType()
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
		 * The meta object literal for the '<em><b>Element2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_ELEMENT_TYPE__ELEMENT2 = eINSTANCE.getRootElementType_Element2();

		/**
		 * The meta object literal for the '<em><b>Element3</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_ELEMENT_TYPE__ELEMENT3 = eINSTANCE.getRootElementType_Element3();

		/**
		 * The meta object literal for the '{@link com.example.example.with.group.impl.Element1ChoiceImpl <em>Element1 Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.example.with.group.impl.Element1ChoiceImpl
		 * @see com.example.example.with.group.impl.GroupPackageImpl#getElement1Choice()
		 * @generated
		 */
		EClass ELEMENT1_CHOICE = eINSTANCE.getElement1Choice();

		/**
		 * The meta object literal for the '<em><b>Repeatable Element1</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT1_CHOICE__REPEATABLE_ELEMENT1 = eINSTANCE.getElement1Choice_RepeatableElement1();

		/**
		 * The meta object literal for the '<em><b>Repeatable Element2</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT1_CHOICE__REPEATABLE_ELEMENT2 = eINSTANCE.getElement1Choice_RepeatableElement2();

		/**
		 * The meta object literal for the '<em><b>Repeatable Element3</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT1_CHOICE__REPEATABLE_ELEMENT3 = eINSTANCE.getElement1Choice_RepeatableElement3();

	}

} //GroupPackage
