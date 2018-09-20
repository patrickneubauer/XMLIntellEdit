/**
 */
package org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org_eclipse_smarthome_schemas_config_description_v1__0Simplified.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedFactoryImpl extends EFactoryImpl implements org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedFactory init() {
		try {
			org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedFactory theorg_eclipse_smarthome_schemas_config_description_v1__0SimplifiedFactory = (org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedFactory)EPackage.Registry.INSTANCE.getEFactory(org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage.eNS_URI);
			if (theorg_eclipse_smarthome_schemas_config_description_v1__0SimplifiedFactory != null) {
				return theorg_eclipse_smarthome_schemas_config_description_v1__0SimplifiedFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage.CONFIG_DESCRIPTION: return createConfigDescription();
			case org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage.CONFIG_DESCRIPTION_REF: return createConfigDescriptionRef();
			case org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage.CONFIG_DESCRIPTIONS: return createConfigDescriptions();
			case org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage.CRITERIA: return createCriteria();
			case org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage.FILTER: return createFilter();
			case org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage.OPTIONS: return createOptions();
			case org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage.OPTION: return createOption();
			case org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage.PARAMETER: return createParameter();
			case org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage.PARAMETER_GROUP: return createParameterGroup();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage.PARAMETER_TYPE:
				return createParameterTypeFromString(eDataType, initialValue);
			case org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage.UNIT_TYPE:
				return createUnitTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage.PARAMETER_TYPE:
				return convertParameterTypeToString(eDataType, instanceValue);
			case org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage.UNIT_TYPE:
				return convertUnitTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigDescription createConfigDescription() {
		ConfigDescriptionImpl configDescription = new ConfigDescriptionImpl();
		return configDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigDescriptionRef createConfigDescriptionRef() {
		ConfigDescriptionRefImpl configDescriptionRef = new ConfigDescriptionRefImpl();
		return configDescriptionRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigDescriptions createConfigDescriptions() {
		ConfigDescriptionsImpl configDescriptions = new ConfigDescriptionsImpl();
		return configDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Criteria createCriteria() {
		CriteriaImpl criteria = new CriteriaImpl();
		return criteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Filter createFilter() {
		FilterImpl filter = new FilterImpl();
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Options createOptions() {
		OptionsImpl options = new OptionsImpl();
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Option createOption() {
		OptionImpl option = new OptionImpl();
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterGroup createParameterGroup() {
		ParameterGroupImpl parameterGroup = new ParameterGroupImpl();
		return parameterGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterType createParameterTypeFromString(EDataType eDataType, String initialValue) {
		ParameterType result = ParameterType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitType createUnitTypeFromString(EDataType eDataType, String initialValue) {
		UnitType result = UnitType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage getorg_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage() {
		return (org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage getPackage() {
		return org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage.eINSTANCE;
	}

} //org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedFactoryImpl
