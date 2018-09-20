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

import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.BridgeTypeRef;
import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.SupportedBridgeTypeRefs;
import org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supported Bridge Type Refs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.impl.SupportedBridgeTypeRefsImpl#getBridgeTypeRefs <em>Bridge Type Refs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SupportedBridgeTypeRefsImpl extends MinimalEObjectImpl.Container implements SupportedBridgeTypeRefs {
	/**
	 * The cached value of the '{@link #getBridgeTypeRefs() <em>Bridge Type Refs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBridgeTypeRefs()
	 * @generated
	 * @ordered
	 */
	protected EList<BridgeTypeRef> bridgeTypeRefs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupportedBridgeTypeRefsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.Literals.SUPPORTED_BRIDGE_TYPE_REFS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BridgeTypeRef> getBridgeTypeRefs() {
		if (bridgeTypeRefs == null) {
			bridgeTypeRefs = new EObjectContainmentEList<BridgeTypeRef>(BridgeTypeRef.class, this, org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.SUPPORTED_BRIDGE_TYPE_REFS__BRIDGE_TYPE_REFS);
		}
		return bridgeTypeRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.SUPPORTED_BRIDGE_TYPE_REFS__BRIDGE_TYPE_REFS:
				return ((InternalEList<?>)getBridgeTypeRefs()).basicRemove(otherEnd, msgs);
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
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.SUPPORTED_BRIDGE_TYPE_REFS__BRIDGE_TYPE_REFS:
				return getBridgeTypeRefs();
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
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.SUPPORTED_BRIDGE_TYPE_REFS__BRIDGE_TYPE_REFS:
				getBridgeTypeRefs().clear();
				getBridgeTypeRefs().addAll((Collection<? extends BridgeTypeRef>)newValue);
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
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.SUPPORTED_BRIDGE_TYPE_REFS__BRIDGE_TYPE_REFS:
				getBridgeTypeRefs().clear();
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
			case org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage.SUPPORTED_BRIDGE_TYPE_REFS__BRIDGE_TYPE_REFS:
				return bridgeTypeRefs != null && !bridgeTypeRefs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SupportedBridgeTypeRefsImpl
