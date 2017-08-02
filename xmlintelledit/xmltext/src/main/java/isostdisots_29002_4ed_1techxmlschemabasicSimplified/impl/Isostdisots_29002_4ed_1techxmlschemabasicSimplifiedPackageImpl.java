/**
 */
package isostdisots_29002_4ed_1techxmlschemabasicSimplified.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage;
import isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackageImpl;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl;
import isostdisots_29002_4ed_1techxmlschemabasicSimplified.InternationalText;
import isostdisots_29002_4ed_1techxmlschemabasicSimplified.Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedFactory;
import isostdisots_29002_4ed_1techxmlschemabasicSimplified.Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage;
import isostdisots_29002_4ed_1techxmlschemabasicSimplified.LanguageString;
import isostdisots_29002_4ed_1techxmlschemabasicSimplified.util.Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackageImpl extends EPackageImpl implements Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internationalTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languageStringEClass = null;

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
	 * @see isostdisots_29002_4ed_1techxmlschemabasicSimplified.Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackageImpl() {
		super(eNS_URI, Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage init() {
		if (isInited) return (Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage)EPackage.Registry.INSTANCE.getEPackage(Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage.eNS_URI);

		// Obtain or create and register package
		Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackageImpl theIsostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage = (Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl theIsostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage = (Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.eNS_URI) instanceof Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.eNS_URI) : Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.eINSTANCE);
		Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackageImpl theIsostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage = (Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.eNS_URI) instanceof Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.eNS_URI) : Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.eINSTANCE);

		// Create package meta-data objects
		theIsostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage.createPackageContents();
		theIsostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.createPackageContents();
		theIsostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.createPackageContents();

		// Initialize created meta-data
		theIsostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage.initializePackageContents();
		theIsostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.initializePackageContents();
		theIsostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theIsostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theIsostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage.eNS_URI, theIsostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage);
		return theIsostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternationalText() {
		return internationalTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternationalText_LocalStrings() {
		return (EReference)internationalTextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLanguageString() {
		return languageStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguageString_Content() {
		return (EAttribute)languageStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguageString_LanguageRef() {
		return (EAttribute)languageStringEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguageString_LanguageCode() {
		return (EAttribute)languageStringEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguageString_CountryCode() {
		return (EAttribute)languageStringEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedFactory getIsostdisots_29002_4ed_1techxmlschemabasicSimplifiedFactory() {
		return (Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedFactory)getEFactoryInstance();
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
		internationalTextEClass = createEClass(INTERNATIONAL_TEXT);
		createEReference(internationalTextEClass, INTERNATIONAL_TEXT__LOCAL_STRINGS);

		languageStringEClass = createEClass(LANGUAGE_STRING);
		createEAttribute(languageStringEClass, LANGUAGE_STRING__CONTENT);
		createEAttribute(languageStringEClass, LANGUAGE_STRING__LANGUAGE_REF);
		createEAttribute(languageStringEClass, LANGUAGE_STRING__LANGUAGE_CODE);
		createEAttribute(languageStringEClass, LANGUAGE_STRING__COUNTRY_CODE);
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

		// Initialize classes, features, and operations; add parameters
		initEClass(internationalTextEClass, InternationalText.class, "InternationalText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInternationalText_LocalStrings(), this.getLanguageString(), null, "localStrings", null, 1, -1, InternationalText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(languageStringEClass, LanguageString.class, "LanguageString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLanguageString_Content(), ecorePackage.getEString(), "content", null, 1, 1, LanguageString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanguageString_LanguageRef(), ecorePackage.getEString(), "languageRef", null, 0, 1, LanguageString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanguageString_LanguageCode(), ecorePackage.getEString(), "languageCode", null, 0, 1, LanguageString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanguageString_CountryCode(), ecorePackage.getEString(), "countryCode", null, 0, 1, LanguageString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (languageStringEClass, 
		   source, 
		   new String[] {
			 "constraints", "patternLanguageRef patternLanguageCode patternCountryCode"
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
		  (languageStringEClass, 
		   source, 
		   new String[] {
			 "patternLanguageRef", "(self.languageRef=null) or self.languageRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.languageRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.languageRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\')",
			 "patternLanguageCode", "(self.languageCode=null) or self.languageCode.matches(\'[a-z]{2}\') or self.languageCode.matches(\'[a-z]{3}\')",
			 "patternCountryCode", "(self.countryCode=null) or self.countryCode.matches(\'[A-Z]{2}\')"
		   });
	}

} //Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackageImpl
