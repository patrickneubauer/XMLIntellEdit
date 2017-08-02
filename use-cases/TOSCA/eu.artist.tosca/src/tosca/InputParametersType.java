/**
 */
package tosca;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Parameters Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tosca.InputParametersType#getInputParameter <em>Input Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see tosca.ToscaPackage#getInputParametersType()
 * @model
 * @generated
 */
public interface InputParametersType extends EObject {
	/**
	 * Returns the value of the '<em><b>Input Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link tosca.TParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Parameter</em>' containment reference list.
	 * @see tosca.ToscaPackage#getInputParametersType_InputParameter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TParameter> getInputParameter();

} // InputParametersType
