/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CONSTRAINT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CONSTRAINT#getConstraintId <em>Constraint Id</em>}</li>
 * </ul>
 *
 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getCONSTRAINT()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='patternConstraintId'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot patternConstraintId='(self.constraintId=null) or self.constraintId.matches(\'([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})(\\\\-([A-Z0-9:_\\\\.]{1,35})((\\\\-[019])(\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5}))?)?)?#04\\\\-([A-Z0-9:_\\\\.]{1,71})#[0-9]{1,9}\') or self.constraintId.matches(\'([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#04\\\\-([A-Z0-9:_\\\\.]{1,71})#[0-9]{1,9}\') or self.constraintId.matches(\'([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-\\\\-\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#04\\\\-([A-Z0-9:_\\\\.]{1,71})#[0-9]{1,9}\')'"
 * @generated
 */
public interface CONSTRAINT extends EObject {
	/**
	 * Returns the value of the '<em><b>Constraint Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint Id</em>' attribute.
	 * @see #setConstraintId(String)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getCONSTRAINT_ConstraintId()
	 * @model
	 * @generated
	 */
	String getConstraintId();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CONSTRAINT#getConstraintId <em>Constraint Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint Id</em>' attribute.
	 * @see #getConstraintId()
	 * @generated
	 */
	void setConstraintId(String value);

} // CONSTRAINT
