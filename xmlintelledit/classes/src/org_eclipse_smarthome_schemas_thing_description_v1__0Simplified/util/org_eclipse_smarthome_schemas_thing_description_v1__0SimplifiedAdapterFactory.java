/**
 */
package org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage
 * @generated
 */
public class org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedSwitch<Adapter> modelSwitch =
		new org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedSwitch<Adapter>() {
			@Override
			public Adapter caseBridgeType(BridgeType object) {
				return createBridgeTypeAdapter();
			}
			@Override
			public Adapter caseBridgeTypeRef(BridgeTypeRef object) {
				return createBridgeTypeRefAdapter();
			}
			@Override
			public Adapter caseChannel(Channel object) {
				return createChannelAdapter();
			}
			@Override
			public Adapter caseChannelGroup(ChannelGroup object) {
				return createChannelGroupAdapter();
			}
			@Override
			public Adapter caseChannelGroups(ChannelGroups object) {
				return createChannelGroupsAdapter();
			}
			@Override
			public Adapter caseChannelGroupType(ChannelGroupType object) {
				return createChannelGroupTypeAdapter();
			}
			@Override
			public Adapter caseChannels(Channels object) {
				return createChannelsAdapter();
			}
			@Override
			public Adapter caseChannelType(ChannelType object) {
				return createChannelTypeAdapter();
			}
			@Override
			public Adapter caseConfigDescription(ConfigDescription object) {
				return createConfigDescriptionAdapter();
			}
			@Override
			public Adapter caseConfigDescriptionRef(ConfigDescriptionRef object) {
				return createConfigDescriptionRefAdapter();
			}
			@Override
			public Adapter caseConfigDescriptionsType(ConfigDescriptionsType object) {
				return createConfigDescriptionsTypeAdapter();
			}
			@Override
			public Adapter caseCriteriaType(CriteriaType object) {
				return createCriteriaTypeAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter caseFilterType(FilterType object) {
				return createFilterTypeAdapter();
			}
			@Override
			public Adapter caseOption(Option object) {
				return createOptionAdapter();
			}
			@Override
			public Adapter caseOptions(Options object) {
				return createOptionsAdapter();
			}
			@Override
			public Adapter caseOptionsType(OptionsType object) {
				return createOptionsTypeAdapter();
			}
			@Override
			public Adapter caseOptionType(OptionType object) {
				return createOptionTypeAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseParameterGroup(ParameterGroup object) {
				return createParameterGroupAdapter();
			}
			@Override
			public Adapter caseProperties(Properties object) {
				return createPropertiesAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseState(State object) {
				return createStateAdapter();
			}
			@Override
			public Adapter caseSupportedBridgeTypeRefs(SupportedBridgeTypeRefs object) {
				return createSupportedBridgeTypeRefsAdapter();
			}
			@Override
			public Adapter caseTags(Tags object) {
				return createTagsAdapter();
			}
			@Override
			public Adapter caseThingDescriptionsType(ThingDescriptionsType object) {
				return createThingDescriptionsTypeAdapter();
			}
			@Override
			public Adapter caseThingType(ThingType object) {
				return createThingTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.BridgeType <em>Bridge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.BridgeType
	 * @generated
	 */
	public Adapter createBridgeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.BridgeTypeRef <em>Bridge Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.BridgeTypeRef
	 * @generated
	 */
	public Adapter createBridgeTypeRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Channel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Channel
	 * @generated
	 */
	public Adapter createChannelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelGroup <em>Channel Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelGroup
	 * @generated
	 */
	public Adapter createChannelGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelGroups <em>Channel Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelGroups
	 * @generated
	 */
	public Adapter createChannelGroupsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelGroupType <em>Channel Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelGroupType
	 * @generated
	 */
	public Adapter createChannelGroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Channels <em>Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Channels
	 * @generated
	 */
	public Adapter createChannelsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelType <em>Channel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelType
	 * @generated
	 */
	public Adapter createChannelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ConfigDescription <em>Config Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ConfigDescription
	 * @generated
	 */
	public Adapter createConfigDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ConfigDescriptionRef <em>Config Description Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ConfigDescriptionRef
	 * @generated
	 */
	public Adapter createConfigDescriptionRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ConfigDescriptionsType <em>Config Descriptions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ConfigDescriptionsType
	 * @generated
	 */
	public Adapter createConfigDescriptionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.CriteriaType <em>Criteria Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.CriteriaType
	 * @generated
	 */
	public Adapter createCriteriaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.FilterType <em>Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.FilterType
	 * @generated
	 */
	public Adapter createFilterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Option
	 * @generated
	 */
	public Adapter createOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Options <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Options
	 * @generated
	 */
	public Adapter createOptionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.OptionsType <em>Options Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.OptionsType
	 * @generated
	 */
	public Adapter createOptionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.OptionType <em>Option Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.OptionType
	 * @generated
	 */
	public Adapter createOptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ParameterGroup <em>Parameter Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ParameterGroup
	 * @generated
	 */
	public Adapter createParameterGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Properties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Properties
	 * @generated
	 */
	public Adapter createPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.SupportedBridgeTypeRefs <em>Supported Bridge Type Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.SupportedBridgeTypeRefs
	 * @generated
	 */
	public Adapter createSupportedBridgeTypeRefsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Tags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Tags
	 * @generated
	 */
	public Adapter createTagsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingDescriptionsType <em>Thing Descriptions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingDescriptionsType
	 * @generated
	 */
	public Adapter createThingDescriptionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingType <em>Thing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingType
	 * @generated
	 */
	public Adapter createThingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedAdapterFactory
