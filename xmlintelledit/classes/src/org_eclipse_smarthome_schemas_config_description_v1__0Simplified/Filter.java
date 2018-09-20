/**
 */
package org_eclipse_smarthome_schemas_config_description_v1__0Simplified;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Filter#getCriterias <em>Criterias</em>}</li>
 * </ul>
 *
 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage#getFilter()
 * @model
 * @generated
 */
public interface Filter extends EObject {
	/**
	 * Returns the value of the '<em><b>Criterias</b></em>' containment reference list.
	 * The list contents are of type {@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.Criteria}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Criterias</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criterias</em>' containment reference list.
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage#getFilter_Criterias()
	 * @model containment="true"
	 * @generated
	 */
	EList<Criteria> getCriterias();

} // Filter
