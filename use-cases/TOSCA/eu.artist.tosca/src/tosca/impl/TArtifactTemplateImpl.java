/**
 */
package tosca.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tosca.ArtifactReferencesType;
import tosca.TArtifactTemplate;
import tosca.ToscaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TArtifact Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tosca.impl.TArtifactTemplateImpl#getArtifactReferences <em>Artifact References</em>}</li>
 *   <li>{@link tosca.impl.TArtifactTemplateImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TArtifactTemplateImpl extends TEntityTemplateImpl implements TArtifactTemplate {
	/**
	 * The cached value of the '{@link #getArtifactReferences() <em>Artifact References</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactReferences()
	 * @generated
	 * @ordered
	 */
	protected ArtifactReferencesType artifactReferences;

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
	protected TArtifactTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToscaPackage.Literals.TARTIFACT_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactReferencesType getArtifactReferences() {
		return artifactReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArtifactReferences(ArtifactReferencesType newArtifactReferences, NotificationChain msgs) {
		ArtifactReferencesType oldArtifactReferences = artifactReferences;
		artifactReferences = newArtifactReferences;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToscaPackage.TARTIFACT_TEMPLATE__ARTIFACT_REFERENCES, oldArtifactReferences, newArtifactReferences);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArtifactReferences(ArtifactReferencesType newArtifactReferences) {
		if (newArtifactReferences != artifactReferences) {
			NotificationChain msgs = null;
			if (artifactReferences != null)
				msgs = ((InternalEObject)artifactReferences).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TARTIFACT_TEMPLATE__ARTIFACT_REFERENCES, null, msgs);
			if (newArtifactReferences != null)
				msgs = ((InternalEObject)newArtifactReferences).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TARTIFACT_TEMPLATE__ARTIFACT_REFERENCES, null, msgs);
			msgs = basicSetArtifactReferences(newArtifactReferences, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TARTIFACT_TEMPLATE__ARTIFACT_REFERENCES, newArtifactReferences, newArtifactReferences));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TARTIFACT_TEMPLATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToscaPackage.TARTIFACT_TEMPLATE__ARTIFACT_REFERENCES:
				return basicSetArtifactReferences(null, msgs);
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
			case ToscaPackage.TARTIFACT_TEMPLATE__ARTIFACT_REFERENCES:
				return getArtifactReferences();
			case ToscaPackage.TARTIFACT_TEMPLATE__NAME:
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
			case ToscaPackage.TARTIFACT_TEMPLATE__ARTIFACT_REFERENCES:
				setArtifactReferences((ArtifactReferencesType)newValue);
				return;
			case ToscaPackage.TARTIFACT_TEMPLATE__NAME:
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
			case ToscaPackage.TARTIFACT_TEMPLATE__ARTIFACT_REFERENCES:
				setArtifactReferences((ArtifactReferencesType)null);
				return;
			case ToscaPackage.TARTIFACT_TEMPLATE__NAME:
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
			case ToscaPackage.TARTIFACT_TEMPLATE__ARTIFACT_REFERENCES:
				return artifactReferences != null;
			case ToscaPackage.TARTIFACT_TEMPLATE__NAME:
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TArtifactTemplateImpl
