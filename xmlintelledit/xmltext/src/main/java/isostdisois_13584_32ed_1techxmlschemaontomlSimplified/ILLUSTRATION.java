/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ILLUSTRATION</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ILLUSTRATION#getCode <em>Code</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ILLUSTRATION#getKindOfContent <em>Kind Of Content</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ILLUSTRATION#getStandardSize <em>Standard Size</em>}</li>
 * </ul>
 *
 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getILLUSTRATION()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='patternCode maxLengthCode'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot patternCode='self.code.matches(\'[^\\\\-]*\') or self.code.matches(\'[^\\\\s]*\')' maxLengthCode='self.code.size() &lt;= 18'"
 * @generated
 */
public interface ILLUSTRATION extends EXTERNALRESOURCE {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getILLUSTRATION_Code()
	 * @model required="true"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ILLUSTRATION#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Kind Of Content</b></em>' attribute.
	 * The literals are from the enumeration {@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ILLUSTRATIONTYPEType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind Of Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind Of Content</em>' attribute.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ILLUSTRATIONTYPEType
	 * @see #setKindOfContent(ILLUSTRATIONTYPEType)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getILLUSTRATION_KindOfContent()
	 * @model required="true"
	 * @generated
	 */
	ILLUSTRATIONTYPEType getKindOfContent();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ILLUSTRATION#getKindOfContent <em>Kind Of Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind Of Content</em>' attribute.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ILLUSTRATIONTYPEType
	 * @see #getKindOfContent()
	 * @generated
	 */
	void setKindOfContent(ILLUSTRATIONTYPEType value);

	/**
	 * Returns the value of the '<em><b>Standard Size</b></em>' attribute.
	 * The literals are from the enumeration {@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.STANDARDSIZEType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Standard Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard Size</em>' attribute.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.STANDARDSIZEType
	 * @see #setStandardSize(STANDARDSIZEType)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getILLUSTRATION_StandardSize()
	 * @model
	 * @generated
	 */
	STANDARDSIZEType getStandardSize();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ILLUSTRATION#getStandardSize <em>Standard Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Size</em>' attribute.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.STANDARDSIZEType
	 * @see #getStandardSize()
	 * @generated
	 */
	void setStandardSize(STANDARDSIZEType value);

} // ILLUSTRATION
