/**
 */
package tosca.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tosca.TAppliesTo;
import tosca.TPolicyType;
import tosca.ToscaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TPolicy Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tosca.impl.TPolicyTypeImpl#getAppliesTo <em>Applies To</em>}</li>
 *   <li>{@link tosca.impl.TPolicyTypeImpl#getPolicyLanguage <em>Policy Language</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TPolicyTypeImpl extends TEntityTypeImpl implements TPolicyType {
	/**
	 * The cached value of the '{@link #getAppliesTo() <em>Applies To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliesTo()
	 * @generated
	 * @ordered
	 */
	protected TAppliesTo appliesTo;

	/**
	 * The default value of the '{@link #getPolicyLanguage() <em>Policy Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String POLICY_LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPolicyLanguage() <em>Policy Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyLanguage()
	 * @generated
	 * @ordered
	 */
	protected String policyLanguage = POLICY_LANGUAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TPolicyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToscaPackage.Literals.TPOLICY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAppliesTo getAppliesTo() {
		return appliesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppliesTo(TAppliesTo newAppliesTo, NotificationChain msgs) {
		TAppliesTo oldAppliesTo = appliesTo;
		appliesTo = newAppliesTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToscaPackage.TPOLICY_TYPE__APPLIES_TO, oldAppliesTo, newAppliesTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppliesTo(TAppliesTo newAppliesTo) {
		if (newAppliesTo != appliesTo) {
			NotificationChain msgs = null;
			if (appliesTo != null)
				msgs = ((InternalEObject)appliesTo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TPOLICY_TYPE__APPLIES_TO, null, msgs);
			if (newAppliesTo != null)
				msgs = ((InternalEObject)newAppliesTo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TPOLICY_TYPE__APPLIES_TO, null, msgs);
			msgs = basicSetAppliesTo(newAppliesTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TPOLICY_TYPE__APPLIES_TO, newAppliesTo, newAppliesTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPolicyLanguage() {
		return policyLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolicyLanguage(String newPolicyLanguage) {
		String oldPolicyLanguage = policyLanguage;
		policyLanguage = newPolicyLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TPOLICY_TYPE__POLICY_LANGUAGE, oldPolicyLanguage, policyLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToscaPackage.TPOLICY_TYPE__APPLIES_TO:
				return basicSetAppliesTo(null, msgs);
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
			case ToscaPackage.TPOLICY_TYPE__APPLIES_TO:
				return getAppliesTo();
			case ToscaPackage.TPOLICY_TYPE__POLICY_LANGUAGE:
				return getPolicyLanguage();
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
			case ToscaPackage.TPOLICY_TYPE__APPLIES_TO:
				setAppliesTo((TAppliesTo)newValue);
				return;
			case ToscaPackage.TPOLICY_TYPE__POLICY_LANGUAGE:
				setPolicyLanguage((String)newValue);
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
			case ToscaPackage.TPOLICY_TYPE__APPLIES_TO:
				setAppliesTo((TAppliesTo)null);
				return;
			case ToscaPackage.TPOLICY_TYPE__POLICY_LANGUAGE:
				setPolicyLanguage(POLICY_LANGUAGE_EDEFAULT);
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
			case ToscaPackage.TPOLICY_TYPE__APPLIES_TO:
				return appliesTo != null;
			case ToscaPackage.TPOLICY_TYPE__POLICY_LANGUAGE:
				return POLICY_LANGUAGE_EDEFAULT == null ? policyLanguage != null : !POLICY_LANGUAGE_EDEFAULT.equals(policyLanguage);
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
		result.append(" (policyLanguage: ");
		result.append(policyLanguage);
		result.append(')');
		return result.toString();
	}

} //TPolicyTypeImpl
