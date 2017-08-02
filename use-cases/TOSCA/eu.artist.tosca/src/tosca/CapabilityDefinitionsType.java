/**
 */
package tosca;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability Definitions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tosca.CapabilityDefinitionsType#getCapabilityDefinition <em>Capability Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see tosca.ToscaPackage#getCapabilityDefinitionsType()
 * @model
 * @generated
 */
public interface CapabilityDefinitionsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Capability Definition</b></em>' containment reference list.
	 * The list contents are of type {@link tosca.TCapabilityDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capability Definition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability Definition</em>' containment reference list.
	 * @see tosca.ToscaPackage#getCapabilityDefinitionsType_CapabilityDefinition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TCapabilityDefinition> getCapabilityDefinition();

} // CapabilityDefinitionsType
