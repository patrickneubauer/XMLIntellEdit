/**
 */
package isostdisots_29002_5ed_1techxmlschemaidentifierSimplified.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import isostdisots_29002_5ed_1techxmlschemaidentifierSimplified.IRDISequence;
import isostdisots_29002_5ed_1techxmlschemaidentifierSimplified.Isostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedFactory;
import isostdisots_29002_5ed_1techxmlschemaidentifierSimplified.Isostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedPackage;
import isostdisots_29002_5ed_1techxmlschemaidentifierSimplified.util.Isostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Isostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedPackageImpl extends EPackageImpl implements Isostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass irdiSequenceEClass = null;

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
	 * @see isostdisots_29002_5ed_1techxmlschemaidentifierSimplified.Isostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Isostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedPackageImpl() {
		super(eNS_URI, Isostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Isostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Isostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedPackage init() {
		if (isInited) return (Isostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedPackage)EPackage.Registry.INSTANCE.getEPackage(Isostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedPackage.eNS_URI);

		// Obtain or create and register package
		Isostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedPackageImpl theIsostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedPackage = (Isostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Isostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Isostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theIsostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedPackage.createPackageContents();

		// Initialize created meta-data
		theIsostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theIsostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return Isostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theIsostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Isostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedPackage.eNS_URI, theIsostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedPackage);
		return theIsostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIRDISequence() {
		return irdiSequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIRDISequence_IRDIs() {
		return (EAttribute)irdiSequenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Isostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedFactory getIsostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedFactory() {
		return (Isostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedFactory)getEFactoryInstance();
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
		irdiSequenceEClass = createEClass(IRDI_SEQUENCE);
		createEAttribute(irdiSequenceEClass, IRDI_SEQUENCE__IRD_IS);
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
		initEClass(irdiSequenceEClass, IRDISequence.class, "IRDISequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIRDISequence_IRDIs(), ecorePackage.getEString(), "iRDIs", null, 0, -1, IRDISequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (irdiSequenceEClass, 
		   source, 
		   new String[] {
			 "constraints", "patternIRDIs"
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
		  (irdiSequenceEClass, 
		   source, 
		   new String[] {
			 "patternIRDIs", "self.iRDIs->forAll(x | x.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\')) or self.iRDIs->forAll(x | x.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\')) or self.iRDIs->forAll(x | x.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\'))"
		   });
	}

} //Isostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedPackageImpl
