/**
 */
package org_eclipse_smarthome_schemas_config_description_v1__0Simplified;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config Description Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.ConfigDescriptionRef#getUri <em>Uri</em>}</li>
 * </ul>
 *
 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage#getConfigDescriptionRef()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='patternUri'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot patternUri='self.uri.matches(\'[A-Za-z0-9\\\\-_]+(:[A-Za-z0-9\\\\-_]+){1,2}\')'"
 * @generated
 */
public interface ConfigDescriptionRef extends EObject {
	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see org_eclipse_smarthome_schemas_config_description_v1__0Simplified.org_eclipse_smarthome_schemas_config_description_v1__0SimplifiedPackage#getConfigDescriptionRef_Uri()
	 * @model required="true"
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link org_eclipse_smarthome_schemas_config_description_v1__0Simplified.ConfigDescriptionRef#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

} // ConfigDescriptionRef
