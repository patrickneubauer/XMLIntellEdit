ï»¿/**
 */
package caex;

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
 * @see caex.CaexFactory
 * @model kind="package"
 * @generated
 */
public interface CaexPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "caex";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://big.tuwien.ac.at/caex";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "caex";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CaexPackage eINSTANCE = caex.impl.CaexPackageImpl.init();

	/**
	 * The meta object id for the '{@link caex.impl.CAEXBasicObjectImpl <em>CAEX Basic Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see caex.impl.CAEXBasicObjectImpl
	 * @see caex.impl.CaexPackageImpl#getCAEXBasicObject()
	 * @generated
	 */
	int CAEX_BASIC_OBJECT = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_BASIC_OBJECT__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_BASIC_OBJECT__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_BASIC_OBJECT__REVISION = 2;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_BASIC_OBJECT__COPYRIGHT = 3;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_BASIC_OBJECT__ADDITIONAL_INFORMATION = 4;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_BASIC_OBJECT__CHANGE_MODE = 5;

	/**
	 * The number of structural features of the '<em>CAEX Basic Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_BASIC_OBJECT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>CAEX Basic Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_BASIC_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link caex.impl.AttributeNameMappingImpl <em>Attribute Name Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see caex.impl.AttributeNameMappingImpl
	 * @see caex.impl.CaexPackageImpl#getAttributeNameMapping()
	 * @generated
	 */
	int ATTRIBUTE_NAME_MAPPING = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NAME_MAPPING__DESCRIPTION = CAEX_BASIC_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NAME_MAPPING__VERSION = CAEX_BASIC_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NAME_MAPPING__REVISION = CAEX_BASIC_OBJECT__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NAME_MAPPING__COPYRIGHT = CAEX_BASIC_OBJECT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NAME_MAPPING__ADDITIONAL_INFORMATION = CAEX_BASIC_OBJECT__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NAME_MAPPING__CHANGE_MODE = CAEX_BASIC_OBJECT__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>Role Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NAME_MAPPING__ROLE_ATTRIBUTE_NAME = CAEX_BASIC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>System Unit Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NAME_MAPPING__SYSTEM_UNIT_ATTRIBUTE_NAME = CAEX_BASIC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute Name Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NAME_MAPPING_FEATURE_COUNT = CAEX_BASIC_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attribute Name Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NAME_MAPPING_OPERATION_COUNT = CAEX_BASIC_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link caex.impl.CAEXObjectImpl <em>CAEX Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see caex.impl.CAEXObjectImpl
	 * @see caex.impl.CaexPackageImpl#getCAEXObject()
	 * @generated
	 */
	int CAEX_OBJECT = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_OBJECT__DESCRIPTION = CAEX_BASIC_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_OBJECT__VERSION = CAEX_BASIC_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_OBJECT__REVISION = CAEX_BASIC_OBJECT__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_OBJECT__COPYRIGHT = CAEX_BASIC_OBJECT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_OBJECT__ADDITIONAL_INFORMATION = CAEX_BASIC_OBJECT__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_OBJECT__CHANGE_MODE = CAEX_BASIC_OBJECT__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_OBJECT__ID = CAEX_BASIC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_OBJECT__NAME = CAEX_BASIC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CAEX Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_OBJECT_FEATURE_COUNT = CAEX_BASIC_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>CAEX Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_OBJECT_OPERATION_COUNT = CAEX_BASIC_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link caex.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see caex.impl.AttributeImpl
	 * @see caex.impl.CaexPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DESCRIPTION = CAEX_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VERSION = CAEX_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__REVISION = CAEX_OBJECT__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__COPYRIGHT = CAEX_OBJECT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ADDITIONAL_INFORMATION = CAEX_OBJECT__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__CHANGE_MODE = CAEX_OBJECT__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ID = CAEX_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = CAEX_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Ref Semantic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__REF_SEMANTIC = CAEX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__CONSTRAINT = CAEX_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ATTRIBUTE = CAEX_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attribute Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ATTRIBUTE_DATA_TYPE = CAEX_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__UNIT = CAEX_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VALUE = CAEX_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DEFAULT_VALUE = CAEX_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = CAEX_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = CAEX_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link caex.impl.AttributeValueRequirementImpl <em>Attribute Value Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see caex.impl.AttributeValueRequirementImpl
	 * @see caex.impl.CaexPackageImpl#getAttributeValueRequirement()
	 * @generated
	 */
	int ATTRIBUTE_VALUE_REQUIREMENT = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_REQUIREMENT__DESCRIPTION = CAEX_BASIC_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_REQUIREMENT__VERSION = CAEX_BASIC_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_REQUIREMENT__REVISION = CAEX_BASIC_OBJECT__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_REQUIREMENT__COPYRIGHT = CAEX_BASIC_OBJECT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_REQUIREMENT__ADDITIONAL_INFORMATION = CAEX_BASIC_OBJECT__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_REQUIREMENT__CHANGE_MODE = CAEX_BASIC_OBJECT__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>Ordinal Scaled Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_REQUIREMENT__ORDINAL_SCALED_TYPE = CAEX_BASIC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nominal Scaled Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_REQUIREMENT__NOMINAL_SCALED_TYPE = CAEX_BASIC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unknown Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_REQUIREMENT__UNKNOWN_TYPE = CAEX_BASIC_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_REQUIREMENT__NAME = CAEX_BASIC_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Attribute Value Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_REQUIREMENT_FEATURE_COUNT = CAEX_BASIC_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Attribute Value Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_REQUIREMENT_OPERATION_COUNT = CAEX_BASIC_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link caex.impl.CAEXFileImpl <em>CAEX File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see caex.impl.CAEXFileImpl
	 * @see caex.impl.CaexPackageImpl#getCAEXFile()
	 * @generated
	 */
	int CAEX_FILE = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_FILE__DESCRIPTION = CAEX_BASIC_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_FILE__VERSION = CAEX_BASIC_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_FILE__REVISION = CAEX_BASIC_OBJECT__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_FILE__COPYRIGHT = CAEX_BASIC_OBJECT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_FILE__ADDITIONAL_INFORMATION = CAEX_BASIC_OBJECT__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_FILE__CHANGE_MODE = CAEX_BASIC_OBJECT__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_FILE__EXTERNAL_REFERENCE = CAEX_BASIC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Hierarchy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_FILE__INSTANCE_HIERARCHY = CAEX_BASIC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interface Class Lib</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_FILE__INTERFACE_CLASS_LIB = CAEX_BASIC_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Role Class Lib</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_FILE__ROLE_CLASS_LIB = CAEX_BASIC_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>System Unit Class Lib</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_FILE__SYSTEM_UNIT_CLASS_LIB = CAEX_BASIC_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_FILE__FILE_NAME = CAEX_BASIC_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Schema Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_FILE__SCHEMA_VERSION = CAEX_BASIC_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>CAEX File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_FILE_FEATURE_COUNT = CAEX_BASIC_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>CAEX File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_FILE_OPERATION_COUNT = CAEX_BASIC_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link caex.impl.CopyrightImpl <em>Copyright</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see caex.impl.CopyrightImpl
	 * @see caex.impl.CaexPackageImpl#getCopyright()
	 * @generated
	 */
	int COPYRIGHT = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPYRIGHT__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPYRIGHT__CHANGE_MODE = 1;

	/**
	 * The number of structural features of the '<em>Copyright</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPYRIGHT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Copyright</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPYRIGHT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link caex.impl.DescriptionImpl <em>Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see caex.impl.DescriptionImpl
	 * @see caex.impl.CaexPackageImpl#getDescription()
	 * @generated
	 */
	int DESCRIPTION = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__CHANGE_MODE = 1;

	/**
	 * The number of structural features of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link caex.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see caex.impl.DocumentRootImpl
	 * @see caex.impl.CaexPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 8;

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
	 * The feature id for the '<em><b>CAEX File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CAEX_FILE = 3;

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
	 * The meta object id for the '{@link caex.impl.InterfaceClassImpl <em>Interface Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see caex.impl.InterfaceClassImpl
	 * @see caex.impl.CaexPackageImpl#getInterfaceClass()
	 * @generated
	 */
	int INTERFACE_CLASS = 13;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS__DESCRIPTION = CAEX_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS__VERSION = CAEX_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS__REVISION = CAEX_OBJECT__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS__COPYRIGHT = CAEX_OBJECT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS__ADDITIONAL_INFORMATION = CAEX_OBJECT__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS__CHANGE_MODE = CAEX_OBJECT__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS__ID = CAEX_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS__NAME = CAEX_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS__ATTRIBUTE = CAEX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ref Base Class Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS__REF_BASE_CLASS_PATH = CAEX_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interface Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS_FEATURE_COUNT = CAEX_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Interface Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS_OPERATION_COUNT = CAEX_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link caex.impl.ExternalInterfaceImpl <em>External Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see caex.impl.ExternalInterfaceImpl
	 * @see caex.impl.CaexPackageImpl#getExternalInterface()
	 * @generated
	 */
	int EXTERNAL_INTERFACE = 9;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_INTERFACE__DESCRIPTION = INTERFACE_CLASS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_INTERFACE__VERSION = INTERFACE_CLASS__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_INTERFACE__REVISION = INTERFACE_CLASS__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_INTERFACE__COPYRIGHT = INTERFACE_CLASS__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_INTERFACE__ADDITIONAL_INFORMATION = INTERFACE_CLASS__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_INTERFACE__CHANGE_MODE = INTERFACE_CLASS__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_INTERFACE__ID = INTERFACE_CLASS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_INTERFACE__NAME = INTERFACE_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_INTERFACE__ATTRIBUTE = INTERFACE_CLASS__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Ref Base Class Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_INTERFACE__REF_BASE_CLASS_PATH = INTERFACE_CLASS__REF_BASE_CLASS_PATH;

	/**
	 * The number of structural features of the '<em>External Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_INTERFACE_FEATURE_COUNT = INTERFACE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>External Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_INTERFACE_OPERATION_COUNT = INTERFACE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link caex.impl.ExternalReferenceImpl <em>External Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see caex.impl.ExternalReferenceImpl
	 * @see caex.impl.CaexPackageImpl#getExternalReference()
	 * @generated
	 */
	int EXTERNAL_REFERENCE = 10;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__DESCRIPTION = CAEX_BASIC_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__VERSION = CAEX_BASIC_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__REVISION = CAEX_BASIC_OBJECT__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__COPYRIGHT = CAEX_BASIC_OBJECT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__ADDITIONAL_INFORMATION = CAEX_BASIC_OBJECT__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__CHANGE_MODE = CAEX_BASIC_OBJECT__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__ALIAS = CAEX_BASIC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__PATH = CAEX_BASIC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>External Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE_FEATURE_COUNT = CAEX_BASIC_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>External Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE_OPERATION_COUNT = CAEX_BASIC_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link caex.impl.InstanceHierarchyImpl <em>Instance Hierarchy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see caex.impl.InstanceHierarchyImpl
	 * @see caex.impl.CaexPackageImpl#getInstanceHierarchy()
	 * @generated
	 */
	int INSTANCE_HIERARCHY = 11;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_HIERARCHY__DESCRIPTION = CAEX_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_HIERARCHY__VERSION = CAEX_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_HIERARCHY__REVISION = CAEX_OBJECT__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_HIERARCHY__COPYRIGHT = CAEX_OBJECT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_HIERARCHY__ADDITIONAL_INFORMATION = CAEX_OBJECT__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_HIERARCHY__CHANGE_MODE = CAEX_OBJECT__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_HIERARCHY__ID = CAEX_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_HIERARCHY__NAME = CAEX_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Internal Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_HIERARCHY__INTERNAL_ELEMENT = CAEX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Instance Hierarchy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_HIERARCHY_FEATURE_COUNT = CAEX_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Instance Hierarchy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_HIERARCHY_OPERATION_COUNT = CAEX_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link caex.impl.InterfaceClassLibImpl <em>Interface Class Lib</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see caex.impl.InterfaceClassLibImpl
	 * @see caex.impl.CaexPackageImpl#getInterfaceClassLib()
	 * @generated
	 */
	int INTERFACE_CLASS_LIB = 12;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS_LIB__DESCRIPTION = CAEX_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS_LIB__VERSION = CAEX_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS_LIB__REVISION = CAEX_OBJECT__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS_LIB__COPYRIGHT = CAEX_OBJECT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS_LIB__ADDITIONAL_INFORMATION = CAEX_OBJECT__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS_LIB__CHANGE_MODE = CAEX_OBJECT__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS_LIB__ID = CAEX_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS_LIB__NAME = CAEX_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Interface Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS_LIB__INTERFACE_CLASS = CAEX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interface Class Lib</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS_LIB_FEATURE_COUNT = CAEX_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Interface Class Lib</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS_LIB_OPERATION_COUNT = CAEX_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link caex.impl.InterfaceFamilyImpl <em>Interface Family</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see caex.impl.InterfaceFamilyImpl
	 * @see caex.impl.CaexPackageImpl#getInterfaceFamily()
	 * @generated
	 */
	int INTERFACE_FAMILY = 14;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FAMILY__DESCRIPTION = INTERFACE_CLASS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FAMILY__VERSION = INTERFACE_CLASS__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FAMILY__REVISION = INTERFACE_CLASS__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FAMILY__COPYRIGHT = INTERFACE_CLASS__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FAMILY__ADDITIONAL_INFORMATION = INTERFACE_CLASS__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FAMILY__CHANGE_MODE = INTERFACE_CLASS__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FAMILY__ID = INTERFACE_CLASS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FAMILY__NAME = INTERFACE_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FAMILY__ATTRIBUTE = INTERFACE_CLASS__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Ref Base Class Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FAMILY__REF_BASE_CLASS_PATH = INTERFACE_CLASS__REF_BASE_CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Interface Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FAMILY__INTERFACE_CLASS = INTERFACE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interface Family</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FAMILY_FEATURE_COUNT = INTERFACE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Interface Family</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FAMILY_OPERATION_COUNT = INTERFACE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link caex.impl.InterfaceNameMappingImpl <em>Interface Name Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see caex.impl.InterfaceNameMappingImpl
	 * @see caex.impl.CaexPackageImpl#getInterfaceNameMapping()
	 * @generated
	 */
	int INTERFACE_NAME_MAPPING = 15;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_NAME_MAPPING__DESCRIPTION = CAEX_BASIC_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_NAME_MAPPING__VERSION = CAEX_BASIC_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_NAME_MAPPING__REVISION = CAEX_BASIC_OBJECT__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_NAME_MAPPING__COPYRIGHT = CAEX_BASIC_OBJECT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_NAME_MAPPING__ADDITIONAL_INFORMATION = CAEX_BASIC_OBJECT__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_NAME_MAPPING__CHANGE_MODE = CAEX_BASIC_OBJECT__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>Role Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_NAME_MAPPING__ROLE_INTERFACE_NAME = CAEX_BASIC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>System Unit Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_NAME_MAPPING__SYSTEM_UNIT_INTERFACE_NAME = CAEX_BASIC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interface Name Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_NAME_MAPPING_FEATURE_COUNT = CAEX_BASIC_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Interface Name Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_NAME_MAPPING_OPERATION_COUNT = CAEX_BASIC_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link caex.impl.SystemUnitClassImpl <em>System Unit Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see caex.impl.SystemUnitClassImpl
	 * @see caex.impl.CaexPackageImpl#getSystemUnitClass()
	 * @generated
	 */
	int SYSTEM_UNIT_CLASS = 29;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS__DESCRIPTION = CAEX_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS__VERSION = CAEX_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS__REVISION = CAEX_OBJECT__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS__COPYRIGHT = CAEX_OBJECT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS__ADDITIONAL_INFORMATION = CAEX_OBJECT__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS__CHANGE_MODE = CAEX_OBJECT__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS__ID = CAEX_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS__NAME = CAEX_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS__ATTRIBUTE = CAEX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>External Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS__EXTERNAL_INTERFACE = CAEX_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Internal Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS__INTERNAL_ELEMENT = CAEX_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Supported Role Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS__SUPPORTED_ROLE_CLASS = CAEX_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Internal Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS__INTERNAL_LINK = CAEX_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>System Unit Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS_FEATURE_COUNT = CAEX_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>System Unit Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS_OPERATION_COUNT = CAEX_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link caex.impl.InternalElementImpl <em>Internal Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see caex.impl.InternalElementImpl
	 * @see caex.impl.CaexPackageImpl#getInternalElement()
	 * @generated
	 */
	int INTERNAL_ELEMENT = 16;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT__DESCRIPTION = SYSTEM_UNIT_CLASS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT__VERSION = SYSTEM_UNIT_CLASS__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT__REVISION = SYSTEM_UNIT_CLASS__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT__COPYRIGHT = SYSTEM_UNIT_CLASS__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT__ADDITIONAL_INFORMATION = SYSTEM_UNIT_CLASS__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT__CHANGE_MODE = SYSTEM_UNIT_CLASS__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT__ID = SYSTEM_UNIT_CLASS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT__NAME = SYSTEM_UNIT_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT__ATTRIBUTE = SYSTEM_UNIT_CLASS__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>External Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT__EXTERNAL_INTERFACE = SYSTEM_UNIT_CLASS__EXTERNAL_INTERFACE;

	/**
	 * The feature id for the '<em><b>Internal Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT__INTERNAL_ELEMENT = SYSTEM_UNIT_CLASS__INTERNAL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Supported Role Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT__SUPPORTED_ROLE_CLASS = SYSTEM_UNIT_CLASS__SUPPORTED_ROLE_CLASS;

	/**
	 * The feature id for the '<em><b>Internal Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT__INTERNAL_LINK = SYSTEM_UNIT_CLASS__INTERNAL_LINK;

	/**
	 * The feature id for the '<em><b>Role Requirements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT__ROLE_REQUIREMENTS = SYSTEM_UNIT_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mapping Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT__MAPPING_OBJECT = SYSTEM_UNIT_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ref Base System Unit Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT__REF_BASE_SYSTEM_UNIT_PATH = SYSTEM_UNIT_CLASS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Internal Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT_FEATURE_COUNT = SYSTEM_UNIT_CLASS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Internal Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT_OPERATION_COUNT = SYSTEM_UNIT_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link caex.impl.InternalLinkImpl <em>Internal Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see caex.impl.InternalLinkImpl
	 * @see caex.impl.CaexPackageImpl#getInternalLink()
	 * @generated
	 */
	int INTERNAL_LINK = 17;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK__DESCRIPTION = CAEX_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK__VERSION = CAEX_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK__REVISION = CAEX_OBJECT__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK__COPYRIGHT = CAEX_OBJECT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK__ADDITIONAL_INFORMATION = CAEX_OBJECT__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK__CHANGE_MODE = CAEX_OBJECT__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK__ID = CAEX_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK__NAME = CAEX_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Ref Partner Side A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK__REF_PARTNER_SIDE_A = CAEX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ref Partner Side B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK__REF_PARTNER_SIDE_B = CAEX_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Internal Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK_FEATURE_COUNT = CAEX_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Internal Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK_OPERATION_COUNT = CAEX_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link caex.impl.MappingImpl <em>Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see caex.impl.MappingImpl
	 * @see caex.impl.CaexPackageImpl#getMapping()
	 * @generated
	 */
	int MAPPING = 18;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__DESCRIPTION = CAEX_BASIC_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__VERSION = CAEX_BASIC_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__REVISION = CAEX_BASIC_OBJECT__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__COPYRIGHT = CAEX_BASIC_OBJECT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__ADDITIONAL_INFORMATION = CAEX_BASIC_OBJECT__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__CHANGE_MODE = CAEX_BASIC_OBJECT__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>Attribute Name Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__ATTRIBUTE_NAME_MAPPING = CAEX_BASIC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interface Name Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__INTERFACE_NAME_MAPPING = CAEX_BASIC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FEATURE_COUNT = CAEX_BASIC_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_COUNT = CAEX_BASIC_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link caex.impl.NominalScaledImpl <em>Nominal Scaled</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see caex.impl.NominalScaledImpl
	 * @see caex.impl.CaexPackageImpl#getNominalScaled()
	 * @generated
	 */
	int NOMINAL_SCALED = 19;

	/**
	 * The feature id for the '<em><b>Required Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMINAL_SCALED__REQUIRED_VALUE = 0;

	/**
	 * The number of structural features of the '<em>Nominal Scaled</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMINAL_SCALED_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Nominal Scaled</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMINAL_SCALED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link caex.impl.OrdinalScaledImpl <em>Ordinal Scaled</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see caex.impl.OrdinalScaledImpl
	 * @see caex.impl.CaexPackageImpl#getOrdinalScaled()
	 * @generated
	 */
	int ORDINAL_SCALED = 20;

	/**
	 * The feature id for the '<em><b>Required Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_SCALED__REQUIRED_MAX_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Required Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_SCALED__REQUIRED_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Required Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_SCALED__REQUIRED_MIN_VALUE = 2;

	/**
	 * The number of structural features of the '<em>Ordinal Scaled</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_SCALED_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Ordinal Scaled</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_SCALED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link caex.impl.RefSemanticImpl <em>Ref Semantic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see caex.impl.RefSemanticImpl
	 * @see caex.impl.CaexPackageImpl#getRefSemantic()
	 * @generated
	 */
	int REF_SEMANTIC = 21;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_SEMANTIC__DESCRIPTION = CAEX_BASIC_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_SEMANTIC__VERSION = CAEX_BASIC_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_SEMANTIC__REVISION = CAEX_BASIC_OBJECT__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_SEMANTIC__COPYRIGHT = CAEX_BASIC_OBJECT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_SEMANTIC__ADDITIONAL_INFORMATION = CAEX_BASIC_OBJECT__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_SEMANTIC__CHANGE_MODE = CAEX_BASIC_OBJECT__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>Corresponding Attribute Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_SEMANTIC__CORRESPONDING_ATTRIBUTE_PATH = CAEX_BASIC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ref Semantic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_SEMANTIC_FEATURE_COUNT = CAEX_BASIC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ref Semantic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_SEMANTIC_OPERATION_COUNT = CAEX_BASIC_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link caex.impl.RevisionImpl <em>Revision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see caex.impl.RevisionImpl
	 * @see caex.impl.CaexPackageImpl#getRevision()
	 * @generated
	 */
	int REVISION = 22;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__DESCRIPTION = CAEX_BASIC_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__VERSION = CAEX_BASIC_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__REVISION = CAEX_BASIC_OBJECT__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__COPYRIGHT = CAEX_BASIC_OBJECT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__ADDITIONAL_INFORMATION = CAEX_BASIC_OBJECT__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__CHANGE_MODE = CAEX_BASIC_OBJECT__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>Revision Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__REVISION_DATE = CAEX_BASIC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Old Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__OLD_VERSION = CAEX_BASIC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>New Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__NEW_VERSION = CAEX_BASIC_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Author Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__AUTHOR_NAME = CAEX_BASIC_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__COMMENT = CAEX_BASIC_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Revision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION_FEATURE_COUNT = CAEX_BASIC_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Revision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION_OPERATION_COUNT = CAEX_BASIC_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link caex.impl.RoleClassLibImpl <em>Role Class Lib</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see caex.impl.RoleClassLibImpl
	 * @see caex.impl.CaexPackageImpl#getRoleClassLib()
	 * @generated
	 */
	int ROLE_CLASS_LIB = 23;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS_LIB__DESCRIPTION = CAEX_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS_LIB__VERSION = CAEX_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS_LIB__REVISION = CAEX_OBJECT__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS_LIB__COPYRIGHT = CAEX_OBJECT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS_LIB__ADDITIONAL_INFORMATION = CAEX_OBJECT__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS_LIB__CHANGE_MODE = CAEX_OBJECT__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS_LIB__ID = CAEX_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS_LIB__NAME = CAEX_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Role Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS_LIB__ROLE_CLASS = CAEX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Role Class Lib</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS_LIB_FEATURE_COUNT = CAEX_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Role Class Lib</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS_LIB_OPERATION_COUNT = CAEX_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link caex.impl.RoleClassImpl <em>Role Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see caex.impl.RoleClassImpl
	 * @see caex.impl.CaexPackageImpl#getRoleClass()
	 * @generated
	 */
	int ROLE_CLASS = 24;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS__DESCRIPTION = CAEX_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS__VERSION = CAEX_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS__REVISION = CAEX_OBJECT__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS__COPYRIGHT = CAEX_OBJECT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS__ADDITIONAL_INFORMATION = CAEX_OBJECT__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS__CHANGE_MODE = CAEX_OBJECT__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS__ID = CAEX_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS__NAME = CAEX_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS__ATTRIBUTE = CAEX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>External Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS__EXTERNAL_INTERFACE = CAEX_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ref Base Class Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS__REF_BASE_CLASS_PATH = CAEX_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Role Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS_FEATURE_COUNT = CAEX_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Role Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS_OPERATION_COUNT = CAEX_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link caex.impl.RoleFamilyImpl <em>Role Family</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see caex.impl.RoleFamilyImpl
	 * @see caex.impl.CaexPackageImpl#getRoleFamily()
	 * @generated
	 */
	int ROLE_FAMILY = 25;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FAMILY__DESCRIPTION = ROLE_CLASS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FAMILY__VERSION = ROLE_CLASS__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FAMILY__REVISION = ROLE_CLASS__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FAMILY__COPYRIGHT = ROLE_CLASS__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FAMILY__ADDITIONAL_INFORMATION = ROLE_CLASS__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FAMILY__CHANGE_MODE = ROLE_CLASS__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FAMILY__ID = ROLE_CLASS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FAMILY__NAME = ROLE_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FAMILY__ATTRIBUTE = ROLE_CLASS__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>External Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FAMILY__EXTERNAL_INTERFACE = ROLE_CLASS__EXTERNAL_INTERFACE;

	/**
	 * The feature id for the '<em><b>Ref Base Class Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FAMILY__REF_BASE_CLASS_PATH = ROLE_CLASS__REF_BASE_CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Role Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FAMILY__ROLE_CLASS = ROLE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Role Family</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FAMILY_FEATURE_COUNT = ROLE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Role Family</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FAMILY_OPERATION_COUNT = ROLE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link caex.impl.RoleRequirementsImpl <em>Role Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see caex.impl.RoleRequirementsImpl
	 * @see caex.impl.CaexPackageImpl#getRoleRequirements()
	 * @generated
	 */
	int ROLE_REQUIREMENTS = 26;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIREMENTS__DESCRIPTION = CAEX_BASIC_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIREMENTS__VERSION = CAEX_BASIC_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIREMENTS__REVISION = CAEX_BASIC_OBJECT__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIREMENTS__COPYRIGHT = CAEX_BASIC_OBJECT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIREMENTS__ADDITIONAL_INFORMATION = CAEX_BASIC_OBJECT__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIREMENTS__CHANGE_MODE = CAEX_BASIC_OBJECT__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIREMENTS__ATTRIBUTE = CAEX_BASIC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>External Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIREMENTS__EXTERNAL_INTERFACE = CAEX_BASIC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ref Base Role Class Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIREMENTS__REF_BASE_ROLE_CLASS_PATH = CAEX_BASIC_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Role Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIREMENTS_FEATURE_COUNT = CAEX_BASIC_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Role Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIREMENTS_OPERATION_COUNT = CAEX_BASIC_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link caex.impl.SupportedRoleClassImpl <em>Supported Role Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see caex.impl.SupportedRoleClassImpl
	 * @see caex.impl.CaexPackageImpl#getSupportedRoleClass()
	 * @generated
	 */
	int SUPPORTED_ROLE_CLASS = 27;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_ROLE_CLASS__DESCRIPTION = CAEX_BASIC_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_ROLE_CLASS__VERSION = CAEX_BASIC_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_ROLE_CLASS__REVISION = CAEX_BASIC_OBJECT__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_ROLE_CLASS__COPYRIGHT = CAEX_BASIC_OBJECT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_ROLE_CLASS__ADDITIONAL_INFORMATION = CAEX_BASIC_OBJECT__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_ROLE_CLASS__CHANGE_MODE = CAEX_BASIC_OBJECT__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>Mapping Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_ROLE_CLASS__MAPPING_OBJECT = CAEX_BASIC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ref Role Class Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_ROLE_CLASS__REF_ROLE_CLASS_PATH = CAEX_BASIC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Supported Role Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_ROLE_CLASS_FEATURE_COUNT = CAEX_BASIC_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Supported Role Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_ROLE_CLASS_OPERATION_COUNT = CAEX_BASIC_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link caex.impl.SystemUnitClassLibImpl <em>System Unit Class Lib</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see caex.impl.SystemUnitClassLibImpl
	 * @see caex.impl.CaexPackageImpl#getSystemUnitClassLib()
	 * @generated
	 */
	int SYSTEM_UNIT_CLASS_LIB = 28;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS_LIB__DESCRIPTION = CAEX_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS_LIB__VERSION = CAEX_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS_LIB__REVISION = CAEX_OBJECT__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS_LIB__COPYRIGHT = CAEX_OBJECT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS_LIB__ADDITIONAL_INFORMATION = CAEX_OBJECT__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS_LIB__CHANGE_MODE = CAEX_OBJECT__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS_LIB__ID = CAEX_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS_LIB__NAME = CAEX_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>System Unit Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS_LIB__SYSTEM_UNIT_CLASS = CAEX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>System Unit Class Lib</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS_LIB_FEATURE_COUNT = CAEX_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>System Unit Class Lib</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS_LIB_OPERATION_COUNT = CAEX_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link caex.impl.SystemUnitFamilyImpl <em>System Unit Family</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see caex.impl.SystemUnitFamilyImpl
	 * @see caex.impl.CaexPackageImpl#getSystemUnitFamily()
	 * @generated
	 */
	int SYSTEM_UNIT_FAMILY = 30;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_FAMILY__DESCRIPTION = SYSTEM_UNIT_CLASS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_FAMILY__VERSION = SYSTEM_UNIT_CLASS__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_FAMILY__REVISION = SYSTEM_UNIT_CLASS__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_FAMILY__COPYRIGHT = SYSTEM_UNIT_CLASS__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_FAMILY__ADDITIONAL_INFORMATION = SYSTEM_UNIT_CLASS__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_FAMILY__CHANGE_MODE = SYSTEM_UNIT_CLASS__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_FAMILY__ID = SYSTEM_UNIT_CLASS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_FAMILY__NAME = SYSTEM_UNIT_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_FAMILY__ATTRIBUTE = SYSTEM_UNIT_CLASS__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>External Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_FAMILY__EXTERNAL_INTERFACE = SYSTEM_UNIT_CLASS__EXTERNAL_INTERFACE;

	/**
	 * The feature id for the '<em><b>Internal Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_FAMILY__INTERNAL_ELEMENT = SYSTEM_UNIT_CLASS__INTERNAL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Supported Role Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_FAMILY__SUPPORTED_ROLE_CLASS = SYSTEM_UNIT_CLASS__SUPPORTED_ROLE_CLASS;

	/**
	 * The feature id for the '<em><b>Internal Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_FAMILY__INTERNAL_LINK = SYSTEM_UNIT_CLASS__INTERNAL_LINK;

	/**
	 * The feature id for the '<em><b>System Unit Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_FAMILY__SYSTEM_UNIT_CLASS = SYSTEM_UNIT_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ref Base Class Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_FAMILY__REF_BASE_CLASS_PATH = SYSTEM_UNIT_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>System Unit Family</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_FAMILY_FEATURE_COUNT = SYSTEM_UNIT_CLASS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>System Unit Family</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_FAMILY_OPERATION_COUNT = SYSTEM_UNIT_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link caex.impl.UnknownTypeImpl <em>Unknown Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see caex.impl.UnknownTypeImpl
	 * @see caex.impl.CaexPackageImpl#getUnknownType()
	 * @generated
	 */
	int UNKNOWN_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_TYPE__REQUIREMENTS = 0;

	/**
	 * The number of structural features of the '<em>Unknown Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Unknown Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link caex.impl.VersionImpl <em>Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see caex.impl.VersionImpl
	 * @see caex.impl.CaexPackageImpl#getVersion()
	 * @generated
	 */
	int VERSION = 32;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__CHANGE_MODE = 1;

	/**
	 * The number of structural features of the '<em>Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link caex.ChangeMode <em>Change Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see caex.ChangeMode
	 * @see caex.impl.CaexPackageImpl#getChangeMode()
	 * @generated
	 */
	int CHANGE_MODE = 33;

	/**
	 * The meta object id for the '<em>Attribute Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see caex.impl.CaexPackageImpl#getAttributeDataType()
	 * @generated
	 */
	int ATTRIBUTE_DATA_TYPE = 34;

	/**
	 * The meta object id for the '<em>Change Mode Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @see caex.impl.CaexPackageImpl#getChangeModeObject()
	 * @generated
	 */
	int CHANGE_MODE_OBJECT = 35;


	/**
	 * Returns the meta object for class '{@link caex.AttributeNameMapping <em>Attribute Name Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Name Mapping</em>'.
	 * @see caex.AttributeNameMapping
	 * @generated
	 */
	EClass getAttributeNameMapping();

	/**
	 * Returns the meta object for the attribute '{@link caex.AttributeNameMapping#getRoleAttributeName <em>Role Attribute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Attribute Name</em>'.
	 * @see caex.AttributeNameMapping#getRoleAttributeName()
	 * @see #getAttributeNameMapping()
	 * @generated
	 */
	EAttribute getAttributeNameMapping_RoleAttributeName();

	/**
	 * Returns the meta object for the attribute '{@link caex.AttributeNameMapping#getSystemUnitAttributeName <em>System Unit Attribute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Unit Attribute Name</em>'.
	 * @see caex.AttributeNameMapping#getSystemUnitAttributeName()
	 * @see #getAttributeNameMapping()
	 * @generated
	 */
	EAttribute getAttributeNameMapping_SystemUnitAttributeName();

	/**
	 * Returns the meta object for class '{@link caex.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see caex.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link caex.Attribute#getRefSemantic <em>Ref Semantic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ref Semantic</em>'.
	 * @see caex.Attribute#getRefSemantic()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_RefSemantic();

	/**
	 * Returns the meta object for the containment reference list '{@link caex.Attribute#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraint</em>'.
	 * @see caex.Attribute#getConstraint()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Constraint();

	/**
	 * Returns the meta object for the containment reference list '{@link caex.Attribute#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see caex.Attribute#getAttribute()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link caex.Attribute#getAttributeDataType <em>Attribute Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Data Type</em>'.
	 * @see caex.Attribute#getAttributeDataType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_AttributeDataType();

	/**
	 * Returns the meta object for the attribute '{@link caex.Attribute#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see caex.Attribute#getUnit()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Unit();

	/**
	 * Returns the meta object for the attribute '{@link caex.Attribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see caex.Attribute#getValue()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Value();

	/**
	 * Returns the meta object for the attribute '{@link caex.Attribute#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see caex.Attribute#getDefaultValue()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_DefaultValue();

	/**
	 * Returns the meta object for class '{@link caex.AttributeValueRequirement <em>Attribute Value Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Value Requirement</em>'.
	 * @see caex.AttributeValueRequirement
	 * @generated
	 */
	EClass getAttributeValueRequirement();

	/**
	 * Returns the meta object for the containment reference '{@link caex.AttributeValueRequirement#getOrdinalScaledType <em>Ordinal Scaled Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ordinal Scaled Type</em>'.
	 * @see caex.AttributeValueRequirement#getOrdinalScaledType()
	 * @see #getAttributeValueRequirement()
	 * @generated
	 */
	EReference getAttributeValueRequirement_OrdinalScaledType();

	/**
	 * Returns the meta object for the containment reference '{@link caex.AttributeValueRequirement#getNominalScaledType <em>Nominal Scaled Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nominal Scaled Type</em>'.
	 * @see caex.AttributeValueRequirement#getNominalScaledType()
	 * @see #getAttributeValueRequirement()
	 * @generated
	 */
	EReference getAttributeValueRequirement_NominalScaledType();

	/**
	 * Returns the meta object for the containment reference '{@link caex.AttributeValueRequirement#getUnknownType <em>Unknown Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unknown Type</em>'.
	 * @see caex.AttributeValueRequirement#getUnknownType()
	 * @see #getAttributeValueRequirement()
	 * @generated
	 */
	EReference getAttributeValueRequirement_UnknownType();

	/**
	 * Returns the meta object for the attribute '{@link caex.AttributeValueRequirement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see caex.AttributeValueRequirement#getName()
	 * @see #getAttributeValueRequirement()
	 * @generated
	 */
	EAttribute getAttributeValueRequirement_Name();

	/**
	 * Returns the meta object for class '{@link caex.CAEXBasicObject <em>CAEX Basic Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CAEX Basic Object</em>'.
	 * @see caex.CAEXBasicObject
	 * @generated
	 */
	EClass getCAEXBasicObject();

	/**
	 * Returns the meta object for the containment reference '{@link caex.CAEXBasicObject#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see caex.CAEXBasicObject#getDescription()
	 * @see #getCAEXBasicObject()
	 * @generated
	 */
	EReference getCAEXBasicObject_Description();

	/**
	 * Returns the meta object for the containment reference '{@link caex.CAEXBasicObject#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Version</em>'.
	 * @see caex.CAEXBasicObject#getVersion()
	 * @see #getCAEXBasicObject()
	 * @generated
	 */
	EReference getCAEXBasicObject_Version();

	/**
	 * Returns the meta object for the containment reference list '{@link caex.CAEXBasicObject#getRevision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Revision</em>'.
	 * @see caex.CAEXBasicObject#getRevision()
	 * @see #getCAEXBasicObject()
	 * @generated
	 */
	EReference getCAEXBasicObject_Revision();

	/**
	 * Returns the meta object for the containment reference '{@link caex.CAEXBasicObject#getCopyright <em>Copyright</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Copyright</em>'.
	 * @see caex.CAEXBasicObject#getCopyright()
	 * @see #getCAEXBasicObject()
	 * @generated
	 */
	EReference getCAEXBasicObject_Copyright();

	/**
	 * Returns the meta object for the containment reference list '{@link caex.CAEXBasicObject#getAdditionalInformation <em>Additional Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Additional Information</em>'.
	 * @see caex.CAEXBasicObject#getAdditionalInformation()
	 * @see #getCAEXBasicObject()
	 * @generated
	 */
	EReference getCAEXBasicObject_AdditionalInformation();

	/**
	 * Returns the meta object for the attribute '{@link caex.CAEXBasicObject#getChangeMode <em>Change Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Mode</em>'.
	 * @see caex.CAEXBasicObject#getChangeMode()
	 * @see #getCAEXBasicObject()
	 * @generated
	 */
	EAttribute getCAEXBasicObject_ChangeMode();

	/**
	 * Returns the meta object for class '{@link caex.CAEXFile <em>CAEX File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CAEX File</em>'.
	 * @see caex.CAEXFile
	 * @generated
	 */
	EClass getCAEXFile();

	/**
	 * Returns the meta object for the containment reference list '{@link caex.CAEXFile#getExternalReference <em>External Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External Reference</em>'.
	 * @see caex.CAEXFile#getExternalReference()
	 * @see #getCAEXFile()
	 * @generated
	 */
	EReference getCAEXFile_ExternalReference();

	/**
	 * Returns the meta object for the containment reference list '{@link caex.CAEXFile#getInstanceHierarchy <em>Instance Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instance Hierarchy</em>'.
	 * @see caex.CAEXFile#getInstanceHierarchy()
	 * @see #getCAEXFile()
	 * @generated
	 */
	EReference getCAEXFile_InstanceHierarchy();

	/**
	 * Returns the meta object for the containment reference list '{@link caex.CAEXFile#getInterfaceClassLib <em>Interface Class Lib</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface Class Lib</em>'.
	 * @see caex.CAEXFile#getInterfaceClassLib()
	 * @see #getCAEXFile()
	 * @generated
	 */
	EReference getCAEXFile_InterfaceClassLib();

	/**
	 * Returns the meta object for the containment reference list '{@link caex.CAEXFile#getRoleClassLib <em>Role Class Lib</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role Class Lib</em>'.
	 * @see caex.CAEXFile#getRoleClassLib()
	 * @see #getCAEXFile()
	 * @generated
	 */
	EReference getCAEXFile_RoleClassLib();

	/**
	 * Returns the meta object for the containment reference list '{@link caex.CAEXFile#getSystemUnitClassLib <em>System Unit Class Lib</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System Unit Class Lib</em>'.
	 * @see caex.CAEXFile#getSystemUnitClassLib()
	 * @see #getCAEXFile()
	 * @generated
	 */
	EReference getCAEXFile_SystemUnitClassLib();

	/**
	 * Returns the meta object for the attribute '{@link caex.CAEXFile#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see caex.CAEXFile#getFileName()
	 * @see #getCAEXFile()
	 * @generated
	 */
	EAttribute getCAEXFile_FileName();

	/**
	 * Returns the meta object for the attribute '{@link caex.CAEXFile#getSchemaVersion <em>Schema Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Version</em>'.
	 * @see caex.CAEXFile#getSchemaVersion()
	 * @see #getCAEXFile()
	 * @generated
	 */
	EAttribute getCAEXFile_SchemaVersion();

	/**
	 * Returns the meta object for class '{@link caex.CAEXObject <em>CAEX Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CAEX Object</em>'.
	 * @see caex.CAEXObject
	 * @generated
	 */
	EClass getCAEXObject();

	/**
	 * Returns the meta object for the attribute '{@link caex.CAEXObject#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see caex.CAEXObject#getID()
	 * @see #getCAEXObject()
	 * @generated
	 */
	EAttribute getCAEXObject_ID();

	/**
	 * Returns the meta object for the attribute '{@link caex.CAEXObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see caex.CAEXObject#getName()
	 * @see #getCAEXObject()
	 * @generated
	 */
	EAttribute getCAEXObject_Name();

	/**
	 * Returns the meta object for class '{@link caex.Copyright <em>Copyright</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Copyright</em>'.
	 * @see caex.Copyright
	 * @generated
	 */
	EClass getCopyright();

	/**
	 * Returns the meta object for the attribute '{@link caex.Copyright#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see caex.Copyright#getValue()
	 * @see #getCopyright()
	 * @generated
	 */
	EAttribute getCopyright_Value();

	/**
	 * Returns the meta object for the attribute '{@link caex.Copyright#getChangeMode <em>Change Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Mode</em>'.
	 * @see caex.Copyright#getChangeMode()
	 * @see #getCopyright()
	 * @generated
	 */
	EAttribute getCopyright_ChangeMode();

	/**
	 * Returns the meta object for class '{@link caex.Description <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description</em>'.
	 * @see caex.Description
	 * @generated
	 */
	EClass getDescription();

	/**
	 * Returns the meta object for the attribute '{@link caex.Description#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see caex.Description#getValue()
	 * @see #getDescription()
	 * @generated
	 */
	EAttribute getDescription_Value();

	/**
	 * Returns the meta object for the attribute '{@link caex.Description#getChangeMode <em>Change Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Mode</em>'.
	 * @see caex.Description#getChangeMode()
	 * @see #getDescription()
	 * @generated
	 */
	EAttribute getDescription_ChangeMode();

	/**
	 * Returns the meta object for class '{@link caex.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see caex.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link caex.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see caex.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link caex.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see caex.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link caex.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see caex.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link caex.DocumentRoot#getCAEXFile <em>CAEX File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>CAEX File</em>'.
	 * @see caex.DocumentRoot#getCAEXFile()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CAEXFile();

	/**
	 * Returns the meta object for class '{@link caex.ExternalInterface <em>External Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Interface</em>'.
	 * @see caex.ExternalInterface
	 * @generated
	 */
	EClass getExternalInterface();

	/**
	 * Returns the meta object for class '{@link caex.ExternalReference <em>External Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Reference</em>'.
	 * @see caex.ExternalReference
	 * @generated
	 */
	EClass getExternalReference();

	/**
	 * Returns the meta object for the attribute '{@link caex.ExternalReference#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see caex.ExternalReference#getAlias()
	 * @see #getExternalReference()
	 * @generated
	 */
	EAttribute getExternalReference_Alias();

	/**
	 * Returns the meta object for the attribute '{@link caex.ExternalReference#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see caex.ExternalReference#getPath()
	 * @see #getExternalReference()
	 * @generated
	 */
	EAttribute getExternalReference_Path();

	/**
	 * Returns the meta object for class '{@link caex.InstanceHierarchy <em>Instance Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Hierarchy</em>'.
	 * @see caex.InstanceHierarchy
	 * @generated
	 */
	EClass getInstanceHierarchy();

	/**
	 * Returns the meta object for the containment reference list '{@link caex.InstanceHierarchy#getInternalElement <em>Internal Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Internal Element</em>'.
	 * @see caex.InstanceHierarchy#getInternalElement()
	 * @see #getInstanceHierarchy()
	 * @generated
	 */
	EReference getInstanceHierarchy_InternalElement();

	/**
	 * Returns the meta object for class '{@link caex.InterfaceClassLib <em>Interface Class Lib</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Class Lib</em>'.
	 * @see caex.InterfaceClassLib
	 * @generated
	 */
	EClass getInterfaceClassLib();

	/**
	 * Returns the meta object for the containment reference list '{@link caex.InterfaceClassLib#getInterfaceClass <em>Interface Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface Class</em>'.
	 * @see caex.InterfaceClassLib#getInterfaceClass()
	 * @see #getInterfaceClassLib()
	 * @generated
	 */
	EReference getInterfaceClassLib_InterfaceClass();

	/**
	 * Returns the meta object for class '{@link caex.InterfaceClass <em>Interface Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Class</em>'.
	 * @see caex.InterfaceClass
	 * @generated
	 */
	EClass getInterfaceClass();

	/**
	 * Returns the meta object for the containment reference list '{@link caex.InterfaceClass#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see caex.InterfaceClass#getAttribute()
	 * @see #getInterfaceClass()
	 * @generated
	 */
	EReference getInterfaceClass_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link caex.InterfaceClass#getRefBaseClassPath <em>Ref Base Class Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Base Class Path</em>'.
	 * @see caex.InterfaceClass#getRefBaseClassPath()
	 * @see #getInterfaceClass()
	 * @generated
	 */
	EAttribute getInterfaceClass_RefBaseClassPath();

	/**
	 * Returns the meta object for class '{@link caex.InterfaceFamily <em>Interface Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Family</em>'.
	 * @see caex.InterfaceFamily
	 * @generated
	 */
	EClass getInterfaceFamily();

	/**
	 * Returns the meta object for the containment reference list '{@link caex.InterfaceFamily#getInterfaceClass <em>Interface Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface Class</em>'.
	 * @see caex.InterfaceFamily#getInterfaceClass()
	 * @see #getInterfaceFamily()
	 * @generated
	 */
	EReference getInterfaceFamily_InterfaceClass();

	/**
	 * Returns the meta object for class '{@link caex.InterfaceNameMapping <em>Interface Name Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Name Mapping</em>'.
	 * @see caex.InterfaceNameMapping
	 * @generated
	 */
	EClass getInterfaceNameMapping();

	/**
	 * Returns the meta object for the attribute '{@link caex.InterfaceNameMapping#getRoleInterfaceName <em>Role Interface Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Interface Name</em>'.
	 * @see caex.InterfaceNameMapping#getRoleInterfaceName()
	 * @see #getInterfaceNameMapping()
	 * @generated
	 */
	EAttribute getInterfaceNameMapping_RoleInterfaceName();

	/**
	 * Returns the meta object for the attribute '{@link caex.InterfaceNameMapping#getSystemUnitInterfaceName <em>System Unit Interface Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Unit Interface Name</em>'.
	 * @see caex.InterfaceNameMapping#getSystemUnitInterfaceName()
	 * @see #getInterfaceNameMapping()
	 * @generated
	 */
	EAttribute getInterfaceNameMapping_SystemUnitInterfaceName();

	/**
	 * Returns the meta object for class '{@link caex.InternalElement <em>Internal Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Element</em>'.
	 * @see caex.InternalElement
	 * @generated
	 */
	EClass getInternalElement();

	/**
	 * Returns the meta object for the containment reference '{@link caex.InternalElement#getRoleRequirements <em>Role Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role Requirements</em>'.
	 * @see caex.InternalElement#getRoleRequirements()
	 * @see #getInternalElement()
	 * @generated
	 */
	EReference getInternalElement_RoleRequirements();

	/**
	 * Returns the meta object for the containment reference '{@link caex.InternalElement#getMappingObject <em>Mapping Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapping Object</em>'.
	 * @see caex.InternalElement#getMappingObject()
	 * @see #getInternalElement()
	 * @generated
	 */
	EReference getInternalElement_MappingObject();

	/**
	 * Returns the meta object for the attribute '{@link caex.InternalElement#getRefBaseSystemUnitPath <em>Ref Base System Unit Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Base System Unit Path</em>'.
	 * @see caex.InternalElement#getRefBaseSystemUnitPath()
	 * @see #getInternalElement()
	 * @generated
	 */
	EAttribute getInternalElement_RefBaseSystemUnitPath();

	/**
	 * Returns the meta object for class '{@link caex.InternalLink <em>Internal Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Link</em>'.
	 * @see caex.InternalLink
	 * @generated
	 */
	EClass getInternalLink();

	/**
	 * Returns the meta object for the attribute '{@link caex.InternalLink#getRefPartnerSideA <em>Ref Partner Side A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Partner Side A</em>'.
	 * @see caex.InternalLink#getRefPartnerSideA()
	 * @see #getInternalLink()
	 * @generated
	 */
	EAttribute getInternalLink_RefPartnerSideA();

	/**
	 * Returns the meta object for the attribute '{@link caex.InternalLink#getRefPartnerSideB <em>Ref Partner Side B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Partner Side B</em>'.
	 * @see caex.InternalLink#getRefPartnerSideB()
	 * @see #getInternalLink()
	 * @generated
	 */
	EAttribute getInternalLink_RefPartnerSideB();

	/**
	 * Returns the meta object for class '{@link caex.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping</em>'.
	 * @see caex.Mapping
	 * @generated
	 */
	EClass getMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link caex.Mapping#getAttributeNameMapping <em>Attribute Name Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Name Mapping</em>'.
	 * @see caex.Mapping#getAttributeNameMapping()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_AttributeNameMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link caex.Mapping#getInterfaceNameMapping <em>Interface Name Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface Name Mapping</em>'.
	 * @see caex.Mapping#getInterfaceNameMapping()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_InterfaceNameMapping();

	/**
	 * Returns the meta object for class '{@link caex.NominalScaled <em>Nominal Scaled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nominal Scaled</em>'.
	 * @see caex.NominalScaled
	 * @generated
	 */
	EClass getNominalScaled();

	/**
	 * Returns the meta object for the attribute '{@link caex.NominalScaled#getRequiredValue <em>Required Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Value</em>'.
	 * @see caex.NominalScaled#getRequiredValue()
	 * @see #getNominalScaled()
	 * @generated
	 */
	EAttribute getNominalScaled_RequiredValue();

	/**
	 * Returns the meta object for class '{@link caex.OrdinalScaled <em>Ordinal Scaled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordinal Scaled</em>'.
	 * @see caex.OrdinalScaled
	 * @generated
	 */
	EClass getOrdinalScaled();

	/**
	 * Returns the meta object for the attribute '{@link caex.OrdinalScaled#getRequiredMaxValue <em>Required Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Max Value</em>'.
	 * @see caex.OrdinalScaled#getRequiredMaxValue()
	 * @see #getOrdinalScaled()
	 * @generated
	 */
	EAttribute getOrdinalScaled_RequiredMaxValue();

	/**
	 * Returns the meta object for the attribute '{@link caex.OrdinalScaled#getRequiredValue <em>Required Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Value</em>'.
	 * @see caex.OrdinalScaled#getRequiredValue()
	 * @see #getOrdinalScaled()
	 * @generated
	 */
	EAttribute getOrdinalScaled_RequiredValue();

	/**
	 * Returns the meta object for the attribute '{@link caex.OrdinalScaled#getRequiredMinValue <em>Required Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Min Value</em>'.
	 * @see caex.OrdinalScaled#getRequiredMinValue()
	 * @see #getOrdinalScaled()
	 * @generated
	 */
	EAttribute getOrdinalScaled_RequiredMinValue();

	/**
	 * Returns the meta object for class '{@link caex.RefSemantic <em>Ref Semantic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref Semantic</em>'.
	 * @see caex.RefSemantic
	 * @generated
	 */
	EClass getRefSemantic();

	/**
	 * Returns the meta object for the attribute '{@link caex.RefSemantic#getCorrespondingAttributePath <em>Corresponding Attribute Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Corresponding Attribute Path</em>'.
	 * @see caex.RefSemantic#getCorrespondingAttributePath()
	 * @see #getRefSemantic()
	 * @generated
	 */
	EAttribute getRefSemantic_CorrespondingAttributePath();

	/**
	 * Returns the meta object for class '{@link caex.Revision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Revision</em>'.
	 * @see caex.Revision
	 * @generated
	 */
	EClass getRevision();

	/**
	 * Returns the meta object for the attribute '{@link caex.Revision#getRevisionDate <em>Revision Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision Date</em>'.
	 * @see caex.Revision#getRevisionDate()
	 * @see #getRevision()
	 * @generated
	 */
	EAttribute getRevision_RevisionDate();

	/**
	 * Returns the meta object for the attribute '{@link caex.Revision#getOldVersion <em>Old Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old Version</em>'.
	 * @see caex.Revision#getOldVersion()
	 * @see #getRevision()
	 * @generated
	 */
	EAttribute getRevision_OldVersion();

	/**
	 * Returns the meta object for the attribute '{@link caex.Revision#getNewVersion <em>New Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Version</em>'.
	 * @see caex.Revision#getNewVersion()
	 * @see #getRevision()
	 * @generated
	 */
	EAttribute getRevision_NewVersion();

	/**
	 * Returns the meta object for the attribute '{@link caex.Revision#getAuthorName <em>Author Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author Name</em>'.
	 * @see caex.Revision#getAuthorName()
	 * @see #getRevision()
	 * @generated
	 */
	EAttribute getRevision_AuthorName();

	/**
	 * Returns the meta object for the attribute '{@link caex.Revision#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see caex.Revision#getComment()
	 * @see #getRevision()
	 * @generated
	 */
	EAttribute getRevision_Comment();

	/**
	 * Returns the meta object for class '{@link caex.RoleClassLib <em>Role Class Lib</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Class Lib</em>'.
	 * @see caex.RoleClassLib
	 * @generated
	 */
	EClass getRoleClassLib();

	/**
	 * Returns the meta object for the containment reference list '{@link caex.RoleClassLib#getRoleClass <em>Role Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role Class</em>'.
	 * @see caex.RoleClassLib#getRoleClass()
	 * @see #getRoleClassLib()
	 * @generated
	 */
	EReference getRoleClassLib_RoleClass();

	/**
	 * Returns the meta object for class '{@link caex.RoleClass <em>Role Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Class</em>'.
	 * @see caex.RoleClass
	 * @generated
	 */
	EClass getRoleClass();

	/**
	 * Returns the meta object for the containment reference list '{@link caex.RoleClass#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see caex.RoleClass#getAttribute()
	 * @see #getRoleClass()
	 * @generated
	 */
	EReference getRoleClass_Attribute();

	/**
	 * Returns the meta object for the containment reference list '{@link caex.RoleClass#getExternalInterface <em>External Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External Interface</em>'.
	 * @see caex.RoleClass#getExternalInterface()
	 * @see #getRoleClass()
	 * @generated
	 */
	EReference getRoleClass_ExternalInterface();

	/**
	 * Returns the meta object for the attribute '{@link caex.RoleClass#getRefBaseClassPath <em>Ref Base Class Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Base Class Path</em>'.
	 * @see caex.RoleClass#getRefBaseClassPath()
	 * @see #getRoleClass()
	 * @generated
	 */
	EAttribute getRoleClass_RefBaseClassPath();

	/**
	 * Returns the meta object for class '{@link caex.RoleFamily <em>Role Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Family</em>'.
	 * @see caex.RoleFamily
	 * @generated
	 */
	EClass getRoleFamily();

	/**
	 * Returns the meta object for the containment reference list '{@link caex.RoleFamily#getRoleClass <em>Role Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role Class</em>'.
	 * @see caex.RoleFamily#getRoleClass()
	 * @see #getRoleFamily()
	 * @generated
	 */
	EReference getRoleFamily_RoleClass();

	/**
	 * Returns the meta object for class '{@link caex.RoleRequirements <em>Role Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Requirements</em>'.
	 * @see caex.RoleRequirements
	 * @generated
	 */
	EClass getRoleRequirements();

	/**
	 * Returns the meta object for the containment reference list '{@link caex.RoleRequirements#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see caex.RoleRequirements#getAttribute()
	 * @see #getRoleRequirements()
	 * @generated
	 */
	EReference getRoleRequirements_Attribute();

	/**
	 * Returns the meta object for the containment reference list '{@link caex.RoleRequirements#getExternalInterface <em>External Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External Interface</em>'.
	 * @see caex.RoleRequirements#getExternalInterface()
	 * @see #getRoleRequirements()
	 * @generated
	 */
	EReference getRoleRequirements_ExternalInterface();

	/**
	 * Returns the meta object for the attribute '{@link caex.RoleRequirements#getRefBaseRoleClassPath <em>Ref Base Role Class Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Base Role Class Path</em>'.
	 * @see caex.RoleRequirements#getRefBaseRoleClassPath()
	 * @see #getRoleRequirements()
	 * @generated
	 */
	EAttribute getRoleRequirements_RefBaseRoleClassPath();

	/**
	 * Returns the meta object for class '{@link caex.SupportedRoleClass <em>Supported Role Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supported Role Class</em>'.
	 * @see caex.SupportedRoleClass
	 * @generated
	 */
	EClass getSupportedRoleClass();

	/**
	 * Returns the meta object for the containment reference '{@link caex.SupportedRoleClass#getMappingObject <em>Mapping Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapping Object</em>'.
	 * @see caex.SupportedRoleClass#getMappingObject()
	 * @see #getSupportedRoleClass()
	 * @generated
	 */
	EReference getSupportedRoleClass_MappingObject();

	/**
	 * Returns the meta object for the attribute '{@link caex.SupportedRoleClass#getRefRoleClassPath <em>Ref Role Class Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Role Class Path</em>'.
	 * @see caex.SupportedRoleClass#getRefRoleClassPath()
	 * @see #getSupportedRoleClass()
	 * @generated
	 */
	EAttribute getSupportedRoleClass_RefRoleClassPath();

	/**
	 * Returns the meta object for class '{@link caex.SystemUnitClassLib <em>System Unit Class Lib</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Unit Class Lib</em>'.
	 * @see caex.SystemUnitClassLib
	 * @generated
	 */
	EClass getSystemUnitClassLib();

	/**
	 * Returns the meta object for the containment reference list '{@link caex.SystemUnitClassLib#getSystemUnitClass <em>System Unit Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System Unit Class</em>'.
	 * @see caex.SystemUnitClassLib#getSystemUnitClass()
	 * @see #getSystemUnitClassLib()
	 * @generated
	 */
	EReference getSystemUnitClassLib_SystemUnitClass();

	/**
	 * Returns the meta object for class '{@link caex.SystemUnitClass <em>System Unit Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Unit Class</em>'.
	 * @see caex.SystemUnitClass
	 * @generated
	 */
	EClass getSystemUnitClass();

	/**
	 * Returns the meta object for the containment reference list '{@link caex.SystemUnitClass#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see caex.SystemUnitClass#getAttribute()
	 * @see #getSystemUnitClass()
	 * @generated
	 */
	EReference getSystemUnitClass_Attribute();

	/**
	 * Returns the meta object for the containment reference list '{@link caex.SystemUnitClass#getExternalInterface <em>External Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External Interface</em>'.
	 * @see caex.SystemUnitClass#getExternalInterface()
	 * @see #getSystemUnitClass()
	 * @generated
	 */
	EReference getSystemUnitClass_ExternalInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link caex.SystemUnitClass#getInternalElement <em>Internal Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Internal Element</em>'.
	 * @see caex.SystemUnitClass#getInternalElement()
	 * @see #getSystemUnitClass()
	 * @generated
	 */
	EReference getSystemUnitClass_InternalElement();

	/**
	 * Returns the meta object for the containment reference list '{@link caex.SystemUnitClass#getSupportedRoleClass <em>Supported Role Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Supported Role Class</em>'.
	 * @see caex.SystemUnitClass#getSupportedRoleClass()
	 * @see #getSystemUnitClass()
	 * @generated
	 */
	EReference getSystemUnitClass_SupportedRoleClass();

	/**
	 * Returns the meta object for the containment reference list '{@link caex.SystemUnitClass#getInternalLink <em>Internal Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Internal Link</em>'.
	 * @see caex.SystemUnitClass#getInternalLink()
	 * @see #getSystemUnitClass()
	 * @generated
	 */
	EReference getSystemUnitClass_InternalLink();

	/**
	 * Returns the meta object for class '{@link caex.SystemUnitFamily <em>System Unit Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Unit Family</em>'.
	 * @see caex.SystemUnitFamily
	 * @generated
	 */
	EClass getSystemUnitFamily();

	/**
	 * Returns the meta object for the containment reference list '{@link caex.SystemUnitFamily#getSystemUnitClass <em>System Unit Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System Unit Class</em>'.
	 * @see caex.SystemUnitFamily#getSystemUnitClass()
	 * @see #getSystemUnitFamily()
	 * @generated
	 */
	EReference getSystemUnitFamily_SystemUnitClass();

	/**
	 * Returns the meta object for the attribute '{@link caex.SystemUnitFamily#getRefBaseClassPath <em>Ref Base Class Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Base Class Path</em>'.
	 * @see caex.SystemUnitFamily#getRefBaseClassPath()
	 * @see #getSystemUnitFamily()
	 * @generated
	 */
	EAttribute getSystemUnitFamily_RefBaseClassPath();

	/**
	 * Returns the meta object for class '{@link caex.UnknownType <em>Unknown Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unknown Type</em>'.
	 * @see caex.UnknownType
	 * @generated
	 */
	EClass getUnknownType();

	/**
	 * Returns the meta object for the attribute '{@link caex.UnknownType#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requirements</em>'.
	 * @see caex.UnknownType#getRequirements()
	 * @see #getUnknownType()
	 * @generated
	 */
	EAttribute getUnknownType_Requirements();

	/**
	 * Returns the meta object for class '{@link caex.Version <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version</em>'.
	 * @see caex.Version
	 * @generated
	 */
	EClass getVersion();

	/**
	 * Returns the meta object for the attribute '{@link caex.Version#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see caex.Version#getValue()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Value();

	/**
	 * Returns the meta object for the attribute '{@link caex.Version#getChangeMode <em>Change Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Mode</em>'.
	 * @see caex.Version#getChangeMode()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_ChangeMode();

	/**
	 * Returns the meta object for enum '{@link caex.ChangeMode <em>Change Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Change Mode</em>'.
	 * @see caex.ChangeMode
	 * @generated
	 */
	EEnum getChangeMode();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Attribute Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Attribute Data Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getAttributeDataType();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.Enumerator <em>Change Mode Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Change Mode Object</em>'.
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @model instanceClass="org.eclipse.emf.common.util.Enumerator"
	 * @generated
	 */
	EDataType getChangeModeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CaexFactory getCaexFactory();

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
		 * The meta object literal for the '{@link caex.impl.AttributeNameMappingImpl <em>Attribute Name Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see caex.impl.AttributeNameMappingImpl
		 * @see caex.impl.CaexPackageImpl#getAttributeNameMapping()
		 * @generated
		 */
		EClass ATTRIBUTE_NAME_MAPPING = eINSTANCE.getAttributeNameMapping();

		/**
		 * The meta object literal for the '<em><b>Role Attribute Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_NAME_MAPPING__ROLE_ATTRIBUTE_NAME = eINSTANCE.getAttributeNameMapping_RoleAttributeName();

		/**
		 * The meta object literal for the '<em><b>System Unit Attribute Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_NAME_MAPPING__SYSTEM_UNIT_ATTRIBUTE_NAME = eINSTANCE.getAttributeNameMapping_SystemUnitAttributeName();

		/**
		 * The meta object literal for the '{@link caex.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see caex.impl.AttributeImpl
		 * @see caex.impl.CaexPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Ref Semantic</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__REF_SEMANTIC = eINSTANCE.getAttribute_RefSemantic();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__CONSTRAINT = eINSTANCE.getAttribute_Constraint();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__ATTRIBUTE = eINSTANCE.getAttribute_Attribute();

		/**
		 * The meta object literal for the '<em><b>Attribute Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__ATTRIBUTE_DATA_TYPE = eINSTANCE.getAttribute_AttributeDataType();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__UNIT = eINSTANCE.getAttribute_Unit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__VALUE = eINSTANCE.getAttribute_Value();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__DEFAULT_VALUE = eINSTANCE.getAttribute_DefaultValue();

		/**
		 * The meta object literal for the '{@link caex.impl.AttributeValueRequirementImpl <em>Attribute Value Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see caex.impl.AttributeValueRequirementImpl
		 * @see caex.impl.CaexPackageImpl#getAttributeValueRequirement()
		 * @generated
		 */
		EClass ATTRIBUTE_VALUE_REQUIREMENT = eINSTANCE.getAttributeValueRequirement();

		/**
		 * The meta object literal for the '<em><b>Ordinal Scaled Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_REQUIREMENT__ORDINAL_SCALED_TYPE = eINSTANCE.getAttributeValueRequirement_OrdinalScaledType();

		/**
		 * The meta object literal for the '<em><b>Nominal Scaled Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_REQUIREMENT__NOMINAL_SCALED_TYPE = eINSTANCE.getAttributeValueRequirement_NominalScaledType();

		/**
		 * The meta object literal for the '<em><b>Unknown Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_REQUIREMENT__UNKNOWN_TYPE = eINSTANCE.getAttributeValueRequirement_UnknownType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUE_REQUIREMENT__NAME = eINSTANCE.getAttributeValueRequirement_Name();

		/**
		 * The meta object literal for the '{@link caex.impl.CAEXBasicObjectImpl <em>CAEX Basic Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see caex.impl.CAEXBasicObjectImpl
		 * @see caex.impl.CaexPackageImpl#getCAEXBasicObject()
		 * @generated
		 */
		EClass CAEX_BASIC_OBJECT = eINSTANCE.getCAEXBasicObject();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAEX_BASIC_OBJECT__DESCRIPTION = eINSTANCE.getCAEXBasicObject_Description();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAEX_BASIC_OBJECT__VERSION = eINSTANCE.getCAEXBasicObject_Version();

		/**
		 * The meta object literal for the '<em><b>Revision</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAEX_BASIC_OBJECT__REVISION = eINSTANCE.getCAEXBasicObject_Revision();

		/**
		 * The meta object literal for the '<em><b>Copyright</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAEX_BASIC_OBJECT__COPYRIGHT = eINSTANCE.getCAEXBasicObject_Copyright();

		/**
		 * The meta object literal for the '<em><b>Additional Information</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAEX_BASIC_OBJECT__ADDITIONAL_INFORMATION = eINSTANCE.getCAEXBasicObject_AdditionalInformation();

		/**
		 * The meta object literal for the '<em><b>Change Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAEX_BASIC_OBJECT__CHANGE_MODE = eINSTANCE.getCAEXBasicObject_ChangeMode();

		/**
		 * The meta object literal for the '{@link caex.impl.CAEXFileImpl <em>CAEX File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see caex.impl.CAEXFileImpl
		 * @see caex.impl.CaexPackageImpl#getCAEXFile()
		 * @generated
		 */
		EClass CAEX_FILE = eINSTANCE.getCAEXFile();

		/**
		 * The meta object literal for the '<em><b>External Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAEX_FILE__EXTERNAL_REFERENCE = eINSTANCE.getCAEXFile_ExternalReference();

		/**
		 * The meta object literal for the '<em><b>Instance Hierarchy</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAEX_FILE__INSTANCE_HIERARCHY = eINSTANCE.getCAEXFile_InstanceHierarchy();

		/**
		 * The meta object literal for the '<em><b>Interface Class Lib</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAEX_FILE__INTERFACE_CLASS_LIB = eINSTANCE.getCAEXFile_InterfaceClassLib();

		/**
		 * The meta object literal for the '<em><b>Role Class Lib</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAEX_FILE__ROLE_CLASS_LIB = eINSTANCE.getCAEXFile_RoleClassLib();

		/**
		 * The meta object literal for the '<em><b>System Unit Class Lib</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAEX_FILE__SYSTEM_UNIT_CLASS_LIB = eINSTANCE.getCAEXFile_SystemUnitClassLib();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAEX_FILE__FILE_NAME = eINSTANCE.getCAEXFile_FileName();

		/**
		 * The meta object literal for the '<em><b>Schema Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAEX_FILE__SCHEMA_VERSION = eINSTANCE.getCAEXFile_SchemaVersion();

		/**
		 * The meta object literal for the '{@link caex.impl.CAEXObjectImpl <em>CAEX Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see caex.impl.CAEXObjectImpl
		 * @see caex.impl.CaexPackageImpl#getCAEXObject()
		 * @generated
		 */
		EClass CAEX_OBJECT = eINSTANCE.getCAEXObject();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAEX_OBJECT__ID = eINSTANCE.getCAEXObject_ID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAEX_OBJECT__NAME = eINSTANCE.getCAEXObject_Name();

		/**
		 * The meta object literal for the '{@link caex.impl.CopyrightImpl <em>Copyright</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see caex.impl.CopyrightImpl
		 * @see caex.impl.CaexPackageImpl#getCopyright()
		 * @generated
		 */
		EClass COPYRIGHT = eINSTANCE.getCopyright();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COPYRIGHT__VALUE = eINSTANCE.getCopyright_Value();

		/**
		 * The meta object literal for the '<em><b>Change Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COPYRIGHT__CHANGE_MODE = eINSTANCE.getCopyright_ChangeMode();

		/**
		 * The meta object literal for the '{@link caex.impl.DescriptionImpl <em>Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see caex.impl.DescriptionImpl
		 * @see caex.impl.CaexPackageImpl#getDescription()
		 * @generated
		 */
		EClass DESCRIPTION = eINSTANCE.getDescription();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION__VALUE = eINSTANCE.getDescription_Value();

		/**
		 * The meta object literal for the '<em><b>Change Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION__CHANGE_MODE = eINSTANCE.getDescription_ChangeMode();

		/**
		 * The meta object literal for the '{@link caex.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see caex.impl.DocumentRootImpl
		 * @see caex.impl.CaexPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>CAEX File</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CAEX_FILE = eINSTANCE.getDocumentRoot_CAEXFile();

		/**
		 * The meta object literal for the '{@link caex.impl.ExternalInterfaceImpl <em>External Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see caex.impl.ExternalInterfaceImpl
		 * @see caex.impl.CaexPackageImpl#getExternalInterface()
		 * @generated
		 */
		EClass EXTERNAL_INTERFACE = eINSTANCE.getExternalInterface();

		/**
		 * The meta object literal for the '{@link caex.impl.ExternalReferenceImpl <em>External Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see caex.impl.ExternalReferenceImpl
		 * @see caex.impl.CaexPackageImpl#getExternalReference()
		 * @generated
		 */
		EClass EXTERNAL_REFERENCE = eINSTANCE.getExternalReference();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_REFERENCE__ALIAS = eINSTANCE.getExternalReference_Alias();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_REFERENCE__PATH = eINSTANCE.getExternalReference_Path();

		/**
		 * The meta object literal for the '{@link caex.impl.InstanceHierarchyImpl <em>Instance Hierarchy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see caex.impl.InstanceHierarchyImpl
		 * @see caex.impl.CaexPackageImpl#getInstanceHierarchy()
		 * @generated
		 */
		EClass INSTANCE_HIERARCHY = eINSTANCE.getInstanceHierarchy();

		/**
		 * The meta object literal for the '<em><b>Internal Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_HIERARCHY__INTERNAL_ELEMENT = eINSTANCE.getInstanceHierarchy_InternalElement();

		/**
		 * The meta object literal for the '{@link caex.impl.InterfaceClassLibImpl <em>Interface Class Lib</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see caex.impl.InterfaceClassLibImpl
		 * @see caex.impl.CaexPackageImpl#getInterfaceClassLib()
		 * @generated
		 */
		EClass INTERFACE_CLASS_LIB = eINSTANCE.getInterfaceClassLib();

		/**
		 * The meta object literal for the '<em><b>Interface Class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_CLASS_LIB__INTERFACE_CLASS = eINSTANCE.getInterfaceClassLib_InterfaceClass();

		/**
		 * The meta object literal for the '{@link caex.impl.InterfaceClassImpl <em>Interface Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see caex.impl.InterfaceClassImpl
		 * @see caex.impl.CaexPackageImpl#getInterfaceClass()
		 * @generated
		 */
		EClass INTERFACE_CLASS = eINSTANCE.getInterfaceClass();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_CLASS__ATTRIBUTE = eINSTANCE.getInterfaceClass_Attribute();

		/**
		 * The meta object literal for the '<em><b>Ref Base Class Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_CLASS__REF_BASE_CLASS_PATH = eINSTANCE.getInterfaceClass_RefBaseClassPath();

		/**
		 * The meta object literal for the '{@link caex.impl.InterfaceFamilyImpl <em>Interface Family</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see caex.impl.InterfaceFamilyImpl
		 * @see caex.impl.CaexPackageImpl#getInterfaceFamily()
		 * @generated
		 */
		EClass INTERFACE_FAMILY = eINSTANCE.getInterfaceFamily();

		/**
		 * The meta object literal for the '<em><b>Interface Class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_FAMILY__INTERFACE_CLASS = eINSTANCE.getInterfaceFamily_InterfaceClass();

		/**
		 * The meta object literal for the '{@link caex.impl.InterfaceNameMappingImpl <em>Interface Name Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see caex.impl.InterfaceNameMappingImpl
		 * @see caex.impl.CaexPackageImpl#getInterfaceNameMapping()
		 * @generated
		 */
		EClass INTERFACE_NAME_MAPPING = eINSTANCE.getInterfaceNameMapping();

		/**
		 * The meta object literal for the '<em><b>Role Interface Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_NAME_MAPPING__ROLE_INTERFACE_NAME = eINSTANCE.getInterfaceNameMapping_RoleInterfaceName();

		/**
		 * The meta object literal for the '<em><b>System Unit Interface Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_NAME_MAPPING__SYSTEM_UNIT_INTERFACE_NAME = eINSTANCE.getInterfaceNameMapping_SystemUnitInterfaceName();

		/**
		 * The meta object literal for the '{@link caex.impl.InternalElementImpl <em>Internal Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see caex.impl.InternalElementImpl
		 * @see caex.impl.CaexPackageImpl#getInternalElement()
		 * @generated
		 */
		EClass INTERNAL_ELEMENT = eINSTANCE.getInternalElement();

		/**
		 * The meta object literal for the '<em><b>Role Requirements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_ELEMENT__ROLE_REQUIREMENTS = eINSTANCE.getInternalElement_RoleRequirements();

		/**
		 * The meta object literal for the '<em><b>Mapping Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_ELEMENT__MAPPING_OBJECT = eINSTANCE.getInternalElement_MappingObject();

		/**
		 * The meta object literal for the '<em><b>Ref Base System Unit Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_ELEMENT__REF_BASE_SYSTEM_UNIT_PATH = eINSTANCE.getInternalElement_RefBaseSystemUnitPath();

		/**
		 * The meta object literal for the '{@link caex.impl.InternalLinkImpl <em>Internal Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see caex.impl.InternalLinkImpl
		 * @see caex.impl.CaexPackageImpl#getInternalLink()
		 * @generated
		 */
		EClass INTERNAL_LINK = eINSTANCE.getInternalLink();

		/**
		 * The meta object literal for the '<em><b>Ref Partner Side A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_LINK__REF_PARTNER_SIDE_A = eINSTANCE.getInternalLink_RefPartnerSideA();

		/**
		 * The meta object literal for the '<em><b>Ref Partner Side B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_LINK__REF_PARTNER_SIDE_B = eINSTANCE.getInternalLink_RefPartnerSideB();

		/**
		 * The meta object literal for the '{@link caex.impl.MappingImpl <em>Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see caex.impl.MappingImpl
		 * @see caex.impl.CaexPackageImpl#getMapping()
		 * @generated
		 */
		EClass MAPPING = eINSTANCE.getMapping();

		/**
		 * The meta object literal for the '<em><b>Attribute Name Mapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__ATTRIBUTE_NAME_MAPPING = eINSTANCE.getMapping_AttributeNameMapping();

		/**
		 * The meta object literal for the '<em><b>Interface Name Mapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__INTERFACE_NAME_MAPPING = eINSTANCE.getMapping_InterfaceNameMapping();

		/**
		 * The meta object literal for the '{@link caex.impl.NominalScaledImpl <em>Nominal Scaled</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see caex.impl.NominalScaledImpl
		 * @see caex.impl.CaexPackageImpl#getNominalScaled()
		 * @generated
		 */
		EClass NOMINAL_SCALED = eINSTANCE.getNominalScaled();

		/**
		 * The meta object literal for the '<em><b>Required Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOMINAL_SCALED__REQUIRED_VALUE = eINSTANCE.getNominalScaled_RequiredValue();

		/**
		 * The meta object literal for the '{@link caex.impl.OrdinalScaledImpl <em>Ordinal Scaled</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see caex.impl.OrdinalScaledImpl
		 * @see caex.impl.CaexPackageImpl#getOrdinalScaled()
		 * @generated
		 */
		EClass ORDINAL_SCALED = eINSTANCE.getOrdinalScaled();

		/**
		 * The meta object literal for the '<em><b>Required Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDINAL_SCALED__REQUIRED_MAX_VALUE = eINSTANCE.getOrdinalScaled_RequiredMaxValue();

		/**
		 * The meta object literal for the '<em><b>Required Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDINAL_SCALED__REQUIRED_VALUE = eINSTANCE.getOrdinalScaled_RequiredValue();

		/**
		 * The meta object literal for the '<em><b>Required Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDINAL_SCALED__REQUIRED_MIN_VALUE = eINSTANCE.getOrdinalScaled_RequiredMinValue();

		/**
		 * The meta object literal for the '{@link caex.impl.RefSemanticImpl <em>Ref Semantic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see caex.impl.RefSemanticImpl
		 * @see caex.impl.CaexPackageImpl#getRefSemantic()
		 * @generated
		 */
		EClass REF_SEMANTIC = eINSTANCE.getRefSemantic();

		/**
		 * The meta object literal for the '<em><b>Corresponding Attribute Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REF_SEMANTIC__CORRESPONDING_ATTRIBUTE_PATH = eINSTANCE.getRefSemantic_CorrespondingAttributePath();

		/**
		 * The meta object literal for the '{@link caex.impl.RevisionImpl <em>Revision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see caex.impl.RevisionImpl
		 * @see caex.impl.CaexPackageImpl#getRevision()
		 * @generated
		 */
		EClass REVISION = eINSTANCE.getRevision();

		/**
		 * The meta object literal for the '<em><b>Revision Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVISION__REVISION_DATE = eINSTANCE.getRevision_RevisionDate();

		/**
		 * The meta object literal for the '<em><b>Old Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVISION__OLD_VERSION = eINSTANCE.getRevision_OldVersion();

		/**
		 * The meta object literal for the '<em><b>New Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVISION__NEW_VERSION = eINSTANCE.getRevision_NewVersion();

		/**
		 * The meta object literal for the '<em><b>Author Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVISION__AUTHOR_NAME = eINSTANCE.getRevision_AuthorName();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVISION__COMMENT = eINSTANCE.getRevision_Comment();

		/**
		 * The meta object literal for the '{@link caex.impl.RoleClassLibImpl <em>Role Class Lib</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see caex.impl.RoleClassLibImpl
		 * @see caex.impl.CaexPackageImpl#getRoleClassLib()
		 * @generated
		 */
		EClass ROLE_CLASS_LIB = eINSTANCE.getRoleClassLib();

		/**
		 * The meta object literal for the '<em><b>Role Class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_CLASS_LIB__ROLE_CLASS = eINSTANCE.getRoleClassLib_RoleClass();

		/**
		 * The meta object literal for the '{@link caex.impl.RoleClassImpl <em>Role Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see caex.impl.RoleClassImpl
		 * @see caex.impl.CaexPackageImpl#getRoleClass()
		 * @generated
		 */
		EClass ROLE_CLASS = eINSTANCE.getRoleClass();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_CLASS__ATTRIBUTE = eINSTANCE.getRoleClass_Attribute();

		/**
		 * The meta object literal for the '<em><b>External Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_CLASS__EXTERNAL_INTERFACE = eINSTANCE.getRoleClass_ExternalInterface();

		/**
		 * The meta object literal for the '<em><b>Ref Base Class Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_CLASS__REF_BASE_CLASS_PATH = eINSTANCE.getRoleClass_RefBaseClassPath();

		/**
		 * The meta object literal for the '{@link caex.impl.RoleFamilyImpl <em>Role Family</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see caex.impl.RoleFamilyImpl
		 * @see caex.impl.CaexPackageImpl#getRoleFamily()
		 * @generated
		 */
		EClass ROLE_FAMILY = eINSTANCE.getRoleFamily();

		/**
		 * The meta object literal for the '<em><b>Role Class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_FAMILY__ROLE_CLASS = eINSTANCE.getRoleFamily_RoleClass();

		/**
		 * The meta object literal for the '{@link caex.impl.RoleRequirementsImpl <em>Role Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see caex.impl.RoleRequirementsImpl
		 * @see caex.impl.CaexPackageImpl#getRoleRequirements()
		 * @generated
		 */
		EClass ROLE_REQUIREMENTS = eINSTANCE.getRoleRequirements();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_REQUIREMENTS__ATTRIBUTE = eINSTANCE.getRoleRequirements_Attribute();

		/**
		 * The meta object literal for the '<em><b>External Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_REQUIREMENTS__EXTERNAL_INTERFACE = eINSTANCE.getRoleRequirements_ExternalInterface();

		/**
		 * The meta object literal for the '<em><b>Ref Base Role Class Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_REQUIREMENTS__REF_BASE_ROLE_CLASS_PATH = eINSTANCE.getRoleRequirements_RefBaseRoleClassPath();

		/**
		 * The meta object literal for the '{@link caex.impl.SupportedRoleClassImpl <em>Supported Role Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see caex.impl.SupportedRoleClassImpl
		 * @see caex.impl.CaexPackageImpl#getSupportedRoleClass()
		 * @generated
		 */
		EClass SUPPORTED_ROLE_CLASS = eINSTANCE.getSupportedRoleClass();

		/**
		 * The meta object literal for the '<em><b>Mapping Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPORTED_ROLE_CLASS__MAPPING_OBJECT = eINSTANCE.getSupportedRoleClass_MappingObject();

		/**
		 * The meta object literal for the '<em><b>Ref Role Class Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPORTED_ROLE_CLASS__REF_ROLE_CLASS_PATH = eINSTANCE.getSupportedRoleClass_RefRoleClassPath();

		/**
		 * The meta object literal for the '{@link caex.impl.SystemUnitClassLibImpl <em>System Unit Class Lib</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see caex.impl.SystemUnitClassLibImpl
		 * @see caex.impl.CaexPackageImpl#getSystemUnitClassLib()
		 * @generated
		 */
		EClass SYSTEM_UNIT_CLASS_LIB = eINSTANCE.getSystemUnitClassLib();

		/**
		 * The meta object literal for the '<em><b>System Unit Class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_UNIT_CLASS_LIB__SYSTEM_UNIT_CLASS = eINSTANCE.getSystemUnitClassLib_SystemUnitClass();

		/**
		 * The meta object literal for the '{@link caex.impl.SystemUnitClassImpl <em>System Unit Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see caex.impl.SystemUnitClassImpl
		 * @see caex.impl.CaexPackageImpl#getSystemUnitClass()
		 * @generated
		 */
		EClass SYSTEM_UNIT_CLASS = eINSTANCE.getSystemUnitClass();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_UNIT_CLASS__ATTRIBUTE = eINSTANCE.getSystemUnitClass_Attribute();

		/**
		 * The meta object literal for the '<em><b>External Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_UNIT_CLASS__EXTERNAL_INTERFACE = eINSTANCE.getSystemUnitClass_ExternalInterface();

		/**
		 * The meta object literal for the '<em><b>Internal Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_UNIT_CLASS__INTERNAL_ELEMENT = eINSTANCE.getSystemUnitClass_InternalElement();

		/**
		 * The meta object literal for the '<em><b>Supported Role Class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_UNIT_CLASS__SUPPORTED_ROLE_CLASS = eINSTANCE.getSystemUnitClass_SupportedRoleClass();

		/**
		 * The meta object literal for the '<em><b>Internal Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_UNIT_CLASS__INTERNAL_LINK = eINSTANCE.getSystemUnitClass_InternalLink();

		/**
		 * The meta object literal for the '{@link caex.impl.SystemUnitFamilyImpl <em>System Unit Family</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see caex.impl.SystemUnitFamilyImpl
		 * @see caex.impl.CaexPackageImpl#getSystemUnitFamily()
		 * @generated
		 */
		EClass SYSTEM_UNIT_FAMILY = eINSTANCE.getSystemUnitFamily();

		/**
		 * The meta object literal for the '<em><b>System Unit Class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_UNIT_FAMILY__SYSTEM_UNIT_CLASS = eINSTANCE.getSystemUnitFamily_SystemUnitClass();

		/**
		 * The meta object literal for the '<em><b>Ref Base Class Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_UNIT_FAMILY__REF_BASE_CLASS_PATH = eINSTANCE.getSystemUnitFamily_RefBaseClassPath();

		/**
		 * The meta object literal for the '{@link caex.impl.UnknownTypeImpl <em>Unknown Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see caex.impl.UnknownTypeImpl
		 * @see caex.impl.CaexPackageImpl#getUnknownType()
		 * @generated
		 */
		EClass UNKNOWN_TYPE = eINSTANCE.getUnknownType();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNKNOWN_TYPE__REQUIREMENTS = eINSTANCE.getUnknownType_Requirements();

		/**
		 * The meta object literal for the '{@link caex.impl.VersionImpl <em>Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see caex.impl.VersionImpl
		 * @see caex.impl.CaexPackageImpl#getVersion()
		 * @generated
		 */
		EClass VERSION = eINSTANCE.getVersion();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__VALUE = eINSTANCE.getVersion_Value();

		/**
		 * The meta object literal for the '<em><b>Change Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__CHANGE_MODE = eINSTANCE.getVersion_ChangeMode();

		/**
		 * The meta object literal for the '{@link caex.ChangeMode <em>Change Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see caex.ChangeMode
		 * @see caex.impl.CaexPackageImpl#getChangeMode()
		 * @generated
		 */
		EEnum CHANGE_MODE = eINSTANCE.getChangeMode();

		/**
		 * The meta object literal for the '<em>Attribute Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see caex.impl.CaexPackageImpl#getAttributeDataType()
		 * @generated
		 */
		EDataType ATTRIBUTE_DATA_TYPE = eINSTANCE.getAttributeDataType();

		/**
		 * The meta object literal for the '<em>Change Mode Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.Enumerator
		 * @see caex.impl.CaexPackageImpl#getChangeModeObject()
		 * @generated
		 */
		EDataType CHANGE_MODE_OBJECT = eINSTANCE.getChangeModeObject();

	}

} //CaexPackage
