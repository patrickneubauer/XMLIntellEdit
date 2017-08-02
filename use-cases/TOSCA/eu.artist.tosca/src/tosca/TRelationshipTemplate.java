/**
 */
package tosca;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TRelationship Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tosca.TRelationshipTemplate#getSourceElement <em>Source Element</em>}</li>
 *   <li>{@link tosca.TRelationshipTemplate#getTargetElement <em>Target Element</em>}</li>
 *   <li>{@link tosca.TRelationshipTemplate#getRelationshipConstraints <em>Relationship Constraints</em>}</li>
 *   <li>{@link tosca.TRelationshipTemplate#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see tosca.ToscaPackage#getTRelationshipTemplate()
 * @model
 * @generated
 */
public interface TRelationshipTemplate extends TEntityTemplate {
	/**
	 * Returns the value of the '<em><b>Source Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Element</em>' containment reference.
	 * @see #setSourceElement(SourceElementType)
	 * @see tosca.ToscaPackage#getTRelationshipTemplate_SourceElement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SourceElementType getSourceElement();

	/**
	 * Sets the value of the '{@link tosca.TRelationshipTemplate#getSourceElement <em>Source Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Element</em>' containment reference.
	 * @see #getSourceElement()
	 * @generated
	 */
	void setSourceElement(SourceElementType value);

	/**
	 * Returns the value of the '<em><b>Target Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Element</em>' containment reference.
	 * @see #setTargetElement(TargetElementType)
	 * @see tosca.ToscaPackage#getTRelationshipTemplate_TargetElement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TargetElementType getTargetElement();

	/**
	 * Sets the value of the '{@link tosca.TRelationshipTemplate#getTargetElement <em>Target Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Element</em>' containment reference.
	 * @see #getTargetElement()
	 * @generated
	 */
	void setTargetElement(TargetElementType value);

	/**
	 * Returns the value of the '<em><b>Relationship Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship Constraints</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship Constraints</em>' containment reference.
	 * @see #setRelationshipConstraints(RelationshipConstraintsType)
	 * @see tosca.ToscaPackage#getTRelationshipTemplate_RelationshipConstraints()
	 * @model containment="true"
	 * @generated
	 */
	RelationshipConstraintsType getRelationshipConstraints();

	/**
	 * Sets the value of the '{@link tosca.TRelationshipTemplate#getRelationshipConstraints <em>Relationship Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship Constraints</em>' containment reference.
	 * @see #getRelationshipConstraints()
	 * @generated
	 */
	void setRelationshipConstraints(RelationshipConstraintsType value);

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
	 * @see tosca.ToscaPackage#getTRelationshipTemplate_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tosca.TRelationshipTemplate#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // TRelationshipTemplate
