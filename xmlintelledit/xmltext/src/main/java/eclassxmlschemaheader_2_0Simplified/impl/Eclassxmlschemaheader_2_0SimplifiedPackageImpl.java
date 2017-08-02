/**
 */
package eclassxmlschemaheader_2_0Simplified.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import eclassxmlschemacommon_2_0Simplified.Eclassxmlschemacommon_2_0SimplifiedPackage;
import eclassxmlschemacommon_2_0Simplified.impl.Eclassxmlschemacommon_2_0SimplifiedPackageImpl;
import eclassxmlschemadictionary_2_0Simplified.Eclassxmlschemadictionary_2_0SimplifiedPackage;
import eclassxmlschemadictionary_2_0Simplified.impl.Eclassxmlschemadictionary_2_0SimplifiedPackageImpl;
import eclassxmlschemaheader_2_0Simplified.Eclassxmlschemaheader_2_0SimplifiedFactory;
import eclassxmlschemaheader_2_0Simplified.Eclassxmlschemaheader_2_0SimplifiedPackage;
import eclassxmlschemaheader_2_0Simplified.util.Eclassxmlschemaheader_2_0SimplifiedValidator;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackageImpl;
import isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage;
import isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackageImpl;
import xontomlextensionsschemacoreSimplified.XontomlextensionsschemacoreSimplifiedPackage;
import xontomlextensionsschemacoreSimplified.impl.XontomlextensionsschemacoreSimplifiedPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Eclassxmlschemaheader_2_0SimplifiedPackageImpl extends EPackageImpl implements Eclassxmlschemaheader_2_0SimplifiedPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentheaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see eclassxmlschemaheader_2_0Simplified.Eclassxmlschemaheader_2_0SimplifiedPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Eclassxmlschemaheader_2_0SimplifiedPackageImpl() {
		super(eNS_URI, Eclassxmlschemaheader_2_0SimplifiedFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Eclassxmlschemaheader_2_0SimplifiedPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Eclassxmlschemaheader_2_0SimplifiedPackage init() {
		if (isInited) return (Eclassxmlschemaheader_2_0SimplifiedPackage)EPackage.Registry.INSTANCE.getEPackage(Eclassxmlschemaheader_2_0SimplifiedPackage.eNS_URI);

		// Obtain or create and register package
		Eclassxmlschemaheader_2_0SimplifiedPackageImpl theEclassxmlschemaheader_2_0SimplifiedPackage = (Eclassxmlschemaheader_2_0SimplifiedPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Eclassxmlschemaheader_2_0SimplifiedPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Eclassxmlschemaheader_2_0SimplifiedPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		Eclassxmlschemadictionary_2_0SimplifiedPackageImpl theEclassxmlschemadictionary_2_0SimplifiedPackage = (Eclassxmlschemadictionary_2_0SimplifiedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Eclassxmlschemadictionary_2_0SimplifiedPackage.eNS_URI) instanceof Eclassxmlschemadictionary_2_0SimplifiedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Eclassxmlschemadictionary_2_0SimplifiedPackage.eNS_URI) : Eclassxmlschemadictionary_2_0SimplifiedPackage.eINSTANCE);
		Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackageImpl theIsostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage = (Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.eNS_URI) instanceof Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.eNS_URI) : Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.eINSTANCE);
		XontomlextensionsschemacoreSimplifiedPackageImpl theXontomlextensionsschemacoreSimplifiedPackage = (XontomlextensionsschemacoreSimplifiedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XontomlextensionsschemacoreSimplifiedPackage.eNS_URI) instanceof XontomlextensionsschemacoreSimplifiedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XontomlextensionsschemacoreSimplifiedPackage.eNS_URI) : XontomlextensionsschemacoreSimplifiedPackage.eINSTANCE);
		Eclassxmlschemacommon_2_0SimplifiedPackageImpl theEclassxmlschemacommon_2_0SimplifiedPackage = (Eclassxmlschemacommon_2_0SimplifiedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Eclassxmlschemacommon_2_0SimplifiedPackage.eNS_URI) instanceof Eclassxmlschemacommon_2_0SimplifiedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Eclassxmlschemacommon_2_0SimplifiedPackage.eNS_URI) : Eclassxmlschemacommon_2_0SimplifiedPackage.eINSTANCE);
		Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackageImpl theIsostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage = (Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.eNS_URI) instanceof Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.eNS_URI) : Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.eINSTANCE);

		// Create package meta-data objects
		theEclassxmlschemaheader_2_0SimplifiedPackage.createPackageContents();
		theEclassxmlschemadictionary_2_0SimplifiedPackage.createPackageContents();
		theIsostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.createPackageContents();
		theXontomlextensionsschemacoreSimplifiedPackage.createPackageContents();
		theEclassxmlschemacommon_2_0SimplifiedPackage.createPackageContents();
		theIsostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.createPackageContents();

		// Initialize created meta-data
		theEclassxmlschemaheader_2_0SimplifiedPackage.initializePackageContents();
		theEclassxmlschemadictionary_2_0SimplifiedPackage.initializePackageContents();
		theIsostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.initializePackageContents();
		theXontomlextensionsschemacoreSimplifiedPackage.initializePackageContents();
		theEclassxmlschemacommon_2_0SimplifiedPackage.initializePackageContents();
		theIsostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theEclassxmlschemaheader_2_0SimplifiedPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return Eclassxmlschemaheader_2_0SimplifiedValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theEclassxmlschemaheader_2_0SimplifiedPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Eclassxmlschemaheader_2_0SimplifiedPackage.eNS_URI, theEclassxmlschemaheader_2_0SimplifiedPackage);
		return theEclassxmlschemaheader_2_0SimplifiedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDOCUMENTHEADER() {
		return documentheaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDOCUMENTHEADER_SchemaVersion() {
		return (EAttribute)documentheaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDOCUMENTHEADER_GeneratorVersion() {
		return (EAttribute)documentheaderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDOCUMENTHEADER_GenerationDate() {
		return (EAttribute)documentheaderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDOCUMENTHEADER_ContentVersion() {
		return (EAttribute)documentheaderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDOCUMENTHEADER_ContentDate() {
		return (EAttribute)documentheaderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDOCUMENTHEADER_ContentModelType() {
		return (EAttribute)documentheaderEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDOCUMENTHEADER_OriginatingSystem() {
		return (EAttribute)documentheaderEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDOCUMENTHEADER_Creator() {
		return (EReference)documentheaderEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDOCUMENTHEADER_Authorisation() {
		return (EReference)documentheaderEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDOCUMENTHEADER_ContentIdentification() {
		return (EReference)documentheaderEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDOCUMENTHEADER_ConversationIdentification() {
		return (EReference)documentheaderEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDOCUMENTHEADER_Message() {
		return (EReference)documentheaderEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDOCUMENTHEADER_InReplyTo() {
		return (EReference)documentheaderEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDOCUMENTHEADER_ContentDescriptions() {
		return (EReference)documentheaderEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDOCUMENTHEADER_ContentLanguage() {
		return (EReference)documentheaderEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMESSAGE() {
		return messageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMESSAGE_Identification() {
		return (EReference)messageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMESSAGE_Sender() {
		return (EReference)messageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMESSAGE_Recipient() {
		return (EReference)messageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Eclassxmlschemaheader_2_0SimplifiedFactory getEclassxmlschemaheader_2_0SimplifiedFactory() {
		return (Eclassxmlschemaheader_2_0SimplifiedFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		documentheaderEClass = createEClass(DOCUMENTHEADER);
		createEAttribute(documentheaderEClass, DOCUMENTHEADER__SCHEMA_VERSION);
		createEAttribute(documentheaderEClass, DOCUMENTHEADER__GENERATOR_VERSION);
		createEAttribute(documentheaderEClass, DOCUMENTHEADER__GENERATION_DATE);
		createEAttribute(documentheaderEClass, DOCUMENTHEADER__CONTENT_VERSION);
		createEAttribute(documentheaderEClass, DOCUMENTHEADER__CONTENT_DATE);
		createEAttribute(documentheaderEClass, DOCUMENTHEADER__CONTENT_MODEL_TYPE);
		createEAttribute(documentheaderEClass, DOCUMENTHEADER__ORIGINATING_SYSTEM);
		createEReference(documentheaderEClass, DOCUMENTHEADER__CREATOR);
		createEReference(documentheaderEClass, DOCUMENTHEADER__AUTHORISATION);
		createEReference(documentheaderEClass, DOCUMENTHEADER__CONTENT_IDENTIFICATION);
		createEReference(documentheaderEClass, DOCUMENTHEADER__CONVERSATION_IDENTIFICATION);
		createEReference(documentheaderEClass, DOCUMENTHEADER__MESSAGE);
		createEReference(documentheaderEClass, DOCUMENTHEADER__IN_REPLY_TO);
		createEReference(documentheaderEClass, DOCUMENTHEADER__CONTENT_DESCRIPTIONS);
		createEReference(documentheaderEClass, DOCUMENTHEADER__CONTENT_LANGUAGE);

		messageEClass = createEClass(MESSAGE);
		createEReference(messageEClass, MESSAGE__IDENTIFICATION);
		createEReference(messageEClass, MESSAGE__SENDER);
		createEReference(messageEClass, MESSAGE__RECIPIENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		Eclassxmlschemacommon_2_0SimplifiedPackage theEclassxmlschemacommon_2_0SimplifiedPackage = (Eclassxmlschemacommon_2_0SimplifiedPackage)EPackage.Registry.INSTANCE.getEPackage(Eclassxmlschemacommon_2_0SimplifiedPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(documentheaderEClass, eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER.class, "DOCUMENTHEADER", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDOCUMENTHEADER_SchemaVersion(), ecorePackage.getEString(), "schemaVersion", null, 1, 1, eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDOCUMENTHEADER_GeneratorVersion(), ecorePackage.getEString(), "generatorVersion", null, 1, 1, eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDOCUMENTHEADER_GenerationDate(), ecorePackage.getEString(), "generationDate", null, 1, 1, eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDOCUMENTHEADER_ContentVersion(), ecorePackage.getEString(), "contentVersion", null, 0, 1, eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDOCUMENTHEADER_ContentDate(), ecorePackage.getEString(), "contentDate", null, 0, 1, eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDOCUMENTHEADER_ContentModelType(), theEclassxmlschemacommon_2_0SimplifiedPackage.getCONTENTMODELType(), "contentModelType", null, 0, 1, eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDOCUMENTHEADER_OriginatingSystem(), ecorePackage.getEString(), "originatingSystem", null, 1, 1, eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDOCUMENTHEADER_Creator(), theEclassxmlschemacommon_2_0SimplifiedPackage.getPARTY(), null, "creator", null, 1, 1, eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDOCUMENTHEADER_Authorisation(), theEclassxmlschemacommon_2_0SimplifiedPackage.getPARTY(), null, "authorisation", null, 0, 1, eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDOCUMENTHEADER_ContentIdentification(), theEclassxmlschemacommon_2_0SimplifiedPackage.getIDENTIFICATION(), null, "contentIdentification", null, 0, 1, eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDOCUMENTHEADER_ConversationIdentification(), theEclassxmlschemacommon_2_0SimplifiedPackage.getIDENTIFICATION(), null, "conversationIdentification", null, 0, 1, eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDOCUMENTHEADER_Message(), this.getMESSAGE(), null, "message", null, 0, 1, eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDOCUMENTHEADER_InReplyTo(), this.getMESSAGE(), null, "inReplyTo", null, 0, 1, eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDOCUMENTHEADER_ContentDescriptions(), theEclassxmlschemacommon_2_0SimplifiedPackage.getTYPEDSTRING(), null, "contentDescriptions", null, 0, -1, eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDOCUMENTHEADER_ContentLanguage(), theEclassxmlschemacommon_2_0SimplifiedPackage.getLOCALE(), null, "contentLanguage", null, 1, 1, eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageEClass, eclassxmlschemaheader_2_0Simplified.MESSAGE.class, "MESSAGE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMESSAGE_Identification(), theEclassxmlschemacommon_2_0SimplifiedPackage.getIDENTIFICATION(), null, "identification", null, 1, 1, eclassxmlschemaheader_2_0Simplified.MESSAGE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMESSAGE_Sender(), theEclassxmlschemacommon_2_0SimplifiedPackage.getPARTY(), null, "sender", null, 1, 1, eclassxmlschemaheader_2_0Simplified.MESSAGE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMESSAGE_Recipient(), theEclassxmlschemacommon_2_0SimplifiedPackage.getPARTY(), null, "recipient", null, 1, 1, eclassxmlschemaheader_2_0Simplified.MESSAGE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (documentheaderEClass, 
		   source, 
		   new String[] {
			 "constraints", "patternSchemaVersion"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (documentheaderEClass, 
		   source, 
		   new String[] {
			 "patternSchemaVersion", "self.schemaVersion.matches(\'eCl@ss XML 2.0\')"
		   });
	}

} //Eclassxmlschemaheader_2_0SimplifiedPackageImpl
