/**
 */
package org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org_eclipse_smarthome_schemas_config_description_v1__0Simplified.ConfigDescription;
import org_eclipse_smarthome_schemas_config_description_v1__0Simplified.ConfigDescriptionRef;
import org_eclipse_smarthome_schemas_config_description_v1__0Simplified.ConfigDescriptions;
import org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Criteria;
import org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Filter;
import org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Option;
import org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Options;
import org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Parameter;
import org_eclipse_smarthome_schemas_config_description_v1__0Simplified.ParameterGroup;
import org_eclipse_smarthome_schemas_config_description_v1__0Simplified.ParameterType;
import org_eclipse_smarthome_schemas_config_description_v1__0Simplified.UnitType;
import org_eclipse_smarthome_schemas_config_description_v1__0Simplified.org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedFactory;
import org_eclipse_smarthome_schemas_config_description_v1__0Simplified.org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage;

import org_eclipse_smarthome_schemas_config_description_v1__0Simplified.util.org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackageImpl extends EPackageImpl implements org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configDescriptionRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configDescriptionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass criteriaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parameterTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unitTypeEEnum = null;

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
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackageImpl() {
		super(eNS_URI, org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage init() {
		if (isInited) return (org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage)EPackage.Registry.INSTANCE.getEPackage(org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage.eNS_URI);

		// Obtain or create and register package
		org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackageImpl theorg_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage = (org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theorg_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage.createPackageContents();

		// Initialize created meta-data
		theorg_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theorg_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theorg_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage.eNS_URI, theorg_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage);
		return theorg_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigDescription() {
		return configDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigDescription_Uri() {
		return (EAttribute)configDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigDescription_ParameterGroups() {
		return (EReference)configDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigDescription_Parameters() {
		return (EReference)configDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigDescriptionRef() {
		return configDescriptionRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigDescriptionRef_Uri() {
		return (EAttribute)configDescriptionRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigDescriptions() {
		return configDescriptionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigDescriptions_ConfigDescriptions() {
		return (EReference)configDescriptionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCriteria() {
		return criteriaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCriteria_Value() {
		return (EAttribute)criteriaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCriteria_Name() {
		return (EAttribute)criteriaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilter() {
		return filterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilter_Criterias() {
		return (EReference)filterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptions() {
		return optionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptions_Options() {
		return (EReference)optionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOption() {
		return optionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOption_Value() {
		return (EAttribute)optionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOption_Value1() {
		return (EAttribute)optionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Context() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Required() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Default() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Label() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Description() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_LimitToOptions() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Advanced() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Verify() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_UnitLabel() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_GroupName() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Multiple() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Name() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Pattern() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_ReadOnly() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Required1() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Type() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Unit() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_Options() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_Filter() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterGroup() {
		return parameterGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterGroup_Label() {
		return (EAttribute)parameterGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterGroup_Description() {
		return (EAttribute)parameterGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterGroup_Context() {
		return (EAttribute)parameterGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterGroup_Advanced() {
		return (EAttribute)parameterGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterGroup_Name() {
		return (EAttribute)parameterGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParameterType() {
		return parameterTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUnitType() {
		return unitTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedFactory getorg_eclipse_smarthome_schemas_config_description_v1__0SimplifiedFactory() {
		return (org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedFactory)getEFactoryInstance();
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
		configDescriptionEClass = createEClass(CONFIG_DESCRIPTION);
		createEAttribute(configDescriptionEClass, CONFIG_DESCRIPTION__URI);
		createEReference(configDescriptionEClass, CONFIG_DESCRIPTION__PARAMETER_GROUPS);
		createEReference(configDescriptionEClass, CONFIG_DESCRIPTION__PARAMETERS);

		configDescriptionRefEClass = createEClass(CONFIG_DESCRIPTION_REF);
		createEAttribute(configDescriptionRefEClass, CONFIG_DESCRIPTION_REF__URI);

		configDescriptionsEClass = createEClass(CONFIG_DESCRIPTIONS);
		createEReference(configDescriptionsEClass, CONFIG_DESCRIPTIONS__CONFIG_DESCRIPTIONS);

		criteriaEClass = createEClass(CRITERIA);
		createEAttribute(criteriaEClass, CRITERIA__VALUE);
		createEAttribute(criteriaEClass, CRITERIA__NAME);

		filterEClass = createEClass(FILTER);
		createEReference(filterEClass, FILTER__CRITERIAS);

		optionsEClass = createEClass(OPTIONS);
		createEReference(optionsEClass, OPTIONS__OPTIONS);

		optionEClass = createEClass(OPTION);
		createEAttribute(optionEClass, OPTION__VALUE);
		createEAttribute(optionEClass, OPTION__VALUE1);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__CONTEXT);
		createEAttribute(parameterEClass, PARAMETER__REQUIRED);
		createEAttribute(parameterEClass, PARAMETER__DEFAULT);
		createEAttribute(parameterEClass, PARAMETER__LABEL);
		createEAttribute(parameterEClass, PARAMETER__DESCRIPTION);
		createEAttribute(parameterEClass, PARAMETER__LIMIT_TO_OPTIONS);
		createEAttribute(parameterEClass, PARAMETER__ADVANCED);
		createEAttribute(parameterEClass, PARAMETER__VERIFY);
		createEAttribute(parameterEClass, PARAMETER__UNIT_LABEL);
		createEAttribute(parameterEClass, PARAMETER__GROUP_NAME);
		createEAttribute(parameterEClass, PARAMETER__MULTIPLE);
		createEAttribute(parameterEClass, PARAMETER__NAME);
		createEAttribute(parameterEClass, PARAMETER__PATTERN);
		createEAttribute(parameterEClass, PARAMETER__READ_ONLY);
		createEAttribute(parameterEClass, PARAMETER__REQUIRED1);
		createEAttribute(parameterEClass, PARAMETER__TYPE);
		createEAttribute(parameterEClass, PARAMETER__UNIT);
		createEReference(parameterEClass, PARAMETER__OPTIONS);
		createEReference(parameterEClass, PARAMETER__FILTER);

		parameterGroupEClass = createEClass(PARAMETER_GROUP);
		createEAttribute(parameterGroupEClass, PARAMETER_GROUP__LABEL);
		createEAttribute(parameterGroupEClass, PARAMETER_GROUP__DESCRIPTION);
		createEAttribute(parameterGroupEClass, PARAMETER_GROUP__CONTEXT);
		createEAttribute(parameterGroupEClass, PARAMETER_GROUP__ADVANCED);
		createEAttribute(parameterGroupEClass, PARAMETER_GROUP__NAME);

		// Create enums
		parameterTypeEEnum = createEEnum(PARAMETER_TYPE);
		unitTypeEEnum = createEEnum(UNIT_TYPE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(configDescriptionEClass, ConfigDescription.class, "ConfigDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfigDescription_Uri(), ecorePackage.getEString(), "uri", null, 0, 1, ConfigDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigDescription_ParameterGroups(), this.getParameterGroup(), null, "parameterGroups", null, 0, -1, ConfigDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigDescription_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, ConfigDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configDescriptionRefEClass, ConfigDescriptionRef.class, "ConfigDescriptionRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfigDescriptionRef_Uri(), ecorePackage.getEString(), "uri", null, 1, 1, ConfigDescriptionRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configDescriptionsEClass, ConfigDescriptions.class, "ConfigDescriptions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfigDescriptions_ConfigDescriptions(), this.getConfigDescription(), null, "configDescriptions", null, 1, -1, ConfigDescriptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(criteriaEClass, Criteria.class, "Criteria", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCriteria_Value(), ecorePackage.getEString(), "value", null, 0, 1, Criteria.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCriteria_Name(), ecorePackage.getEString(), "name", null, 1, 1, Criteria.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filterEClass, Filter.class, "Filter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFilter_Criterias(), this.getCriteria(), null, "criterias", null, 0, -1, Filter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optionsEClass, Options.class, "Options", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOptions_Options(), this.getOption(), null, "options", null, 0, -1, Options.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optionEClass, Option.class, "Option", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOption_Value(), ecorePackage.getEString(), "value", null, 0, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOption_Value1(), ecorePackage.getEString(), "value1", null, 1, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Context(), ecorePackage.getEString(), "context", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Required(), ecorePackage.getEBoolean(), "required", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Default(), ecorePackage.getEString(), "default", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Label(), ecorePackage.getEString(), "label", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Description(), ecorePackage.getEString(), "description", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_LimitToOptions(), ecorePackage.getEBoolean(), "limitToOptions", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Advanced(), ecorePackage.getEBoolean(), "advanced", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Verify(), ecorePackage.getEBoolean(), "verify", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_UnitLabel(), ecorePackage.getEString(), "unitLabel", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_GroupName(), ecorePackage.getEString(), "groupName", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Multiple(), ecorePackage.getEBoolean(), "multiple", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Pattern(), ecorePackage.getEString(), "pattern", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_ReadOnly(), ecorePackage.getEBoolean(), "readOnly", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Required1(), ecorePackage.getEBoolean(), "required1", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Type(), this.getParameterType(), "type", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Unit(), this.getUnitType(), "unit", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_Options(), this.getOptions(), null, "options", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_Filter(), this.getFilter(), null, "filter", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterGroupEClass, ParameterGroup.class, "ParameterGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterGroup_Label(), ecorePackage.getEString(), "label", null, 0, 1, ParameterGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterGroup_Description(), ecorePackage.getEString(), "description", null, 0, 1, ParameterGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterGroup_Context(), ecorePackage.getEString(), "context", null, 0, 1, ParameterGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterGroup_Advanced(), ecorePackage.getEBoolean(), "advanced", null, 0, 1, ParameterGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterGroup_Name(), ecorePackage.getEString(), "name", null, 1, 1, ParameterGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(parameterTypeEEnum, ParameterType.class, "ParameterType");
		addEEnumLiteral(parameterTypeEEnum, ParameterType.TEXT);
		addEEnumLiteral(parameterTypeEEnum, ParameterType.INTEGER);
		addEEnumLiteral(parameterTypeEEnum, ParameterType.DECIMAL);
		addEEnumLiteral(parameterTypeEEnum, ParameterType.BOOLEAN);

		initEEnum(unitTypeEEnum, UnitType.class, "UnitType");
		addEEnumLiteral(unitTypeEEnum, UnitType.A);
		addEEnumLiteral(unitTypeEEnum, UnitType.CD);
		addEEnumLiteral(unitTypeEEnum, UnitType.K);
		addEEnumLiteral(unitTypeEEnum, UnitType.KG);
		addEEnumLiteral(unitTypeEEnum, UnitType.M);
		addEEnumLiteral(unitTypeEEnum, UnitType.MOL);
		addEEnumLiteral(unitTypeEEnum, UnitType.S);
		addEEnumLiteral(unitTypeEEnum, UnitType.BQ);
		addEEnumLiteral(unitTypeEEnum, UnitType.C);
		addEEnumLiteral(unitTypeEEnum, UnitType.F);
		addEEnumLiteral(unitTypeEEnum, UnitType.GY);
		addEEnumLiteral(unitTypeEEnum, UnitType.H);
		addEEnumLiteral(unitTypeEEnum, UnitType.HZ);
		addEEnumLiteral(unitTypeEEnum, UnitType.J);
		addEEnumLiteral(unitTypeEEnum, UnitType.KAT);
		addEEnumLiteral(unitTypeEEnum, UnitType.LM);
		addEEnumLiteral(unitTypeEEnum, UnitType.LX);
		addEEnumLiteral(unitTypeEEnum, UnitType.N);
		addEEnumLiteral(unitTypeEEnum, UnitType.PA);
		addEEnumLiteral(unitTypeEEnum, UnitType.RAD);
		addEEnumLiteral(unitTypeEEnum, UnitType.S1);
		addEEnumLiteral(unitTypeEEnum, UnitType.SR);
		addEEnumLiteral(unitTypeEEnum, UnitType.SV);
		addEEnumLiteral(unitTypeEEnum, UnitType.T);
		addEEnumLiteral(unitTypeEEnum, UnitType.V);
		addEEnumLiteral(unitTypeEEnum, UnitType.W);
		addEEnumLiteral(unitTypeEEnum, UnitType.WB);
		addEEnumLiteral(unitTypeEEnum, UnitType.CEL);
		addEEnumLiteral(unitTypeEEnum, UnitType.questionmark);
		addEEnumLiteral(unitTypeEEnum, UnitType.G);
		addEEnumLiteral(unitTypeEEnum, UnitType.MS2);
		addEEnumLiteral(unitTypeEEnum, UnitType.M2V);
		addEEnumLiteral(unitTypeEEnum, UnitType.M3);
		addEEnumLiteral(unitTypeEEnum, UnitType.KPH);
		addEEnumLiteral(unitTypeEEnum, UnitType.underscore);
		addEEnumLiteral(unitTypeEEnum, UnitType.L);
		addEEnumLiteral(unitTypeEEnum, UnitType.MS);
		addEEnumLiteral(unitTypeEEnum, UnitType.MIN);
		addEEnumLiteral(unitTypeEEnum, UnitType.H1);
		addEEnumLiteral(unitTypeEEnum, UnitType.D);
		addEEnumLiteral(unitTypeEEnum, UnitType.WEEK);
		addEEnumLiteral(unitTypeEEnum, UnitType.Y);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (configDescriptionEClass, 
		   source, 
		   new String[] {
			 "constraints", "patternUri"
		   });	
		addAnnotation
		  (configDescriptionRefEClass, 
		   source, 
		   new String[] {
			 "constraints", "patternUri"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (configDescriptionEClass, 
		   source, 
		   new String[] {
			 "patternUri", "(self.uri=null) or self.uri.matches(\'[A-Za-z0-9\\\\-_]+(:[A-Za-z0-9\\\\-_]+){1,2}\')"
		   });	
		addAnnotation
		  (configDescriptionRefEClass, 
		   source, 
		   new String[] {
			 "patternUri", "self.uri.matches(\'[A-Za-z0-9\\\\-_]+(:[A-Za-z0-9\\\\-_]+){1,2}\')"
		   });
	}

} //org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackageImpl
