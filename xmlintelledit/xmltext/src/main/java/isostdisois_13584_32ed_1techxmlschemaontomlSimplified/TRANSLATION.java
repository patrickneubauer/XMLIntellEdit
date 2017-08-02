/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TRANSLATION</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.TRANSLATION#getTranslationDatas <em>Translation Datas</em>}</li>
 * </ul>
 *
 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getTRANSLATION()
 * @model
 * @generated
 */
public interface TRANSLATION extends EObject {
	/**
	 * Returns the value of the '<em><b>Translation Datas</b></em>' containment reference list.
	 * The list contents are of type {@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.TRANSLATIONDATA}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Translation Datas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translation Datas</em>' containment reference list.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getTRANSLATION_TranslationDatas()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TRANSLATIONDATA> getTranslationDatas();

} // TRANSLATION
