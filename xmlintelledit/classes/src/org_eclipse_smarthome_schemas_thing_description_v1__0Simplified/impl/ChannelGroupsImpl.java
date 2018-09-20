/**
 */
package org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelGroup;
import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelGroups;
import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Channel Groups</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.ChannelGroupsImpl#getChannelGroups <em>Channel Groups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChannelGroupsImpl extends MinimalEObjectImpl.Container implements ChannelGroups {
	/**
	 * The cached value of the '{@link #getChannelGroups() <em>Channel Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<ChannelGroup> channelGroups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChannelGroupsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.Literals.CHANNEL_GROUPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChannelGroup> getChannelGroups() {
		if (channelGroups == null) {
			channelGroups = new EObjectContainmentEList<ChannelGroup>(ChannelGroup.class, this, org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.CHANNEL_GROUPS__CHANNEL_GROUPS);
		}
		return channelGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.CHANNEL_GROUPS__CHANNEL_GROUPS:
				return ((InternalEList<?>)getChannelGroups()).basicRemove(otherEnd, msgs);
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
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.CHANNEL_GROUPS__CHANNEL_GROUPS:
				return getChannelGroups();
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
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.CHANNEL_GROUPS__CHANNEL_GROUPS:
				getChannelGroups().clear();
				getChannelGroups().addAll((Collection<? extends ChannelGroup>)newValue);
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
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.CHANNEL_GROUPS__CHANNEL_GROUPS:
				getChannelGroups().clear();
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
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.CHANNEL_GROUPS__CHANNEL_GROUPS:
				return channelGroups != null && !channelGroups.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ChannelGroupsImpl
