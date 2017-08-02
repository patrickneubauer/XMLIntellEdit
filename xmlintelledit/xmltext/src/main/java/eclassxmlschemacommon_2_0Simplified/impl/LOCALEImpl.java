/**
 */
package eclassxmlschemacommon_2_0Simplified.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import eclassxmlschemacommon_2_0Simplified.Eclassxmlschemacommon_2_0SimplifiedPackage;
import eclassxmlschemacommon_2_0Simplified.LOCALE;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LOCALE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eclassxmlschemacommon_2_0Simplified.impl.LOCALEImpl#getCountryRef <em>Country Ref</em>}</li>
 *   <li>{@link eclassxmlschemacommon_2_0Simplified.impl.LOCALEImpl#getLanguageRef <em>Language Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LOCALEImpl extends MinimalEObjectImpl.Container implements LOCALE {
	/**
	 * The default value of the '{@link #getCountryRef() <em>Country Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountryRef()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountryRef() <em>Country Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountryRef()
	 * @generated
	 * @ordered
	 */
	protected String countryRef = COUNTRY_REF_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LOCALEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Eclassxmlschemacommon_2_0SimplifiedPackage.Literals.LOCALE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCountryRef() {
		return countryRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountryRef(String newCountryRef) {
		String oldCountryRef = countryRef;
		countryRef = newCountryRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eclassxmlschemacommon_2_0SimplifiedPackage.LOCALE__COUNTRY_REF, oldCountryRef, countryRef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Eclassxmlschemacommon_2_0SimplifiedPackage.LOCALE__LANGUAGE_REF, oldLanguageRef, languageRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Eclassxmlschemacommon_2_0SimplifiedPackage.LOCALE__COUNTRY_REF:
				return getCountryRef();
			case Eclassxmlschemacommon_2_0SimplifiedPackage.LOCALE__LANGUAGE_REF:
				return getLanguageRef();
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
			case Eclassxmlschemacommon_2_0SimplifiedPackage.LOCALE__COUNTRY_REF:
				setCountryRef((String)newValue);
				return;
			case Eclassxmlschemacommon_2_0SimplifiedPackage.LOCALE__LANGUAGE_REF:
				setLanguageRef((String)newValue);
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
			case Eclassxmlschemacommon_2_0SimplifiedPackage.LOCALE__COUNTRY_REF:
				setCountryRef(COUNTRY_REF_EDEFAULT);
				return;
			case Eclassxmlschemacommon_2_0SimplifiedPackage.LOCALE__LANGUAGE_REF:
				setLanguageRef(LANGUAGE_REF_EDEFAULT);
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
			case Eclassxmlschemacommon_2_0SimplifiedPackage.LOCALE__COUNTRY_REF:
				return COUNTRY_REF_EDEFAULT == null ? countryRef != null : !COUNTRY_REF_EDEFAULT.equals(countryRef);
			case Eclassxmlschemacommon_2_0SimplifiedPackage.LOCALE__LANGUAGE_REF:
				return LANGUAGE_REF_EDEFAULT == null ? languageRef != null : !LANGUAGE_REF_EDEFAULT.equals(languageRef);
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
		result.append(" (countryRef: ");
		result.append(countryRef);
		result.append(", languageRef: ");
		result.append(languageRef);
		result.append(')');
		return result.toString();
	}

} //LOCALEImpl
