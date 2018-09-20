/**
 */
package org_eclipse_smarthome_schemas_thing_description_v1__0Simplified;

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
 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "org_eclipse_smarthome_schemas_thing_description_v1__0Simplified";

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
	org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage eINSTANCE = org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl.init();

	/**
	 * The meta object id for the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ThingTypeImpl <em>Thing Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ThingTypeImpl
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl#getThingType()
	 * @generated
	 */
	int THING_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_TYPE__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_TYPE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_TYPE__CATEGORY = 2;

	/**
	 * The feature id for the '<em><b>Representation Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_TYPE__REPRESENTATION_PROPERTY = 3;

	/**
	 * The feature id for the '<em><b>Extensible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_TYPE__EXTENSIBLE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_TYPE__ID = 5;

	/**
	 * The feature id for the '<em><b>Listed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_TYPE__LISTED = 6;

	/**
	 * The feature id for the '<em><b>Supported Bridge Type Refs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_TYPE__SUPPORTED_BRIDGE_TYPE_REFS = 7;

	/**
	 * The feature id for the '<em><b>Channels</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_TYPE__CHANNELS = 8;

	/**
	 * The feature id for the '<em><b>Channel Groups</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_TYPE__CHANNEL_GROUPS = 9;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_TYPE__PROPERTIES = 10;

	/**
	 * The feature id for the '<em><b>Config Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_TYPE__CONFIG_DESCRIPTION = 11;

	/**
	 * The feature id for the '<em><b>Config Description Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_TYPE__CONFIG_DESCRIPTION_REF = 12;

	/**
	 * The number of structural features of the '<em>Thing Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_TYPE_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Thing Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.BridgeTypeImpl <em>Bridge Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.BridgeTypeImpl
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl#getBridgeType()
	 * @generated
	 */
	int BRIDGE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_TYPE__LABEL = THING_TYPE__LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_TYPE__DESCRIPTION = THING_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_TYPE__CATEGORY = THING_TYPE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Representation Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_TYPE__REPRESENTATION_PROPERTY = THING_TYPE__REPRESENTATION_PROPERTY;

	/**
	 * The feature id for the '<em><b>Extensible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_TYPE__EXTENSIBLE = THING_TYPE__EXTENSIBLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_TYPE__ID = THING_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Listed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_TYPE__LISTED = THING_TYPE__LISTED;

	/**
	 * The feature id for the '<em><b>Supported Bridge Type Refs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_TYPE__SUPPORTED_BRIDGE_TYPE_REFS = THING_TYPE__SUPPORTED_BRIDGE_TYPE_REFS;

	/**
	 * The feature id for the '<em><b>Channels</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_TYPE__CHANNELS = THING_TYPE__CHANNELS;

	/**
	 * The feature id for the '<em><b>Channel Groups</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_TYPE__CHANNEL_GROUPS = THING_TYPE__CHANNEL_GROUPS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_TYPE__PROPERTIES = THING_TYPE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Config Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_TYPE__CONFIG_DESCRIPTION = THING_TYPE__CONFIG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Config Description Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_TYPE__CONFIG_DESCRIPTION_REF = THING_TYPE__CONFIG_DESCRIPTION_REF;

	/**
	 * The number of structural features of the '<em>Bridge Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_TYPE_FEATURE_COUNT = THING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bridge Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_TYPE_OPERATION_COUNT = THING_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.BridgeTypeRefImpl <em>Bridge Type Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.BridgeTypeRefImpl
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl#getBridgeTypeRef()
	 * @generated
	 */
	int BRIDGE_TYPE_REF = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_TYPE_REF__ID = 0;

	/**
	 * The number of structural features of the '<em>Bridge Type Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_TYPE_REF_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Bridge Type Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRIDGE_TYPE_REF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ChannelImpl <em>Channel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ChannelImpl
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl#getChannel()
	 * @generated
	 */
	int CHANNEL = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__ID = 2;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__TYPE_ID = 3;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__PROPERTIES = 4;

	/**
	 * The number of structural features of the '<em>Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ChannelGroupImpl <em>Channel Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ChannelGroupImpl
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl#getChannelGroup()
	 * @generated
	 */
	int CHANNEL_GROUP = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_GROUP__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_GROUP__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_GROUP__ID = 2;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_GROUP__TYPE_ID = 3;

	/**
	 * The number of structural features of the '<em>Channel Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_GROUP_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Channel Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ChannelGroupsImpl <em>Channel Groups</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ChannelGroupsImpl
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl#getChannelGroups()
	 * @generated
	 */
	int CHANNEL_GROUPS = 4;

	/**
	 * The feature id for the '<em><b>Channel Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_GROUPS__CHANNEL_GROUPS = 0;

	/**
	 * The number of structural features of the '<em>Channel Groups</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_GROUPS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Channel Groups</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_GROUPS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ChannelGroupTypeImpl <em>Channel Group Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ChannelGroupTypeImpl
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl#getChannelGroupType()
	 * @generated
	 */
	int CHANNEL_GROUP_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_GROUP_TYPE__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_GROUP_TYPE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_GROUP_TYPE__CATEGORY = 2;

	/**
	 * The feature id for the '<em><b>Advanced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_GROUP_TYPE__ADVANCED = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_GROUP_TYPE__ID = 4;

	/**
	 * The feature id for the '<em><b>Channels</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_GROUP_TYPE__CHANNELS = 5;

	/**
	 * The number of structural features of the '<em>Channel Group Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_GROUP_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Channel Group Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_GROUP_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ChannelsImpl <em>Channels</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ChannelsImpl
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl#getChannels()
	 * @generated
	 */
	int CHANNELS = 6;

	/**
	 * The feature id for the '<em><b>Channels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNELS__CHANNELS = 0;

	/**
	 * The number of structural features of the '<em>Channels</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNELS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Channels</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNELS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ChannelTypeImpl <em>Channel Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ChannelTypeImpl
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl#getChannelType()
	 * @generated
	 */
	int CHANNEL_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Item Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__ITEM_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__KIND = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__LABEL = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__CATEGORY = 4;

	/**
	 * The feature id for the '<em><b>Advanced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__ADVANCED = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__ID = 6;

	/**
	 * The feature id for the '<em><b>System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__SYSTEM = 7;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__TAGS = 8;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__STATE = 9;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__EVENT = 10;

	/**
	 * The feature id for the '<em><b>Config Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__CONFIG_DESCRIPTION = 11;

	/**
	 * The feature id for the '<em><b>Config Description Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE__CONFIG_DESCRIPTION_REF = 12;

	/**
	 * The number of structural features of the '<em>Channel Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Channel Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ConfigDescriptionImpl <em>Config Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ConfigDescriptionImpl
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl#getConfigDescription()
	 * @generated
	 */
	int CONFIG_DESCRIPTION = 8;

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
	 * The meta object id for the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ConfigDescriptionRefImpl <em>Config Description Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ConfigDescriptionRefImpl
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl#getConfigDescriptionRef()
	 * @generated
	 */
	int CONFIG_DESCRIPTION_REF = 9;

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
	 * The meta object id for the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ConfigDescriptionsTypeImpl <em>Config Descriptions Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ConfigDescriptionsTypeImpl
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl#getConfigDescriptionsType()
	 * @generated
	 */
	int CONFIG_DESCRIPTIONS_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Config Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_DESCRIPTIONS_TYPE__CONFIG_DESCRIPTIONS = 0;

	/**
	 * The number of structural features of the '<em>Config Descriptions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_DESCRIPTIONS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Config Descriptions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_DESCRIPTIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.CriteriaTypeImpl <em>Criteria Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.CriteriaTypeImpl
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl#getCriteriaType()
	 * @generated
	 */
	int CRITERIA_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERIA_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERIA_TYPE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Criteria Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERIA_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Criteria Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERIA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.EventImpl
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 12;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__OPTIONS = 0;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.FilterTypeImpl <em>Filter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.FilterTypeImpl
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl#getFilterType()
	 * @generated
	 */
	int FILTER_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Criterias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE__CRITERIAS = 0;

	/**
	 * The number of structural features of the '<em>Filter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Filter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.OptionImpl <em>Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.OptionImpl
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl#getOption()
	 * @generated
	 */
	int OPTION = 14;

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
	 * The meta object id for the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.OptionsImpl <em>Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.OptionsImpl
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl#getOptions()
	 * @generated
	 */
	int OPTIONS = 15;

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
	 * The meta object id for the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.OptionsTypeImpl <em>Options Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.OptionsTypeImpl
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl#getOptionsType()
	 * @generated
	 */
	int OPTIONS_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_TYPE__OPTIONS = 0;

	/**
	 * The number of structural features of the '<em>Options Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Options Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.OptionTypeImpl <em>Option Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.OptionTypeImpl
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl#getOptionType()
	 * @generated
	 */
	int OPTION_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Value1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_TYPE__VALUE1 = 1;

	/**
	 * The number of structural features of the '<em>Option Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Option Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ParameterImpl
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 18;

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
	 * The meta object id for the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ParameterGroupImpl <em>Parameter Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ParameterGroupImpl
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl#getParameterGroup()
	 * @generated
	 */
	int PARAMETER_GROUP = 19;

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
	 * The meta object id for the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.PropertiesImpl <em>Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.PropertiesImpl
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl#getProperties()
	 * @generated
	 */
	int PROPERTIES = 20;

	/**
	 * The feature id for the '<em><b>Propertys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__PROPERTYS = 0;

	/**
	 * The number of structural features of the '<em>Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.PropertyImpl
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 21;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = 1;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.StateImpl
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl#getState()
	 * @generated
	 */
	int STATE = 22;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__READ_ONLY = 1;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OPTIONS = 2;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.SupportedBridgeTypeRefsImpl <em>Supported Bridge Type Refs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.SupportedBridgeTypeRefsImpl
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl#getSupportedBridgeTypeRefs()
	 * @generated
	 */
	int SUPPORTED_BRIDGE_TYPE_REFS = 23;

	/**
	 * The feature id for the '<em><b>Bridge Type Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BRIDGE_TYPE_REFS__BRIDGE_TYPE_REFS = 0;

	/**
	 * The number of structural features of the '<em>Supported Bridge Type Refs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BRIDGE_TYPE_REFS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Supported Bridge Type Refs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_BRIDGE_TYPE_REFS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.TagsImpl <em>Tags</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.TagsImpl
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl#getTags()
	 * @generated
	 */
	int TAGS = 24;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGS__TAGS = 0;

	/**
	 * The number of structural features of the '<em>Tags</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Tags</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ThingDescriptionsTypeImpl <em>Thing Descriptions Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ThingDescriptionsTypeImpl
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl#getThingDescriptionsType()
	 * @generated
	 */
	int THING_DESCRIPTIONS_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Binding Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_DESCRIPTIONS_TYPE__BINDING_ID = 0;

	/**
	 * The feature id for the '<em><b>Thing Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_DESCRIPTIONS_TYPE__THING_TYPES = 1;

	/**
	 * The feature id for the '<em><b>Bridge Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_DESCRIPTIONS_TYPE__BRIDGE_TYPES = 2;

	/**
	 * The feature id for the '<em><b>Channel Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_DESCRIPTIONS_TYPE__CHANNEL_TYPES = 3;

	/**
	 * The feature id for the '<em><b>Channel Group Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_DESCRIPTIONS_TYPE__CHANNEL_GROUP_TYPES = 4;

	/**
	 * The number of structural features of the '<em>Thing Descriptions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_DESCRIPTIONS_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Thing Descriptions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_DESCRIPTIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ParameterType <em>Parameter Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ParameterType
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl#getParameterType()
	 * @generated
	 */
	int PARAMETER_TYPE = 27;

	/**
	 * The meta object id for the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.UnitType <em>Unit Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.UnitType
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl#getUnitType()
	 * @generated
	 */
	int UNIT_TYPE = 28;


	/**
	 * Returns the meta object for class '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.BridgeType <em>Bridge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bridge Type</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.BridgeType
	 * @generated
	 */
	EClass getBridgeType();

	/**
	 * Returns the meta object for class '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.BridgeTypeRef <em>Bridge Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bridge Type Ref</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.BridgeTypeRef
	 * @generated
	 */
	EClass getBridgeTypeRef();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.BridgeTypeRef#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.BridgeTypeRef#getId()
	 * @see #getBridgeTypeRef()
	 * @generated
	 */
	EAttribute getBridgeTypeRef_Id();

	/**
	 * Returns the meta object for class '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Channel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Channel</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Channel
	 * @generated
	 */
	EClass getChannel();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Channel#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Channel#getLabel()
	 * @see #getChannel()
	 * @generated
	 */
	EAttribute getChannel_Label();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Channel#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Channel#getDescription()
	 * @see #getChannel()
	 * @generated
	 */
	EAttribute getChannel_Description();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Channel#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Channel#getId()
	 * @see #getChannel()
	 * @generated
	 */
	EAttribute getChannel_Id();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Channel#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Id</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Channel#getTypeId()
	 * @see #getChannel()
	 * @generated
	 */
	EAttribute getChannel_TypeId();

	/**
	 * Returns the meta object for the containment reference '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Channel#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Channel#getProperties()
	 * @see #getChannel()
	 * @generated
	 */
	EReference getChannel_Properties();

	/**
	 * Returns the meta object for class '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelGroup <em>Channel Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Channel Group</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelGroup
	 * @generated
	 */
	EClass getChannelGroup();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelGroup#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelGroup#getLabel()
	 * @see #getChannelGroup()
	 * @generated
	 */
	EAttribute getChannelGroup_Label();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelGroup#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelGroup#getDescription()
	 * @see #getChannelGroup()
	 * @generated
	 */
	EAttribute getChannelGroup_Description();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelGroup#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelGroup#getId()
	 * @see #getChannelGroup()
	 * @generated
	 */
	EAttribute getChannelGroup_Id();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelGroup#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Id</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelGroup#getTypeId()
	 * @see #getChannelGroup()
	 * @generated
	 */
	EAttribute getChannelGroup_TypeId();

	/**
	 * Returns the meta object for class '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelGroups <em>Channel Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Channel Groups</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelGroups
	 * @generated
	 */
	EClass getChannelGroups();

	/**
	 * Returns the meta object for the containment reference list '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelGroups#getChannelGroups <em>Channel Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Channel Groups</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelGroups#getChannelGroups()
	 * @see #getChannelGroups()
	 * @generated
	 */
	EReference getChannelGroups_ChannelGroups();

	/**
	 * Returns the meta object for class '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelGroupType <em>Channel Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Channel Group Type</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelGroupType
	 * @generated
	 */
	EClass getChannelGroupType();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelGroupType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelGroupType#getLabel()
	 * @see #getChannelGroupType()
	 * @generated
	 */
	EAttribute getChannelGroupType_Label();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelGroupType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelGroupType#getDescription()
	 * @see #getChannelGroupType()
	 * @generated
	 */
	EAttribute getChannelGroupType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelGroupType#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelGroupType#getCategory()
	 * @see #getChannelGroupType()
	 * @generated
	 */
	EAttribute getChannelGroupType_Category();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelGroupType#isAdvanced <em>Advanced</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Advanced</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelGroupType#isAdvanced()
	 * @see #getChannelGroupType()
	 * @generated
	 */
	EAttribute getChannelGroupType_Advanced();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelGroupType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelGroupType#getId()
	 * @see #getChannelGroupType()
	 * @generated
	 */
	EAttribute getChannelGroupType_Id();

	/**
	 * Returns the meta object for the containment reference '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelGroupType#getChannels <em>Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Channels</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelGroupType#getChannels()
	 * @see #getChannelGroupType()
	 * @generated
	 */
	EReference getChannelGroupType_Channels();

	/**
	 * Returns the meta object for class '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Channels <em>Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Channels</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Channels
	 * @generated
	 */
	EClass getChannels();

	/**
	 * Returns the meta object for the containment reference list '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Channels#getChannels <em>Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Channels</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Channels#getChannels()
	 * @see #getChannels()
	 * @generated
	 */
	EReference getChannels_Channels();

	/**
	 * Returns the meta object for class '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelType <em>Channel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Channel Type</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelType
	 * @generated
	 */
	EClass getChannelType();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelType#getItemType <em>Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item Type</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelType#getItemType()
	 * @see #getChannelType()
	 * @generated
	 */
	EAttribute getChannelType_ItemType();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelType#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelType#getKind()
	 * @see #getChannelType()
	 * @generated
	 */
	EAttribute getChannelType_Kind();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelType#getLabel()
	 * @see #getChannelType()
	 * @generated
	 */
	EAttribute getChannelType_Label();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelType#getDescription()
	 * @see #getChannelType()
	 * @generated
	 */
	EAttribute getChannelType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelType#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelType#getCategory()
	 * @see #getChannelType()
	 * @generated
	 */
	EAttribute getChannelType_Category();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelType#isAdvanced <em>Advanced</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Advanced</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelType#isAdvanced()
	 * @see #getChannelType()
	 * @generated
	 */
	EAttribute getChannelType_Advanced();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelType#getId()
	 * @see #getChannelType()
	 * @generated
	 */
	EAttribute getChannelType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelType#isSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelType#isSystem()
	 * @see #getChannelType()
	 * @generated
	 */
	EAttribute getChannelType_System();

	/**
	 * Returns the meta object for the containment reference '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelType#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tags</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelType#getTags()
	 * @see #getChannelType()
	 * @generated
	 */
	EReference getChannelType_Tags();

	/**
	 * Returns the meta object for the containment reference '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelType#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>State</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelType#getState()
	 * @see #getChannelType()
	 * @generated
	 */
	EReference getChannelType_State();

	/**
	 * Returns the meta object for the containment reference '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelType#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelType#getEvent()
	 * @see #getChannelType()
	 * @generated
	 */
	EReference getChannelType_Event();

	/**
	 * Returns the meta object for the containment reference '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelType#getConfigDescription <em>Config Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Config Description</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelType#getConfigDescription()
	 * @see #getChannelType()
	 * @generated
	 */
	EReference getChannelType_ConfigDescription();

	/**
	 * Returns the meta object for the containment reference '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelType#getConfigDescriptionRef <em>Config Description Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Config Description Ref</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelType#getConfigDescriptionRef()
	 * @see #getChannelType()
	 * @generated
	 */
	EReference getChannelType_ConfigDescriptionRef();

	/**
	 * Returns the meta object for class '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ConfigDescription <em>Config Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config Description</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ConfigDescription
	 * @generated
	 */
	EClass getConfigDescription();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ConfigDescription#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ConfigDescription#getUri()
	 * @see #getConfigDescription()
	 * @generated
	 */
	EAttribute getConfigDescription_Uri();

	/**
	 * Returns the meta object for the containment reference list '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ConfigDescription#getParameterGroups <em>Parameter Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Groups</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ConfigDescription#getParameterGroups()
	 * @see #getConfigDescription()
	 * @generated
	 */
	EReference getConfigDescription_ParameterGroups();

	/**
	 * Returns the meta object for the containment reference list '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ConfigDescription#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ConfigDescription#getParameters()
	 * @see #getConfigDescription()
	 * @generated
	 */
	EReference getConfigDescription_Parameters();

	/**
	 * Returns the meta object for class '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ConfigDescriptionRef <em>Config Description Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config Description Ref</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ConfigDescriptionRef
	 * @generated
	 */
	EClass getConfigDescriptionRef();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ConfigDescriptionRef#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ConfigDescriptionRef#getUri()
	 * @see #getConfigDescriptionRef()
	 * @generated
	 */
	EAttribute getConfigDescriptionRef_Uri();

	/**
	 * Returns the meta object for class '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ConfigDescriptionsType <em>Config Descriptions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config Descriptions Type</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ConfigDescriptionsType
	 * @generated
	 */
	EClass getConfigDescriptionsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ConfigDescriptionsType#getConfigDescriptions <em>Config Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Config Descriptions</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ConfigDescriptionsType#getConfigDescriptions()
	 * @see #getConfigDescriptionsType()
	 * @generated
	 */
	EReference getConfigDescriptionsType_ConfigDescriptions();

	/**
	 * Returns the meta object for class '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.CriteriaType <em>Criteria Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Criteria Type</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.CriteriaType
	 * @generated
	 */
	EClass getCriteriaType();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.CriteriaType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.CriteriaType#getValue()
	 * @see #getCriteriaType()
	 * @generated
	 */
	EAttribute getCriteriaType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.CriteriaType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.CriteriaType#getName()
	 * @see #getCriteriaType()
	 * @generated
	 */
	EAttribute getCriteriaType_Name();

	/**
	 * Returns the meta object for class '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the containment reference '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Event#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Options</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Event#getOptions()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Options();

	/**
	 * Returns the meta object for class '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.FilterType <em>Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Type</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.FilterType
	 * @generated
	 */
	EClass getFilterType();

	/**
	 * Returns the meta object for the containment reference list '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.FilterType#getCriterias <em>Criterias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Criterias</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.FilterType#getCriterias()
	 * @see #getFilterType()
	 * @generated
	 */
	EReference getFilterType_Criterias();

	/**
	 * Returns the meta object for class '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Option
	 * @generated
	 */
	EClass getOption();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Option#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Option#getValue()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Value();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Option#getValue1 <em>Value1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value1</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Option#getValue1()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Value1();

	/**
	 * Returns the meta object for class '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Options <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Options</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Options
	 * @generated
	 */
	EClass getOptions();

	/**
	 * Returns the meta object for the containment reference list '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Options#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Options#getOptions()
	 * @see #getOptions()
	 * @generated
	 */
	EReference getOptions_Options();

	/**
	 * Returns the meta object for class '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.OptionsType <em>Options Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Options Type</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.OptionsType
	 * @generated
	 */
	EClass getOptionsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.OptionsType#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.OptionsType#getOptions()
	 * @see #getOptionsType()
	 * @generated
	 */
	EReference getOptionsType_Options();

	/**
	 * Returns the meta object for class '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.OptionType <em>Option Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option Type</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.OptionType
	 * @generated
	 */
	EClass getOptionType();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.OptionType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.OptionType#getValue()
	 * @see #getOptionType()
	 * @generated
	 */
	EAttribute getOptionType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.OptionType#getValue1 <em>Value1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value1</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.OptionType#getValue1()
	 * @see #getOptionType()
	 * @generated
	 */
	EAttribute getOptionType_Value1();

	/**
	 * Returns the meta object for class '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Parameter#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Parameter#getContext()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Context();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Parameter#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Parameter#isRequired()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Required();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Parameter#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Parameter#getDefault()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Default();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Parameter#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Parameter#getLabel()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Label();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Parameter#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Parameter#getDescription()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Description();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Parameter#isLimitToOptions <em>Limit To Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Limit To Options</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Parameter#isLimitToOptions()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_LimitToOptions();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Parameter#isAdvanced <em>Advanced</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Advanced</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Parameter#isAdvanced()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Advanced();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Parameter#isVerify <em>Verify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verify</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Parameter#isVerify()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Verify();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Parameter#getUnitLabel <em>Unit Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Label</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Parameter#getUnitLabel()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_UnitLabel();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Parameter#getGroupName <em>Group Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Name</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Parameter#getGroupName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_GroupName();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Parameter#isMultiple <em>Multiple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiple</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Parameter#isMultiple()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Multiple();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Parameter#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Parameter#getPattern()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Parameter#isReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Parameter#isReadOnly()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_ReadOnly();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Parameter#isRequired1 <em>Required1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required1</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Parameter#isRequired1()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Required1();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Type();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Parameter#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Parameter#getUnit()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Unit();

	/**
	 * Returns the meta object for the containment reference '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Parameter#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Options</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Parameter#getOptions()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Options();

	/**
	 * Returns the meta object for the containment reference '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Parameter#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Parameter#getFilter()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Filter();

	/**
	 * Returns the meta object for class '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ParameterGroup <em>Parameter Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Group</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ParameterGroup
	 * @generated
	 */
	EClass getParameterGroup();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ParameterGroup#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ParameterGroup#getLabel()
	 * @see #getParameterGroup()
	 * @generated
	 */
	EAttribute getParameterGroup_Label();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ParameterGroup#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ParameterGroup#getDescription()
	 * @see #getParameterGroup()
	 * @generated
	 */
	EAttribute getParameterGroup_Description();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ParameterGroup#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ParameterGroup#getContext()
	 * @see #getParameterGroup()
	 * @generated
	 */
	EAttribute getParameterGroup_Context();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ParameterGroup#isAdvanced <em>Advanced</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Advanced</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ParameterGroup#isAdvanced()
	 * @see #getParameterGroup()
	 * @generated
	 */
	EAttribute getParameterGroup_Advanced();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ParameterGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ParameterGroup#getName()
	 * @see #getParameterGroup()
	 * @generated
	 */
	EAttribute getParameterGroup_Name();

	/**
	 * Returns the meta object for class '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Properties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Properties</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Properties
	 * @generated
	 */
	EClass getProperties();

	/**
	 * Returns the meta object for the containment reference list '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Properties#getPropertys <em>Propertys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Propertys</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Properties#getPropertys()
	 * @see #getProperties()
	 * @generated
	 */
	EReference getProperties_Propertys();

	/**
	 * Returns the meta object for class '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Property#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Value();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for class '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.State#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.State#getPattern()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.State#isReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.State#isReadOnly()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_ReadOnly();

	/**
	 * Returns the meta object for the containment reference '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.State#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Options</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.State#getOptions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Options();

	/**
	 * Returns the meta object for class '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.SupportedBridgeTypeRefs <em>Supported Bridge Type Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supported Bridge Type Refs</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.SupportedBridgeTypeRefs
	 * @generated
	 */
	EClass getSupportedBridgeTypeRefs();

	/**
	 * Returns the meta object for the containment reference list '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.SupportedBridgeTypeRefs#getBridgeTypeRefs <em>Bridge Type Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bridge Type Refs</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.SupportedBridgeTypeRefs#getBridgeTypeRefs()
	 * @see #getSupportedBridgeTypeRefs()
	 * @generated
	 */
	EReference getSupportedBridgeTypeRefs_BridgeTypeRefs();

	/**
	 * Returns the meta object for class '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Tags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tags</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Tags
	 * @generated
	 */
	EClass getTags();

	/**
	 * Returns the meta object for the attribute list '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Tags#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tags</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Tags#getTags()
	 * @see #getTags()
	 * @generated
	 */
	EAttribute getTags_Tags();

	/**
	 * Returns the meta object for class '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingDescriptionsType <em>Thing Descriptions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thing Descriptions Type</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingDescriptionsType
	 * @generated
	 */
	EClass getThingDescriptionsType();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingDescriptionsType#getBindingId <em>Binding Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binding Id</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingDescriptionsType#getBindingId()
	 * @see #getThingDescriptionsType()
	 * @generated
	 */
	EAttribute getThingDescriptionsType_BindingId();

	/**
	 * Returns the meta object for the containment reference list '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingDescriptionsType#getThingTypes <em>Thing Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Thing Types</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingDescriptionsType#getThingTypes()
	 * @see #getThingDescriptionsType()
	 * @generated
	 */
	EReference getThingDescriptionsType_ThingTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingDescriptionsType#getBridgeTypes <em>Bridge Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bridge Types</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingDescriptionsType#getBridgeTypes()
	 * @see #getThingDescriptionsType()
	 * @generated
	 */
	EReference getThingDescriptionsType_BridgeTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingDescriptionsType#getChannelTypes <em>Channel Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Channel Types</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingDescriptionsType#getChannelTypes()
	 * @see #getThingDescriptionsType()
	 * @generated
	 */
	EReference getThingDescriptionsType_ChannelTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingDescriptionsType#getChannelGroupTypes <em>Channel Group Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Channel Group Types</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingDescriptionsType#getChannelGroupTypes()
	 * @see #getThingDescriptionsType()
	 * @generated
	 */
	EReference getThingDescriptionsType_ChannelGroupTypes();

	/**
	 * Returns the meta object for class '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingType <em>Thing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thing Type</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingType
	 * @generated
	 */
	EClass getThingType();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingType#getLabel()
	 * @see #getThingType()
	 * @generated
	 */
	EAttribute getThingType_Label();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingType#getDescription()
	 * @see #getThingType()
	 * @generated
	 */
	EAttribute getThingType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingType#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingType#getCategory()
	 * @see #getThingType()
	 * @generated
	 */
	EAttribute getThingType_Category();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingType#getRepresentationProperty <em>Representation Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Representation Property</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingType#getRepresentationProperty()
	 * @see #getThingType()
	 * @generated
	 */
	EAttribute getThingType_RepresentationProperty();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingType#getExtensible <em>Extensible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extensible</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingType#getExtensible()
	 * @see #getThingType()
	 * @generated
	 */
	EAttribute getThingType_Extensible();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingType#getId()
	 * @see #getThingType()
	 * @generated
	 */
	EAttribute getThingType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingType#isListed <em>Listed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Listed</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingType#isListed()
	 * @see #getThingType()
	 * @generated
	 */
	EAttribute getThingType_Listed();

	/**
	 * Returns the meta object for the containment reference '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingType#getSupportedBridgeTypeRefs <em>Supported Bridge Type Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Supported Bridge Type Refs</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingType#getSupportedBridgeTypeRefs()
	 * @see #getThingType()
	 * @generated
	 */
	EReference getThingType_SupportedBridgeTypeRefs();

	/**
	 * Returns the meta object for the containment reference '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingType#getChannels <em>Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Channels</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingType#getChannels()
	 * @see #getThingType()
	 * @generated
	 */
	EReference getThingType_Channels();

	/**
	 * Returns the meta object for the containment reference '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingType#getChannelGroups <em>Channel Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Channel Groups</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingType#getChannelGroups()
	 * @see #getThingType()
	 * @generated
	 */
	EReference getThingType_ChannelGroups();

	/**
	 * Returns the meta object for the containment reference '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingType#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingType#getProperties()
	 * @see #getThingType()
	 * @generated
	 */
	EReference getThingType_Properties();

	/**
	 * Returns the meta object for the containment reference '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingType#getConfigDescription <em>Config Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Config Description</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingType#getConfigDescription()
	 * @see #getThingType()
	 * @generated
	 */
	EReference getThingType_ConfigDescription();

	/**
	 * Returns the meta object for the containment reference '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingType#getConfigDescriptionRef <em>Config Description Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Config Description Ref</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingType#getConfigDescriptionRef()
	 * @see #getThingType()
	 * @generated
	 */
	EReference getThingType_ConfigDescriptionRef();

	/**
	 * Returns the meta object for enum '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Type</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ParameterType
	 * @generated
	 */
	EEnum getParameterType();

	/**
	 * Returns the meta object for enum '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.UnitType <em>Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unit Type</em>'.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.UnitType
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
	org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedFactory getorg_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedFactory();

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
		 * The meta object literal for the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.BridgeTypeImpl <em>Bridge Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.BridgeTypeImpl
		 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl#getBridgeType()
		 * @generated
		 */
		EClass BRIDGE_TYPE = eINSTANCE.getBridgeType();

		/**
		 * The meta object literal for the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.BridgeTypeRefImpl <em>Bridge Type Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.BridgeTypeRefImpl
		 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl#getBridgeTypeRef()
		 * @generated
		 */
		EClass BRIDGE_TYPE_REF = eINSTANCE.getBridgeTypeRef();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRIDGE_TYPE_REF__ID = eINSTANCE.getBridgeTypeRef_Id();

		/**
		 * The meta object literal for the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ChannelImpl <em>Channel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ChannelImpl
		 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl#getChannel()
		 * @generated
		 */
		EClass CHANNEL = eINSTANCE.getChannel();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL__LABEL = eINSTANCE.getChannel_Label();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL__DESCRIPTION = eINSTANCE.getChannel_Description();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL__ID = eINSTANCE.getChannel_Id();

		/**
		 * The meta object literal for the '<em><b>Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL__TYPE_ID = eINSTANCE.getChannel_TypeId();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL__PROPERTIES = eINSTANCE.getChannel_Properties();

		/**
		 * The meta object literal for the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ChannelGroupImpl <em>Channel Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ChannelGroupImpl
		 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl#getChannelGroup()
		 * @generated
		 */
		EClass CHANNEL_GROUP = eINSTANCE.getChannelGroup();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL_GROUP__LABEL = eINSTANCE.getChannelGroup_Label();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL_GROUP__DESCRIPTION = eINSTANCE.getChannelGroup_Description();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL_GROUP__ID = eINSTANCE.getChannelGroup_Id();

		/**
		 * The meta object literal for the '<em><b>Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL_GROUP__TYPE_ID = eINSTANCE.getChannelGroup_TypeId();

		/**
		 * The meta object literal for the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ChannelGroupsImpl <em>Channel Groups</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ChannelGroupsImpl
		 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl#getChannelGroups()
		 * @generated
		 */
		EClass CHANNEL_GROUPS = eINSTANCE.getChannelGroups();

		/**
		 * The meta object literal for the '<em><b>Channel Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL_GROUPS__CHANNEL_GROUPS = eINSTANCE.getChannelGroups_ChannelGroups();

		/**
		 * The meta object literal for the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ChannelGroupTypeImpl <em>Channel Group Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ChannelGroupTypeImpl
		 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl#getChannelGroupType()
		 * @generated
		 */
		EClass CHANNEL_GROUP_TYPE = eINSTANCE.getChannelGroupType();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL_GROUP_TYPE__LABEL = eINSTANCE.getChannelGroupType_Label();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL_GROUP_TYPE__DESCRIPTION = eINSTANCE.getChannelGroupType_Description();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL_GROUP_TYPE__CATEGORY = eINSTANCE.getChannelGroupType_Category();

		/**
		 * The meta object literal for the '<em><b>Advanced</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL_GROUP_TYPE__ADVANCED = eINSTANCE.getChannelGroupType_Advanced();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL_GROUP_TYPE__ID = eINSTANCE.getChannelGroupType_Id();

		/**
		 * The meta object literal for the '<em><b>Channels</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL_GROUP_TYPE__CHANNELS = eINSTANCE.getChannelGroupType_Channels();

		/**
		 * The meta object literal for the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ChannelsImpl <em>Channels</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ChannelsImpl
		 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl#getChannels()
		 * @generated
		 */
		EClass CHANNELS = eINSTANCE.getChannels();

		/**
		 * The meta object literal for the '<em><b>Channels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNELS__CHANNELS = eINSTANCE.getChannels_Channels();

		/**
		 * The meta object literal for the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ChannelTypeImpl <em>Channel Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ChannelTypeImpl
		 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl#getChannelType()
		 * @generated
		 */
		EClass CHANNEL_TYPE = eINSTANCE.getChannelType();

		/**
		 * The meta object literal for the '<em><b>Item Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL_TYPE__ITEM_TYPE = eINSTANCE.getChannelType_ItemType();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL_TYPE__KIND = eINSTANCE.getChannelType_Kind();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL_TYPE__LABEL = eINSTANCE.getChannelType_Label();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL_TYPE__DESCRIPTION = eINSTANCE.getChannelType_Description();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL_TYPE__CATEGORY = eINSTANCE.getChannelType_Category();

		/**
		 * The meta object literal for the '<em><b>Advanced</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL_TYPE__ADVANCED = eINSTANCE.getChannelType_Advanced();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL_TYPE__ID = eINSTANCE.getChannelType_Id();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL_TYPE__SYSTEM = eINSTANCE.getChannelType_System();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL_TYPE__TAGS = eINSTANCE.getChannelType_Tags();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL_TYPE__STATE = eINSTANCE.getChannelType_State();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL_TYPE__EVENT = eINSTANCE.getChannelType_Event();

		/**
		 * The meta object literal for the '<em><b>Config Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL_TYPE__CONFIG_DESCRIPTION = eINSTANCE.getChannelType_ConfigDescription();

		/**
		 * The meta object literal for the '<em><b>Config Description Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL_TYPE__CONFIG_DESCRIPTION_REF = eINSTANCE.getChannelType_ConfigDescriptionRef();

		/**
		 * The meta object literal for the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ConfigDescriptionImpl <em>Config Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ConfigDescriptionImpl
		 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl#getConfigDescription()
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
		 * The meta object literal for the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ConfigDescriptionRefImpl <em>Config Description Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ConfigDescriptionRefImpl
		 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl#getConfigDescriptionRef()
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
		 * The meta object literal for the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ConfigDescriptionsTypeImpl <em>Config Descriptions Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ConfigDescriptionsTypeImpl
		 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl#getConfigDescriptionsType()
		 * @generated
		 */
		EClass CONFIG_DESCRIPTIONS_TYPE = eINSTANCE.getConfigDescriptionsType();

		/**
		 * The meta object literal for the '<em><b>Config Descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIG_DESCRIPTIONS_TYPE__CONFIG_DESCRIPTIONS = eINSTANCE.getConfigDescriptionsType_ConfigDescriptions();

		/**
		 * The meta object literal for the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.CriteriaTypeImpl <em>Criteria Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.CriteriaTypeImpl
		 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl#getCriteriaType()
		 * @generated
		 */
		EClass CRITERIA_TYPE = eINSTANCE.getCriteriaType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRITERIA_TYPE__VALUE = eINSTANCE.getCriteriaType_Value();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRITERIA_TYPE__NAME = eINSTANCE.getCriteriaType_Name();

		/**
		 * The meta object literal for the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.EventImpl
		 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__OPTIONS = eINSTANCE.getEvent_Options();

		/**
		 * The meta object literal for the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.FilterTypeImpl <em>Filter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.FilterTypeImpl
		 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl#getFilterType()
		 * @generated
		 */
		EClass FILTER_TYPE = eINSTANCE.getFilterType();

		/**
		 * The meta object literal for the '<em><b>Criterias</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_TYPE__CRITERIAS = eINSTANCE.getFilterType_Criterias();

		/**
		 * The meta object literal for the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.OptionImpl <em>Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.OptionImpl
		 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl#getOption()
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
		 * The meta object literal for the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.OptionsImpl <em>Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.OptionsImpl
		 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl#getOptions()
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
		 * The meta object literal for the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.OptionsTypeImpl <em>Options Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.OptionsTypeImpl
		 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl#getOptionsType()
		 * @generated
		 */
		EClass OPTIONS_TYPE = eINSTANCE.getOptionsType();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTIONS_TYPE__OPTIONS = eINSTANCE.getOptionsType_Options();

		/**
		 * The meta object literal for the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.OptionTypeImpl <em>Option Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.OptionTypeImpl
		 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl#getOptionType()
		 * @generated
		 */
		EClass OPTION_TYPE = eINSTANCE.getOptionType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION_TYPE__VALUE = eINSTANCE.getOptionType_Value();

		/**
		 * The meta object literal for the '<em><b>Value1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION_TYPE__VALUE1 = eINSTANCE.getOptionType_Value1();

		/**
		 * The meta object literal for the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ParameterImpl
		 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl#getParameter()
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
		 * The meta object literal for the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ParameterGroupImpl <em>Parameter Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ParameterGroupImpl
		 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl#getParameterGroup()
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
		 * The meta object literal for the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.PropertiesImpl <em>Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.PropertiesImpl
		 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl#getProperties()
		 * @generated
		 */
		EClass PROPERTIES = eINSTANCE.getProperties();

		/**
		 * The meta object literal for the '<em><b>Propertys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTIES__PROPERTYS = eINSTANCE.getProperties_Propertys();

		/**
		 * The meta object literal for the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.PropertyImpl
		 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

		/**
		 * The meta object literal for the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.StateImpl
		 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__PATTERN = eINSTANCE.getState_Pattern();

		/**
		 * The meta object literal for the '<em><b>Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__READ_ONLY = eINSTANCE.getState_ReadOnly();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OPTIONS = eINSTANCE.getState_Options();

		/**
		 * The meta object literal for the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.SupportedBridgeTypeRefsImpl <em>Supported Bridge Type Refs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.SupportedBridgeTypeRefsImpl
		 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl#getSupportedBridgeTypeRefs()
		 * @generated
		 */
		EClass SUPPORTED_BRIDGE_TYPE_REFS = eINSTANCE.getSupportedBridgeTypeRefs();

		/**
		 * The meta object literal for the '<em><b>Bridge Type Refs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPORTED_BRIDGE_TYPE_REFS__BRIDGE_TYPE_REFS = eINSTANCE.getSupportedBridgeTypeRefs_BridgeTypeRefs();

		/**
		 * The meta object literal for the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.TagsImpl <em>Tags</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.TagsImpl
		 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl#getTags()
		 * @generated
		 */
		EClass TAGS = eINSTANCE.getTags();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAGS__TAGS = eINSTANCE.getTags_Tags();

		/**
		 * The meta object literal for the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ThingDescriptionsTypeImpl <em>Thing Descriptions Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ThingDescriptionsTypeImpl
		 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl#getThingDescriptionsType()
		 * @generated
		 */
		EClass THING_DESCRIPTIONS_TYPE = eINSTANCE.getThingDescriptionsType();

		/**
		 * The meta object literal for the '<em><b>Binding Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THING_DESCRIPTIONS_TYPE__BINDING_ID = eINSTANCE.getThingDescriptionsType_BindingId();

		/**
		 * The meta object literal for the '<em><b>Thing Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING_DESCRIPTIONS_TYPE__THING_TYPES = eINSTANCE.getThingDescriptionsType_ThingTypes();

		/**
		 * The meta object literal for the '<em><b>Bridge Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING_DESCRIPTIONS_TYPE__BRIDGE_TYPES = eINSTANCE.getThingDescriptionsType_BridgeTypes();

		/**
		 * The meta object literal for the '<em><b>Channel Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING_DESCRIPTIONS_TYPE__CHANNEL_TYPES = eINSTANCE.getThingDescriptionsType_ChannelTypes();

		/**
		 * The meta object literal for the '<em><b>Channel Group Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING_DESCRIPTIONS_TYPE__CHANNEL_GROUP_TYPES = eINSTANCE.getThingDescriptionsType_ChannelGroupTypes();

		/**
		 * The meta object literal for the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ThingTypeImpl <em>Thing Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ThingTypeImpl
		 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl#getThingType()
		 * @generated
		 */
		EClass THING_TYPE = eINSTANCE.getThingType();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THING_TYPE__LABEL = eINSTANCE.getThingType_Label();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THING_TYPE__DESCRIPTION = eINSTANCE.getThingType_Description();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THING_TYPE__CATEGORY = eINSTANCE.getThingType_Category();

		/**
		 * The meta object literal for the '<em><b>Representation Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THING_TYPE__REPRESENTATION_PROPERTY = eINSTANCE.getThingType_RepresentationProperty();

		/**
		 * The meta object literal for the '<em><b>Extensible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THING_TYPE__EXTENSIBLE = eINSTANCE.getThingType_Extensible();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THING_TYPE__ID = eINSTANCE.getThingType_Id();

		/**
		 * The meta object literal for the '<em><b>Listed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THING_TYPE__LISTED = eINSTANCE.getThingType_Listed();

		/**
		 * The meta object literal for the '<em><b>Supported Bridge Type Refs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING_TYPE__SUPPORTED_BRIDGE_TYPE_REFS = eINSTANCE.getThingType_SupportedBridgeTypeRefs();

		/**
		 * The meta object literal for the '<em><b>Channels</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING_TYPE__CHANNELS = eINSTANCE.getThingType_Channels();

		/**
		 * The meta object literal for the '<em><b>Channel Groups</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING_TYPE__CHANNEL_GROUPS = eINSTANCE.getThingType_ChannelGroups();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING_TYPE__PROPERTIES = eINSTANCE.getThingType_Properties();

		/**
		 * The meta object literal for the '<em><b>Config Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING_TYPE__CONFIG_DESCRIPTION = eINSTANCE.getThingType_ConfigDescription();

		/**
		 * The meta object literal for the '<em><b>Config Description Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING_TYPE__CONFIG_DESCRIPTION_REF = eINSTANCE.getThingType_ConfigDescriptionRef();

		/**
		 * The meta object literal for the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ParameterType <em>Parameter Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ParameterType
		 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl#getParameterType()
		 * @generated
		 */
		EEnum PARAMETER_TYPE = eINSTANCE.getParameterType();

		/**
		 * The meta object literal for the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.UnitType <em>Unit Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.UnitType
		 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackageImpl#getUnitType()
		 * @generated
		 */
		EEnum UNIT_TYPE = eINSTANCE.getUnitType();

	}

} //org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage
