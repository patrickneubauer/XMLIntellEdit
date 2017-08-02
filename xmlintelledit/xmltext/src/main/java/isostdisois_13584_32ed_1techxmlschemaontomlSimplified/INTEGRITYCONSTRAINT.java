/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>INTEGRITYCONSTRAINT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.INTEGRITYCONSTRAINT#getRedefinedDomain <em>Redefined Domain</em>}</li>
 * </ul>
 *
 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getINTEGRITYCONSTRAINT()
 * @model
 * @generated
 */
public interface INTEGRITYCONSTRAINT extends PROPERTYCONSTRAINT {
	/**
	 * Returns the value of the '<em><b>Redefined Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefined Domain</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefined Domain</em>' containment reference.
	 * @see #setRedefinedDomain(DOMAINCONSTRAINT)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getINTEGRITYCONSTRAINT_RedefinedDomain()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DOMAINCONSTRAINT getRedefinedDomain();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.INTEGRITYCONSTRAINT#getRedefinedDomain <em>Redefined Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redefined Domain</em>' containment reference.
	 * @see #getRedefinedDomain()
	 * @generated
	 */
	void setRedefinedDomain(DOMAINCONSTRAINT value);

} // INTEGRITYCONSTRAINT
