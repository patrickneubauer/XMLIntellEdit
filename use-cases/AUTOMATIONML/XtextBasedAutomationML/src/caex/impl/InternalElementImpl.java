/**
 */
package caex.impl;

import caex.CaexPackage;
import caex.InternalElement;
import caex.Mapping;
import caex.RoleRequirements;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Internal Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link caex.impl.InternalElementImpl#getRoleRequirements <em>Role Requirements</em>}</li>
 *   <li>{@link caex.impl.InternalElementImpl#getMappingObject <em>Mapping Object</em>}</li>
 *   <li>{@link caex.impl.InternalElementImpl#getRefBaseSystemUnitPath <em>Ref Base System Unit Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InternalElementImpl extends SystemUnitClassImpl implements InternalElement {
	/**
	 * The cached value of the '{@link #getRoleRequirements() <em>Role Requirements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleRequirements()
	 * @generated
	 * @ordered
	 */
	protected RoleRequirements roleRequirements;

	/**
	 * The cached value of the '{@link #getMappingObject() <em>Mapping Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingObject()
	 * @generated
	 * @ordered
	 */
	protected Mapping mappingObject;

	/**
	 * The default value of the '{@link #getRefBaseSystemUnitPath() <em>Ref Base System Unit Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefBaseSystemUnitPath()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_BASE_SYSTEM_UNIT_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefBaseSystemUnitPath() <em>Ref Base System Unit Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefBaseSystemUnitPath()
	 * @generated
	 * @ordered
	 */
	protected String refBaseSystemUnitPath = REF_BASE_SYSTEM_UNIT_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CaexPackage.Literals.INTERNAL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequirements getRoleRequirements() {
		return roleRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoleRequirements(RoleRequirements newRoleRequirements, NotificationChain msgs) {
		RoleRequirements oldRoleRequirements = roleRequirements;
		roleRequirements = newRoleRequirements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CaexPackage.INTERNAL_ELEMENT__ROLE_REQUIREMENTS, oldRoleRequirements, newRoleRequirements);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleRequirements(RoleRequirements newRoleRequirements) {
		if (newRoleRequirements != roleRequirements) {
			NotificationChain msgs = null;
			if (roleRequirements != null)
				msgs = ((InternalEObject)roleRequirements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CaexPackage.INTERNAL_ELEMENT__ROLE_REQUIREMENTS, null, msgs);
			if (newRoleRequirements != null)
				msgs = ((InternalEObject)newRoleRequirements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CaexPackage.INTERNAL_ELEMENT__ROLE_REQUIREMENTS, null, msgs);
			msgs = basicSetRoleRequirements(newRoleRequirements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaexPackage.INTERNAL_ELEMENT__ROLE_REQUIREMENTS, newRoleRequirements, newRoleRequirements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mapping getMappingObject() {
		return mappingObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMappingObject(Mapping newMappingObject, NotificationChain msgs) {
		Mapping oldMappingObject = mappingObject;
		mappingObject = newMappingObject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CaexPackage.INTERNAL_ELEMENT__MAPPING_OBJECT, oldMappingObject, newMappingObject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappingObject(Mapping newMappingObject) {
		if (newMappingObject != mappingObject) {
			NotificationChain msgs = null;
			if (mappingObject != null)
				msgs = ((InternalEObject)mappingObject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CaexPackage.INTERNAL_ELEMENT__MAPPING_OBJECT, null, msgs);
			if (newMappingObject != null)
				msgs = ((InternalEObject)newMappingObject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CaexPackage.INTERNAL_ELEMENT__MAPPING_OBJECT, null, msgs);
			msgs = basicSetMappingObject(newMappingObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaexPackage.INTERNAL_ELEMENT__MAPPING_OBJECT, newMappingObject, newMappingObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRefBaseSystemUnitPath() {
		return refBaseSystemUnitPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefBaseSystemUnitPath(String newRefBaseSystemUnitPath) {
		String oldRefBaseSystemUnitPath = refBaseSystemUnitPath;
		refBaseSystemUnitPath = newRefBaseSystemUnitPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CaexPackage.INTERNAL_ELEMENT__REF_BASE_SYSTEM_UNIT_PATH, oldRefBaseSystemUnitPath, refBaseSystemUnitPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CaexPackage.INTERNAL_ELEMENT__ROLE_REQUIREMENTS:
				return basicSetRoleRequirements(null, msgs);
			case CaexPackage.INTERNAL_ELEMENT__MAPPING_OBJECT:
				return basicSetMappingObject(null, msgs);
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
			case CaexPackage.INTERNAL_ELEMENT__ROLE_REQUIREMENTS:
				return getRoleRequirements();
			case CaexPackage.INTERNAL_ELEMENT__MAPPING_OBJECT:
				return getMappingObject();
			case CaexPackage.INTERNAL_ELEMENT__REF_BASE_SYSTEM_UNIT_PATH:
				return getRefBaseSystemUnitPath();
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
			case CaexPackage.INTERNAL_ELEMENT__ROLE_REQUIREMENTS:
				setRoleRequirements((RoleRequirements)newValue);
				return;
			case CaexPackage.INTERNAL_ELEMENT__MAPPING_OBJECT:
				setMappingObject((Mapping)newValue);
				return;
			case CaexPackage.INTERNAL_ELEMENT__REF_BASE_SYSTEM_UNIT_PATH:
				setRefBaseSystemUnitPath((String)newValue);
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
			case CaexPackage.INTERNAL_ELEMENT__ROLE_REQUIREMENTS:
				setRoleRequirements((RoleRequirements)null);
				return;
			case CaexPackage.INTERNAL_ELEMENT__MAPPING_OBJECT:
				setMappingObject((Mapping)null);
				return;
			case CaexPackage.INTERNAL_ELEMENT__REF_BASE_SYSTEM_UNIT_PATH:
				setRefBaseSystemUnitPath(REF_BASE_SYSTEM_UNIT_PATH_EDEFAULT);
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
			case CaexPackage.INTERNAL_ELEMENT__ROLE_REQUIREMENTS:
				return roleRequirements != null;
			case CaexPackage.INTERNAL_ELEMENT__MAPPING_OBJECT:
				return mappingObject != null;
			case CaexPackage.INTERNAL_ELEMENT__REF_BASE_SYSTEM_UNIT_PATH:
				return REF_BASE_SYSTEM_UNIT_PATH_EDEFAULT == null ? refBaseSystemUnitPath != null : !REF_BASE_SYSTEM_UNIT_PATH_EDEFAULT.equals(refBaseSystemUnitPath);
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
		result.append(" (refBaseSystemUnitPath: ");
		result.append(refBaseSystemUnitPath);
		result.append(')');
		return result.toString();
	}

} //InternalElementImpl
