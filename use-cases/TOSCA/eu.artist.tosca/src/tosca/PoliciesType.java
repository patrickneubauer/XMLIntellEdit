/**
 */
package tosca;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Policies Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tosca.PoliciesType#getPolicy <em>Policy</em>}</li>
 * </ul>
 * </p>
 *
 * @see tosca.ToscaPackage#getPoliciesType()
 * @model
 * @generated
 */
public interface PoliciesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Policy</b></em>' containment reference list.
	 * The list contents are of type {@link tosca.TPolicy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy</em>' containment reference list.
	 * @see tosca.ToscaPackage#getPoliciesType_Policy()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TPolicy> getPolicy();

} // PoliciesType
