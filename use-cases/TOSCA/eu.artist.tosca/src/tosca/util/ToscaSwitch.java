/**
 */
package tosca.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import tosca.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see tosca.ToscaPackage
 * @generated
 */
public class ToscaSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ToscaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToscaSwitch() {
		if (modelPackage == null) {
			modelPackage = ToscaPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ToscaPackage.ARTIFACT_REFERENCES_TYPE: {
				ArtifactReferencesType artifactReferencesType = (ArtifactReferencesType)theEObject;
				T result = caseArtifactReferencesType(artifactReferencesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.CAPABILITIES_TYPE_TCAPABILITY: {
				CapabilitiesType_TCapability capabilitiesType_TCapability = (CapabilitiesType_TCapability)theEObject;
				T result = caseCapabilitiesType_TCapability(capabilitiesType_TCapability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.CAPABILITIES_TYPE_CAPABILITY_REF: {
				CapabilitiesType_CapabilityRef capabilitiesType_CapabilityRef = (CapabilitiesType_CapabilityRef)theEObject;
				T result = caseCapabilitiesType_CapabilityRef(capabilitiesType_CapabilityRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.CAPABILITY_DEFINITIONS_TYPE: {
				CapabilityDefinitionsType capabilityDefinitionsType = (CapabilityDefinitionsType)theEObject;
				T result = caseCapabilityDefinitionsType(capabilityDefinitionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.CONSTRAINTS_TYPE: {
				ConstraintsType constraintsType = (ConstraintsType)theEObject;
				T result = caseConstraintsType(constraintsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.DEFINITIONS_TYPE: {
				DefinitionsType definitionsType = (DefinitionsType)theEObject;
				T result = caseDefinitionsType(definitionsType);
				if (result == null) result = caseTDefinitions(definitionsType);
				if (result == null) result = caseTExtensibleElements(definitionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.DERIVED_FROM_TYPE: {
				DerivedFromType derivedFromType = (DerivedFromType)theEObject;
				T result = caseDerivedFromType(derivedFromType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.EXCLUDE_TYPE: {
				ExcludeType excludeType = (ExcludeType)theEObject;
				T result = caseExcludeType(excludeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.EXTENSIONS_TYPE: {
				ExtensionsType extensionsType = (ExtensionsType)theEObject;
				T result = caseExtensionsType(extensionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.IMPLEMENTATION_ARTIFACT_TYPE: {
				ImplementationArtifactType implementationArtifactType = (ImplementationArtifactType)theEObject;
				T result = caseImplementationArtifactType(implementationArtifactType);
				if (result == null) result = caseTImplementationArtifact(implementationArtifactType);
				if (result == null) result = caseTExtensibleElements(implementationArtifactType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.INCLUDE_TYPE: {
				IncludeType includeType = (IncludeType)theEObject;
				T result = caseIncludeType(includeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.INPUT_PARAMETERS_TYPE: {
				InputParametersType inputParametersType = (InputParametersType)theEObject;
				T result = caseInputParametersType(inputParametersType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.INSTANCE_STATE_TYPE: {
				InstanceStateType instanceStateType = (InstanceStateType)theEObject;
				T result = caseInstanceStateType(instanceStateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.INTERFACES_TYPE_TINTERFACE: {
				InterfacesType_TInterface interfacesType_TInterface = (InterfacesType_TInterface)theEObject;
				T result = caseInterfacesType_TInterface(interfacesType_TInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.INTERFACES_TYPE_TEXPORTED_INTERFACE: {
				InterfacesType_TExportedInterface interfacesType_TExportedInterface = (InterfacesType_TExportedInterface)theEObject;
				T result = caseInterfacesType_TExportedInterface(interfacesType_TExportedInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.NODE_OPERATION_TYPE: {
				NodeOperationType nodeOperationType = (NodeOperationType)theEObject;
				T result = caseNodeOperationType(nodeOperationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.NODE_TYPE_REFERENCE_TYPE: {
				NodeTypeReferenceType nodeTypeReferenceType = (NodeTypeReferenceType)theEObject;
				T result = caseNodeTypeReferenceType(nodeTypeReferenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.OUTPUT_PARAMETERS_TYPE: {
				OutputParametersType outputParametersType = (OutputParametersType)theEObject;
				T result = caseOutputParametersType(outputParametersType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.PLAN_MODEL_REFERENCE_TYPE: {
				PlanModelReferenceType planModelReferenceType = (PlanModelReferenceType)theEObject;
				T result = casePlanModelReferenceType(planModelReferenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.PLAN_MODEL_TYPE: {
				PlanModelType planModelType = (PlanModelType)theEObject;
				T result = casePlanModelType(planModelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.PLAN_TYPE: {
				PlanType planType = (PlanType)theEObject;
				T result = casePlanType(planType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.POLICIES_TYPE: {
				PoliciesType policiesType = (PoliciesType)theEObject;
				T result = casePoliciesType(policiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.PROPERTIES_DEFINITION_TYPE: {
				PropertiesDefinitionType propertiesDefinitionType = (PropertiesDefinitionType)theEObject;
				T result = casePropertiesDefinitionType(propertiesDefinitionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.PROPERTIES_TYPE: {
				PropertiesType propertiesType = (PropertiesType)theEObject;
				T result = casePropertiesType(propertiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.PROPERTIES_TYPE_WITH_PROPERTY_MAPPINGS: {
				PropertiesTypeWithPropertyMappings propertiesTypeWithPropertyMappings = (PropertiesTypeWithPropertyMappings)theEObject;
				T result = casePropertiesTypeWithPropertyMappings(propertiesTypeWithPropertyMappings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.PROPERTY_CONSTRAINTS_TYPE: {
				PropertyConstraintsType propertyConstraintsType = (PropertyConstraintsType)theEObject;
				T result = casePropertyConstraintsType(propertyConstraintsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.PROPERTY_MAPPINGS_TYPE: {
				PropertyMappingsType propertyMappingsType = (PropertyMappingsType)theEObject;
				T result = casePropertyMappingsType(propertyMappingsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.RELATIONSHIP_CONSTRAINTS_TYPE: {
				RelationshipConstraintsType relationshipConstraintsType = (RelationshipConstraintsType)theEObject;
				T result = caseRelationshipConstraintsType(relationshipConstraintsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.RELATIONSHIP_CONSTRAINT_TYPE: {
				RelationshipConstraintType relationshipConstraintType = (RelationshipConstraintType)theEObject;
				T result = caseRelationshipConstraintType(relationshipConstraintType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.RELATIONSHIP_OPERATION_TYPE: {
				RelationshipOperationType relationshipOperationType = (RelationshipOperationType)theEObject;
				T result = caseRelationshipOperationType(relationshipOperationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.REQUIREMENT_DEFINITIONS_TYPE: {
				RequirementDefinitionsType requirementDefinitionsType = (RequirementDefinitionsType)theEObject;
				T result = caseRequirementDefinitionsType(requirementDefinitionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.REQUIREMENTS_TYPE_TREQUIREMENT: {
				RequirementsType_TRequirement requirementsType_TRequirement = (RequirementsType_TRequirement)theEObject;
				T result = caseRequirementsType_TRequirement(requirementsType_TRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.REQUIREMENTS_TYPE_TREQUIREMENT_REF: {
				RequirementsType_TRequirementRef requirementsType_TRequirementRef = (RequirementsType_TRequirementRef)theEObject;
				T result = caseRequirementsType_TRequirementRef(requirementsType_TRequirementRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.SOURCE_ELEMENT_TYPE: {
				SourceElementType sourceElementType = (SourceElementType)theEObject;
				T result = caseSourceElementType(sourceElementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.SOURCE_INTERFACES_TYPE: {
				SourceInterfacesType sourceInterfacesType = (SourceInterfacesType)theEObject;
				T result = caseSourceInterfacesType(sourceInterfacesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TAPPLIES_TO: {
				TAppliesTo tAppliesTo = (TAppliesTo)theEObject;
				T result = caseTAppliesTo(tAppliesTo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TARGET_ELEMENT_TYPE: {
				TargetElementType targetElementType = (TargetElementType)theEObject;
				T result = caseTargetElementType(targetElementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TARGET_INTERFACES_TYPE: {
				TargetInterfacesType targetInterfacesType = (TargetInterfacesType)theEObject;
				T result = caseTargetInterfacesType(targetInterfacesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TARTIFACT_REFERENCE: {
				TArtifactReference tArtifactReference = (TArtifactReference)theEObject;
				T result = caseTArtifactReference(tArtifactReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TARTIFACT_TEMPLATE: {
				TArtifactTemplate tArtifactTemplate = (TArtifactTemplate)theEObject;
				T result = caseTArtifactTemplate(tArtifactTemplate);
				if (result == null) result = caseTEntityTemplate(tArtifactTemplate);
				if (result == null) result = caseTExtensibleElements(tArtifactTemplate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TARTIFACT_TYPE: {
				TArtifactType tArtifactType = (TArtifactType)theEObject;
				T result = caseTArtifactType(tArtifactType);
				if (result == null) result = caseTEntityType(tArtifactType);
				if (result == null) result = caseTExtensibleElements(tArtifactType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TBOUNDARY_DEFINITIONS: {
				TBoundaryDefinitions tBoundaryDefinitions = (TBoundaryDefinitions)theEObject;
				T result = caseTBoundaryDefinitions(tBoundaryDefinitions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TCAPABILITY: {
				TCapability tCapability = (TCapability)theEObject;
				T result = caseTCapability(tCapability);
				if (result == null) result = caseTEntityTemplate(tCapability);
				if (result == null) result = caseTExtensibleElements(tCapability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TCAPABILITY_DEFINITION: {
				TCapabilityDefinition tCapabilityDefinition = (TCapabilityDefinition)theEObject;
				T result = caseTCapabilityDefinition(tCapabilityDefinition);
				if (result == null) result = caseTExtensibleElements(tCapabilityDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TCAPABILITY_REF: {
				TCapabilityRef tCapabilityRef = (TCapabilityRef)theEObject;
				T result = caseTCapabilityRef(tCapabilityRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TCAPABILITY_TYPE: {
				TCapabilityType tCapabilityType = (TCapabilityType)theEObject;
				T result = caseTCapabilityType(tCapabilityType);
				if (result == null) result = caseTEntityType(tCapabilityType);
				if (result == null) result = caseTExtensibleElements(tCapabilityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TCONDITION: {
				TCondition tCondition = (TCondition)theEObject;
				T result = caseTCondition(tCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TCONSTRAINT: {
				TConstraint tConstraint = (TConstraint)theEObject;
				T result = caseTConstraint(tConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TDEFINITIONS: {
				TDefinitions tDefinitions = (TDefinitions)theEObject;
				T result = caseTDefinitions(tDefinitions);
				if (result == null) result = caseTExtensibleElements(tDefinitions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TDEPLOYMENT_ARTIFACT: {
				TDeploymentArtifact tDeploymentArtifact = (TDeploymentArtifact)theEObject;
				T result = caseTDeploymentArtifact(tDeploymentArtifact);
				if (result == null) result = caseTExtensibleElements(tDeploymentArtifact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TDEPLOYMENT_ARTIFACTS: {
				TDeploymentArtifacts tDeploymentArtifacts = (TDeploymentArtifacts)theEObject;
				T result = caseTDeploymentArtifacts(tDeploymentArtifacts);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TDOCUMENTATION: {
				TDocumentation tDocumentation = (TDocumentation)theEObject;
				T result = caseTDocumentation(tDocumentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TENTITY_TEMPLATE: {
				TEntityTemplate tEntityTemplate = (TEntityTemplate)theEObject;
				T result = caseTEntityTemplate(tEntityTemplate);
				if (result == null) result = caseTExtensibleElements(tEntityTemplate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TENTITY_TYPE: {
				TEntityType tEntityType = (TEntityType)theEObject;
				T result = caseTEntityType(tEntityType);
				if (result == null) result = caseTExtensibleElements(tEntityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TEXPORTED_INTERFACE: {
				TExportedInterface tExportedInterface = (TExportedInterface)theEObject;
				T result = caseTExportedInterface(tExportedInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TEXPORTED_OPERATION: {
				TExportedOperation tExportedOperation = (TExportedOperation)theEObject;
				T result = caseTExportedOperation(tExportedOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TEXTENSIBLE_ELEMENTS: {
				TExtensibleElements tExtensibleElements = (TExtensibleElements)theEObject;
				T result = caseTExtensibleElements(tExtensibleElements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TEXTENSION: {
				TExtension tExtension = (TExtension)theEObject;
				T result = caseTExtension(tExtension);
				if (result == null) result = caseTExtensibleElements(tExtension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TEXTENSIONS: {
				TExtensions tExtensions = (TExtensions)theEObject;
				T result = caseTExtensions(tExtensions);
				if (result == null) result = caseTExtensibleElements(tExtensions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TIMPLEMENTATION_ARTIFACT: {
				TImplementationArtifact tImplementationArtifact = (TImplementationArtifact)theEObject;
				T result = caseTImplementationArtifact(tImplementationArtifact);
				if (result == null) result = caseTExtensibleElements(tImplementationArtifact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TIMPLEMENTATION_ARTIFACTS: {
				TImplementationArtifacts tImplementationArtifacts = (TImplementationArtifacts)theEObject;
				T result = caseTImplementationArtifacts(tImplementationArtifacts);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TIMPORT: {
				TImport tImport = (TImport)theEObject;
				T result = caseTImport(tImport);
				if (result == null) result = caseTExtensibleElements(tImport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TINTERFACE: {
				TInterface tInterface = (TInterface)theEObject;
				T result = caseTInterface(tInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TNODE_TEMPLATE: {
				TNodeTemplate tNodeTemplate = (TNodeTemplate)theEObject;
				T result = caseTNodeTemplate(tNodeTemplate);
				if (result == null) result = caseTEntityTemplate(tNodeTemplate);
				if (result == null) result = caseTExtensibleElements(tNodeTemplate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TNODE_TYPE: {
				TNodeType tNodeType = (TNodeType)theEObject;
				T result = caseTNodeType(tNodeType);
				if (result == null) result = caseTEntityType(tNodeType);
				if (result == null) result = caseTExtensibleElements(tNodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TNODE_TYPE_IMPLEMENTATION: {
				TNodeTypeImplementation tNodeTypeImplementation = (TNodeTypeImplementation)theEObject;
				T result = caseTNodeTypeImplementation(tNodeTypeImplementation);
				if (result == null) result = caseTExtensibleElements(tNodeTypeImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TOPERATION: {
				TOperation tOperation = (TOperation)theEObject;
				T result = caseTOperation(tOperation);
				if (result == null) result = caseTExtensibleElements(tOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TPARAMETER: {
				TParameter tParameter = (TParameter)theEObject;
				T result = caseTParameter(tParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TPLAN: {
				TPlan tPlan = (TPlan)theEObject;
				T result = caseTPlan(tPlan);
				if (result == null) result = caseTExtensibleElements(tPlan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TPLANS: {
				TPlans tPlans = (TPlans)theEObject;
				T result = caseTPlans(tPlans);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TPOLICY: {
				TPolicy tPolicy = (TPolicy)theEObject;
				T result = caseTPolicy(tPolicy);
				if (result == null) result = caseTExtensibleElements(tPolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TPOLICY_TEMPLATE: {
				TPolicyTemplate tPolicyTemplate = (TPolicyTemplate)theEObject;
				T result = caseTPolicyTemplate(tPolicyTemplate);
				if (result == null) result = caseTEntityTemplate(tPolicyTemplate);
				if (result == null) result = caseTExtensibleElements(tPolicyTemplate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TPOLICY_TYPE: {
				TPolicyType tPolicyType = (TPolicyType)theEObject;
				T result = caseTPolicyType(tPolicyType);
				if (result == null) result = caseTEntityType(tPolicyType);
				if (result == null) result = caseTExtensibleElements(tPolicyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TPROPERTY_CONSTRAINT: {
				TPropertyConstraint tPropertyConstraint = (TPropertyConstraint)theEObject;
				T result = caseTPropertyConstraint(tPropertyConstraint);
				if (result == null) result = caseTConstraint(tPropertyConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TPROPERTY_MAPPING: {
				TPropertyMapping tPropertyMapping = (TPropertyMapping)theEObject;
				T result = caseTPropertyMapping(tPropertyMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TRELATIONSHIP_TEMPLATE: {
				TRelationshipTemplate tRelationshipTemplate = (TRelationshipTemplate)theEObject;
				T result = caseTRelationshipTemplate(tRelationshipTemplate);
				if (result == null) result = caseTEntityTemplate(tRelationshipTemplate);
				if (result == null) result = caseTExtensibleElements(tRelationshipTemplate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TRELATIONSHIP_TYPE: {
				TRelationshipType tRelationshipType = (TRelationshipType)theEObject;
				T result = caseTRelationshipType(tRelationshipType);
				if (result == null) result = caseTEntityType(tRelationshipType);
				if (result == null) result = caseTExtensibleElements(tRelationshipType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TRELATIONSHIP_TYPE_IMPLEMENTATION: {
				TRelationshipTypeImplementation tRelationshipTypeImplementation = (TRelationshipTypeImplementation)theEObject;
				T result = caseTRelationshipTypeImplementation(tRelationshipTypeImplementation);
				if (result == null) result = caseTExtensibleElements(tRelationshipTypeImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TREQUIRED_CONTAINER_FEATURE: {
				TRequiredContainerFeature tRequiredContainerFeature = (TRequiredContainerFeature)theEObject;
				T result = caseTRequiredContainerFeature(tRequiredContainerFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TREQUIRED_CONTAINER_FEATURES: {
				TRequiredContainerFeatures tRequiredContainerFeatures = (TRequiredContainerFeatures)theEObject;
				T result = caseTRequiredContainerFeatures(tRequiredContainerFeatures);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TREQUIREMENT: {
				TRequirement tRequirement = (TRequirement)theEObject;
				T result = caseTRequirement(tRequirement);
				if (result == null) result = caseTEntityTemplate(tRequirement);
				if (result == null) result = caseTExtensibleElements(tRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TREQUIREMENT_DEFINITION: {
				TRequirementDefinition tRequirementDefinition = (TRequirementDefinition)theEObject;
				T result = caseTRequirementDefinition(tRequirementDefinition);
				if (result == null) result = caseTExtensibleElements(tRequirementDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TREQUIREMENT_REF: {
				TRequirementRef tRequirementRef = (TRequirementRef)theEObject;
				T result = caseTRequirementRef(tRequirementRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TREQUIREMENT_TYPE: {
				TRequirementType tRequirementType = (TRequirementType)theEObject;
				T result = caseTRequirementType(tRequirementType);
				if (result == null) result = caseTEntityType(tRequirementType);
				if (result == null) result = caseTExtensibleElements(tRequirementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TSERVICE_TEMPLATE: {
				TServiceTemplate tServiceTemplate = (TServiceTemplate)theEObject;
				T result = caseTServiceTemplate(tServiceTemplate);
				if (result == null) result = caseTExtensibleElements(tServiceTemplate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TTAG: {
				TTag tTag = (TTag)theEObject;
				T result = caseTTag(tTag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TTAGS: {
				TTags tTags = (TTags)theEObject;
				T result = caseTTags(tTags);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TTOPOLOGY_ELEMENT_INSTANCE_STATES: {
				TTopologyElementInstanceStates tTopologyElementInstanceStates = (TTopologyElementInstanceStates)theEObject;
				T result = caseTTopologyElementInstanceStates(tTopologyElementInstanceStates);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TTOPOLOGY_TEMPLATE: {
				TTopologyTemplate tTopologyTemplate = (TTopologyTemplate)theEObject;
				T result = caseTTopologyTemplate(tTopologyTemplate);
				if (result == null) result = caseTExtensibleElements(tTopologyTemplate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.TYPES_TYPE: {
				TypesType typesType = (TypesType)theEObject;
				T result = caseTypesType(typesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.VALID_SOURCE_TYPE: {
				ValidSourceType validSourceType = (ValidSourceType)theEObject;
				T result = caseValidSourceType(validSourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ToscaPackage.VALID_TARGET_TYPE: {
				ValidTargetType validTargetType = (ValidTargetType)theEObject;
				T result = caseValidTargetType(validTargetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact References Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact References Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifactReferencesType(ArtifactReferencesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capabilities Type TCapability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capabilities Type TCapability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilitiesType_TCapability(CapabilitiesType_TCapability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capabilities Type Capability Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capabilities Type Capability Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilitiesType_CapabilityRef(CapabilitiesType_CapabilityRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability Definitions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability Definitions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapabilityDefinitionsType(CapabilityDefinitionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraints Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraints Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintsType(ConstraintsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definitions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definitions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinitionsType(DefinitionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Derived From Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derived From Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDerivedFromType(DerivedFromType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exclude Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exclude Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExcludeType(ExcludeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extensions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extensions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensionsType(ExtensionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation Artifact Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation Artifact Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationArtifactType(ImplementationArtifactType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Include Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Include Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncludeType(IncludeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Parameters Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Parameters Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputParametersType(InputParametersType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance State Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance State Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceStateType(InstanceStateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interfaces Type TInterface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interfaces Type TInterface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfacesType_TInterface(InterfacesType_TInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interfaces Type TExported Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interfaces Type TExported Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfacesType_TExportedInterface(InterfacesType_TExportedInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Operation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Operation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeOperationType(NodeOperationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Type Reference Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Type Reference Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeTypeReferenceType(NodeTypeReferenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Parameters Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Parameters Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputParametersType(OutputParametersType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Model Reference Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Model Reference Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanModelReferenceType(PlanModelReferenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Model Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Model Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanModelType(PlanModelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanType(PlanType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Policies Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Policies Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePoliciesType(PoliciesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Properties Definition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Properties Definition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertiesDefinitionType(PropertiesDefinitionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Properties Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Properties Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertiesType(PropertiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Properties Type With Property Mappings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Properties Type With Property Mappings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertiesTypeWithPropertyMappings(PropertiesTypeWithPropertyMappings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Constraints Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Constraints Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyConstraintsType(PropertyConstraintsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Mappings Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Mappings Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyMappingsType(PropertyMappingsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship Constraints Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship Constraints Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationshipConstraintsType(RelationshipConstraintsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship Constraint Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship Constraint Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationshipConstraintType(RelationshipConstraintType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship Operation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship Operation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationshipOperationType(RelationshipOperationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement Definitions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement Definitions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementDefinitionsType(RequirementDefinitionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirements Type TRequirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirements Type TRequirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementsType_TRequirement(RequirementsType_TRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirements Type TRequirement Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirements Type TRequirement Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementsType_TRequirementRef(RequirementsType_TRequirementRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceElementType(SourceElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Interfaces Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Interfaces Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceInterfacesType(SourceInterfacesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TApplies To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TApplies To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTAppliesTo(TAppliesTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetElementType(TargetElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target Interfaces Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target Interfaces Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetInterfacesType(TargetInterfacesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TArtifact Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TArtifact Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTArtifactReference(TArtifactReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TArtifact Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TArtifact Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTArtifactTemplate(TArtifactTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TArtifact Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TArtifact Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTArtifactType(TArtifactType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TBoundary Definitions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TBoundary Definitions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTBoundaryDefinitions(TBoundaryDefinitions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TCapability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TCapability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTCapability(TCapability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TCapability Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TCapability Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTCapabilityDefinition(TCapabilityDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TCapability Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TCapability Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTCapabilityRef(TCapabilityRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TCapability Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TCapability Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTCapabilityType(TCapabilityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TCondition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TCondition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTCondition(TCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TConstraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TConstraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTConstraint(TConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TDefinitions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TDefinitions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTDefinitions(TDefinitions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TDeployment Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TDeployment Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTDeploymentArtifact(TDeploymentArtifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TDeployment Artifacts</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TDeployment Artifacts</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTDeploymentArtifacts(TDeploymentArtifacts object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TDocumentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TDocumentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTDocumentation(TDocumentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TEntity Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TEntity Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTEntityTemplate(TEntityTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TEntity Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TEntity Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTEntityType(TEntityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TExported Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TExported Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTExportedInterface(TExportedInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TExported Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TExported Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTExportedOperation(TExportedOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TExtensible Elements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TExtensible Elements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTExtensibleElements(TExtensibleElements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TExtension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TExtension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTExtension(TExtension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TExtensions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TExtensions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTExtensions(TExtensions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TImplementation Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TImplementation Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTImplementationArtifact(TImplementationArtifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TImplementation Artifacts</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TImplementation Artifacts</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTImplementationArtifacts(TImplementationArtifacts object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TImport</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TImport</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTImport(TImport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TInterface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TInterface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTInterface(TInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TNode Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TNode Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTNodeTemplate(TNodeTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TNode Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TNode Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTNodeType(TNodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TNode Type Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TNode Type Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTNodeTypeImplementation(TNodeTypeImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TOperation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TOperation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTOperation(TOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TParameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TParameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTParameter(TParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TPlan</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TPlan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTPlan(TPlan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TPlans</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TPlans</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTPlans(TPlans object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TPolicy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TPolicy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTPolicy(TPolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TPolicy Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TPolicy Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTPolicyTemplate(TPolicyTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TPolicy Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TPolicy Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTPolicyType(TPolicyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TProperty Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TProperty Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTPropertyConstraint(TPropertyConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TProperty Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TProperty Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTPropertyMapping(TPropertyMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TRelationship Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TRelationship Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTRelationshipTemplate(TRelationshipTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TRelationship Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TRelationship Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTRelationshipType(TRelationshipType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TRelationship Type Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TRelationship Type Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTRelationshipTypeImplementation(TRelationshipTypeImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TRequired Container Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TRequired Container Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTRequiredContainerFeature(TRequiredContainerFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TRequired Container Features</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TRequired Container Features</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTRequiredContainerFeatures(TRequiredContainerFeatures object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TRequirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TRequirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTRequirement(TRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TRequirement Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TRequirement Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTRequirementDefinition(TRequirementDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TRequirement Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TRequirement Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTRequirementRef(TRequirementRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TRequirement Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TRequirement Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTRequirementType(TRequirementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TService Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TService Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTServiceTemplate(TServiceTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TTag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TTag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTTag(TTag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TTags</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TTags</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTTags(TTags object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TTopology Element Instance States</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TTopology Element Instance States</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTTopologyElementInstanceStates(TTopologyElementInstanceStates object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TTopology Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TTopology Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTTopologyTemplate(TTopologyTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Types Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Types Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypesType(TypesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Valid Source Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Valid Source Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValidSourceType(ValidSourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Valid Target Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Valid Target Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValidTargetType(ValidTargetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ToscaSwitch
