/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ALTERNATIVEUNITS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ALTERNATIVEUNITS#getDicUnits <em>Dic Units</em>}</li>
 * </ul>
 *
 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getALTERNATIVEUNITS()
 * @model
 * @generated
 */
public interface ALTERNATIVEUNITS extends EObject {
	/**
	 * Returns the value of the '<em><b>Dic Units</b></em>' containment reference list.
	 * The list contents are of type {@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DICUNIT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dic Units</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dic Units</em>' containment reference list.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getALTERNATIVEUNITS_DicUnits()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DICUNIT> getDicUnits();

} // ALTERNATIVEUNITS
