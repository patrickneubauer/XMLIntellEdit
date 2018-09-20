/**
 */
package org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl;

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

import org_eclipse_smarthome_schemas_config_description_v1__0Simplified.ConfigDescription;
import org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Parameter;
import org_eclipse_smarthome_schemas_config_description_v1__0Simplified.ParameterGroup;
import org_eclipse_smarthome_schemas_config_description_v1__0Simplified.org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Config Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.ConfigDescriptionImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.ConfigDescriptionImpl#getParameterGroups <em>Parameter Groups</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.impl.ConfigDescriptionImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigDescriptionImpl extends MinimalEObjectImpl.Container implements ConfigDescription {
	/**
	 * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameterGroups() <em>Parameter Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterGroup> parameterGroups;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage.Literals.CONFIG_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUri(String newUri) {
		String oldUri = uri;
		uri = newUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage.CONFIG_DESCRIPTION__URI, oldUri, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterGroup> getParameterGroups() {
		if (parameterGroups == null) {
			parameterGroups = new EObjectContainmentEList<ParameterGroup>(ParameterGroup.class, this, org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage.CONFIG_DESCRIPTION__PARAMETER_GROUPS);
		}
		return parameterGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage.CONFIG_DESCRIPTION__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage.CONFIG_DESCRIPTION__PARAMETER_GROUPS:
				return ((InternalEList<?>)getParameterGroups()).basicRemove(otherEnd, msgs);
			case org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage.CONFIG_DESCRIPTION__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
			case org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage.CONFIG_DESCRIPTION__URI:
				return getUri();
			case org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage.CONFIG_DESCRIPTION__PARAMETER_GROUPS:
				return getParameterGroups();
			case org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage.CONFIG_DESCRIPTION__PARAMETERS:
				return getParameters();
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
			case org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage.CONFIG_DESCRIPTION__URI:
				setUri((String)newValue);
				return;
			case org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage.CONFIG_DESCRIPTION__PARAMETER_GROUPS:
				getParameterGroups().clear();
				getParameterGroups().addAll((Collection<? extends ParameterGroup>)newValue);
				return;
			case org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage.CONFIG_DESCRIPTION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
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
			case org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage.CONFIG_DESCRIPTION__URI:
				setUri(URI_EDEFAULT);
				return;
			case org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage.CONFIG_DESCRIPTION__PARAMETER_GROUPS:
				getParameterGroups().clear();
				return;
			case org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage.CONFIG_DESCRIPTION__PARAMETERS:
				getParameters().clear();
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
			case org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage.CONFIG_DESCRIPTION__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
			case org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage.CONFIG_DESCRIPTION__PARAMETER_GROUPS:
				return parameterGroups != null && !parameterGroups.isEmpty();
			case org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage.CONFIG_DESCRIPTION__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
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
		result.append(" (uri: ");
		result.append(uri);
		result.append(')');
		return result.toString();
	}

} //ConfigDescriptionImpl
