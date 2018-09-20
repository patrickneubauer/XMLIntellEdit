/**
 */
package org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage
 * @generated
 */
public class org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedValidator INSTANCE = new org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org_eclipse_smarthome_schemas_thing_description_v1__0Simplified";

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
	public org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedValidator() {
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
	  return org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.eINSTANCE;
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
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.BRIDGE_TYPE:
				return validateBridgeType((BridgeType)value, diagnostics, context);
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.BRIDGE_TYPE_REF:
				return validateBridgeTypeRef((BridgeTypeRef)value, diagnostics, context);
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.CHANNEL:
				return validateChannel((Channel)value, diagnostics, context);
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.CHANNEL_GROUP:
				return validateChannelGroup((ChannelGroup)value, diagnostics, context);
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.CHANNEL_GROUPS:
				return validateChannelGroups((ChannelGroups)value, diagnostics, context);
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.CHANNEL_GROUP_TYPE:
				return validateChannelGroupType((ChannelGroupType)value, diagnostics, context);
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.CHANNELS:
				return validateChannels((Channels)value, diagnostics, context);
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.CHANNEL_TYPE:
				return validateChannelType((ChannelType)value, diagnostics, context);
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.CONFIG_DESCRIPTION:
				return validateConfigDescription((ConfigDescription)value, diagnostics, context);
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.CONFIG_DESCRIPTION_REF:
				return validateConfigDescriptionRef((ConfigDescriptionRef)value, diagnostics, context);
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.CONFIG_DESCRIPTIONS_TYPE:
				return validateConfigDescriptionsType((ConfigDescriptionsType)value, diagnostics, context);
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.CRITERIA_TYPE:
				return validateCriteriaType((CriteriaType)value, diagnostics, context);
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.EVENT:
				return validateEvent((Event)value, diagnostics, context);
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.FILTER_TYPE:
				return validateFilterType((FilterType)value, diagnostics, context);
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.OPTION:
				return validateOption((Option)value, diagnostics, context);
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.OPTIONS:
				return validateOptions((Options)value, diagnostics, context);
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.OPTIONS_TYPE:
				return validateOptionsType((OptionsType)value, diagnostics, context);
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.OPTION_TYPE:
				return validateOptionType((OptionType)value, diagnostics, context);
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER:
				return validateParameter((Parameter)value, diagnostics, context);
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER_GROUP:
				return validateParameterGroup((ParameterGroup)value, diagnostics, context);
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PROPERTIES:
				return validateProperties((Properties)value, diagnostics, context);
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PROPERTY:
				return validateProperty((Property)value, diagnostics, context);
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.STATE:
				return validateState((State)value, diagnostics, context);
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.SUPPORTED_BRIDGE_TYPE_REFS:
				return validateSupportedBridgeTypeRefs((SupportedBridgeTypeRefs)value, diagnostics, context);
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.TAGS:
				return validateTags((Tags)value, diagnostics, context);
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_DESCRIPTIONS_TYPE:
				return validateThingDescriptionsType((ThingDescriptionsType)value, diagnostics, context);
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE:
				return validateThingType((ThingType)value, diagnostics, context);
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER_TYPE:
				return validateParameterType((ParameterType)value, diagnostics, context);
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.UNIT_TYPE:
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
	public boolean validateBridgeType(BridgeType bridgeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(bridgeType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(bridgeType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(bridgeType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(bridgeType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(bridgeType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(bridgeType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(bridgeType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(bridgeType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(bridgeType, diagnostics, context);
		if (result || diagnostics != null) result &= validateThingType_patternExtensible(bridgeType, diagnostics, context);
		if (result || diagnostics != null) result &= validateThingType_patternId(bridgeType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBridgeTypeRef(BridgeTypeRef bridgeTypeRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(bridgeTypeRef, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(bridgeTypeRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(bridgeTypeRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(bridgeTypeRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(bridgeTypeRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(bridgeTypeRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(bridgeTypeRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(bridgeTypeRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(bridgeTypeRef, diagnostics, context);
		if (result || diagnostics != null) result &= validateBridgeTypeRef_patternId(bridgeTypeRef, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the patternId constraint of '<em>Bridge Type Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BRIDGE_TYPE_REF__PATTERN_ID__EEXPRESSION = "self.id.matches('[A-Za-z0-9\\\\-_]+')";

	/**
	 * Validates the patternId constraint of '<em>Bridge Type Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBridgeTypeRef_patternId(BridgeTypeRef bridgeTypeRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.Literals.BRIDGE_TYPE_REF,
				 bridgeTypeRef,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternId",
				 BRIDGE_TYPE_REF__PATTERN_ID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChannel(Channel channel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(channel, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(channel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(channel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(channel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(channel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(channel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(channel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(channel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(channel, diagnostics, context);
		if (result || diagnostics != null) result &= validateChannel_patternId(channel, diagnostics, context);
		if (result || diagnostics != null) result &= validateChannel_patternTypeId(channel, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the patternId constraint of '<em>Channel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CHANNEL__PATTERN_ID__EEXPRESSION = "self.id.matches('[A-Za-z0-9\\\\-_]+')";

	/**
	 * Validates the patternId constraint of '<em>Channel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChannel_patternId(Channel channel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.Literals.CHANNEL,
				 channel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternId",
				 CHANNEL__PATTERN_ID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the patternTypeId constraint of '<em>Channel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CHANNEL__PATTERN_TYPE_ID__EEXPRESSION = "self.typeId.matches('[A-Za-z0-9\\\\-_.]+')";

	/**
	 * Validates the patternTypeId constraint of '<em>Channel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChannel_patternTypeId(Channel channel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.Literals.CHANNEL,
				 channel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternTypeId",
				 CHANNEL__PATTERN_TYPE_ID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChannelGroup(ChannelGroup channelGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(channelGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(channelGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(channelGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(channelGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(channelGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(channelGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(channelGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(channelGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(channelGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateChannelGroup_patternId(channelGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateChannelGroup_patternTypeId(channelGroup, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the patternId constraint of '<em>Channel Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CHANNEL_GROUP__PATTERN_ID__EEXPRESSION = "self.id.matches('[A-Za-z0-9\\\\-_]+')";

	/**
	 * Validates the patternId constraint of '<em>Channel Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChannelGroup_patternId(ChannelGroup channelGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.Literals.CHANNEL_GROUP,
				 channelGroup,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternId",
				 CHANNEL_GROUP__PATTERN_ID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the patternTypeId constraint of '<em>Channel Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CHANNEL_GROUP__PATTERN_TYPE_ID__EEXPRESSION = "self.typeId.matches('[A-Za-z0-9\\\\-_]+')";

	/**
	 * Validates the patternTypeId constraint of '<em>Channel Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChannelGroup_patternTypeId(ChannelGroup channelGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.Literals.CHANNEL_GROUP,
				 channelGroup,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternTypeId",
				 CHANNEL_GROUP__PATTERN_TYPE_ID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChannelGroups(ChannelGroups channelGroups, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(channelGroups, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChannelGroupType(ChannelGroupType channelGroupType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(channelGroupType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(channelGroupType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(channelGroupType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(channelGroupType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(channelGroupType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(channelGroupType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(channelGroupType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(channelGroupType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(channelGroupType, diagnostics, context);
		if (result || diagnostics != null) result &= validateChannelGroupType_patternId(channelGroupType, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the patternId constraint of '<em>Channel Group Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CHANNEL_GROUP_TYPE__PATTERN_ID__EEXPRESSION = "self.id.matches('[A-Za-z0-9\\\\-_]+')";

	/**
	 * Validates the patternId constraint of '<em>Channel Group Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChannelGroupType_patternId(ChannelGroupType channelGroupType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.Literals.CHANNEL_GROUP_TYPE,
				 channelGroupType,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternId",
				 CHANNEL_GROUP_TYPE__PATTERN_ID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChannels(Channels channels, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(channels, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChannelType(ChannelType channelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(channelType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(channelType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(channelType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(channelType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(channelType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(channelType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(channelType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(channelType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(channelType, diagnostics, context);
		if (result || diagnostics != null) result &= validateChannelType_patternId(channelType, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the patternId constraint of '<em>Channel Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CHANNEL_TYPE__PATTERN_ID__EEXPRESSION = "self.id.matches('[A-Za-z0-9\\\\-_]+')";

	/**
	 * Validates the patternId constraint of '<em>Channel Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChannelType_patternId(ChannelType channelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.Literals.CHANNEL_TYPE,
				 channelType,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternId",
				 CHANNEL_TYPE__PATTERN_ID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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
				(org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.Literals.CONFIG_DESCRIPTION,
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
				(org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.Literals.CONFIG_DESCRIPTION_REF,
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
	public boolean validateConfigDescriptionsType(ConfigDescriptionsType configDescriptionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(configDescriptionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCriteriaType(CriteriaType criteriaType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(criteriaType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvent(Event event, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(event, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFilterType(FilterType filterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(filterType, diagnostics, context);
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
	public boolean validateOptions(Options options, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(options, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOptionsType(OptionsType optionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(optionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOptionType(OptionType optionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(optionType, diagnostics, context);
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
	public boolean validateProperties(Properties properties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(properties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(property, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState(State state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(state, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupportedBridgeTypeRefs(SupportedBridgeTypeRefs supportedBridgeTypeRefs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(supportedBridgeTypeRefs, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTags(Tags tags, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tags, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThingDescriptionsType(ThingDescriptionsType thingDescriptionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(thingDescriptionsType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(thingDescriptionsType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(thingDescriptionsType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(thingDescriptionsType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(thingDescriptionsType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(thingDescriptionsType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(thingDescriptionsType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(thingDescriptionsType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(thingDescriptionsType, diagnostics, context);
		if (result || diagnostics != null) result &= validateThingDescriptionsType_patternBindingId(thingDescriptionsType, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the patternBindingId constraint of '<em>Thing Descriptions Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String THING_DESCRIPTIONS_TYPE__PATTERN_BINDING_ID__EEXPRESSION = "self.bindingId.matches('[A-Za-z0-9\\\\-_]+')";

	/**
	 * Validates the patternBindingId constraint of '<em>Thing Descriptions Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThingDescriptionsType_patternBindingId(ThingDescriptionsType thingDescriptionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.Literals.THING_DESCRIPTIONS_TYPE,
				 thingDescriptionsType,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternBindingId",
				 THING_DESCRIPTIONS_TYPE__PATTERN_BINDING_ID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThingType(ThingType thingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(thingType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(thingType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(thingType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(thingType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(thingType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(thingType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(thingType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(thingType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(thingType, diagnostics, context);
		if (result || diagnostics != null) result &= validateThingType_patternExtensible(thingType, diagnostics, context);
		if (result || diagnostics != null) result &= validateThingType_patternId(thingType, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the patternExtensible constraint of '<em>Thing Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String THING_TYPE__PATTERN_EXTENSIBLE__EEXPRESSION = "(self.extensible=null) or self.extensible.matches('[A-Za-z0-9\\\\-_.]+(,( )?[A-Za-z0-9\\\\-_.]+)*')";

	/**
	 * Validates the patternExtensible constraint of '<em>Thing Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThingType_patternExtensible(ThingType thingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.Literals.THING_TYPE,
				 thingType,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternExtensible",
				 THING_TYPE__PATTERN_EXTENSIBLE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the patternId constraint of '<em>Thing Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String THING_TYPE__PATTERN_ID__EEXPRESSION = "self.id.matches('[A-Za-z0-9\\\\-_]+')";

	/**
	 * Validates the patternId constraint of '<em>Thing Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThingType_patternId(ThingType thingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.Literals.THING_TYPE,
				 thingType,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternId",
				 THING_TYPE__PATTERN_ID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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

} //org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedValidator
