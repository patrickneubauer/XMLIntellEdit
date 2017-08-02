/**
 */
package com.example.example.with.datetypes;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see com.example.example.with.datetypes.DatetypesFactory
 * @model kind="package"
 * @generated
 */
public interface DatetypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "datetypes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://example.com/example-with-datetypes";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "datetypes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatetypesPackage eINSTANCE = com.example.example.with.datetypes.impl.DatetypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.example.example.with.datetypes.impl.DataTypeTestImpl <em>Data Type Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.example.with.datetypes.impl.DataTypeTestImpl
	 * @see com.example.example.with.datetypes.impl.DatetypesPackageImpl#getDataTypeTest()
	 * @generated
	 */
	int DATA_TYPE_TEST = 0;

	/**
	 * The feature id for the '<em><b>AAny Simple Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_TEST__AANY_SIMPLE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>AAny URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_TEST__AANY_URI = 1;

	/**
	 * The feature id for the '<em><b>ABase64 Binary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_TEST__ABASE64_BINARY = 2;

	/**
	 * The feature id for the '<em><b>ABoolean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_TEST__ABOOLEAN = 3;

	/**
	 * The feature id for the '<em><b>AByte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_TEST__ABYTE = 4;

	/**
	 * The feature id for the '<em><b>ADate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_TEST__ADATE = 5;

	/**
	 * The feature id for the '<em><b>ADate Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_TEST__ADATE_TIME = 6;

	/**
	 * The feature id for the '<em><b>ADecimal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_TEST__ADECIMAL = 7;

	/**
	 * The feature id for the '<em><b>ADouble</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_TEST__ADOUBLE = 8;

	/**
	 * The feature id for the '<em><b>ADuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_TEST__ADURATION = 9;

	/**
	 * The feature id for the '<em><b>AEntities</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_TEST__AENTITIES = 10;

	/**
	 * The feature id for the '<em><b>AEntity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_TEST__AENTITY = 11;

	/**
	 * The feature id for the '<em><b>AFloat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_TEST__AFLOAT = 12;

	/**
	 * The feature id for the '<em><b>AG Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_TEST__AG_DAY = 13;

	/**
	 * The feature id for the '<em><b>AG Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_TEST__AG_MONTH = 14;

	/**
	 * The feature id for the '<em><b>AG Month Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_TEST__AG_MONTH_DAY = 15;

	/**
	 * The feature id for the '<em><b>AG Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_TEST__AG_YEAR = 16;

	/**
	 * The feature id for the '<em><b>AG Year Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_TEST__AG_YEAR_MONTH = 17;

	/**
	 * The feature id for the '<em><b>AHex Binary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_TEST__AHEX_BINARY = 18;

	/**
	 * The feature id for the '<em><b>AID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_TEST__AID = 19;

	/**
	 * The feature id for the '<em><b>AIDREF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_TEST__AIDREF = 20;

	/**
	 * The feature id for the '<em><b>AIDREFS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_TEST__AIDREFS = 21;

	/**
	 * The feature id for the '<em><b>AInt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_TEST__AINT = 22;

	/**
	 * The feature id for the '<em><b>AInteger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_TEST__AINTEGER = 23;

	/**
	 * The feature id for the '<em><b>ALanguage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_TEST__ALANGUAGE = 24;

	/**
	 * The feature id for the '<em><b>ALong</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_TEST__ALONG = 25;

	/**
	 * The feature id for the '<em><b>AName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_TEST__ANAME = 26;

	/**
	 * The feature id for the '<em><b>ANC Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_TEST__ANC_NAME = 27;

	/**
	 * The feature id for the '<em><b>ANMTOKEN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_TEST__ANMTOKEN = 28;

	/**
	 * The feature id for the '<em><b>ANMTOKENS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_TEST__ANMTOKENS = 29;

	/**
	 * The feature id for the '<em><b>ANon Negative Integer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_TEST__ANON_NEGATIVE_INTEGER = 30;

	/**
	 * The feature id for the '<em><b>ANon Positive Integer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_TEST__ANON_POSITIVE_INTEGER = 31;

	/**
	 * The feature id for the '<em><b>APositive Integer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_TEST__APOSITIVE_INTEGER = 32;

	/**
	 * The feature id for the '<em><b>AQ Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_TEST__AQ_NAME = 33;

	/**
	 * The feature id for the '<em><b>AShort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_TEST__ASHORT = 34;

	/**
	 * The feature id for the '<em><b>AString</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_TEST__ASTRING = 35;

	/**
	 * The feature id for the '<em><b>ATime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_TEST__ATIME = 36;

	/**
	 * The feature id for the '<em><b>AToken</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_TEST__ATOKEN = 37;

	/**
	 * The feature id for the '<em><b>AUnsigned Byte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_TEST__AUNSIGNED_BYTE = 38;

	/**
	 * The feature id for the '<em><b>AUnsigned Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_TEST__AUNSIGNED_INT = 39;

	/**
	 * The feature id for the '<em><b>AUnsigned Long</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_TEST__AUNSIGNED_LONG = 40;

	/**
	 * The feature id for the '<em><b>AUnsigned Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_TEST__AUNSIGNED_SHORT = 41;

	/**
	 * The number of structural features of the '<em>Data Type Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_TEST_FEATURE_COUNT = 42;

	/**
	 * The number of operations of the '<em>Data Type Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_TEST_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link com.example.example.with.datetypes.DataTypeTest <em>Data Type Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type Test</em>'.
	 * @see com.example.example.with.datetypes.DataTypeTest
	 * @generated
	 */
	EClass getDataTypeTest();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.with.datetypes.DataTypeTest#getAAnySimpleType <em>AAny Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>AAny Simple Type</em>'.
	 * @see com.example.example.with.datetypes.DataTypeTest#getAAnySimpleType()
	 * @see #getDataTypeTest()
	 * @generated
	 */
	EAttribute getDataTypeTest_AAnySimpleType();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.with.datetypes.DataTypeTest#getAAnyURI <em>AAny URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>AAny URI</em>'.
	 * @see com.example.example.with.datetypes.DataTypeTest#getAAnyURI()
	 * @see #getDataTypeTest()
	 * @generated
	 */
	EAttribute getDataTypeTest_AAnyURI();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.with.datetypes.DataTypeTest#getABase64Binary <em>ABase64 Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ABase64 Binary</em>'.
	 * @see com.example.example.with.datetypes.DataTypeTest#getABase64Binary()
	 * @see #getDataTypeTest()
	 * @generated
	 */
	EAttribute getDataTypeTest_ABase64Binary();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.with.datetypes.DataTypeTest#isABoolean <em>ABoolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ABoolean</em>'.
	 * @see com.example.example.with.datetypes.DataTypeTest#isABoolean()
	 * @see #getDataTypeTest()
	 * @generated
	 */
	EAttribute getDataTypeTest_ABoolean();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.with.datetypes.DataTypeTest#getAByte <em>AByte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>AByte</em>'.
	 * @see com.example.example.with.datetypes.DataTypeTest#getAByte()
	 * @see #getDataTypeTest()
	 * @generated
	 */
	EAttribute getDataTypeTest_AByte();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.with.datetypes.DataTypeTest#getADate <em>ADate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ADate</em>'.
	 * @see com.example.example.with.datetypes.DataTypeTest#getADate()
	 * @see #getDataTypeTest()
	 * @generated
	 */
	EAttribute getDataTypeTest_ADate();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.with.datetypes.DataTypeTest#getADateTime <em>ADate Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ADate Time</em>'.
	 * @see com.example.example.with.datetypes.DataTypeTest#getADateTime()
	 * @see #getDataTypeTest()
	 * @generated
	 */
	EAttribute getDataTypeTest_ADateTime();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.with.datetypes.DataTypeTest#getADecimal <em>ADecimal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ADecimal</em>'.
	 * @see com.example.example.with.datetypes.DataTypeTest#getADecimal()
	 * @see #getDataTypeTest()
	 * @generated
	 */
	EAttribute getDataTypeTest_ADecimal();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.with.datetypes.DataTypeTest#getADouble <em>ADouble</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ADouble</em>'.
	 * @see com.example.example.with.datetypes.DataTypeTest#getADouble()
	 * @see #getDataTypeTest()
	 * @generated
	 */
	EAttribute getDataTypeTest_ADouble();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.with.datetypes.DataTypeTest#getADuration <em>ADuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ADuration</em>'.
	 * @see com.example.example.with.datetypes.DataTypeTest#getADuration()
	 * @see #getDataTypeTest()
	 * @generated
	 */
	EAttribute getDataTypeTest_ADuration();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.with.datetypes.DataTypeTest#getAEntities <em>AEntities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>AEntities</em>'.
	 * @see com.example.example.with.datetypes.DataTypeTest#getAEntities()
	 * @see #getDataTypeTest()
	 * @generated
	 */
	EAttribute getDataTypeTest_AEntities();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.with.datetypes.DataTypeTest#getAEntity <em>AEntity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>AEntity</em>'.
	 * @see com.example.example.with.datetypes.DataTypeTest#getAEntity()
	 * @see #getDataTypeTest()
	 * @generated
	 */
	EAttribute getDataTypeTest_AEntity();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.with.datetypes.DataTypeTest#getAFloat <em>AFloat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>AFloat</em>'.
	 * @see com.example.example.with.datetypes.DataTypeTest#getAFloat()
	 * @see #getDataTypeTest()
	 * @generated
	 */
	EAttribute getDataTypeTest_AFloat();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.with.datetypes.DataTypeTest#getAGDay <em>AG Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>AG Day</em>'.
	 * @see com.example.example.with.datetypes.DataTypeTest#getAGDay()
	 * @see #getDataTypeTest()
	 * @generated
	 */
	EAttribute getDataTypeTest_AGDay();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.with.datetypes.DataTypeTest#getAGMonth <em>AG Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>AG Month</em>'.
	 * @see com.example.example.with.datetypes.DataTypeTest#getAGMonth()
	 * @see #getDataTypeTest()
	 * @generated
	 */
	EAttribute getDataTypeTest_AGMonth();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.with.datetypes.DataTypeTest#getAGMonthDay <em>AG Month Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>AG Month Day</em>'.
	 * @see com.example.example.with.datetypes.DataTypeTest#getAGMonthDay()
	 * @see #getDataTypeTest()
	 * @generated
	 */
	EAttribute getDataTypeTest_AGMonthDay();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.with.datetypes.DataTypeTest#getAGYear <em>AG Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>AG Year</em>'.
	 * @see com.example.example.with.datetypes.DataTypeTest#getAGYear()
	 * @see #getDataTypeTest()
	 * @generated
	 */
	EAttribute getDataTypeTest_AGYear();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.with.datetypes.DataTypeTest#getAGYearMonth <em>AG Year Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>AG Year Month</em>'.
	 * @see com.example.example.with.datetypes.DataTypeTest#getAGYearMonth()
	 * @see #getDataTypeTest()
	 * @generated
	 */
	EAttribute getDataTypeTest_AGYearMonth();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.with.datetypes.DataTypeTest#getAHexBinary <em>AHex Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>AHex Binary</em>'.
	 * @see com.example.example.with.datetypes.DataTypeTest#getAHexBinary()
	 * @see #getDataTypeTest()
	 * @generated
	 */
	EAttribute getDataTypeTest_AHexBinary();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.with.datetypes.DataTypeTest#getAID <em>AID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>AID</em>'.
	 * @see com.example.example.with.datetypes.DataTypeTest#getAID()
	 * @see #getDataTypeTest()
	 * @generated
	 */
	EAttribute getDataTypeTest_AID();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.with.datetypes.DataTypeTest#getAIDREF <em>AIDREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>AIDREF</em>'.
	 * @see com.example.example.with.datetypes.DataTypeTest#getAIDREF()
	 * @see #getDataTypeTest()
	 * @generated
	 */
	EAttribute getDataTypeTest_AIDREF();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.with.datetypes.DataTypeTest#getAIDREFS <em>AIDREFS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>AIDREFS</em>'.
	 * @see com.example.example.with.datetypes.DataTypeTest#getAIDREFS()
	 * @see #getDataTypeTest()
	 * @generated
	 */
	EAttribute getDataTypeTest_AIDREFS();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.with.datetypes.DataTypeTest#getAInt <em>AInt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>AInt</em>'.
	 * @see com.example.example.with.datetypes.DataTypeTest#getAInt()
	 * @see #getDataTypeTest()
	 * @generated
	 */
	EAttribute getDataTypeTest_AInt();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.with.datetypes.DataTypeTest#getAInteger <em>AInteger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>AInteger</em>'.
	 * @see com.example.example.with.datetypes.DataTypeTest#getAInteger()
	 * @see #getDataTypeTest()
	 * @generated
	 */
	EAttribute getDataTypeTest_AInteger();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.with.datetypes.DataTypeTest#getALanguage <em>ALanguage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ALanguage</em>'.
	 * @see com.example.example.with.datetypes.DataTypeTest#getALanguage()
	 * @see #getDataTypeTest()
	 * @generated
	 */
	EAttribute getDataTypeTest_ALanguage();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.with.datetypes.DataTypeTest#getALong <em>ALong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ALong</em>'.
	 * @see com.example.example.with.datetypes.DataTypeTest#getALong()
	 * @see #getDataTypeTest()
	 * @generated
	 */
	EAttribute getDataTypeTest_ALong();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.with.datetypes.DataTypeTest#getAName <em>AName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>AName</em>'.
	 * @see com.example.example.with.datetypes.DataTypeTest#getAName()
	 * @see #getDataTypeTest()
	 * @generated
	 */
	EAttribute getDataTypeTest_AName();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.with.datetypes.DataTypeTest#getANCName <em>ANC Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ANC Name</em>'.
	 * @see com.example.example.with.datetypes.DataTypeTest#getANCName()
	 * @see #getDataTypeTest()
	 * @generated
	 */
	EAttribute getDataTypeTest_ANCName();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.with.datetypes.DataTypeTest#getANMTOKEN <em>ANMTOKEN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ANMTOKEN</em>'.
	 * @see com.example.example.with.datetypes.DataTypeTest#getANMTOKEN()
	 * @see #getDataTypeTest()
	 * @generated
	 */
	EAttribute getDataTypeTest_ANMTOKEN();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.with.datetypes.DataTypeTest#getANMTOKENS <em>ANMTOKENS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ANMTOKENS</em>'.
	 * @see com.example.example.with.datetypes.DataTypeTest#getANMTOKENS()
	 * @see #getDataTypeTest()
	 * @generated
	 */
	EAttribute getDataTypeTest_ANMTOKENS();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.with.datetypes.DataTypeTest#getANonNegativeInteger <em>ANon Negative Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ANon Negative Integer</em>'.
	 * @see com.example.example.with.datetypes.DataTypeTest#getANonNegativeInteger()
	 * @see #getDataTypeTest()
	 * @generated
	 */
	EAttribute getDataTypeTest_ANonNegativeInteger();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.with.datetypes.DataTypeTest#getANonPositiveInteger <em>ANon Positive Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ANon Positive Integer</em>'.
	 * @see com.example.example.with.datetypes.DataTypeTest#getANonPositiveInteger()
	 * @see #getDataTypeTest()
	 * @generated
	 */
	EAttribute getDataTypeTest_ANonPositiveInteger();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.with.datetypes.DataTypeTest#getAPositiveInteger <em>APositive Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>APositive Integer</em>'.
	 * @see com.example.example.with.datetypes.DataTypeTest#getAPositiveInteger()
	 * @see #getDataTypeTest()
	 * @generated
	 */
	EAttribute getDataTypeTest_APositiveInteger();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.with.datetypes.DataTypeTest#getAQName <em>AQ Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>AQ Name</em>'.
	 * @see com.example.example.with.datetypes.DataTypeTest#getAQName()
	 * @see #getDataTypeTest()
	 * @generated
	 */
	EAttribute getDataTypeTest_AQName();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.with.datetypes.DataTypeTest#getAShort <em>AShort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>AShort</em>'.
	 * @see com.example.example.with.datetypes.DataTypeTest#getAShort()
	 * @see #getDataTypeTest()
	 * @generated
	 */
	EAttribute getDataTypeTest_AShort();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.with.datetypes.DataTypeTest#getAString <em>AString</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>AString</em>'.
	 * @see com.example.example.with.datetypes.DataTypeTest#getAString()
	 * @see #getDataTypeTest()
	 * @generated
	 */
	EAttribute getDataTypeTest_AString();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.with.datetypes.DataTypeTest#getATime <em>ATime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ATime</em>'.
	 * @see com.example.example.with.datetypes.DataTypeTest#getATime()
	 * @see #getDataTypeTest()
	 * @generated
	 */
	EAttribute getDataTypeTest_ATime();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.with.datetypes.DataTypeTest#getAToken <em>AToken</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>AToken</em>'.
	 * @see com.example.example.with.datetypes.DataTypeTest#getAToken()
	 * @see #getDataTypeTest()
	 * @generated
	 */
	EAttribute getDataTypeTest_AToken();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.with.datetypes.DataTypeTest#getAUnsignedByte <em>AUnsigned Byte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>AUnsigned Byte</em>'.
	 * @see com.example.example.with.datetypes.DataTypeTest#getAUnsignedByte()
	 * @see #getDataTypeTest()
	 * @generated
	 */
	EAttribute getDataTypeTest_AUnsignedByte();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.with.datetypes.DataTypeTest#getAUnsignedInt <em>AUnsigned Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>AUnsigned Int</em>'.
	 * @see com.example.example.with.datetypes.DataTypeTest#getAUnsignedInt()
	 * @see #getDataTypeTest()
	 * @generated
	 */
	EAttribute getDataTypeTest_AUnsignedInt();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.with.datetypes.DataTypeTest#getAUnsignedLong <em>AUnsigned Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>AUnsigned Long</em>'.
	 * @see com.example.example.with.datetypes.DataTypeTest#getAUnsignedLong()
	 * @see #getDataTypeTest()
	 * @generated
	 */
	EAttribute getDataTypeTest_AUnsignedLong();

	/**
	 * Returns the meta object for the attribute '{@link com.example.example.with.datetypes.DataTypeTest#getAUnsignedShort <em>AUnsigned Short</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>AUnsigned Short</em>'.
	 * @see com.example.example.with.datetypes.DataTypeTest#getAUnsignedShort()
	 * @see #getDataTypeTest()
	 * @generated
	 */
	EAttribute getDataTypeTest_AUnsignedShort();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DatetypesFactory getDatetypesFactory();

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
		 * The meta object literal for the '{@link com.example.example.with.datetypes.impl.DataTypeTestImpl <em>Data Type Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.example.with.datetypes.impl.DataTypeTestImpl
		 * @see com.example.example.with.datetypes.impl.DatetypesPackageImpl#getDataTypeTest()
		 * @generated
		 */
		EClass DATA_TYPE_TEST = eINSTANCE.getDataTypeTest();

		/**
		 * The meta object literal for the '<em><b>AAny Simple Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_TEST__AANY_SIMPLE_TYPE = eINSTANCE.getDataTypeTest_AAnySimpleType();

		/**
		 * The meta object literal for the '<em><b>AAny URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_TEST__AANY_URI = eINSTANCE.getDataTypeTest_AAnyURI();

		/**
		 * The meta object literal for the '<em><b>ABase64 Binary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_TEST__ABASE64_BINARY = eINSTANCE.getDataTypeTest_ABase64Binary();

		/**
		 * The meta object literal for the '<em><b>ABoolean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_TEST__ABOOLEAN = eINSTANCE.getDataTypeTest_ABoolean();

		/**
		 * The meta object literal for the '<em><b>AByte</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_TEST__ABYTE = eINSTANCE.getDataTypeTest_AByte();

		/**
		 * The meta object literal for the '<em><b>ADate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_TEST__ADATE = eINSTANCE.getDataTypeTest_ADate();

		/**
		 * The meta object literal for the '<em><b>ADate Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_TEST__ADATE_TIME = eINSTANCE.getDataTypeTest_ADateTime();

		/**
		 * The meta object literal for the '<em><b>ADecimal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_TEST__ADECIMAL = eINSTANCE.getDataTypeTest_ADecimal();

		/**
		 * The meta object literal for the '<em><b>ADouble</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_TEST__ADOUBLE = eINSTANCE.getDataTypeTest_ADouble();

		/**
		 * The meta object literal for the '<em><b>ADuration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_TEST__ADURATION = eINSTANCE.getDataTypeTest_ADuration();

		/**
		 * The meta object literal for the '<em><b>AEntities</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_TEST__AENTITIES = eINSTANCE.getDataTypeTest_AEntities();

		/**
		 * The meta object literal for the '<em><b>AEntity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_TEST__AENTITY = eINSTANCE.getDataTypeTest_AEntity();

		/**
		 * The meta object literal for the '<em><b>AFloat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_TEST__AFLOAT = eINSTANCE.getDataTypeTest_AFloat();

		/**
		 * The meta object literal for the '<em><b>AG Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_TEST__AG_DAY = eINSTANCE.getDataTypeTest_AGDay();

		/**
		 * The meta object literal for the '<em><b>AG Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_TEST__AG_MONTH = eINSTANCE.getDataTypeTest_AGMonth();

		/**
		 * The meta object literal for the '<em><b>AG Month Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_TEST__AG_MONTH_DAY = eINSTANCE.getDataTypeTest_AGMonthDay();

		/**
		 * The meta object literal for the '<em><b>AG Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_TEST__AG_YEAR = eINSTANCE.getDataTypeTest_AGYear();

		/**
		 * The meta object literal for the '<em><b>AG Year Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_TEST__AG_YEAR_MONTH = eINSTANCE.getDataTypeTest_AGYearMonth();

		/**
		 * The meta object literal for the '<em><b>AHex Binary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_TEST__AHEX_BINARY = eINSTANCE.getDataTypeTest_AHexBinary();

		/**
		 * The meta object literal for the '<em><b>AID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_TEST__AID = eINSTANCE.getDataTypeTest_AID();

		/**
		 * The meta object literal for the '<em><b>AIDREF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_TEST__AIDREF = eINSTANCE.getDataTypeTest_AIDREF();

		/**
		 * The meta object literal for the '<em><b>AIDREFS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_TEST__AIDREFS = eINSTANCE.getDataTypeTest_AIDREFS();

		/**
		 * The meta object literal for the '<em><b>AInt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_TEST__AINT = eINSTANCE.getDataTypeTest_AInt();

		/**
		 * The meta object literal for the '<em><b>AInteger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_TEST__AINTEGER = eINSTANCE.getDataTypeTest_AInteger();

		/**
		 * The meta object literal for the '<em><b>ALanguage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_TEST__ALANGUAGE = eINSTANCE.getDataTypeTest_ALanguage();

		/**
		 * The meta object literal for the '<em><b>ALong</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_TEST__ALONG = eINSTANCE.getDataTypeTest_ALong();

		/**
		 * The meta object literal for the '<em><b>AName</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_TEST__ANAME = eINSTANCE.getDataTypeTest_AName();

		/**
		 * The meta object literal for the '<em><b>ANC Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_TEST__ANC_NAME = eINSTANCE.getDataTypeTest_ANCName();

		/**
		 * The meta object literal for the '<em><b>ANMTOKEN</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_TEST__ANMTOKEN = eINSTANCE.getDataTypeTest_ANMTOKEN();

		/**
		 * The meta object literal for the '<em><b>ANMTOKENS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_TEST__ANMTOKENS = eINSTANCE.getDataTypeTest_ANMTOKENS();

		/**
		 * The meta object literal for the '<em><b>ANon Negative Integer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_TEST__ANON_NEGATIVE_INTEGER = eINSTANCE.getDataTypeTest_ANonNegativeInteger();

		/**
		 * The meta object literal for the '<em><b>ANon Positive Integer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_TEST__ANON_POSITIVE_INTEGER = eINSTANCE.getDataTypeTest_ANonPositiveInteger();

		/**
		 * The meta object literal for the '<em><b>APositive Integer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_TEST__APOSITIVE_INTEGER = eINSTANCE.getDataTypeTest_APositiveInteger();

		/**
		 * The meta object literal for the '<em><b>AQ Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_TEST__AQ_NAME = eINSTANCE.getDataTypeTest_AQName();

		/**
		 * The meta object literal for the '<em><b>AShort</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_TEST__ASHORT = eINSTANCE.getDataTypeTest_AShort();

		/**
		 * The meta object literal for the '<em><b>AString</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_TEST__ASTRING = eINSTANCE.getDataTypeTest_AString();

		/**
		 * The meta object literal for the '<em><b>ATime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_TEST__ATIME = eINSTANCE.getDataTypeTest_ATime();

		/**
		 * The meta object literal for the '<em><b>AToken</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_TEST__ATOKEN = eINSTANCE.getDataTypeTest_AToken();

		/**
		 * The meta object literal for the '<em><b>AUnsigned Byte</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_TEST__AUNSIGNED_BYTE = eINSTANCE.getDataTypeTest_AUnsignedByte();

		/**
		 * The meta object literal for the '<em><b>AUnsigned Int</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_TEST__AUNSIGNED_INT = eINSTANCE.getDataTypeTest_AUnsignedInt();

		/**
		 * The meta object literal for the '<em><b>AUnsigned Long</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_TEST__AUNSIGNED_LONG = eINSTANCE.getDataTypeTest_AUnsignedLong();

		/**
		 * The meta object literal for the '<em><b>AUnsigned Short</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_TEST__AUNSIGNED_SHORT = eINSTANCE.getDataTypeTest_AUnsignedShort();

	}

} //DatetypesPackage
