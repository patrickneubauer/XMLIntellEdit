/**
 */
package isostdisots_29002_10ed_1techxmlschemavalueSimplified;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rational Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.RationalValue#getWholePart <em>Whole Part</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.RationalValue#getNumerator <em>Numerator</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.RationalValue#getDenominator <em>Denominator</em>}</li>
 * </ul>
 *
 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage#getRationalValue()
 * @model
 * @generated
 */
public interface RationalValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Whole Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Whole Part</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Whole Part</em>' attribute.
	 * @see #setWholePart(int)
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage#getRationalValue_WholePart()
	 * @model
	 * @generated
	 */
	int getWholePart();

	/**
	 * Sets the value of the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.RationalValue#getWholePart <em>Whole Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Whole Part</em>' attribute.
	 * @see #getWholePart()
	 * @generated
	 */
	void setWholePart(int value);

	/**
	 * Returns the value of the '<em><b>Numerator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numerator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numerator</em>' attribute.
	 * @see #setNumerator(int)
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage#getRationalValue_Numerator()
	 * @model required="true"
	 * @generated
	 */
	int getNumerator();

	/**
	 * Sets the value of the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.RationalValue#getNumerator <em>Numerator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numerator</em>' attribute.
	 * @see #getNumerator()
	 * @generated
	 */
	void setNumerator(int value);

	/**
	 * Returns the value of the '<em><b>Denominator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Denominator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Denominator</em>' attribute.
	 * @see #setDenominator(int)
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage#getRationalValue_Denominator()
	 * @model required="true"
	 * @generated
	 */
	int getDenominator();

	/**
	 * Sets the value of the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.RationalValue#getDenominator <em>Denominator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Denominator</em>' attribute.
	 * @see #getDenominator()
	 * @generated
	 */
	void setDenominator(int value);

} // RationalValue
