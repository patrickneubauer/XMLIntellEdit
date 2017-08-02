/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASSESREFERENCE;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASSREFERENCE;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CONSTRAINTS;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DATATYPESREFERENCE;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DOCUMENTSREFERENCE;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.FMCLASSVIEWOF;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PROPERTIESREFERENCE;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.VCVRANGE;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FMCLASSVIEWOF</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.FMCLASSVIEWOFImpl#getCreatedView <em>Created View</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.FMCLASSVIEWOFImpl#getVCVRange <em>VCV Range</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.FMCLASSVIEWOFImpl#getImportedPropertiesFromView <em>Imported Properties From View</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.FMCLASSVIEWOFImpl#getImportedTypesFromView <em>Imported Types From View</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.FMCLASSVIEWOFImpl#getImportedDocumentsFromView <em>Imported Documents From View</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.FMCLASSVIEWOFImpl#getImportedConstraintsFromView <em>Imported Constraints From View</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.FMCLASSVIEWOFImpl#getCaseOf <em>Case Of</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.FMCLASSVIEWOFImpl#getImportedPropertiesFromModels <em>Imported Properties From Models</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.FMCLASSVIEWOFImpl#getImportedTypesFromModels <em>Imported Types From Models</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.FMCLASSVIEWOFImpl#getImportedDocumentsFromModels <em>Imported Documents From Models</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.FMCLASSVIEWOFImpl#getImportedConstraintsFromModels <em>Imported Constraints From Models</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.FMCLASSVIEWOFImpl#getViewOf <em>View Of</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.FMCLASSVIEWOFImpl#getImportedPropertiesFromItem <em>Imported Properties From Item</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.FMCLASSVIEWOFImpl#getImportedTypesFromItem <em>Imported Types From Item</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.FMCLASSVIEWOFImpl#getImportedDocumentsFromItem <em>Imported Documents From Item</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.FMCLASSVIEWOFImpl#getImportedConstraintsFromItem <em>Imported Constraints From Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FMCLASSVIEWOFImpl extends CLASSImpl implements FMCLASSVIEWOF {
	/**
	 * The cached value of the '{@link #getCreatedView() <em>Created View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedView()
	 * @generated
	 * @ordered
	 */
	protected CLASSREFERENCE createdView;

	/**
	 * The cached value of the '{@link #getVCVRange() <em>VCV Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVCVRange()
	 * @generated
	 * @ordered
	 */
	protected VCVRANGE vCVRange;

	/**
	 * The cached value of the '{@link #getImportedPropertiesFromView() <em>Imported Properties From View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedPropertiesFromView()
	 * @generated
	 * @ordered
	 */
	protected PROPERTIESREFERENCE importedPropertiesFromView;

	/**
	 * The cached value of the '{@link #getImportedTypesFromView() <em>Imported Types From View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedTypesFromView()
	 * @generated
	 * @ordered
	 */
	protected DATATYPESREFERENCE importedTypesFromView;

	/**
	 * The cached value of the '{@link #getImportedDocumentsFromView() <em>Imported Documents From View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedDocumentsFromView()
	 * @generated
	 * @ordered
	 */
	protected DOCUMENTSREFERENCE importedDocumentsFromView;

	/**
	 * The cached value of the '{@link #getImportedConstraintsFromView() <em>Imported Constraints From View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedConstraintsFromView()
	 * @generated
	 * @ordered
	 */
	protected CONSTRAINTS importedConstraintsFromView;

	/**
	 * The cached value of the '{@link #getCaseOf() <em>Case Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseOf()
	 * @generated
	 * @ordered
	 */
	protected CLASSESREFERENCE caseOf;

	/**
	 * The cached value of the '{@link #getImportedPropertiesFromModels() <em>Imported Properties From Models</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedPropertiesFromModels()
	 * @generated
	 * @ordered
	 */
	protected PROPERTIESREFERENCE importedPropertiesFromModels;

	/**
	 * The cached value of the '{@link #getImportedTypesFromModels() <em>Imported Types From Models</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedTypesFromModels()
	 * @generated
	 * @ordered
	 */
	protected DATATYPESREFERENCE importedTypesFromModels;

	/**
	 * The cached value of the '{@link #getImportedDocumentsFromModels() <em>Imported Documents From Models</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedDocumentsFromModels()
	 * @generated
	 * @ordered
	 */
	protected DOCUMENTSREFERENCE importedDocumentsFromModels;

	/**
	 * The cached value of the '{@link #getImportedConstraintsFromModels() <em>Imported Constraints From Models</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedConstraintsFromModels()
	 * @generated
	 * @ordered
	 */
	protected CONSTRAINTS importedConstraintsFromModels;

	/**
	 * The cached value of the '{@link #getViewOf() <em>View Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewOf()
	 * @generated
	 * @ordered
	 */
	protected CLASSREFERENCE viewOf;

	/**
	 * The cached value of the '{@link #getImportedPropertiesFromItem() <em>Imported Properties From Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedPropertiesFromItem()
	 * @generated
	 * @ordered
	 */
	protected PROPERTIESREFERENCE importedPropertiesFromItem;

	/**
	 * The cached value of the '{@link #getImportedTypesFromItem() <em>Imported Types From Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedTypesFromItem()
	 * @generated
	 * @ordered
	 */
	protected DATATYPESREFERENCE importedTypesFromItem;

	/**
	 * The cached value of the '{@link #getImportedDocumentsFromItem() <em>Imported Documents From Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedDocumentsFromItem()
	 * @generated
	 * @ordered
	 */
	protected DOCUMENTSREFERENCE importedDocumentsFromItem;

	/**
	 * The cached value of the '{@link #getImportedConstraintsFromItem() <em>Imported Constraints From Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedConstraintsFromItem()
	 * @generated
	 * @ordered
	 */
	protected CONSTRAINTS importedConstraintsFromItem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FMCLASSVIEWOFImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.FMCLASSVIEWOF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLASSREFERENCE getCreatedView() {
		return createdView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreatedView(CLASSREFERENCE newCreatedView, NotificationChain msgs) {
		CLASSREFERENCE oldCreatedView = createdView;
		createdView = newCreatedView;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__CREATED_VIEW, oldCreatedView, newCreatedView);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatedView(CLASSREFERENCE newCreatedView) {
		if (newCreatedView != createdView) {
			NotificationChain msgs = null;
			if (createdView != null)
				msgs = ((InternalEObject)createdView).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__CREATED_VIEW, null, msgs);
			if (newCreatedView != null)
				msgs = ((InternalEObject)newCreatedView).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__CREATED_VIEW, null, msgs);
			msgs = basicSetCreatedView(newCreatedView, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__CREATED_VIEW, newCreatedView, newCreatedView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VCVRANGE getVCVRange() {
		return vCVRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVCVRange(VCVRANGE newVCVRange, NotificationChain msgs) {
		VCVRANGE oldVCVRange = vCVRange;
		vCVRange = newVCVRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__VCV_RANGE, oldVCVRange, newVCVRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVCVRange(VCVRANGE newVCVRange) {
		if (newVCVRange != vCVRange) {
			NotificationChain msgs = null;
			if (vCVRange != null)
				msgs = ((InternalEObject)vCVRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__VCV_RANGE, null, msgs);
			if (newVCVRange != null)
				msgs = ((InternalEObject)newVCVRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__VCV_RANGE, null, msgs);
			msgs = basicSetVCVRange(newVCVRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__VCV_RANGE, newVCVRange, newVCVRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROPERTIESREFERENCE getImportedPropertiesFromView() {
		return importedPropertiesFromView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportedPropertiesFromView(PROPERTIESREFERENCE newImportedPropertiesFromView, NotificationChain msgs) {
		PROPERTIESREFERENCE oldImportedPropertiesFromView = importedPropertiesFromView;
		importedPropertiesFromView = newImportedPropertiesFromView;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_PROPERTIES_FROM_VIEW, oldImportedPropertiesFromView, newImportedPropertiesFromView);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedPropertiesFromView(PROPERTIESREFERENCE newImportedPropertiesFromView) {
		if (newImportedPropertiesFromView != importedPropertiesFromView) {
			NotificationChain msgs = null;
			if (importedPropertiesFromView != null)
				msgs = ((InternalEObject)importedPropertiesFromView).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_PROPERTIES_FROM_VIEW, null, msgs);
			if (newImportedPropertiesFromView != null)
				msgs = ((InternalEObject)newImportedPropertiesFromView).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_PROPERTIES_FROM_VIEW, null, msgs);
			msgs = basicSetImportedPropertiesFromView(newImportedPropertiesFromView, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_PROPERTIES_FROM_VIEW, newImportedPropertiesFromView, newImportedPropertiesFromView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DATATYPESREFERENCE getImportedTypesFromView() {
		return importedTypesFromView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportedTypesFromView(DATATYPESREFERENCE newImportedTypesFromView, NotificationChain msgs) {
		DATATYPESREFERENCE oldImportedTypesFromView = importedTypesFromView;
		importedTypesFromView = newImportedTypesFromView;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_TYPES_FROM_VIEW, oldImportedTypesFromView, newImportedTypesFromView);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedTypesFromView(DATATYPESREFERENCE newImportedTypesFromView) {
		if (newImportedTypesFromView != importedTypesFromView) {
			NotificationChain msgs = null;
			if (importedTypesFromView != null)
				msgs = ((InternalEObject)importedTypesFromView).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_TYPES_FROM_VIEW, null, msgs);
			if (newImportedTypesFromView != null)
				msgs = ((InternalEObject)newImportedTypesFromView).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_TYPES_FROM_VIEW, null, msgs);
			msgs = basicSetImportedTypesFromView(newImportedTypesFromView, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_TYPES_FROM_VIEW, newImportedTypesFromView, newImportedTypesFromView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DOCUMENTSREFERENCE getImportedDocumentsFromView() {
		return importedDocumentsFromView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportedDocumentsFromView(DOCUMENTSREFERENCE newImportedDocumentsFromView, NotificationChain msgs) {
		DOCUMENTSREFERENCE oldImportedDocumentsFromView = importedDocumentsFromView;
		importedDocumentsFromView = newImportedDocumentsFromView;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_DOCUMENTS_FROM_VIEW, oldImportedDocumentsFromView, newImportedDocumentsFromView);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedDocumentsFromView(DOCUMENTSREFERENCE newImportedDocumentsFromView) {
		if (newImportedDocumentsFromView != importedDocumentsFromView) {
			NotificationChain msgs = null;
			if (importedDocumentsFromView != null)
				msgs = ((InternalEObject)importedDocumentsFromView).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_DOCUMENTS_FROM_VIEW, null, msgs);
			if (newImportedDocumentsFromView != null)
				msgs = ((InternalEObject)newImportedDocumentsFromView).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_DOCUMENTS_FROM_VIEW, null, msgs);
			msgs = basicSetImportedDocumentsFromView(newImportedDocumentsFromView, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_DOCUMENTS_FROM_VIEW, newImportedDocumentsFromView, newImportedDocumentsFromView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONSTRAINTS getImportedConstraintsFromView() {
		return importedConstraintsFromView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportedConstraintsFromView(CONSTRAINTS newImportedConstraintsFromView, NotificationChain msgs) {
		CONSTRAINTS oldImportedConstraintsFromView = importedConstraintsFromView;
		importedConstraintsFromView = newImportedConstraintsFromView;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_CONSTRAINTS_FROM_VIEW, oldImportedConstraintsFromView, newImportedConstraintsFromView);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedConstraintsFromView(CONSTRAINTS newImportedConstraintsFromView) {
		if (newImportedConstraintsFromView != importedConstraintsFromView) {
			NotificationChain msgs = null;
			if (importedConstraintsFromView != null)
				msgs = ((InternalEObject)importedConstraintsFromView).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_CONSTRAINTS_FROM_VIEW, null, msgs);
			if (newImportedConstraintsFromView != null)
				msgs = ((InternalEObject)newImportedConstraintsFromView).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_CONSTRAINTS_FROM_VIEW, null, msgs);
			msgs = basicSetImportedConstraintsFromView(newImportedConstraintsFromView, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_CONSTRAINTS_FROM_VIEW, newImportedConstraintsFromView, newImportedConstraintsFromView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLASSESREFERENCE getCaseOf() {
		return caseOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCaseOf(CLASSESREFERENCE newCaseOf, NotificationChain msgs) {
		CLASSESREFERENCE oldCaseOf = caseOf;
		caseOf = newCaseOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__CASE_OF, oldCaseOf, newCaseOf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaseOf(CLASSESREFERENCE newCaseOf) {
		if (newCaseOf != caseOf) {
			NotificationChain msgs = null;
			if (caseOf != null)
				msgs = ((InternalEObject)caseOf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__CASE_OF, null, msgs);
			if (newCaseOf != null)
				msgs = ((InternalEObject)newCaseOf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__CASE_OF, null, msgs);
			msgs = basicSetCaseOf(newCaseOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__CASE_OF, newCaseOf, newCaseOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROPERTIESREFERENCE getImportedPropertiesFromModels() {
		return importedPropertiesFromModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportedPropertiesFromModels(PROPERTIESREFERENCE newImportedPropertiesFromModels, NotificationChain msgs) {
		PROPERTIESREFERENCE oldImportedPropertiesFromModels = importedPropertiesFromModels;
		importedPropertiesFromModels = newImportedPropertiesFromModels;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_PROPERTIES_FROM_MODELS, oldImportedPropertiesFromModels, newImportedPropertiesFromModels);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedPropertiesFromModels(PROPERTIESREFERENCE newImportedPropertiesFromModels) {
		if (newImportedPropertiesFromModels != importedPropertiesFromModels) {
			NotificationChain msgs = null;
			if (importedPropertiesFromModels != null)
				msgs = ((InternalEObject)importedPropertiesFromModels).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_PROPERTIES_FROM_MODELS, null, msgs);
			if (newImportedPropertiesFromModels != null)
				msgs = ((InternalEObject)newImportedPropertiesFromModels).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_PROPERTIES_FROM_MODELS, null, msgs);
			msgs = basicSetImportedPropertiesFromModels(newImportedPropertiesFromModels, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_PROPERTIES_FROM_MODELS, newImportedPropertiesFromModels, newImportedPropertiesFromModels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DATATYPESREFERENCE getImportedTypesFromModels() {
		return importedTypesFromModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportedTypesFromModels(DATATYPESREFERENCE newImportedTypesFromModels, NotificationChain msgs) {
		DATATYPESREFERENCE oldImportedTypesFromModels = importedTypesFromModels;
		importedTypesFromModels = newImportedTypesFromModels;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_TYPES_FROM_MODELS, oldImportedTypesFromModels, newImportedTypesFromModels);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedTypesFromModels(DATATYPESREFERENCE newImportedTypesFromModels) {
		if (newImportedTypesFromModels != importedTypesFromModels) {
			NotificationChain msgs = null;
			if (importedTypesFromModels != null)
				msgs = ((InternalEObject)importedTypesFromModels).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_TYPES_FROM_MODELS, null, msgs);
			if (newImportedTypesFromModels != null)
				msgs = ((InternalEObject)newImportedTypesFromModels).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_TYPES_FROM_MODELS, null, msgs);
			msgs = basicSetImportedTypesFromModels(newImportedTypesFromModels, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_TYPES_FROM_MODELS, newImportedTypesFromModels, newImportedTypesFromModels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DOCUMENTSREFERENCE getImportedDocumentsFromModels() {
		return importedDocumentsFromModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportedDocumentsFromModels(DOCUMENTSREFERENCE newImportedDocumentsFromModels, NotificationChain msgs) {
		DOCUMENTSREFERENCE oldImportedDocumentsFromModels = importedDocumentsFromModels;
		importedDocumentsFromModels = newImportedDocumentsFromModels;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_DOCUMENTS_FROM_MODELS, oldImportedDocumentsFromModels, newImportedDocumentsFromModels);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedDocumentsFromModels(DOCUMENTSREFERENCE newImportedDocumentsFromModels) {
		if (newImportedDocumentsFromModels != importedDocumentsFromModels) {
			NotificationChain msgs = null;
			if (importedDocumentsFromModels != null)
				msgs = ((InternalEObject)importedDocumentsFromModels).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_DOCUMENTS_FROM_MODELS, null, msgs);
			if (newImportedDocumentsFromModels != null)
				msgs = ((InternalEObject)newImportedDocumentsFromModels).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_DOCUMENTS_FROM_MODELS, null, msgs);
			msgs = basicSetImportedDocumentsFromModels(newImportedDocumentsFromModels, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_DOCUMENTS_FROM_MODELS, newImportedDocumentsFromModels, newImportedDocumentsFromModels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONSTRAINTS getImportedConstraintsFromModels() {
		return importedConstraintsFromModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportedConstraintsFromModels(CONSTRAINTS newImportedConstraintsFromModels, NotificationChain msgs) {
		CONSTRAINTS oldImportedConstraintsFromModels = importedConstraintsFromModels;
		importedConstraintsFromModels = newImportedConstraintsFromModels;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_CONSTRAINTS_FROM_MODELS, oldImportedConstraintsFromModels, newImportedConstraintsFromModels);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedConstraintsFromModels(CONSTRAINTS newImportedConstraintsFromModels) {
		if (newImportedConstraintsFromModels != importedConstraintsFromModels) {
			NotificationChain msgs = null;
			if (importedConstraintsFromModels != null)
				msgs = ((InternalEObject)importedConstraintsFromModels).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_CONSTRAINTS_FROM_MODELS, null, msgs);
			if (newImportedConstraintsFromModels != null)
				msgs = ((InternalEObject)newImportedConstraintsFromModels).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_CONSTRAINTS_FROM_MODELS, null, msgs);
			msgs = basicSetImportedConstraintsFromModels(newImportedConstraintsFromModels, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_CONSTRAINTS_FROM_MODELS, newImportedConstraintsFromModels, newImportedConstraintsFromModels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLASSREFERENCE getViewOf() {
		return viewOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetViewOf(CLASSREFERENCE newViewOf, NotificationChain msgs) {
		CLASSREFERENCE oldViewOf = viewOf;
		viewOf = newViewOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__VIEW_OF, oldViewOf, newViewOf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewOf(CLASSREFERENCE newViewOf) {
		if (newViewOf != viewOf) {
			NotificationChain msgs = null;
			if (viewOf != null)
				msgs = ((InternalEObject)viewOf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__VIEW_OF, null, msgs);
			if (newViewOf != null)
				msgs = ((InternalEObject)newViewOf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__VIEW_OF, null, msgs);
			msgs = basicSetViewOf(newViewOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__VIEW_OF, newViewOf, newViewOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROPERTIESREFERENCE getImportedPropertiesFromItem() {
		return importedPropertiesFromItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportedPropertiesFromItem(PROPERTIESREFERENCE newImportedPropertiesFromItem, NotificationChain msgs) {
		PROPERTIESREFERENCE oldImportedPropertiesFromItem = importedPropertiesFromItem;
		importedPropertiesFromItem = newImportedPropertiesFromItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_PROPERTIES_FROM_ITEM, oldImportedPropertiesFromItem, newImportedPropertiesFromItem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedPropertiesFromItem(PROPERTIESREFERENCE newImportedPropertiesFromItem) {
		if (newImportedPropertiesFromItem != importedPropertiesFromItem) {
			NotificationChain msgs = null;
			if (importedPropertiesFromItem != null)
				msgs = ((InternalEObject)importedPropertiesFromItem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_PROPERTIES_FROM_ITEM, null, msgs);
			if (newImportedPropertiesFromItem != null)
				msgs = ((InternalEObject)newImportedPropertiesFromItem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_PROPERTIES_FROM_ITEM, null, msgs);
			msgs = basicSetImportedPropertiesFromItem(newImportedPropertiesFromItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_PROPERTIES_FROM_ITEM, newImportedPropertiesFromItem, newImportedPropertiesFromItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DATATYPESREFERENCE getImportedTypesFromItem() {
		return importedTypesFromItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportedTypesFromItem(DATATYPESREFERENCE newImportedTypesFromItem, NotificationChain msgs) {
		DATATYPESREFERENCE oldImportedTypesFromItem = importedTypesFromItem;
		importedTypesFromItem = newImportedTypesFromItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_TYPES_FROM_ITEM, oldImportedTypesFromItem, newImportedTypesFromItem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedTypesFromItem(DATATYPESREFERENCE newImportedTypesFromItem) {
		if (newImportedTypesFromItem != importedTypesFromItem) {
			NotificationChain msgs = null;
			if (importedTypesFromItem != null)
				msgs = ((InternalEObject)importedTypesFromItem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_TYPES_FROM_ITEM, null, msgs);
			if (newImportedTypesFromItem != null)
				msgs = ((InternalEObject)newImportedTypesFromItem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_TYPES_FROM_ITEM, null, msgs);
			msgs = basicSetImportedTypesFromItem(newImportedTypesFromItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_TYPES_FROM_ITEM, newImportedTypesFromItem, newImportedTypesFromItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DOCUMENTSREFERENCE getImportedDocumentsFromItem() {
		return importedDocumentsFromItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportedDocumentsFromItem(DOCUMENTSREFERENCE newImportedDocumentsFromItem, NotificationChain msgs) {
		DOCUMENTSREFERENCE oldImportedDocumentsFromItem = importedDocumentsFromItem;
		importedDocumentsFromItem = newImportedDocumentsFromItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_DOCUMENTS_FROM_ITEM, oldImportedDocumentsFromItem, newImportedDocumentsFromItem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedDocumentsFromItem(DOCUMENTSREFERENCE newImportedDocumentsFromItem) {
		if (newImportedDocumentsFromItem != importedDocumentsFromItem) {
			NotificationChain msgs = null;
			if (importedDocumentsFromItem != null)
				msgs = ((InternalEObject)importedDocumentsFromItem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_DOCUMENTS_FROM_ITEM, null, msgs);
			if (newImportedDocumentsFromItem != null)
				msgs = ((InternalEObject)newImportedDocumentsFromItem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_DOCUMENTS_FROM_ITEM, null, msgs);
			msgs = basicSetImportedDocumentsFromItem(newImportedDocumentsFromItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_DOCUMENTS_FROM_ITEM, newImportedDocumentsFromItem, newImportedDocumentsFromItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONSTRAINTS getImportedConstraintsFromItem() {
		return importedConstraintsFromItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportedConstraintsFromItem(CONSTRAINTS newImportedConstraintsFromItem, NotificationChain msgs) {
		CONSTRAINTS oldImportedConstraintsFromItem = importedConstraintsFromItem;
		importedConstraintsFromItem = newImportedConstraintsFromItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_CONSTRAINTS_FROM_ITEM, oldImportedConstraintsFromItem, newImportedConstraintsFromItem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedConstraintsFromItem(CONSTRAINTS newImportedConstraintsFromItem) {
		if (newImportedConstraintsFromItem != importedConstraintsFromItem) {
			NotificationChain msgs = null;
			if (importedConstraintsFromItem != null)
				msgs = ((InternalEObject)importedConstraintsFromItem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_CONSTRAINTS_FROM_ITEM, null, msgs);
			if (newImportedConstraintsFromItem != null)
				msgs = ((InternalEObject)newImportedConstraintsFromItem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_CONSTRAINTS_FROM_ITEM, null, msgs);
			msgs = basicSetImportedConstraintsFromItem(newImportedConstraintsFromItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_CONSTRAINTS_FROM_ITEM, newImportedConstraintsFromItem, newImportedConstraintsFromItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__CREATED_VIEW:
				return basicSetCreatedView(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__VCV_RANGE:
				return basicSetVCVRange(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_PROPERTIES_FROM_VIEW:
				return basicSetImportedPropertiesFromView(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_TYPES_FROM_VIEW:
				return basicSetImportedTypesFromView(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_DOCUMENTS_FROM_VIEW:
				return basicSetImportedDocumentsFromView(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_CONSTRAINTS_FROM_VIEW:
				return basicSetImportedConstraintsFromView(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__CASE_OF:
				return basicSetCaseOf(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_PROPERTIES_FROM_MODELS:
				return basicSetImportedPropertiesFromModels(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_TYPES_FROM_MODELS:
				return basicSetImportedTypesFromModels(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_DOCUMENTS_FROM_MODELS:
				return basicSetImportedDocumentsFromModels(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_CONSTRAINTS_FROM_MODELS:
				return basicSetImportedConstraintsFromModels(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__VIEW_OF:
				return basicSetViewOf(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_PROPERTIES_FROM_ITEM:
				return basicSetImportedPropertiesFromItem(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_TYPES_FROM_ITEM:
				return basicSetImportedTypesFromItem(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_DOCUMENTS_FROM_ITEM:
				return basicSetImportedDocumentsFromItem(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_CONSTRAINTS_FROM_ITEM:
				return basicSetImportedConstraintsFromItem(null, msgs);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__CREATED_VIEW:
				return getCreatedView();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__VCV_RANGE:
				return getVCVRange();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_PROPERTIES_FROM_VIEW:
				return getImportedPropertiesFromView();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_TYPES_FROM_VIEW:
				return getImportedTypesFromView();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_DOCUMENTS_FROM_VIEW:
				return getImportedDocumentsFromView();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_CONSTRAINTS_FROM_VIEW:
				return getImportedConstraintsFromView();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__CASE_OF:
				return getCaseOf();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_PROPERTIES_FROM_MODELS:
				return getImportedPropertiesFromModels();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_TYPES_FROM_MODELS:
				return getImportedTypesFromModels();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_DOCUMENTS_FROM_MODELS:
				return getImportedDocumentsFromModels();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_CONSTRAINTS_FROM_MODELS:
				return getImportedConstraintsFromModels();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__VIEW_OF:
				return getViewOf();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_PROPERTIES_FROM_ITEM:
				return getImportedPropertiesFromItem();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_TYPES_FROM_ITEM:
				return getImportedTypesFromItem();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_DOCUMENTS_FROM_ITEM:
				return getImportedDocumentsFromItem();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_CONSTRAINTS_FROM_ITEM:
				return getImportedConstraintsFromItem();
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__CREATED_VIEW:
				setCreatedView((CLASSREFERENCE)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__VCV_RANGE:
				setVCVRange((VCVRANGE)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_PROPERTIES_FROM_VIEW:
				setImportedPropertiesFromView((PROPERTIESREFERENCE)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_TYPES_FROM_VIEW:
				setImportedTypesFromView((DATATYPESREFERENCE)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_DOCUMENTS_FROM_VIEW:
				setImportedDocumentsFromView((DOCUMENTSREFERENCE)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_CONSTRAINTS_FROM_VIEW:
				setImportedConstraintsFromView((CONSTRAINTS)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__CASE_OF:
				setCaseOf((CLASSESREFERENCE)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_PROPERTIES_FROM_MODELS:
				setImportedPropertiesFromModels((PROPERTIESREFERENCE)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_TYPES_FROM_MODELS:
				setImportedTypesFromModels((DATATYPESREFERENCE)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_DOCUMENTS_FROM_MODELS:
				setImportedDocumentsFromModels((DOCUMENTSREFERENCE)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_CONSTRAINTS_FROM_MODELS:
				setImportedConstraintsFromModels((CONSTRAINTS)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__VIEW_OF:
				setViewOf((CLASSREFERENCE)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_PROPERTIES_FROM_ITEM:
				setImportedPropertiesFromItem((PROPERTIESREFERENCE)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_TYPES_FROM_ITEM:
				setImportedTypesFromItem((DATATYPESREFERENCE)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_DOCUMENTS_FROM_ITEM:
				setImportedDocumentsFromItem((DOCUMENTSREFERENCE)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_CONSTRAINTS_FROM_ITEM:
				setImportedConstraintsFromItem((CONSTRAINTS)newValue);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__CREATED_VIEW:
				setCreatedView((CLASSREFERENCE)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__VCV_RANGE:
				setVCVRange((VCVRANGE)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_PROPERTIES_FROM_VIEW:
				setImportedPropertiesFromView((PROPERTIESREFERENCE)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_TYPES_FROM_VIEW:
				setImportedTypesFromView((DATATYPESREFERENCE)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_DOCUMENTS_FROM_VIEW:
				setImportedDocumentsFromView((DOCUMENTSREFERENCE)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_CONSTRAINTS_FROM_VIEW:
				setImportedConstraintsFromView((CONSTRAINTS)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__CASE_OF:
				setCaseOf((CLASSESREFERENCE)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_PROPERTIES_FROM_MODELS:
				setImportedPropertiesFromModels((PROPERTIESREFERENCE)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_TYPES_FROM_MODELS:
				setImportedTypesFromModels((DATATYPESREFERENCE)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_DOCUMENTS_FROM_MODELS:
				setImportedDocumentsFromModels((DOCUMENTSREFERENCE)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_CONSTRAINTS_FROM_MODELS:
				setImportedConstraintsFromModels((CONSTRAINTS)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__VIEW_OF:
				setViewOf((CLASSREFERENCE)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_PROPERTIES_FROM_ITEM:
				setImportedPropertiesFromItem((PROPERTIESREFERENCE)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_TYPES_FROM_ITEM:
				setImportedTypesFromItem((DATATYPESREFERENCE)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_DOCUMENTS_FROM_ITEM:
				setImportedDocumentsFromItem((DOCUMENTSREFERENCE)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_CONSTRAINTS_FROM_ITEM:
				setImportedConstraintsFromItem((CONSTRAINTS)null);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__CREATED_VIEW:
				return createdView != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__VCV_RANGE:
				return vCVRange != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_PROPERTIES_FROM_VIEW:
				return importedPropertiesFromView != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_TYPES_FROM_VIEW:
				return importedTypesFromView != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_DOCUMENTS_FROM_VIEW:
				return importedDocumentsFromView != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_CONSTRAINTS_FROM_VIEW:
				return importedConstraintsFromView != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__CASE_OF:
				return caseOf != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_PROPERTIES_FROM_MODELS:
				return importedPropertiesFromModels != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_TYPES_FROM_MODELS:
				return importedTypesFromModels != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_DOCUMENTS_FROM_MODELS:
				return importedDocumentsFromModels != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_CONSTRAINTS_FROM_MODELS:
				return importedConstraintsFromModels != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__VIEW_OF:
				return viewOf != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_PROPERTIES_FROM_ITEM:
				return importedPropertiesFromItem != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_TYPES_FROM_ITEM:
				return importedTypesFromItem != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_DOCUMENTS_FROM_ITEM:
				return importedDocumentsFromItem != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.FMCLASSVIEWOF__IMPORTED_CONSTRAINTS_FROM_ITEM:
				return importedConstraintsFromItem != null;
		}
		return super.eIsSet(featureID);
	}

} //FMCLASSVIEWOFImpl
