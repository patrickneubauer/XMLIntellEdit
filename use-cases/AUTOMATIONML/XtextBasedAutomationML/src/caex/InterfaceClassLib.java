/**
 */
package caex;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Class Lib</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link caex.InterfaceClassLib#getInterfaceClass <em>Interface Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see caex.CaexPackage#getInterfaceClassLib()
 * @model
 * @generated
 */
public interface InterfaceClassLib extends CAEXObject {
	/**
	 * Returns the value of the '<em><b>Interface Class</b></em>' containment reference list.
	 * The list contents are of type {@link caex.InterfaceFamily}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Class definition for interfaces.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interface Class</em>' containment reference list.
	 * @see caex.CaexPackage#getInterfaceClassLib_InterfaceClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterfaceFamily> getInterfaceClass();

} // InterfaceClassLib
