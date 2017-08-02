/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IDENTIFIEDDOCUMENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.IDENTIFIEDDOCUMENT#getDocumentIdentifier <em>Document Identifier</em>}</li>
 * </ul>
 *
 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getIDENTIFIEDDOCUMENT()
 * @model
 * @generated
 */
public interface IDENTIFIEDDOCUMENT extends SOURCEDOCUMENT {
	/**
	 * Returns the value of the '<em><b>Document Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Identifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Identifier</em>' containment reference.
	 * @see #setDocumentIdentifier(DOCUMENTIDENTIFIER)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getIDENTIFIEDDOCUMENT_DocumentIdentifier()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DOCUMENTIDENTIFIER getDocumentIdentifier();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.IDENTIFIEDDOCUMENT#getDocumentIdentifier <em>Document Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Identifier</em>' containment reference.
	 * @see #getDocumentIdentifier()
	 * @generated
	 */
	void setDocumentIdentifier(DOCUMENTIDENTIFIER value);

} // IDENTIFIEDDOCUMENT
