/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DOMAINCONSTRAINT;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.INTEGRITYCONSTRAINT;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>INTEGRITYCONSTRAINT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.INTEGRITYCONSTRAINTImpl#getRedefinedDomain <em>Redefined Domain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class INTEGRITYCONSTRAINTImpl extends PROPERTYCONSTRAINTImpl implements INTEGRITYCONSTRAINT {
	/**
	 * The cached value of the '{@link #getRedefinedDomain() <em>Redefined Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedDomain()
	 * @generated
	 * @ordered
	 */
	protected DOMAINCONSTRAINT redefinedDomain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected INTEGRITYCONSTRAINTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.INTEGRITYCONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DOMAINCONSTRAINT getRedefinedDomain() {
		return redefinedDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRedefinedDomain(DOMAINCONSTRAINT newRedefinedDomain, NotificationChain msgs) {
		DOMAINCONSTRAINT oldRedefinedDomain = redefinedDomain;
		redefinedDomain = newRedefinedDomain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.INTEGRITYCONSTRAINT__REDEFINED_DOMAIN, oldRedefinedDomain, newRedefinedDomain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedefinedDomain(DOMAINCONSTRAINT newRedefinedDomain) {
		if (newRedefinedDomain != redefinedDomain) {
			NotificationChain msgs = null;
			if (redefinedDomain != null)
				msgs = ((InternalEObject)redefinedDomain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.INTEGRITYCONSTRAINT__REDEFINED_DOMAIN, null, msgs);
			if (newRedefinedDomain != null)
				msgs = ((InternalEObject)newRedefinedDomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.INTEGRITYCONSTRAINT__REDEFINED_DOMAIN, null, msgs);
			msgs = basicSetRedefinedDomain(newRedefinedDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.INTEGRITYCONSTRAINT__REDEFINED_DOMAIN, newRedefinedDomain, newRedefinedDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.INTEGRITYCONSTRAINT__REDEFINED_DOMAIN:
				return basicSetRedefinedDomain(null, msgs);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.INTEGRITYCONSTRAINT__REDEFINED_DOMAIN:
				return getRedefinedDomain();
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.INTEGRITYCONSTRAINT__REDEFINED_DOMAIN:
				setRedefinedDomain((DOMAINCONSTRAINT)newValue);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.INTEGRITYCONSTRAINT__REDEFINED_DOMAIN:
				setRedefinedDomain((DOMAINCONSTRAINT)null);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.INTEGRITYCONSTRAINT__REDEFINED_DOMAIN:
				return redefinedDomain != null;
		}
		return super.eIsSet(featureID);
	}

} //INTEGRITYCONSTRAINTImpl
