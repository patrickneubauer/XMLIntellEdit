/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.LANGUAGE;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SUPPLIERREFERENCE;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.TRANSLATIONDATA;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TRANSLATIONDATA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.TRANSLATIONDATAImpl#getTranslationRevision <em>Translation Revision</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.TRANSLATIONDATAImpl#getDateOfCurrentTranslationRevision <em>Date Of Current Translation Revision</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.TRANSLATIONDATAImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.TRANSLATIONDATAImpl#getResponsibleTranslator <em>Responsible Translator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TRANSLATIONDATAImpl extends MinimalEObjectImpl.Container implements TRANSLATIONDATA {
	/**
	 * The default value of the '{@link #getTranslationRevision() <em>Translation Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslationRevision()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSLATION_REVISION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTranslationRevision() <em>Translation Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslationRevision()
	 * @generated
	 * @ordered
	 */
	protected String translationRevision = TRANSLATION_REVISION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateOfCurrentTranslationRevision() <em>Date Of Current Translation Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfCurrentTranslationRevision()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_OF_CURRENT_TRANSLATION_REVISION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateOfCurrentTranslationRevision() <em>Date Of Current Translation Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfCurrentTranslationRevision()
	 * @generated
	 * @ordered
	 */
	protected String dateOfCurrentTranslationRevision = DATE_OF_CURRENT_TRANSLATION_REVISION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected LANGUAGE language;

	/**
	 * The cached value of the '{@link #getResponsibleTranslator() <em>Responsible Translator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibleTranslator()
	 * @generated
	 * @ordered
	 */
	protected SUPPLIERREFERENCE responsibleTranslator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TRANSLATIONDATAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.TRANSLATIONDATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTranslationRevision() {
		return translationRevision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTranslationRevision(String newTranslationRevision) {
		String oldTranslationRevision = translationRevision;
		translationRevision = newTranslationRevision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.TRANSLATIONDATA__TRANSLATION_REVISION, oldTranslationRevision, translationRevision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDateOfCurrentTranslationRevision() {
		return dateOfCurrentTranslationRevision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateOfCurrentTranslationRevision(String newDateOfCurrentTranslationRevision) {
		String oldDateOfCurrentTranslationRevision = dateOfCurrentTranslationRevision;
		dateOfCurrentTranslationRevision = newDateOfCurrentTranslationRevision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.TRANSLATIONDATA__DATE_OF_CURRENT_TRANSLATION_REVISION, oldDateOfCurrentTranslationRevision, dateOfCurrentTranslationRevision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LANGUAGE getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLanguage(LANGUAGE newLanguage, NotificationChain msgs) {
		LANGUAGE oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.TRANSLATIONDATA__LANGUAGE, oldLanguage, newLanguage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(LANGUAGE newLanguage) {
		if (newLanguage != language) {
			NotificationChain msgs = null;
			if (language != null)
				msgs = ((InternalEObject)language).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.TRANSLATIONDATA__LANGUAGE, null, msgs);
			if (newLanguage != null)
				msgs = ((InternalEObject)newLanguage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.TRANSLATIONDATA__LANGUAGE, null, msgs);
			msgs = basicSetLanguage(newLanguage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.TRANSLATIONDATA__LANGUAGE, newLanguage, newLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SUPPLIERREFERENCE getResponsibleTranslator() {
		return responsibleTranslator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponsibleTranslator(SUPPLIERREFERENCE newResponsibleTranslator, NotificationChain msgs) {
		SUPPLIERREFERENCE oldResponsibleTranslator = responsibleTranslator;
		responsibleTranslator = newResponsibleTranslator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.TRANSLATIONDATA__RESPONSIBLE_TRANSLATOR, oldResponsibleTranslator, newResponsibleTranslator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsibleTranslator(SUPPLIERREFERENCE newResponsibleTranslator) {
		if (newResponsibleTranslator != responsibleTranslator) {
			NotificationChain msgs = null;
			if (responsibleTranslator != null)
				msgs = ((InternalEObject)responsibleTranslator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.TRANSLATIONDATA__RESPONSIBLE_TRANSLATOR, null, msgs);
			if (newResponsibleTranslator != null)
				msgs = ((InternalEObject)newResponsibleTranslator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.TRANSLATIONDATA__RESPONSIBLE_TRANSLATOR, null, msgs);
			msgs = basicSetResponsibleTranslator(newResponsibleTranslator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.TRANSLATIONDATA__RESPONSIBLE_TRANSLATOR, newResponsibleTranslator, newResponsibleTranslator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.TRANSLATIONDATA__LANGUAGE:
				return basicSetLanguage(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.TRANSLATIONDATA__RESPONSIBLE_TRANSLATOR:
				return basicSetResponsibleTranslator(null, msgs);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.TRANSLATIONDATA__TRANSLATION_REVISION:
				return getTranslationRevision();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.TRANSLATIONDATA__DATE_OF_CURRENT_TRANSLATION_REVISION:
				return getDateOfCurrentTranslationRevision();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.TRANSLATIONDATA__LANGUAGE:
				return getLanguage();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.TRANSLATIONDATA__RESPONSIBLE_TRANSLATOR:
				return getResponsibleTranslator();
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.TRANSLATIONDATA__TRANSLATION_REVISION:
				setTranslationRevision((String)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.TRANSLATIONDATA__DATE_OF_CURRENT_TRANSLATION_REVISION:
				setDateOfCurrentTranslationRevision((String)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.TRANSLATIONDATA__LANGUAGE:
				setLanguage((LANGUAGE)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.TRANSLATIONDATA__RESPONSIBLE_TRANSLATOR:
				setResponsibleTranslator((SUPPLIERREFERENCE)newValue);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.TRANSLATIONDATA__TRANSLATION_REVISION:
				setTranslationRevision(TRANSLATION_REVISION_EDEFAULT);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.TRANSLATIONDATA__DATE_OF_CURRENT_TRANSLATION_REVISION:
				setDateOfCurrentTranslationRevision(DATE_OF_CURRENT_TRANSLATION_REVISION_EDEFAULT);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.TRANSLATIONDATA__LANGUAGE:
				setLanguage((LANGUAGE)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.TRANSLATIONDATA__RESPONSIBLE_TRANSLATOR:
				setResponsibleTranslator((SUPPLIERREFERENCE)null);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.TRANSLATIONDATA__TRANSLATION_REVISION:
				return TRANSLATION_REVISION_EDEFAULT == null ? translationRevision != null : !TRANSLATION_REVISION_EDEFAULT.equals(translationRevision);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.TRANSLATIONDATA__DATE_OF_CURRENT_TRANSLATION_REVISION:
				return DATE_OF_CURRENT_TRANSLATION_REVISION_EDEFAULT == null ? dateOfCurrentTranslationRevision != null : !DATE_OF_CURRENT_TRANSLATION_REVISION_EDEFAULT.equals(dateOfCurrentTranslationRevision);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.TRANSLATIONDATA__LANGUAGE:
				return language != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.TRANSLATIONDATA__RESPONSIBLE_TRANSLATOR:
				return responsibleTranslator != null;
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
		result.append(" (translationRevision: ");
		result.append(translationRevision);
		result.append(", dateOfCurrentTranslationRevision: ");
		result.append(dateOfCurrentTranslationRevision);
		result.append(')');
		return result.toString();
	}

} //TRANSLATIONDATAImpl
