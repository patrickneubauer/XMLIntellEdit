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

import eclassxmlschemacommon_2_0Simplified.ADVANCEDPROPERTYPATH;
import eclassxmlschemacommon_2_0Simplified.Eclassxmlschemacommon_2_0SimplifiedPackage;
import eclassxmlschemacommon_2_0Simplified.PROPERTYELM;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ADVANCEDPROPERTYPATH</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eclassxmlschemacommon_2_0Simplified.impl.ADVANCEDPROPERTYPATHImpl#getAc <em>Ac</em>}</li>
 *   <li>{@link eclassxmlschemacommon_2_0Simplified.impl.ADVANCEDPROPERTYPATHImpl#getAspect <em>Aspect</em>}</li>
 *   <li>{@link eclassxmlschemacommon_2_0Simplified.impl.ADVANCEDPROPERTYPATHImpl#getPropertys <em>Propertys</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ADVANCEDPROPERTYPATHImpl extends MinimalEObjectImpl.Container implements ADVANCEDPROPERTYPATH {
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
	 * The cached value of the '{@link #getPropertys() <em>Propertys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertys()
	 * @generated
	 * @ordered
	 */
	protected EList<PROPERTYELM> propertys;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ADVANCEDPROPERTYPATHImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Eclassxmlschemacommon_2_0SimplifiedPackage.Literals.ADVANCEDPROPERTYPATH;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Eclassxmlschemacommon_2_0SimplifiedPackage.ADVANCEDPROPERTYPATH__AC, oldAc, ac));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Eclassxmlschemacommon_2_0SimplifiedPackage.ADVANCEDPROPERTYPATH__ASPECT, oldAspect, aspect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PROPERTYELM> getPropertys() {
		if (propertys == null) {
			propertys = new EObjectContainmentEList<PROPERTYELM>(PROPERTYELM.class, this, Eclassxmlschemacommon_2_0SimplifiedPackage.ADVANCEDPROPERTYPATH__PROPERTYS);
		}
		return propertys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Eclassxmlschemacommon_2_0SimplifiedPackage.ADVANCEDPROPERTYPATH__PROPERTYS:
				return ((InternalEList<?>)getPropertys()).basicRemove(otherEnd, msgs);
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
			case Eclassxmlschemacommon_2_0SimplifiedPackage.ADVANCEDPROPERTYPATH__AC:
				return getAc();
			case Eclassxmlschemacommon_2_0SimplifiedPackage.ADVANCEDPROPERTYPATH__ASPECT:
				return getAspect();
			case Eclassxmlschemacommon_2_0SimplifiedPackage.ADVANCEDPROPERTYPATH__PROPERTYS:
				return getPropertys();
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
			case Eclassxmlschemacommon_2_0SimplifiedPackage.ADVANCEDPROPERTYPATH__AC:
				setAc((String)newValue);
				return;
			case Eclassxmlschemacommon_2_0SimplifiedPackage.ADVANCEDPROPERTYPATH__ASPECT:
				setAspect((String)newValue);
				return;
			case Eclassxmlschemacommon_2_0SimplifiedPackage.ADVANCEDPROPERTYPATH__PROPERTYS:
				getPropertys().clear();
				getPropertys().addAll((Collection<? extends PROPERTYELM>)newValue);
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
			case Eclassxmlschemacommon_2_0SimplifiedPackage.ADVANCEDPROPERTYPATH__AC:
				setAc(AC_EDEFAULT);
				return;
			case Eclassxmlschemacommon_2_0SimplifiedPackage.ADVANCEDPROPERTYPATH__ASPECT:
				setAspect(ASPECT_EDEFAULT);
				return;
			case Eclassxmlschemacommon_2_0SimplifiedPackage.ADVANCEDPROPERTYPATH__PROPERTYS:
				getPropertys().clear();
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
			case Eclassxmlschemacommon_2_0SimplifiedPackage.ADVANCEDPROPERTYPATH__AC:
				return AC_EDEFAULT == null ? ac != null : !AC_EDEFAULT.equals(ac);
			case Eclassxmlschemacommon_2_0SimplifiedPackage.ADVANCEDPROPERTYPATH__ASPECT:
				return ASPECT_EDEFAULT == null ? aspect != null : !ASPECT_EDEFAULT.equals(aspect);
			case Eclassxmlschemacommon_2_0SimplifiedPackage.ADVANCEDPROPERTYPATH__PROPERTYS:
				return propertys != null && !propertys.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //ADVANCEDPROPERTYPATHImpl
