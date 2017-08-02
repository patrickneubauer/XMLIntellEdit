/**
 */
package isostdisots_29002_10ed_1techxmlschemacatalogueSimplified;

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
 * @see isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "isostdisots_29002_10ed_1techxmlschemacatalogueSimplified";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:cataloguesimplified";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "catalogues";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage eINSTANCE = isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackageImpl.init();

	/**
	 * The meta object id for the '{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.impl.CatalogueImpl <em>Catalogue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.impl.CatalogueImpl
	 * @see isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackageImpl#getCatalogue()
	 * @generated
	 */
	int CATALOGUE = 0;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE__ITEMS = 0;

	/**
	 * The number of structural features of the '<em>Catalogue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Catalogue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.impl.ItemImpl
	 * @see isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 1;

	/**
	 * The feature id for the '<em><b>Classification Refs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__CLASSIFICATION_REFS = 0;

	/**
	 * The feature id for the '<em><b>Class Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__CLASS_REF = 1;

	/**
	 * The feature id for the '<em><b>Created View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__CREATED_VIEW = 2;

	/**
	 * The feature id for the '<em><b>Data Specification Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__DATA_SPECIFICATION_REF = 3;

	/**
	 * The feature id for the '<em><b>Information Supplier Reference String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__INFORMATION_SUPPLIER_REFERENCE_STRING = 4;

	/**
	 * The feature id for the '<em><b>Is Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__IS_DEPENDENT = 5;

	/**
	 * The feature id for the '<em><b>Is Global Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__IS_GLOBAL_ID = 6;

	/**
	 * The feature id for the '<em><b>Is Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__IS_MODEL = 7;

	/**
	 * The feature id for the '<em><b>Is Proprietary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__IS_PROPRIETARY = 8;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__LOCAL_ID = 9;

	/**
	 * The feature id for the '<em><b>View Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__VIEW_OF = 10;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__REFERENCES = 11;

	/**
	 * The feature id for the '<em><b>Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__PROPERTY_VALUES = 12;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.impl.PropertyValueImpl <em>Property Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.impl.PropertyValueImpl
	 * @see isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackageImpl#getPropertyValue()
	 * @generated
	 */
	int PROPERTY_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Is Proprietary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE__IS_PROPRIETARY = 0;

	/**
	 * The feature id for the '<em><b>Property Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE__PROPERTY_REF = 1;

	/**
	 * The number of structural features of the '<em>Property Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Property Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.impl.ReferenceImpl
	 * @see isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 3;

	/**
	 * The feature id for the '<em><b>Organization Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__ORGANIZATION_CODE = 0;

	/**
	 * The feature id for the '<em><b>Organization Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__ORGANIZATION_REF = 1;

	/**
	 * The feature id for the '<em><b>Reference Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__REFERENCE_NUMBER = 2;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Catalogue <em>Catalogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalogue</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Catalogue
	 * @generated
	 */
	EClass getCatalogue();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Catalogue#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Catalogue#getItems()
	 * @see #getCatalogue()
	 * @generated
	 */
	EReference getCatalogue_Items();

	/**
	 * Returns the meta object for class '{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the attribute list '{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Item#getClassificationRefs <em>Classification Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Classification Refs</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Item#getClassificationRefs()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_ClassificationRefs();

	/**
	 * Returns the meta object for the attribute '{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Item#getClassRef <em>Class Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Ref</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Item#getClassRef()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_ClassRef();

	/**
	 * Returns the meta object for the attribute '{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Item#getCreatedView <em>Created View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created View</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Item#getCreatedView()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_CreatedView();

	/**
	 * Returns the meta object for the attribute '{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Item#getDataSpecificationRef <em>Data Specification Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Specification Ref</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Item#getDataSpecificationRef()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_DataSpecificationRef();

	/**
	 * Returns the meta object for the attribute '{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Item#getInformationSupplierReferenceString <em>Information Supplier Reference String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Information Supplier Reference String</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Item#getInformationSupplierReferenceString()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_InformationSupplierReferenceString();

	/**
	 * Returns the meta object for the attribute '{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Item#isIsDependent <em>Is Dependent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Dependent</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Item#isIsDependent()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_IsDependent();

	/**
	 * Returns the meta object for the attribute '{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Item#isIsGlobalId <em>Is Global Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Global Id</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Item#isIsGlobalId()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_IsGlobalId();

	/**
	 * Returns the meta object for the attribute '{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Item#isIsModel <em>Is Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Model</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Item#isIsModel()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_IsModel();

	/**
	 * Returns the meta object for the attribute '{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Item#isIsProprietary <em>Is Proprietary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Proprietary</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Item#isIsProprietary()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_IsProprietary();

	/**
	 * Returns the meta object for the attribute '{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Item#getLocalId <em>Local Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Id</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Item#getLocalId()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_LocalId();

	/**
	 * Returns the meta object for the reference '{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Item#getViewOf <em>View Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>View Of</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Item#getViewOf()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_ViewOf();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Item#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>References</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Item#getReferences()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_References();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Item#getPropertyValues <em>Property Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Item#getPropertyValues()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_PropertyValues();

	/**
	 * Returns the meta object for class '{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.PropertyValue <em>Property Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.PropertyValue
	 * @generated
	 */
	EClass getPropertyValue();

	/**
	 * Returns the meta object for the attribute '{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.PropertyValue#isIsProprietary <em>Is Proprietary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Proprietary</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.PropertyValue#isIsProprietary()
	 * @see #getPropertyValue()
	 * @generated
	 */
	EAttribute getPropertyValue_IsProprietary();

	/**
	 * Returns the meta object for the attribute '{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.PropertyValue#getPropertyRef <em>Property Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Ref</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.PropertyValue#getPropertyRef()
	 * @see #getPropertyValue()
	 * @generated
	 */
	EAttribute getPropertyValue_PropertyRef();

	/**
	 * Returns the meta object for class '{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the attribute '{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Reference#getOrganizationCode <em>Organization Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organization Code</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Reference#getOrganizationCode()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_OrganizationCode();

	/**
	 * Returns the meta object for the attribute '{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Reference#getOrganizationRef <em>Organization Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organization Ref</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Reference#getOrganizationRef()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_OrganizationRef();

	/**
	 * Returns the meta object for the attribute '{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Reference#getReferenceNumber <em>Reference Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Number</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Reference#getReferenceNumber()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_ReferenceNumber();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedFactory getIsostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedFactory();

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
		 * The meta object literal for the '{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.impl.CatalogueImpl <em>Catalogue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.impl.CatalogueImpl
		 * @see isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackageImpl#getCatalogue()
		 * @generated
		 */
		EClass CATALOGUE = eINSTANCE.getCatalogue();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOGUE__ITEMS = eINSTANCE.getCatalogue_Items();

		/**
		 * The meta object literal for the '{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.impl.ItemImpl
		 * @see isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Classification Refs</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__CLASSIFICATION_REFS = eINSTANCE.getItem_ClassificationRefs();

		/**
		 * The meta object literal for the '<em><b>Class Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__CLASS_REF = eINSTANCE.getItem_ClassRef();

		/**
		 * The meta object literal for the '<em><b>Created View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__CREATED_VIEW = eINSTANCE.getItem_CreatedView();

		/**
		 * The meta object literal for the '<em><b>Data Specification Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__DATA_SPECIFICATION_REF = eINSTANCE.getItem_DataSpecificationRef();

		/**
		 * The meta object literal for the '<em><b>Information Supplier Reference String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__INFORMATION_SUPPLIER_REFERENCE_STRING = eINSTANCE.getItem_InformationSupplierReferenceString();

		/**
		 * The meta object literal for the '<em><b>Is Dependent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__IS_DEPENDENT = eINSTANCE.getItem_IsDependent();

		/**
		 * The meta object literal for the '<em><b>Is Global Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__IS_GLOBAL_ID = eINSTANCE.getItem_IsGlobalId();

		/**
		 * The meta object literal for the '<em><b>Is Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__IS_MODEL = eINSTANCE.getItem_IsModel();

		/**
		 * The meta object literal for the '<em><b>Is Proprietary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__IS_PROPRIETARY = eINSTANCE.getItem_IsProprietary();

		/**
		 * The meta object literal for the '<em><b>Local Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__LOCAL_ID = eINSTANCE.getItem_LocalId();

		/**
		 * The meta object literal for the '<em><b>View Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__VIEW_OF = eINSTANCE.getItem_ViewOf();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__REFERENCES = eINSTANCE.getItem_References();

		/**
		 * The meta object literal for the '<em><b>Property Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__PROPERTY_VALUES = eINSTANCE.getItem_PropertyValues();

		/**
		 * The meta object literal for the '{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.impl.PropertyValueImpl <em>Property Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.impl.PropertyValueImpl
		 * @see isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackageImpl#getPropertyValue()
		 * @generated
		 */
		EClass PROPERTY_VALUE = eINSTANCE.getPropertyValue();

		/**
		 * The meta object literal for the '<em><b>Is Proprietary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_VALUE__IS_PROPRIETARY = eINSTANCE.getPropertyValue_IsProprietary();

		/**
		 * The meta object literal for the '<em><b>Property Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_VALUE__PROPERTY_REF = eINSTANCE.getPropertyValue_PropertyRef();

		/**
		 * The meta object literal for the '{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.impl.ReferenceImpl
		 * @see isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Organization Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__ORGANIZATION_CODE = eINSTANCE.getReference_OrganizationCode();

		/**
		 * The meta object literal for the '<em><b>Organization Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__ORGANIZATION_REF = eINSTANCE.getReference_OrganizationRef();

		/**
		 * The meta object literal for the '<em><b>Reference Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__REFERENCE_NUMBER = eINSTANCE.getReference_ReferenceNumber();

	}

} //Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage
