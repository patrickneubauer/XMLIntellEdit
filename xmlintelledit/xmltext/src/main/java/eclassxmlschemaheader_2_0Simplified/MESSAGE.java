/**
 */
package eclassxmlschemaheader_2_0Simplified;

import org.eclipse.emf.ecore.EObject;

import eclassxmlschemacommon_2_0Simplified.IDENTIFICATION;
import eclassxmlschemacommon_2_0Simplified.PARTY;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MESSAGE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eclassxmlschemaheader_2_0Simplified.MESSAGE#getIdentification <em>Identification</em>}</li>
 *   <li>{@link eclassxmlschemaheader_2_0Simplified.MESSAGE#getSender <em>Sender</em>}</li>
 *   <li>{@link eclassxmlschemaheader_2_0Simplified.MESSAGE#getRecipient <em>Recipient</em>}</li>
 * </ul>
 *
 * @see eclassxmlschemaheader_2_0Simplified.Eclassxmlschemaheader_2_0SimplifiedPackage#getMESSAGE()
 * @model
 * @generated
 */
public interface MESSAGE extends EObject {
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
	 * @see eclassxmlschemaheader_2_0Simplified.Eclassxmlschemaheader_2_0SimplifiedPackage#getMESSAGE_Identification()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IDENTIFICATION getIdentification();

	/**
	 * Sets the value of the '{@link eclassxmlschemaheader_2_0Simplified.MESSAGE#getIdentification <em>Identification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identification</em>' containment reference.
	 * @see #getIdentification()
	 * @generated
	 */
	void setIdentification(IDENTIFICATION value);

	/**
	 * Returns the value of the '<em><b>Sender</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sender</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender</em>' containment reference.
	 * @see #setSender(PARTY)
	 * @see eclassxmlschemaheader_2_0Simplified.Eclassxmlschemaheader_2_0SimplifiedPackage#getMESSAGE_Sender()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PARTY getSender();

	/**
	 * Sets the value of the '{@link eclassxmlschemaheader_2_0Simplified.MESSAGE#getSender <em>Sender</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sender</em>' containment reference.
	 * @see #getSender()
	 * @generated
	 */
	void setSender(PARTY value);

	/**
	 * Returns the value of the '<em><b>Recipient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recipient</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipient</em>' containment reference.
	 * @see #setRecipient(PARTY)
	 * @see eclassxmlschemaheader_2_0Simplified.Eclassxmlschemaheader_2_0SimplifiedPackage#getMESSAGE_Recipient()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PARTY getRecipient();

	/**
	 * Sets the value of the '{@link eclassxmlschemaheader_2_0Simplified.MESSAGE#getRecipient <em>Recipient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recipient</em>' containment reference.
	 * @see #getRecipient()
	 * @generated
	 */
	void setRecipient(PARTY value);

} // MESSAGE
