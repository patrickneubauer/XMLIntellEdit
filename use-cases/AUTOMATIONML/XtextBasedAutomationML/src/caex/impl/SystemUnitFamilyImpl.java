/**
 */
package caex.impl;

import caex.CaexPackage;
import caex.SystemUnitFamily;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Unit Family</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link caex.impl.SystemUnitFamilyImpl#getSystemUnitClass <em>System Unit Class</em>}</li>
 *   <li>{@link caex.impl.SystemUnitFamilyImpl#getRefBaseClassPath <em>Ref Base Class Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystemUnitFamilyImpl extends SystemUnitClassImpl implements SystemUnitFamily {
	/**
	 * The cached value of the '{@link #getSystemUnitClass() <em>System Unit Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemUnitClass()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemUnitFamily> systemUnitClass;

	/**
	 * The default value of the '{@link #getRefBaseClassPath() <em>Ref Base Class Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefBaseClassPath()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_BASE_CLASS_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefBaseClassPath() <em>Ref Base Class Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefBaseClassPath()
	 * @generated
	 * @ordered
	 */
	protected String refBaseClassPath = REF_BASE_CLASS_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemUnitFamilyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CaexPackage.Literals.SYSTEM_UNIT_FAMILY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemUnitFamily> getSystemUnitClass() {
		if (systemUnitClass == null) {
			systemUnitClass = new EObjectContainmentEList<SystemUnitFamily>(SystemUnitFamily.class, this, CaexPackage.SYSTEM_UNIT_FAMILY__SYSTEM_UNIT_CLASS);
		}
		return systemUnitClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRefBaseClassPath() {
		return refBaseClassPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefBaseClassPath(String newRefBaseClassPath) {
		String oldRefBaseClassPath = refBaseClassPath;
		refBaseClassPath = newRefBaseClassPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaexPackage.SYSTEM_UNIT_FAMILY__REF_BASE_CLASS_PATH, oldRefBaseClassPath, refBaseClassPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CaexPackage.SYSTEM_UNIT_FAMILY__SYSTEM_UNIT_CLASS:
				return ((InternalEList<?>)getSystemUnitClass()).basicRemove(otherEnd, msgs);
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
			case CaexPackage.SYSTEM_UNIT_FAMILY__SYSTEM_UNIT_CLASS:
				return getSystemUnitClass();
			case CaexPackage.SYSTEM_UNIT_FAMILY__REF_BASE_CLASS_PATH:
				return getRefBaseClassPath();
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
			case CaexPackage.SYSTEM_UNIT_FAMILY__SYSTEM_UNIT_CLASS:
				getSystemUnitClass().clear();
				getSystemUnitClass().addAll((Collection<? extends SystemUnitFamily>)newValue);
				return;
			case CaexPackage.SYSTEM_UNIT_FAMILY__REF_BASE_CLASS_PATH:
				setRefBaseClassPath((String)newValue);
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
			case CaexPackage.SYSTEM_UNIT_FAMILY__SYSTEM_UNIT_CLASS:
				getSystemUnitClass().clear();
				return;
			case CaexPackage.SYSTEM_UNIT_FAMILY__REF_BASE_CLASS_PATH:
				setRefBaseClassPath(REF_BASE_CLASS_PATH_EDEFAULT);
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
			case CaexPackage.SYSTEM_UNIT_FAMILY__SYSTEM_UNIT_CLASS:
				return systemUnitClass != null && !systemUnitClass.isEmpty();
			case CaexPackage.SYSTEM_UNIT_FAMILY__REF_BASE_CLASS_PATH:
				return REF_BASE_CLASS_PATH_EDEFAULT == null ? refBaseClassPath != null : !REF_BASE_CLASS_PATH_EDEFAULT.equals(refBaseClassPath);
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
		result.append(" (refBaseClassPath: ");
		result.append(refBaseClassPath);
		result.append(')');
		return result.toString();
	}

} //SystemUnitFamilyImpl
