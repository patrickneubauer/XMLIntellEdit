/**
 */
package org_eclipse_smarthome_schemas_thing_description_v1__0Simplified;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thing Descriptions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingDescriptionsType#getBindingId <em>Binding Id</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingDescriptionsType#getThingTypes <em>Thing Types</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingDescriptionsType#getBridgeTypes <em>Bridge Types</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingDescriptionsType#getChannelTypes <em>Channel Types</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingDescriptionsType#getChannelGroupTypes <em>Channel Group Types</em>}</li>
 * </ul>
 *
 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage#getThingDescriptionsType()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='patternBindingId'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot patternBindingId='self.bindingId.matches(\'[A-Za-z0-9\\\\-_]+\')'"
 * @generated
 */
public interface ThingDescriptionsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Binding Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding Id</em>' attribute.
	 * @see #setBindingId(String)
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage#getThingDescriptionsType_BindingId()
	 * @model required="true"
	 * @generated
	 */
	String getBindingId();

	/**
	 * Sets the value of the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingDescriptionsType#getBindingId <em>Binding Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding Id</em>' attribute.
	 * @see #getBindingId()
	 * @generated
	 */
	void setBindingId(String value);

	/**
	 * Returns the value of the '<em><b>Thing Types</b></em>' containment reference list.
	 * The list contents are of type {@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ThingType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thing Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thing Types</em>' containment reference list.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage#getThingDescriptionsType_ThingTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ThingType> getThingTypes();

	/**
	 * Returns the value of the '<em><b>Bridge Types</b></em>' containment reference list.
	 * The list contents are of type {@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.BridgeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bridge Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bridge Types</em>' containment reference list.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage#getThingDescriptionsType_BridgeTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<BridgeType> getBridgeTypes();

	/**
	 * Returns the value of the '<em><b>Channel Types</b></em>' containment reference list.
	 * The list contents are of type {@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channel Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel Types</em>' containment reference list.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage#getThingDescriptionsType_ChannelTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ChannelType> getChannelTypes();

	/**
	 * Returns the value of the '<em><b>Channel Group Types</b></em>' containment reference list.
	 * The list contents are of type {@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ChannelGroupType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channel Group Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel Group Types</em>' containment reference list.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage#getThingDescriptionsType_ChannelGroupTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ChannelGroupType> getChannelGroupTypes();

} // ThingDescriptionsType
