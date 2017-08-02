/**
 */
package tosca;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Interfaces Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tosca.SourceInterfacesType#getInterface <em>Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see tosca.ToscaPackage#getSourceInterfacesType()
 * @model
 * @generated
 */
public interface SourceInterfacesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Interface</b></em>' containment reference list.
	 * The list contents are of type {@link tosca.TInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' containment reference list.
	 * @see tosca.ToscaPackage#getSourceInterfacesType_Interface()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TInterface> getInterface();

} // SourceInterfacesType
