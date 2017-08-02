/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASS;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASSCONSTANTVALUES;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASSREFERENCE;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CONSTRAINTS;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DATATYPESREFERENCE;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DOCUMENTSREFERENCE;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.GEOMETRICCONTEXT;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.GEOMETRICUNITCONTEXT;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.GRAPHICS;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.KEYWORD;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.LANGUAGE;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PREFERREDNAME;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PROPERTIESREFERENCE;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SHORTNAME;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SOURCEDOCUMENT;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SYNONYMOUSNAME;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.TEXT;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.TRANSLATION;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CLASS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.CLASSImpl#getDateOfOriginalDefinition <em>Date Of Original Definition</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.CLASSImpl#getDateOfCurrentVersion <em>Date Of Current Version</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.CLASSImpl#getDateOfCurrentRevision <em>Date Of Current Revision</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.CLASSImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.CLASSImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.CLASSImpl#isIsDeprecated <em>Is Deprecated</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.CLASSImpl#getHierarchicalPosition <em>Hierarchical Position</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.CLASSImpl#getId <em>Id</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.CLASSImpl#getTranslation <em>Translation</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.CLASSImpl#getSourceLanguage <em>Source Language</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.CLASSImpl#getIsDeprecatedInterpretation <em>Is Deprecated Interpretation</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.CLASSImpl#getPreferredName <em>Preferred Name</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.CLASSImpl#getSynonymousNames <em>Synonymous Names</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.CLASSImpl#getShortName <em>Short Name</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.CLASSImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.CLASSImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.CLASSImpl#getSourceDocOfDefinition <em>Source Doc Of Definition</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.CLASSImpl#getNote <em>Note</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.CLASSImpl#getRemark <em>Remark</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.CLASSImpl#getItsSuperclass <em>Its Superclass</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.CLASSImpl#getDescribedBy <em>Described By</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.CLASSImpl#getDefinedTypes <em>Defined Types</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.CLASSImpl#getDefinedDocuments <em>Defined Documents</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.CLASSImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.CLASSImpl#getKeywords <em>Keywords</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.CLASSImpl#getSubClassProperties <em>Sub Class Properties</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.CLASSImpl#getClassConstantValues <em>Class Constant Values</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.CLASSImpl#getGeometricRepresentationContext <em>Geometric Representation Context</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.CLASSImpl#getGlobalUnitContext <em>Global Unit Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CLASSImpl extends MinimalEObjectImpl.Container implements CLASS {
	/**
	 * The default value of the '{@link #getDateOfOriginalDefinition() <em>Date Of Original Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfOriginalDefinition()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_OF_ORIGINAL_DEFINITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateOfOriginalDefinition() <em>Date Of Original Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfOriginalDefinition()
	 * @generated
	 * @ordered
	 */
	protected String dateOfOriginalDefinition = DATE_OF_ORIGINAL_DEFINITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateOfCurrentVersion() <em>Date Of Current Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfCurrentVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_OF_CURRENT_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateOfCurrentVersion() <em>Date Of Current Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfCurrentVersion()
	 * @generated
	 * @ordered
	 */
	protected String dateOfCurrentVersion = DATE_OF_CURRENT_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateOfCurrentRevision() <em>Date Of Current Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfCurrentRevision()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_OF_CURRENT_REVISION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateOfCurrentRevision() <em>Date Of Current Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfCurrentRevision()
	 * @generated
	 * @ordered
	 */
	protected String dateOfCurrentRevision = DATE_OF_CURRENT_REVISION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRevision() <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevision()
	 * @generated
	 * @ordered
	 */
	protected static final String REVISION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRevision() <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevision()
	 * @generated
	 * @ordered
	 */
	protected String revision = REVISION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected String status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsDeprecated() <em>Is Deprecated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDeprecated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DEPRECATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDeprecated() <em>Is Deprecated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDeprecated()
	 * @generated
	 * @ordered
	 */
	protected boolean isDeprecated = IS_DEPRECATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getHierarchicalPosition() <em>Hierarchical Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHierarchicalPosition()
	 * @generated
	 * @ordered
	 */
	protected static final String HIERARCHICAL_POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHierarchicalPosition() <em>Hierarchical Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHierarchicalPosition()
	 * @generated
	 * @ordered
	 */
	protected String hierarchicalPosition = HIERARCHICAL_POSITION_EDEFAULT;

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
	 * The cached value of the '{@link #getTranslation() <em>Translation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslation()
	 * @generated
	 * @ordered
	 */
	protected TRANSLATION translation;

	/**
	 * The cached value of the '{@link #getSourceLanguage() <em>Source Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLanguage()
	 * @generated
	 * @ordered
	 */
	protected LANGUAGE sourceLanguage;

	/**
	 * The cached value of the '{@link #getIsDeprecatedInterpretation() <em>Is Deprecated Interpretation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDeprecatedInterpretation()
	 * @generated
	 * @ordered
	 */
	protected TEXT isDeprecatedInterpretation;

	/**
	 * The cached value of the '{@link #getPreferredName() <em>Preferred Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferredName()
	 * @generated
	 * @ordered
	 */
	protected PREFERREDNAME preferredName;

	/**
	 * The cached value of the '{@link #getSynonymousNames() <em>Synonymous Names</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynonymousNames()
	 * @generated
	 * @ordered
	 */
	protected SYNONYMOUSNAME synonymousNames;

	/**
	 * The cached value of the '{@link #getShortName() <em>Short Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortName()
	 * @generated
	 * @ordered
	 */
	protected SHORTNAME shortName;

	/**
	 * The cached value of the '{@link #getIcon() <em>Icon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected GRAPHICS icon;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected TEXT definition;

	/**
	 * The cached value of the '{@link #getSourceDocOfDefinition() <em>Source Doc Of Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceDocOfDefinition()
	 * @generated
	 * @ordered
	 */
	protected SOURCEDOCUMENT sourceDocOfDefinition;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected TEXT note;

	/**
	 * The cached value of the '{@link #getRemark() <em>Remark</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemark()
	 * @generated
	 * @ordered
	 */
	protected TEXT remark;

	/**
	 * The cached value of the '{@link #getItsSuperclass() <em>Its Superclass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItsSuperclass()
	 * @generated
	 * @ordered
	 */
	protected CLASSREFERENCE itsSuperclass;

	/**
	 * The cached value of the '{@link #getDescribedBy() <em>Described By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescribedBy()
	 * @generated
	 * @ordered
	 */
	protected PROPERTIESREFERENCE describedBy;

	/**
	 * The cached value of the '{@link #getDefinedTypes() <em>Defined Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinedTypes()
	 * @generated
	 * @ordered
	 */
	protected DATATYPESREFERENCE definedTypes;

	/**
	 * The cached value of the '{@link #getDefinedDocuments() <em>Defined Documents</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinedDocuments()
	 * @generated
	 * @ordered
	 */
	protected DOCUMENTSREFERENCE definedDocuments;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected CONSTRAINTS constraints;

	/**
	 * The cached value of the '{@link #getKeywords() <em>Keywords</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeywords()
	 * @generated
	 * @ordered
	 */
	protected KEYWORD keywords;

	/**
	 * The cached value of the '{@link #getSubClassProperties() <em>Sub Class Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubClassProperties()
	 * @generated
	 * @ordered
	 */
	protected PROPERTIESREFERENCE subClassProperties;

	/**
	 * The cached value of the '{@link #getClassConstantValues() <em>Class Constant Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassConstantValues()
	 * @generated
	 * @ordered
	 */
	protected CLASSCONSTANTVALUES classConstantValues;

	/**
	 * The cached value of the '{@link #getGeometricRepresentationContext() <em>Geometric Representation Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometricRepresentationContext()
	 * @generated
	 * @ordered
	 */
	protected GEOMETRICCONTEXT geometricRepresentationContext;

	/**
	 * The cached value of the '{@link #getGlobalUnitContext() <em>Global Unit Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalUnitContext()
	 * @generated
	 * @ordered
	 */
	protected GEOMETRICUNITCONTEXT globalUnitContext;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CLASSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDateOfOriginalDefinition() {
		return dateOfOriginalDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateOfOriginalDefinition(String newDateOfOriginalDefinition) {
		String oldDateOfOriginalDefinition = dateOfOriginalDefinition;
		dateOfOriginalDefinition = newDateOfOriginalDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__DATE_OF_ORIGINAL_DEFINITION, oldDateOfOriginalDefinition, dateOfOriginalDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDateOfCurrentVersion() {
		return dateOfCurrentVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateOfCurrentVersion(String newDateOfCurrentVersion) {
		String oldDateOfCurrentVersion = dateOfCurrentVersion;
		dateOfCurrentVersion = newDateOfCurrentVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__DATE_OF_CURRENT_VERSION, oldDateOfCurrentVersion, dateOfCurrentVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDateOfCurrentRevision() {
		return dateOfCurrentRevision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateOfCurrentRevision(String newDateOfCurrentRevision) {
		String oldDateOfCurrentRevision = dateOfCurrentRevision;
		dateOfCurrentRevision = newDateOfCurrentRevision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__DATE_OF_CURRENT_REVISION, oldDateOfCurrentRevision, dateOfCurrentRevision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRevision() {
		return revision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevision(String newRevision) {
		String oldRevision = revision;
		revision = newRevision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__REVISION, oldRevision, revision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(String newStatus) {
		String oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDeprecated() {
		return isDeprecated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDeprecated(boolean newIsDeprecated) {
		boolean oldIsDeprecated = isDeprecated;
		isDeprecated = newIsDeprecated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__IS_DEPRECATED, oldIsDeprecated, isDeprecated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHierarchicalPosition() {
		return hierarchicalPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHierarchicalPosition(String newHierarchicalPosition) {
		String oldHierarchicalPosition = hierarchicalPosition;
		hierarchicalPosition = newHierarchicalPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__HIERARCHICAL_POSITION, oldHierarchicalPosition, hierarchicalPosition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRANSLATION getTranslation() {
		return translation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTranslation(TRANSLATION newTranslation, NotificationChain msgs) {
		TRANSLATION oldTranslation = translation;
		translation = newTranslation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__TRANSLATION, oldTranslation, newTranslation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTranslation(TRANSLATION newTranslation) {
		if (newTranslation != translation) {
			NotificationChain msgs = null;
			if (translation != null)
				msgs = ((InternalEObject)translation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__TRANSLATION, null, msgs);
			if (newTranslation != null)
				msgs = ((InternalEObject)newTranslation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__TRANSLATION, null, msgs);
			msgs = basicSetTranslation(newTranslation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__TRANSLATION, newTranslation, newTranslation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LANGUAGE getSourceLanguage() {
		return sourceLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceLanguage(LANGUAGE newSourceLanguage, NotificationChain msgs) {
		LANGUAGE oldSourceLanguage = sourceLanguage;
		sourceLanguage = newSourceLanguage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__SOURCE_LANGUAGE, oldSourceLanguage, newSourceLanguage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceLanguage(LANGUAGE newSourceLanguage) {
		if (newSourceLanguage != sourceLanguage) {
			NotificationChain msgs = null;
			if (sourceLanguage != null)
				msgs = ((InternalEObject)sourceLanguage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__SOURCE_LANGUAGE, null, msgs);
			if (newSourceLanguage != null)
				msgs = ((InternalEObject)newSourceLanguage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__SOURCE_LANGUAGE, null, msgs);
			msgs = basicSetSourceLanguage(newSourceLanguage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__SOURCE_LANGUAGE, newSourceLanguage, newSourceLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TEXT getIsDeprecatedInterpretation() {
		return isDeprecatedInterpretation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsDeprecatedInterpretation(TEXT newIsDeprecatedInterpretation, NotificationChain msgs) {
		TEXT oldIsDeprecatedInterpretation = isDeprecatedInterpretation;
		isDeprecatedInterpretation = newIsDeprecatedInterpretation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__IS_DEPRECATED_INTERPRETATION, oldIsDeprecatedInterpretation, newIsDeprecatedInterpretation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDeprecatedInterpretation(TEXT newIsDeprecatedInterpretation) {
		if (newIsDeprecatedInterpretation != isDeprecatedInterpretation) {
			NotificationChain msgs = null;
			if (isDeprecatedInterpretation != null)
				msgs = ((InternalEObject)isDeprecatedInterpretation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__IS_DEPRECATED_INTERPRETATION, null, msgs);
			if (newIsDeprecatedInterpretation != null)
				msgs = ((InternalEObject)newIsDeprecatedInterpretation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__IS_DEPRECATED_INTERPRETATION, null, msgs);
			msgs = basicSetIsDeprecatedInterpretation(newIsDeprecatedInterpretation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__IS_DEPRECATED_INTERPRETATION, newIsDeprecatedInterpretation, newIsDeprecatedInterpretation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PREFERREDNAME getPreferredName() {
		return preferredName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreferredName(PREFERREDNAME newPreferredName, NotificationChain msgs) {
		PREFERREDNAME oldPreferredName = preferredName;
		preferredName = newPreferredName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__PREFERRED_NAME, oldPreferredName, newPreferredName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreferredName(PREFERREDNAME newPreferredName) {
		if (newPreferredName != preferredName) {
			NotificationChain msgs = null;
			if (preferredName != null)
				msgs = ((InternalEObject)preferredName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__PREFERRED_NAME, null, msgs);
			if (newPreferredName != null)
				msgs = ((InternalEObject)newPreferredName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__PREFERRED_NAME, null, msgs);
			msgs = basicSetPreferredName(newPreferredName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__PREFERRED_NAME, newPreferredName, newPreferredName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SYNONYMOUSNAME getSynonymousNames() {
		return synonymousNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSynonymousNames(SYNONYMOUSNAME newSynonymousNames, NotificationChain msgs) {
		SYNONYMOUSNAME oldSynonymousNames = synonymousNames;
		synonymousNames = newSynonymousNames;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__SYNONYMOUS_NAMES, oldSynonymousNames, newSynonymousNames);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSynonymousNames(SYNONYMOUSNAME newSynonymousNames) {
		if (newSynonymousNames != synonymousNames) {
			NotificationChain msgs = null;
			if (synonymousNames != null)
				msgs = ((InternalEObject)synonymousNames).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__SYNONYMOUS_NAMES, null, msgs);
			if (newSynonymousNames != null)
				msgs = ((InternalEObject)newSynonymousNames).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__SYNONYMOUS_NAMES, null, msgs);
			msgs = basicSetSynonymousNames(newSynonymousNames, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__SYNONYMOUS_NAMES, newSynonymousNames, newSynonymousNames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SHORTNAME getShortName() {
		return shortName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShortName(SHORTNAME newShortName, NotificationChain msgs) {
		SHORTNAME oldShortName = shortName;
		shortName = newShortName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__SHORT_NAME, oldShortName, newShortName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShortName(SHORTNAME newShortName) {
		if (newShortName != shortName) {
			NotificationChain msgs = null;
			if (shortName != null)
				msgs = ((InternalEObject)shortName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__SHORT_NAME, null, msgs);
			if (newShortName != null)
				msgs = ((InternalEObject)newShortName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__SHORT_NAME, null, msgs);
			msgs = basicSetShortName(newShortName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__SHORT_NAME, newShortName, newShortName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GRAPHICS getIcon() {
		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIcon(GRAPHICS newIcon, NotificationChain msgs) {
		GRAPHICS oldIcon = icon;
		icon = newIcon;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__ICON, oldIcon, newIcon);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIcon(GRAPHICS newIcon) {
		if (newIcon != icon) {
			NotificationChain msgs = null;
			if (icon != null)
				msgs = ((InternalEObject)icon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__ICON, null, msgs);
			if (newIcon != null)
				msgs = ((InternalEObject)newIcon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__ICON, null, msgs);
			msgs = basicSetIcon(newIcon, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__ICON, newIcon, newIcon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TEXT getDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinition(TEXT newDefinition, NotificationChain msgs) {
		TEXT oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__DEFINITION, oldDefinition, newDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(TEXT newDefinition) {
		if (newDefinition != definition) {
			NotificationChain msgs = null;
			if (definition != null)
				msgs = ((InternalEObject)definition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__DEFINITION, null, msgs);
			if (newDefinition != null)
				msgs = ((InternalEObject)newDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__DEFINITION, null, msgs);
			msgs = basicSetDefinition(newDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__DEFINITION, newDefinition, newDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SOURCEDOCUMENT getSourceDocOfDefinition() {
		return sourceDocOfDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceDocOfDefinition(SOURCEDOCUMENT newSourceDocOfDefinition, NotificationChain msgs) {
		SOURCEDOCUMENT oldSourceDocOfDefinition = sourceDocOfDefinition;
		sourceDocOfDefinition = newSourceDocOfDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__SOURCE_DOC_OF_DEFINITION, oldSourceDocOfDefinition, newSourceDocOfDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceDocOfDefinition(SOURCEDOCUMENT newSourceDocOfDefinition) {
		if (newSourceDocOfDefinition != sourceDocOfDefinition) {
			NotificationChain msgs = null;
			if (sourceDocOfDefinition != null)
				msgs = ((InternalEObject)sourceDocOfDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__SOURCE_DOC_OF_DEFINITION, null, msgs);
			if (newSourceDocOfDefinition != null)
				msgs = ((InternalEObject)newSourceDocOfDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__SOURCE_DOC_OF_DEFINITION, null, msgs);
			msgs = basicSetSourceDocOfDefinition(newSourceDocOfDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__SOURCE_DOC_OF_DEFINITION, newSourceDocOfDefinition, newSourceDocOfDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TEXT getNote() {
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNote(TEXT newNote, NotificationChain msgs) {
		TEXT oldNote = note;
		note = newNote;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__NOTE, oldNote, newNote);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNote(TEXT newNote) {
		if (newNote != note) {
			NotificationChain msgs = null;
			if (note != null)
				msgs = ((InternalEObject)note).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__NOTE, null, msgs);
			if (newNote != null)
				msgs = ((InternalEObject)newNote).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__NOTE, null, msgs);
			msgs = basicSetNote(newNote, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__NOTE, newNote, newNote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TEXT getRemark() {
		return remark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemark(TEXT newRemark, NotificationChain msgs) {
		TEXT oldRemark = remark;
		remark = newRemark;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__REMARK, oldRemark, newRemark);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemark(TEXT newRemark) {
		if (newRemark != remark) {
			NotificationChain msgs = null;
			if (remark != null)
				msgs = ((InternalEObject)remark).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__REMARK, null, msgs);
			if (newRemark != null)
				msgs = ((InternalEObject)newRemark).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__REMARK, null, msgs);
			msgs = basicSetRemark(newRemark, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__REMARK, newRemark, newRemark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLASSREFERENCE getItsSuperclass() {
		return itsSuperclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItsSuperclass(CLASSREFERENCE newItsSuperclass, NotificationChain msgs) {
		CLASSREFERENCE oldItsSuperclass = itsSuperclass;
		itsSuperclass = newItsSuperclass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__ITS_SUPERCLASS, oldItsSuperclass, newItsSuperclass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItsSuperclass(CLASSREFERENCE newItsSuperclass) {
		if (newItsSuperclass != itsSuperclass) {
			NotificationChain msgs = null;
			if (itsSuperclass != null)
				msgs = ((InternalEObject)itsSuperclass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__ITS_SUPERCLASS, null, msgs);
			if (newItsSuperclass != null)
				msgs = ((InternalEObject)newItsSuperclass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__ITS_SUPERCLASS, null, msgs);
			msgs = basicSetItsSuperclass(newItsSuperclass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__ITS_SUPERCLASS, newItsSuperclass, newItsSuperclass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROPERTIESREFERENCE getDescribedBy() {
		return describedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescribedBy(PROPERTIESREFERENCE newDescribedBy, NotificationChain msgs) {
		PROPERTIESREFERENCE oldDescribedBy = describedBy;
		describedBy = newDescribedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__DESCRIBED_BY, oldDescribedBy, newDescribedBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescribedBy(PROPERTIESREFERENCE newDescribedBy) {
		if (newDescribedBy != describedBy) {
			NotificationChain msgs = null;
			if (describedBy != null)
				msgs = ((InternalEObject)describedBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__DESCRIBED_BY, null, msgs);
			if (newDescribedBy != null)
				msgs = ((InternalEObject)newDescribedBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__DESCRIBED_BY, null, msgs);
			msgs = basicSetDescribedBy(newDescribedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__DESCRIBED_BY, newDescribedBy, newDescribedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DATATYPESREFERENCE getDefinedTypes() {
		return definedTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinedTypes(DATATYPESREFERENCE newDefinedTypes, NotificationChain msgs) {
		DATATYPESREFERENCE oldDefinedTypes = definedTypes;
		definedTypes = newDefinedTypes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__DEFINED_TYPES, oldDefinedTypes, newDefinedTypes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinedTypes(DATATYPESREFERENCE newDefinedTypes) {
		if (newDefinedTypes != definedTypes) {
			NotificationChain msgs = null;
			if (definedTypes != null)
				msgs = ((InternalEObject)definedTypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__DEFINED_TYPES, null, msgs);
			if (newDefinedTypes != null)
				msgs = ((InternalEObject)newDefinedTypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__DEFINED_TYPES, null, msgs);
			msgs = basicSetDefinedTypes(newDefinedTypes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__DEFINED_TYPES, newDefinedTypes, newDefinedTypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DOCUMENTSREFERENCE getDefinedDocuments() {
		return definedDocuments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinedDocuments(DOCUMENTSREFERENCE newDefinedDocuments, NotificationChain msgs) {
		DOCUMENTSREFERENCE oldDefinedDocuments = definedDocuments;
		definedDocuments = newDefinedDocuments;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__DEFINED_DOCUMENTS, oldDefinedDocuments, newDefinedDocuments);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinedDocuments(DOCUMENTSREFERENCE newDefinedDocuments) {
		if (newDefinedDocuments != definedDocuments) {
			NotificationChain msgs = null;
			if (definedDocuments != null)
				msgs = ((InternalEObject)definedDocuments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__DEFINED_DOCUMENTS, null, msgs);
			if (newDefinedDocuments != null)
				msgs = ((InternalEObject)newDefinedDocuments).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__DEFINED_DOCUMENTS, null, msgs);
			msgs = basicSetDefinedDocuments(newDefinedDocuments, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__DEFINED_DOCUMENTS, newDefinedDocuments, newDefinedDocuments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONSTRAINTS getConstraints() {
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstraints(CONSTRAINTS newConstraints, NotificationChain msgs) {
		CONSTRAINTS oldConstraints = constraints;
		constraints = newConstraints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__CONSTRAINTS, oldConstraints, newConstraints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraints(CONSTRAINTS newConstraints) {
		if (newConstraints != constraints) {
			NotificationChain msgs = null;
			if (constraints != null)
				msgs = ((InternalEObject)constraints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__CONSTRAINTS, null, msgs);
			if (newConstraints != null)
				msgs = ((InternalEObject)newConstraints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__CONSTRAINTS, null, msgs);
			msgs = basicSetConstraints(newConstraints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__CONSTRAINTS, newConstraints, newConstraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KEYWORD getKeywords() {
		return keywords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeywords(KEYWORD newKeywords, NotificationChain msgs) {
		KEYWORD oldKeywords = keywords;
		keywords = newKeywords;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__KEYWORDS, oldKeywords, newKeywords);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeywords(KEYWORD newKeywords) {
		if (newKeywords != keywords) {
			NotificationChain msgs = null;
			if (keywords != null)
				msgs = ((InternalEObject)keywords).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__KEYWORDS, null, msgs);
			if (newKeywords != null)
				msgs = ((InternalEObject)newKeywords).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__KEYWORDS, null, msgs);
			msgs = basicSetKeywords(newKeywords, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__KEYWORDS, newKeywords, newKeywords));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROPERTIESREFERENCE getSubClassProperties() {
		return subClassProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubClassProperties(PROPERTIESREFERENCE newSubClassProperties, NotificationChain msgs) {
		PROPERTIESREFERENCE oldSubClassProperties = subClassProperties;
		subClassProperties = newSubClassProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__SUB_CLASS_PROPERTIES, oldSubClassProperties, newSubClassProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubClassProperties(PROPERTIESREFERENCE newSubClassProperties) {
		if (newSubClassProperties != subClassProperties) {
			NotificationChain msgs = null;
			if (subClassProperties != null)
				msgs = ((InternalEObject)subClassProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__SUB_CLASS_PROPERTIES, null, msgs);
			if (newSubClassProperties != null)
				msgs = ((InternalEObject)newSubClassProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__SUB_CLASS_PROPERTIES, null, msgs);
			msgs = basicSetSubClassProperties(newSubClassProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__SUB_CLASS_PROPERTIES, newSubClassProperties, newSubClassProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLASSCONSTANTVALUES getClassConstantValues() {
		return classConstantValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassConstantValues(CLASSCONSTANTVALUES newClassConstantValues, NotificationChain msgs) {
		CLASSCONSTANTVALUES oldClassConstantValues = classConstantValues;
		classConstantValues = newClassConstantValues;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__CLASS_CONSTANT_VALUES, oldClassConstantValues, newClassConstantValues);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassConstantValues(CLASSCONSTANTVALUES newClassConstantValues) {
		if (newClassConstantValues != classConstantValues) {
			NotificationChain msgs = null;
			if (classConstantValues != null)
				msgs = ((InternalEObject)classConstantValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__CLASS_CONSTANT_VALUES, null, msgs);
			if (newClassConstantValues != null)
				msgs = ((InternalEObject)newClassConstantValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__CLASS_CONSTANT_VALUES, null, msgs);
			msgs = basicSetClassConstantValues(newClassConstantValues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__CLASS_CONSTANT_VALUES, newClassConstantValues, newClassConstantValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GEOMETRICCONTEXT getGeometricRepresentationContext() {
		return geometricRepresentationContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeometricRepresentationContext(GEOMETRICCONTEXT newGeometricRepresentationContext, NotificationChain msgs) {
		GEOMETRICCONTEXT oldGeometricRepresentationContext = geometricRepresentationContext;
		geometricRepresentationContext = newGeometricRepresentationContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__GEOMETRIC_REPRESENTATION_CONTEXT, oldGeometricRepresentationContext, newGeometricRepresentationContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeometricRepresentationContext(GEOMETRICCONTEXT newGeometricRepresentationContext) {
		if (newGeometricRepresentationContext != geometricRepresentationContext) {
			NotificationChain msgs = null;
			if (geometricRepresentationContext != null)
				msgs = ((InternalEObject)geometricRepresentationContext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__GEOMETRIC_REPRESENTATION_CONTEXT, null, msgs);
			if (newGeometricRepresentationContext != null)
				msgs = ((InternalEObject)newGeometricRepresentationContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__GEOMETRIC_REPRESENTATION_CONTEXT, null, msgs);
			msgs = basicSetGeometricRepresentationContext(newGeometricRepresentationContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__GEOMETRIC_REPRESENTATION_CONTEXT, newGeometricRepresentationContext, newGeometricRepresentationContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GEOMETRICUNITCONTEXT getGlobalUnitContext() {
		return globalUnitContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlobalUnitContext(GEOMETRICUNITCONTEXT newGlobalUnitContext, NotificationChain msgs) {
		GEOMETRICUNITCONTEXT oldGlobalUnitContext = globalUnitContext;
		globalUnitContext = newGlobalUnitContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__GLOBAL_UNIT_CONTEXT, oldGlobalUnitContext, newGlobalUnitContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalUnitContext(GEOMETRICUNITCONTEXT newGlobalUnitContext) {
		if (newGlobalUnitContext != globalUnitContext) {
			NotificationChain msgs = null;
			if (globalUnitContext != null)
				msgs = ((InternalEObject)globalUnitContext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__GLOBAL_UNIT_CONTEXT, null, msgs);
			if (newGlobalUnitContext != null)
				msgs = ((InternalEObject)newGlobalUnitContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__GLOBAL_UNIT_CONTEXT, null, msgs);
			msgs = basicSetGlobalUnitContext(newGlobalUnitContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__GLOBAL_UNIT_CONTEXT, newGlobalUnitContext, newGlobalUnitContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__TRANSLATION:
				return basicSetTranslation(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__SOURCE_LANGUAGE:
				return basicSetSourceLanguage(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__IS_DEPRECATED_INTERPRETATION:
				return basicSetIsDeprecatedInterpretation(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__PREFERRED_NAME:
				return basicSetPreferredName(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__SYNONYMOUS_NAMES:
				return basicSetSynonymousNames(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__SHORT_NAME:
				return basicSetShortName(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__ICON:
				return basicSetIcon(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__DEFINITION:
				return basicSetDefinition(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__SOURCE_DOC_OF_DEFINITION:
				return basicSetSourceDocOfDefinition(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__NOTE:
				return basicSetNote(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__REMARK:
				return basicSetRemark(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__ITS_SUPERCLASS:
				return basicSetItsSuperclass(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__DESCRIBED_BY:
				return basicSetDescribedBy(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__DEFINED_TYPES:
				return basicSetDefinedTypes(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__DEFINED_DOCUMENTS:
				return basicSetDefinedDocuments(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__CONSTRAINTS:
				return basicSetConstraints(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__KEYWORDS:
				return basicSetKeywords(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__SUB_CLASS_PROPERTIES:
				return basicSetSubClassProperties(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__CLASS_CONSTANT_VALUES:
				return basicSetClassConstantValues(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__GEOMETRIC_REPRESENTATION_CONTEXT:
				return basicSetGeometricRepresentationContext(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__GLOBAL_UNIT_CONTEXT:
				return basicSetGlobalUnitContext(null, msgs);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__DATE_OF_ORIGINAL_DEFINITION:
				return getDateOfOriginalDefinition();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__DATE_OF_CURRENT_VERSION:
				return getDateOfCurrentVersion();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__DATE_OF_CURRENT_REVISION:
				return getDateOfCurrentRevision();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__REVISION:
				return getRevision();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__STATUS:
				return getStatus();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__IS_DEPRECATED:
				return isIsDeprecated();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__HIERARCHICAL_POSITION:
				return getHierarchicalPosition();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__ID:
				return getId();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__TRANSLATION:
				return getTranslation();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__SOURCE_LANGUAGE:
				return getSourceLanguage();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__IS_DEPRECATED_INTERPRETATION:
				return getIsDeprecatedInterpretation();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__PREFERRED_NAME:
				return getPreferredName();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__SYNONYMOUS_NAMES:
				return getSynonymousNames();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__SHORT_NAME:
				return getShortName();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__ICON:
				return getIcon();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__DEFINITION:
				return getDefinition();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__SOURCE_DOC_OF_DEFINITION:
				return getSourceDocOfDefinition();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__NOTE:
				return getNote();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__REMARK:
				return getRemark();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__ITS_SUPERCLASS:
				return getItsSuperclass();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__DESCRIBED_BY:
				return getDescribedBy();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__DEFINED_TYPES:
				return getDefinedTypes();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__DEFINED_DOCUMENTS:
				return getDefinedDocuments();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__CONSTRAINTS:
				return getConstraints();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__KEYWORDS:
				return getKeywords();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__SUB_CLASS_PROPERTIES:
				return getSubClassProperties();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__CLASS_CONSTANT_VALUES:
				return getClassConstantValues();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__GEOMETRIC_REPRESENTATION_CONTEXT:
				return getGeometricRepresentationContext();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__GLOBAL_UNIT_CONTEXT:
				return getGlobalUnitContext();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__DATE_OF_ORIGINAL_DEFINITION:
				setDateOfOriginalDefinition((String)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__DATE_OF_CURRENT_VERSION:
				setDateOfCurrentVersion((String)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__DATE_OF_CURRENT_REVISION:
				setDateOfCurrentRevision((String)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__REVISION:
				setRevision((String)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__STATUS:
				setStatus((String)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__IS_DEPRECATED:
				setIsDeprecated((Boolean)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__HIERARCHICAL_POSITION:
				setHierarchicalPosition((String)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__ID:
				setId((String)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__TRANSLATION:
				setTranslation((TRANSLATION)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__SOURCE_LANGUAGE:
				setSourceLanguage((LANGUAGE)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__IS_DEPRECATED_INTERPRETATION:
				setIsDeprecatedInterpretation((TEXT)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__PREFERRED_NAME:
				setPreferredName((PREFERREDNAME)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__SYNONYMOUS_NAMES:
				setSynonymousNames((SYNONYMOUSNAME)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__SHORT_NAME:
				setShortName((SHORTNAME)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__ICON:
				setIcon((GRAPHICS)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__DEFINITION:
				setDefinition((TEXT)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__SOURCE_DOC_OF_DEFINITION:
				setSourceDocOfDefinition((SOURCEDOCUMENT)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__NOTE:
				setNote((TEXT)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__REMARK:
				setRemark((TEXT)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__ITS_SUPERCLASS:
				setItsSuperclass((CLASSREFERENCE)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__DESCRIBED_BY:
				setDescribedBy((PROPERTIESREFERENCE)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__DEFINED_TYPES:
				setDefinedTypes((DATATYPESREFERENCE)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__DEFINED_DOCUMENTS:
				setDefinedDocuments((DOCUMENTSREFERENCE)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__CONSTRAINTS:
				setConstraints((CONSTRAINTS)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__KEYWORDS:
				setKeywords((KEYWORD)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__SUB_CLASS_PROPERTIES:
				setSubClassProperties((PROPERTIESREFERENCE)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__CLASS_CONSTANT_VALUES:
				setClassConstantValues((CLASSCONSTANTVALUES)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__GEOMETRIC_REPRESENTATION_CONTEXT:
				setGeometricRepresentationContext((GEOMETRICCONTEXT)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__GLOBAL_UNIT_CONTEXT:
				setGlobalUnitContext((GEOMETRICUNITCONTEXT)newValue);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__DATE_OF_ORIGINAL_DEFINITION:
				setDateOfOriginalDefinition(DATE_OF_ORIGINAL_DEFINITION_EDEFAULT);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__DATE_OF_CURRENT_VERSION:
				setDateOfCurrentVersion(DATE_OF_CURRENT_VERSION_EDEFAULT);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__DATE_OF_CURRENT_REVISION:
				setDateOfCurrentRevision(DATE_OF_CURRENT_REVISION_EDEFAULT);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__REVISION:
				setRevision(REVISION_EDEFAULT);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__IS_DEPRECATED:
				setIsDeprecated(IS_DEPRECATED_EDEFAULT);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__HIERARCHICAL_POSITION:
				setHierarchicalPosition(HIERARCHICAL_POSITION_EDEFAULT);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__ID:
				setId(ID_EDEFAULT);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__TRANSLATION:
				setTranslation((TRANSLATION)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__SOURCE_LANGUAGE:
				setSourceLanguage((LANGUAGE)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__IS_DEPRECATED_INTERPRETATION:
				setIsDeprecatedInterpretation((TEXT)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__PREFERRED_NAME:
				setPreferredName((PREFERREDNAME)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__SYNONYMOUS_NAMES:
				setSynonymousNames((SYNONYMOUSNAME)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__SHORT_NAME:
				setShortName((SHORTNAME)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__ICON:
				setIcon((GRAPHICS)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__DEFINITION:
				setDefinition((TEXT)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__SOURCE_DOC_OF_DEFINITION:
				setSourceDocOfDefinition((SOURCEDOCUMENT)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__NOTE:
				setNote((TEXT)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__REMARK:
				setRemark((TEXT)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__ITS_SUPERCLASS:
				setItsSuperclass((CLASSREFERENCE)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__DESCRIBED_BY:
				setDescribedBy((PROPERTIESREFERENCE)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__DEFINED_TYPES:
				setDefinedTypes((DATATYPESREFERENCE)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__DEFINED_DOCUMENTS:
				setDefinedDocuments((DOCUMENTSREFERENCE)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__CONSTRAINTS:
				setConstraints((CONSTRAINTS)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__KEYWORDS:
				setKeywords((KEYWORD)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__SUB_CLASS_PROPERTIES:
				setSubClassProperties((PROPERTIESREFERENCE)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__CLASS_CONSTANT_VALUES:
				setClassConstantValues((CLASSCONSTANTVALUES)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__GEOMETRIC_REPRESENTATION_CONTEXT:
				setGeometricRepresentationContext((GEOMETRICCONTEXT)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__GLOBAL_UNIT_CONTEXT:
				setGlobalUnitContext((GEOMETRICUNITCONTEXT)null);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__DATE_OF_ORIGINAL_DEFINITION:
				return DATE_OF_ORIGINAL_DEFINITION_EDEFAULT == null ? dateOfOriginalDefinition != null : !DATE_OF_ORIGINAL_DEFINITION_EDEFAULT.equals(dateOfOriginalDefinition);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__DATE_OF_CURRENT_VERSION:
				return DATE_OF_CURRENT_VERSION_EDEFAULT == null ? dateOfCurrentVersion != null : !DATE_OF_CURRENT_VERSION_EDEFAULT.equals(dateOfCurrentVersion);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__DATE_OF_CURRENT_REVISION:
				return DATE_OF_CURRENT_REVISION_EDEFAULT == null ? dateOfCurrentRevision != null : !DATE_OF_CURRENT_REVISION_EDEFAULT.equals(dateOfCurrentRevision);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__REVISION:
				return REVISION_EDEFAULT == null ? revision != null : !REVISION_EDEFAULT.equals(revision);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__IS_DEPRECATED:
				return isDeprecated != IS_DEPRECATED_EDEFAULT;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__HIERARCHICAL_POSITION:
				return HIERARCHICAL_POSITION_EDEFAULT == null ? hierarchicalPosition != null : !HIERARCHICAL_POSITION_EDEFAULT.equals(hierarchicalPosition);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__TRANSLATION:
				return translation != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__SOURCE_LANGUAGE:
				return sourceLanguage != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__IS_DEPRECATED_INTERPRETATION:
				return isDeprecatedInterpretation != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__PREFERRED_NAME:
				return preferredName != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__SYNONYMOUS_NAMES:
				return synonymousNames != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__SHORT_NAME:
				return shortName != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__ICON:
				return icon != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__DEFINITION:
				return definition != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__SOURCE_DOC_OF_DEFINITION:
				return sourceDocOfDefinition != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__NOTE:
				return note != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__REMARK:
				return remark != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__ITS_SUPERCLASS:
				return itsSuperclass != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__DESCRIBED_BY:
				return describedBy != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__DEFINED_TYPES:
				return definedTypes != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__DEFINED_DOCUMENTS:
				return definedDocuments != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__CONSTRAINTS:
				return constraints != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__KEYWORDS:
				return keywords != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__SUB_CLASS_PROPERTIES:
				return subClassProperties != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__CLASS_CONSTANT_VALUES:
				return classConstantValues != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__GEOMETRIC_REPRESENTATION_CONTEXT:
				return geometricRepresentationContext != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASS__GLOBAL_UNIT_CONTEXT:
				return globalUnitContext != null;
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
		result.append(" (dateOfOriginalDefinition: ");
		result.append(dateOfOriginalDefinition);
		result.append(", dateOfCurrentVersion: ");
		result.append(dateOfCurrentVersion);
		result.append(", dateOfCurrentRevision: ");
		result.append(dateOfCurrentRevision);
		result.append(", revision: ");
		result.append(revision);
		result.append(", status: ");
		result.append(status);
		result.append(", isDeprecated: ");
		result.append(isDeprecated);
		result.append(", hierarchicalPosition: ");
		result.append(hierarchicalPosition);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //CLASSImpl
