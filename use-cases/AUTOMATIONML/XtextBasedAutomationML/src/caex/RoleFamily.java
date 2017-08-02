/**
 */
package caex;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Family</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines base structures for a hierarchical RoleClass tree. The hierarchical structure of a role library has organizational character only. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link caex.RoleFamily#getRoleClass <em>Role Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see caex.CaexPackage#getRoleFamily()
 * @model
 * @generated
 */
public interface RoleFamily extends RoleClass {
	/**
	 * Returns the value of the '<em><b>Role Class</b></em>' containment reference list.
	 * The list contents are of type {@link caex.RoleFamily}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Element that allows definition of child RoleClasses within the class hierarchy. The parent child relation between two RoleClasses has no semantic.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role Class</em>' containment reference list.
	 * @see caex.CaexPackage#getRoleFamily_RoleClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<RoleFamily> getRoleClass();

} // RoleFamily
