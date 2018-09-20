/**
 */
package org_eclipse_smarthome_schemas_thing_description_v1__0Simplified;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channel Groups</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelGroups#getChannelGroups <em>Channel Groups</em>}</li>
 * </ul>
 *
 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage#getChannelGroups()
 * @model
 * @generated
 */
public interface ChannelGroups extends EObject {
	/**
	 * Returns the value of the '<em><b>Channel Groups</b></em>' containment reference list.
	 * The list contents are of type {@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channel Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel Groups</em>' containment reference list.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage#getChannelGroups_ChannelGroups()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ChannelGroup> getChannelGroups();

} // ChannelGroups
