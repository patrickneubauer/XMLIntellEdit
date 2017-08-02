/**
 */
package isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedFactoryImpl extends EFactoryImpl implements Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedFactory init() {
		try {
			Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedFactory theIsostdisots_29002_10ed_1techxmlschemavalueSimplifiedFactory = (Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedFactory)EPackage.Registry.INSTANCE.getEFactory(Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.eNS_URI);
			if (theIsostdisots_29002_10ed_1techxmlschemavalueSimplifiedFactory != null) {
				return theIsostdisots_29002_10ed_1techxmlschemavalueSimplifiedFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedFactoryImpl() {
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
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.BAG_VALUE: return createBagValue();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.BOOLEAN_VALUE: return createBooleanValue();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION: return createCombination();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMPLEX_VALUE: return createComplexValue();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMPOSITE_VALUE: return createCompositeValue();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.CONDITION_ELEMENT: return createConditionElement();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.CONTROLLED_VALUE: return createControlledValue();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.CURRENCY_VALUE: return createCurrencyValue();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.DATE_TIME_VALUE: return createDateTimeValue();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.DATE_VALUE: return createDateValue();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.ENVIRONMENT: return createEnvironment();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD: return createField();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FILE_VALUE: return createFileValue();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.INTEGER_VALUE: return createIntegerValue();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.ITEM_REFERENCE_VALUE: return createItemReferenceValue();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.LOCALIZED_TEXT_VALUE: return createLocalizedTextValue();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.MEASURE_QUALIFIED_NUMBER_VALUE: return createMeasureQualifiedNumberValue();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.MEASURE_RANGE_VALUE: return createMeasureRangeValue();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.MEASURE_SINGLE_NUMBER_VALUE: return createMeasureSingleNumberValue();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.MEASURE_VALUE: return createMeasureValue();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.NULL_VALUE: return createNullValue();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.NUMERIC_VALUE: return createNumericValue();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.ONE_OF: return createOneOf();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.QUALIFIED_VALUE: return createQualifiedValue();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.RATIONAL_VALUE: return createRationalValue();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.REAL_VALUE: return createRealValue();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.SEQUENCE_VALUE: return createSequenceValue();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.SET_VALUE: return createSetValue();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.STRING_VALUE: return createStringValue();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.TIME_VALUE: return createTimeValue();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.YEAR_MONTH_VALUE: return createYearMonthValue();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.YEAR_VALUE: return createYearValue();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BagValue createBagValue() {
		BagValueImpl bagValue = new BagValueImpl();
		return bagValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanValue createBooleanValue() {
		BooleanValueImpl booleanValue = new BooleanValueImpl();
		return booleanValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Combination createCombination() {
		CombinationImpl combination = new CombinationImpl();
		return combination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexValue createComplexValue() {
		ComplexValueImpl complexValue = new ComplexValueImpl();
		return complexValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeValue createCompositeValue() {
		CompositeValueImpl compositeValue = new CompositeValueImpl();
		return compositeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionElement createConditionElement() {
		ConditionElementImpl conditionElement = new ConditionElementImpl();
		return conditionElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlledValue createControlledValue() {
		ControlledValueImpl controlledValue = new ControlledValueImpl();
		return controlledValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrencyValue createCurrencyValue() {
		CurrencyValueImpl currencyValue = new CurrencyValueImpl();
		return currencyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeValue createDateTimeValue() {
		DateTimeValueImpl dateTimeValue = new DateTimeValueImpl();
		return dateTimeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateValue createDateValue() {
		DateValueImpl dateValue = new DateValueImpl();
		return dateValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Environment createEnvironment() {
		EnvironmentImpl environment = new EnvironmentImpl();
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field createField() {
		FieldImpl field = new FieldImpl();
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileValue createFileValue() {
		FileValueImpl fileValue = new FileValueImpl();
		return fileValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerValue createIntegerValue() {
		IntegerValueImpl integerValue = new IntegerValueImpl();
		return integerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemReferenceValue createItemReferenceValue() {
		ItemReferenceValueImpl itemReferenceValue = new ItemReferenceValueImpl();
		return itemReferenceValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalizedTextValue createLocalizedTextValue() {
		LocalizedTextValueImpl localizedTextValue = new LocalizedTextValueImpl();
		return localizedTextValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureQualifiedNumberValue createMeasureQualifiedNumberValue() {
		MeasureQualifiedNumberValueImpl measureQualifiedNumberValue = new MeasureQualifiedNumberValueImpl();
		return measureQualifiedNumberValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureRangeValue createMeasureRangeValue() {
		MeasureRangeValueImpl measureRangeValue = new MeasureRangeValueImpl();
		return measureRangeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureSingleNumberValue createMeasureSingleNumberValue() {
		MeasureSingleNumberValueImpl measureSingleNumberValue = new MeasureSingleNumberValueImpl();
		return measureSingleNumberValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureValue createMeasureValue() {
		MeasureValueImpl measureValue = new MeasureValueImpl();
		return measureValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullValue createNullValue() {
		NullValueImpl nullValue = new NullValueImpl();
		return nullValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericValue createNumericValue() {
		NumericValueImpl numericValue = new NumericValueImpl();
		return numericValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OneOf createOneOf() {
		OneOfImpl oneOf = new OneOfImpl();
		return oneOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifiedValue createQualifiedValue() {
		QualifiedValueImpl qualifiedValue = new QualifiedValueImpl();
		return qualifiedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RationalValue createRationalValue() {
		RationalValueImpl rationalValue = new RationalValueImpl();
		return rationalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealValue createRealValue() {
		RealValueImpl realValue = new RealValueImpl();
		return realValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceValue createSequenceValue() {
		SequenceValueImpl sequenceValue = new SequenceValueImpl();
		return sequenceValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetValue createSetValue() {
		SetValueImpl setValue = new SetValueImpl();
		return setValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringValue createStringValue() {
		StringValueImpl stringValue = new StringValueImpl();
		return stringValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeValue createTimeValue() {
		TimeValueImpl timeValue = new TimeValueImpl();
		return timeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YearMonthValue createYearMonthValue() {
		YearMonthValueImpl yearMonthValue = new YearMonthValueImpl();
		return yearMonthValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YearValue createYearValue() {
		YearValueImpl yearValue = new YearValueImpl();
		return yearValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage getIsostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage() {
		return (Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage getPackage() {
		return Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.eINSTANCE;
	}

} //Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedFactoryImpl
