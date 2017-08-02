/**
 */
package tosca.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tosca.CapabilitiesType_TCapability;
import tosca.PoliciesType;
import tosca.RequirementsType_TRequirement;
import tosca.TDeploymentArtifacts;
import tosca.TNodeTemplate;
import tosca.ToscaFactory;
import tosca.ToscaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TNode Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tosca.impl.TNodeTemplateImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link tosca.impl.TNodeTemplateImpl#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link tosca.impl.TNodeTemplateImpl#getPolicies <em>Policies</em>}</li>
 *   <li>{@link tosca.impl.TNodeTemplateImpl#getDeploymentArtifacts <em>Deployment Artifacts</em>}</li>
 *   <li>{@link tosca.impl.TNodeTemplateImpl#getMaxInstances <em>Max Instances</em>}</li>
 *   <li>{@link tosca.impl.TNodeTemplateImpl#getMinInstances <em>Min Instances</em>}</li>
 *   <li>{@link tosca.impl.TNodeTemplateImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TNodeTemplateImpl extends TEntityTemplateImpl implements TNodeTemplate {
	/**
	 * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirements()
	 * @generated
	 * @ordered
	 */
	protected RequirementsType_TRequirement requirements;

	/**
	 * The cached value of the '{@link #getCapabilities() <em>Capabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilities()
	 * @generated
	 * @ordered
	 */
	protected CapabilitiesType_TCapability capabilities;

	/**
	 * The cached value of the '{@link #getPolicies() <em>Policies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicies()
	 * @generated
	 * @ordered
	 */
	protected PoliciesType policies;

	/**
	 * The cached value of the '{@link #getDeploymentArtifacts() <em>Deployment Artifacts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentArtifacts()
	 * @generated
	 * @ordered
	 */
	protected TDeploymentArtifacts deploymentArtifacts;

	/**
	 * The default value of the '{@link #getMaxInstances() <em>Max Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxInstances()
	 * @generated
	 * @ordered
	 */
	protected static final Object MAX_INSTANCES_EDEFAULT = ToscaFactory.eINSTANCE.createFromString(ToscaPackage.eINSTANCE.getMaxInstancesType(), "1");

	/**
	 * The cached value of the '{@link #getMaxInstances() <em>Max Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxInstances()
	 * @generated
	 * @ordered
	 */
	protected Object maxInstances = MAX_INSTANCES_EDEFAULT;

	/**
	 * This is true if the Max Instances attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxInstancesESet;

	/**
	 * The default value of the '{@link #getMinInstances() <em>Min Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinInstances()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_INSTANCES_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getMinInstances() <em>Min Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinInstances()
	 * @generated
	 * @ordered
	 */
	protected int minInstances = MIN_INSTANCES_EDEFAULT;

	/**
	 * This is true if the Min Instances attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minInstancesESet;

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
	protected TNodeTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToscaPackage.Literals.TNODE_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementsType_TRequirement getRequirements() {
		return requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequirements(RequirementsType_TRequirement newRequirements, NotificationChain msgs) {
		RequirementsType_TRequirement oldRequirements = requirements;
		requirements = newRequirements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToscaPackage.TNODE_TEMPLATE__REQUIREMENTS, oldRequirements, newRequirements);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequirements(RequirementsType_TRequirement newRequirements) {
		if (newRequirements != requirements) {
			NotificationChain msgs = null;
			if (requirements != null)
				msgs = ((InternalEObject)requirements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TNODE_TEMPLATE__REQUIREMENTS, null, msgs);
			if (newRequirements != null)
				msgs = ((InternalEObject)newRequirements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TNODE_TEMPLATE__REQUIREMENTS, null, msgs);
			msgs = basicSetRequirements(newRequirements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TNODE_TEMPLATE__REQUIREMENTS, newRequirements, newRequirements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilitiesType_TCapability getCapabilities() {
		return capabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCapabilities(CapabilitiesType_TCapability newCapabilities, NotificationChain msgs) {
		CapabilitiesType_TCapability oldCapabilities = capabilities;
		capabilities = newCapabilities;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToscaPackage.TNODE_TEMPLATE__CAPABILITIES, oldCapabilities, newCapabilities);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapabilities(CapabilitiesType_TCapability newCapabilities) {
		if (newCapabilities != capabilities) {
			NotificationChain msgs = null;
			if (capabilities != null)
				msgs = ((InternalEObject)capabilities).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TNODE_TEMPLATE__CAPABILITIES, null, msgs);
			if (newCapabilities != null)
				msgs = ((InternalEObject)newCapabilities).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TNODE_TEMPLATE__CAPABILITIES, null, msgs);
			msgs = basicSetCapabilities(newCapabilities, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TNODE_TEMPLATE__CAPABILITIES, newCapabilities, newCapabilities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoliciesType getPolicies() {
		return policies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolicies(PoliciesType newPolicies, NotificationChain msgs) {
		PoliciesType oldPolicies = policies;
		policies = newPolicies;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToscaPackage.TNODE_TEMPLATE__POLICIES, oldPolicies, newPolicies);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolicies(PoliciesType newPolicies) {
		if (newPolicies != policies) {
			NotificationChain msgs = null;
			if (policies != null)
				msgs = ((InternalEObject)policies).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TNODE_TEMPLATE__POLICIES, null, msgs);
			if (newPolicies != null)
				msgs = ((InternalEObject)newPolicies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TNODE_TEMPLATE__POLICIES, null, msgs);
			msgs = basicSetPolicies(newPolicies, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TNODE_TEMPLATE__POLICIES, newPolicies, newPolicies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDeploymentArtifacts getDeploymentArtifacts() {
		return deploymentArtifacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeploymentArtifacts(TDeploymentArtifacts newDeploymentArtifacts, NotificationChain msgs) {
		TDeploymentArtifacts oldDeploymentArtifacts = deploymentArtifacts;
		deploymentArtifacts = newDeploymentArtifacts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToscaPackage.TNODE_TEMPLATE__DEPLOYMENT_ARTIFACTS, oldDeploymentArtifacts, newDeploymentArtifacts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeploymentArtifacts(TDeploymentArtifacts newDeploymentArtifacts) {
		if (newDeploymentArtifacts != deploymentArtifacts) {
			NotificationChain msgs = null;
			if (deploymentArtifacts != null)
				msgs = ((InternalEObject)deploymentArtifacts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TNODE_TEMPLATE__DEPLOYMENT_ARTIFACTS, null, msgs);
			if (newDeploymentArtifacts != null)
				msgs = ((InternalEObject)newDeploymentArtifacts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TNODE_TEMPLATE__DEPLOYMENT_ARTIFACTS, null, msgs);
			msgs = basicSetDeploymentArtifacts(newDeploymentArtifacts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TNODE_TEMPLATE__DEPLOYMENT_ARTIFACTS, newDeploymentArtifacts, newDeploymentArtifacts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getMaxInstances() {
		return maxInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxInstances(Object newMaxInstances) {
		Object oldMaxInstances = maxInstances;
		maxInstances = newMaxInstances;
		boolean oldMaxInstancesESet = maxInstancesESet;
		maxInstancesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TNODE_TEMPLATE__MAX_INSTANCES, oldMaxInstances, maxInstances, !oldMaxInstancesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxInstances() {
		Object oldMaxInstances = maxInstances;
		boolean oldMaxInstancesESet = maxInstancesESet;
		maxInstances = MAX_INSTANCES_EDEFAULT;
		maxInstancesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ToscaPackage.TNODE_TEMPLATE__MAX_INSTANCES, oldMaxInstances, MAX_INSTANCES_EDEFAULT, oldMaxInstancesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxInstances() {
		return maxInstancesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinInstances() {
		return minInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinInstances(int newMinInstances) {
		int oldMinInstances = minInstances;
		minInstances = newMinInstances;
		boolean oldMinInstancesESet = minInstancesESet;
		minInstancesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TNODE_TEMPLATE__MIN_INSTANCES, oldMinInstances, minInstances, !oldMinInstancesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinInstances() {
		int oldMinInstances = minInstances;
		boolean oldMinInstancesESet = minInstancesESet;
		minInstances = MIN_INSTANCES_EDEFAULT;
		minInstancesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ToscaPackage.TNODE_TEMPLATE__MIN_INSTANCES, oldMinInstances, MIN_INSTANCES_EDEFAULT, oldMinInstancesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinInstances() {
		return minInstancesESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TNODE_TEMPLATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToscaPackage.TNODE_TEMPLATE__REQUIREMENTS:
				return basicSetRequirements(null, msgs);
			case ToscaPackage.TNODE_TEMPLATE__CAPABILITIES:
				return basicSetCapabilities(null, msgs);
			case ToscaPackage.TNODE_TEMPLATE__POLICIES:
				return basicSetPolicies(null, msgs);
			case ToscaPackage.TNODE_TEMPLATE__DEPLOYMENT_ARTIFACTS:
				return basicSetDeploymentArtifacts(null, msgs);
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
			case ToscaPackage.TNODE_TEMPLATE__REQUIREMENTS:
				return getRequirements();
			case ToscaPackage.TNODE_TEMPLATE__CAPABILITIES:
				return getCapabilities();
			case ToscaPackage.TNODE_TEMPLATE__POLICIES:
				return getPolicies();
			case ToscaPackage.TNODE_TEMPLATE__DEPLOYMENT_ARTIFACTS:
				return getDeploymentArtifacts();
			case ToscaPackage.TNODE_TEMPLATE__MAX_INSTANCES:
				return getMaxInstances();
			case ToscaPackage.TNODE_TEMPLATE__MIN_INSTANCES:
				return getMinInstances();
			case ToscaPackage.TNODE_TEMPLATE__NAME:
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
			case ToscaPackage.TNODE_TEMPLATE__REQUIREMENTS:
				setRequirements((RequirementsType_TRequirement)newValue);
				return;
			case ToscaPackage.TNODE_TEMPLATE__CAPABILITIES:
				setCapabilities((CapabilitiesType_TCapability)newValue);
				return;
			case ToscaPackage.TNODE_TEMPLATE__POLICIES:
				setPolicies((PoliciesType)newValue);
				return;
			case ToscaPackage.TNODE_TEMPLATE__DEPLOYMENT_ARTIFACTS:
				setDeploymentArtifacts((TDeploymentArtifacts)newValue);
				return;
			case ToscaPackage.TNODE_TEMPLATE__MAX_INSTANCES:
				setMaxInstances(newValue);
				return;
			case ToscaPackage.TNODE_TEMPLATE__MIN_INSTANCES:
				setMinInstances((Integer)newValue);
				return;
			case ToscaPackage.TNODE_TEMPLATE__NAME:
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
			case ToscaPackage.TNODE_TEMPLATE__REQUIREMENTS:
				setRequirements((RequirementsType_TRequirement)null);
				return;
			case ToscaPackage.TNODE_TEMPLATE__CAPABILITIES:
				setCapabilities((CapabilitiesType_TCapability)null);
				return;
			case ToscaPackage.TNODE_TEMPLATE__POLICIES:
				setPolicies((PoliciesType)null);
				return;
			case ToscaPackage.TNODE_TEMPLATE__DEPLOYMENT_ARTIFACTS:
				setDeploymentArtifacts((TDeploymentArtifacts)null);
				return;
			case ToscaPackage.TNODE_TEMPLATE__MAX_INSTANCES:
				unsetMaxInstances();
				return;
			case ToscaPackage.TNODE_TEMPLATE__MIN_INSTANCES:
				unsetMinInstances();
				return;
			case ToscaPackage.TNODE_TEMPLATE__NAME:
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
			case ToscaPackage.TNODE_TEMPLATE__REQUIREMENTS:
				return requirements != null;
			case ToscaPackage.TNODE_TEMPLATE__CAPABILITIES:
				return capabilities != null;
			case ToscaPackage.TNODE_TEMPLATE__POLICIES:
				return policies != null;
			case ToscaPackage.TNODE_TEMPLATE__DEPLOYMENT_ARTIFACTS:
				return deploymentArtifacts != null;
			case ToscaPackage.TNODE_TEMPLATE__MAX_INSTANCES:
				return isSetMaxInstances();
			case ToscaPackage.TNODE_TEMPLATE__MIN_INSTANCES:
				return isSetMinInstances();
			case ToscaPackage.TNODE_TEMPLATE__NAME:
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
		result.append(" (maxInstances: ");
		if (maxInstancesESet) result.append(maxInstances); else result.append("<unset>");
		result.append(", minInstances: ");
		if (minInstancesESet) result.append(minInstances); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TNodeTemplateImpl
