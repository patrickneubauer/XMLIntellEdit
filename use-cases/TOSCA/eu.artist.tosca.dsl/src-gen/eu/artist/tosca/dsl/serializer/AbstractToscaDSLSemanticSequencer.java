package eu.artist.tosca.dsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import eu.artist.tosca.dsl.services.ToscaDSLGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import tosca.ArtifactReferencesType;
import tosca.CapabilitiesType_CapabilityRef;
import tosca.CapabilitiesType_TCapability;
import tosca.CapabilityDefinitionsType;
import tosca.ConstraintsType;
import tosca.DefinitionsType;
import tosca.DerivedFromType;
import tosca.DocumentRoot;
import tosca.ExcludeType;
import tosca.ExtensionsType;
import tosca.ImplementationArtifactType;
import tosca.IncludeType;
import tosca.InputParametersType;
import tosca.InstanceStateType;
import tosca.InterfacesType_TExportedInterface;
import tosca.InterfacesType_TInterface;
import tosca.NodeOperationType;
import tosca.NodeTypeReferenceType;
import tosca.OutputParametersType;
import tosca.PlanModelReferenceType;
import tosca.PlanModelType;
import tosca.PlanType;
import tosca.PoliciesType;
import tosca.PropertiesDefinitionType;
import tosca.PropertiesType;
import tosca.PropertiesTypeWithPropertyMappings;
import tosca.PropertyConstraintsType;
import tosca.PropertyMappingsType;
import tosca.RelationshipConstraintType;
import tosca.RelationshipConstraintsType;
import tosca.RelationshipOperationType;
import tosca.RequirementDefinitionsType;
import tosca.RequirementsType_TRequirement;
import tosca.RequirementsType_TRequirementRef;
import tosca.SourceElementType;
import tosca.SourceInterfacesType;
import tosca.TAppliesTo;
import tosca.TArtifactReference;
import tosca.TArtifactTemplate;
import tosca.TArtifactType;
import tosca.TBoundaryDefinitions;
import tosca.TCapability;
import tosca.TCapabilityDefinition;
import tosca.TCapabilityRef;
import tosca.TCapabilityType;
import tosca.TCondition;
import tosca.TConstraint;
import tosca.TDefinitions;
import tosca.TDeploymentArtifact;
import tosca.TDeploymentArtifacts;
import tosca.TDocumentation;
import tosca.TExportedInterface;
import tosca.TExportedOperation;
import tosca.TExtension;
import tosca.TImplementationArtifacts;
import tosca.TImport;
import tosca.TInterface;
import tosca.TNodeTemplate;
import tosca.TNodeType;
import tosca.TNodeTypeImplementation;
import tosca.TOperation;
import tosca.TParameter;
import tosca.TPlan;
import tosca.TPlans;
import tosca.TPolicy;
import tosca.TPolicyTemplate;
import tosca.TPolicyType;
import tosca.TPropertyConstraint;
import tosca.TPropertyMapping;
import tosca.TRelationshipTemplate;
import tosca.TRelationshipType;
import tosca.TRelationshipTypeImplementation;
import tosca.TRequiredContainerFeature;
import tosca.TRequiredContainerFeatures;
import tosca.TRequirement;
import tosca.TRequirementDefinition;
import tosca.TRequirementRef;
import tosca.TRequirementType;
import tosca.TServiceTemplate;
import tosca.TTag;
import tosca.TTags;
import tosca.TTopologyElementInstanceStates;
import tosca.TTopologyTemplate;
import tosca.TargetElementType;
import tosca.TargetInterfacesType;
import tosca.ToscaPackage;
import tosca.TypesType;
import tosca.ValidSourceType;
import tosca.ValidTargetType;

