/**
 */
package simpleanySimplified;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mixed Base Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simpleanySimplified.MixedBaseClass#getMixed <em>Mixed</em>}</li>
 * </ul>
 *
 * @see simpleanySimplified.simpleanySimplifiedPackage#getMixedBaseClass()
 * @model abstract="true"
 * @generated
 */
public interface MixedBaseClass extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' containment reference list.
	 * The list contents are of type {@link simpleanySimplified.MixedData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' containment reference list.
	 * @see simpleanySimplified.simpleanySimplifiedPackage#getMixedBaseClass_Mixed()
	 * @model containment="true"
	 * @generated
	 */
	EList<MixedData> getMixed();

} // MixedBaseClass
