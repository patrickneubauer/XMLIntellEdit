/**
 */
package eclassxmlschemadictionary_2_0Simplified.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import eclassxmlschemacommon_2_0Simplified.Eclassxmlschemacommon_2_0SimplifiedPackage;
import eclassxmlschemacommon_2_0Simplified.impl.Eclassxmlschemacommon_2_0SimplifiedPackageImpl;
import eclassxmlschemadictionary_2_0Simplified.Eclassxmlschemadictionary_2_0SimplifiedFactory;
import eclassxmlschemadictionary_2_0Simplified.Eclassxmlschemadictionary_2_0SimplifiedPackage;
import eclassxmlschemaheader_2_0Simplified.Eclassxmlschemaheader_2_0SimplifiedPackage;
import eclassxmlschemaheader_2_0Simplified.impl.Eclassxmlschemaheader_2_0SimplifiedPackageImpl;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackageImpl;
import isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage;
import isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackageImpl;
import xontomlextensionsschemacoreSimplified.XontomlextensionsschemacoreSimplifiedPackage;
import xontomlextensionsschemacoreSimplified.impl.XontomlextensionsschemacoreSimplifiedPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Eclassxmlschemadictionary_2_0SimplifiedPackageImpl extends EPackageImpl implements Eclassxmlschemadictionary_2_0SimplifiedPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eclassdictionaryEClass = null;

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
	 * @see eclassxmlschemadictionary_2_0Simplified.Eclassxmlschemadictionary_2_0SimplifiedPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Eclassxmlschemadictionary_2_0SimplifiedPackageImpl() {
		super(eNS_URI, Eclassxmlschemadictionary_2_0SimplifiedFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Eclassxmlschemadictionary_2_0SimplifiedPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Eclassxmlschemadictionary_2_0SimplifiedPackage init() {
		if (isInited) return (Eclassxmlschemadictionary_2_0SimplifiedPackage)EPackage.Registry.INSTANCE.getEPackage(Eclassxmlschemadictionary_2_0SimplifiedPackage.eNS_URI);

		// Obtain or create and register package
		Eclassxmlschemadictionary_2_0SimplifiedPackageImpl theEclassxmlschemadictionary_2_0SimplifiedPackage = (Eclassxmlschemadictionary_2_0SimplifiedPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Eclassxmlschemadictionary_2_0SimplifiedPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Eclassxmlschemadictionary_2_0SimplifiedPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		Eclassxmlschemaheader_2_0SimplifiedPackageImpl theEclassxmlschemaheader_2_0SimplifiedPackage = (Eclassxmlschemaheader_2_0SimplifiedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Eclassxmlschemaheader_2_0SimplifiedPackage.eNS_URI) instanceof Eclassxmlschemaheader_2_0SimplifiedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Eclassxmlschemaheader_2_0SimplifiedPackage.eNS_URI) : Eclassxmlschemaheader_2_0SimplifiedPackage.eINSTANCE);
		Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackageImpl theIsostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage = (Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.eNS_URI) instanceof Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.eNS_URI) : Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.eINSTANCE);
		XontomlextensionsschemacoreSimplifiedPackageImpl theXontomlextensionsschemacoreSimplifiedPackage = (XontomlextensionsschemacoreSimplifiedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XontomlextensionsschemacoreSimplifiedPackage.eNS_URI) instanceof XontomlextensionsschemacoreSimplifiedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XontomlextensionsschemacoreSimplifiedPackage.eNS_URI) : XontomlextensionsschemacoreSimplifiedPackage.eINSTANCE);
		Eclassxmlschemacommon_2_0SimplifiedPackageImpl theEclassxmlschemacommon_2_0SimplifiedPackage = (Eclassxmlschemacommon_2_0SimplifiedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Eclassxmlschemacommon_2_0SimplifiedPackage.eNS_URI) instanceof Eclassxmlschemacommon_2_0SimplifiedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Eclassxmlschemacommon_2_0SimplifiedPackage.eNS_URI) : Eclassxmlschemacommon_2_0SimplifiedPackage.eINSTANCE);
		Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackageImpl theIsostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage = (Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.eNS_URI) instanceof Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.eNS_URI) : Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.eINSTANCE);

		// Create package meta-data objects
		theEclassxmlschemadictionary_2_0SimplifiedPackage.createPackageContents();
		theEclassxmlschemaheader_2_0SimplifiedPackage.createPackageContents();
		theIsostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.createPackageContents();
		theXontomlextensionsschemacoreSimplifiedPackage.createPackageContents();
		theEclassxmlschemacommon_2_0SimplifiedPackage.createPackageContents();
		theIsostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.createPackageContents();

		// Initialize created meta-data
		theEclassxmlschemadictionary_2_0SimplifiedPackage.initializePackageContents();
		theEclassxmlschemaheader_2_0SimplifiedPackage.initializePackageContents();
		theIsostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.initializePackageContents();
		theXontomlextensionsschemacoreSimplifiedPackage.initializePackageContents();
		theEclassxmlschemacommon_2_0SimplifiedPackage.initializePackageContents();
		theIsostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEclassxmlschemadictionary_2_0SimplifiedPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Eclassxmlschemadictionary_2_0SimplifiedPackage.eNS_URI, theEclassxmlschemadictionary_2_0SimplifiedPackage);
		return theEclassxmlschemadictionary_2_0SimplifiedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getECLASSDICTIONARY() {
		return eclassdictionaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getECLASSDICTIONARY_Header() {
		return (EReference)eclassdictionaryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getECLASSDICTIONARY_Ontoml() {
		return (EReference)eclassdictionaryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getECLASSDICTIONARY_Extensions() {
		return (EReference)eclassdictionaryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Eclassxmlschemadictionary_2_0SimplifiedFactory getEclassxmlschemadictionary_2_0SimplifiedFactory() {
		return (Eclassxmlschemadictionary_2_0SimplifiedFactory)getEFactoryInstance();
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
		eclassdictionaryEClass = createEClass(ECLASSDICTIONARY);
		createEReference(eclassdictionaryEClass, ECLASSDICTIONARY__HEADER);
		createEReference(eclassdictionaryEClass, ECLASSDICTIONARY__ONTOML);
		createEReference(eclassdictionaryEClass, ECLASSDICTIONARY__EXTENSIONS);
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
		Eclassxmlschemaheader_2_0SimplifiedPackage theEclassxmlschemaheader_2_0SimplifiedPackage = (Eclassxmlschemaheader_2_0SimplifiedPackage)EPackage.Registry.INSTANCE.getEPackage(Eclassxmlschemaheader_2_0SimplifiedPackage.eNS_URI);
		Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage theIsostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage = (Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage)EPackage.Registry.INSTANCE.getEPackage(Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.eNS_URI);
		XontomlextensionsschemacoreSimplifiedPackage theXontomlextensionsschemacoreSimplifiedPackage = (XontomlextensionsschemacoreSimplifiedPackage)EPackage.Registry.INSTANCE.getEPackage(XontomlextensionsschemacoreSimplifiedPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(eclassdictionaryEClass, eclassxmlschemadictionary_2_0Simplified.ECLASSDICTIONARY.class, "ECLASSDICTIONARY", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getECLASSDICTIONARY_Header(), theEclassxmlschemaheader_2_0SimplifiedPackage.getDOCUMENTHEADER(), null, "header", null, 1, 1, eclassxmlschemadictionary_2_0Simplified.ECLASSDICTIONARY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getECLASSDICTIONARY_Ontoml(), theIsostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.getONTOML(), null, "ontoml", null, 1, 1, eclassxmlschemadictionary_2_0Simplified.ECLASSDICTIONARY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getECLASSDICTIONARY_Extensions(), theXontomlextensionsschemacoreSimplifiedPackage.getEXTENSIONS(), null, "extensions", null, 0, 1, eclassxmlschemadictionary_2_0Simplified.ECLASSDICTIONARY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
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
	}

} //Eclassxmlschemadictionary_2_0SimplifiedPackageImpl
