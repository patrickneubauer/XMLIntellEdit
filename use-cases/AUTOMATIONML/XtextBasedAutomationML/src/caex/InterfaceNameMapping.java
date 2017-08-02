/**
 */
package caex;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Name Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link caex.InterfaceNameMapping#getRoleInterfaceName <em>Role Interface Name</em>}</li>
 *   <li>{@link caex.InterfaceNameMapping#getSystemUnitInterfaceName <em>System Unit Interface Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see caex.CaexPackage#getInterfaceNameMapping()
 * @model
 * @generated
 */
public interface InterfaceNameMapping extends CAEXBasicObject {
	/**
	 * Returns the value of the '<em><b>Role Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Interface Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Interface Name</em>' attribute.
	 * @see #setRoleInterfaceName(String)
	 * @see caex.CaexPackage#getInterfaceNameMapping_RoleInterfaceName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getRoleInterfaceName();

	/**
	 * Sets the value of the '{@link caex.InterfaceNameMapping#getRoleInterfaceName <em>Role Interface Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Interface Name</em>' attribute.
	 * @see #getRoleInterfaceName()
	 * @generated
	 */
	void setRoleInterfaceName(String value);

	/**
	 * Returns the value of the '<em><b>System Unit Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Unit Interface Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Unit Interface Name</em>' attribute.
	 * @see #setSystemUnitInterfaceName(String)
	 * @see caex.CaexPackage#getInterfaceNameMapping_SystemUnitInterfaceName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getSystemUnitInterfaceName();

	/**
	 * Sets the value of the '{@link caex.InterfaceNameMapping#getSystemUnitInterfaceName <em>System Unit Interface Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Unit Interface Name</em>' attribute.
	 * @see #getSystemUnitInterfaceName()
	 * @generated
	 */
	void setSystemUnitInterfaceName(String value);

} // InterfaceNameMapping
