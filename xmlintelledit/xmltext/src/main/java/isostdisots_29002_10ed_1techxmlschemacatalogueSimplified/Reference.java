/**
 */
package isostdisots_29002_10ed_1techxmlschemacatalogueSimplified;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Reference#getOrganizationCode <em>Organization Code</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Reference#getOrganizationRef <em>Organization Ref</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Reference#getReferenceNumber <em>Reference Number</em>}</li>
 * </ul>
 *
 * @see isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage#getReference()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='patternOrganizationRef'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot patternOrganizationRef='(self.organizationRef=null) or self.organizationRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.organizationRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.organizationRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\')'"
 * @generated
 */
public interface Reference extends EObject {
	/**
	 * Returns the value of the '<em><b>Organization Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization Code</em>' attribute.
	 * @see #setOrganizationCode(String)
	 * @see isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage#getReference_OrganizationCode()
	 * @model
	 * @generated
	 */
	String getOrganizationCode();

	/**
	 * Sets the value of the '{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Reference#getOrganizationCode <em>Organization Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Code</em>' attribute.
	 * @see #getOrganizationCode()
	 * @generated
	 */
	void setOrganizationCode(String value);

	/**
	 * Returns the value of the '<em><b>Organization Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization Ref</em>' attribute.
	 * @see #setOrganizationRef(String)
	 * @see isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage#getReference_OrganizationRef()
	 * @model
	 * @generated
	 */
	String getOrganizationRef();

	/**
	 * Sets the value of the '{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Reference#getOrganizationRef <em>Organization Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Ref</em>' attribute.
	 * @see #getOrganizationRef()
	 * @generated
	 */
	void setOrganizationRef(String value);

	/**
	 * Returns the value of the '<em><b>Reference Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Number</em>' attribute.
	 * @see #setReferenceNumber(String)
	 * @see isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage#getReference_ReferenceNumber()
	 * @model required="true"
	 * @generated
	 */
	String getReferenceNumber();

	/**
	 * Sets the value of the '{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Reference#getReferenceNumber <em>Reference Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Number</em>' attribute.
	 * @see #getReferenceNumber()
	 * @generated
	 */
	void setReferenceNumber(String value);

} // Reference
