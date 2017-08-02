/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;

import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.HEADER;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.INFORMATION;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.LANGUAGE;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.LIBRARYIIMIDENTIFICATION;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SUPPORTEDVEP;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HEADER</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.HEADERImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.HEADERImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.HEADERImpl#getName <em>Name</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.HEADERImpl#getDateTimeStamp <em>Date Time Stamp</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.HEADERImpl#getAuthors <em>Authors</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.HEADERImpl#getOrganisations <em>Organisations</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.HEADERImpl#getPreProcessorVersion <em>Pre Processor Version</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.HEADERImpl#getOriginatingSystem <em>Originating System</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.HEADERImpl#getAuthorisation <em>Authorisation</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.HEADERImpl#getId <em>Id</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.HEADERImpl#getGlobalLanguage <em>Global Language</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.HEADERImpl#getOntomlInformation <em>Ontoml Information</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.HEADERImpl#getOntomlStructure <em>Ontoml Structure</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.HEADERImpl#getSupportedVep <em>Supported Vep</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HEADERImpl extends MinimalEObjectImpl.Container implements HEADER {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateTimeStamp() <em>Date Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_TIME_STAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateTimeStamp() <em>Date Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected String dateTimeStamp = DATE_TIME_STAMP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAuthors() <em>Authors</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthors()
	 * @generated
	 * @ordered
	 */
	protected EList<String> authors;

	/**
	 * The cached value of the '{@link #getOrganisations() <em>Organisations</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganisations()
	 * @generated
	 * @ordered
	 */
	protected EList<String> organisations;

	/**
	 * The default value of the '{@link #getPreProcessorVersion() <em>Pre Processor Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreProcessorVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String PRE_PROCESSOR_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreProcessorVersion() <em>Pre Processor Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreProcessorVersion()
	 * @generated
	 * @ordered
	 */
	protected String preProcessorVersion = PRE_PROCESSOR_VERSION_EDEFAULT;

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
	 * The default value of the '{@link #getAuthorisation() <em>Authorisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorisation()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHORISATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthorisation() <em>Authorisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorisation()
	 * @generated
	 * @ordered
	 */
	protected String authorisation = AUTHORISATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGlobalLanguage() <em>Global Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalLanguage()
	 * @generated
	 * @ordered
	 */
	protected LANGUAGE globalLanguage;

	/**
	 * The cached value of the '{@link #getOntomlInformation() <em>Ontoml Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOntomlInformation()
	 * @generated
	 * @ordered
	 */
	protected INFORMATION ontomlInformation;

	/**
	 * The cached value of the '{@link #getOntomlStructure() <em>Ontoml Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOntomlStructure()
	 * @generated
	 * @ordered
	 */
	protected LIBRARYIIMIDENTIFICATION ontomlStructure;

	/**
	 * The cached value of the '{@link #getSupportedVep() <em>Supported Vep</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedVep()
	 * @generated
	 * @ordered
	 */
	protected SUPPORTEDVEP supportedVep;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HEADERImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.HEADER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDateTimeStamp() {
		return dateTimeStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateTimeStamp(String newDateTimeStamp) {
		String oldDateTimeStamp = dateTimeStamp;
		dateTimeStamp = newDateTimeStamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__DATE_TIME_STAMP, oldDateTimeStamp, dateTimeStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAuthors() {
		if (authors == null) {
			authors = new EDataTypeEList<String>(String.class, this, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__AUTHORS);
		}
		return authors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getOrganisations() {
		if (organisations == null) {
			organisations = new EDataTypeEList<String>(String.class, this, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__ORGANISATIONS);
		}
		return organisations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPreProcessorVersion() {
		return preProcessorVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreProcessorVersion(String newPreProcessorVersion) {
		String oldPreProcessorVersion = preProcessorVersion;
		preProcessorVersion = newPreProcessorVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__PRE_PROCESSOR_VERSION, oldPreProcessorVersion, preProcessorVersion));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__ORIGINATING_SYSTEM, oldOriginatingSystem, originatingSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthorisation() {
		return authorisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthorisation(String newAuthorisation) {
		String oldAuthorisation = authorisation;
		authorisation = newAuthorisation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__AUTHORISATION, oldAuthorisation, authorisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LANGUAGE getGlobalLanguage() {
		return globalLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlobalLanguage(LANGUAGE newGlobalLanguage, NotificationChain msgs) {
		LANGUAGE oldGlobalLanguage = globalLanguage;
		globalLanguage = newGlobalLanguage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__GLOBAL_LANGUAGE, oldGlobalLanguage, newGlobalLanguage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalLanguage(LANGUAGE newGlobalLanguage) {
		if (newGlobalLanguage != globalLanguage) {
			NotificationChain msgs = null;
			if (globalLanguage != null)
				msgs = ((InternalEObject)globalLanguage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__GLOBAL_LANGUAGE, null, msgs);
			if (newGlobalLanguage != null)
				msgs = ((InternalEObject)newGlobalLanguage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__GLOBAL_LANGUAGE, null, msgs);
			msgs = basicSetGlobalLanguage(newGlobalLanguage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__GLOBAL_LANGUAGE, newGlobalLanguage, newGlobalLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INFORMATION getOntomlInformation() {
		return ontomlInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOntomlInformation(INFORMATION newOntomlInformation, NotificationChain msgs) {
		INFORMATION oldOntomlInformation = ontomlInformation;
		ontomlInformation = newOntomlInformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__ONTOML_INFORMATION, oldOntomlInformation, newOntomlInformation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOntomlInformation(INFORMATION newOntomlInformation) {
		if (newOntomlInformation != ontomlInformation) {
			NotificationChain msgs = null;
			if (ontomlInformation != null)
				msgs = ((InternalEObject)ontomlInformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__ONTOML_INFORMATION, null, msgs);
			if (newOntomlInformation != null)
				msgs = ((InternalEObject)newOntomlInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__ONTOML_INFORMATION, null, msgs);
			msgs = basicSetOntomlInformation(newOntomlInformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__ONTOML_INFORMATION, newOntomlInformation, newOntomlInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LIBRARYIIMIDENTIFICATION getOntomlStructure() {
		return ontomlStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOntomlStructure(LIBRARYIIMIDENTIFICATION newOntomlStructure, NotificationChain msgs) {
		LIBRARYIIMIDENTIFICATION oldOntomlStructure = ontomlStructure;
		ontomlStructure = newOntomlStructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__ONTOML_STRUCTURE, oldOntomlStructure, newOntomlStructure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOntomlStructure(LIBRARYIIMIDENTIFICATION newOntomlStructure) {
		if (newOntomlStructure != ontomlStructure) {
			NotificationChain msgs = null;
			if (ontomlStructure != null)
				msgs = ((InternalEObject)ontomlStructure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__ONTOML_STRUCTURE, null, msgs);
			if (newOntomlStructure != null)
				msgs = ((InternalEObject)newOntomlStructure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__ONTOML_STRUCTURE, null, msgs);
			msgs = basicSetOntomlStructure(newOntomlStructure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__ONTOML_STRUCTURE, newOntomlStructure, newOntomlStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SUPPORTEDVEP getSupportedVep() {
		return supportedVep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupportedVep(SUPPORTEDVEP newSupportedVep, NotificationChain msgs) {
		SUPPORTEDVEP oldSupportedVep = supportedVep;
		supportedVep = newSupportedVep;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__SUPPORTED_VEP, oldSupportedVep, newSupportedVep);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupportedVep(SUPPORTEDVEP newSupportedVep) {
		if (newSupportedVep != supportedVep) {
			NotificationChain msgs = null;
			if (supportedVep != null)
				msgs = ((InternalEObject)supportedVep).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__SUPPORTED_VEP, null, msgs);
			if (newSupportedVep != null)
				msgs = ((InternalEObject)newSupportedVep).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__SUPPORTED_VEP, null, msgs);
			msgs = basicSetSupportedVep(newSupportedVep, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__SUPPORTED_VEP, newSupportedVep, newSupportedVep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__GLOBAL_LANGUAGE:
				return basicSetGlobalLanguage(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__ONTOML_INFORMATION:
				return basicSetOntomlInformation(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__ONTOML_STRUCTURE:
				return basicSetOntomlStructure(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__SUPPORTED_VEP:
				return basicSetSupportedVep(null, msgs);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__DESCRIPTION:
				return getDescription();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__VERSION:
				return getVersion();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__NAME:
				return getName();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__DATE_TIME_STAMP:
				return getDateTimeStamp();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__AUTHORS:
				return getAuthors();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__ORGANISATIONS:
				return getOrganisations();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__PRE_PROCESSOR_VERSION:
				return getPreProcessorVersion();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__ORIGINATING_SYSTEM:
				return getOriginatingSystem();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__AUTHORISATION:
				return getAuthorisation();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__ID:
				return getId();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__GLOBAL_LANGUAGE:
				return getGlobalLanguage();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__ONTOML_INFORMATION:
				return getOntomlInformation();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__ONTOML_STRUCTURE:
				return getOntomlStructure();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__SUPPORTED_VEP:
				return getSupportedVep();
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__VERSION:
				setVersion((String)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__NAME:
				setName((String)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__DATE_TIME_STAMP:
				setDateTimeStamp((String)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__AUTHORS:
				getAuthors().clear();
				getAuthors().addAll((Collection<? extends String>)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__ORGANISATIONS:
				getOrganisations().clear();
				getOrganisations().addAll((Collection<? extends String>)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__PRE_PROCESSOR_VERSION:
				setPreProcessorVersion((String)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__ORIGINATING_SYSTEM:
				setOriginatingSystem((String)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__AUTHORISATION:
				setAuthorisation((String)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__ID:
				setId((String)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__GLOBAL_LANGUAGE:
				setGlobalLanguage((LANGUAGE)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__ONTOML_INFORMATION:
				setOntomlInformation((INFORMATION)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__ONTOML_STRUCTURE:
				setOntomlStructure((LIBRARYIIMIDENTIFICATION)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__SUPPORTED_VEP:
				setSupportedVep((SUPPORTEDVEP)newValue);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__DATE_TIME_STAMP:
				setDateTimeStamp(DATE_TIME_STAMP_EDEFAULT);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__AUTHORS:
				getAuthors().clear();
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__ORGANISATIONS:
				getOrganisations().clear();
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__PRE_PROCESSOR_VERSION:
				setPreProcessorVersion(PRE_PROCESSOR_VERSION_EDEFAULT);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__ORIGINATING_SYSTEM:
				setOriginatingSystem(ORIGINATING_SYSTEM_EDEFAULT);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__AUTHORISATION:
				setAuthorisation(AUTHORISATION_EDEFAULT);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__ID:
				setId(ID_EDEFAULT);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__GLOBAL_LANGUAGE:
				setGlobalLanguage((LANGUAGE)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__ONTOML_INFORMATION:
				setOntomlInformation((INFORMATION)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__ONTOML_STRUCTURE:
				setOntomlStructure((LIBRARYIIMIDENTIFICATION)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__SUPPORTED_VEP:
				setSupportedVep((SUPPORTEDVEP)null);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__DATE_TIME_STAMP:
				return DATE_TIME_STAMP_EDEFAULT == null ? dateTimeStamp != null : !DATE_TIME_STAMP_EDEFAULT.equals(dateTimeStamp);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__AUTHORS:
				return authors != null && !authors.isEmpty();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__ORGANISATIONS:
				return organisations != null && !organisations.isEmpty();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__PRE_PROCESSOR_VERSION:
				return PRE_PROCESSOR_VERSION_EDEFAULT == null ? preProcessorVersion != null : !PRE_PROCESSOR_VERSION_EDEFAULT.equals(preProcessorVersion);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__ORIGINATING_SYSTEM:
				return ORIGINATING_SYSTEM_EDEFAULT == null ? originatingSystem != null : !ORIGINATING_SYSTEM_EDEFAULT.equals(originatingSystem);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__AUTHORISATION:
				return AUTHORISATION_EDEFAULT == null ? authorisation != null : !AUTHORISATION_EDEFAULT.equals(authorisation);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__GLOBAL_LANGUAGE:
				return globalLanguage != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__ONTOML_INFORMATION:
				return ontomlInformation != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__ONTOML_STRUCTURE:
				return ontomlStructure != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.HEADER__SUPPORTED_VEP:
				return supportedVep != null;
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
		result.append(" (description: ");
		result.append(description);
		result.append(", version: ");
		result.append(version);
		result.append(", name: ");
		result.append(name);
		result.append(", dateTimeStamp: ");
		result.append(dateTimeStamp);
		result.append(", authors: ");
		result.append(authors);
		result.append(", organisations: ");
		result.append(organisations);
		result.append(", preProcessorVersion: ");
		result.append(preProcessorVersion);
		result.append(", originatingSystem: ");
		result.append(originatingSystem);
		result.append(", authorisation: ");
		result.append(authorisation);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //HEADERImpl
