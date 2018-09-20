/**
 */
package org_eclipse_smarthome_schemas_thing_description_v1__0Simplified;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ConfigDescription#getUri <em>Uri</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ConfigDescription#getParameterGroups <em>Parameter Groups</em>}</li>
 *   <li>{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ConfigDescription#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage#getConfigDescription()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='patternUri'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot patternUri='(self.uri=null) or self.uri.matches(\'[A-Za-z0-9\\\\-_]+(:[A-Za-z0-9\\\\-_]+){1,2}\')'"
 * @generated
 */
public interface ConfigDescription extends EObject {
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
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage#getConfigDescription_Uri()
	 * @model
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ConfigDescription#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

	/**
	 * Returns the value of the '<em><b>Parameter Groups</b></em>' containment reference list.
	 * The list contents are of type {@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.ParameterGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Groups</em>' containment reference list.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage#getConfigDescription_ParameterGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterGroup> getParameterGroups();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org_eclipse_smarthome_schemas_thing_description_v1__0Simplified.org_eclipse_smarthome_schemas_thing_description_v1__0SimplifiedPackage#getConfigDescription_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

} // ConfigDescription
