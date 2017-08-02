/**
 */
package isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage;
import isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackageImpl;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.BagValue;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.BooleanValue;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.Combination;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.ComplexValue;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.CompositeValue;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.ControlledValue;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.CurrencyValue;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.DateTimeValue;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.DateValue;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.Environment;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.Field;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.FileValue;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.IntegerValue;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedFactory;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.ItemReferenceValue;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.LocalizedTextValue;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.MeasureQualifiedNumberValue;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.MeasureRangeValue;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.MeasureSingleNumberValue;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.MeasureValue;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.NullValue;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.NumericValue;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.OneOf;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.QualifiedValue;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.RationalValue;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.RealValue;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.SequenceValue;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.SetValue;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.StringValue;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.TimeValue;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.YearMonthValue;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.YearValue;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.util.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedValidator;
import isostdisots_29002_4ed_1techxmlschemabasicSimplified.Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage;
import isostdisots_29002_4ed_1techxmlschemabasicSimplified.impl.Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl extends EPackageImpl implements Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bagValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass combinationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlledValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass currencyValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTimeValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass environmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemReferenceValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localizedTextValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureQualifiedNumberValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureRangeValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureSingleNumberValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nullValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oneOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualifiedValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rationalValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yearMonthValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yearValueEClass = null;

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
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl() {
		super(eNS_URI, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage init() {
		if (isInited) return (Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage)EPackage.Registry.INSTANCE.getEPackage(Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.eNS_URI);

		// Obtain or create and register package
		Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl theIsostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage = (Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackageImpl theIsostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage = (Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.eNS_URI) instanceof Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.eNS_URI) : Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.eINSTANCE);
		Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackageImpl theIsostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage = (Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage.eNS_URI) instanceof Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage.eNS_URI) : Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage.eINSTANCE);

		// Create package meta-data objects
		theIsostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.createPackageContents();
		theIsostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.createPackageContents();
		theIsostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage.createPackageContents();

		// Initialize created meta-data
		theIsostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.initializePackageContents();
		theIsostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.initializePackageContents();
		theIsostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theIsostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theIsostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.eNS_URI, theIsostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage);
		return theIsostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBagValue() {
		return bagValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBagValue_StringValues() {
		return (EReference)bagValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBagValue_BagValues() {
		return (EReference)bagValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBagValue_BooleanValues() {
		return (EReference)bagValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBagValue_ComplexValues() {
		return (EReference)bagValueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBagValue_CompositeValues() {
		return (EReference)bagValueEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBagValue_ControlledValues() {
		return (EReference)bagValueEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBagValue_CurrencyValues() {
		return (EReference)bagValueEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBagValue_DateValues() {
		return (EReference)bagValueEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBagValue_DateTimeValues() {
		return (EReference)bagValueEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBagValue_FileValues() {
		return (EReference)bagValueEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBagValue_IntegerValues() {
		return (EReference)bagValueEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBagValue_ItemReferenceValues() {
		return (EReference)bagValueEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBagValue_LocalizedTextValues() {
		return (EReference)bagValueEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBagValue_MeasureQualifiedNumberValues() {
		return (EReference)bagValueEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBagValue_MeasureRangeValues() {
		return (EReference)bagValueEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBagValue_MeasureSingleNumberValues() {
		return (EReference)bagValueEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBagValue_NullValues() {
		return (EReference)bagValueEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBagValue_RationalValues() {
		return (EReference)bagValueEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBagValue_RealValues() {
		return (EReference)bagValueEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBagValue_SequenceValues() {
		return (EReference)bagValueEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBagValue_SetValues() {
		return (EReference)bagValueEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBagValue_TimeValues() {
		return (EReference)bagValueEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBagValue_YearMonthValues() {
		return (EReference)bagValueEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBagValue_YearValues() {
		return (EReference)bagValueEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanValue() {
		return booleanValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanValue_Value() {
		return (EAttribute)booleanValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCombination() {
		return combinationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombination_StringValues() {
		return (EReference)combinationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombination_BagValues() {
		return (EReference)combinationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombination_BooleanValues() {
		return (EReference)combinationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombination_ComplexValues() {
		return (EReference)combinationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombination_CompositeValues() {
		return (EReference)combinationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombination_ControlledValues() {
		return (EReference)combinationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombination_CurrencyValues() {
		return (EReference)combinationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombination_DateValues() {
		return (EReference)combinationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombination_DateTimeValues() {
		return (EReference)combinationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombination_FileValues() {
		return (EReference)combinationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombination_IntegerValues() {
		return (EReference)combinationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombination_ItemReferenceValues() {
		return (EReference)combinationEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombination_LocalizedTextValues() {
		return (EReference)combinationEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombination_MeasureQualifiedNumberValues() {
		return (EReference)combinationEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombination_MeasureRangeValues() {
		return (EReference)combinationEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombination_MeasureSingleNumberValues() {
		return (EReference)combinationEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombination_NullValues() {
		return (EReference)combinationEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombination_RationalValues() {
		return (EReference)combinationEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombination_RealValues() {
		return (EReference)combinationEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombination_SequenceValues() {
		return (EReference)combinationEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombination_SetValues() {
		return (EReference)combinationEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombination_TimeValues() {
		return (EReference)combinationEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombination_YearMonthValues() {
		return (EReference)combinationEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombination_YearValues() {
		return (EReference)combinationEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexValue() {
		return complexValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeValue() {
		return compositeValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeValue_Fields() {
		return (EReference)compositeValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionElement() {
		return conditionElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionElement_PropertyRef() {
		return (EAttribute)conditionElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionElement_StringValue() {
		return (EReference)conditionElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionElement_BagValue() {
		return (EReference)conditionElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionElement_BooleanValue() {
		return (EReference)conditionElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionElement_ComplexValue() {
		return (EReference)conditionElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionElement_CompositeValue() {
		return (EReference)conditionElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionElement_ControlledValue() {
		return (EReference)conditionElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionElement_CurrencyValue() {
		return (EReference)conditionElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionElement_DateValue() {
		return (EReference)conditionElementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionElement_DateTimeValue() {
		return (EReference)conditionElementEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionElement_FileValue() {
		return (EReference)conditionElementEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionElement_IntegerValue() {
		return (EReference)conditionElementEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionElement_ItemReferenceValue() {
		return (EReference)conditionElementEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionElement_LocalizedTextValue() {
		return (EReference)conditionElementEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionElement_MeasureQualifiedNumberValue() {
		return (EReference)conditionElementEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionElement_MeasureRangeValue() {
		return (EReference)conditionElementEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionElement_MeasureSingleNumberValue() {
		return (EReference)conditionElementEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionElement_NullValue() {
		return (EReference)conditionElementEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionElement_RationalValue() {
		return (EReference)conditionElementEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionElement_RealValue() {
		return (EReference)conditionElementEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionElement_SequenceValue() {
		return (EReference)conditionElementEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionElement_SetValue() {
		return (EReference)conditionElementEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionElement_TimeValue() {
		return (EReference)conditionElementEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionElement_YearMonthValue() {
		return (EReference)conditionElementEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionElement_YearValue() {
		return (EReference)conditionElementEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlledValue() {
		return controlledValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlledValue_ValueCode() {
		return (EAttribute)controlledValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlledValue_ValueRef() {
		return (EAttribute)controlledValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCurrencyValue() {
		return currencyValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrencyValue_CurrencyCode() {
		return (EAttribute)currencyValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrencyValue_CurrencyRef() {
		return (EAttribute)currencyValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCurrencyValue_RealValue() {
		return (EReference)currencyValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCurrencyValue_ComplexValue() {
		return (EReference)currencyValueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCurrencyValue_IntegerValue() {
		return (EReference)currencyValueEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCurrencyValue_RationalValue() {
		return (EReference)currencyValueEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateTimeValue() {
		return dateTimeValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateTimeValue_Value() {
		return (EAttribute)dateTimeValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateValue() {
		return dateValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateValue_Value() {
		return (EAttribute)dateValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnvironment() {
		return environmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvironment_PropertyValues() {
		return (EReference)environmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getField() {
		return fieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_PropertyRef() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getField_StringValue() {
		return (EReference)fieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getField_BagValue() {
		return (EReference)fieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getField_BooleanValue() {
		return (EReference)fieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getField_ComplexValue() {
		return (EReference)fieldEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getField_CompositeValue() {
		return (EReference)fieldEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getField_ControlledValue() {
		return (EReference)fieldEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getField_CurrencyValue() {
		return (EReference)fieldEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getField_DateValue() {
		return (EReference)fieldEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getField_DateTimeValue() {
		return (EReference)fieldEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getField_FileValue() {
		return (EReference)fieldEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getField_IntegerValue() {
		return (EReference)fieldEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getField_ItemReferenceValue() {
		return (EReference)fieldEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getField_LocalizedTextValue() {
		return (EReference)fieldEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getField_MeasureQualifiedNumberValue() {
		return (EReference)fieldEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getField_MeasureRangeValue() {
		return (EReference)fieldEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getField_MeasureSingleNumberValue() {
		return (EReference)fieldEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getField_NullValue() {
		return (EReference)fieldEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getField_RationalValue() {
		return (EReference)fieldEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getField_RealValue() {
		return (EReference)fieldEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getField_SequenceValue() {
		return (EReference)fieldEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getField_SetValue() {
		return (EReference)fieldEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getField_TimeValue() {
		return (EReference)fieldEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getField_YearMonthValue() {
		return (EReference)fieldEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getField_YearValue() {
		return (EReference)fieldEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileValue() {
		return fileValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileValue_URI() {
		return (EAttribute)fileValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerValue() {
		return integerValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerValue_Value() {
		return (EAttribute)integerValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemReferenceValue() {
		return itemReferenceValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemReferenceValue_ItemLocalRef() {
		return (EReference)itemReferenceValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalizedTextValue() {
		return localizedTextValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalizedTextValue_Content() {
		return (EReference)localizedTextValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasureQualifiedNumberValue() {
		return measureQualifiedNumberValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureQualifiedNumberValue_QualifiedValues() {
		return (EReference)measureQualifiedNumberValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasureRangeValue() {
		return measureRangeValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureRangeValue_LowerValue() {
		return (EReference)measureRangeValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureRangeValue_UpperValue() {
		return (EReference)measureRangeValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasureSingleNumberValue() {
		return measureSingleNumberValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureSingleNumberValue_RealValue() {
		return (EReference)measureSingleNumberValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureSingleNumberValue_ComplexValue() {
		return (EReference)measureSingleNumberValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureSingleNumberValue_IntegerValue() {
		return (EReference)measureSingleNumberValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureSingleNumberValue_RationalValue() {
		return (EReference)measureSingleNumberValueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasureValue() {
		return measureValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasureValue_UOMCode() {
		return (EAttribute)measureValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasureValue_UOMRef() {
		return (EAttribute)measureValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNullValue() {
		return nullValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumericValue() {
		return numericValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumericValue_RealValue() {
		return (EReference)numericValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumericValue_ComplexValue() {
		return (EReference)numericValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumericValue_IntegerValue() {
		return (EReference)numericValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumericValue_RationalValue() {
		return (EReference)numericValueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOneOf() {
		return oneOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneOf_Combinations() {
		return (EReference)oneOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneOf_StringValues() {
		return (EReference)oneOfEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneOf_BagValues() {
		return (EReference)oneOfEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneOf_BooleanValues() {
		return (EReference)oneOfEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneOf_ComplexValues() {
		return (EReference)oneOfEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneOf_CompositeValues() {
		return (EReference)oneOfEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneOf_ControlledValues() {
		return (EReference)oneOfEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneOf_CurrencyValues() {
		return (EReference)oneOfEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneOf_DateValues() {
		return (EReference)oneOfEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneOf_DateTimeValues() {
		return (EReference)oneOfEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneOf_FileValues() {
		return (EReference)oneOfEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneOf_IntegerValues() {
		return (EReference)oneOfEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneOf_ItemReferenceValues() {
		return (EReference)oneOfEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneOf_LocalizedTextValues() {
		return (EReference)oneOfEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneOf_MeasureQualifiedNumberValues() {
		return (EReference)oneOfEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneOf_MeasureRangeValues() {
		return (EReference)oneOfEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneOf_MeasureSingleNumberValues() {
		return (EReference)oneOfEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneOf_NullValues() {
		return (EReference)oneOfEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneOf_RationalValues() {
		return (EReference)oneOfEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneOf_RealValues() {
		return (EReference)oneOfEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneOf_SequenceValues() {
		return (EReference)oneOfEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneOf_SetValues() {
		return (EReference)oneOfEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneOf_TimeValues() {
		return (EReference)oneOfEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneOf_YearMonthValues() {
		return (EReference)oneOfEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneOf_YearValues() {
		return (EReference)oneOfEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualifiedValue() {
		return qualifiedValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQualifiedValue_QualifierCode() {
		return (EAttribute)qualifiedValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQualifiedValue_QualifierRef() {
		return (EAttribute)qualifiedValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQualifiedValue_RealValue() {
		return (EReference)qualifiedValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQualifiedValue_ComplexValue() {
		return (EReference)qualifiedValueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQualifiedValue_IntegerValue() {
		return (EReference)qualifiedValueEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQualifiedValue_RationalValue() {
		return (EReference)qualifiedValueEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRationalValue() {
		return rationalValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRationalValue_WholePart() {
		return (EAttribute)rationalValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRationalValue_Numerator() {
		return (EAttribute)rationalValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRationalValue_Denominator() {
		return (EAttribute)rationalValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealValue() {
		return realValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceValue() {
		return sequenceValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceValue_StringValues() {
		return (EReference)sequenceValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceValue_BagValues() {
		return (EReference)sequenceValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceValue_BooleanValues() {
		return (EReference)sequenceValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceValue_ComplexValues() {
		return (EReference)sequenceValueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceValue_CompositeValues() {
		return (EReference)sequenceValueEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceValue_ControlledValues() {
		return (EReference)sequenceValueEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceValue_CurrencyValues() {
		return (EReference)sequenceValueEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceValue_DateValues() {
		return (EReference)sequenceValueEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceValue_DateTimeValues() {
		return (EReference)sequenceValueEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceValue_FileValues() {
		return (EReference)sequenceValueEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceValue_IntegerValues() {
		return (EReference)sequenceValueEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceValue_ItemReferenceValues() {
		return (EReference)sequenceValueEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceValue_LocalizedTextValues() {
		return (EReference)sequenceValueEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceValue_MeasureQualifiedNumberValues() {
		return (EReference)sequenceValueEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceValue_MeasureRangeValues() {
		return (EReference)sequenceValueEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceValue_MeasureSingleNumberValues() {
		return (EReference)sequenceValueEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceValue_NullValues() {
		return (EReference)sequenceValueEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceValue_RationalValues() {
		return (EReference)sequenceValueEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceValue_RealValues() {
		return (EReference)sequenceValueEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceValue_SequenceValues() {
		return (EReference)sequenceValueEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceValue_SetValues() {
		return (EReference)sequenceValueEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceValue_TimeValues() {
		return (EReference)sequenceValueEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceValue_YearMonthValues() {
		return (EReference)sequenceValueEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceValue_YearValues() {
		return (EReference)sequenceValueEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetValue() {
		return setValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetValue_StringValues() {
		return (EReference)setValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetValue_BagValues() {
		return (EReference)setValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetValue_BooleanValues() {
		return (EReference)setValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetValue_ComplexValues() {
		return (EReference)setValueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetValue_CompositeValues() {
		return (EReference)setValueEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetValue_ControlledValues() {
		return (EReference)setValueEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetValue_CurrencyValues() {
		return (EReference)setValueEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetValue_DateValues() {
		return (EReference)setValueEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetValue_DateTimeValues() {
		return (EReference)setValueEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetValue_FileValues() {
		return (EReference)setValueEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetValue_IntegerValues() {
		return (EReference)setValueEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetValue_ItemReferenceValues() {
		return (EReference)setValueEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetValue_LocalizedTextValues() {
		return (EReference)setValueEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetValue_MeasureQualifiedNumberValues() {
		return (EReference)setValueEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetValue_MeasureRangeValues() {
		return (EReference)setValueEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetValue_MeasureSingleNumberValues() {
		return (EReference)setValueEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetValue_NullValues() {
		return (EReference)setValueEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetValue_RationalValues() {
		return (EReference)setValueEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetValue_RealValues() {
		return (EReference)setValueEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetValue_SequenceValues() {
		return (EReference)setValueEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetValue_SetValues() {
		return (EReference)setValueEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetValue_TimeValues() {
		return (EReference)setValueEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetValue_YearMonthValues() {
		return (EReference)setValueEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetValue_YearValues() {
		return (EReference)setValueEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringValue() {
		return stringValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringValue_Value() {
		return (EAttribute)stringValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeValue() {
		return timeValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeValue_Value() {
		return (EAttribute)timeValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYearMonthValue() {
		return yearMonthValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYearMonthValue_Value() {
		return (EAttribute)yearMonthValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYearValue() {
		return yearValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYearValue_Value() {
		return (EAttribute)yearValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedFactory getIsostdisots_29002_10ed_1techxmlschemavalueSimplifiedFactory() {
		return (Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedFactory)getEFactoryInstance();
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
		bagValueEClass = createEClass(BAG_VALUE);
		createEReference(bagValueEClass, BAG_VALUE__STRING_VALUES);
		createEReference(bagValueEClass, BAG_VALUE__BAG_VALUES);
		createEReference(bagValueEClass, BAG_VALUE__BOOLEAN_VALUES);
		createEReference(bagValueEClass, BAG_VALUE__COMPLEX_VALUES);
		createEReference(bagValueEClass, BAG_VALUE__COMPOSITE_VALUES);
		createEReference(bagValueEClass, BAG_VALUE__CONTROLLED_VALUES);
		createEReference(bagValueEClass, BAG_VALUE__CURRENCY_VALUES);
		createEReference(bagValueEClass, BAG_VALUE__DATE_VALUES);
		createEReference(bagValueEClass, BAG_VALUE__DATE_TIME_VALUES);
		createEReference(bagValueEClass, BAG_VALUE__FILE_VALUES);
		createEReference(bagValueEClass, BAG_VALUE__INTEGER_VALUES);
		createEReference(bagValueEClass, BAG_VALUE__ITEM_REFERENCE_VALUES);
		createEReference(bagValueEClass, BAG_VALUE__LOCALIZED_TEXT_VALUES);
		createEReference(bagValueEClass, BAG_VALUE__MEASURE_QUALIFIED_NUMBER_VALUES);
		createEReference(bagValueEClass, BAG_VALUE__MEASURE_RANGE_VALUES);
		createEReference(bagValueEClass, BAG_VALUE__MEASURE_SINGLE_NUMBER_VALUES);
		createEReference(bagValueEClass, BAG_VALUE__NULL_VALUES);
		createEReference(bagValueEClass, BAG_VALUE__RATIONAL_VALUES);
		createEReference(bagValueEClass, BAG_VALUE__REAL_VALUES);
		createEReference(bagValueEClass, BAG_VALUE__SEQUENCE_VALUES);
		createEReference(bagValueEClass, BAG_VALUE__SET_VALUES);
		createEReference(bagValueEClass, BAG_VALUE__TIME_VALUES);
		createEReference(bagValueEClass, BAG_VALUE__YEAR_MONTH_VALUES);
		createEReference(bagValueEClass, BAG_VALUE__YEAR_VALUES);

		booleanValueEClass = createEClass(BOOLEAN_VALUE);
		createEAttribute(booleanValueEClass, BOOLEAN_VALUE__VALUE);

		combinationEClass = createEClass(COMBINATION);
		createEReference(combinationEClass, COMBINATION__STRING_VALUES);
		createEReference(combinationEClass, COMBINATION__BAG_VALUES);
		createEReference(combinationEClass, COMBINATION__BOOLEAN_VALUES);
		createEReference(combinationEClass, COMBINATION__COMPLEX_VALUES);
		createEReference(combinationEClass, COMBINATION__COMPOSITE_VALUES);
		createEReference(combinationEClass, COMBINATION__CONTROLLED_VALUES);
		createEReference(combinationEClass, COMBINATION__CURRENCY_VALUES);
		createEReference(combinationEClass, COMBINATION__DATE_VALUES);
		createEReference(combinationEClass, COMBINATION__DATE_TIME_VALUES);
		createEReference(combinationEClass, COMBINATION__FILE_VALUES);
		createEReference(combinationEClass, COMBINATION__INTEGER_VALUES);
		createEReference(combinationEClass, COMBINATION__ITEM_REFERENCE_VALUES);
		createEReference(combinationEClass, COMBINATION__LOCALIZED_TEXT_VALUES);
		createEReference(combinationEClass, COMBINATION__MEASURE_QUALIFIED_NUMBER_VALUES);
		createEReference(combinationEClass, COMBINATION__MEASURE_RANGE_VALUES);
		createEReference(combinationEClass, COMBINATION__MEASURE_SINGLE_NUMBER_VALUES);
		createEReference(combinationEClass, COMBINATION__NULL_VALUES);
		createEReference(combinationEClass, COMBINATION__RATIONAL_VALUES);
		createEReference(combinationEClass, COMBINATION__REAL_VALUES);
		createEReference(combinationEClass, COMBINATION__SEQUENCE_VALUES);
		createEReference(combinationEClass, COMBINATION__SET_VALUES);
		createEReference(combinationEClass, COMBINATION__TIME_VALUES);
		createEReference(combinationEClass, COMBINATION__YEAR_MONTH_VALUES);
		createEReference(combinationEClass, COMBINATION__YEAR_VALUES);

		complexValueEClass = createEClass(COMPLEX_VALUE);

		compositeValueEClass = createEClass(COMPOSITE_VALUE);
		createEReference(compositeValueEClass, COMPOSITE_VALUE__FIELDS);

		conditionElementEClass = createEClass(CONDITION_ELEMENT);
		createEAttribute(conditionElementEClass, CONDITION_ELEMENT__PROPERTY_REF);
		createEReference(conditionElementEClass, CONDITION_ELEMENT__STRING_VALUE);
		createEReference(conditionElementEClass, CONDITION_ELEMENT__BAG_VALUE);
		createEReference(conditionElementEClass, CONDITION_ELEMENT__BOOLEAN_VALUE);
		createEReference(conditionElementEClass, CONDITION_ELEMENT__COMPLEX_VALUE);
		createEReference(conditionElementEClass, CONDITION_ELEMENT__COMPOSITE_VALUE);
		createEReference(conditionElementEClass, CONDITION_ELEMENT__CONTROLLED_VALUE);
		createEReference(conditionElementEClass, CONDITION_ELEMENT__CURRENCY_VALUE);
		createEReference(conditionElementEClass, CONDITION_ELEMENT__DATE_VALUE);
		createEReference(conditionElementEClass, CONDITION_ELEMENT__DATE_TIME_VALUE);
		createEReference(conditionElementEClass, CONDITION_ELEMENT__FILE_VALUE);
		createEReference(conditionElementEClass, CONDITION_ELEMENT__INTEGER_VALUE);
		createEReference(conditionElementEClass, CONDITION_ELEMENT__ITEM_REFERENCE_VALUE);
		createEReference(conditionElementEClass, CONDITION_ELEMENT__LOCALIZED_TEXT_VALUE);
		createEReference(conditionElementEClass, CONDITION_ELEMENT__MEASURE_QUALIFIED_NUMBER_VALUE);
		createEReference(conditionElementEClass, CONDITION_ELEMENT__MEASURE_RANGE_VALUE);
		createEReference(conditionElementEClass, CONDITION_ELEMENT__MEASURE_SINGLE_NUMBER_VALUE);
		createEReference(conditionElementEClass, CONDITION_ELEMENT__NULL_VALUE);
		createEReference(conditionElementEClass, CONDITION_ELEMENT__RATIONAL_VALUE);
		createEReference(conditionElementEClass, CONDITION_ELEMENT__REAL_VALUE);
		createEReference(conditionElementEClass, CONDITION_ELEMENT__SEQUENCE_VALUE);
		createEReference(conditionElementEClass, CONDITION_ELEMENT__SET_VALUE);
		createEReference(conditionElementEClass, CONDITION_ELEMENT__TIME_VALUE);
		createEReference(conditionElementEClass, CONDITION_ELEMENT__YEAR_MONTH_VALUE);
		createEReference(conditionElementEClass, CONDITION_ELEMENT__YEAR_VALUE);

		controlledValueEClass = createEClass(CONTROLLED_VALUE);
		createEAttribute(controlledValueEClass, CONTROLLED_VALUE__VALUE_CODE);
		createEAttribute(controlledValueEClass, CONTROLLED_VALUE__VALUE_REF);

		currencyValueEClass = createEClass(CURRENCY_VALUE);
		createEAttribute(currencyValueEClass, CURRENCY_VALUE__CURRENCY_CODE);
		createEAttribute(currencyValueEClass, CURRENCY_VALUE__CURRENCY_REF);
		createEReference(currencyValueEClass, CURRENCY_VALUE__REAL_VALUE);
		createEReference(currencyValueEClass, CURRENCY_VALUE__COMPLEX_VALUE);
		createEReference(currencyValueEClass, CURRENCY_VALUE__INTEGER_VALUE);
		createEReference(currencyValueEClass, CURRENCY_VALUE__RATIONAL_VALUE);

		dateTimeValueEClass = createEClass(DATE_TIME_VALUE);
		createEAttribute(dateTimeValueEClass, DATE_TIME_VALUE__VALUE);

		dateValueEClass = createEClass(DATE_VALUE);
		createEAttribute(dateValueEClass, DATE_VALUE__VALUE);

		environmentEClass = createEClass(ENVIRONMENT);
		createEReference(environmentEClass, ENVIRONMENT__PROPERTY_VALUES);

		fieldEClass = createEClass(FIELD);
		createEAttribute(fieldEClass, FIELD__PROPERTY_REF);
		createEReference(fieldEClass, FIELD__STRING_VALUE);
		createEReference(fieldEClass, FIELD__BAG_VALUE);
		createEReference(fieldEClass, FIELD__BOOLEAN_VALUE);
		createEReference(fieldEClass, FIELD__COMPLEX_VALUE);
		createEReference(fieldEClass, FIELD__COMPOSITE_VALUE);
		createEReference(fieldEClass, FIELD__CONTROLLED_VALUE);
		createEReference(fieldEClass, FIELD__CURRENCY_VALUE);
		createEReference(fieldEClass, FIELD__DATE_VALUE);
		createEReference(fieldEClass, FIELD__DATE_TIME_VALUE);
		createEReference(fieldEClass, FIELD__FILE_VALUE);
		createEReference(fieldEClass, FIELD__INTEGER_VALUE);
		createEReference(fieldEClass, FIELD__ITEM_REFERENCE_VALUE);
		createEReference(fieldEClass, FIELD__LOCALIZED_TEXT_VALUE);
		createEReference(fieldEClass, FIELD__MEASURE_QUALIFIED_NUMBER_VALUE);
		createEReference(fieldEClass, FIELD__MEASURE_RANGE_VALUE);
		createEReference(fieldEClass, FIELD__MEASURE_SINGLE_NUMBER_VALUE);
		createEReference(fieldEClass, FIELD__NULL_VALUE);
		createEReference(fieldEClass, FIELD__RATIONAL_VALUE);
		createEReference(fieldEClass, FIELD__REAL_VALUE);
		createEReference(fieldEClass, FIELD__SEQUENCE_VALUE);
		createEReference(fieldEClass, FIELD__SET_VALUE);
		createEReference(fieldEClass, FIELD__TIME_VALUE);
		createEReference(fieldEClass, FIELD__YEAR_MONTH_VALUE);
		createEReference(fieldEClass, FIELD__YEAR_VALUE);

		fileValueEClass = createEClass(FILE_VALUE);
		createEAttribute(fileValueEClass, FILE_VALUE__URI);

		integerValueEClass = createEClass(INTEGER_VALUE);
		createEAttribute(integerValueEClass, INTEGER_VALUE__VALUE);

		itemReferenceValueEClass = createEClass(ITEM_REFERENCE_VALUE);
		createEReference(itemReferenceValueEClass, ITEM_REFERENCE_VALUE__ITEM_LOCAL_REF);

		localizedTextValueEClass = createEClass(LOCALIZED_TEXT_VALUE);
		createEReference(localizedTextValueEClass, LOCALIZED_TEXT_VALUE__CONTENT);

		measureQualifiedNumberValueEClass = createEClass(MEASURE_QUALIFIED_NUMBER_VALUE);
		createEReference(measureQualifiedNumberValueEClass, MEASURE_QUALIFIED_NUMBER_VALUE__QUALIFIED_VALUES);

		measureRangeValueEClass = createEClass(MEASURE_RANGE_VALUE);
		createEReference(measureRangeValueEClass, MEASURE_RANGE_VALUE__LOWER_VALUE);
		createEReference(measureRangeValueEClass, MEASURE_RANGE_VALUE__UPPER_VALUE);

		measureSingleNumberValueEClass = createEClass(MEASURE_SINGLE_NUMBER_VALUE);
		createEReference(measureSingleNumberValueEClass, MEASURE_SINGLE_NUMBER_VALUE__REAL_VALUE);
		createEReference(measureSingleNumberValueEClass, MEASURE_SINGLE_NUMBER_VALUE__COMPLEX_VALUE);
		createEReference(measureSingleNumberValueEClass, MEASURE_SINGLE_NUMBER_VALUE__INTEGER_VALUE);
		createEReference(measureSingleNumberValueEClass, MEASURE_SINGLE_NUMBER_VALUE__RATIONAL_VALUE);

		measureValueEClass = createEClass(MEASURE_VALUE);
		createEAttribute(measureValueEClass, MEASURE_VALUE__UOM_CODE);
		createEAttribute(measureValueEClass, MEASURE_VALUE__UOM_REF);

		nullValueEClass = createEClass(NULL_VALUE);

		numericValueEClass = createEClass(NUMERIC_VALUE);
		createEReference(numericValueEClass, NUMERIC_VALUE__REAL_VALUE);
		createEReference(numericValueEClass, NUMERIC_VALUE__COMPLEX_VALUE);
		createEReference(numericValueEClass, NUMERIC_VALUE__INTEGER_VALUE);
		createEReference(numericValueEClass, NUMERIC_VALUE__RATIONAL_VALUE);

		oneOfEClass = createEClass(ONE_OF);
		createEReference(oneOfEClass, ONE_OF__COMBINATIONS);
		createEReference(oneOfEClass, ONE_OF__STRING_VALUES);
		createEReference(oneOfEClass, ONE_OF__BAG_VALUES);
		createEReference(oneOfEClass, ONE_OF__BOOLEAN_VALUES);
		createEReference(oneOfEClass, ONE_OF__COMPLEX_VALUES);
		createEReference(oneOfEClass, ONE_OF__COMPOSITE_VALUES);
		createEReference(oneOfEClass, ONE_OF__CONTROLLED_VALUES);
		createEReference(oneOfEClass, ONE_OF__CURRENCY_VALUES);
		createEReference(oneOfEClass, ONE_OF__DATE_VALUES);
		createEReference(oneOfEClass, ONE_OF__DATE_TIME_VALUES);
		createEReference(oneOfEClass, ONE_OF__FILE_VALUES);
		createEReference(oneOfEClass, ONE_OF__INTEGER_VALUES);
		createEReference(oneOfEClass, ONE_OF__ITEM_REFERENCE_VALUES);
		createEReference(oneOfEClass, ONE_OF__LOCALIZED_TEXT_VALUES);
		createEReference(oneOfEClass, ONE_OF__MEASURE_QUALIFIED_NUMBER_VALUES);
		createEReference(oneOfEClass, ONE_OF__MEASURE_RANGE_VALUES);
		createEReference(oneOfEClass, ONE_OF__MEASURE_SINGLE_NUMBER_VALUES);
		createEReference(oneOfEClass, ONE_OF__NULL_VALUES);
		createEReference(oneOfEClass, ONE_OF__RATIONAL_VALUES);
		createEReference(oneOfEClass, ONE_OF__REAL_VALUES);
		createEReference(oneOfEClass, ONE_OF__SEQUENCE_VALUES);
		createEReference(oneOfEClass, ONE_OF__SET_VALUES);
		createEReference(oneOfEClass, ONE_OF__TIME_VALUES);
		createEReference(oneOfEClass, ONE_OF__YEAR_MONTH_VALUES);
		createEReference(oneOfEClass, ONE_OF__YEAR_VALUES);

		qualifiedValueEClass = createEClass(QUALIFIED_VALUE);
		createEAttribute(qualifiedValueEClass, QUALIFIED_VALUE__QUALIFIER_CODE);
		createEAttribute(qualifiedValueEClass, QUALIFIED_VALUE__QUALIFIER_REF);
		createEReference(qualifiedValueEClass, QUALIFIED_VALUE__REAL_VALUE);
		createEReference(qualifiedValueEClass, QUALIFIED_VALUE__COMPLEX_VALUE);
		createEReference(qualifiedValueEClass, QUALIFIED_VALUE__INTEGER_VALUE);
		createEReference(qualifiedValueEClass, QUALIFIED_VALUE__RATIONAL_VALUE);

		rationalValueEClass = createEClass(RATIONAL_VALUE);
		createEAttribute(rationalValueEClass, RATIONAL_VALUE__WHOLE_PART);
		createEAttribute(rationalValueEClass, RATIONAL_VALUE__NUMERATOR);
		createEAttribute(rationalValueEClass, RATIONAL_VALUE__DENOMINATOR);

		realValueEClass = createEClass(REAL_VALUE);

		sequenceValueEClass = createEClass(SEQUENCE_VALUE);
		createEReference(sequenceValueEClass, SEQUENCE_VALUE__STRING_VALUES);
		createEReference(sequenceValueEClass, SEQUENCE_VALUE__BAG_VALUES);
		createEReference(sequenceValueEClass, SEQUENCE_VALUE__BOOLEAN_VALUES);
		createEReference(sequenceValueEClass, SEQUENCE_VALUE__COMPLEX_VALUES);
		createEReference(sequenceValueEClass, SEQUENCE_VALUE__COMPOSITE_VALUES);
		createEReference(sequenceValueEClass, SEQUENCE_VALUE__CONTROLLED_VALUES);
		createEReference(sequenceValueEClass, SEQUENCE_VALUE__CURRENCY_VALUES);
		createEReference(sequenceValueEClass, SEQUENCE_VALUE__DATE_VALUES);
		createEReference(sequenceValueEClass, SEQUENCE_VALUE__DATE_TIME_VALUES);
		createEReference(sequenceValueEClass, SEQUENCE_VALUE__FILE_VALUES);
		createEReference(sequenceValueEClass, SEQUENCE_VALUE__INTEGER_VALUES);
		createEReference(sequenceValueEClass, SEQUENCE_VALUE__ITEM_REFERENCE_VALUES);
		createEReference(sequenceValueEClass, SEQUENCE_VALUE__LOCALIZED_TEXT_VALUES);
		createEReference(sequenceValueEClass, SEQUENCE_VALUE__MEASURE_QUALIFIED_NUMBER_VALUES);
		createEReference(sequenceValueEClass, SEQUENCE_VALUE__MEASURE_RANGE_VALUES);
		createEReference(sequenceValueEClass, SEQUENCE_VALUE__MEASURE_SINGLE_NUMBER_VALUES);
		createEReference(sequenceValueEClass, SEQUENCE_VALUE__NULL_VALUES);
		createEReference(sequenceValueEClass, SEQUENCE_VALUE__RATIONAL_VALUES);
		createEReference(sequenceValueEClass, SEQUENCE_VALUE__REAL_VALUES);
		createEReference(sequenceValueEClass, SEQUENCE_VALUE__SEQUENCE_VALUES);
		createEReference(sequenceValueEClass, SEQUENCE_VALUE__SET_VALUES);
		createEReference(sequenceValueEClass, SEQUENCE_VALUE__TIME_VALUES);
		createEReference(sequenceValueEClass, SEQUENCE_VALUE__YEAR_MONTH_VALUES);
		createEReference(sequenceValueEClass, SEQUENCE_VALUE__YEAR_VALUES);

		setValueEClass = createEClass(SET_VALUE);
		createEReference(setValueEClass, SET_VALUE__STRING_VALUES);
		createEReference(setValueEClass, SET_VALUE__BAG_VALUES);
		createEReference(setValueEClass, SET_VALUE__BOOLEAN_VALUES);
		createEReference(setValueEClass, SET_VALUE__COMPLEX_VALUES);
		createEReference(setValueEClass, SET_VALUE__COMPOSITE_VALUES);
		createEReference(setValueEClass, SET_VALUE__CONTROLLED_VALUES);
		createEReference(setValueEClass, SET_VALUE__CURRENCY_VALUES);
		createEReference(setValueEClass, SET_VALUE__DATE_VALUES);
		createEReference(setValueEClass, SET_VALUE__DATE_TIME_VALUES);
		createEReference(setValueEClass, SET_VALUE__FILE_VALUES);
		createEReference(setValueEClass, SET_VALUE__INTEGER_VALUES);
		createEReference(setValueEClass, SET_VALUE__ITEM_REFERENCE_VALUES);
		createEReference(setValueEClass, SET_VALUE__LOCALIZED_TEXT_VALUES);
		createEReference(setValueEClass, SET_VALUE__MEASURE_QUALIFIED_NUMBER_VALUES);
		createEReference(setValueEClass, SET_VALUE__MEASURE_RANGE_VALUES);
		createEReference(setValueEClass, SET_VALUE__MEASURE_SINGLE_NUMBER_VALUES);
		createEReference(setValueEClass, SET_VALUE__NULL_VALUES);
		createEReference(setValueEClass, SET_VALUE__RATIONAL_VALUES);
		createEReference(setValueEClass, SET_VALUE__REAL_VALUES);
		createEReference(setValueEClass, SET_VALUE__SEQUENCE_VALUES);
		createEReference(setValueEClass, SET_VALUE__SET_VALUES);
		createEReference(setValueEClass, SET_VALUE__TIME_VALUES);
		createEReference(setValueEClass, SET_VALUE__YEAR_MONTH_VALUES);
		createEReference(setValueEClass, SET_VALUE__YEAR_VALUES);

		stringValueEClass = createEClass(STRING_VALUE);
		createEAttribute(stringValueEClass, STRING_VALUE__VALUE);

		timeValueEClass = createEClass(TIME_VALUE);
		createEAttribute(timeValueEClass, TIME_VALUE__VALUE);

		yearMonthValueEClass = createEClass(YEAR_MONTH_VALUE);
		createEAttribute(yearMonthValueEClass, YEAR_MONTH_VALUE__VALUE);

		yearValueEClass = createEClass(YEAR_VALUE);
		createEAttribute(yearValueEClass, YEAR_VALUE__VALUE);
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
		Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage theIsostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage = (Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage)EPackage.Registry.INSTANCE.getEPackage(Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.eNS_URI);
		Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage theIsostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage = (Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage)EPackage.Registry.INSTANCE.getEPackage(Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		measureQualifiedNumberValueEClass.getESuperTypes().add(this.getMeasureValue());
		measureRangeValueEClass.getESuperTypes().add(this.getMeasureValue());
		measureSingleNumberValueEClass.getESuperTypes().add(this.getMeasureValue());

		// Initialize classes, features, and operations; add parameters
		initEClass(bagValueEClass, BagValue.class, "BagValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBagValue_StringValues(), this.getStringValue(), null, "stringValues", null, 0, -1, BagValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBagValue_BagValues(), this.getBagValue(), null, "bagValues", null, 0, -1, BagValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBagValue_BooleanValues(), this.getBooleanValue(), null, "booleanValues", null, 0, -1, BagValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBagValue_ComplexValues(), this.getComplexValue(), null, "complexValues", null, 0, -1, BagValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBagValue_CompositeValues(), this.getCompositeValue(), null, "compositeValues", null, 0, -1, BagValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBagValue_ControlledValues(), this.getControlledValue(), null, "controlledValues", null, 0, -1, BagValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBagValue_CurrencyValues(), this.getCurrencyValue(), null, "currencyValues", null, 0, -1, BagValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBagValue_DateValues(), this.getDateValue(), null, "dateValues", null, 0, -1, BagValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBagValue_DateTimeValues(), this.getDateTimeValue(), null, "dateTimeValues", null, 0, -1, BagValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBagValue_FileValues(), this.getFileValue(), null, "fileValues", null, 0, -1, BagValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBagValue_IntegerValues(), this.getIntegerValue(), null, "integerValues", null, 0, -1, BagValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBagValue_ItemReferenceValues(), this.getItemReferenceValue(), null, "itemReferenceValues", null, 0, -1, BagValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBagValue_LocalizedTextValues(), this.getLocalizedTextValue(), null, "localizedTextValues", null, 0, -1, BagValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBagValue_MeasureQualifiedNumberValues(), this.getMeasureQualifiedNumberValue(), null, "measureQualifiedNumberValues", null, 0, -1, BagValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBagValue_MeasureRangeValues(), this.getMeasureRangeValue(), null, "measureRangeValues", null, 0, -1, BagValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBagValue_MeasureSingleNumberValues(), this.getMeasureSingleNumberValue(), null, "measureSingleNumberValues", null, 0, -1, BagValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBagValue_NullValues(), this.getNullValue(), null, "nullValues", null, 0, -1, BagValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBagValue_RationalValues(), this.getRationalValue(), null, "rationalValues", null, 0, -1, BagValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBagValue_RealValues(), this.getRealValue(), null, "realValues", null, 0, -1, BagValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBagValue_SequenceValues(), this.getSequenceValue(), null, "sequenceValues", null, 0, -1, BagValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBagValue_SetValues(), this.getSetValue(), null, "setValues", null, 0, -1, BagValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBagValue_TimeValues(), this.getTimeValue(), null, "timeValues", null, 0, -1, BagValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBagValue_YearMonthValues(), this.getYearMonthValue(), null, "yearMonthValues", null, 0, -1, BagValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBagValue_YearValues(), this.getYearValue(), null, "yearValues", null, 0, -1, BagValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanValueEClass, BooleanValue.class, "BooleanValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanValue_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, BooleanValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(combinationEClass, Combination.class, "Combination", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCombination_StringValues(), this.getStringValue(), null, "stringValues", null, 0, -1, Combination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCombination_BagValues(), this.getBagValue(), null, "bagValues", null, 0, -1, Combination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCombination_BooleanValues(), this.getBooleanValue(), null, "booleanValues", null, 0, -1, Combination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCombination_ComplexValues(), this.getComplexValue(), null, "complexValues", null, 0, -1, Combination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCombination_CompositeValues(), this.getCompositeValue(), null, "compositeValues", null, 0, -1, Combination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCombination_ControlledValues(), this.getControlledValue(), null, "controlledValues", null, 0, -1, Combination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCombination_CurrencyValues(), this.getCurrencyValue(), null, "currencyValues", null, 0, -1, Combination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCombination_DateValues(), this.getDateValue(), null, "dateValues", null, 0, -1, Combination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCombination_DateTimeValues(), this.getDateTimeValue(), null, "dateTimeValues", null, 0, -1, Combination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCombination_FileValues(), this.getFileValue(), null, "fileValues", null, 0, -1, Combination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCombination_IntegerValues(), this.getIntegerValue(), null, "integerValues", null, 0, -1, Combination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCombination_ItemReferenceValues(), this.getItemReferenceValue(), null, "itemReferenceValues", null, 0, -1, Combination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCombination_LocalizedTextValues(), this.getLocalizedTextValue(), null, "localizedTextValues", null, 0, -1, Combination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCombination_MeasureQualifiedNumberValues(), this.getMeasureQualifiedNumberValue(), null, "measureQualifiedNumberValues", null, 0, -1, Combination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCombination_MeasureRangeValues(), this.getMeasureRangeValue(), null, "measureRangeValues", null, 0, -1, Combination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCombination_MeasureSingleNumberValues(), this.getMeasureSingleNumberValue(), null, "measureSingleNumberValues", null, 0, -1, Combination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCombination_NullValues(), this.getNullValue(), null, "nullValues", null, 0, -1, Combination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCombination_RationalValues(), this.getRationalValue(), null, "rationalValues", null, 0, -1, Combination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCombination_RealValues(), this.getRealValue(), null, "realValues", null, 0, -1, Combination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCombination_SequenceValues(), this.getSequenceValue(), null, "sequenceValues", null, 0, -1, Combination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCombination_SetValues(), this.getSetValue(), null, "setValues", null, 0, -1, Combination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCombination_TimeValues(), this.getTimeValue(), null, "timeValues", null, 0, -1, Combination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCombination_YearMonthValues(), this.getYearMonthValue(), null, "yearMonthValues", null, 0, -1, Combination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCombination_YearValues(), this.getYearValue(), null, "yearValues", null, 0, -1, Combination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complexValueEClass, ComplexValue.class, "ComplexValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compositeValueEClass, CompositeValue.class, "CompositeValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeValue_Fields(), this.getField(), null, "fields", null, 0, -1, CompositeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionElementEClass, ConditionElement.class, "ConditionElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConditionElement_PropertyRef(), ecorePackage.getEString(), "propertyRef", null, 1, 1, ConditionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionElement_StringValue(), this.getStringValue(), null, "stringValue", null, 0, 1, ConditionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionElement_BagValue(), this.getBagValue(), null, "bagValue", null, 0, 1, ConditionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionElement_BooleanValue(), this.getBooleanValue(), null, "booleanValue", null, 0, 1, ConditionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionElement_ComplexValue(), this.getComplexValue(), null, "complexValue", null, 0, 1, ConditionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionElement_CompositeValue(), this.getCompositeValue(), null, "compositeValue", null, 0, 1, ConditionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionElement_ControlledValue(), this.getControlledValue(), null, "controlledValue", null, 0, 1, ConditionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionElement_CurrencyValue(), this.getCurrencyValue(), null, "currencyValue", null, 0, 1, ConditionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionElement_DateValue(), this.getDateValue(), null, "dateValue", null, 0, 1, ConditionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionElement_DateTimeValue(), this.getDateTimeValue(), null, "dateTimeValue", null, 0, 1, ConditionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionElement_FileValue(), this.getFileValue(), null, "fileValue", null, 0, 1, ConditionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionElement_IntegerValue(), this.getIntegerValue(), null, "integerValue", null, 0, 1, ConditionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionElement_ItemReferenceValue(), this.getItemReferenceValue(), null, "itemReferenceValue", null, 0, 1, ConditionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionElement_LocalizedTextValue(), this.getLocalizedTextValue(), null, "localizedTextValue", null, 0, 1, ConditionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionElement_MeasureQualifiedNumberValue(), this.getMeasureQualifiedNumberValue(), null, "measureQualifiedNumberValue", null, 0, 1, ConditionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionElement_MeasureRangeValue(), this.getMeasureRangeValue(), null, "measureRangeValue", null, 0, 1, ConditionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionElement_MeasureSingleNumberValue(), this.getMeasureSingleNumberValue(), null, "measureSingleNumberValue", null, 0, 1, ConditionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionElement_NullValue(), this.getNullValue(), null, "nullValue", null, 0, 1, ConditionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionElement_RationalValue(), this.getRationalValue(), null, "rationalValue", null, 0, 1, ConditionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionElement_RealValue(), this.getRealValue(), null, "realValue", null, 0, 1, ConditionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionElement_SequenceValue(), this.getSequenceValue(), null, "sequenceValue", null, 0, 1, ConditionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionElement_SetValue(), this.getSetValue(), null, "setValue", null, 0, 1, ConditionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionElement_TimeValue(), this.getTimeValue(), null, "timeValue", null, 0, 1, ConditionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionElement_YearMonthValue(), this.getYearMonthValue(), null, "yearMonthValue", null, 0, 1, ConditionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionElement_YearValue(), this.getYearValue(), null, "yearValue", null, 0, 1, ConditionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlledValueEClass, ControlledValue.class, "ControlledValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControlledValue_ValueCode(), ecorePackage.getEString(), "valueCode", null, 0, 1, ControlledValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlledValue_ValueRef(), ecorePackage.getEString(), "valueRef", null, 0, 1, ControlledValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(currencyValueEClass, CurrencyValue.class, "CurrencyValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCurrencyValue_CurrencyCode(), ecorePackage.getEString(), "currencyCode", null, 0, 1, CurrencyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCurrencyValue_CurrencyRef(), ecorePackage.getEString(), "currencyRef", null, 0, 1, CurrencyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCurrencyValue_RealValue(), this.getRealValue(), null, "realValue", null, 0, 1, CurrencyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCurrencyValue_ComplexValue(), this.getComplexValue(), null, "complexValue", null, 0, 1, CurrencyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCurrencyValue_IntegerValue(), this.getIntegerValue(), null, "integerValue", null, 0, 1, CurrencyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCurrencyValue_RationalValue(), this.getRationalValue(), null, "rationalValue", null, 0, 1, CurrencyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateTimeValueEClass, DateTimeValue.class, "DateTimeValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateTimeValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, DateTimeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateValueEClass, DateValue.class, "DateValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, DateValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(environmentEClass, Environment.class, "Environment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnvironment_PropertyValues(), this.getConditionElement(), null, "propertyValues", null, 1, -1, Environment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getField_PropertyRef(), ecorePackage.getEString(), "propertyRef", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getField_StringValue(), this.getStringValue(), null, "stringValue", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getField_BagValue(), this.getBagValue(), null, "bagValue", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getField_BooleanValue(), this.getBooleanValue(), null, "booleanValue", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getField_ComplexValue(), this.getComplexValue(), null, "complexValue", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getField_CompositeValue(), this.getCompositeValue(), null, "compositeValue", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getField_ControlledValue(), this.getControlledValue(), null, "controlledValue", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getField_CurrencyValue(), this.getCurrencyValue(), null, "currencyValue", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getField_DateValue(), this.getDateValue(), null, "dateValue", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getField_DateTimeValue(), this.getDateTimeValue(), null, "dateTimeValue", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getField_FileValue(), this.getFileValue(), null, "fileValue", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getField_IntegerValue(), this.getIntegerValue(), null, "integerValue", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getField_ItemReferenceValue(), this.getItemReferenceValue(), null, "itemReferenceValue", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getField_LocalizedTextValue(), this.getLocalizedTextValue(), null, "localizedTextValue", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getField_MeasureQualifiedNumberValue(), this.getMeasureQualifiedNumberValue(), null, "measureQualifiedNumberValue", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getField_MeasureRangeValue(), this.getMeasureRangeValue(), null, "measureRangeValue", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getField_MeasureSingleNumberValue(), this.getMeasureSingleNumberValue(), null, "measureSingleNumberValue", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getField_NullValue(), this.getNullValue(), null, "nullValue", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getField_RationalValue(), this.getRationalValue(), null, "rationalValue", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getField_RealValue(), this.getRealValue(), null, "realValue", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getField_SequenceValue(), this.getSequenceValue(), null, "sequenceValue", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getField_SetValue(), this.getSetValue(), null, "setValue", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getField_TimeValue(), this.getTimeValue(), null, "timeValue", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getField_YearMonthValue(), this.getYearMonthValue(), null, "yearMonthValue", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getField_YearValue(), this.getYearValue(), null, "yearValue", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileValueEClass, FileValue.class, "FileValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFileValue_URI(), ecorePackage.getEString(), "uRI", null, 1, 1, FileValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerValueEClass, IntegerValue.class, "IntegerValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerValue_Value(), ecorePackage.getEInt(), "value", null, 0, 1, IntegerValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemReferenceValueEClass, ItemReferenceValue.class, "ItemReferenceValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getItemReferenceValue_ItemLocalRef(), theIsostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.getItem(), null, "itemLocalRef", null, 1, 1, ItemReferenceValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localizedTextValueEClass, LocalizedTextValue.class, "LocalizedTextValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocalizedTextValue_Content(), theIsostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage.getInternationalText(), null, "content", null, 1, 1, LocalizedTextValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measureQualifiedNumberValueEClass, MeasureQualifiedNumberValue.class, "MeasureQualifiedNumberValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasureQualifiedNumberValue_QualifiedValues(), this.getQualifiedValue(), null, "qualifiedValues", null, 1, -1, MeasureQualifiedNumberValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measureRangeValueEClass, MeasureRangeValue.class, "MeasureRangeValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasureRangeValue_LowerValue(), this.getNumericValue(), null, "lowerValue", null, 1, 1, MeasureRangeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasureRangeValue_UpperValue(), this.getNumericValue(), null, "upperValue", null, 1, 1, MeasureRangeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measureSingleNumberValueEClass, MeasureSingleNumberValue.class, "MeasureSingleNumberValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasureSingleNumberValue_RealValue(), this.getRealValue(), null, "realValue", null, 0, 1, MeasureSingleNumberValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasureSingleNumberValue_ComplexValue(), this.getComplexValue(), null, "complexValue", null, 0, 1, MeasureSingleNumberValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasureSingleNumberValue_IntegerValue(), this.getIntegerValue(), null, "integerValue", null, 0, 1, MeasureSingleNumberValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasureSingleNumberValue_RationalValue(), this.getRationalValue(), null, "rationalValue", null, 0, 1, MeasureSingleNumberValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measureValueEClass, MeasureValue.class, "MeasureValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMeasureValue_UOMCode(), ecorePackage.getEString(), "uOMCode", null, 0, 1, MeasureValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasureValue_UOMRef(), ecorePackage.getEString(), "uOMRef", null, 0, 1, MeasureValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nullValueEClass, NullValue.class, "NullValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(numericValueEClass, NumericValue.class, "NumericValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNumericValue_RealValue(), this.getRealValue(), null, "realValue", null, 0, 1, NumericValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNumericValue_ComplexValue(), this.getComplexValue(), null, "complexValue", null, 0, 1, NumericValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNumericValue_IntegerValue(), this.getIntegerValue(), null, "integerValue", null, 0, 1, NumericValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNumericValue_RationalValue(), this.getRationalValue(), null, "rationalValue", null, 0, 1, NumericValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oneOfEClass, OneOf.class, "OneOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOneOf_Combinations(), this.getCombination(), null, "combinations", null, 0, -1, OneOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOneOf_StringValues(), this.getStringValue(), null, "stringValues", null, 0, -1, OneOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOneOf_BagValues(), this.getBagValue(), null, "bagValues", null, 0, -1, OneOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOneOf_BooleanValues(), this.getBooleanValue(), null, "booleanValues", null, 0, -1, OneOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOneOf_ComplexValues(), this.getComplexValue(), null, "complexValues", null, 0, -1, OneOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOneOf_CompositeValues(), this.getCompositeValue(), null, "compositeValues", null, 0, -1, OneOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOneOf_ControlledValues(), this.getControlledValue(), null, "controlledValues", null, 0, -1, OneOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOneOf_CurrencyValues(), this.getCurrencyValue(), null, "currencyValues", null, 0, -1, OneOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOneOf_DateValues(), this.getDateValue(), null, "dateValues", null, 0, -1, OneOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOneOf_DateTimeValues(), this.getDateTimeValue(), null, "dateTimeValues", null, 0, -1, OneOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOneOf_FileValues(), this.getFileValue(), null, "fileValues", null, 0, -1, OneOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOneOf_IntegerValues(), this.getIntegerValue(), null, "integerValues", null, 0, -1, OneOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOneOf_ItemReferenceValues(), this.getItemReferenceValue(), null, "itemReferenceValues", null, 0, -1, OneOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOneOf_LocalizedTextValues(), this.getLocalizedTextValue(), null, "localizedTextValues", null, 0, -1, OneOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOneOf_MeasureQualifiedNumberValues(), this.getMeasureQualifiedNumberValue(), null, "measureQualifiedNumberValues", null, 0, -1, OneOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOneOf_MeasureRangeValues(), this.getMeasureRangeValue(), null, "measureRangeValues", null, 0, -1, OneOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOneOf_MeasureSingleNumberValues(), this.getMeasureSingleNumberValue(), null, "measureSingleNumberValues", null, 0, -1, OneOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOneOf_NullValues(), this.getNullValue(), null, "nullValues", null, 0, -1, OneOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOneOf_RationalValues(), this.getRationalValue(), null, "rationalValues", null, 0, -1, OneOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOneOf_RealValues(), this.getRealValue(), null, "realValues", null, 0, -1, OneOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOneOf_SequenceValues(), this.getSequenceValue(), null, "sequenceValues", null, 0, -1, OneOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOneOf_SetValues(), this.getSetValue(), null, "setValues", null, 0, -1, OneOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOneOf_TimeValues(), this.getTimeValue(), null, "timeValues", null, 0, -1, OneOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOneOf_YearMonthValues(), this.getYearMonthValue(), null, "yearMonthValues", null, 0, -1, OneOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOneOf_YearValues(), this.getYearValue(), null, "yearValues", null, 0, -1, OneOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qualifiedValueEClass, QualifiedValue.class, "QualifiedValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQualifiedValue_QualifierCode(), ecorePackage.getEString(), "qualifierCode", null, 0, 1, QualifiedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQualifiedValue_QualifierRef(), ecorePackage.getEString(), "qualifierRef", null, 0, 1, QualifiedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQualifiedValue_RealValue(), this.getRealValue(), null, "realValue", null, 0, 1, QualifiedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQualifiedValue_ComplexValue(), this.getComplexValue(), null, "complexValue", null, 0, 1, QualifiedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQualifiedValue_IntegerValue(), this.getIntegerValue(), null, "integerValue", null, 0, 1, QualifiedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQualifiedValue_RationalValue(), this.getRationalValue(), null, "rationalValue", null, 0, 1, QualifiedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rationalValueEClass, RationalValue.class, "RationalValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRationalValue_WholePart(), ecorePackage.getEInt(), "wholePart", null, 0, 1, RationalValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRationalValue_Numerator(), ecorePackage.getEInt(), "numerator", null, 1, 1, RationalValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRationalValue_Denominator(), ecorePackage.getEInt(), "denominator", null, 1, 1, RationalValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(realValueEClass, RealValue.class, "RealValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sequenceValueEClass, SequenceValue.class, "SequenceValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSequenceValue_StringValues(), this.getStringValue(), null, "stringValues", null, 0, -1, SequenceValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceValue_BagValues(), this.getBagValue(), null, "bagValues", null, 0, -1, SequenceValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceValue_BooleanValues(), this.getBooleanValue(), null, "booleanValues", null, 0, -1, SequenceValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceValue_ComplexValues(), this.getComplexValue(), null, "complexValues", null, 0, -1, SequenceValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceValue_CompositeValues(), this.getCompositeValue(), null, "compositeValues", null, 0, -1, SequenceValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceValue_ControlledValues(), this.getControlledValue(), null, "controlledValues", null, 0, -1, SequenceValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceValue_CurrencyValues(), this.getCurrencyValue(), null, "currencyValues", null, 0, -1, SequenceValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceValue_DateValues(), this.getDateValue(), null, "dateValues", null, 0, -1, SequenceValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceValue_DateTimeValues(), this.getDateTimeValue(), null, "dateTimeValues", null, 0, -1, SequenceValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceValue_FileValues(), this.getFileValue(), null, "fileValues", null, 0, -1, SequenceValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceValue_IntegerValues(), this.getIntegerValue(), null, "integerValues", null, 0, -1, SequenceValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceValue_ItemReferenceValues(), this.getItemReferenceValue(), null, "itemReferenceValues", null, 0, -1, SequenceValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceValue_LocalizedTextValues(), this.getLocalizedTextValue(), null, "localizedTextValues", null, 0, -1, SequenceValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceValue_MeasureQualifiedNumberValues(), this.getMeasureQualifiedNumberValue(), null, "measureQualifiedNumberValues", null, 0, -1, SequenceValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceValue_MeasureRangeValues(), this.getMeasureRangeValue(), null, "measureRangeValues", null, 0, -1, SequenceValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceValue_MeasureSingleNumberValues(), this.getMeasureSingleNumberValue(), null, "measureSingleNumberValues", null, 0, -1, SequenceValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceValue_NullValues(), this.getNullValue(), null, "nullValues", null, 0, -1, SequenceValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceValue_RationalValues(), this.getRationalValue(), null, "rationalValues", null, 0, -1, SequenceValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceValue_RealValues(), this.getRealValue(), null, "realValues", null, 0, -1, SequenceValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceValue_SequenceValues(), this.getSequenceValue(), null, "sequenceValues", null, 0, -1, SequenceValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceValue_SetValues(), this.getSetValue(), null, "setValues", null, 0, -1, SequenceValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceValue_TimeValues(), this.getTimeValue(), null, "timeValues", null, 0, -1, SequenceValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceValue_YearMonthValues(), this.getYearMonthValue(), null, "yearMonthValues", null, 0, -1, SequenceValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceValue_YearValues(), this.getYearValue(), null, "yearValues", null, 0, -1, SequenceValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setValueEClass, SetValue.class, "SetValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSetValue_StringValues(), this.getStringValue(), null, "stringValues", null, 0, -1, SetValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetValue_BagValues(), this.getBagValue(), null, "bagValues", null, 0, -1, SetValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetValue_BooleanValues(), this.getBooleanValue(), null, "booleanValues", null, 0, -1, SetValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetValue_ComplexValues(), this.getComplexValue(), null, "complexValues", null, 0, -1, SetValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetValue_CompositeValues(), this.getCompositeValue(), null, "compositeValues", null, 0, -1, SetValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetValue_ControlledValues(), this.getControlledValue(), null, "controlledValues", null, 0, -1, SetValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetValue_CurrencyValues(), this.getCurrencyValue(), null, "currencyValues", null, 0, -1, SetValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetValue_DateValues(), this.getDateValue(), null, "dateValues", null, 0, -1, SetValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetValue_DateTimeValues(), this.getDateTimeValue(), null, "dateTimeValues", null, 0, -1, SetValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetValue_FileValues(), this.getFileValue(), null, "fileValues", null, 0, -1, SetValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetValue_IntegerValues(), this.getIntegerValue(), null, "integerValues", null, 0, -1, SetValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetValue_ItemReferenceValues(), this.getItemReferenceValue(), null, "itemReferenceValues", null, 0, -1, SetValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetValue_LocalizedTextValues(), this.getLocalizedTextValue(), null, "localizedTextValues", null, 0, -1, SetValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetValue_MeasureQualifiedNumberValues(), this.getMeasureQualifiedNumberValue(), null, "measureQualifiedNumberValues", null, 0, -1, SetValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetValue_MeasureRangeValues(), this.getMeasureRangeValue(), null, "measureRangeValues", null, 0, -1, SetValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetValue_MeasureSingleNumberValues(), this.getMeasureSingleNumberValue(), null, "measureSingleNumberValues", null, 0, -1, SetValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetValue_NullValues(), this.getNullValue(), null, "nullValues", null, 0, -1, SetValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetValue_RationalValues(), this.getRationalValue(), null, "rationalValues", null, 0, -1, SetValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetValue_RealValues(), this.getRealValue(), null, "realValues", null, 0, -1, SetValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetValue_SequenceValues(), this.getSequenceValue(), null, "sequenceValues", null, 0, -1, SetValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetValue_SetValues(), this.getSetValue(), null, "setValues", null, 0, -1, SetValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetValue_TimeValues(), this.getTimeValue(), null, "timeValues", null, 0, -1, SetValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetValue_YearMonthValues(), this.getYearMonthValue(), null, "yearMonthValues", null, 0, -1, SetValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetValue_YearValues(), this.getYearValue(), null, "yearValues", null, 0, -1, SetValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringValueEClass, StringValue.class, "StringValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeValueEClass, TimeValue.class, "TimeValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, TimeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yearMonthValueEClass, YearMonthValue.class, "YearMonthValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYearMonthValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, YearMonthValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yearValueEClass, YearValue.class, "YearValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYearValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, YearValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
		// http://big.tuwien.ac.at/standardXMLDatatype
		createStandardXMLDatatypeAnnotations();
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
		  (conditionElementEClass, 
		   source, 
		   new String[] {
			 "constraints", "patternPropertyRef"
		   });	
		addAnnotation
		  (controlledValueEClass, 
		   source, 
		   new String[] {
			 "constraints", "patternValueRef"
		   });	
		addAnnotation
		  (currencyValueEClass, 
		   source, 
		   new String[] {
			 "constraints", "patternCurrencyRef"
		   });	
		addAnnotation
		  (fieldEClass, 
		   source, 
		   new String[] {
			 "constraints", "patternPropertyRef"
		   });	
		addAnnotation
		  (measureValueEClass, 
		   source, 
		   new String[] {
			 "constraints", "patternUOMRef"
		   });	
		addAnnotation
		  (qualifiedValueEClass, 
		   source, 
		   new String[] {
			 "constraints", "patternQualifierRef"
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
		  (conditionElementEClass, 
		   source, 
		   new String[] {
			 "patternPropertyRef", "self.propertyRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.propertyRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.propertyRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\')"
		   });	
		addAnnotation
		  (controlledValueEClass, 
		   source, 
		   new String[] {
			 "patternValueRef", "(self.valueRef=null) or self.valueRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.valueRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.valueRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\')"
		   });	
		addAnnotation
		  (currencyValueEClass, 
		   source, 
		   new String[] {
			 "patternCurrencyRef", "(self.currencyRef=null) or self.currencyRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.currencyRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.currencyRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\')"
		   });	
		addAnnotation
		  (fieldEClass, 
		   source, 
		   new String[] {
			 "patternPropertyRef", "(self.propertyRef=null) or self.propertyRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.propertyRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.propertyRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\')"
		   });	
		addAnnotation
		  (measureValueEClass, 
		   source, 
		   new String[] {
			 "patternUOMRef", "(self.uOMRef=null) or self.uOMRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.uOMRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.uOMRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\')"
		   });	
		addAnnotation
		  (qualifiedValueEClass, 
		   source, 
		   new String[] {
			 "patternQualifierRef", "(self.qualifierRef=null) or self.qualifierRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.qualifierRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.qualifierRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\')"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://big.tuwien.ac.at/standardXMLDatatype</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createStandardXMLDatatypeAnnotations() {
		String source = "http://big.tuwien.ac.at/standardXMLDatatype";	
		addAnnotation
		  (getFileValue_URI(), 
		   source, 
		   new String[] {
			 "type", "URI"
		   });
	}

} //Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl
