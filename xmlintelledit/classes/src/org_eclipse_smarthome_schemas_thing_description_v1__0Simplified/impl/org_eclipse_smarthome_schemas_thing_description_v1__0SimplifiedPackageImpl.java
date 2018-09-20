/**
 */
package org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.BridgeType;
import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.BridgeTypeRef;
import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Channel;
import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelGroup;
import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelGroupType;
import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelGroups;
import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelType;
import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Channels;
import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ConfigDescription;
import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ConfigDescriptionRef;
import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ConfigDescriptionsType;
import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.CriteriaType;
import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Event;
import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.FilterType;
import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Option;
import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.OptionType;
import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Options;
import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.OptionsType;
import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Parameter;
import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ParameterGroup;
import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ParameterType;
import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Properties;
import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Property;
import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.State;
import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.SupportedBridgeTypeRefs;
import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Tags;
import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingDescriptionsType;
import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingType;
import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.UnitType;
import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedFactory;
import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage;

import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.util.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl extends EPackageImpl implements org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bridgeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bridgeTypeRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass channelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass channelGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass channelGroupsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass channelGroupTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass channelsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass channelTypeEClass = null;

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
	private EClass configDescriptionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass criteriaTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterTypeEClass = null;

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
	private EClass optionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionTypeEClass = null;

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
	private EClass propertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supportedBridgeTypeRefsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thingDescriptionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thingTypeEClass = null;

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
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl() {
		super(eNS_URI, org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage init() {
		if (isInited) return (org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage)EPackage.Registry.INSTANCE.getEPackage(org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.eNS_URI);

		// Obtain or create and register package
		org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl theorg_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage = (org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theorg_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.createPackageContents();

		// Initialize created meta-data
		theorg_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theorg_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theorg_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.eNS_URI, theorg_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage);
		return theorg_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBridgeType() {
		return bridgeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBridgeTypeRef() {
		return bridgeTypeRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBridgeTypeRef_Id() {
		return (EAttribute)bridgeTypeRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChannel() {
		return channelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannel_Label() {
		return (EAttribute)channelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannel_Description() {
		return (EAttribute)channelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannel_Id() {
		return (EAttribute)channelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannel_TypeId() {
		return (EAttribute)channelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChannel_Properties() {
		return (EReference)channelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChannelGroup() {
		return channelGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannelGroup_Label() {
		return (EAttribute)channelGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannelGroup_Description() {
		return (EAttribute)channelGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannelGroup_Id() {
		return (EAttribute)channelGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannelGroup_TypeId() {
		return (EAttribute)channelGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChannelGroups() {
		return channelGroupsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChannelGroups_ChannelGroups() {
		return (EReference)channelGroupsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChannelGroupType() {
		return channelGroupTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannelGroupType_Label() {
		return (EAttribute)channelGroupTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannelGroupType_Description() {
		return (EAttribute)channelGroupTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannelGroupType_Category() {
		return (EAttribute)channelGroupTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannelGroupType_Advanced() {
		return (EAttribute)channelGroupTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannelGroupType_Id() {
		return (EAttribute)channelGroupTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChannelGroupType_Channels() {
		return (EReference)channelGroupTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChannels() {
		return channelsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChannels_Channels() {
		return (EReference)channelsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChannelType() {
		return channelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannelType_ItemType() {
		return (EAttribute)channelTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannelType_Kind() {
		return (EAttribute)channelTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannelType_Label() {
		return (EAttribute)channelTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannelType_Description() {
		return (EAttribute)channelTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannelType_Category() {
		return (EAttribute)channelTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannelType_Advanced() {
		return (EAttribute)channelTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannelType_Id() {
		return (EAttribute)channelTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannelType_System() {
		return (EAttribute)channelTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChannelType_Tags() {
		return (EReference)channelTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChannelType_State() {
		return (EReference)channelTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChannelType_Event() {
		return (EReference)channelTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChannelType_ConfigDescription() {
		return (EReference)channelTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChannelType_ConfigDescriptionRef() {
		return (EReference)channelTypeEClass.getEStructuralFeatures().get(12);
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
	public EClass getConfigDescriptionsType() {
		return configDescriptionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigDescriptionsType_ConfigDescriptions() {
		return (EReference)configDescriptionsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCriteriaType() {
		return criteriaTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCriteriaType_Value() {
		return (EAttribute)criteriaTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCriteriaType_Name() {
		return (EAttribute)criteriaTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvent_Options() {
		return (EReference)eventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilterType() {
		return filterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterType_Criterias() {
		return (EReference)filterTypeEClass.getEStructuralFeatures().get(0);
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
	public EClass getOptionsType() {
		return optionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptionsType_Options() {
		return (EReference)optionsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptionType() {
		return optionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptionType_Value() {
		return (EAttribute)optionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptionType_Value1() {
		return (EAttribute)optionTypeEClass.getEStructuralFeatures().get(1);
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
	public EClass getProperties() {
		return propertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperties_Propertys() {
		return (EReference)propertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Value() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Name() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_Pattern() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_ReadOnly() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Options() {
		return (EReference)stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupportedBridgeTypeRefs() {
		return supportedBridgeTypeRefsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupportedBridgeTypeRefs_BridgeTypeRefs() {
		return (EReference)supportedBridgeTypeRefsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTags() {
		return tagsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTags_Tags() {
		return (EAttribute)tagsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThingDescriptionsType() {
		return thingDescriptionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThingDescriptionsType_BindingId() {
		return (EAttribute)thingDescriptionsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThingDescriptionsType_ThingTypes() {
		return (EReference)thingDescriptionsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThingDescriptionsType_BridgeTypes() {
		return (EReference)thingDescriptionsTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThingDescriptionsType_ChannelTypes() {
		return (EReference)thingDescriptionsTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThingDescriptionsType_ChannelGroupTypes() {
		return (EReference)thingDescriptionsTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThingType() {
		return thingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThingType_Label() {
		return (EAttribute)thingTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThingType_Description() {
		return (EAttribute)thingTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThingType_Category() {
		return (EAttribute)thingTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThingType_RepresentationProperty() {
		return (EAttribute)thingTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThingType_Extensible() {
		return (EAttribute)thingTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThingType_Id() {
		return (EAttribute)thingTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThingType_Listed() {
		return (EAttribute)thingTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThingType_SupportedBridgeTypeRefs() {
		return (EReference)thingTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThingType_Channels() {
		return (EReference)thingTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThingType_ChannelGroups() {
		return (EReference)thingTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThingType_Properties() {
		return (EReference)thingTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThingType_ConfigDescription() {
		return (EReference)thingTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThingType_ConfigDescriptionRef() {
		return (EReference)thingTypeEClass.getEStructuralFeatures().get(12);
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
	public org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedFactory getorg_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedFactory() {
		return (org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedFactory)getEFactoryInstance();
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
		bridgeTypeEClass = createEClass(BRIDGE_TYPE);

		bridgeTypeRefEClass = createEClass(BRIDGE_TYPE_REF);
		createEAttribute(bridgeTypeRefEClass, BRIDGE_TYPE_REF__ID);

		channelEClass = createEClass(CHANNEL);
		createEAttribute(channelEClass, CHANNEL__LABEL);
		createEAttribute(channelEClass, CHANNEL__DESCRIPTION);
		createEAttribute(channelEClass, CHANNEL__ID);
		createEAttribute(channelEClass, CHANNEL__TYPE_ID);
		createEReference(channelEClass, CHANNEL__PROPERTIES);

		channelGroupEClass = createEClass(CHANNEL_GROUP);
		createEAttribute(channelGroupEClass, CHANNEL_GROUP__LABEL);
		createEAttribute(channelGroupEClass, CHANNEL_GROUP__DESCRIPTION);
		createEAttribute(channelGroupEClass, CHANNEL_GROUP__ID);
		createEAttribute(channelGroupEClass, CHANNEL_GROUP__TYPE_ID);

		channelGroupsEClass = createEClass(CHANNEL_GROUPS);
		createEReference(channelGroupsEClass, CHANNEL_GROUPS__CHANNEL_GROUPS);

		channelGroupTypeEClass = createEClass(CHANNEL_GROUP_TYPE);
		createEAttribute(channelGroupTypeEClass, CHANNEL_GROUP_TYPE__LABEL);
		createEAttribute(channelGroupTypeEClass, CHANNEL_GROUP_TYPE__DESCRIPTION);
		createEAttribute(channelGroupTypeEClass, CHANNEL_GROUP_TYPE__CATEGORY);
		createEAttribute(channelGroupTypeEClass, CHANNEL_GROUP_TYPE__ADVANCED);
		createEAttribute(channelGroupTypeEClass, CHANNEL_GROUP_TYPE__ID);
		createEReference(channelGroupTypeEClass, CHANNEL_GROUP_TYPE__CHANNELS);

		channelsEClass = createEClass(CHANNELS);
		createEReference(channelsEClass, CHANNELS__CHANNELS);

		channelTypeEClass = createEClass(CHANNEL_TYPE);
		createEAttribute(channelTypeEClass, CHANNEL_TYPE__ITEM_TYPE);
		createEAttribute(channelTypeEClass, CHANNEL_TYPE__KIND);
		createEAttribute(channelTypeEClass, CHANNEL_TYPE__LABEL);
		createEAttribute(channelTypeEClass, CHANNEL_TYPE__DESCRIPTION);
		createEAttribute(channelTypeEClass, CHANNEL_TYPE__CATEGORY);
		createEAttribute(channelTypeEClass, CHANNEL_TYPE__ADVANCED);
		createEAttribute(channelTypeEClass, CHANNEL_TYPE__ID);
		createEAttribute(channelTypeEClass, CHANNEL_TYPE__SYSTEM);
		createEReference(channelTypeEClass, CHANNEL_TYPE__TAGS);
		createEReference(channelTypeEClass, CHANNEL_TYPE__STATE);
		createEReference(channelTypeEClass, CHANNEL_TYPE__EVENT);
		createEReference(channelTypeEClass, CHANNEL_TYPE__CONFIG_DESCRIPTION);
		createEReference(channelTypeEClass, CHANNEL_TYPE__CONFIG_DESCRIPTION_REF);

		configDescriptionEClass = createEClass(CONFIG_DESCRIPTION);
		createEAttribute(configDescriptionEClass, CONFIG_DESCRIPTION__URI);
		createEReference(configDescriptionEClass, CONFIG_DESCRIPTION__PARAMETER_GROUPS);
		createEReference(configDescriptionEClass, CONFIG_DESCRIPTION__PARAMETERS);

		configDescriptionRefEClass = createEClass(CONFIG_DESCRIPTION_REF);
		createEAttribute(configDescriptionRefEClass, CONFIG_DESCRIPTION_REF__URI);

		configDescriptionsTypeEClass = createEClass(CONFIG_DESCRIPTIONS_TYPE);
		createEReference(configDescriptionsTypeEClass, CONFIG_DESCRIPTIONS_TYPE__CONFIG_DESCRIPTIONS);

		criteriaTypeEClass = createEClass(CRITERIA_TYPE);
		createEAttribute(criteriaTypeEClass, CRITERIA_TYPE__VALUE);
		createEAttribute(criteriaTypeEClass, CRITERIA_TYPE__NAME);

		eventEClass = createEClass(EVENT);
		createEReference(eventEClass, EVENT__OPTIONS);

		filterTypeEClass = createEClass(FILTER_TYPE);
		createEReference(filterTypeEClass, FILTER_TYPE__CRITERIAS);

		optionEClass = createEClass(OPTION);
		createEAttribute(optionEClass, OPTION__VALUE);
		createEAttribute(optionEClass, OPTION__VALUE1);

		optionsEClass = createEClass(OPTIONS);
		createEReference(optionsEClass, OPTIONS__OPTIONS);

		optionsTypeEClass = createEClass(OPTIONS_TYPE);
		createEReference(optionsTypeEClass, OPTIONS_TYPE__OPTIONS);

		optionTypeEClass = createEClass(OPTION_TYPE);
		createEAttribute(optionTypeEClass, OPTION_TYPE__VALUE);
		createEAttribute(optionTypeEClass, OPTION_TYPE__VALUE1);

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

		propertiesEClass = createEClass(PROPERTIES);
		createEReference(propertiesEClass, PROPERTIES__PROPERTYS);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__VALUE);
		createEAttribute(propertyEClass, PROPERTY__NAME);

		stateEClass = createEClass(STATE);
		createEAttribute(stateEClass, STATE__PATTERN);
		createEAttribute(stateEClass, STATE__READ_ONLY);
		createEReference(stateEClass, STATE__OPTIONS);

		supportedBridgeTypeRefsEClass = createEClass(SUPPORTED_BRIDGE_TYPE_REFS);
		createEReference(supportedBridgeTypeRefsEClass, SUPPORTED_BRIDGE_TYPE_REFS__BRIDGE_TYPE_REFS);

		tagsEClass = createEClass(TAGS);
		createEAttribute(tagsEClass, TAGS__TAGS);

		thingDescriptionsTypeEClass = createEClass(THING_DESCRIPTIONS_TYPE);
		createEAttribute(thingDescriptionsTypeEClass, THING_DESCRIPTIONS_TYPE__BINDING_ID);
		createEReference(thingDescriptionsTypeEClass, THING_DESCRIPTIONS_TYPE__THING_TYPES);
		createEReference(thingDescriptionsTypeEClass, THING_DESCRIPTIONS_TYPE__BRIDGE_TYPES);
		createEReference(thingDescriptionsTypeEClass, THING_DESCRIPTIONS_TYPE__CHANNEL_TYPES);
		createEReference(thingDescriptionsTypeEClass, THING_DESCRIPTIONS_TYPE__CHANNEL_GROUP_TYPES);

		thingTypeEClass = createEClass(THING_TYPE);
		createEAttribute(thingTypeEClass, THING_TYPE__LABEL);
		createEAttribute(thingTypeEClass, THING_TYPE__DESCRIPTION);
		createEAttribute(thingTypeEClass, THING_TYPE__CATEGORY);
		createEAttribute(thingTypeEClass, THING_TYPE__REPRESENTATION_PROPERTY);
		createEAttribute(thingTypeEClass, THING_TYPE__EXTENSIBLE);
		createEAttribute(thingTypeEClass, THING_TYPE__ID);
		createEAttribute(thingTypeEClass, THING_TYPE__LISTED);
		createEReference(thingTypeEClass, THING_TYPE__SUPPORTED_BRIDGE_TYPE_REFS);
		createEReference(thingTypeEClass, THING_TYPE__CHANNELS);
		createEReference(thingTypeEClass, THING_TYPE__CHANNEL_GROUPS);
		createEReference(thingTypeEClass, THING_TYPE__PROPERTIES);
		createEReference(thingTypeEClass, THING_TYPE__CONFIG_DESCRIPTION);
		createEReference(thingTypeEClass, THING_TYPE__CONFIG_DESCRIPTION_REF);

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
		bridgeTypeEClass.getESuperTypes().add(this.getThingType());

		// Initialize classes, features, and operations; add parameters
		initEClass(bridgeTypeEClass, BridgeType.class, "BridgeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bridgeTypeRefEClass, BridgeTypeRef.class, "BridgeTypeRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBridgeTypeRef_Id(), ecorePackage.getEString(), "id", null, 1, 1, BridgeTypeRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(channelEClass, Channel.class, "Channel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChannel_Label(), ecorePackage.getEString(), "label", null, 0, 1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChannel_Description(), ecorePackage.getEString(), "description", null, 0, 1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChannel_Id(), ecorePackage.getEString(), "id", null, 1, 1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChannel_TypeId(), ecorePackage.getEString(), "typeId", null, 1, 1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannel_Properties(), this.getProperties(), null, "properties", null, 0, 1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(channelGroupEClass, ChannelGroup.class, "ChannelGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChannelGroup_Label(), ecorePackage.getEString(), "label", null, 0, 1, ChannelGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChannelGroup_Description(), ecorePackage.getEString(), "description", null, 0, 1, ChannelGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChannelGroup_Id(), ecorePackage.getEString(), "id", null, 1, 1, ChannelGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChannelGroup_TypeId(), ecorePackage.getEString(), "typeId", null, 1, 1, ChannelGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(channelGroupsEClass, ChannelGroups.class, "ChannelGroups", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChannelGroups_ChannelGroups(), this.getChannelGroup(), null, "channelGroups", null, 1, -1, ChannelGroups.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(channelGroupTypeEClass, ChannelGroupType.class, "ChannelGroupType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChannelGroupType_Label(), ecorePackage.getEString(), "label", null, 1, 1, ChannelGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChannelGroupType_Description(), ecorePackage.getEString(), "description", null, 0, 1, ChannelGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChannelGroupType_Category(), ecorePackage.getEString(), "category", null, 0, 1, ChannelGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChannelGroupType_Advanced(), ecorePackage.getEBoolean(), "advanced", null, 0, 1, ChannelGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChannelGroupType_Id(), ecorePackage.getEString(), "id", null, 1, 1, ChannelGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannelGroupType_Channels(), this.getChannels(), null, "channels", null, 1, 1, ChannelGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(channelsEClass, Channels.class, "Channels", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChannels_Channels(), this.getChannel(), null, "channels", null, 1, -1, Channels.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(channelTypeEClass, ChannelType.class, "ChannelType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChannelType_ItemType(), ecorePackage.getEString(), "itemType", null, 0, 1, ChannelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChannelType_Kind(), ecorePackage.getEString(), "kind", null, 0, 1, ChannelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChannelType_Label(), ecorePackage.getEString(), "label", null, 1, 1, ChannelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChannelType_Description(), ecorePackage.getEString(), "description", null, 0, 1, ChannelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChannelType_Category(), ecorePackage.getEString(), "category", null, 0, 1, ChannelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChannelType_Advanced(), ecorePackage.getEBoolean(), "advanced", null, 0, 1, ChannelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChannelType_Id(), ecorePackage.getEString(), "id", null, 1, 1, ChannelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChannelType_System(), ecorePackage.getEBoolean(), "system", null, 0, 1, ChannelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannelType_Tags(), this.getTags(), null, "tags", null, 0, 1, ChannelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannelType_State(), this.getState(), null, "state", null, 0, 1, ChannelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannelType_Event(), this.getEvent(), null, "event", null, 0, 1, ChannelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannelType_ConfigDescription(), this.getConfigDescription(), null, "configDescription", null, 0, 1, ChannelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannelType_ConfigDescriptionRef(), this.getConfigDescriptionRef(), null, "configDescriptionRef", null, 0, 1, ChannelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configDescriptionEClass, ConfigDescription.class, "ConfigDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfigDescription_Uri(), ecorePackage.getEString(), "uri", null, 0, 1, ConfigDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigDescription_ParameterGroups(), this.getParameterGroup(), null, "parameterGroups", null, 0, -1, ConfigDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigDescription_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, ConfigDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configDescriptionRefEClass, ConfigDescriptionRef.class, "ConfigDescriptionRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfigDescriptionRef_Uri(), ecorePackage.getEString(), "uri", null, 1, 1, ConfigDescriptionRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configDescriptionsTypeEClass, ConfigDescriptionsType.class, "ConfigDescriptionsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfigDescriptionsType_ConfigDescriptions(), this.getConfigDescription(), null, "configDescriptions", null, 1, -1, ConfigDescriptionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(criteriaTypeEClass, CriteriaType.class, "CriteriaType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCriteriaType_Value(), ecorePackage.getEString(), "value", null, 0, 1, CriteriaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCriteriaType_Name(), ecorePackage.getEString(), "name", null, 1, 1, CriteriaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvent_Options(), this.getOptions(), null, "options", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filterTypeEClass, FilterType.class, "FilterType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFilterType_Criterias(), this.getCriteriaType(), null, "criterias", null, 0, -1, FilterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optionEClass, Option.class, "Option", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOption_Value(), ecorePackage.getEString(), "value", null, 0, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOption_Value1(), ecorePackage.getEString(), "value1", null, 1, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optionsEClass, Options.class, "Options", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOptions_Options(), this.getOption(), null, "options", null, 1, -1, Options.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optionsTypeEClass, OptionsType.class, "OptionsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOptionsType_Options(), this.getOptionType(), null, "options", null, 0, -1, OptionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optionTypeEClass, OptionType.class, "OptionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOptionType_Value(), ecorePackage.getEString(), "value", null, 0, 1, OptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOptionType_Value1(), ecorePackage.getEString(), "value1", null, 1, 1, OptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEReference(getParameter_Options(), this.getOptionsType(), null, "options", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_Filter(), this.getFilterType(), null, "filter", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterGroupEClass, ParameterGroup.class, "ParameterGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterGroup_Label(), ecorePackage.getEString(), "label", null, 0, 1, ParameterGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterGroup_Description(), ecorePackage.getEString(), "description", null, 0, 1, ParameterGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterGroup_Context(), ecorePackage.getEString(), "context", null, 0, 1, ParameterGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterGroup_Advanced(), ecorePackage.getEBoolean(), "advanced", null, 0, 1, ParameterGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterGroup_Name(), ecorePackage.getEString(), "name", null, 1, 1, ParameterGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertiesEClass, Properties.class, "Properties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProperties_Propertys(), this.getProperty(), null, "propertys", null, 1, -1, Properties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Value(), ecorePackage.getEString(), "value", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Name(), ecorePackage.getEString(), "name", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getState_Pattern(), ecorePackage.getEString(), "pattern", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_ReadOnly(), ecorePackage.getEBoolean(), "readOnly", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Options(), this.getOptions(), null, "options", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(supportedBridgeTypeRefsEClass, SupportedBridgeTypeRefs.class, "SupportedBridgeTypeRefs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSupportedBridgeTypeRefs_BridgeTypeRefs(), this.getBridgeTypeRef(), null, "bridgeTypeRefs", null, 1, -1, SupportedBridgeTypeRefs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tagsEClass, Tags.class, "Tags", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTags_Tags(), ecorePackage.getEString(), "tags", null, 1, -1, Tags.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(thingDescriptionsTypeEClass, ThingDescriptionsType.class, "ThingDescriptionsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThingDescriptionsType_BindingId(), ecorePackage.getEString(), "bindingId", null, 1, 1, ThingDescriptionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThingDescriptionsType_ThingTypes(), this.getThingType(), null, "thingTypes", null, 0, -1, ThingDescriptionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThingDescriptionsType_BridgeTypes(), this.getBridgeType(), null, "bridgeTypes", null, 0, -1, ThingDescriptionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThingDescriptionsType_ChannelTypes(), this.getChannelType(), null, "channelTypes", null, 0, -1, ThingDescriptionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThingDescriptionsType_ChannelGroupTypes(), this.getChannelGroupType(), null, "channelGroupTypes", null, 0, -1, ThingDescriptionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(thingTypeEClass, ThingType.class, "ThingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThingType_Label(), ecorePackage.getEString(), "label", null, 1, 1, ThingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThingType_Description(), ecorePackage.getEString(), "description", null, 0, 1, ThingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThingType_Category(), ecorePackage.getEString(), "category", null, 0, 1, ThingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThingType_RepresentationProperty(), ecorePackage.getEString(), "representationProperty", null, 0, 1, ThingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThingType_Extensible(), ecorePackage.getEString(), "extensible", null, 0, 1, ThingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThingType_Id(), ecorePackage.getEString(), "id", null, 1, 1, ThingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThingType_Listed(), ecorePackage.getEBoolean(), "listed", null, 0, 1, ThingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThingType_SupportedBridgeTypeRefs(), this.getSupportedBridgeTypeRefs(), null, "supportedBridgeTypeRefs", null, 0, 1, ThingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThingType_Channels(), this.getChannels(), null, "channels", null, 0, 1, ThingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThingType_ChannelGroups(), this.getChannelGroups(), null, "channelGroups", null, 0, 1, ThingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThingType_Properties(), this.getProperties(), null, "properties", null, 0, 1, ThingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThingType_ConfigDescription(), this.getConfigDescription(), null, "configDescription", null, 0, 1, ThingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThingType_ConfigDescriptionRef(), this.getConfigDescriptionRef(), null, "configDescriptionRef", null, 0, 1, ThingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		addEEnumLiteral(unitTypeEEnum, UnitType.G);
		addEEnumLiteral(unitTypeEEnum, UnitType.MS2);
		addEEnumLiteral(unitTypeEEnum, UnitType.M2V);
		addEEnumLiteral(unitTypeEEnum, UnitType.M3);
		addEEnumLiteral(unitTypeEEnum, UnitType.KPH);
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
		  (bridgeTypeRefEClass, 
		   source, 
		   new String[] {
			 "constraints", "patternId"
		   });	
		addAnnotation
		  (channelEClass, 
		   source, 
		   new String[] {
			 "constraints", "patternId patternTypeId"
		   });	
		addAnnotation
		  (channelGroupEClass, 
		   source, 
		   new String[] {
			 "constraints", "patternId patternTypeId"
		   });	
		addAnnotation
		  (channelGroupTypeEClass, 
		   source, 
		   new String[] {
			 "constraints", "patternId"
		   });	
		addAnnotation
		  (channelTypeEClass, 
		   source, 
		   new String[] {
			 "constraints", "patternId"
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
		addAnnotation
		  (thingDescriptionsTypeEClass, 
		   source, 
		   new String[] {
			 "constraints", "patternBindingId"
		   });	
		addAnnotation
		  (thingTypeEClass, 
		   source, 
		   new String[] {
			 "constraints", "patternExtensible patternId"
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
		  (bridgeTypeRefEClass, 
		   source, 
		   new String[] {
			 "patternId", "self.id.matches(\'[A-Za-z0-9\\\\-_]+\')"
		   });	
		addAnnotation
		  (channelEClass, 
		   source, 
		   new String[] {
			 "patternId", "self.id.matches(\'[A-Za-z0-9\\\\-_]+\')",
			 "patternTypeId", "self.typeId.matches(\'[A-Za-z0-9\\\\-_.]+\')"
		   });	
		addAnnotation
		  (channelGroupEClass, 
		   source, 
		   new String[] {
			 "patternId", "self.id.matches(\'[A-Za-z0-9\\\\-_]+\')",
			 "patternTypeId", "self.typeId.matches(\'[A-Za-z0-9\\\\-_]+\')"
		   });	
		addAnnotation
		  (channelGroupTypeEClass, 
		   source, 
		   new String[] {
			 "patternId", "self.id.matches(\'[A-Za-z0-9\\\\-_]+\')"
		   });	
		addAnnotation
		  (channelTypeEClass, 
		   source, 
		   new String[] {
			 "patternId", "self.id.matches(\'[A-Za-z0-9\\\\-_]+\')"
		   });	
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
		addAnnotation
		  (thingDescriptionsTypeEClass, 
		   source, 
		   new String[] {
			 "patternBindingId", "self.bindingId.matches(\'[A-Za-z0-9\\\\-_]+\')"
		   });	
		addAnnotation
		  (thingTypeEClass, 
		   source, 
		   new String[] {
			 "patternExtensible", "(self.extensible=null) or self.extensible.matches(\'[A-Za-z0-9\\\\-_.]+(,( )?[A-Za-z0-9\\\\-_.]+)*\')",
			 "patternId", "self.id.matches(\'[A-Za-z0-9\\\\-_]+\')"
		   });
	}

} //org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl
