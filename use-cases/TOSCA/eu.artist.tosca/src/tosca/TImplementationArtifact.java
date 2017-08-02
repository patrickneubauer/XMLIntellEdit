/**
 */
package tosca;

import javax.xml.namespace.QName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TImplementation Artifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tosca.TImplementationArtifact#getArtifactRef <em>Artifact Ref</em>}</li>
 *   <li>{@link tosca.TImplementationArtifact#getArtifactType <em>Artifact Type</em>}</li>
 *   <li>{@link tosca.TImplementationArtifact#getInterfaceName <em>Interface Name</em>}</li>
 *   <li>{@link tosca.TImplementationArtifact#getOperationName <em>Operation Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see tosca.ToscaPackage#getTImplementationArtifact()
 * @model
 * @generated
 */
public interface TImplementationArtifact extends TExtensibleElements {
	/**
	 * Returns the value of the '<em><b>Artifact Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact Ref</em>' attribute.
	 * @see #setArtifactRef(QName)
	 * @see tosca.ToscaPackage#getTImplementationArtifact_ArtifactRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 * @generated
	 */
	QName getArtifactRef();

	/**
	 * Sets the value of the '{@link tosca.TImplementationArtifact#getArtifactRef <em>Artifact Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact Ref</em>' attribute.
	 * @see #getArtifactRef()
	 * @generated
	 */
	void setArtifactRef(QName value);

	/**
	 * Returns the value of the '<em><b>Artifact Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact Type</em>' attribute.
	 * @see #setArtifactType(QName)
	 * @see tosca.ToscaPackage#getTImplementationArtifact_ArtifactType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
	 * @generated
	 */
	QName getArtifactType();

	/**
	 * Sets the value of the '{@link tosca.TImplementationArtifact#getArtifactType <em>Artifact Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact Type</em>' attribute.
	 * @see #getArtifactType()
	 * @generated
	 */
	void setArtifactType(QName value);

	/**
	 * Returns the value of the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Name</em>' attribute.
	 * @see #setInterfaceName(String)
	 * @see tosca.ToscaPackage#getTImplementationArtifact_InterfaceName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 * @generated
	 */
	String getInterfaceName();

	/**
	 * Sets the value of the '{@link tosca.TImplementationArtifact#getInterfaceName <em>Interface Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Name</em>' attribute.
	 * @see #getInterfaceName()
	 * @generated
	 */
	void setInterfaceName(String value);

	/**
	 * Returns the value of the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Name</em>' attribute.
	 * @see #setOperationName(String)
	 * @see tosca.ToscaPackage#getTImplementationArtifact_OperationName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
	 * @generated
	 */
	String getOperationName();

	/**
	 * Sets the value of the '{@link tosca.TImplementationArtifact#getOperationName <em>Operation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Name</em>' attribute.
	 * @see #getOperationName()
	 * @generated
	 */
	void setOperationName(String value);

} // TImplementationArtifact
