/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SUBCLASSCONSTRAINT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SUBCLASSCONSTRAINT#getSubclasses <em>Subclasses</em>}</li>
 * </ul>
 *
 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getSUBCLASSCONSTRAINT()
 * @model
 * @generated
 */
public interface SUBCLASSCONSTRAINT extends DOMAINCONSTRAINT {
	/**
	 * Returns the value of the '<em><b>Subclasses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subclasses</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subclasses</em>' containment reference.
	 * @see #setSubclasses(CLASSESREFERENCE)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getSUBCLASSCONSTRAINT_Subclasses()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CLASSESREFERENCE getSubclasses();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SUBCLASSCONSTRAINT#getSubclasses <em>Subclasses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subclasses</em>' containment reference.
	 * @see #getSubclasses()
	 * @generated
	 */
	void setSubclasses(CLASSESREFERENCE value);

} // SUBCLASSCONSTRAINT
