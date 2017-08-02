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

import xontomlextensionsschemacoreSimplified.CONTAINEDEAINSTANCES;
import xontomlextensionsschemacoreSimplified.ENTITYEXTENDEDATTRIBUTES;
import xontomlextensionsschemacoreSimplified.XontomlextensionsschemacoreSimplifiedPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CONTAINEDEAINSTANCES</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xontomlextensionsschemacoreSimplified.impl.CONTAINEDEAINSTANCESImpl#getEntityEas <em>Entity Eas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CONTAINEDEAINSTANCESImpl extends MinimalEObjectImpl.Container implements CONTAINEDEAINSTANCES {
	/**
	 * The cached value of the '{@link #getEntityEas() <em>Entity Eas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityEas()
	 * @generated
	 * @ordered
	 */
	protected EList<ENTITYEXTENDEDATTRIBUTES> entityEas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CONTAINEDEAINSTANCESImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XontomlextensionsschemacoreSimplifiedPackage.Literals.CONTAINEDEAINSTANCES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ENTITYEXTENDEDATTRIBUTES> getEntityEas() {
		if (entityEas == null) {
			entityEas = new EObjectContainmentEList<ENTITYEXTENDEDATTRIBUTES>(ENTITYEXTENDEDATTRIBUTES.class, this, XontomlextensionsschemacoreSimplifiedPackage.CONTAINEDEAINSTANCES__ENTITY_EAS);
		}
		return entityEas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XontomlextensionsschemacoreSimplifiedPackage.CONTAINEDEAINSTANCES__ENTITY_EAS:
				return ((InternalEList<?>)getEntityEas()).basicRemove(otherEnd, msgs);
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
			case XontomlextensionsschemacoreSimplifiedPackage.CONTAINEDEAINSTANCES__ENTITY_EAS:
				return getEntityEas();
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
			case XontomlextensionsschemacoreSimplifiedPackage.CONTAINEDEAINSTANCES__ENTITY_EAS:
				getEntityEas().clear();
				getEntityEas().addAll((Collection<? extends ENTITYEXTENDEDATTRIBUTES>)newValue);
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
			case XontomlextensionsschemacoreSimplifiedPackage.CONTAINEDEAINSTANCES__ENTITY_EAS:
				getEntityEas().clear();
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
			case XontomlextensionsschemacoreSimplifiedPackage.CONTAINEDEAINSTANCES__ENTITY_EAS:
				return entityEas != null && !entityEas.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CONTAINEDEAINSTANCESImpl
