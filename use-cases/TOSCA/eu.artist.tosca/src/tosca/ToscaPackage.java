/**
 */
package tosca;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 *    <div xmlns="http://www.w3.org/1999/xhtml">
 *     <h1>About the XML namespace</h1>
 * 
 *     <div class="bodytext">
 *      <p>
 *       This schema document describes the XML namespace, in a form
 *       suitable for import by other schema documents.
 *      </p>
 *      <p>
 *       See <a href="http://www.w3.org/XML/1998/namespace.html">
 *       http://www.w3.org/XML/1998/namespace.html</a> and
 *       <a href="http://www.w3.org/TR/REC-xml">
 *       http://www.w3.org/TR/REC-xml</a> for information 
 *       about this namespace.
 *      </p>
 *      <p>
 *       Note that local names in this namespace are intended to be
 *       defined only by the World Wide Web Consortium or its subgroups.
 *       The names currently defined in this namespace are listed below.
 *       They should not be used with conflicting semantics by any Working
 *       Group, specification, or document instance.
 *      </p>
 *      <p>   
 *       See further below in this document for more information about <a href="#usage">how to refer to this schema document from your own
 *       XSD schema documents</a> and about <a href="#nsversioning">the
 *       namespace-versioning policy governing this schema document</a>.
 *      </p>
 *     </div>
 *    </div>
 *   
 * 
 *    <div xmlns="http://www.w3.org/1999/xhtml">
 *    
 *     <h3>Father (in any context at all)</h3> 
 * 
 *     <div class="bodytext">
 *      <p>
 *       denotes Jon Bosak, the chair of 
 *       the original XML Working Group.  This name is reserved by 
 *       the following decision of the W3C XML Plenary and 
 *       XML Coordination groups:
 *      </p>
 *      <blockquote>
 *        <p>
 * 	In appreciation for his vision, leadership and
 * 	dedication the W3C XML Plenary on this 10th day of
 * 	February, 2000, reserves for Jon Bosak in perpetuity
 * 	the XML name "xml:Father".
 *        </p>
 *      </blockquote>
 *     </div>
 *    </div>
 *   
 * 
 *    <div id="usage" xml:id="usage" xmlns="http://www.w3.org/1999/xhtml">
 *     <h2>
 *       <a name="usage">About this schema document</a>
 *     </h2>
 * 
 *     <div class="bodytext">
 *      <p>
 *       This schema defines attributes and an attribute group suitable
 *       for use by schemas wishing to allow <code>xml:base</code>,
 *       <code>xml:lang</code>, <code>xml:space</code> or
 *       <code>xml:id</code> attributes on elements they define.
 *      </p>
 *      <p>
 *       To enable this, such a schema must import this schema for
 *       the XML namespace, e.g. as follows:
 *      </p>
 *      <pre>
 *           &lt;schema . . .&gt;
 *            . . .
 *            &lt;import namespace="http://www.w3.org/XML/1998/namespace"
 *                       schemaLocation="http://www.w3.org/2001/xml.xsd"/&gt;
 *      </pre>
 *      <p>
 *       or
 *      </p>
 *      <pre>
 *            &lt;import namespace="http://www.w3.org/XML/1998/namespace"
 *                       schemaLocation="http://www.w3.org/2009/01/xml.xsd"/&gt;
 *      </pre>
 *      <p>
 *       Subsequently, qualified reference to any of the attributes or the
 *       group defined below will have the desired effect, e.g.
 *      </p>
 *      <pre>
 *           &lt;type . . .&gt;
 *            . . .
 *            &lt;attributeGroup ref="xml:specialAttrs"/&gt;
 *      </pre>
 *      <p>
 *       will define a type which will schema-validate an instance element
 *       with any of those attributes.
 *      </p>
 *     </div>
 *    </div>
 *   
 * 
 *    <div id="nsversioning" xml:id="nsversioning" xmlns="http://www.w3.org/1999/xhtml">
 *     <h2>
 *       <a name="nsversioning">Versioning policy for this schema document</a>
 *     </h2>
 *     <div class="bodytext">
 *      <p>
 *       In keeping with the XML Schema WG's standard versioning
 *       policy, this schema document will persist at
 *       <a href="http://www.w3.org/2009/01/xml.xsd">
 *        http://www.w3.org/2009/01/xml.xsd</a>.
 *      </p>
 *      <p>
 *       At the date of issue it can also be found at
 *       <a href="http://www.w3.org/2001/xml.xsd">
 *        http://www.w3.org/2001/xml.xsd</a>.
 *      </p>
 *      <p>
 *       The schema document at that URI may however change in the future,
 *       in order to remain compatible with the latest version of XML
 *       Schema itself, or with the XML namespace itself.  In other words,
 *       if the XML Schema or XML namespaces change, the version of this
 *       document at <a href="http://www.w3.org/2001/xml.xsd">
 *        http://www.w3.org/2001/xml.xsd 
 *       </a> 
 *       will change accordingly; the version at 
 *       <a href="http://www.w3.org/2009/01/xml.xsd">
 *        http://www.w3.org/2009/01/xml.xsd 
 *       </a> 
 *       will not change.
 *      </p>
 *      <p>
 *       Previous dated (and unchanging) versions of this schema 
 *       document are at:
 *      </p>
 *      <ul>
 *       <li>
 *           <a href="http://www.w3.org/2009/01/xml.xsd">
 * 	http://www.w3.org/2009/01/xml.xsd</a>
 *         </li>
 *       <li>
 *           <a href="http://www.w3.org/2007/08/xml.xsd">
 * 	http://www.w3.org/2007/08/xml.xsd</a>
 *         </li>
 *       <li>
 *           <a href="http://www.w3.org/2004/10/xml.xsd">
 * 	http://www.w3.org/2004/10/xml.xsd</a>
 *         </li>
 *       <li>
 *           <a href="http://www.w3.org/2001/03/xml.xsd">
 * 	http://www.w3.org/2001/03/xml.xsd</a>
 *         </li>
 *      </ul>
 *     </div>
 *    </div>
 *   
 * <!-- end-model-doc -->
 * @see tosca.ToscaFactory
 * @model kind="package"
 * @generated
 */
