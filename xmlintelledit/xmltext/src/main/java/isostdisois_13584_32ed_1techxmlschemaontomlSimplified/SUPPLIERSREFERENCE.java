/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SUPPLIERSREFERENCE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SUPPLIERSREFERENCE#getSuppliers <em>Suppliers</em>}</li>
 * </ul>
 *
 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getSUPPLIERSREFERENCE()
 * @model
 * @generated
 */
public interface SUPPLIERSREFERENCE extends EObject {
	/**
	 * Returns the value of the '<em><b>Suppliers</b></em>' containment reference list.
	 * The list contents are of type {@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SUPPLIERREFERENCE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suppliers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suppliers</em>' containment reference list.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getSUPPLIERSREFERENCE_Suppliers()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SUPPLIERREFERENCE> getSuppliers();

} // SUPPLIERSREFERENCE
