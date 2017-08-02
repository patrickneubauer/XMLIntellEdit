/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.VCVRANGE;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.VIEWCONTROLVARIABLERANGE;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VCVRANGE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.VCVRANGEImpl#getViewControlVariableRanges <em>View Control Variable Ranges</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VCVRANGEImpl extends MinimalEObjectImpl.Container implements VCVRANGE {
	/**
	 * The cached value of the '{@link #getViewControlVariableRanges() <em>View Control Variable Ranges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewControlVariableRanges()
	 * @generated
	 * @ordered
	 */
	protected EList<VIEWCONTROLVARIABLERANGE> viewControlVariableRanges;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VCVRANGEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.VCVRANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VIEWCONTROLVARIABLERANGE> getViewControlVariableRanges() {
		if (viewControlVariableRanges == null) {
			viewControlVariableRanges = new EObjectContainmentEList<VIEWCONTROLVARIABLERANGE>(VIEWCONTROLVARIABLERANGE.class, this, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.VCVRANGE__VIEW_CONTROL_VARIABLE_RANGES);
		}
		return viewControlVariableRanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.VCVRANGE__VIEW_CONTROL_VARIABLE_RANGES:
				return ((InternalEList<?>)getViewControlVariableRanges()).basicRemove(otherEnd, msgs);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.VCVRANGE__VIEW_CONTROL_VARIABLE_RANGES:
				return getViewControlVariableRanges();
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.VCVRANGE__VIEW_CONTROL_VARIABLE_RANGES:
				getViewControlVariableRanges().clear();
				getViewControlVariableRanges().addAll((Collection<? extends VIEWCONTROLVARIABLERANGE>)newValue);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.VCVRANGE__VIEW_CONTROL_VARIABLE_RANGES:
				getViewControlVariableRanges().clear();
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.VCVRANGE__VIEW_CONTROL_VARIABLE_RANGES:
				return viewControlVariableRanges != null && !viewControlVariableRanges.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VCVRANGEImpl
