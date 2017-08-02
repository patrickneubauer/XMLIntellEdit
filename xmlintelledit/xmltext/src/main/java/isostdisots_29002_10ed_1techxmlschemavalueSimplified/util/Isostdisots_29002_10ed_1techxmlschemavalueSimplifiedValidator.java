/**
 */
package isostdisots_29002_10ed_1techxmlschemavalueSimplified.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

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
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage
 * @generated
 */
public class Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedValidator INSTANCE = new Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "isostdisots_29002_10ed_1techxmlschemavalueSimplified";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.BAG_VALUE:
				return validateBagValue((BagValue)value, diagnostics, context);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.BOOLEAN_VALUE:
				return validateBooleanValue((BooleanValue)value, diagnostics, context);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION:
				return validateCombination((Combination)value, diagnostics, context);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMPLEX_VALUE:
				return validateComplexValue((ComplexValue)value, diagnostics, context);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMPOSITE_VALUE:
				return validateCompositeValue((CompositeValue)value, diagnostics, context);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.CONDITION_ELEMENT:
				return validateConditionElement((ConditionElement)value, diagnostics, context);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.CONTROLLED_VALUE:
				return validateControlledValue((ControlledValue)value, diagnostics, context);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.CURRENCY_VALUE:
				return validateCurrencyValue((CurrencyValue)value, diagnostics, context);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.DATE_TIME_VALUE:
				return validateDateTimeValue((DateTimeValue)value, diagnostics, context);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.DATE_VALUE:
				return validateDateValue((DateValue)value, diagnostics, context);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.ENVIRONMENT:
				return validateEnvironment((Environment)value, diagnostics, context);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD:
				return validateField((Field)value, diagnostics, context);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FILE_VALUE:
				return validateFileValue((FileValue)value, diagnostics, context);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.INTEGER_VALUE:
				return validateIntegerValue((IntegerValue)value, diagnostics, context);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.ITEM_REFERENCE_VALUE:
				return validateItemReferenceValue((ItemReferenceValue)value, diagnostics, context);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.LOCALIZED_TEXT_VALUE:
				return validateLocalizedTextValue((LocalizedTextValue)value, diagnostics, context);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.MEASURE_QUALIFIED_NUMBER_VALUE:
				return validateMeasureQualifiedNumberValue((MeasureQualifiedNumberValue)value, diagnostics, context);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.MEASURE_RANGE_VALUE:
				return validateMeasureRangeValue((MeasureRangeValue)value, diagnostics, context);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.MEASURE_SINGLE_NUMBER_VALUE:
				return validateMeasureSingleNumberValue((MeasureSingleNumberValue)value, diagnostics, context);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.MEASURE_VALUE:
				return validateMeasureValue((MeasureValue)value, diagnostics, context);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.NULL_VALUE:
				return validateNullValue((NullValue)value, diagnostics, context);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.NUMERIC_VALUE:
				return validateNumericValue((NumericValue)value, diagnostics, context);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.ONE_OF:
				return validateOneOf((OneOf)value, diagnostics, context);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.QUALIFIED_VALUE:
				return validateQualifiedValue((QualifiedValue)value, diagnostics, context);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.RATIONAL_VALUE:
				return validateRationalValue((RationalValue)value, diagnostics, context);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.REAL_VALUE:
				return validateRealValue((RealValue)value, diagnostics, context);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.SEQUENCE_VALUE:
				return validateSequenceValue((SequenceValue)value, diagnostics, context);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.SET_VALUE:
				return validateSetValue((SetValue)value, diagnostics, context);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.STRING_VALUE:
				return validateStringValue((StringValue)value, diagnostics, context);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.TIME_VALUE:
				return validateTimeValue((TimeValue)value, diagnostics, context);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.YEAR_MONTH_VALUE:
				return validateYearMonthValue((YearMonthValue)value, diagnostics, context);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.YEAR_VALUE:
				return validateYearValue((YearValue)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBagValue(BagValue bagValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bagValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanValue(BooleanValue booleanValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(booleanValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCombination(Combination combination, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(combination, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexValue(ComplexValue complexValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(complexValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeValue(CompositeValue compositeValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compositeValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionElement(ConditionElement conditionElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(conditionElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(conditionElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(conditionElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(conditionElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(conditionElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(conditionElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(conditionElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(conditionElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(conditionElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateConditionElement_patternPropertyRef(conditionElement, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the patternPropertyRef constraint of '<em>Condition Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONDITION_ELEMENT__PATTERN_PROPERTY_REF__EEXPRESSION = "self.propertyRef.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.propertyRef.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.propertyRef.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?')";

	/**
	 * Validates the patternPropertyRef constraint of '<em>Condition Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionElement_patternPropertyRef(ConditionElement conditionElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.Literals.CONDITION_ELEMENT,
				 conditionElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternPropertyRef",
				 CONDITION_ELEMENT__PATTERN_PROPERTY_REF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlledValue(ControlledValue controlledValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(controlledValue, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(controlledValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(controlledValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(controlledValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(controlledValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(controlledValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(controlledValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(controlledValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(controlledValue, diagnostics, context);
		if (result || diagnostics != null) result &= validateControlledValue_patternValueRef(controlledValue, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the patternValueRef constraint of '<em>Controlled Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONTROLLED_VALUE__PATTERN_VALUE_REF__EEXPRESSION = "(self.valueRef=null) or self.valueRef.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.valueRef.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.valueRef.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?')";

	/**
	 * Validates the patternValueRef constraint of '<em>Controlled Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlledValue_patternValueRef(ControlledValue controlledValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.Literals.CONTROLLED_VALUE,
				 controlledValue,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternValueRef",
				 CONTROLLED_VALUE__PATTERN_VALUE_REF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurrencyValue(CurrencyValue currencyValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(currencyValue, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(currencyValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(currencyValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(currencyValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(currencyValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(currencyValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(currencyValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(currencyValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(currencyValue, diagnostics, context);
		if (result || diagnostics != null) result &= validateCurrencyValue_patternCurrencyRef(currencyValue, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the patternCurrencyRef constraint of '<em>Currency Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CURRENCY_VALUE__PATTERN_CURRENCY_REF__EEXPRESSION = "(self.currencyRef=null) or self.currencyRef.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.currencyRef.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.currencyRef.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?')";

	/**
	 * Validates the patternCurrencyRef constraint of '<em>Currency Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurrencyValue_patternCurrencyRef(CurrencyValue currencyValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.Literals.CURRENCY_VALUE,
				 currencyValue,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternCurrencyRef",
				 CURRENCY_VALUE__PATTERN_CURRENCY_REF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTimeValue(DateTimeValue dateTimeValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dateTimeValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateValue(DateValue dateValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dateValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnvironment(Environment environment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(environment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateField(Field field, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(field, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(field, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(field, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(field, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(field, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(field, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(field, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(field, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(field, diagnostics, context);
		if (result || diagnostics != null) result &= validateField_patternPropertyRef(field, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the patternPropertyRef constraint of '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FIELD__PATTERN_PROPERTY_REF__EEXPRESSION = "(self.propertyRef=null) or self.propertyRef.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.propertyRef.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.propertyRef.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?')";

	/**
	 * Validates the patternPropertyRef constraint of '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateField_patternPropertyRef(Field field, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.Literals.FIELD,
				 field,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternPropertyRef",
				 FIELD__PATTERN_PROPERTY_REF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFileValue(FileValue fileValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fileValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerValue(IntegerValue integerValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integerValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemReferenceValue(ItemReferenceValue itemReferenceValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(itemReferenceValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalizedTextValue(LocalizedTextValue localizedTextValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(localizedTextValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureQualifiedNumberValue(MeasureQualifiedNumberValue measureQualifiedNumberValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(measureQualifiedNumberValue, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(measureQualifiedNumberValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(measureQualifiedNumberValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(measureQualifiedNumberValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(measureQualifiedNumberValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(measureQualifiedNumberValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(measureQualifiedNumberValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(measureQualifiedNumberValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(measureQualifiedNumberValue, diagnostics, context);
		if (result || diagnostics != null) result &= validateMeasureValue_patternUOMRef(measureQualifiedNumberValue, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureRangeValue(MeasureRangeValue measureRangeValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(measureRangeValue, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(measureRangeValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(measureRangeValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(measureRangeValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(measureRangeValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(measureRangeValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(measureRangeValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(measureRangeValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(measureRangeValue, diagnostics, context);
		if (result || diagnostics != null) result &= validateMeasureValue_patternUOMRef(measureRangeValue, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureSingleNumberValue(MeasureSingleNumberValue measureSingleNumberValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(measureSingleNumberValue, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(measureSingleNumberValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(measureSingleNumberValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(measureSingleNumberValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(measureSingleNumberValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(measureSingleNumberValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(measureSingleNumberValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(measureSingleNumberValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(measureSingleNumberValue, diagnostics, context);
		if (result || diagnostics != null) result &= validateMeasureValue_patternUOMRef(measureSingleNumberValue, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureValue(MeasureValue measureValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(measureValue, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(measureValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(measureValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(measureValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(measureValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(measureValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(measureValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(measureValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(measureValue, diagnostics, context);
		if (result || diagnostics != null) result &= validateMeasureValue_patternUOMRef(measureValue, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the patternUOMRef constraint of '<em>Measure Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MEASURE_VALUE__PATTERN_UOM_REF__EEXPRESSION = "(self.uOMRef=null) or self.uOMRef.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.uOMRef.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.uOMRef.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?')";

	/**
	 * Validates the patternUOMRef constraint of '<em>Measure Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureValue_patternUOMRef(MeasureValue measureValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.Literals.MEASURE_VALUE,
				 measureValue,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternUOMRef",
				 MEASURE_VALUE__PATTERN_UOM_REF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNullValue(NullValue nullValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nullValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericValue(NumericValue numericValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(numericValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOneOf(OneOf oneOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(oneOf, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQualifiedValue(QualifiedValue qualifiedValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(qualifiedValue, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(qualifiedValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(qualifiedValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(qualifiedValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(qualifiedValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(qualifiedValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(qualifiedValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(qualifiedValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(qualifiedValue, diagnostics, context);
		if (result || diagnostics != null) result &= validateQualifiedValue_patternQualifierRef(qualifiedValue, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the patternQualifierRef constraint of '<em>Qualified Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String QUALIFIED_VALUE__PATTERN_QUALIFIER_REF__EEXPRESSION = "(self.qualifierRef=null) or self.qualifierRef.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.qualifierRef.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.qualifierRef.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?')";

	/**
	 * Validates the patternQualifierRef constraint of '<em>Qualified Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQualifiedValue_patternQualifierRef(QualifiedValue qualifiedValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.Literals.QUALIFIED_VALUE,
				 qualifiedValue,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternQualifierRef",
				 QUALIFIED_VALUE__PATTERN_QUALIFIER_REF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRationalValue(RationalValue rationalValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rationalValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRealValue(RealValue realValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(realValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSequenceValue(SequenceValue sequenceValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sequenceValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSetValue(SetValue setValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(setValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringValue(StringValue stringValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stringValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeValue(TimeValue timeValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateYearMonthValue(YearMonthValue yearMonthValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(yearMonthValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateYearValue(YearValue yearValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(yearValue, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedValidator
