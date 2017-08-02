/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LIBRARY</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.LIBRARY#getContainedClassExtensions <em>Contained Class Extensions</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.LIBRARY#getResponsibleSupplier <em>Responsible Supplier</em>}</li>
 * </ul>
 *
 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getLIBRARY()
 * @model
 * @generated
 */
public interface LIBRARY extends EObject {
	/**
	 * Returns the value of the '<em><b>Contained Class Extensions</b></em>' containment reference list.
	 * The list contents are of type {@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CONTAINEDCLASSEXTENSIONS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Class Extensions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Class Extensions</em>' containment reference list.
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getLIBRARY_ContainedClassExtensions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<CONTAINEDCLASSEXTENSIONS> getContainedClassExtensions();

	/**
	 * Returns the value of the '<em><b>Responsible Supplier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsible Supplier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible Supplier</em>' containment reference.
	 * @see #setResponsibleSupplier(SUPPLIERREFERENCE)
	 * @see isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage#getLIBRARY_ResponsibleSupplier()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SUPPLIERREFERENCE getResponsibleSupplier();

	/**
	 * Sets the value of the '{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.LIBRARY#getResponsibleSupplier <em>Responsible Supplier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsible Supplier</em>' containment reference.
	 * @see #getResponsibleSupplier()
	 * @generated
	 */
	void setResponsibleSupplier(SUPPLIERREFERENCE value);

} // LIBRARY
