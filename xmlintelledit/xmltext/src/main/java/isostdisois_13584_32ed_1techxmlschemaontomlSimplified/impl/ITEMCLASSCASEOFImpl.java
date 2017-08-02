/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASSESREFERENCE;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CONSTRAINTS;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DATATYPESREFERENCE;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DOCUMENTSREFERENCE;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.GRAPHICS;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ITEMCLASSCASEOF;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PROPERTIESREFERENCE;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ITEMCLASSCASEOF</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.ITEMCLASSCASEOFImpl#getCodedName <em>Coded Name</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.ITEMCLASSCASEOFImpl#isInstanceSharable <em>Instance Sharable</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.ITEMCLASSCASEOFImpl#getSimplifiedDrawing <em>Simplified Drawing</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.ITEMCLASSCASEOFImpl#getIsCaseOf <em>Is Case Of</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.ITEMCLASSCASEOFImpl#getImportedProperties <em>Imported Properties</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.ITEMCLASSCASEOFImpl#getImportedTypes <em>Imported Types</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.ITEMCLASSCASEOFImpl#getImportedDocuments <em>Imported Documents</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.ITEMCLASSCASEOFImpl#getImportedConstraints <em>Imported Constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ITEMCLASSCASEOFImpl extends CLASSImpl implements ITEMCLASSCASEOF {
	/**
	 * The default value of the '{@link #getCodedName() <em>Coded Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodedName()
	 * @generated
	 * @ordered
	 */
	protected static final String CODED_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodedName() <em>Coded Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodedName()
	 * @generated
	 * @ordered
	 */
	protected String codedName = CODED_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isInstanceSharable() <em>Instance Sharable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInstanceSharable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INSTANCE_SHARABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInstanceSharable() <em>Instance Sharable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInstanceSharable()
	 * @generated
	 * @ordered
	 */
	protected boolean instanceSharable = INSTANCE_SHARABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSimplifiedDrawing() <em>Simplified Drawing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimplifiedDrawing()
	 * @generated
	 * @ordered
	 */
	protected GRAPHICS simplifiedDrawing;

	/**
	 * The cached value of the '{@link #getIsCaseOf() <em>Is Case Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsCaseOf()
	 * @generated
	 * @ordered
	 */
	protected CLASSESREFERENCE isCaseOf;

	/**
	 * The cached value of the '{@link #getImportedProperties() <em>Imported Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedProperties()
	 * @generated
	 * @ordered
	 */
	protected PROPERTIESREFERENCE importedProperties;

	/**
	 * The cached value of the '{@link #getImportedTypes() <em>Imported Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedTypes()
	 * @generated
	 * @ordered
	 */
	protected DATATYPESREFERENCE importedTypes;

	/**
	 * The cached value of the '{@link #getImportedDocuments() <em>Imported Documents</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedDocuments()
	 * @generated
	 * @ordered
	 */
	protected DOCUMENTSREFERENCE importedDocuments;

	/**
	 * The cached value of the '{@link #getImportedConstraints() <em>Imported Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedConstraints()
	 * @generated
	 * @ordered
	 */
	protected CONSTRAINTS importedConstraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ITEMCLASSCASEOFImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.ITEMCLASSCASEOF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodedName() {
		return codedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodedName(String newCodedName) {
		String oldCodedName = codedName;
		codedName = newCodedName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__CODED_NAME, oldCodedName, codedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInstanceSharable() {
		return instanceSharable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceSharable(boolean newInstanceSharable) {
		boolean oldInstanceSharable = instanceSharable;
		instanceSharable = newInstanceSharable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__INSTANCE_SHARABLE, oldInstanceSharable, instanceSharable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GRAPHICS getSimplifiedDrawing() {
		return simplifiedDrawing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimplifiedDrawing(GRAPHICS newSimplifiedDrawing, NotificationChain msgs) {
		GRAPHICS oldSimplifiedDrawing = simplifiedDrawing;
		simplifiedDrawing = newSimplifiedDrawing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__SIMPLIFIED_DRAWING, oldSimplifiedDrawing, newSimplifiedDrawing);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimplifiedDrawing(GRAPHICS newSimplifiedDrawing) {
		if (newSimplifiedDrawing != simplifiedDrawing) {
			NotificationChain msgs = null;
			if (simplifiedDrawing != null)
				msgs = ((InternalEObject)simplifiedDrawing).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__SIMPLIFIED_DRAWING, null, msgs);
			if (newSimplifiedDrawing != null)
				msgs = ((InternalEObject)newSimplifiedDrawing).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__SIMPLIFIED_DRAWING, null, msgs);
			msgs = basicSetSimplifiedDrawing(newSimplifiedDrawing, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__SIMPLIFIED_DRAWING, newSimplifiedDrawing, newSimplifiedDrawing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLASSESREFERENCE getIsCaseOf() {
		return isCaseOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsCaseOf(CLASSESREFERENCE newIsCaseOf, NotificationChain msgs) {
		CLASSESREFERENCE oldIsCaseOf = isCaseOf;
		isCaseOf = newIsCaseOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__IS_CASE_OF, oldIsCaseOf, newIsCaseOf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCaseOf(CLASSESREFERENCE newIsCaseOf) {
		if (newIsCaseOf != isCaseOf) {
			NotificationChain msgs = null;
			if (isCaseOf != null)
				msgs = ((InternalEObject)isCaseOf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__IS_CASE_OF, null, msgs);
			if (newIsCaseOf != null)
				msgs = ((InternalEObject)newIsCaseOf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__IS_CASE_OF, null, msgs);
			msgs = basicSetIsCaseOf(newIsCaseOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__IS_CASE_OF, newIsCaseOf, newIsCaseOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROPERTIESREFERENCE getImportedProperties() {
		return importedProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportedProperties(PROPERTIESREFERENCE newImportedProperties, NotificationChain msgs) {
		PROPERTIESREFERENCE oldImportedProperties = importedProperties;
		importedProperties = newImportedProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__IMPORTED_PROPERTIES, oldImportedProperties, newImportedProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedProperties(PROPERTIESREFERENCE newImportedProperties) {
		if (newImportedProperties != importedProperties) {
			NotificationChain msgs = null;
			if (importedProperties != null)
				msgs = ((InternalEObject)importedProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__IMPORTED_PROPERTIES, null, msgs);
			if (newImportedProperties != null)
				msgs = ((InternalEObject)newImportedProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__IMPORTED_PROPERTIES, null, msgs);
			msgs = basicSetImportedProperties(newImportedProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__IMPORTED_PROPERTIES, newImportedProperties, newImportedProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DATATYPESREFERENCE getImportedTypes() {
		return importedTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportedTypes(DATATYPESREFERENCE newImportedTypes, NotificationChain msgs) {
		DATATYPESREFERENCE oldImportedTypes = importedTypes;
		importedTypes = newImportedTypes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__IMPORTED_TYPES, oldImportedTypes, newImportedTypes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedTypes(DATATYPESREFERENCE newImportedTypes) {
		if (newImportedTypes != importedTypes) {
			NotificationChain msgs = null;
			if (importedTypes != null)
				msgs = ((InternalEObject)importedTypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__IMPORTED_TYPES, null, msgs);
			if (newImportedTypes != null)
				msgs = ((InternalEObject)newImportedTypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__IMPORTED_TYPES, null, msgs);
			msgs = basicSetImportedTypes(newImportedTypes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__IMPORTED_TYPES, newImportedTypes, newImportedTypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DOCUMENTSREFERENCE getImportedDocuments() {
		return importedDocuments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportedDocuments(DOCUMENTSREFERENCE newImportedDocuments, NotificationChain msgs) {
		DOCUMENTSREFERENCE oldImportedDocuments = importedDocuments;
		importedDocuments = newImportedDocuments;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__IMPORTED_DOCUMENTS, oldImportedDocuments, newImportedDocuments);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedDocuments(DOCUMENTSREFERENCE newImportedDocuments) {
		if (newImportedDocuments != importedDocuments) {
			NotificationChain msgs = null;
			if (importedDocuments != null)
				msgs = ((InternalEObject)importedDocuments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__IMPORTED_DOCUMENTS, null, msgs);
			if (newImportedDocuments != null)
				msgs = ((InternalEObject)newImportedDocuments).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__IMPORTED_DOCUMENTS, null, msgs);
			msgs = basicSetImportedDocuments(newImportedDocuments, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__IMPORTED_DOCUMENTS, newImportedDocuments, newImportedDocuments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONSTRAINTS getImportedConstraints() {
		return importedConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportedConstraints(CONSTRAINTS newImportedConstraints, NotificationChain msgs) {
		CONSTRAINTS oldImportedConstraints = importedConstraints;
		importedConstraints = newImportedConstraints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__IMPORTED_CONSTRAINTS, oldImportedConstraints, newImportedConstraints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedConstraints(CONSTRAINTS newImportedConstraints) {
		if (newImportedConstraints != importedConstraints) {
			NotificationChain msgs = null;
			if (importedConstraints != null)
				msgs = ((InternalEObject)importedConstraints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__IMPORTED_CONSTRAINTS, null, msgs);
			if (newImportedConstraints != null)
				msgs = ((InternalEObject)newImportedConstraints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__IMPORTED_CONSTRAINTS, null, msgs);
			msgs = basicSetImportedConstraints(newImportedConstraints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__IMPORTED_CONSTRAINTS, newImportedConstraints, newImportedConstraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__SIMPLIFIED_DRAWING:
				return basicSetSimplifiedDrawing(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__IS_CASE_OF:
				return basicSetIsCaseOf(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__IMPORTED_PROPERTIES:
				return basicSetImportedProperties(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__IMPORTED_TYPES:
				return basicSetImportedTypes(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__IMPORTED_DOCUMENTS:
				return basicSetImportedDocuments(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__IMPORTED_CONSTRAINTS:
				return basicSetImportedConstraints(null, msgs);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__CODED_NAME:
				return getCodedName();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__INSTANCE_SHARABLE:
				return isInstanceSharable();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__SIMPLIFIED_DRAWING:
				return getSimplifiedDrawing();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__IS_CASE_OF:
				return getIsCaseOf();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__IMPORTED_PROPERTIES:
				return getImportedProperties();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__IMPORTED_TYPES:
				return getImportedTypes();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__IMPORTED_DOCUMENTS:
				return getImportedDocuments();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__IMPORTED_CONSTRAINTS:
				return getImportedConstraints();
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__CODED_NAME:
				setCodedName((String)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__INSTANCE_SHARABLE:
				setInstanceSharable((Boolean)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__SIMPLIFIED_DRAWING:
				setSimplifiedDrawing((GRAPHICS)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__IS_CASE_OF:
				setIsCaseOf((CLASSESREFERENCE)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__IMPORTED_PROPERTIES:
				setImportedProperties((PROPERTIESREFERENCE)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__IMPORTED_TYPES:
				setImportedTypes((DATATYPESREFERENCE)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__IMPORTED_DOCUMENTS:
				setImportedDocuments((DOCUMENTSREFERENCE)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__IMPORTED_CONSTRAINTS:
				setImportedConstraints((CONSTRAINTS)newValue);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__CODED_NAME:
				setCodedName(CODED_NAME_EDEFAULT);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__INSTANCE_SHARABLE:
				setInstanceSharable(INSTANCE_SHARABLE_EDEFAULT);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__SIMPLIFIED_DRAWING:
				setSimplifiedDrawing((GRAPHICS)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__IS_CASE_OF:
				setIsCaseOf((CLASSESREFERENCE)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__IMPORTED_PROPERTIES:
				setImportedProperties((PROPERTIESREFERENCE)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__IMPORTED_TYPES:
				setImportedTypes((DATATYPESREFERENCE)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__IMPORTED_DOCUMENTS:
				setImportedDocuments((DOCUMENTSREFERENCE)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__IMPORTED_CONSTRAINTS:
				setImportedConstraints((CONSTRAINTS)null);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__CODED_NAME:
				return CODED_NAME_EDEFAULT == null ? codedName != null : !CODED_NAME_EDEFAULT.equals(codedName);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__INSTANCE_SHARABLE:
				return instanceSharable != INSTANCE_SHARABLE_EDEFAULT;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__SIMPLIFIED_DRAWING:
				return simplifiedDrawing != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__IS_CASE_OF:
				return isCaseOf != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__IMPORTED_PROPERTIES:
				return importedProperties != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__IMPORTED_TYPES:
				return importedTypes != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__IMPORTED_DOCUMENTS:
				return importedDocuments != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.ITEMCLASSCASEOF__IMPORTED_CONSTRAINTS:
				return importedConstraints != null;
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
		result.append(" (codedName: ");
		result.append(codedName);
		result.append(", instanceSharable: ");
		result.append(instanceSharable);
		result.append(')');
		return result.toString();
	}

} //ITEMCLASSCASEOFImpl
