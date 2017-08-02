/**
 */
package caex;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Class Lib</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link caex.RoleClassLib#getRoleClass <em>Role Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see caex.CaexPackage#getRoleClassLib()
 * @model
 * @generated
 */
public interface RoleClassLib extends CAEXObject {
	/**
	 * Returns the value of the '<em><b>Role Class</b></em>' containment reference list.
	 * The list contents are of type {@link caex.RoleFamily}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition of a class of a role type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role Class</em>' containment reference list.
	 * @see caex.CaexPackage#getRoleClassLib_RoleClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<RoleFamily> getRoleClass();

} // RoleClassLib
