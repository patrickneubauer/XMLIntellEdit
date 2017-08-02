/**
 */
package tosca.impl;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tosca.DerivedFromType;
import tosca.TBoolean;
import tosca.TDeploymentArtifacts;
import tosca.TImplementationArtifacts;
import tosca.TNodeTypeImplementation;
import tosca.TRequiredContainerFeatures;
import tosca.TTags;
import tosca.ToscaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TNode Type Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tosca.impl.TNodeTypeImplementationImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link tosca.impl.TNodeTypeImplementationImpl#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link tosca.impl.TNodeTypeImplementationImpl#getRequiredContainerFeatures <em>Required Container Features</em>}</li>
 *   <li>{@link tosca.impl.TNodeTypeImplementationImpl#getImplementationArtifacts <em>Implementation Artifacts</em>}</li>
 *   <li>{@link tosca.impl.TNodeTypeImplementationImpl#getDeploymentArtifacts <em>Deployment Artifacts</em>}</li>
 *   <li>{@link tosca.impl.TNodeTypeImplementationImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link tosca.impl.TNodeTypeImplementationImpl#getFinal <em>Final</em>}</li>
 *   <li>{@link tosca.impl.TNodeTypeImplementationImpl#getName <em>Name</em>}</li>
 *   <li>{@link tosca.impl.TNodeTypeImplementationImpl#getNodeType <em>Node Type</em>}</li>
 *   <li>{@link tosca.impl.TNodeTypeImplementationImpl#getTargetNamespace <em>Target Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TNodeTypeImplementationImpl extends TExtensibleElementsImpl implements TNodeTypeImplementation {
	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected TTags tags;

	/**
	 * The cached value of the '{@link #getDerivedFrom() <em>Derived From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedFrom()
	 * @generated
	 * @ordered
	 */
	protected DerivedFromType derivedFrom;

	/**
	 * The cached value of the '{@link #getRequiredContainerFeatures() <em>Required Container Features</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredContainerFeatures()
	 * @generated
	 * @ordered
	 */
	protected TRequiredContainerFeatures requiredContainerFeatures;

	/**
	 * The cached value of the '{@link #getImplementationArtifacts() <em>Implementation Artifacts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationArtifacts()
	 * @generated
	 * @ordered
	 */
	protected TImplementationArtifacts implementationArtifacts;

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
	 * The default value of the '{@link #getAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final TBoolean ABSTRACT_EDEFAULT = TBoolean.NO;

	/**
	 * The cached value of the '{@link #getAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected TBoolean abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * This is true if the Abstract attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean abstractESet;

	/**
	 * The default value of the '{@link #getFinal() <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinal()
	 * @generated
	 * @ordered
	 */
	protected static final TBoolean FINAL_EDEFAULT = TBoolean.NO;

	/**
	 * The cached value of the '{@link #getFinal() <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinal()
	 * @generated
	 * @ordered
	 */
	protected TBoolean final_ = FINAL_EDEFAULT;

	/**
	 * This is true if the Final attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean finalESet;

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
	 * The default value of the '{@link #getNodeType() <em>Node Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeType()
	 * @generated
	 * @ordered
	 */
	protected static final QName NODE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNodeType() <em>Node Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeType()
	 * @generated
	 * @ordered
	 */
	protected QName nodeType = NODE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetNamespace() <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetNamespace() <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNamespace()
	 * @generated
	 * @ordered
	 */
	protected String targetNamespace = TARGET_NAMESPACE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TNodeTypeImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToscaPackage.Literals.TNODE_TYPE_IMPLEMENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTags getTags() {
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTags(TTags newTags, NotificationChain msgs) {
		TTags oldTags = tags;
		tags = newTags;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToscaPackage.TNODE_TYPE_IMPLEMENTATION__TAGS, oldTags, newTags);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTags(TTags newTags) {
		if (newTags != tags) {
			NotificationChain msgs = null;
			if (tags != null)
				msgs = ((InternalEObject)tags).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TNODE_TYPE_IMPLEMENTATION__TAGS, null, msgs);
			if (newTags != null)
				msgs = ((InternalEObject)newTags).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TNODE_TYPE_IMPLEMENTATION__TAGS, null, msgs);
			msgs = basicSetTags(newTags, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TNODE_TYPE_IMPLEMENTATION__TAGS, newTags, newTags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedFromType getDerivedFrom() {
		return derivedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDerivedFrom(DerivedFromType newDerivedFrom, NotificationChain msgs) {
		DerivedFromType oldDerivedFrom = derivedFrom;
		derivedFrom = newDerivedFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToscaPackage.TNODE_TYPE_IMPLEMENTATION__DERIVED_FROM, oldDerivedFrom, newDerivedFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerivedFrom(DerivedFromType newDerivedFrom) {
		if (newDerivedFrom != derivedFrom) {
			NotificationChain msgs = null;
			if (derivedFrom != null)
				msgs = ((InternalEObject)derivedFrom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TNODE_TYPE_IMPLEMENTATION__DERIVED_FROM, null, msgs);
			if (newDerivedFrom != null)
				msgs = ((InternalEObject)newDerivedFrom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TNODE_TYPE_IMPLEMENTATION__DERIVED_FROM, null, msgs);
			msgs = basicSetDerivedFrom(newDerivedFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TNODE_TYPE_IMPLEMENTATION__DERIVED_FROM, newDerivedFrom, newDerivedFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRequiredContainerFeatures getRequiredContainerFeatures() {
		return requiredContainerFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequiredContainerFeatures(TRequiredContainerFeatures newRequiredContainerFeatures, NotificationChain msgs) {
		TRequiredContainerFeatures oldRequiredContainerFeatures = requiredContainerFeatures;
		requiredContainerFeatures = newRequiredContainerFeatures;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToscaPackage.TNODE_TYPE_IMPLEMENTATION__REQUIRED_CONTAINER_FEATURES, oldRequiredContainerFeatures, newRequiredContainerFeatures);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredContainerFeatures(TRequiredContainerFeatures newRequiredContainerFeatures) {
		if (newRequiredContainerFeatures != requiredContainerFeatures) {
			NotificationChain msgs = null;
			if (requiredContainerFeatures != null)
				msgs = ((InternalEObject)requiredContainerFeatures).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TNODE_TYPE_IMPLEMENTATION__REQUIRED_CONTAINER_FEATURES, null, msgs);
			if (newRequiredContainerFeatures != null)
				msgs = ((InternalEObject)newRequiredContainerFeatures).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TNODE_TYPE_IMPLEMENTATION__REQUIRED_CONTAINER_FEATURES, null, msgs);
			msgs = basicSetRequiredContainerFeatures(newRequiredContainerFeatures, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TNODE_TYPE_IMPLEMENTATION__REQUIRED_CONTAINER_FEATURES, newRequiredContainerFeatures, newRequiredContainerFeatures));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TImplementationArtifacts getImplementationArtifacts() {
		return implementationArtifacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplementationArtifacts(TImplementationArtifacts newImplementationArtifacts, NotificationChain msgs) {
		TImplementationArtifacts oldImplementationArtifacts = implementationArtifacts;
		implementationArtifacts = newImplementationArtifacts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToscaPackage.TNODE_TYPE_IMPLEMENTATION__IMPLEMENTATION_ARTIFACTS, oldImplementationArtifacts, newImplementationArtifacts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementationArtifacts(TImplementationArtifacts newImplementationArtifacts) {
		if (newImplementationArtifacts != implementationArtifacts) {
			NotificationChain msgs = null;
			if (implementationArtifacts != null)
				msgs = ((InternalEObject)implementationArtifacts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TNODE_TYPE_IMPLEMENTATION__IMPLEMENTATION_ARTIFACTS, null, msgs);
			if (newImplementationArtifacts != null)
				msgs = ((InternalEObject)newImplementationArtifacts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TNODE_TYPE_IMPLEMENTATION__IMPLEMENTATION_ARTIFACTS, null, msgs);
			msgs = basicSetImplementationArtifacts(newImplementationArtifacts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TNODE_TYPE_IMPLEMENTATION__IMPLEMENTATION_ARTIFACTS, newImplementationArtifacts, newImplementationArtifacts));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToscaPackage.TNODE_TYPE_IMPLEMENTATION__DEPLOYMENT_ARTIFACTS, oldDeploymentArtifacts, newDeploymentArtifacts);
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
				msgs = ((InternalEObject)deploymentArtifacts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TNODE_TYPE_IMPLEMENTATION__DEPLOYMENT_ARTIFACTS, null, msgs);
			if (newDeploymentArtifacts != null)
				msgs = ((InternalEObject)newDeploymentArtifacts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TNODE_TYPE_IMPLEMENTATION__DEPLOYMENT_ARTIFACTS, null, msgs);
			msgs = basicSetDeploymentArtifacts(newDeploymentArtifacts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TNODE_TYPE_IMPLEMENTATION__DEPLOYMENT_ARTIFACTS, newDeploymentArtifacts, newDeploymentArtifacts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TBoolean getAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(TBoolean newAbstract) {
		TBoolean oldAbstract = abstract_;
		abstract_ = newAbstract == null ? ABSTRACT_EDEFAULT : newAbstract;
		boolean oldAbstractESet = abstractESet;
		abstractESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TNODE_TYPE_IMPLEMENTATION__ABSTRACT, oldAbstract, abstract_, !oldAbstractESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAbstract() {
		TBoolean oldAbstract = abstract_;
		boolean oldAbstractESet = abstractESet;
		abstract_ = ABSTRACT_EDEFAULT;
		abstractESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ToscaPackage.TNODE_TYPE_IMPLEMENTATION__ABSTRACT, oldAbstract, ABSTRACT_EDEFAULT, oldAbstractESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAbstract() {
		return abstractESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TBoolean getFinal() {
		return final_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinal(TBoolean newFinal) {
		TBoolean oldFinal = final_;
		final_ = newFinal == null ? FINAL_EDEFAULT : newFinal;
		boolean oldFinalESet = finalESet;
		finalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TNODE_TYPE_IMPLEMENTATION__FINAL, oldFinal, final_, !oldFinalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFinal() {
		TBoolean oldFinal = final_;
		boolean oldFinalESet = finalESet;
		final_ = FINAL_EDEFAULT;
		finalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ToscaPackage.TNODE_TYPE_IMPLEMENTATION__FINAL, oldFinal, FINAL_EDEFAULT, oldFinalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFinal() {
		return finalESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TNODE_TYPE_IMPLEMENTATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getNodeType() {
		return nodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeType(QName newNodeType) {
		QName oldNodeType = nodeType;
		nodeType = newNodeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TNODE_TYPE_IMPLEMENTATION__NODE_TYPE, oldNodeType, nodeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetNamespace() {
		return targetNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetNamespace(String newTargetNamespace) {
		String oldTargetNamespace = targetNamespace;
		targetNamespace = newTargetNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TNODE_TYPE_IMPLEMENTATION__TARGET_NAMESPACE, oldTargetNamespace, targetNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToscaPackage.TNODE_TYPE_IMPLEMENTATION__TAGS:
				return basicSetTags(null, msgs);
			case ToscaPackage.TNODE_TYPE_IMPLEMENTATION__DERIVED_FROM:
				return basicSetDerivedFrom(null, msgs);
			case ToscaPackage.TNODE_TYPE_IMPLEMENTATION__REQUIRED_CONTAINER_FEATURES:
				return basicSetRequiredContainerFeatures(null, msgs);
			case ToscaPackage.TNODE_TYPE_IMPLEMENTATION__IMPLEMENTATION_ARTIFACTS:
				return basicSetImplementationArtifacts(null, msgs);
			case ToscaPackage.TNODE_TYPE_IMPLEMENTATION__DEPLOYMENT_ARTIFACTS:
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
			case ToscaPackage.TNODE_TYPE_IMPLEMENTATION__TAGS:
				return getTags();
			case ToscaPackage.TNODE_TYPE_IMPLEMENTATION__DERIVED_FROM:
				return getDerivedFrom();
			case ToscaPackage.TNODE_TYPE_IMPLEMENTATION__REQUIRED_CONTAINER_FEATURES:
				return getRequiredContainerFeatures();
			case ToscaPackage.TNODE_TYPE_IMPLEMENTATION__IMPLEMENTATION_ARTIFACTS:
				return getImplementationArtifacts();
			case ToscaPackage.TNODE_TYPE_IMPLEMENTATION__DEPLOYMENT_ARTIFACTS:
				return getDeploymentArtifacts();
			case ToscaPackage.TNODE_TYPE_IMPLEMENTATION__ABSTRACT:
				return getAbstract();
			case ToscaPackage.TNODE_TYPE_IMPLEMENTATION__FINAL:
				return getFinal();
			case ToscaPackage.TNODE_TYPE_IMPLEMENTATION__NAME:
				return getName();
			case ToscaPackage.TNODE_TYPE_IMPLEMENTATION__NODE_TYPE:
				return getNodeType();
			case ToscaPackage.TNODE_TYPE_IMPLEMENTATION__TARGET_NAMESPACE:
				return getTargetNamespace();
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
			case ToscaPackage.TNODE_TYPE_IMPLEMENTATION__TAGS:
				setTags((TTags)newValue);
				return;
			case ToscaPackage.TNODE_TYPE_IMPLEMENTATION__DERIVED_FROM:
				setDerivedFrom((DerivedFromType)newValue);
				return;
			case ToscaPackage.TNODE_TYPE_IMPLEMENTATION__REQUIRED_CONTAINER_FEATURES:
				setRequiredContainerFeatures((TRequiredContainerFeatures)newValue);
				return;
			case ToscaPackage.TNODE_TYPE_IMPLEMENTATION__IMPLEMENTATION_ARTIFACTS:
				setImplementationArtifacts((TImplementationArtifacts)newValue);
				return;
			case ToscaPackage.TNODE_TYPE_IMPLEMENTATION__DEPLOYMENT_ARTIFACTS:
				setDeploymentArtifacts((TDeploymentArtifacts)newValue);
				return;
			case ToscaPackage.TNODE_TYPE_IMPLEMENTATION__ABSTRACT:
				setAbstract((TBoolean)newValue);
				return;
			case ToscaPackage.TNODE_TYPE_IMPLEMENTATION__FINAL:
				setFinal((TBoolean)newValue);
				return;
			case ToscaPackage.TNODE_TYPE_IMPLEMENTATION__NAME:
				setName((String)newValue);
				return;
			case ToscaPackage.TNODE_TYPE_IMPLEMENTATION__NODE_TYPE:
				setNodeType((QName)newValue);
				return;
			case ToscaPackage.TNODE_TYPE_IMPLEMENTATION__TARGET_NAMESPACE:
				setTargetNamespace((String)newValue);
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
			case ToscaPackage.TNODE_TYPE_IMPLEMENTATION__TAGS:
				setTags((TTags)null);
				return;
			case ToscaPackage.TNODE_TYPE_IMPLEMENTATION__DERIVED_FROM:
				setDerivedFrom((DerivedFromType)null);
				return;
			case ToscaPackage.TNODE_TYPE_IMPLEMENTATION__REQUIRED_CONTAINER_FEATURES:
				setRequiredContainerFeatures((TRequiredContainerFeatures)null);
				return;
			case ToscaPackage.TNODE_TYPE_IMPLEMENTATION__IMPLEMENTATION_ARTIFACTS:
				setImplementationArtifacts((TImplementationArtifacts)null);
				return;
			case ToscaPackage.TNODE_TYPE_IMPLEMENTATION__DEPLOYMENT_ARTIFACTS:
				setDeploymentArtifacts((TDeploymentArtifacts)null);
				return;
			case ToscaPackage.TNODE_TYPE_IMPLEMENTATION__ABSTRACT:
				unsetAbstract();
				return;
			case ToscaPackage.TNODE_TYPE_IMPLEMENTATION__FINAL:
				unsetFinal();
				return;
			case ToscaPackage.TNODE_TYPE_IMPLEMENTATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ToscaPackage.TNODE_TYPE_IMPLEMENTATION__NODE_TYPE:
				setNodeType(NODE_TYPE_EDEFAULT);
				return;
			case ToscaPackage.TNODE_TYPE_IMPLEMENTATION__TARGET_NAMESPACE:
				setTargetNamespace(TARGET_NAMESPACE_EDEFAULT);
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
			case ToscaPackage.TNODE_TYPE_IMPLEMENTATION__TAGS:
				return tags != null;
			case ToscaPackage.TNODE_TYPE_IMPLEMENTATION__DERIVED_FROM:
				return derivedFrom != null;
			case ToscaPackage.TNODE_TYPE_IMPLEMENTATION__REQUIRED_CONTAINER_FEATURES:
				return requiredContainerFeatures != null;
			case ToscaPackage.TNODE_TYPE_IMPLEMENTATION__IMPLEMENTATION_ARTIFACTS:
				return implementationArtifacts != null;
			case ToscaPackage.TNODE_TYPE_IMPLEMENTATION__DEPLOYMENT_ARTIFACTS:
				return deploymentArtifacts != null;
			case ToscaPackage.TNODE_TYPE_IMPLEMENTATION__ABSTRACT:
				return isSetAbstract();
			case ToscaPackage.TNODE_TYPE_IMPLEMENTATION__FINAL:
				return isSetFinal();
			case ToscaPackage.TNODE_TYPE_IMPLEMENTATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ToscaPackage.TNODE_TYPE_IMPLEMENTATION__NODE_TYPE:
				return NODE_TYPE_EDEFAULT == null ? nodeType != null : !NODE_TYPE_EDEFAULT.equals(nodeType);
			case ToscaPackage.TNODE_TYPE_IMPLEMENTATION__TARGET_NAMESPACE:
				return TARGET_NAMESPACE_EDEFAULT == null ? targetNamespace != null : !TARGET_NAMESPACE_EDEFAULT.equals(targetNamespace);
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
		result.append(" (abstract: ");
		if (abstractESet) result.append(abstract_); else result.append("<unset>");
		result.append(", final: ");
		if (finalESet) result.append(final_); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", nodeType: ");
		result.append(nodeType);
		result.append(", targetNamespace: ");
		result.append(targetNamespace);
		result.append(')');
		return result.toString();
	}

} //TNodeTypeImplementationImpl
