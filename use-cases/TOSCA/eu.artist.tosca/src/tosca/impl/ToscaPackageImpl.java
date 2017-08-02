/**
 */
package tosca.impl;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

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
import tosca.MaxInstancesTypeMember1;
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
import tosca.TBoolean;
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
import tosca.TEntityTemplate;
import tosca.TEntityType;
import tosca.TExportedInterface;
import tosca.TExportedOperation;
import tosca.TExtensibleElements;
import tosca.TExtension;
import tosca.TExtensions;
import tosca.TImplementationArtifact;
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
import tosca.ToscaFactory;
import tosca.ToscaPackage;
import tosca.TypesType;
import tosca.UpperBoundTypeMember1;
import tosca.UpperBoundTypeMember11;
import tosca.ValidSourceType;
import tosca.ValidTargetType;

import tosca.util.ToscaValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ToscaPackageImpl extends EPackageImpl implements ToscaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactReferencesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilitiesType_TCapabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilitiesType_CapabilityRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityDefinitionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivedFromTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass excludeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationArtifactTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass includeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputParametersTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceStateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfacesType_TInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfacesType_TExportedInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeOperationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeTypeReferenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputParametersTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planModelReferenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planModelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policiesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertiesDefinitionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertiesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertiesTypeWithPropertyMappingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyConstraintsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyMappingsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipConstraintsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipConstraintTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipOperationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementDefinitionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementsType_TRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementsType_TRequirementRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceElementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceInterfacesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tAppliesToEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetElementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetInterfacesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tArtifactReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tArtifactTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tArtifactTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tBoundaryDefinitionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tCapabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tCapabilityDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tCapabilityRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tCapabilityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tDefinitionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tDeploymentArtifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tDeploymentArtifactsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tDocumentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tEntityTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tEntityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tExportedInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tExportedOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tExtensibleElementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tExtensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tExtensionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tImplementationArtifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tImplementationArtifactsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tNodeTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tNodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tNodeTypeImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tPlanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tPlansEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tPolicyTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tPolicyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tPropertyConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tPropertyMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tRelationshipTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tRelationshipTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tRelationshipTypeImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tRequiredContainerFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tRequiredContainerFeaturesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tRequirementDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tRequirementRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tRequirementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tServiceTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tTagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tTagsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tTopologyElementInstanceStatesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tTopologyTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass validSourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass validTargetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum maxInstancesTypeMember1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tBooleanEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum upperBoundTypeMember1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum upperBoundTypeMember11EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType importedURIEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType maxInstancesTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType maxInstancesTypeMember0EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType maxInstancesTypeMember1ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tBooleanObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType upperBoundTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType upperBoundType1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType upperBoundTypeMember0EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType upperBoundTypeMember01EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType upperBoundTypeMember1ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType upperBoundTypeMember1Object1EDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see tosca.ToscaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ToscaPackageImpl() {
		super(eNS_URI, ToscaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ToscaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ToscaPackage init() {
		if (isInited) return (ToscaPackage)EPackage.Registry.INSTANCE.getEPackage(ToscaPackage.eNS_URI);

		// Obtain or create and register package
		ToscaPackageImpl theToscaPackage = (ToscaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ToscaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ToscaPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theToscaPackage.createPackageContents();

		// Initialize created meta-data
		theToscaPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theToscaPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ToscaValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theToscaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ToscaPackage.eNS_URI, theToscaPackage);
		return theToscaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArtifactReferencesType() {
		return artifactReferencesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifactReferencesType_ArtifactReference() {
		return (EReference)artifactReferencesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapabilitiesType_TCapability() {
		return capabilitiesType_TCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilitiesType_TCapability_Capability() {
		return (EReference)capabilitiesType_TCapabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapabilitiesType_CapabilityRef() {
		return capabilitiesType_CapabilityRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilitiesType_CapabilityRef_Capability() {
		return (EReference)capabilitiesType_CapabilityRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapabilityDefinitionsType() {
		return capabilityDefinitionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityDefinitionsType_CapabilityDefinition() {
		return (EReference)capabilityDefinitionsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintsType() {
		return constraintsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintsType_Constraint() {
		return (EReference)constraintsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinitionsType() {
		return definitionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDerivedFromType() {
		return derivedFromTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDerivedFromType_DerivedFrom() {
		return (EAttribute)derivedFromTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Definitions() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Documentation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExcludeType() {
		return excludeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExcludeType_Pattern() {
		return (EAttribute)excludeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtensionsType() {
		return extensionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtensionsType_Extension() {
		return (EReference)extensionsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementationArtifactType() {
		return implementationArtifactTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIncludeType() {
		return includeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIncludeType_Pattern() {
		return (EAttribute)includeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputParametersType() {
		return inputParametersTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputParametersType_InputParameter() {
		return (EReference)inputParametersTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceStateType() {
		return instanceStateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceStateType_State() {
		return (EAttribute)instanceStateTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfacesType_TInterface() {
		return interfacesType_TInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfacesType_TInterface_Interface() {
		return (EReference)interfacesType_TInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfacesType_TExportedInterface() {
		return interfacesType_TExportedInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfacesType_TExportedInterface_Interface() {
		return (EReference)interfacesType_TExportedInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeOperationType() {
		return nodeOperationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeOperationType_InterfaceName() {
		return (EAttribute)nodeOperationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeOperationType_NodeRef() {
		return (EAttribute)nodeOperationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeOperationType_OperationName() {
		return (EAttribute)nodeOperationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeTypeReferenceType() {
		return nodeTypeReferenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeTypeReferenceType_TypeRef() {
		return (EAttribute)nodeTypeReferenceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputParametersType() {
		return outputParametersTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputParametersType_OutputParameter() {
		return (EReference)outputParametersTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanModelReferenceType() {
		return planModelReferenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlanModelReferenceType_Reference() {
		return (EAttribute)planModelReferenceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanModelType() {
		return planModelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlanModelType_Any() {
		return (EAttribute)planModelTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanType() {
		return planTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlanType_PlanRef() {
		return (EAttribute)planTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPoliciesType() {
		return policiesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPoliciesType_Policy() {
		return (EReference)policiesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertiesDefinitionType() {
		return propertiesDefinitionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertiesDefinitionType_Element() {
		return (EAttribute)propertiesDefinitionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertiesDefinitionType_Type() {
		return (EAttribute)propertiesDefinitionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertiesType() {
		return propertiesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertiesType_Any() {
		return (EAttribute)propertiesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertiesTypeWithPropertyMappings() {
		return propertiesTypeWithPropertyMappingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertiesTypeWithPropertyMappings_Any() {
		return (EAttribute)propertiesTypeWithPropertyMappingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertiesTypeWithPropertyMappings_PropertyMappings() {
		return (EReference)propertiesTypeWithPropertyMappingsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyConstraintsType() {
		return propertyConstraintsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyConstraintsType_PropertyConstraint() {
		return (EReference)propertyConstraintsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyMappingsType() {
		return propertyMappingsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyMappingsType_PropertyMapping() {
		return (EReference)propertyMappingsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationshipConstraintsType() {
		return relationshipConstraintsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationshipConstraintsType_RelationshipConstraint() {
		return (EReference)relationshipConstraintsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationshipConstraintType() {
		return relationshipConstraintTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipConstraintType_Any() {
		return (EAttribute)relationshipConstraintTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipConstraintType_ConstraintType() {
		return (EAttribute)relationshipConstraintTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationshipOperationType() {
		return relationshipOperationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipOperationType_InterfaceName() {
		return (EAttribute)relationshipOperationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipOperationType_OperationName() {
		return (EAttribute)relationshipOperationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipOperationType_RelationshipRef() {
		return (EAttribute)relationshipOperationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirementDefinitionsType() {
		return requirementDefinitionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirementDefinitionsType_RequirementDefinition() {
		return (EReference)requirementDefinitionsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirementsType_TRequirement() {
		return requirementsType_TRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirementsType_TRequirement_Requirement() {
		return (EReference)requirementsType_TRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirementsType_TRequirementRef() {
		return requirementsType_TRequirementRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirementsType_TRequirementRef_Requirement() {
		return (EReference)requirementsType_TRequirementRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceElementType() {
		return sourceElementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceElementType_Ref() {
		return (EAttribute)sourceElementTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceInterfacesType() {
		return sourceInterfacesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceInterfacesType_Interface() {
		return (EReference)sourceInterfacesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTAppliesTo() {
		return tAppliesToEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTAppliesTo_NodeTypeReference() {
		return (EReference)tAppliesToEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetElementType() {
		return targetElementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTargetElementType_Ref() {
		return (EAttribute)targetElementTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetInterfacesType() {
		return targetInterfacesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetInterfacesType_Interface() {
		return (EReference)targetInterfacesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTArtifactReference() {
		return tArtifactReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTArtifactReference_Group() {
		return (EAttribute)tArtifactReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTArtifactReference_Include() {
		return (EReference)tArtifactReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTArtifactReference_Exclude() {
		return (EReference)tArtifactReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTArtifactReference_Reference() {
		return (EAttribute)tArtifactReferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTArtifactTemplate() {
		return tArtifactTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTArtifactTemplate_ArtifactReferences() {
		return (EReference)tArtifactTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTArtifactTemplate_Name() {
		return (EAttribute)tArtifactTemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTArtifactType() {
		return tArtifactTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTBoundaryDefinitions() {
		return tBoundaryDefinitionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTBoundaryDefinitions_Properties() {
		return (EReference)tBoundaryDefinitionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTBoundaryDefinitions_PropertyConstraints() {
		return (EReference)tBoundaryDefinitionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTBoundaryDefinitions_Requirements() {
		return (EReference)tBoundaryDefinitionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTBoundaryDefinitions_Capabilities() {
		return (EReference)tBoundaryDefinitionsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTBoundaryDefinitions_Policies() {
		return (EReference)tBoundaryDefinitionsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTBoundaryDefinitions_Interfaces() {
		return (EReference)tBoundaryDefinitionsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTCapability() {
		return tCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCapability_Name() {
		return (EAttribute)tCapabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTCapabilityDefinition() {
		return tCapabilityDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCapabilityDefinition_Constraints() {
		return (EReference)tCapabilityDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCapabilityDefinition_CapabilityType() {
		return (EAttribute)tCapabilityDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCapabilityDefinition_LowerBound() {
		return (EAttribute)tCapabilityDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCapabilityDefinition_Name() {
		return (EAttribute)tCapabilityDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCapabilityDefinition_UpperBound() {
		return (EAttribute)tCapabilityDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTCapabilityRef() {
		return tCapabilityRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCapabilityRef_Name() {
		return (EAttribute)tCapabilityRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCapabilityRef_Ref() {
		return (EAttribute)tCapabilityRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTCapabilityType() {
		return tCapabilityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTCondition() {
		return tConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCondition_Any() {
		return (EAttribute)tConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCondition_ExpressionLanguage() {
		return (EAttribute)tConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTConstraint() {
		return tConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTConstraint_Any() {
		return (EAttribute)tConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTConstraint_ConstraintType() {
		return (EAttribute)tConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTDefinitions() {
		return tDefinitionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTDefinitions_Extensions() {
		return (EReference)tDefinitionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTDefinitions_Import() {
		return (EReference)tDefinitionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTDefinitions_Types() {
		return (EReference)tDefinitionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTDefinitions_Group() {
		return (EAttribute)tDefinitionsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTDefinitions_ServiceTemplate() {
		return (EReference)tDefinitionsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTDefinitions_NodeType() {
		return (EReference)tDefinitionsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTDefinitions_NodeTypeImplementation() {
		return (EReference)tDefinitionsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTDefinitions_RelationshipType() {
		return (EReference)tDefinitionsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTDefinitions_RelationshipTypeImplementation() {
		return (EReference)tDefinitionsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTDefinitions_RequirementType() {
		return (EReference)tDefinitionsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTDefinitions_CapabilityType() {
		return (EReference)tDefinitionsEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTDefinitions_ArtifactType() {
		return (EReference)tDefinitionsEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTDefinitions_ArtifactTemplate() {
		return (EReference)tDefinitionsEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTDefinitions_PolicyType() {
		return (EReference)tDefinitionsEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTDefinitions_PolicyTemplate() {
		return (EReference)tDefinitionsEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTDefinitions_Id() {
		return (EAttribute)tDefinitionsEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTDefinitions_Name() {
		return (EAttribute)tDefinitionsEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTDefinitions_TargetNamespace() {
		return (EAttribute)tDefinitionsEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTDeploymentArtifact() {
		return tDeploymentArtifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTDeploymentArtifact_ArtifactRef() {
		return (EAttribute)tDeploymentArtifactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTDeploymentArtifact_ArtifactType() {
		return (EAttribute)tDeploymentArtifactEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTDeploymentArtifact_Name() {
		return (EAttribute)tDeploymentArtifactEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTDeploymentArtifacts() {
		return tDeploymentArtifactsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTDeploymentArtifacts_DeploymentArtifact() {
		return (EReference)tDeploymentArtifactsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTDocumentation() {
		return tDocumentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTDocumentation_Mixed() {
		return (EAttribute)tDocumentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTDocumentation_Any() {
		return (EAttribute)tDocumentationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTDocumentation_Lang() {
		return (EAttribute)tDocumentationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTDocumentation_Source() {
		return (EAttribute)tDocumentationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTEntityTemplate() {
		return tEntityTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTEntityTemplate_Properties() {
		return (EReference)tEntityTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTEntityTemplate_PropertyConstraints() {
		return (EReference)tEntityTemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTEntityTemplate_Id() {
		return (EAttribute)tEntityTemplateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTEntityTemplate_Type() {
		return (EAttribute)tEntityTemplateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTEntityType() {
		return tEntityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTEntityType_Tags() {
		return (EReference)tEntityTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTEntityType_DerivedFrom() {
		return (EReference)tEntityTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTEntityType_PropertiesDefinition() {
		return (EReference)tEntityTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTEntityType_Abstract() {
		return (EAttribute)tEntityTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTEntityType_Final() {
		return (EAttribute)tEntityTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTEntityType_Name() {
		return (EAttribute)tEntityTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTEntityType_TargetNamespace() {
		return (EAttribute)tEntityTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTExportedInterface() {
		return tExportedInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTExportedInterface_Operation() {
		return (EReference)tExportedInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTExportedInterface_Name() {
		return (EAttribute)tExportedInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTExportedOperation() {
		return tExportedOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTExportedOperation_NodeOperation() {
		return (EReference)tExportedOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTExportedOperation_RelationshipOperation() {
		return (EReference)tExportedOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTExportedOperation_Plan() {
		return (EReference)tExportedOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTExportedOperation_Name() {
		return (EAttribute)tExportedOperationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTExtensibleElements() {
		return tExtensibleElementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTExtensibleElements_Documentation() {
		return (EReference)tExtensibleElementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTExtensibleElements_Any() {
		return (EAttribute)tExtensibleElementsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTExtensibleElements_AnyAttribute() {
		return (EAttribute)tExtensibleElementsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTExtension() {
		return tExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTExtension_MustUnderstand() {
		return (EAttribute)tExtensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTExtension_Namespace() {
		return (EAttribute)tExtensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTExtensions() {
		return tExtensionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTExtensions_Extension() {
		return (EReference)tExtensionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTImplementationArtifact() {
		return tImplementationArtifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTImplementationArtifact_ArtifactRef() {
		return (EAttribute)tImplementationArtifactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTImplementationArtifact_ArtifactType() {
		return (EAttribute)tImplementationArtifactEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTImplementationArtifact_InterfaceName() {
		return (EAttribute)tImplementationArtifactEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTImplementationArtifact_OperationName() {
		return (EAttribute)tImplementationArtifactEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTImplementationArtifacts() {
		return tImplementationArtifactsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTImplementationArtifacts_ImplementationArtifact() {
		return (EReference)tImplementationArtifactsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTImport() {
		return tImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTImport_ImportType() {
		return (EAttribute)tImportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTImport_Location() {
		return (EAttribute)tImportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTImport_Namespace() {
		return (EAttribute)tImportEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTInterface() {
		return tInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTInterface_Operation() {
		return (EReference)tInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTInterface_Name() {
		return (EAttribute)tInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTNodeTemplate() {
		return tNodeTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTNodeTemplate_Requirements() {
		return (EReference)tNodeTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTNodeTemplate_Capabilities() {
		return (EReference)tNodeTemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTNodeTemplate_Policies() {
		return (EReference)tNodeTemplateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTNodeTemplate_DeploymentArtifacts() {
		return (EReference)tNodeTemplateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTNodeTemplate_MaxInstances() {
		return (EAttribute)tNodeTemplateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTNodeTemplate_MinInstances() {
		return (EAttribute)tNodeTemplateEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTNodeTemplate_Name() {
		return (EAttribute)tNodeTemplateEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTNodeType() {
		return tNodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTNodeType_RequirementDefinitions() {
		return (EReference)tNodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTNodeType_CapabilityDefinitions() {
		return (EReference)tNodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTNodeType_InstanceStates() {
		return (EReference)tNodeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTNodeType_Interfaces() {
		return (EReference)tNodeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTNodeTypeImplementation() {
		return tNodeTypeImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTNodeTypeImplementation_Tags() {
		return (EReference)tNodeTypeImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTNodeTypeImplementation_DerivedFrom() {
		return (EReference)tNodeTypeImplementationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTNodeTypeImplementation_RequiredContainerFeatures() {
		return (EReference)tNodeTypeImplementationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTNodeTypeImplementation_ImplementationArtifacts() {
		return (EReference)tNodeTypeImplementationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTNodeTypeImplementation_DeploymentArtifacts() {
		return (EReference)tNodeTypeImplementationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTNodeTypeImplementation_Abstract() {
		return (EAttribute)tNodeTypeImplementationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTNodeTypeImplementation_Final() {
		return (EAttribute)tNodeTypeImplementationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTNodeTypeImplementation_Name() {
		return (EAttribute)tNodeTypeImplementationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTNodeTypeImplementation_NodeType() {
		return (EAttribute)tNodeTypeImplementationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTNodeTypeImplementation_TargetNamespace() {
		return (EAttribute)tNodeTypeImplementationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTOperation() {
		return tOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTOperation_InputParameters() {
		return (EReference)tOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTOperation_OutputParameters() {
		return (EReference)tOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTOperation_Name() {
		return (EAttribute)tOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTParameter() {
		return tParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTParameter_Name() {
		return (EAttribute)tParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTParameter_Required() {
		return (EAttribute)tParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTParameter_Type() {
		return (EAttribute)tParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTPlan() {
		return tPlanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTPlan_Precondition() {
		return (EReference)tPlanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTPlan_InputParameters() {
		return (EReference)tPlanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTPlan_OutputParameters() {
		return (EReference)tPlanEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTPlan_PlanModel() {
		return (EReference)tPlanEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTPlan_PlanModelReference() {
		return (EReference)tPlanEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTPlan_Id() {
		return (EAttribute)tPlanEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTPlan_Name() {
		return (EAttribute)tPlanEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTPlan_PlanLanguage() {
		return (EAttribute)tPlanEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTPlan_PlanType() {
		return (EAttribute)tPlanEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTPlans() {
		return tPlansEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTPlans_Plan() {
		return (EReference)tPlansEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTPlans_TargetNamespace() {
		return (EAttribute)tPlansEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTPolicy() {
		return tPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTPolicy_Name() {
		return (EAttribute)tPolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTPolicy_PolicyRef() {
		return (EAttribute)tPolicyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTPolicy_PolicyType() {
		return (EAttribute)tPolicyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTPolicyTemplate() {
		return tPolicyTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTPolicyTemplate_Name() {
		return (EAttribute)tPolicyTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTPolicyType() {
		return tPolicyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTPolicyType_AppliesTo() {
		return (EReference)tPolicyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTPolicyType_PolicyLanguage() {
		return (EAttribute)tPolicyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTPropertyConstraint() {
		return tPropertyConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTPropertyConstraint_Property() {
		return (EAttribute)tPropertyConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTPropertyMapping() {
		return tPropertyMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTPropertyMapping_ServiceTemplatePropertyRef() {
		return (EAttribute)tPropertyMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTPropertyMapping_TargetObjectRef() {
		return (EAttribute)tPropertyMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTPropertyMapping_TargetPropertyRef() {
		return (EAttribute)tPropertyMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTRelationshipTemplate() {
		return tRelationshipTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTRelationshipTemplate_SourceElement() {
		return (EReference)tRelationshipTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTRelationshipTemplate_TargetElement() {
		return (EReference)tRelationshipTemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTRelationshipTemplate_RelationshipConstraints() {
		return (EReference)tRelationshipTemplateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTRelationshipTemplate_Name() {
		return (EAttribute)tRelationshipTemplateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTRelationshipType() {
		return tRelationshipTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTRelationshipType_InstanceStates() {
		return (EReference)tRelationshipTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTRelationshipType_SourceInterfaces() {
		return (EReference)tRelationshipTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTRelationshipType_TargetInterfaces() {
		return (EReference)tRelationshipTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTRelationshipType_ValidSource() {
		return (EReference)tRelationshipTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTRelationshipType_ValidTarget() {
		return (EReference)tRelationshipTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTRelationshipTypeImplementation() {
		return tRelationshipTypeImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTRelationshipTypeImplementation_Tags() {
		return (EReference)tRelationshipTypeImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTRelationshipTypeImplementation_DerivedFrom() {
		return (EReference)tRelationshipTypeImplementationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTRelationshipTypeImplementation_RequiredContainerFeatures() {
		return (EReference)tRelationshipTypeImplementationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTRelationshipTypeImplementation_ImplementationArtifacts() {
		return (EReference)tRelationshipTypeImplementationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTRelationshipTypeImplementation_Abstract() {
		return (EAttribute)tRelationshipTypeImplementationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTRelationshipTypeImplementation_Final() {
		return (EAttribute)tRelationshipTypeImplementationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTRelationshipTypeImplementation_Name() {
		return (EAttribute)tRelationshipTypeImplementationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTRelationshipTypeImplementation_RelationshipType() {
		return (EAttribute)tRelationshipTypeImplementationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTRelationshipTypeImplementation_TargetNamespace() {
		return (EAttribute)tRelationshipTypeImplementationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTRequiredContainerFeature() {
		return tRequiredContainerFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTRequiredContainerFeature_Feature() {
		return (EAttribute)tRequiredContainerFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTRequiredContainerFeatures() {
		return tRequiredContainerFeaturesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTRequiredContainerFeatures_RequiredContainerFeature() {
		return (EReference)tRequiredContainerFeaturesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTRequirement() {
		return tRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTRequirement_Name() {
		return (EAttribute)tRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTRequirementDefinition() {
		return tRequirementDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTRequirementDefinition_Constraints() {
		return (EReference)tRequirementDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTRequirementDefinition_LowerBound() {
		return (EAttribute)tRequirementDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTRequirementDefinition_Name() {
		return (EAttribute)tRequirementDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTRequirementDefinition_RequirementType() {
		return (EAttribute)tRequirementDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTRequirementDefinition_UpperBound() {
		return (EAttribute)tRequirementDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTRequirementRef() {
		return tRequirementRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTRequirementRef_Name() {
		return (EAttribute)tRequirementRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTRequirementRef_Ref() {
		return (EAttribute)tRequirementRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTRequirementType() {
		return tRequirementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTRequirementType_RequiredCapabilityType() {
		return (EAttribute)tRequirementTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTServiceTemplate() {
		return tServiceTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTServiceTemplate_Tags() {
		return (EReference)tServiceTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTServiceTemplate_BoundaryDefinitions() {
		return (EReference)tServiceTemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTServiceTemplate_TopologyTemplate() {
		return (EReference)tServiceTemplateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTServiceTemplate_Plans() {
		return (EReference)tServiceTemplateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTServiceTemplate_Id() {
		return (EAttribute)tServiceTemplateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTServiceTemplate_Name() {
		return (EAttribute)tServiceTemplateEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTServiceTemplate_SubstitutableNodeType() {
		return (EAttribute)tServiceTemplateEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTServiceTemplate_TargetNamespace() {
		return (EAttribute)tServiceTemplateEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTTag() {
		return tTagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTTag_Name() {
		return (EAttribute)tTagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTTag_Value() {
		return (EAttribute)tTagEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTTags() {
		return tTagsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTTags_Tag() {
		return (EReference)tTagsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTTopologyElementInstanceStates() {
		return tTopologyElementInstanceStatesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTTopologyElementInstanceStates_InstanceState() {
		return (EReference)tTopologyElementInstanceStatesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTTopologyTemplate() {
		return tTopologyTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTTopologyTemplate_Group() {
		return (EAttribute)tTopologyTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTTopologyTemplate_NodeTemplate() {
		return (EReference)tTopologyTemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTTopologyTemplate_RelationshipTemplate() {
		return (EReference)tTopologyTemplateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypesType() {
		return typesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypesType_Any() {
		return (EAttribute)typesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValidSourceType() {
		return validSourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValidSourceType_TypeRef() {
		return (EAttribute)validSourceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValidTargetType() {
		return validTargetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValidTargetType_TypeRef() {
		return (EAttribute)validTargetTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMaxInstancesTypeMember1() {
		return maxInstancesTypeMember1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTBoolean() {
		return tBooleanEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUpperBoundTypeMember1() {
		return upperBoundTypeMember1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUpperBoundTypeMember11() {
		return upperBoundTypeMember11EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getImportedURI() {
		return importedURIEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMaxInstancesType() {
		return maxInstancesTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMaxInstancesTypeMember0() {
		return maxInstancesTypeMember0EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMaxInstancesTypeMember1Object() {
		return maxInstancesTypeMember1ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTBooleanObject() {
		return tBooleanObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUpperBoundType() {
		return upperBoundTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUpperBoundType1() {
		return upperBoundType1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUpperBoundTypeMember0() {
		return upperBoundTypeMember0EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUpperBoundTypeMember01() {
		return upperBoundTypeMember01EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUpperBoundTypeMember1Object() {
		return upperBoundTypeMember1ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUpperBoundTypeMember1Object1() {
		return upperBoundTypeMember1Object1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToscaFactory getToscaFactory() {
		return (ToscaFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		artifactReferencesTypeEClass = createEClass(ARTIFACT_REFERENCES_TYPE);
		createEReference(artifactReferencesTypeEClass, ARTIFACT_REFERENCES_TYPE__ARTIFACT_REFERENCE);

		capabilitiesType_TCapabilityEClass = createEClass(CAPABILITIES_TYPE_TCAPABILITY);
		createEReference(capabilitiesType_TCapabilityEClass, CAPABILITIES_TYPE_TCAPABILITY__CAPABILITY);

		capabilitiesType_CapabilityRefEClass = createEClass(CAPABILITIES_TYPE_CAPABILITY_REF);
		createEReference(capabilitiesType_CapabilityRefEClass, CAPABILITIES_TYPE_CAPABILITY_REF__CAPABILITY);

		capabilityDefinitionsTypeEClass = createEClass(CAPABILITY_DEFINITIONS_TYPE);
		createEReference(capabilityDefinitionsTypeEClass, CAPABILITY_DEFINITIONS_TYPE__CAPABILITY_DEFINITION);

		constraintsTypeEClass = createEClass(CONSTRAINTS_TYPE);
		createEReference(constraintsTypeEClass, CONSTRAINTS_TYPE__CONSTRAINT);

		definitionsTypeEClass = createEClass(DEFINITIONS_TYPE);

		derivedFromTypeEClass = createEClass(DERIVED_FROM_TYPE);
		createEAttribute(derivedFromTypeEClass, DERIVED_FROM_TYPE__DERIVED_FROM);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DEFINITIONS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DOCUMENTATION);

		excludeTypeEClass = createEClass(EXCLUDE_TYPE);
		createEAttribute(excludeTypeEClass, EXCLUDE_TYPE__PATTERN);

		extensionsTypeEClass = createEClass(EXTENSIONS_TYPE);
		createEReference(extensionsTypeEClass, EXTENSIONS_TYPE__EXTENSION);

		implementationArtifactTypeEClass = createEClass(IMPLEMENTATION_ARTIFACT_TYPE);

		includeTypeEClass = createEClass(INCLUDE_TYPE);
		createEAttribute(includeTypeEClass, INCLUDE_TYPE__PATTERN);

		inputParametersTypeEClass = createEClass(INPUT_PARAMETERS_TYPE);
		createEReference(inputParametersTypeEClass, INPUT_PARAMETERS_TYPE__INPUT_PARAMETER);

		instanceStateTypeEClass = createEClass(INSTANCE_STATE_TYPE);
		createEAttribute(instanceStateTypeEClass, INSTANCE_STATE_TYPE__STATE);

		interfacesType_TInterfaceEClass = createEClass(INTERFACES_TYPE_TINTERFACE);
		createEReference(interfacesType_TInterfaceEClass, INTERFACES_TYPE_TINTERFACE__INTERFACE);

		interfacesType_TExportedInterfaceEClass = createEClass(INTERFACES_TYPE_TEXPORTED_INTERFACE);
		createEReference(interfacesType_TExportedInterfaceEClass, INTERFACES_TYPE_TEXPORTED_INTERFACE__INTERFACE);

		nodeOperationTypeEClass = createEClass(NODE_OPERATION_TYPE);
		createEAttribute(nodeOperationTypeEClass, NODE_OPERATION_TYPE__INTERFACE_NAME);
		createEAttribute(nodeOperationTypeEClass, NODE_OPERATION_TYPE__NODE_REF);
		createEAttribute(nodeOperationTypeEClass, NODE_OPERATION_TYPE__OPERATION_NAME);

		nodeTypeReferenceTypeEClass = createEClass(NODE_TYPE_REFERENCE_TYPE);
		createEAttribute(nodeTypeReferenceTypeEClass, NODE_TYPE_REFERENCE_TYPE__TYPE_REF);

		outputParametersTypeEClass = createEClass(OUTPUT_PARAMETERS_TYPE);
		createEReference(outputParametersTypeEClass, OUTPUT_PARAMETERS_TYPE__OUTPUT_PARAMETER);

		planModelReferenceTypeEClass = createEClass(PLAN_MODEL_REFERENCE_TYPE);
		createEAttribute(planModelReferenceTypeEClass, PLAN_MODEL_REFERENCE_TYPE__REFERENCE);

		planModelTypeEClass = createEClass(PLAN_MODEL_TYPE);
		createEAttribute(planModelTypeEClass, PLAN_MODEL_TYPE__ANY);

		planTypeEClass = createEClass(PLAN_TYPE);
		createEAttribute(planTypeEClass, PLAN_TYPE__PLAN_REF);

		policiesTypeEClass = createEClass(POLICIES_TYPE);
		createEReference(policiesTypeEClass, POLICIES_TYPE__POLICY);

		propertiesDefinitionTypeEClass = createEClass(PROPERTIES_DEFINITION_TYPE);
		createEAttribute(propertiesDefinitionTypeEClass, PROPERTIES_DEFINITION_TYPE__ELEMENT);
		createEAttribute(propertiesDefinitionTypeEClass, PROPERTIES_DEFINITION_TYPE__TYPE);

		propertiesTypeEClass = createEClass(PROPERTIES_TYPE);
		createEAttribute(propertiesTypeEClass, PROPERTIES_TYPE__ANY);

		propertiesTypeWithPropertyMappingsEClass = createEClass(PROPERTIES_TYPE_WITH_PROPERTY_MAPPINGS);
		createEAttribute(propertiesTypeWithPropertyMappingsEClass, PROPERTIES_TYPE_WITH_PROPERTY_MAPPINGS__ANY);
		createEReference(propertiesTypeWithPropertyMappingsEClass, PROPERTIES_TYPE_WITH_PROPERTY_MAPPINGS__PROPERTY_MAPPINGS);

		propertyConstraintsTypeEClass = createEClass(PROPERTY_CONSTRAINTS_TYPE);
		createEReference(propertyConstraintsTypeEClass, PROPERTY_CONSTRAINTS_TYPE__PROPERTY_CONSTRAINT);

		propertyMappingsTypeEClass = createEClass(PROPERTY_MAPPINGS_TYPE);
		createEReference(propertyMappingsTypeEClass, PROPERTY_MAPPINGS_TYPE__PROPERTY_MAPPING);

		relationshipConstraintsTypeEClass = createEClass(RELATIONSHIP_CONSTRAINTS_TYPE);
		createEReference(relationshipConstraintsTypeEClass, RELATIONSHIP_CONSTRAINTS_TYPE__RELATIONSHIP_CONSTRAINT);

		relationshipConstraintTypeEClass = createEClass(RELATIONSHIP_CONSTRAINT_TYPE);
		createEAttribute(relationshipConstraintTypeEClass, RELATIONSHIP_CONSTRAINT_TYPE__ANY);
		createEAttribute(relationshipConstraintTypeEClass, RELATIONSHIP_CONSTRAINT_TYPE__CONSTRAINT_TYPE);

		relationshipOperationTypeEClass = createEClass(RELATIONSHIP_OPERATION_TYPE);
		createEAttribute(relationshipOperationTypeEClass, RELATIONSHIP_OPERATION_TYPE__INTERFACE_NAME);
		createEAttribute(relationshipOperationTypeEClass, RELATIONSHIP_OPERATION_TYPE__OPERATION_NAME);
		createEAttribute(relationshipOperationTypeEClass, RELATIONSHIP_OPERATION_TYPE__RELATIONSHIP_REF);

		requirementDefinitionsTypeEClass = createEClass(REQUIREMENT_DEFINITIONS_TYPE);
		createEReference(requirementDefinitionsTypeEClass, REQUIREMENT_DEFINITIONS_TYPE__REQUIREMENT_DEFINITION);

		requirementsType_TRequirementEClass = createEClass(REQUIREMENTS_TYPE_TREQUIREMENT);
		createEReference(requirementsType_TRequirementEClass, REQUIREMENTS_TYPE_TREQUIREMENT__REQUIREMENT);

		requirementsType_TRequirementRefEClass = createEClass(REQUIREMENTS_TYPE_TREQUIREMENT_REF);
		createEReference(requirementsType_TRequirementRefEClass, REQUIREMENTS_TYPE_TREQUIREMENT_REF__REQUIREMENT);

		sourceElementTypeEClass = createEClass(SOURCE_ELEMENT_TYPE);
		createEAttribute(sourceElementTypeEClass, SOURCE_ELEMENT_TYPE__REF);

		sourceInterfacesTypeEClass = createEClass(SOURCE_INTERFACES_TYPE);
		createEReference(sourceInterfacesTypeEClass, SOURCE_INTERFACES_TYPE__INTERFACE);

		tAppliesToEClass = createEClass(TAPPLIES_TO);
		createEReference(tAppliesToEClass, TAPPLIES_TO__NODE_TYPE_REFERENCE);

		targetElementTypeEClass = createEClass(TARGET_ELEMENT_TYPE);
		createEAttribute(targetElementTypeEClass, TARGET_ELEMENT_TYPE__REF);

		targetInterfacesTypeEClass = createEClass(TARGET_INTERFACES_TYPE);
		createEReference(targetInterfacesTypeEClass, TARGET_INTERFACES_TYPE__INTERFACE);

		tArtifactReferenceEClass = createEClass(TARTIFACT_REFERENCE);
		createEAttribute(tArtifactReferenceEClass, TARTIFACT_REFERENCE__GROUP);
		createEReference(tArtifactReferenceEClass, TARTIFACT_REFERENCE__INCLUDE);
		createEReference(tArtifactReferenceEClass, TARTIFACT_REFERENCE__EXCLUDE);
		createEAttribute(tArtifactReferenceEClass, TARTIFACT_REFERENCE__REFERENCE);

		tArtifactTemplateEClass = createEClass(TARTIFACT_TEMPLATE);
		createEReference(tArtifactTemplateEClass, TARTIFACT_TEMPLATE__ARTIFACT_REFERENCES);
		createEAttribute(tArtifactTemplateEClass, TARTIFACT_TEMPLATE__NAME);

		tArtifactTypeEClass = createEClass(TARTIFACT_TYPE);

		tBoundaryDefinitionsEClass = createEClass(TBOUNDARY_DEFINITIONS);
		createEReference(tBoundaryDefinitionsEClass, TBOUNDARY_DEFINITIONS__PROPERTIES);
		createEReference(tBoundaryDefinitionsEClass, TBOUNDARY_DEFINITIONS__PROPERTY_CONSTRAINTS);
		createEReference(tBoundaryDefinitionsEClass, TBOUNDARY_DEFINITIONS__REQUIREMENTS);
		createEReference(tBoundaryDefinitionsEClass, TBOUNDARY_DEFINITIONS__CAPABILITIES);
		createEReference(tBoundaryDefinitionsEClass, TBOUNDARY_DEFINITIONS__POLICIES);
		createEReference(tBoundaryDefinitionsEClass, TBOUNDARY_DEFINITIONS__INTERFACES);

		tCapabilityEClass = createEClass(TCAPABILITY);
		createEAttribute(tCapabilityEClass, TCAPABILITY__NAME);

		tCapabilityDefinitionEClass = createEClass(TCAPABILITY_DEFINITION);
		createEReference(tCapabilityDefinitionEClass, TCAPABILITY_DEFINITION__CONSTRAINTS);
		createEAttribute(tCapabilityDefinitionEClass, TCAPABILITY_DEFINITION__CAPABILITY_TYPE);
		createEAttribute(tCapabilityDefinitionEClass, TCAPABILITY_DEFINITION__LOWER_BOUND);
		createEAttribute(tCapabilityDefinitionEClass, TCAPABILITY_DEFINITION__NAME);
		createEAttribute(tCapabilityDefinitionEClass, TCAPABILITY_DEFINITION__UPPER_BOUND);

		tCapabilityRefEClass = createEClass(TCAPABILITY_REF);
		createEAttribute(tCapabilityRefEClass, TCAPABILITY_REF__NAME);
		createEAttribute(tCapabilityRefEClass, TCAPABILITY_REF__REF);

		tCapabilityTypeEClass = createEClass(TCAPABILITY_TYPE);

		tConditionEClass = createEClass(TCONDITION);
		createEAttribute(tConditionEClass, TCONDITION__ANY);
		createEAttribute(tConditionEClass, TCONDITION__EXPRESSION_LANGUAGE);

		tConstraintEClass = createEClass(TCONSTRAINT);
		createEAttribute(tConstraintEClass, TCONSTRAINT__ANY);
		createEAttribute(tConstraintEClass, TCONSTRAINT__CONSTRAINT_TYPE);

		tDefinitionsEClass = createEClass(TDEFINITIONS);
		createEReference(tDefinitionsEClass, TDEFINITIONS__EXTENSIONS);
		createEReference(tDefinitionsEClass, TDEFINITIONS__IMPORT);
		createEReference(tDefinitionsEClass, TDEFINITIONS__TYPES);
		createEAttribute(tDefinitionsEClass, TDEFINITIONS__GROUP);
		createEReference(tDefinitionsEClass, TDEFINITIONS__SERVICE_TEMPLATE);
		createEReference(tDefinitionsEClass, TDEFINITIONS__NODE_TYPE);
		createEReference(tDefinitionsEClass, TDEFINITIONS__NODE_TYPE_IMPLEMENTATION);
		createEReference(tDefinitionsEClass, TDEFINITIONS__RELATIONSHIP_TYPE);
		createEReference(tDefinitionsEClass, TDEFINITIONS__RELATIONSHIP_TYPE_IMPLEMENTATION);
		createEReference(tDefinitionsEClass, TDEFINITIONS__REQUIREMENT_TYPE);
		createEReference(tDefinitionsEClass, TDEFINITIONS__CAPABILITY_TYPE);
		createEReference(tDefinitionsEClass, TDEFINITIONS__ARTIFACT_TYPE);
		createEReference(tDefinitionsEClass, TDEFINITIONS__ARTIFACT_TEMPLATE);
		createEReference(tDefinitionsEClass, TDEFINITIONS__POLICY_TYPE);
		createEReference(tDefinitionsEClass, TDEFINITIONS__POLICY_TEMPLATE);
		createEAttribute(tDefinitionsEClass, TDEFINITIONS__ID);
		createEAttribute(tDefinitionsEClass, TDEFINITIONS__NAME);
		createEAttribute(tDefinitionsEClass, TDEFINITIONS__TARGET_NAMESPACE);

		tDeploymentArtifactEClass = createEClass(TDEPLOYMENT_ARTIFACT);
		createEAttribute(tDeploymentArtifactEClass, TDEPLOYMENT_ARTIFACT__ARTIFACT_REF);
		createEAttribute(tDeploymentArtifactEClass, TDEPLOYMENT_ARTIFACT__ARTIFACT_TYPE);
		createEAttribute(tDeploymentArtifactEClass, TDEPLOYMENT_ARTIFACT__NAME);

		tDeploymentArtifactsEClass = createEClass(TDEPLOYMENT_ARTIFACTS);
		createEReference(tDeploymentArtifactsEClass, TDEPLOYMENT_ARTIFACTS__DEPLOYMENT_ARTIFACT);

		tDocumentationEClass = createEClass(TDOCUMENTATION);
		createEAttribute(tDocumentationEClass, TDOCUMENTATION__MIXED);
		createEAttribute(tDocumentationEClass, TDOCUMENTATION__ANY);
		createEAttribute(tDocumentationEClass, TDOCUMENTATION__LANG);
		createEAttribute(tDocumentationEClass, TDOCUMENTATION__SOURCE);

		tEntityTemplateEClass = createEClass(TENTITY_TEMPLATE);
		createEReference(tEntityTemplateEClass, TENTITY_TEMPLATE__PROPERTIES);
		createEReference(tEntityTemplateEClass, TENTITY_TEMPLATE__PROPERTY_CONSTRAINTS);
		createEAttribute(tEntityTemplateEClass, TENTITY_TEMPLATE__ID);
		createEAttribute(tEntityTemplateEClass, TENTITY_TEMPLATE__TYPE);

		tEntityTypeEClass = createEClass(TENTITY_TYPE);
		createEReference(tEntityTypeEClass, TENTITY_TYPE__TAGS);
		createEReference(tEntityTypeEClass, TENTITY_TYPE__DERIVED_FROM);
		createEReference(tEntityTypeEClass, TENTITY_TYPE__PROPERTIES_DEFINITION);
		createEAttribute(tEntityTypeEClass, TENTITY_TYPE__ABSTRACT);
		createEAttribute(tEntityTypeEClass, TENTITY_TYPE__FINAL);
		createEAttribute(tEntityTypeEClass, TENTITY_TYPE__NAME);
		createEAttribute(tEntityTypeEClass, TENTITY_TYPE__TARGET_NAMESPACE);

		tExportedInterfaceEClass = createEClass(TEXPORTED_INTERFACE);
		createEReference(tExportedInterfaceEClass, TEXPORTED_INTERFACE__OPERATION);
		createEAttribute(tExportedInterfaceEClass, TEXPORTED_INTERFACE__NAME);

		tExportedOperationEClass = createEClass(TEXPORTED_OPERATION);
		createEReference(tExportedOperationEClass, TEXPORTED_OPERATION__NODE_OPERATION);
		createEReference(tExportedOperationEClass, TEXPORTED_OPERATION__RELATIONSHIP_OPERATION);
		createEReference(tExportedOperationEClass, TEXPORTED_OPERATION__PLAN);
		createEAttribute(tExportedOperationEClass, TEXPORTED_OPERATION__NAME);

		tExtensibleElementsEClass = createEClass(TEXTENSIBLE_ELEMENTS);
		createEReference(tExtensibleElementsEClass, TEXTENSIBLE_ELEMENTS__DOCUMENTATION);
		createEAttribute(tExtensibleElementsEClass, TEXTENSIBLE_ELEMENTS__ANY);
		createEAttribute(tExtensibleElementsEClass, TEXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE);

		tExtensionEClass = createEClass(TEXTENSION);
		createEAttribute(tExtensionEClass, TEXTENSION__MUST_UNDERSTAND);
		createEAttribute(tExtensionEClass, TEXTENSION__NAMESPACE);

		tExtensionsEClass = createEClass(TEXTENSIONS);
		createEReference(tExtensionsEClass, TEXTENSIONS__EXTENSION);

		tImplementationArtifactEClass = createEClass(TIMPLEMENTATION_ARTIFACT);
		createEAttribute(tImplementationArtifactEClass, TIMPLEMENTATION_ARTIFACT__ARTIFACT_REF);
		createEAttribute(tImplementationArtifactEClass, TIMPLEMENTATION_ARTIFACT__ARTIFACT_TYPE);
		createEAttribute(tImplementationArtifactEClass, TIMPLEMENTATION_ARTIFACT__INTERFACE_NAME);
		createEAttribute(tImplementationArtifactEClass, TIMPLEMENTATION_ARTIFACT__OPERATION_NAME);

		tImplementationArtifactsEClass = createEClass(TIMPLEMENTATION_ARTIFACTS);
		createEReference(tImplementationArtifactsEClass, TIMPLEMENTATION_ARTIFACTS__IMPLEMENTATION_ARTIFACT);

		tImportEClass = createEClass(TIMPORT);
		createEAttribute(tImportEClass, TIMPORT__IMPORT_TYPE);
		createEAttribute(tImportEClass, TIMPORT__LOCATION);
		createEAttribute(tImportEClass, TIMPORT__NAMESPACE);

		tInterfaceEClass = createEClass(TINTERFACE);
		createEReference(tInterfaceEClass, TINTERFACE__OPERATION);
		createEAttribute(tInterfaceEClass, TINTERFACE__NAME);

		tNodeTemplateEClass = createEClass(TNODE_TEMPLATE);
		createEReference(tNodeTemplateEClass, TNODE_TEMPLATE__REQUIREMENTS);
		createEReference(tNodeTemplateEClass, TNODE_TEMPLATE__CAPABILITIES);
		createEReference(tNodeTemplateEClass, TNODE_TEMPLATE__POLICIES);
		createEReference(tNodeTemplateEClass, TNODE_TEMPLATE__DEPLOYMENT_ARTIFACTS);
		createEAttribute(tNodeTemplateEClass, TNODE_TEMPLATE__MAX_INSTANCES);
		createEAttribute(tNodeTemplateEClass, TNODE_TEMPLATE__MIN_INSTANCES);
		createEAttribute(tNodeTemplateEClass, TNODE_TEMPLATE__NAME);

		tNodeTypeEClass = createEClass(TNODE_TYPE);
		createEReference(tNodeTypeEClass, TNODE_TYPE__REQUIREMENT_DEFINITIONS);
		createEReference(tNodeTypeEClass, TNODE_TYPE__CAPABILITY_DEFINITIONS);
		createEReference(tNodeTypeEClass, TNODE_TYPE__INSTANCE_STATES);
		createEReference(tNodeTypeEClass, TNODE_TYPE__INTERFACES);

		tNodeTypeImplementationEClass = createEClass(TNODE_TYPE_IMPLEMENTATION);
		createEReference(tNodeTypeImplementationEClass, TNODE_TYPE_IMPLEMENTATION__TAGS);
		createEReference(tNodeTypeImplementationEClass, TNODE_TYPE_IMPLEMENTATION__DERIVED_FROM);
		createEReference(tNodeTypeImplementationEClass, TNODE_TYPE_IMPLEMENTATION__REQUIRED_CONTAINER_FEATURES);
		createEReference(tNodeTypeImplementationEClass, TNODE_TYPE_IMPLEMENTATION__IMPLEMENTATION_ARTIFACTS);
		createEReference(tNodeTypeImplementationEClass, TNODE_TYPE_IMPLEMENTATION__DEPLOYMENT_ARTIFACTS);
		createEAttribute(tNodeTypeImplementationEClass, TNODE_TYPE_IMPLEMENTATION__ABSTRACT);
		createEAttribute(tNodeTypeImplementationEClass, TNODE_TYPE_IMPLEMENTATION__FINAL);
		createEAttribute(tNodeTypeImplementationEClass, TNODE_TYPE_IMPLEMENTATION__NAME);
		createEAttribute(tNodeTypeImplementationEClass, TNODE_TYPE_IMPLEMENTATION__NODE_TYPE);
		createEAttribute(tNodeTypeImplementationEClass, TNODE_TYPE_IMPLEMENTATION__TARGET_NAMESPACE);

		tOperationEClass = createEClass(TOPERATION);
		createEReference(tOperationEClass, TOPERATION__INPUT_PARAMETERS);
		createEReference(tOperationEClass, TOPERATION__OUTPUT_PARAMETERS);
		createEAttribute(tOperationEClass, TOPERATION__NAME);

		tParameterEClass = createEClass(TPARAMETER);
		createEAttribute(tParameterEClass, TPARAMETER__NAME);
		createEAttribute(tParameterEClass, TPARAMETER__REQUIRED);
		createEAttribute(tParameterEClass, TPARAMETER__TYPE);

		tPlanEClass = createEClass(TPLAN);
		createEReference(tPlanEClass, TPLAN__PRECONDITION);
		createEReference(tPlanEClass, TPLAN__INPUT_PARAMETERS);
		createEReference(tPlanEClass, TPLAN__OUTPUT_PARAMETERS);
		createEReference(tPlanEClass, TPLAN__PLAN_MODEL);
		createEReference(tPlanEClass, TPLAN__PLAN_MODEL_REFERENCE);
		createEAttribute(tPlanEClass, TPLAN__ID);
		createEAttribute(tPlanEClass, TPLAN__NAME);
		createEAttribute(tPlanEClass, TPLAN__PLAN_LANGUAGE);
		createEAttribute(tPlanEClass, TPLAN__PLAN_TYPE);

		tPlansEClass = createEClass(TPLANS);
		createEReference(tPlansEClass, TPLANS__PLAN);
		createEAttribute(tPlansEClass, TPLANS__TARGET_NAMESPACE);

		tPolicyEClass = createEClass(TPOLICY);
		createEAttribute(tPolicyEClass, TPOLICY__NAME);
		createEAttribute(tPolicyEClass, TPOLICY__POLICY_REF);
		createEAttribute(tPolicyEClass, TPOLICY__POLICY_TYPE);

		tPolicyTemplateEClass = createEClass(TPOLICY_TEMPLATE);
		createEAttribute(tPolicyTemplateEClass, TPOLICY_TEMPLATE__NAME);

		tPolicyTypeEClass = createEClass(TPOLICY_TYPE);
		createEReference(tPolicyTypeEClass, TPOLICY_TYPE__APPLIES_TO);
		createEAttribute(tPolicyTypeEClass, TPOLICY_TYPE__POLICY_LANGUAGE);

		tPropertyConstraintEClass = createEClass(TPROPERTY_CONSTRAINT);
		createEAttribute(tPropertyConstraintEClass, TPROPERTY_CONSTRAINT__PROPERTY);

		tPropertyMappingEClass = createEClass(TPROPERTY_MAPPING);
		createEAttribute(tPropertyMappingEClass, TPROPERTY_MAPPING__SERVICE_TEMPLATE_PROPERTY_REF);
		createEAttribute(tPropertyMappingEClass, TPROPERTY_MAPPING__TARGET_OBJECT_REF);
		createEAttribute(tPropertyMappingEClass, TPROPERTY_MAPPING__TARGET_PROPERTY_REF);

		tRelationshipTemplateEClass = createEClass(TRELATIONSHIP_TEMPLATE);
		createEReference(tRelationshipTemplateEClass, TRELATIONSHIP_TEMPLATE__SOURCE_ELEMENT);
		createEReference(tRelationshipTemplateEClass, TRELATIONSHIP_TEMPLATE__TARGET_ELEMENT);
		createEReference(tRelationshipTemplateEClass, TRELATIONSHIP_TEMPLATE__RELATIONSHIP_CONSTRAINTS);
		createEAttribute(tRelationshipTemplateEClass, TRELATIONSHIP_TEMPLATE__NAME);

		tRelationshipTypeEClass = createEClass(TRELATIONSHIP_TYPE);
		createEReference(tRelationshipTypeEClass, TRELATIONSHIP_TYPE__INSTANCE_STATES);
		createEReference(tRelationshipTypeEClass, TRELATIONSHIP_TYPE__SOURCE_INTERFACES);
		createEReference(tRelationshipTypeEClass, TRELATIONSHIP_TYPE__TARGET_INTERFACES);
		createEReference(tRelationshipTypeEClass, TRELATIONSHIP_TYPE__VALID_SOURCE);
		createEReference(tRelationshipTypeEClass, TRELATIONSHIP_TYPE__VALID_TARGET);

		tRelationshipTypeImplementationEClass = createEClass(TRELATIONSHIP_TYPE_IMPLEMENTATION);
		createEReference(tRelationshipTypeImplementationEClass, TRELATIONSHIP_TYPE_IMPLEMENTATION__TAGS);
		createEReference(tRelationshipTypeImplementationEClass, TRELATIONSHIP_TYPE_IMPLEMENTATION__DERIVED_FROM);
		createEReference(tRelationshipTypeImplementationEClass, TRELATIONSHIP_TYPE_IMPLEMENTATION__REQUIRED_CONTAINER_FEATURES);
		createEReference(tRelationshipTypeImplementationEClass, TRELATIONSHIP_TYPE_IMPLEMENTATION__IMPLEMENTATION_ARTIFACTS);
		createEAttribute(tRelationshipTypeImplementationEClass, TRELATIONSHIP_TYPE_IMPLEMENTATION__ABSTRACT);
		createEAttribute(tRelationshipTypeImplementationEClass, TRELATIONSHIP_TYPE_IMPLEMENTATION__FINAL);
		createEAttribute(tRelationshipTypeImplementationEClass, TRELATIONSHIP_TYPE_IMPLEMENTATION__NAME);
		createEAttribute(tRelationshipTypeImplementationEClass, TRELATIONSHIP_TYPE_IMPLEMENTATION__RELATIONSHIP_TYPE);
		createEAttribute(tRelationshipTypeImplementationEClass, TRELATIONSHIP_TYPE_IMPLEMENTATION__TARGET_NAMESPACE);

		tRequiredContainerFeatureEClass = createEClass(TREQUIRED_CONTAINER_FEATURE);
		createEAttribute(tRequiredContainerFeatureEClass, TREQUIRED_CONTAINER_FEATURE__FEATURE);

		tRequiredContainerFeaturesEClass = createEClass(TREQUIRED_CONTAINER_FEATURES);
		createEReference(tRequiredContainerFeaturesEClass, TREQUIRED_CONTAINER_FEATURES__REQUIRED_CONTAINER_FEATURE);

		tRequirementEClass = createEClass(TREQUIREMENT);
		createEAttribute(tRequirementEClass, TREQUIREMENT__NAME);

		tRequirementDefinitionEClass = createEClass(TREQUIREMENT_DEFINITION);
		createEReference(tRequirementDefinitionEClass, TREQUIREMENT_DEFINITION__CONSTRAINTS);
		createEAttribute(tRequirementDefinitionEClass, TREQUIREMENT_DEFINITION__LOWER_BOUND);
		createEAttribute(tRequirementDefinitionEClass, TREQUIREMENT_DEFINITION__NAME);
		createEAttribute(tRequirementDefinitionEClass, TREQUIREMENT_DEFINITION__REQUIREMENT_TYPE);
		createEAttribute(tRequirementDefinitionEClass, TREQUIREMENT_DEFINITION__UPPER_BOUND);

		tRequirementRefEClass = createEClass(TREQUIREMENT_REF);
		createEAttribute(tRequirementRefEClass, TREQUIREMENT_REF__NAME);
		createEAttribute(tRequirementRefEClass, TREQUIREMENT_REF__REF);

		tRequirementTypeEClass = createEClass(TREQUIREMENT_TYPE);
		createEAttribute(tRequirementTypeEClass, TREQUIREMENT_TYPE__REQUIRED_CAPABILITY_TYPE);

		tServiceTemplateEClass = createEClass(TSERVICE_TEMPLATE);
		createEReference(tServiceTemplateEClass, TSERVICE_TEMPLATE__TAGS);
		createEReference(tServiceTemplateEClass, TSERVICE_TEMPLATE__BOUNDARY_DEFINITIONS);
		createEReference(tServiceTemplateEClass, TSERVICE_TEMPLATE__TOPOLOGY_TEMPLATE);
		createEReference(tServiceTemplateEClass, TSERVICE_TEMPLATE__PLANS);
		createEAttribute(tServiceTemplateEClass, TSERVICE_TEMPLATE__ID);
		createEAttribute(tServiceTemplateEClass, TSERVICE_TEMPLATE__NAME);
		createEAttribute(tServiceTemplateEClass, TSERVICE_TEMPLATE__SUBSTITUTABLE_NODE_TYPE);
		createEAttribute(tServiceTemplateEClass, TSERVICE_TEMPLATE__TARGET_NAMESPACE);

		tTagEClass = createEClass(TTAG);
		createEAttribute(tTagEClass, TTAG__NAME);
		createEAttribute(tTagEClass, TTAG__VALUE);

		tTagsEClass = createEClass(TTAGS);
		createEReference(tTagsEClass, TTAGS__TAG);

		tTopologyElementInstanceStatesEClass = createEClass(TTOPOLOGY_ELEMENT_INSTANCE_STATES);
		createEReference(tTopologyElementInstanceStatesEClass, TTOPOLOGY_ELEMENT_INSTANCE_STATES__INSTANCE_STATE);

		tTopologyTemplateEClass = createEClass(TTOPOLOGY_TEMPLATE);
		createEAttribute(tTopologyTemplateEClass, TTOPOLOGY_TEMPLATE__GROUP);
		createEReference(tTopologyTemplateEClass, TTOPOLOGY_TEMPLATE__NODE_TEMPLATE);
		createEReference(tTopologyTemplateEClass, TTOPOLOGY_TEMPLATE__RELATIONSHIP_TEMPLATE);

		typesTypeEClass = createEClass(TYPES_TYPE);
		createEAttribute(typesTypeEClass, TYPES_TYPE__ANY);

		validSourceTypeEClass = createEClass(VALID_SOURCE_TYPE);
		createEAttribute(validSourceTypeEClass, VALID_SOURCE_TYPE__TYPE_REF);

		validTargetTypeEClass = createEClass(VALID_TARGET_TYPE);
		createEAttribute(validTargetTypeEClass, VALID_TARGET_TYPE__TYPE_REF);

		// Create enums
		maxInstancesTypeMember1EEnum = createEEnum(MAX_INSTANCES_TYPE_MEMBER1);
		tBooleanEEnum = createEEnum(TBOOLEAN);
		upperBoundTypeMember1EEnum = createEEnum(UPPER_BOUND_TYPE_MEMBER1);
		upperBoundTypeMember11EEnum = createEEnum(UPPER_BOUND_TYPE_MEMBER11);

		// Create data types
		importedURIEDataType = createEDataType(IMPORTED_URI);
		maxInstancesTypeEDataType = createEDataType(MAX_INSTANCES_TYPE);
		maxInstancesTypeMember0EDataType = createEDataType(MAX_INSTANCES_TYPE_MEMBER0);
		maxInstancesTypeMember1ObjectEDataType = createEDataType(MAX_INSTANCES_TYPE_MEMBER1_OBJECT);
		tBooleanObjectEDataType = createEDataType(TBOOLEAN_OBJECT);
		upperBoundTypeEDataType = createEDataType(UPPER_BOUND_TYPE);
		upperBoundType1EDataType = createEDataType(UPPER_BOUND_TYPE1);
		upperBoundTypeMember0EDataType = createEDataType(UPPER_BOUND_TYPE_MEMBER0);
		upperBoundTypeMember01EDataType = createEDataType(UPPER_BOUND_TYPE_MEMBER01);
		upperBoundTypeMember1ObjectEDataType = createEDataType(UPPER_BOUND_TYPE_MEMBER1_OBJECT);
		upperBoundTypeMember1Object1EDataType = createEDataType(UPPER_BOUND_TYPE_MEMBER1_OBJECT1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		definitionsTypeEClass.getESuperTypes().add(this.getTDefinitions());
		implementationArtifactTypeEClass.getESuperTypes().add(this.getTImplementationArtifact());
		tArtifactTemplateEClass.getESuperTypes().add(this.getTEntityTemplate());
		tArtifactTypeEClass.getESuperTypes().add(this.getTEntityType());
		tCapabilityEClass.getESuperTypes().add(this.getTEntityTemplate());
		tCapabilityDefinitionEClass.getESuperTypes().add(this.getTExtensibleElements());
		tCapabilityTypeEClass.getESuperTypes().add(this.getTEntityType());
		tDefinitionsEClass.getESuperTypes().add(this.getTExtensibleElements());
		tDeploymentArtifactEClass.getESuperTypes().add(this.getTExtensibleElements());
		tEntityTemplateEClass.getESuperTypes().add(this.getTExtensibleElements());
		tEntityTypeEClass.getESuperTypes().add(this.getTExtensibleElements());
		tExtensionEClass.getESuperTypes().add(this.getTExtensibleElements());
		tExtensionsEClass.getESuperTypes().add(this.getTExtensibleElements());
		tImplementationArtifactEClass.getESuperTypes().add(this.getTExtensibleElements());
		tImportEClass.getESuperTypes().add(this.getTExtensibleElements());
		tNodeTemplateEClass.getESuperTypes().add(this.getTEntityTemplate());
		tNodeTypeEClass.getESuperTypes().add(this.getTEntityType());
		tNodeTypeImplementationEClass.getESuperTypes().add(this.getTExtensibleElements());
		tOperationEClass.getESuperTypes().add(this.getTExtensibleElements());
		tPlanEClass.getESuperTypes().add(this.getTExtensibleElements());
		tPolicyEClass.getESuperTypes().add(this.getTExtensibleElements());
		tPolicyTemplateEClass.getESuperTypes().add(this.getTEntityTemplate());
		tPolicyTypeEClass.getESuperTypes().add(this.getTEntityType());
		tPropertyConstraintEClass.getESuperTypes().add(this.getTConstraint());
		tRelationshipTemplateEClass.getESuperTypes().add(this.getTEntityTemplate());
		tRelationshipTypeEClass.getESuperTypes().add(this.getTEntityType());
		tRelationshipTypeImplementationEClass.getESuperTypes().add(this.getTExtensibleElements());
		tRequirementEClass.getESuperTypes().add(this.getTEntityTemplate());
		tRequirementDefinitionEClass.getESuperTypes().add(this.getTExtensibleElements());
		tRequirementTypeEClass.getESuperTypes().add(this.getTEntityType());
		tServiceTemplateEClass.getESuperTypes().add(this.getTExtensibleElements());
		tTopologyTemplateEClass.getESuperTypes().add(this.getTExtensibleElements());

		// Initialize classes, features, and operations; add parameters
		initEClass(artifactReferencesTypeEClass, ArtifactReferencesType.class, "ArtifactReferencesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArtifactReferencesType_ArtifactReference(), this.getTArtifactReference(), null, "artifactReference", null, 1, -1, ArtifactReferencesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capabilitiesType_TCapabilityEClass, CapabilitiesType_TCapability.class, "CapabilitiesType_TCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapabilitiesType_TCapability_Capability(), this.getTCapability(), null, "capability", null, 1, -1, CapabilitiesType_TCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capabilitiesType_CapabilityRefEClass, CapabilitiesType_CapabilityRef.class, "CapabilitiesType_CapabilityRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapabilitiesType_CapabilityRef_Capability(), this.getTCapabilityRef(), null, "capability", null, 1, -1, CapabilitiesType_CapabilityRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capabilityDefinitionsTypeEClass, CapabilityDefinitionsType.class, "CapabilityDefinitionsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapabilityDefinitionsType_CapabilityDefinition(), this.getTCapabilityDefinition(), null, "capabilityDefinition", null, 1, -1, CapabilityDefinitionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintsTypeEClass, ConstraintsType.class, "ConstraintsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstraintsType_Constraint(), this.getTConstraint(), null, "constraint", null, 1, -1, ConstraintsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(definitionsTypeEClass, DefinitionsType.class, "DefinitionsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(derivedFromTypeEClass, DerivedFromType.class, "DerivedFromType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDerivedFromType_DerivedFrom(), theXMLTypePackage.getQName(), "derivedFrom", null, 1, 1, DerivedFromType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, DocumentRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, DocumentRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, DocumentRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Definitions(), this.getDefinitionsType(), null, "definitions", null, 0, -2, DocumentRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Documentation(), this.getTDocumentation(), null, "documentation", null, 0, -2, DocumentRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(excludeTypeEClass, ExcludeType.class, "ExcludeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExcludeType_Pattern(), theXMLTypePackage.getString(), "pattern", null, 1, 1, ExcludeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extensionsTypeEClass, ExtensionsType.class, "ExtensionsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtensionsType_Extension(), this.getTExtension(), null, "extension", null, 1, -1, ExtensionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(implementationArtifactTypeEClass, ImplementationArtifactType.class, "ImplementationArtifactType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(includeTypeEClass, IncludeType.class, "IncludeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIncludeType_Pattern(), theXMLTypePackage.getString(), "pattern", null, 1, 1, IncludeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputParametersTypeEClass, InputParametersType.class, "InputParametersType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputParametersType_InputParameter(), this.getTParameter(), null, "inputParameter", null, 1, -1, InputParametersType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instanceStateTypeEClass, InstanceStateType.class, "InstanceStateType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstanceStateType_State(), theXMLTypePackage.getAnyURI(), "state", null, 1, 1, InstanceStateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfacesType_TInterfaceEClass, InterfacesType_TInterface.class, "InterfacesType_TInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfacesType_TInterface_Interface(), this.getTInterface(), null, "interface", null, 1, -1, InterfacesType_TInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfacesType_TExportedInterfaceEClass, InterfacesType_TExportedInterface.class, "InterfacesType_TExportedInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfacesType_TExportedInterface_Interface(), this.getTExportedInterface(), null, "interface", null, 1, -1, InterfacesType_TExportedInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeOperationTypeEClass, NodeOperationType.class, "NodeOperationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNodeOperationType_InterfaceName(), theXMLTypePackage.getAnyURI(), "interfaceName", null, 1, 1, NodeOperationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeOperationType_NodeRef(), theXMLTypePackage.getIDREF(), "nodeRef", null, 1, 1, NodeOperationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeOperationType_OperationName(), theXMLTypePackage.getNCName(), "operationName", null, 1, 1, NodeOperationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeTypeReferenceTypeEClass, NodeTypeReferenceType.class, "NodeTypeReferenceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNodeTypeReferenceType_TypeRef(), theXMLTypePackage.getQName(), "typeRef", null, 1, 1, NodeTypeReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputParametersTypeEClass, OutputParametersType.class, "OutputParametersType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutputParametersType_OutputParameter(), this.getTParameter(), null, "outputParameter", null, 1, -1, OutputParametersType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(planModelReferenceTypeEClass, PlanModelReferenceType.class, "PlanModelReferenceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlanModelReferenceType_Reference(), theXMLTypePackage.getAnyURI(), "reference", null, 1, 1, PlanModelReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(planModelTypeEClass, PlanModelType.class, "PlanModelType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlanModelType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 1, 1, PlanModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(planTypeEClass, PlanType.class, "PlanType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlanType_PlanRef(), theXMLTypePackage.getIDREF(), "planRef", null, 1, 1, PlanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(policiesTypeEClass, PoliciesType.class, "PoliciesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPoliciesType_Policy(), this.getTPolicy(), null, "policy", null, 1, -1, PoliciesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertiesDefinitionTypeEClass, PropertiesDefinitionType.class, "PropertiesDefinitionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertiesDefinitionType_Element(), theXMLTypePackage.getQName(), "element", null, 0, 1, PropertiesDefinitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertiesDefinitionType_Type(), theXMLTypePackage.getQName(), "type", null, 0, 1, PropertiesDefinitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertiesTypeEClass, PropertiesType.class, "PropertiesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertiesType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 1, 1, PropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertiesTypeWithPropertyMappingsEClass, PropertiesTypeWithPropertyMappings.class, "PropertiesTypeWithPropertyMappings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertiesTypeWithPropertyMappings_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 1, 1, PropertiesTypeWithPropertyMappings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertiesTypeWithPropertyMappings_PropertyMappings(), this.getPropertyMappingsType(), null, "propertyMappings", null, 0, 1, PropertiesTypeWithPropertyMappings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyConstraintsTypeEClass, PropertyConstraintsType.class, "PropertyConstraintsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyConstraintsType_PropertyConstraint(), this.getTPropertyConstraint(), null, "propertyConstraint", null, 1, -1, PropertyConstraintsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyMappingsTypeEClass, PropertyMappingsType.class, "PropertyMappingsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyMappingsType_PropertyMapping(), this.getTPropertyMapping(), null, "propertyMapping", null, 1, -1, PropertyMappingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipConstraintsTypeEClass, RelationshipConstraintsType.class, "RelationshipConstraintsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationshipConstraintsType_RelationshipConstraint(), this.getRelationshipConstraintType(), null, "relationshipConstraint", null, 1, -1, RelationshipConstraintsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipConstraintTypeEClass, RelationshipConstraintType.class, "RelationshipConstraintType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationshipConstraintType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, 1, RelationshipConstraintType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipConstraintType_ConstraintType(), theXMLTypePackage.getAnyURI(), "constraintType", null, 1, 1, RelationshipConstraintType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipOperationTypeEClass, RelationshipOperationType.class, "RelationshipOperationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationshipOperationType_InterfaceName(), theXMLTypePackage.getAnyURI(), "interfaceName", null, 1, 1, RelationshipOperationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipOperationType_OperationName(), theXMLTypePackage.getNCName(), "operationName", null, 1, 1, RelationshipOperationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipOperationType_RelationshipRef(), theXMLTypePackage.getIDREF(), "relationshipRef", null, 1, 1, RelationshipOperationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementDefinitionsTypeEClass, RequirementDefinitionsType.class, "RequirementDefinitionsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequirementDefinitionsType_RequirementDefinition(), this.getTRequirementDefinition(), null, "requirementDefinition", null, 1, -1, RequirementDefinitionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementsType_TRequirementEClass, RequirementsType_TRequirement.class, "RequirementsType_TRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequirementsType_TRequirement_Requirement(), this.getTRequirement(), null, "requirement", null, 1, -1, RequirementsType_TRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementsType_TRequirementRefEClass, RequirementsType_TRequirementRef.class, "RequirementsType_TRequirementRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequirementsType_TRequirementRef_Requirement(), this.getTRequirementRef(), null, "requirement", null, 1, -1, RequirementsType_TRequirementRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourceElementTypeEClass, SourceElementType.class, "SourceElementType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSourceElementType_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 1, 1, SourceElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourceInterfacesTypeEClass, SourceInterfacesType.class, "SourceInterfacesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSourceInterfacesType_Interface(), this.getTInterface(), null, "interface", null, 1, -1, SourceInterfacesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tAppliesToEClass, TAppliesTo.class, "TAppliesTo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTAppliesTo_NodeTypeReference(), this.getNodeTypeReferenceType(), null, "nodeTypeReference", null, 1, -1, TAppliesTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(targetElementTypeEClass, TargetElementType.class, "TargetElementType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTargetElementType_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 1, 1, TargetElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(targetInterfacesTypeEClass, TargetInterfacesType.class, "TargetInterfacesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTargetInterfacesType_Interface(), this.getTInterface(), null, "interface", null, 1, -1, TargetInterfacesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tArtifactReferenceEClass, TArtifactReference.class, "TArtifactReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTArtifactReference_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, TArtifactReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTArtifactReference_Include(), this.getIncludeType(), null, "include", null, 0, -1, TArtifactReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTArtifactReference_Exclude(), this.getExcludeType(), null, "exclude", null, 0, -1, TArtifactReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTArtifactReference_Reference(), theXMLTypePackage.getAnyURI(), "reference", null, 1, 1, TArtifactReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tArtifactTemplateEClass, TArtifactTemplate.class, "TArtifactTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTArtifactTemplate_ArtifactReferences(), this.getArtifactReferencesType(), null, "artifactReferences", null, 0, 1, TArtifactTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTArtifactTemplate_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, TArtifactTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tArtifactTypeEClass, TArtifactType.class, "TArtifactType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tBoundaryDefinitionsEClass, TBoundaryDefinitions.class, "TBoundaryDefinitions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTBoundaryDefinitions_Properties(), this.getPropertiesTypeWithPropertyMappings(), null, "properties", null, 0, 1, TBoundaryDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTBoundaryDefinitions_PropertyConstraints(), this.getPropertyConstraintsType(), null, "propertyConstraints", null, 0, 1, TBoundaryDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTBoundaryDefinitions_Requirements(), this.getRequirementsType_TRequirementRef(), null, "requirements", null, 0, 1, TBoundaryDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTBoundaryDefinitions_Capabilities(), this.getCapabilitiesType_CapabilityRef(), null, "capabilities", null, 0, 1, TBoundaryDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTBoundaryDefinitions_Policies(), this.getPoliciesType(), null, "policies", null, 0, 1, TBoundaryDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTBoundaryDefinitions_Interfaces(), this.getInterfacesType_TExportedInterface(), null, "interfaces", null, 0, 1, TBoundaryDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tCapabilityEClass, TCapability.class, "TCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTCapability_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, TCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tCapabilityDefinitionEClass, TCapabilityDefinition.class, "TCapabilityDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTCapabilityDefinition_Constraints(), this.getConstraintsType(), null, "constraints", null, 0, 1, TCapabilityDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCapabilityDefinition_CapabilityType(), theXMLTypePackage.getQName(), "capabilityType", null, 1, 1, TCapabilityDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCapabilityDefinition_LowerBound(), theXMLTypePackage.getInt(), "lowerBound", "1", 0, 1, TCapabilityDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCapabilityDefinition_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, TCapabilityDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCapabilityDefinition_UpperBound(), this.getUpperBoundType(), "upperBound", "1", 0, 1, TCapabilityDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tCapabilityRefEClass, TCapabilityRef.class, "TCapabilityRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTCapabilityRef_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, TCapabilityRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCapabilityRef_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 1, 1, TCapabilityRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tCapabilityTypeEClass, TCapabilityType.class, "TCapabilityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tConditionEClass, TCondition.class, "TCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTCondition_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, TCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCondition_ExpressionLanguage(), theXMLTypePackage.getAnyURI(), "expressionLanguage", null, 1, 1, TCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tConstraintEClass, TConstraint.class, "TConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTConstraint_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 1, 1, TConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTConstraint_ConstraintType(), theXMLTypePackage.getAnyURI(), "constraintType", null, 1, 1, TConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tDefinitionsEClass, TDefinitions.class, "TDefinitions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTDefinitions_Extensions(), this.getExtensionsType(), null, "extensions", null, 0, 1, TDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTDefinitions_Import(), this.getTImport(), null, "import", null, 0, -1, TDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTDefinitions_Types(), this.getTypesType(), null, "types", null, 0, 1, TDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTDefinitions_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, TDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTDefinitions_ServiceTemplate(), this.getTServiceTemplate(), null, "serviceTemplate", null, 0, -1, TDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTDefinitions_NodeType(), this.getTNodeType(), null, "nodeType", null, 0, -1, TDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTDefinitions_NodeTypeImplementation(), this.getTNodeTypeImplementation(), null, "nodeTypeImplementation", null, 0, -1, TDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTDefinitions_RelationshipType(), this.getTRelationshipType(), null, "relationshipType", null, 0, -1, TDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTDefinitions_RelationshipTypeImplementation(), this.getTRelationshipTypeImplementation(), null, "relationshipTypeImplementation", null, 0, -1, TDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTDefinitions_RequirementType(), this.getTRequirementType(), null, "requirementType", null, 0, -1, TDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTDefinitions_CapabilityType(), this.getTCapabilityType(), null, "capabilityType", null, 0, -1, TDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTDefinitions_ArtifactType(), this.getTArtifactType(), null, "artifactType", null, 0, -1, TDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTDefinitions_ArtifactTemplate(), this.getTArtifactTemplate(), null, "artifactTemplate", null, 0, -1, TDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTDefinitions_PolicyType(), this.getTPolicyType(), null, "policyType", null, 0, -1, TDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTDefinitions_PolicyTemplate(), this.getTPolicyTemplate(), null, "policyTemplate", null, 0, -1, TDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTDefinitions_Id(), theXMLTypePackage.getID(), "id", null, 1, 1, TDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTDefinitions_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, TDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTDefinitions_TargetNamespace(), theXMLTypePackage.getAnyURI(), "targetNamespace", null, 1, 1, TDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tDeploymentArtifactEClass, TDeploymentArtifact.class, "TDeploymentArtifact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTDeploymentArtifact_ArtifactRef(), theXMLTypePackage.getQName(), "artifactRef", null, 0, 1, TDeploymentArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTDeploymentArtifact_ArtifactType(), theXMLTypePackage.getQName(), "artifactType", null, 1, 1, TDeploymentArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTDeploymentArtifact_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, TDeploymentArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tDeploymentArtifactsEClass, TDeploymentArtifacts.class, "TDeploymentArtifacts", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTDeploymentArtifacts_DeploymentArtifact(), this.getTDeploymentArtifact(), null, "deploymentArtifact", null, 1, -1, TDeploymentArtifacts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tDocumentationEClass, TDocumentation.class, "TDocumentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTDocumentation_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, TDocumentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTDocumentation_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, TDocumentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTDocumentation_Lang(), theXMLTypePackage.getString(), "lang", null, 0, 1, TDocumentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTDocumentation_Source(), theXMLTypePackage.getAnyURI(), "source", null, 0, 1, TDocumentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tEntityTemplateEClass, TEntityTemplate.class, "TEntityTemplate", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTEntityTemplate_Properties(), this.getPropertiesType(), null, "properties", null, 0, -1, TEntityTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTEntityTemplate_PropertyConstraints(), this.getPropertyConstraintsType(), null, "propertyConstraints", null, 0, 1, TEntityTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTEntityTemplate_Id(), theXMLTypePackage.getID(), "id", null, 1, 1, TEntityTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTEntityTemplate_Type(), theXMLTypePackage.getQName(), "type", null, 1, 1, TEntityTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tEntityTypeEClass, TEntityType.class, "TEntityType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTEntityType_Tags(), this.getTTags(), null, "tags", null, 0, 1, TEntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTEntityType_DerivedFrom(), this.getDerivedFromType(), null, "derivedFrom", null, 0, 1, TEntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTEntityType_PropertiesDefinition(), this.getPropertiesDefinitionType(), null, "propertiesDefinition", null, 0, 1, TEntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTEntityType_Abstract(), this.getTBoolean(), "abstract", "no", 0, 1, TEntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTEntityType_Final(), this.getTBoolean(), "final", "no", 0, 1, TEntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTEntityType_Name(), theXMLTypePackage.getNCName(), "name", null, 1, 1, TEntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTEntityType_TargetNamespace(), theXMLTypePackage.getAnyURI(), "targetNamespace", null, 0, 1, TEntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tExportedInterfaceEClass, TExportedInterface.class, "TExportedInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTExportedInterface_Operation(), this.getTExportedOperation(), null, "operation", null, 1, -1, TExportedInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTExportedInterface_Name(), theXMLTypePackage.getAnyURI(), "name", null, 1, 1, TExportedInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tExportedOperationEClass, TExportedOperation.class, "TExportedOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTExportedOperation_NodeOperation(), this.getNodeOperationType(), null, "nodeOperation", null, 0, 1, TExportedOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTExportedOperation_RelationshipOperation(), this.getRelationshipOperationType(), null, "relationshipOperation", null, 0, 1, TExportedOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTExportedOperation_Plan(), this.getPlanType(), null, "plan", null, 0, 1, TExportedOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTExportedOperation_Name(), theXMLTypePackage.getNCName(), "name", null, 1, 1, TExportedOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tExtensibleElementsEClass, TExtensibleElements.class, "TExtensibleElements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTExtensibleElements_Documentation(), this.getTDocumentation(), null, "documentation", null, 0, -1, TExtensibleElements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTExtensibleElements_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, TExtensibleElements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTExtensibleElements_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, TExtensibleElements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tExtensionEClass, TExtension.class, "TExtension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTExtension_MustUnderstand(), this.getTBoolean(), "mustUnderstand", "yes", 0, 1, TExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTExtension_Namespace(), theXMLTypePackage.getAnyURI(), "namespace", null, 1, 1, TExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tExtensionsEClass, TExtensions.class, "TExtensions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTExtensions_Extension(), this.getTExtension(), null, "extension", null, 1, -1, TExtensions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tImplementationArtifactEClass, TImplementationArtifact.class, "TImplementationArtifact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTImplementationArtifact_ArtifactRef(), theXMLTypePackage.getQName(), "artifactRef", null, 0, 1, TImplementationArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTImplementationArtifact_ArtifactType(), theXMLTypePackage.getQName(), "artifactType", null, 1, 1, TImplementationArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTImplementationArtifact_InterfaceName(), theXMLTypePackage.getAnyURI(), "interfaceName", null, 0, 1, TImplementationArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTImplementationArtifact_OperationName(), theXMLTypePackage.getNCName(), "operationName", null, 0, 1, TImplementationArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tImplementationArtifactsEClass, TImplementationArtifacts.class, "TImplementationArtifacts", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTImplementationArtifacts_ImplementationArtifact(), this.getImplementationArtifactType(), null, "implementationArtifact", null, 1, -1, TImplementationArtifacts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tImportEClass, TImport.class, "TImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTImport_ImportType(), this.getImportedURI(), "importType", null, 1, 1, TImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTImport_Location(), theXMLTypePackage.getAnyURI(), "location", null, 0, 1, TImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTImport_Namespace(), theXMLTypePackage.getAnyURI(), "namespace", null, 0, 1, TImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tInterfaceEClass, TInterface.class, "TInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTInterface_Operation(), this.getTOperation(), null, "operation", null, 1, -1, TInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTInterface_Name(), theXMLTypePackage.getAnyURI(), "name", null, 1, 1, TInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tNodeTemplateEClass, TNodeTemplate.class, "TNodeTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTNodeTemplate_Requirements(), this.getRequirementsType_TRequirement(), null, "requirements", null, 0, 1, TNodeTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTNodeTemplate_Capabilities(), this.getCapabilitiesType_TCapability(), null, "capabilities", null, 0, 1, TNodeTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTNodeTemplate_Policies(), this.getPoliciesType(), null, "policies", null, 0, 1, TNodeTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTNodeTemplate_DeploymentArtifacts(), this.getTDeploymentArtifacts(), null, "deploymentArtifacts", null, 0, 1, TNodeTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTNodeTemplate_MaxInstances(), this.getMaxInstancesType(), "maxInstances", "1", 0, 1, TNodeTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTNodeTemplate_MinInstances(), theXMLTypePackage.getInt(), "minInstances", "1", 0, 1, TNodeTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTNodeTemplate_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, TNodeTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tNodeTypeEClass, TNodeType.class, "TNodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTNodeType_RequirementDefinitions(), this.getRequirementDefinitionsType(), null, "requirementDefinitions", null, 0, 1, TNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTNodeType_CapabilityDefinitions(), this.getCapabilityDefinitionsType(), null, "capabilityDefinitions", null, 0, 1, TNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTNodeType_InstanceStates(), this.getTTopologyElementInstanceStates(), null, "instanceStates", null, 0, 1, TNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTNodeType_Interfaces(), this.getInterfacesType_TInterface(), null, "interfaces", null, 0, 1, TNodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tNodeTypeImplementationEClass, TNodeTypeImplementation.class, "TNodeTypeImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTNodeTypeImplementation_Tags(), this.getTTags(), null, "tags", null, 0, 1, TNodeTypeImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTNodeTypeImplementation_DerivedFrom(), this.getDerivedFromType(), null, "derivedFrom", null, 0, 1, TNodeTypeImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTNodeTypeImplementation_RequiredContainerFeatures(), this.getTRequiredContainerFeatures(), null, "requiredContainerFeatures", null, 0, 1, TNodeTypeImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTNodeTypeImplementation_ImplementationArtifacts(), this.getTImplementationArtifacts(), null, "implementationArtifacts", null, 0, 1, TNodeTypeImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTNodeTypeImplementation_DeploymentArtifacts(), this.getTDeploymentArtifacts(), null, "deploymentArtifacts", null, 0, 1, TNodeTypeImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTNodeTypeImplementation_Abstract(), this.getTBoolean(), "abstract", "no", 0, 1, TNodeTypeImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTNodeTypeImplementation_Final(), this.getTBoolean(), "final", "no", 0, 1, TNodeTypeImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTNodeTypeImplementation_Name(), theXMLTypePackage.getNCName(), "name", null, 1, 1, TNodeTypeImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTNodeTypeImplementation_NodeType(), theXMLTypePackage.getQName(), "nodeType", null, 1, 1, TNodeTypeImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTNodeTypeImplementation_TargetNamespace(), theXMLTypePackage.getAnyURI(), "targetNamespace", null, 0, 1, TNodeTypeImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tOperationEClass, TOperation.class, "TOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTOperation_InputParameters(), this.getInputParametersType(), null, "inputParameters", null, 0, 1, TOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTOperation_OutputParameters(), this.getOutputParametersType(), null, "outputParameters", null, 0, 1, TOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTOperation_Name(), theXMLTypePackage.getNCName(), "name", null, 1, 1, TOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tParameterEClass, TParameter.class, "TParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTParameter_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, TParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTParameter_Required(), this.getTBoolean(), "required", "yes", 0, 1, TParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTParameter_Type(), theXMLTypePackage.getString(), "type", null, 1, 1, TParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tPlanEClass, TPlan.class, "TPlan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTPlan_Precondition(), this.getTCondition(), null, "precondition", null, 0, 1, TPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTPlan_InputParameters(), this.getInputParametersType(), null, "inputParameters", null, 0, 1, TPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTPlan_OutputParameters(), this.getOutputParametersType(), null, "outputParameters", null, 0, 1, TPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTPlan_PlanModel(), this.getPlanModelType(), null, "planModel", null, 0, 1, TPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTPlan_PlanModelReference(), this.getPlanModelReferenceType(), null, "planModelReference", null, 0, 1, TPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTPlan_Id(), theXMLTypePackage.getID(), "id", null, 1, 1, TPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTPlan_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, TPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTPlan_PlanLanguage(), theXMLTypePackage.getAnyURI(), "planLanguage", null, 1, 1, TPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTPlan_PlanType(), theXMLTypePackage.getAnyURI(), "planType", null, 1, 1, TPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tPlansEClass, TPlans.class, "TPlans", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTPlans_Plan(), this.getTPlan(), null, "plan", null, 1, -1, TPlans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTPlans_TargetNamespace(), theXMLTypePackage.getAnyURI(), "targetNamespace", null, 0, 1, TPlans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tPolicyEClass, TPolicy.class, "TPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTPolicy_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, TPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTPolicy_PolicyRef(), theXMLTypePackage.getQName(), "policyRef", null, 0, 1, TPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTPolicy_PolicyType(), theXMLTypePackage.getQName(), "policyType", null, 1, 1, TPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tPolicyTemplateEClass, TPolicyTemplate.class, "TPolicyTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTPolicyTemplate_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, TPolicyTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tPolicyTypeEClass, TPolicyType.class, "TPolicyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTPolicyType_AppliesTo(), this.getTAppliesTo(), null, "appliesTo", null, 0, 1, TPolicyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTPolicyType_PolicyLanguage(), theXMLTypePackage.getAnyURI(), "policyLanguage", null, 0, 1, TPolicyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tPropertyConstraintEClass, TPropertyConstraint.class, "TPropertyConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTPropertyConstraint_Property(), theXMLTypePackage.getString(), "property", null, 1, 1, TPropertyConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tPropertyMappingEClass, TPropertyMapping.class, "TPropertyMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTPropertyMapping_ServiceTemplatePropertyRef(), theXMLTypePackage.getString(), "serviceTemplatePropertyRef", null, 1, 1, TPropertyMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTPropertyMapping_TargetObjectRef(), theXMLTypePackage.getIDREF(), "targetObjectRef", null, 1, 1, TPropertyMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTPropertyMapping_TargetPropertyRef(), theXMLTypePackage.getString(), "targetPropertyRef", null, 1, 1, TPropertyMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tRelationshipTemplateEClass, TRelationshipTemplate.class, "TRelationshipTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTRelationshipTemplate_SourceElement(), this.getSourceElementType(), null, "sourceElement", null, 1, 1, TRelationshipTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTRelationshipTemplate_TargetElement(), this.getTargetElementType(), null, "targetElement", null, 1, 1, TRelationshipTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTRelationshipTemplate_RelationshipConstraints(), this.getRelationshipConstraintsType(), null, "relationshipConstraints", null, 0, 1, TRelationshipTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTRelationshipTemplate_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, TRelationshipTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tRelationshipTypeEClass, TRelationshipType.class, "TRelationshipType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTRelationshipType_InstanceStates(), this.getTTopologyElementInstanceStates(), null, "instanceStates", null, 0, 1, TRelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTRelationshipType_SourceInterfaces(), this.getSourceInterfacesType(), null, "sourceInterfaces", null, 0, 1, TRelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTRelationshipType_TargetInterfaces(), this.getTargetInterfacesType(), null, "targetInterfaces", null, 0, 1, TRelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTRelationshipType_ValidSource(), this.getValidSourceType(), null, "validSource", null, 0, 1, TRelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTRelationshipType_ValidTarget(), this.getValidTargetType(), null, "validTarget", null, 0, 1, TRelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tRelationshipTypeImplementationEClass, TRelationshipTypeImplementation.class, "TRelationshipTypeImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTRelationshipTypeImplementation_Tags(), this.getTTags(), null, "tags", null, 0, 1, TRelationshipTypeImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTRelationshipTypeImplementation_DerivedFrom(), this.getDerivedFromType(), null, "derivedFrom", null, 0, 1, TRelationshipTypeImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTRelationshipTypeImplementation_RequiredContainerFeatures(), this.getTRequiredContainerFeatures(), null, "requiredContainerFeatures", null, 0, 1, TRelationshipTypeImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTRelationshipTypeImplementation_ImplementationArtifacts(), this.getTImplementationArtifacts(), null, "implementationArtifacts", null, 0, 1, TRelationshipTypeImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTRelationshipTypeImplementation_Abstract(), this.getTBoolean(), "abstract", "no", 0, 1, TRelationshipTypeImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTRelationshipTypeImplementation_Final(), this.getTBoolean(), "final", "no", 0, 1, TRelationshipTypeImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTRelationshipTypeImplementation_Name(), theXMLTypePackage.getNCName(), "name", null, 1, 1, TRelationshipTypeImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTRelationshipTypeImplementation_RelationshipType(), theXMLTypePackage.getQName(), "relationshipType", null, 1, 1, TRelationshipTypeImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTRelationshipTypeImplementation_TargetNamespace(), theXMLTypePackage.getAnyURI(), "targetNamespace", null, 0, 1, TRelationshipTypeImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tRequiredContainerFeatureEClass, TRequiredContainerFeature.class, "TRequiredContainerFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTRequiredContainerFeature_Feature(), theXMLTypePackage.getAnyURI(), "feature", null, 1, 1, TRequiredContainerFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tRequiredContainerFeaturesEClass, TRequiredContainerFeatures.class, "TRequiredContainerFeatures", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTRequiredContainerFeatures_RequiredContainerFeature(), this.getTRequiredContainerFeature(), null, "requiredContainerFeature", null, 1, -1, TRequiredContainerFeatures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tRequirementEClass, TRequirement.class, "TRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTRequirement_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, TRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tRequirementDefinitionEClass, TRequirementDefinition.class, "TRequirementDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTRequirementDefinition_Constraints(), this.getConstraintsType(), null, "constraints", null, 0, 1, TRequirementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTRequirementDefinition_LowerBound(), theXMLTypePackage.getInt(), "lowerBound", "1", 0, 1, TRequirementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTRequirementDefinition_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, TRequirementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTRequirementDefinition_RequirementType(), theXMLTypePackage.getQName(), "requirementType", null, 1, 1, TRequirementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTRequirementDefinition_UpperBound(), this.getUpperBoundType1(), "upperBound", "1", 0, 1, TRequirementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tRequirementRefEClass, TRequirementRef.class, "TRequirementRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTRequirementRef_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, TRequirementRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTRequirementRef_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 1, 1, TRequirementRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tRequirementTypeEClass, TRequirementType.class, "TRequirementType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTRequirementType_RequiredCapabilityType(), theXMLTypePackage.getQName(), "requiredCapabilityType", null, 0, 1, TRequirementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tServiceTemplateEClass, TServiceTemplate.class, "TServiceTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTServiceTemplate_Tags(), this.getTTags(), null, "tags", null, 0, 1, TServiceTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTServiceTemplate_BoundaryDefinitions(), this.getTBoundaryDefinitions(), null, "boundaryDefinitions", null, 0, 1, TServiceTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTServiceTemplate_TopologyTemplate(), this.getTTopologyTemplate(), null, "topologyTemplate", null, 1, 1, TServiceTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTServiceTemplate_Plans(), this.getTPlans(), null, "plans", null, 0, 1, TServiceTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTServiceTemplate_Id(), theXMLTypePackage.getID(), "id", null, 1, 1, TServiceTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTServiceTemplate_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, TServiceTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTServiceTemplate_SubstitutableNodeType(), theXMLTypePackage.getQName(), "substitutableNodeType", null, 0, 1, TServiceTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTServiceTemplate_TargetNamespace(), theXMLTypePackage.getAnyURI(), "targetNamespace", null, 0, 1, TServiceTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tTagEClass, TTag.class, "TTag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTTag_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, TTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTTag_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, TTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tTagsEClass, TTags.class, "TTags", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTTags_Tag(), this.getTTag(), null, "tag", null, 1, -1, TTags.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tTopologyElementInstanceStatesEClass, TTopologyElementInstanceStates.class, "TTopologyElementInstanceStates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTTopologyElementInstanceStates_InstanceState(), this.getInstanceStateType(), null, "instanceState", null, 1, -1, TTopologyElementInstanceStates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tTopologyTemplateEClass, TTopologyTemplate.class, "TTopologyTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTTopologyTemplate_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, TTopologyTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTTopologyTemplate_NodeTemplate(), this.getTNodeTemplate(), null, "nodeTemplate", null, 0, -1, TTopologyTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTTopologyTemplate_RelationshipTemplate(), this.getTRelationshipTemplate(), null, "relationshipTemplate", null, 0, -1, TTopologyTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typesTypeEClass, TypesType.class, "TypesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypesType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, TypesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(validSourceTypeEClass, ValidSourceType.class, "ValidSourceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValidSourceType_TypeRef(), theXMLTypePackage.getQName(), "typeRef", null, 1, 1, ValidSourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(validTargetTypeEClass, ValidTargetType.class, "ValidTargetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValidTargetType_TypeRef(), theXMLTypePackage.getQName(), "typeRef", null, 1, 1, ValidTargetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(maxInstancesTypeMember1EEnum, MaxInstancesTypeMember1.class, "MaxInstancesTypeMember1");
		addEEnumLiteral(maxInstancesTypeMember1EEnum, MaxInstancesTypeMember1.UNBOUNDED);

		initEEnum(tBooleanEEnum, TBoolean.class, "TBoolean");
		addEEnumLiteral(tBooleanEEnum, TBoolean.YES);
		addEEnumLiteral(tBooleanEEnum, TBoolean.NO);

		initEEnum(upperBoundTypeMember1EEnum, UpperBoundTypeMember1.class, "UpperBoundTypeMember1");
		addEEnumLiteral(upperBoundTypeMember1EEnum, UpperBoundTypeMember1.UNBOUNDED);

		initEEnum(upperBoundTypeMember11EEnum, UpperBoundTypeMember11.class, "UpperBoundTypeMember11");
		addEEnumLiteral(upperBoundTypeMember11EEnum, UpperBoundTypeMember11.UNBOUNDED);

		// Initialize data types
		initEDataType(importedURIEDataType, String.class, "ImportedURI", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(maxInstancesTypeEDataType, Object.class, "MaxInstancesType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(maxInstancesTypeMember0EDataType, BigInteger.class, "MaxInstancesTypeMember0", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(maxInstancesTypeMember1ObjectEDataType, MaxInstancesTypeMember1.class, "MaxInstancesTypeMember1Object", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(tBooleanObjectEDataType, TBoolean.class, "TBooleanObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(upperBoundTypeEDataType, Object.class, "UpperBoundType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(upperBoundType1EDataType, Object.class, "UpperBoundType1", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(upperBoundTypeMember0EDataType, BigInteger.class, "UpperBoundTypeMember0", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(upperBoundTypeMember01EDataType, BigInteger.class, "UpperBoundTypeMember01", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(upperBoundTypeMember1ObjectEDataType, UpperBoundTypeMember1.class, "UpperBoundTypeMember1Object", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(upperBoundTypeMember1Object1EDataType, UpperBoundTypeMember11.class, "UpperBoundTypeMember1Object1", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });	
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });	
		addAnnotation
		  (importedURIEDataType, 
		   source, 
		   new String[] {
			 "name", "importedURI",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#anyURI"
		   });	
		addAnnotation
		  (maxInstancesTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "maxInstances_._type",
			 "memberTypes", "maxInstances_._type_._member_._0 maxInstances_._type_._member_._1"
		   });	
		addAnnotation
		  (maxInstancesTypeMember0EDataType, 
		   source, 
		   new String[] {
			 "name", "maxInstances_._type_._member_._0",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger",
			 "pattern", "([1-9]+[0-9]*)"
		   });	
		addAnnotation
		  (maxInstancesTypeMember1EEnum, 
		   source, 
		   new String[] {
			 "name", "maxInstances_._type_._member_._1"
		   });	
		addAnnotation
		  (maxInstancesTypeMember1ObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "maxInstances_._type_._member_._1:Object",
			 "baseType", "maxInstances_._type_._member_._1"
		   });	
		addAnnotation
		  (tBooleanEEnum, 
		   source, 
		   new String[] {
			 "name", "tBoolean"
		   });	
		addAnnotation
		  (tBooleanObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "tBoolean:Object",
			 "baseType", "tBoolean"
		   });	
		addAnnotation
		  (getTDefinitions_Types(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Types",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTDefinitions_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:6"
		   });	
		addAnnotation
		  (getTDocumentation_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getTDocumentation_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##any",
			 "name", ":1",
			 "processing", "lax"
		   });	
		addAnnotation
		  (getTExtensibleElements_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":1",
			 "processing", "lax"
		   });	
		addAnnotation
		  (getTExtensibleElements_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":2",
			 "processing", "lax"
		   });	
		addAnnotation
		  (upperBoundTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "upperBound_._type",
			 "memberTypes", "upperBound_._type_._member_._0 upperBound_._type_._member_._1"
		   });	
		addAnnotation
		  (upperBoundType1EDataType, 
		   source, 
		   new String[] {
			 "name", "upperBound_._1_._type",
			 "memberTypes", "upperBound_._1_._type_._member_._0 upperBound_._1_._type_._member_._1"
		   });	
		addAnnotation
		  (upperBoundTypeMember0EDataType, 
		   source, 
		   new String[] {
			 "name", "upperBound_._type_._member_._0",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger",
			 "pattern", "([1-9]+[0-9]*)"
		   });	
		addAnnotation
		  (upperBoundTypeMember01EDataType, 
		   source, 
		   new String[] {
			 "name", "upperBound_._1_._type_._member_._0",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger",
			 "pattern", "([1-9]+[0-9]*)"
		   });	
		addAnnotation
		  (upperBoundTypeMember1EEnum, 
		   source, 
		   new String[] {
			 "name", "upperBound_._type_._member_._1"
		   });	
		addAnnotation
		  (upperBoundTypeMember11EEnum, 
		   source, 
		   new String[] {
			 "name", "upperBound_._1_._type_._member_._1"
		   });	
		addAnnotation
		  (upperBoundTypeMember1ObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "upperBound_._type_._member_._1:Object",
			 "baseType", "upperBound_._type_._member_._1"
		   });	
		addAnnotation
		  (upperBoundTypeMember1Object1EDataType, 
		   source, 
		   new String[] {
			 "name", "upperBound_._1_._type_._member_._1:Object",
			 "baseType", "upperBound_._1_._type_._member_._1"
		   });
	}

} //ToscaPackageImpl
