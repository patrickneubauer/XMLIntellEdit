/**
 */
package tosca;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirements Type TRequirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tosca.RequirementsType_TRequirement#getRequirement <em>Requirement</em>}</li>
 * </ul>
 * </p>
 *
 * @see tosca.ToscaPackage#getRequirementsType_TRequirement()
 * @model
 * @generated
 */
public interface RequirementsType_TRequirement extends EObject {
	/**
	 * Returns the value of the '<em><b>Requirement</b></em>' containment reference list.
	 * The list contents are of type {@link tosca.TRequirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement</em>' containment reference list.
	 * @see tosca.ToscaPackage#getRequirementsType_TRequirement_Requirement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TRequirement> getRequirement();

} // RequirementsType_TRequirement
