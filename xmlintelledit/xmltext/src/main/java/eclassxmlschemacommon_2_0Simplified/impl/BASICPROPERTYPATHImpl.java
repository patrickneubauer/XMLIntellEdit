/**
 */
package eclassxmlschemacommon_2_0Simplified.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import eclassxmlschemacommon_2_0Simplified.BASICPROPERTYPATH;
import eclassxmlschemacommon_2_0Simplified.Eclassxmlschemacommon_2_0SimplifiedPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BASICPROPERTYPATH</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eclassxmlschemacommon_2_0Simplified.impl.BASICPROPERTYPATHImpl#getAc <em>Ac</em>}</li>
 *   <li>{@link eclassxmlschemacommon_2_0Simplified.impl.BASICPROPERTYPATHImpl#getAspect <em>Aspect</em>}</li>
 *   <li>{@link eclassxmlschemacommon_2_0Simplified.impl.BASICPROPERTYPATHImpl#getPropRef <em>Prop Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BASICPROPERTYPATHImpl extends MinimalEObjectImpl.Container implements BASICPROPERTYPATH {
	/**
	 * The default value of the '{@link #getAc() <em>Ac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAc()
	 * @generated
	 * @ordered
	 */
	protected static final String AC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAc() <em>Ac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAc()
	 * @generated
	 * @ordered
	 */
	protected String ac = AC_EDEFAULT;

	/**
	 * The default value of the '{@link #getAspect() <em>Aspect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAspect()
	 * @generated
	 * @ordered
	 */
	protected static final String ASPECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAspect() <em>Aspect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAspect()
	 * @generated
	 * @ordered
	 */
	protected String aspect = ASPECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPropRef() <em>Prop Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropRef()
	 * @generated
	 * @ordered
	 */
	protected static final String PROP_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropRef() <em>Prop Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropRef()
	 * @generated
	 * @ordered
	 */
	protected String propRef = PROP_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BASICPROPERTYPATHImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Eclassxmlschemacommon_2_0SimplifiedPackage.Literals.BASICPROPERTYPATH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAc() {
		return ac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAc(String newAc) {
		String oldAc = ac;
		ac = newAc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eclassxmlschemacommon_2_0SimplifiedPackage.BASICPROPERTYPATH__AC, oldAc, ac));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAspect() {
		return aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAspect(String newAspect) {
		String oldAspect = aspect;
		aspect = newAspect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eclassxmlschemacommon_2_0SimplifiedPackage.BASICPROPERTYPATH__ASPECT, oldAspect, aspect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPropRef() {
		return propRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropRef(String newPropRef) {
		String oldPropRef = propRef;
		propRef = newPropRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eclassxmlschemacommon_2_0SimplifiedPackage.BASICPROPERTYPATH__PROP_REF, oldPropRef, propRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Eclassxmlschemacommon_2_0SimplifiedPackage.BASICPROPERTYPATH__AC:
				return getAc();
			case Eclassxmlschemacommon_2_0SimplifiedPackage.BASICPROPERTYPATH__ASPECT:
				return getAspect();
			case Eclassxmlschemacommon_2_0SimplifiedPackage.BASICPROPERTYPATH__PROP_REF:
				return getPropRef();
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
			case Eclassxmlschemacommon_2_0SimplifiedPackage.BASICPROPERTYPATH__AC:
				setAc((String)newValue);
				return;
			case Eclassxmlschemacommon_2_0SimplifiedPackage.BASICPROPERTYPATH__ASPECT:
				setAspect((String)newValue);
				return;
			case Eclassxmlschemacommon_2_0SimplifiedPackage.BASICPROPERTYPATH__PROP_REF:
				setPropRef((String)newValue);
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
			case Eclassxmlschemacommon_2_0SimplifiedPackage.BASICPROPERTYPATH__AC:
				setAc(AC_EDEFAULT);
				return;
			case Eclassxmlschemacommon_2_0SimplifiedPackage.BASICPROPERTYPATH__ASPECT:
				setAspect(ASPECT_EDEFAULT);
				return;
			case Eclassxmlschemacommon_2_0SimplifiedPackage.BASICPROPERTYPATH__PROP_REF:
				setPropRef(PROP_REF_EDEFAULT);
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
			case Eclassxmlschemacommon_2_0SimplifiedPackage.BASICPROPERTYPATH__AC:
				return AC_EDEFAULT == null ? ac != null : !AC_EDEFAULT.equals(ac);
			case Eclassxmlschemacommon_2_0SimplifiedPackage.BASICPROPERTYPATH__ASPECT:
				return ASPECT_EDEFAULT == null ? aspect != null : !ASPECT_EDEFAULT.equals(aspect);
			case Eclassxmlschemacommon_2_0SimplifiedPackage.BASICPROPERTYPATH__PROP_REF:
				return PROP_REF_EDEFAULT == null ? propRef != null : !PROP_REF_EDEFAULT.equals(propRef);
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
		result.append(" (ac: ");
		result.append(ac);
		result.append(", aspect: ");
		result.append(aspect);
		result.append(", propRef: ");
		result.append(propRef);
		result.append(')');
		return result.toString();
	}

} //BASICPROPERTYPATHImpl
