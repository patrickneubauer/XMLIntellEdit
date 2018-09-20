/**
 */
package org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org_eclipse_smarthome_schemas_config_description_v1__0Simplified.ConfigDescription;
import org_eclipse_smarthome_schemas_config_description_v1__0Simplified.ConfigDescriptions;
import org_eclipse_smarthome_schemas_config_description_v1__0Simplified.org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Config Descriptions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.ConfigDescriptionsImpl#getConfigDescriptions <em>Config Descriptions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigDescriptionsImpl extends MinimalEObjectImpl.Container implements ConfigDescriptions {
	/**
	 * The cached value of the '{@link #getConfigDescriptions() <em>Config Descriptions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigDescription> configDescriptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigDescriptionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage.Literals.CONFIG_DESCRIPTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfigDescription> getConfigDescriptions() {
		if (configDescriptions == null) {
			configDescriptions = new EObjectContainmentEList<ConfigDescription>(ConfigDescription.class, this, org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage.CONFIG_DESCRIPTIONS__CONFIG_DESCRIPTIONS);
		}
		return configDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage.CONFIG_DESCRIPTIONS__CONFIG_DESCRIPTIONS:
				return ((InternalEList<?>)getConfigDescriptions()).basicRemove(otherEnd, msgs);
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
			case org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage.CONFIG_DESCRIPTIONS__CONFIG_DESCRIPTIONS:
				return getConfigDescriptions();
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
			case org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage.CONFIG_DESCRIPTIONS__CONFIG_DESCRIPTIONS:
				getConfigDescriptions().clear();
				getConfigDescriptions().addAll((Collection<? extends ConfigDescription>)newValue);
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
			case org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage.CONFIG_DESCRIPTIONS__CONFIG_DESCRIPTIONS:
				getConfigDescriptions().clear();
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
			case org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage.CONFIG_DESCRIPTIONS__CONFIG_DESCRIPTIONS:
				return configDescriptions != null && !configDescriptions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConfigDescriptionsImpl
