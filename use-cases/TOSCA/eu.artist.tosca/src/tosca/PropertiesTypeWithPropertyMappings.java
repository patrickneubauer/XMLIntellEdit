/**
 */
package tosca;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Properties Type With Property Mappings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tosca.PropertiesTypeWithPropertyMappings#getAny <em>Any</em>}</li>
 *   <li>{@link tosca.PropertiesTypeWithPropertyMappings#getPropertyMappings <em>Property Mappings</em>}</li>
 * </ul>
 * </p>
 *
 * @see tosca.ToscaPackage#getPropertiesTypeWithPropertyMappings()
 * @model
 * @generated
 */
public interface PropertiesTypeWithPropertyMappings extends EObject {
	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see tosca.ToscaPackage#getPropertiesTypeWithPropertyMappings_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="false"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Property Mappings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Mappings</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Mappings</em>' containment reference.
	 * @see #setPropertyMappings(PropertyMappingsType)
	 * @see tosca.ToscaPackage#getPropertiesTypeWithPropertyMappings_PropertyMappings()
	 * @model containment="true"
	 * @generated
	 */
	PropertyMappingsType getPropertyMappings();

	/**
	 * Sets the value of the '{@link tosca.PropertiesTypeWithPropertyMappings#getPropertyMappings <em>Property Mappings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Mappings</em>' containment reference.
	 * @see #getPropertyMappings()
	 * @generated
	 */
	void setPropertyMappings(PropertyMappingsType value);

} // PropertiesTypeWithPropertyMappings
