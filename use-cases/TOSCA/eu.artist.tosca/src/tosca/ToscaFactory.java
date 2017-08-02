/**
 */
package tosca;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tosca.ToscaPackage
 * @generated
 */
public interface ToscaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ToscaFactory eINSTANCE = tosca.impl.ToscaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Artifact References Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Artifact References Type</em>'.
	 * @generated
	 */
	ArtifactReferencesType createArtifactReferencesType();

	/**
	 * Returns a new object of class '<em>Capabilities Type TCapability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capabilities Type TCapability</em>'.
	 * @generated
	 */
	CapabilitiesType_TCapability createCapabilitiesType_TCapability();

	/**
	 * Returns a new object of class '<em>Capabilities Type Capability Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capabilities Type Capability Ref</em>'.
	 * @generated
	 */
	CapabilitiesType_CapabilityRef createCapabilitiesType_CapabilityRef();

	/**
	 * Returns a new object of class '<em>Capability Definitions Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capability Definitions Type</em>'.
	 * @generated
	 */
	CapabilityDefinitionsType createCapabilityDefinitionsType();

	/**
	 * Returns a new object of class '<em>Constraints Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraints Type</em>'.
	 * @generated
	 */
	ConstraintsType createConstraintsType();

	/**
	 * Returns a new object of class '<em>Definitions Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Definitions Type</em>'.
	 * @generated
	 */
	DefinitionsType createDefinitionsType();

	/**
	 * Returns a new object of class '<em>Derived From Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Derived From Type</em>'.
	 * @generated
	 */
	DerivedFromType createDerivedFromType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Exclude Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exclude Type</em>'.
	 * @generated
	 */
	ExcludeType createExcludeType();

	/**
	 * Returns a new object of class '<em>Extensions Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extensions Type</em>'.
	 * @generated
	 */
	ExtensionsType createExtensionsType();

	/**
	 * Returns a new object of class '<em>Implementation Artifact Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implementation Artifact Type</em>'.
	 * @generated
	 */
	ImplementationArtifactType createImplementationArtifactType();

	/**
	 * Returns a new object of class '<em>Include Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Include Type</em>'.
	 * @generated
	 */
	IncludeType createIncludeType();

	/**
	 * Returns a new object of class '<em>Input Parameters Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Parameters Type</em>'.
	 * @generated
	 */
	InputParametersType createInputParametersType();

	/**
	 * Returns a new object of class '<em>Instance State Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instance State Type</em>'.
	 * @generated
	 */
	InstanceStateType createInstanceStateType();

	/**
	 * Returns a new object of class '<em>Interfaces Type TInterface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interfaces Type TInterface</em>'.
	 * @generated
	 */
	InterfacesType_TInterface createInterfacesType_TInterface();

	/**
	 * Returns a new object of class '<em>Interfaces Type TExported Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interfaces Type TExported Interface</em>'.
	 * @generated
	 */
	InterfacesType_TExportedInterface createInterfacesType_TExportedInterface();

	/**
	 * Returns a new object of class '<em>Node Operation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Operation Type</em>'.
	 * @generated
	 */
	NodeOperationType createNodeOperationType();

	/**
	 * Returns a new object of class '<em>Node Type Reference Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Type Reference Type</em>'.
	 * @generated
	 */
	NodeTypeReferenceType createNodeTypeReferenceType();

	/**
	 * Returns a new object of class '<em>Output Parameters Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Parameters Type</em>'.
	 * @generated
	 */
	OutputParametersType createOutputParametersType();

	/**
	 * Returns a new object of class '<em>Plan Model Reference Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plan Model Reference Type</em>'.
	 * @generated
	 */
	PlanModelReferenceType createPlanModelReferenceType();

	/**
	 * Returns a new object of class '<em>Plan Model Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plan Model Type</em>'.
	 * @generated
	 */
	PlanModelType createPlanModelType();

	/**
	 * Returns a new object of class '<em>Plan Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plan Type</em>'.
	 * @generated
	 */
	PlanType createPlanType();

	/**
	 * Returns a new object of class '<em>Policies Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Policies Type</em>'.
	 * @generated
	 */
	PoliciesType createPoliciesType();

	/**
	 * Returns a new object of class '<em>Properties Definition Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Properties Definition Type</em>'.
	 * @generated
	 */
	PropertiesDefinitionType createPropertiesDefinitionType();

	/**
	 * Returns a new object of class '<em>Properties Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Properties Type</em>'.
	 * @generated
	 */
	PropertiesType createPropertiesType();

	/**
	 * Returns a new object of class '<em>Properties Type With Property Mappings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Properties Type With Property Mappings</em>'.
	 * @generated
	 */
	PropertiesTypeWithPropertyMappings createPropertiesTypeWithPropertyMappings();

	/**
	 * Returns a new object of class '<em>Property Constraints Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Constraints Type</em>'.
	 * @generated
	 */
	PropertyConstraintsType createPropertyConstraintsType();

	/**
	 * Returns a new object of class '<em>Property Mappings Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Mappings Type</em>'.
	 * @generated
	 */
	PropertyMappingsType createPropertyMappingsType();

	/**
	 * Returns a new object of class '<em>Relationship Constraints Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relationship Constraints Type</em>'.
	 * @generated
	 */
	RelationshipConstraintsType createRelationshipConstraintsType();

	/**
	 * Returns a new object of class '<em>Relationship Constraint Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relationship Constraint Type</em>'.
	 * @generated
	 */
	RelationshipConstraintType createRelationshipConstraintType();

	/**
	 * Returns a new object of class '<em>Relationship Operation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relationship Operation Type</em>'.
	 * @generated
	 */
	RelationshipOperationType createRelationshipOperationType();

	/**
	 * Returns a new object of class '<em>Requirement Definitions Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirement Definitions Type</em>'.
	 * @generated
	 */
	RequirementDefinitionsType createRequirementDefinitionsType();

	/**
	 * Returns a new object of class '<em>Requirements Type TRequirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirements Type TRequirement</em>'.
	 * @generated
	 */
	RequirementsType_TRequirement createRequirementsType_TRequirement();

	/**
	 * Returns a new object of class '<em>Requirements Type TRequirement Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirements Type TRequirement Ref</em>'.
	 * @generated
	 */
	RequirementsType_TRequirementRef createRequirementsType_TRequirementRef();

	/**
	 * Returns a new object of class '<em>Source Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Element Type</em>'.
	 * @generated
	 */
	SourceElementType createSourceElementType();

	/**
	 * Returns a new object of class '<em>Source Interfaces Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Interfaces Type</em>'.
	 * @generated
	 */
	SourceInterfacesType createSourceInterfacesType();

	/**
	 * Returns a new object of class '<em>TApplies To</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TApplies To</em>'.
	 * @generated
	 */
	TAppliesTo createTAppliesTo();

	/**
	 * Returns a new object of class '<em>Target Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Target Element Type</em>'.
	 * @generated
	 */
	TargetElementType createTargetElementType();

	/**
	 * Returns a new object of class '<em>Target Interfaces Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Target Interfaces Type</em>'.
	 * @generated
	 */
	TargetInterfacesType createTargetInterfacesType();

	/**
	 * Returns a new object of class '<em>TArtifact Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TArtifact Reference</em>'.
	 * @generated
	 */
	TArtifactReference createTArtifactReference();

	/**
	 * Returns a new object of class '<em>TArtifact Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TArtifact Template</em>'.
	 * @generated
	 */
	TArtifactTemplate createTArtifactTemplate();

	/**
	 * Returns a new object of class '<em>TArtifact Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TArtifact Type</em>'.
	 * @generated
	 */
	TArtifactType createTArtifactType();

	/**
	 * Returns a new object of class '<em>TBoundary Definitions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TBoundary Definitions</em>'.
	 * @generated
	 */
	TBoundaryDefinitions createTBoundaryDefinitions();

	/**
	 * Returns a new object of class '<em>TCapability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TCapability</em>'.
	 * @generated
	 */
	TCapability createTCapability();

	/**
	 * Returns a new object of class '<em>TCapability Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TCapability Definition</em>'.
	 * @generated
	 */
	TCapabilityDefinition createTCapabilityDefinition();

	/**
	 * Returns a new object of class '<em>TCapability Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TCapability Ref</em>'.
	 * @generated
	 */
	TCapabilityRef createTCapabilityRef();

	/**
	 * Returns a new object of class '<em>TCapability Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TCapability Type</em>'.
	 * @generated
	 */
	TCapabilityType createTCapabilityType();

	/**
	 * Returns a new object of class '<em>TCondition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TCondition</em>'.
	 * @generated
	 */
	TCondition createTCondition();

	/**
	 * Returns a new object of class '<em>TConstraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TConstraint</em>'.
	 * @generated
	 */
	TConstraint createTConstraint();

	/**
	 * Returns a new object of class '<em>TDefinitions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TDefinitions</em>'.
	 * @generated
	 */
	TDefinitions createTDefinitions();

	/**
	 * Returns a new object of class '<em>TDeployment Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TDeployment Artifact</em>'.
	 * @generated
	 */
	TDeploymentArtifact createTDeploymentArtifact();

	/**
	 * Returns a new object of class '<em>TDeployment Artifacts</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TDeployment Artifacts</em>'.
	 * @generated
	 */
	TDeploymentArtifacts createTDeploymentArtifacts();

	/**
	 * Returns a new object of class '<em>TDocumentation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TDocumentation</em>'.
	 * @generated
	 */
	TDocumentation createTDocumentation();

	/**
	 * Returns a new object of class '<em>TExported Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TExported Interface</em>'.
	 * @generated
	 */
	TExportedInterface createTExportedInterface();

	/**
	 * Returns a new object of class '<em>TExported Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TExported Operation</em>'.
	 * @generated
	 */
	TExportedOperation createTExportedOperation();

	/**
	 * Returns a new object of class '<em>TExtensible Elements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TExtensible Elements</em>'.
	 * @generated
	 */
	TExtensibleElements createTExtensibleElements();

	/**
	 * Returns a new object of class '<em>TExtension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TExtension</em>'.
	 * @generated
	 */
	TExtension createTExtension();

	/**
	 * Returns a new object of class '<em>TExtensions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TExtensions</em>'.
	 * @generated
	 */
	TExtensions createTExtensions();

	/**
	 * Returns a new object of class '<em>TImplementation Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TImplementation Artifact</em>'.
	 * @generated
	 */
	TImplementationArtifact createTImplementationArtifact();

	/**
	 * Returns a new object of class '<em>TImplementation Artifacts</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TImplementation Artifacts</em>'.
	 * @generated
	 */
	TImplementationArtifacts createTImplementationArtifacts();

	/**
	 * Returns a new object of class '<em>TImport</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TImport</em>'.
	 * @generated
	 */
	TImport createTImport();

	/**
	 * Returns a new object of class '<em>TInterface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TInterface</em>'.
	 * @generated
	 */
	TInterface createTInterface();

	/**
	 * Returns a new object of class '<em>TNode Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TNode Template</em>'.
	 * @generated
	 */
	TNodeTemplate createTNodeTemplate();

	/**
	 * Returns a new object of class '<em>TNode Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TNode Type</em>'.
	 * @generated
	 */
	TNodeType createTNodeType();

	/**
	 * Returns a new object of class '<em>TNode Type Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TNode Type Implementation</em>'.
	 * @generated
	 */
	TNodeTypeImplementation createTNodeTypeImplementation();

	/**
	 * Returns a new object of class '<em>TOperation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TOperation</em>'.
	 * @generated
	 */
	TOperation createTOperation();

	/**
	 * Returns a new object of class '<em>TParameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TParameter</em>'.
	 * @generated
	 */
	TParameter createTParameter();

	/**
	 * Returns a new object of class '<em>TPlan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TPlan</em>'.
	 * @generated
	 */
	TPlan createTPlan();

	/**
	 * Returns a new object of class '<em>TPlans</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TPlans</em>'.
	 * @generated
	 */
	TPlans createTPlans();

	/**
	 * Returns a new object of class '<em>TPolicy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TPolicy</em>'.
	 * @generated
	 */
	TPolicy createTPolicy();

	/**
	 * Returns a new object of class '<em>TPolicy Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TPolicy Template</em>'.
	 * @generated
	 */
	TPolicyTemplate createTPolicyTemplate();

	/**
	 * Returns a new object of class '<em>TPolicy Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TPolicy Type</em>'.
	 * @generated
	 */
	TPolicyType createTPolicyType();

	/**
	 * Returns a new object of class '<em>TProperty Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TProperty Constraint</em>'.
	 * @generated
	 */
	TPropertyConstraint createTPropertyConstraint();

	/**
	 * Returns a new object of class '<em>TProperty Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TProperty Mapping</em>'.
	 * @generated
	 */
	TPropertyMapping createTPropertyMapping();

	/**
	 * Returns a new object of class '<em>TRelationship Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TRelationship Template</em>'.
	 * @generated
	 */
	TRelationshipTemplate createTRelationshipTemplate();

	/**
	 * Returns a new object of class '<em>TRelationship Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TRelationship Type</em>'.
	 * @generated
	 */
	TRelationshipType createTRelationshipType();

	/**
	 * Returns a new object of class '<em>TRelationship Type Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TRelationship Type Implementation</em>'.
	 * @generated
	 */
	TRelationshipTypeImplementation createTRelationshipTypeImplementation();

	/**
	 * Returns a new object of class '<em>TRequired Container Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TRequired Container Feature</em>'.
	 * @generated
	 */
	TRequiredContainerFeature createTRequiredContainerFeature();

	/**
	 * Returns a new object of class '<em>TRequired Container Features</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TRequired Container Features</em>'.
	 * @generated
	 */
	TRequiredContainerFeatures createTRequiredContainerFeatures();

	/**
	 * Returns a new object of class '<em>TRequirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TRequirement</em>'.
	 * @generated
	 */
	TRequirement createTRequirement();

	/**
	 * Returns a new object of class '<em>TRequirement Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TRequirement Definition</em>'.
	 * @generated
	 */
	TRequirementDefinition createTRequirementDefinition();

	/**
	 * Returns a new object of class '<em>TRequirement Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TRequirement Ref</em>'.
	 * @generated
	 */
	TRequirementRef createTRequirementRef();

	/**
	 * Returns a new object of class '<em>TRequirement Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TRequirement Type</em>'.
	 * @generated
	 */
	TRequirementType createTRequirementType();

	/**
	 * Returns a new object of class '<em>TService Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TService Template</em>'.
	 * @generated
	 */
	TServiceTemplate createTServiceTemplate();

	/**
	 * Returns a new object of class '<em>TTag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TTag</em>'.
	 * @generated
	 */
	TTag createTTag();

	/**
	 * Returns a new object of class '<em>TTags</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TTags</em>'.
	 * @generated
	 */
	TTags createTTags();

	/**
	 * Returns a new object of class '<em>TTopology Element Instance States</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TTopology Element Instance States</em>'.
	 * @generated
	 */
	TTopologyElementInstanceStates createTTopologyElementInstanceStates();

	/**
	 * Returns a new object of class '<em>TTopology Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TTopology Template</em>'.
	 * @generated
	 */
	TTopologyTemplate createTTopologyTemplate();

	/**
	 * Returns a new object of class '<em>Types Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Types Type</em>'.
	 * @generated
	 */
	TypesType createTypesType();

	/**
	 * Returns a new object of class '<em>Valid Source Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Valid Source Type</em>'.
	 * @generated
	 */
	ValidSourceType createValidSourceType();

	/**
	 * Returns a new object of class '<em>Valid Target Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Valid Target Type</em>'.
	 * @generated
	 */
	ValidTargetType createValidTargetType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ToscaPackage getToscaPackage();

} //ToscaFactory
