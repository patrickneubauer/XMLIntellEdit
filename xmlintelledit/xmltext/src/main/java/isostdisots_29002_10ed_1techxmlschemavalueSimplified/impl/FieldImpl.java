/**
 */
package isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import isostdisots_29002_10ed_1techxmlschemavalueSimplified.BagValue;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.BooleanValue;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.ComplexValue;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.CompositeValue;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.ControlledValue;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.CurrencyValue;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.DateTimeValue;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.DateValue;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.Field;
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
 * An implementation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.FieldImpl#getPropertyRef <em>Property Ref</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.FieldImpl#getStringValue <em>String Value</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.FieldImpl#getBagValue <em>Bag Value</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.FieldImpl#getBooleanValue <em>Boolean Value</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.FieldImpl#getComplexValue <em>Complex Value</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.FieldImpl#getCompositeValue <em>Composite Value</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.FieldImpl#getControlledValue <em>Controlled Value</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.FieldImpl#getCurrencyValue <em>Currency Value</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.FieldImpl#getDateValue <em>Date Value</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.FieldImpl#getDateTimeValue <em>Date Time Value</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.FieldImpl#getFileValue <em>File Value</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.FieldImpl#getIntegerValue <em>Integer Value</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.FieldImpl#getItemReferenceValue <em>Item Reference Value</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.FieldImpl#getLocalizedTextValue <em>Localized Text Value</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.FieldImpl#getMeasureQualifiedNumberValue <em>Measure Qualified Number Value</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.FieldImpl#getMeasureRangeValue <em>Measure Range Value</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.FieldImpl#getMeasureSingleNumberValue <em>Measure Single Number Value</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.FieldImpl#getNullValue <em>Null Value</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.FieldImpl#getRationalValue <em>Rational Value</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.FieldImpl#getRealValue <em>Real Value</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.FieldImpl#getSequenceValue <em>Sequence Value</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.FieldImpl#getSetValue <em>Set Value</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.FieldImpl#getTimeValue <em>Time Value</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.FieldImpl#getYearMonthValue <em>Year Month Value</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.FieldImpl#getYearValue <em>Year Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldImpl extends MinimalEObjectImpl.Container implements Field {
	/**
	 * The default value of the '{@link #getPropertyRef() <em>Property Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyRef()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertyRef() <em>Property Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyRef()
	 * @generated
	 * @ordered
	 */
	protected String propertyRef = PROPERTY_REF_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStringValue() <em>String Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringValue()
	 * @generated
	 * @ordered
	 */
	protected StringValue stringValue;

	/**
	 * The cached value of the '{@link #getBagValue() <em>Bag Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBagValue()
	 * @generated
	 * @ordered
	 */
	protected BagValue bagValue;

	/**
	 * The cached value of the '{@link #getBooleanValue() <em>Boolean Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanValue()
	 * @generated
	 * @ordered
	 */
	protected BooleanValue booleanValue;

	/**
	 * The cached value of the '{@link #getComplexValue() <em>Complex Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplexValue()
	 * @generated
	 * @ordered
	 */
	protected ComplexValue complexValue;

	/**
	 * The cached value of the '{@link #getCompositeValue() <em>Composite Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositeValue()
	 * @generated
	 * @ordered
	 */
	protected CompositeValue compositeValue;

	/**
	 * The cached value of the '{@link #getControlledValue() <em>Controlled Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlledValue()
	 * @generated
	 * @ordered
	 */
	protected ControlledValue controlledValue;

	/**
	 * The cached value of the '{@link #getCurrencyValue() <em>Currency Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyValue()
	 * @generated
	 * @ordered
	 */
	protected CurrencyValue currencyValue;

	/**
	 * The cached value of the '{@link #getDateValue() <em>Date Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateValue()
	 * @generated
	 * @ordered
	 */
	protected DateValue dateValue;

	/**
	 * The cached value of the '{@link #getDateTimeValue() <em>Date Time Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTimeValue()
	 * @generated
	 * @ordered
	 */
	protected DateTimeValue dateTimeValue;

	/**
	 * The cached value of the '{@link #getFileValue() <em>File Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileValue()
	 * @generated
	 * @ordered
	 */
	protected FileValue fileValue;

	/**
	 * The cached value of the '{@link #getIntegerValue() <em>Integer Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegerValue()
	 * @generated
	 * @ordered
	 */
	protected IntegerValue integerValue;

	/**
	 * The cached value of the '{@link #getItemReferenceValue() <em>Item Reference Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemReferenceValue()
	 * @generated
	 * @ordered
	 */
	protected ItemReferenceValue itemReferenceValue;

	/**
	 * The cached value of the '{@link #getLocalizedTextValue() <em>Localized Text Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalizedTextValue()
	 * @generated
	 * @ordered
	 */
	protected LocalizedTextValue localizedTextValue;

	/**
	 * The cached value of the '{@link #getMeasureQualifiedNumberValue() <em>Measure Qualified Number Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureQualifiedNumberValue()
	 * @generated
	 * @ordered
	 */
	protected MeasureQualifiedNumberValue measureQualifiedNumberValue;

	/**
	 * The cached value of the '{@link #getMeasureRangeValue() <em>Measure Range Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureRangeValue()
	 * @generated
	 * @ordered
	 */
	protected MeasureRangeValue measureRangeValue;

	/**
	 * The cached value of the '{@link #getMeasureSingleNumberValue() <em>Measure Single Number Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureSingleNumberValue()
	 * @generated
	 * @ordered
	 */
	protected MeasureSingleNumberValue measureSingleNumberValue;

	/**
	 * The cached value of the '{@link #getNullValue() <em>Null Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullValue()
	 * @generated
	 * @ordered
	 */
	protected NullValue nullValue;

	/**
	 * The cached value of the '{@link #getRationalValue() <em>Rational Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationalValue()
	 * @generated
	 * @ordered
	 */
	protected RationalValue rationalValue;

	/**
	 * The cached value of the '{@link #getRealValue() <em>Real Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealValue()
	 * @generated
	 * @ordered
	 */
	protected RealValue realValue;

	/**
	 * The cached value of the '{@link #getSequenceValue() <em>Sequence Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceValue()
	 * @generated
	 * @ordered
	 */
	protected SequenceValue sequenceValue;

	/**
	 * The cached value of the '{@link #getSetValue() <em>Set Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetValue()
	 * @generated
	 * @ordered
	 */
	protected SetValue setValue;

	/**
	 * The cached value of the '{@link #getTimeValue() <em>Time Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeValue()
	 * @generated
	 * @ordered
	 */
	protected TimeValue timeValue;

	/**
	 * The cached value of the '{@link #getYearMonthValue() <em>Year Month Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearMonthValue()
	 * @generated
	 * @ordered
	 */
	protected YearMonthValue yearMonthValue;

	/**
	 * The cached value of the '{@link #getYearValue() <em>Year Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearValue()
	 * @generated
	 * @ordered
	 */
	protected YearValue yearValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.Literals.FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPropertyRef() {
		return propertyRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyRef(String newPropertyRef) {
		String oldPropertyRef = propertyRef;
		propertyRef = newPropertyRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__PROPERTY_REF, oldPropertyRef, propertyRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringValue getStringValue() {
		return stringValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStringValue(StringValue newStringValue, NotificationChain msgs) {
		StringValue oldStringValue = stringValue;
		stringValue = newStringValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__STRING_VALUE, oldStringValue, newStringValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStringValue(StringValue newStringValue) {
		if (newStringValue != stringValue) {
			NotificationChain msgs = null;
			if (stringValue != null)
				msgs = ((InternalEObject)stringValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__STRING_VALUE, null, msgs);
			if (newStringValue != null)
				msgs = ((InternalEObject)newStringValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__STRING_VALUE, null, msgs);
			msgs = basicSetStringValue(newStringValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__STRING_VALUE, newStringValue, newStringValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BagValue getBagValue() {
		return bagValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBagValue(BagValue newBagValue, NotificationChain msgs) {
		BagValue oldBagValue = bagValue;
		bagValue = newBagValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__BAG_VALUE, oldBagValue, newBagValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBagValue(BagValue newBagValue) {
		if (newBagValue != bagValue) {
			NotificationChain msgs = null;
			if (bagValue != null)
				msgs = ((InternalEObject)bagValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__BAG_VALUE, null, msgs);
			if (newBagValue != null)
				msgs = ((InternalEObject)newBagValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__BAG_VALUE, null, msgs);
			msgs = basicSetBagValue(newBagValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__BAG_VALUE, newBagValue, newBagValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanValue getBooleanValue() {
		return booleanValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBooleanValue(BooleanValue newBooleanValue, NotificationChain msgs) {
		BooleanValue oldBooleanValue = booleanValue;
		booleanValue = newBooleanValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__BOOLEAN_VALUE, oldBooleanValue, newBooleanValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooleanValue(BooleanValue newBooleanValue) {
		if (newBooleanValue != booleanValue) {
			NotificationChain msgs = null;
			if (booleanValue != null)
				msgs = ((InternalEObject)booleanValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__BOOLEAN_VALUE, null, msgs);
			if (newBooleanValue != null)
				msgs = ((InternalEObject)newBooleanValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__BOOLEAN_VALUE, null, msgs);
			msgs = basicSetBooleanValue(newBooleanValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__BOOLEAN_VALUE, newBooleanValue, newBooleanValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexValue getComplexValue() {
		return complexValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComplexValue(ComplexValue newComplexValue, NotificationChain msgs) {
		ComplexValue oldComplexValue = complexValue;
		complexValue = newComplexValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__COMPLEX_VALUE, oldComplexValue, newComplexValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplexValue(ComplexValue newComplexValue) {
		if (newComplexValue != complexValue) {
			NotificationChain msgs = null;
			if (complexValue != null)
				msgs = ((InternalEObject)complexValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__COMPLEX_VALUE, null, msgs);
			if (newComplexValue != null)
				msgs = ((InternalEObject)newComplexValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__COMPLEX_VALUE, null, msgs);
			msgs = basicSetComplexValue(newComplexValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__COMPLEX_VALUE, newComplexValue, newComplexValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeValue getCompositeValue() {
		return compositeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompositeValue(CompositeValue newCompositeValue, NotificationChain msgs) {
		CompositeValue oldCompositeValue = compositeValue;
		compositeValue = newCompositeValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__COMPOSITE_VALUE, oldCompositeValue, newCompositeValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompositeValue(CompositeValue newCompositeValue) {
		if (newCompositeValue != compositeValue) {
			NotificationChain msgs = null;
			if (compositeValue != null)
				msgs = ((InternalEObject)compositeValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__COMPOSITE_VALUE, null, msgs);
			if (newCompositeValue != null)
				msgs = ((InternalEObject)newCompositeValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__COMPOSITE_VALUE, null, msgs);
			msgs = basicSetCompositeValue(newCompositeValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__COMPOSITE_VALUE, newCompositeValue, newCompositeValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlledValue getControlledValue() {
		return controlledValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlledValue(ControlledValue newControlledValue, NotificationChain msgs) {
		ControlledValue oldControlledValue = controlledValue;
		controlledValue = newControlledValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__CONTROLLED_VALUE, oldControlledValue, newControlledValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlledValue(ControlledValue newControlledValue) {
		if (newControlledValue != controlledValue) {
			NotificationChain msgs = null;
			if (controlledValue != null)
				msgs = ((InternalEObject)controlledValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__CONTROLLED_VALUE, null, msgs);
			if (newControlledValue != null)
				msgs = ((InternalEObject)newControlledValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__CONTROLLED_VALUE, null, msgs);
			msgs = basicSetControlledValue(newControlledValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__CONTROLLED_VALUE, newControlledValue, newControlledValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrencyValue getCurrencyValue() {
		return currencyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrencyValue(CurrencyValue newCurrencyValue, NotificationChain msgs) {
		CurrencyValue oldCurrencyValue = currencyValue;
		currencyValue = newCurrencyValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__CURRENCY_VALUE, oldCurrencyValue, newCurrencyValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrencyValue(CurrencyValue newCurrencyValue) {
		if (newCurrencyValue != currencyValue) {
			NotificationChain msgs = null;
			if (currencyValue != null)
				msgs = ((InternalEObject)currencyValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__CURRENCY_VALUE, null, msgs);
			if (newCurrencyValue != null)
				msgs = ((InternalEObject)newCurrencyValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__CURRENCY_VALUE, null, msgs);
			msgs = basicSetCurrencyValue(newCurrencyValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__CURRENCY_VALUE, newCurrencyValue, newCurrencyValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateValue getDateValue() {
		return dateValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateValue(DateValue newDateValue, NotificationChain msgs) {
		DateValue oldDateValue = dateValue;
		dateValue = newDateValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__DATE_VALUE, oldDateValue, newDateValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateValue(DateValue newDateValue) {
		if (newDateValue != dateValue) {
			NotificationChain msgs = null;
			if (dateValue != null)
				msgs = ((InternalEObject)dateValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__DATE_VALUE, null, msgs);
			if (newDateValue != null)
				msgs = ((InternalEObject)newDateValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__DATE_VALUE, null, msgs);
			msgs = basicSetDateValue(newDateValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__DATE_VALUE, newDateValue, newDateValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeValue getDateTimeValue() {
		return dateTimeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateTimeValue(DateTimeValue newDateTimeValue, NotificationChain msgs) {
		DateTimeValue oldDateTimeValue = dateTimeValue;
		dateTimeValue = newDateTimeValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__DATE_TIME_VALUE, oldDateTimeValue, newDateTimeValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateTimeValue(DateTimeValue newDateTimeValue) {
		if (newDateTimeValue != dateTimeValue) {
			NotificationChain msgs = null;
			if (dateTimeValue != null)
				msgs = ((InternalEObject)dateTimeValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__DATE_TIME_VALUE, null, msgs);
			if (newDateTimeValue != null)
				msgs = ((InternalEObject)newDateTimeValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__DATE_TIME_VALUE, null, msgs);
			msgs = basicSetDateTimeValue(newDateTimeValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__DATE_TIME_VALUE, newDateTimeValue, newDateTimeValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileValue getFileValue() {
		return fileValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFileValue(FileValue newFileValue, NotificationChain msgs) {
		FileValue oldFileValue = fileValue;
		fileValue = newFileValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__FILE_VALUE, oldFileValue, newFileValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileValue(FileValue newFileValue) {
		if (newFileValue != fileValue) {
			NotificationChain msgs = null;
			if (fileValue != null)
				msgs = ((InternalEObject)fileValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__FILE_VALUE, null, msgs);
			if (newFileValue != null)
				msgs = ((InternalEObject)newFileValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__FILE_VALUE, null, msgs);
			msgs = basicSetFileValue(newFileValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__FILE_VALUE, newFileValue, newFileValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerValue getIntegerValue() {
		return integerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntegerValue(IntegerValue newIntegerValue, NotificationChain msgs) {
		IntegerValue oldIntegerValue = integerValue;
		integerValue = newIntegerValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__INTEGER_VALUE, oldIntegerValue, newIntegerValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntegerValue(IntegerValue newIntegerValue) {
		if (newIntegerValue != integerValue) {
			NotificationChain msgs = null;
			if (integerValue != null)
				msgs = ((InternalEObject)integerValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__INTEGER_VALUE, null, msgs);
			if (newIntegerValue != null)
				msgs = ((InternalEObject)newIntegerValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__INTEGER_VALUE, null, msgs);
			msgs = basicSetIntegerValue(newIntegerValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__INTEGER_VALUE, newIntegerValue, newIntegerValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemReferenceValue getItemReferenceValue() {
		return itemReferenceValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItemReferenceValue(ItemReferenceValue newItemReferenceValue, NotificationChain msgs) {
		ItemReferenceValue oldItemReferenceValue = itemReferenceValue;
		itemReferenceValue = newItemReferenceValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__ITEM_REFERENCE_VALUE, oldItemReferenceValue, newItemReferenceValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemReferenceValue(ItemReferenceValue newItemReferenceValue) {
		if (newItemReferenceValue != itemReferenceValue) {
			NotificationChain msgs = null;
			if (itemReferenceValue != null)
				msgs = ((InternalEObject)itemReferenceValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__ITEM_REFERENCE_VALUE, null, msgs);
			if (newItemReferenceValue != null)
				msgs = ((InternalEObject)newItemReferenceValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__ITEM_REFERENCE_VALUE, null, msgs);
			msgs = basicSetItemReferenceValue(newItemReferenceValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__ITEM_REFERENCE_VALUE, newItemReferenceValue, newItemReferenceValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalizedTextValue getLocalizedTextValue() {
		return localizedTextValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocalizedTextValue(LocalizedTextValue newLocalizedTextValue, NotificationChain msgs) {
		LocalizedTextValue oldLocalizedTextValue = localizedTextValue;
		localizedTextValue = newLocalizedTextValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__LOCALIZED_TEXT_VALUE, oldLocalizedTextValue, newLocalizedTextValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalizedTextValue(LocalizedTextValue newLocalizedTextValue) {
		if (newLocalizedTextValue != localizedTextValue) {
			NotificationChain msgs = null;
			if (localizedTextValue != null)
				msgs = ((InternalEObject)localizedTextValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__LOCALIZED_TEXT_VALUE, null, msgs);
			if (newLocalizedTextValue != null)
				msgs = ((InternalEObject)newLocalizedTextValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__LOCALIZED_TEXT_VALUE, null, msgs);
			msgs = basicSetLocalizedTextValue(newLocalizedTextValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__LOCALIZED_TEXT_VALUE, newLocalizedTextValue, newLocalizedTextValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureQualifiedNumberValue getMeasureQualifiedNumberValue() {
		return measureQualifiedNumberValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasureQualifiedNumberValue(MeasureQualifiedNumberValue newMeasureQualifiedNumberValue, NotificationChain msgs) {
		MeasureQualifiedNumberValue oldMeasureQualifiedNumberValue = measureQualifiedNumberValue;
		measureQualifiedNumberValue = newMeasureQualifiedNumberValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__MEASURE_QUALIFIED_NUMBER_VALUE, oldMeasureQualifiedNumberValue, newMeasureQualifiedNumberValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasureQualifiedNumberValue(MeasureQualifiedNumberValue newMeasureQualifiedNumberValue) {
		if (newMeasureQualifiedNumberValue != measureQualifiedNumberValue) {
			NotificationChain msgs = null;
			if (measureQualifiedNumberValue != null)
				msgs = ((InternalEObject)measureQualifiedNumberValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__MEASURE_QUALIFIED_NUMBER_VALUE, null, msgs);
			if (newMeasureQualifiedNumberValue != null)
				msgs = ((InternalEObject)newMeasureQualifiedNumberValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__MEASURE_QUALIFIED_NUMBER_VALUE, null, msgs);
			msgs = basicSetMeasureQualifiedNumberValue(newMeasureQualifiedNumberValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__MEASURE_QUALIFIED_NUMBER_VALUE, newMeasureQualifiedNumberValue, newMeasureQualifiedNumberValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureRangeValue getMeasureRangeValue() {
		return measureRangeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasureRangeValue(MeasureRangeValue newMeasureRangeValue, NotificationChain msgs) {
		MeasureRangeValue oldMeasureRangeValue = measureRangeValue;
		measureRangeValue = newMeasureRangeValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__MEASURE_RANGE_VALUE, oldMeasureRangeValue, newMeasureRangeValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasureRangeValue(MeasureRangeValue newMeasureRangeValue) {
		if (newMeasureRangeValue != measureRangeValue) {
			NotificationChain msgs = null;
			if (measureRangeValue != null)
				msgs = ((InternalEObject)measureRangeValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__MEASURE_RANGE_VALUE, null, msgs);
			if (newMeasureRangeValue != null)
				msgs = ((InternalEObject)newMeasureRangeValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__MEASURE_RANGE_VALUE, null, msgs);
			msgs = basicSetMeasureRangeValue(newMeasureRangeValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__MEASURE_RANGE_VALUE, newMeasureRangeValue, newMeasureRangeValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureSingleNumberValue getMeasureSingleNumberValue() {
		return measureSingleNumberValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasureSingleNumberValue(MeasureSingleNumberValue newMeasureSingleNumberValue, NotificationChain msgs) {
		MeasureSingleNumberValue oldMeasureSingleNumberValue = measureSingleNumberValue;
		measureSingleNumberValue = newMeasureSingleNumberValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__MEASURE_SINGLE_NUMBER_VALUE, oldMeasureSingleNumberValue, newMeasureSingleNumberValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasureSingleNumberValue(MeasureSingleNumberValue newMeasureSingleNumberValue) {
		if (newMeasureSingleNumberValue != measureSingleNumberValue) {
			NotificationChain msgs = null;
			if (measureSingleNumberValue != null)
				msgs = ((InternalEObject)measureSingleNumberValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__MEASURE_SINGLE_NUMBER_VALUE, null, msgs);
			if (newMeasureSingleNumberValue != null)
				msgs = ((InternalEObject)newMeasureSingleNumberValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__MEASURE_SINGLE_NUMBER_VALUE, null, msgs);
			msgs = basicSetMeasureSingleNumberValue(newMeasureSingleNumberValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__MEASURE_SINGLE_NUMBER_VALUE, newMeasureSingleNumberValue, newMeasureSingleNumberValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullValue getNullValue() {
		return nullValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNullValue(NullValue newNullValue, NotificationChain msgs) {
		NullValue oldNullValue = nullValue;
		nullValue = newNullValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__NULL_VALUE, oldNullValue, newNullValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNullValue(NullValue newNullValue) {
		if (newNullValue != nullValue) {
			NotificationChain msgs = null;
			if (nullValue != null)
				msgs = ((InternalEObject)nullValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__NULL_VALUE, null, msgs);
			if (newNullValue != null)
				msgs = ((InternalEObject)newNullValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__NULL_VALUE, null, msgs);
			msgs = basicSetNullValue(newNullValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__NULL_VALUE, newNullValue, newNullValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RationalValue getRationalValue() {
		return rationalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRationalValue(RationalValue newRationalValue, NotificationChain msgs) {
		RationalValue oldRationalValue = rationalValue;
		rationalValue = newRationalValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__RATIONAL_VALUE, oldRationalValue, newRationalValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRationalValue(RationalValue newRationalValue) {
		if (newRationalValue != rationalValue) {
			NotificationChain msgs = null;
			if (rationalValue != null)
				msgs = ((InternalEObject)rationalValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__RATIONAL_VALUE, null, msgs);
			if (newRationalValue != null)
				msgs = ((InternalEObject)newRationalValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__RATIONAL_VALUE, null, msgs);
			msgs = basicSetRationalValue(newRationalValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__RATIONAL_VALUE, newRationalValue, newRationalValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealValue getRealValue() {
		return realValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRealValue(RealValue newRealValue, NotificationChain msgs) {
		RealValue oldRealValue = realValue;
		realValue = newRealValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__REAL_VALUE, oldRealValue, newRealValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealValue(RealValue newRealValue) {
		if (newRealValue != realValue) {
			NotificationChain msgs = null;
			if (realValue != null)
				msgs = ((InternalEObject)realValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__REAL_VALUE, null, msgs);
			if (newRealValue != null)
				msgs = ((InternalEObject)newRealValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__REAL_VALUE, null, msgs);
			msgs = basicSetRealValue(newRealValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__REAL_VALUE, newRealValue, newRealValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceValue getSequenceValue() {
		return sequenceValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequenceValue(SequenceValue newSequenceValue, NotificationChain msgs) {
		SequenceValue oldSequenceValue = sequenceValue;
		sequenceValue = newSequenceValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__SEQUENCE_VALUE, oldSequenceValue, newSequenceValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceValue(SequenceValue newSequenceValue) {
		if (newSequenceValue != sequenceValue) {
			NotificationChain msgs = null;
			if (sequenceValue != null)
				msgs = ((InternalEObject)sequenceValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__SEQUENCE_VALUE, null, msgs);
			if (newSequenceValue != null)
				msgs = ((InternalEObject)newSequenceValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__SEQUENCE_VALUE, null, msgs);
			msgs = basicSetSequenceValue(newSequenceValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__SEQUENCE_VALUE, newSequenceValue, newSequenceValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetValue getSetValue() {
		return setValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetValue(SetValue newSetValue, NotificationChain msgs) {
		SetValue oldSetValue = setValue;
		setValue = newSetValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__SET_VALUE, oldSetValue, newSetValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetValue(SetValue newSetValue) {
		if (newSetValue != setValue) {
			NotificationChain msgs = null;
			if (setValue != null)
				msgs = ((InternalEObject)setValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__SET_VALUE, null, msgs);
			if (newSetValue != null)
				msgs = ((InternalEObject)newSetValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__SET_VALUE, null, msgs);
			msgs = basicSetSetValue(newSetValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__SET_VALUE, newSetValue, newSetValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeValue getTimeValue() {
		return timeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeValue(TimeValue newTimeValue, NotificationChain msgs) {
		TimeValue oldTimeValue = timeValue;
		timeValue = newTimeValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__TIME_VALUE, oldTimeValue, newTimeValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeValue(TimeValue newTimeValue) {
		if (newTimeValue != timeValue) {
			NotificationChain msgs = null;
			if (timeValue != null)
				msgs = ((InternalEObject)timeValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__TIME_VALUE, null, msgs);
			if (newTimeValue != null)
				msgs = ((InternalEObject)newTimeValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__TIME_VALUE, null, msgs);
			msgs = basicSetTimeValue(newTimeValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__TIME_VALUE, newTimeValue, newTimeValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YearMonthValue getYearMonthValue() {
		return yearMonthValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetYearMonthValue(YearMonthValue newYearMonthValue, NotificationChain msgs) {
		YearMonthValue oldYearMonthValue = yearMonthValue;
		yearMonthValue = newYearMonthValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__YEAR_MONTH_VALUE, oldYearMonthValue, newYearMonthValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYearMonthValue(YearMonthValue newYearMonthValue) {
		if (newYearMonthValue != yearMonthValue) {
			NotificationChain msgs = null;
			if (yearMonthValue != null)
				msgs = ((InternalEObject)yearMonthValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__YEAR_MONTH_VALUE, null, msgs);
			if (newYearMonthValue != null)
				msgs = ((InternalEObject)newYearMonthValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__YEAR_MONTH_VALUE, null, msgs);
			msgs = basicSetYearMonthValue(newYearMonthValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__YEAR_MONTH_VALUE, newYearMonthValue, newYearMonthValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YearValue getYearValue() {
		return yearValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetYearValue(YearValue newYearValue, NotificationChain msgs) {
		YearValue oldYearValue = yearValue;
		yearValue = newYearValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__YEAR_VALUE, oldYearValue, newYearValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYearValue(YearValue newYearValue) {
		if (newYearValue != yearValue) {
			NotificationChain msgs = null;
			if (yearValue != null)
				msgs = ((InternalEObject)yearValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__YEAR_VALUE, null, msgs);
			if (newYearValue != null)
				msgs = ((InternalEObject)newYearValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__YEAR_VALUE, null, msgs);
			msgs = basicSetYearValue(newYearValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__YEAR_VALUE, newYearValue, newYearValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__STRING_VALUE:
				return basicSetStringValue(null, msgs);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__BAG_VALUE:
				return basicSetBagValue(null, msgs);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__BOOLEAN_VALUE:
				return basicSetBooleanValue(null, msgs);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__COMPLEX_VALUE:
				return basicSetComplexValue(null, msgs);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__COMPOSITE_VALUE:
				return basicSetCompositeValue(null, msgs);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__CONTROLLED_VALUE:
				return basicSetControlledValue(null, msgs);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__CURRENCY_VALUE:
				return basicSetCurrencyValue(null, msgs);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__DATE_VALUE:
				return basicSetDateValue(null, msgs);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__DATE_TIME_VALUE:
				return basicSetDateTimeValue(null, msgs);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__FILE_VALUE:
				return basicSetFileValue(null, msgs);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__INTEGER_VALUE:
				return basicSetIntegerValue(null, msgs);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__ITEM_REFERENCE_VALUE:
				return basicSetItemReferenceValue(null, msgs);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__LOCALIZED_TEXT_VALUE:
				return basicSetLocalizedTextValue(null, msgs);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__MEASURE_QUALIFIED_NUMBER_VALUE:
				return basicSetMeasureQualifiedNumberValue(null, msgs);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__MEASURE_RANGE_VALUE:
				return basicSetMeasureRangeValue(null, msgs);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__MEASURE_SINGLE_NUMBER_VALUE:
				return basicSetMeasureSingleNumberValue(null, msgs);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__NULL_VALUE:
				return basicSetNullValue(null, msgs);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__RATIONAL_VALUE:
				return basicSetRationalValue(null, msgs);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__REAL_VALUE:
				return basicSetRealValue(null, msgs);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__SEQUENCE_VALUE:
				return basicSetSequenceValue(null, msgs);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__SET_VALUE:
				return basicSetSetValue(null, msgs);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__TIME_VALUE:
				return basicSetTimeValue(null, msgs);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__YEAR_MONTH_VALUE:
				return basicSetYearMonthValue(null, msgs);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__YEAR_VALUE:
				return basicSetYearValue(null, msgs);
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
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__PROPERTY_REF:
				return getPropertyRef();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__STRING_VALUE:
				return getStringValue();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__BAG_VALUE:
				return getBagValue();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__BOOLEAN_VALUE:
				return getBooleanValue();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__COMPLEX_VALUE:
				return getComplexValue();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__COMPOSITE_VALUE:
				return getCompositeValue();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__CONTROLLED_VALUE:
				return getControlledValue();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__CURRENCY_VALUE:
				return getCurrencyValue();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__DATE_VALUE:
				return getDateValue();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__DATE_TIME_VALUE:
				return getDateTimeValue();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__FILE_VALUE:
				return getFileValue();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__INTEGER_VALUE:
				return getIntegerValue();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__ITEM_REFERENCE_VALUE:
				return getItemReferenceValue();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__LOCALIZED_TEXT_VALUE:
				return getLocalizedTextValue();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__MEASURE_QUALIFIED_NUMBER_VALUE:
				return getMeasureQualifiedNumberValue();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__MEASURE_RANGE_VALUE:
				return getMeasureRangeValue();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__MEASURE_SINGLE_NUMBER_VALUE:
				return getMeasureSingleNumberValue();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__NULL_VALUE:
				return getNullValue();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__RATIONAL_VALUE:
				return getRationalValue();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__REAL_VALUE:
				return getRealValue();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__SEQUENCE_VALUE:
				return getSequenceValue();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__SET_VALUE:
				return getSetValue();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__TIME_VALUE:
				return getTimeValue();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__YEAR_MONTH_VALUE:
				return getYearMonthValue();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__YEAR_VALUE:
				return getYearValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__PROPERTY_REF:
				setPropertyRef((String)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__STRING_VALUE:
				setStringValue((StringValue)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__BAG_VALUE:
				setBagValue((BagValue)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__BOOLEAN_VALUE:
				setBooleanValue((BooleanValue)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__COMPLEX_VALUE:
				setComplexValue((ComplexValue)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__COMPOSITE_VALUE:
				setCompositeValue((CompositeValue)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__CONTROLLED_VALUE:
				setControlledValue((ControlledValue)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__CURRENCY_VALUE:
				setCurrencyValue((CurrencyValue)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__DATE_VALUE:
				setDateValue((DateValue)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__DATE_TIME_VALUE:
				setDateTimeValue((DateTimeValue)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__FILE_VALUE:
				setFileValue((FileValue)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__INTEGER_VALUE:
				setIntegerValue((IntegerValue)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__ITEM_REFERENCE_VALUE:
				setItemReferenceValue((ItemReferenceValue)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__LOCALIZED_TEXT_VALUE:
				setLocalizedTextValue((LocalizedTextValue)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__MEASURE_QUALIFIED_NUMBER_VALUE:
				setMeasureQualifiedNumberValue((MeasureQualifiedNumberValue)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__MEASURE_RANGE_VALUE:
				setMeasureRangeValue((MeasureRangeValue)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__MEASURE_SINGLE_NUMBER_VALUE:
				setMeasureSingleNumberValue((MeasureSingleNumberValue)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__NULL_VALUE:
				setNullValue((NullValue)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__RATIONAL_VALUE:
				setRationalValue((RationalValue)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__REAL_VALUE:
				setRealValue((RealValue)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__SEQUENCE_VALUE:
				setSequenceValue((SequenceValue)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__SET_VALUE:
				setSetValue((SetValue)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__TIME_VALUE:
				setTimeValue((TimeValue)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__YEAR_MONTH_VALUE:
				setYearMonthValue((YearMonthValue)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__YEAR_VALUE:
				setYearValue((YearValue)newValue);
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
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__PROPERTY_REF:
				setPropertyRef(PROPERTY_REF_EDEFAULT);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__STRING_VALUE:
				setStringValue((StringValue)null);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__BAG_VALUE:
				setBagValue((BagValue)null);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__BOOLEAN_VALUE:
				setBooleanValue((BooleanValue)null);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__COMPLEX_VALUE:
				setComplexValue((ComplexValue)null);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__COMPOSITE_VALUE:
				setCompositeValue((CompositeValue)null);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__CONTROLLED_VALUE:
				setControlledValue((ControlledValue)null);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__CURRENCY_VALUE:
				setCurrencyValue((CurrencyValue)null);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__DATE_VALUE:
				setDateValue((DateValue)null);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__DATE_TIME_VALUE:
				setDateTimeValue((DateTimeValue)null);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__FILE_VALUE:
				setFileValue((FileValue)null);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__INTEGER_VALUE:
				setIntegerValue((IntegerValue)null);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__ITEM_REFERENCE_VALUE:
				setItemReferenceValue((ItemReferenceValue)null);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__LOCALIZED_TEXT_VALUE:
				setLocalizedTextValue((LocalizedTextValue)null);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__MEASURE_QUALIFIED_NUMBER_VALUE:
				setMeasureQualifiedNumberValue((MeasureQualifiedNumberValue)null);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__MEASURE_RANGE_VALUE:
				setMeasureRangeValue((MeasureRangeValue)null);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__MEASURE_SINGLE_NUMBER_VALUE:
				setMeasureSingleNumberValue((MeasureSingleNumberValue)null);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__NULL_VALUE:
				setNullValue((NullValue)null);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__RATIONAL_VALUE:
				setRationalValue((RationalValue)null);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__REAL_VALUE:
				setRealValue((RealValue)null);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__SEQUENCE_VALUE:
				setSequenceValue((SequenceValue)null);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__SET_VALUE:
				setSetValue((SetValue)null);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__TIME_VALUE:
				setTimeValue((TimeValue)null);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__YEAR_MONTH_VALUE:
				setYearMonthValue((YearMonthValue)null);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__YEAR_VALUE:
				setYearValue((YearValue)null);
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
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__PROPERTY_REF:
				return PROPERTY_REF_EDEFAULT == null ? propertyRef != null : !PROPERTY_REF_EDEFAULT.equals(propertyRef);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__STRING_VALUE:
				return stringValue != null;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__BAG_VALUE:
				return bagValue != null;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__BOOLEAN_VALUE:
				return booleanValue != null;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__COMPLEX_VALUE:
				return complexValue != null;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__COMPOSITE_VALUE:
				return compositeValue != null;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__CONTROLLED_VALUE:
				return controlledValue != null;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__CURRENCY_VALUE:
				return currencyValue != null;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__DATE_VALUE:
				return dateValue != null;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__DATE_TIME_VALUE:
				return dateTimeValue != null;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__FILE_VALUE:
				return fileValue != null;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__INTEGER_VALUE:
				return integerValue != null;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__ITEM_REFERENCE_VALUE:
				return itemReferenceValue != null;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__LOCALIZED_TEXT_VALUE:
				return localizedTextValue != null;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__MEASURE_QUALIFIED_NUMBER_VALUE:
				return measureQualifiedNumberValue != null;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__MEASURE_RANGE_VALUE:
				return measureRangeValue != null;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__MEASURE_SINGLE_NUMBER_VALUE:
				return measureSingleNumberValue != null;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__NULL_VALUE:
				return nullValue != null;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__RATIONAL_VALUE:
				return rationalValue != null;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__REAL_VALUE:
				return realValue != null;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__SEQUENCE_VALUE:
				return sequenceValue != null;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__SET_VALUE:
				return setValue != null;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__TIME_VALUE:
				return timeValue != null;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__YEAR_MONTH_VALUE:
				return yearMonthValue != null;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.FIELD__YEAR_VALUE:
				return yearValue != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (propertyRef: ");
		result.append(propertyRef);
		result.append(')');
		return result.toString();
	}

} //FieldImpl
