/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SYNONYMOUSSYMBOLS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SYNONYMOUSSYMBOLS#getMathematicalStrings <em>Mathematical Strings</em>}</li>
 * </ul>
 *
 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getSYNONYMOUSSYMBOLS()
 * @model
 * @generated
 */
public interface SYNONYMOUSSYMBOLS extends EObject {
	/**
	 * Returns the value of the '<em><b>Mathematical Strings</b></em>' containment reference list.
	 * The list contents are of type {@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.MATHEMATICALSTRING}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mathematical Strings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mathematical Strings</em>' containment reference list.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getSYNONYMOUSSYMBOLS_MathematicalStrings()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<MATHEMATICALSTRING> getMathematicalStrings();

} // SYNONYMOUSSYMBOLS
