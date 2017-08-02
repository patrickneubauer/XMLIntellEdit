/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CLASSIFICATION</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASSIFICATION#getPropertyClassifications <em>Property Classifications</em>}</li>
 * </ul>
 *
 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getCLASSIFICATION()
 * @model
 * @generated
 */
public interface CLASSIFICATION extends EObject {
	/**
	 * Returns the value of the '<em><b>Property Classifications</b></em>' containment reference list.
	 * The list contents are of type {@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PROPERTYCLASSIFICATION}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Classifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Classifications</em>' containment reference list.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getCLASSIFICATION_PropertyClassifications()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PROPERTYCLASSIFICATION> getPropertyClassifications();

} // CLASSIFICATION
