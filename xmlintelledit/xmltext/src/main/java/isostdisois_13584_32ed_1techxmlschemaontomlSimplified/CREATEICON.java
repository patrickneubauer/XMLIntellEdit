/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CREATEICON</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CREATEICON#getIllustrations <em>Illustrations</em>}</li>
 * </ul>
 *
 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getCREATEICON()
 * @model
 * @generated
 */
public interface CREATEICON extends EObject {
	/**
	 * Returns the value of the '<em><b>Illustrations</b></em>' containment reference list.
	 * The list contents are of type {@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ILLUSTRATION}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Illustrations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Illustrations</em>' containment reference list.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getCREATEICON_Illustrations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ILLUSTRATION> getIllustrations();

} // CREATEICON
