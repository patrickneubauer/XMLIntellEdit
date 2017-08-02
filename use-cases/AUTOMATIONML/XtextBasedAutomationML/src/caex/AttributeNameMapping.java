/**
 */
package caex;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Name Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link caex.AttributeNameMapping#getRoleAttributeName <em>Role Attribute Name</em>}</li>
 *   <li>{@link caex.AttributeNameMapping#getSystemUnitAttributeName <em>System Unit Attribute Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see caex.CaexPackage#getAttributeNameMapping()
 * @model
 * @generated
 */
public interface AttributeNameMapping extends CAEXBasicObject {
	/**
	 * Returns the value of the '<em><b>Role Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Attribute Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Attribute Name</em>' attribute.
	 * @see #setRoleAttributeName(String)
	 * @see caex.CaexPackage#getAttributeNameMapping_RoleAttributeName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getRoleAttributeName();

	/**
	 * Sets the value of the '{@link caex.AttributeNameMapping#getRoleAttributeName <em>Role Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Attribute Name</em>' attribute.
	 * @see #getRoleAttributeName()
	 * @generated
	 */
	void setRoleAttributeName(String value);

	/**
	 * Returns the value of the '<em><b>System Unit Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Unit Attribute Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Unit Attribute Name</em>' attribute.
	 * @see #setSystemUnitAttributeName(String)
	 * @see caex.CaexPackage#getAttributeNameMapping_SystemUnitAttributeName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getSystemUnitAttributeName();

	/**
	 * Sets the value of the '{@link caex.AttributeNameMapping#getSystemUnitAttributeName <em>System Unit Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Unit Attribute Name</em>' attribute.
	 * @see #getSystemUnitAttributeName()
	 * @generated
	 */
	void setSystemUnitAttributeName(String value);

} // AttributeNameMapping
