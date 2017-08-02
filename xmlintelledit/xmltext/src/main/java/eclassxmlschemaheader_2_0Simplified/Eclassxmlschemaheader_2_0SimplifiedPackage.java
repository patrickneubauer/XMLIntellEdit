/**
 */
package eclassxmlschemaheader_2_0Simplified;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see eclassxmlschemaheader_2_0Simplified.Eclassxmlschemaheader_2_0SimplifiedFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface Eclassxmlschemaheader_2_0SimplifiedPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "eclassxmlschemaheader_2_0Simplified";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:eclass:xml-schema:header:2.0simplified";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "_0s";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Eclassxmlschemaheader_2_0SimplifiedPackage eINSTANCE = eclassxmlschemaheader_2_0Simplified.impl.Eclassxmlschemaheader_2_0SimplifiedPackageImpl.init();

	/**
	 * The meta object id for the '{@link eclassxmlschemaheader_2_0Simplified.impl.DOCUMENTHEADERImpl <em>DOCUMENTHEADER</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eclassxmlschemaheader_2_0Simplified.impl.DOCUMENTHEADERImpl
	 * @see eclassxmlschemaheader_2_0Simplified.impl.Eclassxmlschemaheader_2_0SimplifiedPackageImpl#getDOCUMENTHEADER()
	 * @generated
	 */
	int DOCUMENTHEADER = 0;

	/**
	 * The feature id for the '<em><b>Schema Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTHEADER__SCHEMA_VERSION = 0;

	/**
	 * The feature id for the '<em><b>Generator Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTHEADER__GENERATOR_VERSION = 1;

	/**
	 * The feature id for the '<em><b>Generation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTHEADER__GENERATION_DATE = 2;

	/**
	 * The feature id for the '<em><b>Content Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTHEADER__CONTENT_VERSION = 3;

	/**
	 * The feature id for the '<em><b>Content Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTHEADER__CONTENT_DATE = 4;

	/**
	 * The feature id for the '<em><b>Content Model Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTHEADER__CONTENT_MODEL_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Originating System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTHEADER__ORIGINATING_SYSTEM = 6;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTHEADER__CREATOR = 7;

	/**
	 * The feature id for the '<em><b>Authorisation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTHEADER__AUTHORISATION = 8;

	/**
	 * The feature id for the '<em><b>Content Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTHEADER__CONTENT_IDENTIFICATION = 9;

	/**
	 * The feature id for the '<em><b>Conversation Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTHEADER__CONVERSATION_IDENTIFICATION = 10;

	/**
	 * The feature id for the '<em><b>Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTHEADER__MESSAGE = 11;

	/**
	 * The feature id for the '<em><b>In Reply To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTHEADER__IN_REPLY_TO = 12;

	/**
	 * The feature id for the '<em><b>Content Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTHEADER__CONTENT_DESCRIPTIONS = 13;

	/**
	 * The feature id for the '<em><b>Content Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTHEADER__CONTENT_LANGUAGE = 14;

	/**
	 * The number of structural features of the '<em>DOCUMENTHEADER</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTHEADER_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>DOCUMENTHEADER</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTHEADER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eclassxmlschemaheader_2_0Simplified.impl.MESSAGEImpl <em>MESSAGE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eclassxmlschemaheader_2_0Simplified.impl.MESSAGEImpl
	 * @see eclassxmlschemaheader_2_0Simplified.impl.Eclassxmlschemaheader_2_0SimplifiedPackageImpl#getMESSAGE()
	 * @generated
	 */
	int MESSAGE = 1;

	/**
	 * The feature id for the '<em><b>Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__IDENTIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Sender</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__SENDER = 1;

	/**
	 * The feature id for the '<em><b>Recipient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__RECIPIENT = 2;

	/**
	 * The number of structural features of the '<em>MESSAGE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>MESSAGE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER <em>DOCUMENTHEADER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DOCUMENTHEADER</em>'.
	 * @see eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER
	 * @generated
	 */
	EClass getDOCUMENTHEADER();

	/**
	 * Returns the meta object for the attribute '{@link eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER#getSchemaVersion <em>Schema Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Version</em>'.
	 * @see eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER#getSchemaVersion()
	 * @see #getDOCUMENTHEADER()
	 * @generated
	 */
	EAttribute getDOCUMENTHEADER_SchemaVersion();

	/**
	 * Returns the meta object for the attribute '{@link eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER#getGeneratorVersion <em>Generator Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generator Version</em>'.
	 * @see eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER#getGeneratorVersion()
	 * @see #getDOCUMENTHEADER()
	 * @generated
	 */
	EAttribute getDOCUMENTHEADER_GeneratorVersion();

	/**
	 * Returns the meta object for the attribute '{@link eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER#getGenerationDate <em>Generation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generation Date</em>'.
	 * @see eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER#getGenerationDate()
	 * @see #getDOCUMENTHEADER()
	 * @generated
	 */
	EAttribute getDOCUMENTHEADER_GenerationDate();

	/**
	 * Returns the meta object for the attribute '{@link eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER#getContentVersion <em>Content Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Version</em>'.
	 * @see eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER#getContentVersion()
	 * @see #getDOCUMENTHEADER()
	 * @generated
	 */
	EAttribute getDOCUMENTHEADER_ContentVersion();

	/**
	 * Returns the meta object for the attribute '{@link eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER#getContentDate <em>Content Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Date</em>'.
	 * @see eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER#getContentDate()
	 * @see #getDOCUMENTHEADER()
	 * @generated
	 */
	EAttribute getDOCUMENTHEADER_ContentDate();

	/**
	 * Returns the meta object for the attribute '{@link eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER#getContentModelType <em>Content Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Model Type</em>'.
	 * @see eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER#getContentModelType()
	 * @see #getDOCUMENTHEADER()
	 * @generated
	 */
	EAttribute getDOCUMENTHEADER_ContentModelType();

	/**
	 * Returns the meta object for the attribute '{@link eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER#getOriginatingSystem <em>Originating System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Originating System</em>'.
	 * @see eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER#getOriginatingSystem()
	 * @see #getDOCUMENTHEADER()
	 * @generated
	 */
	EAttribute getDOCUMENTHEADER_OriginatingSystem();

	/**
	 * Returns the meta object for the containment reference '{@link eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER#getCreator <em>Creator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Creator</em>'.
	 * @see eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER#getCreator()
	 * @see #getDOCUMENTHEADER()
	 * @generated
	 */
	EReference getDOCUMENTHEADER_Creator();

	/**
	 * Returns the meta object for the containment reference '{@link eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER#getAuthorisation <em>Authorisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Authorisation</em>'.
	 * @see eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER#getAuthorisation()
	 * @see #getDOCUMENTHEADER()
	 * @generated
	 */
	EReference getDOCUMENTHEADER_Authorisation();

	/**
	 * Returns the meta object for the containment reference '{@link eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER#getContentIdentification <em>Content Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content Identification</em>'.
	 * @see eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER#getContentIdentification()
	 * @see #getDOCUMENTHEADER()
	 * @generated
	 */
	EReference getDOCUMENTHEADER_ContentIdentification();

	/**
	 * Returns the meta object for the containment reference '{@link eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER#getConversationIdentification <em>Conversation Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conversation Identification</em>'.
	 * @see eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER#getConversationIdentification()
	 * @see #getDOCUMENTHEADER()
	 * @generated
	 */
	EReference getDOCUMENTHEADER_ConversationIdentification();

	/**
	 * Returns the meta object for the containment reference '{@link eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message</em>'.
	 * @see eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER#getMessage()
	 * @see #getDOCUMENTHEADER()
	 * @generated
	 */
	EReference getDOCUMENTHEADER_Message();

	/**
	 * Returns the meta object for the containment reference '{@link eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER#getInReplyTo <em>In Reply To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>In Reply To</em>'.
	 * @see eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER#getInReplyTo()
	 * @see #getDOCUMENTHEADER()
	 * @generated
	 */
	EReference getDOCUMENTHEADER_InReplyTo();

	/**
	 * Returns the meta object for the containment reference list '{@link eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER#getContentDescriptions <em>Content Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content Descriptions</em>'.
	 * @see eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER#getContentDescriptions()
	 * @see #getDOCUMENTHEADER()
	 * @generated
	 */
	EReference getDOCUMENTHEADER_ContentDescriptions();

	/**
	 * Returns the meta object for the containment reference '{@link eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER#getContentLanguage <em>Content Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content Language</em>'.
	 * @see eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER#getContentLanguage()
	 * @see #getDOCUMENTHEADER()
	 * @generated
	 */
	EReference getDOCUMENTHEADER_ContentLanguage();

	/**
	 * Returns the meta object for class '{@link eclassxmlschemaheader_2_0Simplified.MESSAGE <em>MESSAGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MESSAGE</em>'.
	 * @see eclassxmlschemaheader_2_0Simplified.MESSAGE
	 * @generated
	 */
	EClass getMESSAGE();

	/**
	 * Returns the meta object for the containment reference '{@link eclassxmlschemaheader_2_0Simplified.MESSAGE#getIdentification <em>Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identification</em>'.
	 * @see eclassxmlschemaheader_2_0Simplified.MESSAGE#getIdentification()
	 * @see #getMESSAGE()
	 * @generated
	 */
	EReference getMESSAGE_Identification();

	/**
	 * Returns the meta object for the containment reference '{@link eclassxmlschemaheader_2_0Simplified.MESSAGE#getSender <em>Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sender</em>'.
	 * @see eclassxmlschemaheader_2_0Simplified.MESSAGE#getSender()
	 * @see #getMESSAGE()
	 * @generated
	 */
	EReference getMESSAGE_Sender();

	/**
	 * Returns the meta object for the containment reference '{@link eclassxmlschemaheader_2_0Simplified.MESSAGE#getRecipient <em>Recipient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Recipient</em>'.
	 * @see eclassxmlschemaheader_2_0Simplified.MESSAGE#getRecipient()
	 * @see #getMESSAGE()
	 * @generated
	 */
	EReference getMESSAGE_Recipient();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Eclassxmlschemaheader_2_0SimplifiedFactory getEclassxmlschemaheader_2_0SimplifiedFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link eclassxmlschemaheader_2_0Simplified.impl.DOCUMENTHEADERImpl <em>DOCUMENTHEADER</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eclassxmlschemaheader_2_0Simplified.impl.DOCUMENTHEADERImpl
		 * @see eclassxmlschemaheader_2_0Simplified.impl.Eclassxmlschemaheader_2_0SimplifiedPackageImpl#getDOCUMENTHEADER()
		 * @generated
		 */
		EClass DOCUMENTHEADER = eINSTANCE.getDOCUMENTHEADER();

		/**
		 * The meta object literal for the '<em><b>Schema Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTHEADER__SCHEMA_VERSION = eINSTANCE.getDOCUMENTHEADER_SchemaVersion();

		/**
		 * The meta object literal for the '<em><b>Generator Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTHEADER__GENERATOR_VERSION = eINSTANCE.getDOCUMENTHEADER_GeneratorVersion();

		/**
		 * The meta object literal for the '<em><b>Generation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTHEADER__GENERATION_DATE = eINSTANCE.getDOCUMENTHEADER_GenerationDate();

		/**
		 * The meta object literal for the '<em><b>Content Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTHEADER__CONTENT_VERSION = eINSTANCE.getDOCUMENTHEADER_ContentVersion();

		/**
		 * The meta object literal for the '<em><b>Content Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTHEADER__CONTENT_DATE = eINSTANCE.getDOCUMENTHEADER_ContentDate();

		/**
		 * The meta object literal for the '<em><b>Content Model Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTHEADER__CONTENT_MODEL_TYPE = eINSTANCE.getDOCUMENTHEADER_ContentModelType();

		/**
		 * The meta object literal for the '<em><b>Originating System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTHEADER__ORIGINATING_SYSTEM = eINSTANCE.getDOCUMENTHEADER_OriginatingSystem();

		/**
		 * The meta object literal for the '<em><b>Creator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTHEADER__CREATOR = eINSTANCE.getDOCUMENTHEADER_Creator();

		/**
		 * The meta object literal for the '<em><b>Authorisation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTHEADER__AUTHORISATION = eINSTANCE.getDOCUMENTHEADER_Authorisation();

		/**
		 * The meta object literal for the '<em><b>Content Identification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTHEADER__CONTENT_IDENTIFICATION = eINSTANCE.getDOCUMENTHEADER_ContentIdentification();

		/**
		 * The meta object literal for the '<em><b>Conversation Identification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTHEADER__CONVERSATION_IDENTIFICATION = eINSTANCE.getDOCUMENTHEADER_ConversationIdentification();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTHEADER__MESSAGE = eINSTANCE.getDOCUMENTHEADER_Message();

		/**
		 * The meta object literal for the '<em><b>In Reply To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTHEADER__IN_REPLY_TO = eINSTANCE.getDOCUMENTHEADER_InReplyTo();

		/**
		 * The meta object literal for the '<em><b>Content Descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTHEADER__CONTENT_DESCRIPTIONS = eINSTANCE.getDOCUMENTHEADER_ContentDescriptions();

		/**
		 * The meta object literal for the '<em><b>Content Language</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTHEADER__CONTENT_LANGUAGE = eINSTANCE.getDOCUMENTHEADER_ContentLanguage();

		/**
		 * The meta object literal for the '{@link eclassxmlschemaheader_2_0Simplified.impl.MESSAGEImpl <em>MESSAGE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eclassxmlschemaheader_2_0Simplified.impl.MESSAGEImpl
		 * @see eclassxmlschemaheader_2_0Simplified.impl.Eclassxmlschemaheader_2_0SimplifiedPackageImpl#getMESSAGE()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMESSAGE();

		/**
		 * The meta object literal for the '<em><b>Identification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__IDENTIFICATION = eINSTANCE.getMESSAGE_Identification();

		/**
		 * The meta object literal for the '<em><b>Sender</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__SENDER = eINSTANCE.getMESSAGE_Sender();

		/**
		 * The meta object literal for the '<em><b>Recipient</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__RECIPIENT = eINSTANCE.getMESSAGE_Recipient();

	}

} //Eclassxmlschemaheader_2_0SimplifiedPackage
