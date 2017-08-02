/**
 */
package eclassxmlschemacommon_2_0Simplified;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PARTY</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eclassxmlschemacommon_2_0Simplified.PARTY#getName <em>Name</em>}</li>
 *   <li>{@link eclassxmlschemacommon_2_0Simplified.PARTY#getOrganisation <em>Organisation</em>}</li>
 *   <li>{@link eclassxmlschemacommon_2_0Simplified.PARTY#getIdentification <em>Identification</em>}</li>
 *   <li>{@link eclassxmlschemacommon_2_0Simplified.PARTY#getContact <em>Contact</em>}</li>
 * </ul>
 *
 * @see eclassxmlschemacommon_2_0Simplified.Eclassxmlschemacommon_2_0SimplifiedPackage#getPARTY()
 * @model
 * @generated
 */
public interface PARTY extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eclassxmlschemacommon_2_0Simplified.Eclassxmlschemacommon_2_0SimplifiedPackage#getPARTY_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eclassxmlschemacommon_2_0Simplified.PARTY#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Organisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organisation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organisation</em>' attribute.
	 * @see #setOrganisation(String)
	 * @see eclassxmlschemacommon_2_0Simplified.Eclassxmlschemacommon_2_0SimplifiedPackage#getPARTY_Organisation()
	 * @model
	 * @generated
	 */
	String getOrganisation();

	/**
	 * Sets the value of the '{@link eclassxmlschemacommon_2_0Simplified.PARTY#getOrganisation <em>Organisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organisation</em>' attribute.
	 * @see #getOrganisation()
	 * @generated
	 */
	void setOrganisation(String value);

	/**
	 * Returns the value of the '<em><b>Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identification</em>' containment reference.
	 * @see #setIdentification(IDENTIFICATION)
	 * @see eclassxmlschemacommon_2_0Simplified.Eclassxmlschemacommon_2_0SimplifiedPackage#getPARTY_Identification()
	 * @model containment="true"
	 * @generated
	 */
	IDENTIFICATION getIdentification();

	/**
	 * Sets the value of the '{@link eclassxmlschemacommon_2_0Simplified.PARTY#getIdentification <em>Identification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identification</em>' containment reference.
	 * @see #getIdentification()
	 * @generated
	 */
	void setIdentification(IDENTIFICATION value);

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact</em>' containment reference.
	 * @see #setContact(Contact)
	 * @see eclassxmlschemacommon_2_0Simplified.Eclassxmlschemacommon_2_0SimplifiedPackage#getPARTY_Contact()
	 * @model containment="true"
	 * @generated
	 */
	Contact getContact();

	/**
	 * Sets the value of the '{@link eclassxmlschemacommon_2_0Simplified.PARTY#getContact <em>Contact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact</em>' containment reference.
	 * @see #getContact()
	 * @generated
	 */
	void setContact(Contact value);

} // PARTY
