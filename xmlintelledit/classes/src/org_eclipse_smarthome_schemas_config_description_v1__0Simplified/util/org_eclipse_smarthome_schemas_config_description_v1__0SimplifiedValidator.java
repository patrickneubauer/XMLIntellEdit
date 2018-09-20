/**
 */
package org_eclipse_smarthome_schemas_config_description_v1__0Simplified.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org_eclipse_smarthome_schemas_config_description_v1__0Simplified.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage
 * @generated
 */
public class org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedValidator INSTANCE = new org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org_eclipse_smarthome_schemas_config_description_v1__0Simplified";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage.CONFIG_DESCRIPTION:
				return validateConfigDescription((ConfigDescription)value, diagnostics, context);
			case org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage.CONFIG_DESCRIPTION_REF:
				return validateConfigDescriptionRef((ConfigDescriptionRef)value, diagnostics, context);
			case org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage.CONFIG_DESCRIPTIONS:
				return validateConfigDescriptions((ConfigDescriptions)value, diagnostics, context);
			case org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage.CRITERIA:
				return validateCriteria((Criteria)value, diagnostics, context);
			case org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage.FILTER:
				return validateFilter((Filter)value, diagnostics, context);
			case org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage.OPTIONS:
				return validateOptions((Options)value, diagnostics, context);
			case org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage.OPTION:
				return validateOption((Option)value, diagnostics, context);
			case org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage.PARAMETER:
				return validateParameter((Parameter)value, diagnostics, context);
			case org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage.PARAMETER_GROUP:
				return validateParameterGroup((ParameterGroup)value, diagnostics, context);
			case org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage.PARAMETER_TYPE:
				return validateParameterType((ParameterType)value, diagnostics, context);
			case org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage.UNIT_TYPE:
				return validateUnitType((UnitType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfigDescription(ConfigDescription configDescription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(configDescription, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(configDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(configDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(configDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(configDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(configDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(configDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(configDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(configDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validateConfigDescription_patternUri(configDescription, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the patternUri constraint of '<em>Config Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONFIG_DESCRIPTION__PATTERN_URI__EEXPRESSION = "(self.uri=null) or self.uri.matches('[A-Za-z0-9\\\\-_]+(:[A-Za-z0-9\\\\-_]+){1,2}')";

	/**
	 * Validates the patternUri constraint of '<em>Config Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfigDescription_patternUri(ConfigDescription configDescription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage.Literals.CONFIG_DESCRIPTION,
				 configDescription,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternUri",
				 CONFIG_DESCRIPTION__PATTERN_URI__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfigDescriptionRef(ConfigDescriptionRef configDescriptionRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(configDescriptionRef, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(configDescriptionRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(configDescriptionRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(configDescriptionRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(configDescriptionRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(configDescriptionRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(configDescriptionRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(configDescriptionRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(configDescriptionRef, diagnostics, context);
		if (result || diagnostics != null) result &= validateConfigDescriptionRef_patternUri(configDescriptionRef, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the patternUri constraint of '<em>Config Description Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONFIG_DESCRIPTION_REF__PATTERN_URI__EEXPRESSION = "self.uri.matches('[A-Za-z0-9\\\\-_]+(:[A-Za-z0-9\\\\-_]+){1,2}')";

	/**
	 * Validates the patternUri constraint of '<em>Config Description Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfigDescriptionRef_patternUri(ConfigDescriptionRef configDescriptionRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage.Literals.CONFIG_DESCRIPTION_REF,
				 configDescriptionRef,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternUri",
				 CONFIG_DESCRIPTION_REF__PATTERN_URI__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfigDescriptions(ConfigDescriptions configDescriptions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(configDescriptions, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCriteria(Criteria criteria, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(criteria, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFilter(Filter filter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(filter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOptions(Options options, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(options, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOption(Option option, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(option, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterGroup(ParameterGroup parameterGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameterGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterType(ParameterType parameterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitType(UnitType unitType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedValidator
