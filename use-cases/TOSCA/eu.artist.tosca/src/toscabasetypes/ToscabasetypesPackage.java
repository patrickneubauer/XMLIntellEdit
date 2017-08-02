/**
 */
package toscabasetypes;

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
 * @see toscabasetypes.ToscabasetypesFactory
 * @model kind="package"
 * @generated
 */
public interface ToscabasetypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "toscabasetypes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://docs.oasis-open.org/tosca/ns/2011/12/ToscaBaseTypes";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tbt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ToscabasetypesPackage eINSTANCE = toscabasetypes.impl.ToscabasetypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link toscabasetypes.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see toscabasetypes.impl.DocumentRootImpl
	 * @see toscabasetypes.impl.ToscabasetypesPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 0;

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
	 * The feature id for the '<em><b>Server Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVER_PROPERTIES = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link toscabasetypes.impl.TServerPropertiesImpl <em>TServer Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see toscabasetypes.impl.TServerPropertiesImpl
	 * @see toscabasetypes.impl.ToscabasetypesPackageImpl#getTServerProperties()
	 * @generated
	 */
	int TSERVER_PROPERTIES = 1;

	/**
	 * The feature id for the '<em><b>Num Cpus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVER_PROPERTIES__NUM_CPUS = 0;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVER_PROPERTIES__MEMORY = 1;

	/**
	 * The number of structural features of the '<em>TServer Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVER_PROPERTIES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TServer Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVER_PROPERTIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link toscabasetypes.NumCpusType <em>Num Cpus Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see toscabasetypes.NumCpusType
	 * @see toscabasetypes.impl.ToscabasetypesPackageImpl#getNumCpusType()
	 * @generated
	 */
	int NUM_CPUS_TYPE = 2;

	/**
	 * The meta object id for the '<em>Num Cpus Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see toscabasetypes.NumCpusType
	 * @see toscabasetypes.impl.ToscabasetypesPackageImpl#getNumCpusTypeObject()
	 * @generated
	 */
	int NUM_CPUS_TYPE_OBJECT = 3;


	/**
	 * Returns the meta object for class '{@link toscabasetypes.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see toscabasetypes.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link toscabasetypes.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see toscabasetypes.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link toscabasetypes.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see toscabasetypes.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link toscabasetypes.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see toscabasetypes.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link toscabasetypes.DocumentRoot#getServerProperties <em>Server Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Server Properties</em>'.
	 * @see toscabasetypes.DocumentRoot#getServerProperties()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ServerProperties();

	/**
	 * Returns the meta object for class '{@link toscabasetypes.TServerProperties <em>TServer Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TServer Properties</em>'.
	 * @see toscabasetypes.TServerProperties
	 * @generated
	 */
	EClass getTServerProperties();

	/**
	 * Returns the meta object for the attribute '{@link toscabasetypes.TServerProperties#getNumCpus <em>Num Cpus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Cpus</em>'.
	 * @see toscabasetypes.TServerProperties#getNumCpus()
	 * @see #getTServerProperties()
	 * @generated
	 */
	EAttribute getTServerProperties_NumCpus();

	/**
	 * Returns the meta object for the attribute '{@link toscabasetypes.TServerProperties#getMemory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory</em>'.
	 * @see toscabasetypes.TServerProperties#getMemory()
	 * @see #getTServerProperties()
	 * @generated
	 */
	EAttribute getTServerProperties_Memory();

	/**
	 * Returns the meta object for enum '{@link toscabasetypes.NumCpusType <em>Num Cpus Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Num Cpus Type</em>'.
	 * @see toscabasetypes.NumCpusType
	 * @generated
	 */
	EEnum getNumCpusType();

	/**
	 * Returns the meta object for data type '{@link toscabasetypes.NumCpusType <em>Num Cpus Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Num Cpus Type Object</em>'.
	 * @see toscabasetypes.NumCpusType
	 * @model instanceClass="toscabasetypes.NumCpusType"
	 *        extendedMetaData="name='NumCpus_._type:Object' baseType='NumCpus_._type'"
	 * @generated
	 */
	EDataType getNumCpusTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ToscabasetypesFactory getToscabasetypesFactory();

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
		 * The meta object literal for the '{@link toscabasetypes.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see toscabasetypes.impl.DocumentRootImpl
		 * @see toscabasetypes.impl.ToscabasetypesPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Server Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SERVER_PROPERTIES = eINSTANCE.getDocumentRoot_ServerProperties();

		/**
		 * The meta object literal for the '{@link toscabasetypes.impl.TServerPropertiesImpl <em>TServer Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see toscabasetypes.impl.TServerPropertiesImpl
		 * @see toscabasetypes.impl.ToscabasetypesPackageImpl#getTServerProperties()
		 * @generated
		 */
		EClass TSERVER_PROPERTIES = eINSTANCE.getTServerProperties();

		/**
		 * The meta object literal for the '<em><b>Num Cpus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TSERVER_PROPERTIES__NUM_CPUS = eINSTANCE.getTServerProperties_NumCpus();

		/**
		 * The meta object literal for the '<em><b>Memory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TSERVER_PROPERTIES__MEMORY = eINSTANCE.getTServerProperties_Memory();

		/**
		 * The meta object literal for the '{@link toscabasetypes.NumCpusType <em>Num Cpus Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see toscabasetypes.NumCpusType
		 * @see toscabasetypes.impl.ToscabasetypesPackageImpl#getNumCpusType()
		 * @generated
		 */
		EEnum NUM_CPUS_TYPE = eINSTANCE.getNumCpusType();

		/**
		 * The meta object literal for the '<em>Num Cpus Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see toscabasetypes.NumCpusType
		 * @see toscabasetypes.impl.ToscabasetypesPackageImpl#getNumCpusTypeObject()
		 * @generated
		 */
		EDataType NUM_CPUS_TYPE_OBJECT = eINSTANCE.getNumCpusTypeObject();

	}

} //ToscabasetypesPackage
