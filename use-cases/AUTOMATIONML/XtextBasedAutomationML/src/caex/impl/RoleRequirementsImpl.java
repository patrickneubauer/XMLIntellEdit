/**
 */
package caex.impl;

import caex.Attribute;
import caex.CaexPackage;
import caex.InterfaceClass;
import caex.RoleRequirements;

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
 * An implementation of the model object '<em><b>Role Requirements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link caex.impl.RoleRequirementsImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link caex.impl.RoleRequirementsImpl#getExternalInterface <em>External Interface</em>}</li>
 *   <li>{@link caex.impl.RoleRequirementsImpl#getRefBaseRoleClassPath <em>Ref Base Role Class Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleRequirementsImpl extends CAEXBasicObjectImpl implements RoleRequirements {
	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attribute;

	/**
	 * The cached value of the '{@link #getExternalInterface() <em>External Interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceClass> externalInterface;

	/**
	 * The default value of the '{@link #getRefBaseRoleClassPath() <em>Ref Base Role Class Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefBaseRoleClassPath()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_BASE_ROLE_CLASS_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefBaseRoleClassPath() <em>Ref Base Role Class Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefBaseRoleClassPath()
	 * @generated
	 * @ordered
	 */
	protected String refBaseRoleClassPath = REF_BASE_ROLE_CLASS_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleRequirementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CaexPackage.Literals.ROLE_REQUIREMENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttribute() {
		if (attribute == null) {
			attribute = new EObjectContainmentEList<Attribute>(Attribute.class, this, CaexPackage.ROLE_REQUIREMENTS__ATTRIBUTE);
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceClass> getExternalInterface() {
		if (externalInterface == null) {
			externalInterface = new EObjectContainmentEList<InterfaceClass>(InterfaceClass.class, this, CaexPackage.ROLE_REQUIREMENTS__EXTERNAL_INTERFACE);
		}
		return externalInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRefBaseRoleClassPath() {
		return refBaseRoleClassPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefBaseRoleClassPath(String newRefBaseRoleClassPath) {
		String oldRefBaseRoleClassPath = refBaseRoleClassPath;
		refBaseRoleClassPath = newRefBaseRoleClassPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaexPackage.ROLE_REQUIREMENTS__REF_BASE_ROLE_CLASS_PATH, oldRefBaseRoleClassPath, refBaseRoleClassPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CaexPackage.ROLE_REQUIREMENTS__ATTRIBUTE:
				return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
			case CaexPackage.ROLE_REQUIREMENTS__EXTERNAL_INTERFACE:
				return ((InternalEList<?>)getExternalInterface()).basicRemove(otherEnd, msgs);
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
			case CaexPackage.ROLE_REQUIREMENTS__ATTRIBUTE:
				return getAttribute();
			case CaexPackage.ROLE_REQUIREMENTS__EXTERNAL_INTERFACE:
				return getExternalInterface();
			case CaexPackage.ROLE_REQUIREMENTS__REF_BASE_ROLE_CLASS_PATH:
				return getRefBaseRoleClassPath();
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
			case CaexPackage.ROLE_REQUIREMENTS__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends Attribute>)newValue);
				return;
			case CaexPackage.ROLE_REQUIREMENTS__EXTERNAL_INTERFACE:
				getExternalInterface().clear();
				getExternalInterface().addAll((Collection<? extends InterfaceClass>)newValue);
				return;
			case CaexPackage.ROLE_REQUIREMENTS__REF_BASE_ROLE_CLASS_PATH:
				setRefBaseRoleClassPath((String)newValue);
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
			case CaexPackage.ROLE_REQUIREMENTS__ATTRIBUTE:
				getAttribute().clear();
				return;
			case CaexPackage.ROLE_REQUIREMENTS__EXTERNAL_INTERFACE:
				getExternalInterface().clear();
				return;
			case CaexPackage.ROLE_REQUIREMENTS__REF_BASE_ROLE_CLASS_PATH:
				setRefBaseRoleClassPath(REF_BASE_ROLE_CLASS_PATH_EDEFAULT);
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
			case CaexPackage.ROLE_REQUIREMENTS__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case CaexPackage.ROLE_REQUIREMENTS__EXTERNAL_INTERFACE:
				return externalInterface != null && !externalInterface.isEmpty();
			case CaexPackage.ROLE_REQUIREMENTS__REF_BASE_ROLE_CLASS_PATH:
				return REF_BASE_ROLE_CLASS_PATH_EDEFAULT == null ? refBaseRoleClassPath != null : !REF_BASE_ROLE_CLASS_PATH_EDEFAULT.equals(refBaseRoleClassPath);
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
		result.append(" (refBaseRoleClassPath: ");
		result.append(refBaseRoleClassPath);
		result.append(')');
		return result.toString();
	}

} //RoleRequirementsImpl
