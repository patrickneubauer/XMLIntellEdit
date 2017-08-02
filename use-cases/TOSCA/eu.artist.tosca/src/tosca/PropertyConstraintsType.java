/**
 */
package tosca;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Constraints Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tosca.PropertyConstraintsType#getPropertyConstraint <em>Property Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @see tosca.ToscaPackage#getPropertyConstraintsType()
 * @model
 * @generated
 */
public interface PropertyConstraintsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Property Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link tosca.TPropertyConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Constraint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Constraint</em>' containment reference list.
	 * @see tosca.ToscaPackage#getPropertyConstraintsType_PropertyConstraint()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TPropertyConstraint> getPropertyConstraint();

} // PropertyConstraintsType
