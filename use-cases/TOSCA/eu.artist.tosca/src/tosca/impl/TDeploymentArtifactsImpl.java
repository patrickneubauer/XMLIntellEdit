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

import tosca.TDeploymentArtifact;
import tosca.TDeploymentArtifacts;
import tosca.ToscaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TDeployment Artifacts</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tosca.impl.TDeploymentArtifactsImpl#getDeploymentArtifact <em>Deployment Artifact</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TDeploymentArtifactsImpl extends MinimalEObjectImpl.Container implements TDeploymentArtifacts {
	/**
	 * The cached value of the '{@link #getDeploymentArtifact() <em>Deployment Artifact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentArtifact()
	 * @generated
	 * @ordered
	 */
	protected EList<TDeploymentArtifact> deploymentArtifact;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TDeploymentArtifactsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToscaPackage.Literals.TDEPLOYMENT_ARTIFACTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TDeploymentArtifact> getDeploymentArtifact() {
		if (deploymentArtifact == null) {
			deploymentArtifact = new EObjectContainmentEList<TDeploymentArtifact>(TDeploymentArtifact.class, this, ToscaPackage.TDEPLOYMENT_ARTIFACTS__DEPLOYMENT_ARTIFACT);
		}
		return deploymentArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToscaPackage.TDEPLOYMENT_ARTIFACTS__DEPLOYMENT_ARTIFACT:
				return ((InternalEList<?>)getDeploymentArtifact()).basicRemove(otherEnd, msgs);
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
			case ToscaPackage.TDEPLOYMENT_ARTIFACTS__DEPLOYMENT_ARTIFACT:
				return getDeploymentArtifact();
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
			case ToscaPackage.TDEPLOYMENT_ARTIFACTS__DEPLOYMENT_ARTIFACT:
				getDeploymentArtifact().clear();
				getDeploymentArtifact().addAll((Collection<? extends TDeploymentArtifact>)newValue);
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
			case ToscaPackage.TDEPLOYMENT_ARTIFACTS__DEPLOYMENT_ARTIFACT:
				getDeploymentArtifact().clear();
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
			case ToscaPackage.TDEPLOYMENT_ARTIFACTS__DEPLOYMENT_ARTIFACT:
				return deploymentArtifact != null && !deploymentArtifact.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TDeploymentArtifactsImpl
