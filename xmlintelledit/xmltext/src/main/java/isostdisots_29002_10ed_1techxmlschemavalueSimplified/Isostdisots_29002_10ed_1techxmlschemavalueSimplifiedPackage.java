/**
 */
package isostdisots_29002_10ed_1techxmlschemavalueSimplified;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "isostdisots_29002_10ed_1techxmlschemavalueSimplified";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:iso:std:iso:ts:29002:-10:ed-1:tech:xml-schema:valuesimplified";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "values";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage eINSTANCE = isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl.init();

	/**
	 * The meta object id for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.BagValueImpl <em>Bag Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.BagValueImpl
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getBagValue()
	 * @generated
	 */
	int BAG_VALUE = 0;

	/**
	 * The feature id for the '<em><b>String Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_VALUE__STRING_VALUES = 0;

	/**
	 * The feature id for the '<em><b>Bag Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_VALUE__BAG_VALUES = 1;

	/**
	 * The feature id for the '<em><b>Boolean Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_VALUE__BOOLEAN_VALUES = 2;

	/**
	 * The feature id for the '<em><b>Complex Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_VALUE__COMPLEX_VALUES = 3;

	/**
	 * The feature id for the '<em><b>Composite Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_VALUE__COMPOSITE_VALUES = 4;

	/**
	 * The feature id for the '<em><b>Controlled Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_VALUE__CONTROLLED_VALUES = 5;

	/**
	 * The feature id for the '<em><b>Currency Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_VALUE__CURRENCY_VALUES = 6;

	/**
	 * The feature id for the '<em><b>Date Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_VALUE__DATE_VALUES = 7;

	/**
	 * The feature id for the '<em><b>Date Time Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_VALUE__DATE_TIME_VALUES = 8;

	/**
	 * The feature id for the '<em><b>File Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_VALUE__FILE_VALUES = 9;

	/**
	 * The feature id for the '<em><b>Integer Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_VALUE__INTEGER_VALUES = 10;

	/**
	 * The feature id for the '<em><b>Item Reference Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_VALUE__ITEM_REFERENCE_VALUES = 11;

	/**
	 * The feature id for the '<em><b>Localized Text Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_VALUE__LOCALIZED_TEXT_VALUES = 12;

	/**
	 * The feature id for the '<em><b>Measure Qualified Number Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_VALUE__MEASURE_QUALIFIED_NUMBER_VALUES = 13;

	/**
	 * The feature id for the '<em><b>Measure Range Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_VALUE__MEASURE_RANGE_VALUES = 14;

	/**
	 * The feature id for the '<em><b>Measure Single Number Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_VALUE__MEASURE_SINGLE_NUMBER_VALUES = 15;

	/**
	 * The feature id for the '<em><b>Null Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_VALUE__NULL_VALUES = 16;

	/**
	 * The feature id for the '<em><b>Rational Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_VALUE__RATIONAL_VALUES = 17;

	/**
	 * The feature id for the '<em><b>Real Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_VALUE__REAL_VALUES = 18;

	/**
	 * The feature id for the '<em><b>Sequence Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_VALUE__SEQUENCE_VALUES = 19;

	/**
	 * The feature id for the '<em><b>Set Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_VALUE__SET_VALUES = 20;

	/**
	 * The feature id for the '<em><b>Time Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_VALUE__TIME_VALUES = 21;

	/**
	 * The feature id for the '<em><b>Year Month Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_VALUE__YEAR_MONTH_VALUES = 22;

	/**
	 * The feature id for the '<em><b>Year Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_VALUE__YEAR_VALUES = 23;

	/**
	 * The number of structural features of the '<em>Bag Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_VALUE_FEATURE_COUNT = 24;

	/**
	 * The number of operations of the '<em>Bag Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.BooleanValueImpl
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getBooleanValue()
	 * @generated
	 */
	int BOOLEAN_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.CombinationImpl <em>Combination</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.CombinationImpl
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getCombination()
	 * @generated
	 */
	int COMBINATION = 2;

	/**
	 * The feature id for the '<em><b>String Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION__STRING_VALUES = 0;

	/**
	 * The feature id for the '<em><b>Bag Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION__BAG_VALUES = 1;

	/**
	 * The feature id for the '<em><b>Boolean Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION__BOOLEAN_VALUES = 2;

	/**
	 * The feature id for the '<em><b>Complex Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION__COMPLEX_VALUES = 3;

	/**
	 * The feature id for the '<em><b>Composite Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION__COMPOSITE_VALUES = 4;

	/**
	 * The feature id for the '<em><b>Controlled Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION__CONTROLLED_VALUES = 5;

	/**
	 * The feature id for the '<em><b>Currency Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION__CURRENCY_VALUES = 6;

	/**
	 * The feature id for the '<em><b>Date Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION__DATE_VALUES = 7;

	/**
	 * The feature id for the '<em><b>Date Time Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION__DATE_TIME_VALUES = 8;

	/**
	 * The feature id for the '<em><b>File Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION__FILE_VALUES = 9;

	/**
	 * The feature id for the '<em><b>Integer Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION__INTEGER_VALUES = 10;

	/**
	 * The feature id for the '<em><b>Item Reference Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION__ITEM_REFERENCE_VALUES = 11;

	/**
	 * The feature id for the '<em><b>Localized Text Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION__LOCALIZED_TEXT_VALUES = 12;

	/**
	 * The feature id for the '<em><b>Measure Qualified Number Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION__MEASURE_QUALIFIED_NUMBER_VALUES = 13;

	/**
	 * The feature id for the '<em><b>Measure Range Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION__MEASURE_RANGE_VALUES = 14;

	/**
	 * The feature id for the '<em><b>Measure Single Number Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION__MEASURE_SINGLE_NUMBER_VALUES = 15;

	/**
	 * The feature id for the '<em><b>Null Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION__NULL_VALUES = 16;

	/**
	 * The feature id for the '<em><b>Rational Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION__RATIONAL_VALUES = 17;

	/**
	 * The feature id for the '<em><b>Real Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION__REAL_VALUES = 18;

	/**
	 * The feature id for the '<em><b>Sequence Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION__SEQUENCE_VALUES = 19;

	/**
	 * The feature id for the '<em><b>Set Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION__SET_VALUES = 20;

	/**
	 * The feature id for the '<em><b>Time Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION__TIME_VALUES = 21;

	/**
	 * The feature id for the '<em><b>Year Month Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION__YEAR_MONTH_VALUES = 22;

	/**
	 * The feature id for the '<em><b>Year Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION__YEAR_VALUES = 23;

	/**
	 * The number of structural features of the '<em>Combination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION_FEATURE_COUNT = 24;

	/**
	 * The number of operations of the '<em>Combination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.ComplexValueImpl <em>Complex Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.ComplexValueImpl
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getComplexValue()
	 * @generated
	 */
	int COMPLEX_VALUE = 3;

	/**
	 * The number of structural features of the '<em>Complex Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_VALUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Complex Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.CompositeValueImpl <em>Composite Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.CompositeValueImpl
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getCompositeValue()
	 * @generated
	 */
	int COMPOSITE_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_VALUE__FIELDS = 0;

	/**
	 * The number of structural features of the '<em>Composite Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_VALUE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Composite Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.ConditionElementImpl <em>Condition Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.ConditionElementImpl
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getConditionElement()
	 * @generated
	 */
	int CONDITION_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Property Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ELEMENT__PROPERTY_REF = 0;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ELEMENT__STRING_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Bag Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ELEMENT__BAG_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Boolean Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ELEMENT__BOOLEAN_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Complex Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ELEMENT__COMPLEX_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Composite Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ELEMENT__COMPOSITE_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Controlled Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ELEMENT__CONTROLLED_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Currency Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ELEMENT__CURRENCY_VALUE = 7;

	/**
	 * The feature id for the '<em><b>Date Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ELEMENT__DATE_VALUE = 8;

	/**
	 * The feature id for the '<em><b>Date Time Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ELEMENT__DATE_TIME_VALUE = 9;

	/**
	 * The feature id for the '<em><b>File Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ELEMENT__FILE_VALUE = 10;

	/**
	 * The feature id for the '<em><b>Integer Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ELEMENT__INTEGER_VALUE = 11;

	/**
	 * The feature id for the '<em><b>Item Reference Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ELEMENT__ITEM_REFERENCE_VALUE = 12;

	/**
	 * The feature id for the '<em><b>Localized Text Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ELEMENT__LOCALIZED_TEXT_VALUE = 13;

	/**
	 * The feature id for the '<em><b>Measure Qualified Number Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ELEMENT__MEASURE_QUALIFIED_NUMBER_VALUE = 14;

	/**
	 * The feature id for the '<em><b>Measure Range Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ELEMENT__MEASURE_RANGE_VALUE = 15;

	/**
	 * The feature id for the '<em><b>Measure Single Number Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ELEMENT__MEASURE_SINGLE_NUMBER_VALUE = 16;

	/**
	 * The feature id for the '<em><b>Null Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ELEMENT__NULL_VALUE = 17;

	/**
	 * The feature id for the '<em><b>Rational Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ELEMENT__RATIONAL_VALUE = 18;

	/**
	 * The feature id for the '<em><b>Real Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ELEMENT__REAL_VALUE = 19;

	/**
	 * The feature id for the '<em><b>Sequence Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ELEMENT__SEQUENCE_VALUE = 20;

	/**
	 * The feature id for the '<em><b>Set Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ELEMENT__SET_VALUE = 21;

	/**
	 * The feature id for the '<em><b>Time Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ELEMENT__TIME_VALUE = 22;

	/**
	 * The feature id for the '<em><b>Year Month Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ELEMENT__YEAR_MONTH_VALUE = 23;

	/**
	 * The feature id for the '<em><b>Year Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ELEMENT__YEAR_VALUE = 24;

	/**
	 * The number of structural features of the '<em>Condition Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ELEMENT_FEATURE_COUNT = 25;

	/**
	 * The number of operations of the '<em>Condition Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.ControlledValueImpl <em>Controlled Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.ControlledValueImpl
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getControlledValue()
	 * @generated
	 */
	int CONTROLLED_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Value Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLED_VALUE__VALUE_CODE = 0;

	/**
	 * The feature id for the '<em><b>Value Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLED_VALUE__VALUE_REF = 1;

	/**
	 * The number of structural features of the '<em>Controlled Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLED_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Controlled Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLED_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.CurrencyValueImpl <em>Currency Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.CurrencyValueImpl
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getCurrencyValue()
	 * @generated
	 */
	int CURRENCY_VALUE = 7;

	/**
	 * The feature id for the '<em><b>Currency Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_VALUE__CURRENCY_CODE = 0;

	/**
	 * The feature id for the '<em><b>Currency Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_VALUE__CURRENCY_REF = 1;

	/**
	 * The feature id for the '<em><b>Real Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_VALUE__REAL_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Complex Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_VALUE__COMPLEX_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Integer Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_VALUE__INTEGER_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Rational Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_VALUE__RATIONAL_VALUE = 5;

	/**
	 * The number of structural features of the '<em>Currency Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_VALUE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Currency Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.DateTimeValueImpl <em>Date Time Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.DateTimeValueImpl
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getDateTimeValue()
	 * @generated
	 */
	int DATE_TIME_VALUE = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_VALUE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Date Time Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_VALUE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Date Time Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.DateValueImpl <em>Date Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.DateValueImpl
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getDateValue()
	 * @generated
	 */
	int DATE_VALUE = 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_VALUE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Date Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_VALUE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Date Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.EnvironmentImpl <em>Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.EnvironmentImpl
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getEnvironment()
	 * @generated
	 */
	int ENVIRONMENT = 10;

	/**
	 * The feature id for the '<em><b>Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__PROPERTY_VALUES = 0;

	/**
	 * The number of structural features of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.FieldImpl
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 11;

	/**
	 * The feature id for the '<em><b>Property Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__PROPERTY_REF = 0;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__STRING_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Bag Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__BAG_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Boolean Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__BOOLEAN_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Complex Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__COMPLEX_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Composite Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__COMPOSITE_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Controlled Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__CONTROLLED_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Currency Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__CURRENCY_VALUE = 7;

	/**
	 * The feature id for the '<em><b>Date Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__DATE_VALUE = 8;

	/**
	 * The feature id for the '<em><b>Date Time Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__DATE_TIME_VALUE = 9;

	/**
	 * The feature id for the '<em><b>File Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__FILE_VALUE = 10;

	/**
	 * The feature id for the '<em><b>Integer Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__INTEGER_VALUE = 11;

	/**
	 * The feature id for the '<em><b>Item Reference Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__ITEM_REFERENCE_VALUE = 12;

	/**
	 * The feature id for the '<em><b>Localized Text Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__LOCALIZED_TEXT_VALUE = 13;

	/**
	 * The feature id for the '<em><b>Measure Qualified Number Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__MEASURE_QUALIFIED_NUMBER_VALUE = 14;

	/**
	 * The feature id for the '<em><b>Measure Range Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__MEASURE_RANGE_VALUE = 15;

	/**
	 * The feature id for the '<em><b>Measure Single Number Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__MEASURE_SINGLE_NUMBER_VALUE = 16;

	/**
	 * The feature id for the '<em><b>Null Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NULL_VALUE = 17;

	/**
	 * The feature id for the '<em><b>Rational Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__RATIONAL_VALUE = 18;

	/**
	 * The feature id for the '<em><b>Real Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__REAL_VALUE = 19;

	/**
	 * The feature id for the '<em><b>Sequence Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__SEQUENCE_VALUE = 20;

	/**
	 * The feature id for the '<em><b>Set Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__SET_VALUE = 21;

	/**
	 * The feature id for the '<em><b>Time Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__TIME_VALUE = 22;

	/**
	 * The feature id for the '<em><b>Year Month Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__YEAR_MONTH_VALUE = 23;

	/**
	 * The feature id for the '<em><b>Year Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__YEAR_VALUE = 24;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = 25;

	/**
	 * The number of operations of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.FileValueImpl <em>File Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.FileValueImpl
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getFileValue()
	 * @generated
	 */
	int FILE_VALUE = 12;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_VALUE__URI = 0;

	/**
	 * The number of structural features of the '<em>File Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_VALUE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>File Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.IntegerValueImpl <em>Integer Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.IntegerValueImpl
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getIntegerValue()
	 * @generated
	 */
	int INTEGER_VALUE = 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Integer Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Integer Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.ItemReferenceValueImpl <em>Item Reference Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.ItemReferenceValueImpl
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getItemReferenceValue()
	 * @generated
	 */
	int ITEM_REFERENCE_VALUE = 14;

	/**
	 * The feature id for the '<em><b>Item Local Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_REFERENCE_VALUE__ITEM_LOCAL_REF = 0;

	/**
	 * The number of structural features of the '<em>Item Reference Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_REFERENCE_VALUE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Item Reference Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_REFERENCE_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.LocalizedTextValueImpl <em>Localized Text Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.LocalizedTextValueImpl
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getLocalizedTextValue()
	 * @generated
	 */
	int LOCALIZED_TEXT_VALUE = 15;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALIZED_TEXT_VALUE__CONTENT = 0;

	/**
	 * The number of structural features of the '<em>Localized Text Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALIZED_TEXT_VALUE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Localized Text Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALIZED_TEXT_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.MeasureValueImpl <em>Measure Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.MeasureValueImpl
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getMeasureValue()
	 * @generated
	 */
	int MEASURE_VALUE = 19;

	/**
	 * The feature id for the '<em><b>UOM Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_VALUE__UOM_CODE = 0;

	/**
	 * The feature id for the '<em><b>UOM Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_VALUE__UOM_REF = 1;

	/**
	 * The number of structural features of the '<em>Measure Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Measure Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.MeasureQualifiedNumberValueImpl <em>Measure Qualified Number Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.MeasureQualifiedNumberValueImpl
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getMeasureQualifiedNumberValue()
	 * @generated
	 */
	int MEASURE_QUALIFIED_NUMBER_VALUE = 16;

	/**
	 * The feature id for the '<em><b>UOM Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_QUALIFIED_NUMBER_VALUE__UOM_CODE = MEASURE_VALUE__UOM_CODE;

	/**
	 * The feature id for the '<em><b>UOM Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_QUALIFIED_NUMBER_VALUE__UOM_REF = MEASURE_VALUE__UOM_REF;

	/**
	 * The feature id for the '<em><b>Qualified Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_QUALIFIED_NUMBER_VALUE__QUALIFIED_VALUES = MEASURE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Measure Qualified Number Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_QUALIFIED_NUMBER_VALUE_FEATURE_COUNT = MEASURE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Measure Qualified Number Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_QUALIFIED_NUMBER_VALUE_OPERATION_COUNT = MEASURE_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.MeasureRangeValueImpl <em>Measure Range Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.MeasureRangeValueImpl
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getMeasureRangeValue()
	 * @generated
	 */
	int MEASURE_RANGE_VALUE = 17;

	/**
	 * The feature id for the '<em><b>UOM Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_RANGE_VALUE__UOM_CODE = MEASURE_VALUE__UOM_CODE;

	/**
	 * The feature id for the '<em><b>UOM Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_RANGE_VALUE__UOM_REF = MEASURE_VALUE__UOM_REF;

	/**
	 * The feature id for the '<em><b>Lower Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_RANGE_VALUE__LOWER_VALUE = MEASURE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_RANGE_VALUE__UPPER_VALUE = MEASURE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Measure Range Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_RANGE_VALUE_FEATURE_COUNT = MEASURE_VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Measure Range Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_RANGE_VALUE_OPERATION_COUNT = MEASURE_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.MeasureSingleNumberValueImpl <em>Measure Single Number Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.MeasureSingleNumberValueImpl
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getMeasureSingleNumberValue()
	 * @generated
	 */
	int MEASURE_SINGLE_NUMBER_VALUE = 18;

	/**
	 * The feature id for the '<em><b>UOM Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_SINGLE_NUMBER_VALUE__UOM_CODE = MEASURE_VALUE__UOM_CODE;

	/**
	 * The feature id for the '<em><b>UOM Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_SINGLE_NUMBER_VALUE__UOM_REF = MEASURE_VALUE__UOM_REF;

	/**
	 * The feature id for the '<em><b>Real Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_SINGLE_NUMBER_VALUE__REAL_VALUE = MEASURE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Complex Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_SINGLE_NUMBER_VALUE__COMPLEX_VALUE = MEASURE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Integer Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_SINGLE_NUMBER_VALUE__INTEGER_VALUE = MEASURE_VALUE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rational Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_SINGLE_NUMBER_VALUE__RATIONAL_VALUE = MEASURE_VALUE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Measure Single Number Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_SINGLE_NUMBER_VALUE_FEATURE_COUNT = MEASURE_VALUE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Measure Single Number Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_SINGLE_NUMBER_VALUE_OPERATION_COUNT = MEASURE_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.NullValueImpl <em>Null Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.NullValueImpl
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getNullValue()
	 * @generated
	 */
	int NULL_VALUE = 20;

	/**
	 * The number of structural features of the '<em>Null Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_VALUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Null Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.NumericValueImpl <em>Numeric Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.NumericValueImpl
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getNumericValue()
	 * @generated
	 */
	int NUMERIC_VALUE = 21;

	/**
	 * The feature id for the '<em><b>Real Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_VALUE__REAL_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Complex Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_VALUE__COMPLEX_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Integer Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_VALUE__INTEGER_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Rational Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_VALUE__RATIONAL_VALUE = 3;

	/**
	 * The number of structural features of the '<em>Numeric Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_VALUE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Numeric Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.OneOfImpl <em>One Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.OneOfImpl
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getOneOf()
	 * @generated
	 */
	int ONE_OF = 22;

	/**
	 * The feature id for the '<em><b>Combinations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF__COMBINATIONS = 0;

	/**
	 * The feature id for the '<em><b>String Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF__STRING_VALUES = 1;

	/**
	 * The feature id for the '<em><b>Bag Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF__BAG_VALUES = 2;

	/**
	 * The feature id for the '<em><b>Boolean Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF__BOOLEAN_VALUES = 3;

	/**
	 * The feature id for the '<em><b>Complex Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF__COMPLEX_VALUES = 4;

	/**
	 * The feature id for the '<em><b>Composite Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF__COMPOSITE_VALUES = 5;

	/**
	 * The feature id for the '<em><b>Controlled Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF__CONTROLLED_VALUES = 6;

	/**
	 * The feature id for the '<em><b>Currency Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF__CURRENCY_VALUES = 7;

	/**
	 * The feature id for the '<em><b>Date Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF__DATE_VALUES = 8;

	/**
	 * The feature id for the '<em><b>Date Time Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF__DATE_TIME_VALUES = 9;

	/**
	 * The feature id for the '<em><b>File Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF__FILE_VALUES = 10;

	/**
	 * The feature id for the '<em><b>Integer Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF__INTEGER_VALUES = 11;

	/**
	 * The feature id for the '<em><b>Item Reference Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF__ITEM_REFERENCE_VALUES = 12;

	/**
	 * The feature id for the '<em><b>Localized Text Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF__LOCALIZED_TEXT_VALUES = 13;

	/**
	 * The feature id for the '<em><b>Measure Qualified Number Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF__MEASURE_QUALIFIED_NUMBER_VALUES = 14;

	/**
	 * The feature id for the '<em><b>Measure Range Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF__MEASURE_RANGE_VALUES = 15;

	/**
	 * The feature id for the '<em><b>Measure Single Number Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF__MEASURE_SINGLE_NUMBER_VALUES = 16;

	/**
	 * The feature id for the '<em><b>Null Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF__NULL_VALUES = 17;

	/**
	 * The feature id for the '<em><b>Rational Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF__RATIONAL_VALUES = 18;

	/**
	 * The feature id for the '<em><b>Real Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF__REAL_VALUES = 19;

	/**
	 * The feature id for the '<em><b>Sequence Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF__SEQUENCE_VALUES = 20;

	/**
	 * The feature id for the '<em><b>Set Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF__SET_VALUES = 21;

	/**
	 * The feature id for the '<em><b>Time Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF__TIME_VALUES = 22;

	/**
	 * The feature id for the '<em><b>Year Month Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF__YEAR_MONTH_VALUES = 23;

	/**
	 * The feature id for the '<em><b>Year Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF__YEAR_VALUES = 24;

	/**
	 * The number of structural features of the '<em>One Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF_FEATURE_COUNT = 25;

	/**
	 * The number of operations of the '<em>One Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.QualifiedValueImpl <em>Qualified Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.QualifiedValueImpl
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getQualifiedValue()
	 * @generated
	 */
	int QUALIFIED_VALUE = 23;

	/**
	 * The feature id for the '<em><b>Qualifier Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_VALUE__QUALIFIER_CODE = 0;

	/**
	 * The feature id for the '<em><b>Qualifier Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_VALUE__QUALIFIER_REF = 1;

	/**
	 * The feature id for the '<em><b>Real Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_VALUE__REAL_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Complex Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_VALUE__COMPLEX_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Integer Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_VALUE__INTEGER_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Rational Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_VALUE__RATIONAL_VALUE = 5;

	/**
	 * The number of structural features of the '<em>Qualified Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_VALUE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Qualified Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.RationalValueImpl <em>Rational Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.RationalValueImpl
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getRationalValue()
	 * @generated
	 */
	int RATIONAL_VALUE = 24;

	/**
	 * The feature id for the '<em><b>Whole Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONAL_VALUE__WHOLE_PART = 0;

	/**
	 * The feature id for the '<em><b>Numerator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONAL_VALUE__NUMERATOR = 1;

	/**
	 * The feature id for the '<em><b>Denominator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONAL_VALUE__DENOMINATOR = 2;

	/**
	 * The number of structural features of the '<em>Rational Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONAL_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Rational Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONAL_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.RealValueImpl <em>Real Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.RealValueImpl
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getRealValue()
	 * @generated
	 */
	int REAL_VALUE = 25;

	/**
	 * The number of structural features of the '<em>Real Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_VALUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Real Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.SequenceValueImpl <em>Sequence Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.SequenceValueImpl
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getSequenceValue()
	 * @generated
	 */
	int SEQUENCE_VALUE = 26;

	/**
	 * The feature id for the '<em><b>String Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_VALUE__STRING_VALUES = 0;

	/**
	 * The feature id for the '<em><b>Bag Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_VALUE__BAG_VALUES = 1;

	/**
	 * The feature id for the '<em><b>Boolean Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_VALUE__BOOLEAN_VALUES = 2;

	/**
	 * The feature id for the '<em><b>Complex Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_VALUE__COMPLEX_VALUES = 3;

	/**
	 * The feature id for the '<em><b>Composite Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_VALUE__COMPOSITE_VALUES = 4;

	/**
	 * The feature id for the '<em><b>Controlled Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_VALUE__CONTROLLED_VALUES = 5;

	/**
	 * The feature id for the '<em><b>Currency Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_VALUE__CURRENCY_VALUES = 6;

	/**
	 * The feature id for the '<em><b>Date Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_VALUE__DATE_VALUES = 7;

	/**
	 * The feature id for the '<em><b>Date Time Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_VALUE__DATE_TIME_VALUES = 8;

	/**
	 * The feature id for the '<em><b>File Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_VALUE__FILE_VALUES = 9;

	/**
	 * The feature id for the '<em><b>Integer Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_VALUE__INTEGER_VALUES = 10;

	/**
	 * The feature id for the '<em><b>Item Reference Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_VALUE__ITEM_REFERENCE_VALUES = 11;

	/**
	 * The feature id for the '<em><b>Localized Text Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_VALUE__LOCALIZED_TEXT_VALUES = 12;

	/**
	 * The feature id for the '<em><b>Measure Qualified Number Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_VALUE__MEASURE_QUALIFIED_NUMBER_VALUES = 13;

	/**
	 * The feature id for the '<em><b>Measure Range Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_VALUE__MEASURE_RANGE_VALUES = 14;

	/**
	 * The feature id for the '<em><b>Measure Single Number Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_VALUE__MEASURE_SINGLE_NUMBER_VALUES = 15;

	/**
	 * The feature id for the '<em><b>Null Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_VALUE__NULL_VALUES = 16;

	/**
	 * The feature id for the '<em><b>Rational Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_VALUE__RATIONAL_VALUES = 17;

	/**
	 * The feature id for the '<em><b>Real Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_VALUE__REAL_VALUES = 18;

	/**
	 * The feature id for the '<em><b>Sequence Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_VALUE__SEQUENCE_VALUES = 19;

	/**
	 * The feature id for the '<em><b>Set Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_VALUE__SET_VALUES = 20;

	/**
	 * The feature id for the '<em><b>Time Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_VALUE__TIME_VALUES = 21;

	/**
	 * The feature id for the '<em><b>Year Month Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_VALUE__YEAR_MONTH_VALUES = 22;

	/**
	 * The feature id for the '<em><b>Year Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_VALUE__YEAR_VALUES = 23;

	/**
	 * The number of structural features of the '<em>Sequence Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_VALUE_FEATURE_COUNT = 24;

	/**
	 * The number of operations of the '<em>Sequence Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.SetValueImpl <em>Set Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.SetValueImpl
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getSetValue()
	 * @generated
	 */
	int SET_VALUE = 27;

	/**
	 * The feature id for the '<em><b>String Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE__STRING_VALUES = 0;

	/**
	 * The feature id for the '<em><b>Bag Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE__BAG_VALUES = 1;

	/**
	 * The feature id for the '<em><b>Boolean Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE__BOOLEAN_VALUES = 2;

	/**
	 * The feature id for the '<em><b>Complex Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE__COMPLEX_VALUES = 3;

	/**
	 * The feature id for the '<em><b>Composite Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE__COMPOSITE_VALUES = 4;

	/**
	 * The feature id for the '<em><b>Controlled Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE__CONTROLLED_VALUES = 5;

	/**
	 * The feature id for the '<em><b>Currency Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE__CURRENCY_VALUES = 6;

	/**
	 * The feature id for the '<em><b>Date Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE__DATE_VALUES = 7;

	/**
	 * The feature id for the '<em><b>Date Time Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE__DATE_TIME_VALUES = 8;

	/**
	 * The feature id for the '<em><b>File Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE__FILE_VALUES = 9;

	/**
	 * The feature id for the '<em><b>Integer Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE__INTEGER_VALUES = 10;

	/**
	 * The feature id for the '<em><b>Item Reference Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE__ITEM_REFERENCE_VALUES = 11;

	/**
	 * The feature id for the '<em><b>Localized Text Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE__LOCALIZED_TEXT_VALUES = 12;

	/**
	 * The feature id for the '<em><b>Measure Qualified Number Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE__MEASURE_QUALIFIED_NUMBER_VALUES = 13;

	/**
	 * The feature id for the '<em><b>Measure Range Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE__MEASURE_RANGE_VALUES = 14;

	/**
	 * The feature id for the '<em><b>Measure Single Number Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE__MEASURE_SINGLE_NUMBER_VALUES = 15;

	/**
	 * The feature id for the '<em><b>Null Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE__NULL_VALUES = 16;

	/**
	 * The feature id for the '<em><b>Rational Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE__RATIONAL_VALUES = 17;

	/**
	 * The feature id for the '<em><b>Real Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE__REAL_VALUES = 18;

	/**
	 * The feature id for the '<em><b>Sequence Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE__SEQUENCE_VALUES = 19;

	/**
	 * The feature id for the '<em><b>Set Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE__SET_VALUES = 20;

	/**
	 * The feature id for the '<em><b>Time Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE__TIME_VALUES = 21;

	/**
	 * The feature id for the '<em><b>Year Month Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE__YEAR_MONTH_VALUES = 22;

	/**
	 * The feature id for the '<em><b>Year Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE__YEAR_VALUES = 23;

	/**
	 * The number of structural features of the '<em>Set Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE_FEATURE_COUNT = 24;

	/**
	 * The number of operations of the '<em>Set Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.StringValueImpl <em>String Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.StringValueImpl
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getStringValue()
	 * @generated
	 */
	int STRING_VALUE = 28;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.TimeValueImpl <em>Time Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.TimeValueImpl
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getTimeValue()
	 * @generated
	 */
	int TIME_VALUE = 29;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_VALUE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Time Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_VALUE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Time Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.YearMonthValueImpl <em>Year Month Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.YearMonthValueImpl
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getYearMonthValue()
	 * @generated
	 */
	int YEAR_MONTH_VALUE = 30;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_MONTH_VALUE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Year Month Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_MONTH_VALUE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Year Month Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_MONTH_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.YearValueImpl <em>Year Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.YearValueImpl
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getYearValue()
	 * @generated
	 */
	int YEAR_VALUE = 31;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_VALUE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Year Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_VALUE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Year Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_VALUE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.BagValue <em>Bag Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bag Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.BagValue
	 * @generated
	 */
	EClass getBagValue();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.BagValue#getStringValues <em>String Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>String Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.BagValue#getStringValues()
	 * @see #getBagValue()
	 * @generated
	 */
	EReference getBagValue_StringValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.BagValue#getBagValues <em>Bag Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bag Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.BagValue#getBagValues()
	 * @see #getBagValue()
	 * @generated
	 */
	EReference getBagValue_BagValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.BagValue#getBooleanValues <em>Boolean Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Boolean Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.BagValue#getBooleanValues()
	 * @see #getBagValue()
	 * @generated
	 */
	EReference getBagValue_BooleanValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.BagValue#getComplexValues <em>Complex Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Complex Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.BagValue#getComplexValues()
	 * @see #getBagValue()
	 * @generated
	 */
	EReference getBagValue_ComplexValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.BagValue#getCompositeValues <em>Composite Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composite Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.BagValue#getCompositeValues()
	 * @see #getBagValue()
	 * @generated
	 */
	EReference getBagValue_CompositeValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.BagValue#getControlledValues <em>Controlled Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controlled Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.BagValue#getControlledValues()
	 * @see #getBagValue()
	 * @generated
	 */
	EReference getBagValue_ControlledValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.BagValue#getCurrencyValues <em>Currency Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Currency Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.BagValue#getCurrencyValues()
	 * @see #getBagValue()
	 * @generated
	 */
	EReference getBagValue_CurrencyValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.BagValue#getDateValues <em>Date Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Date Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.BagValue#getDateValues()
	 * @see #getBagValue()
	 * @generated
	 */
	EReference getBagValue_DateValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.BagValue#getDateTimeValues <em>Date Time Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Date Time Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.BagValue#getDateTimeValues()
	 * @see #getBagValue()
	 * @generated
	 */
	EReference getBagValue_DateTimeValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.BagValue#getFileValues <em>File Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>File Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.BagValue#getFileValues()
	 * @see #getBagValue()
	 * @generated
	 */
	EReference getBagValue_FileValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.BagValue#getIntegerValues <em>Integer Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Integer Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.BagValue#getIntegerValues()
	 * @see #getBagValue()
	 * @generated
	 */
	EReference getBagValue_IntegerValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.BagValue#getItemReferenceValues <em>Item Reference Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item Reference Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.BagValue#getItemReferenceValues()
	 * @see #getBagValue()
	 * @generated
	 */
	EReference getBagValue_ItemReferenceValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.BagValue#getLocalizedTextValues <em>Localized Text Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Localized Text Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.BagValue#getLocalizedTextValues()
	 * @see #getBagValue()
	 * @generated
	 */
	EReference getBagValue_LocalizedTextValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.BagValue#getMeasureQualifiedNumberValues <em>Measure Qualified Number Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measure Qualified Number Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.BagValue#getMeasureQualifiedNumberValues()
	 * @see #getBagValue()
	 * @generated
	 */
	EReference getBagValue_MeasureQualifiedNumberValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.BagValue#getMeasureRangeValues <em>Measure Range Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measure Range Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.BagValue#getMeasureRangeValues()
	 * @see #getBagValue()
	 * @generated
	 */
	EReference getBagValue_MeasureRangeValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.BagValue#getMeasureSingleNumberValues <em>Measure Single Number Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measure Single Number Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.BagValue#getMeasureSingleNumberValues()
	 * @see #getBagValue()
	 * @generated
	 */
	EReference getBagValue_MeasureSingleNumberValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.BagValue#getNullValues <em>Null Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Null Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.BagValue#getNullValues()
	 * @see #getBagValue()
	 * @generated
	 */
	EReference getBagValue_NullValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.BagValue#getRationalValues <em>Rational Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rational Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.BagValue#getRationalValues()
	 * @see #getBagValue()
	 * @generated
	 */
	EReference getBagValue_RationalValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.BagValue#getRealValues <em>Real Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Real Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.BagValue#getRealValues()
	 * @see #getBagValue()
	 * @generated
	 */
	EReference getBagValue_RealValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.BagValue#getSequenceValues <em>Sequence Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequence Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.BagValue#getSequenceValues()
	 * @see #getBagValue()
	 * @generated
	 */
	EReference getBagValue_SequenceValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.BagValue#getSetValues <em>Set Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Set Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.BagValue#getSetValues()
	 * @see #getBagValue()
	 * @generated
	 */
	EReference getBagValue_SetValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.BagValue#getTimeValues <em>Time Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Time Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.BagValue#getTimeValues()
	 * @see #getBagValue()
	 * @generated
	 */
	EReference getBagValue_TimeValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.BagValue#getYearMonthValues <em>Year Month Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Year Month Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.BagValue#getYearMonthValues()
	 * @see #getBagValue()
	 * @generated
	 */
	EReference getBagValue_YearMonthValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.BagValue#getYearValues <em>Year Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Year Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.BagValue#getYearValues()
	 * @see #getBagValue()
	 * @generated
	 */
	EReference getBagValue_YearValues();

	/**
	 * Returns the meta object for class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.BooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.BooleanValue
	 * @generated
	 */
	EClass getBooleanValue();

	/**
	 * Returns the meta object for the attribute '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.BooleanValue#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.BooleanValue#isValue()
	 * @see #getBooleanValue()
	 * @generated
	 */
	EAttribute getBooleanValue_Value();

	/**
	 * Returns the meta object for class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.Combination <em>Combination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combination</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Combination
	 * @generated
	 */
	EClass getCombination();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.Combination#getStringValues <em>String Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>String Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Combination#getStringValues()
	 * @see #getCombination()
	 * @generated
	 */
	EReference getCombination_StringValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.Combination#getBagValues <em>Bag Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bag Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Combination#getBagValues()
	 * @see #getCombination()
	 * @generated
	 */
	EReference getCombination_BagValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.Combination#getBooleanValues <em>Boolean Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Boolean Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Combination#getBooleanValues()
	 * @see #getCombination()
	 * @generated
	 */
	EReference getCombination_BooleanValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.Combination#getComplexValues <em>Complex Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Complex Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Combination#getComplexValues()
	 * @see #getCombination()
	 * @generated
	 */
	EReference getCombination_ComplexValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.Combination#getCompositeValues <em>Composite Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composite Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Combination#getCompositeValues()
	 * @see #getCombination()
	 * @generated
	 */
	EReference getCombination_CompositeValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.Combination#getControlledValues <em>Controlled Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controlled Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Combination#getControlledValues()
	 * @see #getCombination()
	 * @generated
	 */
	EReference getCombination_ControlledValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.Combination#getCurrencyValues <em>Currency Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Currency Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Combination#getCurrencyValues()
	 * @see #getCombination()
	 * @generated
	 */
	EReference getCombination_CurrencyValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.Combination#getDateValues <em>Date Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Date Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Combination#getDateValues()
	 * @see #getCombination()
	 * @generated
	 */
	EReference getCombination_DateValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.Combination#getDateTimeValues <em>Date Time Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Date Time Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Combination#getDateTimeValues()
	 * @see #getCombination()
	 * @generated
	 */
	EReference getCombination_DateTimeValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.Combination#getFileValues <em>File Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>File Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Combination#getFileValues()
	 * @see #getCombination()
	 * @generated
	 */
	EReference getCombination_FileValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.Combination#getIntegerValues <em>Integer Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Integer Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Combination#getIntegerValues()
	 * @see #getCombination()
	 * @generated
	 */
	EReference getCombination_IntegerValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.Combination#getItemReferenceValues <em>Item Reference Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item Reference Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Combination#getItemReferenceValues()
	 * @see #getCombination()
	 * @generated
	 */
	EReference getCombination_ItemReferenceValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.Combination#getLocalizedTextValues <em>Localized Text Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Localized Text Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Combination#getLocalizedTextValues()
	 * @see #getCombination()
	 * @generated
	 */
	EReference getCombination_LocalizedTextValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.Combination#getMeasureQualifiedNumberValues <em>Measure Qualified Number Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measure Qualified Number Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Combination#getMeasureQualifiedNumberValues()
	 * @see #getCombination()
	 * @generated
	 */
	EReference getCombination_MeasureQualifiedNumberValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.Combination#getMeasureRangeValues <em>Measure Range Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measure Range Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Combination#getMeasureRangeValues()
	 * @see #getCombination()
	 * @generated
	 */
	EReference getCombination_MeasureRangeValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.Combination#getMeasureSingleNumberValues <em>Measure Single Number Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measure Single Number Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Combination#getMeasureSingleNumberValues()
	 * @see #getCombination()
	 * @generated
	 */
	EReference getCombination_MeasureSingleNumberValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.Combination#getNullValues <em>Null Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Null Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Combination#getNullValues()
	 * @see #getCombination()
	 * @generated
	 */
	EReference getCombination_NullValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.Combination#getRationalValues <em>Rational Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rational Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Combination#getRationalValues()
	 * @see #getCombination()
	 * @generated
	 */
	EReference getCombination_RationalValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.Combination#getRealValues <em>Real Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Real Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Combination#getRealValues()
	 * @see #getCombination()
	 * @generated
	 */
	EReference getCombination_RealValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.Combination#getSequenceValues <em>Sequence Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequence Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Combination#getSequenceValues()
	 * @see #getCombination()
	 * @generated
	 */
	EReference getCombination_SequenceValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.Combination#getSetValues <em>Set Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Set Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Combination#getSetValues()
	 * @see #getCombination()
	 * @generated
	 */
	EReference getCombination_SetValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.Combination#getTimeValues <em>Time Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Time Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Combination#getTimeValues()
	 * @see #getCombination()
	 * @generated
	 */
	EReference getCombination_TimeValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.Combination#getYearMonthValues <em>Year Month Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Year Month Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Combination#getYearMonthValues()
	 * @see #getCombination()
	 * @generated
	 */
	EReference getCombination_YearMonthValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.Combination#getYearValues <em>Year Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Year Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Combination#getYearValues()
	 * @see #getCombination()
	 * @generated
	 */
	EReference getCombination_YearValues();

	/**
	 * Returns the meta object for class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ComplexValue <em>Complex Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.ComplexValue
	 * @generated
	 */
	EClass getComplexValue();

	/**
	 * Returns the meta object for class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.CompositeValue <em>Composite Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.CompositeValue
	 * @generated
	 */
	EClass getCompositeValue();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.CompositeValue#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.CompositeValue#getFields()
	 * @see #getCompositeValue()
	 * @generated
	 */
	EReference getCompositeValue_Fields();

	/**
	 * Returns the meta object for class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement <em>Condition Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Element</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement
	 * @generated
	 */
	EClass getConditionElement();

	/**
	 * Returns the meta object for the attribute '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getPropertyRef <em>Property Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Ref</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getPropertyRef()
	 * @see #getConditionElement()
	 * @generated
	 */
	EAttribute getConditionElement_PropertyRef();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getStringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>String Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getStringValue()
	 * @see #getConditionElement()
	 * @generated
	 */
	EReference getConditionElement_StringValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getBagValue <em>Bag Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bag Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getBagValue()
	 * @see #getConditionElement()
	 * @generated
	 */
	EReference getConditionElement_BagValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getBooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Boolean Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getBooleanValue()
	 * @see #getConditionElement()
	 * @generated
	 */
	EReference getConditionElement_BooleanValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getComplexValue <em>Complex Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Complex Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getComplexValue()
	 * @see #getConditionElement()
	 * @generated
	 */
	EReference getConditionElement_ComplexValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getCompositeValue <em>Composite Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Composite Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getCompositeValue()
	 * @see #getConditionElement()
	 * @generated
	 */
	EReference getConditionElement_CompositeValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getControlledValue <em>Controlled Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Controlled Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getControlledValue()
	 * @see #getConditionElement()
	 * @generated
	 */
	EReference getConditionElement_ControlledValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getCurrencyValue <em>Currency Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Currency Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getCurrencyValue()
	 * @see #getConditionElement()
	 * @generated
	 */
	EReference getConditionElement_CurrencyValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getDateValue <em>Date Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getDateValue()
	 * @see #getConditionElement()
	 * @generated
	 */
	EReference getConditionElement_DateValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getDateTimeValue <em>Date Time Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date Time Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getDateTimeValue()
	 * @see #getConditionElement()
	 * @generated
	 */
	EReference getConditionElement_DateTimeValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getFileValue <em>File Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>File Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getFileValue()
	 * @see #getConditionElement()
	 * @generated
	 */
	EReference getConditionElement_FileValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getIntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Integer Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getIntegerValue()
	 * @see #getConditionElement()
	 * @generated
	 */
	EReference getConditionElement_IntegerValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getItemReferenceValue <em>Item Reference Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Item Reference Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getItemReferenceValue()
	 * @see #getConditionElement()
	 * @generated
	 */
	EReference getConditionElement_ItemReferenceValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getLocalizedTextValue <em>Localized Text Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Localized Text Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getLocalizedTextValue()
	 * @see #getConditionElement()
	 * @generated
	 */
	EReference getConditionElement_LocalizedTextValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getMeasureQualifiedNumberValue <em>Measure Qualified Number Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measure Qualified Number Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getMeasureQualifiedNumberValue()
	 * @see #getConditionElement()
	 * @generated
	 */
	EReference getConditionElement_MeasureQualifiedNumberValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getMeasureRangeValue <em>Measure Range Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measure Range Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getMeasureRangeValue()
	 * @see #getConditionElement()
	 * @generated
	 */
	EReference getConditionElement_MeasureRangeValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getMeasureSingleNumberValue <em>Measure Single Number Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measure Single Number Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getMeasureSingleNumberValue()
	 * @see #getConditionElement()
	 * @generated
	 */
	EReference getConditionElement_MeasureSingleNumberValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getNullValue <em>Null Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Null Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getNullValue()
	 * @see #getConditionElement()
	 * @generated
	 */
	EReference getConditionElement_NullValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getRationalValue <em>Rational Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rational Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getRationalValue()
	 * @see #getConditionElement()
	 * @generated
	 */
	EReference getConditionElement_RationalValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getRealValue <em>Real Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Real Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getRealValue()
	 * @see #getConditionElement()
	 * @generated
	 */
	EReference getConditionElement_RealValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getSequenceValue <em>Sequence Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getSequenceValue()
	 * @see #getConditionElement()
	 * @generated
	 */
	EReference getConditionElement_SequenceValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getSetValue <em>Set Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Set Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getSetValue()
	 * @see #getConditionElement()
	 * @generated
	 */
	EReference getConditionElement_SetValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getTimeValue <em>Time Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getTimeValue()
	 * @see #getConditionElement()
	 * @generated
	 */
	EReference getConditionElement_TimeValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getYearMonthValue <em>Year Month Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Year Month Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getYearMonthValue()
	 * @see #getConditionElement()
	 * @generated
	 */
	EReference getConditionElement_YearMonthValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getYearValue <em>Year Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Year Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.ConditionElement#getYearValue()
	 * @see #getConditionElement()
	 * @generated
	 */
	EReference getConditionElement_YearValue();

	/**
	 * Returns the meta object for class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ControlledValue <em>Controlled Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controlled Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.ControlledValue
	 * @generated
	 */
	EClass getControlledValue();

	/**
	 * Returns the meta object for the attribute '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ControlledValue#getValueCode <em>Value Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Code</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.ControlledValue#getValueCode()
	 * @see #getControlledValue()
	 * @generated
	 */
	EAttribute getControlledValue_ValueCode();

	/**
	 * Returns the meta object for the attribute '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ControlledValue#getValueRef <em>Value Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Ref</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.ControlledValue#getValueRef()
	 * @see #getControlledValue()
	 * @generated
	 */
	EAttribute getControlledValue_ValueRef();

	/**
	 * Returns the meta object for class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.CurrencyValue <em>Currency Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Currency Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.CurrencyValue
	 * @generated
	 */
	EClass getCurrencyValue();

	/**
	 * Returns the meta object for the attribute '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.CurrencyValue#getCurrencyCode <em>Currency Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency Code</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.CurrencyValue#getCurrencyCode()
	 * @see #getCurrencyValue()
	 * @generated
	 */
	EAttribute getCurrencyValue_CurrencyCode();

	/**
	 * Returns the meta object for the attribute '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.CurrencyValue#getCurrencyRef <em>Currency Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency Ref</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.CurrencyValue#getCurrencyRef()
	 * @see #getCurrencyValue()
	 * @generated
	 */
	EAttribute getCurrencyValue_CurrencyRef();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.CurrencyValue#getRealValue <em>Real Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Real Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.CurrencyValue#getRealValue()
	 * @see #getCurrencyValue()
	 * @generated
	 */
	EReference getCurrencyValue_RealValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.CurrencyValue#getComplexValue <em>Complex Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Complex Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.CurrencyValue#getComplexValue()
	 * @see #getCurrencyValue()
	 * @generated
	 */
	EReference getCurrencyValue_ComplexValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.CurrencyValue#getIntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Integer Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.CurrencyValue#getIntegerValue()
	 * @see #getCurrencyValue()
	 * @generated
	 */
	EReference getCurrencyValue_IntegerValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.CurrencyValue#getRationalValue <em>Rational Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rational Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.CurrencyValue#getRationalValue()
	 * @see #getCurrencyValue()
	 * @generated
	 */
	EReference getCurrencyValue_RationalValue();

	/**
	 * Returns the meta object for class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.DateTimeValue <em>Date Time Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Time Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.DateTimeValue
	 * @generated
	 */
	EClass getDateTimeValue();

	/**
	 * Returns the meta object for the attribute '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.DateTimeValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.DateTimeValue#getValue()
	 * @see #getDateTimeValue()
	 * @generated
	 */
	EAttribute getDateTimeValue_Value();

	/**
	 * Returns the meta object for class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.DateValue <em>Date Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.DateValue
	 * @generated
	 */
	EClass getDateValue();

	/**
	 * Returns the meta object for the attribute '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.DateValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.DateValue#getValue()
	 * @see #getDateValue()
	 * @generated
	 */
	EAttribute getDateValue_Value();

	/**
	 * Returns the meta object for class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.Environment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Environment
	 * @generated
	 */
	EClass getEnvironment();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.Environment#getPropertyValues <em>Property Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Environment#getPropertyValues()
	 * @see #getEnvironment()
	 * @generated
	 */
	EReference getEnvironment_PropertyValues();

	/**
	 * Returns the meta object for class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.Field#getPropertyRef <em>Property Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Ref</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Field#getPropertyRef()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_PropertyRef();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.Field#getStringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>String Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Field#getStringValue()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_StringValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.Field#getBagValue <em>Bag Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bag Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Field#getBagValue()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_BagValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.Field#getBooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Boolean Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Field#getBooleanValue()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_BooleanValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.Field#getComplexValue <em>Complex Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Complex Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Field#getComplexValue()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_ComplexValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.Field#getCompositeValue <em>Composite Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Composite Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Field#getCompositeValue()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_CompositeValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.Field#getControlledValue <em>Controlled Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Controlled Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Field#getControlledValue()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_ControlledValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.Field#getCurrencyValue <em>Currency Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Currency Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Field#getCurrencyValue()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_CurrencyValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.Field#getDateValue <em>Date Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Field#getDateValue()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_DateValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.Field#getDateTimeValue <em>Date Time Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date Time Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Field#getDateTimeValue()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_DateTimeValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.Field#getFileValue <em>File Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>File Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Field#getFileValue()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_FileValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.Field#getIntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Integer Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Field#getIntegerValue()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_IntegerValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.Field#getItemReferenceValue <em>Item Reference Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Item Reference Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Field#getItemReferenceValue()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_ItemReferenceValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.Field#getLocalizedTextValue <em>Localized Text Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Localized Text Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Field#getLocalizedTextValue()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_LocalizedTextValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.Field#getMeasureQualifiedNumberValue <em>Measure Qualified Number Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measure Qualified Number Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Field#getMeasureQualifiedNumberValue()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_MeasureQualifiedNumberValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.Field#getMeasureRangeValue <em>Measure Range Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measure Range Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Field#getMeasureRangeValue()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_MeasureRangeValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.Field#getMeasureSingleNumberValue <em>Measure Single Number Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measure Single Number Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Field#getMeasureSingleNumberValue()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_MeasureSingleNumberValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.Field#getNullValue <em>Null Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Null Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Field#getNullValue()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_NullValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.Field#getRationalValue <em>Rational Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rational Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Field#getRationalValue()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_RationalValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.Field#getRealValue <em>Real Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Real Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Field#getRealValue()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_RealValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.Field#getSequenceValue <em>Sequence Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Field#getSequenceValue()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_SequenceValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.Field#getSetValue <em>Set Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Set Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Field#getSetValue()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_SetValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.Field#getTimeValue <em>Time Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Field#getTimeValue()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_TimeValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.Field#getYearMonthValue <em>Year Month Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Year Month Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Field#getYearMonthValue()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_YearMonthValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.Field#getYearValue <em>Year Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Year Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.Field#getYearValue()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_YearValue();

	/**
	 * Returns the meta object for class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.FileValue <em>File Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.FileValue
	 * @generated
	 */
	EClass getFileValue();

	/**
	 * Returns the meta object for the attribute '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.FileValue#getURI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URI</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.FileValue#getURI()
	 * @see #getFileValue()
	 * @generated
	 */
	EAttribute getFileValue_URI();

	/**
	 * Returns the meta object for class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.IntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.IntegerValue
	 * @generated
	 */
	EClass getIntegerValue();

	/**
	 * Returns the meta object for the attribute '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.IntegerValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.IntegerValue#getValue()
	 * @see #getIntegerValue()
	 * @generated
	 */
	EAttribute getIntegerValue_Value();

	/**
	 * Returns the meta object for class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ItemReferenceValue <em>Item Reference Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Reference Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.ItemReferenceValue
	 * @generated
	 */
	EClass getItemReferenceValue();

	/**
	 * Returns the meta object for the reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.ItemReferenceValue#getItemLocalRef <em>Item Local Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Item Local Ref</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.ItemReferenceValue#getItemLocalRef()
	 * @see #getItemReferenceValue()
	 * @generated
	 */
	EReference getItemReferenceValue_ItemLocalRef();

	/**
	 * Returns the meta object for class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.LocalizedTextValue <em>Localized Text Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Localized Text Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.LocalizedTextValue
	 * @generated
	 */
	EClass getLocalizedTextValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.LocalizedTextValue#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.LocalizedTextValue#getContent()
	 * @see #getLocalizedTextValue()
	 * @generated
	 */
	EReference getLocalizedTextValue_Content();

	/**
	 * Returns the meta object for class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.MeasureQualifiedNumberValue <em>Measure Qualified Number Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure Qualified Number Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.MeasureQualifiedNumberValue
	 * @generated
	 */
	EClass getMeasureQualifiedNumberValue();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.MeasureQualifiedNumberValue#getQualifiedValues <em>Qualified Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Qualified Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.MeasureQualifiedNumberValue#getQualifiedValues()
	 * @see #getMeasureQualifiedNumberValue()
	 * @generated
	 */
	EReference getMeasureQualifiedNumberValue_QualifiedValues();

	/**
	 * Returns the meta object for class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.MeasureRangeValue <em>Measure Range Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure Range Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.MeasureRangeValue
	 * @generated
	 */
	EClass getMeasureRangeValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.MeasureRangeValue#getLowerValue <em>Lower Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lower Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.MeasureRangeValue#getLowerValue()
	 * @see #getMeasureRangeValue()
	 * @generated
	 */
	EReference getMeasureRangeValue_LowerValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.MeasureRangeValue#getUpperValue <em>Upper Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upper Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.MeasureRangeValue#getUpperValue()
	 * @see #getMeasureRangeValue()
	 * @generated
	 */
	EReference getMeasureRangeValue_UpperValue();

	/**
	 * Returns the meta object for class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.MeasureSingleNumberValue <em>Measure Single Number Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure Single Number Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.MeasureSingleNumberValue
	 * @generated
	 */
	EClass getMeasureSingleNumberValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.MeasureSingleNumberValue#getRealValue <em>Real Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Real Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.MeasureSingleNumberValue#getRealValue()
	 * @see #getMeasureSingleNumberValue()
	 * @generated
	 */
	EReference getMeasureSingleNumberValue_RealValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.MeasureSingleNumberValue#getComplexValue <em>Complex Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Complex Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.MeasureSingleNumberValue#getComplexValue()
	 * @see #getMeasureSingleNumberValue()
	 * @generated
	 */
	EReference getMeasureSingleNumberValue_ComplexValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.MeasureSingleNumberValue#getIntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Integer Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.MeasureSingleNumberValue#getIntegerValue()
	 * @see #getMeasureSingleNumberValue()
	 * @generated
	 */
	EReference getMeasureSingleNumberValue_IntegerValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.MeasureSingleNumberValue#getRationalValue <em>Rational Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rational Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.MeasureSingleNumberValue#getRationalValue()
	 * @see #getMeasureSingleNumberValue()
	 * @generated
	 */
	EReference getMeasureSingleNumberValue_RationalValue();

	/**
	 * Returns the meta object for class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.MeasureValue <em>Measure Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.MeasureValue
	 * @generated
	 */
	EClass getMeasureValue();

	/**
	 * Returns the meta object for the attribute '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.MeasureValue#getUOMCode <em>UOM Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>UOM Code</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.MeasureValue#getUOMCode()
	 * @see #getMeasureValue()
	 * @generated
	 */
	EAttribute getMeasureValue_UOMCode();

	/**
	 * Returns the meta object for the attribute '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.MeasureValue#getUOMRef <em>UOM Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>UOM Ref</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.MeasureValue#getUOMRef()
	 * @see #getMeasureValue()
	 * @generated
	 */
	EAttribute getMeasureValue_UOMRef();

	/**
	 * Returns the meta object for class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.NullValue <em>Null Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Null Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.NullValue
	 * @generated
	 */
	EClass getNullValue();

	/**
	 * Returns the meta object for class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.NumericValue <em>Numeric Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.NumericValue
	 * @generated
	 */
	EClass getNumericValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.NumericValue#getRealValue <em>Real Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Real Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.NumericValue#getRealValue()
	 * @see #getNumericValue()
	 * @generated
	 */
	EReference getNumericValue_RealValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.NumericValue#getComplexValue <em>Complex Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Complex Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.NumericValue#getComplexValue()
	 * @see #getNumericValue()
	 * @generated
	 */
	EReference getNumericValue_ComplexValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.NumericValue#getIntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Integer Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.NumericValue#getIntegerValue()
	 * @see #getNumericValue()
	 * @generated
	 */
	EReference getNumericValue_IntegerValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.NumericValue#getRationalValue <em>Rational Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rational Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.NumericValue#getRationalValue()
	 * @see #getNumericValue()
	 * @generated
	 */
	EReference getNumericValue_RationalValue();

	/**
	 * Returns the meta object for class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.OneOf <em>One Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>One Of</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.OneOf
	 * @generated
	 */
	EClass getOneOf();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.OneOf#getCombinations <em>Combinations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Combinations</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.OneOf#getCombinations()
	 * @see #getOneOf()
	 * @generated
	 */
	EReference getOneOf_Combinations();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.OneOf#getStringValues <em>String Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>String Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.OneOf#getStringValues()
	 * @see #getOneOf()
	 * @generated
	 */
	EReference getOneOf_StringValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.OneOf#getBagValues <em>Bag Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bag Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.OneOf#getBagValues()
	 * @see #getOneOf()
	 * @generated
	 */
	EReference getOneOf_BagValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.OneOf#getBooleanValues <em>Boolean Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Boolean Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.OneOf#getBooleanValues()
	 * @see #getOneOf()
	 * @generated
	 */
	EReference getOneOf_BooleanValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.OneOf#getComplexValues <em>Complex Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Complex Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.OneOf#getComplexValues()
	 * @see #getOneOf()
	 * @generated
	 */
	EReference getOneOf_ComplexValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.OneOf#getCompositeValues <em>Composite Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composite Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.OneOf#getCompositeValues()
	 * @see #getOneOf()
	 * @generated
	 */
	EReference getOneOf_CompositeValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.OneOf#getControlledValues <em>Controlled Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controlled Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.OneOf#getControlledValues()
	 * @see #getOneOf()
	 * @generated
	 */
	EReference getOneOf_ControlledValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.OneOf#getCurrencyValues <em>Currency Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Currency Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.OneOf#getCurrencyValues()
	 * @see #getOneOf()
	 * @generated
	 */
	EReference getOneOf_CurrencyValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.OneOf#getDateValues <em>Date Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Date Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.OneOf#getDateValues()
	 * @see #getOneOf()
	 * @generated
	 */
	EReference getOneOf_DateValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.OneOf#getDateTimeValues <em>Date Time Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Date Time Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.OneOf#getDateTimeValues()
	 * @see #getOneOf()
	 * @generated
	 */
	EReference getOneOf_DateTimeValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.OneOf#getFileValues <em>File Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>File Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.OneOf#getFileValues()
	 * @see #getOneOf()
	 * @generated
	 */
	EReference getOneOf_FileValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.OneOf#getIntegerValues <em>Integer Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Integer Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.OneOf#getIntegerValues()
	 * @see #getOneOf()
	 * @generated
	 */
	EReference getOneOf_IntegerValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.OneOf#getItemReferenceValues <em>Item Reference Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item Reference Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.OneOf#getItemReferenceValues()
	 * @see #getOneOf()
	 * @generated
	 */
	EReference getOneOf_ItemReferenceValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.OneOf#getLocalizedTextValues <em>Localized Text Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Localized Text Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.OneOf#getLocalizedTextValues()
	 * @see #getOneOf()
	 * @generated
	 */
	EReference getOneOf_LocalizedTextValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.OneOf#getMeasureQualifiedNumberValues <em>Measure Qualified Number Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measure Qualified Number Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.OneOf#getMeasureQualifiedNumberValues()
	 * @see #getOneOf()
	 * @generated
	 */
	EReference getOneOf_MeasureQualifiedNumberValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.OneOf#getMeasureRangeValues <em>Measure Range Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measure Range Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.OneOf#getMeasureRangeValues()
	 * @see #getOneOf()
	 * @generated
	 */
	EReference getOneOf_MeasureRangeValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.OneOf#getMeasureSingleNumberValues <em>Measure Single Number Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measure Single Number Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.OneOf#getMeasureSingleNumberValues()
	 * @see #getOneOf()
	 * @generated
	 */
	EReference getOneOf_MeasureSingleNumberValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.OneOf#getNullValues <em>Null Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Null Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.OneOf#getNullValues()
	 * @see #getOneOf()
	 * @generated
	 */
	EReference getOneOf_NullValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.OneOf#getRationalValues <em>Rational Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rational Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.OneOf#getRationalValues()
	 * @see #getOneOf()
	 * @generated
	 */
	EReference getOneOf_RationalValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.OneOf#getRealValues <em>Real Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Real Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.OneOf#getRealValues()
	 * @see #getOneOf()
	 * @generated
	 */
	EReference getOneOf_RealValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.OneOf#getSequenceValues <em>Sequence Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequence Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.OneOf#getSequenceValues()
	 * @see #getOneOf()
	 * @generated
	 */
	EReference getOneOf_SequenceValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.OneOf#getSetValues <em>Set Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Set Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.OneOf#getSetValues()
	 * @see #getOneOf()
	 * @generated
	 */
	EReference getOneOf_SetValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.OneOf#getTimeValues <em>Time Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Time Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.OneOf#getTimeValues()
	 * @see #getOneOf()
	 * @generated
	 */
	EReference getOneOf_TimeValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.OneOf#getYearMonthValues <em>Year Month Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Year Month Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.OneOf#getYearMonthValues()
	 * @see #getOneOf()
	 * @generated
	 */
	EReference getOneOf_YearMonthValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.OneOf#getYearValues <em>Year Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Year Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.OneOf#getYearValues()
	 * @see #getOneOf()
	 * @generated
	 */
	EReference getOneOf_YearValues();

	/**
	 * Returns the meta object for class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.QualifiedValue <em>Qualified Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualified Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.QualifiedValue
	 * @generated
	 */
	EClass getQualifiedValue();

	/**
	 * Returns the meta object for the attribute '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.QualifiedValue#getQualifierCode <em>Qualifier Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualifier Code</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.QualifiedValue#getQualifierCode()
	 * @see #getQualifiedValue()
	 * @generated
	 */
	EAttribute getQualifiedValue_QualifierCode();

	/**
	 * Returns the meta object for the attribute '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.QualifiedValue#getQualifierRef <em>Qualifier Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualifier Ref</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.QualifiedValue#getQualifierRef()
	 * @see #getQualifiedValue()
	 * @generated
	 */
	EAttribute getQualifiedValue_QualifierRef();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.QualifiedValue#getRealValue <em>Real Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Real Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.QualifiedValue#getRealValue()
	 * @see #getQualifiedValue()
	 * @generated
	 */
	EReference getQualifiedValue_RealValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.QualifiedValue#getComplexValue <em>Complex Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Complex Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.QualifiedValue#getComplexValue()
	 * @see #getQualifiedValue()
	 * @generated
	 */
	EReference getQualifiedValue_ComplexValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.QualifiedValue#getIntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Integer Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.QualifiedValue#getIntegerValue()
	 * @see #getQualifiedValue()
	 * @generated
	 */
	EReference getQualifiedValue_IntegerValue();

	/**
	 * Returns the meta object for the containment reference '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.QualifiedValue#getRationalValue <em>Rational Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rational Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.QualifiedValue#getRationalValue()
	 * @see #getQualifiedValue()
	 * @generated
	 */
	EReference getQualifiedValue_RationalValue();

	/**
	 * Returns the meta object for class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.RationalValue <em>Rational Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rational Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.RationalValue
	 * @generated
	 */
	EClass getRationalValue();

	/**
	 * Returns the meta object for the attribute '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.RationalValue#getWholePart <em>Whole Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Whole Part</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.RationalValue#getWholePart()
	 * @see #getRationalValue()
	 * @generated
	 */
	EAttribute getRationalValue_WholePart();

	/**
	 * Returns the meta object for the attribute '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.RationalValue#getNumerator <em>Numerator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numerator</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.RationalValue#getNumerator()
	 * @see #getRationalValue()
	 * @generated
	 */
	EAttribute getRationalValue_Numerator();

	/**
	 * Returns the meta object for the attribute '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.RationalValue#getDenominator <em>Denominator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Denominator</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.RationalValue#getDenominator()
	 * @see #getRationalValue()
	 * @generated
	 */
	EAttribute getRationalValue_Denominator();

	/**
	 * Returns the meta object for class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.RealValue <em>Real Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.RealValue
	 * @generated
	 */
	EClass getRealValue();

	/**
	 * Returns the meta object for class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.SequenceValue <em>Sequence Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.SequenceValue
	 * @generated
	 */
	EClass getSequenceValue();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.SequenceValue#getStringValues <em>String Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>String Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.SequenceValue#getStringValues()
	 * @see #getSequenceValue()
	 * @generated
	 */
	EReference getSequenceValue_StringValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.SequenceValue#getBagValues <em>Bag Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bag Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.SequenceValue#getBagValues()
	 * @see #getSequenceValue()
	 * @generated
	 */
	EReference getSequenceValue_BagValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.SequenceValue#getBooleanValues <em>Boolean Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Boolean Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.SequenceValue#getBooleanValues()
	 * @see #getSequenceValue()
	 * @generated
	 */
	EReference getSequenceValue_BooleanValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.SequenceValue#getComplexValues <em>Complex Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Complex Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.SequenceValue#getComplexValues()
	 * @see #getSequenceValue()
	 * @generated
	 */
	EReference getSequenceValue_ComplexValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.SequenceValue#getCompositeValues <em>Composite Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composite Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.SequenceValue#getCompositeValues()
	 * @see #getSequenceValue()
	 * @generated
	 */
	EReference getSequenceValue_CompositeValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.SequenceValue#getControlledValues <em>Controlled Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controlled Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.SequenceValue#getControlledValues()
	 * @see #getSequenceValue()
	 * @generated
	 */
	EReference getSequenceValue_ControlledValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.SequenceValue#getCurrencyValues <em>Currency Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Currency Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.SequenceValue#getCurrencyValues()
	 * @see #getSequenceValue()
	 * @generated
	 */
	EReference getSequenceValue_CurrencyValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.SequenceValue#getDateValues <em>Date Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Date Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.SequenceValue#getDateValues()
	 * @see #getSequenceValue()
	 * @generated
	 */
	EReference getSequenceValue_DateValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.SequenceValue#getDateTimeValues <em>Date Time Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Date Time Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.SequenceValue#getDateTimeValues()
	 * @see #getSequenceValue()
	 * @generated
	 */
	EReference getSequenceValue_DateTimeValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.SequenceValue#getFileValues <em>File Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>File Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.SequenceValue#getFileValues()
	 * @see #getSequenceValue()
	 * @generated
	 */
	EReference getSequenceValue_FileValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.SequenceValue#getIntegerValues <em>Integer Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Integer Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.SequenceValue#getIntegerValues()
	 * @see #getSequenceValue()
	 * @generated
	 */
	EReference getSequenceValue_IntegerValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.SequenceValue#getItemReferenceValues <em>Item Reference Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item Reference Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.SequenceValue#getItemReferenceValues()
	 * @see #getSequenceValue()
	 * @generated
	 */
	EReference getSequenceValue_ItemReferenceValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.SequenceValue#getLocalizedTextValues <em>Localized Text Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Localized Text Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.SequenceValue#getLocalizedTextValues()
	 * @see #getSequenceValue()
	 * @generated
	 */
	EReference getSequenceValue_LocalizedTextValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.SequenceValue#getMeasureQualifiedNumberValues <em>Measure Qualified Number Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measure Qualified Number Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.SequenceValue#getMeasureQualifiedNumberValues()
	 * @see #getSequenceValue()
	 * @generated
	 */
	EReference getSequenceValue_MeasureQualifiedNumberValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.SequenceValue#getMeasureRangeValues <em>Measure Range Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measure Range Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.SequenceValue#getMeasureRangeValues()
	 * @see #getSequenceValue()
	 * @generated
	 */
	EReference getSequenceValue_MeasureRangeValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.SequenceValue#getMeasureSingleNumberValues <em>Measure Single Number Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measure Single Number Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.SequenceValue#getMeasureSingleNumberValues()
	 * @see #getSequenceValue()
	 * @generated
	 */
	EReference getSequenceValue_MeasureSingleNumberValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.SequenceValue#getNullValues <em>Null Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Null Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.SequenceValue#getNullValues()
	 * @see #getSequenceValue()
	 * @generated
	 */
	EReference getSequenceValue_NullValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.SequenceValue#getRationalValues <em>Rational Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rational Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.SequenceValue#getRationalValues()
	 * @see #getSequenceValue()
	 * @generated
	 */
	EReference getSequenceValue_RationalValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.SequenceValue#getRealValues <em>Real Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Real Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.SequenceValue#getRealValues()
	 * @see #getSequenceValue()
	 * @generated
	 */
	EReference getSequenceValue_RealValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.SequenceValue#getSequenceValues <em>Sequence Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequence Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.SequenceValue#getSequenceValues()
	 * @see #getSequenceValue()
	 * @generated
	 */
	EReference getSequenceValue_SequenceValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.SequenceValue#getSetValues <em>Set Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Set Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.SequenceValue#getSetValues()
	 * @see #getSequenceValue()
	 * @generated
	 */
	EReference getSequenceValue_SetValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.SequenceValue#getTimeValues <em>Time Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Time Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.SequenceValue#getTimeValues()
	 * @see #getSequenceValue()
	 * @generated
	 */
	EReference getSequenceValue_TimeValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.SequenceValue#getYearMonthValues <em>Year Month Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Year Month Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.SequenceValue#getYearMonthValues()
	 * @see #getSequenceValue()
	 * @generated
	 */
	EReference getSequenceValue_YearMonthValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.SequenceValue#getYearValues <em>Year Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Year Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.SequenceValue#getYearValues()
	 * @see #getSequenceValue()
	 * @generated
	 */
	EReference getSequenceValue_YearValues();

	/**
	 * Returns the meta object for class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.SetValue <em>Set Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.SetValue
	 * @generated
	 */
	EClass getSetValue();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.SetValue#getStringValues <em>String Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>String Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.SetValue#getStringValues()
	 * @see #getSetValue()
	 * @generated
	 */
	EReference getSetValue_StringValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.SetValue#getBagValues <em>Bag Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bag Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.SetValue#getBagValues()
	 * @see #getSetValue()
	 * @generated
	 */
	EReference getSetValue_BagValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.SetValue#getBooleanValues <em>Boolean Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Boolean Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.SetValue#getBooleanValues()
	 * @see #getSetValue()
	 * @generated
	 */
	EReference getSetValue_BooleanValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.SetValue#getComplexValues <em>Complex Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Complex Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.SetValue#getComplexValues()
	 * @see #getSetValue()
	 * @generated
	 */
	EReference getSetValue_ComplexValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.SetValue#getCompositeValues <em>Composite Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composite Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.SetValue#getCompositeValues()
	 * @see #getSetValue()
	 * @generated
	 */
	EReference getSetValue_CompositeValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.SetValue#getControlledValues <em>Controlled Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controlled Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.SetValue#getControlledValues()
	 * @see #getSetValue()
	 * @generated
	 */
	EReference getSetValue_ControlledValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.SetValue#getCurrencyValues <em>Currency Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Currency Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.SetValue#getCurrencyValues()
	 * @see #getSetValue()
	 * @generated
	 */
	EReference getSetValue_CurrencyValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.SetValue#getDateValues <em>Date Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Date Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.SetValue#getDateValues()
	 * @see #getSetValue()
	 * @generated
	 */
	EReference getSetValue_DateValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.SetValue#getDateTimeValues <em>Date Time Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Date Time Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.SetValue#getDateTimeValues()
	 * @see #getSetValue()
	 * @generated
	 */
	EReference getSetValue_DateTimeValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.SetValue#getFileValues <em>File Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>File Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.SetValue#getFileValues()
	 * @see #getSetValue()
	 * @generated
	 */
	EReference getSetValue_FileValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.SetValue#getIntegerValues <em>Integer Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Integer Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.SetValue#getIntegerValues()
	 * @see #getSetValue()
	 * @generated
	 */
	EReference getSetValue_IntegerValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.SetValue#getItemReferenceValues <em>Item Reference Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item Reference Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.SetValue#getItemReferenceValues()
	 * @see #getSetValue()
	 * @generated
	 */
	EReference getSetValue_ItemReferenceValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.SetValue#getLocalizedTextValues <em>Localized Text Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Localized Text Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.SetValue#getLocalizedTextValues()
	 * @see #getSetValue()
	 * @generated
	 */
	EReference getSetValue_LocalizedTextValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.SetValue#getMeasureQualifiedNumberValues <em>Measure Qualified Number Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measure Qualified Number Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.SetValue#getMeasureQualifiedNumberValues()
	 * @see #getSetValue()
	 * @generated
	 */
	EReference getSetValue_MeasureQualifiedNumberValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.SetValue#getMeasureRangeValues <em>Measure Range Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measure Range Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.SetValue#getMeasureRangeValues()
	 * @see #getSetValue()
	 * @generated
	 */
	EReference getSetValue_MeasureRangeValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.SetValue#getMeasureSingleNumberValues <em>Measure Single Number Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measure Single Number Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.SetValue#getMeasureSingleNumberValues()
	 * @see #getSetValue()
	 * @generated
	 */
	EReference getSetValue_MeasureSingleNumberValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.SetValue#getNullValues <em>Null Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Null Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.SetValue#getNullValues()
	 * @see #getSetValue()
	 * @generated
	 */
	EReference getSetValue_NullValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.SetValue#getRationalValues <em>Rational Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rational Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.SetValue#getRationalValues()
	 * @see #getSetValue()
	 * @generated
	 */
	EReference getSetValue_RationalValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.SetValue#getRealValues <em>Real Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Real Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.SetValue#getRealValues()
	 * @see #getSetValue()
	 * @generated
	 */
	EReference getSetValue_RealValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.SetValue#getSequenceValues <em>Sequence Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequence Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.SetValue#getSequenceValues()
	 * @see #getSetValue()
	 * @generated
	 */
	EReference getSetValue_SequenceValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.SetValue#getSetValues <em>Set Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Set Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.SetValue#getSetValues()
	 * @see #getSetValue()
	 * @generated
	 */
	EReference getSetValue_SetValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.SetValue#getTimeValues <em>Time Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Time Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.SetValue#getTimeValues()
	 * @see #getSetValue()
	 * @generated
	 */
	EReference getSetValue_TimeValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.SetValue#getYearMonthValues <em>Year Month Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Year Month Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.SetValue#getYearMonthValues()
	 * @see #getSetValue()
	 * @generated
	 */
	EReference getSetValue_YearMonthValues();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.SetValue#getYearValues <em>Year Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Year Values</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.SetValue#getYearValues()
	 * @see #getSetValue()
	 * @generated
	 */
	EReference getSetValue_YearValues();

	/**
	 * Returns the meta object for class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.StringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.StringValue
	 * @generated
	 */
	EClass getStringValue();

	/**
	 * Returns the meta object for the attribute '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.StringValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.StringValue#getValue()
	 * @see #getStringValue()
	 * @generated
	 */
	EAttribute getStringValue_Value();

	/**
	 * Returns the meta object for class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.TimeValue <em>Time Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.TimeValue
	 * @generated
	 */
	EClass getTimeValue();

	/**
	 * Returns the meta object for the attribute '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.TimeValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.TimeValue#getValue()
	 * @see #getTimeValue()
	 * @generated
	 */
	EAttribute getTimeValue_Value();

	/**
	 * Returns the meta object for class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.YearMonthValue <em>Year Month Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Year Month Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.YearMonthValue
	 * @generated
	 */
	EClass getYearMonthValue();

	/**
	 * Returns the meta object for the attribute '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.YearMonthValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.YearMonthValue#getValue()
	 * @see #getYearMonthValue()
	 * @generated
	 */
	EAttribute getYearMonthValue_Value();

	/**
	 * Returns the meta object for class '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.YearValue <em>Year Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Year Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.YearValue
	 * @generated
	 */
	EClass getYearValue();

	/**
	 * Returns the meta object for the attribute '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.YearValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.YearValue#getValue()
	 * @see #getYearValue()
	 * @generated
	 */
	EAttribute getYearValue_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedFactory getIsostdisots_29002_10ed_1techxmlschemavalueSimplifiedFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.BagValueImpl <em>Bag Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.BagValueImpl
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getBagValue()
		 * @generated
		 */
		EClass BAG_VALUE = eINSTANCE.getBagValue();

		/**
		 * The meta object literal for the '<em><b>String Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_VALUE__STRING_VALUES = eINSTANCE.getBagValue_StringValues();

		/**
		 * The meta object literal for the '<em><b>Bag Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_VALUE__BAG_VALUES = eINSTANCE.getBagValue_BagValues();

		/**
		 * The meta object literal for the '<em><b>Boolean Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_VALUE__BOOLEAN_VALUES = eINSTANCE.getBagValue_BooleanValues();

		/**
		 * The meta object literal for the '<em><b>Complex Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_VALUE__COMPLEX_VALUES = eINSTANCE.getBagValue_ComplexValues();

		/**
		 * The meta object literal for the '<em><b>Composite Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_VALUE__COMPOSITE_VALUES = eINSTANCE.getBagValue_CompositeValues();

		/**
		 * The meta object literal for the '<em><b>Controlled Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_VALUE__CONTROLLED_VALUES = eINSTANCE.getBagValue_ControlledValues();

		/**
		 * The meta object literal for the '<em><b>Currency Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_VALUE__CURRENCY_VALUES = eINSTANCE.getBagValue_CurrencyValues();

		/**
		 * The meta object literal for the '<em><b>Date Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_VALUE__DATE_VALUES = eINSTANCE.getBagValue_DateValues();

		/**
		 * The meta object literal for the '<em><b>Date Time Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_VALUE__DATE_TIME_VALUES = eINSTANCE.getBagValue_DateTimeValues();

		/**
		 * The meta object literal for the '<em><b>File Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_VALUE__FILE_VALUES = eINSTANCE.getBagValue_FileValues();

		/**
		 * The meta object literal for the '<em><b>Integer Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_VALUE__INTEGER_VALUES = eINSTANCE.getBagValue_IntegerValues();

		/**
		 * The meta object literal for the '<em><b>Item Reference Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_VALUE__ITEM_REFERENCE_VALUES = eINSTANCE.getBagValue_ItemReferenceValues();

		/**
		 * The meta object literal for the '<em><b>Localized Text Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_VALUE__LOCALIZED_TEXT_VALUES = eINSTANCE.getBagValue_LocalizedTextValues();

		/**
		 * The meta object literal for the '<em><b>Measure Qualified Number Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_VALUE__MEASURE_QUALIFIED_NUMBER_VALUES = eINSTANCE.getBagValue_MeasureQualifiedNumberValues();

		/**
		 * The meta object literal for the '<em><b>Measure Range Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_VALUE__MEASURE_RANGE_VALUES = eINSTANCE.getBagValue_MeasureRangeValues();

		/**
		 * The meta object literal for the '<em><b>Measure Single Number Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_VALUE__MEASURE_SINGLE_NUMBER_VALUES = eINSTANCE.getBagValue_MeasureSingleNumberValues();

		/**
		 * The meta object literal for the '<em><b>Null Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_VALUE__NULL_VALUES = eINSTANCE.getBagValue_NullValues();

		/**
		 * The meta object literal for the '<em><b>Rational Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_VALUE__RATIONAL_VALUES = eINSTANCE.getBagValue_RationalValues();

		/**
		 * The meta object literal for the '<em><b>Real Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_VALUE__REAL_VALUES = eINSTANCE.getBagValue_RealValues();

		/**
		 * The meta object literal for the '<em><b>Sequence Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_VALUE__SEQUENCE_VALUES = eINSTANCE.getBagValue_SequenceValues();

		/**
		 * The meta object literal for the '<em><b>Set Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_VALUE__SET_VALUES = eINSTANCE.getBagValue_SetValues();

		/**
		 * The meta object literal for the '<em><b>Time Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_VALUE__TIME_VALUES = eINSTANCE.getBagValue_TimeValues();

		/**
		 * The meta object literal for the '<em><b>Year Month Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_VALUE__YEAR_MONTH_VALUES = eINSTANCE.getBagValue_YearMonthValues();

		/**
		 * The meta object literal for the '<em><b>Year Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_VALUE__YEAR_VALUES = eINSTANCE.getBagValue_YearValues();

		/**
		 * The meta object literal for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.BooleanValueImpl
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getBooleanValue()
		 * @generated
		 */
		EClass BOOLEAN_VALUE = eINSTANCE.getBooleanValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_VALUE__VALUE = eINSTANCE.getBooleanValue_Value();

		/**
		 * The meta object literal for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.CombinationImpl <em>Combination</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.CombinationImpl
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getCombination()
		 * @generated
		 */
		EClass COMBINATION = eINSTANCE.getCombination();

		/**
		 * The meta object literal for the '<em><b>String Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINATION__STRING_VALUES = eINSTANCE.getCombination_StringValues();

		/**
		 * The meta object literal for the '<em><b>Bag Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINATION__BAG_VALUES = eINSTANCE.getCombination_BagValues();

		/**
		 * The meta object literal for the '<em><b>Boolean Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINATION__BOOLEAN_VALUES = eINSTANCE.getCombination_BooleanValues();

		/**
		 * The meta object literal for the '<em><b>Complex Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINATION__COMPLEX_VALUES = eINSTANCE.getCombination_ComplexValues();

		/**
		 * The meta object literal for the '<em><b>Composite Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINATION__COMPOSITE_VALUES = eINSTANCE.getCombination_CompositeValues();

		/**
		 * The meta object literal for the '<em><b>Controlled Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINATION__CONTROLLED_VALUES = eINSTANCE.getCombination_ControlledValues();

		/**
		 * The meta object literal for the '<em><b>Currency Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINATION__CURRENCY_VALUES = eINSTANCE.getCombination_CurrencyValues();

		/**
		 * The meta object literal for the '<em><b>Date Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINATION__DATE_VALUES = eINSTANCE.getCombination_DateValues();

		/**
		 * The meta object literal for the '<em><b>Date Time Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINATION__DATE_TIME_VALUES = eINSTANCE.getCombination_DateTimeValues();

		/**
		 * The meta object literal for the '<em><b>File Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINATION__FILE_VALUES = eINSTANCE.getCombination_FileValues();

		/**
		 * The meta object literal for the '<em><b>Integer Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINATION__INTEGER_VALUES = eINSTANCE.getCombination_IntegerValues();

		/**
		 * The meta object literal for the '<em><b>Item Reference Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINATION__ITEM_REFERENCE_VALUES = eINSTANCE.getCombination_ItemReferenceValues();

		/**
		 * The meta object literal for the '<em><b>Localized Text Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINATION__LOCALIZED_TEXT_VALUES = eINSTANCE.getCombination_LocalizedTextValues();

		/**
		 * The meta object literal for the '<em><b>Measure Qualified Number Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINATION__MEASURE_QUALIFIED_NUMBER_VALUES = eINSTANCE.getCombination_MeasureQualifiedNumberValues();

		/**
		 * The meta object literal for the '<em><b>Measure Range Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINATION__MEASURE_RANGE_VALUES = eINSTANCE.getCombination_MeasureRangeValues();

		/**
		 * The meta object literal for the '<em><b>Measure Single Number Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINATION__MEASURE_SINGLE_NUMBER_VALUES = eINSTANCE.getCombination_MeasureSingleNumberValues();

		/**
		 * The meta object literal for the '<em><b>Null Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINATION__NULL_VALUES = eINSTANCE.getCombination_NullValues();

		/**
		 * The meta object literal for the '<em><b>Rational Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINATION__RATIONAL_VALUES = eINSTANCE.getCombination_RationalValues();

		/**
		 * The meta object literal for the '<em><b>Real Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINATION__REAL_VALUES = eINSTANCE.getCombination_RealValues();

		/**
		 * The meta object literal for the '<em><b>Sequence Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINATION__SEQUENCE_VALUES = eINSTANCE.getCombination_SequenceValues();

		/**
		 * The meta object literal for the '<em><b>Set Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINATION__SET_VALUES = eINSTANCE.getCombination_SetValues();

		/**
		 * The meta object literal for the '<em><b>Time Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINATION__TIME_VALUES = eINSTANCE.getCombination_TimeValues();

		/**
		 * The meta object literal for the '<em><b>Year Month Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINATION__YEAR_MONTH_VALUES = eINSTANCE.getCombination_YearMonthValues();

		/**
		 * The meta object literal for the '<em><b>Year Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINATION__YEAR_VALUES = eINSTANCE.getCombination_YearValues();

		/**
		 * The meta object literal for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.ComplexValueImpl <em>Complex Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.ComplexValueImpl
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getComplexValue()
		 * @generated
		 */
		EClass COMPLEX_VALUE = eINSTANCE.getComplexValue();

		/**
		 * The meta object literal for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.CompositeValueImpl <em>Composite Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.CompositeValueImpl
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getCompositeValue()
		 * @generated
		 */
		EClass COMPOSITE_VALUE = eINSTANCE.getCompositeValue();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_VALUE__FIELDS = eINSTANCE.getCompositeValue_Fields();

		/**
		 * The meta object literal for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.ConditionElementImpl <em>Condition Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.ConditionElementImpl
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getConditionElement()
		 * @generated
		 */
		EClass CONDITION_ELEMENT = eINSTANCE.getConditionElement();

		/**
		 * The meta object literal for the '<em><b>Property Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_ELEMENT__PROPERTY_REF = eINSTANCE.getConditionElement_PropertyRef();

		/**
		 * The meta object literal for the '<em><b>String Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_ELEMENT__STRING_VALUE = eINSTANCE.getConditionElement_StringValue();

		/**
		 * The meta object literal for the '<em><b>Bag Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_ELEMENT__BAG_VALUE = eINSTANCE.getConditionElement_BagValue();

		/**
		 * The meta object literal for the '<em><b>Boolean Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_ELEMENT__BOOLEAN_VALUE = eINSTANCE.getConditionElement_BooleanValue();

		/**
		 * The meta object literal for the '<em><b>Complex Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_ELEMENT__COMPLEX_VALUE = eINSTANCE.getConditionElement_ComplexValue();

		/**
		 * The meta object literal for the '<em><b>Composite Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_ELEMENT__COMPOSITE_VALUE = eINSTANCE.getConditionElement_CompositeValue();

		/**
		 * The meta object literal for the '<em><b>Controlled Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_ELEMENT__CONTROLLED_VALUE = eINSTANCE.getConditionElement_ControlledValue();

		/**
		 * The meta object literal for the '<em><b>Currency Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_ELEMENT__CURRENCY_VALUE = eINSTANCE.getConditionElement_CurrencyValue();

		/**
		 * The meta object literal for the '<em><b>Date Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_ELEMENT__DATE_VALUE = eINSTANCE.getConditionElement_DateValue();

		/**
		 * The meta object literal for the '<em><b>Date Time Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_ELEMENT__DATE_TIME_VALUE = eINSTANCE.getConditionElement_DateTimeValue();

		/**
		 * The meta object literal for the '<em><b>File Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_ELEMENT__FILE_VALUE = eINSTANCE.getConditionElement_FileValue();

		/**
		 * The meta object literal for the '<em><b>Integer Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_ELEMENT__INTEGER_VALUE = eINSTANCE.getConditionElement_IntegerValue();

		/**
		 * The meta object literal for the '<em><b>Item Reference Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_ELEMENT__ITEM_REFERENCE_VALUE = eINSTANCE.getConditionElement_ItemReferenceValue();

		/**
		 * The meta object literal for the '<em><b>Localized Text Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_ELEMENT__LOCALIZED_TEXT_VALUE = eINSTANCE.getConditionElement_LocalizedTextValue();

		/**
		 * The meta object literal for the '<em><b>Measure Qualified Number Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_ELEMENT__MEASURE_QUALIFIED_NUMBER_VALUE = eINSTANCE.getConditionElement_MeasureQualifiedNumberValue();

		/**
		 * The meta object literal for the '<em><b>Measure Range Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_ELEMENT__MEASURE_RANGE_VALUE = eINSTANCE.getConditionElement_MeasureRangeValue();

		/**
		 * The meta object literal for the '<em><b>Measure Single Number Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_ELEMENT__MEASURE_SINGLE_NUMBER_VALUE = eINSTANCE.getConditionElement_MeasureSingleNumberValue();

		/**
		 * The meta object literal for the '<em><b>Null Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_ELEMENT__NULL_VALUE = eINSTANCE.getConditionElement_NullValue();

		/**
		 * The meta object literal for the '<em><b>Rational Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_ELEMENT__RATIONAL_VALUE = eINSTANCE.getConditionElement_RationalValue();

		/**
		 * The meta object literal for the '<em><b>Real Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_ELEMENT__REAL_VALUE = eINSTANCE.getConditionElement_RealValue();

		/**
		 * The meta object literal for the '<em><b>Sequence Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_ELEMENT__SEQUENCE_VALUE = eINSTANCE.getConditionElement_SequenceValue();

		/**
		 * The meta object literal for the '<em><b>Set Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_ELEMENT__SET_VALUE = eINSTANCE.getConditionElement_SetValue();

		/**
		 * The meta object literal for the '<em><b>Time Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_ELEMENT__TIME_VALUE = eINSTANCE.getConditionElement_TimeValue();

		/**
		 * The meta object literal for the '<em><b>Year Month Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_ELEMENT__YEAR_MONTH_VALUE = eINSTANCE.getConditionElement_YearMonthValue();

		/**
		 * The meta object literal for the '<em><b>Year Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_ELEMENT__YEAR_VALUE = eINSTANCE.getConditionElement_YearValue();

		/**
		 * The meta object literal for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.ControlledValueImpl <em>Controlled Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.ControlledValueImpl
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getControlledValue()
		 * @generated
		 */
		EClass CONTROLLED_VALUE = eINSTANCE.getControlledValue();

		/**
		 * The meta object literal for the '<em><b>Value Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLED_VALUE__VALUE_CODE = eINSTANCE.getControlledValue_ValueCode();

		/**
		 * The meta object literal for the '<em><b>Value Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLED_VALUE__VALUE_REF = eINSTANCE.getControlledValue_ValueRef();

		/**
		 * The meta object literal for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.CurrencyValueImpl <em>Currency Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.CurrencyValueImpl
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getCurrencyValue()
		 * @generated
		 */
		EClass CURRENCY_VALUE = eINSTANCE.getCurrencyValue();

		/**
		 * The meta object literal for the '<em><b>Currency Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENCY_VALUE__CURRENCY_CODE = eINSTANCE.getCurrencyValue_CurrencyCode();

		/**
		 * The meta object literal for the '<em><b>Currency Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENCY_VALUE__CURRENCY_REF = eINSTANCE.getCurrencyValue_CurrencyRef();

		/**
		 * The meta object literal for the '<em><b>Real Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRENCY_VALUE__REAL_VALUE = eINSTANCE.getCurrencyValue_RealValue();

		/**
		 * The meta object literal for the '<em><b>Complex Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRENCY_VALUE__COMPLEX_VALUE = eINSTANCE.getCurrencyValue_ComplexValue();

		/**
		 * The meta object literal for the '<em><b>Integer Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRENCY_VALUE__INTEGER_VALUE = eINSTANCE.getCurrencyValue_IntegerValue();

		/**
		 * The meta object literal for the '<em><b>Rational Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRENCY_VALUE__RATIONAL_VALUE = eINSTANCE.getCurrencyValue_RationalValue();

		/**
		 * The meta object literal for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.DateTimeValueImpl <em>Date Time Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.DateTimeValueImpl
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getDateTimeValue()
		 * @generated
		 */
		EClass DATE_TIME_VALUE = eINSTANCE.getDateTimeValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME_VALUE__VALUE = eINSTANCE.getDateTimeValue_Value();

		/**
		 * The meta object literal for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.DateValueImpl <em>Date Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.DateValueImpl
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getDateValue()
		 * @generated
		 */
		EClass DATE_VALUE = eINSTANCE.getDateValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_VALUE__VALUE = eINSTANCE.getDateValue_Value();

		/**
		 * The meta object literal for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.EnvironmentImpl <em>Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.EnvironmentImpl
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getEnvironment()
		 * @generated
		 */
		EClass ENVIRONMENT = eINSTANCE.getEnvironment();

		/**
		 * The meta object literal for the '<em><b>Property Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT__PROPERTY_VALUES = eINSTANCE.getEnvironment_PropertyValues();

		/**
		 * The meta object literal for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.FieldImpl
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Property Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__PROPERTY_REF = eINSTANCE.getField_PropertyRef();

		/**
		 * The meta object literal for the '<em><b>String Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__STRING_VALUE = eINSTANCE.getField_StringValue();

		/**
		 * The meta object literal for the '<em><b>Bag Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__BAG_VALUE = eINSTANCE.getField_BagValue();

		/**
		 * The meta object literal for the '<em><b>Boolean Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__BOOLEAN_VALUE = eINSTANCE.getField_BooleanValue();

		/**
		 * The meta object literal for the '<em><b>Complex Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__COMPLEX_VALUE = eINSTANCE.getField_ComplexValue();

		/**
		 * The meta object literal for the '<em><b>Composite Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__COMPOSITE_VALUE = eINSTANCE.getField_CompositeValue();

		/**
		 * The meta object literal for the '<em><b>Controlled Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__CONTROLLED_VALUE = eINSTANCE.getField_ControlledValue();

		/**
		 * The meta object literal for the '<em><b>Currency Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__CURRENCY_VALUE = eINSTANCE.getField_CurrencyValue();

		/**
		 * The meta object literal for the '<em><b>Date Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__DATE_VALUE = eINSTANCE.getField_DateValue();

		/**
		 * The meta object literal for the '<em><b>Date Time Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__DATE_TIME_VALUE = eINSTANCE.getField_DateTimeValue();

		/**
		 * The meta object literal for the '<em><b>File Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__FILE_VALUE = eINSTANCE.getField_FileValue();

		/**
		 * The meta object literal for the '<em><b>Integer Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__INTEGER_VALUE = eINSTANCE.getField_IntegerValue();

		/**
		 * The meta object literal for the '<em><b>Item Reference Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__ITEM_REFERENCE_VALUE = eINSTANCE.getField_ItemReferenceValue();

		/**
		 * The meta object literal for the '<em><b>Localized Text Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__LOCALIZED_TEXT_VALUE = eINSTANCE.getField_LocalizedTextValue();

		/**
		 * The meta object literal for the '<em><b>Measure Qualified Number Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__MEASURE_QUALIFIED_NUMBER_VALUE = eINSTANCE.getField_MeasureQualifiedNumberValue();

		/**
		 * The meta object literal for the '<em><b>Measure Range Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__MEASURE_RANGE_VALUE = eINSTANCE.getField_MeasureRangeValue();

		/**
		 * The meta object literal for the '<em><b>Measure Single Number Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__MEASURE_SINGLE_NUMBER_VALUE = eINSTANCE.getField_MeasureSingleNumberValue();

		/**
		 * The meta object literal for the '<em><b>Null Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__NULL_VALUE = eINSTANCE.getField_NullValue();

		/**
		 * The meta object literal for the '<em><b>Rational Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__RATIONAL_VALUE = eINSTANCE.getField_RationalValue();

		/**
		 * The meta object literal for the '<em><b>Real Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__REAL_VALUE = eINSTANCE.getField_RealValue();

		/**
		 * The meta object literal for the '<em><b>Sequence Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__SEQUENCE_VALUE = eINSTANCE.getField_SequenceValue();

		/**
		 * The meta object literal for the '<em><b>Set Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__SET_VALUE = eINSTANCE.getField_SetValue();

		/**
		 * The meta object literal for the '<em><b>Time Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__TIME_VALUE = eINSTANCE.getField_TimeValue();

		/**
		 * The meta object literal for the '<em><b>Year Month Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__YEAR_MONTH_VALUE = eINSTANCE.getField_YearMonthValue();

		/**
		 * The meta object literal for the '<em><b>Year Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__YEAR_VALUE = eINSTANCE.getField_YearValue();

		/**
		 * The meta object literal for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.FileValueImpl <em>File Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.FileValueImpl
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getFileValue()
		 * @generated
		 */
		EClass FILE_VALUE = eINSTANCE.getFileValue();

		/**
		 * The meta object literal for the '<em><b>URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_VALUE__URI = eINSTANCE.getFileValue_URI();

		/**
		 * The meta object literal for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.IntegerValueImpl <em>Integer Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.IntegerValueImpl
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getIntegerValue()
		 * @generated
		 */
		EClass INTEGER_VALUE = eINSTANCE.getIntegerValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_VALUE__VALUE = eINSTANCE.getIntegerValue_Value();

		/**
		 * The meta object literal for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.ItemReferenceValueImpl <em>Item Reference Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.ItemReferenceValueImpl
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getItemReferenceValue()
		 * @generated
		 */
		EClass ITEM_REFERENCE_VALUE = eINSTANCE.getItemReferenceValue();

		/**
		 * The meta object literal for the '<em><b>Item Local Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_REFERENCE_VALUE__ITEM_LOCAL_REF = eINSTANCE.getItemReferenceValue_ItemLocalRef();

		/**
		 * The meta object literal for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.LocalizedTextValueImpl <em>Localized Text Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.LocalizedTextValueImpl
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getLocalizedTextValue()
		 * @generated
		 */
		EClass LOCALIZED_TEXT_VALUE = eINSTANCE.getLocalizedTextValue();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCALIZED_TEXT_VALUE__CONTENT = eINSTANCE.getLocalizedTextValue_Content();

		/**
		 * The meta object literal for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.MeasureQualifiedNumberValueImpl <em>Measure Qualified Number Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.MeasureQualifiedNumberValueImpl
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getMeasureQualifiedNumberValue()
		 * @generated
		 */
		EClass MEASURE_QUALIFIED_NUMBER_VALUE = eINSTANCE.getMeasureQualifiedNumberValue();

		/**
		 * The meta object literal for the '<em><b>Qualified Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE_QUALIFIED_NUMBER_VALUE__QUALIFIED_VALUES = eINSTANCE.getMeasureQualifiedNumberValue_QualifiedValues();

		/**
		 * The meta object literal for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.MeasureRangeValueImpl <em>Measure Range Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.MeasureRangeValueImpl
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getMeasureRangeValue()
		 * @generated
		 */
		EClass MEASURE_RANGE_VALUE = eINSTANCE.getMeasureRangeValue();

		/**
		 * The meta object literal for the '<em><b>Lower Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE_RANGE_VALUE__LOWER_VALUE = eINSTANCE.getMeasureRangeValue_LowerValue();

		/**
		 * The meta object literal for the '<em><b>Upper Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE_RANGE_VALUE__UPPER_VALUE = eINSTANCE.getMeasureRangeValue_UpperValue();

		/**
		 * The meta object literal for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.MeasureSingleNumberValueImpl <em>Measure Single Number Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.MeasureSingleNumberValueImpl
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getMeasureSingleNumberValue()
		 * @generated
		 */
		EClass MEASURE_SINGLE_NUMBER_VALUE = eINSTANCE.getMeasureSingleNumberValue();

		/**
		 * The meta object literal for the '<em><b>Real Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE_SINGLE_NUMBER_VALUE__REAL_VALUE = eINSTANCE.getMeasureSingleNumberValue_RealValue();

		/**
		 * The meta object literal for the '<em><b>Complex Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE_SINGLE_NUMBER_VALUE__COMPLEX_VALUE = eINSTANCE.getMeasureSingleNumberValue_ComplexValue();

		/**
		 * The meta object literal for the '<em><b>Integer Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE_SINGLE_NUMBER_VALUE__INTEGER_VALUE = eINSTANCE.getMeasureSingleNumberValue_IntegerValue();

		/**
		 * The meta object literal for the '<em><b>Rational Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE_SINGLE_NUMBER_VALUE__RATIONAL_VALUE = eINSTANCE.getMeasureSingleNumberValue_RationalValue();

		/**
		 * The meta object literal for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.MeasureValueImpl <em>Measure Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.MeasureValueImpl
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getMeasureValue()
		 * @generated
		 */
		EClass MEASURE_VALUE = eINSTANCE.getMeasureValue();

		/**
		 * The meta object literal for the '<em><b>UOM Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE_VALUE__UOM_CODE = eINSTANCE.getMeasureValue_UOMCode();

		/**
		 * The meta object literal for the '<em><b>UOM Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE_VALUE__UOM_REF = eINSTANCE.getMeasureValue_UOMRef();

		/**
		 * The meta object literal for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.NullValueImpl <em>Null Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.NullValueImpl
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getNullValue()
		 * @generated
		 */
		EClass NULL_VALUE = eINSTANCE.getNullValue();

		/**
		 * The meta object literal for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.NumericValueImpl <em>Numeric Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.NumericValueImpl
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getNumericValue()
		 * @generated
		 */
		EClass NUMERIC_VALUE = eINSTANCE.getNumericValue();

		/**
		 * The meta object literal for the '<em><b>Real Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMERIC_VALUE__REAL_VALUE = eINSTANCE.getNumericValue_RealValue();

		/**
		 * The meta object literal for the '<em><b>Complex Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMERIC_VALUE__COMPLEX_VALUE = eINSTANCE.getNumericValue_ComplexValue();

		/**
		 * The meta object literal for the '<em><b>Integer Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMERIC_VALUE__INTEGER_VALUE = eINSTANCE.getNumericValue_IntegerValue();

		/**
		 * The meta object literal for the '<em><b>Rational Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMERIC_VALUE__RATIONAL_VALUE = eINSTANCE.getNumericValue_RationalValue();

		/**
		 * The meta object literal for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.OneOfImpl <em>One Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.OneOfImpl
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getOneOf()
		 * @generated
		 */
		EClass ONE_OF = eINSTANCE.getOneOf();

		/**
		 * The meta object literal for the '<em><b>Combinations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_OF__COMBINATIONS = eINSTANCE.getOneOf_Combinations();

		/**
		 * The meta object literal for the '<em><b>String Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_OF__STRING_VALUES = eINSTANCE.getOneOf_StringValues();

		/**
		 * The meta object literal for the '<em><b>Bag Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_OF__BAG_VALUES = eINSTANCE.getOneOf_BagValues();

		/**
		 * The meta object literal for the '<em><b>Boolean Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_OF__BOOLEAN_VALUES = eINSTANCE.getOneOf_BooleanValues();

		/**
		 * The meta object literal for the '<em><b>Complex Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_OF__COMPLEX_VALUES = eINSTANCE.getOneOf_ComplexValues();

		/**
		 * The meta object literal for the '<em><b>Composite Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_OF__COMPOSITE_VALUES = eINSTANCE.getOneOf_CompositeValues();

		/**
		 * The meta object literal for the '<em><b>Controlled Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_OF__CONTROLLED_VALUES = eINSTANCE.getOneOf_ControlledValues();

		/**
		 * The meta object literal for the '<em><b>Currency Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_OF__CURRENCY_VALUES = eINSTANCE.getOneOf_CurrencyValues();

		/**
		 * The meta object literal for the '<em><b>Date Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_OF__DATE_VALUES = eINSTANCE.getOneOf_DateValues();

		/**
		 * The meta object literal for the '<em><b>Date Time Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_OF__DATE_TIME_VALUES = eINSTANCE.getOneOf_DateTimeValues();

		/**
		 * The meta object literal for the '<em><b>File Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_OF__FILE_VALUES = eINSTANCE.getOneOf_FileValues();

		/**
		 * The meta object literal for the '<em><b>Integer Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_OF__INTEGER_VALUES = eINSTANCE.getOneOf_IntegerValues();

		/**
		 * The meta object literal for the '<em><b>Item Reference Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_OF__ITEM_REFERENCE_VALUES = eINSTANCE.getOneOf_ItemReferenceValues();

		/**
		 * The meta object literal for the '<em><b>Localized Text Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_OF__LOCALIZED_TEXT_VALUES = eINSTANCE.getOneOf_LocalizedTextValues();

		/**
		 * The meta object literal for the '<em><b>Measure Qualified Number Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_OF__MEASURE_QUALIFIED_NUMBER_VALUES = eINSTANCE.getOneOf_MeasureQualifiedNumberValues();

		/**
		 * The meta object literal for the '<em><b>Measure Range Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_OF__MEASURE_RANGE_VALUES = eINSTANCE.getOneOf_MeasureRangeValues();

		/**
		 * The meta object literal for the '<em><b>Measure Single Number Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_OF__MEASURE_SINGLE_NUMBER_VALUES = eINSTANCE.getOneOf_MeasureSingleNumberValues();

		/**
		 * The meta object literal for the '<em><b>Null Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_OF__NULL_VALUES = eINSTANCE.getOneOf_NullValues();

		/**
		 * The meta object literal for the '<em><b>Rational Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_OF__RATIONAL_VALUES = eINSTANCE.getOneOf_RationalValues();

		/**
		 * The meta object literal for the '<em><b>Real Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_OF__REAL_VALUES = eINSTANCE.getOneOf_RealValues();

		/**
		 * The meta object literal for the '<em><b>Sequence Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_OF__SEQUENCE_VALUES = eINSTANCE.getOneOf_SequenceValues();

		/**
		 * The meta object literal for the '<em><b>Set Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_OF__SET_VALUES = eINSTANCE.getOneOf_SetValues();

		/**
		 * The meta object literal for the '<em><b>Time Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_OF__TIME_VALUES = eINSTANCE.getOneOf_TimeValues();

		/**
		 * The meta object literal for the '<em><b>Year Month Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_OF__YEAR_MONTH_VALUES = eINSTANCE.getOneOf_YearMonthValues();

		/**
		 * The meta object literal for the '<em><b>Year Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_OF__YEAR_VALUES = eINSTANCE.getOneOf_YearValues();

		/**
		 * The meta object literal for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.QualifiedValueImpl <em>Qualified Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.QualifiedValueImpl
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getQualifiedValue()
		 * @generated
		 */
		EClass QUALIFIED_VALUE = eINSTANCE.getQualifiedValue();

		/**
		 * The meta object literal for the '<em><b>Qualifier Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALIFIED_VALUE__QUALIFIER_CODE = eINSTANCE.getQualifiedValue_QualifierCode();

		/**
		 * The meta object literal for the '<em><b>Qualifier Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALIFIED_VALUE__QUALIFIER_REF = eINSTANCE.getQualifiedValue_QualifierRef();

		/**
		 * The meta object literal for the '<em><b>Real Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALIFIED_VALUE__REAL_VALUE = eINSTANCE.getQualifiedValue_RealValue();

		/**
		 * The meta object literal for the '<em><b>Complex Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALIFIED_VALUE__COMPLEX_VALUE = eINSTANCE.getQualifiedValue_ComplexValue();

		/**
		 * The meta object literal for the '<em><b>Integer Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALIFIED_VALUE__INTEGER_VALUE = eINSTANCE.getQualifiedValue_IntegerValue();

		/**
		 * The meta object literal for the '<em><b>Rational Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALIFIED_VALUE__RATIONAL_VALUE = eINSTANCE.getQualifiedValue_RationalValue();

		/**
		 * The meta object literal for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.RationalValueImpl <em>Rational Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.RationalValueImpl
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getRationalValue()
		 * @generated
		 */
		EClass RATIONAL_VALUE = eINSTANCE.getRationalValue();

		/**
		 * The meta object literal for the '<em><b>Whole Part</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATIONAL_VALUE__WHOLE_PART = eINSTANCE.getRationalValue_WholePart();

		/**
		 * The meta object literal for the '<em><b>Numerator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATIONAL_VALUE__NUMERATOR = eINSTANCE.getRationalValue_Numerator();

		/**
		 * The meta object literal for the '<em><b>Denominator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATIONAL_VALUE__DENOMINATOR = eINSTANCE.getRationalValue_Denominator();

		/**
		 * The meta object literal for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.RealValueImpl <em>Real Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.RealValueImpl
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getRealValue()
		 * @generated
		 */
		EClass REAL_VALUE = eINSTANCE.getRealValue();

		/**
		 * The meta object literal for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.SequenceValueImpl <em>Sequence Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.SequenceValueImpl
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getSequenceValue()
		 * @generated
		 */
		EClass SEQUENCE_VALUE = eINSTANCE.getSequenceValue();

		/**
		 * The meta object literal for the '<em><b>String Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_VALUE__STRING_VALUES = eINSTANCE.getSequenceValue_StringValues();

		/**
		 * The meta object literal for the '<em><b>Bag Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_VALUE__BAG_VALUES = eINSTANCE.getSequenceValue_BagValues();

		/**
		 * The meta object literal for the '<em><b>Boolean Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_VALUE__BOOLEAN_VALUES = eINSTANCE.getSequenceValue_BooleanValues();

		/**
		 * The meta object literal for the '<em><b>Complex Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_VALUE__COMPLEX_VALUES = eINSTANCE.getSequenceValue_ComplexValues();

		/**
		 * The meta object literal for the '<em><b>Composite Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_VALUE__COMPOSITE_VALUES = eINSTANCE.getSequenceValue_CompositeValues();

		/**
		 * The meta object literal for the '<em><b>Controlled Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_VALUE__CONTROLLED_VALUES = eINSTANCE.getSequenceValue_ControlledValues();

		/**
		 * The meta object literal for the '<em><b>Currency Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_VALUE__CURRENCY_VALUES = eINSTANCE.getSequenceValue_CurrencyValues();

		/**
		 * The meta object literal for the '<em><b>Date Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_VALUE__DATE_VALUES = eINSTANCE.getSequenceValue_DateValues();

		/**
		 * The meta object literal for the '<em><b>Date Time Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_VALUE__DATE_TIME_VALUES = eINSTANCE.getSequenceValue_DateTimeValues();

		/**
		 * The meta object literal for the '<em><b>File Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_VALUE__FILE_VALUES = eINSTANCE.getSequenceValue_FileValues();

		/**
		 * The meta object literal for the '<em><b>Integer Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_VALUE__INTEGER_VALUES = eINSTANCE.getSequenceValue_IntegerValues();

		/**
		 * The meta object literal for the '<em><b>Item Reference Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_VALUE__ITEM_REFERENCE_VALUES = eINSTANCE.getSequenceValue_ItemReferenceValues();

		/**
		 * The meta object literal for the '<em><b>Localized Text Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_VALUE__LOCALIZED_TEXT_VALUES = eINSTANCE.getSequenceValue_LocalizedTextValues();

		/**
		 * The meta object literal for the '<em><b>Measure Qualified Number Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_VALUE__MEASURE_QUALIFIED_NUMBER_VALUES = eINSTANCE.getSequenceValue_MeasureQualifiedNumberValues();

		/**
		 * The meta object literal for the '<em><b>Measure Range Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_VALUE__MEASURE_RANGE_VALUES = eINSTANCE.getSequenceValue_MeasureRangeValues();

		/**
		 * The meta object literal for the '<em><b>Measure Single Number Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_VALUE__MEASURE_SINGLE_NUMBER_VALUES = eINSTANCE.getSequenceValue_MeasureSingleNumberValues();

		/**
		 * The meta object literal for the '<em><b>Null Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_VALUE__NULL_VALUES = eINSTANCE.getSequenceValue_NullValues();

		/**
		 * The meta object literal for the '<em><b>Rational Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_VALUE__RATIONAL_VALUES = eINSTANCE.getSequenceValue_RationalValues();

		/**
		 * The meta object literal for the '<em><b>Real Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_VALUE__REAL_VALUES = eINSTANCE.getSequenceValue_RealValues();

		/**
		 * The meta object literal for the '<em><b>Sequence Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_VALUE__SEQUENCE_VALUES = eINSTANCE.getSequenceValue_SequenceValues();

		/**
		 * The meta object literal for the '<em><b>Set Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_VALUE__SET_VALUES = eINSTANCE.getSequenceValue_SetValues();

		/**
		 * The meta object literal for the '<em><b>Time Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_VALUE__TIME_VALUES = eINSTANCE.getSequenceValue_TimeValues();

		/**
		 * The meta object literal for the '<em><b>Year Month Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_VALUE__YEAR_MONTH_VALUES = eINSTANCE.getSequenceValue_YearMonthValues();

		/**
		 * The meta object literal for the '<em><b>Year Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_VALUE__YEAR_VALUES = eINSTANCE.getSequenceValue_YearValues();

		/**
		 * The meta object literal for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.SetValueImpl <em>Set Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.SetValueImpl
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getSetValue()
		 * @generated
		 */
		EClass SET_VALUE = eINSTANCE.getSetValue();

		/**
		 * The meta object literal for the '<em><b>String Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_VALUE__STRING_VALUES = eINSTANCE.getSetValue_StringValues();

		/**
		 * The meta object literal for the '<em><b>Bag Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_VALUE__BAG_VALUES = eINSTANCE.getSetValue_BagValues();

		/**
		 * The meta object literal for the '<em><b>Boolean Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_VALUE__BOOLEAN_VALUES = eINSTANCE.getSetValue_BooleanValues();

		/**
		 * The meta object literal for the '<em><b>Complex Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_VALUE__COMPLEX_VALUES = eINSTANCE.getSetValue_ComplexValues();

		/**
		 * The meta object literal for the '<em><b>Composite Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_VALUE__COMPOSITE_VALUES = eINSTANCE.getSetValue_CompositeValues();

		/**
		 * The meta object literal for the '<em><b>Controlled Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_VALUE__CONTROLLED_VALUES = eINSTANCE.getSetValue_ControlledValues();

		/**
		 * The meta object literal for the '<em><b>Currency Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_VALUE__CURRENCY_VALUES = eINSTANCE.getSetValue_CurrencyValues();

		/**
		 * The meta object literal for the '<em><b>Date Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_VALUE__DATE_VALUES = eINSTANCE.getSetValue_DateValues();

		/**
		 * The meta object literal for the '<em><b>Date Time Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_VALUE__DATE_TIME_VALUES = eINSTANCE.getSetValue_DateTimeValues();

		/**
		 * The meta object literal for the '<em><b>File Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_VALUE__FILE_VALUES = eINSTANCE.getSetValue_FileValues();

		/**
		 * The meta object literal for the '<em><b>Integer Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_VALUE__INTEGER_VALUES = eINSTANCE.getSetValue_IntegerValues();

		/**
		 * The meta object literal for the '<em><b>Item Reference Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_VALUE__ITEM_REFERENCE_VALUES = eINSTANCE.getSetValue_ItemReferenceValues();

		/**
		 * The meta object literal for the '<em><b>Localized Text Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_VALUE__LOCALIZED_TEXT_VALUES = eINSTANCE.getSetValue_LocalizedTextValues();

		/**
		 * The meta object literal for the '<em><b>Measure Qualified Number Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_VALUE__MEASURE_QUALIFIED_NUMBER_VALUES = eINSTANCE.getSetValue_MeasureQualifiedNumberValues();

		/**
		 * The meta object literal for the '<em><b>Measure Range Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_VALUE__MEASURE_RANGE_VALUES = eINSTANCE.getSetValue_MeasureRangeValues();

		/**
		 * The meta object literal for the '<em><b>Measure Single Number Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_VALUE__MEASURE_SINGLE_NUMBER_VALUES = eINSTANCE.getSetValue_MeasureSingleNumberValues();

		/**
		 * The meta object literal for the '<em><b>Null Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_VALUE__NULL_VALUES = eINSTANCE.getSetValue_NullValues();

		/**
		 * The meta object literal for the '<em><b>Rational Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_VALUE__RATIONAL_VALUES = eINSTANCE.getSetValue_RationalValues();

		/**
		 * The meta object literal for the '<em><b>Real Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_VALUE__REAL_VALUES = eINSTANCE.getSetValue_RealValues();

		/**
		 * The meta object literal for the '<em><b>Sequence Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_VALUE__SEQUENCE_VALUES = eINSTANCE.getSetValue_SequenceValues();

		/**
		 * The meta object literal for the '<em><b>Set Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_VALUE__SET_VALUES = eINSTANCE.getSetValue_SetValues();

		/**
		 * The meta object literal for the '<em><b>Time Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_VALUE__TIME_VALUES = eINSTANCE.getSetValue_TimeValues();

		/**
		 * The meta object literal for the '<em><b>Year Month Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_VALUE__YEAR_MONTH_VALUES = eINSTANCE.getSetValue_YearMonthValues();

		/**
		 * The meta object literal for the '<em><b>Year Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_VALUE__YEAR_VALUES = eINSTANCE.getSetValue_YearValues();

		/**
		 * The meta object literal for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.StringValueImpl <em>String Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.StringValueImpl
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getStringValue()
		 * @generated
		 */
		EClass STRING_VALUE = eINSTANCE.getStringValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_VALUE__VALUE = eINSTANCE.getStringValue_Value();

		/**
		 * The meta object literal for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.TimeValueImpl <em>Time Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.TimeValueImpl
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getTimeValue()
		 * @generated
		 */
		EClass TIME_VALUE = eINSTANCE.getTimeValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_VALUE__VALUE = eINSTANCE.getTimeValue_Value();

		/**
		 * The meta object literal for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.YearMonthValueImpl <em>Year Month Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.YearMonthValueImpl
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getYearMonthValue()
		 * @generated
		 */
		EClass YEAR_MONTH_VALUE = eINSTANCE.getYearMonthValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YEAR_MONTH_VALUE__VALUE = eINSTANCE.getYearMonthValue_Value();

		/**
		 * The meta object literal for the '{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.YearValueImpl <em>Year Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.YearValueImpl
		 * @see isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackageImpl#getYearValue()
		 * @generated
		 */
		EClass YEAR_VALUE = eINSTANCE.getYearValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YEAR_VALUE__VALUE = eINSTANCE.getYearValue_Value();

	}

} //Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage
