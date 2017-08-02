/**
 */
package tosca;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirements Type TRequirement Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tosca.RequirementsType_TRequirementRef#getRequirement <em>Requirement</em>}</li>
 * </ul>
 * </p>
 *
 * @see tosca.ToscaPackage#getRequirementsType_TRequirementRef()
 * @model
 * @generated
 */
public interface RequirementsType_TRequirementRef extends EObject {
	/**
	 * Returns the value of the '<em><b>Requirement</b></em>' containment reference list.
	 * The list contents are of type {@link tosca.TRequirementRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement</em>' containment reference list.
	 * @see tosca.ToscaPackage#getRequirementsType_TRequirementRef_Requirement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TRequirementRef> getRequirement();

} // RequirementsType_TRequirementRef
