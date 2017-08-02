/**
 */
package caex.impl;

import caex.*;

import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CaexFactoryImpl extends EFactoryImpl implements CaexFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CaexFactory init() {
		try {
			CaexFactory theCaexFactory = (CaexFactory)EPackage.Registry.INSTANCE.getEFactory(CaexPackage.eNS_URI);
			if (theCaexFactory != null) {
				return theCaexFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CaexFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaexFactoryImpl() {
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
			case CaexPackage.ATTRIBUTE_NAME_MAPPING: return createAttributeNameMapping();
			case CaexPackage.ATTRIBUTE: return createAttribute();
			case CaexPackage.ATTRIBUTE_VALUE_REQUIREMENT: return createAttributeValueRequirement();
			case CaexPackage.CAEX_BASIC_OBJECT: return createCAEXBasicObject();
			case CaexPackage.CAEX_FILE: return createCAEXFile();
			case CaexPackage.CAEX_OBJECT: return createCAEXObject();
			case CaexPackage.COPYRIGHT: return createCopyright();
			case CaexPackage.DESCRIPTION: return createDescription();
			case CaexPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case CaexPackage.EXTERNAL_INTERFACE: return createExternalInterface();
			case CaexPackage.EXTERNAL_REFERENCE: return createExternalReference();
			case CaexPackage.INSTANCE_HIERARCHY: return createInstanceHierarchy();
			case CaexPackage.INTERFACE_CLASS_LIB: return createInterfaceClassLib();
			case CaexPackage.INTERFACE_CLASS: return createInterfaceClass();
			case CaexPackage.INTERFACE_FAMILY: return createInterfaceFamily();
			case CaexPackage.INTERFACE_NAME_MAPPING: return createInterfaceNameMapping();
			case CaexPackage.INTERNAL_ELEMENT: return createInternalElement();
			case CaexPackage.INTERNAL_LINK: return createInternalLink();
			case CaexPackage.MAPPING: return createMapping();
			case CaexPackage.NOMINAL_SCALED: return createNominalScaled();
			case CaexPackage.ORDINAL_SCALED: return createOrdinalScaled();
			case CaexPackage.REF_SEMANTIC: return createRefSemantic();
			case CaexPackage.REVISION: return createRevision();
			case CaexPackage.ROLE_CLASS_LIB: return createRoleClassLib();
			case CaexPackage.ROLE_CLASS: return createRoleClass();
			case CaexPackage.ROLE_FAMILY: return createRoleFamily();
			case CaexPackage.ROLE_REQUIREMENTS: return createRoleRequirements();
			case CaexPackage.SUPPORTED_ROLE_CLASS: return createSupportedRoleClass();
			case CaexPackage.SYSTEM_UNIT_CLASS_LIB: return createSystemUnitClassLib();
			case CaexPackage.SYSTEM_UNIT_CLASS: return createSystemUnitClass();
			case CaexPackage.SYSTEM_UNIT_FAMILY: return createSystemUnitFamily();
			case CaexPackage.UNKNOWN_TYPE: return createUnknownType();
			case CaexPackage.VERSION: return createVersion();
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
			case CaexPackage.CHANGE_MODE:
				return createChangeModeFromString(eDataType, initialValue);
			case CaexPackage.ATTRIBUTE_DATA_TYPE:
				return createAttributeDataTypeFromString(eDataType, initialValue);
			case CaexPackage.CHANGE_MODE_OBJECT:
				return createChangeModeObjectFromString(eDataType, initialValue);
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
			case CaexPackage.CHANGE_MODE:
				return convertChangeModeToString(eDataType, instanceValue);
			case CaexPackage.ATTRIBUTE_DATA_TYPE:
				return convertAttributeDataTypeToString(eDataType, instanceValue);
			case CaexPackage.CHANGE_MODE_OBJECT:
				return convertChangeModeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeNameMapping createAttributeNameMapping() {
		AttributeNameMappingImpl attributeNameMapping = new AttributeNameMappingImpl();
		return attributeNameMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeValueRequirement createAttributeValueRequirement() {
		AttributeValueRequirementImpl attributeValueRequirement = new AttributeValueRequirementImpl();
		return attributeValueRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CAEXBasicObject createCAEXBasicObject() {
		CAEXBasicObjectImpl caexBasicObject = new CAEXBasicObjectImpl();
		return caexBasicObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CAEXFile createCAEXFile() {
		CAEXFileImpl caexFile = new CAEXFileImpl();
		return caexFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CAEXObject createCAEXObject() {
		CAEXObjectImpl caexObject = new CAEXObjectImpl();
		return caexObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Copyright createCopyright() {
		CopyrightImpl copyright = new CopyrightImpl();
		return copyright;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Description createDescription() {
		DescriptionImpl description = new DescriptionImpl();
		return description;
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
	public ExternalInterface createExternalInterface() {
		ExternalInterfaceImpl externalInterface = new ExternalInterfaceImpl();
		return externalInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalReference createExternalReference() {
		ExternalReferenceImpl externalReference = new ExternalReferenceImpl();
		return externalReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceHierarchy createInstanceHierarchy() {
		InstanceHierarchyImpl instanceHierarchy = new InstanceHierarchyImpl();
		return instanceHierarchy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceClassLib createInterfaceClassLib() {
		InterfaceClassLibImpl interfaceClassLib = new InterfaceClassLibImpl();
		return interfaceClassLib;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceClass createInterfaceClass() {
		InterfaceClassImpl interfaceClass = new InterfaceClassImpl();
		return interfaceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceFamily createInterfaceFamily() {
		InterfaceFamilyImpl interfaceFamily = new InterfaceFamilyImpl();
		return interfaceFamily;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceNameMapping createInterfaceNameMapping() {
		InterfaceNameMappingImpl interfaceNameMapping = new InterfaceNameMappingImpl();
		return interfaceNameMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalElement createInternalElement() {
		InternalElementImpl internalElement = new InternalElementImpl();
		return internalElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalLink createInternalLink() {
		InternalLinkImpl internalLink = new InternalLinkImpl();
		return internalLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mapping createMapping() {
		MappingImpl mapping = new MappingImpl();
		return mapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NominalScaled createNominalScaled() {
		NominalScaledImpl nominalScaled = new NominalScaledImpl();
		return nominalScaled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrdinalScaled createOrdinalScaled() {
		OrdinalScaledImpl ordinalScaled = new OrdinalScaledImpl();
		return ordinalScaled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefSemantic createRefSemantic() {
		RefSemanticImpl refSemantic = new RefSemanticImpl();
		return refSemantic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Revision createRevision() {
		RevisionImpl revision = new RevisionImpl();
		return revision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleClassLib createRoleClassLib() {
		RoleClassLibImpl roleClassLib = new RoleClassLibImpl();
		return roleClassLib;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleClass createRoleClass() {
		RoleClassImpl roleClass = new RoleClassImpl();
		return roleClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleFamily createRoleFamily() {
		RoleFamilyImpl roleFamily = new RoleFamilyImpl();
		return roleFamily;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRequirements createRoleRequirements() {
		RoleRequirementsImpl roleRequirements = new RoleRequirementsImpl();
		return roleRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupportedRoleClass createSupportedRoleClass() {
		SupportedRoleClassImpl supportedRoleClass = new SupportedRoleClassImpl();
		return supportedRoleClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemUnitClassLib createSystemUnitClassLib() {
		SystemUnitClassLibImpl systemUnitClassLib = new SystemUnitClassLibImpl();
		return systemUnitClassLib;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemUnitClass createSystemUnitClass() {
		SystemUnitClassImpl systemUnitClass = new SystemUnitClassImpl();
		return systemUnitClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemUnitFamily createSystemUnitFamily() {
		SystemUnitFamilyImpl systemUnitFamily = new SystemUnitFamilyImpl();
		return systemUnitFamily;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnknownType createUnknownType() {
		UnknownTypeImpl unknownType = new UnknownTypeImpl();
		return unknownType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version createVersion() {
		VersionImpl version = new VersionImpl();
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeMode createChangeModeFromString(EDataType eDataType, String initialValue) {
		ChangeMode result = ChangeMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChangeModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createAttributeDataTypeFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAttributeDataTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumerator createChangeModeObjectFromString(EDataType eDataType, String initialValue) {
		return (Enumerator)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChangeModeObjectToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaexPackage getCaexPackage() {
		return (CaexPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CaexPackage getPackage() {
		return CaexPackage.eINSTANCE;
	}

} //CaexFactoryImpl
