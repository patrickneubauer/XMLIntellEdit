/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DOCUMENTIDENTIFIER</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DOCUMENTIDENTIFIER#getLabels <em>Labels</em>}</li>
 * </ul>
 *
 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getDOCUMENTIDENTIFIER()
 * @model
 * @generated
 */
public interface DOCUMENTIDENTIFIER extends EObject {
	/**
	 * Returns the value of the '<em><b>Labels</b></em>' containment reference list.
	 * The list contents are of type {@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DOCUMENTIDENTIFIERNAMELABEL}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Labels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' containment reference list.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getDOCUMENTIDENTIFIER_Labels()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DOCUMENTIDENTIFIERNAMELABEL> getLabels();

} // DOCUMENTIDENTIFIER
