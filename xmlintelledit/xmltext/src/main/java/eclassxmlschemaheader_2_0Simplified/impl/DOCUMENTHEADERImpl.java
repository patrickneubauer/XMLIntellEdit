/**
 */
package eclassxmlschemaheader_2_0Simplified.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import eclassxmlschemacommon_2_0Simplified.CONTENTMODELType;
import eclassxmlschemacommon_2_0Simplified.IDENTIFICATION;
import eclassxmlschemacommon_2_0Simplified.LOCALE;
import eclassxmlschemacommon_2_0Simplified.PARTY;
import eclassxmlschemacommon_2_0Simplified.TYPEDSTRING;
import eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER;
import eclassxmlschemaheader_2_0Simplified.Eclassxmlschemaheader_2_0SimplifiedPackage;
import eclassxmlschemaheader_2_0Simplified.MESSAGE;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DOCUMENTHEADER</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eclassxmlschemaheader_2_0Simplified.impl.DOCUMENTHEADERImpl#getSchemaVersion <em>Schema Version</em>}</li>
 *   <li>{@link eclassxmlschemaheader_2_0Simplified.impl.DOCUMENTHEADERImpl#getGeneratorVersion <em>Generator Version</em>}</li>
 *   <li>{@link eclassxmlschemaheader_2_0Simplified.impl.DOCUMENTHEADERImpl#getGenerationDate <em>Generation Date</em>}</li>
 *   <li>{@link eclassxmlschemaheader_2_0Simplified.impl.DOCUMENTHEADERImpl#getContentVersion <em>Content Version</em>}</li>
 *   <li>{@link eclassxmlschemaheader_2_0Simplified.impl.DOCUMENTHEADERImpl#getContentDate <em>Content Date</em>}</li>
 *   <li>{@link eclassxmlschemaheader_2_0Simplified.impl.DOCUMENTHEADERImpl#getContentModelType <em>Content Model Type</em>}</li>
 *   <li>{@link eclassxmlschemaheader_2_0Simplified.impl.DOCUMENTHEADERImpl#getOriginatingSystem <em>Originating System</em>}</li>
 *   <li>{@link eclassxmlschemaheader_2_0Simplified.impl.DOCUMENTHEADERImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link eclassxmlschemaheader_2_0Simplified.impl.DOCUMENTHEADERImpl#getAuthorisation <em>Authorisation</em>}</li>
 *   <li>{@link eclassxmlschemaheader_2_0Simplified.impl.DOCUMENTHEADERImpl#getContentIdentification <em>Content Identification</em>}</li>
 *   <li>{@link eclassxmlschemaheader_2_0Simplified.impl.DOCUMENTHEADERImpl#getConversationIdentification <em>Conversation Identification</em>}</li>
 *   <li>{@link eclassxmlschemaheader_2_0Simplified.impl.DOCUMENTHEADERImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link eclassxmlschemaheader_2_0Simplified.impl.DOCUMENTHEADERImpl#getInReplyTo <em>In Reply To</em>}</li>
 *   <li>{@link eclassxmlschemaheader_2_0Simplified.impl.DOCUMENTHEADERImpl#getContentDescriptions <em>Content Descriptions</em>}</li>
 *   <li>{@link eclassxmlschemaheader_2_0Simplified.impl.DOCUMENTHEADERImpl#getContentLanguage <em>Content Language</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DOCUMENTHEADERImpl extends MinimalEObjectImpl.Container implements DOCUMENTHEADER {
	/**
	 * The default value of the '{@link #getSchemaVersion() <em>Schema Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEMA_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchemaVersion() <em>Schema Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaVersion()
	 * @generated
	 * @ordered
	 */
	protected String schemaVersion = SCHEMA_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratorVersion() <em>Generator Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratorVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATOR_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeneratorVersion() <em>Generator Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratorVersion()
	 * @generated
	 * @ordered
	 */
	protected String generatorVersion = GENERATOR_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getGenerationDate() <em>Generation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerationDate()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGenerationDate() <em>Generation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerationDate()
	 * @generated
	 * @ordered
	 */
	protected String generationDate = GENERATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getContentVersion() <em>Content Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentVersion() <em>Content Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentVersion()
	 * @generated
	 * @ordered
	 */
	protected String contentVersion = CONTENT_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getContentDate() <em>Content Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentDate()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentDate() <em>Content Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentDate()
	 * @generated
	 * @ordered
	 */
	protected String contentDate = CONTENT_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getContentModelType() <em>Content Model Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentModelType()
	 * @generated
	 * @ordered
	 */
	protected static final CONTENTMODELType CONTENT_MODEL_TYPE_EDEFAULT = CONTENTMODELType.ADVANCED;

	/**
	 * The cached value of the '{@link #getContentModelType() <em>Content Model Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentModelType()
	 * @generated
	 * @ordered
	 */
	protected CONTENTMODELType contentModelType = CONTENT_MODEL_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOriginatingSystem() <em>Originating System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginatingSystem()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGINATING_SYSTEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOriginatingSystem() <em>Originating System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginatingSystem()
	 * @generated
	 * @ordered
	 */
	protected String originatingSystem = ORIGINATING_SYSTEM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCreator() <em>Creator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreator()
	 * @generated
	 * @ordered
	 */
	protected PARTY creator;

	/**
	 * The cached value of the '{@link #getAuthorisation() <em>Authorisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorisation()
	 * @generated
	 * @ordered
	 */
	protected PARTY authorisation;

	/**
	 * The cached value of the '{@link #getContentIdentification() <em>Content Identification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentIdentification()
	 * @generated
	 * @ordered
	 */
	protected IDENTIFICATION contentIdentification;

	/**
	 * The cached value of the '{@link #getConversationIdentification() <em>Conversation Identification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConversationIdentification()
	 * @generated
	 * @ordered
	 */
	protected IDENTIFICATION conversationIdentification;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected MESSAGE message;

	/**
	 * The cached value of the '{@link #getInReplyTo() <em>In Reply To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInReplyTo()
	 * @generated
	 * @ordered
	 */
	protected MESSAGE inReplyTo;

	/**
	 * The cached value of the '{@link #getContentDescriptions() <em>Content Descriptions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<TYPEDSTRING> contentDescriptions;

	/**
	 * The cached value of the '{@link #getContentLanguage() <em>Content Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentLanguage()
	 * @generated
	 * @ordered
	 */
	protected LOCALE contentLanguage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DOCUMENTHEADERImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Eclassxmlschemaheader_2_0SimplifiedPackage.Literals.DOCUMENTHEADER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSchemaVersion() {
		return schemaVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchemaVersion(String newSchemaVersion) {
		String oldSchemaVersion = schemaVersion;
		schemaVersion = newSchemaVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__SCHEMA_VERSION, oldSchemaVersion, schemaVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGeneratorVersion() {
		return generatorVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneratorVersion(String newGeneratorVersion) {
		String oldGeneratorVersion = generatorVersion;
		generatorVersion = newGeneratorVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__GENERATOR_VERSION, oldGeneratorVersion, generatorVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGenerationDate() {
		return generationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerationDate(String newGenerationDate) {
		String oldGenerationDate = generationDate;
		generationDate = newGenerationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__GENERATION_DATE, oldGenerationDate, generationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContentVersion() {
		return contentVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentVersion(String newContentVersion) {
		String oldContentVersion = contentVersion;
		contentVersion = newContentVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__CONTENT_VERSION, oldContentVersion, contentVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContentDate() {
		return contentDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentDate(String newContentDate) {
		String oldContentDate = contentDate;
		contentDate = newContentDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__CONTENT_DATE, oldContentDate, contentDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONTENTMODELType getContentModelType() {
		return contentModelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentModelType(CONTENTMODELType newContentModelType) {
		CONTENTMODELType oldContentModelType = contentModelType;
		contentModelType = newContentModelType == null ? CONTENT_MODEL_TYPE_EDEFAULT : newContentModelType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__CONTENT_MODEL_TYPE, oldContentModelType, contentModelType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOriginatingSystem() {
		return originatingSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginatingSystem(String newOriginatingSystem) {
		String oldOriginatingSystem = originatingSystem;
		originatingSystem = newOriginatingSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__ORIGINATING_SYSTEM, oldOriginatingSystem, originatingSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PARTY getCreator() {
		return creator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreator(PARTY newCreator, NotificationChain msgs) {
		PARTY oldCreator = creator;
		creator = newCreator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__CREATOR, oldCreator, newCreator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreator(PARTY newCreator) {
		if (newCreator != creator) {
			NotificationChain msgs = null;
			if (creator != null)
				msgs = ((InternalEObject)creator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__CREATOR, null, msgs);
			if (newCreator != null)
				msgs = ((InternalEObject)newCreator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__CREATOR, null, msgs);
			msgs = basicSetCreator(newCreator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__CREATOR, newCreator, newCreator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PARTY getAuthorisation() {
		return authorisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthorisation(PARTY newAuthorisation, NotificationChain msgs) {
		PARTY oldAuthorisation = authorisation;
		authorisation = newAuthorisation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__AUTHORISATION, oldAuthorisation, newAuthorisation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthorisation(PARTY newAuthorisation) {
		if (newAuthorisation != authorisation) {
			NotificationChain msgs = null;
			if (authorisation != null)
				msgs = ((InternalEObject)authorisation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__AUTHORISATION, null, msgs);
			if (newAuthorisation != null)
				msgs = ((InternalEObject)newAuthorisation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__AUTHORISATION, null, msgs);
			msgs = basicSetAuthorisation(newAuthorisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__AUTHORISATION, newAuthorisation, newAuthorisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDENTIFICATION getContentIdentification() {
		return contentIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContentIdentification(IDENTIFICATION newContentIdentification, NotificationChain msgs) {
		IDENTIFICATION oldContentIdentification = contentIdentification;
		contentIdentification = newContentIdentification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__CONTENT_IDENTIFICATION, oldContentIdentification, newContentIdentification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentIdentification(IDENTIFICATION newContentIdentification) {
		if (newContentIdentification != contentIdentification) {
			NotificationChain msgs = null;
			if (contentIdentification != null)
				msgs = ((InternalEObject)contentIdentification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__CONTENT_IDENTIFICATION, null, msgs);
			if (newContentIdentification != null)
				msgs = ((InternalEObject)newContentIdentification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__CONTENT_IDENTIFICATION, null, msgs);
			msgs = basicSetContentIdentification(newContentIdentification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__CONTENT_IDENTIFICATION, newContentIdentification, newContentIdentification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDENTIFICATION getConversationIdentification() {
		return conversationIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConversationIdentification(IDENTIFICATION newConversationIdentification, NotificationChain msgs) {
		IDENTIFICATION oldConversationIdentification = conversationIdentification;
		conversationIdentification = newConversationIdentification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__CONVERSATION_IDENTIFICATION, oldConversationIdentification, newConversationIdentification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConversationIdentification(IDENTIFICATION newConversationIdentification) {
		if (newConversationIdentification != conversationIdentification) {
			NotificationChain msgs = null;
			if (conversationIdentification != null)
				msgs = ((InternalEObject)conversationIdentification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__CONVERSATION_IDENTIFICATION, null, msgs);
			if (newConversationIdentification != null)
				msgs = ((InternalEObject)newConversationIdentification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__CONVERSATION_IDENTIFICATION, null, msgs);
			msgs = basicSetConversationIdentification(newConversationIdentification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__CONVERSATION_IDENTIFICATION, newConversationIdentification, newConversationIdentification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MESSAGE getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessage(MESSAGE newMessage, NotificationChain msgs) {
		MESSAGE oldMessage = message;
		message = newMessage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__MESSAGE, oldMessage, newMessage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage(MESSAGE newMessage) {
		if (newMessage != message) {
			NotificationChain msgs = null;
			if (message != null)
				msgs = ((InternalEObject)message).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__MESSAGE, null, msgs);
			if (newMessage != null)
				msgs = ((InternalEObject)newMessage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__MESSAGE, null, msgs);
			msgs = basicSetMessage(newMessage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__MESSAGE, newMessage, newMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MESSAGE getInReplyTo() {
		return inReplyTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInReplyTo(MESSAGE newInReplyTo, NotificationChain msgs) {
		MESSAGE oldInReplyTo = inReplyTo;
		inReplyTo = newInReplyTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__IN_REPLY_TO, oldInReplyTo, newInReplyTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInReplyTo(MESSAGE newInReplyTo) {
		if (newInReplyTo != inReplyTo) {
			NotificationChain msgs = null;
			if (inReplyTo != null)
				msgs = ((InternalEObject)inReplyTo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__IN_REPLY_TO, null, msgs);
			if (newInReplyTo != null)
				msgs = ((InternalEObject)newInReplyTo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__IN_REPLY_TO, null, msgs);
			msgs = basicSetInReplyTo(newInReplyTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__IN_REPLY_TO, newInReplyTo, newInReplyTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TYPEDSTRING> getContentDescriptions() {
		if (contentDescriptions == null) {
			contentDescriptions = new EObjectContainmentEList<TYPEDSTRING>(TYPEDSTRING.class, this, Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__CONTENT_DESCRIPTIONS);
		}
		return contentDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LOCALE getContentLanguage() {
		return contentLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContentLanguage(LOCALE newContentLanguage, NotificationChain msgs) {
		LOCALE oldContentLanguage = contentLanguage;
		contentLanguage = newContentLanguage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__CONTENT_LANGUAGE, oldContentLanguage, newContentLanguage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentLanguage(LOCALE newContentLanguage) {
		if (newContentLanguage != contentLanguage) {
			NotificationChain msgs = null;
			if (contentLanguage != null)
				msgs = ((InternalEObject)contentLanguage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__CONTENT_LANGUAGE, null, msgs);
			if (newContentLanguage != null)
				msgs = ((InternalEObject)newContentLanguage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__CONTENT_LANGUAGE, null, msgs);
			msgs = basicSetContentLanguage(newContentLanguage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__CONTENT_LANGUAGE, newContentLanguage, newContentLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__CREATOR:
				return basicSetCreator(null, msgs);
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__AUTHORISATION:
				return basicSetAuthorisation(null, msgs);
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__CONTENT_IDENTIFICATION:
				return basicSetContentIdentification(null, msgs);
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__CONVERSATION_IDENTIFICATION:
				return basicSetConversationIdentification(null, msgs);
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__MESSAGE:
				return basicSetMessage(null, msgs);
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__IN_REPLY_TO:
				return basicSetInReplyTo(null, msgs);
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__CONTENT_DESCRIPTIONS:
				return ((InternalEList<?>)getContentDescriptions()).basicRemove(otherEnd, msgs);
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__CONTENT_LANGUAGE:
				return basicSetContentLanguage(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__SCHEMA_VERSION:
				return getSchemaVersion();
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__GENERATOR_VERSION:
				return getGeneratorVersion();
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__GENERATION_DATE:
				return getGenerationDate();
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__CONTENT_VERSION:
				return getContentVersion();
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__CONTENT_DATE:
				return getContentDate();
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__CONTENT_MODEL_TYPE:
				return getContentModelType();
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__ORIGINATING_SYSTEM:
				return getOriginatingSystem();
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__CREATOR:
				return getCreator();
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__AUTHORISATION:
				return getAuthorisation();
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__CONTENT_IDENTIFICATION:
				return getContentIdentification();
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__CONVERSATION_IDENTIFICATION:
				return getConversationIdentification();
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__MESSAGE:
				return getMessage();
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__IN_REPLY_TO:
				return getInReplyTo();
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__CONTENT_DESCRIPTIONS:
				return getContentDescriptions();
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__CONTENT_LANGUAGE:
				return getContentLanguage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__SCHEMA_VERSION:
				setSchemaVersion((String)newValue);
				return;
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__GENERATOR_VERSION:
				setGeneratorVersion((String)newValue);
				return;
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__GENERATION_DATE:
				setGenerationDate((String)newValue);
				return;
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__CONTENT_VERSION:
				setContentVersion((String)newValue);
				return;
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__CONTENT_DATE:
				setContentDate((String)newValue);
				return;
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__CONTENT_MODEL_TYPE:
				setContentModelType((CONTENTMODELType)newValue);
				return;
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__ORIGINATING_SYSTEM:
				setOriginatingSystem((String)newValue);
				return;
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__CREATOR:
				setCreator((PARTY)newValue);
				return;
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__AUTHORISATION:
				setAuthorisation((PARTY)newValue);
				return;
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__CONTENT_IDENTIFICATION:
				setContentIdentification((IDENTIFICATION)newValue);
				return;
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__CONVERSATION_IDENTIFICATION:
				setConversationIdentification((IDENTIFICATION)newValue);
				return;
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__MESSAGE:
				setMessage((MESSAGE)newValue);
				return;
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__IN_REPLY_TO:
				setInReplyTo((MESSAGE)newValue);
				return;
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__CONTENT_DESCRIPTIONS:
				getContentDescriptions().clear();
				getContentDescriptions().addAll((Collection<? extends TYPEDSTRING>)newValue);
				return;
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__CONTENT_LANGUAGE:
				setContentLanguage((LOCALE)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__SCHEMA_VERSION:
				setSchemaVersion(SCHEMA_VERSION_EDEFAULT);
				return;
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__GENERATOR_VERSION:
				setGeneratorVersion(GENERATOR_VERSION_EDEFAULT);
				return;
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__GENERATION_DATE:
				setGenerationDate(GENERATION_DATE_EDEFAULT);
				return;
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__CONTENT_VERSION:
				setContentVersion(CONTENT_VERSION_EDEFAULT);
				return;
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__CONTENT_DATE:
				setContentDate(CONTENT_DATE_EDEFAULT);
				return;
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__CONTENT_MODEL_TYPE:
				setContentModelType(CONTENT_MODEL_TYPE_EDEFAULT);
				return;
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__ORIGINATING_SYSTEM:
				setOriginatingSystem(ORIGINATING_SYSTEM_EDEFAULT);
				return;
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__CREATOR:
				setCreator((PARTY)null);
				return;
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__AUTHORISATION:
				setAuthorisation((PARTY)null);
				return;
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__CONTENT_IDENTIFICATION:
				setContentIdentification((IDENTIFICATION)null);
				return;
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__CONVERSATION_IDENTIFICATION:
				setConversationIdentification((IDENTIFICATION)null);
				return;
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__MESSAGE:
				setMessage((MESSAGE)null);
				return;
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__IN_REPLY_TO:
				setInReplyTo((MESSAGE)null);
				return;
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__CONTENT_DESCRIPTIONS:
				getContentDescriptions().clear();
				return;
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__CONTENT_LANGUAGE:
				setContentLanguage((LOCALE)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__SCHEMA_VERSION:
				return SCHEMA_VERSION_EDEFAULT == null ? schemaVersion != null : !SCHEMA_VERSION_EDEFAULT.equals(schemaVersion);
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__GENERATOR_VERSION:
				return GENERATOR_VERSION_EDEFAULT == null ? generatorVersion != null : !GENERATOR_VERSION_EDEFAULT.equals(generatorVersion);
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__GENERATION_DATE:
				return GENERATION_DATE_EDEFAULT == null ? generationDate != null : !GENERATION_DATE_EDEFAULT.equals(generationDate);
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__CONTENT_VERSION:
				return CONTENT_VERSION_EDEFAULT == null ? contentVersion != null : !CONTENT_VERSION_EDEFAULT.equals(contentVersion);
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__CONTENT_DATE:
				return CONTENT_DATE_EDEFAULT == null ? contentDate != null : !CONTENT_DATE_EDEFAULT.equals(contentDate);
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__CONTENT_MODEL_TYPE:
				return contentModelType != CONTENT_MODEL_TYPE_EDEFAULT;
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__ORIGINATING_SYSTEM:
				return ORIGINATING_SYSTEM_EDEFAULT == null ? originatingSystem != null : !ORIGINATING_SYSTEM_EDEFAULT.equals(originatingSystem);
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__CREATOR:
				return creator != null;
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__AUTHORISATION:
				return authorisation != null;
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__CONTENT_IDENTIFICATION:
				return contentIdentification != null;
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__CONVERSATION_IDENTIFICATION:
				return conversationIdentification != null;
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__MESSAGE:
				return message != null;
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__IN_REPLY_TO:
				return inReplyTo != null;
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__CONTENT_DESCRIPTIONS:
				return contentDescriptions != null && !contentDescriptions.isEmpty();
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER__CONTENT_LANGUAGE:
				return contentLanguage != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (schemaVersion: ");
		result.append(schemaVersion);
		result.append(", generatorVersion: ");
		result.append(generatorVersion);
		result.append(", generationDate: ");
		result.append(generationDate);
		result.append(", contentVersion: ");
		result.append(contentVersion);
		result.append(", contentDate: ");
		result.append(contentDate);
		result.append(", contentModelType: ");
		result.append(contentModelType);
		result.append(", originatingSystem: ");
		result.append(originatingSystem);
		result.append(')');
		return result.toString();
	}

} //DOCUMENTHEADERImpl
