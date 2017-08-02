/**
 */
package DataPackage.impl;

import DataPackage.DataClass;
import DataPackage.DataPackagePackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link DataPackage.impl.DataClassImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 *   <li>{@link DataPackage.impl.DataClassImpl#getAnyElement <em>Any Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataClassImpl extends MinimalEObjectImpl.Container implements DataClass {
	/**
	 * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyAttribute()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap anyAttribute;

	/**
	 * The cached value of the '{@link #getAnyElement() <em>Any Element</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyElement()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap anyElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackagePackage.Literals.DATA_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, DataPackagePackage.DATA_CLASS__ANY_ATTRIBUTE);
		}
		return anyAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyElement() {
		if (anyElement == null) {
			anyElement = new BasicFeatureMap(this, DataPackagePackage.DATA_CLASS__ANY_ELEMENT);
		}
		return anyElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataPackagePackage.DATA_CLASS__ANY_ATTRIBUTE:
				return ((InternalEList<?>)getAnyAttribute()).basicRemove(otherEnd, msgs);
			case DataPackagePackage.DATA_CLASS__ANY_ELEMENT:
				return ((InternalEList<?>)getAnyElement()).basicRemove(otherEnd, msgs);
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
			case DataPackagePackage.DATA_CLASS__ANY_ATTRIBUTE:
				if (coreType) return getAnyAttribute();
				return ((FeatureMap.Internal)getAnyAttribute()).getWrapper();
			case DataPackagePackage.DATA_CLASS__ANY_ELEMENT:
				if (coreType) return getAnyElement();
				return ((FeatureMap.Internal)getAnyElement()).getWrapper();
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
			case DataPackagePackage.DATA_CLASS__ANY_ATTRIBUTE:
				((FeatureMap.Internal)getAnyAttribute()).set(newValue);
				return;
			case DataPackagePackage.DATA_CLASS__ANY_ELEMENT:
				((FeatureMap.Internal)getAnyElement()).set(newValue);
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
			case DataPackagePackage.DATA_CLASS__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
				return;
			case DataPackagePackage.DATA_CLASS__ANY_ELEMENT:
				getAnyElement().clear();
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
			case DataPackagePackage.DATA_CLASS__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
			case DataPackagePackage.DATA_CLASS__ANY_ELEMENT:
				return anyElement != null && !anyElement.isEmpty();
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
		result.append(" (anyAttribute: ");
		result.append(anyAttribute);
		result.append(", anyElement: ");
		result.append(anyElement);
		result.append(')');
		return result.toString();
	}

} //DataClassImpl
