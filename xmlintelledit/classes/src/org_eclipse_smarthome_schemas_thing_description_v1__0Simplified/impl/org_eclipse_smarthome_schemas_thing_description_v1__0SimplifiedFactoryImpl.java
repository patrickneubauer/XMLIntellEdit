/**
 */
package org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedFactoryImpl extends EFactoryImpl implements org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedFactory init() {
		try {
			org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedFactory theorg_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedFactory = (org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedFactory)EPackage.Registry.INSTANCE.getEFactory(org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.eNS_URI);
			if (theorg_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedFactory != null) {
				return theorg_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedFactoryImpl() {
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
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.BRIDGE_TYPE: return createBridgeType();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.BRIDGE_TYPE_REF: return createBridgeTypeRef();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.CHANNEL: return createChannel();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.CHANNEL_GROUP: return createChannelGroup();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.CHANNEL_GROUPS: return createChannelGroups();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.CHANNEL_GROUP_TYPE: return createChannelGroupType();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.CHANNELS: return createChannels();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.CHANNEL_TYPE: return createChannelType();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.CONFIG_DESCRIPTION: return createConfigDescription();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.CONFIG_DESCRIPTION_REF: return createConfigDescriptionRef();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.CONFIG_DESCRIPTIONS_TYPE: return createConfigDescriptionsType();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.CRITERIA_TYPE: return createCriteriaType();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.EVENT: return createEvent();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.FILTER_TYPE: return createFilterType();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.OPTION: return createOption();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.OPTIONS: return createOptions();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.OPTIONS_TYPE: return createOptionsType();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.OPTION_TYPE: return createOptionType();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER: return createParameter();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER_GROUP: return createParameterGroup();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PROPERTIES: return createProperties();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PROPERTY: return createProperty();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.STATE: return createState();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.SUPPORTED_BRIDGE_TYPE_REFS: return createSupportedBridgeTypeRefs();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.TAGS: return createTags();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_DESCRIPTIONS_TYPE: return createThingDescriptionsType();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE: return createThingType();
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
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER_TYPE:
				return createParameterTypeFromString(eDataType, initialValue);
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.UNIT_TYPE:
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
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER_TYPE:
				return convertParameterTypeToString(eDataType, instanceValue);
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.UNIT_TYPE:
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
	public BridgeType createBridgeType() {
		BridgeTypeImpl bridgeType = new BridgeTypeImpl();
		return bridgeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BridgeTypeRef createBridgeTypeRef() {
		BridgeTypeRefImpl bridgeTypeRef = new BridgeTypeRefImpl();
		return bridgeTypeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channel createChannel() {
		ChannelImpl channel = new ChannelImpl();
		return channel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelGroup createChannelGroup() {
		ChannelGroupImpl channelGroup = new ChannelGroupImpl();
		return channelGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelGroups createChannelGroups() {
		ChannelGroupsImpl channelGroups = new ChannelGroupsImpl();
		return channelGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelGroupType createChannelGroupType() {
		ChannelGroupTypeImpl channelGroupType = new ChannelGroupTypeImpl();
		return channelGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channels createChannels() {
		ChannelsImpl channels = new ChannelsImpl();
		return channels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelType createChannelType() {
		ChannelTypeImpl channelType = new ChannelTypeImpl();
		return channelType;
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
	public ConfigDescriptionsType createConfigDescriptionsType() {
		ConfigDescriptionsTypeImpl configDescriptionsType = new ConfigDescriptionsTypeImpl();
		return configDescriptionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CriteriaType createCriteriaType() {
		CriteriaTypeImpl criteriaType = new CriteriaTypeImpl();
		return criteriaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterType createFilterType() {
		FilterTypeImpl filterType = new FilterTypeImpl();
		return filterType;
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
	public Options createOptions() {
		OptionsImpl options = new OptionsImpl();
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionsType createOptionsType() {
		OptionsTypeImpl optionsType = new OptionsTypeImpl();
		return optionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionType createOptionType() {
		OptionTypeImpl optionType = new OptionTypeImpl();
		return optionType;
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
	public Properties createProperties() {
		PropertiesImpl properties = new PropertiesImpl();
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupportedBridgeTypeRefs createSupportedBridgeTypeRefs() {
		SupportedBridgeTypeRefsImpl supportedBridgeTypeRefs = new SupportedBridgeTypeRefsImpl();
		return supportedBridgeTypeRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tags createTags() {
		TagsImpl tags = new TagsImpl();
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThingDescriptionsType createThingDescriptionsType() {
		ThingDescriptionsTypeImpl thingDescriptionsType = new ThingDescriptionsTypeImpl();
		return thingDescriptionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThingType createThingType() {
		ThingTypeImpl thingType = new ThingTypeImpl();
		return thingType;
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
	public org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage getorg_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage() {
		return (org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage getPackage() {
		return org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.eINSTANCE;
	}

} //org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedFactoryImpl
