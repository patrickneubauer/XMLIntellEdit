/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SIUNIT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SIUNIT#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SIUNIT#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getSIUNIT()
 * @model
 * @generated
 */
public interface SIUNIT extends NAMEDUNIT {
	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute.
	 * The literals are from the enumeration {@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SIPREFIXType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SIPREFIXType
	 * @see #setPrefix(SIPREFIXType)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getSIUNIT_Prefix()
	 * @model
	 * @generated
	 */
	SIPREFIXType getPrefix();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SIUNIT#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' attribute.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SIPREFIXType
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(SIPREFIXType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SIUNITNAMEType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SIUNITNAMEType
	 * @see #setName(SIUNITNAMEType)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getSIUNIT_Name()
	 * @model required="true"
	 * @generated
	 */
	SIUNITNAMEType getName();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SIUNIT#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SIUNITNAMEType
	 * @see #getName()
	 * @generated
	 */
	void setName(SIUNITNAMEType value);

} // SIUNIT
