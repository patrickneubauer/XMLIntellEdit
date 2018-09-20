/**
 */
package org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage
 * @generated
 */
public class org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedSwitch() {
		if (modelPackage == null) {
			modelPackage = org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.BRIDGE_TYPE: {
				BridgeType bridgeType = (BridgeType)theEObject;
				T result = caseBridgeType(bridgeType);
				if (result == null) result = caseThingType(bridgeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.BRIDGE_TYPE_REF: {
				BridgeTypeRef bridgeTypeRef = (BridgeTypeRef)theEObject;
				T result = caseBridgeTypeRef(bridgeTypeRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.CHANNEL: {
				Channel channel = (Channel)theEObject;
				T result = caseChannel(channel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.CHANNEL_GROUP: {
				ChannelGroup channelGroup = (ChannelGroup)theEObject;
				T result = caseChannelGroup(channelGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.CHANNEL_GROUPS: {
				ChannelGroups channelGroups = (ChannelGroups)theEObject;
				T result = caseChannelGroups(channelGroups);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.CHANNEL_GROUP_TYPE: {
				ChannelGroupType channelGroupType = (ChannelGroupType)theEObject;
				T result = caseChannelGroupType(channelGroupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.CHANNELS: {
				Channels channels = (Channels)theEObject;
				T result = caseChannels(channels);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.CHANNEL_TYPE: {
				ChannelType channelType = (ChannelType)theEObject;
				T result = caseChannelType(channelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.CONFIG_DESCRIPTION: {
				ConfigDescription configDescription = (ConfigDescription)theEObject;
				T result = caseConfigDescription(configDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.CONFIG_DESCRIPTION_REF: {
				ConfigDescriptionRef configDescriptionRef = (ConfigDescriptionRef)theEObject;
				T result = caseConfigDescriptionRef(configDescriptionRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.CONFIG_DESCRIPTIONS_TYPE: {
				ConfigDescriptionsType configDescriptionsType = (ConfigDescriptionsType)theEObject;
				T result = caseConfigDescriptionsType(configDescriptionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.CRITERIA_TYPE: {
				CriteriaType criteriaType = (CriteriaType)theEObject;
				T result = caseCriteriaType(criteriaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.EVENT: {
				Event event = (Event)theEObject;
				T result = caseEvent(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.FILTER_TYPE: {
				FilterType filterType = (FilterType)theEObject;
				T result = caseFilterType(filterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.OPTION: {
				Option option = (Option)theEObject;
				T result = caseOption(option);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.OPTIONS: {
				Options options = (Options)theEObject;
				T result = caseOptions(options);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.OPTIONS_TYPE: {
				OptionsType optionsType = (OptionsType)theEObject;
				T result = caseOptionsType(optionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.OPTION_TYPE: {
				OptionType optionType = (OptionType)theEObject;
				T result = caseOptionType(optionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PARAMETER_GROUP: {
				ParameterGroup parameterGroup = (ParameterGroup)theEObject;
				T result = caseParameterGroup(parameterGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PROPERTIES: {
				Properties properties = (Properties)theEObject;
				T result = caseProperties(properties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.STATE: {
				State state = (State)theEObject;
				T result = caseState(state);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.SUPPORTED_BRIDGE_TYPE_REFS: {
				SupportedBridgeTypeRefs supportedBridgeTypeRefs = (SupportedBridgeTypeRefs)theEObject;
				T result = caseSupportedBridgeTypeRefs(supportedBridgeTypeRefs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.TAGS: {
				Tags tags = (Tags)theEObject;
				T result = caseTags(tags);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_DESCRIPTIONS_TYPE: {
				ThingDescriptionsType thingDescriptionsType = (ThingDescriptionsType)theEObject;
				T result = caseThingDescriptionsType(thingDescriptionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE: {
				ThingType thingType = (ThingType)theEObject;
				T result = caseThingType(thingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bridge Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bridge Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBridgeType(BridgeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bridge Type Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bridge Type Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBridgeTypeRef(BridgeTypeRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Channel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Channel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChannel(Channel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Channel Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Channel Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChannelGroup(ChannelGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Channel Groups</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Channel Groups</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChannelGroups(ChannelGroups object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Channel Group Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Channel Group Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChannelGroupType(ChannelGroupType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Channels</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Channels</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChannels(Channels object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Channel Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Channel Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChannelType(ChannelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Config Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Config Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigDescription(ConfigDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Config Description Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Config Description Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigDescriptionRef(ConfigDescriptionRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Config Descriptions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Config Descriptions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigDescriptionsType(ConfigDescriptionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Criteria Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Criteria Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCriteriaType(CriteriaType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilterType(FilterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOption(Option object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Options</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Options</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptions(Options object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Options Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Options Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptionsType(OptionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Option Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Option Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptionType(OptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterGroup(ParameterGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperties(Properties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseState(State object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supported Bridge Type Refs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supported Bridge Type Refs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupportedBridgeTypeRefs(SupportedBridgeTypeRefs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tags</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tags</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTags(Tags object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thing Descriptions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thing Descriptions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThingDescriptionsType(ThingDescriptionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thing Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thing Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThingType(ThingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedSwitch
