/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DERIVEDUNIT;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DERIVEDUNITELEMENT;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DERIVEDUNIT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.DERIVEDUNITImpl#getDerivedUnitElements <em>Derived Unit Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DERIVEDUNITImpl extends UNITImpl implements DERIVEDUNIT {
	/**
	 * The cached value of the '{@link #getDerivedUnitElements() <em>Derived Unit Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedUnitElements()
	 * @generated
	 * @ordered
	 */
	protected EList<DERIVEDUNITELEMENT> derivedUnitElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DERIVEDUNITImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.DERIVEDUNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DERIVEDUNITELEMENT> getDerivedUnitElements() {
		if (derivedUnitElements == null) {
			derivedUnitElements = new EObjectContainmentEList<DERIVEDUNITELEMENT>(DERIVEDUNITELEMENT.class, this, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DERIVEDUNIT__DERIVED_UNIT_ELEMENTS);
		}
		return derivedUnitElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DERIVEDUNIT__DERIVED_UNIT_ELEMENTS:
				return ((InternalEList<?>)getDerivedUnitElements()).basicRemove(otherEnd, msgs);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DERIVEDUNIT__DERIVED_UNIT_ELEMENTS:
				return getDerivedUnitElements();
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DERIVEDUNIT__DERIVED_UNIT_ELEMENTS:
				getDerivedUnitElements().clear();
				getDerivedUnitElements().addAll((Collection<? extends DERIVEDUNITELEMENT>)newValue);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DERIVEDUNIT__DERIVED_UNIT_ELEMENTS:
				getDerivedUnitElements().clear();
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DERIVEDUNIT__DERIVED_UNIT_ELEMENTS:
				return derivedUnitElements != null && !derivedUnitElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DERIVEDUNITImpl
