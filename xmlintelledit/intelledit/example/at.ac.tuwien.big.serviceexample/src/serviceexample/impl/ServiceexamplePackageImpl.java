/**
 */
package serviceexample.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import serviceexample.Cluster;
import serviceexample.NamedThing;
import serviceexample.Server;
import serviceexample.Service;
import serviceexample.ServiceType;
import serviceexample.ServiceexampleFactory;
import serviceexample.ServiceexamplePackage;

import serviceexample.util.ServiceexampleValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceexamplePackageImpl extends EPackageImpl implements ServiceexamplePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clusterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedThingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum serviceTypeEEnum = null;

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
	 * @see serviceexample.ServiceexamplePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ServiceexamplePackageImpl() {
		super(eNS_URI, ServiceexampleFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ServiceexamplePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ServiceexamplePackage init() {
		if (isInited) return (ServiceexamplePackage)EPackage.Registry.INSTANCE.getEPackage(ServiceexamplePackage.eNS_URI);

		// Obtain or create and register package
		ServiceexamplePackageImpl theServiceexamplePackage = (ServiceexamplePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ServiceexamplePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ServiceexamplePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theServiceexamplePackage.createPackageContents();

		// Initialize created meta-data
		theServiceexamplePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theServiceexamplePackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ServiceexampleValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theServiceexamplePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ServiceexamplePackage.eNS_URI, theServiceexamplePackage);
		return theServiceexamplePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCluster() {
		return clusterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCluster_Services() {
		return (EReference)clusterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCluster_Backup() {
		return (EReference)clusterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCluster_DesignSpeed() {
		return (EAttribute)clusterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCluster_Server() {
		return (EReference)clusterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_ProvidedBy() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_DesignSpeed() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Type() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServer() {
		return serverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServer_Speed() {
		return (EAttribute)serverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainer() {
		return containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainer_Service() {
		return (EReference)containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainer_Cluster() {
		return (EReference)containerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedThing() {
		return namedThingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedThing_Name() {
		return (EAttribute)namedThingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getServiceType() {
		return serviceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceexampleFactory getServiceexampleFactory() {
		return (ServiceexampleFactory)getEFactoryInstance();
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
		clusterEClass = createEClass(CLUSTER);
		createEReference(clusterEClass, CLUSTER__SERVICES);
		createEReference(clusterEClass, CLUSTER__BACKUP);
		createEAttribute(clusterEClass, CLUSTER__DESIGN_SPEED);
		createEReference(clusterEClass, CLUSTER__SERVER);

		serviceEClass = createEClass(SERVICE);
		createEReference(serviceEClass, SERVICE__PROVIDED_BY);
		createEAttribute(serviceEClass, SERVICE__DESIGN_SPEED);
		createEAttribute(serviceEClass, SERVICE__TYPE);

		serverEClass = createEClass(SERVER);
		createEAttribute(serverEClass, SERVER__SPEED);

		containerEClass = createEClass(CONTAINER);
		createEReference(containerEClass, CONTAINER__SERVICE);
		createEReference(containerEClass, CONTAINER__CLUSTER);

		namedThingEClass = createEClass(NAMED_THING);
		createEAttribute(namedThingEClass, NAMED_THING__NAME);

		// Create enums
		serviceTypeEEnum = createEEnum(SERVICE_TYPE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		clusterEClass.getESuperTypes().add(this.getNamedThing());
		serviceEClass.getESuperTypes().add(this.getNamedThing());
		serverEClass.getESuperTypes().add(this.getNamedThing());

		// Initialize classes, features, and operations; add parameters
		initEClass(clusterEClass, Cluster.class, "Cluster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCluster_Services(), this.getService(), null, "services", null, 1, -1, Cluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCluster_Backup(), this.getCluster(), null, "backup", null, 0, 1, Cluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCluster_DesignSpeed(), ecorePackage.getEBigInteger(), "designSpeed", null, 1, 1, Cluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCluster_Server(), this.getServer(), null, "server", null, 0, -1, Cluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getService_ProvidedBy(), this.getCluster(), null, "providedBy", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_DesignSpeed(), ecorePackage.getEBigInteger(), "designSpeed", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_Type(), this.getServiceType(), "type", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serverEClass, Server.class, "Server", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServer_Speed(), ecorePackage.getEBigInteger(), "speed", null, 1, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerEClass, serviceexample.Container.class, "Container", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainer_Service(), this.getService(), null, "service", null, 0, -1, serviceexample.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainer_Cluster(), this.getCluster(), null, "cluster", null, 0, -1, serviceexample.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedThingEClass, NamedThing.class, "NamedThing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedThing_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedThing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(serviceTypeEEnum, ServiceType.class, "ServiceType");
		addEEnumLiteral(serviceTypeEEnum, ServiceType.BESTEFFORT);
		addEEnumLiteral(serviceTypeEEnum, ServiceType.WEAKCONTRACT);
		addEEnumLiteral(serviceTypeEEnum, ServiceType.FAILSAFE);
		addEEnumLiteral(serviceTypeEEnum, ServiceType.IMPORTANT);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (clusterEClass, 
		   source, 
		   new String[] {
			 "constraints", "sameServics goodSpeed onlyOneImportant backupDifferent"
		   });	
		addAnnotation
		  (serviceEClass, 
		   source, 
		   new String[] {
			 "constraints", "speedFulfilled"
		   });	
		addAnnotation
		  (serverEClass, 
		   source, 
		   new String[] {
			 "constraints", "speedValid"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (clusterEClass, 
		   source, 
		   new String[] {
			 "sameServics", "backup = null or backup.services->includesAll(services)",
			 "goodSpeed", "designSpeed <= server.speed->sum()",
			 "onlyOneImportant", "services->select(s | s.type = ServiceType::IMPORTANT)->size() <= 1",
			 "backupDifferent", "backup <> self"
		   });	
		addAnnotation
		  (serviceEClass, 
		   source, 
		   new String[] {
			 "speedFulfilled", "type = ServiceType::BESTEFFORT or ( \n\t\t\tdesignSpeed <= providedBy.designSpeed and (if type = ServiceType::IMPORTANT then designSpeed <= providedBy.backup.designSpeed\n\t\t\t\telse type = ServiceType::WEAKCONTRACT or providedBy.backup <> null endif))"
		   });	
		addAnnotation
		  (serverEClass, 
		   source, 
		   new String[] {
			 "speedValid", "speed > 0 and speed <= 5"
		   });
	}

} //ServiceexamplePackageImpl
