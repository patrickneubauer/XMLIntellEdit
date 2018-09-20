/**
 */
package org_eclipse_smarthome_schemas_thing_description_v1__0Simplified;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supported Bridge Type Refs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.SupportedBridgeTypeRefs#getBridgeTypeRefs <em>Bridge Type Refs</em>}</li>
 * </ul>
 *
 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage#getSupportedBridgeTypeRefs()
 * @model
 * @generated
 */
public interface SupportedBridgeTypeRefs extends EObject {
	/**
	 * Returns the value of the '<em><b>Bridge Type Refs</b></em>' containment reference list.
	 * The list contents are of type {@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.BridgeTypeRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bridge Type Refs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bridge Type Refs</em>' containment reference list.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage#getSupportedBridgeTypeRefs_BridgeTypeRefs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<BridgeTypeRef> getBridgeTypeRefs();

} // SupportedBridgeTypeRefs
