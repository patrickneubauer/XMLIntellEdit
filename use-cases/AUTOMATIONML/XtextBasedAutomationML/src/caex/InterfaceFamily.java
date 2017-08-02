/**
 */
package caex;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Family</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines base structures for a hierarchical InterfaceClass tree. The hierarchical structure of an interface library has organizational character only.  
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link caex.InterfaceFamily#getInterfaceClass <em>Interface Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see caex.CaexPackage#getInterfaceFamily()
 * @model
 * @generated
 */
public interface InterfaceFamily extends InterfaceClass {
	/**
	 * Returns the value of the '<em><b>Interface Class</b></em>' containment reference list.
	 * The list contents are of type {@link caex.InterfaceFamily}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Element that allows definition of child InterfaceClasses within the class hierarchy. The parent child relation between two InterfaceClasses has no semantic.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interface Class</em>' containment reference list.
	 * @see caex.CaexPackage#getInterfaceFamily_InterfaceClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterfaceFamily> getInterfaceClass();

} // InterfaceFamily
