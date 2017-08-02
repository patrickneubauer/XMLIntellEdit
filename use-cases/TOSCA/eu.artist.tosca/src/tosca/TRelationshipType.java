/**
 */
package tosca;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TRelationship Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tosca.TRelationshipType#getInstanceStates <em>Instance States</em>}</li>
 *   <li>{@link tosca.TRelationshipType#getSourceInterfaces <em>Source Interfaces</em>}</li>
 *   <li>{@link tosca.TRelationshipType#getTargetInterfaces <em>Target Interfaces</em>}</li>
 *   <li>{@link tosca.TRelationshipType#getValidSource <em>Valid Source</em>}</li>
 *   <li>{@link tosca.TRelationshipType#getValidTarget <em>Valid Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see tosca.ToscaPackage#getTRelationshipType()
 * @model
 * @generated
 */
public interface TRelationshipType extends TEntityType {
	/**
	 * Returns the value of the '<em><b>Instance States</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance States</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance States</em>' containment reference.
	 * @see #setInstanceStates(TTopologyElementInstanceStates)
	 * @see tosca.ToscaPackage#getTRelationshipType_InstanceStates()
	 * @model containment="true"
	 * @generated
	 */
	TTopologyElementInstanceStates getInstanceStates();

	/**
	 * Sets the value of the '{@link tosca.TRelationshipType#getInstanceStates <em>Instance States</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance States</em>' containment reference.
	 * @see #getInstanceStates()
	 * @generated
	 */
	void setInstanceStates(TTopologyElementInstanceStates value);

	/**
	 * Returns the value of the '<em><b>Source Interfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Interfaces</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Interfaces</em>' containment reference.
	 * @see #setSourceInterfaces(SourceInterfacesType)
	 * @see tosca.ToscaPackage#getTRelationshipType_SourceInterfaces()
	 * @model containment="true"
	 * @generated
	 */
	SourceInterfacesType getSourceInterfaces();

	/**
	 * Sets the value of the '{@link tosca.TRelationshipType#getSourceInterfaces <em>Source Interfaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Interfaces</em>' containment reference.
	 * @see #getSourceInterfaces()
	 * @generated
	 */
	void setSourceInterfaces(SourceInterfacesType value);

	/**
	 * Returns the value of the '<em><b>Target Interfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Interfaces</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Interfaces</em>' containment reference.
	 * @see #setTargetInterfaces(TargetInterfacesType)
	 * @see tosca.ToscaPackage#getTRelationshipType_TargetInterfaces()
	 * @model containment="true"
	 * @generated
	 */
	TargetInterfacesType getTargetInterfaces();

	/**
	 * Sets the value of the '{@link tosca.TRelationshipType#getTargetInterfaces <em>Target Interfaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Interfaces</em>' containment reference.
	 * @see #getTargetInterfaces()
	 * @generated
	 */
	void setTargetInterfaces(TargetInterfacesType value);

	/**
	 * Returns the value of the '<em><b>Valid Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Source</em>' containment reference.
	 * @see #setValidSource(ValidSourceType)
	 * @see tosca.ToscaPackage#getTRelationshipType_ValidSource()
	 * @model containment="true"
	 * @generated
	 */
	ValidSourceType getValidSource();

	/**
	 * Sets the value of the '{@link tosca.TRelationshipType#getValidSource <em>Valid Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid Source</em>' containment reference.
	 * @see #getValidSource()
	 * @generated
	 */
	void setValidSource(ValidSourceType value);

	/**
	 * Returns the value of the '<em><b>Valid Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Target</em>' containment reference.
	 * @see #setValidTarget(ValidTargetType)
	 * @see tosca.ToscaPackage#getTRelationshipType_ValidTarget()
	 * @model containment="true"
	 * @generated
	 */
	ValidTargetType getValidTarget();

	/**
	 * Sets the value of the '{@link tosca.TRelationshipType#getValidTarget <em>Valid Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid Target</em>' containment reference.
	 * @see #getValidTarget()
	 * @generated
	 */
	void setValidTarget(ValidTargetType value);

} // TRelationshipType
