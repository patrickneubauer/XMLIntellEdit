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

import xontomlextensionsschemacoreSimplified.CONTAINEDEATEMPLATES;
import xontomlextensionsschemacoreSimplified.EATEMPLATE;
import xontomlextensionsschemacoreSimplified.XontomlextensionsschemacoreSimplifiedPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CONTAINEDEATEMPLATES</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xontomlextensionsschemacoreSimplified.impl.CONTAINEDEATEMPLATESImpl#getEaTemplates <em>Ea Templates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CONTAINEDEATEMPLATESImpl extends MinimalEObjectImpl.Container implements CONTAINEDEATEMPLATES {
	/**
	 * The cached value of the '{@link #getEaTemplates() <em>Ea Templates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEaTemplates()
	 * @generated
	 * @ordered
	 */
	protected EList<EATEMPLATE> eaTemplates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CONTAINEDEATEMPLATESImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XontomlextensionsschemacoreSimplifiedPackage.Literals.CONTAINEDEATEMPLATES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EATEMPLATE> getEaTemplates() {
		if (eaTemplates == null) {
			eaTemplates = new EObjectContainmentEList<EATEMPLATE>(EATEMPLATE.class, this, XontomlextensionsschemacoreSimplifiedPackage.CONTAINEDEATEMPLATES__EA_TEMPLATES);
		}
		return eaTemplates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XontomlextensionsschemacoreSimplifiedPackage.CONTAINEDEATEMPLATES__EA_TEMPLATES:
				return ((InternalEList<?>)getEaTemplates()).basicRemove(otherEnd, msgs);
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
			case XontomlextensionsschemacoreSimplifiedPackage.CONTAINEDEATEMPLATES__EA_TEMPLATES:
				return getEaTemplates();
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
			case XontomlextensionsschemacoreSimplifiedPackage.CONTAINEDEATEMPLATES__EA_TEMPLATES:
				getEaTemplates().clear();
				getEaTemplates().addAll((Collection<? extends EATEMPLATE>)newValue);
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
			case XontomlextensionsschemacoreSimplifiedPackage.CONTAINEDEATEMPLATES__EA_TEMPLATES:
				getEaTemplates().clear();
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
			case XontomlextensionsschemacoreSimplifiedPackage.CONTAINEDEATEMPLATES__EA_TEMPLATES:
				return eaTemplates != null && !eaTemplates.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CONTAINEDEATEMPLATESImpl
