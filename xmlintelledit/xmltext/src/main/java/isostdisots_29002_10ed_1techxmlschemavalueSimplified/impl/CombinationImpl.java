/**
 */
package isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import isostdisots_29002_10ed_1techxmlschemavalueSimplified.BagValue;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.BooleanValue;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.Combination;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.ComplexValue;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.CompositeValue;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.ControlledValue;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.CurrencyValue;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.DateTimeValue;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.DateValue;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.FileValue;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.IntegerValue;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.ItemReferenceValue;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.LocalizedTextValue;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.MeasureQualifiedNumberValue;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.MeasureRangeValue;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.MeasureSingleNumberValue;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.NullValue;
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
 * An implementation of the model object '<em><b>Combination</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.CombinationImpl#getStringValues <em>String Values</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.CombinationImpl#getBagValues <em>Bag Values</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.CombinationImpl#getBooleanValues <em>Boolean Values</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.CombinationImpl#getComplexValues <em>Complex Values</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.CombinationImpl#getCompositeValues <em>Composite Values</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.CombinationImpl#getControlledValues <em>Controlled Values</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.CombinationImpl#getCurrencyValues <em>Currency Values</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.CombinationImpl#getDateValues <em>Date Values</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.CombinationImpl#getDateTimeValues <em>Date Time Values</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.CombinationImpl#getFileValues <em>File Values</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.CombinationImpl#getIntegerValues <em>Integer Values</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.CombinationImpl#getItemReferenceValues <em>Item Reference Values</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.CombinationImpl#getLocalizedTextValues <em>Localized Text Values</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.CombinationImpl#getMeasureQualifiedNumberValues <em>Measure Qualified Number Values</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.CombinationImpl#getMeasureRangeValues <em>Measure Range Values</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.CombinationImpl#getMeasureSingleNumberValues <em>Measure Single Number Values</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.CombinationImpl#getNullValues <em>Null Values</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.CombinationImpl#getRationalValues <em>Rational Values</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.CombinationImpl#getRealValues <em>Real Values</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.CombinationImpl#getSequenceValues <em>Sequence Values</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.CombinationImpl#getSetValues <em>Set Values</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.CombinationImpl#getTimeValues <em>Time Values</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.CombinationImpl#getYearMonthValues <em>Year Month Values</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.CombinationImpl#getYearValues <em>Year Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CombinationImpl extends MinimalEObjectImpl.Container implements Combination {
	/**
	 * The cached value of the '{@link #getStringValues() <em>String Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringValues()
	 * @generated
	 * @ordered
	 */
	protected EList<StringValue> stringValues;

	/**
	 * The cached value of the '{@link #getBagValues() <em>Bag Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBagValues()
	 * @generated
	 * @ordered
	 */
	protected EList<BagValue> bagValues;

	/**
	 * The cached value of the '{@link #getBooleanValues() <em>Boolean Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanValues()
	 * @generated
	 * @ordered
	 */
	protected EList<BooleanValue> booleanValues;

	/**
	 * The cached value of the '{@link #getComplexValues() <em>Complex Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplexValues()
	 * @generated
	 * @ordered
	 */
	protected EList<ComplexValue> complexValues;

	/**
	 * The cached value of the '{@link #getCompositeValues() <em>Composite Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositeValues()
	 * @generated
	 * @ordered
	 */
	protected EList<CompositeValue> compositeValues;

	/**
	 * The cached value of the '{@link #getControlledValues() <em>Controlled Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlledValues()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlledValue> controlledValues;

	/**
	 * The cached value of the '{@link #getCurrencyValues() <em>Currency Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyValues()
	 * @generated
	 * @ordered
	 */
	protected EList<CurrencyValue> currencyValues;

	/**
	 * The cached value of the '{@link #getDateValues() <em>Date Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateValues()
	 * @generated
	 * @ordered
	 */
	protected EList<DateValue> dateValues;

	/**
	 * The cached value of the '{@link #getDateTimeValues() <em>Date Time Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTimeValues()
	 * @generated
	 * @ordered
	 */
	protected EList<DateTimeValue> dateTimeValues;

	/**
	 * The cached value of the '{@link #getFileValues() <em>File Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileValues()
	 * @generated
	 * @ordered
	 */
	protected EList<FileValue> fileValues;

	/**
	 * The cached value of the '{@link #getIntegerValues() <em>Integer Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegerValues()
	 * @generated
	 * @ordered
	 */
	protected EList<IntegerValue> integerValues;

	/**
	 * The cached value of the '{@link #getItemReferenceValues() <em>Item Reference Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemReferenceValues()
	 * @generated
	 * @ordered
	 */
	protected EList<ItemReferenceValue> itemReferenceValues;

	/**
	 * The cached value of the '{@link #getLocalizedTextValues() <em>Localized Text Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalizedTextValues()
	 * @generated
	 * @ordered
	 */
	protected EList<LocalizedTextValue> localizedTextValues;

	/**
	 * The cached value of the '{@link #getMeasureQualifiedNumberValues() <em>Measure Qualified Number Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureQualifiedNumberValues()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureQualifiedNumberValue> measureQualifiedNumberValues;

	/**
	 * The cached value of the '{@link #getMeasureRangeValues() <em>Measure Range Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureRangeValues()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureRangeValue> measureRangeValues;

	/**
	 * The cached value of the '{@link #getMeasureSingleNumberValues() <em>Measure Single Number Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureSingleNumberValues()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureSingleNumberValue> measureSingleNumberValues;

	/**
	 * The cached value of the '{@link #getNullValues() <em>Null Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullValues()
	 * @generated
	 * @ordered
	 */
	protected EList<NullValue> nullValues;

	/**
	 * The cached value of the '{@link #getRationalValues() <em>Rational Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationalValues()
	 * @generated
	 * @ordered
	 */
	protected EList<RationalValue> rationalValues;

	/**
	 * The cached value of the '{@link #getRealValues() <em>Real Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealValues()
	 * @generated
	 * @ordered
	 */
	protected EList<RealValue> realValues;

	/**
	 * The cached value of the '{@link #getSequenceValues() <em>Sequence Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceValues()
	 * @generated
	 * @ordered
	 */
	protected EList<SequenceValue> sequenceValues;

	/**
	 * The cached value of the '{@link #getSetValues() <em>Set Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetValues()
	 * @generated
	 * @ordered
	 */
	protected EList<SetValue> setValues;

	/**
	 * The cached value of the '{@link #getTimeValues() <em>Time Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeValues()
	 * @generated
	 * @ordered
	 */
	protected EList<TimeValue> timeValues;

	/**
	 * The cached value of the '{@link #getYearMonthValues() <em>Year Month Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearMonthValues()
	 * @generated
	 * @ordered
	 */
	protected EList<YearMonthValue> yearMonthValues;

	/**
	 * The cached value of the '{@link #getYearValues() <em>Year Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearValues()
	 * @generated
	 * @ordered
	 */
	protected EList<YearValue> yearValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CombinationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.Literals.COMBINATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StringValue> getStringValues() {
		if (stringValues == null) {
			stringValues = new EObjectContainmentEList<StringValue>(StringValue.class, this, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__STRING_VALUES);
		}
		return stringValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BagValue> getBagValues() {
		if (bagValues == null) {
			bagValues = new EObjectContainmentEList<BagValue>(BagValue.class, this, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__BAG_VALUES);
		}
		return bagValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BooleanValue> getBooleanValues() {
		if (booleanValues == null) {
			booleanValues = new EObjectContainmentEList<BooleanValue>(BooleanValue.class, this, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__BOOLEAN_VALUES);
		}
		return booleanValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComplexValue> getComplexValues() {
		if (complexValues == null) {
			complexValues = new EObjectContainmentEList<ComplexValue>(ComplexValue.class, this, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__COMPLEX_VALUES);
		}
		return complexValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompositeValue> getCompositeValues() {
		if (compositeValues == null) {
			compositeValues = new EObjectContainmentEList<CompositeValue>(CompositeValue.class, this, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__COMPOSITE_VALUES);
		}
		return compositeValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlledValue> getControlledValues() {
		if (controlledValues == null) {
			controlledValues = new EObjectContainmentEList<ControlledValue>(ControlledValue.class, this, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__CONTROLLED_VALUES);
		}
		return controlledValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CurrencyValue> getCurrencyValues() {
		if (currencyValues == null) {
			currencyValues = new EObjectContainmentEList<CurrencyValue>(CurrencyValue.class, this, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__CURRENCY_VALUES);
		}
		return currencyValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateValue> getDateValues() {
		if (dateValues == null) {
			dateValues = new EObjectContainmentEList<DateValue>(DateValue.class, this, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__DATE_VALUES);
		}
		return dateValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateTimeValue> getDateTimeValues() {
		if (dateTimeValues == null) {
			dateTimeValues = new EObjectContainmentEList<DateTimeValue>(DateTimeValue.class, this, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__DATE_TIME_VALUES);
		}
		return dateTimeValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FileValue> getFileValues() {
		if (fileValues == null) {
			fileValues = new EObjectContainmentEList<FileValue>(FileValue.class, this, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__FILE_VALUES);
		}
		return fileValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntegerValue> getIntegerValues() {
		if (integerValues == null) {
			integerValues = new EObjectContainmentEList<IntegerValue>(IntegerValue.class, this, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__INTEGER_VALUES);
		}
		return integerValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ItemReferenceValue> getItemReferenceValues() {
		if (itemReferenceValues == null) {
			itemReferenceValues = new EObjectContainmentEList<ItemReferenceValue>(ItemReferenceValue.class, this, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__ITEM_REFERENCE_VALUES);
		}
		return itemReferenceValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocalizedTextValue> getLocalizedTextValues() {
		if (localizedTextValues == null) {
			localizedTextValues = new EObjectContainmentEList<LocalizedTextValue>(LocalizedTextValue.class, this, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__LOCALIZED_TEXT_VALUES);
		}
		return localizedTextValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureQualifiedNumberValue> getMeasureQualifiedNumberValues() {
		if (measureQualifiedNumberValues == null) {
			measureQualifiedNumberValues = new EObjectContainmentEList<MeasureQualifiedNumberValue>(MeasureQualifiedNumberValue.class, this, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__MEASURE_QUALIFIED_NUMBER_VALUES);
		}
		return measureQualifiedNumberValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureRangeValue> getMeasureRangeValues() {
		if (measureRangeValues == null) {
			measureRangeValues = new EObjectContainmentEList<MeasureRangeValue>(MeasureRangeValue.class, this, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__MEASURE_RANGE_VALUES);
		}
		return measureRangeValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureSingleNumberValue> getMeasureSingleNumberValues() {
		if (measureSingleNumberValues == null) {
			measureSingleNumberValues = new EObjectContainmentEList<MeasureSingleNumberValue>(MeasureSingleNumberValue.class, this, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__MEASURE_SINGLE_NUMBER_VALUES);
		}
		return measureSingleNumberValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NullValue> getNullValues() {
		if (nullValues == null) {
			nullValues = new EObjectContainmentEList<NullValue>(NullValue.class, this, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__NULL_VALUES);
		}
		return nullValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RationalValue> getRationalValues() {
		if (rationalValues == null) {
			rationalValues = new EObjectContainmentEList<RationalValue>(RationalValue.class, this, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__RATIONAL_VALUES);
		}
		return rationalValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RealValue> getRealValues() {
		if (realValues == null) {
			realValues = new EObjectContainmentEList<RealValue>(RealValue.class, this, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__REAL_VALUES);
		}
		return realValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SequenceValue> getSequenceValues() {
		if (sequenceValues == null) {
			sequenceValues = new EObjectContainmentEList<SequenceValue>(SequenceValue.class, this, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__SEQUENCE_VALUES);
		}
		return sequenceValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SetValue> getSetValues() {
		if (setValues == null) {
			setValues = new EObjectContainmentEList<SetValue>(SetValue.class, this, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__SET_VALUES);
		}
		return setValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimeValue> getTimeValues() {
		if (timeValues == null) {
			timeValues = new EObjectContainmentEList<TimeValue>(TimeValue.class, this, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__TIME_VALUES);
		}
		return timeValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YearMonthValue> getYearMonthValues() {
		if (yearMonthValues == null) {
			yearMonthValues = new EObjectContainmentEList<YearMonthValue>(YearMonthValue.class, this, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__YEAR_MONTH_VALUES);
		}
		return yearMonthValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YearValue> getYearValues() {
		if (yearValues == null) {
			yearValues = new EObjectContainmentEList<YearValue>(YearValue.class, this, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__YEAR_VALUES);
		}
		return yearValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__STRING_VALUES:
				return ((InternalEList<?>)getStringValues()).basicRemove(otherEnd, msgs);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__BAG_VALUES:
				return ((InternalEList<?>)getBagValues()).basicRemove(otherEnd, msgs);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__BOOLEAN_VALUES:
				return ((InternalEList<?>)getBooleanValues()).basicRemove(otherEnd, msgs);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__COMPLEX_VALUES:
				return ((InternalEList<?>)getComplexValues()).basicRemove(otherEnd, msgs);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__COMPOSITE_VALUES:
				return ((InternalEList<?>)getCompositeValues()).basicRemove(otherEnd, msgs);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__CONTROLLED_VALUES:
				return ((InternalEList<?>)getControlledValues()).basicRemove(otherEnd, msgs);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__CURRENCY_VALUES:
				return ((InternalEList<?>)getCurrencyValues()).basicRemove(otherEnd, msgs);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__DATE_VALUES:
				return ((InternalEList<?>)getDateValues()).basicRemove(otherEnd, msgs);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__DATE_TIME_VALUES:
				return ((InternalEList<?>)getDateTimeValues()).basicRemove(otherEnd, msgs);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__FILE_VALUES:
				return ((InternalEList<?>)getFileValues()).basicRemove(otherEnd, msgs);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__INTEGER_VALUES:
				return ((InternalEList<?>)getIntegerValues()).basicRemove(otherEnd, msgs);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__ITEM_REFERENCE_VALUES:
				return ((InternalEList<?>)getItemReferenceValues()).basicRemove(otherEnd, msgs);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__LOCALIZED_TEXT_VALUES:
				return ((InternalEList<?>)getLocalizedTextValues()).basicRemove(otherEnd, msgs);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__MEASURE_QUALIFIED_NUMBER_VALUES:
				return ((InternalEList<?>)getMeasureQualifiedNumberValues()).basicRemove(otherEnd, msgs);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__MEASURE_RANGE_VALUES:
				return ((InternalEList<?>)getMeasureRangeValues()).basicRemove(otherEnd, msgs);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__MEASURE_SINGLE_NUMBER_VALUES:
				return ((InternalEList<?>)getMeasureSingleNumberValues()).basicRemove(otherEnd, msgs);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__NULL_VALUES:
				return ((InternalEList<?>)getNullValues()).basicRemove(otherEnd, msgs);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__RATIONAL_VALUES:
				return ((InternalEList<?>)getRationalValues()).basicRemove(otherEnd, msgs);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__REAL_VALUES:
				return ((InternalEList<?>)getRealValues()).basicRemove(otherEnd, msgs);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__SEQUENCE_VALUES:
				return ((InternalEList<?>)getSequenceValues()).basicRemove(otherEnd, msgs);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__SET_VALUES:
				return ((InternalEList<?>)getSetValues()).basicRemove(otherEnd, msgs);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__TIME_VALUES:
				return ((InternalEList<?>)getTimeValues()).basicRemove(otherEnd, msgs);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__YEAR_MONTH_VALUES:
				return ((InternalEList<?>)getYearMonthValues()).basicRemove(otherEnd, msgs);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__YEAR_VALUES:
				return ((InternalEList<?>)getYearValues()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__STRING_VALUES:
				return getStringValues();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__BAG_VALUES:
				return getBagValues();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__BOOLEAN_VALUES:
				return getBooleanValues();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__COMPLEX_VALUES:
				return getComplexValues();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__COMPOSITE_VALUES:
				return getCompositeValues();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__CONTROLLED_VALUES:
				return getControlledValues();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__CURRENCY_VALUES:
				return getCurrencyValues();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__DATE_VALUES:
				return getDateValues();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__DATE_TIME_VALUES:
				return getDateTimeValues();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__FILE_VALUES:
				return getFileValues();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__INTEGER_VALUES:
				return getIntegerValues();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__ITEM_REFERENCE_VALUES:
				return getItemReferenceValues();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__LOCALIZED_TEXT_VALUES:
				return getLocalizedTextValues();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__MEASURE_QUALIFIED_NUMBER_VALUES:
				return getMeasureQualifiedNumberValues();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__MEASURE_RANGE_VALUES:
				return getMeasureRangeValues();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__MEASURE_SINGLE_NUMBER_VALUES:
				return getMeasureSingleNumberValues();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__NULL_VALUES:
				return getNullValues();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__RATIONAL_VALUES:
				return getRationalValues();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__REAL_VALUES:
				return getRealValues();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__SEQUENCE_VALUES:
				return getSequenceValues();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__SET_VALUES:
				return getSetValues();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__TIME_VALUES:
				return getTimeValues();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__YEAR_MONTH_VALUES:
				return getYearMonthValues();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__YEAR_VALUES:
				return getYearValues();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__STRING_VALUES:
				getStringValues().clear();
				getStringValues().addAll((Collection<? extends StringValue>)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__BAG_VALUES:
				getBagValues().clear();
				getBagValues().addAll((Collection<? extends BagValue>)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__BOOLEAN_VALUES:
				getBooleanValues().clear();
				getBooleanValues().addAll((Collection<? extends BooleanValue>)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__COMPLEX_VALUES:
				getComplexValues().clear();
				getComplexValues().addAll((Collection<? extends ComplexValue>)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__COMPOSITE_VALUES:
				getCompositeValues().clear();
				getCompositeValues().addAll((Collection<? extends CompositeValue>)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__CONTROLLED_VALUES:
				getControlledValues().clear();
				getControlledValues().addAll((Collection<? extends ControlledValue>)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__CURRENCY_VALUES:
				getCurrencyValues().clear();
				getCurrencyValues().addAll((Collection<? extends CurrencyValue>)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__DATE_VALUES:
				getDateValues().clear();
				getDateValues().addAll((Collection<? extends DateValue>)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__DATE_TIME_VALUES:
				getDateTimeValues().clear();
				getDateTimeValues().addAll((Collection<? extends DateTimeValue>)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__FILE_VALUES:
				getFileValues().clear();
				getFileValues().addAll((Collection<? extends FileValue>)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__INTEGER_VALUES:
				getIntegerValues().clear();
				getIntegerValues().addAll((Collection<? extends IntegerValue>)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__ITEM_REFERENCE_VALUES:
				getItemReferenceValues().clear();
				getItemReferenceValues().addAll((Collection<? extends ItemReferenceValue>)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__LOCALIZED_TEXT_VALUES:
				getLocalizedTextValues().clear();
				getLocalizedTextValues().addAll((Collection<? extends LocalizedTextValue>)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__MEASURE_QUALIFIED_NUMBER_VALUES:
				getMeasureQualifiedNumberValues().clear();
				getMeasureQualifiedNumberValues().addAll((Collection<? extends MeasureQualifiedNumberValue>)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__MEASURE_RANGE_VALUES:
				getMeasureRangeValues().clear();
				getMeasureRangeValues().addAll((Collection<? extends MeasureRangeValue>)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__MEASURE_SINGLE_NUMBER_VALUES:
				getMeasureSingleNumberValues().clear();
				getMeasureSingleNumberValues().addAll((Collection<? extends MeasureSingleNumberValue>)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__NULL_VALUES:
				getNullValues().clear();
				getNullValues().addAll((Collection<? extends NullValue>)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__RATIONAL_VALUES:
				getRationalValues().clear();
				getRationalValues().addAll((Collection<? extends RationalValue>)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__REAL_VALUES:
				getRealValues().clear();
				getRealValues().addAll((Collection<? extends RealValue>)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__SEQUENCE_VALUES:
				getSequenceValues().clear();
				getSequenceValues().addAll((Collection<? extends SequenceValue>)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__SET_VALUES:
				getSetValues().clear();
				getSetValues().addAll((Collection<? extends SetValue>)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__TIME_VALUES:
				getTimeValues().clear();
				getTimeValues().addAll((Collection<? extends TimeValue>)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__YEAR_MONTH_VALUES:
				getYearMonthValues().clear();
				getYearMonthValues().addAll((Collection<? extends YearMonthValue>)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__YEAR_VALUES:
				getYearValues().clear();
				getYearValues().addAll((Collection<? extends YearValue>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__STRING_VALUES:
				getStringValues().clear();
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__BAG_VALUES:
				getBagValues().clear();
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__BOOLEAN_VALUES:
				getBooleanValues().clear();
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__COMPLEX_VALUES:
				getComplexValues().clear();
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__COMPOSITE_VALUES:
				getCompositeValues().clear();
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__CONTROLLED_VALUES:
				getControlledValues().clear();
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__CURRENCY_VALUES:
				getCurrencyValues().clear();
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__DATE_VALUES:
				getDateValues().clear();
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__DATE_TIME_VALUES:
				getDateTimeValues().clear();
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__FILE_VALUES:
				getFileValues().clear();
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__INTEGER_VALUES:
				getIntegerValues().clear();
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__ITEM_REFERENCE_VALUES:
				getItemReferenceValues().clear();
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__LOCALIZED_TEXT_VALUES:
				getLocalizedTextValues().clear();
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__MEASURE_QUALIFIED_NUMBER_VALUES:
				getMeasureQualifiedNumberValues().clear();
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__MEASURE_RANGE_VALUES:
				getMeasureRangeValues().clear();
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__MEASURE_SINGLE_NUMBER_VALUES:
				getMeasureSingleNumberValues().clear();
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__NULL_VALUES:
				getNullValues().clear();
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__RATIONAL_VALUES:
				getRationalValues().clear();
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__REAL_VALUES:
				getRealValues().clear();
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__SEQUENCE_VALUES:
				getSequenceValues().clear();
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__SET_VALUES:
				getSetValues().clear();
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__TIME_VALUES:
				getTimeValues().clear();
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__YEAR_MONTH_VALUES:
				getYearMonthValues().clear();
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__YEAR_VALUES:
				getYearValues().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__STRING_VALUES:
				return stringValues != null && !stringValues.isEmpty();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__BAG_VALUES:
				return bagValues != null && !bagValues.isEmpty();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__BOOLEAN_VALUES:
				return booleanValues != null && !booleanValues.isEmpty();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__COMPLEX_VALUES:
				return complexValues != null && !complexValues.isEmpty();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__COMPOSITE_VALUES:
				return compositeValues != null && !compositeValues.isEmpty();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__CONTROLLED_VALUES:
				return controlledValues != null && !controlledValues.isEmpty();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__CURRENCY_VALUES:
				return currencyValues != null && !currencyValues.isEmpty();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__DATE_VALUES:
				return dateValues != null && !dateValues.isEmpty();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__DATE_TIME_VALUES:
				return dateTimeValues != null && !dateTimeValues.isEmpty();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__FILE_VALUES:
				return fileValues != null && !fileValues.isEmpty();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__INTEGER_VALUES:
				return integerValues != null && !integerValues.isEmpty();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__ITEM_REFERENCE_VALUES:
				return itemReferenceValues != null && !itemReferenceValues.isEmpty();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__LOCALIZED_TEXT_VALUES:
				return localizedTextValues != null && !localizedTextValues.isEmpty();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__MEASURE_QUALIFIED_NUMBER_VALUES:
				return measureQualifiedNumberValues != null && !measureQualifiedNumberValues.isEmpty();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__MEASURE_RANGE_VALUES:
				return measureRangeValues != null && !measureRangeValues.isEmpty();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__MEASURE_SINGLE_NUMBER_VALUES:
				return measureSingleNumberValues != null && !measureSingleNumberValues.isEmpty();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__NULL_VALUES:
				return nullValues != null && !nullValues.isEmpty();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__RATIONAL_VALUES:
				return rationalValues != null && !rationalValues.isEmpty();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__REAL_VALUES:
				return realValues != null && !realValues.isEmpty();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__SEQUENCE_VALUES:
				return sequenceValues != null && !sequenceValues.isEmpty();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__SET_VALUES:
				return setValues != null && !setValues.isEmpty();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__TIME_VALUES:
				return timeValues != null && !timeValues.isEmpty();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__YEAR_MONTH_VALUES:
				return yearMonthValues != null && !yearMonthValues.isEmpty();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.COMBINATION__YEAR_VALUES:
				return yearValues != null && !yearValues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CombinationImpl
