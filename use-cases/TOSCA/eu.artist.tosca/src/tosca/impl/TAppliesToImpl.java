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

import tosca.NodeTypeReferenceType;
import tosca.TAppliesTo;
import tosca.ToscaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TApplies To</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tosca.impl.TAppliesToImpl#getNodeTypeReference <em>Node Type Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TAppliesToImpl extends MinimalEObjectImpl.Container implements TAppliesTo {
	/**
	 * The cached value of the '{@link #getNodeTypeReference() <em>Node Type Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeTypeReference()
	 * @generated
	 * @ordered
	 */
	protected EList<NodeTypeReferenceType> nodeTypeReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TAppliesToImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToscaPackage.Literals.TAPPLIES_TO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NodeTypeReferenceType> getNodeTypeReference() {
		if (nodeTypeReference == null) {
			nodeTypeReference = new EObjectContainmentEList<NodeTypeReferenceType>(NodeTypeReferenceType.class, this, ToscaPackage.TAPPLIES_TO__NODE_TYPE_REFERENCE);
		}
		return nodeTypeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToscaPackage.TAPPLIES_TO__NODE_TYPE_REFERENCE:
				return ((InternalEList<?>)getNodeTypeReference()).basicRemove(otherEnd, msgs);
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
			case ToscaPackage.TAPPLIES_TO__NODE_TYPE_REFERENCE:
				return getNodeTypeReference();
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
			case ToscaPackage.TAPPLIES_TO__NODE_TYPE_REFERENCE:
				getNodeTypeReference().clear();
				getNodeTypeReference().addAll((Collection<? extends NodeTypeReferenceType>)newValue);
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
			case ToscaPackage.TAPPLIES_TO__NODE_TYPE_REFERENCE:
				getNodeTypeReference().clear();
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
			case ToscaPackage.TAPPLIES_TO__NODE_TYPE_REFERENCE:
				return nodeTypeReference != null && !nodeTypeReference.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TAppliesToImpl
