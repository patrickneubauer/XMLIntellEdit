/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.APOSTERIORISEMANTICRELATIONSHIPS;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CONTAINEDCLASSES;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CONTAINEDDATATYPES;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CONTAINEDDOCUMENTS;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CONTAINEDPROPERTIES;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CONTAINEDSUPPLIERS;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DICTIONARIESREFERENCE;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DICTIONARY;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DICTIONARYREFERENCE;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SUPPLIERREFERENCE;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DICTIONARY</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.DICTIONARYImpl#isIsComplete <em>Is Complete</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.DICTIONARYImpl#getUpdateAgreement <em>Update Agreement</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.DICTIONARYImpl#getUpdates <em>Updates</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.DICTIONARYImpl#getReferencedDictionaries <em>Referenced Dictionaries</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.DICTIONARYImpl#getResponsibleSupplier <em>Responsible Supplier</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.DICTIONARYImpl#getContainedClasses <em>Contained Classes</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.DICTIONARYImpl#getAPosterioriSemanticRelationships <em>APosteriori Semantic Relationships</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.DICTIONARYImpl#getContainedSuppliers <em>Contained Suppliers</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.DICTIONARYImpl#getContainedProperties <em>Contained Properties</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.DICTIONARYImpl#getContainedDocuments <em>Contained Documents</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.DICTIONARYImpl#getContainedDatatypes <em>Contained Datatypes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DICTIONARYImpl extends MinimalEObjectImpl.Container implements DICTIONARY {
	/**
	 * The default value of the '{@link #isIsComplete() <em>Is Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsComplete()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_COMPLETE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsComplete() <em>Is Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsComplete()
	 * @generated
	 * @ordered
	 */
	protected boolean isComplete = IS_COMPLETE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpdateAgreement() <em>Update Agreement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateAgreement()
	 * @generated
	 * @ordered
	 */
	protected static final String UPDATE_AGREEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpdateAgreement() <em>Update Agreement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateAgreement()
	 * @generated
	 * @ordered
	 */
	protected String updateAgreement = UPDATE_AGREEMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUpdates() <em>Updates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdates()
	 * @generated
	 * @ordered
	 */
	protected DICTIONARYREFERENCE updates;

	/**
	 * The cached value of the '{@link #getReferencedDictionaries() <em>Referenced Dictionaries</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedDictionaries()
	 * @generated
	 * @ordered
	 */
	protected DICTIONARIESREFERENCE referencedDictionaries;

	/**
	 * The cached value of the '{@link #getResponsibleSupplier() <em>Responsible Supplier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibleSupplier()
	 * @generated
	 * @ordered
	 */
	protected SUPPLIERREFERENCE responsibleSupplier;

	/**
	 * The cached value of the '{@link #getContainedClasses() <em>Contained Classes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedClasses()
	 * @generated
	 * @ordered
	 */
	protected CONTAINEDCLASSES containedClasses;

	/**
	 * The cached value of the '{@link #getAPosterioriSemanticRelationships() <em>APosteriori Semantic Relationships</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPosterioriSemanticRelationships()
	 * @generated
	 * @ordered
	 */
	protected APOSTERIORISEMANTICRELATIONSHIPS aPosterioriSemanticRelationships;

	/**
	 * The cached value of the '{@link #getContainedSuppliers() <em>Contained Suppliers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedSuppliers()
	 * @generated
	 * @ordered
	 */
	protected CONTAINEDSUPPLIERS containedSuppliers;

	/**
	 * The cached value of the '{@link #getContainedProperties() <em>Contained Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedProperties()
	 * @generated
	 * @ordered
	 */
	protected CONTAINEDPROPERTIES containedProperties;

	/**
	 * The cached value of the '{@link #getContainedDocuments() <em>Contained Documents</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedDocuments()
	 * @generated
	 * @ordered
	 */
	protected CONTAINEDDOCUMENTS containedDocuments;

	/**
	 * The cached value of the '{@link #getContainedDatatypes() <em>Contained Datatypes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedDatatypes()
	 * @generated
	 * @ordered
	 */
	protected CONTAINEDDATATYPES containedDatatypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DICTIONARYImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.DICTIONARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsComplete() {
		return isComplete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsComplete(boolean newIsComplete) {
		boolean oldIsComplete = isComplete;
		isComplete = newIsComplete;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__IS_COMPLETE, oldIsComplete, isComplete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUpdateAgreement() {
		return updateAgreement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdateAgreement(String newUpdateAgreement) {
		String oldUpdateAgreement = updateAgreement;
		updateAgreement = newUpdateAgreement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__UPDATE_AGREEMENT, oldUpdateAgreement, updateAgreement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DICTIONARYREFERENCE getUpdates() {
		return updates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdates(DICTIONARYREFERENCE newUpdates, NotificationChain msgs) {
		DICTIONARYREFERENCE oldUpdates = updates;
		updates = newUpdates;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__UPDATES, oldUpdates, newUpdates);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdates(DICTIONARYREFERENCE newUpdates) {
		if (newUpdates != updates) {
			NotificationChain msgs = null;
			if (updates != null)
				msgs = ((InternalEObject)updates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__UPDATES, null, msgs);
			if (newUpdates != null)
				msgs = ((InternalEObject)newUpdates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__UPDATES, null, msgs);
			msgs = basicSetUpdates(newUpdates, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__UPDATES, newUpdates, newUpdates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DICTIONARIESREFERENCE getReferencedDictionaries() {
		return referencedDictionaries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencedDictionaries(DICTIONARIESREFERENCE newReferencedDictionaries, NotificationChain msgs) {
		DICTIONARIESREFERENCE oldReferencedDictionaries = referencedDictionaries;
		referencedDictionaries = newReferencedDictionaries;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__REFERENCED_DICTIONARIES, oldReferencedDictionaries, newReferencedDictionaries);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedDictionaries(DICTIONARIESREFERENCE newReferencedDictionaries) {
		if (newReferencedDictionaries != referencedDictionaries) {
			NotificationChain msgs = null;
			if (referencedDictionaries != null)
				msgs = ((InternalEObject)referencedDictionaries).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__REFERENCED_DICTIONARIES, null, msgs);
			if (newReferencedDictionaries != null)
				msgs = ((InternalEObject)newReferencedDictionaries).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__REFERENCED_DICTIONARIES, null, msgs);
			msgs = basicSetReferencedDictionaries(newReferencedDictionaries, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__REFERENCED_DICTIONARIES, newReferencedDictionaries, newReferencedDictionaries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SUPPLIERREFERENCE getResponsibleSupplier() {
		return responsibleSupplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponsibleSupplier(SUPPLIERREFERENCE newResponsibleSupplier, NotificationChain msgs) {
		SUPPLIERREFERENCE oldResponsibleSupplier = responsibleSupplier;
		responsibleSupplier = newResponsibleSupplier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__RESPONSIBLE_SUPPLIER, oldResponsibleSupplier, newResponsibleSupplier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsibleSupplier(SUPPLIERREFERENCE newResponsibleSupplier) {
		if (newResponsibleSupplier != responsibleSupplier) {
			NotificationChain msgs = null;
			if (responsibleSupplier != null)
				msgs = ((InternalEObject)responsibleSupplier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__RESPONSIBLE_SUPPLIER, null, msgs);
			if (newResponsibleSupplier != null)
				msgs = ((InternalEObject)newResponsibleSupplier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__RESPONSIBLE_SUPPLIER, null, msgs);
			msgs = basicSetResponsibleSupplier(newResponsibleSupplier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__RESPONSIBLE_SUPPLIER, newResponsibleSupplier, newResponsibleSupplier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONTAINEDCLASSES getContainedClasses() {
		return containedClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainedClasses(CONTAINEDCLASSES newContainedClasses, NotificationChain msgs) {
		CONTAINEDCLASSES oldContainedClasses = containedClasses;
		containedClasses = newContainedClasses;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__CONTAINED_CLASSES, oldContainedClasses, newContainedClasses);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainedClasses(CONTAINEDCLASSES newContainedClasses) {
		if (newContainedClasses != containedClasses) {
			NotificationChain msgs = null;
			if (containedClasses != null)
				msgs = ((InternalEObject)containedClasses).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__CONTAINED_CLASSES, null, msgs);
			if (newContainedClasses != null)
				msgs = ((InternalEObject)newContainedClasses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__CONTAINED_CLASSES, null, msgs);
			msgs = basicSetContainedClasses(newContainedClasses, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__CONTAINED_CLASSES, newContainedClasses, newContainedClasses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APOSTERIORISEMANTICRELATIONSHIPS getAPosterioriSemanticRelationships() {
		return aPosterioriSemanticRelationships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPosterioriSemanticRelationships(APOSTERIORISEMANTICRELATIONSHIPS newAPosterioriSemanticRelationships, NotificationChain msgs) {
		APOSTERIORISEMANTICRELATIONSHIPS oldAPosterioriSemanticRelationships = aPosterioriSemanticRelationships;
		aPosterioriSemanticRelationships = newAPosterioriSemanticRelationships;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__APOSTERIORI_SEMANTIC_RELATIONSHIPS, oldAPosterioriSemanticRelationships, newAPosterioriSemanticRelationships);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPosterioriSemanticRelationships(APOSTERIORISEMANTICRELATIONSHIPS newAPosterioriSemanticRelationships) {
		if (newAPosterioriSemanticRelationships != aPosterioriSemanticRelationships) {
			NotificationChain msgs = null;
			if (aPosterioriSemanticRelationships != null)
				msgs = ((InternalEObject)aPosterioriSemanticRelationships).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__APOSTERIORI_SEMANTIC_RELATIONSHIPS, null, msgs);
			if (newAPosterioriSemanticRelationships != null)
				msgs = ((InternalEObject)newAPosterioriSemanticRelationships).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__APOSTERIORI_SEMANTIC_RELATIONSHIPS, null, msgs);
			msgs = basicSetAPosterioriSemanticRelationships(newAPosterioriSemanticRelationships, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__APOSTERIORI_SEMANTIC_RELATIONSHIPS, newAPosterioriSemanticRelationships, newAPosterioriSemanticRelationships));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONTAINEDSUPPLIERS getContainedSuppliers() {
		return containedSuppliers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainedSuppliers(CONTAINEDSUPPLIERS newContainedSuppliers, NotificationChain msgs) {
		CONTAINEDSUPPLIERS oldContainedSuppliers = containedSuppliers;
		containedSuppliers = newContainedSuppliers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__CONTAINED_SUPPLIERS, oldContainedSuppliers, newContainedSuppliers);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainedSuppliers(CONTAINEDSUPPLIERS newContainedSuppliers) {
		if (newContainedSuppliers != containedSuppliers) {
			NotificationChain msgs = null;
			if (containedSuppliers != null)
				msgs = ((InternalEObject)containedSuppliers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__CONTAINED_SUPPLIERS, null, msgs);
			if (newContainedSuppliers != null)
				msgs = ((InternalEObject)newContainedSuppliers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__CONTAINED_SUPPLIERS, null, msgs);
			msgs = basicSetContainedSuppliers(newContainedSuppliers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__CONTAINED_SUPPLIERS, newContainedSuppliers, newContainedSuppliers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONTAINEDPROPERTIES getContainedProperties() {
		return containedProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainedProperties(CONTAINEDPROPERTIES newContainedProperties, NotificationChain msgs) {
		CONTAINEDPROPERTIES oldContainedProperties = containedProperties;
		containedProperties = newContainedProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__CONTAINED_PROPERTIES, oldContainedProperties, newContainedProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainedProperties(CONTAINEDPROPERTIES newContainedProperties) {
		if (newContainedProperties != containedProperties) {
			NotificationChain msgs = null;
			if (containedProperties != null)
				msgs = ((InternalEObject)containedProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__CONTAINED_PROPERTIES, null, msgs);
			if (newContainedProperties != null)
				msgs = ((InternalEObject)newContainedProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__CONTAINED_PROPERTIES, null, msgs);
			msgs = basicSetContainedProperties(newContainedProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__CONTAINED_PROPERTIES, newContainedProperties, newContainedProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONTAINEDDOCUMENTS getContainedDocuments() {
		return containedDocuments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainedDocuments(CONTAINEDDOCUMENTS newContainedDocuments, NotificationChain msgs) {
		CONTAINEDDOCUMENTS oldContainedDocuments = containedDocuments;
		containedDocuments = newContainedDocuments;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__CONTAINED_DOCUMENTS, oldContainedDocuments, newContainedDocuments);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainedDocuments(CONTAINEDDOCUMENTS newContainedDocuments) {
		if (newContainedDocuments != containedDocuments) {
			NotificationChain msgs = null;
			if (containedDocuments != null)
				msgs = ((InternalEObject)containedDocuments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__CONTAINED_DOCUMENTS, null, msgs);
			if (newContainedDocuments != null)
				msgs = ((InternalEObject)newContainedDocuments).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__CONTAINED_DOCUMENTS, null, msgs);
			msgs = basicSetContainedDocuments(newContainedDocuments, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__CONTAINED_DOCUMENTS, newContainedDocuments, newContainedDocuments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONTAINEDDATATYPES getContainedDatatypes() {
		return containedDatatypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainedDatatypes(CONTAINEDDATATYPES newContainedDatatypes, NotificationChain msgs) {
		CONTAINEDDATATYPES oldContainedDatatypes = containedDatatypes;
		containedDatatypes = newContainedDatatypes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__CONTAINED_DATATYPES, oldContainedDatatypes, newContainedDatatypes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainedDatatypes(CONTAINEDDATATYPES newContainedDatatypes) {
		if (newContainedDatatypes != containedDatatypes) {
			NotificationChain msgs = null;
			if (containedDatatypes != null)
				msgs = ((InternalEObject)containedDatatypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__CONTAINED_DATATYPES, null, msgs);
			if (newContainedDatatypes != null)
				msgs = ((InternalEObject)newContainedDatatypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__CONTAINED_DATATYPES, null, msgs);
			msgs = basicSetContainedDatatypes(newContainedDatatypes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__CONTAINED_DATATYPES, newContainedDatatypes, newContainedDatatypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__UPDATES:
				return basicSetUpdates(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__REFERENCED_DICTIONARIES:
				return basicSetReferencedDictionaries(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__RESPONSIBLE_SUPPLIER:
				return basicSetResponsibleSupplier(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__CONTAINED_CLASSES:
				return basicSetContainedClasses(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__APOSTERIORI_SEMANTIC_RELATIONSHIPS:
				return basicSetAPosterioriSemanticRelationships(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__CONTAINED_SUPPLIERS:
				return basicSetContainedSuppliers(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__CONTAINED_PROPERTIES:
				return basicSetContainedProperties(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__CONTAINED_DOCUMENTS:
				return basicSetContainedDocuments(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__CONTAINED_DATATYPES:
				return basicSetContainedDatatypes(null, msgs);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__IS_COMPLETE:
				return isIsComplete();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__UPDATE_AGREEMENT:
				return getUpdateAgreement();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__UPDATES:
				return getUpdates();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__REFERENCED_DICTIONARIES:
				return getReferencedDictionaries();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__RESPONSIBLE_SUPPLIER:
				return getResponsibleSupplier();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__CONTAINED_CLASSES:
				return getContainedClasses();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__APOSTERIORI_SEMANTIC_RELATIONSHIPS:
				return getAPosterioriSemanticRelationships();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__CONTAINED_SUPPLIERS:
				return getContainedSuppliers();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__CONTAINED_PROPERTIES:
				return getContainedProperties();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__CONTAINED_DOCUMENTS:
				return getContainedDocuments();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__CONTAINED_DATATYPES:
				return getContainedDatatypes();
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__IS_COMPLETE:
				setIsComplete((Boolean)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__UPDATE_AGREEMENT:
				setUpdateAgreement((String)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__UPDATES:
				setUpdates((DICTIONARYREFERENCE)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__REFERENCED_DICTIONARIES:
				setReferencedDictionaries((DICTIONARIESREFERENCE)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__RESPONSIBLE_SUPPLIER:
				setResponsibleSupplier((SUPPLIERREFERENCE)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__CONTAINED_CLASSES:
				setContainedClasses((CONTAINEDCLASSES)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__APOSTERIORI_SEMANTIC_RELATIONSHIPS:
				setAPosterioriSemanticRelationships((APOSTERIORISEMANTICRELATIONSHIPS)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__CONTAINED_SUPPLIERS:
				setContainedSuppliers((CONTAINEDSUPPLIERS)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__CONTAINED_PROPERTIES:
				setContainedProperties((CONTAINEDPROPERTIES)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__CONTAINED_DOCUMENTS:
				setContainedDocuments((CONTAINEDDOCUMENTS)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__CONTAINED_DATATYPES:
				setContainedDatatypes((CONTAINEDDATATYPES)newValue);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__IS_COMPLETE:
				setIsComplete(IS_COMPLETE_EDEFAULT);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__UPDATE_AGREEMENT:
				setUpdateAgreement(UPDATE_AGREEMENT_EDEFAULT);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__UPDATES:
				setUpdates((DICTIONARYREFERENCE)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__REFERENCED_DICTIONARIES:
				setReferencedDictionaries((DICTIONARIESREFERENCE)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__RESPONSIBLE_SUPPLIER:
				setResponsibleSupplier((SUPPLIERREFERENCE)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__CONTAINED_CLASSES:
				setContainedClasses((CONTAINEDCLASSES)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__APOSTERIORI_SEMANTIC_RELATIONSHIPS:
				setAPosterioriSemanticRelationships((APOSTERIORISEMANTICRELATIONSHIPS)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__CONTAINED_SUPPLIERS:
				setContainedSuppliers((CONTAINEDSUPPLIERS)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__CONTAINED_PROPERTIES:
				setContainedProperties((CONTAINEDPROPERTIES)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__CONTAINED_DOCUMENTS:
				setContainedDocuments((CONTAINEDDOCUMENTS)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__CONTAINED_DATATYPES:
				setContainedDatatypes((CONTAINEDDATATYPES)null);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__IS_COMPLETE:
				return isComplete != IS_COMPLETE_EDEFAULT;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__UPDATE_AGREEMENT:
				return UPDATE_AGREEMENT_EDEFAULT == null ? updateAgreement != null : !UPDATE_AGREEMENT_EDEFAULT.equals(updateAgreement);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__UPDATES:
				return updates != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__REFERENCED_DICTIONARIES:
				return referencedDictionaries != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__RESPONSIBLE_SUPPLIER:
				return responsibleSupplier != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__CONTAINED_CLASSES:
				return containedClasses != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__APOSTERIORI_SEMANTIC_RELATIONSHIPS:
				return aPosterioriSemanticRelationships != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__CONTAINED_SUPPLIERS:
				return containedSuppliers != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__CONTAINED_PROPERTIES:
				return containedProperties != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__CONTAINED_DOCUMENTS:
				return containedDocuments != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICTIONARY__CONTAINED_DATATYPES:
				return containedDatatypes != null;
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
		result.append(" (isComplete: ");
		result.append(isComplete);
		result.append(", updateAgreement: ");
		result.append(updateAgreement);
		result.append(')');
		return result.toString();
	}

} //DICTIONARYImpl
