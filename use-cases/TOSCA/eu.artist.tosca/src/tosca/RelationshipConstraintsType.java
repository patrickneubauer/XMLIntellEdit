/**
 */
package tosca;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship Constraints Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tosca.RelationshipConstraintsType#getRelationshipConstraint <em>Relationship Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @see tosca.ToscaPackage#getRelationshipConstraintsType()
 * @model
 * @generated
 */
public interface RelationshipConstraintsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Relationship Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link tosca.RelationshipConstraintType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship Constraint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship Constraint</em>' containment reference list.
	 * @see tosca.ToscaPackage#getRelationshipConstraintsType_RelationshipConstraint()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<RelationshipConstraintType> getRelationshipConstraint();

} // RelationshipConstraintsType
