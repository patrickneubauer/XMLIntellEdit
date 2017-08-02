/**
 */
package isostdisots_29002_10ed_1techxmlschemavalueSimplified.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage
 * @generated
 */
public class Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedSwitch() {
		if (modelPackage == null) {
			modelPackage = Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.BAG_VALUE: {
				BagValue bagValue = (BagValue)theEObject;
				T result = caseBagValue(bagValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.BOOLEAN_VALUE: {
				BooleanValue booleanValue = (BooleanValue)theEObject;
				T result = caseBooleanValue(booleanValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION: {
				Combination combination = (Combination)theEObject;
				T result = caseCombination(combination);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMPLEX_VALUE: {
				ComplexValue complexValue = (ComplexValue)theEObject;
				T result = caseComplexValue(complexValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMPOSITE_VALUE: {
				CompositeValue compositeValue = (CompositeValue)theEObject;
				T result = caseCompositeValue(compositeValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.CONDITION_ELEMENT: {
				ConditionElement conditionElement = (ConditionElement)theEObject;
				T result = caseConditionElement(conditionElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.CONTROLLED_VALUE: {
				ControlledValue controlledValue = (ControlledValue)theEObject;
				T result = caseControlledValue(controlledValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.CURRENCY_VALUE: {
				CurrencyValue currencyValue = (CurrencyValue)theEObject;
				T result = caseCurrencyValue(currencyValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.DATE_TIME_VALUE: {
				DateTimeValue dateTimeValue = (DateTimeValue)theEObject;
				T result = caseDateTimeValue(dateTimeValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.DATE_VALUE: {
				DateValue dateValue = (DateValue)theEObject;
				T result = caseDateValue(dateValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.ENVIRONMENT: {
				Environment environment = (Environment)theEObject;
				T result = caseEnvironment(environment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD: {
				Field field = (Field)theEObject;
				T result = caseField(field);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FILE_VALUE: {
				FileValue fileValue = (FileValue)theEObject;
				T result = caseFileValue(fileValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.INTEGER_VALUE: {
				IntegerValue integerValue = (IntegerValue)theEObject;
				T result = caseIntegerValue(integerValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.ITEM_REFERENCE_VALUE: {
				ItemReferenceValue itemReferenceValue = (ItemReferenceValue)theEObject;
				T result = caseItemReferenceValue(itemReferenceValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.LOCALIZED_TEXT_VALUE: {
				LocalizedTextValue localizedTextValue = (LocalizedTextValue)theEObject;
				T result = caseLocalizedTextValue(localizedTextValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.MEASURE_QUALIFIED_NUMBER_VALUE: {
				MeasureQualifiedNumberValue measureQualifiedNumberValue = (MeasureQualifiedNumberValue)theEObject;
				T result = caseMeasureQualifiedNumberValue(measureQualifiedNumberValue);
				if (result == null) result = caseMeasureValue(measureQualifiedNumberValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.MEASURE_RANGE_VALUE: {
				MeasureRangeValue measureRangeValue = (MeasureRangeValue)theEObject;
				T result = caseMeasureRangeValue(measureRangeValue);
				if (result == null) result = caseMeasureValue(measureRangeValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.MEASURE_SINGLE_NUMBER_VALUE: {
				MeasureSingleNumberValue measureSingleNumberValue = (MeasureSingleNumberValue)theEObject;
				T result = caseMeasureSingleNumberValue(measureSingleNumberValue);
				if (result == null) result = caseMeasureValue(measureSingleNumberValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.MEASURE_VALUE: {
				MeasureValue measureValue = (MeasureValue)theEObject;
				T result = caseMeasureValue(measureValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.NULL_VALUE: {
				NullValue nullValue = (NullValue)theEObject;
				T result = caseNullValue(nullValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.NUMERIC_VALUE: {
				NumericValue numericValue = (NumericValue)theEObject;
				T result = caseNumericValue(numericValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.ONE_OF: {
				OneOf oneOf = (OneOf)theEObject;
				T result = caseOneOf(oneOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.QUALIFIED_VALUE: {
				QualifiedValue qualifiedValue = (QualifiedValue)theEObject;
				T result = caseQualifiedValue(qualifiedValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.RATIONAL_VALUE: {
				RationalValue rationalValue = (RationalValue)theEObject;
				T result = caseRationalValue(rationalValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.REAL_VALUE: {
				RealValue realValue = (RealValue)theEObject;
				T result = caseRealValue(realValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.SEQUENCE_VALUE: {
				SequenceValue sequenceValue = (SequenceValue)theEObject;
				T result = caseSequenceValue(sequenceValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.SET_VALUE: {
				SetValue setValue = (SetValue)theEObject;
				T result = caseSetValue(setValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.STRING_VALUE: {
				StringValue stringValue = (StringValue)theEObject;
				T result = caseStringValue(stringValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.TIME_VALUE: {
				TimeValue timeValue = (TimeValue)theEObject;
				T result = caseTimeValue(timeValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.YEAR_MONTH_VALUE: {
				YearMonthValue yearMonthValue = (YearMonthValue)theEObject;
				T result = caseYearMonthValue(yearMonthValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.YEAR_VALUE: {
				YearValue yearValue = (YearValue)theEObject;
				T result = caseYearValue(yearValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bag Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bag Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBagValue(BagValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanValue(BooleanValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Combination</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Combination</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCombination(Combination object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplexValue(ComplexValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeValue(CompositeValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionElement(ConditionElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Controlled Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controlled Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlledValue(ControlledValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Currency Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Currency Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurrencyValue(CurrencyValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Time Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Time Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateTimeValue(DateTimeValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateValue(DateValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Environment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Environment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvironment(Environment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseField(Field object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileValue(FileValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerValue(IntegerValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Reference Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Reference Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemReferenceValue(ItemReferenceValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Localized Text Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Localized Text Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalizedTextValue(LocalizedTextValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Qualified Number Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Qualified Number Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureQualifiedNumberValue(MeasureQualifiedNumberValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Range Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Range Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureRangeValue(MeasureRangeValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Single Number Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Single Number Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureSingleNumberValue(MeasureSingleNumberValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureValue(MeasureValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Null Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Null Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNullValue(NullValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumericValue(NumericValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>One Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>One Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOneOf(OneOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qualified Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qualified Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualifiedValue(QualifiedValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rational Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rational Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRationalValue(RationalValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealValue(RealValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceValue(SequenceValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetValue(SetValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringValue(StringValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeValue(TimeValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Year Month Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Year Month Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYearMonthValue(YearMonthValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Year Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Year Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYearValue(YearValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedSwitch
