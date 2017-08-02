/**
 */
package isostdisots_29002_10ed_1techxmlschemavalueSimplified;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Range Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.MeasureRangeValue#getLowerValue <em>Lower Value</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.MeasureRangeValue#getUpperValue <em>Upper Value</em>}</li>
 * </ul>
 *
 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage#getMeasureRangeValue()
 * @model
 * @generated
 */
public interface MeasureRangeValue extends MeasureValue {
	/**
	 * Returns the value of the '<em><b>Lower Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Value</em>' containment reference.
	 * @see #setLowerValue(NumericValue)
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage#getMeasureRangeValue_LowerValue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NumericValue getLowerValue();

	/**
	 * Sets the value of the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.MeasureRangeValue#getLowerValue <em>Lower Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Value</em>' containment reference.
	 * @see #getLowerValue()
	 * @generated
	 */
	void setLowerValue(NumericValue value);

	/**
	 * Returns the value of the '<em><b>Upper Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Value</em>' containment reference.
	 * @see #setUpperValue(NumericValue)
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage#getMeasureRangeValue_UpperValue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NumericValue getUpperValue();

	/**
	 * Sets the value of the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.MeasureRangeValue#getUpperValue <em>Upper Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Value</em>' containment reference.
	 * @see #getUpperValue()
	 * @generated
	 */
	void setUpperValue(NumericValue value);

} // MeasureRangeValue
