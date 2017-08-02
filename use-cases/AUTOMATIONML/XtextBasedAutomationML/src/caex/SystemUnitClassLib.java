/**
 */
package caex;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Unit Class Lib</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link caex.SystemUnitClassLib#getSystemUnitClass <em>System Unit Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see caex.CaexPackage#getSystemUnitClassLib()
 * @model
 * @generated
 */
public interface SystemUnitClassLib extends CAEXObject {
	/**
	 * Returns the value of the '<em><b>System Unit Class</b></em>' containment reference list.
	 * The list contents are of type {@link caex.SystemUnitFamily}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Shall be used for SystemUnitClass definition, provides definition of a class of a SystemUnitClass type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Unit Class</em>' containment reference list.
	 * @see caex.CaexPackage#getSystemUnitClassLib_SystemUnitClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemUnitFamily> getSystemUnitClass();

} // SystemUnitClassLib
