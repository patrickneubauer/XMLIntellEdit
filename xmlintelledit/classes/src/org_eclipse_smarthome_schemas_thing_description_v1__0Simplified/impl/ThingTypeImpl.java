/**
 */
package org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelGroups;
import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Channels;
import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ConfigDescription;
import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ConfigDescriptionRef;
import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Properties;
import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.SupportedBridgeTypeRefs;
import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingType;
import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Thing Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ThingTypeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ThingTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ThingTypeImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ThingTypeImpl#getRepresentationProperty <em>Representation Property</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ThingTypeImpl#getExtensible <em>Extensible</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ThingTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ThingTypeImpl#isListed <em>Listed</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ThingTypeImpl#getSupportedBridgeTypeRefs <em>Supported Bridge Type Refs</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ThingTypeImpl#getChannels <em>Channels</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ThingTypeImpl#getChannelGroups <em>Channel Groups</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ThingTypeImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ThingTypeImpl#getConfigDescription <em>Config Description</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ThingTypeImpl#getConfigDescriptionRef <em>Config Description Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThingTypeImpl extends MinimalEObjectImpl.Container implements ThingType {
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected String category = CATEGORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepresentationProperty() <em>Representation Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentationProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String REPRESENTATION_PROPERTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepresentationProperty() <em>Representation Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentationProperty()
	 * @generated
	 * @ordered
	 */
	protected String representationProperty = REPRESENTATION_PROPERTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtensible() <em>Extensible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensible()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENSIBLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtensible() <em>Extensible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensible()
	 * @generated
	 * @ordered
	 */
	protected String extensible = EXTENSIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isListed() <em>Listed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isListed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LISTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isListed() <em>Listed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isListed()
	 * @generated
	 * @ordered
	 */
	protected boolean listed = LISTED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSupportedBridgeTypeRefs() <em>Supported Bridge Type Refs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedBridgeTypeRefs()
	 * @generated
	 * @ordered
	 */
	protected SupportedBridgeTypeRefs supportedBridgeTypeRefs;

	/**
	 * The cached value of the '{@link #getChannels() <em>Channels</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannels()
	 * @generated
	 * @ordered
	 */
	protected Channels channels;

	/**
	 * The cached value of the '{@link #getChannelGroups() <em>Channel Groups</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelGroups()
	 * @generated
	 * @ordered
	 */
	protected ChannelGroups channelGroups;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected Properties properties;

	/**
	 * The cached value of the '{@link #getConfigDescription() <em>Config Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigDescription()
	 * @generated
	 * @ordered
	 */
	protected ConfigDescription configDescription;

	/**
	 * The cached value of the '{@link #getConfigDescriptionRef() <em>Config Description Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigDescriptionRef()
	 * @generated
	 * @ordered
	 */
	protected ConfigDescriptionRef configDescriptionRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThingTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.Literals.THING_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(String newCategory) {
		String oldCategory = category;
		category = newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRepresentationProperty() {
		return representationProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentationProperty(String newRepresentationProperty) {
		String oldRepresentationProperty = representationProperty;
		representationProperty = newRepresentationProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__REPRESENTATION_PROPERTY, oldRepresentationProperty, representationProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtensible() {
		return extensible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensible(String newExtensible) {
		String oldExtensible = extensible;
		extensible = newExtensible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__EXTENSIBLE, oldExtensible, extensible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isListed() {
		return listed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListed(boolean newListed) {
		boolean oldListed = listed;
		listed = newListed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__LISTED, oldListed, listed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupportedBridgeTypeRefs getSupportedBridgeTypeRefs() {
		return supportedBridgeTypeRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupportedBridgeTypeRefs(SupportedBridgeTypeRefs newSupportedBridgeTypeRefs, NotificationChain msgs) {
		SupportedBridgeTypeRefs oldSupportedBridgeTypeRefs = supportedBridgeTypeRefs;
		supportedBridgeTypeRefs = newSupportedBridgeTypeRefs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__SUPPORTED_BRIDGE_TYPE_REFS, oldSupportedBridgeTypeRefs, newSupportedBridgeTypeRefs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupportedBridgeTypeRefs(SupportedBridgeTypeRefs newSupportedBridgeTypeRefs) {
		if (newSupportedBridgeTypeRefs != supportedBridgeTypeRefs) {
			NotificationChain msgs = null;
			if (supportedBridgeTypeRefs != null)
				msgs = ((InternalEObject)supportedBridgeTypeRefs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__SUPPORTED_BRIDGE_TYPE_REFS, null, msgs);
			if (newSupportedBridgeTypeRefs != null)
				msgs = ((InternalEObject)newSupportedBridgeTypeRefs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__SUPPORTED_BRIDGE_TYPE_REFS, null, msgs);
			msgs = basicSetSupportedBridgeTypeRefs(newSupportedBridgeTypeRefs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__SUPPORTED_BRIDGE_TYPE_REFS, newSupportedBridgeTypeRefs, newSupportedBridgeTypeRefs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channels getChannels() {
		return channels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChannels(Channels newChannels, NotificationChain msgs) {
		Channels oldChannels = channels;
		channels = newChannels;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__CHANNELS, oldChannels, newChannels);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChannels(Channels newChannels) {
		if (newChannels != channels) {
			NotificationChain msgs = null;
			if (channels != null)
				msgs = ((InternalEObject)channels).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__CHANNELS, null, msgs);
			if (newChannels != null)
				msgs = ((InternalEObject)newChannels).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__CHANNELS, null, msgs);
			msgs = basicSetChannels(newChannels, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__CHANNELS, newChannels, newChannels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelGroups getChannelGroups() {
		return channelGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChannelGroups(ChannelGroups newChannelGroups, NotificationChain msgs) {
		ChannelGroups oldChannelGroups = channelGroups;
		channelGroups = newChannelGroups;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__CHANNEL_GROUPS, oldChannelGroups, newChannelGroups);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChannelGroups(ChannelGroups newChannelGroups) {
		if (newChannelGroups != channelGroups) {
			NotificationChain msgs = null;
			if (channelGroups != null)
				msgs = ((InternalEObject)channelGroups).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__CHANNEL_GROUPS, null, msgs);
			if (newChannelGroups != null)
				msgs = ((InternalEObject)newChannelGroups).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__CHANNEL_GROUPS, null, msgs);
			msgs = basicSetChannelGroups(newChannelGroups, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__CHANNEL_GROUPS, newChannelGroups, newChannelGroups));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Properties getProperties() {
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperties(Properties newProperties, NotificationChain msgs) {
		Properties oldProperties = properties;
		properties = newProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__PROPERTIES, oldProperties, newProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperties(Properties newProperties) {
		if (newProperties != properties) {
			NotificationChain msgs = null;
			if (properties != null)
				msgs = ((InternalEObject)properties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__PROPERTIES, null, msgs);
			if (newProperties != null)
				msgs = ((InternalEObject)newProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__PROPERTIES, null, msgs);
			msgs = basicSetProperties(newProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__PROPERTIES, newProperties, newProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigDescription getConfigDescription() {
		return configDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfigDescription(ConfigDescription newConfigDescription, NotificationChain msgs) {
		ConfigDescription oldConfigDescription = configDescription;
		configDescription = newConfigDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__CONFIG_DESCRIPTION, oldConfigDescription, newConfigDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigDescription(ConfigDescription newConfigDescription) {
		if (newConfigDescription != configDescription) {
			NotificationChain msgs = null;
			if (configDescription != null)
				msgs = ((InternalEObject)configDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__CONFIG_DESCRIPTION, null, msgs);
			if (newConfigDescription != null)
				msgs = ((InternalEObject)newConfigDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__CONFIG_DESCRIPTION, null, msgs);
			msgs = basicSetConfigDescription(newConfigDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__CONFIG_DESCRIPTION, newConfigDescription, newConfigDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigDescriptionRef getConfigDescriptionRef() {
		return configDescriptionRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfigDescriptionRef(ConfigDescriptionRef newConfigDescriptionRef, NotificationChain msgs) {
		ConfigDescriptionRef oldConfigDescriptionRef = configDescriptionRef;
		configDescriptionRef = newConfigDescriptionRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__CONFIG_DESCRIPTION_REF, oldConfigDescriptionRef, newConfigDescriptionRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigDescriptionRef(ConfigDescriptionRef newConfigDescriptionRef) {
		if (newConfigDescriptionRef != configDescriptionRef) {
			NotificationChain msgs = null;
			if (configDescriptionRef != null)
				msgs = ((InternalEObject)configDescriptionRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__CONFIG_DESCRIPTION_REF, null, msgs);
			if (newConfigDescriptionRef != null)
				msgs = ((InternalEObject)newConfigDescriptionRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__CONFIG_DESCRIPTION_REF, null, msgs);
			msgs = basicSetConfigDescriptionRef(newConfigDescriptionRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__CONFIG_DESCRIPTION_REF, newConfigDescriptionRef, newConfigDescriptionRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__SUPPORTED_BRIDGE_TYPE_REFS:
				return basicSetSupportedBridgeTypeRefs(null, msgs);
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__CHANNELS:
				return basicSetChannels(null, msgs);
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__CHANNEL_GROUPS:
				return basicSetChannelGroups(null, msgs);
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__PROPERTIES:
				return basicSetProperties(null, msgs);
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__CONFIG_DESCRIPTION:
				return basicSetConfigDescription(null, msgs);
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__CONFIG_DESCRIPTION_REF:
				return basicSetConfigDescriptionRef(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__LABEL:
				return getLabel();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__DESCRIPTION:
				return getDescription();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__CATEGORY:
				return getCategory();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__REPRESENTATION_PROPERTY:
				return getRepresentationProperty();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__EXTENSIBLE:
				return getExtensible();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__ID:
				return getId();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__LISTED:
				return isListed();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__SUPPORTED_BRIDGE_TYPE_REFS:
				return getSupportedBridgeTypeRefs();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__CHANNELS:
				return getChannels();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__CHANNEL_GROUPS:
				return getChannelGroups();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__PROPERTIES:
				return getProperties();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__CONFIG_DESCRIPTION:
				return getConfigDescription();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__CONFIG_DESCRIPTION_REF:
				return getConfigDescriptionRef();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__LABEL:
				setLabel((String)newValue);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__CATEGORY:
				setCategory((String)newValue);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__REPRESENTATION_PROPERTY:
				setRepresentationProperty((String)newValue);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__EXTENSIBLE:
				setExtensible((String)newValue);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__ID:
				setId((String)newValue);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__LISTED:
				setListed((Boolean)newValue);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__SUPPORTED_BRIDGE_TYPE_REFS:
				setSupportedBridgeTypeRefs((SupportedBridgeTypeRefs)newValue);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__CHANNELS:
				setChannels((Channels)newValue);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__CHANNEL_GROUPS:
				setChannelGroups((ChannelGroups)newValue);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__PROPERTIES:
				setProperties((Properties)newValue);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__CONFIG_DESCRIPTION:
				setConfigDescription((ConfigDescription)newValue);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__CONFIG_DESCRIPTION_REF:
				setConfigDescriptionRef((ConfigDescriptionRef)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__REPRESENTATION_PROPERTY:
				setRepresentationProperty(REPRESENTATION_PROPERTY_EDEFAULT);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__EXTENSIBLE:
				setExtensible(EXTENSIBLE_EDEFAULT);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__LISTED:
				setListed(LISTED_EDEFAULT);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__SUPPORTED_BRIDGE_TYPE_REFS:
				setSupportedBridgeTypeRefs((SupportedBridgeTypeRefs)null);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__CHANNELS:
				setChannels((Channels)null);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__CHANNEL_GROUPS:
				setChannelGroups((ChannelGroups)null);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__PROPERTIES:
				setProperties((Properties)null);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__CONFIG_DESCRIPTION:
				setConfigDescription((ConfigDescription)null);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__CONFIG_DESCRIPTION_REF:
				setConfigDescriptionRef((ConfigDescriptionRef)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__CATEGORY:
				return CATEGORY_EDEFAULT == null ? category != null : !CATEGORY_EDEFAULT.equals(category);
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__REPRESENTATION_PROPERTY:
				return REPRESENTATION_PROPERTY_EDEFAULT == null ? representationProperty != null : !REPRESENTATION_PROPERTY_EDEFAULT.equals(representationProperty);
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__EXTENSIBLE:
				return EXTENSIBLE_EDEFAULT == null ? extensible != null : !EXTENSIBLE_EDEFAULT.equals(extensible);
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__LISTED:
				return listed != LISTED_EDEFAULT;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__SUPPORTED_BRIDGE_TYPE_REFS:
				return supportedBridgeTypeRefs != null;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__CHANNELS:
				return channels != null;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__CHANNEL_GROUPS:
				return channelGroups != null;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__PROPERTIES:
				return properties != null;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__CONFIG_DESCRIPTION:
				return configDescription != null;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_TYPE__CONFIG_DESCRIPTION_REF:
				return configDescriptionRef != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (label: ");
		result.append(label);
		result.append(", description: ");
		result.append(description);
		result.append(", category: ");
		result.append(category);
		result.append(", representationProperty: ");
		result.append(representationProperty);
		result.append(", extensible: ");
		result.append(extensible);
		result.append(", id: ");
		result.append(id);
		result.append(", listed: ");
		result.append(listed);
		result.append(')');
		return result.toString();
	}

} //ThingTypeImpl
