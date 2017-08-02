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
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SUPPLIERREFERENCE;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SUPPLIERSREFERENCE;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SUPPLIERSREFERENCE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.SUPPLIERSREFERENCEImpl#getSuppliers <em>Suppliers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SUPPLIERSREFERENCEImpl extends MinimalEObjectImpl.Container implements SUPPLIERSREFERENCE {
	/**
	 * The cached value of the '{@link #getSuppliers() <em>Suppliers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuppliers()
	 * @generated
	 * @ordered
	 */
	protected EList<SUPPLIERREFERENCE> suppliers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SUPPLIERSREFERENCEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.SUPPLIERSREFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SUPPLIERREFERENCE> getSuppliers() {
		if (suppliers == null) {
			suppliers = new EObjectContainmentEList<SUPPLIERREFERENCE>(SUPPLIERREFERENCE.class, this, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SUPPLIERSREFERENCE__SUPPLIERS);
		}
		return suppliers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SUPPLIERSREFERENCE__SUPPLIERS:
				return ((InternalEList<?>)getSuppliers()).basicRemove(otherEnd, msgs);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SUPPLIERSREFERENCE__SUPPLIERS:
				return getSuppliers();
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SUPPLIERSREFERENCE__SUPPLIERS:
				getSuppliers().clear();
				getSuppliers().addAll((Collection<? extends SUPPLIERREFERENCE>)newValue);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SUPPLIERSREFERENCE__SUPPLIERS:
				getSuppliers().clear();
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SUPPLIERSREFERENCE__SUPPLIERS:
				return suppliers != null && !suppliers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SUPPLIERSREFERENCEImpl
