/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CONSTRAINTORCONSTRAINTID</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CONSTRAINTORCONSTRAINTID#getConstraintRef <em>Constraint Ref</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CONSTRAINTORCONSTRAINTID#getConstraintDefinition <em>Constraint Definition</em>}</li>
 * </ul>
 *
 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getCONSTRAINTORCONSTRAINTID()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='patternConstraintRef'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot patternConstraintRef='(self.constraintRef=null) or self.constraintRef.matches(\'([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})(\\\\-([A-Z0-9:_\\\\.]{1,35})((\\\\-[019])(\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5}))?)?)?#04\\\\-([A-Z0-9:_\\\\.]{1,71})#[0-9]{1,9}\') or self.constraintRef.matches(\'([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#04\\\\-([A-Z0-9:_\\\\.]{1,71})#[0-9]{1,9}\') or self.constraintRef.matches(\'([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-\\\\-\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#04\\\\-([A-Z0-9:_\\\\.]{1,71})#[0-9]{1,9}\')'"
 * @generated
 */
public interface CONSTRAINTORCONSTRAINTID extends EObject {
	/**
	 * Returns the value of the '<em><b>Constraint Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint Ref</em>' attribute.
	 * @see #setConstraintRef(String)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getCONSTRAINTORCONSTRAINTID_ConstraintRef()
	 * @model
	 * @generated
	 */
	String getConstraintRef();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CONSTRAINTORCONSTRAINTID#getConstraintRef <em>Constraint Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint Ref</em>' attribute.
	 * @see #getConstraintRef()
	 * @generated
	 */
	void setConstraintRef(String value);

	/**
	 * Returns the value of the '<em><b>Constraint Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint Definition</em>' containment reference.
	 * @see #setConstraintDefinition(CONSTRAINT)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getCONSTRAINTORCONSTRAINTID_ConstraintDefinition()
	 * @model containment="true"
	 * @generated
	 */
	CONSTRAINT getConstraintDefinition();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CONSTRAINTORCONSTRAINTID#getConstraintDefinition <em>Constraint Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint Definition</em>' containment reference.
	 * @see #getConstraintDefinition()
	 * @generated
	 */
	void setConstraintDefinition(CONSTRAINT value);

} // CONSTRAINTORCONSTRAINTID
