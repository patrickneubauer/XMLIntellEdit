/**
 */
package serviceexample;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see serviceexample.ServiceexampleFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface ServiceexamplePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "serviceexample";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/serviceexample";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "serviceexample";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ServiceexamplePackage eINSTANCE = serviceexample.impl.ServiceexamplePackageImpl.init();

	/**
	 * The meta object id for the '{@link serviceexample.impl.NamedThingImpl <em>Named Thing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see serviceexample.impl.NamedThingImpl
	 * @see serviceexample.impl.ServiceexamplePackageImpl#getNamedThing()
	 * @generated
	 */
	int NAMED_THING = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_THING__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_THING_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_THING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link serviceexample.impl.ClusterImpl <em>Cluster</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see serviceexample.impl.ClusterImpl
	 * @see serviceexample.impl.ServiceexamplePackageImpl#getCluster()
	 * @generated
	 */
	int CLUSTER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__NAME = NAMED_THING__NAME;

	/**
	 * The feature id for the '<em><b>Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__SERVICES = NAMED_THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Backup</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__BACKUP = NAMED_THING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Design Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__DESIGN_SPEED = NAMED_THING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Server</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__SERVER = NAMED_THING_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_FEATURE_COUNT = NAMED_THING_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_OPERATION_COUNT = NAMED_THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link serviceexample.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see serviceexample.impl.ServiceImpl
	 * @see serviceexample.impl.ServiceexamplePackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = NAMED_THING__NAME;

	/**
	 * The feature id for the '<em><b>Provided By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__PROVIDED_BY = NAMED_THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Design Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__DESIGN_SPEED = NAMED_THING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__TYPE = NAMED_THING_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = NAMED_THING_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = NAMED_THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link serviceexample.impl.ServerImpl <em>Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see serviceexample.impl.ServerImpl
	 * @see serviceexample.impl.ServiceexamplePackageImpl#getServer()
	 * @generated
	 */
	int SERVER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__NAME = NAMED_THING__NAME;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__SPEED = NAMED_THING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_FEATURE_COUNT = NAMED_THING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_OPERATION_COUNT = NAMED_THING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link serviceexample.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see serviceexample.impl.ContainerImpl
	 * @see serviceexample.impl.ServiceexamplePackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 3;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Cluster</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CLUSTER = 1;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link serviceexample.ServiceType <em>Service Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see serviceexample.ServiceType
	 * @see serviceexample.impl.ServiceexamplePackageImpl#getServiceType()
	 * @generated
	 */
	int SERVICE_TYPE = 5;


	/**
	 * Returns the meta object for class '{@link serviceexample.Cluster <em>Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cluster</em>'.
	 * @see serviceexample.Cluster
	 * @generated
	 */
	EClass getCluster();

	/**
	 * Returns the meta object for the reference list '{@link serviceexample.Cluster#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Services</em>'.
	 * @see serviceexample.Cluster#getServices()
	 * @see #getCluster()
	 * @generated
	 */
	EReference getCluster_Services();

	/**
	 * Returns the meta object for the reference '{@link serviceexample.Cluster#getBackup <em>Backup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Backup</em>'.
	 * @see serviceexample.Cluster#getBackup()
	 * @see #getCluster()
	 * @generated
	 */
	EReference getCluster_Backup();

	/**
	 * Returns the meta object for the attribute '{@link serviceexample.Cluster#getDesignSpeed <em>Design Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Design Speed</em>'.
	 * @see serviceexample.Cluster#getDesignSpeed()
	 * @see #getCluster()
	 * @generated
	 */
	EAttribute getCluster_DesignSpeed();

	/**
	 * Returns the meta object for the containment reference list '{@link serviceexample.Cluster#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Server</em>'.
	 * @see serviceexample.Cluster#getServer()
	 * @see #getCluster()
	 * @generated
	 */
	EReference getCluster_Server();

	/**
	 * Returns the meta object for class '{@link serviceexample.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see serviceexample.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the reference '{@link serviceexample.Service#getProvidedBy <em>Provided By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provided By</em>'.
	 * @see serviceexample.Service#getProvidedBy()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_ProvidedBy();

	/**
	 * Returns the meta object for the attribute '{@link serviceexample.Service#getDesignSpeed <em>Design Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Design Speed</em>'.
	 * @see serviceexample.Service#getDesignSpeed()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_DesignSpeed();

	/**
	 * Returns the meta object for the attribute '{@link serviceexample.Service#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see serviceexample.Service#getType()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Type();

	/**
	 * Returns the meta object for class '{@link serviceexample.Server <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server</em>'.
	 * @see serviceexample.Server
	 * @generated
	 */
	EClass getServer();

	/**
	 * Returns the meta object for the attribute '{@link serviceexample.Server#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see serviceexample.Server#getSpeed()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_Speed();

	/**
	 * Returns the meta object for class '{@link serviceexample.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see serviceexample.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link serviceexample.Container#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service</em>'.
	 * @see serviceexample.Container#getService()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Service();

	/**
	 * Returns the meta object for the containment reference list '{@link serviceexample.Container#getCluster <em>Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cluster</em>'.
	 * @see serviceexample.Container#getCluster()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Cluster();

	/**
	 * Returns the meta object for class '{@link serviceexample.NamedThing <em>Named Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Thing</em>'.
	 * @see serviceexample.NamedThing
	 * @generated
	 */
	EClass getNamedThing();

	/**
	 * Returns the meta object for the attribute '{@link serviceexample.NamedThing#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see serviceexample.NamedThing#getName()
	 * @see #getNamedThing()
	 * @generated
	 */
	EAttribute getNamedThing_Name();

	/**
	 * Returns the meta object for enum '{@link serviceexample.ServiceType <em>Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Service Type</em>'.
	 * @see serviceexample.ServiceType
	 * @generated
	 */
	EEnum getServiceType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ServiceexampleFactory getServiceexampleFactory();

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
		 * The meta object literal for the '{@link serviceexample.impl.ClusterImpl <em>Cluster</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see serviceexample.impl.ClusterImpl
		 * @see serviceexample.impl.ServiceexamplePackageImpl#getCluster()
		 * @generated
		 */
		EClass CLUSTER = eINSTANCE.getCluster();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLUSTER__SERVICES = eINSTANCE.getCluster_Services();

		/**
		 * The meta object literal for the '<em><b>Backup</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLUSTER__BACKUP = eINSTANCE.getCluster_Backup();

		/**
		 * The meta object literal for the '<em><b>Design Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLUSTER__DESIGN_SPEED = eINSTANCE.getCluster_DesignSpeed();

		/**
		 * The meta object literal for the '<em><b>Server</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLUSTER__SERVER = eINSTANCE.getCluster_Server();

		/**
		 * The meta object literal for the '{@link serviceexample.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see serviceexample.impl.ServiceImpl
		 * @see serviceexample.impl.ServiceexamplePackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Provided By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__PROVIDED_BY = eINSTANCE.getService_ProvidedBy();

		/**
		 * The meta object literal for the '<em><b>Design Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__DESIGN_SPEED = eINSTANCE.getService_DesignSpeed();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__TYPE = eINSTANCE.getService_Type();

		/**
		 * The meta object literal for the '{@link serviceexample.impl.ServerImpl <em>Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see serviceexample.impl.ServerImpl
		 * @see serviceexample.impl.ServiceexamplePackageImpl#getServer()
		 * @generated
		 */
		EClass SERVER = eINSTANCE.getServer();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__SPEED = eINSTANCE.getServer_Speed();

		/**
		 * The meta object literal for the '{@link serviceexample.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see serviceexample.impl.ContainerImpl
		 * @see serviceexample.impl.ServiceexamplePackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__SERVICE = eINSTANCE.getContainer_Service();

		/**
		 * The meta object literal for the '<em><b>Cluster</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__CLUSTER = eINSTANCE.getContainer_Cluster();

		/**
		 * The meta object literal for the '{@link serviceexample.impl.NamedThingImpl <em>Named Thing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see serviceexample.impl.NamedThingImpl
		 * @see serviceexample.impl.ServiceexamplePackageImpl#getNamedThing()
		 * @generated
		 */
		EClass NAMED_THING = eINSTANCE.getNamedThing();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_THING__NAME = eINSTANCE.getNamedThing_Name();

		/**
		 * The meta object literal for the '{@link serviceexample.ServiceType <em>Service Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see serviceexample.ServiceType
		 * @see serviceexample.impl.ServiceexamplePackageImpl#getServiceType()
		 * @generated
		 */
		EEnum SERVICE_TYPE = eINSTANCE.getServiceType();

	}

} //ServiceexamplePackage
