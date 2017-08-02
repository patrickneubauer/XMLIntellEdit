/**
 */
package eclassxmlschemacommon_2_0Simplified.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import eclassxmlschemacommon_2_0Simplified.Contact;
import eclassxmlschemacommon_2_0Simplified.Eclassxmlschemacommon_2_0SimplifiedPackage;
import eclassxmlschemacommon_2_0Simplified.LOCALIZEDSTRING;
import eclassxmlschemacommon_2_0Simplified.TYPEDSTRING;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eclassxmlschemacommon_2_0Simplified.impl.ContactImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link eclassxmlschemacommon_2_0Simplified.impl.ContactImpl#getCity <em>City</em>}</li>
 *   <li>{@link eclassxmlschemacommon_2_0Simplified.impl.ContactImpl#getZip <em>Zip</em>}</li>
 *   <li>{@link eclassxmlschemacommon_2_0Simplified.impl.ContactImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link eclassxmlschemacommon_2_0Simplified.impl.ContactImpl#getPhone <em>Phone</em>}</li>
 *   <li>{@link eclassxmlschemacommon_2_0Simplified.impl.ContactImpl#getFax <em>Fax</em>}</li>
 *   <li>{@link eclassxmlschemacommon_2_0Simplified.impl.ContactImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link eclassxmlschemacommon_2_0Simplified.impl.ContactImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link eclassxmlschemacommon_2_0Simplified.impl.ContactImpl#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link eclassxmlschemacommon_2_0Simplified.impl.ContactImpl#getOthers <em>Others</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContactImpl extends MinimalEObjectImpl.Container implements Contact {
	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected static final String CITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected String city = CITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getZip() <em>Zip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZip()
	 * @generated
	 * @ordered
	 */
	protected static final String ZIP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZip() <em>Zip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZip()
	 * @generated
	 * @ordered
	 */
	protected String zip = ZIP_EDEFAULT;

	/**
	 * The default value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected String country = COUNTRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhone() <em>Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone()
	 * @generated
	 * @ordered
	 */
	protected static final String PHONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhone() <em>Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone()
	 * @generated
	 * @ordered
	 */
	protected String phone = PHONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFax() <em>Fax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFax()
	 * @generated
	 * @ordered
	 */
	protected static final String FAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFax() <em>Fax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFax()
	 * @generated
	 * @ordered
	 */
	protected String fax = FAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRemarks() <em>Remarks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected EList<LOCALIZEDSTRING> remarks;

	/**
	 * The cached value of the '{@link #getOthers() <em>Others</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOthers()
	 * @generated
	 * @ordered
	 */
	protected EList<TYPEDSTRING> others;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Eclassxmlschemacommon_2_0SimplifiedPackage.Literals.CONTACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eclassxmlschemacommon_2_0SimplifiedPackage.CONTACT__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCity() {
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCity(String newCity) {
		String oldCity = city;
		city = newCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eclassxmlschemacommon_2_0SimplifiedPackage.CONTACT__CITY, oldCity, city));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getZip() {
		return zip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZip(String newZip) {
		String oldZip = zip;
		zip = newZip;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eclassxmlschemacommon_2_0SimplifiedPackage.CONTACT__ZIP, oldZip, zip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(String newCountry) {
		String oldCountry = country;
		country = newCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eclassxmlschemacommon_2_0SimplifiedPackage.CONTACT__COUNTRY, oldCountry, country));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhone(String newPhone) {
		String oldPhone = phone;
		phone = newPhone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eclassxmlschemacommon_2_0SimplifiedPackage.CONTACT__PHONE, oldPhone, phone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFax() {
		return fax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFax(String newFax) {
		String oldFax = fax;
		fax = newFax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eclassxmlschemacommon_2_0SimplifiedPackage.CONTACT__FAX, oldFax, fax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eclassxmlschemacommon_2_0SimplifiedPackage.CONTACT__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eclassxmlschemacommon_2_0SimplifiedPackage.CONTACT__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LOCALIZEDSTRING> getRemarks() {
		if (remarks == null) {
			remarks = new EObjectContainmentEList<LOCALIZEDSTRING>(LOCALIZEDSTRING.class, this, Eclassxmlschemacommon_2_0SimplifiedPackage.CONTACT__REMARKS);
		}
		return remarks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TYPEDSTRING> getOthers() {
		if (others == null) {
			others = new EObjectContainmentEList<TYPEDSTRING>(TYPEDSTRING.class, this, Eclassxmlschemacommon_2_0SimplifiedPackage.CONTACT__OTHERS);
		}
		return others;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Eclassxmlschemacommon_2_0SimplifiedPackage.CONTACT__REMARKS:
				return ((InternalEList<?>)getRemarks()).basicRemove(otherEnd, msgs);
			case Eclassxmlschemacommon_2_0SimplifiedPackage.CONTACT__OTHERS:
				return ((InternalEList<?>)getOthers()).basicRemove(otherEnd, msgs);
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
			case Eclassxmlschemacommon_2_0SimplifiedPackage.CONTACT__ADDRESS:
				return getAddress();
			case Eclassxmlschemacommon_2_0SimplifiedPackage.CONTACT__CITY:
				return getCity();
			case Eclassxmlschemacommon_2_0SimplifiedPackage.CONTACT__ZIP:
				return getZip();
			case Eclassxmlschemacommon_2_0SimplifiedPackage.CONTACT__COUNTRY:
				return getCountry();
			case Eclassxmlschemacommon_2_0SimplifiedPackage.CONTACT__PHONE:
				return getPhone();
			case Eclassxmlschemacommon_2_0SimplifiedPackage.CONTACT__FAX:
				return getFax();
			case Eclassxmlschemacommon_2_0SimplifiedPackage.CONTACT__EMAIL:
				return getEmail();
			case Eclassxmlschemacommon_2_0SimplifiedPackage.CONTACT__URL:
				return getUrl();
			case Eclassxmlschemacommon_2_0SimplifiedPackage.CONTACT__REMARKS:
				return getRemarks();
			case Eclassxmlschemacommon_2_0SimplifiedPackage.CONTACT__OTHERS:
				return getOthers();
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
			case Eclassxmlschemacommon_2_0SimplifiedPackage.CONTACT__ADDRESS:
				setAddress((String)newValue);
				return;
			case Eclassxmlschemacommon_2_0SimplifiedPackage.CONTACT__CITY:
				setCity((String)newValue);
				return;
			case Eclassxmlschemacommon_2_0SimplifiedPackage.CONTACT__ZIP:
				setZip((String)newValue);
				return;
			case Eclassxmlschemacommon_2_0SimplifiedPackage.CONTACT__COUNTRY:
				setCountry((String)newValue);
				return;
			case Eclassxmlschemacommon_2_0SimplifiedPackage.CONTACT__PHONE:
				setPhone((String)newValue);
				return;
			case Eclassxmlschemacommon_2_0SimplifiedPackage.CONTACT__FAX:
				setFax((String)newValue);
				return;
			case Eclassxmlschemacommon_2_0SimplifiedPackage.CONTACT__EMAIL:
				setEmail((String)newValue);
				return;
			case Eclassxmlschemacommon_2_0SimplifiedPackage.CONTACT__URL:
				setUrl((String)newValue);
				return;
			case Eclassxmlschemacommon_2_0SimplifiedPackage.CONTACT__REMARKS:
				getRemarks().clear();
				getRemarks().addAll((Collection<? extends LOCALIZEDSTRING>)newValue);
				return;
			case Eclassxmlschemacommon_2_0SimplifiedPackage.CONTACT__OTHERS:
				getOthers().clear();
				getOthers().addAll((Collection<? extends TYPEDSTRING>)newValue);
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
			case Eclassxmlschemacommon_2_0SimplifiedPackage.CONTACT__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case Eclassxmlschemacommon_2_0SimplifiedPackage.CONTACT__CITY:
				setCity(CITY_EDEFAULT);
				return;
			case Eclassxmlschemacommon_2_0SimplifiedPackage.CONTACT__ZIP:
				setZip(ZIP_EDEFAULT);
				return;
			case Eclassxmlschemacommon_2_0SimplifiedPackage.CONTACT__COUNTRY:
				setCountry(COUNTRY_EDEFAULT);
				return;
			case Eclassxmlschemacommon_2_0SimplifiedPackage.CONTACT__PHONE:
				setPhone(PHONE_EDEFAULT);
				return;
			case Eclassxmlschemacommon_2_0SimplifiedPackage.CONTACT__FAX:
				setFax(FAX_EDEFAULT);
				return;
			case Eclassxmlschemacommon_2_0SimplifiedPackage.CONTACT__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case Eclassxmlschemacommon_2_0SimplifiedPackage.CONTACT__URL:
				setUrl(URL_EDEFAULT);
				return;
			case Eclassxmlschemacommon_2_0SimplifiedPackage.CONTACT__REMARKS:
				getRemarks().clear();
				return;
			case Eclassxmlschemacommon_2_0SimplifiedPackage.CONTACT__OTHERS:
				getOthers().clear();
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
			case Eclassxmlschemacommon_2_0SimplifiedPackage.CONTACT__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
			case Eclassxmlschemacommon_2_0SimplifiedPackage.CONTACT__CITY:
				return CITY_EDEFAULT == null ? city != null : !CITY_EDEFAULT.equals(city);
			case Eclassxmlschemacommon_2_0SimplifiedPackage.CONTACT__ZIP:
				return ZIP_EDEFAULT == null ? zip != null : !ZIP_EDEFAULT.equals(zip);
			case Eclassxmlschemacommon_2_0SimplifiedPackage.CONTACT__COUNTRY:
				return COUNTRY_EDEFAULT == null ? country != null : !COUNTRY_EDEFAULT.equals(country);
			case Eclassxmlschemacommon_2_0SimplifiedPackage.CONTACT__PHONE:
				return PHONE_EDEFAULT == null ? phone != null : !PHONE_EDEFAULT.equals(phone);
			case Eclassxmlschemacommon_2_0SimplifiedPackage.CONTACT__FAX:
				return FAX_EDEFAULT == null ? fax != null : !FAX_EDEFAULT.equals(fax);
			case Eclassxmlschemacommon_2_0SimplifiedPackage.CONTACT__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case Eclassxmlschemacommon_2_0SimplifiedPackage.CONTACT__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case Eclassxmlschemacommon_2_0SimplifiedPackage.CONTACT__REMARKS:
				return remarks != null && !remarks.isEmpty();
			case Eclassxmlschemacommon_2_0SimplifiedPackage.CONTACT__OTHERS:
				return others != null && !others.isEmpty();
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
		result.append(" (address: ");
		result.append(address);
		result.append(", city: ");
		result.append(city);
		result.append(", zip: ");
		result.append(zip);
		result.append(", country: ");
		result.append(country);
		result.append(", phone: ");
		result.append(phone);
		result.append(", fax: ");
		result.append(fax);
		result.append(", email: ");
		result.append(email);
		result.append(", url: ");
		result.append(url);
		result.append(')');
		return result.toString();
	}

} //ContactImpl
