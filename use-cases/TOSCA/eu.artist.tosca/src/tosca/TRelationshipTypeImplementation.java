/**
 */
package tosca;

import javax.xml.namespace.QName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TRelationship Type Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tosca.TRelationshipTypeImplementation#getTags <em>Tags</em>}</li>
 *   <li>{@link tosca.TRelationshipTypeImplementation#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link tosca.TRelationshipTypeImplementation#getRequiredContainerFeatures <em>Required Container Features</em>}</li>
 *   <li>{@link tosca.TRelationshipTypeImplementation#getImplementationArtifacts <em>Implementation Artifacts</em>}</li>
 *   <li>{@link tosca.TRelationshipTypeImplementation#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link tosca.TRelationshipTypeImplementation#getFinal <em>Final</em>}</li>
 *   <li>{@link tosca.TRelationshipTypeImplementation#getName <em>Name</em>}</li>
 *   <li>{@link tosca.TRelationshipTypeImplementation#getRelationshipType <em>Relationship Type</em>}</li>
 *   <li>{@link tosca.TRelationshipTypeImplementation#getTargetNamespace <em>Target Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @see tosca.ToscaPackage#getTRelationshipTypeImplementation()
 * @model
 * @generated
 */
public interface TRelationshipTypeImplementation extends TExtensibleElements {
	/**
	 * Returns the value of the '<em><b>Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tags</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' containment reference.
	 * @see #setTags(TTags)
	 * @see tosca.ToscaPackage#getTRelationshipTypeImplementation_Tags()
	 * @model containment="true"
	 * @generated
	 */
	TTags getTags();

	/**
	 * Sets the value of the '{@link tosca.TRelationshipTypeImplementation#getTags <em>Tags</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tags</em>' containment reference.
	 * @see #getTags()
	 * @generated
	 */
	void setTags(TTags value);

	/**
	 * Returns the value of the '<em><b>Derived From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derived From</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived From</em>' containment reference.
	 * @see #setDerivedFrom(DerivedFromType)
	 * @see tosca.ToscaPackage#getTRelationshipTypeImplementation_DerivedFrom()
	 * @model containment="true"
	 * @generated
	 */
	DerivedFromType getDerivedFrom();

	/**
	 * Sets the value of the '{@link tosca.TRelationshipTypeImplementation#getDerivedFrom <em>Derived From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derived From</em>' containment reference.
	 * @see #getDerivedFrom()
	 * @generated
	 */
	void setDerivedFrom(DerivedFromType value);

	/**
	 * Returns the value of the '<em><b>Required Container Features</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Container Features</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Container Features</em>' containment reference.
	 * @see #setRequiredContainerFeatures(TRequiredContainerFeatures)
	 * @see tosca.ToscaPackage#getTRelationshipTypeImplementation_RequiredContainerFeatures()
	 * @model containment="true"
	 * @generated
	 */
	TRequiredContainerFeatures getRequiredContainerFeatures();

	/**
	 * Sets the value of the '{@link tosca.TRelationshipTypeImplementation#getRequiredContainerFeatures <em>Required Container Features</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Container Features</em>' containment reference.
	 * @see #getRequiredContainerFeatures()
	 * @generated
	 */
	void setRequiredContainerFeatures(TRequiredContainerFeatures value);

	/**
	 * Returns the value of the '<em><b>Implementation Artifacts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation Artifacts</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation Artifacts</em>' containment reference.
	 * @see #setImplementationArtifacts(TImplementationArtifacts)
	 * @see tosca.ToscaPackage#getTRelationshipTypeImplementation_ImplementationArtifacts()
	 * @model containment="true"
	 * @generated
	 */
	TImplementationArtifacts getImplementationArtifacts();

	/**
	 * Sets the value of the '{@link tosca.TRelationshipTypeImplementation#getImplementationArtifacts <em>Implementation Artifacts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation Artifacts</em>' containment reference.
	 * @see #getImplementationArtifacts()
	 * @generated
	 */
	void setImplementationArtifacts(TImplementationArtifacts value);

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * The default value is <code>"no"</code>.
	 * The literals are from the enumeration {@link tosca.TBoolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see tosca.TBoolean
	 * @see #isSetAbstract()
	 * @see #unsetAbstract()
	 * @see #setAbstract(TBoolean)
	 * @see tosca.ToscaPackage#getTRelationshipTypeImplementation_Abstract()
	 * @model default="no" unsettable="true"
	 * @generated
	 */
	TBoolean getAbstract();

	/**
	 * Sets the value of the '{@link tosca.TRelationshipTypeImplementation#getAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see tosca.TBoolean
	 * @see #isSetAbstract()
	 * @see #unsetAbstract()
	 * @see #getAbstract()
	 * @generated
	 */
	void setAbstract(TBoolean value);

	/**
	 * Unsets the value of the '{@link tosca.TRelationshipTypeImplementation#getAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAbstract()
	 * @see #getAbstract()
	 * @see #setAbstract(TBoolean)
	 * @generated
	 */
	void unsetAbstract();

	/**
	 * Returns whether the value of the '{@link tosca.TRelationshipTypeImplementation#getAbstract <em>Abstract</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Abstract</em>' attribute is set.
	 * @see #unsetAbstract()
	 * @see #getAbstract()
	 * @see #setAbstract(TBoolean)
	 * @generated
	 */
	boolean isSetAbstract();

	/**
	 * Returns the value of the '<em><b>Final</b></em>' attribute.
	 * The default value is <code>"no"</code>.
	 * The literals are from the enumeration {@link tosca.TBoolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final</em>' attribute.
	 * @see tosca.TBoolean
	 * @see #isSetFinal()
	 * @see #unsetFinal()
	 * @see #setFinal(TBoolean)
	 * @see tosca.ToscaPackage#getTRelationshipTypeImplementation_Final()
	 * @model default="no" unsettable="true"
	 * @generated
	 */
	TBoolean getFinal();

	/**
	 * Sets the value of the '{@link tosca.TRelationshipTypeImplementation#getFinal <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final</em>' attribute.
	 * @see tosca.TBoolean
	 * @see #isSetFinal()
	 * @see #unsetFinal()
	 * @see #getFinal()
	 * @generated
	 */
	void setFinal(TBoolean value);

	/**
	 * Unsets the value of the '{@link tosca.TRelationshipTypeImplementation#getFinal <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFinal()
	 * @see #getFinal()
	 * @see #setFinal(TBoolean)
	 * @generated
	 */
	void unsetFinal();

	/**
	 * Returns whether the value of the '{@link tosca.TRelationshipTypeImplementation#getFinal <em>Final</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Final</em>' attribute is set.
	 * @see #unsetFinal()
	 * @see #getFinal()
	 * @see #setFinal(TBoolean)
	 * @generated
	 */
	boolean isSetFinal();

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
	 * @see tosca.ToscaPackage#getTRelationshipTypeImplementation_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tosca.TRelationshipTypeImplementation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Relationship Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship Type</em>' attribute.
	 * @see #setRelationshipType(QName)
	 * @see tosca.ToscaPackage#getTRelationshipTypeImplementation_RelationshipType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
	 * @generated
	 */
	QName getRelationshipType();

	/**
	 * Sets the value of the '{@link tosca.TRelationshipTypeImplementation#getRelationshipType <em>Relationship Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship Type</em>' attribute.
	 * @see #getRelationshipType()
	 * @generated
	 */
	void setRelationshipType(QName value);

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
	 * @see tosca.ToscaPackage#getTRelationshipTypeImplementation_TargetNamespace()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 * @generated
	 */
	String getTargetNamespace();

	/**
	 * Sets the value of the '{@link tosca.TRelationshipTypeImplementation#getTargetNamespace <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Namespace</em>' attribute.
	 * @see #getTargetNamespace()
	 * @generated
	 */
	void setTargetNamespace(String value);

} // TRelationshipTypeImplementation
