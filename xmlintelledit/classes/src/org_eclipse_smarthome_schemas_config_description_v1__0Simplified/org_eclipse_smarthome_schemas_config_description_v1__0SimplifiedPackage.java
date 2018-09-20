/**
 */
package org_eclipse_smarthome_schemas_config_description_v1__0Simplified;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "org_eclipse_smarthome_schemas_config_description_v1__0Simplified";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/examples/thingdesc/thing-description-1.0.0.xsdsimplified";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "_0s";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage eINSTANCE = org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackageImpl.init();

	/**
	 * The meta object id for the '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.ConfigDescriptionImpl <em>Config Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.ConfigDescriptionImpl
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackageImpl#getConfigDescription()
	 * @generated
	 */
	int CONFIG_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_DESCRIPTION__URI = 0;

	/**
	 * The feature id for the '<em><b>Parameter Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_DESCRIPTION__PARAMETER_GROUPS = 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_DESCRIPTION__PARAMETERS = 2;

	/**
	 * The number of structural features of the '<em>Config Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_DESCRIPTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Config Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.ConfigDescriptionRefImpl <em>Config Description Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.ConfigDescriptionRefImpl
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackageImpl#getConfigDescriptionRef()
	 * @generated
	 */
	int CONFIG_DESCRIPTION_REF = 1;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_DESCRIPTION_REF__URI = 0;

	/**
	 * The number of structural features of the '<em>Config Description Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_DESCRIPTION_REF_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Config Description Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_DESCRIPTION_REF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.ConfigDescriptionsImpl <em>Config Descriptions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.ConfigDescriptionsImpl
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackageImpl#getConfigDescriptions()
	 * @generated
	 */
	int CONFIG_DESCRIPTIONS = 2;

	/**
	 * The feature id for the '<em><b>Config Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_DESCRIPTIONS__CONFIG_DESCRIPTIONS = 0;

	/**
	 * The number of structural features of the '<em>Config Descriptions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_DESCRIPTIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Config Descriptions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_DESCRIPTIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.CriteriaImpl <em>Criteria</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.CriteriaImpl
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackageImpl#getCriteria()
	 * @generated
	 */
	int CRITERIA = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERIA__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERIA__NAME = 1;

	/**
	 * The number of structural features of the '<em>Criteria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERIA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Criteria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERIA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.FilterImpl <em>Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.FilterImpl
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackageImpl#getFilter()
	 * @generated
	 */
	int FILTER = 4;

	/**
	 * The feature id for the '<em><b>Criterias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__CRITERIAS = 0;

	/**
	 * The number of structural features of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.OptionsImpl <em>Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.OptionsImpl
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackageImpl#getOptions()
	 * @generated
	 */
	int OPTIONS = 5;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__OPTIONS = 0;

	/**
	 * The number of structural features of the '<em>Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.OptionImpl <em>Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.OptionImpl
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackageImpl#getOption()
	 * @generated
	 */
	int OPTION = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Value1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__VALUE1 = 1;

	/**
	 * The number of structural features of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.ParameterImpl
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 7;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__REQUIRED = 1;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DEFAULT = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__LABEL = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Limit To Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__LIMIT_TO_OPTIONS = 5;

	/**
	 * The feature id for the '<em><b>Advanced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ADVANCED = 6;

	/**
	 * The feature id for the '<em><b>Verify</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VERIFY = 7;

	/**
	 * The feature id for the '<em><b>Unit Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__UNIT_LABEL = 8;

	/**
	 * The feature id for the '<em><b>Group Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__GROUP_NAME = 9;

	/**
	 * The feature id for the '<em><b>Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__MULTIPLE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 11;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__PATTERN = 12;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__READ_ONLY = 13;

	/**
	 * The feature id for the '<em><b>Required1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__REQUIRED1 = 14;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = 15;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__UNIT = 16;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OPTIONS = 17;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__FILTER = 18;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 19;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.ParameterGroupImpl <em>Parameter Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.ParameterGroupImpl
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackageImpl#getParameterGroup()
	 * @generated
	 */
	int PARAMETER_GROUP = 8;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_GROUP__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_GROUP__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_GROUP__CONTEXT = 2;

	/**
	 * The feature id for the '<em><b>Advanced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_GROUP__ADVANCED = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_GROUP__NAME = 4;

	/**
	 * The number of structural features of the '<em>Parameter Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_GROUP_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Parameter Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.ParameterType <em>Parameter Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.ParameterType
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackageImpl#getParameterType()
	 * @generated
	 */
	int PARAMETER_TYPE = 9;

	/**
	 * The meta object id for the '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.UnitType <em>Unit Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.UnitType
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackageImpl#getUnitType()
	 * @generated
	 */
	int UNIT_TYPE = 10;


	/**
	 * Returns the meta object for class '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.ConfigDescription <em>Config Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config Description</em>'.
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.ConfigDescription
	 * @generated
	 */
	EClass getConfigDescription();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.ConfigDescription#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.ConfigDescription#getUri()
	 * @see #getConfigDescription()
	 * @generated
	 */
	EAttribute getConfigDescription_Uri();

	/**
	 * Returns the meta object for the containment reference list '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.ConfigDescription#getParameterGroups <em>Parameter Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Groups</em>'.
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.ConfigDescription#getParameterGroups()
	 * @see #getConfigDescription()
	 * @generated
	 */
	EReference getConfigDescription_ParameterGroups();

	/**
	 * Returns the meta object for the containment reference list '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.ConfigDescription#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.ConfigDescription#getParameters()
	 * @see #getConfigDescription()
	 * @generated
	 */
	EReference getConfigDescription_Parameters();

	/**
	 * Returns the meta object for class '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.ConfigDescriptionRef <em>Config Description Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config Description Ref</em>'.
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.ConfigDescriptionRef
	 * @generated
	 */
	EClass getConfigDescriptionRef();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.ConfigDescriptionRef#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.ConfigDescriptionRef#getUri()
	 * @see #getConfigDescriptionRef()
	 * @generated
	 */
	EAttribute getConfigDescriptionRef_Uri();

	/**
	 * Returns the meta object for class '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.ConfigDescriptions <em>Config Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config Descriptions</em>'.
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.ConfigDescriptions
	 * @generated
	 */
	EClass getConfigDescriptions();

	/**
	 * Returns the meta object for the containment reference list '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.ConfigDescriptions#getConfigDescriptions <em>Config Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Config Descriptions</em>'.
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.ConfigDescriptions#getConfigDescriptions()
	 * @see #getConfigDescriptions()
	 * @generated
	 */
	EReference getConfigDescriptions_ConfigDescriptions();

	/**
	 * Returns the meta object for class '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Criteria <em>Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Criteria</em>'.
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Criteria
	 * @generated
	 */
	EClass getCriteria();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Criteria#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Criteria#getValue()
	 * @see #getCriteria()
	 * @generated
	 */
	EAttribute getCriteria_Value();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Criteria#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Criteria#getName()
	 * @see #getCriteria()
	 * @generated
	 */
	EAttribute getCriteria_Name();

	/**
	 * Returns the meta object for class '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Filter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter</em>'.
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Filter
	 * @generated
	 */
	EClass getFilter();

	/**
	 * Returns the meta object for the containment reference list '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Filter#getCriterias <em>Criterias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Criterias</em>'.
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Filter#getCriterias()
	 * @see #getFilter()
	 * @generated
	 */
	EReference getFilter_Criterias();

	/**
	 * Returns the meta object for class '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Options <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Options</em>'.
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Options
	 * @generated
	 */
	EClass getOptions();

	/**
	 * Returns the meta object for the containment reference list '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Options#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Options#getOptions()
	 * @see #getOptions()
	 * @generated
	 */
	EReference getOptions_Options();

	/**
	 * Returns the meta object for class '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option</em>'.
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Option
	 * @generated
	 */
	EClass getOption();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Option#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Option#getValue()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Value();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Option#getValue1 <em>Value1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value1</em>'.
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Option#getValue1()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Value1();

	/**
	 * Returns the meta object for class '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Parameter#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context</em>'.
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Parameter#getContext()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Context();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Parameter#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Parameter#isRequired()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Required();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Parameter#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Parameter#getDefault()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Default();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Parameter#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Parameter#getLabel()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Label();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Parameter#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Parameter#getDescription()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Description();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Parameter#isLimitToOptions <em>Limit To Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Limit To Options</em>'.
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Parameter#isLimitToOptions()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_LimitToOptions();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Parameter#isAdvanced <em>Advanced</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Advanced</em>'.
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Parameter#isAdvanced()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Advanced();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Parameter#isVerify <em>Verify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verify</em>'.
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Parameter#isVerify()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Verify();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Parameter#getUnitLabel <em>Unit Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Label</em>'.
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Parameter#getUnitLabel()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_UnitLabel();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Parameter#getGroupName <em>Group Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Name</em>'.
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Parameter#getGroupName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_GroupName();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Parameter#isMultiple <em>Multiple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiple</em>'.
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Parameter#isMultiple()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Multiple();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Parameter#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Parameter#getPattern()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Parameter#isReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Parameter#isReadOnly()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_ReadOnly();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Parameter#isRequired1 <em>Required1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required1</em>'.
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Parameter#isRequired1()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Required1();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Type();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Parameter#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Parameter#getUnit()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Unit();

	/**
	 * Returns the meta object for the containment reference '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Parameter#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Options</em>'.
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Parameter#getOptions()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Options();

	/**
	 * Returns the meta object for the containment reference '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Parameter#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter</em>'.
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Parameter#getFilter()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Filter();

	/**
	 * Returns the meta object for class '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.ParameterGroup <em>Parameter Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Group</em>'.
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.ParameterGroup
	 * @generated
	 */
	EClass getParameterGroup();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.ParameterGroup#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.ParameterGroup#getLabel()
	 * @see #getParameterGroup()
	 * @generated
	 */
	EAttribute getParameterGroup_Label();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.ParameterGroup#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.ParameterGroup#getDescription()
	 * @see #getParameterGroup()
	 * @generated
	 */
	EAttribute getParameterGroup_Description();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.ParameterGroup#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context</em>'.
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.ParameterGroup#getContext()
	 * @see #getParameterGroup()
	 * @generated
	 */
	EAttribute getParameterGroup_Context();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.ParameterGroup#isAdvanced <em>Advanced</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Advanced</em>'.
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.ParameterGroup#isAdvanced()
	 * @see #getParameterGroup()
	 * @generated
	 */
	EAttribute getParameterGroup_Advanced();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.ParameterGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.ParameterGroup#getName()
	 * @see #getParameterGroup()
	 * @generated
	 */
	EAttribute getParameterGroup_Name();

	/**
	 * Returns the meta object for enum '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.ParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Type</em>'.
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.ParameterType
	 * @generated
	 */
	EEnum getParameterType();

	/**
	 * Returns the meta object for enum '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.UnitType <em>Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unit Type</em>'.
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.UnitType
	 * @generated
	 */
	EEnum getUnitType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedFactory getorg_eclipse_smarthome_schemas_config_description_v1__0SimplifiedFactory();

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
		 * The meta object literal for the '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.ConfigDescriptionImpl <em>Config Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.ConfigDescriptionImpl
		 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackageImpl#getConfigDescription()
		 * @generated
		 */
		EClass CONFIG_DESCRIPTION = eINSTANCE.getConfigDescription();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG_DESCRIPTION__URI = eINSTANCE.getConfigDescription_Uri();

		/**
		 * The meta object literal for the '<em><b>Parameter Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIG_DESCRIPTION__PARAMETER_GROUPS = eINSTANCE.getConfigDescription_ParameterGroups();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIG_DESCRIPTION__PARAMETERS = eINSTANCE.getConfigDescription_Parameters();

		/**
		 * The meta object literal for the '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.ConfigDescriptionRefImpl <em>Config Description Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.ConfigDescriptionRefImpl
		 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackageImpl#getConfigDescriptionRef()
		 * @generated
		 */
		EClass CONFIG_DESCRIPTION_REF = eINSTANCE.getConfigDescriptionRef();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG_DESCRIPTION_REF__URI = eINSTANCE.getConfigDescriptionRef_Uri();

		/**
		 * The meta object literal for the '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.ConfigDescriptionsImpl <em>Config Descriptions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.ConfigDescriptionsImpl
		 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackageImpl#getConfigDescriptions()
		 * @generated
		 */
		EClass CONFIG_DESCRIPTIONS = eINSTANCE.getConfigDescriptions();

		/**
		 * The meta object literal for the '<em><b>Config Descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIG_DESCRIPTIONS__CONFIG_DESCRIPTIONS = eINSTANCE.getConfigDescriptions_ConfigDescriptions();

		/**
		 * The meta object literal for the '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.CriteriaImpl <em>Criteria</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.CriteriaImpl
		 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackageImpl#getCriteria()
		 * @generated
		 */
		EClass CRITERIA = eINSTANCE.getCriteria();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRITERIA__VALUE = eINSTANCE.getCriteria_Value();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRITERIA__NAME = eINSTANCE.getCriteria_Name();

		/**
		 * The meta object literal for the '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.FilterImpl <em>Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.FilterImpl
		 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackageImpl#getFilter()
		 * @generated
		 */
		EClass FILTER = eINSTANCE.getFilter();

		/**
		 * The meta object literal for the '<em><b>Criterias</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER__CRITERIAS = eINSTANCE.getFilter_Criterias();

		/**
		 * The meta object literal for the '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.OptionsImpl <em>Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.OptionsImpl
		 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackageImpl#getOptions()
		 * @generated
		 */
		EClass OPTIONS = eINSTANCE.getOptions();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTIONS__OPTIONS = eINSTANCE.getOptions_Options();

		/**
		 * The meta object literal for the '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.OptionImpl <em>Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.OptionImpl
		 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackageImpl#getOption()
		 * @generated
		 */
		EClass OPTION = eINSTANCE.getOption();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__VALUE = eINSTANCE.getOption_Value();

		/**
		 * The meta object literal for the '<em><b>Value1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__VALUE1 = eINSTANCE.getOption_Value1();

		/**
		 * The meta object literal for the '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.ParameterImpl
		 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__CONTEXT = eINSTANCE.getParameter_Context();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__REQUIRED = eINSTANCE.getParameter_Required();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__DEFAULT = eINSTANCE.getParameter_Default();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__LABEL = eINSTANCE.getParameter_Label();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__DESCRIPTION = eINSTANCE.getParameter_Description();

		/**
		 * The meta object literal for the '<em><b>Limit To Options</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__LIMIT_TO_OPTIONS = eINSTANCE.getParameter_LimitToOptions();

		/**
		 * The meta object literal for the '<em><b>Advanced</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__ADVANCED = eINSTANCE.getParameter_Advanced();

		/**
		 * The meta object literal for the '<em><b>Verify</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__VERIFY = eINSTANCE.getParameter_Verify();

		/**
		 * The meta object literal for the '<em><b>Unit Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__UNIT_LABEL = eINSTANCE.getParameter_UnitLabel();

		/**
		 * The meta object literal for the '<em><b>Group Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__GROUP_NAME = eINSTANCE.getParameter_GroupName();

		/**
		 * The meta object literal for the '<em><b>Multiple</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__MULTIPLE = eINSTANCE.getParameter_Multiple();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__PATTERN = eINSTANCE.getParameter_Pattern();

		/**
		 * The meta object literal for the '<em><b>Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__READ_ONLY = eINSTANCE.getParameter_ReadOnly();

		/**
		 * The meta object literal for the '<em><b>Required1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__REQUIRED1 = eINSTANCE.getParameter_Required1();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__UNIT = eINSTANCE.getParameter_Unit();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__OPTIONS = eINSTANCE.getParameter_Options();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__FILTER = eINSTANCE.getParameter_Filter();

		/**
		 * The meta object literal for the '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.ParameterGroupImpl <em>Parameter Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.ParameterGroupImpl
		 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackageImpl#getParameterGroup()
		 * @generated
		 */
		EClass PARAMETER_GROUP = eINSTANCE.getParameterGroup();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_GROUP__LABEL = eINSTANCE.getParameterGroup_Label();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_GROUP__DESCRIPTION = eINSTANCE.getParameterGroup_Description();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_GROUP__CONTEXT = eINSTANCE.getParameterGroup_Context();

		/**
		 * The meta object literal for the '<em><b>Advanced</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_GROUP__ADVANCED = eINSTANCE.getParameterGroup_Advanced();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_GROUP__NAME = eINSTANCE.getParameterGroup_Name();

		/**
		 * The meta object literal for the '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.ParameterType <em>Parameter Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.ParameterType
		 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackageImpl#getParameterType()
		 * @generated
		 */
		EEnum PARAMETER_TYPE = eINSTANCE.getParameterType();

		/**
		 * The meta object literal for the '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.UnitType <em>Unit Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.UnitType
		 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackageImpl#getUnitType()
		 * @generated
		 */
		EEnum UNIT_TYPE = eINSTANCE.getUnitType();

	}

} //org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage
