/**
 */
package tosca;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TOperation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tosca.TOperation#getInputParameters <em>Input Parameters</em>}</li>
 *   <li>{@link tosca.TOperation#getOutputParameters <em>Output Parameters</em>}</li>
 *   <li>{@link tosca.TOperation#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see tosca.ToscaPackage#getTOperation()
 * @model
 * @generated
 */
public interface TOperation extends TExtensibleElements {
	/**
	 * Returns the value of the '<em><b>Input Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Parameters</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Parameters</em>' containment reference.
	 * @see #setInputParameters(InputParametersType)
	 * @see tosca.ToscaPackage#getTOperation_InputParameters()
	 * @model containment="true"
	 * @generated
	 */
	InputParametersType getInputParameters();

	/**
	 * Sets the value of the '{@link tosca.TOperation#getInputParameters <em>Input Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Parameters</em>' containment reference.
	 * @see #getInputParameters()
	 * @generated
	 */
	void setInputParameters(InputParametersType value);

	/**
	 * Returns the value of the '<em><b>Output Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Parameters</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Parameters</em>' containment reference.
	 * @see #setOutputParameters(OutputParametersType)
	 * @see tosca.ToscaPackage#getTOperation_OutputParameters()
	 * @model containment="true"
	 * @generated
	 */
	OutputParametersType getOutputParameters();

	/**
	 * Sets the value of the '{@link tosca.TOperation#getOutputParameters <em>Output Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Parameters</em>' containment reference.
	 * @see #getOutputParameters()
	 * @generated
	 */
	void setOutputParameters(OutputParametersType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tosca.ToscaPackage#getTOperation_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tosca.TOperation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // TOperation
