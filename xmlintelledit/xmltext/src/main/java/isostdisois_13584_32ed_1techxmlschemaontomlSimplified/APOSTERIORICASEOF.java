/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>APOSTERIORICASEOF</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.APOSTERIORICASEOF#getCaseOfSuper <em>Case Of Super</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.APOSTERIORICASEOF#getCaseOfSub <em>Case Of Sub</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.APOSTERIORICASEOF#getCorrespondingProperties <em>Corresponding Properties</em>}</li>
 * </ul>
 *
 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getAPOSTERIORICASEOF()
 * @model
 * @generated
 */
public interface APOSTERIORICASEOF extends APOSTERIORISEMANTICRELATIONSHIP {
	/**
	 * Returns the value of the '<em><b>Case Of Super</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Case Of Super</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case Of Super</em>' containment reference.
	 * @see #setCaseOfSuper(CLASSREFERENCE)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getAPOSTERIORICASEOF_CaseOfSuper()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CLASSREFERENCE getCaseOfSuper();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.APOSTERIORICASEOF#getCaseOfSuper <em>Case Of Super</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Case Of Super</em>' containment reference.
	 * @see #getCaseOfSuper()
	 * @generated
	 */
	void setCaseOfSuper(CLASSREFERENCE value);

	/**
	 * Returns the value of the '<em><b>Case Of Sub</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Case Of Sub</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case Of Sub</em>' containment reference.
	 * @see #setCaseOfSub(CLASSREFERENCE)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getAPOSTERIORICASEOF_CaseOfSub()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CLASSREFERENCE getCaseOfSub();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.APOSTERIORICASEOF#getCaseOfSub <em>Case Of Sub</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Case Of Sub</em>' containment reference.
	 * @see #getCaseOfSub()
	 * @generated
	 */
	void setCaseOfSub(CLASSREFERENCE value);

	/**
	 * Returns the value of the '<em><b>Corresponding Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Corresponding Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corresponding Properties</em>' containment reference.
	 * @see #setCorrespondingProperties(CORRESPONDINGPROPERTIES)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getAPOSTERIORICASEOF_CorrespondingProperties()
	 * @model containment="true"
	 * @generated
	 */
	CORRESPONDINGPROPERTIES getCorrespondingProperties();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.APOSTERIORICASEOF#getCorrespondingProperties <em>Corresponding Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corresponding Properties</em>' containment reference.
	 * @see #getCorrespondingProperties()
	 * @generated
	 */
	void setCorrespondingProperties(CORRESPONDINGPROPERTIES value);

} // APOSTERIORICASEOF
