/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NAMEDTYPE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.NAMEDTYPE#getReferredType <em>Referred Type</em>}</li>
 * </ul>
 *
 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getNAMEDTYPE()
 * @model
 * @generated
 */
public interface NAMEDTYPE extends ANYTYPE {
	/**
	 * Returns the value of the '<em><b>Referred Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referred Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referred Type</em>' containment reference.
	 * @see #setReferredType(DATATYPEREFERENCE)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getNAMEDTYPE_ReferredType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DATATYPEREFERENCE getReferredType();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.NAMEDTYPE#getReferredType <em>Referred Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referred Type</em>' containment reference.
	 * @see #getReferredType()
	 * @generated
	 */
	void setReferredType(DATATYPEREFERENCE value);

} // NAMEDTYPE
