/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>STRINGDICVALUE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.STRINGDICVALUE#getValueCode <em>Value Code</em>}</li>
 * </ul>
 *
 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getSTRINGDICVALUE()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='patternValueCode maxLengthValueCode'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot patternValueCode='self.valueCode.matches(\'[^\\\\-]*\') or self.valueCode.matches(\'[^\\\\s]*\')' maxLengthValueCode='self.valueCode.size() &lt;= 35'"
 * @generated
 */
public interface STRINGDICVALUE extends DICVALUE {
	/**
	 * Returns the value of the '<em><b>Value Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Code</em>' attribute.
	 * @see #setValueCode(String)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getSTRINGDICVALUE_ValueCode()
	 * @model required="true"
	 * @generated
	 */
	String getValueCode();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.STRINGDICVALUE#getValueCode <em>Value Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Code</em>' attribute.
	 * @see #getValueCode()
	 * @generated
	 */
	void setValueCode(String value);

} // STRINGDICVALUE
