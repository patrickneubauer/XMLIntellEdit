/**
 */
package tosca;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TBoundary Definitions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tosca.TBoundaryDefinitions#getProperties <em>Properties</em>}</li>
 *   <li>{@link tosca.TBoundaryDefinitions#getPropertyConstraints <em>Property Constraints</em>}</li>
 *   <li>{@link tosca.TBoundaryDefinitions#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link tosca.TBoundaryDefinitions#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link tosca.TBoundaryDefinitions#getPolicies <em>Policies</em>}</li>
 *   <li>{@link tosca.TBoundaryDefinitions#getInterfaces <em>Interfaces</em>}</li>
 * </ul>
 * </p>
 *
 * @see tosca.ToscaPackage#getTBoundaryDefinitions()
 * @model
 * @generated
 */
public interface TBoundaryDefinitions extends EObject {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference.
	 * @see #setProperties(PropertiesTypeWithPropertyMappings)
	 * @see tosca.ToscaPackage#getTBoundaryDefinitions_Properties()
	 * @model containment="true"
	 * @generated
	 */
	PropertiesTypeWithPropertyMappings getProperties();

	/**
	 * Sets the value of the '{@link tosca.TBoundaryDefinitions#getProperties <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' containment reference.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(PropertiesTypeWithPropertyMappings value);

	/**
	 * Returns the value of the '<em><b>Property Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Constraints</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Constraints</em>' containment reference.
	 * @see #setPropertyConstraints(PropertyConstraintsType)
	 * @see tosca.ToscaPackage#getTBoundaryDefinitions_PropertyConstraints()
	 * @model containment="true"
	 * @generated
	 */
	PropertyConstraintsType getPropertyConstraints();

	/**
	 * Sets the value of the '{@link tosca.TBoundaryDefinitions#getPropertyConstraints <em>Property Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Constraints</em>' containment reference.
	 * @see #getPropertyConstraints()
	 * @generated
	 */
	void setPropertyConstraints(PropertyConstraintsType value);

	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirements</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirements</em>' containment reference.
	 * @see #setRequirements(RequirementsType_TRequirementRef)
	 * @see tosca.ToscaPackage#getTBoundaryDefinitions_Requirements()
	 * @model containment="true"
	 * @generated
	 */
	RequirementsType_TRequirementRef getRequirements();

	/**
	 * Sets the value of the '{@link tosca.TBoundaryDefinitions#getRequirements <em>Requirements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirements</em>' containment reference.
	 * @see #getRequirements()
	 * @generated
	 */
	void setRequirements(RequirementsType_TRequirementRef value);

	/**
	 * Returns the value of the '<em><b>Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capabilities</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capabilities</em>' containment reference.
	 * @see #setCapabilities(CapabilitiesType_CapabilityRef)
	 * @see tosca.ToscaPackage#getTBoundaryDefinitions_Capabilities()
	 * @model containment="true"
	 * @generated
	 */
	CapabilitiesType_CapabilityRef getCapabilities();

	/**
	 * Sets the value of the '{@link tosca.TBoundaryDefinitions#getCapabilities <em>Capabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capabilities</em>' containment reference.
	 * @see #getCapabilities()
	 * @generated
	 */
	void setCapabilities(CapabilitiesType_CapabilityRef value);

	/**
	 * Returns the value of the '<em><b>Policies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policies</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policies</em>' containment reference.
	 * @see #setPolicies(PoliciesType)
	 * @see tosca.ToscaPackage#getTBoundaryDefinitions_Policies()
	 * @model containment="true"
	 * @generated
	 */
	PoliciesType getPolicies();

	/**
	 * Sets the value of the '{@link tosca.TBoundaryDefinitions#getPolicies <em>Policies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policies</em>' containment reference.
	 * @see #getPolicies()
	 * @generated
	 */
	void setPolicies(PoliciesType value);

	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaces</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' containment reference.
	 * @see #setInterfaces(InterfacesType_TExportedInterface)
	 * @see tosca.ToscaPackage#getTBoundaryDefinitions_Interfaces()
	 * @model containment="true"
	 * @generated
	 */
	InterfacesType_TExportedInterface getInterfaces();

	/**
	 * Sets the value of the '{@link tosca.TBoundaryDefinitions#getInterfaces <em>Interfaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interfaces</em>' containment reference.
	 * @see #getInterfaces()
	 * @generated
	 */
	void setInterfaces(InterfacesType_TExportedInterface value);

} // TBoundaryDefinitions
