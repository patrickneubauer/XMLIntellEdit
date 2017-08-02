/**
 */
package tosca;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TExported Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tosca.TExportedOperation#getNodeOperation <em>Node Operation</em>}</li>
 *   <li>{@link tosca.TExportedOperation#getRelationshipOperation <em>Relationship Operation</em>}</li>
 *   <li>{@link tosca.TExportedOperation#getPlan <em>Plan</em>}</li>
 *   <li>{@link tosca.TExportedOperation#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see tosca.ToscaPackage#getTExportedOperation()
 * @model
 * @generated
 */
public interface TExportedOperation extends EObject {
	/**
	 * Returns the value of the '<em><b>Node Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Operation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Operation</em>' containment reference.
	 * @see #setNodeOperation(NodeOperationType)
	 * @see tosca.ToscaPackage#getTExportedOperation_NodeOperation()
	 * @model containment="true"
	 * @generated
	 */
	NodeOperationType getNodeOperation();

	/**
	 * Sets the value of the '{@link tosca.TExportedOperation#getNodeOperation <em>Node Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Operation</em>' containment reference.
	 * @see #getNodeOperation()
	 * @generated
	 */
	void setNodeOperation(NodeOperationType value);

	/**
	 * Returns the value of the '<em><b>Relationship Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship Operation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship Operation</em>' containment reference.
	 * @see #setRelationshipOperation(RelationshipOperationType)
	 * @see tosca.ToscaPackage#getTExportedOperation_RelationshipOperation()
	 * @model containment="true"
	 * @generated
	 */
	RelationshipOperationType getRelationshipOperation();

	/**
	 * Sets the value of the '{@link tosca.TExportedOperation#getRelationshipOperation <em>Relationship Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship Operation</em>' containment reference.
	 * @see #getRelationshipOperation()
	 * @generated
	 */
	void setRelationshipOperation(RelationshipOperationType value);

	/**
	 * Returns the value of the '<em><b>Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plan</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plan</em>' containment reference.
	 * @see #setPlan(PlanType)
	 * @see tosca.ToscaPackage#getTExportedOperation_Plan()
	 * @model containment="true"
	 * @generated
	 */
	PlanType getPlan();

	/**
	 * Sets the value of the '{@link tosca.TExportedOperation#getPlan <em>Plan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plan</em>' containment reference.
	 * @see #getPlan()
	 * @generated
	 */
	void setPlan(PlanType value);

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
	 * @see tosca.ToscaPackage#getTExportedOperation_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tosca.TExportedOperation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // TExportedOperation
