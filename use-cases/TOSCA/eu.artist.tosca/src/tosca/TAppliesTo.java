/**
 */
package tosca;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TApplies To</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tosca.TAppliesTo#getNodeTypeReference <em>Node Type Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see tosca.ToscaPackage#getTAppliesTo()
 * @model
 * @generated
 */
public interface TAppliesTo extends EObject {
	/**
	 * Returns the value of the '<em><b>Node Type Reference</b></em>' containment reference list.
	 * The list contents are of type {@link tosca.NodeTypeReferenceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Type Reference</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Type Reference</em>' containment reference list.
	 * @see tosca.ToscaPackage#getTAppliesTo_NodeTypeReference()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<NodeTypeReferenceType> getNodeTypeReference();

} // TAppliesTo
