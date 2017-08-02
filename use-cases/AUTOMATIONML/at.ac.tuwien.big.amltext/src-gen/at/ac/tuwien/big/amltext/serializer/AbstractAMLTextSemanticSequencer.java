package at.ac.tuwien.big.amltext.serializer;

import at.ac.tuwien.big.amltext.services.AMLTextGrammarAccess;
import caex.Attribute;
import caex.AttributeNameMapping;
import caex.AttributeValueRequirement;
import caex.CAEXFile;
import caex.CaexPackage;
import caex.Copyright;
import caex.Description;
import caex.ExternalInterface;
import caex.ExternalReference;
import caex.InstanceHierarchy;
import caex.InterfaceClass;
import caex.InterfaceClassLib;
import caex.InterfaceFamily;
import caex.InterfaceNameMapping;
import caex.InternalElement;
import caex.InternalLink;
import caex.Mapping;
import caex.NominalScaled;
import caex.OrdinalScaled;
import caex.RefSemantic;
import caex.Revision;
import caex.RoleClassLib;
import caex.RoleFamily;
import caex.RoleRequirements;
import caex.SupportedRoleClass;
import caex.SystemUnitClassLib;
import caex.SystemUnitFamily;
import caex.UnknownType;
import caex.Version;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public abstract class AbstractAMLTextSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AMLTextGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == CaexPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case CaexPackage.ATTRIBUTE:
				if(context == grammarAccess.getAttributeRule()) {
					sequence_Attribute(context, (Attribute) semanticObject); 
					return; 
				}
				else break;
			case CaexPackage.ATTRIBUTE_NAME_MAPPING:
				if(context == grammarAccess.getAttributeNameMappingRule()) {
					sequence_AttributeNameMapping(context, (AttributeNameMapping) semanticObject); 
					return; 
				}
				else break;
			case CaexPackage.ATTRIBUTE_VALUE_REQUIREMENT:
				if(context == grammarAccess.getAttributeValueRequirementRule()) {
					sequence_AttributeValueRequirement(context, (AttributeValueRequirement) semanticObject); 
					return; 
				}
				else break;
			case CaexPackage.CAEX_FILE:
				if(context == grammarAccess.getCAEXFileRule()) {
					sequence_CAEXFile(context, (CAEXFile) semanticObject); 
					return; 
				}
				else break;
			case CaexPackage.COPYRIGHT:
				if(context == grammarAccess.getCopyrightRule()) {
					sequence_Copyright(context, (Copyright) semanticObject); 
					return; 
				}
				else break;
			case CaexPackage.DESCRIPTION:
				if(context == grammarAccess.getDescriptionRule()) {
					sequence_Description(context, (Description) semanticObject); 
					return; 
				}
				else break;
			case CaexPackage.EXTERNAL_INTERFACE:
				if(context == grammarAccess.getExternalInterfaceRule() ||
				   context == grammarAccess.getInterfaceClassRule()) {
					sequence_ExternalInterface(context, (ExternalInterface) semanticObject); 
					return; 
				}
				else break;
			case CaexPackage.EXTERNAL_REFERENCE:
				if(context == grammarAccess.getExternalReferenceRule()) {
					sequence_ExternalReference(context, (ExternalReference) semanticObject); 
					return; 
				}
				else break;
			case CaexPackage.INSTANCE_HIERARCHY:
				if(context == grammarAccess.getInstanceHierarchyRule()) {
					sequence_InstanceHierarchy(context, (InstanceHierarchy) semanticObject); 
					return; 
				}
				else break;
			case CaexPackage.INTERFACE_CLASS:
				if(context == grammarAccess.getInterfaceClassRule() ||
				   context == grammarAccess.getInterfaceClass_ImplRule()) {
					sequence_InterfaceClass_Impl(context, (InterfaceClass) semanticObject); 
					return; 
				}
				else break;
			case CaexPackage.INTERFACE_CLASS_LIB:
				if(context == grammarAccess.getInterfaceClassLibRule()) {
					sequence_InterfaceClassLib(context, (InterfaceClassLib) semanticObject); 
					return; 
				}
				else break;
			case CaexPackage.INTERFACE_FAMILY:
				if(context == grammarAccess.getInterfaceClassRule() ||
				   context == grammarAccess.getInterfaceFamilyRule()) {
					sequence_InterfaceFamily(context, (InterfaceFamily) semanticObject); 
					return; 
				}
				else break;
			case CaexPackage.INTERFACE_NAME_MAPPING:
				if(context == grammarAccess.getInterfaceNameMappingRule()) {
					sequence_InterfaceNameMapping(context, (InterfaceNameMapping) semanticObject); 
					return; 
				}
				else break;
			case CaexPackage.INTERNAL_ELEMENT:
				if(context == grammarAccess.getInternalElementRule()) {
					sequence_InternalElement(context, (InternalElement) semanticObject); 
					return; 
				}
				else break;
			case CaexPackage.INTERNAL_LINK:
				if(context == grammarAccess.getInternalLinkRule()) {
					sequence_InternalLink(context, (InternalLink) semanticObject); 
					return; 
				}
				else break;
			case CaexPackage.MAPPING:
				if(context == grammarAccess.getMappingRule()) {
					sequence_Mapping(context, (Mapping) semanticObject); 
					return; 
				}
				else break;
			case CaexPackage.NOMINAL_SCALED:
				if(context == grammarAccess.getNominalScaledRule()) {
					sequence_NominalScaled(context, (NominalScaled) semanticObject); 
					return; 
				}
				else break;
			case CaexPackage.ORDINAL_SCALED:
				if(context == grammarAccess.getOrdinalScaledRule()) {
					sequence_OrdinalScaled(context, (OrdinalScaled) semanticObject); 
					return; 
				}
				else break;
			case CaexPackage.REF_SEMANTIC:
				if(context == grammarAccess.getRefSemanticRule()) {
					sequence_RefSemantic(context, (RefSemantic) semanticObject); 
					return; 
				}
				else break;
			case CaexPackage.REVISION:
				if(context == grammarAccess.getRevisionRule()) {
					sequence_Revision(context, (Revision) semanticObject); 
					return; 
				}
				else break;
			case CaexPackage.ROLE_CLASS_LIB:
				if(context == grammarAccess.getRoleClassLibRule()) {
					sequence_RoleClassLib(context, (RoleClassLib) semanticObject); 
					return; 
				}
				else break;
			case CaexPackage.ROLE_FAMILY:
				if(context == grammarAccess.getRoleFamilyRule()) {
					sequence_RoleFamily(context, (RoleFamily) semanticObject); 
					return; 
				}
				else break;
			case CaexPackage.ROLE_REQUIREMENTS:
				if(context == grammarAccess.getRoleRequirementsRule()) {
					sequence_RoleRequirements(context, (RoleRequirements) semanticObject); 
					return; 
				}
				else break;
			case CaexPackage.SUPPORTED_ROLE_CLASS:
				if(context == grammarAccess.getSupportedRoleClassRule()) {
					sequence_SupportedRoleClass(context, (SupportedRoleClass) semanticObject); 
					return; 
				}
				else break;
			case CaexPackage.SYSTEM_UNIT_CLASS_LIB:
				if(context == grammarAccess.getSystemUnitClassLibRule()) {
					sequence_SystemUnitClassLib(context, (SystemUnitClassLib) semanticObject); 
					return; 
				}
				else break;
			case CaexPackage.SYSTEM_UNIT_FAMILY:
				if(context == grammarAccess.getSystemUnitFamilyRule()) {
					sequence_SystemUnitFamily(context, (SystemUnitFamily) semanticObject); 
					return; 
				}
				else break;
			case CaexPackage.UNKNOWN_TYPE:
				if(context == grammarAccess.getUnknownTypeRule()) {
					sequence_UnknownType(context, (UnknownType) semanticObject); 
					return; 
				}
				else break;
			case CaexPackage.VERSION:
				if(context == grammarAccess.getVersionRule()) {
					sequence_Version(context, (Version) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == EcorePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case EcorePackage.EOBJECT:
				if(context == grammarAccess.getEObjectRule()) {
					sequence_EObject(context, (EObject) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         changeMode=ChangeMode? 
	 *         roleAttributeName=STRING 
	 *         systemUnitAttributeName=STRING 
	 *         description=Description? 
	 *         version=Version? 
	 *         (revision+=Revision revision+=Revision*)? 
	 *         copyright=Copyright? 
	 *         (additionalInformation+=EObject additionalInformation+=EObject*)?
	 *     )
	 */
	protected void sequence_AttributeNameMapping(EObject context, AttributeNameMapping semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         changeMode=ChangeMode? 
	 *         name=STRING 
	 *         description=Description? 
	 *         version=Version? 
	 *         (revision+=Revision revision+=Revision*)? 
	 *         copyright=Copyright? 
	 *         (additionalInformation+=EObject additionalInformation+=EObject*)? 
	 *         ordinalScaledType=OrdinalScaled? 
	 *         nominalScaledType=NominalScaled? 
	 *         unknownType=UnknownType?
	 *     )
	 */
	protected void sequence_AttributeValueRequirement(EObject context, AttributeValueRequirement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         changeMode=ChangeMode? 
	 *         iD=STRING? 
	 *         name=STRING 
	 *         attributeDataType=AttributeDataType? 
	 *         unit=STRING? 
	 *         value=EString? 
	 *         defaultValue=EString? 
	 *         description=Description? 
	 *         version=Version? 
	 *         (revision+=Revision revision+=Revision*)? 
	 *         copyright=Copyright? 
	 *         (additionalInformation+=EObject additionalInformation+=EObject*)? 
	 *         (refSemantic+=RefSemantic refSemantic+=RefSemantic*)? 
	 *         (constraint+=AttributeValueRequirement constraint+=AttributeValueRequirement*)? 
	 *         (attribute+=Attribute attribute+=Attribute*)?
	 *     )
	 */
	protected void sequence_Attribute(EObject context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         changeMode=ChangeMode? 
	 *         fileName=STRING 
	 *         schemaVersion=STRING 
	 *         description=Description? 
	 *         version=Version? 
	 *         (revision+=Revision revision+=Revision*)? 
	 *         copyright=Copyright? 
	 *         (additionalInformation+=EObject additionalInformation+=EObject*)? 
	 *         (externalReference+=ExternalReference externalReference+=ExternalReference*)? 
	 *         (instanceHierarchy+=InstanceHierarchy instanceHierarchy+=InstanceHierarchy*)? 
	 *         (interfaceClassLib+=InterfaceClassLib interfaceClassLib+=InterfaceClassLib*)? 
	 *         (roleClassLib+=RoleClassLib roleClassLib+=RoleClassLib*)? 
	 *         (systemUnitClassLib+=SystemUnitClassLib systemUnitClassLib+=SystemUnitClassLib*)?
	 *     )
	 */
	protected void sequence_CAEXFile(EObject context, CAEXFile semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=STRING? changeMode=ChangeMode?)
	 */
	protected void sequence_Copyright(EObject context, Copyright semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=STRING? changeMode=ChangeMode?)
	 */
	protected void sequence_Description(EObject context, Description semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {EObject}
	 */
	protected void sequence_EObject(EObject context, EObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         changeMode=ChangeMode? 
	 *         iD=STRING? 
	 *         name=STRING 
	 *         refBaseClassPath=STRING? 
	 *         description=Description? 
	 *         version=Version? 
	 *         (revision+=Revision revision+=Revision*)? 
	 *         copyright=Copyright? 
	 *         (additionalInformation+=EObject additionalInformation+=EObject*)? 
	 *         (attribute+=Attribute attribute+=Attribute*)?
	 *     )
	 */
	protected void sequence_ExternalInterface(EObject context, ExternalInterface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         changeMode=ChangeMode? 
	 *         alias=STRING 
	 *         path=STRING 
	 *         description=Description? 
	 *         version=Version? 
	 *         (revision+=Revision revision+=Revision*)? 
	 *         copyright=Copyright? 
	 *         (additionalInformation+=EObject additionalInformation+=EObject*)?
	 *     )
	 */
	protected void sequence_ExternalReference(EObject context, ExternalReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         changeMode=ChangeMode? 
	 *         iD=STRING? 
	 *         name=STRING 
	 *         description=Description? 
	 *         version=Version? 
	 *         (revision+=Revision revision+=Revision*)? 
	 *         copyright=Copyright? 
	 *         (additionalInformation+=EObject additionalInformation+=EObject*)? 
	 *         (internalElement+=InternalElement internalElement+=InternalElement*)?
	 *     )
	 */
	protected void sequence_InstanceHierarchy(EObject context, InstanceHierarchy semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         changeMode=ChangeMode? 
	 *         iD=STRING? 
	 *         name=STRING 
	 *         description=Description? 
	 *         version=Version? 
	 *         (revision+=Revision revision+=Revision*)? 
	 *         copyright=Copyright? 
	 *         (additionalInformation+=EObject additionalInformation+=EObject*)? 
	 *         (interfaceClass+=InterfaceFamily interfaceClass+=InterfaceFamily*)?
	 *     )
	 */
	protected void sequence_InterfaceClassLib(EObject context, InterfaceClassLib semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         changeMode=ChangeMode? 
	 *         iD=STRING? 
	 *         name=STRING 
	 *         refBaseClassPath=STRING? 
	 *         description=Description? 
	 *         version=Version? 
	 *         (revision+=Revision revision+=Revision*)? 
	 *         copyright=Copyright? 
	 *         (additionalInformation+=EObject additionalInformation+=EObject*)? 
	 *         (attribute+=Attribute attribute+=Attribute*)?
	 *     )
	 */
	protected void sequence_InterfaceClass_Impl(EObject context, InterfaceClass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         changeMode=ChangeMode? 
	 *         iD=STRING? 
	 *         name=STRING 
	 *         refBaseClassPath=STRING? 
	 *         description=Description? 
	 *         version=Version? 
	 *         (revision+=Revision revision+=Revision*)? 
	 *         copyright=Copyright? 
	 *         (additionalInformation+=EObject additionalInformation+=EObject*)? 
	 *         (attribute+=Attribute attribute+=Attribute*)? 
	 *         (interfaceClass+=InterfaceFamily interfaceClass+=InterfaceFamily*)?
	 *     )
	 */
	protected void sequence_InterfaceFamily(EObject context, InterfaceFamily semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         changeMode=ChangeMode? 
	 *         roleInterfaceName=STRING 
	 *         systemUnitInterfaceName=STRING 
	 *         description=Description? 
	 *         version=Version? 
	 *         (revision+=Revision revision+=Revision*)? 
	 *         copyright=Copyright? 
	 *         (additionalInformation+=EObject additionalInformation+=EObject*)?
	 *     )
	 */
	protected void sequence_InterfaceNameMapping(EObject context, InterfaceNameMapping semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         changeMode=ChangeMode? 
	 *         iD=STRING? 
	 *         name=STRING 
	 *         refBaseSystemUnitPath=STRING? 
	 *         description=Description? 
	 *         version=Version? 
	 *         (revision+=Revision revision+=Revision*)? 
	 *         copyright=Copyright? 
	 *         (additionalInformation+=EObject additionalInformation+=EObject*)? 
	 *         (attribute+=Attribute attribute+=Attribute*)? 
	 *         (externalInterface+=InterfaceClass externalInterface+=InterfaceClass*)? 
	 *         (internalElement+=InternalElement internalElement+=InternalElement*)? 
	 *         (supportedRoleClass+=SupportedRoleClass supportedRoleClass+=SupportedRoleClass*)? 
	 *         (internalLink+=InternalLink internalLink+=InternalLink*)? 
	 *         roleRequirements=RoleRequirements? 
	 *         mappingObject=Mapping?
	 *     )
	 */
	protected void sequence_InternalElement(EObject context, InternalElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         changeMode=ChangeMode? 
	 *         iD=STRING? 
	 *         name=STRING 
	 *         refPartnerSideA=STRING? 
	 *         refPartnerSideB=STRING? 
	 *         description=Description? 
	 *         version=Version? 
	 *         (revision+=Revision revision+=Revision*)? 
	 *         copyright=Copyright? 
	 *         (additionalInformation+=EObject additionalInformation+=EObject*)?
	 *     )
	 */
	protected void sequence_InternalLink(EObject context, InternalLink semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         changeMode=ChangeMode? 
	 *         description=Description? 
	 *         version=Version? 
	 *         (revision+=Revision revision+=Revision*)? 
	 *         copyright=Copyright? 
	 *         (additionalInformation+=EObject additionalInformation+=EObject*)? 
	 *         (attributeNameMapping+=AttributeNameMapping attributeNameMapping+=AttributeNameMapping*)? 
	 *         (interfaceNameMapping+=InterfaceNameMapping interfaceNameMapping+=InterfaceNameMapping*)?
	 *     )
	 */
	protected void sequence_Mapping(EObject context, Mapping semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (requiredValue=EString?)
	 */
	protected void sequence_NominalScaled(EObject context, NominalScaled semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (requiredMaxValue=EString? requiredValue=EString? requiredMinValue=EString?)
	 */
	protected void sequence_OrdinalScaled(EObject context, OrdinalScaled semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         changeMode=ChangeMode? 
	 *         correspondingAttributePath=STRING 
	 *         description=Description? 
	 *         version=Version? 
	 *         (revision+=Revision revision+=Revision*)? 
	 *         copyright=Copyright? 
	 *         (additionalInformation+=EObject additionalInformation+=EObject*)?
	 *     )
	 */
	protected void sequence_RefSemantic(EObject context, RefSemantic semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         changeMode=ChangeMode? 
	 *         revisionDate=DateTime 
	 *         oldVersion=STRING? 
	 *         newVersion=STRING? 
	 *         authorName=STRING 
	 *         comment=STRING? 
	 *         description=Description? 
	 *         version=Version? 
	 *         (revision+=Revision revision+=Revision*)? 
	 *         copyright=Copyright? 
	 *         (additionalInformation+=EObject additionalInformation+=EObject*)?
	 *     )
	 */
	protected void sequence_Revision(EObject context, Revision semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         changeMode=ChangeMode? 
	 *         iD=STRING? 
	 *         name=STRING 
	 *         description=Description? 
	 *         version=Version? 
	 *         (revision+=Revision revision+=Revision*)? 
	 *         copyright=Copyright? 
	 *         (additionalInformation+=EObject additionalInformation+=EObject*)? 
	 *         (roleClass+=RoleFamily roleClass+=RoleFamily*)?
	 *     )
	 */
	protected void sequence_RoleClassLib(EObject context, RoleClassLib semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         changeMode=ChangeMode? 
	 *         iD=STRING? 
	 *         name=STRING 
	 *         refBaseClassPath=STRING? 
	 *         description=Description? 
	 *         version=Version? 
	 *         (revision+=Revision revision+=Revision*)? 
	 *         copyright=Copyright? 
	 *         (additionalInformation+=EObject additionalInformation+=EObject*)? 
	 *         (attribute+=Attribute attribute+=Attribute*)? 
	 *         (externalInterface+=ExternalInterface externalInterface+=ExternalInterface*)? 
	 *         (roleClass+=RoleFamily roleClass+=RoleFamily*)?
	 *     )
	 */
	protected void sequence_RoleFamily(EObject context, RoleFamily semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         changeMode=ChangeMode? 
	 *         refBaseRoleClassPath=STRING? 
	 *         description=Description? 
	 *         version=Version? 
	 *         (revision+=Revision revision+=Revision*)? 
	 *         copyright=Copyright? 
	 *         (additionalInformation+=EObject additionalInformation+=EObject*)? 
	 *         (attribute+=Attribute attribute+=Attribute*)? 
	 *         (externalInterface+=InterfaceClass externalInterface+=InterfaceClass*)?
	 *     )
	 */
	protected void sequence_RoleRequirements(EObject context, RoleRequirements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         changeMode=ChangeMode? 
	 *         refRoleClassPath=STRING 
	 *         description=Description? 
	 *         version=Version? 
	 *         (revision+=Revision revision+=Revision*)? 
	 *         copyright=Copyright? 
	 *         (additionalInformation+=EObject additionalInformation+=EObject*)? 
	 *         mappingObject=Mapping?
	 *     )
	 */
	protected void sequence_SupportedRoleClass(EObject context, SupportedRoleClass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         changeMode=ChangeMode? 
	 *         iD=STRING? 
	 *         name=STRING 
	 *         description=Description? 
	 *         version=Version? 
	 *         (revision+=Revision revision+=Revision*)? 
	 *         copyright=Copyright? 
	 *         (additionalInformation+=EObject additionalInformation+=EObject*)? 
	 *         (systemUnitClass+=SystemUnitFamily systemUnitClass+=SystemUnitFamily*)?
	 *     )
	 */
	protected void sequence_SystemUnitClassLib(EObject context, SystemUnitClassLib semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         changeMode=ChangeMode? 
	 *         iD=STRING? 
	 *         name=STRING 
	 *         refBaseClassPath=STRING? 
	 *         description=Description? 
	 *         version=Version? 
	 *         (revision+=Revision revision+=Revision*)? 
	 *         copyright=Copyright? 
	 *         (additionalInformation+=EObject additionalInformation+=EObject*)? 
	 *         (attribute+=Attribute attribute+=Attribute*)? 
	 *         (externalInterface+=InterfaceClass externalInterface+=InterfaceClass*)? 
	 *         (internalElement+=InternalElement internalElement+=InternalElement*)? 
	 *         (supportedRoleClass+=SupportedRoleClass supportedRoleClass+=SupportedRoleClass*)? 
	 *         (internalLink+=InternalLink internalLink+=InternalLink*)? 
	 *         (systemUnitClass+=SystemUnitFamily systemUnitClass+=SystemUnitFamily*)?
	 *     )
	 */
	protected void sequence_SystemUnitFamily(EObject context, SystemUnitFamily semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (requirements=STRING?)
	 */
	protected void sequence_UnknownType(EObject context, UnknownType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=STRING? changeMode=ChangeMode?)
	 */
	protected void sequence_Version(EObject context, Version semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
