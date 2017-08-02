/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>INTCURRENCYTYPE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.INTCURRENCYTYPE#getValueFormat <em>Value Format</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.INTCURRENCYTYPE#getCurrency <em>Currency</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.INTCURRENCYTYPE#getCurrencyId <em>Currency Id</em>}</li>
 * </ul>
 *
 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getINTCURRENCYTYPE()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='maxLengthValueFormat maxLengthCurrency patternCurrencyId'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot maxLengthValueFormat='(self.valueFormat = null) or self.valueFormat.size() &lt;= 80' maxLengthCurrency='(self.currency = null) or self.currency.size() &lt;= 3' patternCurrencyId='(self.currencyId=null) or self.currencyId.matches(\'([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})(\\\\-([A-Z0-9:_\\\\.]{1,35})((\\\\-[019])(\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5}))?)?)?#08\\\\-([A-Z0-9:_\\\\.]{1,71})#[0-9]{1,9}\') or self.currencyId.matches(\'([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#08\\\\-([A-Z0-9:_\\\\.]{1,71})#[0-9]{1,9}\') or self.currencyId.matches(\'([0-9]{4})\\\\-([A-Z0-9:_\\\\.]{1,35})\\\\-\\\\-\\\\-([A-Z0-9]{1,10})_([A-Z0-9]{0,10})_([0-9]{1,5})#08\\\\-([A-Z0-9:_\\\\.]{1,71})#[0-9]{1,9}\')'"
 * @generated
 */
public interface INTCURRENCYTYPE extends ANYTYPE {
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
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getINTCURRENCYTYPE_ValueFormat()
	 * @model
	 * @generated
	 */
	String getValueFormat();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.INTCURRENCYTYPE#getValueFormat <em>Value Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Format</em>' attribute.
	 * @see #getValueFormat()
	 * @generated
	 */
	void setValueFormat(String value);

	/**
	 * Returns the value of the '<em><b>Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency</em>' attribute.
	 * @see #setCurrency(String)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getINTCURRENCYTYPE_Currency()
	 * @model
	 * @generated
	 */
	String getCurrency();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.INTCURRENCYTYPE#getCurrency <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency</em>' attribute.
	 * @see #getCurrency()
	 * @generated
	 */
	void setCurrency(String value);

	/**
	 * Returns the value of the '<em><b>Currency Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Id</em>' attribute.
	 * @see #setCurrencyId(String)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getINTCURRENCYTYPE_CurrencyId()
	 * @model
	 * @generated
	 */
	String getCurrencyId();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.INTCURRENCYTYPE#getCurrencyId <em>Currency Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Id</em>' attribute.
	 * @see #getCurrencyId()
	 * @generated
	 */
	void setCurrencyId(String value);

} // INTCURRENCYTYPE
