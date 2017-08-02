/**
 */
package caex.impl;

import caex.CaexPackage;
import caex.InternalLink;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Internal Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link caex.impl.InternalLinkImpl#getRefPartnerSideA <em>Ref Partner Side A</em>}</li>
 *   <li>{@link caex.impl.InternalLinkImpl#getRefPartnerSideB <em>Ref Partner Side B</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InternalLinkImpl extends CAEXObjectImpl implements InternalLink {
	/**
	 * The default value of the '{@link #getRefPartnerSideA() <em>Ref Partner Side A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefPartnerSideA()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_PARTNER_SIDE_A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefPartnerSideA() <em>Ref Partner Side A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefPartnerSideA()
	 * @generated
	 * @ordered
	 */
	protected String refPartnerSideA = REF_PARTNER_SIDE_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getRefPartnerSideB() <em>Ref Partner Side B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefPartnerSideB()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_PARTNER_SIDE_B_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefPartnerSideB() <em>Ref Partner Side B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefPartnerSideB()
	 * @generated
	 * @ordered
	 */
	protected String refPartnerSideB = REF_PARTNER_SIDE_B_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CaexPackage.Literals.INTERNAL_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRefPartnerSideA() {
		return refPartnerSideA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefPartnerSideA(String newRefPartnerSideA) {
		String oldRefPartnerSideA = refPartnerSideA;
		refPartnerSideA = newRefPartnerSideA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaexPackage.INTERNAL_LINK__REF_PARTNER_SIDE_A, oldRefPartnerSideA, refPartnerSideA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRefPartnerSideB() {
		return refPartnerSideB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefPartnerSideB(String newRefPartnerSideB) {
		String oldRefPartnerSideB = refPartnerSideB;
		refPartnerSideB = newRefPartnerSideB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaexPackage.INTERNAL_LINK__REF_PARTNER_SIDE_B, oldRefPartnerSideB, refPartnerSideB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CaexPackage.INTERNAL_LINK__REF_PARTNER_SIDE_A:
				return getRefPartnerSideA();
			case CaexPackage.INTERNAL_LINK__REF_PARTNER_SIDE_B:
				return getRefPartnerSideB();
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
			case CaexPackage.INTERNAL_LINK__REF_PARTNER_SIDE_A:
				setRefPartnerSideA((String)newValue);
				return;
			case CaexPackage.INTERNAL_LINK__REF_PARTNER_SIDE_B:
				setRefPartnerSideB((String)newValue);
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
			case CaexPackage.INTERNAL_LINK__REF_PARTNER_SIDE_A:
				setRefPartnerSideA(REF_PARTNER_SIDE_A_EDEFAULT);
				return;
			case CaexPackage.INTERNAL_LINK__REF_PARTNER_SIDE_B:
				setRefPartnerSideB(REF_PARTNER_SIDE_B_EDEFAULT);
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
			case CaexPackage.INTERNAL_LINK__REF_PARTNER_SIDE_A:
				return REF_PARTNER_SIDE_A_EDEFAULT == null ? refPartnerSideA != null : !REF_PARTNER_SIDE_A_EDEFAULT.equals(refPartnerSideA);
			case CaexPackage.INTERNAL_LINK__REF_PARTNER_SIDE_B:
				return REF_PARTNER_SIDE_B_EDEFAULT == null ? refPartnerSideB != null : !REF_PARTNER_SIDE_B_EDEFAULT.equals(refPartnerSideB);
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
		result.append(" (refPartnerSideA: ");
		result.append(refPartnerSideA);
		result.append(", refPartnerSideB: ");
		result.append(refPartnerSideB);
		result.append(')');
		return result.toString();
	}

} //InternalLinkImpl
