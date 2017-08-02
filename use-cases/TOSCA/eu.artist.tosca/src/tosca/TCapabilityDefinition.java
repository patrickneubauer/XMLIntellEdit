/**
 */
package tosca;

import javax.xml.namespace.QName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TCapability Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tosca.TCapabilityDefinition#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link tosca.TCapabilityDefinition#getCapabilityType <em>Capability Type</em>}</li>
 *   <li>{@link tosca.TCapabilityDefinition#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link tosca.TCapabilityDefinition#getName <em>Name</em>}</li>
 *   <li>{@link tosca.TCapabilityDefinition#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @see tosca.ToscaPackage#getTCapabilityDefinition()
 * @model
 * @generated
 */
public interface TCapabilityDefinition extends TExtensibleElements {
	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference.
	 * @see #setConstraints(ConstraintsType)
	 * @see tosca.ToscaPackage#getTCapabilityDefinition_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	ConstraintsType getConstraints();

	/**
	 * Sets the value of the '{@link tosca.TCapabilityDefinition#getConstraints <em>Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraints</em>' containment reference.
	 * @see #getConstraints()
	 * @generated
	 */
	void setConstraints(ConstraintsType value);

	/**
	 * Returns the value of the '<em><b>Capability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capability Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability Type</em>' attribute.
	 * @see #setCapabilityType(QName)
	 * @see tosca.ToscaPackage#getTCapabilityDefinition_CapabilityType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
	 * @generated
	 */
	QName getCapabilityType();

	/**
	 * Sets the value of the '{@link tosca.TCapabilityDefinition#getCapabilityType <em>Capability Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capability Type</em>' attribute.
	 * @see #getCapabilityType()
	 * @generated
	 */
	void setCapabilityType(QName value);

	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #isSetLowerBound()
	 * @see #unsetLowerBound()
	 * @see #setLowerBound(int)
	 * @see tosca.ToscaPackage#getTCapabilityDefinition_LowerBound()
	 * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getLowerBound();

	/**
	 * Sets the value of the '{@link tosca.TCapabilityDefinition#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #isSetLowerBound()
	 * @see #unsetLowerBound()
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(int value);

	/**
	 * Unsets the value of the '{@link tosca.TCapabilityDefinition#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLowerBound()
	 * @see #getLowerBound()
	 * @see #setLowerBound(int)
	 * @generated
	 */
	void unsetLowerBound();

	/**
	 * Returns whether the value of the '{@link tosca.TCapabilityDefinition#getLowerBound <em>Lower Bound</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lower Bound</em>' attribute is set.
	 * @see #unsetLowerBound()
	 * @see #getLowerBound()
	 * @see #setLowerBound(int)
	 * @generated
	 */
	boolean isSetLowerBound();

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
	 * @see tosca.ToscaPackage#getTCapabilityDefinition_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tosca.TCapabilityDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #isSetUpperBound()
	 * @see #unsetUpperBound()
	 * @see #setUpperBound(Object)
	 * @see tosca.ToscaPackage#getTCapabilityDefinition_UpperBound()
	 * @model default="1" unsettable="true" dataType="tosca.UpperBoundType"
	 * @generated
	 */
	Object getUpperBound();

	/**
	 * Sets the value of the '{@link tosca.TCapabilityDefinition#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #isSetUpperBound()
	 * @see #unsetUpperBound()
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(Object value);

	/**
	 * Unsets the value of the '{@link tosca.TCapabilityDefinition#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUpperBound()
	 * @see #getUpperBound()
	 * @see #setUpperBound(Object)
	 * @generated
	 */
	void unsetUpperBound();

	/**
	 * Returns whether the value of the '{@link tosca.TCapabilityDefinition#getUpperBound <em>Upper Bound</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Upper Bound</em>' attribute is set.
	 * @see #unsetUpperBound()
	 * @see #getUpperBound()
	 * @see #setUpperBound(Object)
	 * @generated
	 */
	boolean isSetUpperBound();

} // TCapabilityDefinition
