/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASSEXTENSION;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASSIFICATION;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASSREFERENCE;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PROPERTIESREFERENCE;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.RECOMMENDEDPRESENTATION;
import isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Catalogue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CLASSEXTENSION</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.CLASSEXTENSIONImpl#getContentVersion <em>Content Version</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.CLASSEXTENSIONImpl#getContentRevision <em>Content Revision</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.CLASSEXTENSIONImpl#isTableLike <em>Table Like</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.CLASSEXTENSIONImpl#getDictionaryDefinition <em>Dictionary Definition</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.CLASSEXTENSIONImpl#getRecommendedPresentation <em>Recommended Presentation</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.CLASSEXTENSIONImpl#getClassification <em>Classification</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.CLASSEXTENSIONImpl#getInstanceIdentification <em>Instance Identification</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.CLASSEXTENSIONImpl#getPopulation <em>Population</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CLASSEXTENSIONImpl extends MinimalEObjectImpl.Container implements CLASSEXTENSION {
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
	 * The default value of the '{@link #getContentRevision() <em>Content Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentRevision()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_REVISION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentRevision() <em>Content Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentRevision()
	 * @generated
	 * @ordered
	 */
	protected String contentRevision = CONTENT_REVISION_EDEFAULT;

	/**
	 * The default value of the '{@link #isTableLike() <em>Table Like</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTableLike()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TABLE_LIKE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTableLike() <em>Table Like</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTableLike()
	 * @generated
	 * @ordered
	 */
	protected boolean tableLike = TABLE_LIKE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDictionaryDefinition() <em>Dictionary Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDictionaryDefinition()
	 * @generated
	 * @ordered
	 */
	protected CLASSREFERENCE dictionaryDefinition;

	/**
	 * The cached value of the '{@link #getRecommendedPresentation() <em>Recommended Presentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecommendedPresentation()
	 * @generated
	 * @ordered
	 */
	protected RECOMMENDEDPRESENTATION recommendedPresentation;

	/**
	 * The cached value of the '{@link #getClassification() <em>Classification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassification()
	 * @generated
	 * @ordered
	 */
	protected CLASSIFICATION classification;

	/**
	 * The cached value of the '{@link #getInstanceIdentification() <em>Instance Identification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceIdentification()
	 * @generated
	 * @ordered
	 */
	protected PROPERTIESREFERENCE instanceIdentification;

	/**
	 * The cached value of the '{@link #getPopulation() <em>Population</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulation()
	 * @generated
	 * @ordered
	 */
	protected Catalogue population;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CLASSEXTENSIONImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.CLASSEXTENSION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION__CONTENT_VERSION, oldContentVersion, contentVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContentRevision() {
		return contentRevision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentRevision(String newContentRevision) {
		String oldContentRevision = contentRevision;
		contentRevision = newContentRevision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION__CONTENT_REVISION, oldContentRevision, contentRevision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTableLike() {
		return tableLike;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableLike(boolean newTableLike) {
		boolean oldTableLike = tableLike;
		tableLike = newTableLike;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION__TABLE_LIKE, oldTableLike, tableLike));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLASSREFERENCE getDictionaryDefinition() {
		return dictionaryDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDictionaryDefinition(CLASSREFERENCE newDictionaryDefinition, NotificationChain msgs) {
		CLASSREFERENCE oldDictionaryDefinition = dictionaryDefinition;
		dictionaryDefinition = newDictionaryDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION__DICTIONARY_DEFINITION, oldDictionaryDefinition, newDictionaryDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDictionaryDefinition(CLASSREFERENCE newDictionaryDefinition) {
		if (newDictionaryDefinition != dictionaryDefinition) {
			NotificationChain msgs = null;
			if (dictionaryDefinition != null)
				msgs = ((InternalEObject)dictionaryDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION__DICTIONARY_DEFINITION, null, msgs);
			if (newDictionaryDefinition != null)
				msgs = ((InternalEObject)newDictionaryDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION__DICTIONARY_DEFINITION, null, msgs);
			msgs = basicSetDictionaryDefinition(newDictionaryDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION__DICTIONARY_DEFINITION, newDictionaryDefinition, newDictionaryDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RECOMMENDEDPRESENTATION getRecommendedPresentation() {
		return recommendedPresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecommendedPresentation(RECOMMENDEDPRESENTATION newRecommendedPresentation, NotificationChain msgs) {
		RECOMMENDEDPRESENTATION oldRecommendedPresentation = recommendedPresentation;
		recommendedPresentation = newRecommendedPresentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION__RECOMMENDED_PRESENTATION, oldRecommendedPresentation, newRecommendedPresentation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecommendedPresentation(RECOMMENDEDPRESENTATION newRecommendedPresentation) {
		if (newRecommendedPresentation != recommendedPresentation) {
			NotificationChain msgs = null;
			if (recommendedPresentation != null)
				msgs = ((InternalEObject)recommendedPresentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION__RECOMMENDED_PRESENTATION, null, msgs);
			if (newRecommendedPresentation != null)
				msgs = ((InternalEObject)newRecommendedPresentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION__RECOMMENDED_PRESENTATION, null, msgs);
			msgs = basicSetRecommendedPresentation(newRecommendedPresentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION__RECOMMENDED_PRESENTATION, newRecommendedPresentation, newRecommendedPresentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLASSIFICATION getClassification() {
		return classification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassification(CLASSIFICATION newClassification, NotificationChain msgs) {
		CLASSIFICATION oldClassification = classification;
		classification = newClassification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION__CLASSIFICATION, oldClassification, newClassification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassification(CLASSIFICATION newClassification) {
		if (newClassification != classification) {
			NotificationChain msgs = null;
			if (classification != null)
				msgs = ((InternalEObject)classification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION__CLASSIFICATION, null, msgs);
			if (newClassification != null)
				msgs = ((InternalEObject)newClassification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION__CLASSIFICATION, null, msgs);
			msgs = basicSetClassification(newClassification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION__CLASSIFICATION, newClassification, newClassification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROPERTIESREFERENCE getInstanceIdentification() {
		return instanceIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstanceIdentification(PROPERTIESREFERENCE newInstanceIdentification, NotificationChain msgs) {
		PROPERTIESREFERENCE oldInstanceIdentification = instanceIdentification;
		instanceIdentification = newInstanceIdentification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION__INSTANCE_IDENTIFICATION, oldInstanceIdentification, newInstanceIdentification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceIdentification(PROPERTIESREFERENCE newInstanceIdentification) {
		if (newInstanceIdentification != instanceIdentification) {
			NotificationChain msgs = null;
			if (instanceIdentification != null)
				msgs = ((InternalEObject)instanceIdentification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION__INSTANCE_IDENTIFICATION, null, msgs);
			if (newInstanceIdentification != null)
				msgs = ((InternalEObject)newInstanceIdentification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION__INSTANCE_IDENTIFICATION, null, msgs);
			msgs = basicSetInstanceIdentification(newInstanceIdentification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION__INSTANCE_IDENTIFICATION, newInstanceIdentification, newInstanceIdentification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Catalogue getPopulation() {
		return population;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPopulation(Catalogue newPopulation, NotificationChain msgs) {
		Catalogue oldPopulation = population;
		population = newPopulation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION__POPULATION, oldPopulation, newPopulation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPopulation(Catalogue newPopulation) {
		if (newPopulation != population) {
			NotificationChain msgs = null;
			if (population != null)
				msgs = ((InternalEObject)population).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION__POPULATION, null, msgs);
			if (newPopulation != null)
				msgs = ((InternalEObject)newPopulation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION__POPULATION, null, msgs);
			msgs = basicSetPopulation(newPopulation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION__POPULATION, newPopulation, newPopulation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION__DICTIONARY_DEFINITION:
				return basicSetDictionaryDefinition(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION__RECOMMENDED_PRESENTATION:
				return basicSetRecommendedPresentation(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION__CLASSIFICATION:
				return basicSetClassification(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION__INSTANCE_IDENTIFICATION:
				return basicSetInstanceIdentification(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION__POPULATION:
				return basicSetPopulation(null, msgs);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION__CONTENT_VERSION:
				return getContentVersion();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION__CONTENT_REVISION:
				return getContentRevision();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION__TABLE_LIKE:
				return isTableLike();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION__DICTIONARY_DEFINITION:
				return getDictionaryDefinition();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION__RECOMMENDED_PRESENTATION:
				return getRecommendedPresentation();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION__CLASSIFICATION:
				return getClassification();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION__INSTANCE_IDENTIFICATION:
				return getInstanceIdentification();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION__POPULATION:
				return getPopulation();
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION__CONTENT_VERSION:
				setContentVersion((String)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION__CONTENT_REVISION:
				setContentRevision((String)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION__TABLE_LIKE:
				setTableLike((Boolean)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION__DICTIONARY_DEFINITION:
				setDictionaryDefinition((CLASSREFERENCE)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION__RECOMMENDED_PRESENTATION:
				setRecommendedPresentation((RECOMMENDEDPRESENTATION)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION__CLASSIFICATION:
				setClassification((CLASSIFICATION)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION__INSTANCE_IDENTIFICATION:
				setInstanceIdentification((PROPERTIESREFERENCE)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION__POPULATION:
				setPopulation((Catalogue)newValue);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION__CONTENT_VERSION:
				setContentVersion(CONTENT_VERSION_EDEFAULT);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION__CONTENT_REVISION:
				setContentRevision(CONTENT_REVISION_EDEFAULT);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION__TABLE_LIKE:
				setTableLike(TABLE_LIKE_EDEFAULT);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION__DICTIONARY_DEFINITION:
				setDictionaryDefinition((CLASSREFERENCE)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION__RECOMMENDED_PRESENTATION:
				setRecommendedPresentation((RECOMMENDEDPRESENTATION)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION__CLASSIFICATION:
				setClassification((CLASSIFICATION)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION__INSTANCE_IDENTIFICATION:
				setInstanceIdentification((PROPERTIESREFERENCE)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION__POPULATION:
				setPopulation((Catalogue)null);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION__CONTENT_VERSION:
				return CONTENT_VERSION_EDEFAULT == null ? contentVersion != null : !CONTENT_VERSION_EDEFAULT.equals(contentVersion);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION__CONTENT_REVISION:
				return CONTENT_REVISION_EDEFAULT == null ? contentRevision != null : !CONTENT_REVISION_EDEFAULT.equals(contentRevision);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION__TABLE_LIKE:
				return tableLike != TABLE_LIKE_EDEFAULT;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION__DICTIONARY_DEFINITION:
				return dictionaryDefinition != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION__RECOMMENDED_PRESENTATION:
				return recommendedPresentation != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION__CLASSIFICATION:
				return classification != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION__INSTANCE_IDENTIFICATION:
				return instanceIdentification != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSEXTENSION__POPULATION:
				return population != null;
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
		result.append(" (contentVersion: ");
		result.append(contentVersion);
		result.append(", contentRevision: ");
		result.append(contentRevision);
		result.append(", tableLike: ");
		result.append(tableLike);
		result.append(')');
		return result.toString();
	}

} //CLASSEXTENSIONImpl
