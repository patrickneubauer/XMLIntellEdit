/**
 */
package caex.impl;

import caex.CaexPackage;
import caex.InterfaceNameMapping;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Name Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link caex.impl.InterfaceNameMappingImpl#getRoleInterfaceName <em>Role Interface Name</em>}</li>
 *   <li>{@link caex.impl.InterfaceNameMappingImpl#getSystemUnitInterfaceName <em>System Unit Interface Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterfaceNameMappingImpl extends CAEXBasicObjectImpl implements InterfaceNameMapping {
	/**
	 * The default value of the '{@link #getRoleInterfaceName() <em>Role Interface Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleInterfaceName()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_INTERFACE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoleInterfaceName() <em>Role Interface Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleInterfaceName()
	 * @generated
	 * @ordered
	 */
	protected String roleInterfaceName = ROLE_INTERFACE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSystemUnitInterfaceName() <em>System Unit Interface Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemUnitInterfaceName()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_UNIT_INTERFACE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemUnitInterfaceName() <em>System Unit Interface Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemUnitInterfaceName()
	 * @generated
	 * @ordered
	 */
	protected String systemUnitInterfaceName = SYSTEM_UNIT_INTERFACE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceNameMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CaexPackage.Literals.INTERFACE_NAME_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoleInterfaceName() {
		return roleInterfaceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleInterfaceName(String newRoleInterfaceName) {
		String oldRoleInterfaceName = roleInterfaceName;
		roleInterfaceName = newRoleInterfaceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaexPackage.INTERFACE_NAME_MAPPING__ROLE_INTERFACE_NAME, oldRoleInterfaceName, roleInterfaceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSystemUnitInterfaceName() {
		return systemUnitInterfaceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemUnitInterfaceName(String newSystemUnitInterfaceName) {
		String oldSystemUnitInterfaceName = systemUnitInterfaceName;
		systemUnitInterfaceName = newSystemUnitInterfaceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaexPackage.INTERFACE_NAME_MAPPING__SYSTEM_UNIT_INTERFACE_NAME, oldSystemUnitInterfaceName, systemUnitInterfaceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CaexPackage.INTERFACE_NAME_MAPPING__ROLE_INTERFACE_NAME:
				return getRoleInterfaceName();
			case CaexPackage.INTERFACE_NAME_MAPPING__SYSTEM_UNIT_INTERFACE_NAME:
				return getSystemUnitInterfaceName();
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
			case CaexPackage.INTERFACE_NAME_MAPPING__ROLE_INTERFACE_NAME:
				setRoleInterfaceName((String)newValue);
				return;
			case CaexPackage.INTERFACE_NAME_MAPPING__SYSTEM_UNIT_INTERFACE_NAME:
				setSystemUnitInterfaceName((String)newValue);
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
			case CaexPackage.INTERFACE_NAME_MAPPING__ROLE_INTERFACE_NAME:
				setRoleInterfaceName(ROLE_INTERFACE_NAME_EDEFAULT);
				return;
			case CaexPackage.INTERFACE_NAME_MAPPING__SYSTEM_UNIT_INTERFACE_NAME:
				setSystemUnitInterfaceName(SYSTEM_UNIT_INTERFACE_NAME_EDEFAULT);
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
			case CaexPackage.INTERFACE_NAME_MAPPING__ROLE_INTERFACE_NAME:
				return ROLE_INTERFACE_NAME_EDEFAULT == null ? roleInterfaceName != null : !ROLE_INTERFACE_NAME_EDEFAULT.equals(roleInterfaceName);
			case CaexPackage.INTERFACE_NAME_MAPPING__SYSTEM_UNIT_INTERFACE_NAME:
				return SYSTEM_UNIT_INTERFACE_NAME_EDEFAULT == null ? systemUnitInterfaceName != null : !SYSTEM_UNIT_INTERFACE_NAME_EDEFAULT.equals(systemUnitInterfaceName);
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
		result.append(" (roleInterfaceName: ");
		result.append(roleInterfaceName);
		result.append(", systemUnitInterfaceName: ");
		result.append(systemUnitInterfaceName);
		result.append(')');
		return result.toString();
	}

} //InterfaceNameMappingImpl