public interface ToscaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tosca";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://docs.oasis-open.org/tosca/ns/2011/12";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tosca";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ToscaPackage eINSTANCE = tosca.impl.ToscaPackageImpl.init();

	/**
	 * The meta object id for the '{@link tosca.impl.ArtifactReferencesTypeImpl <em>Artifact References Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.ArtifactReferencesTypeImpl
	 * @see tosca.impl.ToscaPackageImpl#getArtifactReferencesType()
	 * @generated
	 */
	int ARTIFACT_REFERENCES_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Artifact Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_REFERENCES_TYPE__ARTIFACT_REFERENCE = 0;

	/**
	 * The number of structural features of the '<em>Artifact References Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_REFERENCES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Artifact References Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_REFERENCES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca.impl.CapabilitiesType_TCapabilityImpl <em>Capabilities Type TCapability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.CapabilitiesType_TCapabilityImpl
	 * @see tosca.impl.ToscaPackageImpl#getCapabilitiesType_TCapability()
	 * @generated
	 */
	int CAPABILITIES_TYPE_TCAPABILITY = 1;

	/**
	 * The feature id for the '<em><b>Capability</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_TYPE_TCAPABILITY__CAPABILITY = 0;

	/**
	 * The number of structural features of the '<em>Capabilities Type TCapability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_TYPE_TCAPABILITY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Capabilities Type TCapability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_TYPE_TCAPABILITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca.impl.CapabilitiesType_CapabilityRefImpl <em>Capabilities Type Capability Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.CapabilitiesType_CapabilityRefImpl
	 * @see tosca.impl.ToscaPackageImpl#getCapabilitiesType_CapabilityRef()
	 * @generated
	 */
	int CAPABILITIES_TYPE_CAPABILITY_REF = 2;

	/**
	 * The feature id for the '<em><b>Capability</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_TYPE_CAPABILITY_REF__CAPABILITY = 0;

	/**
	 * The number of structural features of the '<em>Capabilities Type Capability Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_TYPE_CAPABILITY_REF_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Capabilities Type Capability Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_TYPE_CAPABILITY_REF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca.impl.CapabilityDefinitionsTypeImpl <em>Capability Definitions Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.CapabilityDefinitionsTypeImpl
	 * @see tosca.impl.ToscaPackageImpl#getCapabilityDefinitionsType()
	 * @generated
	 */
	int CAPABILITY_DEFINITIONS_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Capability Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DEFINITIONS_TYPE__CAPABILITY_DEFINITION = 0;

	/**
	 * The number of structural features of the '<em>Capability Definitions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DEFINITIONS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Capability Definitions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DEFINITIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca.impl.ConstraintsTypeImpl <em>Constraints Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.ConstraintsTypeImpl
	 * @see tosca.impl.ToscaPackageImpl#getConstraintsType()
	 * @generated
	 */
	int CONSTRAINTS_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_TYPE__CONSTRAINT = 0;

	/**
	 * The number of structural features of the '<em>Constraints Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Constraints Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca.impl.TExtensibleElementsImpl <em>TExtensible Elements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.TExtensibleElementsImpl
	 * @see tosca.impl.ToscaPackageImpl#getTExtensibleElements()
	 * @generated
	 */
	int TEXTENSIBLE_ELEMENTS = 57;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTENSIBLE_ELEMENTS__DOCUMENTATION = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTENSIBLE_ELEMENTS__ANY = 1;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>TExtensible Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTENSIBLE_ELEMENTS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>TExtensible Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTENSIBLE_ELEMENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca.impl.TDefinitionsImpl <em>TDefinitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.TDefinitionsImpl
	 * @see tosca.impl.ToscaPackageImpl#getTDefinitions()
	 * @generated
	 */
	int TDEFINITIONS = 49;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__DOCUMENTATION = TEXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__ANY = TEXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__ANY_ATTRIBUTE = TEXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__EXTENSIONS = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__IMPORT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__TYPES = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__GROUP = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Service Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__SERVICE_TEMPLATE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__NODE_TYPE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Node Type Implementation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__NODE_TYPE_IMPLEMENTATION = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Relationship Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__RELATIONSHIP_TYPE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Relationship Type Implementation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__RELATIONSHIP_TYPE_IMPLEMENTATION = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Requirement Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__REQUIREMENT_TYPE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Capability Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__CAPABILITY_TYPE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Artifact Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__ARTIFACT_TYPE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Artifact Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__ARTIFACT_TEMPLATE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Policy Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__POLICY_TYPE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Policy Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__POLICY_TEMPLATE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__ID = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__NAME = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__TARGET_NAMESPACE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>TDefinitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS_FEATURE_COUNT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 18;

	/**
	 * The number of operations of the '<em>TDefinitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS_OPERATION_COUNT = TEXTENSIBLE_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tosca.impl.DefinitionsTypeImpl <em>Definitions Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.DefinitionsTypeImpl
	 * @see tosca.impl.ToscaPackageImpl#getDefinitionsType()
	 * @generated
	 */
	int DEFINITIONS_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__DOCUMENTATION = TDEFINITIONS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__ANY = TDEFINITIONS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__ANY_ATTRIBUTE = TDEFINITIONS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__EXTENSIONS = TDEFINITIONS__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__IMPORT = TDEFINITIONS__IMPORT;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__TYPES = TDEFINITIONS__TYPES;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__GROUP = TDEFINITIONS__GROUP;

	/**
	 * The feature id for the '<em><b>Service Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__SERVICE_TEMPLATE = TDEFINITIONS__SERVICE_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__NODE_TYPE = TDEFINITIONS__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Node Type Implementation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__NODE_TYPE_IMPLEMENTATION = TDEFINITIONS__NODE_TYPE_IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Relationship Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__RELATIONSHIP_TYPE = TDEFINITIONS__RELATIONSHIP_TYPE;

	/**
	 * The feature id for the '<em><b>Relationship Type Implementation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__RELATIONSHIP_TYPE_IMPLEMENTATION = TDEFINITIONS__RELATIONSHIP_TYPE_IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Requirement Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__REQUIREMENT_TYPE = TDEFINITIONS__REQUIREMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Capability Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__CAPABILITY_TYPE = TDEFINITIONS__CAPABILITY_TYPE;

	/**
	 * The feature id for the '<em><b>Artifact Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__ARTIFACT_TYPE = TDEFINITIONS__ARTIFACT_TYPE;

	/**
	 * The feature id for the '<em><b>Artifact Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__ARTIFACT_TEMPLATE = TDEFINITIONS__ARTIFACT_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Policy Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__POLICY_TYPE = TDEFINITIONS__POLICY_TYPE;

	/**
	 * The feature id for the '<em><b>Policy Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__POLICY_TEMPLATE = TDEFINITIONS__POLICY_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__ID = TDEFINITIONS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__NAME = TDEFINITIONS__NAME;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__TARGET_NAMESPACE = TDEFINITIONS__TARGET_NAMESPACE;

	/**
	 * The number of structural features of the '<em>Definitions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE_FEATURE_COUNT = TDEFINITIONS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Definitions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE_OPERATION_COUNT = TDEFINITIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tosca.impl.DerivedFromTypeImpl <em>Derived From Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.DerivedFromTypeImpl
	 * @see tosca.impl.ToscaPackageImpl#getDerivedFromType()
	 * @generated
	 */
	int DERIVED_FROM_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FROM_TYPE__DERIVED_FROM = 0;

	/**
	 * The number of structural features of the '<em>Derived From Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FROM_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Derived From Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FROM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.DocumentRootImpl
	 * @see tosca.impl.ToscaPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 7;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DEFINITIONS = 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DOCUMENTATION = 4;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca.impl.ExcludeTypeImpl <em>Exclude Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.ExcludeTypeImpl
	 * @see tosca.impl.ToscaPackageImpl#getExcludeType()
	 * @generated
	 */
	int EXCLUDE_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDE_TYPE__PATTERN = 0;

	/**
	 * The number of structural features of the '<em>Exclude Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Exclude Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca.impl.ExtensionsTypeImpl <em>Extensions Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.ExtensionsTypeImpl
	 * @see tosca.impl.ToscaPackageImpl#getExtensionsType()
	 * @generated
	 */
	int EXTENSIONS_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIONS_TYPE__EXTENSION = 0;

	/**
	 * The number of structural features of the '<em>Extensions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIONS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Extensions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca.impl.TImplementationArtifactImpl <em>TImplementation Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.TImplementationArtifactImpl
	 * @see tosca.impl.ToscaPackageImpl#getTImplementationArtifact()
	 * @generated
	 */
	int TIMPLEMENTATION_ARTIFACT = 60;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPLEMENTATION_ARTIFACT__DOCUMENTATION = TEXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPLEMENTATION_ARTIFACT__ANY = TEXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPLEMENTATION_ARTIFACT__ANY_ATTRIBUTE = TEXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Artifact Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPLEMENTATION_ARTIFACT__ARTIFACT_REF = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPLEMENTATION_ARTIFACT__ARTIFACT_TYPE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPLEMENTATION_ARTIFACT__INTERFACE_NAME = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPLEMENTATION_ARTIFACT__OPERATION_NAME = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>TImplementation Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPLEMENTATION_ARTIFACT_FEATURE_COUNT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>TImplementation Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPLEMENTATION_ARTIFACT_OPERATION_COUNT = TEXTENSIBLE_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tosca.impl.ImplementationArtifactTypeImpl <em>Implementation Artifact Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.ImplementationArtifactTypeImpl
	 * @see tosca.impl.ToscaPackageImpl#getImplementationArtifactType()
	 * @generated
	 */
	int IMPLEMENTATION_ARTIFACT_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_ARTIFACT_TYPE__DOCUMENTATION = TIMPLEMENTATION_ARTIFACT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_ARTIFACT_TYPE__ANY = TIMPLEMENTATION_ARTIFACT__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_ARTIFACT_TYPE__ANY_ATTRIBUTE = TIMPLEMENTATION_ARTIFACT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Artifact Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_ARTIFACT_TYPE__ARTIFACT_REF = TIMPLEMENTATION_ARTIFACT__ARTIFACT_REF;

	/**
	 * The feature id for the '<em><b>Artifact Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_ARTIFACT_TYPE__ARTIFACT_TYPE = TIMPLEMENTATION_ARTIFACT__ARTIFACT_TYPE;

	/**
	 * The feature id for the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_ARTIFACT_TYPE__INTERFACE_NAME = TIMPLEMENTATION_ARTIFACT__INTERFACE_NAME;

	/**
	 * The feature id for the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_ARTIFACT_TYPE__OPERATION_NAME = TIMPLEMENTATION_ARTIFACT__OPERATION_NAME;

	/**
	 * The number of structural features of the '<em>Implementation Artifact Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_ARTIFACT_TYPE_FEATURE_COUNT = TIMPLEMENTATION_ARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Implementation Artifact Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_ARTIFACT_TYPE_OPERATION_COUNT = TIMPLEMENTATION_ARTIFACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tosca.impl.IncludeTypeImpl <em>Include Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.IncludeTypeImpl
	 * @see tosca.impl.ToscaPackageImpl#getIncludeType()
	 * @generated
	 */
	int INCLUDE_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_TYPE__PATTERN = 0;

	/**
	 * The number of structural features of the '<em>Include Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Include Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca.impl.InputParametersTypeImpl <em>Input Parameters Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.InputParametersTypeImpl
	 * @see tosca.impl.ToscaPackageImpl#getInputParametersType()
	 * @generated
	 */
	int INPUT_PARAMETERS_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Input Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETERS_TYPE__INPUT_PARAMETER = 0;

	/**
	 * The number of structural features of the '<em>Input Parameters Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETERS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Input Parameters Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETERS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca.impl.InstanceStateTypeImpl <em>Instance State Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.InstanceStateTypeImpl
	 * @see tosca.impl.ToscaPackageImpl#getInstanceStateType()
	 * @generated
	 */
	int INSTANCE_STATE_TYPE = 13;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_STATE_TYPE__STATE = 0;

	/**
	 * The number of structural features of the '<em>Instance State Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_STATE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Instance State Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_STATE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca.impl.InterfacesType_TInterfaceImpl <em>Interfaces Type TInterface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.InterfacesType_TInterfaceImpl
	 * @see tosca.impl.ToscaPackageImpl#getInterfacesType_TInterface()
	 * @generated
	 */
	int INTERFACES_TYPE_TINTERFACE = 14;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACES_TYPE_TINTERFACE__INTERFACE = 0;

	/**
	 * The number of structural features of the '<em>Interfaces Type TInterface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACES_TYPE_TINTERFACE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Interfaces Type TInterface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACES_TYPE_TINTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca.impl.InterfacesType_TExportedInterfaceImpl <em>Interfaces Type TExported Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.InterfacesType_TExportedInterfaceImpl
	 * @see tosca.impl.ToscaPackageImpl#getInterfacesType_TExportedInterface()
	 * @generated
	 */
	int INTERFACES_TYPE_TEXPORTED_INTERFACE = 15;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACES_TYPE_TEXPORTED_INTERFACE__INTERFACE = 0;

	/**
	 * The number of structural features of the '<em>Interfaces Type TExported Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACES_TYPE_TEXPORTED_INTERFACE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Interfaces Type TExported Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACES_TYPE_TEXPORTED_INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca.impl.NodeOperationTypeImpl <em>Node Operation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.NodeOperationTypeImpl
	 * @see tosca.impl.ToscaPackageImpl#getNodeOperationType()
	 * @generated
	 */
	int NODE_OPERATION_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_TYPE__INTERFACE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Node Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_TYPE__NODE_REF = 1;

	/**
	 * The feature id for the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_TYPE__OPERATION_NAME = 2;

	/**
	 * The number of structural features of the '<em>Node Operation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Node Operation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca.impl.NodeTypeReferenceTypeImpl <em>Node Type Reference Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.NodeTypeReferenceTypeImpl
	 * @see tosca.impl.ToscaPackageImpl#getNodeTypeReferenceType()
	 * @generated
	 */
	int NODE_TYPE_REFERENCE_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE_REFERENCE_TYPE__TYPE_REF = 0;

	/**
	 * The number of structural features of the '<em>Node Type Reference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE_REFERENCE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Node Type Reference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE_REFERENCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca.impl.OutputParametersTypeImpl <em>Output Parameters Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.OutputParametersTypeImpl
	 * @see tosca.impl.ToscaPackageImpl#getOutputParametersType()
	 * @generated
	 */
	int OUTPUT_PARAMETERS_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Output Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PARAMETERS_TYPE__OUTPUT_PARAMETER = 0;

	/**
	 * The number of structural features of the '<em>Output Parameters Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PARAMETERS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Output Parameters Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PARAMETERS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca.impl.PlanModelReferenceTypeImpl <em>Plan Model Reference Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.PlanModelReferenceTypeImpl
	 * @see tosca.impl.ToscaPackageImpl#getPlanModelReferenceType()
	 * @generated
	 */
	int PLAN_MODEL_REFERENCE_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_MODEL_REFERENCE_TYPE__REFERENCE = 0;

	/**
	 * The number of structural features of the '<em>Plan Model Reference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_MODEL_REFERENCE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Plan Model Reference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_MODEL_REFERENCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca.impl.PlanModelTypeImpl <em>Plan Model Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.PlanModelTypeImpl
	 * @see tosca.impl.ToscaPackageImpl#getPlanModelType()
	 * @generated
	 */
	int PLAN_MODEL_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_MODEL_TYPE__ANY = 0;

	/**
	 * The number of structural features of the '<em>Plan Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_MODEL_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Plan Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_MODEL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca.impl.PlanTypeImpl <em>Plan Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.PlanTypeImpl
	 * @see tosca.impl.ToscaPackageImpl#getPlanType()
	 * @generated
	 */
	int PLAN_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Plan Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_TYPE__PLAN_REF = 0;

	/**
	 * The number of structural features of the '<em>Plan Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Plan Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca.impl.PoliciesTypeImpl <em>Policies Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.PoliciesTypeImpl
	 * @see tosca.impl.ToscaPackageImpl#getPoliciesType()
	 * @generated
	 */
	int POLICIES_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Policy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICIES_TYPE__POLICY = 0;

	/**
	 * The number of structural features of the '<em>Policies Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICIES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Policies Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICIES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca.impl.PropertiesDefinitionTypeImpl <em>Properties Definition Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.PropertiesDefinitionTypeImpl
	 * @see tosca.impl.ToscaPackageImpl#getPropertiesDefinitionType()
	 * @generated
	 */
	int PROPERTIES_DEFINITION_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_DEFINITION_TYPE__ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_DEFINITION_TYPE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Properties Definition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_DEFINITION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Properties Definition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_DEFINITION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca.impl.PropertiesTypeImpl <em>Properties Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.PropertiesTypeImpl
	 * @see tosca.impl.ToscaPackageImpl#getPropertiesType()
	 * @generated
	 */
	int PROPERTIES_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE__ANY = 0;

	/**
	 * The number of structural features of the '<em>Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca.impl.PropertiesTypeWithPropertyMappingsImpl <em>Properties Type With Property Mappings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.PropertiesTypeWithPropertyMappingsImpl
	 * @see tosca.impl.ToscaPackageImpl#getPropertiesTypeWithPropertyMappings()
	 * @generated
	 */
	int PROPERTIES_TYPE_WITH_PROPERTY_MAPPINGS = 25;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE_WITH_PROPERTY_MAPPINGS__ANY = 0;

	/**
	 * The feature id for the '<em><b>Property Mappings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE_WITH_PROPERTY_MAPPINGS__PROPERTY_MAPPINGS = 1;

	/**
	 * The number of structural features of the '<em>Properties Type With Property Mappings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE_WITH_PROPERTY_MAPPINGS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Properties Type With Property Mappings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE_WITH_PROPERTY_MAPPINGS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca.impl.PropertyConstraintsTypeImpl <em>Property Constraints Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.PropertyConstraintsTypeImpl
	 * @see tosca.impl.ToscaPackageImpl#getPropertyConstraintsType()
	 * @generated
	 */
	int PROPERTY_CONSTRAINTS_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Property Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONSTRAINTS_TYPE__PROPERTY_CONSTRAINT = 0;

	/**
	 * The number of structural features of the '<em>Property Constraints Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONSTRAINTS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Property Constraints Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONSTRAINTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca.impl.PropertyMappingsTypeImpl <em>Property Mappings Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.PropertyMappingsTypeImpl
	 * @see tosca.impl.ToscaPackageImpl#getPropertyMappingsType()
	 * @generated
	 */
	int PROPERTY_MAPPINGS_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Property Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MAPPINGS_TYPE__PROPERTY_MAPPING = 0;

	/**
	 * The number of structural features of the '<em>Property Mappings Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MAPPINGS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Property Mappings Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MAPPINGS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca.impl.RelationshipConstraintsTypeImpl <em>Relationship Constraints Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.RelationshipConstraintsTypeImpl
	 * @see tosca.impl.ToscaPackageImpl#getRelationshipConstraintsType()
	 * @generated
	 */
	int RELATIONSHIP_CONSTRAINTS_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Relationship Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_CONSTRAINTS_TYPE__RELATIONSHIP_CONSTRAINT = 0;

	/**
	 * The number of structural features of the '<em>Relationship Constraints Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_CONSTRAINTS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Relationship Constraints Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_CONSTRAINTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca.impl.RelationshipConstraintTypeImpl <em>Relationship Constraint Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.RelationshipConstraintTypeImpl
	 * @see tosca.impl.ToscaPackageImpl#getRelationshipConstraintType()
	 * @generated
	 */
	int RELATIONSHIP_CONSTRAINT_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_CONSTRAINT_TYPE__ANY = 0;

	/**
	 * The feature id for the '<em><b>Constraint Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_CONSTRAINT_TYPE__CONSTRAINT_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Relationship Constraint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_CONSTRAINT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Relationship Constraint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_CONSTRAINT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca.impl.RelationshipOperationTypeImpl <em>Relationship Operation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.RelationshipOperationTypeImpl
	 * @see tosca.impl.ToscaPackageImpl#getRelationshipOperationType()
	 * @generated
	 */
	int RELATIONSHIP_OPERATION_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_OPERATION_TYPE__INTERFACE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_OPERATION_TYPE__OPERATION_NAME = 1;

	/**
	 * The feature id for the '<em><b>Relationship Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_OPERATION_TYPE__RELATIONSHIP_REF = 2;

	/**
	 * The number of structural features of the '<em>Relationship Operation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_OPERATION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Relationship Operation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_OPERATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca.impl.RequirementDefinitionsTypeImpl <em>Requirement Definitions Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.RequirementDefinitionsTypeImpl
	 * @see tosca.impl.ToscaPackageImpl#getRequirementDefinitionsType()
	 * @generated
	 */
	int REQUIREMENT_DEFINITIONS_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Requirement Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DEFINITIONS_TYPE__REQUIREMENT_DEFINITION = 0;

	/**
	 * The number of structural features of the '<em>Requirement Definitions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DEFINITIONS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Requirement Definitions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DEFINITIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca.impl.RequirementsType_TRequirementImpl <em>Requirements Type TRequirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.RequirementsType_TRequirementImpl
	 * @see tosca.impl.ToscaPackageImpl#getRequirementsType_TRequirement()
	 * @generated
	 */
	int REQUIREMENTS_TYPE_TREQUIREMENT = 32;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_TYPE_TREQUIREMENT__REQUIREMENT = 0;

	/**
	 * The number of structural features of the '<em>Requirements Type TRequirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_TYPE_TREQUIREMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Requirements Type TRequirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_TYPE_TREQUIREMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca.impl.RequirementsType_TRequirementRefImpl <em>Requirements Type TRequirement Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.RequirementsType_TRequirementRefImpl
	 * @see tosca.impl.ToscaPackageImpl#getRequirementsType_TRequirementRef()
	 * @generated
	 */
	int REQUIREMENTS_TYPE_TREQUIREMENT_REF = 33;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_TYPE_TREQUIREMENT_REF__REQUIREMENT = 0;

	/**
	 * The number of structural features of the '<em>Requirements Type TRequirement Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_TYPE_TREQUIREMENT_REF_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Requirements Type TRequirement Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_TYPE_TREQUIREMENT_REF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca.impl.SourceElementTypeImpl <em>Source Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.SourceElementTypeImpl
	 * @see tosca.impl.ToscaPackageImpl#getSourceElementType()
	 * @generated
	 */
	int SOURCE_ELEMENT_TYPE = 34;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ELEMENT_TYPE__REF = 0;

	/**
	 * The number of structural features of the '<em>Source Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ELEMENT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Source Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ELEMENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca.impl.SourceInterfacesTypeImpl <em>Source Interfaces Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.SourceInterfacesTypeImpl
	 * @see tosca.impl.ToscaPackageImpl#getSourceInterfacesType()
	 * @generated
	 */
	int SOURCE_INTERFACES_TYPE = 35;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_INTERFACES_TYPE__INTERFACE = 0;

	/**
	 * The number of structural features of the '<em>Source Interfaces Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_INTERFACES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Source Interfaces Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_INTERFACES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca.impl.TAppliesToImpl <em>TApplies To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.TAppliesToImpl
	 * @see tosca.impl.ToscaPackageImpl#getTAppliesTo()
	 * @generated
	 */
	int TAPPLIES_TO = 36;

	/**
	 * The feature id for the '<em><b>Node Type Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLIES_TO__NODE_TYPE_REFERENCE = 0;

	/**
	 * The number of structural features of the '<em>TApplies To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLIES_TO_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TApplies To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLIES_TO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca.impl.TargetElementTypeImpl <em>Target Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.TargetElementTypeImpl
	 * @see tosca.impl.ToscaPackageImpl#getTargetElementType()
	 * @generated
	 */
	int TARGET_ELEMENT_TYPE = 37;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ELEMENT_TYPE__REF = 0;

	/**
	 * The number of structural features of the '<em>Target Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ELEMENT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Target Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ELEMENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca.impl.TargetInterfacesTypeImpl <em>Target Interfaces Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.TargetInterfacesTypeImpl
	 * @see tosca.impl.ToscaPackageImpl#getTargetInterfacesType()
	 * @generated
	 */
	int TARGET_INTERFACES_TYPE = 38;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_INTERFACES_TYPE__INTERFACE = 0;

	/**
	 * The number of structural features of the '<em>Target Interfaces Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_INTERFACES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Target Interfaces Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_INTERFACES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca.impl.TArtifactReferenceImpl <em>TArtifact Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.TArtifactReferenceImpl
	 * @see tosca.impl.ToscaPackageImpl#getTArtifactReference()
	 * @generated
	 */
	int TARTIFACT_REFERENCE = 39;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_REFERENCE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Include</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_REFERENCE__INCLUDE = 1;

	/**
	 * The feature id for the '<em><b>Exclude</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_REFERENCE__EXCLUDE = 2;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_REFERENCE__REFERENCE = 3;

	/**
	 * The number of structural features of the '<em>TArtifact Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_REFERENCE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>TArtifact Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca.impl.TEntityTemplateImpl <em>TEntity Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.TEntityTemplateImpl
	 * @see tosca.impl.ToscaPackageImpl#getTEntityTemplate()
	 * @generated
	 */
	int TENTITY_TEMPLATE = 53;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TEMPLATE__DOCUMENTATION = TEXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TEMPLATE__ANY = TEXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TEMPLATE__ANY_ATTRIBUTE = TEXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TEMPLATE__PROPERTIES = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TEMPLATE__PROPERTY_CONSTRAINTS = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TEMPLATE__ID = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TEMPLATE__TYPE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>TEntity Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TEMPLATE_FEATURE_COUNT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>TEntity Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TEMPLATE_OPERATION_COUNT = TEXTENSIBLE_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tosca.impl.TArtifactTemplateImpl <em>TArtifact Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.TArtifactTemplateImpl
	 * @see tosca.impl.ToscaPackageImpl#getTArtifactTemplate()
	 * @generated
	 */
	int TARTIFACT_TEMPLATE = 40;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TEMPLATE__DOCUMENTATION = TENTITY_TEMPLATE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TEMPLATE__ANY = TENTITY_TEMPLATE__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TEMPLATE__ANY_ATTRIBUTE = TENTITY_TEMPLATE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TEMPLATE__PROPERTIES = TENTITY_TEMPLATE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Property Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TEMPLATE__PROPERTY_CONSTRAINTS = TENTITY_TEMPLATE__PROPERTY_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TEMPLATE__ID = TENTITY_TEMPLATE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TEMPLATE__TYPE = TENTITY_TEMPLATE__TYPE;

	/**
	 * The feature id for the '<em><b>Artifact References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TEMPLATE__ARTIFACT_REFERENCES = TENTITY_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TEMPLATE__NAME = TENTITY_TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TArtifact Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TEMPLATE_FEATURE_COUNT = TENTITY_TEMPLATE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TArtifact Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TEMPLATE_OPERATION_COUNT = TENTITY_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tosca.impl.TEntityTypeImpl <em>TEntity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.TEntityTypeImpl
	 * @see tosca.impl.ToscaPackageImpl#getTEntityType()
	 * @generated
	 */
	int TENTITY_TYPE = 54;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE__DOCUMENTATION = TEXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE__ANY = TEXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE__ANY_ATTRIBUTE = TEXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE__TAGS = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE__DERIVED_FROM = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Properties Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE__PROPERTIES_DEFINITION = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE__ABSTRACT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE__FINAL = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE__NAME = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE__TARGET_NAMESPACE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>TEntity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE_FEATURE_COUNT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>TEntity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE_OPERATION_COUNT = TEXTENSIBLE_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tosca.impl.TArtifactTypeImpl <em>TArtifact Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.TArtifactTypeImpl
	 * @see tosca.impl.ToscaPackageImpl#getTArtifactType()
	 * @generated
	 */
	int TARTIFACT_TYPE = 41;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TYPE__DOCUMENTATION = TENTITY_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TYPE__ANY = TENTITY_TYPE__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TYPE__ANY_ATTRIBUTE = TENTITY_TYPE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TYPE__TAGS = TENTITY_TYPE__TAGS;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TYPE__DERIVED_FROM = TENTITY_TYPE__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Properties Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TYPE__PROPERTIES_DEFINITION = TENTITY_TYPE__PROPERTIES_DEFINITION;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TYPE__ABSTRACT = TENTITY_TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TYPE__FINAL = TENTITY_TYPE__FINAL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TYPE__NAME = TENTITY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TYPE__TARGET_NAMESPACE = TENTITY_TYPE__TARGET_NAMESPACE;

	/**
	 * The number of structural features of the '<em>TArtifact Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TYPE_FEATURE_COUNT = TENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TArtifact Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TYPE_OPERATION_COUNT = TENTITY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tosca.impl.TBoundaryDefinitionsImpl <em>TBoundary Definitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.TBoundaryDefinitionsImpl
	 * @see tosca.impl.ToscaPackageImpl#getTBoundaryDefinitions()
	 * @generated
	 */
	int TBOUNDARY_DEFINITIONS = 42;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOUNDARY_DEFINITIONS__PROPERTIES = 0;

	/**
	 * The feature id for the '<em><b>Property Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOUNDARY_DEFINITIONS__PROPERTY_CONSTRAINTS = 1;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOUNDARY_DEFINITIONS__REQUIREMENTS = 2;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOUNDARY_DEFINITIONS__CAPABILITIES = 3;

	/**
	 * The feature id for the '<em><b>Policies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOUNDARY_DEFINITIONS__POLICIES = 4;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOUNDARY_DEFINITIONS__INTERFACES = 5;

	/**
	 * The number of structural features of the '<em>TBoundary Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOUNDARY_DEFINITIONS_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>TBoundary Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOUNDARY_DEFINITIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca.impl.TCapabilityImpl <em>TCapability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.TCapabilityImpl
	 * @see tosca.impl.ToscaPackageImpl#getTCapability()
	 * @generated
	 */
	int TCAPABILITY = 43;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY__DOCUMENTATION = TENTITY_TEMPLATE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY__ANY = TENTITY_TEMPLATE__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY__ANY_ATTRIBUTE = TENTITY_TEMPLATE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY__PROPERTIES = TENTITY_TEMPLATE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Property Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY__PROPERTY_CONSTRAINTS = TENTITY_TEMPLATE__PROPERTY_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY__ID = TENTITY_TEMPLATE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY__TYPE = TENTITY_TEMPLATE__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY__NAME = TENTITY_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TCapability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_FEATURE_COUNT = TENTITY_TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TCapability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_OPERATION_COUNT = TENTITY_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tosca.impl.TCapabilityDefinitionImpl <em>TCapability Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.TCapabilityDefinitionImpl
	 * @see tosca.impl.ToscaPackageImpl#getTCapabilityDefinition()
	 * @generated
	 */
	int TCAPABILITY_DEFINITION = 44;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_DEFINITION__DOCUMENTATION = TEXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_DEFINITION__ANY = TEXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_DEFINITION__ANY_ATTRIBUTE = TEXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_DEFINITION__CONSTRAINTS = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Capability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_DEFINITION__CAPABILITY_TYPE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_DEFINITION__LOWER_BOUND = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_DEFINITION__NAME = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_DEFINITION__UPPER_BOUND = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>TCapability Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_DEFINITION_FEATURE_COUNT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>TCapability Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_DEFINITION_OPERATION_COUNT = TEXTENSIBLE_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tosca.impl.TCapabilityRefImpl <em>TCapability Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.TCapabilityRefImpl
	 * @see tosca.impl.ToscaPackageImpl#getTCapabilityRef()
	 * @generated
	 */
	int TCAPABILITY_REF = 45;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_REF__NAME = 0;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_REF__REF = 1;

	/**
	 * The number of structural features of the '<em>TCapability Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_REF_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TCapability Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_REF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca.impl.TCapabilityTypeImpl <em>TCapability Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.TCapabilityTypeImpl
	 * @see tosca.impl.ToscaPackageImpl#getTCapabilityType()
	 * @generated
	 */
	int TCAPABILITY_TYPE = 46;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_TYPE__DOCUMENTATION = TENTITY_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_TYPE__ANY = TENTITY_TYPE__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_TYPE__ANY_ATTRIBUTE = TENTITY_TYPE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_TYPE__TAGS = TENTITY_TYPE__TAGS;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_TYPE__DERIVED_FROM = TENTITY_TYPE__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Properties Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_TYPE__PROPERTIES_DEFINITION = TENTITY_TYPE__PROPERTIES_DEFINITION;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_TYPE__ABSTRACT = TENTITY_TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_TYPE__FINAL = TENTITY_TYPE__FINAL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_TYPE__NAME = TENTITY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_TYPE__TARGET_NAMESPACE = TENTITY_TYPE__TARGET_NAMESPACE;

	/**
	 * The number of structural features of the '<em>TCapability Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_TYPE_FEATURE_COUNT = TENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TCapability Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_TYPE_OPERATION_COUNT = TENTITY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tosca.impl.TConditionImpl <em>TCondition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.TConditionImpl
	 * @see tosca.impl.ToscaPackageImpl#getTCondition()
	 * @generated
	 */
	int TCONDITION = 47;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONDITION__ANY = 0;

	/**
	 * The feature id for the '<em><b>Expression Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONDITION__EXPRESSION_LANGUAGE = 1;

	/**
	 * The number of structural features of the '<em>TCondition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONDITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TCondition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca.impl.TConstraintImpl <em>TConstraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.TConstraintImpl
	 * @see tosca.impl.ToscaPackageImpl#getTConstraint()
	 * @generated
	 */
	int TCONSTRAINT = 48;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONSTRAINT__ANY = 0;

	/**
	 * The feature id for the '<em><b>Constraint Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONSTRAINT__CONSTRAINT_TYPE = 1;

	/**
	 * The number of structural features of the '<em>TConstraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONSTRAINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TConstraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca.impl.TDeploymentArtifactImpl <em>TDeployment Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.TDeploymentArtifactImpl
	 * @see tosca.impl.ToscaPackageImpl#getTDeploymentArtifact()
	 * @generated
	 */
	int TDEPLOYMENT_ARTIFACT = 50;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEPLOYMENT_ARTIFACT__DOCUMENTATION = TEXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEPLOYMENT_ARTIFACT__ANY = TEXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEPLOYMENT_ARTIFACT__ANY_ATTRIBUTE = TEXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Artifact Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEPLOYMENT_ARTIFACT__ARTIFACT_REF = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEPLOYMENT_ARTIFACT__ARTIFACT_TYPE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEPLOYMENT_ARTIFACT__NAME = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TDeployment Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEPLOYMENT_ARTIFACT_FEATURE_COUNT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TDeployment Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEPLOYMENT_ARTIFACT_OPERATION_COUNT = TEXTENSIBLE_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tosca.impl.TDeploymentArtifactsImpl <em>TDeployment Artifacts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.TDeploymentArtifactsImpl
	 * @see tosca.impl.ToscaPackageImpl#getTDeploymentArtifacts()
	 * @generated
	 */
	int TDEPLOYMENT_ARTIFACTS = 51;

	/**
	 * The feature id for the '<em><b>Deployment Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEPLOYMENT_ARTIFACTS__DEPLOYMENT_ARTIFACT = 0;

	/**
	 * The number of structural features of the '<em>TDeployment Artifacts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEPLOYMENT_ARTIFACTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TDeployment Artifacts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEPLOYMENT_ARTIFACTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca.impl.TDocumentationImpl <em>TDocumentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.TDocumentationImpl
	 * @see tosca.impl.ToscaPackageImpl#getTDocumentation()
	 * @generated
	 */
	int TDOCUMENTATION = 52;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDOCUMENTATION__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDOCUMENTATION__ANY = 1;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDOCUMENTATION__LANG = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDOCUMENTATION__SOURCE = 3;

	/**
	 * The number of structural features of the '<em>TDocumentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDOCUMENTATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>TDocumentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDOCUMENTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca.impl.TExportedInterfaceImpl <em>TExported Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.TExportedInterfaceImpl
	 * @see tosca.impl.ToscaPackageImpl#getTExportedInterface()
	 * @generated
	 */
	int TEXPORTED_INTERFACE = 55;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXPORTED_INTERFACE__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXPORTED_INTERFACE__NAME = 1;

	/**
	 * The number of structural features of the '<em>TExported Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXPORTED_INTERFACE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TExported Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXPORTED_INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca.impl.TExportedOperationImpl <em>TExported Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.TExportedOperationImpl
	 * @see tosca.impl.ToscaPackageImpl#getTExportedOperation()
	 * @generated
	 */
	int TEXPORTED_OPERATION = 56;

	/**
	 * The feature id for the '<em><b>Node Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXPORTED_OPERATION__NODE_OPERATION = 0;

	/**
	 * The feature id for the '<em><b>Relationship Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXPORTED_OPERATION__RELATIONSHIP_OPERATION = 1;

	/**
	 * The feature id for the '<em><b>Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXPORTED_OPERATION__PLAN = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXPORTED_OPERATION__NAME = 3;

	/**
	 * The number of structural features of the '<em>TExported Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXPORTED_OPERATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>TExported Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXPORTED_OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca.impl.TExtensionImpl <em>TExtension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.TExtensionImpl
	 * @see tosca.impl.ToscaPackageImpl#getTExtension()
	 * @generated
	 */
	int TEXTENSION = 58;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTENSION__DOCUMENTATION = TEXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTENSION__ANY = TEXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTENSION__ANY_ATTRIBUTE = TEXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Must Understand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTENSION__MUST_UNDERSTAND = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTENSION__NAMESPACE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TExtension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTENSION_FEATURE_COUNT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TExtension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTENSION_OPERATION_COUNT = TEXTENSIBLE_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tosca.impl.TExtensionsImpl <em>TExtensions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.TExtensionsImpl
	 * @see tosca.impl.ToscaPackageImpl#getTExtensions()
	 * @generated
	 */
	int TEXTENSIONS = 59;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTENSIONS__DOCUMENTATION = TEXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTENSIONS__ANY = TEXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTENSIONS__ANY_ATTRIBUTE = TEXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTENSIONS__EXTENSION = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TExtensions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTENSIONS_FEATURE_COUNT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TExtensions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTENSIONS_OPERATION_COUNT = TEXTENSIBLE_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tosca.impl.TImplementationArtifactsImpl <em>TImplementation Artifacts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.TImplementationArtifactsImpl
	 * @see tosca.impl.ToscaPackageImpl#getTImplementationArtifacts()
	 * @generated
	 */
	int TIMPLEMENTATION_ARTIFACTS = 61;

	/**
	 * The feature id for the '<em><b>Implementation Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPLEMENTATION_ARTIFACTS__IMPLEMENTATION_ARTIFACT = 0;

	/**
	 * The number of structural features of the '<em>TImplementation Artifacts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPLEMENTATION_ARTIFACTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TImplementation Artifacts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPLEMENTATION_ARTIFACTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca.impl.TImportImpl <em>TImport</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.TImportImpl
	 * @see tosca.impl.ToscaPackageImpl#getTImport()
	 * @generated
	 */
	int TIMPORT = 62;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPORT__DOCUMENTATION = TEXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPORT__ANY = TEXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPORT__ANY_ATTRIBUTE = TEXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Import Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPORT__IMPORT_TYPE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPORT__LOCATION = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPORT__NAMESPACE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TImport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPORT_FEATURE_COUNT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TImport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPORT_OPERATION_COUNT = TEXTENSIBLE_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tosca.impl.TInterfaceImpl <em>TInterface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.TInterfaceImpl
	 * @see tosca.impl.ToscaPackageImpl#getTInterface()
	 * @generated
	 */
	int TINTERFACE = 63;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE__NAME = 1;

	/**
	 * The number of structural features of the '<em>TInterface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TInterface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca.impl.TNodeTemplateImpl <em>TNode Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.TNodeTemplateImpl
	 * @see tosca.impl.ToscaPackageImpl#getTNodeTemplate()
	 * @generated
	 */
	int TNODE_TEMPLATE = 64;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TEMPLATE__DOCUMENTATION = TENTITY_TEMPLATE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TEMPLATE__ANY = TENTITY_TEMPLATE__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TEMPLATE__ANY_ATTRIBUTE = TENTITY_TEMPLATE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TEMPLATE__PROPERTIES = TENTITY_TEMPLATE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Property Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TEMPLATE__PROPERTY_CONSTRAINTS = TENTITY_TEMPLATE__PROPERTY_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TEMPLATE__ID = TENTITY_TEMPLATE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TEMPLATE__TYPE = TENTITY_TEMPLATE__TYPE;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TEMPLATE__REQUIREMENTS = TENTITY_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TEMPLATE__CAPABILITIES = TENTITY_TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Policies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TEMPLATE__POLICIES = TENTITY_TEMPLATE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Deployment Artifacts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TEMPLATE__DEPLOYMENT_ARTIFACTS = TENTITY_TEMPLATE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Max Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TEMPLATE__MAX_INSTANCES = TENTITY_TEMPLATE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Min Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TEMPLATE__MIN_INSTANCES = TENTITY_TEMPLATE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TEMPLATE__NAME = TENTITY_TEMPLATE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>TNode Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TEMPLATE_FEATURE_COUNT = TENTITY_TEMPLATE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>TNode Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TEMPLATE_OPERATION_COUNT = TENTITY_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tosca.impl.TNodeTypeImpl <em>TNode Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.TNodeTypeImpl
	 * @see tosca.impl.ToscaPackageImpl#getTNodeType()
	 * @generated
	 */
	int TNODE_TYPE = 65;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE__DOCUMENTATION = TENTITY_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE__ANY = TENTITY_TYPE__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE__ANY_ATTRIBUTE = TENTITY_TYPE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE__TAGS = TENTITY_TYPE__TAGS;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE__DERIVED_FROM = TENTITY_TYPE__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Properties Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE__PROPERTIES_DEFINITION = TENTITY_TYPE__PROPERTIES_DEFINITION;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE__ABSTRACT = TENTITY_TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE__FINAL = TENTITY_TYPE__FINAL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE__NAME = TENTITY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE__TARGET_NAMESPACE = TENTITY_TYPE__TARGET_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Requirement Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE__REQUIREMENT_DEFINITIONS = TENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Capability Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE__CAPABILITY_DEFINITIONS = TENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Instance States</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE__INSTANCE_STATES = TENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE__INTERFACES = TENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>TNode Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE_FEATURE_COUNT = TENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>TNode Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE_OPERATION_COUNT = TENTITY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tosca.impl.TNodeTypeImplementationImpl <em>TNode Type Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.TNodeTypeImplementationImpl
	 * @see tosca.impl.ToscaPackageImpl#getTNodeTypeImplementation()
	 * @generated
	 */
	int TNODE_TYPE_IMPLEMENTATION = 66;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE_IMPLEMENTATION__DOCUMENTATION = TEXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE_IMPLEMENTATION__ANY = TEXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE_IMPLEMENTATION__ANY_ATTRIBUTE = TEXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE_IMPLEMENTATION__TAGS = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE_IMPLEMENTATION__DERIVED_FROM = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Required Container Features</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE_IMPLEMENTATION__REQUIRED_CONTAINER_FEATURES = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Implementation Artifacts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE_IMPLEMENTATION__IMPLEMENTATION_ARTIFACTS = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Deployment Artifacts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE_IMPLEMENTATION__DEPLOYMENT_ARTIFACTS = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE_IMPLEMENTATION__ABSTRACT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE_IMPLEMENTATION__FINAL = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE_IMPLEMENTATION__NAME = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE_IMPLEMENTATION__NODE_TYPE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE_IMPLEMENTATION__TARGET_NAMESPACE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>TNode Type Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE_IMPLEMENTATION_FEATURE_COUNT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>TNode Type Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE_IMPLEMENTATION_OPERATION_COUNT = TEXTENSIBLE_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tosca.impl.TOperationImpl <em>TOperation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.TOperationImpl
	 * @see tosca.impl.ToscaPackageImpl#getTOperation()
	 * @generated
	 */
	int TOPERATION = 67;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPERATION__DOCUMENTATION = TEXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPERATION__ANY = TEXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPERATION__ANY_ATTRIBUTE = TEXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Input Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPERATION__INPUT_PARAMETERS = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPERATION__OUTPUT_PARAMETERS = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPERATION__NAME = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPERATION_FEATURE_COUNT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPERATION_OPERATION_COUNT = TEXTENSIBLE_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tosca.impl.TParameterImpl <em>TParameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.TParameterImpl
	 * @see tosca.impl.ToscaPackageImpl#getTParameter()
	 * @generated
	 */
	int TPARAMETER = 68;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER__REQUIRED = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER__TYPE = 2;

	/**
	 * The number of structural features of the '<em>TParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>TParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca.impl.TPlanImpl <em>TPlan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.TPlanImpl
	 * @see tosca.impl.ToscaPackageImpl#getTPlan()
	 * @generated
	 */
	int TPLAN = 69;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN__DOCUMENTATION = TEXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN__ANY = TEXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN__ANY_ATTRIBUTE = TEXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN__PRECONDITION = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN__INPUT_PARAMETERS = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN__OUTPUT_PARAMETERS = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Plan Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN__PLAN_MODEL = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Plan Model Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN__PLAN_MODEL_REFERENCE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN__ID = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN__NAME = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Plan Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN__PLAN_LANGUAGE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Plan Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN__PLAN_TYPE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>TPlan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_FEATURE_COUNT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>TPlan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_OPERATION_COUNT = TEXTENSIBLE_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tosca.impl.TPlansImpl <em>TPlans</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.TPlansImpl
	 * @see tosca.impl.ToscaPackageImpl#getTPlans()
	 * @generated
	 */
	int TPLANS = 70;

	/**
	 * The feature id for the '<em><b>Plan</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLANS__PLAN = 0;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLANS__TARGET_NAMESPACE = 1;

	/**
	 * The number of structural features of the '<em>TPlans</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLANS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TPlans</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLANS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca.impl.TPolicyImpl <em>TPolicy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.TPolicyImpl
	 * @see tosca.impl.ToscaPackageImpl#getTPolicy()
	 * @generated
	 */
	int TPOLICY = 71;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY__DOCUMENTATION = TEXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY__ANY = TEXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY__ANY_ATTRIBUTE = TEXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY__NAME = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Policy Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY__POLICY_REF = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Policy Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY__POLICY_TYPE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TPolicy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_FEATURE_COUNT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TPolicy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_OPERATION_COUNT = TEXTENSIBLE_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tosca.impl.TPolicyTemplateImpl <em>TPolicy Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.TPolicyTemplateImpl
	 * @see tosca.impl.ToscaPackageImpl#getTPolicyTemplate()
	 * @generated
	 */
	int TPOLICY_TEMPLATE = 72;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TEMPLATE__DOCUMENTATION = TENTITY_TEMPLATE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TEMPLATE__ANY = TENTITY_TEMPLATE__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TEMPLATE__ANY_ATTRIBUTE = TENTITY_TEMPLATE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TEMPLATE__PROPERTIES = TENTITY_TEMPLATE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Property Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TEMPLATE__PROPERTY_CONSTRAINTS = TENTITY_TEMPLATE__PROPERTY_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TEMPLATE__ID = TENTITY_TEMPLATE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TEMPLATE__TYPE = TENTITY_TEMPLATE__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TEMPLATE__NAME = TENTITY_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TPolicy Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TEMPLATE_FEATURE_COUNT = TENTITY_TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TPolicy Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TEMPLATE_OPERATION_COUNT = TENTITY_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tosca.impl.TPolicyTypeImpl <em>TPolicy Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.TPolicyTypeImpl
	 * @see tosca.impl.ToscaPackageImpl#getTPolicyType()
	 * @generated
	 */
	int TPOLICY_TYPE = 73;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TYPE__DOCUMENTATION = TENTITY_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TYPE__ANY = TENTITY_TYPE__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TYPE__ANY_ATTRIBUTE = TENTITY_TYPE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TYPE__TAGS = TENTITY_TYPE__TAGS;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TYPE__DERIVED_FROM = TENTITY_TYPE__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Properties Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TYPE__PROPERTIES_DEFINITION = TENTITY_TYPE__PROPERTIES_DEFINITION;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TYPE__ABSTRACT = TENTITY_TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TYPE__FINAL = TENTITY_TYPE__FINAL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TYPE__NAME = TENTITY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TYPE__TARGET_NAMESPACE = TENTITY_TYPE__TARGET_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Applies To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TYPE__APPLIES_TO = TENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Policy Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TYPE__POLICY_LANGUAGE = TENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TPolicy Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TYPE_FEATURE_COUNT = TENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TPolicy Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TYPE_OPERATION_COUNT = TENTITY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tosca.impl.TPropertyConstraintImpl <em>TProperty Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.TPropertyConstraintImpl
	 * @see tosca.impl.ToscaPackageImpl#getTPropertyConstraint()
	 * @generated
	 */
	int TPROPERTY_CONSTRAINT = 74;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_CONSTRAINT__ANY = TCONSTRAINT__ANY;

	/**
	 * The feature id for the '<em><b>Constraint Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_CONSTRAINT__CONSTRAINT_TYPE = TCONSTRAINT__CONSTRAINT_TYPE;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_CONSTRAINT__PROPERTY = TCONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TProperty Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_CONSTRAINT_FEATURE_COUNT = TCONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TProperty Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_CONSTRAINT_OPERATION_COUNT = TCONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tosca.impl.TPropertyMappingImpl <em>TProperty Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.TPropertyMappingImpl
	 * @see tosca.impl.ToscaPackageImpl#getTPropertyMapping()
	 * @generated
	 */
	int TPROPERTY_MAPPING = 75;

	/**
	 * The feature id for the '<em><b>Service Template Property Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_MAPPING__SERVICE_TEMPLATE_PROPERTY_REF = 0;

	/**
	 * The feature id for the '<em><b>Target Object Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_MAPPING__TARGET_OBJECT_REF = 1;

	/**
	 * The feature id for the '<em><b>Target Property Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_MAPPING__TARGET_PROPERTY_REF = 2;

	/**
	 * The number of structural features of the '<em>TProperty Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_MAPPING_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>TProperty Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca.impl.TRelationshipTemplateImpl <em>TRelationship Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.TRelationshipTemplateImpl
	 * @see tosca.impl.ToscaPackageImpl#getTRelationshipTemplate()
	 * @generated
	 */
	int TRELATIONSHIP_TEMPLATE = 76;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TEMPLATE__DOCUMENTATION = TENTITY_TEMPLATE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TEMPLATE__ANY = TENTITY_TEMPLATE__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TEMPLATE__ANY_ATTRIBUTE = TENTITY_TEMPLATE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TEMPLATE__PROPERTIES = TENTITY_TEMPLATE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Property Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TEMPLATE__PROPERTY_CONSTRAINTS = TENTITY_TEMPLATE__PROPERTY_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TEMPLATE__ID = TENTITY_TEMPLATE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TEMPLATE__TYPE = TENTITY_TEMPLATE__TYPE;

	/**
	 * The feature id for the '<em><b>Source Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TEMPLATE__SOURCE_ELEMENT = TENTITY_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TEMPLATE__TARGET_ELEMENT = TENTITY_TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Relationship Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TEMPLATE__RELATIONSHIP_CONSTRAINTS = TENTITY_TEMPLATE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TEMPLATE__NAME = TENTITY_TEMPLATE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>TRelationship Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TEMPLATE_FEATURE_COUNT = TENTITY_TEMPLATE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>TRelationship Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TEMPLATE_OPERATION_COUNT = TENTITY_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tosca.impl.TRelationshipTypeImpl <em>TRelationship Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.TRelationshipTypeImpl
	 * @see tosca.impl.ToscaPackageImpl#getTRelationshipType()
	 * @generated
	 */
	int TRELATIONSHIP_TYPE = 77;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE__DOCUMENTATION = TENTITY_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE__ANY = TENTITY_TYPE__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE__ANY_ATTRIBUTE = TENTITY_TYPE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE__TAGS = TENTITY_TYPE__TAGS;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE__DERIVED_FROM = TENTITY_TYPE__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Properties Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE__PROPERTIES_DEFINITION = TENTITY_TYPE__PROPERTIES_DEFINITION;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE__ABSTRACT = TENTITY_TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE__FINAL = TENTITY_TYPE__FINAL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE__NAME = TENTITY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE__TARGET_NAMESPACE = TENTITY_TYPE__TARGET_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Instance States</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE__INSTANCE_STATES = TENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Interfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE__SOURCE_INTERFACES = TENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Interfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE__TARGET_INTERFACES = TENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Valid Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE__VALID_SOURCE = TENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Valid Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE__VALID_TARGET = TENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>TRelationship Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE_FEATURE_COUNT = TENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>TRelationship Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE_OPERATION_COUNT = TENTITY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tosca.impl.TRelationshipTypeImplementationImpl <em>TRelationship Type Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.TRelationshipTypeImplementationImpl
	 * @see tosca.impl.ToscaPackageImpl#getTRelationshipTypeImplementation()
	 * @generated
	 */
	int TRELATIONSHIP_TYPE_IMPLEMENTATION = 78;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE_IMPLEMENTATION__DOCUMENTATION = TEXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE_IMPLEMENTATION__ANY = TEXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE_IMPLEMENTATION__ANY_ATTRIBUTE = TEXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE_IMPLEMENTATION__TAGS = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE_IMPLEMENTATION__DERIVED_FROM = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Required Container Features</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE_IMPLEMENTATION__REQUIRED_CONTAINER_FEATURES = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Implementation Artifacts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE_IMPLEMENTATION__IMPLEMENTATION_ARTIFACTS = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE_IMPLEMENTATION__ABSTRACT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE_IMPLEMENTATION__FINAL = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE_IMPLEMENTATION__NAME = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Relationship Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE_IMPLEMENTATION__RELATIONSHIP_TYPE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE_IMPLEMENTATION__TARGET_NAMESPACE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>TRelationship Type Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE_IMPLEMENTATION_FEATURE_COUNT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>TRelationship Type Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE_IMPLEMENTATION_OPERATION_COUNT = TEXTENSIBLE_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tosca.impl.TRequiredContainerFeatureImpl <em>TRequired Container Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.TRequiredContainerFeatureImpl
	 * @see tosca.impl.ToscaPackageImpl#getTRequiredContainerFeature()
	 * @generated
	 */
	int TREQUIRED_CONTAINER_FEATURE = 79;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIRED_CONTAINER_FEATURE__FEATURE = 0;

	/**
	 * The number of structural features of the '<em>TRequired Container Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIRED_CONTAINER_FEATURE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TRequired Container Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIRED_CONTAINER_FEATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca.impl.TRequiredContainerFeaturesImpl <em>TRequired Container Features</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.TRequiredContainerFeaturesImpl
	 * @see tosca.impl.ToscaPackageImpl#getTRequiredContainerFeatures()
	 * @generated
	 */
	int TREQUIRED_CONTAINER_FEATURES = 80;

	/**
	 * The feature id for the '<em><b>Required Container Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIRED_CONTAINER_FEATURES__REQUIRED_CONTAINER_FEATURE = 0;

	/**
	 * The number of structural features of the '<em>TRequired Container Features</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIRED_CONTAINER_FEATURES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TRequired Container Features</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIRED_CONTAINER_FEATURES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca.impl.TRequirementImpl <em>TRequirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.TRequirementImpl
	 * @see tosca.impl.ToscaPackageImpl#getTRequirement()
	 * @generated
	 */
	int TREQUIREMENT = 81;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT__DOCUMENTATION = TENTITY_TEMPLATE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT__ANY = TENTITY_TEMPLATE__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT__ANY_ATTRIBUTE = TENTITY_TEMPLATE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT__PROPERTIES = TENTITY_TEMPLATE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Property Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT__PROPERTY_CONSTRAINTS = TENTITY_TEMPLATE__PROPERTY_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT__ID = TENTITY_TEMPLATE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT__TYPE = TENTITY_TEMPLATE__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT__NAME = TENTITY_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TRequirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_FEATURE_COUNT = TENTITY_TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TRequirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_OPERATION_COUNT = TENTITY_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tosca.impl.TRequirementDefinitionImpl <em>TRequirement Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.TRequirementDefinitionImpl
	 * @see tosca.impl.ToscaPackageImpl#getTRequirementDefinition()
	 * @generated
	 */
	int TREQUIREMENT_DEFINITION = 82;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_DEFINITION__DOCUMENTATION = TEXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_DEFINITION__ANY = TEXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_DEFINITION__ANY_ATTRIBUTE = TEXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_DEFINITION__CONSTRAINTS = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_DEFINITION__LOWER_BOUND = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_DEFINITION__NAME = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Requirement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_DEFINITION__REQUIREMENT_TYPE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_DEFINITION__UPPER_BOUND = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>TRequirement Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_DEFINITION_FEATURE_COUNT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>TRequirement Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_DEFINITION_OPERATION_COUNT = TEXTENSIBLE_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tosca.impl.TRequirementRefImpl <em>TRequirement Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.TRequirementRefImpl
	 * @see tosca.impl.ToscaPackageImpl#getTRequirementRef()
	 * @generated
	 */
	int TREQUIREMENT_REF = 83;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_REF__NAME = 0;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_REF__REF = 1;

	/**
	 * The number of structural features of the '<em>TRequirement Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_REF_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TRequirement Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_REF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca.impl.TRequirementTypeImpl <em>TRequirement Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.TRequirementTypeImpl
	 * @see tosca.impl.ToscaPackageImpl#getTRequirementType()
	 * @generated
	 */
	int TREQUIREMENT_TYPE = 84;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_TYPE__DOCUMENTATION = TENTITY_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_TYPE__ANY = TENTITY_TYPE__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_TYPE__ANY_ATTRIBUTE = TENTITY_TYPE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_TYPE__TAGS = TENTITY_TYPE__TAGS;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_TYPE__DERIVED_FROM = TENTITY_TYPE__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Properties Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_TYPE__PROPERTIES_DEFINITION = TENTITY_TYPE__PROPERTIES_DEFINITION;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_TYPE__ABSTRACT = TENTITY_TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_TYPE__FINAL = TENTITY_TYPE__FINAL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_TYPE__NAME = TENTITY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_TYPE__TARGET_NAMESPACE = TENTITY_TYPE__TARGET_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Required Capability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_TYPE__REQUIRED_CAPABILITY_TYPE = TENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TRequirement Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_TYPE_FEATURE_COUNT = TENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TRequirement Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_TYPE_OPERATION_COUNT = TENTITY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tosca.impl.TServiceTemplateImpl <em>TService Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.TServiceTemplateImpl
	 * @see tosca.impl.ToscaPackageImpl#getTServiceTemplate()
	 * @generated
	 */
	int TSERVICE_TEMPLATE = 85;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TEMPLATE__DOCUMENTATION = TEXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TEMPLATE__ANY = TEXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TEMPLATE__ANY_ATTRIBUTE = TEXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TEMPLATE__TAGS = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Boundary Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TEMPLATE__BOUNDARY_DEFINITIONS = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Topology Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TEMPLATE__TOPOLOGY_TEMPLATE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Plans</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TEMPLATE__PLANS = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TEMPLATE__ID = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TEMPLATE__NAME = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Substitutable Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TEMPLATE__SUBSTITUTABLE_NODE_TYPE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TEMPLATE__TARGET_NAMESPACE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>TService Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TEMPLATE_FEATURE_COUNT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>TService Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TEMPLATE_OPERATION_COUNT = TEXTENSIBLE_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tosca.impl.TTagImpl <em>TTag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.TTagImpl
	 * @see tosca.impl.ToscaPackageImpl#getTTag()
	 * @generated
	 */
	int TTAG = 86;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTAG__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTAG__VALUE = 1;

	/**
	 * The number of structural features of the '<em>TTag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTAG_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TTag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTAG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca.impl.TTagsImpl <em>TTags</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.TTagsImpl
	 * @see tosca.impl.ToscaPackageImpl#getTTags()
	 * @generated
	 */
	int TTAGS = 87;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTAGS__TAG = 0;

	/**
	 * The number of structural features of the '<em>TTags</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTAGS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TTags</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTAGS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca.impl.TTopologyElementInstanceStatesImpl <em>TTopology Element Instance States</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.TTopologyElementInstanceStatesImpl
	 * @see tosca.impl.ToscaPackageImpl#getTTopologyElementInstanceStates()
	 * @generated
	 */
	int TTOPOLOGY_ELEMENT_INSTANCE_STATES = 88;

	/**
	 * The feature id for the '<em><b>Instance State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTOPOLOGY_ELEMENT_INSTANCE_STATES__INSTANCE_STATE = 0;

	/**
	 * The number of structural features of the '<em>TTopology Element Instance States</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTOPOLOGY_ELEMENT_INSTANCE_STATES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TTopology Element Instance States</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTOPOLOGY_ELEMENT_INSTANCE_STATES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca.impl.TTopologyTemplateImpl <em>TTopology Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.TTopologyTemplateImpl
	 * @see tosca.impl.ToscaPackageImpl#getTTopologyTemplate()
	 * @generated
	 */
	int TTOPOLOGY_TEMPLATE = 89;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTOPOLOGY_TEMPLATE__DOCUMENTATION = TEXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTOPOLOGY_TEMPLATE__ANY = TEXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTOPOLOGY_TEMPLATE__ANY_ATTRIBUTE = TEXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTOPOLOGY_TEMPLATE__GROUP = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Node Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTOPOLOGY_TEMPLATE__NODE_TEMPLATE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Relationship Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTOPOLOGY_TEMPLATE__RELATIONSHIP_TEMPLATE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TTopology Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTOPOLOGY_TEMPLATE_FEATURE_COUNT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TTopology Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTOPOLOGY_TEMPLATE_OPERATION_COUNT = TEXTENSIBLE_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tosca.impl.TypesTypeImpl <em>Types Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.TypesTypeImpl
	 * @see tosca.impl.ToscaPackageImpl#getTypesType()
	 * @generated
	 */
	int TYPES_TYPE = 90;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_TYPE__ANY = 0;

	/**
	 * The number of structural features of the '<em>Types Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Types Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca.impl.ValidSourceTypeImpl <em>Valid Source Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.ValidSourceTypeImpl
	 * @see tosca.impl.ToscaPackageImpl#getValidSourceType()
	 * @generated
	 */
	int VALID_SOURCE_TYPE = 91;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_SOURCE_TYPE__TYPE_REF = 0;

	/**
	 * The number of structural features of the '<em>Valid Source Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_SOURCE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Valid Source Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_SOURCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca.impl.ValidTargetTypeImpl <em>Valid Target Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.ValidTargetTypeImpl
	 * @see tosca.impl.ToscaPackageImpl#getValidTargetType()
	 * @generated
	 */
	int VALID_TARGET_TYPE = 92;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_TARGET_TYPE__TYPE_REF = 0;

	/**
	 * The number of structural features of the '<em>Valid Target Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_TARGET_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Valid Target Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_TARGET_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tosca.MaxInstancesTypeMember1 <em>Max Instances Type Member1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.MaxInstancesTypeMember1
	 * @see tosca.impl.ToscaPackageImpl#getMaxInstancesTypeMember1()
	 * @generated
	 */
	int MAX_INSTANCES_TYPE_MEMBER1 = 93;

	/**
	 * The meta object id for the '{@link tosca.TBoolean <em>TBoolean</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.TBoolean
	 * @see tosca.impl.ToscaPackageImpl#getTBoolean()
	 * @generated
	 */
	int TBOOLEAN = 94;

	/**
	 * The meta object id for the '{@link tosca.UpperBoundTypeMember1 <em>Upper Bound Type Member1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.UpperBoundTypeMember1
	 * @see tosca.impl.ToscaPackageImpl#getUpperBoundTypeMember1()
	 * @generated
	 */
	int UPPER_BOUND_TYPE_MEMBER1 = 95;

	/**
	 * The meta object id for the '{@link tosca.UpperBoundTypeMember11 <em>Upper Bound Type Member11</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.UpperBoundTypeMember11
	 * @see tosca.impl.ToscaPackageImpl#getUpperBoundTypeMember11()
	 * @generated
	 */
	int UPPER_BOUND_TYPE_MEMBER11 = 96;

	/**
	 * The meta object id for the '<em>Imported URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see tosca.impl.ToscaPackageImpl#getImportedURI()
	 * @generated
	 */
	int IMPORTED_URI = 97;

	/**
	 * The meta object id for the '<em>Max Instances Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see tosca.impl.ToscaPackageImpl#getMaxInstancesType()
	 * @generated
	 */
	int MAX_INSTANCES_TYPE = 98;

	/**
	 * The meta object id for the '<em>Max Instances Type Member0</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see tosca.impl.ToscaPackageImpl#getMaxInstancesTypeMember0()
	 * @generated
	 */
	int MAX_INSTANCES_TYPE_MEMBER0 = 99;

	/**
	 * The meta object id for the '<em>Max Instances Type Member1 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.MaxInstancesTypeMember1
	 * @see tosca.impl.ToscaPackageImpl#getMaxInstancesTypeMember1Object()
	 * @generated
	 */
	int MAX_INSTANCES_TYPE_MEMBER1_OBJECT = 100;

	/**
	 * The meta object id for the '<em>TBoolean Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.TBoolean
	 * @see tosca.impl.ToscaPackageImpl#getTBooleanObject()
	 * @generated
	 */
	int TBOOLEAN_OBJECT = 101;

	/**
	 * The meta object id for the '<em>Upper Bound Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see tosca.impl.ToscaPackageImpl#getUpperBoundType()
	 * @generated
	 */
	int UPPER_BOUND_TYPE = 102;

	/**
	 * The meta object id for the '<em>Upper Bound Type1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see tosca.impl.ToscaPackageImpl#getUpperBoundType1()
	 * @generated
	 */
	int UPPER_BOUND_TYPE1 = 103;

	/**
	 * The meta object id for the '<em>Upper Bound Type Member0</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see tosca.impl.ToscaPackageImpl#getUpperBoundTypeMember0()
	 * @generated
	 */
	int UPPER_BOUND_TYPE_MEMBER0 = 104;

	/**
	 * The meta object id for the '<em>Upper Bound Type Member01</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see tosca.impl.ToscaPackageImpl#getUpperBoundTypeMember01()
	 * @generated
	 */
	int UPPER_BOUND_TYPE_MEMBER01 = 105;

	/**
	 * The meta object id for the '<em>Upper Bound Type Member1 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.UpperBoundTypeMember1
	 * @see tosca.impl.ToscaPackageImpl#getUpperBoundTypeMember1Object()
	 * @generated
	 */
	int UPPER_BOUND_TYPE_MEMBER1_OBJECT = 106;

	/**
	 * The meta object id for the '<em>Upper Bound Type Member1 Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.UpperBoundTypeMember11
	 * @see tosca.impl.ToscaPackageImpl#getUpperBoundTypeMember1Object1()
	 * @generated
	 */
	int UPPER_BOUND_TYPE_MEMBER1_OBJECT1 = 107;


	/**
	 * Returns the meta object for class '{@link tosca.ArtifactReferencesType <em>Artifact References Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact References Type</em>'.
	 * @see tosca.ArtifactReferencesType
	 * @generated
	 */
	EClass getArtifactReferencesType();

	/**
	 * Returns the meta object for the containment reference list '{@link tosca.ArtifactReferencesType#getArtifactReference <em>Artifact Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifact Reference</em>'.
	 * @see tosca.ArtifactReferencesType#getArtifactReference()
	 * @see #getArtifactReferencesType()
	 * @generated
	 */
	EReference getArtifactReferencesType_ArtifactReference();

	/**
	 * Returns the meta object for class '{@link tosca.CapabilitiesType_TCapability <em>Capabilities Type TCapability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capabilities Type TCapability</em>'.
	 * @see tosca.CapabilitiesType_TCapability
	 * @generated
	 */
	EClass getCapabilitiesType_TCapability();

	/**
	 * Returns the meta object for the containment reference list '{@link tosca.CapabilitiesType_TCapability#getCapability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capability</em>'.
	 * @see tosca.CapabilitiesType_TCapability#getCapability()
	 * @see #getCapabilitiesType_TCapability()
	 * @generated
	 */
	EReference getCapabilitiesType_TCapability_Capability();

	/**
	 * Returns the meta object for class '{@link tosca.CapabilitiesType_CapabilityRef <em>Capabilities Type Capability Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capabilities Type Capability Ref</em>'.
	 * @see tosca.CapabilitiesType_CapabilityRef
	 * @generated
	 */
	EClass getCapabilitiesType_CapabilityRef();

	/**
	 * Returns the meta object for the containment reference list '{@link tosca.CapabilitiesType_CapabilityRef#getCapability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capability</em>'.
	 * @see tosca.CapabilitiesType_CapabilityRef#getCapability()
	 * @see #getCapabilitiesType_CapabilityRef()
	 * @generated
	 */
	EReference getCapabilitiesType_CapabilityRef_Capability();

	/**
	 * Returns the meta object for class '{@link tosca.CapabilityDefinitionsType <em>Capability Definitions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability Definitions Type</em>'.
	 * @see tosca.CapabilityDefinitionsType
	 * @generated
	 */
	EClass getCapabilityDefinitionsType();

	/**
	 * Returns the meta object for the containment reference list '{@link tosca.CapabilityDefinitionsType#getCapabilityDefinition <em>Capability Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capability Definition</em>'.
	 * @see tosca.CapabilityDefinitionsType#getCapabilityDefinition()
	 * @see #getCapabilityDefinitionsType()
	 * @generated
	 */
	EReference getCapabilityDefinitionsType_CapabilityDefinition();

	/**
	 * Returns the meta object for class '{@link tosca.ConstraintsType <em>Constraints Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraints Type</em>'.
	 * @see tosca.ConstraintsType
	 * @generated
	 */
	EClass getConstraintsType();

	/**
	 * Returns the meta object for the containment reference list '{@link tosca.ConstraintsType#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraint</em>'.
	 * @see tosca.ConstraintsType#getConstraint()
	 * @see #getConstraintsType()
	 * @generated
	 */
	EReference getConstraintsType_Constraint();

	/**
	 * Returns the meta object for class '{@link tosca.DefinitionsType <em>Definitions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definitions Type</em>'.
	 * @see tosca.DefinitionsType
	 * @generated
	 */
	EClass getDefinitionsType();

	/**
	 * Returns the meta object for class '{@link tosca.DerivedFromType <em>Derived From Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derived From Type</em>'.
	 * @see tosca.DerivedFromType
	 * @generated
	 */
	EClass getDerivedFromType();

	/**
	 * Returns the meta object for the attribute '{@link tosca.DerivedFromType#getDerivedFrom <em>Derived From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derived From</em>'.
	 * @see tosca.DerivedFromType#getDerivedFrom()
	 * @see #getDerivedFromType()
	 * @generated
	 */
	EAttribute getDerivedFromType_DerivedFrom();

	/**
	 * Returns the meta object for class '{@link tosca.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see tosca.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link tosca.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see tosca.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link tosca.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see tosca.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link tosca.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see tosca.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link tosca.DocumentRoot#getDefinitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Definitions</em>'.
	 * @see tosca.DocumentRoot#getDefinitions()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Definitions();

	/**
	 * Returns the meta object for the containment reference '{@link tosca.DocumentRoot#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see tosca.DocumentRoot#getDocumentation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Documentation();

	/**
	 * Returns the meta object for class '{@link tosca.ExcludeType <em>Exclude Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exclude Type</em>'.
	 * @see tosca.ExcludeType
	 * @generated
	 */
	EClass getExcludeType();

	/**
	 * Returns the meta object for the attribute '{@link tosca.ExcludeType#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see tosca.ExcludeType#getPattern()
	 * @see #getExcludeType()
	 * @generated
	 */
	EAttribute getExcludeType_Pattern();

	/**
	 * Returns the meta object for class '{@link tosca.ExtensionsType <em>Extensions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extensions Type</em>'.
	 * @see tosca.ExtensionsType
	 * @generated
	 */
	EClass getExtensionsType();

	/**
	 * Returns the meta object for the containment reference list '{@link tosca.ExtensionsType#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extension</em>'.
	 * @see tosca.ExtensionsType#getExtension()
	 * @see #getExtensionsType()
	 * @generated
	 */
	EReference getExtensionsType_Extension();

	/**
	 * Returns the meta object for class '{@link tosca.ImplementationArtifactType <em>Implementation Artifact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implementation Artifact Type</em>'.
	 * @see tosca.ImplementationArtifactType
	 * @generated
	 */
	EClass getImplementationArtifactType();

	/**
	 * Returns the meta object for class '{@link tosca.IncludeType <em>Include Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Include Type</em>'.
	 * @see tosca.IncludeType
	 * @generated
	 */
	EClass getIncludeType();

	/**
	 * Returns the meta object for the attribute '{@link tosca.IncludeType#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see tosca.IncludeType#getPattern()
	 * @see #getIncludeType()
	 * @generated
	 */
	EAttribute getIncludeType_Pattern();

	/**
	 * Returns the meta object for class '{@link tosca.InputParametersType <em>Input Parameters Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Parameters Type</em>'.
	 * @see tosca.InputParametersType
	 * @generated
	 */
	EClass getInputParametersType();

	/**
	 * Returns the meta object for the containment reference list '{@link tosca.InputParametersType#getInputParameter <em>Input Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Parameter</em>'.
	 * @see tosca.InputParametersType#getInputParameter()
	 * @see #getInputParametersType()
	 * @generated
	 */
	EReference getInputParametersType_InputParameter();

	/**
	 * Returns the meta object for class '{@link tosca.InstanceStateType <em>Instance State Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance State Type</em>'.
	 * @see tosca.InstanceStateType
	 * @generated
	 */
	EClass getInstanceStateType();

	/**
	 * Returns the meta object for the attribute '{@link tosca.InstanceStateType#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see tosca.InstanceStateType#getState()
	 * @see #getInstanceStateType()
	 * @generated
	 */
	EAttribute getInstanceStateType_State();

	/**
	 * Returns the meta object for class '{@link tosca.InterfacesType_TInterface <em>Interfaces Type TInterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interfaces Type TInterface</em>'.
	 * @see tosca.InterfacesType_TInterface
	 * @generated
	 */
	EClass getInterfacesType_TInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link tosca.InterfacesType_TInterface#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface</em>'.
	 * @see tosca.InterfacesType_TInterface#getInterface()
	 * @see #getInterfacesType_TInterface()
	 * @generated
	 */
	EReference getInterfacesType_TInterface_Interface();

	/**
	 * Returns the meta object for class '{@link tosca.InterfacesType_TExportedInterface <em>Interfaces Type TExported Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interfaces Type TExported Interface</em>'.
	 * @see tosca.InterfacesType_TExportedInterface
	 * @generated
	 */
	EClass getInterfacesType_TExportedInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link tosca.InterfacesType_TExportedInterface#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface</em>'.
	 * @see tosca.InterfacesType_TExportedInterface#getInterface()
	 * @see #getInterfacesType_TExportedInterface()
	 * @generated
	 */
	EReference getInterfacesType_TExportedInterface_Interface();

	/**
	 * Returns the meta object for class '{@link tosca.NodeOperationType <em>Node Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Operation Type</em>'.
	 * @see tosca.NodeOperationType
	 * @generated
	 */
	EClass getNodeOperationType();

	/**
	 * Returns the meta object for the attribute '{@link tosca.NodeOperationType#getInterfaceName <em>Interface Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Name</em>'.
	 * @see tosca.NodeOperationType#getInterfaceName()
	 * @see #getNodeOperationType()
	 * @generated
	 */
	EAttribute getNodeOperationType_InterfaceName();

	/**
	 * Returns the meta object for the attribute '{@link tosca.NodeOperationType#getNodeRef <em>Node Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Ref</em>'.
	 * @see tosca.NodeOperationType#getNodeRef()
	 * @see #getNodeOperationType()
	 * @generated
	 */
	EAttribute getNodeOperationType_NodeRef();

	/**
	 * Returns the meta object for the attribute '{@link tosca.NodeOperationType#getOperationName <em>Operation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Name</em>'.
	 * @see tosca.NodeOperationType#getOperationName()
	 * @see #getNodeOperationType()
	 * @generated
	 */
	EAttribute getNodeOperationType_OperationName();

	/**
	 * Returns the meta object for class '{@link tosca.NodeTypeReferenceType <em>Node Type Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Type Reference Type</em>'.
	 * @see tosca.NodeTypeReferenceType
	 * @generated
	 */
	EClass getNodeTypeReferenceType();

	/**
	 * Returns the meta object for the attribute '{@link tosca.NodeTypeReferenceType#getTypeRef <em>Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Ref</em>'.
	 * @see tosca.NodeTypeReferenceType#getTypeRef()
	 * @see #getNodeTypeReferenceType()
	 * @generated
	 */
	EAttribute getNodeTypeReferenceType_TypeRef();

	/**
	 * Returns the meta object for class '{@link tosca.OutputParametersType <em>Output Parameters Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Parameters Type</em>'.
	 * @see tosca.OutputParametersType
	 * @generated
	 */
	EClass getOutputParametersType();

	/**
	 * Returns the meta object for the containment reference list '{@link tosca.OutputParametersType#getOutputParameter <em>Output Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Parameter</em>'.
	 * @see tosca.OutputParametersType#getOutputParameter()
	 * @see #getOutputParametersType()
	 * @generated
	 */
	EReference getOutputParametersType_OutputParameter();

	/**
	 * Returns the meta object for class '{@link tosca.PlanModelReferenceType <em>Plan Model Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan Model Reference Type</em>'.
	 * @see tosca.PlanModelReferenceType
	 * @generated
	 */
	EClass getPlanModelReferenceType();

	/**
	 * Returns the meta object for the attribute '{@link tosca.PlanModelReferenceType#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see tosca.PlanModelReferenceType#getReference()
	 * @see #getPlanModelReferenceType()
	 * @generated
	 */
	EAttribute getPlanModelReferenceType_Reference();

	/**
	 * Returns the meta object for class '{@link tosca.PlanModelType <em>Plan Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan Model Type</em>'.
	 * @see tosca.PlanModelType
	 * @generated
	 */
	EClass getPlanModelType();

	/**
	 * Returns the meta object for the attribute list '{@link tosca.PlanModelType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see tosca.PlanModelType#getAny()
	 * @see #getPlanModelType()
	 * @generated
	 */
	EAttribute getPlanModelType_Any();

	/**
	 * Returns the meta object for class '{@link tosca.PlanType <em>Plan Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan Type</em>'.
	 * @see tosca.PlanType
	 * @generated
	 */
	EClass getPlanType();

	/**
	 * Returns the meta object for the attribute '{@link tosca.PlanType#getPlanRef <em>Plan Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plan Ref</em>'.
	 * @see tosca.PlanType#getPlanRef()
	 * @see #getPlanType()
	 * @generated
	 */
	EAttribute getPlanType_PlanRef();

	/**
	 * Returns the meta object for class '{@link tosca.PoliciesType <em>Policies Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policies Type</em>'.
	 * @see tosca.PoliciesType
	 * @generated
	 */
	EClass getPoliciesType();

	/**
	 * Returns the meta object for the containment reference list '{@link tosca.PoliciesType#getPolicy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Policy</em>'.
	 * @see tosca.PoliciesType#getPolicy()
	 * @see #getPoliciesType()
	 * @generated
	 */
	EReference getPoliciesType_Policy();

	/**
	 * Returns the meta object for class '{@link tosca.PropertiesDefinitionType <em>Properties Definition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Properties Definition Type</em>'.
	 * @see tosca.PropertiesDefinitionType
	 * @generated
	 */
	EClass getPropertiesDefinitionType();

	/**
	 * Returns the meta object for the attribute '{@link tosca.PropertiesDefinitionType#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element</em>'.
	 * @see tosca.PropertiesDefinitionType#getElement()
	 * @see #getPropertiesDefinitionType()
	 * @generated
	 */
	EAttribute getPropertiesDefinitionType_Element();

	/**
	 * Returns the meta object for the attribute '{@link tosca.PropertiesDefinitionType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see tosca.PropertiesDefinitionType#getType()
	 * @see #getPropertiesDefinitionType()
	 * @generated
	 */
	EAttribute getPropertiesDefinitionType_Type();

	/**
	 * Returns the meta object for class '{@link tosca.PropertiesType <em>Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Properties Type</em>'.
	 * @see tosca.PropertiesType
	 * @generated
	 */
	EClass getPropertiesType();

	/**
	 * Returns the meta object for the attribute list '{@link tosca.PropertiesType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see tosca.PropertiesType#getAny()
	 * @see #getPropertiesType()
	 * @generated
	 */
	EAttribute getPropertiesType_Any();

	/**
	 * Returns the meta object for class '{@link tosca.PropertiesTypeWithPropertyMappings <em>Properties Type With Property Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Properties Type With Property Mappings</em>'.
	 * @see tosca.PropertiesTypeWithPropertyMappings
	 * @generated
	 */
	EClass getPropertiesTypeWithPropertyMappings();

	/**
	 * Returns the meta object for the attribute list '{@link tosca.PropertiesTypeWithPropertyMappings#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see tosca.PropertiesTypeWithPropertyMappings#getAny()
	 * @see #getPropertiesTypeWithPropertyMappings()
	 * @generated
	 */
	EAttribute getPropertiesTypeWithPropertyMappings_Any();

	/**
	 * Returns the meta object for the containment reference '{@link tosca.PropertiesTypeWithPropertyMappings#getPropertyMappings <em>Property Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Mappings</em>'.
	 * @see tosca.PropertiesTypeWithPropertyMappings#getPropertyMappings()
	 * @see #getPropertiesTypeWithPropertyMappings()
	 * @generated
	 */
	EReference getPropertiesTypeWithPropertyMappings_PropertyMappings();

	/**
	 * Returns the meta object for class '{@link tosca.PropertyConstraintsType <em>Property Constraints Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Constraints Type</em>'.
	 * @see tosca.PropertyConstraintsType
	 * @generated
	 */
	EClass getPropertyConstraintsType();

	/**
	 * Returns the meta object for the containment reference list '{@link tosca.PropertyConstraintsType#getPropertyConstraint <em>Property Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property Constraint</em>'.
	 * @see tosca.PropertyConstraintsType#getPropertyConstraint()
	 * @see #getPropertyConstraintsType()
	 * @generated
	 */
	EReference getPropertyConstraintsType_PropertyConstraint();

	/**
	 * Returns the meta object for class '{@link tosca.PropertyMappingsType <em>Property Mappings Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Mappings Type</em>'.
	 * @see tosca.PropertyMappingsType
	 * @generated
	 */
	EClass getPropertyMappingsType();

	/**
	 * Returns the meta object for the containment reference list '{@link tosca.PropertyMappingsType#getPropertyMapping <em>Property Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property Mapping</em>'.
	 * @see tosca.PropertyMappingsType#getPropertyMapping()
	 * @see #getPropertyMappingsType()
	 * @generated
	 */
	EReference getPropertyMappingsType_PropertyMapping();

	/**
	 * Returns the meta object for class '{@link tosca.RelationshipConstraintsType <em>Relationship Constraints Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Constraints Type</em>'.
	 * @see tosca.RelationshipConstraintsType
	 * @generated
	 */
	EClass getRelationshipConstraintsType();

	/**
	 * Returns the meta object for the containment reference list '{@link tosca.RelationshipConstraintsType#getRelationshipConstraint <em>Relationship Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationship Constraint</em>'.
	 * @see tosca.RelationshipConstraintsType#getRelationshipConstraint()
	 * @see #getRelationshipConstraintsType()
	 * @generated
	 */
	EReference getRelationshipConstraintsType_RelationshipConstraint();

	/**
	 * Returns the meta object for class '{@link tosca.RelationshipConstraintType <em>Relationship Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Constraint Type</em>'.
	 * @see tosca.RelationshipConstraintType
	 * @generated
	 */
	EClass getRelationshipConstraintType();

	/**
	 * Returns the meta object for the attribute list '{@link tosca.RelationshipConstraintType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see tosca.RelationshipConstraintType#getAny()
	 * @see #getRelationshipConstraintType()
	 * @generated
	 */
	EAttribute getRelationshipConstraintType_Any();

	/**
	 * Returns the meta object for the attribute '{@link tosca.RelationshipConstraintType#getConstraintType <em>Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint Type</em>'.
	 * @see tosca.RelationshipConstraintType#getConstraintType()
	 * @see #getRelationshipConstraintType()
	 * @generated
	 */
	EAttribute getRelationshipConstraintType_ConstraintType();

	/**
	 * Returns the meta object for class '{@link tosca.RelationshipOperationType <em>Relationship Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Operation Type</em>'.
	 * @see tosca.RelationshipOperationType
	 * @generated
	 */
	EClass getRelationshipOperationType();

	/**
	 * Returns the meta object for the attribute '{@link tosca.RelationshipOperationType#getInterfaceName <em>Interface Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Name</em>'.
	 * @see tosca.RelationshipOperationType#getInterfaceName()
	 * @see #getRelationshipOperationType()
	 * @generated
	 */
	EAttribute getRelationshipOperationType_InterfaceName();

	/**
	 * Returns the meta object for the attribute '{@link tosca.RelationshipOperationType#getOperationName <em>Operation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Name</em>'.
	 * @see tosca.RelationshipOperationType#getOperationName()
	 * @see #getRelationshipOperationType()
	 * @generated
	 */
	EAttribute getRelationshipOperationType_OperationName();

	/**
	 * Returns the meta object for the attribute '{@link tosca.RelationshipOperationType#getRelationshipRef <em>Relationship Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relationship Ref</em>'.
	 * @see tosca.RelationshipOperationType#getRelationshipRef()
	 * @see #getRelationshipOperationType()
	 * @generated
	 */
	EAttribute getRelationshipOperationType_RelationshipRef();

	/**
	 * Returns the meta object for class '{@link tosca.RequirementDefinitionsType <em>Requirement Definitions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement Definitions Type</em>'.
	 * @see tosca.RequirementDefinitionsType
	 * @generated
	 */
	EClass getRequirementDefinitionsType();

	/**
	 * Returns the meta object for the containment reference list '{@link tosca.RequirementDefinitionsType#getRequirementDefinition <em>Requirement Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirement Definition</em>'.
	 * @see tosca.RequirementDefinitionsType#getRequirementDefinition()
	 * @see #getRequirementDefinitionsType()
	 * @generated
	 */
	EReference getRequirementDefinitionsType_RequirementDefinition();

	/**
	 * Returns the meta object for class '{@link tosca.RequirementsType_TRequirement <em>Requirements Type TRequirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirements Type TRequirement</em>'.
	 * @see tosca.RequirementsType_TRequirement
	 * @generated
	 */
	EClass getRequirementsType_TRequirement();

	/**
	 * Returns the meta object for the containment reference list '{@link tosca.RequirementsType_TRequirement#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirement</em>'.
	 * @see tosca.RequirementsType_TRequirement#getRequirement()
	 * @see #getRequirementsType_TRequirement()
	 * @generated
	 */
	EReference getRequirementsType_TRequirement_Requirement();

	/**
	 * Returns the meta object for class '{@link tosca.RequirementsType_TRequirementRef <em>Requirements Type TRequirement Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirements Type TRequirement Ref</em>'.
	 * @see tosca.RequirementsType_TRequirementRef
	 * @generated
	 */
	EClass getRequirementsType_TRequirementRef();

	/**
	 * Returns the meta object for the containment reference list '{@link tosca.RequirementsType_TRequirementRef#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirement</em>'.
	 * @see tosca.RequirementsType_TRequirementRef#getRequirement()
	 * @see #getRequirementsType_TRequirementRef()
	 * @generated
	 */
	EReference getRequirementsType_TRequirementRef_Requirement();

	/**
	 * Returns the meta object for class '{@link tosca.SourceElementType <em>Source Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Element Type</em>'.
	 * @see tosca.SourceElementType
	 * @generated
	 */
	EClass getSourceElementType();

	/**
	 * Returns the meta object for the attribute '{@link tosca.SourceElementType#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see tosca.SourceElementType#getRef()
	 * @see #getSourceElementType()
	 * @generated
	 */
	EAttribute getSourceElementType_Ref();

	/**
	 * Returns the meta object for class '{@link tosca.SourceInterfacesType <em>Source Interfaces Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Interfaces Type</em>'.
	 * @see tosca.SourceInterfacesType
	 * @generated
	 */
	EClass getSourceInterfacesType();

	/**
	 * Returns the meta object for the containment reference list '{@link tosca.SourceInterfacesType#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface</em>'.
	 * @see tosca.SourceInterfacesType#getInterface()
	 * @see #getSourceInterfacesType()
	 * @generated
	 */
	EReference getSourceInterfacesType_Interface();

	/**
	 * Returns the meta object for class '{@link tosca.TAppliesTo <em>TApplies To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TApplies To</em>'.
	 * @see tosca.TAppliesTo
	 * @generated
	 */
	EClass getTAppliesTo();

	/**
	 * Returns the meta object for the containment reference list '{@link tosca.TAppliesTo#getNodeTypeReference <em>Node Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node Type Reference</em>'.
	 * @see tosca.TAppliesTo#getNodeTypeReference()
	 * @see #getTAppliesTo()
	 * @generated
	 */
	EReference getTAppliesTo_NodeTypeReference();

	/**
	 * Returns the meta object for class '{@link tosca.TargetElementType <em>Target Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Element Type</em>'.
	 * @see tosca.TargetElementType
	 * @generated
	 */
	EClass getTargetElementType();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TargetElementType#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see tosca.TargetElementType#getRef()
	 * @see #getTargetElementType()
	 * @generated
	 */
	EAttribute getTargetElementType_Ref();

	/**
	 * Returns the meta object for class '{@link tosca.TargetInterfacesType <em>Target Interfaces Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Interfaces Type</em>'.
	 * @see tosca.TargetInterfacesType
	 * @generated
	 */
	EClass getTargetInterfacesType();

	/**
	 * Returns the meta object for the containment reference list '{@link tosca.TargetInterfacesType#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface</em>'.
	 * @see tosca.TargetInterfacesType#getInterface()
	 * @see #getTargetInterfacesType()
	 * @generated
	 */
	EReference getTargetInterfacesType_Interface();

	/**
	 * Returns the meta object for class '{@link tosca.TArtifactReference <em>TArtifact Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TArtifact Reference</em>'.
	 * @see tosca.TArtifactReference
	 * @generated
	 */
	EClass getTArtifactReference();

	/**
	 * Returns the meta object for the attribute list '{@link tosca.TArtifactReference#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see tosca.TArtifactReference#getGroup()
	 * @see #getTArtifactReference()
	 * @generated
	 */
	EAttribute getTArtifactReference_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link tosca.TArtifactReference#getInclude <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Include</em>'.
	 * @see tosca.TArtifactReference#getInclude()
	 * @see #getTArtifactReference()
	 * @generated
	 */
	EReference getTArtifactReference_Include();

	/**
	 * Returns the meta object for the containment reference list '{@link tosca.TArtifactReference#getExclude <em>Exclude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exclude</em>'.
	 * @see tosca.TArtifactReference#getExclude()
	 * @see #getTArtifactReference()
	 * @generated
	 */
	EReference getTArtifactReference_Exclude();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TArtifactReference#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see tosca.TArtifactReference#getReference()
	 * @see #getTArtifactReference()
	 * @generated
	 */
	EAttribute getTArtifactReference_Reference();

	/**
	 * Returns the meta object for class '{@link tosca.TArtifactTemplate <em>TArtifact Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TArtifact Template</em>'.
	 * @see tosca.TArtifactTemplate
	 * @generated
	 */
	EClass getTArtifactTemplate();

	/**
	 * Returns the meta object for the containment reference '{@link tosca.TArtifactTemplate#getArtifactReferences <em>Artifact References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Artifact References</em>'.
	 * @see tosca.TArtifactTemplate#getArtifactReferences()
	 * @see #getTArtifactTemplate()
	 * @generated
	 */
	EReference getTArtifactTemplate_ArtifactReferences();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TArtifactTemplate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tosca.TArtifactTemplate#getName()
	 * @see #getTArtifactTemplate()
	 * @generated
	 */
	EAttribute getTArtifactTemplate_Name();

	/**
	 * Returns the meta object for class '{@link tosca.TArtifactType <em>TArtifact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TArtifact Type</em>'.
	 * @see tosca.TArtifactType
	 * @generated
	 */
	EClass getTArtifactType();

	/**
	 * Returns the meta object for class '{@link tosca.TBoundaryDefinitions <em>TBoundary Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TBoundary Definitions</em>'.
	 * @see tosca.TBoundaryDefinitions
	 * @generated
	 */
	EClass getTBoundaryDefinitions();

	/**
	 * Returns the meta object for the containment reference '{@link tosca.TBoundaryDefinitions#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see tosca.TBoundaryDefinitions#getProperties()
	 * @see #getTBoundaryDefinitions()
	 * @generated
	 */
	EReference getTBoundaryDefinitions_Properties();

	/**
	 * Returns the meta object for the containment reference '{@link tosca.TBoundaryDefinitions#getPropertyConstraints <em>Property Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Constraints</em>'.
	 * @see tosca.TBoundaryDefinitions#getPropertyConstraints()
	 * @see #getTBoundaryDefinitions()
	 * @generated
	 */
	EReference getTBoundaryDefinitions_PropertyConstraints();

	/**
	 * Returns the meta object for the containment reference '{@link tosca.TBoundaryDefinitions#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Requirements</em>'.
	 * @see tosca.TBoundaryDefinitions#getRequirements()
	 * @see #getTBoundaryDefinitions()
	 * @generated
	 */
	EReference getTBoundaryDefinitions_Requirements();

	/**
	 * Returns the meta object for the containment reference '{@link tosca.TBoundaryDefinitions#getCapabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Capabilities</em>'.
	 * @see tosca.TBoundaryDefinitions#getCapabilities()
	 * @see #getTBoundaryDefinitions()
	 * @generated
	 */
	EReference getTBoundaryDefinitions_Capabilities();

	/**
	 * Returns the meta object for the containment reference '{@link tosca.TBoundaryDefinitions#getPolicies <em>Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Policies</em>'.
	 * @see tosca.TBoundaryDefinitions#getPolicies()
	 * @see #getTBoundaryDefinitions()
	 * @generated
	 */
	EReference getTBoundaryDefinitions_Policies();

	/**
	 * Returns the meta object for the containment reference '{@link tosca.TBoundaryDefinitions#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interfaces</em>'.
	 * @see tosca.TBoundaryDefinitions#getInterfaces()
	 * @see #getTBoundaryDefinitions()
	 * @generated
	 */
	EReference getTBoundaryDefinitions_Interfaces();

	/**
	 * Returns the meta object for class '{@link tosca.TCapability <em>TCapability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCapability</em>'.
	 * @see tosca.TCapability
	 * @generated
	 */
	EClass getTCapability();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TCapability#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tosca.TCapability#getName()
	 * @see #getTCapability()
	 * @generated
	 */
	EAttribute getTCapability_Name();

	/**
	 * Returns the meta object for class '{@link tosca.TCapabilityDefinition <em>TCapability Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCapability Definition</em>'.
	 * @see tosca.TCapabilityDefinition
	 * @generated
	 */
	EClass getTCapabilityDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link tosca.TCapabilityDefinition#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraints</em>'.
	 * @see tosca.TCapabilityDefinition#getConstraints()
	 * @see #getTCapabilityDefinition()
	 * @generated
	 */
	EReference getTCapabilityDefinition_Constraints();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TCapabilityDefinition#getCapabilityType <em>Capability Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capability Type</em>'.
	 * @see tosca.TCapabilityDefinition#getCapabilityType()
	 * @see #getTCapabilityDefinition()
	 * @generated
	 */
	EAttribute getTCapabilityDefinition_CapabilityType();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TCapabilityDefinition#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see tosca.TCapabilityDefinition#getLowerBound()
	 * @see #getTCapabilityDefinition()
	 * @generated
	 */
	EAttribute getTCapabilityDefinition_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TCapabilityDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tosca.TCapabilityDefinition#getName()
	 * @see #getTCapabilityDefinition()
	 * @generated
	 */
	EAttribute getTCapabilityDefinition_Name();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TCapabilityDefinition#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see tosca.TCapabilityDefinition#getUpperBound()
	 * @see #getTCapabilityDefinition()
	 * @generated
	 */
	EAttribute getTCapabilityDefinition_UpperBound();

	/**
	 * Returns the meta object for class '{@link tosca.TCapabilityRef <em>TCapability Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCapability Ref</em>'.
	 * @see tosca.TCapabilityRef
	 * @generated
	 */
	EClass getTCapabilityRef();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TCapabilityRef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tosca.TCapabilityRef#getName()
	 * @see #getTCapabilityRef()
	 * @generated
	 */
	EAttribute getTCapabilityRef_Name();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TCapabilityRef#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see tosca.TCapabilityRef#getRef()
	 * @see #getTCapabilityRef()
	 * @generated
	 */
	EAttribute getTCapabilityRef_Ref();

	/**
	 * Returns the meta object for class '{@link tosca.TCapabilityType <em>TCapability Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCapability Type</em>'.
	 * @see tosca.TCapabilityType
	 * @generated
	 */
	EClass getTCapabilityType();

	/**
	 * Returns the meta object for class '{@link tosca.TCondition <em>TCondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCondition</em>'.
	 * @see tosca.TCondition
	 * @generated
	 */
	EClass getTCondition();

	/**
	 * Returns the meta object for the attribute list '{@link tosca.TCondition#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see tosca.TCondition#getAny()
	 * @see #getTCondition()
	 * @generated
	 */
	EAttribute getTCondition_Any();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TCondition#getExpressionLanguage <em>Expression Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression Language</em>'.
	 * @see tosca.TCondition#getExpressionLanguage()
	 * @see #getTCondition()
	 * @generated
	 */
	EAttribute getTCondition_ExpressionLanguage();

	/**
	 * Returns the meta object for class '{@link tosca.TConstraint <em>TConstraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TConstraint</em>'.
	 * @see tosca.TConstraint
	 * @generated
	 */
	EClass getTConstraint();

	/**
	 * Returns the meta object for the attribute list '{@link tosca.TConstraint#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see tosca.TConstraint#getAny()
	 * @see #getTConstraint()
	 * @generated
	 */
	EAttribute getTConstraint_Any();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TConstraint#getConstraintType <em>Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint Type</em>'.
	 * @see tosca.TConstraint#getConstraintType()
	 * @see #getTConstraint()
	 * @generated
	 */
	EAttribute getTConstraint_ConstraintType();

	/**
	 * Returns the meta object for class '{@link tosca.TDefinitions <em>TDefinitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDefinitions</em>'.
	 * @see tosca.TDefinitions
	 * @generated
	 */
	EClass getTDefinitions();

	/**
	 * Returns the meta object for the containment reference '{@link tosca.TDefinitions#getExtensions <em>Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extensions</em>'.
	 * @see tosca.TDefinitions#getExtensions()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_Extensions();

	/**
	 * Returns the meta object for the containment reference list '{@link tosca.TDefinitions#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Import</em>'.
	 * @see tosca.TDefinitions#getImport()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_Import();

	/**
	 * Returns the meta object for the containment reference '{@link tosca.TDefinitions#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Types</em>'.
	 * @see tosca.TDefinitions#getTypes()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_Types();

	/**
	 * Returns the meta object for the attribute list '{@link tosca.TDefinitions#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see tosca.TDefinitions#getGroup()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EAttribute getTDefinitions_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link tosca.TDefinitions#getServiceTemplate <em>Service Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Template</em>'.
	 * @see tosca.TDefinitions#getServiceTemplate()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_ServiceTemplate();

	/**
	 * Returns the meta object for the containment reference list '{@link tosca.TDefinitions#getNodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node Type</em>'.
	 * @see tosca.TDefinitions#getNodeType()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_NodeType();

	/**
	 * Returns the meta object for the containment reference list '{@link tosca.TDefinitions#getNodeTypeImplementation <em>Node Type Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node Type Implementation</em>'.
	 * @see tosca.TDefinitions#getNodeTypeImplementation()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_NodeTypeImplementation();

	/**
	 * Returns the meta object for the containment reference list '{@link tosca.TDefinitions#getRelationshipType <em>Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationship Type</em>'.
	 * @see tosca.TDefinitions#getRelationshipType()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_RelationshipType();

	/**
	 * Returns the meta object for the containment reference list '{@link tosca.TDefinitions#getRelationshipTypeImplementation <em>Relationship Type Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationship Type Implementation</em>'.
	 * @see tosca.TDefinitions#getRelationshipTypeImplementation()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_RelationshipTypeImplementation();

	/**
	 * Returns the meta object for the containment reference list '{@link tosca.TDefinitions#getRequirementType <em>Requirement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirement Type</em>'.
	 * @see tosca.TDefinitions#getRequirementType()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_RequirementType();

	/**
	 * Returns the meta object for the containment reference list '{@link tosca.TDefinitions#getCapabilityType <em>Capability Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capability Type</em>'.
	 * @see tosca.TDefinitions#getCapabilityType()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_CapabilityType();

	/**
	 * Returns the meta object for the containment reference list '{@link tosca.TDefinitions#getArtifactType <em>Artifact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifact Type</em>'.
	 * @see tosca.TDefinitions#getArtifactType()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_ArtifactType();

	/**
	 * Returns the meta object for the containment reference list '{@link tosca.TDefinitions#getArtifactTemplate <em>Artifact Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifact Template</em>'.
	 * @see tosca.TDefinitions#getArtifactTemplate()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_ArtifactTemplate();

	/**
	 * Returns the meta object for the containment reference list '{@link tosca.TDefinitions#getPolicyType <em>Policy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Policy Type</em>'.
	 * @see tosca.TDefinitions#getPolicyType()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_PolicyType();

	/**
	 * Returns the meta object for the containment reference list '{@link tosca.TDefinitions#getPolicyTemplate <em>Policy Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Policy Template</em>'.
	 * @see tosca.TDefinitions#getPolicyTemplate()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_PolicyTemplate();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TDefinitions#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tosca.TDefinitions#getId()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EAttribute getTDefinitions_Id();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TDefinitions#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tosca.TDefinitions#getName()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EAttribute getTDefinitions_Name();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TDefinitions#getTargetNamespace <em>Target Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Namespace</em>'.
	 * @see tosca.TDefinitions#getTargetNamespace()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EAttribute getTDefinitions_TargetNamespace();

	/**
	 * Returns the meta object for class '{@link tosca.TDeploymentArtifact <em>TDeployment Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDeployment Artifact</em>'.
	 * @see tosca.TDeploymentArtifact
	 * @generated
	 */
	EClass getTDeploymentArtifact();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TDeploymentArtifact#getArtifactRef <em>Artifact Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact Ref</em>'.
	 * @see tosca.TDeploymentArtifact#getArtifactRef()
	 * @see #getTDeploymentArtifact()
	 * @generated
	 */
	EAttribute getTDeploymentArtifact_ArtifactRef();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TDeploymentArtifact#getArtifactType <em>Artifact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact Type</em>'.
	 * @see tosca.TDeploymentArtifact#getArtifactType()
	 * @see #getTDeploymentArtifact()
	 * @generated
	 */
	EAttribute getTDeploymentArtifact_ArtifactType();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TDeploymentArtifact#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tosca.TDeploymentArtifact#getName()
	 * @see #getTDeploymentArtifact()
	 * @generated
	 */
	EAttribute getTDeploymentArtifact_Name();

	/**
	 * Returns the meta object for class '{@link tosca.TDeploymentArtifacts <em>TDeployment Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDeployment Artifacts</em>'.
	 * @see tosca.TDeploymentArtifacts
	 * @generated
	 */
	EClass getTDeploymentArtifacts();

	/**
	 * Returns the meta object for the containment reference list '{@link tosca.TDeploymentArtifacts#getDeploymentArtifact <em>Deployment Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deployment Artifact</em>'.
	 * @see tosca.TDeploymentArtifacts#getDeploymentArtifact()
	 * @see #getTDeploymentArtifacts()
	 * @generated
	 */
	EReference getTDeploymentArtifacts_DeploymentArtifact();

	/**
	 * Returns the meta object for class '{@link tosca.TDocumentation <em>TDocumentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDocumentation</em>'.
	 * @see tosca.TDocumentation
	 * @generated
	 */
	EClass getTDocumentation();

	/**
	 * Returns the meta object for the attribute list '{@link tosca.TDocumentation#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see tosca.TDocumentation#getMixed()
	 * @see #getTDocumentation()
	 * @generated
	 */
	EAttribute getTDocumentation_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link tosca.TDocumentation#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see tosca.TDocumentation#getAny()
	 * @see #getTDocumentation()
	 * @generated
	 */
	EAttribute getTDocumentation_Any();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TDocumentation#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see tosca.TDocumentation#getLang()
	 * @see #getTDocumentation()
	 * @generated
	 */
	EAttribute getTDocumentation_Lang();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TDocumentation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see tosca.TDocumentation#getSource()
	 * @see #getTDocumentation()
	 * @generated
	 */
	EAttribute getTDocumentation_Source();

	/**
	 * Returns the meta object for class '{@link tosca.TEntityTemplate <em>TEntity Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TEntity Template</em>'.
	 * @see tosca.TEntityTemplate
	 * @generated
	 */
	EClass getTEntityTemplate();

	/**
	 * Returns the meta object for the containment reference list '{@link tosca.TEntityTemplate#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see tosca.TEntityTemplate#getProperties()
	 * @see #getTEntityTemplate()
	 * @generated
	 */
	EReference getTEntityTemplate_Properties();

	/**
	 * Returns the meta object for the containment reference '{@link tosca.TEntityTemplate#getPropertyConstraints <em>Property Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Constraints</em>'.
	 * @see tosca.TEntityTemplate#getPropertyConstraints()
	 * @see #getTEntityTemplate()
	 * @generated
	 */
	EReference getTEntityTemplate_PropertyConstraints();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TEntityTemplate#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tosca.TEntityTemplate#getId()
	 * @see #getTEntityTemplate()
	 * @generated
	 */
	EAttribute getTEntityTemplate_Id();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TEntityTemplate#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see tosca.TEntityTemplate#getType()
	 * @see #getTEntityTemplate()
	 * @generated
	 */
	EAttribute getTEntityTemplate_Type();

	/**
	 * Returns the meta object for class '{@link tosca.TEntityType <em>TEntity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TEntity Type</em>'.
	 * @see tosca.TEntityType
	 * @generated
	 */
	EClass getTEntityType();

	/**
	 * Returns the meta object for the containment reference '{@link tosca.TEntityType#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tags</em>'.
	 * @see tosca.TEntityType#getTags()
	 * @see #getTEntityType()
	 * @generated
	 */
	EReference getTEntityType_Tags();

	/**
	 * Returns the meta object for the containment reference '{@link tosca.TEntityType#getDerivedFrom <em>Derived From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Derived From</em>'.
	 * @see tosca.TEntityType#getDerivedFrom()
	 * @see #getTEntityType()
	 * @generated
	 */
	EReference getTEntityType_DerivedFrom();

	/**
	 * Returns the meta object for the containment reference '{@link tosca.TEntityType#getPropertiesDefinition <em>Properties Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties Definition</em>'.
	 * @see tosca.TEntityType#getPropertiesDefinition()
	 * @see #getTEntityType()
	 * @generated
	 */
	EReference getTEntityType_PropertiesDefinition();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TEntityType#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see tosca.TEntityType#getAbstract()
	 * @see #getTEntityType()
	 * @generated
	 */
	EAttribute getTEntityType_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TEntityType#getFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final</em>'.
	 * @see tosca.TEntityType#getFinal()
	 * @see #getTEntityType()
	 * @generated
	 */
	EAttribute getTEntityType_Final();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TEntityType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tosca.TEntityType#getName()
	 * @see #getTEntityType()
	 * @generated
	 */
	EAttribute getTEntityType_Name();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TEntityType#getTargetNamespace <em>Target Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Namespace</em>'.
	 * @see tosca.TEntityType#getTargetNamespace()
	 * @see #getTEntityType()
	 * @generated
	 */
	EAttribute getTEntityType_TargetNamespace();

	/**
	 * Returns the meta object for class '{@link tosca.TExportedInterface <em>TExported Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TExported Interface</em>'.
	 * @see tosca.TExportedInterface
	 * @generated
	 */
	EClass getTExportedInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link tosca.TExportedInterface#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation</em>'.
	 * @see tosca.TExportedInterface#getOperation()
	 * @see #getTExportedInterface()
	 * @generated
	 */
	EReference getTExportedInterface_Operation();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TExportedInterface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tosca.TExportedInterface#getName()
	 * @see #getTExportedInterface()
	 * @generated
	 */
	EAttribute getTExportedInterface_Name();

	/**
	 * Returns the meta object for class '{@link tosca.TExportedOperation <em>TExported Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TExported Operation</em>'.
	 * @see tosca.TExportedOperation
	 * @generated
	 */
	EClass getTExportedOperation();

	/**
	 * Returns the meta object for the containment reference '{@link tosca.TExportedOperation#getNodeOperation <em>Node Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Node Operation</em>'.
	 * @see tosca.TExportedOperation#getNodeOperation()
	 * @see #getTExportedOperation()
	 * @generated
	 */
	EReference getTExportedOperation_NodeOperation();

	/**
	 * Returns the meta object for the containment reference '{@link tosca.TExportedOperation#getRelationshipOperation <em>Relationship Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relationship Operation</em>'.
	 * @see tosca.TExportedOperation#getRelationshipOperation()
	 * @see #getTExportedOperation()
	 * @generated
	 */
	EReference getTExportedOperation_RelationshipOperation();

	/**
	 * Returns the meta object for the containment reference '{@link tosca.TExportedOperation#getPlan <em>Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plan</em>'.
	 * @see tosca.TExportedOperation#getPlan()
	 * @see #getTExportedOperation()
	 * @generated
	 */
	EReference getTExportedOperation_Plan();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TExportedOperation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tosca.TExportedOperation#getName()
	 * @see #getTExportedOperation()
	 * @generated
	 */
	EAttribute getTExportedOperation_Name();

	/**
	 * Returns the meta object for class '{@link tosca.TExtensibleElements <em>TExtensible Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TExtensible Elements</em>'.
	 * @see tosca.TExtensibleElements
	 * @generated
	 */
	EClass getTExtensibleElements();

	/**
	 * Returns the meta object for the containment reference list '{@link tosca.TExtensibleElements#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentation</em>'.
	 * @see tosca.TExtensibleElements#getDocumentation()
	 * @see #getTExtensibleElements()
	 * @generated
	 */
	EReference getTExtensibleElements_Documentation();

	/**
	 * Returns the meta object for the attribute list '{@link tosca.TExtensibleElements#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see tosca.TExtensibleElements#getAny()
	 * @see #getTExtensibleElements()
	 * @generated
	 */
	EAttribute getTExtensibleElements_Any();

	/**
	 * Returns the meta object for the attribute list '{@link tosca.TExtensibleElements#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see tosca.TExtensibleElements#getAnyAttribute()
	 * @see #getTExtensibleElements()
	 * @generated
	 */
	EAttribute getTExtensibleElements_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link tosca.TExtension <em>TExtension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TExtension</em>'.
	 * @see tosca.TExtension
	 * @generated
	 */
	EClass getTExtension();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TExtension#getMustUnderstand <em>Must Understand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Must Understand</em>'.
	 * @see tosca.TExtension#getMustUnderstand()
	 * @see #getTExtension()
	 * @generated
	 */
	EAttribute getTExtension_MustUnderstand();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TExtension#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see tosca.TExtension#getNamespace()
	 * @see #getTExtension()
	 * @generated
	 */
	EAttribute getTExtension_Namespace();

	/**
	 * Returns the meta object for class '{@link tosca.TExtensions <em>TExtensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TExtensions</em>'.
	 * @see tosca.TExtensions
	 * @generated
	 */
	EClass getTExtensions();

	/**
	 * Returns the meta object for the containment reference list '{@link tosca.TExtensions#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extension</em>'.
	 * @see tosca.TExtensions#getExtension()
	 * @see #getTExtensions()
	 * @generated
	 */
	EReference getTExtensions_Extension();

	/**
	 * Returns the meta object for class '{@link tosca.TImplementationArtifact <em>TImplementation Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TImplementation Artifact</em>'.
	 * @see tosca.TImplementationArtifact
	 * @generated
	 */
	EClass getTImplementationArtifact();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TImplementationArtifact#getArtifactRef <em>Artifact Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact Ref</em>'.
	 * @see tosca.TImplementationArtifact#getArtifactRef()
	 * @see #getTImplementationArtifact()
	 * @generated
	 */
	EAttribute getTImplementationArtifact_ArtifactRef();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TImplementationArtifact#getArtifactType <em>Artifact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact Type</em>'.
	 * @see tosca.TImplementationArtifact#getArtifactType()
	 * @see #getTImplementationArtifact()
	 * @generated
	 */
	EAttribute getTImplementationArtifact_ArtifactType();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TImplementationArtifact#getInterfaceName <em>Interface Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Name</em>'.
	 * @see tosca.TImplementationArtifact#getInterfaceName()
	 * @see #getTImplementationArtifact()
	 * @generated
	 */
	EAttribute getTImplementationArtifact_InterfaceName();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TImplementationArtifact#getOperationName <em>Operation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Name</em>'.
	 * @see tosca.TImplementationArtifact#getOperationName()
	 * @see #getTImplementationArtifact()
	 * @generated
	 */
	EAttribute getTImplementationArtifact_OperationName();

	/**
	 * Returns the meta object for class '{@link tosca.TImplementationArtifacts <em>TImplementation Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TImplementation Artifacts</em>'.
	 * @see tosca.TImplementationArtifacts
	 * @generated
	 */
	EClass getTImplementationArtifacts();

	/**
	 * Returns the meta object for the containment reference list '{@link tosca.TImplementationArtifacts#getImplementationArtifact <em>Implementation Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Implementation Artifact</em>'.
	 * @see tosca.TImplementationArtifacts#getImplementationArtifact()
	 * @see #getTImplementationArtifacts()
	 * @generated
	 */
	EReference getTImplementationArtifacts_ImplementationArtifact();

	/**
	 * Returns the meta object for class '{@link tosca.TImport <em>TImport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TImport</em>'.
	 * @see tosca.TImport
	 * @generated
	 */
	EClass getTImport();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TImport#getImportType <em>Import Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import Type</em>'.
	 * @see tosca.TImport#getImportType()
	 * @see #getTImport()
	 * @generated
	 */
	EAttribute getTImport_ImportType();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TImport#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see tosca.TImport#getLocation()
	 * @see #getTImport()
	 * @generated
	 */
	EAttribute getTImport_Location();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TImport#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see tosca.TImport#getNamespace()
	 * @see #getTImport()
	 * @generated
	 */
	EAttribute getTImport_Namespace();

	/**
	 * Returns the meta object for class '{@link tosca.TInterface <em>TInterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TInterface</em>'.
	 * @see tosca.TInterface
	 * @generated
	 */
	EClass getTInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link tosca.TInterface#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation</em>'.
	 * @see tosca.TInterface#getOperation()
	 * @see #getTInterface()
	 * @generated
	 */
	EReference getTInterface_Operation();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TInterface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tosca.TInterface#getName()
	 * @see #getTInterface()
	 * @generated
	 */
	EAttribute getTInterface_Name();

	/**
	 * Returns the meta object for class '{@link tosca.TNodeTemplate <em>TNode Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TNode Template</em>'.
	 * @see tosca.TNodeTemplate
	 * @generated
	 */
	EClass getTNodeTemplate();

	/**
	 * Returns the meta object for the containment reference '{@link tosca.TNodeTemplate#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Requirements</em>'.
	 * @see tosca.TNodeTemplate#getRequirements()
	 * @see #getTNodeTemplate()
	 * @generated
	 */
	EReference getTNodeTemplate_Requirements();

	/**
	 * Returns the meta object for the containment reference '{@link tosca.TNodeTemplate#getCapabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Capabilities</em>'.
	 * @see tosca.TNodeTemplate#getCapabilities()
	 * @see #getTNodeTemplate()
	 * @generated
	 */
	EReference getTNodeTemplate_Capabilities();

	/**
	 * Returns the meta object for the containment reference '{@link tosca.TNodeTemplate#getPolicies <em>Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Policies</em>'.
	 * @see tosca.TNodeTemplate#getPolicies()
	 * @see #getTNodeTemplate()
	 * @generated
	 */
	EReference getTNodeTemplate_Policies();

	/**
	 * Returns the meta object for the containment reference '{@link tosca.TNodeTemplate#getDeploymentArtifacts <em>Deployment Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deployment Artifacts</em>'.
	 * @see tosca.TNodeTemplate#getDeploymentArtifacts()
	 * @see #getTNodeTemplate()
	 * @generated
	 */
	EReference getTNodeTemplate_DeploymentArtifacts();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TNodeTemplate#getMaxInstances <em>Max Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Instances</em>'.
	 * @see tosca.TNodeTemplate#getMaxInstances()
	 * @see #getTNodeTemplate()
	 * @generated
	 */
	EAttribute getTNodeTemplate_MaxInstances();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TNodeTemplate#getMinInstances <em>Min Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Instances</em>'.
	 * @see tosca.TNodeTemplate#getMinInstances()
	 * @see #getTNodeTemplate()
	 * @generated
	 */
	EAttribute getTNodeTemplate_MinInstances();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TNodeTemplate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tosca.TNodeTemplate#getName()
	 * @see #getTNodeTemplate()
	 * @generated
	 */
	EAttribute getTNodeTemplate_Name();

	/**
	 * Returns the meta object for class '{@link tosca.TNodeType <em>TNode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TNode Type</em>'.
	 * @see tosca.TNodeType
	 * @generated
	 */
	EClass getTNodeType();

	/**
	 * Returns the meta object for the containment reference '{@link tosca.TNodeType#getRequirementDefinitions <em>Requirement Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Requirement Definitions</em>'.
	 * @see tosca.TNodeType#getRequirementDefinitions()
	 * @see #getTNodeType()
	 * @generated
	 */
	EReference getTNodeType_RequirementDefinitions();

	/**
	 * Returns the meta object for the containment reference '{@link tosca.TNodeType#getCapabilityDefinitions <em>Capability Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Capability Definitions</em>'.
	 * @see tosca.TNodeType#getCapabilityDefinitions()
	 * @see #getTNodeType()
	 * @generated
	 */
	EReference getTNodeType_CapabilityDefinitions();

	/**
	 * Returns the meta object for the containment reference '{@link tosca.TNodeType#getInstanceStates <em>Instance States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Instance States</em>'.
	 * @see tosca.TNodeType#getInstanceStates()
	 * @see #getTNodeType()
	 * @generated
	 */
	EReference getTNodeType_InstanceStates();

	/**
	 * Returns the meta object for the containment reference '{@link tosca.TNodeType#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interfaces</em>'.
	 * @see tosca.TNodeType#getInterfaces()
	 * @see #getTNodeType()
	 * @generated
	 */
	EReference getTNodeType_Interfaces();

	/**
	 * Returns the meta object for class '{@link tosca.TNodeTypeImplementation <em>TNode Type Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TNode Type Implementation</em>'.
	 * @see tosca.TNodeTypeImplementation
	 * @generated
	 */
	EClass getTNodeTypeImplementation();

	/**
	 * Returns the meta object for the containment reference '{@link tosca.TNodeTypeImplementation#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tags</em>'.
	 * @see tosca.TNodeTypeImplementation#getTags()
	 * @see #getTNodeTypeImplementation()
	 * @generated
	 */
	EReference getTNodeTypeImplementation_Tags();

	/**
	 * Returns the meta object for the containment reference '{@link tosca.TNodeTypeImplementation#getDerivedFrom <em>Derived From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Derived From</em>'.
	 * @see tosca.TNodeTypeImplementation#getDerivedFrom()
	 * @see #getTNodeTypeImplementation()
	 * @generated
	 */
	EReference getTNodeTypeImplementation_DerivedFrom();

	/**
	 * Returns the meta object for the containment reference '{@link tosca.TNodeTypeImplementation#getRequiredContainerFeatures <em>Required Container Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Required Container Features</em>'.
	 * @see tosca.TNodeTypeImplementation#getRequiredContainerFeatures()
	 * @see #getTNodeTypeImplementation()
	 * @generated
	 */
	EReference getTNodeTypeImplementation_RequiredContainerFeatures();

	/**
	 * Returns the meta object for the containment reference '{@link tosca.TNodeTypeImplementation#getImplementationArtifacts <em>Implementation Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implementation Artifacts</em>'.
	 * @see tosca.TNodeTypeImplementation#getImplementationArtifacts()
	 * @see #getTNodeTypeImplementation()
	 * @generated
	 */
	EReference getTNodeTypeImplementation_ImplementationArtifacts();

	/**
	 * Returns the meta object for the containment reference '{@link tosca.TNodeTypeImplementation#getDeploymentArtifacts <em>Deployment Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deployment Artifacts</em>'.
	 * @see tosca.TNodeTypeImplementation#getDeploymentArtifacts()
	 * @see #getTNodeTypeImplementation()
	 * @generated
	 */
	EReference getTNodeTypeImplementation_DeploymentArtifacts();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TNodeTypeImplementation#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see tosca.TNodeTypeImplementation#getAbstract()
	 * @see #getTNodeTypeImplementation()
	 * @generated
	 */
	EAttribute getTNodeTypeImplementation_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TNodeTypeImplementation#getFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final</em>'.
	 * @see tosca.TNodeTypeImplementation#getFinal()
	 * @see #getTNodeTypeImplementation()
	 * @generated
	 */
	EAttribute getTNodeTypeImplementation_Final();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TNodeTypeImplementation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tosca.TNodeTypeImplementation#getName()
	 * @see #getTNodeTypeImplementation()
	 * @generated
	 */
	EAttribute getTNodeTypeImplementation_Name();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TNodeTypeImplementation#getNodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Type</em>'.
	 * @see tosca.TNodeTypeImplementation#getNodeType()
	 * @see #getTNodeTypeImplementation()
	 * @generated
	 */
	EAttribute getTNodeTypeImplementation_NodeType();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TNodeTypeImplementation#getTargetNamespace <em>Target Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Namespace</em>'.
	 * @see tosca.TNodeTypeImplementation#getTargetNamespace()
	 * @see #getTNodeTypeImplementation()
	 * @generated
	 */
	EAttribute getTNodeTypeImplementation_TargetNamespace();

	/**
	 * Returns the meta object for class '{@link tosca.TOperation <em>TOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TOperation</em>'.
	 * @see tosca.TOperation
	 * @generated
	 */
	EClass getTOperation();

	/**
	 * Returns the meta object for the containment reference '{@link tosca.TOperation#getInputParameters <em>Input Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Parameters</em>'.
	 * @see tosca.TOperation#getInputParameters()
	 * @see #getTOperation()
	 * @generated
	 */
	EReference getTOperation_InputParameters();

	/**
	 * Returns the meta object for the containment reference '{@link tosca.TOperation#getOutputParameters <em>Output Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Parameters</em>'.
	 * @see tosca.TOperation#getOutputParameters()
	 * @see #getTOperation()
	 * @generated
	 */
	EReference getTOperation_OutputParameters();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TOperation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tosca.TOperation#getName()
	 * @see #getTOperation()
	 * @generated
	 */
	EAttribute getTOperation_Name();

	/**
	 * Returns the meta object for class '{@link tosca.TParameter <em>TParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TParameter</em>'.
	 * @see tosca.TParameter
	 * @generated
	 */
	EClass getTParameter();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tosca.TParameter#getName()
	 * @see #getTParameter()
	 * @generated
	 */
	EAttribute getTParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TParameter#getRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see tosca.TParameter#getRequired()
	 * @see #getTParameter()
	 * @generated
	 */
	EAttribute getTParameter_Required();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see tosca.TParameter#getType()
	 * @see #getTParameter()
	 * @generated
	 */
	EAttribute getTParameter_Type();

	/**
	 * Returns the meta object for class '{@link tosca.TPlan <em>TPlan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPlan</em>'.
	 * @see tosca.TPlan
	 * @generated
	 */
	EClass getTPlan();

	/**
	 * Returns the meta object for the containment reference '{@link tosca.TPlan#getPrecondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Precondition</em>'.
	 * @see tosca.TPlan#getPrecondition()
	 * @see #getTPlan()
	 * @generated
	 */
	EReference getTPlan_Precondition();

	/**
	 * Returns the meta object for the containment reference '{@link tosca.TPlan#getInputParameters <em>Input Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Parameters</em>'.
	 * @see tosca.TPlan#getInputParameters()
	 * @see #getTPlan()
	 * @generated
	 */
	EReference getTPlan_InputParameters();

	/**
	 * Returns the meta object for the containment reference '{@link tosca.TPlan#getOutputParameters <em>Output Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Parameters</em>'.
	 * @see tosca.TPlan#getOutputParameters()
	 * @see #getTPlan()
	 * @generated
	 */
	EReference getTPlan_OutputParameters();

	/**
	 * Returns the meta object for the containment reference '{@link tosca.TPlan#getPlanModel <em>Plan Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plan Model</em>'.
	 * @see tosca.TPlan#getPlanModel()
	 * @see #getTPlan()
	 * @generated
	 */
	EReference getTPlan_PlanModel();

	/**
	 * Returns the meta object for the containment reference '{@link tosca.TPlan#getPlanModelReference <em>Plan Model Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plan Model Reference</em>'.
	 * @see tosca.TPlan#getPlanModelReference()
	 * @see #getTPlan()
	 * @generated
	 */
	EReference getTPlan_PlanModelReference();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TPlan#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tosca.TPlan#getId()
	 * @see #getTPlan()
	 * @generated
	 */
	EAttribute getTPlan_Id();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TPlan#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tosca.TPlan#getName()
	 * @see #getTPlan()
	 * @generated
	 */
	EAttribute getTPlan_Name();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TPlan#getPlanLanguage <em>Plan Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plan Language</em>'.
	 * @see tosca.TPlan#getPlanLanguage()
	 * @see #getTPlan()
	 * @generated
	 */
	EAttribute getTPlan_PlanLanguage();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TPlan#getPlanType <em>Plan Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plan Type</em>'.
	 * @see tosca.TPlan#getPlanType()
	 * @see #getTPlan()
	 * @generated
	 */
	EAttribute getTPlan_PlanType();

	/**
	 * Returns the meta object for class '{@link tosca.TPlans <em>TPlans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPlans</em>'.
	 * @see tosca.TPlans
	 * @generated
	 */
	EClass getTPlans();

	/**
	 * Returns the meta object for the containment reference list '{@link tosca.TPlans#getPlan <em>Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plan</em>'.
	 * @see tosca.TPlans#getPlan()
	 * @see #getTPlans()
	 * @generated
	 */
	EReference getTPlans_Plan();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TPlans#getTargetNamespace <em>Target Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Namespace</em>'.
	 * @see tosca.TPlans#getTargetNamespace()
	 * @see #getTPlans()
	 * @generated
	 */
	EAttribute getTPlans_TargetNamespace();

	/**
	 * Returns the meta object for class '{@link tosca.TPolicy <em>TPolicy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPolicy</em>'.
	 * @see tosca.TPolicy
	 * @generated
	 */
	EClass getTPolicy();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TPolicy#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tosca.TPolicy#getName()
	 * @see #getTPolicy()
	 * @generated
	 */
	EAttribute getTPolicy_Name();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TPolicy#getPolicyRef <em>Policy Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy Ref</em>'.
	 * @see tosca.TPolicy#getPolicyRef()
	 * @see #getTPolicy()
	 * @generated
	 */
	EAttribute getTPolicy_PolicyRef();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TPolicy#getPolicyType <em>Policy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy Type</em>'.
	 * @see tosca.TPolicy#getPolicyType()
	 * @see #getTPolicy()
	 * @generated
	 */
	EAttribute getTPolicy_PolicyType();

	/**
	 * Returns the meta object for class '{@link tosca.TPolicyTemplate <em>TPolicy Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPolicy Template</em>'.
	 * @see tosca.TPolicyTemplate
	 * @generated
	 */
	EClass getTPolicyTemplate();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TPolicyTemplate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tosca.TPolicyTemplate#getName()
	 * @see #getTPolicyTemplate()
	 * @generated
	 */
	EAttribute getTPolicyTemplate_Name();

	/**
	 * Returns the meta object for class '{@link tosca.TPolicyType <em>TPolicy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPolicy Type</em>'.
	 * @see tosca.TPolicyType
	 * @generated
	 */
	EClass getTPolicyType();

	/**
	 * Returns the meta object for the containment reference '{@link tosca.TPolicyType#getAppliesTo <em>Applies To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Applies To</em>'.
	 * @see tosca.TPolicyType#getAppliesTo()
	 * @see #getTPolicyType()
	 * @generated
	 */
	EReference getTPolicyType_AppliesTo();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TPolicyType#getPolicyLanguage <em>Policy Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy Language</em>'.
	 * @see tosca.TPolicyType#getPolicyLanguage()
	 * @see #getTPolicyType()
	 * @generated
	 */
	EAttribute getTPolicyType_PolicyLanguage();

	/**
	 * Returns the meta object for class '{@link tosca.TPropertyConstraint <em>TProperty Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TProperty Constraint</em>'.
	 * @see tosca.TPropertyConstraint
	 * @generated
	 */
	EClass getTPropertyConstraint();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TPropertyConstraint#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property</em>'.
	 * @see tosca.TPropertyConstraint#getProperty()
	 * @see #getTPropertyConstraint()
	 * @generated
	 */
	EAttribute getTPropertyConstraint_Property();

	/**
	 * Returns the meta object for class '{@link tosca.TPropertyMapping <em>TProperty Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TProperty Mapping</em>'.
	 * @see tosca.TPropertyMapping
	 * @generated
	 */
	EClass getTPropertyMapping();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TPropertyMapping#getServiceTemplatePropertyRef <em>Service Template Property Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Template Property Ref</em>'.
	 * @see tosca.TPropertyMapping#getServiceTemplatePropertyRef()
	 * @see #getTPropertyMapping()
	 * @generated
	 */
	EAttribute getTPropertyMapping_ServiceTemplatePropertyRef();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TPropertyMapping#getTargetObjectRef <em>Target Object Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Object Ref</em>'.
	 * @see tosca.TPropertyMapping#getTargetObjectRef()
	 * @see #getTPropertyMapping()
	 * @generated
	 */
	EAttribute getTPropertyMapping_TargetObjectRef();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TPropertyMapping#getTargetPropertyRef <em>Target Property Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Property Ref</em>'.
	 * @see tosca.TPropertyMapping#getTargetPropertyRef()
	 * @see #getTPropertyMapping()
	 * @generated
	 */
	EAttribute getTPropertyMapping_TargetPropertyRef();

	/**
	 * Returns the meta object for class '{@link tosca.TRelationshipTemplate <em>TRelationship Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TRelationship Template</em>'.
	 * @see tosca.TRelationshipTemplate
	 * @generated
	 */
	EClass getTRelationshipTemplate();

	/**
	 * Returns the meta object for the containment reference '{@link tosca.TRelationshipTemplate#getSourceElement <em>Source Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Element</em>'.
	 * @see tosca.TRelationshipTemplate#getSourceElement()
	 * @see #getTRelationshipTemplate()
	 * @generated
	 */
	EReference getTRelationshipTemplate_SourceElement();

	/**
	 * Returns the meta object for the containment reference '{@link tosca.TRelationshipTemplate#getTargetElement <em>Target Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Element</em>'.
	 * @see tosca.TRelationshipTemplate#getTargetElement()
	 * @see #getTRelationshipTemplate()
	 * @generated
	 */
	EReference getTRelationshipTemplate_TargetElement();

	/**
	 * Returns the meta object for the containment reference '{@link tosca.TRelationshipTemplate#getRelationshipConstraints <em>Relationship Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relationship Constraints</em>'.
	 * @see tosca.TRelationshipTemplate#getRelationshipConstraints()
	 * @see #getTRelationshipTemplate()
	 * @generated
	 */
	EReference getTRelationshipTemplate_RelationshipConstraints();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TRelationshipTemplate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tosca.TRelationshipTemplate#getName()
	 * @see #getTRelationshipTemplate()
	 * @generated
	 */
	EAttribute getTRelationshipTemplate_Name();

	/**
	 * Returns the meta object for class '{@link tosca.TRelationshipType <em>TRelationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TRelationship Type</em>'.
	 * @see tosca.TRelationshipType
	 * @generated
	 */
	EClass getTRelationshipType();

	/**
	 * Returns the meta object for the containment reference '{@link tosca.TRelationshipType#getInstanceStates <em>Instance States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Instance States</em>'.
	 * @see tosca.TRelationshipType#getInstanceStates()
	 * @see #getTRelationshipType()
	 * @generated
	 */
	EReference getTRelationshipType_InstanceStates();

	/**
	 * Returns the meta object for the containment reference '{@link tosca.TRelationshipType#getSourceInterfaces <em>Source Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Interfaces</em>'.
	 * @see tosca.TRelationshipType#getSourceInterfaces()
	 * @see #getTRelationshipType()
	 * @generated
	 */
	EReference getTRelationshipType_SourceInterfaces();

	/**
	 * Returns the meta object for the containment reference '{@link tosca.TRelationshipType#getTargetInterfaces <em>Target Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Interfaces</em>'.
	 * @see tosca.TRelationshipType#getTargetInterfaces()
	 * @see #getTRelationshipType()
	 * @generated
	 */
	EReference getTRelationshipType_TargetInterfaces();

	/**
	 * Returns the meta object for the containment reference '{@link tosca.TRelationshipType#getValidSource <em>Valid Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Valid Source</em>'.
	 * @see tosca.TRelationshipType#getValidSource()
	 * @see #getTRelationshipType()
	 * @generated
	 */
	EReference getTRelationshipType_ValidSource();

	/**
	 * Returns the meta object for the containment reference '{@link tosca.TRelationshipType#getValidTarget <em>Valid Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Valid Target</em>'.
	 * @see tosca.TRelationshipType#getValidTarget()
	 * @see #getTRelationshipType()
	 * @generated
	 */
	EReference getTRelationshipType_ValidTarget();

	/**
	 * Returns the meta object for class '{@link tosca.TRelationshipTypeImplementation <em>TRelationship Type Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TRelationship Type Implementation</em>'.
	 * @see tosca.TRelationshipTypeImplementation
	 * @generated
	 */
	EClass getTRelationshipTypeImplementation();

	/**
	 * Returns the meta object for the containment reference '{@link tosca.TRelationshipTypeImplementation#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tags</em>'.
	 * @see tosca.TRelationshipTypeImplementation#getTags()
	 * @see #getTRelationshipTypeImplementation()
	 * @generated
	 */
	EReference getTRelationshipTypeImplementation_Tags();

	/**
	 * Returns the meta object for the containment reference '{@link tosca.TRelationshipTypeImplementation#getDerivedFrom <em>Derived From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Derived From</em>'.
	 * @see tosca.TRelationshipTypeImplementation#getDerivedFrom()
	 * @see #getTRelationshipTypeImplementation()
	 * @generated
	 */
	EReference getTRelationshipTypeImplementation_DerivedFrom();

	/**
	 * Returns the meta object for the containment reference '{@link tosca.TRelationshipTypeImplementation#getRequiredContainerFeatures <em>Required Container Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Required Container Features</em>'.
	 * @see tosca.TRelationshipTypeImplementation#getRequiredContainerFeatures()
	 * @see #getTRelationshipTypeImplementation()
	 * @generated
	 */
	EReference getTRelationshipTypeImplementation_RequiredContainerFeatures();

	/**
	 * Returns the meta object for the containment reference '{@link tosca.TRelationshipTypeImplementation#getImplementationArtifacts <em>Implementation Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implementation Artifacts</em>'.
	 * @see tosca.TRelationshipTypeImplementation#getImplementationArtifacts()
	 * @see #getTRelationshipTypeImplementation()
	 * @generated
	 */
	EReference getTRelationshipTypeImplementation_ImplementationArtifacts();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TRelationshipTypeImplementation#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see tosca.TRelationshipTypeImplementation#getAbstract()
	 * @see #getTRelationshipTypeImplementation()
	 * @generated
	 */
	EAttribute getTRelationshipTypeImplementation_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TRelationshipTypeImplementation#getFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final</em>'.
	 * @see tosca.TRelationshipTypeImplementation#getFinal()
	 * @see #getTRelationshipTypeImplementation()
	 * @generated
	 */
	EAttribute getTRelationshipTypeImplementation_Final();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TRelationshipTypeImplementation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tosca.TRelationshipTypeImplementation#getName()
	 * @see #getTRelationshipTypeImplementation()
	 * @generated
	 */
	EAttribute getTRelationshipTypeImplementation_Name();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TRelationshipTypeImplementation#getRelationshipType <em>Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relationship Type</em>'.
	 * @see tosca.TRelationshipTypeImplementation#getRelationshipType()
	 * @see #getTRelationshipTypeImplementation()
	 * @generated
	 */
	EAttribute getTRelationshipTypeImplementation_RelationshipType();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TRelationshipTypeImplementation#getTargetNamespace <em>Target Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Namespace</em>'.
	 * @see tosca.TRelationshipTypeImplementation#getTargetNamespace()
	 * @see #getTRelationshipTypeImplementation()
	 * @generated
	 */
	EAttribute getTRelationshipTypeImplementation_TargetNamespace();

	/**
	 * Returns the meta object for class '{@link tosca.TRequiredContainerFeature <em>TRequired Container Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TRequired Container Feature</em>'.
	 * @see tosca.TRequiredContainerFeature
	 * @generated
	 */
	EClass getTRequiredContainerFeature();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TRequiredContainerFeature#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature</em>'.
	 * @see tosca.TRequiredContainerFeature#getFeature()
	 * @see #getTRequiredContainerFeature()
	 * @generated
	 */
	EAttribute getTRequiredContainerFeature_Feature();

	/**
	 * Returns the meta object for class '{@link tosca.TRequiredContainerFeatures <em>TRequired Container Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TRequired Container Features</em>'.
	 * @see tosca.TRequiredContainerFeatures
	 * @generated
	 */
	EClass getTRequiredContainerFeatures();

	/**
	 * Returns the meta object for the containment reference list '{@link tosca.TRequiredContainerFeatures#getRequiredContainerFeature <em>Required Container Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Container Feature</em>'.
	 * @see tosca.TRequiredContainerFeatures#getRequiredContainerFeature()
	 * @see #getTRequiredContainerFeatures()
	 * @generated
	 */
	EReference getTRequiredContainerFeatures_RequiredContainerFeature();

	/**
	 * Returns the meta object for class '{@link tosca.TRequirement <em>TRequirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TRequirement</em>'.
	 * @see tosca.TRequirement
	 * @generated
	 */
	EClass getTRequirement();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TRequirement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tosca.TRequirement#getName()
	 * @see #getTRequirement()
	 * @generated
	 */
	EAttribute getTRequirement_Name();

	/**
	 * Returns the meta object for class '{@link tosca.TRequirementDefinition <em>TRequirement Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TRequirement Definition</em>'.
	 * @see tosca.TRequirementDefinition
	 * @generated
	 */
	EClass getTRequirementDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link tosca.TRequirementDefinition#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraints</em>'.
	 * @see tosca.TRequirementDefinition#getConstraints()
	 * @see #getTRequirementDefinition()
	 * @generated
	 */
	EReference getTRequirementDefinition_Constraints();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TRequirementDefinition#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see tosca.TRequirementDefinition#getLowerBound()
	 * @see #getTRequirementDefinition()
	 * @generated
	 */
	EAttribute getTRequirementDefinition_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TRequirementDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tosca.TRequirementDefinition#getName()
	 * @see #getTRequirementDefinition()
	 * @generated
	 */
	EAttribute getTRequirementDefinition_Name();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TRequirementDefinition#getRequirementType <em>Requirement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requirement Type</em>'.
	 * @see tosca.TRequirementDefinition#getRequirementType()
	 * @see #getTRequirementDefinition()
	 * @generated
	 */
	EAttribute getTRequirementDefinition_RequirementType();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TRequirementDefinition#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see tosca.TRequirementDefinition#getUpperBound()
	 * @see #getTRequirementDefinition()
	 * @generated
	 */
	EAttribute getTRequirementDefinition_UpperBound();

	/**
	 * Returns the meta object for class '{@link tosca.TRequirementRef <em>TRequirement Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TRequirement Ref</em>'.
	 * @see tosca.TRequirementRef
	 * @generated
	 */
	EClass getTRequirementRef();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TRequirementRef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tosca.TRequirementRef#getName()
	 * @see #getTRequirementRef()
	 * @generated
	 */
	EAttribute getTRequirementRef_Name();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TRequirementRef#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see tosca.TRequirementRef#getRef()
	 * @see #getTRequirementRef()
	 * @generated
	 */
	EAttribute getTRequirementRef_Ref();

	/**
	 * Returns the meta object for class '{@link tosca.TRequirementType <em>TRequirement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TRequirement Type</em>'.
	 * @see tosca.TRequirementType
	 * @generated
	 */
	EClass getTRequirementType();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TRequirementType#getRequiredCapabilityType <em>Required Capability Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Capability Type</em>'.
	 * @see tosca.TRequirementType#getRequiredCapabilityType()
	 * @see #getTRequirementType()
	 * @generated
	 */
	EAttribute getTRequirementType_RequiredCapabilityType();

	/**
	 * Returns the meta object for class '{@link tosca.TServiceTemplate <em>TService Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TService Template</em>'.
	 * @see tosca.TServiceTemplate
	 * @generated
	 */
	EClass getTServiceTemplate();

	/**
	 * Returns the meta object for the containment reference '{@link tosca.TServiceTemplate#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tags</em>'.
	 * @see tosca.TServiceTemplate#getTags()
	 * @see #getTServiceTemplate()
	 * @generated
	 */
	EReference getTServiceTemplate_Tags();

	/**
	 * Returns the meta object for the containment reference '{@link tosca.TServiceTemplate#getBoundaryDefinitions <em>Boundary Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Boundary Definitions</em>'.
	 * @see tosca.TServiceTemplate#getBoundaryDefinitions()
	 * @see #getTServiceTemplate()
	 * @generated
	 */
	EReference getTServiceTemplate_BoundaryDefinitions();

	/**
	 * Returns the meta object for the containment reference '{@link tosca.TServiceTemplate#getTopologyTemplate <em>Topology Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Topology Template</em>'.
	 * @see tosca.TServiceTemplate#getTopologyTemplate()
	 * @see #getTServiceTemplate()
	 * @generated
	 */
	EReference getTServiceTemplate_TopologyTemplate();

	/**
	 * Returns the meta object for the containment reference '{@link tosca.TServiceTemplate#getPlans <em>Plans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plans</em>'.
	 * @see tosca.TServiceTemplate#getPlans()
	 * @see #getTServiceTemplate()
	 * @generated
	 */
	EReference getTServiceTemplate_Plans();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TServiceTemplate#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tosca.TServiceTemplate#getId()
	 * @see #getTServiceTemplate()
	 * @generated
	 */
	EAttribute getTServiceTemplate_Id();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TServiceTemplate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tosca.TServiceTemplate#getName()
	 * @see #getTServiceTemplate()
	 * @generated
	 */
	EAttribute getTServiceTemplate_Name();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TServiceTemplate#getSubstitutableNodeType <em>Substitutable Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Substitutable Node Type</em>'.
	 * @see tosca.TServiceTemplate#getSubstitutableNodeType()
	 * @see #getTServiceTemplate()
	 * @generated
	 */
	EAttribute getTServiceTemplate_SubstitutableNodeType();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TServiceTemplate#getTargetNamespace <em>Target Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Namespace</em>'.
	 * @see tosca.TServiceTemplate#getTargetNamespace()
	 * @see #getTServiceTemplate()
	 * @generated
	 */
	EAttribute getTServiceTemplate_TargetNamespace();

	/**
	 * Returns the meta object for class '{@link tosca.TTag <em>TTag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TTag</em>'.
	 * @see tosca.TTag
	 * @generated
	 */
	EClass getTTag();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TTag#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tosca.TTag#getName()
	 * @see #getTTag()
	 * @generated
	 */
	EAttribute getTTag_Name();

	/**
	 * Returns the meta object for the attribute '{@link tosca.TTag#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see tosca.TTag#getValue()
	 * @see #getTTag()
	 * @generated
	 */
	EAttribute getTTag_Value();

	/**
	 * Returns the meta object for class '{@link tosca.TTags <em>TTags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TTags</em>'.
	 * @see tosca.TTags
	 * @generated
	 */
	EClass getTTags();

	/**
	 * Returns the meta object for the containment reference list '{@link tosca.TTags#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tag</em>'.
	 * @see tosca.TTags#getTag()
	 * @see #getTTags()
	 * @generated
	 */
	EReference getTTags_Tag();

	/**
	 * Returns the meta object for class '{@link tosca.TTopologyElementInstanceStates <em>TTopology Element Instance States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TTopology Element Instance States</em>'.
	 * @see tosca.TTopologyElementInstanceStates
	 * @generated
	 */
	EClass getTTopologyElementInstanceStates();

	/**
	 * Returns the meta object for the containment reference list '{@link tosca.TTopologyElementInstanceStates#getInstanceState <em>Instance State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instance State</em>'.
	 * @see tosca.TTopologyElementInstanceStates#getInstanceState()
	 * @see #getTTopologyElementInstanceStates()
	 * @generated
	 */
	EReference getTTopologyElementInstanceStates_InstanceState();

	/**
	 * Returns the meta object for class '{@link tosca.TTopologyTemplate <em>TTopology Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TTopology Template</em>'.
	 * @see tosca.TTopologyTemplate
	 * @generated
	 */
	EClass getTTopologyTemplate();

	/**
	 * Returns the meta object for the attribute list '{@link tosca.TTopologyTemplate#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see tosca.TTopologyTemplate#getGroup()
	 * @see #getTTopologyTemplate()
	 * @generated
	 */
	EAttribute getTTopologyTemplate_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link tosca.TTopologyTemplate#getNodeTemplate <em>Node Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node Template</em>'.
	 * @see tosca.TTopologyTemplate#getNodeTemplate()
	 * @see #getTTopologyTemplate()
	 * @generated
	 */
	EReference getTTopologyTemplate_NodeTemplate();

	/**
	 * Returns the meta object for the containment reference list '{@link tosca.TTopologyTemplate#getRelationshipTemplate <em>Relationship Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationship Template</em>'.
	 * @see tosca.TTopologyTemplate#getRelationshipTemplate()
	 * @see #getTTopologyTemplate()
	 * @generated
	 */
	EReference getTTopologyTemplate_RelationshipTemplate();

	/**
	 * Returns the meta object for class '{@link tosca.TypesType <em>Types Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Types Type</em>'.
	 * @see tosca.TypesType
	 * @generated
	 */
	EClass getTypesType();

	/**
	 * Returns the meta object for the attribute list '{@link tosca.TypesType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see tosca.TypesType#getAny()
	 * @see #getTypesType()
	 * @generated
	 */
	EAttribute getTypesType_Any();

	/**
	 * Returns the meta object for class '{@link tosca.ValidSourceType <em>Valid Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valid Source Type</em>'.
	 * @see tosca.ValidSourceType
	 * @generated
	 */
	EClass getValidSourceType();

	/**
	 * Returns the meta object for the attribute '{@link tosca.ValidSourceType#getTypeRef <em>Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Ref</em>'.
	 * @see tosca.ValidSourceType#getTypeRef()
	 * @see #getValidSourceType()
	 * @generated
	 */
	EAttribute getValidSourceType_TypeRef();

	/**
	 * Returns the meta object for class '{@link tosca.ValidTargetType <em>Valid Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valid Target Type</em>'.
	 * @see tosca.ValidTargetType
	 * @generated
	 */
	EClass getValidTargetType();

	/**
	 * Returns the meta object for the attribute '{@link tosca.ValidTargetType#getTypeRef <em>Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Ref</em>'.
	 * @see tosca.ValidTargetType#getTypeRef()
	 * @see #getValidTargetType()
	 * @generated
	 */
	EAttribute getValidTargetType_TypeRef();

	/**
	 * Returns the meta object for enum '{@link tosca.MaxInstancesTypeMember1 <em>Max Instances Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Max Instances Type Member1</em>'.
	 * @see tosca.MaxInstancesTypeMember1
	 * @generated
	 */
	EEnum getMaxInstancesTypeMember1();

	/**
	 * Returns the meta object for enum '{@link tosca.TBoolean <em>TBoolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TBoolean</em>'.
	 * @see tosca.TBoolean
	 * @generated
	 */
	EEnum getTBoolean();

	/**
	 * Returns the meta object for enum '{@link tosca.UpperBoundTypeMember1 <em>Upper Bound Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Upper Bound Type Member1</em>'.
	 * @see tosca.UpperBoundTypeMember1
	 * @generated
	 */
	EEnum getUpperBoundTypeMember1();

	/**
	 * Returns the meta object for enum '{@link tosca.UpperBoundTypeMember11 <em>Upper Bound Type Member11</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Upper Bound Type Member11</em>'.
	 * @see tosca.UpperBoundTypeMember11
	 * @generated
	 */
	EEnum getUpperBoundTypeMember11();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Imported URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Imported URI</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='importedURI' baseType='http://www.eclipse.org/emf/2003/XMLType#anyURI'"
	 * @generated
	 */
	EDataType getImportedURI();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Max Instances Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Max Instances Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='maxInstances_._type' memberTypes='maxInstances_._type_._member_._0 maxInstances_._type_._member_._1'"
	 * @generated
	 */
	EDataType getMaxInstancesType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Max Instances Type Member0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Max Instances Type Member0</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='maxInstances_._type_._member_._0' baseType='http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger' pattern='([1-9]+[0-9]*)'"
	 * @generated
	 */
	EDataType getMaxInstancesTypeMember0();

	/**
	 * Returns the meta object for data type '{@link tosca.MaxInstancesTypeMember1 <em>Max Instances Type Member1 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Max Instances Type Member1 Object</em>'.
	 * @see tosca.MaxInstancesTypeMember1
	 * @model instanceClass="tosca.MaxInstancesTypeMember1"
	 *        extendedMetaData="name='maxInstances_._type_._member_._1:Object' baseType='maxInstances_._type_._member_._1'"
	 * @generated
	 */
	EDataType getMaxInstancesTypeMember1Object();

	/**
	 * Returns the meta object for data type '{@link tosca.TBoolean <em>TBoolean Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TBoolean Object</em>'.
	 * @see tosca.TBoolean
	 * @model instanceClass="tosca.TBoolean"
	 *        extendedMetaData="name='tBoolean:Object' baseType='tBoolean'"
	 * @generated
	 */
	EDataType getTBooleanObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Upper Bound Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Upper Bound Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='upperBound_._type' memberTypes='upperBound_._type_._member_._0 upperBound_._type_._member_._1'"
	 * @generated
	 */
	EDataType getUpperBoundType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Upper Bound Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Upper Bound Type1</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='upperBound_._1_._type' memberTypes='upperBound_._1_._type_._member_._0 upperBound_._1_._type_._member_._1'"
	 * @generated
	 */
	EDataType getUpperBoundType1();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Upper Bound Type Member0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Upper Bound Type Member0</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='upperBound_._type_._member_._0' baseType='http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger' pattern='([1-9]+[0-9]*)'"
	 * @generated
	 */
	EDataType getUpperBoundTypeMember0();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Upper Bound Type Member01</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Upper Bound Type Member01</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='upperBound_._1_._type_._member_._0' baseType='http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger' pattern='([1-9]+[0-9]*)'"
	 * @generated
	 */
	EDataType getUpperBoundTypeMember01();

	/**
	 * Returns the meta object for data type '{@link tosca.UpperBoundTypeMember1 <em>Upper Bound Type Member1 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Upper Bound Type Member1 Object</em>'.
	 * @see tosca.UpperBoundTypeMember1
	 * @model instanceClass="tosca.UpperBoundTypeMember1"
	 *        extendedMetaData="name='upperBound_._type_._member_._1:Object' baseType='upperBound_._type_._member_._1'"
	 * @generated
	 */
	EDataType getUpperBoundTypeMember1Object();

	/**
	 * Returns the meta object for data type '{@link tosca.UpperBoundTypeMember11 <em>Upper Bound Type Member1 Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Upper Bound Type Member1 Object1</em>'.
	 * @see tosca.UpperBoundTypeMember11
	 * @model instanceClass="tosca.UpperBoundTypeMember11"
	 *        extendedMetaData="name='upperBound_._1_._type_._member_._1:Object' baseType='upperBound_._1_._type_._member_._1'"
	 * @generated
	 */
	EDataType getUpperBoundTypeMember1Object1();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ToscaFactory getToscaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link tosca.impl.ArtifactReferencesTypeImpl <em>Artifact References Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.ArtifactReferencesTypeImpl
		 * @see tosca.impl.ToscaPackageImpl#getArtifactReferencesType()
		 * @generated
		 */
		EClass ARTIFACT_REFERENCES_TYPE = eINSTANCE.getArtifactReferencesType();

		/**
		 * The meta object literal for the '<em><b>Artifact Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT_REFERENCES_TYPE__ARTIFACT_REFERENCE = eINSTANCE.getArtifactReferencesType_ArtifactReference();

		/**
		 * The meta object literal for the '{@link tosca.impl.CapabilitiesType_TCapabilityImpl <em>Capabilities Type TCapability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.CapabilitiesType_TCapabilityImpl
		 * @see tosca.impl.ToscaPackageImpl#getCapabilitiesType_TCapability()
		 * @generated
		 */
		EClass CAPABILITIES_TYPE_TCAPABILITY = eINSTANCE.getCapabilitiesType_TCapability();

		/**
		 * The meta object literal for the '<em><b>Capability</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITIES_TYPE_TCAPABILITY__CAPABILITY = eINSTANCE.getCapabilitiesType_TCapability_Capability();

		/**
		 * The meta object literal for the '{@link tosca.impl.CapabilitiesType_CapabilityRefImpl <em>Capabilities Type Capability Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.CapabilitiesType_CapabilityRefImpl
		 * @see tosca.impl.ToscaPackageImpl#getCapabilitiesType_CapabilityRef()
		 * @generated
		 */
		EClass CAPABILITIES_TYPE_CAPABILITY_REF = eINSTANCE.getCapabilitiesType_CapabilityRef();

		/**
		 * The meta object literal for the '<em><b>Capability</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITIES_TYPE_CAPABILITY_REF__CAPABILITY = eINSTANCE.getCapabilitiesType_CapabilityRef_Capability();

		/**
		 * The meta object literal for the '{@link tosca.impl.CapabilityDefinitionsTypeImpl <em>Capability Definitions Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.CapabilityDefinitionsTypeImpl
		 * @see tosca.impl.ToscaPackageImpl#getCapabilityDefinitionsType()
		 * @generated
		 */
		EClass CAPABILITY_DEFINITIONS_TYPE = eINSTANCE.getCapabilityDefinitionsType();

		/**
		 * The meta object literal for the '<em><b>Capability Definition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY_DEFINITIONS_TYPE__CAPABILITY_DEFINITION = eINSTANCE.getCapabilityDefinitionsType_CapabilityDefinition();

		/**
		 * The meta object literal for the '{@link tosca.impl.ConstraintsTypeImpl <em>Constraints Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.ConstraintsTypeImpl
		 * @see tosca.impl.ToscaPackageImpl#getConstraintsType()
		 * @generated
		 */
		EClass CONSTRAINTS_TYPE = eINSTANCE.getConstraintsType();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINTS_TYPE__CONSTRAINT = eINSTANCE.getConstraintsType_Constraint();

		/**
		 * The meta object literal for the '{@link tosca.impl.DefinitionsTypeImpl <em>Definitions Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.DefinitionsTypeImpl
		 * @see tosca.impl.ToscaPackageImpl#getDefinitionsType()
		 * @generated
		 */
		EClass DEFINITIONS_TYPE = eINSTANCE.getDefinitionsType();

		/**
		 * The meta object literal for the '{@link tosca.impl.DerivedFromTypeImpl <em>Derived From Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.DerivedFromTypeImpl
		 * @see tosca.impl.ToscaPackageImpl#getDerivedFromType()
		 * @generated
		 */
		EClass DERIVED_FROM_TYPE = eINSTANCE.getDerivedFromType();

		/**
		 * The meta object literal for the '<em><b>Derived From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DERIVED_FROM_TYPE__DERIVED_FROM = eINSTANCE.getDerivedFromType_DerivedFrom();

		/**
		 * The meta object literal for the '{@link tosca.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.DocumentRootImpl
		 * @see tosca.impl.ToscaPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Definitions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DEFINITIONS = eINSTANCE.getDocumentRoot_Definitions();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DOCUMENTATION = eINSTANCE.getDocumentRoot_Documentation();

		/**
		 * The meta object literal for the '{@link tosca.impl.ExcludeTypeImpl <em>Exclude Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.ExcludeTypeImpl
		 * @see tosca.impl.ToscaPackageImpl#getExcludeType()
		 * @generated
		 */
		EClass EXCLUDE_TYPE = eINSTANCE.getExcludeType();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCLUDE_TYPE__PATTERN = eINSTANCE.getExcludeType_Pattern();

		/**
		 * The meta object literal for the '{@link tosca.impl.ExtensionsTypeImpl <em>Extensions Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.ExtensionsTypeImpl
		 * @see tosca.impl.ToscaPackageImpl#getExtensionsType()
		 * @generated
		 */
		EClass EXTENSIONS_TYPE = eINSTANCE.getExtensionsType();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSIONS_TYPE__EXTENSION = eINSTANCE.getExtensionsType_Extension();

		/**
		 * The meta object literal for the '{@link tosca.impl.ImplementationArtifactTypeImpl <em>Implementation Artifact Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.ImplementationArtifactTypeImpl
		 * @see tosca.impl.ToscaPackageImpl#getImplementationArtifactType()
		 * @generated
		 */
		EClass IMPLEMENTATION_ARTIFACT_TYPE = eINSTANCE.getImplementationArtifactType();

		/**
		 * The meta object literal for the '{@link tosca.impl.IncludeTypeImpl <em>Include Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.IncludeTypeImpl
		 * @see tosca.impl.ToscaPackageImpl#getIncludeType()
		 * @generated
		 */
		EClass INCLUDE_TYPE = eINSTANCE.getIncludeType();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLUDE_TYPE__PATTERN = eINSTANCE.getIncludeType_Pattern();

		/**
		 * The meta object literal for the '{@link tosca.impl.InputParametersTypeImpl <em>Input Parameters Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.InputParametersTypeImpl
		 * @see tosca.impl.ToscaPackageImpl#getInputParametersType()
		 * @generated
		 */
		EClass INPUT_PARAMETERS_TYPE = eINSTANCE.getInputParametersType();

		/**
		 * The meta object literal for the '<em><b>Input Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_PARAMETERS_TYPE__INPUT_PARAMETER = eINSTANCE.getInputParametersType_InputParameter();

		/**
		 * The meta object literal for the '{@link tosca.impl.InstanceStateTypeImpl <em>Instance State Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.InstanceStateTypeImpl
		 * @see tosca.impl.ToscaPackageImpl#getInstanceStateType()
		 * @generated
		 */
		EClass INSTANCE_STATE_TYPE = eINSTANCE.getInstanceStateType();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_STATE_TYPE__STATE = eINSTANCE.getInstanceStateType_State();

		/**
		 * The meta object literal for the '{@link tosca.impl.InterfacesType_TInterfaceImpl <em>Interfaces Type TInterface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.InterfacesType_TInterfaceImpl
		 * @see tosca.impl.ToscaPackageImpl#getInterfacesType_TInterface()
		 * @generated
		 */
		EClass INTERFACES_TYPE_TINTERFACE = eINSTANCE.getInterfacesType_TInterface();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACES_TYPE_TINTERFACE__INTERFACE = eINSTANCE.getInterfacesType_TInterface_Interface();

		/**
		 * The meta object literal for the '{@link tosca.impl.InterfacesType_TExportedInterfaceImpl <em>Interfaces Type TExported Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.InterfacesType_TExportedInterfaceImpl
		 * @see tosca.impl.ToscaPackageImpl#getInterfacesType_TExportedInterface()
		 * @generated
		 */
		EClass INTERFACES_TYPE_TEXPORTED_INTERFACE = eINSTANCE.getInterfacesType_TExportedInterface();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACES_TYPE_TEXPORTED_INTERFACE__INTERFACE = eINSTANCE.getInterfacesType_TExportedInterface_Interface();

		/**
		 * The meta object literal for the '{@link tosca.impl.NodeOperationTypeImpl <em>Node Operation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.NodeOperationTypeImpl
		 * @see tosca.impl.ToscaPackageImpl#getNodeOperationType()
		 * @generated
		 */
		EClass NODE_OPERATION_TYPE = eINSTANCE.getNodeOperationType();

		/**
		 * The meta object literal for the '<em><b>Interface Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_OPERATION_TYPE__INTERFACE_NAME = eINSTANCE.getNodeOperationType_InterfaceName();

		/**
		 * The meta object literal for the '<em><b>Node Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_OPERATION_TYPE__NODE_REF = eINSTANCE.getNodeOperationType_NodeRef();

		/**
		 * The meta object literal for the '<em><b>Operation Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_OPERATION_TYPE__OPERATION_NAME = eINSTANCE.getNodeOperationType_OperationName();

		/**
		 * The meta object literal for the '{@link tosca.impl.NodeTypeReferenceTypeImpl <em>Node Type Reference Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.NodeTypeReferenceTypeImpl
		 * @see tosca.impl.ToscaPackageImpl#getNodeTypeReferenceType()
		 * @generated
		 */
		EClass NODE_TYPE_REFERENCE_TYPE = eINSTANCE.getNodeTypeReferenceType();

		/**
		 * The meta object literal for the '<em><b>Type Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_TYPE_REFERENCE_TYPE__TYPE_REF = eINSTANCE.getNodeTypeReferenceType_TypeRef();

		/**
		 * The meta object literal for the '{@link tosca.impl.OutputParametersTypeImpl <em>Output Parameters Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.OutputParametersTypeImpl
		 * @see tosca.impl.ToscaPackageImpl#getOutputParametersType()
		 * @generated
		 */
		EClass OUTPUT_PARAMETERS_TYPE = eINSTANCE.getOutputParametersType();

		/**
		 * The meta object literal for the '<em><b>Output Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_PARAMETERS_TYPE__OUTPUT_PARAMETER = eINSTANCE.getOutputParametersType_OutputParameter();

		/**
		 * The meta object literal for the '{@link tosca.impl.PlanModelReferenceTypeImpl <em>Plan Model Reference Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.PlanModelReferenceTypeImpl
		 * @see tosca.impl.ToscaPackageImpl#getPlanModelReferenceType()
		 * @generated
		 */
		EClass PLAN_MODEL_REFERENCE_TYPE = eINSTANCE.getPlanModelReferenceType();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAN_MODEL_REFERENCE_TYPE__REFERENCE = eINSTANCE.getPlanModelReferenceType_Reference();

		/**
		 * The meta object literal for the '{@link tosca.impl.PlanModelTypeImpl <em>Plan Model Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.PlanModelTypeImpl
		 * @see tosca.impl.ToscaPackageImpl#getPlanModelType()
		 * @generated
		 */
		EClass PLAN_MODEL_TYPE = eINSTANCE.getPlanModelType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAN_MODEL_TYPE__ANY = eINSTANCE.getPlanModelType_Any();

		/**
		 * The meta object literal for the '{@link tosca.impl.PlanTypeImpl <em>Plan Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.PlanTypeImpl
		 * @see tosca.impl.ToscaPackageImpl#getPlanType()
		 * @generated
		 */
		EClass PLAN_TYPE = eINSTANCE.getPlanType();

		/**
		 * The meta object literal for the '<em><b>Plan Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAN_TYPE__PLAN_REF = eINSTANCE.getPlanType_PlanRef();

		/**
		 * The meta object literal for the '{@link tosca.impl.PoliciesTypeImpl <em>Policies Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.PoliciesTypeImpl
		 * @see tosca.impl.ToscaPackageImpl#getPoliciesType()
		 * @generated
		 */
		EClass POLICIES_TYPE = eINSTANCE.getPoliciesType();

		/**
		 * The meta object literal for the '<em><b>Policy</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICIES_TYPE__POLICY = eINSTANCE.getPoliciesType_Policy();

		/**
		 * The meta object literal for the '{@link tosca.impl.PropertiesDefinitionTypeImpl <em>Properties Definition Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.PropertiesDefinitionTypeImpl
		 * @see tosca.impl.ToscaPackageImpl#getPropertiesDefinitionType()
		 * @generated
		 */
		EClass PROPERTIES_DEFINITION_TYPE = eINSTANCE.getPropertiesDefinitionType();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES_DEFINITION_TYPE__ELEMENT = eINSTANCE.getPropertiesDefinitionType_Element();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES_DEFINITION_TYPE__TYPE = eINSTANCE.getPropertiesDefinitionType_Type();

		/**
		 * The meta object literal for the '{@link tosca.impl.PropertiesTypeImpl <em>Properties Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.PropertiesTypeImpl
		 * @see tosca.impl.ToscaPackageImpl#getPropertiesType()
		 * @generated
		 */
		EClass PROPERTIES_TYPE = eINSTANCE.getPropertiesType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES_TYPE__ANY = eINSTANCE.getPropertiesType_Any();

		/**
		 * The meta object literal for the '{@link tosca.impl.PropertiesTypeWithPropertyMappingsImpl <em>Properties Type With Property Mappings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.PropertiesTypeWithPropertyMappingsImpl
		 * @see tosca.impl.ToscaPackageImpl#getPropertiesTypeWithPropertyMappings()
		 * @generated
		 */
		EClass PROPERTIES_TYPE_WITH_PROPERTY_MAPPINGS = eINSTANCE.getPropertiesTypeWithPropertyMappings();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES_TYPE_WITH_PROPERTY_MAPPINGS__ANY = eINSTANCE.getPropertiesTypeWithPropertyMappings_Any();

		/**
		 * The meta object literal for the '<em><b>Property Mappings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTIES_TYPE_WITH_PROPERTY_MAPPINGS__PROPERTY_MAPPINGS = eINSTANCE.getPropertiesTypeWithPropertyMappings_PropertyMappings();

		/**
		 * The meta object literal for the '{@link tosca.impl.PropertyConstraintsTypeImpl <em>Property Constraints Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.PropertyConstraintsTypeImpl
		 * @see tosca.impl.ToscaPackageImpl#getPropertyConstraintsType()
		 * @generated
		 */
		EClass PROPERTY_CONSTRAINTS_TYPE = eINSTANCE.getPropertyConstraintsType();

		/**
		 * The meta object literal for the '<em><b>Property Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_CONSTRAINTS_TYPE__PROPERTY_CONSTRAINT = eINSTANCE.getPropertyConstraintsType_PropertyConstraint();

		/**
		 * The meta object literal for the '{@link tosca.impl.PropertyMappingsTypeImpl <em>Property Mappings Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.PropertyMappingsTypeImpl
		 * @see tosca.impl.ToscaPackageImpl#getPropertyMappingsType()
		 * @generated
		 */
		EClass PROPERTY_MAPPINGS_TYPE = eINSTANCE.getPropertyMappingsType();

		/**
		 * The meta object literal for the '<em><b>Property Mapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_MAPPINGS_TYPE__PROPERTY_MAPPING = eINSTANCE.getPropertyMappingsType_PropertyMapping();

		/**
		 * The meta object literal for the '{@link tosca.impl.RelationshipConstraintsTypeImpl <em>Relationship Constraints Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.RelationshipConstraintsTypeImpl
		 * @see tosca.impl.ToscaPackageImpl#getRelationshipConstraintsType()
		 * @generated
		 */
		EClass RELATIONSHIP_CONSTRAINTS_TYPE = eINSTANCE.getRelationshipConstraintsType();

		/**
		 * The meta object literal for the '<em><b>Relationship Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_CONSTRAINTS_TYPE__RELATIONSHIP_CONSTRAINT = eINSTANCE.getRelationshipConstraintsType_RelationshipConstraint();

		/**
		 * The meta object literal for the '{@link tosca.impl.RelationshipConstraintTypeImpl <em>Relationship Constraint Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.RelationshipConstraintTypeImpl
		 * @see tosca.impl.ToscaPackageImpl#getRelationshipConstraintType()
		 * @generated
		 */
		EClass RELATIONSHIP_CONSTRAINT_TYPE = eINSTANCE.getRelationshipConstraintType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_CONSTRAINT_TYPE__ANY = eINSTANCE.getRelationshipConstraintType_Any();

		/**
		 * The meta object literal for the '<em><b>Constraint Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_CONSTRAINT_TYPE__CONSTRAINT_TYPE = eINSTANCE.getRelationshipConstraintType_ConstraintType();

		/**
		 * The meta object literal for the '{@link tosca.impl.RelationshipOperationTypeImpl <em>Relationship Operation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.RelationshipOperationTypeImpl
		 * @see tosca.impl.ToscaPackageImpl#getRelationshipOperationType()
		 * @generated
		 */
		EClass RELATIONSHIP_OPERATION_TYPE = eINSTANCE.getRelationshipOperationType();

		/**
		 * The meta object literal for the '<em><b>Interface Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_OPERATION_TYPE__INTERFACE_NAME = eINSTANCE.getRelationshipOperationType_InterfaceName();

		/**
		 * The meta object literal for the '<em><b>Operation Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_OPERATION_TYPE__OPERATION_NAME = eINSTANCE.getRelationshipOperationType_OperationName();

		/**
		 * The meta object literal for the '<em><b>Relationship Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_OPERATION_TYPE__RELATIONSHIP_REF = eINSTANCE.getRelationshipOperationType_RelationshipRef();

		/**
		 * The meta object literal for the '{@link tosca.impl.RequirementDefinitionsTypeImpl <em>Requirement Definitions Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.RequirementDefinitionsTypeImpl
		 * @see tosca.impl.ToscaPackageImpl#getRequirementDefinitionsType()
		 * @generated
		 */
		EClass REQUIREMENT_DEFINITIONS_TYPE = eINSTANCE.getRequirementDefinitionsType();

		/**
		 * The meta object literal for the '<em><b>Requirement Definition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_DEFINITIONS_TYPE__REQUIREMENT_DEFINITION = eINSTANCE.getRequirementDefinitionsType_RequirementDefinition();

		/**
		 * The meta object literal for the '{@link tosca.impl.RequirementsType_TRequirementImpl <em>Requirements Type TRequirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.RequirementsType_TRequirementImpl
		 * @see tosca.impl.ToscaPackageImpl#getRequirementsType_TRequirement()
		 * @generated
		 */
		EClass REQUIREMENTS_TYPE_TREQUIREMENT = eINSTANCE.getRequirementsType_TRequirement();

		/**
		 * The meta object literal for the '<em><b>Requirement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENTS_TYPE_TREQUIREMENT__REQUIREMENT = eINSTANCE.getRequirementsType_TRequirement_Requirement();

		/**
		 * The meta object literal for the '{@link tosca.impl.RequirementsType_TRequirementRefImpl <em>Requirements Type TRequirement Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.RequirementsType_TRequirementRefImpl
		 * @see tosca.impl.ToscaPackageImpl#getRequirementsType_TRequirementRef()
		 * @generated
		 */
		EClass REQUIREMENTS_TYPE_TREQUIREMENT_REF = eINSTANCE.getRequirementsType_TRequirementRef();

		/**
		 * The meta object literal for the '<em><b>Requirement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENTS_TYPE_TREQUIREMENT_REF__REQUIREMENT = eINSTANCE.getRequirementsType_TRequirementRef_Requirement();

		/**
		 * The meta object literal for the '{@link tosca.impl.SourceElementTypeImpl <em>Source Element Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.SourceElementTypeImpl
		 * @see tosca.impl.ToscaPackageImpl#getSourceElementType()
		 * @generated
		 */
		EClass SOURCE_ELEMENT_TYPE = eINSTANCE.getSourceElementType();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_ELEMENT_TYPE__REF = eINSTANCE.getSourceElementType_Ref();

		/**
		 * The meta object literal for the '{@link tosca.impl.SourceInterfacesTypeImpl <em>Source Interfaces Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.SourceInterfacesTypeImpl
		 * @see tosca.impl.ToscaPackageImpl#getSourceInterfacesType()
		 * @generated
		 */
		EClass SOURCE_INTERFACES_TYPE = eINSTANCE.getSourceInterfacesType();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_INTERFACES_TYPE__INTERFACE = eINSTANCE.getSourceInterfacesType_Interface();

		/**
		 * The meta object literal for the '{@link tosca.impl.TAppliesToImpl <em>TApplies To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.TAppliesToImpl
		 * @see tosca.impl.ToscaPackageImpl#getTAppliesTo()
		 * @generated
		 */
		EClass TAPPLIES_TO = eINSTANCE.getTAppliesTo();

		/**
		 * The meta object literal for the '<em><b>Node Type Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAPPLIES_TO__NODE_TYPE_REFERENCE = eINSTANCE.getTAppliesTo_NodeTypeReference();

		/**
		 * The meta object literal for the '{@link tosca.impl.TargetElementTypeImpl <em>Target Element Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.TargetElementTypeImpl
		 * @see tosca.impl.ToscaPackageImpl#getTargetElementType()
		 * @generated
		 */
		EClass TARGET_ELEMENT_TYPE = eINSTANCE.getTargetElementType();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_ELEMENT_TYPE__REF = eINSTANCE.getTargetElementType_Ref();

		/**
		 * The meta object literal for the '{@link tosca.impl.TargetInterfacesTypeImpl <em>Target Interfaces Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.TargetInterfacesTypeImpl
		 * @see tosca.impl.ToscaPackageImpl#getTargetInterfacesType()
		 * @generated
		 */
		EClass TARGET_INTERFACES_TYPE = eINSTANCE.getTargetInterfacesType();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_INTERFACES_TYPE__INTERFACE = eINSTANCE.getTargetInterfacesType_Interface();

		/**
		 * The meta object literal for the '{@link tosca.impl.TArtifactReferenceImpl <em>TArtifact Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.TArtifactReferenceImpl
		 * @see tosca.impl.ToscaPackageImpl#getTArtifactReference()
		 * @generated
		 */
		EClass TARTIFACT_REFERENCE = eINSTANCE.getTArtifactReference();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARTIFACT_REFERENCE__GROUP = eINSTANCE.getTArtifactReference_Group();

		/**
		 * The meta object literal for the '<em><b>Include</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARTIFACT_REFERENCE__INCLUDE = eINSTANCE.getTArtifactReference_Include();

		/**
		 * The meta object literal for the '<em><b>Exclude</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARTIFACT_REFERENCE__EXCLUDE = eINSTANCE.getTArtifactReference_Exclude();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARTIFACT_REFERENCE__REFERENCE = eINSTANCE.getTArtifactReference_Reference();

		/**
		 * The meta object literal for the '{@link tosca.impl.TArtifactTemplateImpl <em>TArtifact Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.TArtifactTemplateImpl
		 * @see tosca.impl.ToscaPackageImpl#getTArtifactTemplate()
		 * @generated
		 */
		EClass TARTIFACT_TEMPLATE = eINSTANCE.getTArtifactTemplate();

		/**
		 * The meta object literal for the '<em><b>Artifact References</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARTIFACT_TEMPLATE__ARTIFACT_REFERENCES = eINSTANCE.getTArtifactTemplate_ArtifactReferences();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARTIFACT_TEMPLATE__NAME = eINSTANCE.getTArtifactTemplate_Name();

		/**
		 * The meta object literal for the '{@link tosca.impl.TArtifactTypeImpl <em>TArtifact Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.TArtifactTypeImpl
		 * @see tosca.impl.ToscaPackageImpl#getTArtifactType()
		 * @generated
		 */
		EClass TARTIFACT_TYPE = eINSTANCE.getTArtifactType();

		/**
		 * The meta object literal for the '{@link tosca.impl.TBoundaryDefinitionsImpl <em>TBoundary Definitions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.TBoundaryDefinitionsImpl
		 * @see tosca.impl.ToscaPackageImpl#getTBoundaryDefinitions()
		 * @generated
		 */
		EClass TBOUNDARY_DEFINITIONS = eINSTANCE.getTBoundaryDefinitions();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TBOUNDARY_DEFINITIONS__PROPERTIES = eINSTANCE.getTBoundaryDefinitions_Properties();

		/**
		 * The meta object literal for the '<em><b>Property Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TBOUNDARY_DEFINITIONS__PROPERTY_CONSTRAINTS = eINSTANCE.getTBoundaryDefinitions_PropertyConstraints();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TBOUNDARY_DEFINITIONS__REQUIREMENTS = eINSTANCE.getTBoundaryDefinitions_Requirements();

		/**
		 * The meta object literal for the '<em><b>Capabilities</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TBOUNDARY_DEFINITIONS__CAPABILITIES = eINSTANCE.getTBoundaryDefinitions_Capabilities();

		/**
		 * The meta object literal for the '<em><b>Policies</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TBOUNDARY_DEFINITIONS__POLICIES = eINSTANCE.getTBoundaryDefinitions_Policies();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TBOUNDARY_DEFINITIONS__INTERFACES = eINSTANCE.getTBoundaryDefinitions_Interfaces();

		/**
		 * The meta object literal for the '{@link tosca.impl.TCapabilityImpl <em>TCapability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.TCapabilityImpl
		 * @see tosca.impl.ToscaPackageImpl#getTCapability()
		 * @generated
		 */
		EClass TCAPABILITY = eINSTANCE.getTCapability();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCAPABILITY__NAME = eINSTANCE.getTCapability_Name();

		/**
		 * The meta object literal for the '{@link tosca.impl.TCapabilityDefinitionImpl <em>TCapability Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.TCapabilityDefinitionImpl
		 * @see tosca.impl.ToscaPackageImpl#getTCapabilityDefinition()
		 * @generated
		 */
		EClass TCAPABILITY_DEFINITION = eINSTANCE.getTCapabilityDefinition();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCAPABILITY_DEFINITION__CONSTRAINTS = eINSTANCE.getTCapabilityDefinition_Constraints();

		/**
		 * The meta object literal for the '<em><b>Capability Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCAPABILITY_DEFINITION__CAPABILITY_TYPE = eINSTANCE.getTCapabilityDefinition_CapabilityType();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCAPABILITY_DEFINITION__LOWER_BOUND = eINSTANCE.getTCapabilityDefinition_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCAPABILITY_DEFINITION__NAME = eINSTANCE.getTCapabilityDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCAPABILITY_DEFINITION__UPPER_BOUND = eINSTANCE.getTCapabilityDefinition_UpperBound();

		/**
		 * The meta object literal for the '{@link tosca.impl.TCapabilityRefImpl <em>TCapability Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.TCapabilityRefImpl
		 * @see tosca.impl.ToscaPackageImpl#getTCapabilityRef()
		 * @generated
		 */
		EClass TCAPABILITY_REF = eINSTANCE.getTCapabilityRef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCAPABILITY_REF__NAME = eINSTANCE.getTCapabilityRef_Name();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCAPABILITY_REF__REF = eINSTANCE.getTCapabilityRef_Ref();

		/**
		 * The meta object literal for the '{@link tosca.impl.TCapabilityTypeImpl <em>TCapability Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.TCapabilityTypeImpl
		 * @see tosca.impl.ToscaPackageImpl#getTCapabilityType()
		 * @generated
		 */
		EClass TCAPABILITY_TYPE = eINSTANCE.getTCapabilityType();

		/**
		 * The meta object literal for the '{@link tosca.impl.TConditionImpl <em>TCondition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.TConditionImpl
		 * @see tosca.impl.ToscaPackageImpl#getTCondition()
		 * @generated
		 */
		EClass TCONDITION = eINSTANCE.getTCondition();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCONDITION__ANY = eINSTANCE.getTCondition_Any();

		/**
		 * The meta object literal for the '<em><b>Expression Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCONDITION__EXPRESSION_LANGUAGE = eINSTANCE.getTCondition_ExpressionLanguage();

		/**
		 * The meta object literal for the '{@link tosca.impl.TConstraintImpl <em>TConstraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.TConstraintImpl
		 * @see tosca.impl.ToscaPackageImpl#getTConstraint()
		 * @generated
		 */
		EClass TCONSTRAINT = eINSTANCE.getTConstraint();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCONSTRAINT__ANY = eINSTANCE.getTConstraint_Any();

		/**
		 * The meta object literal for the '<em><b>Constraint Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCONSTRAINT__CONSTRAINT_TYPE = eINSTANCE.getTConstraint_ConstraintType();

		/**
		 * The meta object literal for the '{@link tosca.impl.TDefinitionsImpl <em>TDefinitions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.TDefinitionsImpl
		 * @see tosca.impl.ToscaPackageImpl#getTDefinitions()
		 * @generated
		 */
		EClass TDEFINITIONS = eINSTANCE.getTDefinitions();

		/**
		 * The meta object literal for the '<em><b>Extensions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDEFINITIONS__EXTENSIONS = eINSTANCE.getTDefinitions_Extensions();

		/**
		 * The meta object literal for the '<em><b>Import</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDEFINITIONS__IMPORT = eINSTANCE.getTDefinitions_Import();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDEFINITIONS__TYPES = eINSTANCE.getTDefinitions_Types();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDEFINITIONS__GROUP = eINSTANCE.getTDefinitions_Group();

		/**
		 * The meta object literal for the '<em><b>Service Template</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDEFINITIONS__SERVICE_TEMPLATE = eINSTANCE.getTDefinitions_ServiceTemplate();

		/**
		 * The meta object literal for the '<em><b>Node Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDEFINITIONS__NODE_TYPE = eINSTANCE.getTDefinitions_NodeType();

		/**
		 * The meta object literal for the '<em><b>Node Type Implementation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDEFINITIONS__NODE_TYPE_IMPLEMENTATION = eINSTANCE.getTDefinitions_NodeTypeImplementation();

		/**
		 * The meta object literal for the '<em><b>Relationship Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDEFINITIONS__RELATIONSHIP_TYPE = eINSTANCE.getTDefinitions_RelationshipType();

		/**
		 * The meta object literal for the '<em><b>Relationship Type Implementation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDEFINITIONS__RELATIONSHIP_TYPE_IMPLEMENTATION = eINSTANCE.getTDefinitions_RelationshipTypeImplementation();

		/**
		 * The meta object literal for the '<em><b>Requirement Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDEFINITIONS__REQUIREMENT_TYPE = eINSTANCE.getTDefinitions_RequirementType();

		/**
		 * The meta object literal for the '<em><b>Capability Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDEFINITIONS__CAPABILITY_TYPE = eINSTANCE.getTDefinitions_CapabilityType();

		/**
		 * The meta object literal for the '<em><b>Artifact Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDEFINITIONS__ARTIFACT_TYPE = eINSTANCE.getTDefinitions_ArtifactType();

		/**
		 * The meta object literal for the '<em><b>Artifact Template</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDEFINITIONS__ARTIFACT_TEMPLATE = eINSTANCE.getTDefinitions_ArtifactTemplate();

		/**
		 * The meta object literal for the '<em><b>Policy Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDEFINITIONS__POLICY_TYPE = eINSTANCE.getTDefinitions_PolicyType();

		/**
		 * The meta object literal for the '<em><b>Policy Template</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDEFINITIONS__POLICY_TEMPLATE = eINSTANCE.getTDefinitions_PolicyTemplate();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDEFINITIONS__ID = eINSTANCE.getTDefinitions_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDEFINITIONS__NAME = eINSTANCE.getTDefinitions_Name();

		/**
		 * The meta object literal for the '<em><b>Target Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDEFINITIONS__TARGET_NAMESPACE = eINSTANCE.getTDefinitions_TargetNamespace();

		/**
		 * The meta object literal for the '{@link tosca.impl.TDeploymentArtifactImpl <em>TDeployment Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.TDeploymentArtifactImpl
		 * @see tosca.impl.ToscaPackageImpl#getTDeploymentArtifact()
		 * @generated
		 */
		EClass TDEPLOYMENT_ARTIFACT = eINSTANCE.getTDeploymentArtifact();

		/**
		 * The meta object literal for the '<em><b>Artifact Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDEPLOYMENT_ARTIFACT__ARTIFACT_REF = eINSTANCE.getTDeploymentArtifact_ArtifactRef();

		/**
		 * The meta object literal for the '<em><b>Artifact Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDEPLOYMENT_ARTIFACT__ARTIFACT_TYPE = eINSTANCE.getTDeploymentArtifact_ArtifactType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDEPLOYMENT_ARTIFACT__NAME = eINSTANCE.getTDeploymentArtifact_Name();

		/**
		 * The meta object literal for the '{@link tosca.impl.TDeploymentArtifactsImpl <em>TDeployment Artifacts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.TDeploymentArtifactsImpl
		 * @see tosca.impl.ToscaPackageImpl#getTDeploymentArtifacts()
		 * @generated
		 */
		EClass TDEPLOYMENT_ARTIFACTS = eINSTANCE.getTDeploymentArtifacts();

		/**
		 * The meta object literal for the '<em><b>Deployment Artifact</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDEPLOYMENT_ARTIFACTS__DEPLOYMENT_ARTIFACT = eINSTANCE.getTDeploymentArtifacts_DeploymentArtifact();

		/**
		 * The meta object literal for the '{@link tosca.impl.TDocumentationImpl <em>TDocumentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.TDocumentationImpl
		 * @see tosca.impl.ToscaPackageImpl#getTDocumentation()
		 * @generated
		 */
		EClass TDOCUMENTATION = eINSTANCE.getTDocumentation();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDOCUMENTATION__MIXED = eINSTANCE.getTDocumentation_Mixed();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDOCUMENTATION__ANY = eINSTANCE.getTDocumentation_Any();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDOCUMENTATION__LANG = eINSTANCE.getTDocumentation_Lang();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDOCUMENTATION__SOURCE = eINSTANCE.getTDocumentation_Source();

		/**
		 * The meta object literal for the '{@link tosca.impl.TEntityTemplateImpl <em>TEntity Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.TEntityTemplateImpl
		 * @see tosca.impl.ToscaPackageImpl#getTEntityTemplate()
		 * @generated
		 */
		EClass TENTITY_TEMPLATE = eINSTANCE.getTEntityTemplate();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TENTITY_TEMPLATE__PROPERTIES = eINSTANCE.getTEntityTemplate_Properties();

		/**
		 * The meta object literal for the '<em><b>Property Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TENTITY_TEMPLATE__PROPERTY_CONSTRAINTS = eINSTANCE.getTEntityTemplate_PropertyConstraints();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TENTITY_TEMPLATE__ID = eINSTANCE.getTEntityTemplate_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TENTITY_TEMPLATE__TYPE = eINSTANCE.getTEntityTemplate_Type();

		/**
		 * The meta object literal for the '{@link tosca.impl.TEntityTypeImpl <em>TEntity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.TEntityTypeImpl
		 * @see tosca.impl.ToscaPackageImpl#getTEntityType()
		 * @generated
		 */
		EClass TENTITY_TYPE = eINSTANCE.getTEntityType();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TENTITY_TYPE__TAGS = eINSTANCE.getTEntityType_Tags();

		/**
		 * The meta object literal for the '<em><b>Derived From</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TENTITY_TYPE__DERIVED_FROM = eINSTANCE.getTEntityType_DerivedFrom();

		/**
		 * The meta object literal for the '<em><b>Properties Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TENTITY_TYPE__PROPERTIES_DEFINITION = eINSTANCE.getTEntityType_PropertiesDefinition();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TENTITY_TYPE__ABSTRACT = eINSTANCE.getTEntityType_Abstract();

		/**
		 * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TENTITY_TYPE__FINAL = eINSTANCE.getTEntityType_Final();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TENTITY_TYPE__NAME = eINSTANCE.getTEntityType_Name();

		/**
		 * The meta object literal for the '<em><b>Target Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TENTITY_TYPE__TARGET_NAMESPACE = eINSTANCE.getTEntityType_TargetNamespace();

		/**
		 * The meta object literal for the '{@link tosca.impl.TExportedInterfaceImpl <em>TExported Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.TExportedInterfaceImpl
		 * @see tosca.impl.ToscaPackageImpl#getTExportedInterface()
		 * @generated
		 */
		EClass TEXPORTED_INTERFACE = eINSTANCE.getTExportedInterface();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXPORTED_INTERFACE__OPERATION = eINSTANCE.getTExportedInterface_Operation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXPORTED_INTERFACE__NAME = eINSTANCE.getTExportedInterface_Name();

		/**
		 * The meta object literal for the '{@link tosca.impl.TExportedOperationImpl <em>TExported Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.TExportedOperationImpl
		 * @see tosca.impl.ToscaPackageImpl#getTExportedOperation()
		 * @generated
		 */
		EClass TEXPORTED_OPERATION = eINSTANCE.getTExportedOperation();

		/**
		 * The meta object literal for the '<em><b>Node Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXPORTED_OPERATION__NODE_OPERATION = eINSTANCE.getTExportedOperation_NodeOperation();

		/**
		 * The meta object literal for the '<em><b>Relationship Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXPORTED_OPERATION__RELATIONSHIP_OPERATION = eINSTANCE.getTExportedOperation_RelationshipOperation();

		/**
		 * The meta object literal for the '<em><b>Plan</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXPORTED_OPERATION__PLAN = eINSTANCE.getTExportedOperation_Plan();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXPORTED_OPERATION__NAME = eINSTANCE.getTExportedOperation_Name();

		/**
		 * The meta object literal for the '{@link tosca.impl.TExtensibleElementsImpl <em>TExtensible Elements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.TExtensibleElementsImpl
		 * @see tosca.impl.ToscaPackageImpl#getTExtensibleElements()
		 * @generated
		 */
		EClass TEXTENSIBLE_ELEMENTS = eINSTANCE.getTExtensibleElements();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXTENSIBLE_ELEMENTS__DOCUMENTATION = eINSTANCE.getTExtensibleElements_Documentation();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTENSIBLE_ELEMENTS__ANY = eINSTANCE.getTExtensibleElements_Any();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE = eINSTANCE.getTExtensibleElements_AnyAttribute();

		/**
		 * The meta object literal for the '{@link tosca.impl.TExtensionImpl <em>TExtension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.TExtensionImpl
		 * @see tosca.impl.ToscaPackageImpl#getTExtension()
		 * @generated
		 */
		EClass TEXTENSION = eINSTANCE.getTExtension();

		/**
		 * The meta object literal for the '<em><b>Must Understand</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTENSION__MUST_UNDERSTAND = eINSTANCE.getTExtension_MustUnderstand();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTENSION__NAMESPACE = eINSTANCE.getTExtension_Namespace();

		/**
		 * The meta object literal for the '{@link tosca.impl.TExtensionsImpl <em>TExtensions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.TExtensionsImpl
		 * @see tosca.impl.ToscaPackageImpl#getTExtensions()
		 * @generated
		 */
		EClass TEXTENSIONS = eINSTANCE.getTExtensions();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXTENSIONS__EXTENSION = eINSTANCE.getTExtensions_Extension();

		/**
		 * The meta object literal for the '{@link tosca.impl.TImplementationArtifactImpl <em>TImplementation Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.TImplementationArtifactImpl
		 * @see tosca.impl.ToscaPackageImpl#getTImplementationArtifact()
		 * @generated
		 */
		EClass TIMPLEMENTATION_ARTIFACT = eINSTANCE.getTImplementationArtifact();

		/**
		 * The meta object literal for the '<em><b>Artifact Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMPLEMENTATION_ARTIFACT__ARTIFACT_REF = eINSTANCE.getTImplementationArtifact_ArtifactRef();

		/**
		 * The meta object literal for the '<em><b>Artifact Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMPLEMENTATION_ARTIFACT__ARTIFACT_TYPE = eINSTANCE.getTImplementationArtifact_ArtifactType();

		/**
		 * The meta object literal for the '<em><b>Interface Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMPLEMENTATION_ARTIFACT__INTERFACE_NAME = eINSTANCE.getTImplementationArtifact_InterfaceName();

		/**
		 * The meta object literal for the '<em><b>Operation Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMPLEMENTATION_ARTIFACT__OPERATION_NAME = eINSTANCE.getTImplementationArtifact_OperationName();

		/**
		 * The meta object literal for the '{@link tosca.impl.TImplementationArtifactsImpl <em>TImplementation Artifacts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.TImplementationArtifactsImpl
		 * @see tosca.impl.ToscaPackageImpl#getTImplementationArtifacts()
		 * @generated
		 */
		EClass TIMPLEMENTATION_ARTIFACTS = eINSTANCE.getTImplementationArtifacts();

		/**
		 * The meta object literal for the '<em><b>Implementation Artifact</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMPLEMENTATION_ARTIFACTS__IMPLEMENTATION_ARTIFACT = eINSTANCE.getTImplementationArtifacts_ImplementationArtifact();

		/**
		 * The meta object literal for the '{@link tosca.impl.TImportImpl <em>TImport</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.TImportImpl
		 * @see tosca.impl.ToscaPackageImpl#getTImport()
		 * @generated
		 */
		EClass TIMPORT = eINSTANCE.getTImport();

		/**
		 * The meta object literal for the '<em><b>Import Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMPORT__IMPORT_TYPE = eINSTANCE.getTImport_ImportType();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMPORT__LOCATION = eINSTANCE.getTImport_Location();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMPORT__NAMESPACE = eINSTANCE.getTImport_Namespace();

		/**
		 * The meta object literal for the '{@link tosca.impl.TInterfaceImpl <em>TInterface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.TInterfaceImpl
		 * @see tosca.impl.ToscaPackageImpl#getTInterface()
		 * @generated
		 */
		EClass TINTERFACE = eINSTANCE.getTInterface();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TINTERFACE__OPERATION = eINSTANCE.getTInterface_Operation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TINTERFACE__NAME = eINSTANCE.getTInterface_Name();

		/**
		 * The meta object literal for the '{@link tosca.impl.TNodeTemplateImpl <em>TNode Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.TNodeTemplateImpl
		 * @see tosca.impl.ToscaPackageImpl#getTNodeTemplate()
		 * @generated
		 */
		EClass TNODE_TEMPLATE = eINSTANCE.getTNodeTemplate();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TNODE_TEMPLATE__REQUIREMENTS = eINSTANCE.getTNodeTemplate_Requirements();

		/**
		 * The meta object literal for the '<em><b>Capabilities</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TNODE_TEMPLATE__CAPABILITIES = eINSTANCE.getTNodeTemplate_Capabilities();

		/**
		 * The meta object literal for the '<em><b>Policies</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TNODE_TEMPLATE__POLICIES = eINSTANCE.getTNodeTemplate_Policies();

		/**
		 * The meta object literal for the '<em><b>Deployment Artifacts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TNODE_TEMPLATE__DEPLOYMENT_ARTIFACTS = eINSTANCE.getTNodeTemplate_DeploymentArtifacts();

		/**
		 * The meta object literal for the '<em><b>Max Instances</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TNODE_TEMPLATE__MAX_INSTANCES = eINSTANCE.getTNodeTemplate_MaxInstances();

		/**
		 * The meta object literal for the '<em><b>Min Instances</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TNODE_TEMPLATE__MIN_INSTANCES = eINSTANCE.getTNodeTemplate_MinInstances();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TNODE_TEMPLATE__NAME = eINSTANCE.getTNodeTemplate_Name();

		/**
		 * The meta object literal for the '{@link tosca.impl.TNodeTypeImpl <em>TNode Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.TNodeTypeImpl
		 * @see tosca.impl.ToscaPackageImpl#getTNodeType()
		 * @generated
		 */
		EClass TNODE_TYPE = eINSTANCE.getTNodeType();

		/**
		 * The meta object literal for the '<em><b>Requirement Definitions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TNODE_TYPE__REQUIREMENT_DEFINITIONS = eINSTANCE.getTNodeType_RequirementDefinitions();

		/**
		 * The meta object literal for the '<em><b>Capability Definitions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TNODE_TYPE__CAPABILITY_DEFINITIONS = eINSTANCE.getTNodeType_CapabilityDefinitions();

		/**
		 * The meta object literal for the '<em><b>Instance States</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TNODE_TYPE__INSTANCE_STATES = eINSTANCE.getTNodeType_InstanceStates();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TNODE_TYPE__INTERFACES = eINSTANCE.getTNodeType_Interfaces();

		/**
		 * The meta object literal for the '{@link tosca.impl.TNodeTypeImplementationImpl <em>TNode Type Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.TNodeTypeImplementationImpl
		 * @see tosca.impl.ToscaPackageImpl#getTNodeTypeImplementation()
		 * @generated
		 */
		EClass TNODE_TYPE_IMPLEMENTATION = eINSTANCE.getTNodeTypeImplementation();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TNODE_TYPE_IMPLEMENTATION__TAGS = eINSTANCE.getTNodeTypeImplementation_Tags();

		/**
		 * The meta object literal for the '<em><b>Derived From</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TNODE_TYPE_IMPLEMENTATION__DERIVED_FROM = eINSTANCE.getTNodeTypeImplementation_DerivedFrom();

		/**
		 * The meta object literal for the '<em><b>Required Container Features</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TNODE_TYPE_IMPLEMENTATION__REQUIRED_CONTAINER_FEATURES = eINSTANCE.getTNodeTypeImplementation_RequiredContainerFeatures();

		/**
		 * The meta object literal for the '<em><b>Implementation Artifacts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TNODE_TYPE_IMPLEMENTATION__IMPLEMENTATION_ARTIFACTS = eINSTANCE.getTNodeTypeImplementation_ImplementationArtifacts();

		/**
		 * The meta object literal for the '<em><b>Deployment Artifacts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TNODE_TYPE_IMPLEMENTATION__DEPLOYMENT_ARTIFACTS = eINSTANCE.getTNodeTypeImplementation_DeploymentArtifacts();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TNODE_TYPE_IMPLEMENTATION__ABSTRACT = eINSTANCE.getTNodeTypeImplementation_Abstract();

		/**
		 * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TNODE_TYPE_IMPLEMENTATION__FINAL = eINSTANCE.getTNodeTypeImplementation_Final();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TNODE_TYPE_IMPLEMENTATION__NAME = eINSTANCE.getTNodeTypeImplementation_Name();

		/**
		 * The meta object literal for the '<em><b>Node Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TNODE_TYPE_IMPLEMENTATION__NODE_TYPE = eINSTANCE.getTNodeTypeImplementation_NodeType();

		/**
		 * The meta object literal for the '<em><b>Target Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TNODE_TYPE_IMPLEMENTATION__TARGET_NAMESPACE = eINSTANCE.getTNodeTypeImplementation_TargetNamespace();

		/**
		 * The meta object literal for the '{@link tosca.impl.TOperationImpl <em>TOperation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.TOperationImpl
		 * @see tosca.impl.ToscaPackageImpl#getTOperation()
		 * @generated
		 */
		EClass TOPERATION = eINSTANCE.getTOperation();

		/**
		 * The meta object literal for the '<em><b>Input Parameters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPERATION__INPUT_PARAMETERS = eINSTANCE.getTOperation_InputParameters();

		/**
		 * The meta object literal for the '<em><b>Output Parameters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPERATION__OUTPUT_PARAMETERS = eINSTANCE.getTOperation_OutputParameters();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOPERATION__NAME = eINSTANCE.getTOperation_Name();

		/**
		 * The meta object literal for the '{@link tosca.impl.TParameterImpl <em>TParameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.TParameterImpl
		 * @see tosca.impl.ToscaPackageImpl#getTParameter()
		 * @generated
		 */
		EClass TPARAMETER = eINSTANCE.getTParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPARAMETER__NAME = eINSTANCE.getTParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPARAMETER__REQUIRED = eINSTANCE.getTParameter_Required();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPARAMETER__TYPE = eINSTANCE.getTParameter_Type();

		/**
		 * The meta object literal for the '{@link tosca.impl.TPlanImpl <em>TPlan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.TPlanImpl
		 * @see tosca.impl.ToscaPackageImpl#getTPlan()
		 * @generated
		 */
		EClass TPLAN = eINSTANCE.getTPlan();

		/**
		 * The meta object literal for the '<em><b>Precondition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPLAN__PRECONDITION = eINSTANCE.getTPlan_Precondition();

		/**
		 * The meta object literal for the '<em><b>Input Parameters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPLAN__INPUT_PARAMETERS = eINSTANCE.getTPlan_InputParameters();

		/**
		 * The meta object literal for the '<em><b>Output Parameters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPLAN__OUTPUT_PARAMETERS = eINSTANCE.getTPlan_OutputParameters();

		/**
		 * The meta object literal for the '<em><b>Plan Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPLAN__PLAN_MODEL = eINSTANCE.getTPlan_PlanModel();

		/**
		 * The meta object literal for the '<em><b>Plan Model Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPLAN__PLAN_MODEL_REFERENCE = eINSTANCE.getTPlan_PlanModelReference();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPLAN__ID = eINSTANCE.getTPlan_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPLAN__NAME = eINSTANCE.getTPlan_Name();

		/**
		 * The meta object literal for the '<em><b>Plan Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPLAN__PLAN_LANGUAGE = eINSTANCE.getTPlan_PlanLanguage();

		/**
		 * The meta object literal for the '<em><b>Plan Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPLAN__PLAN_TYPE = eINSTANCE.getTPlan_PlanType();

		/**
		 * The meta object literal for the '{@link tosca.impl.TPlansImpl <em>TPlans</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.TPlansImpl
		 * @see tosca.impl.ToscaPackageImpl#getTPlans()
		 * @generated
		 */
		EClass TPLANS = eINSTANCE.getTPlans();

		/**
		 * The meta object literal for the '<em><b>Plan</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPLANS__PLAN = eINSTANCE.getTPlans_Plan();

		/**
		 * The meta object literal for the '<em><b>Target Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPLANS__TARGET_NAMESPACE = eINSTANCE.getTPlans_TargetNamespace();

		/**
		 * The meta object literal for the '{@link tosca.impl.TPolicyImpl <em>TPolicy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.TPolicyImpl
		 * @see tosca.impl.ToscaPackageImpl#getTPolicy()
		 * @generated
		 */
		EClass TPOLICY = eINSTANCE.getTPolicy();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPOLICY__NAME = eINSTANCE.getTPolicy_Name();

		/**
		 * The meta object literal for the '<em><b>Policy Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPOLICY__POLICY_REF = eINSTANCE.getTPolicy_PolicyRef();

		/**
		 * The meta object literal for the '<em><b>Policy Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPOLICY__POLICY_TYPE = eINSTANCE.getTPolicy_PolicyType();

		/**
		 * The meta object literal for the '{@link tosca.impl.TPolicyTemplateImpl <em>TPolicy Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.TPolicyTemplateImpl
		 * @see tosca.impl.ToscaPackageImpl#getTPolicyTemplate()
		 * @generated
		 */
		EClass TPOLICY_TEMPLATE = eINSTANCE.getTPolicyTemplate();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPOLICY_TEMPLATE__NAME = eINSTANCE.getTPolicyTemplate_Name();

		/**
		 * The meta object literal for the '{@link tosca.impl.TPolicyTypeImpl <em>TPolicy Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.TPolicyTypeImpl
		 * @see tosca.impl.ToscaPackageImpl#getTPolicyType()
		 * @generated
		 */
		EClass TPOLICY_TYPE = eINSTANCE.getTPolicyType();

		/**
		 * The meta object literal for the '<em><b>Applies To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPOLICY_TYPE__APPLIES_TO = eINSTANCE.getTPolicyType_AppliesTo();

		/**
		 * The meta object literal for the '<em><b>Policy Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPOLICY_TYPE__POLICY_LANGUAGE = eINSTANCE.getTPolicyType_PolicyLanguage();

		/**
		 * The meta object literal for the '{@link tosca.impl.TPropertyConstraintImpl <em>TProperty Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.TPropertyConstraintImpl
		 * @see tosca.impl.ToscaPackageImpl#getTPropertyConstraint()
		 * @generated
		 */
		EClass TPROPERTY_CONSTRAINT = eINSTANCE.getTPropertyConstraint();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPROPERTY_CONSTRAINT__PROPERTY = eINSTANCE.getTPropertyConstraint_Property();

		/**
		 * The meta object literal for the '{@link tosca.impl.TPropertyMappingImpl <em>TProperty Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.TPropertyMappingImpl
		 * @see tosca.impl.ToscaPackageImpl#getTPropertyMapping()
		 * @generated
		 */
		EClass TPROPERTY_MAPPING = eINSTANCE.getTPropertyMapping();

		/**
		 * The meta object literal for the '<em><b>Service Template Property Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPROPERTY_MAPPING__SERVICE_TEMPLATE_PROPERTY_REF = eINSTANCE.getTPropertyMapping_ServiceTemplatePropertyRef();

		/**
		 * The meta object literal for the '<em><b>Target Object Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPROPERTY_MAPPING__TARGET_OBJECT_REF = eINSTANCE.getTPropertyMapping_TargetObjectRef();

		/**
		 * The meta object literal for the '<em><b>Target Property Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPROPERTY_MAPPING__TARGET_PROPERTY_REF = eINSTANCE.getTPropertyMapping_TargetPropertyRef();

		/**
		 * The meta object literal for the '{@link tosca.impl.TRelationshipTemplateImpl <em>TRelationship Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.TRelationshipTemplateImpl
		 * @see tosca.impl.ToscaPackageImpl#getTRelationshipTemplate()
		 * @generated
		 */
		EClass TRELATIONSHIP_TEMPLATE = eINSTANCE.getTRelationshipTemplate();

		/**
		 * The meta object literal for the '<em><b>Source Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRELATIONSHIP_TEMPLATE__SOURCE_ELEMENT = eINSTANCE.getTRelationshipTemplate_SourceElement();

		/**
		 * The meta object literal for the '<em><b>Target Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRELATIONSHIP_TEMPLATE__TARGET_ELEMENT = eINSTANCE.getTRelationshipTemplate_TargetElement();

		/**
		 * The meta object literal for the '<em><b>Relationship Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRELATIONSHIP_TEMPLATE__RELATIONSHIP_CONSTRAINTS = eINSTANCE.getTRelationshipTemplate_RelationshipConstraints();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRELATIONSHIP_TEMPLATE__NAME = eINSTANCE.getTRelationshipTemplate_Name();

		/**
		 * The meta object literal for the '{@link tosca.impl.TRelationshipTypeImpl <em>TRelationship Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.TRelationshipTypeImpl
		 * @see tosca.impl.ToscaPackageImpl#getTRelationshipType()
		 * @generated
		 */
		EClass TRELATIONSHIP_TYPE = eINSTANCE.getTRelationshipType();

		/**
		 * The meta object literal for the '<em><b>Instance States</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRELATIONSHIP_TYPE__INSTANCE_STATES = eINSTANCE.getTRelationshipType_InstanceStates();

		/**
		 * The meta object literal for the '<em><b>Source Interfaces</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRELATIONSHIP_TYPE__SOURCE_INTERFACES = eINSTANCE.getTRelationshipType_SourceInterfaces();

		/**
		 * The meta object literal for the '<em><b>Target Interfaces</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRELATIONSHIP_TYPE__TARGET_INTERFACES = eINSTANCE.getTRelationshipType_TargetInterfaces();

		/**
		 * The meta object literal for the '<em><b>Valid Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRELATIONSHIP_TYPE__VALID_SOURCE = eINSTANCE.getTRelationshipType_ValidSource();

		/**
		 * The meta object literal for the '<em><b>Valid Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRELATIONSHIP_TYPE__VALID_TARGET = eINSTANCE.getTRelationshipType_ValidTarget();

		/**
		 * The meta object literal for the '{@link tosca.impl.TRelationshipTypeImplementationImpl <em>TRelationship Type Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.TRelationshipTypeImplementationImpl
		 * @see tosca.impl.ToscaPackageImpl#getTRelationshipTypeImplementation()
		 * @generated
		 */
		EClass TRELATIONSHIP_TYPE_IMPLEMENTATION = eINSTANCE.getTRelationshipTypeImplementation();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRELATIONSHIP_TYPE_IMPLEMENTATION__TAGS = eINSTANCE.getTRelationshipTypeImplementation_Tags();

		/**
		 * The meta object literal for the '<em><b>Derived From</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRELATIONSHIP_TYPE_IMPLEMENTATION__DERIVED_FROM = eINSTANCE.getTRelationshipTypeImplementation_DerivedFrom();

		/**
		 * The meta object literal for the '<em><b>Required Container Features</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRELATIONSHIP_TYPE_IMPLEMENTATION__REQUIRED_CONTAINER_FEATURES = eINSTANCE.getTRelationshipTypeImplementation_RequiredContainerFeatures();

		/**
		 * The meta object literal for the '<em><b>Implementation Artifacts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRELATIONSHIP_TYPE_IMPLEMENTATION__IMPLEMENTATION_ARTIFACTS = eINSTANCE.getTRelationshipTypeImplementation_ImplementationArtifacts();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRELATIONSHIP_TYPE_IMPLEMENTATION__ABSTRACT = eINSTANCE.getTRelationshipTypeImplementation_Abstract();

		/**
		 * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRELATIONSHIP_TYPE_IMPLEMENTATION__FINAL = eINSTANCE.getTRelationshipTypeImplementation_Final();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRELATIONSHIP_TYPE_IMPLEMENTATION__NAME = eINSTANCE.getTRelationshipTypeImplementation_Name();

		/**
		 * The meta object literal for the '<em><b>Relationship Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRELATIONSHIP_TYPE_IMPLEMENTATION__RELATIONSHIP_TYPE = eINSTANCE.getTRelationshipTypeImplementation_RelationshipType();

		/**
		 * The meta object literal for the '<em><b>Target Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRELATIONSHIP_TYPE_IMPLEMENTATION__TARGET_NAMESPACE = eINSTANCE.getTRelationshipTypeImplementation_TargetNamespace();

		/**
		 * The meta object literal for the '{@link tosca.impl.TRequiredContainerFeatureImpl <em>TRequired Container Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.TRequiredContainerFeatureImpl
		 * @see tosca.impl.ToscaPackageImpl#getTRequiredContainerFeature()
		 * @generated
		 */
		EClass TREQUIRED_CONTAINER_FEATURE = eINSTANCE.getTRequiredContainerFeature();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREQUIRED_CONTAINER_FEATURE__FEATURE = eINSTANCE.getTRequiredContainerFeature_Feature();

		/**
		 * The meta object literal for the '{@link tosca.impl.TRequiredContainerFeaturesImpl <em>TRequired Container Features</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.TRequiredContainerFeaturesImpl
		 * @see tosca.impl.ToscaPackageImpl#getTRequiredContainerFeatures()
		 * @generated
		 */
		EClass TREQUIRED_CONTAINER_FEATURES = eINSTANCE.getTRequiredContainerFeatures();

		/**
		 * The meta object literal for the '<em><b>Required Container Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREQUIRED_CONTAINER_FEATURES__REQUIRED_CONTAINER_FEATURE = eINSTANCE.getTRequiredContainerFeatures_RequiredContainerFeature();

		/**
		 * The meta object literal for the '{@link tosca.impl.TRequirementImpl <em>TRequirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.TRequirementImpl
		 * @see tosca.impl.ToscaPackageImpl#getTRequirement()
		 * @generated
		 */
		EClass TREQUIREMENT = eINSTANCE.getTRequirement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREQUIREMENT__NAME = eINSTANCE.getTRequirement_Name();

		/**
		 * The meta object literal for the '{@link tosca.impl.TRequirementDefinitionImpl <em>TRequirement Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.TRequirementDefinitionImpl
		 * @see tosca.impl.ToscaPackageImpl#getTRequirementDefinition()
		 * @generated
		 */
		EClass TREQUIREMENT_DEFINITION = eINSTANCE.getTRequirementDefinition();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREQUIREMENT_DEFINITION__CONSTRAINTS = eINSTANCE.getTRequirementDefinition_Constraints();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREQUIREMENT_DEFINITION__LOWER_BOUND = eINSTANCE.getTRequirementDefinition_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREQUIREMENT_DEFINITION__NAME = eINSTANCE.getTRequirementDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Requirement Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREQUIREMENT_DEFINITION__REQUIREMENT_TYPE = eINSTANCE.getTRequirementDefinition_RequirementType();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREQUIREMENT_DEFINITION__UPPER_BOUND = eINSTANCE.getTRequirementDefinition_UpperBound();

		/**
		 * The meta object literal for the '{@link tosca.impl.TRequirementRefImpl <em>TRequirement Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.TRequirementRefImpl
		 * @see tosca.impl.ToscaPackageImpl#getTRequirementRef()
		 * @generated
		 */
		EClass TREQUIREMENT_REF = eINSTANCE.getTRequirementRef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREQUIREMENT_REF__NAME = eINSTANCE.getTRequirementRef_Name();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREQUIREMENT_REF__REF = eINSTANCE.getTRequirementRef_Ref();

		/**
		 * The meta object literal for the '{@link tosca.impl.TRequirementTypeImpl <em>TRequirement Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.TRequirementTypeImpl
		 * @see tosca.impl.ToscaPackageImpl#getTRequirementType()
		 * @generated
		 */
		EClass TREQUIREMENT_TYPE = eINSTANCE.getTRequirementType();

		/**
		 * The meta object literal for the '<em><b>Required Capability Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREQUIREMENT_TYPE__REQUIRED_CAPABILITY_TYPE = eINSTANCE.getTRequirementType_RequiredCapabilityType();

		/**
		 * The meta object literal for the '{@link tosca.impl.TServiceTemplateImpl <em>TService Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.TServiceTemplateImpl
		 * @see tosca.impl.ToscaPackageImpl#getTServiceTemplate()
		 * @generated
		 */
		EClass TSERVICE_TEMPLATE = eINSTANCE.getTServiceTemplate();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSERVICE_TEMPLATE__TAGS = eINSTANCE.getTServiceTemplate_Tags();

		/**
		 * The meta object literal for the '<em><b>Boundary Definitions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSERVICE_TEMPLATE__BOUNDARY_DEFINITIONS = eINSTANCE.getTServiceTemplate_BoundaryDefinitions();

		/**
		 * The meta object literal for the '<em><b>Topology Template</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSERVICE_TEMPLATE__TOPOLOGY_TEMPLATE = eINSTANCE.getTServiceTemplate_TopologyTemplate();

		/**
		 * The meta object literal for the '<em><b>Plans</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSERVICE_TEMPLATE__PLANS = eINSTANCE.getTServiceTemplate_Plans();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TSERVICE_TEMPLATE__ID = eINSTANCE.getTServiceTemplate_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TSERVICE_TEMPLATE__NAME = eINSTANCE.getTServiceTemplate_Name();

		/**
		 * The meta object literal for the '<em><b>Substitutable Node Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TSERVICE_TEMPLATE__SUBSTITUTABLE_NODE_TYPE = eINSTANCE.getTServiceTemplate_SubstitutableNodeType();

		/**
		 * The meta object literal for the '<em><b>Target Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TSERVICE_TEMPLATE__TARGET_NAMESPACE = eINSTANCE.getTServiceTemplate_TargetNamespace();

		/**
		 * The meta object literal for the '{@link tosca.impl.TTagImpl <em>TTag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.TTagImpl
		 * @see tosca.impl.ToscaPackageImpl#getTTag()
		 * @generated
		 */
		EClass TTAG = eINSTANCE.getTTag();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TTAG__NAME = eINSTANCE.getTTag_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TTAG__VALUE = eINSTANCE.getTTag_Value();

		/**
		 * The meta object literal for the '{@link tosca.impl.TTagsImpl <em>TTags</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.TTagsImpl
		 * @see tosca.impl.ToscaPackageImpl#getTTags()
		 * @generated
		 */
		EClass TTAGS = eINSTANCE.getTTags();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TTAGS__TAG = eINSTANCE.getTTags_Tag();

		/**
		 * The meta object literal for the '{@link tosca.impl.TTopologyElementInstanceStatesImpl <em>TTopology Element Instance States</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.TTopologyElementInstanceStatesImpl
		 * @see tosca.impl.ToscaPackageImpl#getTTopologyElementInstanceStates()
		 * @generated
		 */
		EClass TTOPOLOGY_ELEMENT_INSTANCE_STATES = eINSTANCE.getTTopologyElementInstanceStates();

		/**
		 * The meta object literal for the '<em><b>Instance State</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TTOPOLOGY_ELEMENT_INSTANCE_STATES__INSTANCE_STATE = eINSTANCE.getTTopologyElementInstanceStates_InstanceState();

		/**
		 * The meta object literal for the '{@link tosca.impl.TTopologyTemplateImpl <em>TTopology Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.TTopologyTemplateImpl
		 * @see tosca.impl.ToscaPackageImpl#getTTopologyTemplate()
		 * @generated
		 */
		EClass TTOPOLOGY_TEMPLATE = eINSTANCE.getTTopologyTemplate();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TTOPOLOGY_TEMPLATE__GROUP = eINSTANCE.getTTopologyTemplate_Group();

		/**
		 * The meta object literal for the '<em><b>Node Template</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TTOPOLOGY_TEMPLATE__NODE_TEMPLATE = eINSTANCE.getTTopologyTemplate_NodeTemplate();

		/**
		 * The meta object literal for the '<em><b>Relationship Template</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TTOPOLOGY_TEMPLATE__RELATIONSHIP_TEMPLATE = eINSTANCE.getTTopologyTemplate_RelationshipTemplate();

		/**
		 * The meta object literal for the '{@link tosca.impl.TypesTypeImpl <em>Types Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.TypesTypeImpl
		 * @see tosca.impl.ToscaPackageImpl#getTypesType()
		 * @generated
		 */
		EClass TYPES_TYPE = eINSTANCE.getTypesType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPES_TYPE__ANY = eINSTANCE.getTypesType_Any();

		/**
		 * The meta object literal for the '{@link tosca.impl.ValidSourceTypeImpl <em>Valid Source Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.ValidSourceTypeImpl
		 * @see tosca.impl.ToscaPackageImpl#getValidSourceType()
		 * @generated
		 */
		EClass VALID_SOURCE_TYPE = eINSTANCE.getValidSourceType();

		/**
		 * The meta object literal for the '<em><b>Type Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALID_SOURCE_TYPE__TYPE_REF = eINSTANCE.getValidSourceType_TypeRef();

		/**
		 * The meta object literal for the '{@link tosca.impl.ValidTargetTypeImpl <em>Valid Target Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.ValidTargetTypeImpl
		 * @see tosca.impl.ToscaPackageImpl#getValidTargetType()
		 * @generated
		 */
		EClass VALID_TARGET_TYPE = eINSTANCE.getValidTargetType();

		/**
		 * The meta object literal for the '<em><b>Type Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALID_TARGET_TYPE__TYPE_REF = eINSTANCE.getValidTargetType_TypeRef();

		/**
		 * The meta object literal for the '{@link tosca.MaxInstancesTypeMember1 <em>Max Instances Type Member1</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.MaxInstancesTypeMember1
		 * @see tosca.impl.ToscaPackageImpl#getMaxInstancesTypeMember1()
		 * @generated
		 */
		EEnum MAX_INSTANCES_TYPE_MEMBER1 = eINSTANCE.getMaxInstancesTypeMember1();

		/**
		 * The meta object literal for the '{@link tosca.TBoolean <em>TBoolean</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.TBoolean
		 * @see tosca.impl.ToscaPackageImpl#getTBoolean()
		 * @generated
		 */
		EEnum TBOOLEAN = eINSTANCE.getTBoolean();

		/**
		 * The meta object literal for the '{@link tosca.UpperBoundTypeMember1 <em>Upper Bound Type Member1</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.UpperBoundTypeMember1
		 * @see tosca.impl.ToscaPackageImpl#getUpperBoundTypeMember1()
		 * @generated
		 */
		EEnum UPPER_BOUND_TYPE_MEMBER1 = eINSTANCE.getUpperBoundTypeMember1();

		/**
		 * The meta object literal for the '{@link tosca.UpperBoundTypeMember11 <em>Upper Bound Type Member11</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.UpperBoundTypeMember11
		 * @see tosca.impl.ToscaPackageImpl#getUpperBoundTypeMember11()
		 * @generated
		 */
		EEnum UPPER_BOUND_TYPE_MEMBER11 = eINSTANCE.getUpperBoundTypeMember11();

		/**
		 * The meta object literal for the '<em>Imported URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see tosca.impl.ToscaPackageImpl#getImportedURI()
		 * @generated
		 */
		EDataType IMPORTED_URI = eINSTANCE.getImportedURI();

		/**
		 * The meta object literal for the '<em>Max Instances Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see tosca.impl.ToscaPackageImpl#getMaxInstancesType()
		 * @generated
		 */
		EDataType MAX_INSTANCES_TYPE = eINSTANCE.getMaxInstancesType();

		/**
		 * The meta object literal for the '<em>Max Instances Type Member0</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see tosca.impl.ToscaPackageImpl#getMaxInstancesTypeMember0()
		 * @generated
		 */
		EDataType MAX_INSTANCES_TYPE_MEMBER0 = eINSTANCE.getMaxInstancesTypeMember0();

		/**
		 * The meta object literal for the '<em>Max Instances Type Member1 Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.MaxInstancesTypeMember1
		 * @see tosca.impl.ToscaPackageImpl#getMaxInstancesTypeMember1Object()
		 * @generated
		 */
		EDataType MAX_INSTANCES_TYPE_MEMBER1_OBJECT = eINSTANCE.getMaxInstancesTypeMember1Object();

		/**
		 * The meta object literal for the '<em>TBoolean Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.TBoolean
		 * @see tosca.impl.ToscaPackageImpl#getTBooleanObject()
		 * @generated
		 */
		EDataType TBOOLEAN_OBJECT = eINSTANCE.getTBooleanObject();

		/**
		 * The meta object literal for the '<em>Upper Bound Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see tosca.impl.ToscaPackageImpl#getUpperBoundType()
		 * @generated
		 */
		EDataType UPPER_BOUND_TYPE = eINSTANCE.getUpperBoundType();

		/**
		 * The meta object literal for the '<em>Upper Bound Type1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see tosca.impl.ToscaPackageImpl#getUpperBoundType1()
		 * @generated
		 */
		EDataType UPPER_BOUND_TYPE1 = eINSTANCE.getUpperBoundType1();

		/**
		 * The meta object literal for the '<em>Upper Bound Type Member0</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see tosca.impl.ToscaPackageImpl#getUpperBoundTypeMember0()
		 * @generated
		 */
		EDataType UPPER_BOUND_TYPE_MEMBER0 = eINSTANCE.getUpperBoundTypeMember0();

		/**
		 * The meta object literal for the '<em>Upper Bound Type Member01</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see tosca.impl.ToscaPackageImpl#getUpperBoundTypeMember01()
		 * @generated
		 */
		EDataType UPPER_BOUND_TYPE_MEMBER01 = eINSTANCE.getUpperBoundTypeMember01();

		/**
		 * The meta object literal for the '<em>Upper Bound Type Member1 Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.UpperBoundTypeMember1
		 * @see tosca.impl.ToscaPackageImpl#getUpperBoundTypeMember1Object()
		 * @generated
		 */
		EDataType UPPER_BOUND_TYPE_MEMBER1_OBJECT = eINSTANCE.getUpperBoundTypeMember1Object();

		/**
		 * The meta object literal for the '<em>Upper Bound Type Member1 Object1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.UpperBoundTypeMember11
		 * @see tosca.impl.ToscaPackageImpl#getUpperBoundTypeMember1Object1()
		 * @generated
		 */
		EDataType UPPER_BOUND_TYPE_MEMBER1_OBJECT1 = eINSTANCE.getUpperBoundTypeMember1Object1();

	}

} //ToscaPackage
