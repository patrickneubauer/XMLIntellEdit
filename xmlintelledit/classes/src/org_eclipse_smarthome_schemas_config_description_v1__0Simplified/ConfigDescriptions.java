/**
 */
package org_eclipse_smarthome_schemas_config_description_v1__0Simplified;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config Descriptions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.ConfigDescriptions#getConfigDescriptions <em>Config Descriptions</em>}</li>
 * </ul>
 *
 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage#getConfigDescriptions()
 * @model
 * @generated
 */
public interface ConfigDescriptions extends EObject {
	/**
	 * Returns the value of the '<em><b>Config Descriptions</b></em>' containment reference list.
	 * The list contents are of type {@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.ConfigDescription}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Descriptions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Descriptions</em>' containment reference list.
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage#getConfigDescriptions_ConfigDescriptions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ConfigDescription> getConfigDescriptions();

} // ConfigDescriptions
