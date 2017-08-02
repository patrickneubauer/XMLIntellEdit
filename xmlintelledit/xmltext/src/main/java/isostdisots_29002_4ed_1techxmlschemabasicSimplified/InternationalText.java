/**
 */
package isostdisots_29002_4ed_1techxmlschemabasicSimplified;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>International Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link isostdisots_29002_4ed_1techxmlschemabasicSimplified.InternationalText#getLocalStrings <em>Local Strings</em>}</li>
 * </ul>
 *
 * @see isostdisots_29002_4ed_1techxmlschemabasicSimplified.Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage#getInternationalText()
 * @model
 * @generated
 */
public interface InternationalText extends EObject {
	/**
	 * Returns the value of the '<em><b>Local Strings</b></em>' containment reference list.
	 * The list contents are of type {@link isostdisots_29002_4ed_1techxmlschemabasicSimplified.LanguageString}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Strings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Strings</em>' containment reference list.
	 * @see isostdisots_29002_4ed_1techxmlschemabasicSimplified.Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage#getInternationalText_LocalStrings()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<LanguageString> getLocalStrings();

} // InternationalText
