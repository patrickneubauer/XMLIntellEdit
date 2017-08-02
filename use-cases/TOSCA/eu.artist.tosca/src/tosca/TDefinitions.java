/**
 */
package tosca;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TDefinitions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tosca.TDefinitions#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link tosca.TDefinitions#getImport <em>Import</em>}</li>
 *   <li>{@link tosca.TDefinitions#getTypes <em>Types</em>}</li>
 *   <li>{@link tosca.TDefinitions#getGroup <em>Group</em>}</li>
 *   <li>{@link tosca.TDefinitions#getServiceTemplate <em>Service Template</em>}</li>
 *   <li>{@link tosca.TDefinitions#getNodeType <em>Node Type</em>}</li>
 *   <li>{@link tosca.TDefinitions#getNodeTypeImplementation <em>Node Type Implementation</em>}</li>
 *   <li>{@link tosca.TDefinitions#getRelationshipType <em>Relationship Type</em>}</li>
 *   <li>{@link tosca.TDefinitions#getRelationshipTypeImplementation <em>Relationship Type Implementation</em>}</li>
 *   <li>{@link tosca.TDefinitions#getRequirementType <em>Requirement Type</em>}</li>
 *   <li>{@link tosca.TDefinitions#getCapabilityType <em>Capability Type</em>}</li>
 *   <li>{@link tosca.TDefinitions#getArtifactType <em>Artifact Type</em>}</li>
 *   <li>{@link tosca.TDefinitions#getArtifactTemplate <em>Artifact Template</em>}</li>
 *   <li>{@link tosca.TDefinitions#getPolicyType <em>Policy Type</em>}</li>
 *   <li>{@link tosca.TDefinitions#getPolicyTemplate <em>Policy Template</em>}</li>
 *   <li>{@link tosca.TDefinitions#getId <em>Id</em>}</li>
 *   <li>{@link tosca.TDefinitions#getName <em>Name</em>}</li>
 *   <li>{@link tosca.TDefinitions#getTargetNamespace <em>Target Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @see tosca.ToscaPackage#getTDefinitions()
 * @model
 * @generated
 */
public interface TDefinitions extends TExtensibleElements {
	/**
	 * Returns the value of the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extensions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extensions</em>' containment reference.
	 * @see #setExtensions(ExtensionsType)
	 * @see tosca.ToscaPackage#getTDefinitions_Extensions()
	 * @model containment="true"
	 * @generated
	 */
	ExtensionsType getExtensions();

	/**
	 * Sets the value of the '{@link tosca.TDefinitions#getExtensions <em>Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extensions</em>' containment reference.
	 * @see #getExtensions()
	 * @generated
	 */
	void setExtensions(ExtensionsType value);

	/**
	 * Returns the value of the '<em><b>Import</b></em>' containment reference list.
	 * The list contents are of type {@link tosca.TImport}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import</em>' containment reference list.
	 * @see tosca.ToscaPackage#getTDefinitions_Import()
	 * @model containment="true"
	 * @generated
	 */
	EList<TImport> getImport();

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference.
	 * @see #setTypes(TypesType)
	 * @see tosca.ToscaPackage#getTDefinitions_Types()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Types' namespace='##targetNamespace'"
	 * @generated
	 */
	TypesType getTypes();

	/**
	 * Sets the value of the '{@link tosca.TDefinitions#getTypes <em>Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Types</em>' containment reference.
	 * @see #getTypes()
	 * @generated
	 */
	void setTypes(TypesType value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see tosca.ToscaPackage#getTDefinitions_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:6'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Service Template</b></em>' containment reference list.
	 * The list contents are of type {@link tosca.TServiceTemplate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Template</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Template</em>' containment reference list.
	 * @see tosca.ToscaPackage#getTDefinitions_ServiceTemplate()
	 * @model containment="true"
	 * @generated
	 */
	EList<TServiceTemplate> getServiceTemplate();

	/**
	 * Returns the value of the '<em><b>Node Type</b></em>' containment reference list.
	 * The list contents are of type {@link tosca.TNodeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Type</em>' containment reference list.
	 * @see tosca.ToscaPackage#getTDefinitions_NodeType()
	 * @model containment="true"
	 * @generated
	 */
	EList<TNodeType> getNodeType();

	/**
	 * Returns the value of the '<em><b>Node Type Implementation</b></em>' containment reference list.
	 * The list contents are of type {@link tosca.TNodeTypeImplementation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Type Implementation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Type Implementation</em>' containment reference list.
	 * @see tosca.ToscaPackage#getTDefinitions_NodeTypeImplementation()
	 * @model containment="true"
	 * @generated
	 */
	EList<TNodeTypeImplementation> getNodeTypeImplementation();

	/**
	 * Returns the value of the '<em><b>Relationship Type</b></em>' containment reference list.
	 * The list contents are of type {@link tosca.TRelationshipType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship Type</em>' containment reference list.
	 * @see tosca.ToscaPackage#getTDefinitions_RelationshipType()
	 * @model containment="true"
	 * @generated
	 */
	EList<TRelationshipType> getRelationshipType();

	/**
	 * Returns the value of the '<em><b>Relationship Type Implementation</b></em>' containment reference list.
	 * The list contents are of type {@link tosca.TRelationshipTypeImplementation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship Type Implementation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship Type Implementation</em>' containment reference list.
	 * @see tosca.ToscaPackage#getTDefinitions_RelationshipTypeImplementation()
	 * @model containment="true"
	 * @generated
	 */
	EList<TRelationshipTypeImplementation> getRelationshipTypeImplementation();

	/**
	 * Returns the value of the '<em><b>Requirement Type</b></em>' containment reference list.
	 * The list contents are of type {@link tosca.TRequirementType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement Type</em>' containment reference list.
	 * @see tosca.ToscaPackage#getTDefinitions_RequirementType()
	 * @model containment="true"
	 * @generated
	 */
	EList<TRequirementType> getRequirementType();

	/**
	 * Returns the value of the '<em><b>Capability Type</b></em>' containment reference list.
	 * The list contents are of type {@link tosca.TCapabilityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capability Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability Type</em>' containment reference list.
	 * @see tosca.ToscaPackage#getTDefinitions_CapabilityType()
	 * @model containment="true"
	 * @generated
	 */
	EList<TCapabilityType> getCapabilityType();

	/**
	 * Returns the value of the '<em><b>Artifact Type</b></em>' containment reference list.
	 * The list contents are of type {@link tosca.TArtifactType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact Type</em>' containment reference list.
	 * @see tosca.ToscaPackage#getTDefinitions_ArtifactType()
	 * @model containment="true"
	 * @generated
	 */
	EList<TArtifactType> getArtifactType();

	/**
	 * Returns the value of the '<em><b>Artifact Template</b></em>' containment reference list.
	 * The list contents are of type {@link tosca.TArtifactTemplate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact Template</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact Template</em>' containment reference list.
	 * @see tosca.ToscaPackage#getTDefinitions_ArtifactTemplate()
	 * @model containment="true"
	 * @generated
	 */
	EList<TArtifactTemplate> getArtifactTemplate();

	/**
	 * Returns the value of the '<em><b>Policy Type</b></em>' containment reference list.
	 * The list contents are of type {@link tosca.TPolicyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy Type</em>' containment reference list.
	 * @see tosca.ToscaPackage#getTDefinitions_PolicyType()
	 * @model containment="true"
	 * @generated
	 */
	EList<TPolicyType> getPolicyType();

	/**
	 * Returns the value of the '<em><b>Policy Template</b></em>' containment reference list.
	 * The list contents are of type {@link tosca.TPolicyTemplate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy Template</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy Template</em>' containment reference list.
	 * @see tosca.ToscaPackage#getTDefinitions_PolicyTemplate()
	 * @model containment="true"
	 * @generated
	 */
	EList<TPolicyTemplate> getPolicyTemplate();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see tosca.ToscaPackage#getTDefinitions_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link tosca.TDefinitions#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

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
	 * @see tosca.ToscaPackage#getTDefinitions_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tosca.TDefinitions#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Namespace</em>' attribute.
	 * @see #setTargetNamespace(String)
	 * @see tosca.ToscaPackage#getTDefinitions_TargetNamespace()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 * @generated
	 */
	String getTargetNamespace();

	/**
	 * Sets the value of the '{@link tosca.TDefinitions#getTargetNamespace <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Namespace</em>' attribute.
	 * @see #getTargetNamespace()
	 * @generated
	 */
	void setTargetNamespace(String value);

} // TDefinitions
