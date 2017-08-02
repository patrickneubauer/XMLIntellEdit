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
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.REMOTELOCATIONS;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.RemoteLocation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>REMOTELOCATIONS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.REMOTELOCATIONSImpl#getRemoteLocations <em>Remote Locations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class REMOTELOCATIONSImpl extends MinimalEObjectImpl.Container implements REMOTELOCATIONS {
	/**
	 * The cached value of the '{@link #getRemoteLocations() <em>Remote Locations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<RemoteLocation> remoteLocations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected REMOTELOCATIONSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.REMOTELOCATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RemoteLocation> getRemoteLocations() {
		if (remoteLocations == null) {
			remoteLocations = new EObjectContainmentEList<RemoteLocation>(RemoteLocation.class, this, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REMOTELOCATIONS__REMOTE_LOCATIONS);
		}
		return remoteLocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REMOTELOCATIONS__REMOTE_LOCATIONS:
				return ((InternalEList<?>)getRemoteLocations()).basicRemove(otherEnd, msgs);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REMOTELOCATIONS__REMOTE_LOCATIONS:
				return getRemoteLocations();
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REMOTELOCATIONS__REMOTE_LOCATIONS:
				getRemoteLocations().clear();
				getRemoteLocations().addAll((Collection<? extends RemoteLocation>)newValue);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REMOTELOCATIONS__REMOTE_LOCATIONS:
				getRemoteLocations().clear();
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REMOTELOCATIONS__REMOTE_LOCATIONS:
				return remoteLocations != null && !remoteLocations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //REMOTELOCATIONSImpl
