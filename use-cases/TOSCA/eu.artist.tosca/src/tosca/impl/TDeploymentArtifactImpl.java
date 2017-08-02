/**
 */
package tosca.impl;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tosca.TDeploymentArtifact;
import tosca.ToscaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TDeployment Artifact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tosca.impl.TDeploymentArtifactImpl#getArtifactRef <em>Artifact Ref</em>}</li>
 *   <li>{@link tosca.impl.TDeploymentArtifactImpl#getArtifactType <em>Artifact Type</em>}</li>
 *   <li>{@link tosca.impl.TDeploymentArtifactImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TDeploymentArtifactImpl extends TExtensibleElementsImpl implements TDeploymentArtifact {
	/**
	 * The default value of the '{@link #getArtifactRef() <em>Artifact Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactRef()
	 * @generated
	 * @ordered
	 */
	protected static final QName ARTIFACT_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArtifactRef() <em>Artifact Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactRef()
	 * @generated
	 * @ordered
	 */
	protected QName artifactRef = ARTIFACT_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getArtifactType() <em>Artifact Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactType()
	 * @generated
	 * @ordered
	 */
	protected static final QName ARTIFACT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArtifactType() <em>Artifact Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactType()
	 * @generated
	 * @ordered
	 */
	protected QName artifactType = ARTIFACT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TDeploymentArtifactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToscaPackage.Literals.TDEPLOYMENT_ARTIFACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getArtifactRef() {
		return artifactRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArtifactRef(QName newArtifactRef) {
		QName oldArtifactRef = artifactRef;
		artifactRef = newArtifactRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TDEPLOYMENT_ARTIFACT__ARTIFACT_REF, oldArtifactRef, artifactRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getArtifactType() {
		return artifactType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArtifactType(QName newArtifactType) {
		QName oldArtifactType = artifactType;
		artifactType = newArtifactType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TDEPLOYMENT_ARTIFACT__ARTIFACT_TYPE, oldArtifactType, artifactType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TDEPLOYMENT_ARTIFACT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToscaPackage.TDEPLOYMENT_ARTIFACT__ARTIFACT_REF:
				return getArtifactRef();
			case ToscaPackage.TDEPLOYMENT_ARTIFACT__ARTIFACT_TYPE:
				return getArtifactType();
			case ToscaPackage.TDEPLOYMENT_ARTIFACT__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ToscaPackage.TDEPLOYMENT_ARTIFACT__ARTIFACT_REF:
				setArtifactRef((QName)newValue);
				return;
			case ToscaPackage.TDEPLOYMENT_ARTIFACT__ARTIFACT_TYPE:
				setArtifactType((QName)newValue);
				return;
			case ToscaPackage.TDEPLOYMENT_ARTIFACT__NAME:
				setName((String)newValue);
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
			case ToscaPackage.TDEPLOYMENT_ARTIFACT__ARTIFACT_REF:
				setArtifactRef(ARTIFACT_REF_EDEFAULT);
				return;
			case ToscaPackage.TDEPLOYMENT_ARTIFACT__ARTIFACT_TYPE:
				setArtifactType(ARTIFACT_TYPE_EDEFAULT);
				return;
			case ToscaPackage.TDEPLOYMENT_ARTIFACT__NAME:
				setName(NAME_EDEFAULT);
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
			case ToscaPackage.TDEPLOYMENT_ARTIFACT__ARTIFACT_REF:
				return ARTIFACT_REF_EDEFAULT == null ? artifactRef != null : !ARTIFACT_REF_EDEFAULT.equals(artifactRef);
			case ToscaPackage.TDEPLOYMENT_ARTIFACT__ARTIFACT_TYPE:
				return ARTIFACT_TYPE_EDEFAULT == null ? artifactType != null : !ARTIFACT_TYPE_EDEFAULT.equals(artifactType);
			case ToscaPackage.TDEPLOYMENT_ARTIFACT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (artifactRef: ");
		result.append(artifactRef);
		result.append(", artifactType: ");
		result.append(artifactType);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TDeploymentArtifactImpl
