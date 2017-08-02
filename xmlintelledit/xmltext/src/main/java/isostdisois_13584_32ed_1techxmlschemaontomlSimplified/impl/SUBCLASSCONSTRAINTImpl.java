/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASSESREFERENCE;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SUBCLASSCONSTRAINT;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SUBCLASSCONSTRAINT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.SUBCLASSCONSTRAINTImpl#getSubclasses <em>Subclasses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SUBCLASSCONSTRAINTImpl extends DOMAINCONSTRAINTImpl implements SUBCLASSCONSTRAINT {
	/**
	 * The cached value of the '{@link #getSubclasses() <em>Subclasses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubclasses()
	 * @generated
	 * @ordered
	 */
	protected CLASSESREFERENCE subclasses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SUBCLASSCONSTRAINTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.SUBCLASSCONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLASSESREFERENCE getSubclasses() {
		return subclasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubclasses(CLASSESREFERENCE newSubclasses, NotificationChain msgs) {
		CLASSESREFERENCE oldSubclasses = subclasses;
		subclasses = newSubclasses;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SUBCLASSCONSTRAINT__SUBCLASSES, oldSubclasses, newSubclasses);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubclasses(CLASSESREFERENCE newSubclasses) {
		if (newSubclasses != subclasses) {
			NotificationChain msgs = null;
			if (subclasses != null)
				msgs = ((InternalEObject)subclasses).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SUBCLASSCONSTRAINT__SUBCLASSES, null, msgs);
			if (newSubclasses != null)
				msgs = ((InternalEObject)newSubclasses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SUBCLASSCONSTRAINT__SUBCLASSES, null, msgs);
			msgs = basicSetSubclasses(newSubclasses, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SUBCLASSCONSTRAINT__SUBCLASSES, newSubclasses, newSubclasses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SUBCLASSCONSTRAINT__SUBCLASSES:
				return basicSetSubclasses(null, msgs);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SUBCLASSCONSTRAINT__SUBCLASSES:
				return getSubclasses();
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SUBCLASSCONSTRAINT__SUBCLASSES:
				setSubclasses((CLASSESREFERENCE)newValue);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SUBCLASSCONSTRAINT__SUBCLASSES:
				setSubclasses((CLASSESREFERENCE)null);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SUBCLASSCONSTRAINT__SUBCLASSES:
				return subclasses != null;
		}
		return super.eIsSet(featureID);
	}

} //SUBCLASSCONSTRAINTImpl
