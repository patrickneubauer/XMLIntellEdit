/**
 */
package tosca;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Parameters Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tosca.OutputParametersType#getOutputParameter <em>Output Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see tosca.ToscaPackage#getOutputParametersType()
 * @model
 * @generated
 */
public interface OutputParametersType extends EObject {
	/**
	 * Returns the value of the '<em><b>Output Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link tosca.TParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Parameter</em>' containment reference list.
	 * @see tosca.ToscaPackage#getOutputParametersType_OutputParameter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TParameter> getOutputParameter();

} // OutputParametersType
