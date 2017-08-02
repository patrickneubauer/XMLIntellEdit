/**
 */
package isostdisots_29002_10ed_1techxmlschemavalueSimplified;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getPropertyRef <em>Property Ref</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getStringValue <em>String Value</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getBagValue <em>Bag Value</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getBooleanValue <em>Boolean Value</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getComplexValue <em>Complex Value</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getCompositeValue <em>Composite Value</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getControlledValue <em>Controlled Value</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getCurrencyValue <em>Currency Value</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getDateValue <em>Date Value</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getDateTimeValue <em>Date Time Value</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getFileValue <em>File Value</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getIntegerValue <em>Integer Value</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getItemReferenceValue <em>Item Reference Value</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getLocalizedTextValue <em>Localized Text Value</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getMeasureQualifiedNumberValue <em>Measure Qualified Number Value</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getMeasureRangeValue <em>Measure Range Value</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getMeasureSingleNumberValue <em>Measure Single Number Value</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getNullValue <em>Null Value</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getRationalValue <em>Rational Value</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getRealValue <em>Real Value</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getSequenceValue <em>Sequence Value</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getSetValue <em>Set Value</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getTimeValue <em>Time Value</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getYearMonthValue <em>Year Month Value</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getYearValue <em>Year Value</em>}</li>
 * </ul>
 *
 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage#getConditionElement()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='patternPropertyRef'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot patternPropertyRef='self.propertyRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.propertyRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\') or self.propertyRef.matches(\'[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?\')'"
 * @generated
 */
