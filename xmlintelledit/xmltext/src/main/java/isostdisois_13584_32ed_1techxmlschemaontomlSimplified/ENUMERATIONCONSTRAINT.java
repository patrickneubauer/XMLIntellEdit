/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ENUMERATIONCONSTRAINT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ENUMERATIONCONSTRAINT#getSubset <em>Subset</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ENUMERATIONCONSTRAINT#getValueMeaning <em>Value Meaning</em>}</li>
 * </ul>
 *
 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getENUMERATIONCONSTRAINT()
 * @model
 * @generated
 */
public interface ENUMERATIONCONSTRAINT extends DOMAINCONSTRAINT {
	/**
	 * Returns the value of the '<em><b>Subset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subset</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subset</em>' containment reference.
	 * @see #setSubset(SUBSET)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getENUMERATIONCONSTRAINT_Subset()
	 * @model containment="true"
	 * @generated
	 */
	SUBSET getSubset();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ENUMERATIONCONSTRAINT#getSubset <em>Subset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subset</em>' containment reference.
	 * @see #getSubset()
	 * @generated
	 */
	void setSubset(SUBSET value);

	/**
	 * Returns the value of the '<em><b>Value Meaning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Meaning</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Meaning</em>' containment reference.
	 * @see #setValueMeaning(NONQUANTITATIVEINTTYPE)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getENUMERATIONCONSTRAINT_ValueMeaning()
	 * @model containment="true"
	 * @generated
	 */
	NONQUANTITATIVEINTTYPE getValueMeaning();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ENUMERATIONCONSTRAINT#getValueMeaning <em>Value Meaning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Meaning</em>' containment reference.
	 * @see #getValueMeaning()
	 * @generated
	 */
	void setValueMeaning(NONQUANTITATIVEINTTYPE value);

} // ENUMERATIONCONSTRAINT
