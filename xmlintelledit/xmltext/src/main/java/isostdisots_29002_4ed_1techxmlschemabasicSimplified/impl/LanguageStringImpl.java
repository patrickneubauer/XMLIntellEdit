/**
 */
package isostdisots_29002_4ed_1techxmlschemabasicSimplified.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import isostdisots_29002_4ed_1techxmlschemabasicSimplified.Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage;
import isostdisots_29002_4ed_1techxmlschemabasicSimplified.LanguageString;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Language String</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isostdisots_29002_4ed_1techxmlschemabasicSimplified.impl.LanguageStringImpl#getContent <em>Content</em>}</li>
 *   <li>{@link isostdisots_29002_4ed_1techxmlschemabasicSimplified.impl.LanguageStringImpl#getLanguageRef <em>Language Ref</em>}</li>
 *   <li>{@link isostdisots_29002_4ed_1techxmlschemabasicSimplified.impl.LanguageStringImpl#getLanguageCode <em>Language Code</em>}</li>
 *   <li>{@link isostdisots_29002_4ed_1techxmlschemabasicSimplified.impl.LanguageStringImpl#getCountryCode <em>Country Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LanguageStringImpl extends MinimalEObjectImpl.Container implements LanguageString {
	/**
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected String content = CONTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguageRef() <em>Language Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageRef()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguageRef() <em>Language Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageRef()
	 * @generated
	 * @ordered
	 */
	protected String languageRef = LANGUAGE_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguageCode() <em>Language Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageCode()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguageCode() <em>Language Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageCode()
	 * @generated
	 * @ordered
	 */
	protected String languageCode = LANGUAGE_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCountryCode() <em>Country Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountryCode()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountryCode() <em>Country Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountryCode()
	 * @generated
	 * @ordered
	 */
	protected String countryCode = COUNTRY_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LanguageStringImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage.Literals.LANGUAGE_STRING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(String newContent) {
		String oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage.LANGUAGE_STRING__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLanguageRef() {
		return languageRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguageRef(String newLanguageRef) {
		String oldLanguageRef = languageRef;
		languageRef = newLanguageRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage.LANGUAGE_STRING__LANGUAGE_REF, oldLanguageRef, languageRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLanguageCode() {
		return languageCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguageCode(String newLanguageCode) {
		String oldLanguageCode = languageCode;
		languageCode = newLanguageCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage.LANGUAGE_STRING__LANGUAGE_CODE, oldLanguageCode, languageCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountryCode(String newCountryCode) {
		String oldCountryCode = countryCode;
		countryCode = newCountryCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage.LANGUAGE_STRING__COUNTRY_CODE, oldCountryCode, countryCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage.LANGUAGE_STRING__CONTENT:
				return getContent();
			case Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage.LANGUAGE_STRING__LANGUAGE_REF:
				return getLanguageRef();
			case Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage.LANGUAGE_STRING__LANGUAGE_CODE:
				return getLanguageCode();
			case Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage.LANGUAGE_STRING__COUNTRY_CODE:
				return getCountryCode();
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
			case Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage.LANGUAGE_STRING__CONTENT:
				setContent((String)newValue);
				return;
			case Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage.LANGUAGE_STRING__LANGUAGE_REF:
				setLanguageRef((String)newValue);
				return;
			case Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage.LANGUAGE_STRING__LANGUAGE_CODE:
				setLanguageCode((String)newValue);
				return;
			case Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage.LANGUAGE_STRING__COUNTRY_CODE:
				setCountryCode((String)newValue);
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
			case Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage.LANGUAGE_STRING__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage.LANGUAGE_STRING__LANGUAGE_REF:
				setLanguageRef(LANGUAGE_REF_EDEFAULT);
				return;
			case Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage.LANGUAGE_STRING__LANGUAGE_CODE:
				setLanguageCode(LANGUAGE_CODE_EDEFAULT);
				return;
			case Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage.LANGUAGE_STRING__COUNTRY_CODE:
				setCountryCode(COUNTRY_CODE_EDEFAULT);
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
			case Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage.LANGUAGE_STRING__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
			case Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage.LANGUAGE_STRING__LANGUAGE_REF:
				return LANGUAGE_REF_EDEFAULT == null ? languageRef != null : !LANGUAGE_REF_EDEFAULT.equals(languageRef);
			case Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage.LANGUAGE_STRING__LANGUAGE_CODE:
				return LANGUAGE_CODE_EDEFAULT == null ? languageCode != null : !LANGUAGE_CODE_EDEFAULT.equals(languageCode);
			case Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage.LANGUAGE_STRING__COUNTRY_CODE:
				return COUNTRY_CODE_EDEFAULT == null ? countryCode != null : !COUNTRY_CODE_EDEFAULT.equals(countryCode);
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
		result.append(" (content: ");
		result.append(content);
		result.append(", languageRef: ");
		result.append(languageRef);
		result.append(", languageCode: ");
		result.append(languageCode);
		result.append(", countryCode: ");
		result.append(countryCode);
		result.append(')');
		return result.toString();
	}

} //LanguageStringImpl
