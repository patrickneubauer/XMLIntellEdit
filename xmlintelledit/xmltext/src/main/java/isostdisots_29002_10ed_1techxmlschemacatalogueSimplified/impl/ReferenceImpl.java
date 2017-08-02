/**
 */
package isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage;
import isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.impl.ReferenceImpl#getOrganizationCode <em>Organization Code</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.impl.ReferenceImpl#getOrganizationRef <em>Organization Ref</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.impl.ReferenceImpl#getReferenceNumber <em>Reference Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceImpl extends MinimalEObjectImpl.Container implements Reference {
	/**
	 * The default value of the '{@link #getOrganizationCode() <em>Organization Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationCode()
	 * @generated
	 * @ordered
	 */
	protected static final String ORGANIZATION_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrganizationCode() <em>Organization Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationCode()
	 * @generated
	 * @ordered
	 */
	protected String organizationCode = ORGANIZATION_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrganizationRef() <em>Organization Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationRef()
	 * @generated
	 * @ordered
	 */
	protected static final String ORGANIZATION_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrganizationRef() <em>Organization Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationRef()
	 * @generated
	 * @ordered
	 */
	protected String organizationRef = ORGANIZATION_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getReferenceNumber() <em>Reference Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferenceNumber() <em>Reference Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceNumber()
	 * @generated
	 * @ordered
	 */
	protected String referenceNumber = REFERENCE_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.Literals.REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrganizationCode() {
		return organizationCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganizationCode(String newOrganizationCode) {
		String oldOrganizationCode = organizationCode;
		organizationCode = newOrganizationCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.REFERENCE__ORGANIZATION_CODE, oldOrganizationCode, organizationCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrganizationRef() {
		return organizationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganizationRef(String newOrganizationRef) {
		String oldOrganizationRef = organizationRef;
		organizationRef = newOrganizationRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.REFERENCE__ORGANIZATION_REF, oldOrganizationRef, organizationRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReferenceNumber() {
		return referenceNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceNumber(String newReferenceNumber) {
		String oldReferenceNumber = referenceNumber;
		referenceNumber = newReferenceNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.REFERENCE__REFERENCE_NUMBER, oldReferenceNumber, referenceNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.REFERENCE__ORGANIZATION_CODE:
				return getOrganizationCode();
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.REFERENCE__ORGANIZATION_REF:
				return getOrganizationRef();
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.REFERENCE__REFERENCE_NUMBER:
				return getReferenceNumber();
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
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.REFERENCE__ORGANIZATION_CODE:
				setOrganizationCode((String)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.REFERENCE__ORGANIZATION_REF:
				setOrganizationRef((String)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.REFERENCE__REFERENCE_NUMBER:
				setReferenceNumber((String)newValue);
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
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.REFERENCE__ORGANIZATION_CODE:
				setOrganizationCode(ORGANIZATION_CODE_EDEFAULT);
				return;
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.REFERENCE__ORGANIZATION_REF:
				setOrganizationRef(ORGANIZATION_REF_EDEFAULT);
				return;
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.REFERENCE__REFERENCE_NUMBER:
				setReferenceNumber(REFERENCE_NUMBER_EDEFAULT);
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
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.REFERENCE__ORGANIZATION_CODE:
				return ORGANIZATION_CODE_EDEFAULT == null ? organizationCode != null : !ORGANIZATION_CODE_EDEFAULT.equals(organizationCode);
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.REFERENCE__ORGANIZATION_REF:
				return ORGANIZATION_REF_EDEFAULT == null ? organizationRef != null : !ORGANIZATION_REF_EDEFAULT.equals(organizationRef);
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.REFERENCE__REFERENCE_NUMBER:
				return REFERENCE_NUMBER_EDEFAULT == null ? referenceNumber != null : !REFERENCE_NUMBER_EDEFAULT.equals(referenceNumber);
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
		result.append(" (organizationCode: ");
		result.append(organizationCode);
		result.append(", organizationRef: ");
		result.append(organizationRef);
		result.append(", referenceNumber: ");
		result.append(referenceNumber);
		result.append(')');
		return result.toString();
	}

} //ReferenceImpl
