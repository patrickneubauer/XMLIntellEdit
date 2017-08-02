/**
 */
package caex;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Requirements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link caex.RoleRequirements#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link caex.RoleRequirements#getExternalInterface <em>External Interface</em>}</li>
 *   <li>{@link caex.RoleRequirements#getRefBaseRoleClassPath <em>Ref Base Role Class Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see caex.CaexPackage#getRoleRequirements()
 * @model
 * @generated
 */
public interface RoleRequirements extends CAEXBasicObject {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link caex.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Characterizes properties of the RoleRequirements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see caex.CaexPackage#getRoleRequirements_Attribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttribute();

	/**
	 * Returns the value of the '<em><b>External Interface</b></em>' containment reference list.
	 * The list contents are of type {@link caex.InterfaceClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Interface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Interface</em>' containment reference list.
	 * @see caex.CaexPackage#getRoleRequirements_ExternalInterface()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterfaceClass> getExternalInterface();

	/**
	 * Returns the value of the '<em><b>Ref Base Role Class Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Base Role Class Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Base Role Class Path</em>' attribute.
	 * @see #setRefBaseRoleClassPath(String)
	 * @see caex.CaexPackage#getRoleRequirements_RefBaseRoleClassPath()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getRefBaseRoleClassPath();

	/**
	 * Sets the value of the '{@link caex.RoleRequirements#getRefBaseRoleClassPath <em>Ref Base Role Class Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Base Role Class Path</em>' attribute.
	 * @see #getRefBaseRoleClassPath()
	 * @generated
	 */
	void setRefBaseRoleClassPath(String value);

} // RoleRequirements
