/**
 */
package caex.impl;

import caex.CaexPackage;
import caex.RoleClassLib;
import caex.RoleFamily;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Class Lib</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link caex.impl.RoleClassLibImpl#getRoleClass <em>Role Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleClassLibImpl extends CAEXObjectImpl implements RoleClassLib {
	/**
	 * The cached value of the '{@link #getRoleClass() <em>Role Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleClass()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleFamily> roleClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleClassLibImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CaexPackage.Literals.ROLE_CLASS_LIB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoleFamily> getRoleClass() {
		if (roleClass == null) {
			roleClass = new EObjectContainmentEList<RoleFamily>(RoleFamily.class, this, CaexPackage.ROLE_CLASS_LIB__ROLE_CLASS);
		}
		return roleClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CaexPackage.ROLE_CLASS_LIB__ROLE_CLASS:
				return ((InternalEList<?>)getRoleClass()).basicRemove(otherEnd, msgs);
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
			case CaexPackage.ROLE_CLASS_LIB__ROLE_CLASS:
				return getRoleClass();
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
			case CaexPackage.ROLE_CLASS_LIB__ROLE_CLASS:
				getRoleClass().clear();
				getRoleClass().addAll((Collection<? extends RoleFamily>)newValue);
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
			case CaexPackage.ROLE_CLASS_LIB__ROLE_CLASS:
				getRoleClass().clear();
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
			case CaexPackage.ROLE_CLASS_LIB__ROLE_CLASS:
				return roleClass != null && !roleClass.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RoleClassLibImpl
