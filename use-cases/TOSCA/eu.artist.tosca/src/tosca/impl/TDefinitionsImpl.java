/**
 */
package tosca.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import tosca.ExtensionsType;
import tosca.TArtifactTemplate;
import tosca.TArtifactType;
import tosca.TCapabilityType;
import tosca.TDefinitions;
import tosca.TImport;
import tosca.TNodeType;
import tosca.TNodeTypeImplementation;
import tosca.TPolicyTemplate;
import tosca.TPolicyType;
import tosca.TRelationshipType;
import tosca.TRelationshipTypeImplementation;
import tosca.TRequirementType;
import tosca.TServiceTemplate;
import tosca.ToscaPackage;
import tosca.TypesType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TDefinitions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tosca.impl.TDefinitionsImpl#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link tosca.impl.TDefinitionsImpl#getImport <em>Import</em>}</li>
 *   <li>{@link tosca.impl.TDefinitionsImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link tosca.impl.TDefinitionsImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link tosca.impl.TDefinitionsImpl#getServiceTemplate <em>Service Template</em>}</li>
 *   <li>{@link tosca.impl.TDefinitionsImpl#getNodeType <em>Node Type</em>}</li>
 *   <li>{@link tosca.impl.TDefinitionsImpl#getNodeTypeImplementation <em>Node Type Implementation</em>}</li>
 *   <li>{@link tosca.impl.TDefinitionsImpl#getRelationshipType <em>Relationship Type</em>}</li>
 *   <li>{@link tosca.impl.TDefinitionsImpl#getRelationshipTypeImplementation <em>Relationship Type Implementation</em>}</li>
 *   <li>{@link tosca.impl.TDefinitionsImpl#getRequirementType <em>Requirement Type</em>}</li>
 *   <li>{@link tosca.impl.TDefinitionsImpl#getCapabilityType <em>Capability Type</em>}</li>
 *   <li>{@link tosca.impl.TDefinitionsImpl#getArtifactType <em>Artifact Type</em>}</li>
 *   <li>{@link tosca.impl.TDefinitionsImpl#getArtifactTemplate <em>Artifact Template</em>}</li>
 *   <li>{@link tosca.impl.TDefinitionsImpl#getPolicyType <em>Policy Type</em>}</li>
 *   <li>{@link tosca.impl.TDefinitionsImpl#getPolicyTemplate <em>Policy Template</em>}</li>
 *   <li>{@link tosca.impl.TDefinitionsImpl#getId <em>Id</em>}</li>
 *   <li>{@link tosca.impl.TDefinitionsImpl#getName <em>Name</em>}</li>
 *   <li>{@link tosca.impl.TDefinitionsImpl#getTargetNamespace <em>Target Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TDefinitionsImpl extends TExtensibleElementsImpl implements TDefinitions {
	/**
	 * The cached value of the '{@link #getExtensions() <em>Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensions()
	 * @generated
	 * @ordered
	 */
	protected ExtensionsType extensions;

	/**
	 * The cached value of the '{@link #getImport() <em>Import</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImport()
	 * @generated
	 * @ordered
	 */
	protected EList<TImport> import_;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected TypesType types;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The cached value of the '{@link #getServiceTemplate() <em>Service Template</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceTemplate()
	 * @generated
	 * @ordered
	 */
	protected EList<TServiceTemplate> serviceTemplate;

	/**
	 * The cached value of the '{@link #getNodeType() <em>Node Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeType()
	 * @generated
	 * @ordered
	 */
	protected EList<TNodeType> nodeType;

	/**
	 * The cached value of the '{@link #getNodeTypeImplementation() <em>Node Type Implementation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeTypeImplementation()
	 * @generated
	 * @ordered
	 */
	protected EList<TNodeTypeImplementation> nodeTypeImplementation;

	/**
	 * The cached value of the '{@link #getRelationshipType() <em>Relationship Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationshipType()
	 * @generated
	 * @ordered
	 */
	protected EList<TRelationshipType> relationshipType;

	/**
	 * The cached value of the '{@link #getRelationshipTypeImplementation() <em>Relationship Type Implementation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationshipTypeImplementation()
	 * @generated
	 * @ordered
	 */
	protected EList<TRelationshipTypeImplementation> relationshipTypeImplementation;

	/**
	 * The cached value of the '{@link #getRequirementType() <em>Requirement Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirementType()
	 * @generated
	 * @ordered
	 */
	protected EList<TRequirementType> requirementType;

	/**
	 * The cached value of the '{@link #getCapabilityType() <em>Capability Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilityType()
	 * @generated
	 * @ordered
	 */
	protected EList<TCapabilityType> capabilityType;

	/**
	 * The cached value of the '{@link #getArtifactType() <em>Artifact Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactType()
	 * @generated
	 * @ordered
	 */
	protected EList<TArtifactType> artifactType;

	/**
	 * The cached value of the '{@link #getArtifactTemplate() <em>Artifact Template</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactTemplate()
	 * @generated
	 * @ordered
	 */
	protected EList<TArtifactTemplate> artifactTemplate;

	/**
	 * The cached value of the '{@link #getPolicyType() <em>Policy Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyType()
	 * @generated
	 * @ordered
	 */
	protected EList<TPolicyType> policyType;

	/**
	 * The cached value of the '{@link #getPolicyTemplate() <em>Policy Template</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyTemplate()
	 * @generated
	 * @ordered
	 */
	protected EList<TPolicyTemplate> policyTemplate;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

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
	protected TDefinitionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToscaPackage.Literals.TDEFINITIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionsType getExtensions() {
		return extensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtensions(ExtensionsType newExtensions, NotificationChain msgs) {
		ExtensionsType oldExtensions = extensions;
		extensions = newExtensions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToscaPackage.TDEFINITIONS__EXTENSIONS, oldExtensions, newExtensions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensions(ExtensionsType newExtensions) {
		if (newExtensions != extensions) {
			NotificationChain msgs = null;
			if (extensions != null)
				msgs = ((InternalEObject)extensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TDEFINITIONS__EXTENSIONS, null, msgs);
			if (newExtensions != null)
				msgs = ((InternalEObject)newExtensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TDEFINITIONS__EXTENSIONS, null, msgs);
			msgs = basicSetExtensions(newExtensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TDEFINITIONS__EXTENSIONS, newExtensions, newExtensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TImport> getImport() {
		if (import_ == null) {
			import_ = new EObjectContainmentEList<TImport>(TImport.class, this, ToscaPackage.TDEFINITIONS__IMPORT);
		}
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesType getTypes() {
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypes(TypesType newTypes, NotificationChain msgs) {
		TypesType oldTypes = types;
		types = newTypes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToscaPackage.TDEFINITIONS__TYPES, oldTypes, newTypes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypes(TypesType newTypes) {
		if (newTypes != types) {
			NotificationChain msgs = null;
			if (types != null)
				msgs = ((InternalEObject)types).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TDEFINITIONS__TYPES, null, msgs);
			if (newTypes != null)
				msgs = ((InternalEObject)newTypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TDEFINITIONS__TYPES, null, msgs);
			msgs = basicSetTypes(newTypes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TDEFINITIONS__TYPES, newTypes, newTypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, ToscaPackage.TDEFINITIONS__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TServiceTemplate> getServiceTemplate() {
		if (serviceTemplate == null) {
			serviceTemplate = new EObjectContainmentEList<TServiceTemplate>(TServiceTemplate.class, this, ToscaPackage.TDEFINITIONS__SERVICE_TEMPLATE);
		}
		return serviceTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TNodeType> getNodeType() {
		if (nodeType == null) {
			nodeType = new EObjectContainmentEList<TNodeType>(TNodeType.class, this, ToscaPackage.TDEFINITIONS__NODE_TYPE);
		}
		return nodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TNodeTypeImplementation> getNodeTypeImplementation() {
		if (nodeTypeImplementation == null) {
			nodeTypeImplementation = new EObjectContainmentEList<TNodeTypeImplementation>(TNodeTypeImplementation.class, this, ToscaPackage.TDEFINITIONS__NODE_TYPE_IMPLEMENTATION);
		}
		return nodeTypeImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TRelationshipType> getRelationshipType() {
		if (relationshipType == null) {
			relationshipType = new EObjectContainmentEList<TRelationshipType>(TRelationshipType.class, this, ToscaPackage.TDEFINITIONS__RELATIONSHIP_TYPE);
		}
		return relationshipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TRelationshipTypeImplementation> getRelationshipTypeImplementation() {
		if (relationshipTypeImplementation == null) {
			relationshipTypeImplementation = new EObjectContainmentEList<TRelationshipTypeImplementation>(TRelationshipTypeImplementation.class, this, ToscaPackage.TDEFINITIONS__RELATIONSHIP_TYPE_IMPLEMENTATION);
		}
		return relationshipTypeImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TRequirementType> getRequirementType() {
		if (requirementType == null) {
			requirementType = new EObjectContainmentEList<TRequirementType>(TRequirementType.class, this, ToscaPackage.TDEFINITIONS__REQUIREMENT_TYPE);
		}
		return requirementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TCapabilityType> getCapabilityType() {
		if (capabilityType == null) {
			capabilityType = new EObjectContainmentEList<TCapabilityType>(TCapabilityType.class, this, ToscaPackage.TDEFINITIONS__CAPABILITY_TYPE);
		}
		return capabilityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TArtifactType> getArtifactType() {
		if (artifactType == null) {
			artifactType = new EObjectContainmentEList<TArtifactType>(TArtifactType.class, this, ToscaPackage.TDEFINITIONS__ARTIFACT_TYPE);
		}
		return artifactType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TArtifactTemplate> getArtifactTemplate() {
		if (artifactTemplate == null) {
			artifactTemplate = new EObjectContainmentEList<TArtifactTemplate>(TArtifactTemplate.class, this, ToscaPackage.TDEFINITIONS__ARTIFACT_TEMPLATE);
		}
		return artifactTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TPolicyType> getPolicyType() {
		if (policyType == null) {
			policyType = new EObjectContainmentEList<TPolicyType>(TPolicyType.class, this, ToscaPackage.TDEFINITIONS__POLICY_TYPE);
		}
		return policyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TPolicyTemplate> getPolicyTemplate() {
		if (policyTemplate == null) {
			policyTemplate = new EObjectContainmentEList<TPolicyTemplate>(TPolicyTemplate.class, this, ToscaPackage.TDEFINITIONS__POLICY_TEMPLATE);
		}
		return policyTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TDEFINITIONS__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TDEFINITIONS__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TDEFINITIONS__TARGET_NAMESPACE, oldTargetNamespace, targetNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToscaPackage.TDEFINITIONS__EXTENSIONS:
				return basicSetExtensions(null, msgs);
			case ToscaPackage.TDEFINITIONS__IMPORT:
				return ((InternalEList<?>)getImport()).basicRemove(otherEnd, msgs);
			case ToscaPackage.TDEFINITIONS__TYPES:
				return basicSetTypes(null, msgs);
			case ToscaPackage.TDEFINITIONS__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case ToscaPackage.TDEFINITIONS__SERVICE_TEMPLATE:
				return ((InternalEList<?>)getServiceTemplate()).basicRemove(otherEnd, msgs);
			case ToscaPackage.TDEFINITIONS__NODE_TYPE:
				return ((InternalEList<?>)getNodeType()).basicRemove(otherEnd, msgs);
			case ToscaPackage.TDEFINITIONS__NODE_TYPE_IMPLEMENTATION:
				return ((InternalEList<?>)getNodeTypeImplementation()).basicRemove(otherEnd, msgs);
			case ToscaPackage.TDEFINITIONS__RELATIONSHIP_TYPE:
				return ((InternalEList<?>)getRelationshipType()).basicRemove(otherEnd, msgs);
			case ToscaPackage.TDEFINITIONS__RELATIONSHIP_TYPE_IMPLEMENTATION:
				return ((InternalEList<?>)getRelationshipTypeImplementation()).basicRemove(otherEnd, msgs);
			case ToscaPackage.TDEFINITIONS__REQUIREMENT_TYPE:
				return ((InternalEList<?>)getRequirementType()).basicRemove(otherEnd, msgs);
			case ToscaPackage.TDEFINITIONS__CAPABILITY_TYPE:
				return ((InternalEList<?>)getCapabilityType()).basicRemove(otherEnd, msgs);
			case ToscaPackage.TDEFINITIONS__ARTIFACT_TYPE:
				return ((InternalEList<?>)getArtifactType()).basicRemove(otherEnd, msgs);
			case ToscaPackage.TDEFINITIONS__ARTIFACT_TEMPLATE:
				return ((InternalEList<?>)getArtifactTemplate()).basicRemove(otherEnd, msgs);
			case ToscaPackage.TDEFINITIONS__POLICY_TYPE:
				return ((InternalEList<?>)getPolicyType()).basicRemove(otherEnd, msgs);
			case ToscaPackage.TDEFINITIONS__POLICY_TEMPLATE:
				return ((InternalEList<?>)getPolicyTemplate()).basicRemove(otherEnd, msgs);
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
			case ToscaPackage.TDEFINITIONS__EXTENSIONS:
				return getExtensions();
			case ToscaPackage.TDEFINITIONS__IMPORT:
				return getImport();
			case ToscaPackage.TDEFINITIONS__TYPES:
				return getTypes();
			case ToscaPackage.TDEFINITIONS__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case ToscaPackage.TDEFINITIONS__SERVICE_TEMPLATE:
				return getServiceTemplate();
			case ToscaPackage.TDEFINITIONS__NODE_TYPE:
				return getNodeType();
			case ToscaPackage.TDEFINITIONS__NODE_TYPE_IMPLEMENTATION:
				return getNodeTypeImplementation();
			case ToscaPackage.TDEFINITIONS__RELATIONSHIP_TYPE:
				return getRelationshipType();
			case ToscaPackage.TDEFINITIONS__RELATIONSHIP_TYPE_IMPLEMENTATION:
				return getRelationshipTypeImplementation();
			case ToscaPackage.TDEFINITIONS__REQUIREMENT_TYPE:
				return getRequirementType();
			case ToscaPackage.TDEFINITIONS__CAPABILITY_TYPE:
				return getCapabilityType();
			case ToscaPackage.TDEFINITIONS__ARTIFACT_TYPE:
				return getArtifactType();
			case ToscaPackage.TDEFINITIONS__ARTIFACT_TEMPLATE:
				return getArtifactTemplate();
			case ToscaPackage.TDEFINITIONS__POLICY_TYPE:
				return getPolicyType();
			case ToscaPackage.TDEFINITIONS__POLICY_TEMPLATE:
				return getPolicyTemplate();
			case ToscaPackage.TDEFINITIONS__ID:
				return getId();
			case ToscaPackage.TDEFINITIONS__NAME:
				return getName();
			case ToscaPackage.TDEFINITIONS__TARGET_NAMESPACE:
				return getTargetNamespace();
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
			case ToscaPackage.TDEFINITIONS__EXTENSIONS:
				setExtensions((ExtensionsType)newValue);
				return;
			case ToscaPackage.TDEFINITIONS__IMPORT:
				getImport().clear();
				getImport().addAll((Collection<? extends TImport>)newValue);
				return;
			case ToscaPackage.TDEFINITIONS__TYPES:
				setTypes((TypesType)newValue);
				return;
			case ToscaPackage.TDEFINITIONS__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case ToscaPackage.TDEFINITIONS__SERVICE_TEMPLATE:
				getServiceTemplate().clear();
				getServiceTemplate().addAll((Collection<? extends TServiceTemplate>)newValue);
				return;
			case ToscaPackage.TDEFINITIONS__NODE_TYPE:
				getNodeType().clear();
				getNodeType().addAll((Collection<? extends TNodeType>)newValue);
				return;
			case ToscaPackage.TDEFINITIONS__NODE_TYPE_IMPLEMENTATION:
				getNodeTypeImplementation().clear();
				getNodeTypeImplementation().addAll((Collection<? extends TNodeTypeImplementation>)newValue);
				return;
			case ToscaPackage.TDEFINITIONS__RELATIONSHIP_TYPE:
				getRelationshipType().clear();
				getRelationshipType().addAll((Collection<? extends TRelationshipType>)newValue);
				return;
			case ToscaPackage.TDEFINITIONS__RELATIONSHIP_TYPE_IMPLEMENTATION:
				getRelationshipTypeImplementation().clear();
				getRelationshipTypeImplementation().addAll((Collection<? extends TRelationshipTypeImplementation>)newValue);
				return;
			case ToscaPackage.TDEFINITIONS__REQUIREMENT_TYPE:
				getRequirementType().clear();
				getRequirementType().addAll((Collection<? extends TRequirementType>)newValue);
				return;
			case ToscaPackage.TDEFINITIONS__CAPABILITY_TYPE:
				getCapabilityType().clear();
				getCapabilityType().addAll((Collection<? extends TCapabilityType>)newValue);
				return;
			case ToscaPackage.TDEFINITIONS__ARTIFACT_TYPE:
				getArtifactType().clear();
				getArtifactType().addAll((Collection<? extends TArtifactType>)newValue);
				return;
			case ToscaPackage.TDEFINITIONS__ARTIFACT_TEMPLATE:
				getArtifactTemplate().clear();
				getArtifactTemplate().addAll((Collection<? extends TArtifactTemplate>)newValue);
				return;
			case ToscaPackage.TDEFINITIONS__POLICY_TYPE:
				getPolicyType().clear();
				getPolicyType().addAll((Collection<? extends TPolicyType>)newValue);
				return;
			case ToscaPackage.TDEFINITIONS__POLICY_TEMPLATE:
				getPolicyTemplate().clear();
				getPolicyTemplate().addAll((Collection<? extends TPolicyTemplate>)newValue);
				return;
			case ToscaPackage.TDEFINITIONS__ID:
				setId((String)newValue);
				return;
			case ToscaPackage.TDEFINITIONS__NAME:
				setName((String)newValue);
				return;
			case ToscaPackage.TDEFINITIONS__TARGET_NAMESPACE:
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
			case ToscaPackage.TDEFINITIONS__EXTENSIONS:
				setExtensions((ExtensionsType)null);
				return;
			case ToscaPackage.TDEFINITIONS__IMPORT:
				getImport().clear();
				return;
			case ToscaPackage.TDEFINITIONS__TYPES:
				setTypes((TypesType)null);
				return;
			case ToscaPackage.TDEFINITIONS__GROUP:
				getGroup().clear();
				return;
			case ToscaPackage.TDEFINITIONS__SERVICE_TEMPLATE:
				getServiceTemplate().clear();
				return;
			case ToscaPackage.TDEFINITIONS__NODE_TYPE:
				getNodeType().clear();
				return;
			case ToscaPackage.TDEFINITIONS__NODE_TYPE_IMPLEMENTATION:
				getNodeTypeImplementation().clear();
				return;
			case ToscaPackage.TDEFINITIONS__RELATIONSHIP_TYPE:
				getRelationshipType().clear();
				return;
			case ToscaPackage.TDEFINITIONS__RELATIONSHIP_TYPE_IMPLEMENTATION:
				getRelationshipTypeImplementation().clear();
				return;
			case ToscaPackage.TDEFINITIONS__REQUIREMENT_TYPE:
				getRequirementType().clear();
				return;
			case ToscaPackage.TDEFINITIONS__CAPABILITY_TYPE:
				getCapabilityType().clear();
				return;
			case ToscaPackage.TDEFINITIONS__ARTIFACT_TYPE:
				getArtifactType().clear();
				return;
			case ToscaPackage.TDEFINITIONS__ARTIFACT_TEMPLATE:
				getArtifactTemplate().clear();
				return;
			case ToscaPackage.TDEFINITIONS__POLICY_TYPE:
				getPolicyType().clear();
				return;
			case ToscaPackage.TDEFINITIONS__POLICY_TEMPLATE:
				getPolicyTemplate().clear();
				return;
			case ToscaPackage.TDEFINITIONS__ID:
				setId(ID_EDEFAULT);
				return;
			case ToscaPackage.TDEFINITIONS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ToscaPackage.TDEFINITIONS__TARGET_NAMESPACE:
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
			case ToscaPackage.TDEFINITIONS__EXTENSIONS:
				return extensions != null;
			case ToscaPackage.TDEFINITIONS__IMPORT:
				return import_ != null && !import_.isEmpty();
			case ToscaPackage.TDEFINITIONS__TYPES:
				return types != null;
			case ToscaPackage.TDEFINITIONS__GROUP:
				return group != null && !group.isEmpty();
			case ToscaPackage.TDEFINITIONS__SERVICE_TEMPLATE:
				return serviceTemplate != null && !serviceTemplate.isEmpty();
			case ToscaPackage.TDEFINITIONS__NODE_TYPE:
				return nodeType != null && !nodeType.isEmpty();
			case ToscaPackage.TDEFINITIONS__NODE_TYPE_IMPLEMENTATION:
				return nodeTypeImplementation != null && !nodeTypeImplementation.isEmpty();
			case ToscaPackage.TDEFINITIONS__RELATIONSHIP_TYPE:
				return relationshipType != null && !relationshipType.isEmpty();
			case ToscaPackage.TDEFINITIONS__RELATIONSHIP_TYPE_IMPLEMENTATION:
				return relationshipTypeImplementation != null && !relationshipTypeImplementation.isEmpty();
			case ToscaPackage.TDEFINITIONS__REQUIREMENT_TYPE:
				return requirementType != null && !requirementType.isEmpty();
			case ToscaPackage.TDEFINITIONS__CAPABILITY_TYPE:
				return capabilityType != null && !capabilityType.isEmpty();
			case ToscaPackage.TDEFINITIONS__ARTIFACT_TYPE:
				return artifactType != null && !artifactType.isEmpty();
			case ToscaPackage.TDEFINITIONS__ARTIFACT_TEMPLATE:
				return artifactTemplate != null && !artifactTemplate.isEmpty();
			case ToscaPackage.TDEFINITIONS__POLICY_TYPE:
				return policyType != null && !policyType.isEmpty();
			case ToscaPackage.TDEFINITIONS__POLICY_TEMPLATE:
				return policyTemplate != null && !policyTemplate.isEmpty();
			case ToscaPackage.TDEFINITIONS__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ToscaPackage.TDEFINITIONS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ToscaPackage.TDEFINITIONS__TARGET_NAMESPACE:
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
		result.append(" (group: ");
		result.append(group);
		result.append(", id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", targetNamespace: ");
		result.append(targetNamespace);
		result.append(')');
		return result.toString();
	}

} //TDefinitionsImpl
