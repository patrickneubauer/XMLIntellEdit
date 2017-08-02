/**
 */
package eclassxmlschemaheader_2_0Simplified;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import eclassxmlschemacommon_2_0Simplified.CONTENTMODELType;
import eclassxmlschemacommon_2_0Simplified.IDENTIFICATION;
import eclassxmlschemacommon_2_0Simplified.LOCALE;
import eclassxmlschemacommon_2_0Simplified.PARTY;
import eclassxmlschemacommon_2_0Simplified.TYPEDSTRING;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DOCUMENTHEADER</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER#getSchemaVersion <em>Schema Version</em>}</li>
 *   <li>{@link eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER#getGeneratorVersion <em>Generator Version</em>}</li>
 *   <li>{@link eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER#getGenerationDate <em>Generation Date</em>}</li>
 *   <li>{@link eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER#getContentVersion <em>Content Version</em>}</li>
 *   <li>{@link eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER#getContentDate <em>Content Date</em>}</li>
 *   <li>{@link eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER#getContentModelType <em>Content Model Type</em>}</li>
 *   <li>{@link eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER#getOriginatingSystem <em>Originating System</em>}</li>
 *   <li>{@link eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER#getCreator <em>Creator</em>}</li>
 *   <li>{@link eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER#getAuthorisation <em>Authorisation</em>}</li>
 *   <li>{@link eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER#getContentIdentification <em>Content Identification</em>}</li>
 *   <li>{@link eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER#getConversationIdentification <em>Conversation Identification</em>}</li>
 *   <li>{@link eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER#getMessage <em>Message</em>}</li>
 *   <li>{@link eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER#getInReplyTo <em>In Reply To</em>}</li>
 *   <li>{@link eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER#getContentDescriptions <em>Content Descriptions</em>}</li>
 *   <li>{@link eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER#getContentLanguage <em>Content Language</em>}</li>
 * </ul>
 *
 * @see eclassxmlschemaheader_2_0Simplified.Eclassxmlschemaheader_2_0SimplifiedPackage#getDOCUMENTHEADER()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='patternSchemaVersion'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot patternSchemaVersion='self.schemaVersion.matches(\'eCl@ss XML 2.0\')'"
 * @generated
 */
public interface DOCUMENTHEADER extends EObject {
	/**
	 * Returns the value of the '<em><b>Schema Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema Version</em>' attribute.
	 * @see #setSchemaVersion(String)
	 * @see eclassxmlschemaheader_2_0Simplified.Eclassxmlschemaheader_2_0SimplifiedPackage#getDOCUMENTHEADER_SchemaVersion()
	 * @model required="true"
	 * @generated
	 */
	String getSchemaVersion();

	/**
	 * Sets the value of the '{@link eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER#getSchemaVersion <em>Schema Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Version</em>' attribute.
	 * @see #getSchemaVersion()
	 * @generated
	 */
	void setSchemaVersion(String value);

	/**
	 * Returns the value of the '<em><b>Generator Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generator Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generator Version</em>' attribute.
	 * @see #setGeneratorVersion(String)
	 * @see eclassxmlschemaheader_2_0Simplified.Eclassxmlschemaheader_2_0SimplifiedPackage#getDOCUMENTHEADER_GeneratorVersion()
	 * @model required="true"
	 * @generated
	 */
	String getGeneratorVersion();

	/**
	 * Sets the value of the '{@link eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER#getGeneratorVersion <em>Generator Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generator Version</em>' attribute.
	 * @see #getGeneratorVersion()
	 * @generated
	 */
	void setGeneratorVersion(String value);

	/**
	 * Returns the value of the '<em><b>Generation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generation Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generation Date</em>' attribute.
	 * @see #setGenerationDate(String)
	 * @see eclassxmlschemaheader_2_0Simplified.Eclassxmlschemaheader_2_0SimplifiedPackage#getDOCUMENTHEADER_GenerationDate()
	 * @model required="true"
	 * @generated
	 */
	String getGenerationDate();

	/**
	 * Sets the value of the '{@link eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER#getGenerationDate <em>Generation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generation Date</em>' attribute.
	 * @see #getGenerationDate()
	 * @generated
	 */
	void setGenerationDate(String value);

	/**
	 * Returns the value of the '<em><b>Content Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Version</em>' attribute.
	 * @see #setContentVersion(String)
	 * @see eclassxmlschemaheader_2_0Simplified.Eclassxmlschemaheader_2_0SimplifiedPackage#getDOCUMENTHEADER_ContentVersion()
	 * @model
	 * @generated
	 */
	String getContentVersion();

	/**
	 * Sets the value of the '{@link eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER#getContentVersion <em>Content Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Version</em>' attribute.
	 * @see #getContentVersion()
	 * @generated
	 */
	void setContentVersion(String value);

	/**
	 * Returns the value of the '<em><b>Content Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Date</em>' attribute.
	 * @see #setContentDate(String)
	 * @see eclassxmlschemaheader_2_0Simplified.Eclassxmlschemaheader_2_0SimplifiedPackage#getDOCUMENTHEADER_ContentDate()
	 * @model
	 * @generated
	 */
	String getContentDate();

	/**
	 * Sets the value of the '{@link eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER#getContentDate <em>Content Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Date</em>' attribute.
	 * @see #getContentDate()
	 * @generated
	 */
	void setContentDate(String value);

	/**
	 * Returns the value of the '<em><b>Content Model Type</b></em>' attribute.
	 * The literals are from the enumeration {@link eclassxmlschemacommon_2_0Simplified.CONTENTMODELType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Model Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Model Type</em>' attribute.
	 * @see eclassxmlschemacommon_2_0Simplified.CONTENTMODELType
	 * @see #setContentModelType(CONTENTMODELType)
	 * @see eclassxmlschemaheader_2_0Simplified.Eclassxmlschemaheader_2_0SimplifiedPackage#getDOCUMENTHEADER_ContentModelType()
	 * @model
	 * @generated
	 */
	CONTENTMODELType getContentModelType();

	/**
	 * Sets the value of the '{@link eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER#getContentModelType <em>Content Model Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Model Type</em>' attribute.
	 * @see eclassxmlschemacommon_2_0Simplified.CONTENTMODELType
	 * @see #getContentModelType()
	 * @generated
	 */
	void setContentModelType(CONTENTMODELType value);

	/**
	 * Returns the value of the '<em><b>Originating System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Originating System</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Originating System</em>' attribute.
	 * @see #setOriginatingSystem(String)
	 * @see eclassxmlschemaheader_2_0Simplified.Eclassxmlschemaheader_2_0SimplifiedPackage#getDOCUMENTHEADER_OriginatingSystem()
	 * @model required="true"
	 * @generated
	 */
	String getOriginatingSystem();

	/**
	 * Sets the value of the '{@link eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER#getOriginatingSystem <em>Originating System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Originating System</em>' attribute.
	 * @see #getOriginatingSystem()
	 * @generated
	 */
	void setOriginatingSystem(String value);

	/**
	 * Returns the value of the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creator</em>' containment reference.
	 * @see #setCreator(PARTY)
	 * @see eclassxmlschemaheader_2_0Simplified.Eclassxmlschemaheader_2_0SimplifiedPackage#getDOCUMENTHEADER_Creator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PARTY getCreator();

	/**
	 * Sets the value of the '{@link eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER#getCreator <em>Creator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creator</em>' containment reference.
	 * @see #getCreator()
	 * @generated
	 */
	void setCreator(PARTY value);

	/**
	 * Returns the value of the '<em><b>Authorisation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authorisation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorisation</em>' containment reference.
	 * @see #setAuthorisation(PARTY)
	 * @see eclassxmlschemaheader_2_0Simplified.Eclassxmlschemaheader_2_0SimplifiedPackage#getDOCUMENTHEADER_Authorisation()
	 * @model containment="true"
	 * @generated
	 */
	PARTY getAuthorisation();

	/**
	 * Sets the value of the '{@link eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER#getAuthorisation <em>Authorisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authorisation</em>' containment reference.
	 * @see #getAuthorisation()
	 * @generated
	 */
	void setAuthorisation(PARTY value);

	/**
	 * Returns the value of the '<em><b>Content Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Identification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Identification</em>' containment reference.
	 * @see #setContentIdentification(IDENTIFICATION)
	 * @see eclassxmlschemaheader_2_0Simplified.Eclassxmlschemaheader_2_0SimplifiedPackage#getDOCUMENTHEADER_ContentIdentification()
	 * @model containment="true"
	 * @generated
	 */
	IDENTIFICATION getContentIdentification();

	/**
	 * Sets the value of the '{@link eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER#getContentIdentification <em>Content Identification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Identification</em>' containment reference.
	 * @see #getContentIdentification()
	 * @generated
	 */
	void setContentIdentification(IDENTIFICATION value);

	/**
	 * Returns the value of the '<em><b>Conversation Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conversation Identification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conversation Identification</em>' containment reference.
	 * @see #setConversationIdentification(IDENTIFICATION)
	 * @see eclassxmlschemaheader_2_0Simplified.Eclassxmlschemaheader_2_0SimplifiedPackage#getDOCUMENTHEADER_ConversationIdentification()
	 * @model containment="true"
	 * @generated
	 */
	IDENTIFICATION getConversationIdentification();

	/**
	 * Sets the value of the '{@link eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER#getConversationIdentification <em>Conversation Identification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conversation Identification</em>' containment reference.
	 * @see #getConversationIdentification()
	 * @generated
	 */
	void setConversationIdentification(IDENTIFICATION value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' containment reference.
	 * @see #setMessage(MESSAGE)
	 * @see eclassxmlschemaheader_2_0Simplified.Eclassxmlschemaheader_2_0SimplifiedPackage#getDOCUMENTHEADER_Message()
	 * @model containment="true"
	 * @generated
	 */
	MESSAGE getMessage();

	/**
	 * Sets the value of the '{@link eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER#getMessage <em>Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' containment reference.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(MESSAGE value);

	/**
	 * Returns the value of the '<em><b>In Reply To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Reply To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Reply To</em>' containment reference.
	 * @see #setInReplyTo(MESSAGE)
	 * @see eclassxmlschemaheader_2_0Simplified.Eclassxmlschemaheader_2_0SimplifiedPackage#getDOCUMENTHEADER_InReplyTo()
	 * @model containment="true"
	 * @generated
	 */
	MESSAGE getInReplyTo();

	/**
	 * Sets the value of the '{@link eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER#getInReplyTo <em>In Reply To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Reply To</em>' containment reference.
	 * @see #getInReplyTo()
	 * @generated
	 */
	void setInReplyTo(MESSAGE value);

	/**
	 * Returns the value of the '<em><b>Content Descriptions</b></em>' containment reference list.
	 * The list contents are of type {@link eclassxmlschemacommon_2_0Simplified.TYPEDSTRING}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Descriptions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Descriptions</em>' containment reference list.
	 * @see eclassxmlschemaheader_2_0Simplified.Eclassxmlschemaheader_2_0SimplifiedPackage#getDOCUMENTHEADER_ContentDescriptions()
	 * @model containment="true"
	 * @generated
	 */
	EList<TYPEDSTRING> getContentDescriptions();

	/**
	 * Returns the value of the '<em><b>Content Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Language</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Language</em>' containment reference.
	 * @see #setContentLanguage(LOCALE)
	 * @see eclassxmlschemaheader_2_0Simplified.Eclassxmlschemaheader_2_0SimplifiedPackage#getDOCUMENTHEADER_ContentLanguage()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LOCALE getContentLanguage();

	/**
	 * Sets the value of the '{@link eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER#getContentLanguage <em>Content Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Language</em>' containment reference.
	 * @see #getContentLanguage()
	 * @generated
	 */
	void setContentLanguage(LOCALE value);

} // DOCUMENTHEADER
