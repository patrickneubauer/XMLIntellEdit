/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CONTAINEDSUPPLIERS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CONTAINEDSUPPLIERS#getSuppliers <em>Suppliers</em>}</li>
 * </ul>
 *
 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getCONTAINEDSUPPLIERS()
 * @model
 * @generated
 */
public interface CONTAINEDSUPPLIERS extends EObject {
	/**
	 * Returns the value of the '<em><b>Suppliers</b></em>' containment reference list.
	 * The list contents are of type {@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SUPPLIER}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suppliers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suppliers</em>' containment reference list.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getCONTAINEDSUPPLIERS_Suppliers()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SUPPLIER> getSuppliers();

} // CONTAINEDSUPPLIERS
