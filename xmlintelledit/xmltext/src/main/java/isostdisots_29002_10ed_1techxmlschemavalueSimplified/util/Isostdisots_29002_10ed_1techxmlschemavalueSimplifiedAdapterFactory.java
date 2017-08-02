/**
 */
package isostdisots_29002_10ed_1techxmlschemavalueSimplified.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage
 * @generated
 */
public class Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedSwitch<Adapter> modelSwitch =
		new Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedSwitch<Adapter>() {
			@Override
			public Adapter caseBagValue(BagValue object) {
				return createBagValueAdapter();
			}
			@Override
			public Adapter caseBooleanValue(BooleanValue object) {
				return createBooleanValueAdapter();
			}
			@Override
			public Adapter caseCombination(Combination object) {
				return createCombinationAdapter();
			}
			@Override
			public Adapter caseComplexValue(ComplexValue object) {
				return createComplexValueAdapter();
			}
			@Override
			public Adapter caseCompositeValue(CompositeValue object) {
				return createCompositeValueAdapter();
			}
			@Override
			public Adapter caseConditionElement(ConditionElement object) {
				return createConditionElementAdapter();
			}
			@Override
			public Adapter caseControlledValue(ControlledValue object) {
				return createControlledValueAdapter();
			}
			@Override
			public Adapter caseCurrencyValue(CurrencyValue object) {
				return createCurrencyValueAdapter();
			}
			@Override
			public Adapter caseDateTimeValue(DateTimeValue object) {
				return createDateTimeValueAdapter();
			}
			@Override
			public Adapter caseDateValue(DateValue object) {
				return createDateValueAdapter();
			}
			@Override
			public Adapter caseEnvironment(Environment object) {
				return createEnvironmentAdapter();
			}
			@Override
			public Adapter caseField(Field object) {
				return createFieldAdapter();
			}
			@Override
			public Adapter caseFileValue(FileValue object) {
				return createFileValueAdapter();
			}
			@Override
			public Adapter caseIntegerValue(IntegerValue object) {
				return createIntegerValueAdapter();
			}
			@Override
			public Adapter caseItemReferenceValue(ItemReferenceValue object) {
				return createItemReferenceValueAdapter();
			}
			@Override
			public Adapter caseLocalizedTextValue(LocalizedTextValue object) {
				return createLocalizedTextValueAdapter();
			}
			@Override
			public Adapter caseMeasureQualifiedNumberValue(MeasureQualifiedNumberValue object) {
				return createMeasureQualifiedNumberValueAdapter();
			}
			@Override
			public Adapter caseMeasureRangeValue(MeasureRangeValue object) {
				return createMeasureRangeValueAdapter();
			}
			@Override
			public Adapter caseMeasureSingleNumberValue(MeasureSingleNumberValue object) {
				return createMeasureSingleNumberValueAdapter();
			}
			@Override
			public Adapter caseMeasureValue(MeasureValue object) {
				return createMeasureValueAdapter();
			}
			@Override
			public Adapter caseNullValue(NullValue object) {
				return createNullValueAdapter();
			}
			@Override
			public Adapter caseNumericValue(NumericValue object) {
				return createNumericValueAdapter();
			}
			@Override
			public Adapter caseOneOf(OneOf object) {
				return createOneOfAdapter();
			}
			@Override
			public Adapter caseQualifiedValue(QualifiedValue object) {
				return createQualifiedValueAdapter();
			}
			@Override
			public Adapter caseRationalValue(RationalValue object) {
				return createRationalValueAdapter();
			}
			@Override
			public Adapter caseRealValue(RealValue object) {
				return createRealValueAdapter();
			}
			@Override
			public Adapter caseSequenceValue(SequenceValue object) {
				return createSequenceValueAdapter();
			}
			@Override
			public Adapter caseSetValue(SetValue object) {
				return createSetValueAdapter();
			}
			@Override
			public Adapter caseStringValue(StringValue object) {
				return createStringValueAdapter();
			}
			@Override
			public Adapter caseTimeValue(TimeValue object) {
				return createTimeValueAdapter();
			}
			@Override
			public Adapter caseYearMonthValue(YearMonthValue object) {
				return createYearMonthValueAdapter();
			}
			@Override
			public Adapter caseYearValue(YearValue object) {
				return createYearValueAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.BagValue <em>Bag Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.BagValue
	 * @generated
	 */
	public Adapter createBagValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.BooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.BooleanValue
	 * @generated
	 */
	public Adapter createBooleanValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.Combination <em>Combination</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Combination
	 * @generated
	 */
	public Adapter createCombinationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ComplexValue <em>Complex Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.ComplexValue
	 * @generated
	 */
	public Adapter createComplexValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.CompositeValue <em>Composite Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.CompositeValue
	 * @generated
	 */
	public Adapter createCompositeValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement <em>Condition Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement
	 * @generated
	 */
	public Adapter createConditionElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ControlledValue <em>Controlled Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.ControlledValue
	 * @generated
	 */
	public Adapter createControlledValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.CurrencyValue <em>Currency Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.CurrencyValue
	 * @generated
	 */
	public Adapter createCurrencyValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.DateTimeValue <em>Date Time Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.DateTimeValue
	 * @generated
	 */
	public Adapter createDateTimeValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.DateValue <em>Date Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.DateValue
	 * @generated
	 */
	public Adapter createDateValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.Environment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Environment
	 * @generated
	 */
	public Adapter createEnvironmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Field
	 * @generated
	 */
	public Adapter createFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.FileValue <em>File Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.FileValue
	 * @generated
	 */
	public Adapter createFileValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.IntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.IntegerValue
	 * @generated
	 */
	public Adapter createIntegerValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ItemReferenceValue <em>Item Reference Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.ItemReferenceValue
	 * @generated
	 */
	public Adapter createItemReferenceValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.LocalizedTextValue <em>Localized Text Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.LocalizedTextValue
	 * @generated
	 */
	public Adapter createLocalizedTextValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.MeasureQualifiedNumberValue <em>Measure Qualified Number Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.MeasureQualifiedNumberValue
	 * @generated
	 */
	public Adapter createMeasureQualifiedNumberValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.MeasureRangeValue <em>Measure Range Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.MeasureRangeValue
	 * @generated
	 */
	public Adapter createMeasureRangeValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.MeasureSingleNumberValue <em>Measure Single Number Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.MeasureSingleNumberValue
	 * @generated
	 */
	public Adapter createMeasureSingleNumberValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.MeasureValue <em>Measure Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.MeasureValue
	 * @generated
	 */
	public Adapter createMeasureValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.NullValue <em>Null Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.NullValue
	 * @generated
	 */
	public Adapter createNullValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.NumericValue <em>Numeric Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.NumericValue
	 * @generated
	 */
	public Adapter createNumericValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.OneOf <em>One Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.OneOf
	 * @generated
	 */
	public Adapter createOneOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.QualifiedValue <em>Qualified Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.QualifiedValue
	 * @generated
	 */
	public Adapter createQualifiedValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.RationalValue <em>Rational Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.RationalValue
	 * @generated
	 */
	public Adapter createRationalValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.RealValue <em>Real Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.RealValue
	 * @generated
	 */
	public Adapter createRealValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.SequenceValue <em>Sequence Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.SequenceValue
	 * @generated
	 */
	public Adapter createSequenceValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.SetValue <em>Set Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.SetValue
	 * @generated
	 */
	public Adapter createSetValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.StringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.StringValue
	 * @generated
	 */
	public Adapter createStringValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.TimeValue <em>Time Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.TimeValue
	 * @generated
	 */
	public Adapter createTimeValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.YearMonthValue <em>Year Month Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.YearMonthValue
	 * @generated
	 */
	public Adapter createYearMonthValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.YearValue <em>Year Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.YearValue
	 * @generated
	 */
	public Adapter createYearValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedAdapterFactory
