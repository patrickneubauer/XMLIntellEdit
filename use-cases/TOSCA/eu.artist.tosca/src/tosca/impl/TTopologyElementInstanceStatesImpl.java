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

import tosca.InstanceStateType;
import tosca.TTopologyElementInstanceStates;
import tosca.ToscaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TTopology Element Instance States</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tosca.impl.TTopologyElementInstanceStatesImpl#getInstanceState <em>Instance State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TTopologyElementInstanceStatesImpl extends MinimalEObjectImpl.Container implements TTopologyElementInstanceStates {
	/**
	 * The cached value of the '{@link #getInstanceState() <em>Instance State</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceState()
	 * @generated
	 * @ordered
	 */
	protected EList<InstanceStateType> instanceState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TTopologyElementInstanceStatesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToscaPackage.Literals.TTOPOLOGY_ELEMENT_INSTANCE_STATES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InstanceStateType> getInstanceState() {
		if (instanceState == null) {
			instanceState = new EObjectContainmentEList<InstanceStateType>(InstanceStateType.class, this, ToscaPackage.TTOPOLOGY_ELEMENT_INSTANCE_STATES__INSTANCE_STATE);
		}
		return instanceState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToscaPackage.TTOPOLOGY_ELEMENT_INSTANCE_STATES__INSTANCE_STATE:
				return ((InternalEList<?>)getInstanceState()).basicRemove(otherEnd, msgs);
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
			case ToscaPackage.TTOPOLOGY_ELEMENT_INSTANCE_STATES__INSTANCE_STATE:
				return getInstanceState();
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
			case ToscaPackage.TTOPOLOGY_ELEMENT_INSTANCE_STATES__INSTANCE_STATE:
				getInstanceState().clear();
				getInstanceState().addAll((Collection<? extends InstanceStateType>)newValue);
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
			case ToscaPackage.TTOPOLOGY_ELEMENT_INSTANCE_STATES__INSTANCE_STATE:
				getInstanceState().clear();
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
			case ToscaPackage.TTOPOLOGY_ELEMENT_INSTANCE_STATES__INSTANCE_STATE:
				return instanceState != null && !instanceState.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TTopologyElementInstanceStatesImpl
