/**
 */
package tosca;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capabilities Type TCapability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tosca.CapabilitiesType_TCapability#getCapability <em>Capability</em>}</li>
 * </ul>
 * </p>
 *
 * @see tosca.ToscaPackage#getCapabilitiesType_TCapability()
 * @model
 * @generated
 */
public interface CapabilitiesType_TCapability extends EObject {
	/**
	 * Returns the value of the '<em><b>Capability</b></em>' containment reference list.
	 * The list contents are of type {@link tosca.TCapability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capability</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability</em>' containment reference list.
	 * @see tosca.ToscaPackage#getCapabilitiesType_TCapability_Capability()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TCapability> getCapability();

} // CapabilitiesType_TCapability
