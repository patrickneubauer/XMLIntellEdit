/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>STRINGTYPE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.STRINGTYPE#getValueFormat <em>Value Format</em>}</li>
 * </ul>
 *
 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getSTRINGTYPE()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='maxLengthValueFormat'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot maxLengthValueFormat='(self.valueFormat = null) or self.valueFormat.size() &lt;= 80'"
 * @generated
 */
public interface STRINGTYPE extends ANYTYPE {
	/**
	 * Returns the value of the '<em><b>Value Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Format</em>' attribute.
	 * @see #setValueFormat(String)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getSTRINGTYPE_ValueFormat()
	 * @model
	 * @generated
	 */
	String getValueFormat();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.STRINGTYPE#getValueFormat <em>Value Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Format</em>' attribute.
	 * @see #getValueFormat()
	 * @generated
	 */
	void setValueFormat(String value);

} // STRINGTYPE
