/**
 */
package org_eclipse_smarthome_schemas_thing_description_v1__0Simplified;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config Descriptions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ConfigDescriptionsType#getConfigDescriptions <em>Config Descriptions</em>}</li>
 * </ul>
 *
 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage#getConfigDescriptionsType()
 * @model
 * @generated
 */
public interface ConfigDescriptionsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Config Descriptions</b></em>' containment reference list.
	 * The list contents are of type {@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ConfigDescription}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Descriptions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Descriptions</em>' containment reference list.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage#getConfigDescriptionsType_ConfigDescriptions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ConfigDescription> getConfigDescriptions();

} // ConfigDescriptionsType
