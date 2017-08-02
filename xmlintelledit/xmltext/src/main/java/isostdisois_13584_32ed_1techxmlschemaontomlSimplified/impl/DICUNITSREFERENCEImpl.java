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

import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DICUNITREFERENCE;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DICUNITSREFERENCE;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DICUNITSREFERENCE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.DICUNITSREFERENCEImpl#getDicUnits <em>Dic Units</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DICUNITSREFERENCEImpl extends MinimalEObjectImpl.Container implements DICUNITSREFERENCE {
	/**
	 * The cached value of the '{@link #getDicUnits() <em>Dic Units</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDicUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<DICUNITREFERENCE> dicUnits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DICUNITSREFERENCEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.DICUNITSREFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DICUNITREFERENCE> getDicUnits() {
		if (dicUnits == null) {
			dicUnits = new EObjectContainmentEList<DICUNITREFERENCE>(DICUNITREFERENCE.class, this, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICUNITSREFERENCE__DIC_UNITS);
		}
		return dicUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICUNITSREFERENCE__DIC_UNITS:
				return ((InternalEList<?>)getDicUnits()).basicRemove(otherEnd, msgs);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICUNITSREFERENCE__DIC_UNITS:
				return getDicUnits();
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICUNITSREFERENCE__DIC_UNITS:
				getDicUnits().clear();
				getDicUnits().addAll((Collection<? extends DICUNITREFERENCE>)newValue);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICUNITSREFERENCE__DIC_UNITS:
				getDicUnits().clear();
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICUNITSREFERENCE__DIC_UNITS:
				return dicUnits != null && !dicUnits.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DICUNITSREFERENCEImpl
