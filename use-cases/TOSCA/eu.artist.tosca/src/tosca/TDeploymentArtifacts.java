/**
 */
package tosca;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TDeployment Artifacts</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tosca.TDeploymentArtifacts#getDeploymentArtifact <em>Deployment Artifact</em>}</li>
 * </ul>
 * </p>
 *
 * @see tosca.ToscaPackage#getTDeploymentArtifacts()
 * @model
 * @generated
 */
public interface TDeploymentArtifacts extends EObject {
	/**
	 * Returns the value of the '<em><b>Deployment Artifact</b></em>' containment reference list.
	 * The list contents are of type {@link tosca.TDeploymentArtifact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployment Artifact</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment Artifact</em>' containment reference list.
	 * @see tosca.ToscaPackage#getTDeploymentArtifacts_DeploymentArtifact()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TDeploymentArtifact> getDeploymentArtifact();

} // TDeploymentArtifacts
