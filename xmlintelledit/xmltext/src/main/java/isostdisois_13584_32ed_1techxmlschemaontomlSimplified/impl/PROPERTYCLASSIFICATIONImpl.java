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
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PROPERTYCLASSIFICATION;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PROPERTYREFERENCE;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PROPERTYCLASSIFICATION</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.PROPERTYCLASSIFICATIONImpl#getPropDef <em>Prop Def</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PROPERTYCLASSIFICATIONImpl extends MinimalEObjectImpl.Container implements PROPERTYCLASSIFICATION {
	/**
	 * The cached value of the '{@link #getPropDef() <em>Prop Def</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropDef()
	 * @generated
	 * @ordered
	 */
	protected PROPERTYREFERENCE propDef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PROPERTYCLASSIFICATIONImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.PROPERTYCLASSIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROPERTYREFERENCE getPropDef() {
		return propDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropDef(PROPERTYREFERENCE newPropDef, NotificationChain msgs) {
		PROPERTYREFERENCE oldPropDef = propDef;
		propDef = newPropDef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROPERTYCLASSIFICATION__PROP_DEF, oldPropDef, newPropDef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropDef(PROPERTYREFERENCE newPropDef) {
		if (newPropDef != propDef) {
			NotificationChain msgs = null;
			if (propDef != null)
				msgs = ((InternalEObject)propDef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROPERTYCLASSIFICATION__PROP_DEF, null, msgs);
			if (newPropDef != null)
				msgs = ((InternalEObject)newPropDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROPERTYCLASSIFICATION__PROP_DEF, null, msgs);
			msgs = basicSetPropDef(newPropDef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROPERTYCLASSIFICATION__PROP_DEF, newPropDef, newPropDef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROPERTYCLASSIFICATION__PROP_DEF:
				return basicSetPropDef(null, msgs);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROPERTYCLASSIFICATION__PROP_DEF:
				return getPropDef();
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROPERTYCLASSIFICATION__PROP_DEF:
				setPropDef((PROPERTYREFERENCE)newValue);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROPERTYCLASSIFICATION__PROP_DEF:
				setPropDef((PROPERTYREFERENCE)null);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROPERTYCLASSIFICATION__PROP_DEF:
				return propDef != null;
		}
		return super.eIsSet(featureID);
	}

} //PROPERTYCLASSIFICATIONImpl
