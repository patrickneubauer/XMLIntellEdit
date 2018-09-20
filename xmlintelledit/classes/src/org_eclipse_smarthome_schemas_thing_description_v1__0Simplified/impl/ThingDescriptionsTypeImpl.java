/**
 */
package org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.BridgeType;
import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelGroupType;
import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelType;
import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingDescriptionsType;
import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingType;
import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Thing Descriptions Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ThingDescriptionsTypeImpl#getBindingId <em>Binding Id</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ThingDescriptionsTypeImpl#getThingTypes <em>Thing Types</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ThingDescriptionsTypeImpl#getBridgeTypes <em>Bridge Types</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ThingDescriptionsTypeImpl#getChannelTypes <em>Channel Types</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ThingDescriptionsTypeImpl#getChannelGroupTypes <em>Channel Group Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThingDescriptionsTypeImpl extends MinimalEObjectImpl.Container implements ThingDescriptionsType {
	/**
	 * The default value of the '{@link #getBindingId() <em>Binding Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingId()
	 * @generated
	 * @ordered
	 */
	protected static final String BINDING_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBindingId() <em>Binding Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingId()
	 * @generated
	 * @ordered
	 */
	protected String bindingId = BINDING_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getThingTypes() <em>Thing Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThingTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ThingType> thingTypes;

	/**
	 * The cached value of the '{@link #getBridgeTypes() <em>Bridge Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBridgeTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<BridgeType> bridgeTypes;

	/**
	 * The cached value of the '{@link #getChannelTypes() <em>Channel Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ChannelType> channelTypes;

	/**
	 * The cached value of the '{@link #getChannelGroupTypes() <em>Channel Group Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelGroupTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ChannelGroupType> channelGroupTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThingDescriptionsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.Literals.THING_DESCRIPTIONS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBindingId() {
		return bindingId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindingId(String newBindingId) {
		String oldBindingId = bindingId;
		bindingId = newBindingId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_DESCRIPTIONS_TYPE__BINDING_ID, oldBindingId, bindingId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ThingType> getThingTypes() {
		if (thingTypes == null) {
			thingTypes = new EObjectContainmentEList<ThingType>(ThingType.class, this, org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_DESCRIPTIONS_TYPE__THING_TYPES);
		}
		return thingTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BridgeType> getBridgeTypes() {
		if (bridgeTypes == null) {
			bridgeTypes = new EObjectContainmentEList<BridgeType>(BridgeType.class, this, org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_DESCRIPTIONS_TYPE__BRIDGE_TYPES);
		}
		return bridgeTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChannelType> getChannelTypes() {
		if (channelTypes == null) {
			channelTypes = new EObjectContainmentEList<ChannelType>(ChannelType.class, this, org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_DESCRIPTIONS_TYPE__CHANNEL_TYPES);
		}
		return channelTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChannelGroupType> getChannelGroupTypes() {
		if (channelGroupTypes == null) {
			channelGroupTypes = new EObjectContainmentEList<ChannelGroupType>(ChannelGroupType.class, this, org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_DESCRIPTIONS_TYPE__CHANNEL_GROUP_TYPES);
		}
		return channelGroupTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_DESCRIPTIONS_TYPE__THING_TYPES:
				return ((InternalEList<?>)getThingTypes()).basicRemove(otherEnd, msgs);
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_DESCRIPTIONS_TYPE__BRIDGE_TYPES:
				return ((InternalEList<?>)getBridgeTypes()).basicRemove(otherEnd, msgs);
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_DESCRIPTIONS_TYPE__CHANNEL_TYPES:
				return ((InternalEList<?>)getChannelTypes()).basicRemove(otherEnd, msgs);
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_DESCRIPTIONS_TYPE__CHANNEL_GROUP_TYPES:
				return ((InternalEList<?>)getChannelGroupTypes()).basicRemove(otherEnd, msgs);
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
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_DESCRIPTIONS_TYPE__BINDING_ID:
				return getBindingId();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_DESCRIPTIONS_TYPE__THING_TYPES:
				return getThingTypes();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_DESCRIPTIONS_TYPE__BRIDGE_TYPES:
				return getBridgeTypes();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_DESCRIPTIONS_TYPE__CHANNEL_TYPES:
				return getChannelTypes();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_DESCRIPTIONS_TYPE__CHANNEL_GROUP_TYPES:
				return getChannelGroupTypes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_DESCRIPTIONS_TYPE__BINDING_ID:
				setBindingId((String)newValue);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_DESCRIPTIONS_TYPE__THING_TYPES:
				getThingTypes().clear();
				getThingTypes().addAll((Collection<? extends ThingType>)newValue);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_DESCRIPTIONS_TYPE__BRIDGE_TYPES:
				getBridgeTypes().clear();
				getBridgeTypes().addAll((Collection<? extends BridgeType>)newValue);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_DESCRIPTIONS_TYPE__CHANNEL_TYPES:
				getChannelTypes().clear();
				getChannelTypes().addAll((Collection<? extends ChannelType>)newValue);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_DESCRIPTIONS_TYPE__CHANNEL_GROUP_TYPES:
				getChannelGroupTypes().clear();
				getChannelGroupTypes().addAll((Collection<? extends ChannelGroupType>)newValue);
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
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_DESCRIPTIONS_TYPE__BINDING_ID:
				setBindingId(BINDING_ID_EDEFAULT);
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_DESCRIPTIONS_TYPE__THING_TYPES:
				getThingTypes().clear();
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_DESCRIPTIONS_TYPE__BRIDGE_TYPES:
				getBridgeTypes().clear();
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_DESCRIPTIONS_TYPE__CHANNEL_TYPES:
				getChannelTypes().clear();
				return;
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_DESCRIPTIONS_TYPE__CHANNEL_GROUP_TYPES:
				getChannelGroupTypes().clear();
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
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_DESCRIPTIONS_TYPE__BINDING_ID:
				return BINDING_ID_EDEFAULT == null ? bindingId != null : !BINDING_ID_EDEFAULT.equals(bindingId);
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_DESCRIPTIONS_TYPE__THING_TYPES:
				return thingTypes != null && !thingTypes.isEmpty();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_DESCRIPTIONS_TYPE__BRIDGE_TYPES:
				return bridgeTypes != null && !bridgeTypes.isEmpty();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_DESCRIPTIONS_TYPE__CHANNEL_TYPES:
				return channelTypes != null && !channelTypes.isEmpty();
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.THING_DESCRIPTIONS_TYPE__CHANNEL_GROUP_TYPES:
				return channelGroupTypes != null && !channelGroupTypes.isEmpty();
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
		result.append(" (bindingId: ");
		result.append(bindingId);
		result.append(')');
		return result.toString();
	}

} //ThingDescriptionsTypeImpl
