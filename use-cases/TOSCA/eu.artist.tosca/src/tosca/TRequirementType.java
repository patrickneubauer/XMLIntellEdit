/**
 */
package tosca;

import javax.xml.namespace.QName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TRequirement Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tosca.TRequirementType#getRequiredCapabilityType <em>Required Capability Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see tosca.ToscaPackage#getTRequirementType()
 * @model
 * @generated
 */
public interface TRequirementType extends TEntityType {
	/**
	 * Returns the value of the '<em><b>Required Capability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Capability Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Capability Type</em>' attribute.
	 * @see #setRequiredCapabilityType(QName)
	 * @see tosca.ToscaPackage#getTRequirementType_RequiredCapabilityType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 * @generated
	 */
	QName getRequiredCapabilityType();

	/**
	 * Sets the value of the '{@link tosca.TRequirementType#getRequiredCapabilityType <em>Required Capability Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Capability Type</em>' attribute.
	 * @see #getRequiredCapabilityType()
	 * @generated
	 */
	void setRequiredCapabilityType(QName value);

} // TRequirementType
