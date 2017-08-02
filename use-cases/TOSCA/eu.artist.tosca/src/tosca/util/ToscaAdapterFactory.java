/**
 */
package tosca.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import tosca.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see tosca.ToscaPackage
 * @generated
 */
public class ToscaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ToscaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToscaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ToscaPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToscaSwitch<Adapter> modelSwitch =
		new ToscaSwitch<Adapter>() {
			@Override
			public Adapter caseArtifactReferencesType(ArtifactReferencesType object) {
				return createArtifactReferencesTypeAdapter();
			}
			@Override
			public Adapter caseCapabilitiesType_TCapability(CapabilitiesType_TCapability object) {
				return createCapabilitiesType_TCapabilityAdapter();
			}
			@Override
			public Adapter caseCapabilitiesType_CapabilityRef(CapabilitiesType_CapabilityRef object) {
				return createCapabilitiesType_CapabilityRefAdapter();
			}
			@Override
			public Adapter caseCapabilityDefinitionsType(CapabilityDefinitionsType object) {
				return createCapabilityDefinitionsTypeAdapter();
			}
			@Override
			public Adapter caseConstraintsType(ConstraintsType object) {
				return createConstraintsTypeAdapter();
			}
			@Override
			public Adapter caseDefinitionsType(DefinitionsType object) {
				return createDefinitionsTypeAdapter();
			}
			@Override
			public Adapter caseDerivedFromType(DerivedFromType object) {
				return createDerivedFromTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseExcludeType(ExcludeType object) {
				return createExcludeTypeAdapter();
			}
			@Override
			public Adapter caseExtensionsType(ExtensionsType object) {
				return createExtensionsTypeAdapter();
			}
			@Override
			public Adapter caseImplementationArtifactType(ImplementationArtifactType object) {
				return createImplementationArtifactTypeAdapter();
			}
			@Override
			public Adapter caseIncludeType(IncludeType object) {
				return createIncludeTypeAdapter();
			}
			@Override
			public Adapter caseInputParametersType(InputParametersType object) {
				return createInputParametersTypeAdapter();
			}
			@Override
			public Adapter caseInstanceStateType(InstanceStateType object) {
				return createInstanceStateTypeAdapter();
			}
			@Override
			public Adapter caseInterfacesType_TInterface(InterfacesType_TInterface object) {
				return createInterfacesType_TInterfaceAdapter();
			}
			@Override
			public Adapter caseInterfacesType_TExportedInterface(InterfacesType_TExportedInterface object) {
				return createInterfacesType_TExportedInterfaceAdapter();
			}
			@Override
			public Adapter caseNodeOperationType(NodeOperationType object) {
				return createNodeOperationTypeAdapter();
			}
			@Override
			public Adapter caseNodeTypeReferenceType(NodeTypeReferenceType object) {
				return createNodeTypeReferenceTypeAdapter();
			}
			@Override
			public Adapter caseOutputParametersType(OutputParametersType object) {
				return createOutputParametersTypeAdapter();
			}
			@Override
			public Adapter casePlanModelReferenceType(PlanModelReferenceType object) {
				return createPlanModelReferenceTypeAdapter();
			}
			@Override
			public Adapter casePlanModelType(PlanModelType object) {
				return createPlanModelTypeAdapter();
			}
			@Override
			public Adapter casePlanType(PlanType object) {
				return createPlanTypeAdapter();
			}
			@Override
			public Adapter casePoliciesType(PoliciesType object) {
				return createPoliciesTypeAdapter();
			}
			@Override
			public Adapter casePropertiesDefinitionType(PropertiesDefinitionType object) {
				return createPropertiesDefinitionTypeAdapter();
			}
			@Override
			public Adapter casePropertiesType(PropertiesType object) {
				return createPropertiesTypeAdapter();
			}
			@Override
			public Adapter casePropertiesTypeWithPropertyMappings(PropertiesTypeWithPropertyMappings object) {
				return createPropertiesTypeWithPropertyMappingsAdapter();
			}
			@Override
			public Adapter casePropertyConstraintsType(PropertyConstraintsType object) {
				return createPropertyConstraintsTypeAdapter();
			}
			@Override
			public Adapter casePropertyMappingsType(PropertyMappingsType object) {
				return createPropertyMappingsTypeAdapter();
			}
			@Override
			public Adapter caseRelationshipConstraintsType(RelationshipConstraintsType object) {
				return createRelationshipConstraintsTypeAdapter();
			}
			@Override
			public Adapter caseRelationshipConstraintType(RelationshipConstraintType object) {
				return createRelationshipConstraintTypeAdapter();
			}
			@Override
			public Adapter caseRelationshipOperationType(RelationshipOperationType object) {
				return createRelationshipOperationTypeAdapter();
			}
			@Override
			public Adapter caseRequirementDefinitionsType(RequirementDefinitionsType object) {
				return createRequirementDefinitionsTypeAdapter();
			}
			@Override
			public Adapter caseRequirementsType_TRequirement(RequirementsType_TRequirement object) {
				return createRequirementsType_TRequirementAdapter();
			}
			@Override
			public Adapter caseRequirementsType_TRequirementRef(RequirementsType_TRequirementRef object) {
				return createRequirementsType_TRequirementRefAdapter();
			}
			@Override
			public Adapter caseSourceElementType(SourceElementType object) {
				return createSourceElementTypeAdapter();
			}
			@Override
			public Adapter caseSourceInterfacesType(SourceInterfacesType object) {
				return createSourceInterfacesTypeAdapter();
			}
			@Override
			public Adapter caseTAppliesTo(TAppliesTo object) {
				return createTAppliesToAdapter();
			}
			@Override
			public Adapter caseTargetElementType(TargetElementType object) {
				return createTargetElementTypeAdapter();
			}
			@Override
			public Adapter caseTargetInterfacesType(TargetInterfacesType object) {
				return createTargetInterfacesTypeAdapter();
			}
			@Override
			public Adapter caseTArtifactReference(TArtifactReference object) {
				return createTArtifactReferenceAdapter();
			}
			@Override
			public Adapter caseTArtifactTemplate(TArtifactTemplate object) {
				return createTArtifactTemplateAdapter();
			}
			@Override
			public Adapter caseTArtifactType(TArtifactType object) {
				return createTArtifactTypeAdapter();
			}
			@Override
			public Adapter caseTBoundaryDefinitions(TBoundaryDefinitions object) {
				return createTBoundaryDefinitionsAdapter();
			}
			@Override
			public Adapter caseTCapability(TCapability object) {
				return createTCapabilityAdapter();
			}
			@Override
			public Adapter caseTCapabilityDefinition(TCapabilityDefinition object) {
				return createTCapabilityDefinitionAdapter();
			}
			@Override
			public Adapter caseTCapabilityRef(TCapabilityRef object) {
				return createTCapabilityRefAdapter();
			}
			@Override
			public Adapter caseTCapabilityType(TCapabilityType object) {
				return createTCapabilityTypeAdapter();
			}
			@Override
			public Adapter caseTCondition(TCondition object) {
				return createTConditionAdapter();
			}
			@Override
			public Adapter caseTConstraint(TConstraint object) {
				return createTConstraintAdapter();
			}
			@Override
			public Adapter caseTDefinitions(TDefinitions object) {
				return createTDefinitionsAdapter();
			}
			@Override
			public Adapter caseTDeploymentArtifact(TDeploymentArtifact object) {
				return createTDeploymentArtifactAdapter();
			}
			@Override
			public Adapter caseTDeploymentArtifacts(TDeploymentArtifacts object) {
				return createTDeploymentArtifactsAdapter();
			}
			@Override
			public Adapter caseTDocumentation(TDocumentation object) {
				return createTDocumentationAdapter();
			}
			@Override
			public Adapter caseTEntityTemplate(TEntityTemplate object) {
				return createTEntityTemplateAdapter();
			}
			@Override
			public Adapter caseTEntityType(TEntityType object) {
				return createTEntityTypeAdapter();
			}
			@Override
			public Adapter caseTExportedInterface(TExportedInterface object) {
				return createTExportedInterfaceAdapter();
			}
			@Override
			public Adapter caseTExportedOperation(TExportedOperation object) {
				return createTExportedOperationAdapter();
			}
			@Override
			public Adapter caseTExtensibleElements(TExtensibleElements object) {
				return createTExtensibleElementsAdapter();
			}
			@Override
			public Adapter caseTExtension(TExtension object) {
				return createTExtensionAdapter();
			}
			@Override
			public Adapter caseTExtensions(TExtensions object) {
				return createTExtensionsAdapter();
			}
			@Override
			public Adapter caseTImplementationArtifact(TImplementationArtifact object) {
				return createTImplementationArtifactAdapter();
			}
			@Override
			public Adapter caseTImplementationArtifacts(TImplementationArtifacts object) {
				return createTImplementationArtifactsAdapter();
			}
			@Override
			public Adapter caseTImport(TImport object) {
				return createTImportAdapter();
			}
			@Override
			public Adapter caseTInterface(TInterface object) {
				return createTInterfaceAdapter();
			}
			@Override
			public Adapter caseTNodeTemplate(TNodeTemplate object) {
				return createTNodeTemplateAdapter();
			}
			@Override
			public Adapter caseTNodeType(TNodeType object) {
				return createTNodeTypeAdapter();
			}
			@Override
			public Adapter caseTNodeTypeImplementation(TNodeTypeImplementation object) {
				return createTNodeTypeImplementationAdapter();
			}
			@Override
			public Adapter caseTOperation(TOperation object) {
				return createTOperationAdapter();
			}
			@Override
			public Adapter caseTParameter(TParameter object) {
				return createTParameterAdapter();
			}
			@Override
			public Adapter caseTPlan(TPlan object) {
				return createTPlanAdapter();
			}
			@Override
			public Adapter caseTPlans(TPlans object) {
				return createTPlansAdapter();
			}
			@Override
			public Adapter caseTPolicy(TPolicy object) {
				return createTPolicyAdapter();
			}
			@Override
			public Adapter caseTPolicyTemplate(TPolicyTemplate object) {
				return createTPolicyTemplateAdapter();
			}
			@Override
			public Adapter caseTPolicyType(TPolicyType object) {
				return createTPolicyTypeAdapter();
			}
			@Override
			public Adapter caseTPropertyConstraint(TPropertyConstraint object) {
				return createTPropertyConstraintAdapter();
			}
			@Override
			public Adapter caseTPropertyMapping(TPropertyMapping object) {
				return createTPropertyMappingAdapter();
			}
			@Override
			public Adapter caseTRelationshipTemplate(TRelationshipTemplate object) {
				return createTRelationshipTemplateAdapter();
			}
			@Override
			public Adapter caseTRelationshipType(TRelationshipType object) {
				return createTRelationshipTypeAdapter();
			}
			@Override
			public Adapter caseTRelationshipTypeImplementation(TRelationshipTypeImplementation object) {
				return createTRelationshipTypeImplementationAdapter();
			}
			@Override
			public Adapter caseTRequiredContainerFeature(TRequiredContainerFeature object) {
				return createTRequiredContainerFeatureAdapter();
			}
			@Override
			public Adapter caseTRequiredContainerFeatures(TRequiredContainerFeatures object) {
				return createTRequiredContainerFeaturesAdapter();
			}
			@Override
			public Adapter caseTRequirement(TRequirement object) {
				return createTRequirementAdapter();
			}
			@Override
			public Adapter caseTRequirementDefinition(TRequirementDefinition object) {
				return createTRequirementDefinitionAdapter();
			}
			@Override
			public Adapter caseTRequirementRef(TRequirementRef object) {
				return createTRequirementRefAdapter();
			}
			@Override
			public Adapter caseTRequirementType(TRequirementType object) {
				return createTRequirementTypeAdapter();
			}
			@Override
			public Adapter caseTServiceTemplate(TServiceTemplate object) {
				return createTServiceTemplateAdapter();
			}
			@Override
			public Adapter caseTTag(TTag object) {
				return createTTagAdapter();
			}
			@Override
			public Adapter caseTTags(TTags object) {
				return createTTagsAdapter();
			}
			@Override
			public Adapter caseTTopologyElementInstanceStates(TTopologyElementInstanceStates object) {
				return createTTopologyElementInstanceStatesAdapter();
			}
			@Override
			public Adapter caseTTopologyTemplate(TTopologyTemplate object) {
				return createTTopologyTemplateAdapter();
			}
			@Override
			public Adapter caseTypesType(TypesType object) {
				return createTypesTypeAdapter();
			}
			@Override
			public Adapter caseValidSourceType(ValidSourceType object) {
				return createValidSourceTypeAdapter();
			}
			@Override
			public Adapter caseValidTargetType(ValidTargetType object) {
				return createValidTargetTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link tosca.ArtifactReferencesType <em>Artifact References Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.ArtifactReferencesType
	 * @generated
	 */
	public Adapter createArtifactReferencesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.CapabilitiesType_TCapability <em>Capabilities Type TCapability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.CapabilitiesType_TCapability
	 * @generated
	 */
	public Adapter createCapabilitiesType_TCapabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.CapabilitiesType_CapabilityRef <em>Capabilities Type Capability Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.CapabilitiesType_CapabilityRef
	 * @generated
	 */
	public Adapter createCapabilitiesType_CapabilityRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.CapabilityDefinitionsType <em>Capability Definitions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.CapabilityDefinitionsType
	 * @generated
	 */
	public Adapter createCapabilityDefinitionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.ConstraintsType <em>Constraints Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.ConstraintsType
	 * @generated
	 */
	public Adapter createConstraintsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.DefinitionsType <em>Definitions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.DefinitionsType
	 * @generated
	 */
	public Adapter createDefinitionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.DerivedFromType <em>Derived From Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.DerivedFromType
	 * @generated
	 */
	public Adapter createDerivedFromTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.ExcludeType <em>Exclude Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.ExcludeType
	 * @generated
	 */
	public Adapter createExcludeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.ExtensionsType <em>Extensions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.ExtensionsType
	 * @generated
	 */
	public Adapter createExtensionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.ImplementationArtifactType <em>Implementation Artifact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.ImplementationArtifactType
	 * @generated
	 */
	public Adapter createImplementationArtifactTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.IncludeType <em>Include Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.IncludeType
	 * @generated
	 */
	public Adapter createIncludeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.InputParametersType <em>Input Parameters Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.InputParametersType
	 * @generated
	 */
	public Adapter createInputParametersTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.InstanceStateType <em>Instance State Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.InstanceStateType
	 * @generated
	 */
	public Adapter createInstanceStateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.InterfacesType_TInterface <em>Interfaces Type TInterface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.InterfacesType_TInterface
	 * @generated
	 */
	public Adapter createInterfacesType_TInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.InterfacesType_TExportedInterface <em>Interfaces Type TExported Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.InterfacesType_TExportedInterface
	 * @generated
	 */
	public Adapter createInterfacesType_TExportedInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.NodeOperationType <em>Node Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.NodeOperationType
	 * @generated
	 */
	public Adapter createNodeOperationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.NodeTypeReferenceType <em>Node Type Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.NodeTypeReferenceType
	 * @generated
	 */
	public Adapter createNodeTypeReferenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.OutputParametersType <em>Output Parameters Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.OutputParametersType
	 * @generated
	 */
	public Adapter createOutputParametersTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.PlanModelReferenceType <em>Plan Model Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.PlanModelReferenceType
	 * @generated
	 */
	public Adapter createPlanModelReferenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.PlanModelType <em>Plan Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.PlanModelType
	 * @generated
	 */
	public Adapter createPlanModelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.PlanType <em>Plan Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.PlanType
	 * @generated
	 */
	public Adapter createPlanTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.PoliciesType <em>Policies Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.PoliciesType
	 * @generated
	 */
	public Adapter createPoliciesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.PropertiesDefinitionType <em>Properties Definition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.PropertiesDefinitionType
	 * @generated
	 */
	public Adapter createPropertiesDefinitionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.PropertiesType <em>Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.PropertiesType
	 * @generated
	 */
	public Adapter createPropertiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.PropertiesTypeWithPropertyMappings <em>Properties Type With Property Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.PropertiesTypeWithPropertyMappings
	 * @generated
	 */
	public Adapter createPropertiesTypeWithPropertyMappingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.PropertyConstraintsType <em>Property Constraints Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.PropertyConstraintsType
	 * @generated
	 */
	public Adapter createPropertyConstraintsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.PropertyMappingsType <em>Property Mappings Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.PropertyMappingsType
	 * @generated
	 */
	public Adapter createPropertyMappingsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.RelationshipConstraintsType <em>Relationship Constraints Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.RelationshipConstraintsType
	 * @generated
	 */
	public Adapter createRelationshipConstraintsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.RelationshipConstraintType <em>Relationship Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.RelationshipConstraintType
	 * @generated
	 */
	public Adapter createRelationshipConstraintTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.RelationshipOperationType <em>Relationship Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.RelationshipOperationType
	 * @generated
	 */
	public Adapter createRelationshipOperationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.RequirementDefinitionsType <em>Requirement Definitions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.RequirementDefinitionsType
	 * @generated
	 */
	public Adapter createRequirementDefinitionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.RequirementsType_TRequirement <em>Requirements Type TRequirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.RequirementsType_TRequirement
	 * @generated
	 */
	public Adapter createRequirementsType_TRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.RequirementsType_TRequirementRef <em>Requirements Type TRequirement Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.RequirementsType_TRequirementRef
	 * @generated
	 */
	public Adapter createRequirementsType_TRequirementRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.SourceElementType <em>Source Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.SourceElementType
	 * @generated
	 */
	public Adapter createSourceElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.SourceInterfacesType <em>Source Interfaces Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.SourceInterfacesType
	 * @generated
	 */
	public Adapter createSourceInterfacesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.TAppliesTo <em>TApplies To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.TAppliesTo
	 * @generated
	 */
	public Adapter createTAppliesToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.TargetElementType <em>Target Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.TargetElementType
	 * @generated
	 */
	public Adapter createTargetElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.TargetInterfacesType <em>Target Interfaces Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.TargetInterfacesType
	 * @generated
	 */
	public Adapter createTargetInterfacesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.TArtifactReference <em>TArtifact Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.TArtifactReference
	 * @generated
	 */
	public Adapter createTArtifactReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.TArtifactTemplate <em>TArtifact Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.TArtifactTemplate
	 * @generated
	 */
	public Adapter createTArtifactTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.TArtifactType <em>TArtifact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.TArtifactType
	 * @generated
	 */
	public Adapter createTArtifactTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.TBoundaryDefinitions <em>TBoundary Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.TBoundaryDefinitions
	 * @generated
	 */
	public Adapter createTBoundaryDefinitionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.TCapability <em>TCapability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.TCapability
	 * @generated
	 */
	public Adapter createTCapabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.TCapabilityDefinition <em>TCapability Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.TCapabilityDefinition
	 * @generated
	 */
	public Adapter createTCapabilityDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.TCapabilityRef <em>TCapability Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.TCapabilityRef
	 * @generated
	 */
	public Adapter createTCapabilityRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.TCapabilityType <em>TCapability Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.TCapabilityType
	 * @generated
	 */
	public Adapter createTCapabilityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.TCondition <em>TCondition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.TCondition
	 * @generated
	 */
	public Adapter createTConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.TConstraint <em>TConstraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.TConstraint
	 * @generated
	 */
	public Adapter createTConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.TDefinitions <em>TDefinitions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.TDefinitions
	 * @generated
	 */
	public Adapter createTDefinitionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.TDeploymentArtifact <em>TDeployment Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.TDeploymentArtifact
	 * @generated
	 */
	public Adapter createTDeploymentArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.TDeploymentArtifacts <em>TDeployment Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.TDeploymentArtifacts
	 * @generated
	 */
	public Adapter createTDeploymentArtifactsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.TDocumentation <em>TDocumentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.TDocumentation
	 * @generated
	 */
	public Adapter createTDocumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.TEntityTemplate <em>TEntity Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.TEntityTemplate
	 * @generated
	 */
	public Adapter createTEntityTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.TEntityType <em>TEntity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.TEntityType
	 * @generated
	 */
	public Adapter createTEntityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.TExportedInterface <em>TExported Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.TExportedInterface
	 * @generated
	 */
	public Adapter createTExportedInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.TExportedOperation <em>TExported Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.TExportedOperation
	 * @generated
	 */
	public Adapter createTExportedOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.TExtensibleElements <em>TExtensible Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.TExtensibleElements
	 * @generated
	 */
	public Adapter createTExtensibleElementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.TExtension <em>TExtension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.TExtension
	 * @generated
	 */
	public Adapter createTExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.TExtensions <em>TExtensions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.TExtensions
	 * @generated
	 */
	public Adapter createTExtensionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.TImplementationArtifact <em>TImplementation Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.TImplementationArtifact
	 * @generated
	 */
	public Adapter createTImplementationArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.TImplementationArtifacts <em>TImplementation Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.TImplementationArtifacts
	 * @generated
	 */
	public Adapter createTImplementationArtifactsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.TImport <em>TImport</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.TImport
	 * @generated
	 */
	public Adapter createTImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.TInterface <em>TInterface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.TInterface
	 * @generated
	 */
	public Adapter createTInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.TNodeTemplate <em>TNode Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.TNodeTemplate
	 * @generated
	 */
	public Adapter createTNodeTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.TNodeType <em>TNode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.TNodeType
	 * @generated
	 */
	public Adapter createTNodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.TNodeTypeImplementation <em>TNode Type Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.TNodeTypeImplementation
	 * @generated
	 */
	public Adapter createTNodeTypeImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.TOperation <em>TOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.TOperation
	 * @generated
	 */
	public Adapter createTOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.TParameter <em>TParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.TParameter
	 * @generated
	 */
	public Adapter createTParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.TPlan <em>TPlan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.TPlan
	 * @generated
	 */
	public Adapter createTPlanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.TPlans <em>TPlans</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.TPlans
	 * @generated
	 */
	public Adapter createTPlansAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.TPolicy <em>TPolicy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.TPolicy
	 * @generated
	 */
	public Adapter createTPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.TPolicyTemplate <em>TPolicy Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.TPolicyTemplate
	 * @generated
	 */
	public Adapter createTPolicyTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.TPolicyType <em>TPolicy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.TPolicyType
	 * @generated
	 */
	public Adapter createTPolicyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.TPropertyConstraint <em>TProperty Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.TPropertyConstraint
	 * @generated
	 */
	public Adapter createTPropertyConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.TPropertyMapping <em>TProperty Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.TPropertyMapping
	 * @generated
	 */
	public Adapter createTPropertyMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.TRelationshipTemplate <em>TRelationship Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.TRelationshipTemplate
	 * @generated
	 */
	public Adapter createTRelationshipTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.TRelationshipType <em>TRelationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.TRelationshipType
	 * @generated
	 */
	public Adapter createTRelationshipTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.TRelationshipTypeImplementation <em>TRelationship Type Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.TRelationshipTypeImplementation
	 * @generated
	 */
	public Adapter createTRelationshipTypeImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.TRequiredContainerFeature <em>TRequired Container Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.TRequiredContainerFeature
	 * @generated
	 */
	public Adapter createTRequiredContainerFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.TRequiredContainerFeatures <em>TRequired Container Features</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.TRequiredContainerFeatures
	 * @generated
	 */
	public Adapter createTRequiredContainerFeaturesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.TRequirement <em>TRequirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.TRequirement
	 * @generated
	 */
	public Adapter createTRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.TRequirementDefinition <em>TRequirement Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.TRequirementDefinition
	 * @generated
	 */
	public Adapter createTRequirementDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.TRequirementRef <em>TRequirement Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.TRequirementRef
	 * @generated
	 */
	public Adapter createTRequirementRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.TRequirementType <em>TRequirement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.TRequirementType
	 * @generated
	 */
	public Adapter createTRequirementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.TServiceTemplate <em>TService Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.TServiceTemplate
	 * @generated
	 */
	public Adapter createTServiceTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.TTag <em>TTag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.TTag
	 * @generated
	 */
	public Adapter createTTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.TTags <em>TTags</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.TTags
	 * @generated
	 */
	public Adapter createTTagsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.TTopologyElementInstanceStates <em>TTopology Element Instance States</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.TTopologyElementInstanceStates
	 * @generated
	 */
	public Adapter createTTopologyElementInstanceStatesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.TTopologyTemplate <em>TTopology Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.TTopologyTemplate
	 * @generated
	 */
	public Adapter createTTopologyTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.TypesType <em>Types Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.TypesType
	 * @generated
	 */
	public Adapter createTypesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.ValidSourceType <em>Valid Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.ValidSourceType
	 * @generated
	 */
	public Adapter createValidSourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tosca.ValidTargetType <em>Valid Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tosca.ValidTargetType
	 * @generated
	 */
	public Adapter createValidTargetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ToscaAdapterFactory
