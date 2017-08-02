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
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SUPPORTEDVEP;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.VIEWEXCHANGEPROTOCOLIDENTIFICATION;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SUPPORTEDVEP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.SUPPORTEDVEPImpl#getViewExchangeProtocolIdentifications <em>View Exchange Protocol Identifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SUPPORTEDVEPImpl extends MinimalEObjectImpl.Container implements SUPPORTEDVEP {
	/**
	 * The cached value of the '{@link #getViewExchangeProtocolIdentifications() <em>View Exchange Protocol Identifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewExchangeProtocolIdentifications()
	 * @generated
	 * @ordered
	 */
	protected EList<VIEWEXCHANGEPROTOCOLIDENTIFICATION> viewExchangeProtocolIdentifications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SUPPORTEDVEPImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.SUPPORTEDVEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VIEWEXCHANGEPROTOCOLIDENTIFICATION> getViewExchangeProtocolIdentifications() {
		if (viewExchangeProtocolIdentifications == null) {
			viewExchangeProtocolIdentifications = new EObjectContainmentEList<VIEWEXCHANGEPROTOCOLIDENTIFICATION>(VIEWEXCHANGEPROTOCOLIDENTIFICATION.class, this, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SUPPORTEDVEP__VIEW_EXCHANGE_PROTOCOL_IDENTIFICATIONS);
		}
		return viewExchangeProtocolIdentifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SUPPORTEDVEP__VIEW_EXCHANGE_PROTOCOL_IDENTIFICATIONS:
				return ((InternalEList<?>)getViewExchangeProtocolIdentifications()).basicRemove(otherEnd, msgs);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SUPPORTEDVEP__VIEW_EXCHANGE_PROTOCOL_IDENTIFICATIONS:
				return getViewExchangeProtocolIdentifications();
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SUPPORTEDVEP__VIEW_EXCHANGE_PROTOCOL_IDENTIFICATIONS:
				getViewExchangeProtocolIdentifications().clear();
				getViewExchangeProtocolIdentifications().addAll((Collection<? extends VIEWEXCHANGEPROTOCOLIDENTIFICATION>)newValue);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SUPPORTEDVEP__VIEW_EXCHANGE_PROTOCOL_IDENTIFICATIONS:
				getViewExchangeProtocolIdentifications().clear();
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SUPPORTEDVEP__VIEW_EXCHANGE_PROTOCOL_IDENTIFICATIONS:
				return viewExchangeProtocolIdentifications != null && !viewExchangeProtocolIdentifications.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SUPPORTEDVEPImpl
