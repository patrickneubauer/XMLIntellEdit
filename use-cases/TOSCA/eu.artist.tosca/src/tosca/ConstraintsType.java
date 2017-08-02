/**
 */
package tosca;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraints Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tosca.ConstraintsType#getConstraint <em>Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @see tosca.ToscaPackage#getConstraintsType()
 * @model
 * @generated
 */
public interface ConstraintsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link tosca.TConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' containment reference list.
	 * @see tosca.ToscaPackage#getConstraintsType_Constraint()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TConstraint> getConstraint();

} // ConstraintsType
