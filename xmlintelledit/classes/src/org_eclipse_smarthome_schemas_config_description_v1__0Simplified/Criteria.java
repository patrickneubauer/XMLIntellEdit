/**
 */
package org_eclipse_smarthome_schemas_config_description_v1__0Simplified;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Criteria</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Criteria#getValue <em>Value</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Criteria#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage#getCriteria()
 * @model
 * @generated
 */
public interface Criteria extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage#getCriteria_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Criteria#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage#getCriteria_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Criteria#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Criteria
