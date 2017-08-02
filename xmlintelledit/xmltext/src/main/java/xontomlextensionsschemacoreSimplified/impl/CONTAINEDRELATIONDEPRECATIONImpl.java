/**
 */
package xontomlextensionsschemacoreSimplified.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import xontomlextensionsschemacoreSimplified.CONTAINEDRELATIONDEPRECATION;
import xontomlextensionsschemacoreSimplified.DEPRECATION;
import xontomlextensionsschemacoreSimplified.XontomlextensionsschemacoreSimplifiedPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CONTAINEDRELATIONDEPRECATION</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xontomlextensionsschemacoreSimplified.impl.CONTAINEDRELATIONDEPRECATIONImpl#getDeprecations <em>Deprecations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CONTAINEDRELATIONDEPRECATIONImpl extends MinimalEObjectImpl.Container implements CONTAINEDRELATIONDEPRECATION {
	/**
	 * The cached value of the '{@link #getDeprecations() <em>Deprecations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeprecations()
	 * @generated
	 * @ordered
	 */
	protected EList<DEPRECATION> deprecations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CONTAINEDRELATIONDEPRECATIONImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XontomlextensionsschemacoreSimplifiedPackage.Literals.CONTAINEDRELATIONDEPRECATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DEPRECATION> getDeprecations() {
		if (deprecations == null) {
			deprecations = new EObjectContainmentEList<DEPRECATION>(DEPRECATION.class, this, XontomlextensionsschemacoreSimplifiedPackage.CONTAINEDRELATIONDEPRECATION__DEPRECATIONS);
		}
		return deprecations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XontomlextensionsschemacoreSimplifiedPackage.CONTAINEDRELATIONDEPRECATION__DEPRECATIONS:
				return ((InternalEList<?>)getDeprecations()).basicRemove(otherEnd, msgs);
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
			case XontomlextensionsschemacoreSimplifiedPackage.CONTAINEDRELATIONDEPRECATION__DEPRECATIONS:
				return getDeprecations();
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
			case XontomlextensionsschemacoreSimplifiedPackage.CONTAINEDRELATIONDEPRECATION__DEPRECATIONS:
				getDeprecations().clear();
				getDeprecations().addAll((Collection<? extends DEPRECATION>)newValue);
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
			case XontomlextensionsschemacoreSimplifiedPackage.CONTAINEDRELATIONDEPRECATION__DEPRECATIONS:
				getDeprecations().clear();
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
			case XontomlextensionsschemacoreSimplifiedPackage.CONTAINEDRELATIONDEPRECATION__DEPRECATIONS:
				return deprecations != null && !deprecations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CONTAINEDRELATIONDEPRECATIONImpl