public interface ConditionElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Property Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Ref</em>' attribute.
	 * @see #setPropertyRef(String)
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage#getConditionElement_PropertyRef()
	 * @model required="true"
	 * @generated
	 */
	String getPropertyRef();

	/**
	 * Sets the value of the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getPropertyRef <em>Property Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Ref</em>' attribute.
	 * @see #getPropertyRef()
	 * @generated
	 */
	void setPropertyRef(String value);

	/**
	 * Returns the value of the '<em><b>String Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Value</em>' containment reference.
	 * @see #setStringValue(StringValue)
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage#getConditionElement_StringValue()
	 * @model containment="true"
	 * @generated
	 */
	StringValue getStringValue();

	/**
	 * Sets the value of the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getStringValue <em>String Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Value</em>' containment reference.
	 * @see #getStringValue()
	 * @generated
	 */
	void setStringValue(StringValue value);

	/**
	 * Returns the value of the '<em><b>Bag Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bag Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bag Value</em>' containment reference.
	 * @see #setBagValue(BagValue)
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage#getConditionElement_BagValue()
	 * @model containment="true"
	 * @generated
	 */
	BagValue getBagValue();

	/**
	 * Sets the value of the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getBagValue <em>Bag Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bag Value</em>' containment reference.
	 * @see #getBagValue()
	 * @generated
	 */
	void setBagValue(BagValue value);

	/**
	 * Returns the value of the '<em><b>Boolean Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Value</em>' containment reference.
	 * @see #setBooleanValue(BooleanValue)
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage#getConditionElement_BooleanValue()
	 * @model containment="true"
	 * @generated
	 */
	BooleanValue getBooleanValue();

	/**
	 * Sets the value of the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getBooleanValue <em>Boolean Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean Value</em>' containment reference.
	 * @see #getBooleanValue()
	 * @generated
	 */
	void setBooleanValue(BooleanValue value);

	/**
	 * Returns the value of the '<em><b>Complex Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complex Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complex Value</em>' containment reference.
	 * @see #setComplexValue(ComplexValue)
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage#getConditionElement_ComplexValue()
	 * @model containment="true"
	 * @generated
	 */
	ComplexValue getComplexValue();

	/**
	 * Sets the value of the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getComplexValue <em>Complex Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complex Value</em>' containment reference.
	 * @see #getComplexValue()
	 * @generated
	 */
	void setComplexValue(ComplexValue value);

	/**
	 * Returns the value of the '<em><b>Composite Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composite Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite Value</em>' containment reference.
	 * @see #setCompositeValue(CompositeValue)
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage#getConditionElement_CompositeValue()
	 * @model containment="true"
	 * @generated
	 */
	CompositeValue getCompositeValue();

	/**
	 * Sets the value of the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getCompositeValue <em>Composite Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composite Value</em>' containment reference.
	 * @see #getCompositeValue()
	 * @generated
	 */
	void setCompositeValue(CompositeValue value);

	/**
	 * Returns the value of the '<em><b>Controlled Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controlled Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controlled Value</em>' containment reference.
	 * @see #setControlledValue(ControlledValue)
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage#getConditionElement_ControlledValue()
	 * @model containment="true"
	 * @generated
	 */
	ControlledValue getControlledValue();

	/**
	 * Sets the value of the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getControlledValue <em>Controlled Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controlled Value</em>' containment reference.
	 * @see #getControlledValue()
	 * @generated
	 */
	void setControlledValue(ControlledValue value);

	/**
	 * Returns the value of the '<em><b>Currency Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Value</em>' containment reference.
	 * @see #setCurrencyValue(CurrencyValue)
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage#getConditionElement_CurrencyValue()
	 * @model containment="true"
	 * @generated
	 */
	CurrencyValue getCurrencyValue();

	/**
	 * Sets the value of the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getCurrencyValue <em>Currency Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Value</em>' containment reference.
	 * @see #getCurrencyValue()
	 * @generated
	 */
	void setCurrencyValue(CurrencyValue value);

	/**
	 * Returns the value of the '<em><b>Date Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Value</em>' containment reference.
	 * @see #setDateValue(DateValue)
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage#getConditionElement_DateValue()
	 * @model containment="true"
	 * @generated
	 */
	DateValue getDateValue();

	/**
	 * Sets the value of the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getDateValue <em>Date Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Value</em>' containment reference.
	 * @see #getDateValue()
	 * @generated
	 */
	void setDateValue(DateValue value);

	/**
	 * Returns the value of the '<em><b>Date Time Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Time Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Time Value</em>' containment reference.
	 * @see #setDateTimeValue(DateTimeValue)
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage#getConditionElement_DateTimeValue()
	 * @model containment="true"
	 * @generated
	 */
	DateTimeValue getDateTimeValue();

	/**
	 * Sets the value of the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getDateTimeValue <em>Date Time Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Time Value</em>' containment reference.
	 * @see #getDateTimeValue()
	 * @generated
	 */
	void setDateTimeValue(DateTimeValue value);

	/**
	 * Returns the value of the '<em><b>File Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Value</em>' containment reference.
	 * @see #setFileValue(FileValue)
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage#getConditionElement_FileValue()
	 * @model containment="true"
	 * @generated
	 */
	FileValue getFileValue();

	/**
	 * Sets the value of the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getFileValue <em>File Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Value</em>' containment reference.
	 * @see #getFileValue()
	 * @generated
	 */
	void setFileValue(FileValue value);

	/**
	 * Returns the value of the '<em><b>Integer Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integer Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integer Value</em>' containment reference.
	 * @see #setIntegerValue(IntegerValue)
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage#getConditionElement_IntegerValue()
	 * @model containment="true"
	 * @generated
	 */
	IntegerValue getIntegerValue();

	/**
	 * Sets the value of the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getIntegerValue <em>Integer Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integer Value</em>' containment reference.
	 * @see #getIntegerValue()
	 * @generated
	 */
	void setIntegerValue(IntegerValue value);

	/**
	 * Returns the value of the '<em><b>Item Reference Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Reference Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Reference Value</em>' containment reference.
	 * @see #setItemReferenceValue(ItemReferenceValue)
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage#getConditionElement_ItemReferenceValue()
	 * @model containment="true"
	 * @generated
	 */
	ItemReferenceValue getItemReferenceValue();

	/**
	 * Sets the value of the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getItemReferenceValue <em>Item Reference Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Reference Value</em>' containment reference.
	 * @see #getItemReferenceValue()
	 * @generated
	 */
	void setItemReferenceValue(ItemReferenceValue value);

	/**
	 * Returns the value of the '<em><b>Localized Text Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Localized Text Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Localized Text Value</em>' containment reference.
	 * @see #setLocalizedTextValue(LocalizedTextValue)
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage#getConditionElement_LocalizedTextValue()
	 * @model containment="true"
	 * @generated
	 */
	LocalizedTextValue getLocalizedTextValue();

	/**
	 * Sets the value of the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getLocalizedTextValue <em>Localized Text Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Localized Text Value</em>' containment reference.
	 * @see #getLocalizedTextValue()
	 * @generated
	 */
	void setLocalizedTextValue(LocalizedTextValue value);

	/**
	 * Returns the value of the '<em><b>Measure Qualified Number Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measure Qualified Number Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure Qualified Number Value</em>' containment reference.
	 * @see #setMeasureQualifiedNumberValue(MeasureQualifiedNumberValue)
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage#getConditionElement_MeasureQualifiedNumberValue()
	 * @model containment="true"
	 * @generated
	 */
	MeasureQualifiedNumberValue getMeasureQualifiedNumberValue();

	/**
	 * Sets the value of the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getMeasureQualifiedNumberValue <em>Measure Qualified Number Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure Qualified Number Value</em>' containment reference.
	 * @see #getMeasureQualifiedNumberValue()
	 * @generated
	 */
	void setMeasureQualifiedNumberValue(MeasureQualifiedNumberValue value);

	/**
	 * Returns the value of the '<em><b>Measure Range Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measure Range Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure Range Value</em>' containment reference.
	 * @see #setMeasureRangeValue(MeasureRangeValue)
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage#getConditionElement_MeasureRangeValue()
	 * @model containment="true"
	 * @generated
	 */
	MeasureRangeValue getMeasureRangeValue();

	/**
	 * Sets the value of the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getMeasureRangeValue <em>Measure Range Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure Range Value</em>' containment reference.
	 * @see #getMeasureRangeValue()
	 * @generated
	 */
	void setMeasureRangeValue(MeasureRangeValue value);

	/**
	 * Returns the value of the '<em><b>Measure Single Number Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measure Single Number Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure Single Number Value</em>' containment reference.
	 * @see #setMeasureSingleNumberValue(MeasureSingleNumberValue)
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage#getConditionElement_MeasureSingleNumberValue()
	 * @model containment="true"
	 * @generated
	 */
	MeasureSingleNumberValue getMeasureSingleNumberValue();

	/**
	 * Sets the value of the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getMeasureSingleNumberValue <em>Measure Single Number Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure Single Number Value</em>' containment reference.
	 * @see #getMeasureSingleNumberValue()
	 * @generated
	 */
	void setMeasureSingleNumberValue(MeasureSingleNumberValue value);

	/**
	 * Returns the value of the '<em><b>Null Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Null Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Null Value</em>' containment reference.
	 * @see #setNullValue(NullValue)
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage#getConditionElement_NullValue()
	 * @model containment="true"
	 * @generated
	 */
	NullValue getNullValue();

	/**
	 * Sets the value of the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getNullValue <em>Null Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Null Value</em>' containment reference.
	 * @see #getNullValue()
	 * @generated
	 */
	void setNullValue(NullValue value);

	/**
	 * Returns the value of the '<em><b>Rational Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rational Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rational Value</em>' containment reference.
	 * @see #setRationalValue(RationalValue)
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage#getConditionElement_RationalValue()
	 * @model containment="true"
	 * @generated
	 */
	RationalValue getRationalValue();

	/**
	 * Sets the value of the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getRationalValue <em>Rational Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rational Value</em>' containment reference.
	 * @see #getRationalValue()
	 * @generated
	 */
	void setRationalValue(RationalValue value);

	/**
	 * Returns the value of the '<em><b>Real Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Real Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Real Value</em>' containment reference.
	 * @see #setRealValue(RealValue)
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage#getConditionElement_RealValue()
	 * @model containment="true"
	 * @generated
	 */
	RealValue getRealValue();

	/**
	 * Sets the value of the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getRealValue <em>Real Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Real Value</em>' containment reference.
	 * @see #getRealValue()
	 * @generated
	 */
	void setRealValue(RealValue value);

	/**
	 * Returns the value of the '<em><b>Sequence Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Value</em>' containment reference.
	 * @see #setSequenceValue(SequenceValue)
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage#getConditionElement_SequenceValue()
	 * @model containment="true"
	 * @generated
	 */
	SequenceValue getSequenceValue();

	/**
	 * Sets the value of the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getSequenceValue <em>Sequence Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Value</em>' containment reference.
	 * @see #getSequenceValue()
	 * @generated
	 */
	void setSequenceValue(SequenceValue value);

	/**
	 * Returns the value of the '<em><b>Set Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Value</em>' containment reference.
	 * @see #setSetValue(SetValue)
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage#getConditionElement_SetValue()
	 * @model containment="true"
	 * @generated
	 */
	SetValue getSetValue();

	/**
	 * Sets the value of the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getSetValue <em>Set Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Value</em>' containment reference.
	 * @see #getSetValue()
	 * @generated
	 */
	void setSetValue(SetValue value);

	/**
	 * Returns the value of the '<em><b>Time Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Value</em>' containment reference.
	 * @see #setTimeValue(TimeValue)
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage#getConditionElement_TimeValue()
	 * @model containment="true"
	 * @generated
	 */
	TimeValue getTimeValue();

	/**
	 * Sets the value of the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getTimeValue <em>Time Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Value</em>' containment reference.
	 * @see #getTimeValue()
	 * @generated
	 */
	void setTimeValue(TimeValue value);

	/**
	 * Returns the value of the '<em><b>Year Month Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Year Month Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year Month Value</em>' containment reference.
	 * @see #setYearMonthValue(YearMonthValue)
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage#getConditionElement_YearMonthValue()
	 * @model containment="true"
	 * @generated
	 */
	YearMonthValue getYearMonthValue();

	/**
	 * Sets the value of the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getYearMonthValue <em>Year Month Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year Month Value</em>' containment reference.
	 * @see #getYearMonthValue()
	 * @generated
	 */
	void setYearMonthValue(YearMonthValue value);

	/**
	 * Returns the value of the '<em><b>Year Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Year Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year Value</em>' containment reference.
	 * @see #setYearValue(YearValue)
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage#getConditionElement_YearValue()
	 * @model containment="true"
	 * @generated
	 */
	YearValue getYearValue();

	/**
	 * Sets the value of the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getYearValue <em>Year Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year Value</em>' containment reference.
	 * @see #getYearValue()
	 * @generated
	 */
	void setYearValue(YearValue value);

} // ConditionElement
