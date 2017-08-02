/**
 */
package tosca;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TProperty Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tosca.TPropertyMapping#getServiceTemplatePropertyRef <em>Service Template Property Ref</em>}</li>
 *   <li>{@link tosca.TPropertyMapping#getTargetObjectRef <em>Target Object Ref</em>}</li>
 *   <li>{@link tosca.TPropertyMapping#getTargetPropertyRef <em>Target Property Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see tosca.ToscaPackage#getTPropertyMapping()
 * @model
 * @generated
 */
public interface TPropertyMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Template Property Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Template Property Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Template Property Ref</em>' attribute.
	 * @see #setServiceTemplatePropertyRef(String)
	 * @see tosca.ToscaPackage#getTPropertyMapping_ServiceTemplatePropertyRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getServiceTemplatePropertyRef();

	/**
	 * Sets the value of the '{@link tosca.TPropertyMapping#getServiceTemplatePropertyRef <em>Service Template Property Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Template Property Ref</em>' attribute.
	 * @see #getServiceTemplatePropertyRef()
	 * @generated
	 */
	void setServiceTemplatePropertyRef(String value);

	/**
	 * Returns the value of the '<em><b>Target Object Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Object Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Object Ref</em>' attribute.
	 * @see #setTargetObjectRef(String)
	 * @see tosca.ToscaPackage#getTPropertyMapping_TargetObjectRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF" required="true"
	 * @generated
	 */
	String getTargetObjectRef();

	/**
	 * Sets the value of the '{@link tosca.TPropertyMapping#getTargetObjectRef <em>Target Object Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Object Ref</em>' attribute.
	 * @see #getTargetObjectRef()
	 * @generated
	 */
	void setTargetObjectRef(String value);

	/**
	 * Returns the value of the '<em><b>Target Property Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Property Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Property Ref</em>' attribute.
	 * @see #setTargetPropertyRef(String)
	 * @see tosca.ToscaPackage#getTPropertyMapping_TargetPropertyRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getTargetPropertyRef();

	/**
	 * Sets the value of the '{@link tosca.TPropertyMapping#getTargetPropertyRef <em>Target Property Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Property Ref</em>' attribute.
	 * @see #getTargetPropertyRef()
	 * @generated
	 */
	void setTargetPropertyRef(String value);

} // TPropertyMapping
