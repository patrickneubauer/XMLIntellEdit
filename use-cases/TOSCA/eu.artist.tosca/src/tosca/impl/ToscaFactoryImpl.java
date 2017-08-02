/**
 */
package tosca.impl;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.Diagnostician;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import tosca.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ToscaFactoryImpl extends EFactoryImpl implements ToscaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ToscaFactory init() {
		try {
			ToscaFactory theToscaFactory = (ToscaFactory)EPackage.Registry.INSTANCE.getEFactory(ToscaPackage.eNS_URI);
			if (theToscaFactory != null) {
				return theToscaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ToscaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToscaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ToscaPackage.ARTIFACT_REFERENCES_TYPE: return createArtifactReferencesType();
			case ToscaPackage.CAPABILITIES_TYPE_TCAPABILITY: return createCapabilitiesType_TCapability();
			case ToscaPackage.CAPABILITIES_TYPE_CAPABILITY_REF: return createCapabilitiesType_CapabilityRef();
			case ToscaPackage.CAPABILITY_DEFINITIONS_TYPE: return createCapabilityDefinitionsType();
			case ToscaPackage.CONSTRAINTS_TYPE: return createConstraintsType();
			case ToscaPackage.DEFINITIONS_TYPE: return createDefinitionsType();
			case ToscaPackage.DERIVED_FROM_TYPE: return createDerivedFromType();
			case ToscaPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case ToscaPackage.EXCLUDE_TYPE: return createExcludeType();
			case ToscaPackage.EXTENSIONS_TYPE: return createExtensionsType();
			case ToscaPackage.IMPLEMENTATION_ARTIFACT_TYPE: return createImplementationArtifactType();
			case ToscaPackage.INCLUDE_TYPE: return createIncludeType();
			case ToscaPackage.INPUT_PARAMETERS_TYPE: return createInputParametersType();
			case ToscaPackage.INSTANCE_STATE_TYPE: return createInstanceStateType();
			case ToscaPackage.INTERFACES_TYPE_TINTERFACE: return createInterfacesType_TInterface();
			case ToscaPackage.INTERFACES_TYPE_TEXPORTED_INTERFACE: return createInterfacesType_TExportedInterface();
			case ToscaPackage.NODE_OPERATION_TYPE: return createNodeOperationType();
			case ToscaPackage.NODE_TYPE_REFERENCE_TYPE: return createNodeTypeReferenceType();
			case ToscaPackage.OUTPUT_PARAMETERS_TYPE: return createOutputParametersType();
			case ToscaPackage.PLAN_MODEL_REFERENCE_TYPE: return createPlanModelReferenceType();
			case ToscaPackage.PLAN_MODEL_TYPE: return createPlanModelType();
			case ToscaPackage.PLAN_TYPE: return createPlanType();
			case ToscaPackage.POLICIES_TYPE: return createPoliciesType();
			case ToscaPackage.PROPERTIES_DEFINITION_TYPE: return createPropertiesDefinitionType();
			case ToscaPackage.PROPERTIES_TYPE: return createPropertiesType();
			case ToscaPackage.PROPERTIES_TYPE_WITH_PROPERTY_MAPPINGS: return createPropertiesTypeWithPropertyMappings();
			case ToscaPackage.PROPERTY_CONSTRAINTS_TYPE: return createPropertyConstraintsType();
			case ToscaPackage.PROPERTY_MAPPINGS_TYPE: return createPropertyMappingsType();
			case ToscaPackage.RELATIONSHIP_CONSTRAINTS_TYPE: return createRelationshipConstraintsType();
			case ToscaPackage.RELATIONSHIP_CONSTRAINT_TYPE: return createRelationshipConstraintType();
			case ToscaPackage.RELATIONSHIP_OPERATION_TYPE: return createRelationshipOperationType();
			case ToscaPackage.REQUIREMENT_DEFINITIONS_TYPE: return createRequirementDefinitionsType();
			case ToscaPackage.REQUIREMENTS_TYPE_TREQUIREMENT: return createRequirementsType_TRequirement();
			case ToscaPackage.REQUIREMENTS_TYPE_TREQUIREMENT_REF: return createRequirementsType_TRequirementRef();
			case ToscaPackage.SOURCE_ELEMENT_TYPE: return createSourceElementType();
			case ToscaPackage.SOURCE_INTERFACES_TYPE: return createSourceInterfacesType();
			case ToscaPackage.TAPPLIES_TO: return createTAppliesTo();
			case ToscaPackage.TARGET_ELEMENT_TYPE: return createTargetElementType();
			case ToscaPackage.TARGET_INTERFACES_TYPE: return createTargetInterfacesType();
			case ToscaPackage.TARTIFACT_REFERENCE: return createTArtifactReference();
			case ToscaPackage.TARTIFACT_TEMPLATE: return createTArtifactTemplate();
			case ToscaPackage.TARTIFACT_TYPE: return createTArtifactType();
			case ToscaPackage.TBOUNDARY_DEFINITIONS: return createTBoundaryDefinitions();
			case ToscaPackage.TCAPABILITY: return createTCapability();
			case ToscaPackage.TCAPABILITY_DEFINITION: return createTCapabilityDefinition();
			case ToscaPackage.TCAPABILITY_REF: return createTCapabilityRef();
			case ToscaPackage.TCAPABILITY_TYPE: return createTCapabilityType();
			case ToscaPackage.TCONDITION: return createTCondition();
			case ToscaPackage.TCONSTRAINT: return createTConstraint();
			case ToscaPackage.TDEFINITIONS: return createTDefinitions();
			case ToscaPackage.TDEPLOYMENT_ARTIFACT: return createTDeploymentArtifact();
			case ToscaPackage.TDEPLOYMENT_ARTIFACTS: return createTDeploymentArtifacts();
			case ToscaPackage.TDOCUMENTATION: return createTDocumentation();
			case ToscaPackage.TEXPORTED_INTERFACE: return createTExportedInterface();
			case ToscaPackage.TEXPORTED_OPERATION: return createTExportedOperation();
			case ToscaPackage.TEXTENSIBLE_ELEMENTS: return createTExtensibleElements();
			case ToscaPackage.TEXTENSION: return createTExtension();
			case ToscaPackage.TEXTENSIONS: return createTExtensions();
			case ToscaPackage.TIMPLEMENTATION_ARTIFACT: return createTImplementationArtifact();
			case ToscaPackage.TIMPLEMENTATION_ARTIFACTS: return createTImplementationArtifacts();
			case ToscaPackage.TIMPORT: return createTImport();
			case ToscaPackage.TINTERFACE: return createTInterface();
			case ToscaPackage.TNODE_TEMPLATE: return createTNodeTemplate();
			case ToscaPackage.TNODE_TYPE: return createTNodeType();
			case ToscaPackage.TNODE_TYPE_IMPLEMENTATION: return createTNodeTypeImplementation();
			case ToscaPackage.TOPERATION: return createTOperation();
			case ToscaPackage.TPARAMETER: return createTParameter();
			case ToscaPackage.TPLAN: return createTPlan();
			case ToscaPackage.TPLANS: return createTPlans();
			case ToscaPackage.TPOLICY: return createTPolicy();
			case ToscaPackage.TPOLICY_TEMPLATE: return createTPolicyTemplate();
			case ToscaPackage.TPOLICY_TYPE: return createTPolicyType();
			case ToscaPackage.TPROPERTY_CONSTRAINT: return createTPropertyConstraint();
			case ToscaPackage.TPROPERTY_MAPPING: return createTPropertyMapping();
			case ToscaPackage.TRELATIONSHIP_TEMPLATE: return createTRelationshipTemplate();
			case ToscaPackage.TRELATIONSHIP_TYPE: return createTRelationshipType();
			case ToscaPackage.TRELATIONSHIP_TYPE_IMPLEMENTATION: return createTRelationshipTypeImplementation();
			case ToscaPackage.TREQUIRED_CONTAINER_FEATURE: return createTRequiredContainerFeature();
			case ToscaPackage.TREQUIRED_CONTAINER_FEATURES: return createTRequiredContainerFeatures();
			case ToscaPackage.TREQUIREMENT: return createTRequirement();
			case ToscaPackage.TREQUIREMENT_DEFINITION: return createTRequirementDefinition();
			case ToscaPackage.TREQUIREMENT_REF: return createTRequirementRef();
			case ToscaPackage.TREQUIREMENT_TYPE: return createTRequirementType();
			case ToscaPackage.TSERVICE_TEMPLATE: return createTServiceTemplate();
			case ToscaPackage.TTAG: return createTTag();
			case ToscaPackage.TTAGS: return createTTags();
			case ToscaPackage.TTOPOLOGY_ELEMENT_INSTANCE_STATES: return createTTopologyElementInstanceStates();
			case ToscaPackage.TTOPOLOGY_TEMPLATE: return createTTopologyTemplate();
			case ToscaPackage.TYPES_TYPE: return createTypesType();
			case ToscaPackage.VALID_SOURCE_TYPE: return createValidSourceType();
			case ToscaPackage.VALID_TARGET_TYPE: return createValidTargetType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ToscaPackage.MAX_INSTANCES_TYPE_MEMBER1:
				return createMaxInstancesTypeMember1FromString(eDataType, initialValue);
			case ToscaPackage.TBOOLEAN:
				return createTBooleanFromString(eDataType, initialValue);
			case ToscaPackage.UPPER_BOUND_TYPE_MEMBER1:
				return createUpperBoundTypeMember1FromString(eDataType, initialValue);
			case ToscaPackage.UPPER_BOUND_TYPE_MEMBER11:
				return createUpperBoundTypeMember11FromString(eDataType, initialValue);
			case ToscaPackage.IMPORTED_URI:
				return createImportedURIFromString(eDataType, initialValue);
			case ToscaPackage.MAX_INSTANCES_TYPE:
				return createMaxInstancesTypeFromString(eDataType, initialValue);
			case ToscaPackage.MAX_INSTANCES_TYPE_MEMBER0:
				return createMaxInstancesTypeMember0FromString(eDataType, initialValue);
			case ToscaPackage.MAX_INSTANCES_TYPE_MEMBER1_OBJECT:
				return createMaxInstancesTypeMember1ObjectFromString(eDataType, initialValue);
			case ToscaPackage.TBOOLEAN_OBJECT:
				return createTBooleanObjectFromString(eDataType, initialValue);
			case ToscaPackage.UPPER_BOUND_TYPE:
				return createUpperBoundTypeFromString(eDataType, initialValue);
			case ToscaPackage.UPPER_BOUND_TYPE1:
				return createUpperBoundType1FromString(eDataType, initialValue);
			case ToscaPackage.UPPER_BOUND_TYPE_MEMBER0:
				return createUpperBoundTypeMember0FromString(eDataType, initialValue);
			case ToscaPackage.UPPER_BOUND_TYPE_MEMBER01:
				return createUpperBoundTypeMember01FromString(eDataType, initialValue);
			case ToscaPackage.UPPER_BOUND_TYPE_MEMBER1_OBJECT:
				return createUpperBoundTypeMember1ObjectFromString(eDataType, initialValue);
			case ToscaPackage.UPPER_BOUND_TYPE_MEMBER1_OBJECT1:
				return createUpperBoundTypeMember1Object1FromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ToscaPackage.MAX_INSTANCES_TYPE_MEMBER1:
				return convertMaxInstancesTypeMember1ToString(eDataType, instanceValue);
			case ToscaPackage.TBOOLEAN:
				return convertTBooleanToString(eDataType, instanceValue);
			case ToscaPackage.UPPER_BOUND_TYPE_MEMBER1:
				return convertUpperBoundTypeMember1ToString(eDataType, instanceValue);
			case ToscaPackage.UPPER_BOUND_TYPE_MEMBER11:
				return convertUpperBoundTypeMember11ToString(eDataType, instanceValue);
			case ToscaPackage.IMPORTED_URI:
				return convertImportedURIToString(eDataType, instanceValue);
			case ToscaPackage.MAX_INSTANCES_TYPE:
				return convertMaxInstancesTypeToString(eDataType, instanceValue);
			case ToscaPackage.MAX_INSTANCES_TYPE_MEMBER0:
				return convertMaxInstancesTypeMember0ToString(eDataType, instanceValue);
			case ToscaPackage.MAX_INSTANCES_TYPE_MEMBER1_OBJECT:
				return convertMaxInstancesTypeMember1ObjectToString(eDataType, instanceValue);
			case ToscaPackage.TBOOLEAN_OBJECT:
				return convertTBooleanObjectToString(eDataType, instanceValue);
			case ToscaPackage.UPPER_BOUND_TYPE:
				return convertUpperBoundTypeToString(eDataType, instanceValue);
			case ToscaPackage.UPPER_BOUND_TYPE1:
				return convertUpperBoundType1ToString(eDataType, instanceValue);
			case ToscaPackage.UPPER_BOUND_TYPE_MEMBER0:
				return convertUpperBoundTypeMember0ToString(eDataType, instanceValue);
			case ToscaPackage.UPPER_BOUND_TYPE_MEMBER01:
				return convertUpperBoundTypeMember01ToString(eDataType, instanceValue);
			case ToscaPackage.UPPER_BOUND_TYPE_MEMBER1_OBJECT:
				return convertUpperBoundTypeMember1ObjectToString(eDataType, instanceValue);
			case ToscaPackage.UPPER_BOUND_TYPE_MEMBER1_OBJECT1:
				return convertUpperBoundTypeMember1Object1ToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactReferencesType createArtifactReferencesType() {
		ArtifactReferencesTypeImpl artifactReferencesType = new ArtifactReferencesTypeImpl();
		return artifactReferencesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilitiesType_TCapability createCapabilitiesType_TCapability() {
		CapabilitiesType_TCapabilityImpl capabilitiesType_TCapability = new CapabilitiesType_TCapabilityImpl();
		return capabilitiesType_TCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilitiesType_CapabilityRef createCapabilitiesType_CapabilityRef() {
		CapabilitiesType_CapabilityRefImpl capabilitiesType_CapabilityRef = new CapabilitiesType_CapabilityRefImpl();
		return capabilitiesType_CapabilityRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityDefinitionsType createCapabilityDefinitionsType() {
		CapabilityDefinitionsTypeImpl capabilityDefinitionsType = new CapabilityDefinitionsTypeImpl();
		return capabilityDefinitionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintsType createConstraintsType() {
		ConstraintsTypeImpl constraintsType = new ConstraintsTypeImpl();
		return constraintsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinitionsType createDefinitionsType() {
		DefinitionsTypeImpl definitionsType = new DefinitionsTypeImpl();
		return definitionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedFromType createDerivedFromType() {
		DerivedFromTypeImpl derivedFromType = new DerivedFromTypeImpl();
		return derivedFromType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExcludeType createExcludeType() {
		ExcludeTypeImpl excludeType = new ExcludeTypeImpl();
		return excludeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionsType createExtensionsType() {
		ExtensionsTypeImpl extensionsType = new ExtensionsTypeImpl();
		return extensionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationArtifactType createImplementationArtifactType() {
		ImplementationArtifactTypeImpl implementationArtifactType = new ImplementationArtifactTypeImpl();
		return implementationArtifactType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncludeType createIncludeType() {
		IncludeTypeImpl includeType = new IncludeTypeImpl();
		return includeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputParametersType createInputParametersType() {
		InputParametersTypeImpl inputParametersType = new InputParametersTypeImpl();
		return inputParametersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceStateType createInstanceStateType() {
		InstanceStateTypeImpl instanceStateType = new InstanceStateTypeImpl();
		return instanceStateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfacesType_TInterface createInterfacesType_TInterface() {
		InterfacesType_TInterfaceImpl interfacesType_TInterface = new InterfacesType_TInterfaceImpl();
		return interfacesType_TInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfacesType_TExportedInterface createInterfacesType_TExportedInterface() {
		InterfacesType_TExportedInterfaceImpl interfacesType_TExportedInterface = new InterfacesType_TExportedInterfaceImpl();
		return interfacesType_TExportedInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeOperationType createNodeOperationType() {
		NodeOperationTypeImpl nodeOperationType = new NodeOperationTypeImpl();
		return nodeOperationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeTypeReferenceType createNodeTypeReferenceType() {
		NodeTypeReferenceTypeImpl nodeTypeReferenceType = new NodeTypeReferenceTypeImpl();
		return nodeTypeReferenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputParametersType createOutputParametersType() {
		OutputParametersTypeImpl outputParametersType = new OutputParametersTypeImpl();
		return outputParametersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanModelReferenceType createPlanModelReferenceType() {
		PlanModelReferenceTypeImpl planModelReferenceType = new PlanModelReferenceTypeImpl();
		return planModelReferenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanModelType createPlanModelType() {
		PlanModelTypeImpl planModelType = new PlanModelTypeImpl();
		return planModelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanType createPlanType() {
		PlanTypeImpl planType = new PlanTypeImpl();
		return planType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoliciesType createPoliciesType() {
		PoliciesTypeImpl policiesType = new PoliciesTypeImpl();
		return policiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesDefinitionType createPropertiesDefinitionType() {
		PropertiesDefinitionTypeImpl propertiesDefinitionType = new PropertiesDefinitionTypeImpl();
		return propertiesDefinitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesType createPropertiesType() {
		PropertiesTypeImpl propertiesType = new PropertiesTypeImpl();
		return propertiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesTypeWithPropertyMappings createPropertiesTypeWithPropertyMappings() {
		PropertiesTypeWithPropertyMappingsImpl propertiesTypeWithPropertyMappings = new PropertiesTypeWithPropertyMappingsImpl();
		return propertiesTypeWithPropertyMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyConstraintsType createPropertyConstraintsType() {
		PropertyConstraintsTypeImpl propertyConstraintsType = new PropertyConstraintsTypeImpl();
		return propertyConstraintsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyMappingsType createPropertyMappingsType() {
		PropertyMappingsTypeImpl propertyMappingsType = new PropertyMappingsTypeImpl();
		return propertyMappingsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipConstraintsType createRelationshipConstraintsType() {
		RelationshipConstraintsTypeImpl relationshipConstraintsType = new RelationshipConstraintsTypeImpl();
		return relationshipConstraintsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipConstraintType createRelationshipConstraintType() {
		RelationshipConstraintTypeImpl relationshipConstraintType = new RelationshipConstraintTypeImpl();
		return relationshipConstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipOperationType createRelationshipOperationType() {
		RelationshipOperationTypeImpl relationshipOperationType = new RelationshipOperationTypeImpl();
		return relationshipOperationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementDefinitionsType createRequirementDefinitionsType() {
		RequirementDefinitionsTypeImpl requirementDefinitionsType = new RequirementDefinitionsTypeImpl();
		return requirementDefinitionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementsType_TRequirement createRequirementsType_TRequirement() {
		RequirementsType_TRequirementImpl requirementsType_TRequirement = new RequirementsType_TRequirementImpl();
		return requirementsType_TRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementsType_TRequirementRef createRequirementsType_TRequirementRef() {
		RequirementsType_TRequirementRefImpl requirementsType_TRequirementRef = new RequirementsType_TRequirementRefImpl();
		return requirementsType_TRequirementRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceElementType createSourceElementType() {
		SourceElementTypeImpl sourceElementType = new SourceElementTypeImpl();
		return sourceElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceInterfacesType createSourceInterfacesType() {
		SourceInterfacesTypeImpl sourceInterfacesType = new SourceInterfacesTypeImpl();
		return sourceInterfacesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAppliesTo createTAppliesTo() {
		TAppliesToImpl tAppliesTo = new TAppliesToImpl();
		return tAppliesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetElementType createTargetElementType() {
		TargetElementTypeImpl targetElementType = new TargetElementTypeImpl();
		return targetElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetInterfacesType createTargetInterfacesType() {
		TargetInterfacesTypeImpl targetInterfacesType = new TargetInterfacesTypeImpl();
		return targetInterfacesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TArtifactReference createTArtifactReference() {
		TArtifactReferenceImpl tArtifactReference = new TArtifactReferenceImpl();
		return tArtifactReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TArtifactTemplate createTArtifactTemplate() {
		TArtifactTemplateImpl tArtifactTemplate = new TArtifactTemplateImpl();
		return tArtifactTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TArtifactType createTArtifactType() {
		TArtifactTypeImpl tArtifactType = new TArtifactTypeImpl();
		return tArtifactType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TBoundaryDefinitions createTBoundaryDefinitions() {
		TBoundaryDefinitionsImpl tBoundaryDefinitions = new TBoundaryDefinitionsImpl();
		return tBoundaryDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCapability createTCapability() {
		TCapabilityImpl tCapability = new TCapabilityImpl();
		return tCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCapabilityDefinition createTCapabilityDefinition() {
		TCapabilityDefinitionImpl tCapabilityDefinition = new TCapabilityDefinitionImpl();
		return tCapabilityDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCapabilityRef createTCapabilityRef() {
		TCapabilityRefImpl tCapabilityRef = new TCapabilityRefImpl();
		return tCapabilityRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCapabilityType createTCapabilityType() {
		TCapabilityTypeImpl tCapabilityType = new TCapabilityTypeImpl();
		return tCapabilityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCondition createTCondition() {
		TConditionImpl tCondition = new TConditionImpl();
		return tCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TConstraint createTConstraint() {
		TConstraintImpl tConstraint = new TConstraintImpl();
		return tConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDefinitions createTDefinitions() {
		TDefinitionsImpl tDefinitions = new TDefinitionsImpl();
		return tDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDeploymentArtifact createTDeploymentArtifact() {
		TDeploymentArtifactImpl tDeploymentArtifact = new TDeploymentArtifactImpl();
		return tDeploymentArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDeploymentArtifacts createTDeploymentArtifacts() {
		TDeploymentArtifactsImpl tDeploymentArtifacts = new TDeploymentArtifactsImpl();
		return tDeploymentArtifacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDocumentation createTDocumentation() {
		TDocumentationImpl tDocumentation = new TDocumentationImpl();
		return tDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TExportedInterface createTExportedInterface() {
		TExportedInterfaceImpl tExportedInterface = new TExportedInterfaceImpl();
		return tExportedInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TExportedOperation createTExportedOperation() {
		TExportedOperationImpl tExportedOperation = new TExportedOperationImpl();
		return tExportedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TExtensibleElements createTExtensibleElements() {
		TExtensibleElementsImpl tExtensibleElements = new TExtensibleElementsImpl();
		return tExtensibleElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TExtension createTExtension() {
		TExtensionImpl tExtension = new TExtensionImpl();
		return tExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TExtensions createTExtensions() {
		TExtensionsImpl tExtensions = new TExtensionsImpl();
		return tExtensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TImplementationArtifact createTImplementationArtifact() {
		TImplementationArtifactImpl tImplementationArtifact = new TImplementationArtifactImpl();
		return tImplementationArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TImplementationArtifacts createTImplementationArtifacts() {
		TImplementationArtifactsImpl tImplementationArtifacts = new TImplementationArtifactsImpl();
		return tImplementationArtifacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TImport createTImport() {
		TImportImpl tImport = new TImportImpl();
		return tImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TInterface createTInterface() {
		TInterfaceImpl tInterface = new TInterfaceImpl();
		return tInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TNodeTemplate createTNodeTemplate() {
		TNodeTemplateImpl tNodeTemplate = new TNodeTemplateImpl();
		return tNodeTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TNodeType createTNodeType() {
		TNodeTypeImpl tNodeType = new TNodeTypeImpl();
		return tNodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TNodeTypeImplementation createTNodeTypeImplementation() {
		TNodeTypeImplementationImpl tNodeTypeImplementation = new TNodeTypeImplementationImpl();
		return tNodeTypeImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TOperation createTOperation() {
		TOperationImpl tOperation = new TOperationImpl();
		return tOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TParameter createTParameter() {
		TParameterImpl tParameter = new TParameterImpl();
		return tParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPlan createTPlan() {
		TPlanImpl tPlan = new TPlanImpl();
		return tPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPlans createTPlans() {
		TPlansImpl tPlans = new TPlansImpl();
		return tPlans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPolicy createTPolicy() {
		TPolicyImpl tPolicy = new TPolicyImpl();
		return tPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPolicyTemplate createTPolicyTemplate() {
		TPolicyTemplateImpl tPolicyTemplate = new TPolicyTemplateImpl();
		return tPolicyTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPolicyType createTPolicyType() {
		TPolicyTypeImpl tPolicyType = new TPolicyTypeImpl();
		return tPolicyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPropertyConstraint createTPropertyConstraint() {
		TPropertyConstraintImpl tPropertyConstraint = new TPropertyConstraintImpl();
		return tPropertyConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPropertyMapping createTPropertyMapping() {
		TPropertyMappingImpl tPropertyMapping = new TPropertyMappingImpl();
		return tPropertyMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRelationshipTemplate createTRelationshipTemplate() {
		TRelationshipTemplateImpl tRelationshipTemplate = new TRelationshipTemplateImpl();
		return tRelationshipTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRelationshipType createTRelationshipType() {
		TRelationshipTypeImpl tRelationshipType = new TRelationshipTypeImpl();
		return tRelationshipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRelationshipTypeImplementation createTRelationshipTypeImplementation() {
		TRelationshipTypeImplementationImpl tRelationshipTypeImplementation = new TRelationshipTypeImplementationImpl();
		return tRelationshipTypeImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRequiredContainerFeature createTRequiredContainerFeature() {
		TRequiredContainerFeatureImpl tRequiredContainerFeature = new TRequiredContainerFeatureImpl();
		return tRequiredContainerFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRequiredContainerFeatures createTRequiredContainerFeatures() {
		TRequiredContainerFeaturesImpl tRequiredContainerFeatures = new TRequiredContainerFeaturesImpl();
		return tRequiredContainerFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRequirement createTRequirement() {
		TRequirementImpl tRequirement = new TRequirementImpl();
		return tRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRequirementDefinition createTRequirementDefinition() {
		TRequirementDefinitionImpl tRequirementDefinition = new TRequirementDefinitionImpl();
		return tRequirementDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRequirementRef createTRequirementRef() {
		TRequirementRefImpl tRequirementRef = new TRequirementRefImpl();
		return tRequirementRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRequirementType createTRequirementType() {
		TRequirementTypeImpl tRequirementType = new TRequirementTypeImpl();
		return tRequirementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TServiceTemplate createTServiceTemplate() {
		TServiceTemplateImpl tServiceTemplate = new TServiceTemplateImpl();
		return tServiceTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTag createTTag() {
		TTagImpl tTag = new TTagImpl();
		return tTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTags createTTags() {
		TTagsImpl tTags = new TTagsImpl();
		return tTags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTopologyElementInstanceStates createTTopologyElementInstanceStates() {
		TTopologyElementInstanceStatesImpl tTopologyElementInstanceStates = new TTopologyElementInstanceStatesImpl();
		return tTopologyElementInstanceStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTopologyTemplate createTTopologyTemplate() {
		TTopologyTemplateImpl tTopologyTemplate = new TTopologyTemplateImpl();
		return tTopologyTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesType createTypesType() {
		TypesTypeImpl typesType = new TypesTypeImpl();
		return typesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidSourceType createValidSourceType() {
		ValidSourceTypeImpl validSourceType = new ValidSourceTypeImpl();
		return validSourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidTargetType createValidTargetType() {
		ValidTargetTypeImpl validTargetType = new ValidTargetTypeImpl();
		return validTargetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaxInstancesTypeMember1 createMaxInstancesTypeMember1FromString(EDataType eDataType, String initialValue) {
		MaxInstancesTypeMember1 result = MaxInstancesTypeMember1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMaxInstancesTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TBoolean createTBooleanFromString(EDataType eDataType, String initialValue) {
		TBoolean result = TBoolean.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTBooleanToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpperBoundTypeMember1 createUpperBoundTypeMember1FromString(EDataType eDataType, String initialValue) {
		UpperBoundTypeMember1 result = UpperBoundTypeMember1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUpperBoundTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpperBoundTypeMember11 createUpperBoundTypeMember11FromString(EDataType eDataType, String initialValue) {
		UpperBoundTypeMember11 result = UpperBoundTypeMember11.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUpperBoundTypeMember11ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createImportedURIFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImportedURIToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createMaxInstancesTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createMaxInstancesTypeMember0FromString(ToscaPackage.Literals.MAX_INSTANCES_TYPE_MEMBER0, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createMaxInstancesTypeMember1FromString(ToscaPackage.Literals.MAX_INSTANCES_TYPE_MEMBER1, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMaxInstancesTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (ToscaPackage.Literals.MAX_INSTANCES_TYPE_MEMBER0.isInstance(instanceValue)) {
			try {
				String value = convertMaxInstancesTypeMember0ToString(ToscaPackage.Literals.MAX_INSTANCES_TYPE_MEMBER0, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (ToscaPackage.Literals.MAX_INSTANCES_TYPE_MEMBER1.isInstance(instanceValue)) {
			try {
				String value = convertMaxInstancesTypeMember1ToString(ToscaPackage.Literals.MAX_INSTANCES_TYPE_MEMBER1, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createMaxInstancesTypeMember0FromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMaxInstancesTypeMember0ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaxInstancesTypeMember1 createMaxInstancesTypeMember1ObjectFromString(EDataType eDataType, String initialValue) {
		return createMaxInstancesTypeMember1FromString(ToscaPackage.Literals.MAX_INSTANCES_TYPE_MEMBER1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMaxInstancesTypeMember1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMaxInstancesTypeMember1ToString(ToscaPackage.Literals.MAX_INSTANCES_TYPE_MEMBER1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TBoolean createTBooleanObjectFromString(EDataType eDataType, String initialValue) {
		return createTBooleanFromString(ToscaPackage.Literals.TBOOLEAN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTBooleanObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTBooleanToString(ToscaPackage.Literals.TBOOLEAN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createUpperBoundTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createUpperBoundTypeMember0FromString(ToscaPackage.Literals.UPPER_BOUND_TYPE_MEMBER0, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createUpperBoundTypeMember1FromString(ToscaPackage.Literals.UPPER_BOUND_TYPE_MEMBER1, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUpperBoundTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (ToscaPackage.Literals.UPPER_BOUND_TYPE_MEMBER0.isInstance(instanceValue)) {
			try {
				String value = convertUpperBoundTypeMember0ToString(ToscaPackage.Literals.UPPER_BOUND_TYPE_MEMBER0, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (ToscaPackage.Literals.UPPER_BOUND_TYPE_MEMBER1.isInstance(instanceValue)) {
			try {
				String value = convertUpperBoundTypeMember1ToString(ToscaPackage.Literals.UPPER_BOUND_TYPE_MEMBER1, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createUpperBoundType1FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createUpperBoundTypeMember01FromString(ToscaPackage.Literals.UPPER_BOUND_TYPE_MEMBER01, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createUpperBoundTypeMember11FromString(ToscaPackage.Literals.UPPER_BOUND_TYPE_MEMBER11, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUpperBoundType1ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (ToscaPackage.Literals.UPPER_BOUND_TYPE_MEMBER01.isInstance(instanceValue)) {
			try {
				String value = convertUpperBoundTypeMember01ToString(ToscaPackage.Literals.UPPER_BOUND_TYPE_MEMBER01, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (ToscaPackage.Literals.UPPER_BOUND_TYPE_MEMBER11.isInstance(instanceValue)) {
			try {
				String value = convertUpperBoundTypeMember11ToString(ToscaPackage.Literals.UPPER_BOUND_TYPE_MEMBER11, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createUpperBoundTypeMember0FromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUpperBoundTypeMember0ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createUpperBoundTypeMember01FromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUpperBoundTypeMember01ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpperBoundTypeMember1 createUpperBoundTypeMember1ObjectFromString(EDataType eDataType, String initialValue) {
		return createUpperBoundTypeMember1FromString(ToscaPackage.Literals.UPPER_BOUND_TYPE_MEMBER1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUpperBoundTypeMember1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUpperBoundTypeMember1ToString(ToscaPackage.Literals.UPPER_BOUND_TYPE_MEMBER1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpperBoundTypeMember11 createUpperBoundTypeMember1Object1FromString(EDataType eDataType, String initialValue) {
		return createUpperBoundTypeMember11FromString(ToscaPackage.Literals.UPPER_BOUND_TYPE_MEMBER11, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUpperBoundTypeMember1Object1ToString(EDataType eDataType, Object instanceValue) {
		return convertUpperBoundTypeMember11ToString(ToscaPackage.Literals.UPPER_BOUND_TYPE_MEMBER11, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToscaPackage getToscaPackage() {
		return (ToscaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ToscaPackage getPackage() {
		return ToscaPackage.eINSTANCE;
	}

} //ToscaFactoryImpl