@SuppressWarnings("all")
public abstract class AbstractToscaDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ToscaDSLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ToscaPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ToscaPackage.ARTIFACT_REFERENCES_TYPE:
				if(context == grammarAccess.getArtifactReferencesTypeRule()) {
					sequence_ArtifactReferencesType(context, (ArtifactReferencesType) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.CAPABILITIES_TYPE_CAPABILITY_REF:
				if(context == grammarAccess.getCapabilitiesType_CapabilityRefRule()) {
					sequence_CapabilitiesType_CapabilityRef(context, (CapabilitiesType_CapabilityRef) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.CAPABILITIES_TYPE_TCAPABILITY:
				if(context == grammarAccess.getCapabilitiesType_TCapabilityRule()) {
					sequence_CapabilitiesType_TCapability(context, (CapabilitiesType_TCapability) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.CAPABILITY_DEFINITIONS_TYPE:
				if(context == grammarAccess.getCapabilityDefinitionsTypeRule()) {
					sequence_CapabilityDefinitionsType(context, (CapabilityDefinitionsType) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.CONSTRAINTS_TYPE:
				if(context == grammarAccess.getConstraintsTypeRule()) {
					sequence_ConstraintsType(context, (ConstraintsType) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.DEFINITIONS_TYPE:
				if(context == grammarAccess.getDefinitionsTypeRule()) {
					sequence_DefinitionsType(context, (DefinitionsType) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.DERIVED_FROM_TYPE:
				if(context == grammarAccess.getDerivedFromTypeRule()) {
					sequence_DerivedFromType(context, (DerivedFromType) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.DOCUMENT_ROOT:
				if(context == grammarAccess.getDocumentRootRule()) {
					sequence_DocumentRoot(context, (DocumentRoot) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.EXCLUDE_TYPE:
				if(context == grammarAccess.getExcludeTypeRule()) {
					sequence_ExcludeType(context, (ExcludeType) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.EXTENSIONS_TYPE:
				if(context == grammarAccess.getExtensionsTypeRule()) {
					sequence_ExtensionsType(context, (ExtensionsType) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.IMPLEMENTATION_ARTIFACT_TYPE:
				if(context == grammarAccess.getImplementationArtifactTypeRule()) {
					sequence_ImplementationArtifactType(context, (ImplementationArtifactType) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.INCLUDE_TYPE:
				if(context == grammarAccess.getIncludeTypeRule()) {
					sequence_IncludeType(context, (IncludeType) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.INPUT_PARAMETERS_TYPE:
				if(context == grammarAccess.getInputParametersTypeRule()) {
					sequence_InputParametersType(context, (InputParametersType) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.INSTANCE_STATE_TYPE:
				if(context == grammarAccess.getInstanceStateTypeRule()) {
					sequence_InstanceStateType(context, (InstanceStateType) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.INTERFACES_TYPE_TEXPORTED_INTERFACE:
				if(context == grammarAccess.getInterfacesType_TExportedInterfaceRule()) {
					sequence_InterfacesType_TExportedInterface(context, (InterfacesType_TExportedInterface) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.INTERFACES_TYPE_TINTERFACE:
				if(context == grammarAccess.getInterfacesType_TInterfaceRule()) {
					sequence_InterfacesType_TInterface(context, (InterfacesType_TInterface) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.NODE_OPERATION_TYPE:
				if(context == grammarAccess.getNodeOperationTypeRule()) {
					sequence_NodeOperationType(context, (NodeOperationType) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.NODE_TYPE_REFERENCE_TYPE:
				if(context == grammarAccess.getNodeTypeReferenceTypeRule()) {
					sequence_NodeTypeReferenceType(context, (NodeTypeReferenceType) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.OUTPUT_PARAMETERS_TYPE:
				if(context == grammarAccess.getOutputParametersTypeRule()) {
					sequence_OutputParametersType(context, (OutputParametersType) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.PLAN_MODEL_REFERENCE_TYPE:
				if(context == grammarAccess.getPlanModelReferenceTypeRule()) {
					sequence_PlanModelReferenceType(context, (PlanModelReferenceType) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.PLAN_MODEL_TYPE:
				if(context == grammarAccess.getPlanModelTypeRule()) {
					sequence_PlanModelType(context, (PlanModelType) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.PLAN_TYPE:
				if(context == grammarAccess.getPlanTypeRule()) {
					sequence_PlanType(context, (PlanType) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.POLICIES_TYPE:
				if(context == grammarAccess.getPoliciesTypeRule()) {
					sequence_PoliciesType(context, (PoliciesType) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.PROPERTIES_DEFINITION_TYPE:
				if(context == grammarAccess.getPropertiesDefinitionTypeRule()) {
					sequence_PropertiesDefinitionType(context, (PropertiesDefinitionType) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.PROPERTIES_TYPE:
				if(context == grammarAccess.getPropertiesTypeRule()) {
					sequence_PropertiesType(context, (PropertiesType) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.PROPERTIES_TYPE_WITH_PROPERTY_MAPPINGS:
				if(context == grammarAccess.getPropertiesTypeWithPropertyMappingsRule()) {
					sequence_PropertiesTypeWithPropertyMappings(context, (PropertiesTypeWithPropertyMappings) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.PROPERTY_CONSTRAINTS_TYPE:
				if(context == grammarAccess.getPropertyConstraintsTypeRule()) {
					sequence_PropertyConstraintsType(context, (PropertyConstraintsType) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.PROPERTY_MAPPINGS_TYPE:
				if(context == grammarAccess.getPropertyMappingsTypeRule()) {
					sequence_PropertyMappingsType(context, (PropertyMappingsType) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.RELATIONSHIP_CONSTRAINT_TYPE:
				if(context == grammarAccess.getRelationshipConstraintTypeRule()) {
					sequence_RelationshipConstraintType(context, (RelationshipConstraintType) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.RELATIONSHIP_CONSTRAINTS_TYPE:
				if(context == grammarAccess.getRelationshipConstraintsTypeRule()) {
					sequence_RelationshipConstraintsType(context, (RelationshipConstraintsType) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.RELATIONSHIP_OPERATION_TYPE:
				if(context == grammarAccess.getRelationshipOperationTypeRule()) {
					sequence_RelationshipOperationType(context, (RelationshipOperationType) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.REQUIREMENT_DEFINITIONS_TYPE:
				if(context == grammarAccess.getRequirementDefinitionsTypeRule()) {
					sequence_RequirementDefinitionsType(context, (RequirementDefinitionsType) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.REQUIREMENTS_TYPE_TREQUIREMENT:
				if(context == grammarAccess.getRequirementsType_TRequirementRule()) {
					sequence_RequirementsType_TRequirement(context, (RequirementsType_TRequirement) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.REQUIREMENTS_TYPE_TREQUIREMENT_REF:
				if(context == grammarAccess.getRequirementsType_TRequirementRefRule()) {
					sequence_RequirementsType_TRequirementRef(context, (RequirementsType_TRequirementRef) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.SOURCE_ELEMENT_TYPE:
				if(context == grammarAccess.getSourceElementTypeRule()) {
					sequence_SourceElementType(context, (SourceElementType) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.SOURCE_INTERFACES_TYPE:
				if(context == grammarAccess.getSourceInterfacesTypeRule()) {
					sequence_SourceInterfacesType(context, (SourceInterfacesType) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.TAPPLIES_TO:
				if(context == grammarAccess.getTAppliesToRule()) {
					sequence_TAppliesTo(context, (TAppliesTo) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.TARTIFACT_REFERENCE:
				if(context == grammarAccess.getTArtifactReferenceRule()) {
					sequence_TArtifactReference(context, (TArtifactReference) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.TARTIFACT_TEMPLATE:
				if(context == grammarAccess.getTArtifactTemplateRule()) {
					sequence_TArtifactTemplate(context, (TArtifactTemplate) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.TARTIFACT_TYPE:
				if(context == grammarAccess.getTArtifactTypeRule()) {
					sequence_TArtifactType(context, (TArtifactType) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.TBOUNDARY_DEFINITIONS:
				if(context == grammarAccess.getTBoundaryDefinitionsRule()) {
					sequence_TBoundaryDefinitions(context, (TBoundaryDefinitions) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.TCAPABILITY:
				if(context == grammarAccess.getTCapabilityRule()) {
					sequence_TCapability(context, (TCapability) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.TCAPABILITY_DEFINITION:
				if(context == grammarAccess.getTCapabilityDefinitionRule()) {
					sequence_TCapabilityDefinition(context, (TCapabilityDefinition) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.TCAPABILITY_REF:
				if(context == grammarAccess.getTCapabilityRefRule()) {
					sequence_TCapabilityRef(context, (TCapabilityRef) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.TCAPABILITY_TYPE:
				if(context == grammarAccess.getTCapabilityTypeRule()) {
					sequence_TCapabilityType(context, (TCapabilityType) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.TCONDITION:
				if(context == grammarAccess.getTConditionRule()) {
					sequence_TCondition(context, (TCondition) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.TCONSTRAINT:
				if(context == grammarAccess.getTConstraintRule() ||
				   context == grammarAccess.getTConstraint_ImplRule()) {
					sequence_TConstraint_Impl(context, (TConstraint) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.TDEFINITIONS:
				if(context == grammarAccess.getTDefinitions_ImplRule()) {
					sequence_TDefinitions_Impl(context, (TDefinitions) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.TDEPLOYMENT_ARTIFACT:
				if(context == grammarAccess.getTDeploymentArtifactRule()) {
					sequence_TDeploymentArtifact(context, (TDeploymentArtifact) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.TDEPLOYMENT_ARTIFACTS:
				if(context == grammarAccess.getTDeploymentArtifactsRule()) {
					sequence_TDeploymentArtifacts(context, (TDeploymentArtifacts) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.TDOCUMENTATION:
				if(context == grammarAccess.getTDocumentationRule()) {
					sequence_TDocumentation(context, (TDocumentation) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.TEXPORTED_INTERFACE:
				if(context == grammarAccess.getTExportedInterfaceRule()) {
					sequence_TExportedInterface(context, (TExportedInterface) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.TEXPORTED_OPERATION:
				if(context == grammarAccess.getTExportedOperationRule()) {
					sequence_TExportedOperation(context, (TExportedOperation) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.TEXTENSION:
				if(context == grammarAccess.getTExtensionRule()) {
					sequence_TExtension(context, (TExtension) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.TIMPLEMENTATION_ARTIFACTS:
				if(context == grammarAccess.getTImplementationArtifactsRule()) {
					sequence_TImplementationArtifacts(context, (TImplementationArtifacts) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.TIMPORT:
				if(context == grammarAccess.getTImportRule()) {
					sequence_TImport(context, (TImport) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.TINTERFACE:
				if(context == grammarAccess.getTInterfaceRule()) {
					sequence_TInterface(context, (TInterface) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.TNODE_TEMPLATE:
				if(context == grammarAccess.getTNodeTemplateRule()) {
					sequence_TNodeTemplate(context, (TNodeTemplate) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.TNODE_TYPE:
				if(context == grammarAccess.getTNodeTypeRule()) {
					sequence_TNodeType(context, (TNodeType) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.TNODE_TYPE_IMPLEMENTATION:
				if(context == grammarAccess.getTNodeTypeImplementationRule()) {
					sequence_TNodeTypeImplementation(context, (TNodeTypeImplementation) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.TOPERATION:
				if(context == grammarAccess.getTOperationRule()) {
					sequence_TOperation(context, (TOperation) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.TPARAMETER:
				if(context == grammarAccess.getTInputParameterRule()) {
					sequence_TInputParameter(context, (TParameter) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTOutputParameterRule()) {
					sequence_TOutputParameter(context, (TParameter) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.TPLAN:
				if(context == grammarAccess.getTPlanRule()) {
					sequence_TPlan(context, (TPlan) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.TPLANS:
				if(context == grammarAccess.getTPlansRule()) {
					sequence_TPlans(context, (TPlans) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.TPOLICY:
				if(context == grammarAccess.getTPolicyRule()) {
					sequence_TPolicy(context, (TPolicy) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.TPOLICY_TEMPLATE:
				if(context == grammarAccess.getTPolicyTemplateRule()) {
					sequence_TPolicyTemplate(context, (TPolicyTemplate) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.TPOLICY_TYPE:
				if(context == grammarAccess.getTPolicyTypeRule()) {
					sequence_TPolicyType(context, (TPolicyType) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.TPROPERTY_CONSTRAINT:
				if(context == grammarAccess.getTConstraintRule() ||
				   context == grammarAccess.getTPropertyConstraintRule()) {
					sequence_TPropertyConstraint(context, (TPropertyConstraint) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.TPROPERTY_MAPPING:
				if(context == grammarAccess.getTPropertyMappingRule()) {
					sequence_TPropertyMapping(context, (TPropertyMapping) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.TRELATIONSHIP_TEMPLATE:
				if(context == grammarAccess.getTRelationshipTemplateRule()) {
					sequence_TRelationshipTemplate(context, (TRelationshipTemplate) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.TRELATIONSHIP_TYPE:
				if(context == grammarAccess.getTRelationshipTypeRule()) {
					sequence_TRelationshipType(context, (TRelationshipType) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.TRELATIONSHIP_TYPE_IMPLEMENTATION:
				if(context == grammarAccess.getTRelationshipTypeImplementationRule()) {
					sequence_TRelationshipTypeImplementation(context, (TRelationshipTypeImplementation) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.TREQUIRED_CONTAINER_FEATURE:
				if(context == grammarAccess.getTRequiredContainerFeatureRule()) {
					sequence_TRequiredContainerFeature(context, (TRequiredContainerFeature) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.TREQUIRED_CONTAINER_FEATURES:
				if(context == grammarAccess.getTRequiredContainerFeaturesRule()) {
					sequence_TRequiredContainerFeatures(context, (TRequiredContainerFeatures) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.TREQUIREMENT:
				if(context == grammarAccess.getTRequirementRule()) {
					sequence_TRequirement(context, (TRequirement) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.TREQUIREMENT_DEFINITION:
				if(context == grammarAccess.getTRequirementDefinitionRule()) {
					sequence_TRequirementDefinition(context, (TRequirementDefinition) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.TREQUIREMENT_REF:
				if(context == grammarAccess.getTRequirementRefRule()) {
					sequence_TRequirementRef(context, (TRequirementRef) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.TREQUIREMENT_TYPE:
				if(context == grammarAccess.getTRequirementTypeRule()) {
					sequence_TRequirementType(context, (TRequirementType) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.TSERVICE_TEMPLATE:
				if(context == grammarAccess.getTServiceTemplateRule()) {
					sequence_TServiceTemplate(context, (TServiceTemplate) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.TTAG:
				if(context == grammarAccess.getTTagRule()) {
					sequence_TTag(context, (TTag) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.TTAGS:
				if(context == grammarAccess.getTTagsRule()) {
					sequence_TTags(context, (TTags) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.TTOPOLOGY_ELEMENT_INSTANCE_STATES:
				if(context == grammarAccess.getTTopologyElementInstanceStatesRule()) {
					sequence_TTopologyElementInstanceStates(context, (TTopologyElementInstanceStates) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.TTOPOLOGY_TEMPLATE:
				if(context == grammarAccess.getTTopologyTemplateRule()) {
					sequence_TTopologyTemplate(context, (TTopologyTemplate) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.TARGET_ELEMENT_TYPE:
				if(context == grammarAccess.getTargetElementTypeRule()) {
					sequence_TargetElementType(context, (TargetElementType) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.TARGET_INTERFACES_TYPE:
				if(context == grammarAccess.getTargetInterfacesTypeRule()) {
					sequence_TargetInterfacesType(context, (TargetInterfacesType) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.TYPES_TYPE:
				if(context == grammarAccess.getTypesTypeRule()) {
					sequence_TypesType(context, (TypesType) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.VALID_SOURCE_TYPE:
				if(context == grammarAccess.getValidSourceTypeRule()) {
					sequence_ValidSourceType(context, (ValidSourceType) semanticObject); 
					return; 
				}
				else break;
			case ToscaPackage.VALID_TARGET_TYPE:
				if(context == grammarAccess.getValidTargetTypeRule()) {
					sequence_ValidTargetType(context, (ValidTargetType) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (artifactReference+=TArtifactReference artifactReference+=TArtifactReference*)
	 */
	protected void sequence_ArtifactReferencesType(EObject context, ArtifactReferencesType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (capability+=TCapabilityRef capability+=TCapabilityRef*)
	 */
	protected void sequence_CapabilitiesType_CapabilityRef(EObject context, CapabilitiesType_CapabilityRef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (capability+=TCapability capability+=TCapability*)
	 */
	protected void sequence_CapabilitiesType_TCapability(EObject context, CapabilitiesType_TCapability semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (capabilityDefinition+=TCapabilityDefinition capabilityDefinition+=TCapabilityDefinition*)
	 */
	protected void sequence_CapabilityDefinitionsType(EObject context, CapabilityDefinitionsType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (constraint+=TConstraint constraint+=TConstraint*)
	 */
	protected void sequence_ConstraintsType(EObject context, ConstraintsType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=ID0 
	 *         name=STRING? 
	 *         targetNamespace=STRING 
	 *         (documentation+=TDocumentation documentation+=TDocumentation*)? 
	 *         extensions=ExtensionsType? 
	 *         (import+=TImport import+=TImport*)? 
	 *         types=TypesType? 
	 *         import+=TImport* 
	 *         serviceTemplate+=TServiceTemplate? 
	 *         nodeType+=TNodeType* 
	 *         relationshipType+=TRelationshipType* 
	 *         requirementType+=TRequirementType* 
	 *         capabilityType+=TCapabilityType* 
	 *         artifactType+=TArtifactType* 
	 *         nodeTypeImplementation+=TNodeTypeImplementation* 
	 *         relationshipTypeImplementation+=TRelationshipTypeImplementation* 
	 *         artifactTemplate+=TArtifactTemplate*
	 *     )
	 */
	protected void sequence_DefinitionsType(EObject context, DefinitionsType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     derivedFrom=QName
	 */
	protected void sequence_DerivedFromType(EObject context, DerivedFromType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ToscaPackage.Literals.DERIVED_FROM_TYPE__DERIVED_FROM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ToscaPackage.Literals.DERIVED_FROM_TYPE__DERIVED_FROM));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDerivedFromTypeAccess().getDerivedFromQNameParserRuleCall_3_0(), semanticObject.getDerivedFrom());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (definitions=DefinitionsType?)
	 */
	protected void sequence_DocumentRoot(EObject context, DocumentRoot semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     pattern=String0
	 */
	protected void sequence_ExcludeType(EObject context, ExcludeType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ToscaPackage.Literals.EXCLUDE_TYPE__PATTERN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ToscaPackage.Literals.EXCLUDE_TYPE__PATTERN));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExcludeTypeAccess().getPatternString0ParserRuleCall_3_0(), semanticObject.getPattern());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (extension+=TExtension extension+=TExtension*)
	 */
	protected void sequence_ExtensionsType(EObject context, ExtensionsType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         artifactRef=QName? 
	 *         artifactType=QName 
	 *         interfaceName=STRING? 
	 *         operationName=NCName? 
	 *         (documentation+=TDocumentation documentation+=TDocumentation*)?
	 *     )
	 */
	protected void sequence_ImplementationArtifactType(EObject context, ImplementationArtifactType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     pattern=String0
	 */
	protected void sequence_IncludeType(EObject context, IncludeType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ToscaPackage.Literals.INCLUDE_TYPE__PATTERN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ToscaPackage.Literals.INCLUDE_TYPE__PATTERN));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIncludeTypeAccess().getPatternString0ParserRuleCall_3_0(), semanticObject.getPattern());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     inputParameter+=TInputParameter*
	 */
	protected void sequence_InputParametersType(EObject context, InputParametersType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     state=STRING
	 */
	protected void sequence_InstanceStateType(EObject context, InstanceStateType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ToscaPackage.Literals.INSTANCE_STATE_TYPE__STATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ToscaPackage.Literals.INSTANCE_STATE_TYPE__STATE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInstanceStateTypeAccess().getStateSTRINGTerminalRuleCall_3_0(), semanticObject.getState());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (interface+=TExportedInterface interface+=TExportedInterface*)
	 */
	protected void sequence_InterfacesType_TExportedInterface(EObject context, InterfacesType_TExportedInterface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (interface+=TInterface interface+=TInterface*)
	 */
	protected void sequence_InterfacesType_TInterface(EObject context, InterfacesType_TInterface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (interfaceName=STRING nodeRef=IDREF operationName=NCName)
	 */
	protected void sequence_NodeOperationType(EObject context, NodeOperationType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ToscaPackage.Literals.NODE_OPERATION_TYPE__INTERFACE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ToscaPackage.Literals.NODE_OPERATION_TYPE__INTERFACE_NAME));
			if(transientValues.isValueTransient(semanticObject, ToscaPackage.Literals.NODE_OPERATION_TYPE__NODE_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ToscaPackage.Literals.NODE_OPERATION_TYPE__NODE_REF));
			if(transientValues.isValueTransient(semanticObject, ToscaPackage.Literals.NODE_OPERATION_TYPE__OPERATION_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ToscaPackage.Literals.NODE_OPERATION_TYPE__OPERATION_NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNodeOperationTypeAccess().getInterfaceNameSTRINGTerminalRuleCall_3_0(), semanticObject.getInterfaceName());
		feeder.accept(grammarAccess.getNodeOperationTypeAccess().getNodeRefIDREFParserRuleCall_5_0(), semanticObject.getNodeRef());
		feeder.accept(grammarAccess.getNodeOperationTypeAccess().getOperationNameNCNameParserRuleCall_7_0(), semanticObject.getOperationName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     typeRef=QName
	 */
	protected void sequence_NodeTypeReferenceType(EObject context, NodeTypeReferenceType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ToscaPackage.Literals.NODE_TYPE_REFERENCE_TYPE__TYPE_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ToscaPackage.Literals.NODE_TYPE_REFERENCE_TYPE__TYPE_REF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNodeTypeReferenceTypeAccess().getTypeRefQNameParserRuleCall_3_0(), semanticObject.getTypeRef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     outputParameter+=TOutputParameter*
	 */
	protected void sequence_OutputParametersType(EObject context, OutputParametersType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     reference=STRING
	 */
	protected void sequence_PlanModelReferenceType(EObject context, PlanModelReferenceType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ToscaPackage.Literals.PLAN_MODEL_REFERENCE_TYPE__REFERENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ToscaPackage.Literals.PLAN_MODEL_REFERENCE_TYPE__REFERENCE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPlanModelReferenceTypeAccess().getReferenceSTRINGTerminalRuleCall_4_0(), semanticObject.getReference());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {PlanModelType}
	 */
	protected void sequence_PlanModelType(EObject context, PlanModelType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     planRef=IDREF
	 */
	protected void sequence_PlanType(EObject context, PlanType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ToscaPackage.Literals.PLAN_TYPE__PLAN_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ToscaPackage.Literals.PLAN_TYPE__PLAN_REF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPlanTypeAccess().getPlanRefIDREFParserRuleCall_3_0(), semanticObject.getPlanRef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (policy+=TPolicy policy+=TPolicy*)
	 */
	protected void sequence_PoliciesType(EObject context, PoliciesType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (element=QName? type=QName?)
	 */
	protected void sequence_PropertiesDefinitionType(EObject context, PropertiesDefinitionType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (propertyMappings=PropertyMappingsType?)
	 */
	protected void sequence_PropertiesTypeWithPropertyMappings(EObject context, PropertiesTypeWithPropertyMappings semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {PropertiesType}
	 */
	protected void sequence_PropertiesType(EObject context, PropertiesType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (propertyConstraint+=TPropertyConstraint propertyConstraint+=TPropertyConstraint*)
	 */
	protected void sequence_PropertyConstraintsType(EObject context, PropertyConstraintsType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (propertyMapping+=TPropertyMapping propertyMapping+=TPropertyMapping*)
	 */
	protected void sequence_PropertyMappingsType(EObject context, PropertyMappingsType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     constraintType=STRING
	 */
	protected void sequence_RelationshipConstraintType(EObject context, RelationshipConstraintType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (relationshipConstraint+=RelationshipConstraintType relationshipConstraint+=RelationshipConstraintType*)
	 */
	protected void sequence_RelationshipConstraintsType(EObject context, RelationshipConstraintsType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (interfaceName=STRING operationName=NCName relationshipRef=IDREF)
	 */
	protected void sequence_RelationshipOperationType(EObject context, RelationshipOperationType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ToscaPackage.Literals.RELATIONSHIP_OPERATION_TYPE__INTERFACE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ToscaPackage.Literals.RELATIONSHIP_OPERATION_TYPE__INTERFACE_NAME));
			if(transientValues.isValueTransient(semanticObject, ToscaPackage.Literals.RELATIONSHIP_OPERATION_TYPE__OPERATION_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ToscaPackage.Literals.RELATIONSHIP_OPERATION_TYPE__OPERATION_NAME));
			if(transientValues.isValueTransient(semanticObject, ToscaPackage.Literals.RELATIONSHIP_OPERATION_TYPE__RELATIONSHIP_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ToscaPackage.Literals.RELATIONSHIP_OPERATION_TYPE__RELATIONSHIP_REF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRelationshipOperationTypeAccess().getInterfaceNameSTRINGTerminalRuleCall_3_0(), semanticObject.getInterfaceName());
		feeder.accept(grammarAccess.getRelationshipOperationTypeAccess().getOperationNameNCNameParserRuleCall_5_0(), semanticObject.getOperationName());
		feeder.accept(grammarAccess.getRelationshipOperationTypeAccess().getRelationshipRefIDREFParserRuleCall_7_0(), semanticObject.getRelationshipRef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (requirementDefinition+=TRequirementDefinition requirementDefinition+=TRequirementDefinition*)
	 */
	protected void sequence_RequirementDefinitionsType(EObject context, RequirementDefinitionsType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (requirement+=TRequirementRef requirement+=TRequirementRef*)
	 */
	protected void sequence_RequirementsType_TRequirementRef(EObject context, RequirementsType_TRequirementRef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (requirement+=TRequirement requirement+=TRequirement*)
	 */
	protected void sequence_RequirementsType_TRequirement(EObject context, RequirementsType_TRequirement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ref=IDREF
	 */
	protected void sequence_SourceElementType(EObject context, SourceElementType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ToscaPackage.Literals.SOURCE_ELEMENT_TYPE__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ToscaPackage.Literals.SOURCE_ELEMENT_TYPE__REF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSourceElementTypeAccess().getRefIDREFParserRuleCall_1_0(), semanticObject.getRef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (interface+=TInterface interface+=TInterface*)
	 */
	protected void sequence_SourceInterfacesType(EObject context, SourceInterfacesType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (nodeTypeReference+=NodeTypeReferenceType nodeTypeReference+=NodeTypeReferenceType*)
	 */
	protected void sequence_TAppliesTo(EObject context, TAppliesTo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (reference=AnyURI (include+=IncludeType include+=IncludeType*)? (exclude+=ExcludeType exclude+=ExcludeType*)?)
	 */
	protected void sequence_TArtifactReference(EObject context, TArtifactReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=ID0 
	 *         type=QName 
	 *         name=STRING? 
	 *         (documentation+=TDocumentation documentation+=TDocumentation*)? 
	 *         propertyConstraints=PropertyConstraintsType? 
	 *         artifactReferences=ArtifactReferencesType?
	 *     )
	 */
	protected void sequence_TArtifactTemplate(EObject context, TArtifactTemplate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         abstract=TBoolean? 
	 *         final=TBoolean? 
	 *         name=NCName 
	 *         targetNamespace=STRING? 
	 *         (documentation+=TDocumentation documentation+=TDocumentation*)? 
	 *         tags=TTags? 
	 *         derivedFrom=DerivedFromType? 
	 *         propertiesDefinition=PropertiesDefinitionType?
	 *     )
	 */
	protected void sequence_TArtifactType(EObject context, TArtifactType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         properties=PropertiesTypeWithPropertyMappings? 
	 *         propertyConstraints=PropertyConstraintsType? 
	 *         requirements=RequirementsType_TRequirementRef? 
	 *         capabilities=CapabilitiesType_CapabilityRef? 
	 *         policies=PoliciesType? 
	 *         interfaces=InterfacesType_TExportedInterface?
	 *     )
	 */
	protected void sequence_TBoundaryDefinitions(EObject context, TBoundaryDefinitions semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         capabilityType=QName 
	 *         lowerBound=INT? 
	 *         name=STRING 
	 *         upperBound=UpperBoundType? 
	 *         (documentation+=TDocumentation documentation+=TDocumentation*)? 
	 *         constraints=ConstraintsType?
	 *     )
	 */
	protected void sequence_TCapabilityDefinition(EObject context, TCapabilityDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING? ref=IDREF)
	 */
	protected void sequence_TCapabilityRef(EObject context, TCapabilityRef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         abstract=TBoolean? 
	 *         final=TBoolean? 
	 *         name=NCName 
	 *         targetNamespace=STRING? 
	 *         (documentation+=TDocumentation documentation+=TDocumentation*)? 
	 *         tags=TTags? 
	 *         derivedFrom=DerivedFromType? 
	 *         propertiesDefinition=PropertiesDefinitionType?
	 *     )
	 */
	protected void sequence_TCapabilityType(EObject context, TCapabilityType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (id=ID0 name=STRING type=QName (documentation+=TDocumentation documentation+=TDocumentation*)? propertyConstraints=PropertyConstraintsType?)
	 */
	protected void sequence_TCapability(EObject context, TCapability semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expressionLanguage=STRING
	 */
	protected void sequence_TCondition(EObject context, TCondition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     constraintType=STRING
	 */
	protected void sequence_TConstraint_Impl(EObject context, TConstraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=ID0 
	 *         name=STRING? 
	 *         targetNamespace=STRING 
	 *         (documentation+=TDocumentation documentation+=TDocumentation*)? 
	 *         extensions=ExtensionsType? 
	 *         import+=TImport* 
	 *         serviceTemplate+=TServiceTemplate? 
	 *         types=TypesType?
	 *     )
	 */
	protected void sequence_TDefinitions_Impl(EObject context, TDefinitions semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (artifactRef=QName? artifactType=QName name=STRING (documentation+=TDocumentation documentation+=TDocumentation*)?)
	 */
	protected void sequence_TDeploymentArtifact(EObject context, TDeploymentArtifact semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (deploymentArtifact+=TDeploymentArtifact deploymentArtifact+=TDeploymentArtifact*)
	 */
	protected void sequence_TDeploymentArtifacts(EObject context, TDeploymentArtifacts semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (lang=EString? source=STRING?)
	 */
	protected void sequence_TDocumentation(EObject context, TDocumentation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING operation+=TExportedOperation operation+=TExportedOperation*)
	 */
	protected void sequence_TExportedInterface(EObject context, TExportedInterface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=NCName nodeOperation=NodeOperationType? relationshipOperation=RelationshipOperationType? plan=PlanType?)
	 */
	protected void sequence_TExportedOperation(EObject context, TExportedOperation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (mustUnderstand=TBoolean? namespace=STRING (documentation+=TDocumentation documentation+=TDocumentation*)?)
	 */
	protected void sequence_TExtension(EObject context, TExtension semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (implementationArtifact+=ImplementationArtifactType implementationArtifact+=ImplementationArtifactType*)
	 */
	protected void sequence_TImplementationArtifacts(EObject context, TImplementationArtifacts semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (importType=STRING location=STRING? namespace=STRING? (documentation+=TDocumentation documentation+=TDocumentation*)?)
	 */
	protected void sequence_TImport(EObject context, TImport semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING type=STRING required=TBoolean?)
	 */
	protected void sequence_TInputParameter(EObject context, TParameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING operation+=TOperation operation+=TOperation*)
	 */
	protected void sequence_TInterface(EObject context, TInterface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=ID0 
	 *         name=STRING? 
	 *         type=QName 
	 *         maxInstances=MaxInstancesType? 
	 *         minInstances=INT? 
	 *         (documentation+=TDocumentation documentation+=TDocumentation*)? 
	 *         properties+=PropertiesType? 
	 *         propertyConstraints=PropertyConstraintsType? 
	 *         requirements=RequirementsType_TRequirement? 
	 *         capabilities=CapabilitiesType_TCapability? 
	 *         policies=PoliciesType? 
	 *         deploymentArtifacts=TDeploymentArtifacts?
	 *     )
	 */
	protected void sequence_TNodeTemplate(EObject context, TNodeTemplate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         abstract=TBoolean? 
	 *         final=TBoolean? 
	 *         name=NCName 
	 *         nodeType=QName 
	 *         targetNamespace=STRING? 
	 *         (documentation+=TDocumentation documentation+=TDocumentation*)? 
	 *         tags=TTags? 
	 *         derivedFrom=DerivedFromType? 
	 *         requiredContainerFeatures=TRequiredContainerFeatures? 
	 *         implementationArtifacts=TImplementationArtifacts? 
	 *         deploymentArtifacts=TDeploymentArtifacts?
	 *     )
	 */
	protected void sequence_TNodeTypeImplementation(EObject context, TNodeTypeImplementation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         abstract=TBoolean? 
	 *         final=TBoolean? 
	 *         name=NCName 
	 *         targetNamespace=STRING? 
	 *         (documentation+=TDocumentation documentation+=TDocumentation*)? 
	 *         tags=TTags? 
	 *         derivedFrom=DerivedFromType? 
	 *         propertiesDefinition=PropertiesDefinitionType? 
	 *         requirementDefinitions=RequirementDefinitionsType? 
	 *         capabilityDefinitions=CapabilityDefinitionsType? 
	 *         instanceStates=TTopologyElementInstanceStates? 
	 *         interfaces=InterfacesType_TInterface?
	 *     )
	 */
	protected void sequence_TNodeType(EObject context, TNodeType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=NCName 
	 *         (documentation+=TDocumentation documentation+=TDocumentation*)? 
	 *         inputParameters=InputParametersType? 
	 *         outputParameters=OutputParametersType?
	 *     )
	 */
	protected void sequence_TOperation(EObject context, TOperation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING type=STRING required=TBoolean?)
	 */
	protected void sequence_TOutputParameter(EObject context, TParameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=ID0 
	 *         planType=STRING 
	 *         planLanguage=STRING 
	 *         name=STRING? 
	 *         (documentation+=TDocumentation documentation+=TDocumentation*)? 
	 *         precondition=TCondition? 
	 *         inputParameters=InputParametersType? 
	 *         outputParameters=OutputParametersType? 
	 *         planModel=PlanModelType? 
	 *         planModelReference=PlanModelReferenceType?
	 *     )
	 */
	protected void sequence_TPlan(EObject context, TPlan semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (targetNamespace=STRING? plan+=TPlan*)
	 */
	protected void sequence_TPlans(EObject context, TPlans semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (id=ID0 type=QName name=STRING? (documentation+=TDocumentation documentation+=TDocumentation*)? propertyConstraints=PropertyConstraintsType?)
	 */
	protected void sequence_TPolicyTemplate(EObject context, TPolicyTemplate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         abstract=TBoolean? 
	 *         final=TBoolean? 
	 *         name=NCName 
	 *         targetNamespace=STRING? 
	 *         policyLanguage=STRING? 
	 *         (documentation+=TDocumentation documentation+=TDocumentation*)? 
	 *         tags=TTags? 
	 *         derivedFrom=DerivedFromType? 
	 *         propertiesDefinition=PropertiesDefinitionType? 
	 *         appliesTo=TAppliesTo?
	 *     )
	 */
	protected void sequence_TPolicyType(EObject context, TPolicyType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING? policyRef=QName? policyType=QName (documentation+=TDocumentation documentation+=TDocumentation*)?)
	 */
	protected void sequence_TPolicy(EObject context, TPolicy semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (constraintType=STRING property=STRING)
	 */
	protected void sequence_TPropertyConstraint(EObject context, TPropertyConstraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (serviceTemplatePropertyRef=STRING targetObjectRef=IDREF targetPropertyRef=STRING)
	 */
	protected void sequence_TPropertyMapping(EObject context, TPropertyMapping semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ToscaPackage.Literals.TPROPERTY_MAPPING__SERVICE_TEMPLATE_PROPERTY_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ToscaPackage.Literals.TPROPERTY_MAPPING__SERVICE_TEMPLATE_PROPERTY_REF));
			if(transientValues.isValueTransient(semanticObject, ToscaPackage.Literals.TPROPERTY_MAPPING__TARGET_OBJECT_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ToscaPackage.Literals.TPROPERTY_MAPPING__TARGET_OBJECT_REF));
			if(transientValues.isValueTransient(semanticObject, ToscaPackage.Literals.TPROPERTY_MAPPING__TARGET_PROPERTY_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ToscaPackage.Literals.TPROPERTY_MAPPING__TARGET_PROPERTY_REF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTPropertyMappingAccess().getServiceTemplatePropertyRefSTRINGTerminalRuleCall_3_0(), semanticObject.getServiceTemplatePropertyRef());
		feeder.accept(grammarAccess.getTPropertyMappingAccess().getTargetObjectRefIDREFParserRuleCall_5_0(), semanticObject.getTargetObjectRef());
		feeder.accept(grammarAccess.getTPropertyMappingAccess().getTargetPropertyRefSTRINGTerminalRuleCall_7_0(), semanticObject.getTargetPropertyRef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=ID0 
	 *         name=STRING? 
	 *         type=QName 
	 *         (documentation+=TDocumentation documentation+=TDocumentation*)? 
	 *         propertyConstraints=PropertyConstraintsType? 
	 *         sourceElement=SourceElementType 
	 *         targetElement=TargetElementType 
	 *         relationshipConstraints=RelationshipConstraintsType?
	 *     )
	 */
	protected void sequence_TRelationshipTemplate(EObject context, TRelationshipTemplate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         abstract=TBoolean? 
	 *         final=TBoolean? 
	 *         name=NCName 
	 *         relationshipType=QName 
	 *         targetNamespace=STRING? 
	 *         (documentation+=TDocumentation documentation+=TDocumentation*)? 
	 *         tags=TTags? 
	 *         derivedFrom=DerivedFromType? 
	 *         requiredContainerFeatures=TRequiredContainerFeatures? 
	 *         implementationArtifacts=TImplementationArtifacts?
	 *     )
	 */
	protected void sequence_TRelationshipTypeImplementation(EObject context, TRelationshipTypeImplementation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         abstract=TBoolean? 
	 *         final=TBoolean? 
	 *         name=NCName 
	 *         targetNamespace=STRING? 
	 *         (documentation+=TDocumentation documentation+=TDocumentation*)? 
	 *         tags=TTags? 
	 *         derivedFrom=DerivedFromType? 
	 *         propertiesDefinition=PropertiesDefinitionType? 
	 *         instanceStates=TTopologyElementInstanceStates? 
	 *         sourceInterfaces=SourceInterfacesType? 
	 *         targetInterfaces=TargetInterfacesType? 
	 *         validSource=ValidSourceType? 
	 *         validTarget=ValidTargetType?
	 *     )
	 */
	protected void sequence_TRelationshipType(EObject context, TRelationshipType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     feature=STRING
	 */
	protected void sequence_TRequiredContainerFeature(EObject context, TRequiredContainerFeature semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ToscaPackage.Literals.TREQUIRED_CONTAINER_FEATURE__FEATURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ToscaPackage.Literals.TREQUIRED_CONTAINER_FEATURE__FEATURE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTRequiredContainerFeatureAccess().getFeatureSTRINGTerminalRuleCall_3_0(), semanticObject.getFeature());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (requiredContainerFeature+=TRequiredContainerFeature requiredContainerFeature+=TRequiredContainerFeature*)
	 */
	protected void sequence_TRequiredContainerFeatures(EObject context, TRequiredContainerFeatures semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         lowerBound=INT? 
	 *         name=STRING 
	 *         requirementType=QName 
	 *         upperBound=UpperBoundType1? 
	 *         (documentation+=TDocumentation documentation+=TDocumentation*)? 
	 *         constraints=ConstraintsType?
	 *     )
	 */
	protected void sequence_TRequirementDefinition(EObject context, TRequirementDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING? ref=IDREF)
	 */
	protected void sequence_TRequirementRef(EObject context, TRequirementRef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         abstract=TBoolean? 
	 *         final=TBoolean? 
	 *         name=NCName 
	 *         targetNamespace=STRING? 
	 *         requiredCapabilityType=QName? 
	 *         (documentation+=TDocumentation documentation+=TDocumentation*)? 
	 *         tags=TTags? 
	 *         derivedFrom=DerivedFromType? 
	 *         propertiesDefinition=PropertiesDefinitionType?
	 *     )
	 */
	protected void sequence_TRequirementType(EObject context, TRequirementType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (id=ID0 name=STRING type=QName (documentation+=TDocumentation documentation+=TDocumentation*)? propertyConstraints=PropertyConstraintsType?)
	 */
	protected void sequence_TRequirement(EObject context, TRequirement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=ID0 
	 *         name=STRING? 
	 *         substitutableNodeType=QName? 
	 *         targetNamespace=STRING? 
	 *         (documentation+=TDocumentation documentation+=TDocumentation*)? 
	 *         tags=TTags? 
	 *         boundaryDefinitions=TBoundaryDefinitions? 
	 *         topologyTemplate=TTopologyTemplate? 
	 *         plans=TPlans?
	 *     )
	 */
	protected void sequence_TServiceTemplate(EObject context, TServiceTemplate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING value=STRING)
	 */
	protected void sequence_TTag(EObject context, TTag semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ToscaPackage.Literals.TTAG__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ToscaPackage.Literals.TTAG__NAME));
			if(transientValues.isValueTransient(semanticObject, ToscaPackage.Literals.TTAG__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ToscaPackage.Literals.TTAG__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTTagAccess().getNameSTRINGTerminalRuleCall_4_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTTagAccess().getValueSTRINGTerminalRuleCall_6_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (tag+=TTag tag+=TTag*)
	 */
	protected void sequence_TTags(EObject context, TTags semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (instanceState+=InstanceStateType instanceState+=InstanceStateType*)
	 */
	protected void sequence_TTopologyElementInstanceStates(EObject context, TTopologyElementInstanceStates semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((documentation+=TDocumentation documentation+=TDocumentation*)? nodeTemplate+=TNodeTemplate* relationshipTemplate+=TRelationshipTemplate*)
	 */
	protected void sequence_TTopologyTemplate(EObject context, TTopologyTemplate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ref=IDREF
	 */
	protected void sequence_TargetElementType(EObject context, TargetElementType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ToscaPackage.Literals.TARGET_ELEMENT_TYPE__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ToscaPackage.Literals.TARGET_ELEMENT_TYPE__REF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTargetElementTypeAccess().getRefIDREFParserRuleCall_1_0(), semanticObject.getRef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (interface+=TInterface interface+=TInterface*)
	 */
	protected void sequence_TargetInterfacesType(EObject context, TargetInterfacesType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {TypesType}
	 */
	protected void sequence_TypesType(EObject context, TypesType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     typeRef=QName
	 */
	protected void sequence_ValidSourceType(EObject context, ValidSourceType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ToscaPackage.Literals.VALID_SOURCE_TYPE__TYPE_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ToscaPackage.Literals.VALID_SOURCE_TYPE__TYPE_REF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getValidSourceTypeAccess().getTypeRefQNameParserRuleCall_3_0(), semanticObject.getTypeRef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     typeRef=QName
	 */
	protected void sequence_ValidTargetType(EObject context, ValidTargetType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ToscaPackage.Literals.VALID_TARGET_TYPE__TYPE_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ToscaPackage.Literals.VALID_TARGET_TYPE__TYPE_REF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getValidTargetTypeAccess().getTypeRefQNameParserRuleCall_3_0(), semanticObject.getTypeRef());
		feeder.finish();
	}
}
