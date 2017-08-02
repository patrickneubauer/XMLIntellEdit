/**
 */
package tosca;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TEntity Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tosca.TEntityTemplate#getProperties <em>Properties</em>}</li>
 *   <li>{@link tosca.TEntityTemplate#getPropertyConstraints <em>Property Constraints</em>}</li>
 *   <li>{@link tosca.TEntityTemplate#getId <em>Id</em>}</li>
 *   <li>{@link tosca.TEntityTemplate#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see tosca.ToscaPackage#getTEntityTemplate()
 * @model abstract="true"
 * @generated
 */
public interface TEntityTemplate extends TExtensibleElements {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link tosca.PropertiesType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see tosca.ToscaPackage#getTEntityTemplate_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<PropertiesType> getProperties();

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
	 * @see tosca.ToscaPackage#getTEntityTemplate_PropertyConstraints()
	 * @model containment="true"
	 * @generated
	 */
	PropertyConstraintsType getPropertyConstraints();

	/**
	 * Sets the value of the '{@link tosca.TEntityTemplate#getPropertyConstraints <em>Property Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Constraints</em>' containment reference.
	 * @see #getPropertyConstraints()
	 * @generated
	 */
	void setPropertyConstraints(PropertyConstraintsType value);

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
	 * @see tosca.ToscaPackage#getTEntityTemplate_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link tosca.TEntityTemplate#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(QName)
	 * @see tosca.ToscaPackage#getTEntityTemplate_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
	 * @generated
	 */
	QName getType();

	/**
	 * Sets the value of the '{@link tosca.TEntityTemplate#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(QName value);

} // TEntityTemplate
