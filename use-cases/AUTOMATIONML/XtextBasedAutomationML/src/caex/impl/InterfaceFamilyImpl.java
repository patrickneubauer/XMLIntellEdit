/**
 */
package caex.impl;

import caex.CaexPackage;
import caex.InterfaceFamily;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Family</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link caex.impl.InterfaceFamilyImpl#getInterfaceClass <em>Interface Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterfaceFamilyImpl extends InterfaceClassImpl implements InterfaceFamily {
	/**
	 * The cached value of the '{@link #getInterfaceClass() <em>Interface Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceClass()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceFamily> interfaceClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceFamilyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CaexPackage.Literals.INTERFACE_FAMILY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceFamily> getInterfaceClass() {
		if (interfaceClass == null) {
			interfaceClass = new EObjectContainmentEList<InterfaceFamily>(InterfaceFamily.class, this, CaexPackage.INTERFACE_FAMILY__INTERFACE_CLASS);
		}
		return interfaceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CaexPackage.INTERFACE_FAMILY__INTERFACE_CLASS:
				return ((InternalEList<?>)getInterfaceClass()).basicRemove(otherEnd, msgs);
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
			case CaexPackage.INTERFACE_FAMILY__INTERFACE_CLASS:
				return getInterfaceClass();
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
			case CaexPackage.INTERFACE_FAMILY__INTERFACE_CLASS:
				getInterfaceClass().clear();
				getInterfaceClass().addAll((Collection<? extends InterfaceFamily>)newValue);
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
			case CaexPackage.INTERFACE_FAMILY__INTERFACE_CLASS:
				getInterfaceClass().clear();
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
			case CaexPackage.INTERFACE_FAMILY__INTERFACE_CLASS:
				return interfaceClass != null && !interfaceClass.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InterfaceFamilyImpl
