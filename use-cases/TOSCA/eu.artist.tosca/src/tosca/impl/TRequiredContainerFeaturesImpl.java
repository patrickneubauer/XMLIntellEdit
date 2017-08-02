/**
 */
package tosca.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tosca.TRequiredContainerFeature;
import tosca.TRequiredContainerFeatures;
import tosca.ToscaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TRequired Container Features</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tosca.impl.TRequiredContainerFeaturesImpl#getRequiredContainerFeature <em>Required Container Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TRequiredContainerFeaturesImpl extends MinimalEObjectImpl.Container implements TRequiredContainerFeatures {
	/**
	 * The cached value of the '{@link #getRequiredContainerFeature() <em>Required Container Feature</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredContainerFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<TRequiredContainerFeature> requiredContainerFeature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TRequiredContainerFeaturesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToscaPackage.Literals.TREQUIRED_CONTAINER_FEATURES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TRequiredContainerFeature> getRequiredContainerFeature() {
		if (requiredContainerFeature == null) {
			requiredContainerFeature = new EObjectContainmentEList<TRequiredContainerFeature>(TRequiredContainerFeature.class, this, ToscaPackage.TREQUIRED_CONTAINER_FEATURES__REQUIRED_CONTAINER_FEATURE);
		}
		return requiredContainerFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToscaPackage.TREQUIRED_CONTAINER_FEATURES__REQUIRED_CONTAINER_FEATURE:
				return ((InternalEList<?>)getRequiredContainerFeature()).basicRemove(otherEnd, msgs);
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
			case ToscaPackage.TREQUIRED_CONTAINER_FEATURES__REQUIRED_CONTAINER_FEATURE:
				return getRequiredContainerFeature();
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
			case ToscaPackage.TREQUIRED_CONTAINER_FEATURES__REQUIRED_CONTAINER_FEATURE:
				getRequiredContainerFeature().clear();
				getRequiredContainerFeature().addAll((Collection<? extends TRequiredContainerFeature>)newValue);
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
			case ToscaPackage.TREQUIRED_CONTAINER_FEATURES__REQUIRED_CONTAINER_FEATURE:
				getRequiredContainerFeature().clear();
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
			case ToscaPackage.TREQUIRED_CONTAINER_FEATURES__REQUIRED_CONTAINER_FEATURE:
				return requiredContainerFeature != null && !requiredContainerFeature.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TRequiredContainerFeaturesImpl
