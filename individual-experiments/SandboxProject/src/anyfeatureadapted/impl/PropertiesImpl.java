/**
 */
package anyfeatureadapted.impl;

import anyfeatureadapted.AnyGenericConstruct;
import anyfeatureadapted.AnyfeatureadaptedPackage;
import anyfeatureadapted.Properties;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link anyfeatureadapted.impl.PropertiesImpl#getAnyGenericElem <em>Any Generic Elem</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertiesImpl extends MinimalEObjectImpl.Container implements Properties {
	/**
	 * The cached value of the '{@link #getAnyGenericElem() <em>Any Generic Elem</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyGenericElem()
	 * @generated
	 * @ordered
	 */
	protected EList<AnyGenericConstruct> anyGenericElem;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnyfeatureadaptedPackage.Literals.PROPERTIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnyGenericConstruct> getAnyGenericElem() {
		if (anyGenericElem == null) {
			anyGenericElem = new EObjectContainmentEList<AnyGenericConstruct>(AnyGenericConstruct.class, this, AnyfeatureadaptedPackage.PROPERTIES__ANY_GENERIC_ELEM);
		}
		return anyGenericElem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnyfeatureadaptedPackage.PROPERTIES__ANY_GENERIC_ELEM:
				return ((InternalEList<?>)getAnyGenericElem()).basicRemove(otherEnd, msgs);
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
			case AnyfeatureadaptedPackage.PROPERTIES__ANY_GENERIC_ELEM:
				return getAnyGenericElem();
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
			case AnyfeatureadaptedPackage.PROPERTIES__ANY_GENERIC_ELEM:
				getAnyGenericElem().clear();
				getAnyGenericElem().addAll((Collection<? extends AnyGenericConstruct>)newValue);
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
			case AnyfeatureadaptedPackage.PROPERTIES__ANY_GENERIC_ELEM:
				getAnyGenericElem().clear();
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
			case AnyfeatureadaptedPackage.PROPERTIES__ANY_GENERIC_ELEM:
				return anyGenericElem != null && !anyGenericElem.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PropertiesImpl
