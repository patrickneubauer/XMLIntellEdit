/**
 */
package com.example.example.with.datetypes.impl;

import com.example.example.with.datetypes.DataTypeTest;
import com.example.example.with.datetypes.DatetypesPackage;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.List;

import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.example.example.with.datetypes.impl.DataTypeTestImpl#getAAnySimpleType <em>AAny Simple Type</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.impl.DataTypeTestImpl#getAAnyURI <em>AAny URI</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.impl.DataTypeTestImpl#getABase64Binary <em>ABase64 Binary</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.impl.DataTypeTestImpl#isABoolean <em>ABoolean</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.impl.DataTypeTestImpl#getAByte <em>AByte</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.impl.DataTypeTestImpl#getADate <em>ADate</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.impl.DataTypeTestImpl#getADateTime <em>ADate Time</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.impl.DataTypeTestImpl#getADecimal <em>ADecimal</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.impl.DataTypeTestImpl#getADouble <em>ADouble</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.impl.DataTypeTestImpl#getADuration <em>ADuration</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.impl.DataTypeTestImpl#getAEntities <em>AEntities</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.impl.DataTypeTestImpl#getAEntity <em>AEntity</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.impl.DataTypeTestImpl#getAFloat <em>AFloat</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.impl.DataTypeTestImpl#getAGDay <em>AG Day</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.impl.DataTypeTestImpl#getAGMonth <em>AG Month</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.impl.DataTypeTestImpl#getAGMonthDay <em>AG Month Day</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.impl.DataTypeTestImpl#getAGYear <em>AG Year</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.impl.DataTypeTestImpl#getAGYearMonth <em>AG Year Month</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.impl.DataTypeTestImpl#getAHexBinary <em>AHex Binary</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.impl.DataTypeTestImpl#getAID <em>AID</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.impl.DataTypeTestImpl#getAIDREF <em>AIDREF</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.impl.DataTypeTestImpl#getAIDREFS <em>AIDREFS</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.impl.DataTypeTestImpl#getAInt <em>AInt</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.impl.DataTypeTestImpl#getAInteger <em>AInteger</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.impl.DataTypeTestImpl#getALanguage <em>ALanguage</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.impl.DataTypeTestImpl#getALong <em>ALong</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.impl.DataTypeTestImpl#getAName <em>AName</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.impl.DataTypeTestImpl#getANCName <em>ANC Name</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.impl.DataTypeTestImpl#getANMTOKEN <em>ANMTOKEN</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.impl.DataTypeTestImpl#getANMTOKENS <em>ANMTOKENS</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.impl.DataTypeTestImpl#getANonNegativeInteger <em>ANon Negative Integer</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.impl.DataTypeTestImpl#getANonPositiveInteger <em>ANon Positive Integer</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.impl.DataTypeTestImpl#getAPositiveInteger <em>APositive Integer</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.impl.DataTypeTestImpl#getAQName <em>AQ Name</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.impl.DataTypeTestImpl#getAShort <em>AShort</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.impl.DataTypeTestImpl#getAString <em>AString</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.impl.DataTypeTestImpl#getATime <em>ATime</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.impl.DataTypeTestImpl#getAToken <em>AToken</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.impl.DataTypeTestImpl#getAUnsignedByte <em>AUnsigned Byte</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.impl.DataTypeTestImpl#getAUnsignedInt <em>AUnsigned Int</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.impl.DataTypeTestImpl#getAUnsignedLong <em>AUnsigned Long</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.impl.DataTypeTestImpl#getAUnsignedShort <em>AUnsigned Short</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataTypeTestImpl extends MinimalEObjectImpl.Container implements DataTypeTest {
	/**
	 * The default value of the '{@link #getAAnySimpleType() <em>AAny Simple Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAAnySimpleType()
	 * @generated
	 * @ordered
	 */
	protected static final Object AANY_SIMPLE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAAnySimpleType() <em>AAny Simple Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAAnySimpleType()
	 * @generated
	 * @ordered
	 */
	protected Object aAnySimpleType = AANY_SIMPLE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAAnyURI() <em>AAny URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAAnyURI()
	 * @generated
	 * @ordered
	 */
	protected static final String AANY_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAAnyURI() <em>AAny URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAAnyURI()
	 * @generated
	 * @ordered
	 */
	protected String aAnyURI = AANY_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getABase64Binary() <em>ABase64 Binary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getABase64Binary()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] ABASE64_BINARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getABase64Binary() <em>ABase64 Binary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getABase64Binary()
	 * @generated
	 * @ordered
	 */
	protected byte[] aBase64Binary = ABASE64_BINARY_EDEFAULT;

	/**
	 * The default value of the '{@link #isABoolean() <em>ABoolean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isABoolean()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABOOLEAN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isABoolean() <em>ABoolean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isABoolean()
	 * @generated
	 * @ordered
	 */
	protected boolean aBoolean = ABOOLEAN_EDEFAULT;

	/**
	 * This is true if the ABoolean attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean aBooleanESet;

	/**
	 * The default value of the '{@link #getAByte() <em>AByte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAByte()
	 * @generated
	 * @ordered
	 */
	protected static final byte ABYTE_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getAByte() <em>AByte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAByte()
	 * @generated
	 * @ordered
	 */
	protected byte aByte = ABYTE_EDEFAULT;

	/**
	 * This is true if the AByte attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean aByteESet;

	/**
	 * The default value of the '{@link #getADate() <em>ADate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getADate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar ADATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getADate() <em>ADate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getADate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar aDate = ADATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getADateTime() <em>ADate Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getADateTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar ADATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getADateTime() <em>ADate Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getADateTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar aDateTime = ADATE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getADecimal() <em>ADecimal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getADecimal()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal ADECIMAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getADecimal() <em>ADecimal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getADecimal()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal aDecimal = ADECIMAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getADouble() <em>ADouble</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getADouble()
	 * @generated
	 * @ordered
	 */
	protected static final double ADOUBLE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getADouble() <em>ADouble</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getADouble()
	 * @generated
	 * @ordered
	 */
	protected double aDouble = ADOUBLE_EDEFAULT;

	/**
	 * This is true if the ADouble attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean aDoubleESet;

	/**
	 * The default value of the '{@link #getADuration() <em>ADuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getADuration()
	 * @generated
	 * @ordered
	 */
	protected static final Duration ADURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getADuration() <em>ADuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getADuration()
	 * @generated
	 * @ordered
	 */
	protected Duration aDuration = ADURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAEntities() <em>AEntities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAEntities()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> AENTITIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAEntities() <em>AEntities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAEntities()
	 * @generated
	 * @ordered
	 */
	protected List<String> aEntities = AENTITIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getAEntity() <em>AEntity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAEntity()
	 * @generated
	 * @ordered
	 */
	protected static final String AENTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAEntity() <em>AEntity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAEntity()
	 * @generated
	 * @ordered
	 */
	protected String aEntity = AENTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAFloat() <em>AFloat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAFloat()
	 * @generated
	 * @ordered
	 */
	protected static final float AFLOAT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAFloat() <em>AFloat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAFloat()
	 * @generated
	 * @ordered
	 */
	protected float aFloat = AFLOAT_EDEFAULT;

	/**
	 * This is true if the AFloat attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean aFloatESet;

	/**
	 * The default value of the '{@link #getAGDay() <em>AG Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAGDay()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar AG_DAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAGDay() <em>AG Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAGDay()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar aGDay = AG_DAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAGMonth() <em>AG Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAGMonth()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar AG_MONTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAGMonth() <em>AG Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAGMonth()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar aGMonth = AG_MONTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getAGMonthDay() <em>AG Month Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAGMonthDay()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar AG_MONTH_DAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAGMonthDay() <em>AG Month Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAGMonthDay()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar aGMonthDay = AG_MONTH_DAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAGYear() <em>AG Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAGYear()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar AG_YEAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAGYear() <em>AG Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAGYear()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar aGYear = AG_YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getAGYearMonth() <em>AG Year Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAGYearMonth()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar AG_YEAR_MONTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAGYearMonth() <em>AG Year Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAGYearMonth()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar aGYearMonth = AG_YEAR_MONTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getAHexBinary() <em>AHex Binary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAHexBinary()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] AHEX_BINARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAHexBinary() <em>AHex Binary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAHexBinary()
	 * @generated
	 * @ordered
	 */
	protected byte[] aHexBinary = AHEX_BINARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAID() <em>AID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAID()
	 * @generated
	 * @ordered
	 */
	protected static final String AID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAID() <em>AID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAID()
	 * @generated
	 * @ordered
	 */
	protected String aID = AID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAIDREF() <em>AIDREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIDREF()
	 * @generated
	 * @ordered
	 */
	protected static final String AIDREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAIDREF() <em>AIDREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIDREF()
	 * @generated
	 * @ordered
	 */
	protected String aIDREF = AIDREF_EDEFAULT;

	/**
	 * The default value of the '{@link #getAIDREFS() <em>AIDREFS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIDREFS()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> AIDREFS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAIDREFS() <em>AIDREFS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIDREFS()
	 * @generated
	 * @ordered
	 */
	protected List<String> aIDREFS = AIDREFS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAInt() <em>AInt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAInt()
	 * @generated
	 * @ordered
	 */
	protected static final int AINT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAInt() <em>AInt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAInt()
	 * @generated
	 * @ordered
	 */
	protected int aInt = AINT_EDEFAULT;

	/**
	 * This is true if the AInt attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean aIntESet;

	/**
	 * The default value of the '{@link #getAInteger() <em>AInteger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAInteger()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger AINTEGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAInteger() <em>AInteger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAInteger()
	 * @generated
	 * @ordered
	 */
	protected BigInteger aInteger = AINTEGER_EDEFAULT;

	/**
	 * The default value of the '{@link #getALanguage() <em>ALanguage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getALanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String ALANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getALanguage() <em>ALanguage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getALanguage()
	 * @generated
	 * @ordered
	 */
	protected String aLanguage = ALANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getALong() <em>ALong</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getALong()
	 * @generated
	 * @ordered
	 */
	protected static final long ALONG_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getALong() <em>ALong</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getALong()
	 * @generated
	 * @ordered
	 */
	protected long aLong = ALONG_EDEFAULT;

	/**
	 * This is true if the ALong attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean aLongESet;

	/**
	 * The default value of the '{@link #getAName() <em>AName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAName()
	 * @generated
	 * @ordered
	 */
	protected static final String ANAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAName() <em>AName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAName()
	 * @generated
	 * @ordered
	 */
	protected String aName = ANAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getANCName() <em>ANC Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getANCName()
	 * @generated
	 * @ordered
	 */
	protected static final String ANC_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getANCName() <em>ANC Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getANCName()
	 * @generated
	 * @ordered
	 */
	protected String aNCName = ANC_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getANMTOKEN() <em>ANMTOKEN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getANMTOKEN()
	 * @generated
	 * @ordered
	 */
	protected static final String ANMTOKEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getANMTOKEN() <em>ANMTOKEN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getANMTOKEN()
	 * @generated
	 * @ordered
	 */
	protected String aNMTOKEN = ANMTOKEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getANMTOKENS() <em>ANMTOKENS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getANMTOKENS()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> ANMTOKENS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getANMTOKENS() <em>ANMTOKENS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getANMTOKENS()
	 * @generated
	 * @ordered
	 */
	protected List<String> aNMTOKENS = ANMTOKENS_EDEFAULT;

	/**
	 * The default value of the '{@link #getANonNegativeInteger() <em>ANon Negative Integer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getANonNegativeInteger()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ANON_NEGATIVE_INTEGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getANonNegativeInteger() <em>ANon Negative Integer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getANonNegativeInteger()
	 * @generated
	 * @ordered
	 */
	protected BigInteger aNonNegativeInteger = ANON_NEGATIVE_INTEGER_EDEFAULT;

	/**
	 * The default value of the '{@link #getANonPositiveInteger() <em>ANon Positive Integer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getANonPositiveInteger()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ANON_POSITIVE_INTEGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getANonPositiveInteger() <em>ANon Positive Integer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getANonPositiveInteger()
	 * @generated
	 * @ordered
	 */
	protected BigInteger aNonPositiveInteger = ANON_POSITIVE_INTEGER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAPositiveInteger() <em>APositive Integer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPositiveInteger()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger APOSITIVE_INTEGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAPositiveInteger() <em>APositive Integer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPositiveInteger()
	 * @generated
	 * @ordered
	 */
	protected BigInteger aPositiveInteger = APOSITIVE_INTEGER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAQName() <em>AQ Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAQName()
	 * @generated
	 * @ordered
	 */
	protected static final QName AQ_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAQName() <em>AQ Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAQName()
	 * @generated
	 * @ordered
	 */
	protected QName aQName = AQ_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAShort() <em>AShort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAShort()
	 * @generated
	 * @ordered
	 */
	protected static final short ASHORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAShort() <em>AShort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAShort()
	 * @generated
	 * @ordered
	 */
	protected short aShort = ASHORT_EDEFAULT;

	/**
	 * This is true if the AShort attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean aShortESet;

	/**
	 * The default value of the '{@link #getAString() <em>AString</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAString()
	 * @generated
	 * @ordered
	 */
	protected static final String ASTRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAString() <em>AString</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAString()
	 * @generated
	 * @ordered
	 */
	protected String aString = ASTRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getATime() <em>ATime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getATime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar ATIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getATime() <em>ATime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getATime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar aTime = ATIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAToken() <em>AToken</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAToken()
	 * @generated
	 * @ordered
	 */
	protected static final String ATOKEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAToken() <em>AToken</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAToken()
	 * @generated
	 * @ordered
	 */
	protected String aToken = ATOKEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getAUnsignedByte() <em>AUnsigned Byte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAUnsignedByte()
	 * @generated
	 * @ordered
	 */
	protected static final short AUNSIGNED_BYTE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAUnsignedByte() <em>AUnsigned Byte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAUnsignedByte()
	 * @generated
	 * @ordered
	 */
	protected short aUnsignedByte = AUNSIGNED_BYTE_EDEFAULT;

	/**
	 * This is true if the AUnsigned Byte attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean aUnsignedByteESet;

	/**
	 * The default value of the '{@link #getAUnsignedInt() <em>AUnsigned Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAUnsignedInt()
	 * @generated
	 * @ordered
	 */
	protected static final long AUNSIGNED_INT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getAUnsignedInt() <em>AUnsigned Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAUnsignedInt()
	 * @generated
	 * @ordered
	 */
	protected long aUnsignedInt = AUNSIGNED_INT_EDEFAULT;

	/**
	 * This is true if the AUnsigned Int attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean aUnsignedIntESet;

	/**
	 * The default value of the '{@link #getAUnsignedLong() <em>AUnsigned Long</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAUnsignedLong()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger AUNSIGNED_LONG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAUnsignedLong() <em>AUnsigned Long</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAUnsignedLong()
	 * @generated
	 * @ordered
	 */
	protected BigInteger aUnsignedLong = AUNSIGNED_LONG_EDEFAULT;

	/**
	 * The default value of the '{@link #getAUnsignedShort() <em>AUnsigned Short</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAUnsignedShort()
	 * @generated
	 * @ordered
	 */
	protected static final int AUNSIGNED_SHORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAUnsignedShort() <em>AUnsigned Short</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAUnsignedShort()
	 * @generated
	 * @ordered
	 */
	protected int aUnsignedShort = AUNSIGNED_SHORT_EDEFAULT;

	/**
	 * This is true if the AUnsigned Short attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean aUnsignedShortESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTypeTestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatetypesPackage.Literals.DATA_TYPE_TEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getAAnySimpleType() {
		return aAnySimpleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAAnySimpleType(Object newAAnySimpleType) {
		Object oldAAnySimpleType = aAnySimpleType;
		aAnySimpleType = newAAnySimpleType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatetypesPackage.DATA_TYPE_TEST__AANY_SIMPLE_TYPE, oldAAnySimpleType, aAnySimpleType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAAnyURI() {
		return aAnyURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAAnyURI(String newAAnyURI) {
		String oldAAnyURI = aAnyURI;
		aAnyURI = newAAnyURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatetypesPackage.DATA_TYPE_TEST__AANY_URI, oldAAnyURI, aAnyURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getABase64Binary() {
		return aBase64Binary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setABase64Binary(byte[] newABase64Binary) {
		byte[] oldABase64Binary = aBase64Binary;
		aBase64Binary = newABase64Binary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatetypesPackage.DATA_TYPE_TEST__ABASE64_BINARY, oldABase64Binary, aBase64Binary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isABoolean() {
		return aBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setABoolean(boolean newABoolean) {
		boolean oldABoolean = aBoolean;
		aBoolean = newABoolean;
		boolean oldABooleanESet = aBooleanESet;
		aBooleanESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatetypesPackage.DATA_TYPE_TEST__ABOOLEAN, oldABoolean, aBoolean, !oldABooleanESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetABoolean() {
		boolean oldABoolean = aBoolean;
		boolean oldABooleanESet = aBooleanESet;
		aBoolean = ABOOLEAN_EDEFAULT;
		aBooleanESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DatetypesPackage.DATA_TYPE_TEST__ABOOLEAN, oldABoolean, ABOOLEAN_EDEFAULT, oldABooleanESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetABoolean() {
		return aBooleanESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getAByte() {
		return aByte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAByte(byte newAByte) {
		byte oldAByte = aByte;
		aByte = newAByte;
		boolean oldAByteESet = aByteESet;
		aByteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatetypesPackage.DATA_TYPE_TEST__ABYTE, oldAByte, aByte, !oldAByteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAByte() {
		byte oldAByte = aByte;
		boolean oldAByteESet = aByteESet;
		aByte = ABYTE_EDEFAULT;
		aByteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DatetypesPackage.DATA_TYPE_TEST__ABYTE, oldAByte, ABYTE_EDEFAULT, oldAByteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAByte() {
		return aByteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getADate() {
		return aDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setADate(XMLGregorianCalendar newADate) {
		XMLGregorianCalendar oldADate = aDate;
		aDate = newADate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatetypesPackage.DATA_TYPE_TEST__ADATE, oldADate, aDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getADateTime() {
		return aDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setADateTime(XMLGregorianCalendar newADateTime) {
		XMLGregorianCalendar oldADateTime = aDateTime;
		aDateTime = newADateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatetypesPackage.DATA_TYPE_TEST__ADATE_TIME, oldADateTime, aDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getADecimal() {
		return aDecimal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setADecimal(BigDecimal newADecimal) {
		BigDecimal oldADecimal = aDecimal;
		aDecimal = newADecimal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatetypesPackage.DATA_TYPE_TEST__ADECIMAL, oldADecimal, aDecimal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getADouble() {
		return aDouble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setADouble(double newADouble) {
		double oldADouble = aDouble;
		aDouble = newADouble;
		boolean oldADoubleESet = aDoubleESet;
		aDoubleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatetypesPackage.DATA_TYPE_TEST__ADOUBLE, oldADouble, aDouble, !oldADoubleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetADouble() {
		double oldADouble = aDouble;
		boolean oldADoubleESet = aDoubleESet;
		aDouble = ADOUBLE_EDEFAULT;
		aDoubleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DatetypesPackage.DATA_TYPE_TEST__ADOUBLE, oldADouble, ADOUBLE_EDEFAULT, oldADoubleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetADouble() {
		return aDoubleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getADuration() {
		return aDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setADuration(Duration newADuration) {
		Duration oldADuration = aDuration;
		aDuration = newADuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatetypesPackage.DATA_TYPE_TEST__ADURATION, oldADuration, aDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getAEntities() {
		return aEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAEntities(List<String> newAEntities) {
		List<String> oldAEntities = aEntities;
		aEntities = newAEntities;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatetypesPackage.DATA_TYPE_TEST__AENTITIES, oldAEntities, aEntities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAEntity() {
		return aEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAEntity(String newAEntity) {
		String oldAEntity = aEntity;
		aEntity = newAEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatetypesPackage.DATA_TYPE_TEST__AENTITY, oldAEntity, aEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAFloat() {
		return aFloat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAFloat(float newAFloat) {
		float oldAFloat = aFloat;
		aFloat = newAFloat;
		boolean oldAFloatESet = aFloatESet;
		aFloatESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatetypesPackage.DATA_TYPE_TEST__AFLOAT, oldAFloat, aFloat, !oldAFloatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAFloat() {
		float oldAFloat = aFloat;
		boolean oldAFloatESet = aFloatESet;
		aFloat = AFLOAT_EDEFAULT;
		aFloatESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DatetypesPackage.DATA_TYPE_TEST__AFLOAT, oldAFloat, AFLOAT_EDEFAULT, oldAFloatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAFloat() {
		return aFloatESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getAGDay() {
		return aGDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAGDay(XMLGregorianCalendar newAGDay) {
		XMLGregorianCalendar oldAGDay = aGDay;
		aGDay = newAGDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatetypesPackage.DATA_TYPE_TEST__AG_DAY, oldAGDay, aGDay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getAGMonth() {
		return aGMonth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAGMonth(XMLGregorianCalendar newAGMonth) {
		XMLGregorianCalendar oldAGMonth = aGMonth;
		aGMonth = newAGMonth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatetypesPackage.DATA_TYPE_TEST__AG_MONTH, oldAGMonth, aGMonth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getAGMonthDay() {
		return aGMonthDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAGMonthDay(XMLGregorianCalendar newAGMonthDay) {
		XMLGregorianCalendar oldAGMonthDay = aGMonthDay;
		aGMonthDay = newAGMonthDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatetypesPackage.DATA_TYPE_TEST__AG_MONTH_DAY, oldAGMonthDay, aGMonthDay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getAGYear() {
		return aGYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAGYear(XMLGregorianCalendar newAGYear) {
		XMLGregorianCalendar oldAGYear = aGYear;
		aGYear = newAGYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatetypesPackage.DATA_TYPE_TEST__AG_YEAR, oldAGYear, aGYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getAGYearMonth() {
		return aGYearMonth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAGYearMonth(XMLGregorianCalendar newAGYearMonth) {
		XMLGregorianCalendar oldAGYearMonth = aGYearMonth;
		aGYearMonth = newAGYearMonth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatetypesPackage.DATA_TYPE_TEST__AG_YEAR_MONTH, oldAGYearMonth, aGYearMonth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getAHexBinary() {
		return aHexBinary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAHexBinary(byte[] newAHexBinary) {
		byte[] oldAHexBinary = aHexBinary;
		aHexBinary = newAHexBinary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatetypesPackage.DATA_TYPE_TEST__AHEX_BINARY, oldAHexBinary, aHexBinary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAID() {
		return aID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAID(String newAID) {
		String oldAID = aID;
		aID = newAID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatetypesPackage.DATA_TYPE_TEST__AID, oldAID, aID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAIDREF() {
		return aIDREF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAIDREF(String newAIDREF) {
		String oldAIDREF = aIDREF;
		aIDREF = newAIDREF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatetypesPackage.DATA_TYPE_TEST__AIDREF, oldAIDREF, aIDREF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getAIDREFS() {
		return aIDREFS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAIDREFS(List<String> newAIDREFS) {
		List<String> oldAIDREFS = aIDREFS;
		aIDREFS = newAIDREFS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatetypesPackage.DATA_TYPE_TEST__AIDREFS, oldAIDREFS, aIDREFS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAInt() {
		return aInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAInt(int newAInt) {
		int oldAInt = aInt;
		aInt = newAInt;
		boolean oldAIntESet = aIntESet;
		aIntESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatetypesPackage.DATA_TYPE_TEST__AINT, oldAInt, aInt, !oldAIntESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAInt() {
		int oldAInt = aInt;
		boolean oldAIntESet = aIntESet;
		aInt = AINT_EDEFAULT;
		aIntESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DatetypesPackage.DATA_TYPE_TEST__AINT, oldAInt, AINT_EDEFAULT, oldAIntESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAInt() {
		return aIntESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getAInteger() {
		return aInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAInteger(BigInteger newAInteger) {
		BigInteger oldAInteger = aInteger;
		aInteger = newAInteger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatetypesPackage.DATA_TYPE_TEST__AINTEGER, oldAInteger, aInteger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getALanguage() {
		return aLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setALanguage(String newALanguage) {
		String oldALanguage = aLanguage;
		aLanguage = newALanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatetypesPackage.DATA_TYPE_TEST__ALANGUAGE, oldALanguage, aLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getALong() {
		return aLong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setALong(long newALong) {
		long oldALong = aLong;
		aLong = newALong;
		boolean oldALongESet = aLongESet;
		aLongESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatetypesPackage.DATA_TYPE_TEST__ALONG, oldALong, aLong, !oldALongESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetALong() {
		long oldALong = aLong;
		boolean oldALongESet = aLongESet;
		aLong = ALONG_EDEFAULT;
		aLongESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DatetypesPackage.DATA_TYPE_TEST__ALONG, oldALong, ALONG_EDEFAULT, oldALongESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetALong() {
		return aLongESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAName() {
		return aName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAName(String newAName) {
		String oldAName = aName;
		aName = newAName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatetypesPackage.DATA_TYPE_TEST__ANAME, oldAName, aName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getANCName() {
		return aNCName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setANCName(String newANCName) {
		String oldANCName = aNCName;
		aNCName = newANCName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatetypesPackage.DATA_TYPE_TEST__ANC_NAME, oldANCName, aNCName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getANMTOKEN() {
		return aNMTOKEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setANMTOKEN(String newANMTOKEN) {
		String oldANMTOKEN = aNMTOKEN;
		aNMTOKEN = newANMTOKEN;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatetypesPackage.DATA_TYPE_TEST__ANMTOKEN, oldANMTOKEN, aNMTOKEN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getANMTOKENS() {
		return aNMTOKENS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setANMTOKENS(List<String> newANMTOKENS) {
		List<String> oldANMTOKENS = aNMTOKENS;
		aNMTOKENS = newANMTOKENS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatetypesPackage.DATA_TYPE_TEST__ANMTOKENS, oldANMTOKENS, aNMTOKENS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getANonNegativeInteger() {
		return aNonNegativeInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setANonNegativeInteger(BigInteger newANonNegativeInteger) {
		BigInteger oldANonNegativeInteger = aNonNegativeInteger;
		aNonNegativeInteger = newANonNegativeInteger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatetypesPackage.DATA_TYPE_TEST__ANON_NEGATIVE_INTEGER, oldANonNegativeInteger, aNonNegativeInteger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getANonPositiveInteger() {
		return aNonPositiveInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setANonPositiveInteger(BigInteger newANonPositiveInteger) {
		BigInteger oldANonPositiveInteger = aNonPositiveInteger;
		aNonPositiveInteger = newANonPositiveInteger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatetypesPackage.DATA_TYPE_TEST__ANON_POSITIVE_INTEGER, oldANonPositiveInteger, aNonPositiveInteger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getAPositiveInteger() {
		return aPositiveInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPositiveInteger(BigInteger newAPositiveInteger) {
		BigInteger oldAPositiveInteger = aPositiveInteger;
		aPositiveInteger = newAPositiveInteger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatetypesPackage.DATA_TYPE_TEST__APOSITIVE_INTEGER, oldAPositiveInteger, aPositiveInteger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getAQName() {
		return aQName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAQName(QName newAQName) {
		QName oldAQName = aQName;
		aQName = newAQName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatetypesPackage.DATA_TYPE_TEST__AQ_NAME, oldAQName, aQName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getAShort() {
		return aShort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAShort(short newAShort) {
		short oldAShort = aShort;
		aShort = newAShort;
		boolean oldAShortESet = aShortESet;
		aShortESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatetypesPackage.DATA_TYPE_TEST__ASHORT, oldAShort, aShort, !oldAShortESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAShort() {
		short oldAShort = aShort;
		boolean oldAShortESet = aShortESet;
		aShort = ASHORT_EDEFAULT;
		aShortESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DatetypesPackage.DATA_TYPE_TEST__ASHORT, oldAShort, ASHORT_EDEFAULT, oldAShortESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAShort() {
		return aShortESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAString() {
		return aString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAString(String newAString) {
		String oldAString = aString;
		aString = newAString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatetypesPackage.DATA_TYPE_TEST__ASTRING, oldAString, aString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getATime() {
		return aTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setATime(XMLGregorianCalendar newATime) {
		XMLGregorianCalendar oldATime = aTime;
		aTime = newATime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatetypesPackage.DATA_TYPE_TEST__ATIME, oldATime, aTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAToken() {
		return aToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAToken(String newAToken) {
		String oldAToken = aToken;
		aToken = newAToken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatetypesPackage.DATA_TYPE_TEST__ATOKEN, oldAToken, aToken));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getAUnsignedByte() {
		return aUnsignedByte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAUnsignedByte(short newAUnsignedByte) {
		short oldAUnsignedByte = aUnsignedByte;
		aUnsignedByte = newAUnsignedByte;
		boolean oldAUnsignedByteESet = aUnsignedByteESet;
		aUnsignedByteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatetypesPackage.DATA_TYPE_TEST__AUNSIGNED_BYTE, oldAUnsignedByte, aUnsignedByte, !oldAUnsignedByteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAUnsignedByte() {
		short oldAUnsignedByte = aUnsignedByte;
		boolean oldAUnsignedByteESet = aUnsignedByteESet;
		aUnsignedByte = AUNSIGNED_BYTE_EDEFAULT;
		aUnsignedByteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DatetypesPackage.DATA_TYPE_TEST__AUNSIGNED_BYTE, oldAUnsignedByte, AUNSIGNED_BYTE_EDEFAULT, oldAUnsignedByteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAUnsignedByte() {
		return aUnsignedByteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getAUnsignedInt() {
		return aUnsignedInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAUnsignedInt(long newAUnsignedInt) {
		long oldAUnsignedInt = aUnsignedInt;
		aUnsignedInt = newAUnsignedInt;
		boolean oldAUnsignedIntESet = aUnsignedIntESet;
		aUnsignedIntESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatetypesPackage.DATA_TYPE_TEST__AUNSIGNED_INT, oldAUnsignedInt, aUnsignedInt, !oldAUnsignedIntESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAUnsignedInt() {
		long oldAUnsignedInt = aUnsignedInt;
		boolean oldAUnsignedIntESet = aUnsignedIntESet;
		aUnsignedInt = AUNSIGNED_INT_EDEFAULT;
		aUnsignedIntESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DatetypesPackage.DATA_TYPE_TEST__AUNSIGNED_INT, oldAUnsignedInt, AUNSIGNED_INT_EDEFAULT, oldAUnsignedIntESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAUnsignedInt() {
		return aUnsignedIntESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getAUnsignedLong() {
		return aUnsignedLong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAUnsignedLong(BigInteger newAUnsignedLong) {
		BigInteger oldAUnsignedLong = aUnsignedLong;
		aUnsignedLong = newAUnsignedLong;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatetypesPackage.DATA_TYPE_TEST__AUNSIGNED_LONG, oldAUnsignedLong, aUnsignedLong));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAUnsignedShort() {
		return aUnsignedShort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAUnsignedShort(int newAUnsignedShort) {
		int oldAUnsignedShort = aUnsignedShort;
		aUnsignedShort = newAUnsignedShort;
		boolean oldAUnsignedShortESet = aUnsignedShortESet;
		aUnsignedShortESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatetypesPackage.DATA_TYPE_TEST__AUNSIGNED_SHORT, oldAUnsignedShort, aUnsignedShort, !oldAUnsignedShortESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAUnsignedShort() {
		int oldAUnsignedShort = aUnsignedShort;
		boolean oldAUnsignedShortESet = aUnsignedShortESet;
		aUnsignedShort = AUNSIGNED_SHORT_EDEFAULT;
		aUnsignedShortESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DatetypesPackage.DATA_TYPE_TEST__AUNSIGNED_SHORT, oldAUnsignedShort, AUNSIGNED_SHORT_EDEFAULT, oldAUnsignedShortESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAUnsignedShort() {
		return aUnsignedShortESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatetypesPackage.DATA_TYPE_TEST__AANY_SIMPLE_TYPE:
				return getAAnySimpleType();
			case DatetypesPackage.DATA_TYPE_TEST__AANY_URI:
				return getAAnyURI();
			case DatetypesPackage.DATA_TYPE_TEST__ABASE64_BINARY:
				return getABase64Binary();
			case DatetypesPackage.DATA_TYPE_TEST__ABOOLEAN:
				return isABoolean();
			case DatetypesPackage.DATA_TYPE_TEST__ABYTE:
				return getAByte();
			case DatetypesPackage.DATA_TYPE_TEST__ADATE:
				return getADate();
			case DatetypesPackage.DATA_TYPE_TEST__ADATE_TIME:
				return getADateTime();
			case DatetypesPackage.DATA_TYPE_TEST__ADECIMAL:
				return getADecimal();
			case DatetypesPackage.DATA_TYPE_TEST__ADOUBLE:
				return getADouble();
			case DatetypesPackage.DATA_TYPE_TEST__ADURATION:
				return getADuration();
			case DatetypesPackage.DATA_TYPE_TEST__AENTITIES:
				return getAEntities();
			case DatetypesPackage.DATA_TYPE_TEST__AENTITY:
				return getAEntity();
			case DatetypesPackage.DATA_TYPE_TEST__AFLOAT:
				return getAFloat();
			case DatetypesPackage.DATA_TYPE_TEST__AG_DAY:
				return getAGDay();
			case DatetypesPackage.DATA_TYPE_TEST__AG_MONTH:
				return getAGMonth();
			case DatetypesPackage.DATA_TYPE_TEST__AG_MONTH_DAY:
				return getAGMonthDay();
			case DatetypesPackage.DATA_TYPE_TEST__AG_YEAR:
				return getAGYear();
			case DatetypesPackage.DATA_TYPE_TEST__AG_YEAR_MONTH:
				return getAGYearMonth();
			case DatetypesPackage.DATA_TYPE_TEST__AHEX_BINARY:
				return getAHexBinary();
			case DatetypesPackage.DATA_TYPE_TEST__AID:
				return getAID();
			case DatetypesPackage.DATA_TYPE_TEST__AIDREF:
				return getAIDREF();
			case DatetypesPackage.DATA_TYPE_TEST__AIDREFS:
				return getAIDREFS();
			case DatetypesPackage.DATA_TYPE_TEST__AINT:
				return getAInt();
			case DatetypesPackage.DATA_TYPE_TEST__AINTEGER:
				return getAInteger();
			case DatetypesPackage.DATA_TYPE_TEST__ALANGUAGE:
				return getALanguage();
			case DatetypesPackage.DATA_TYPE_TEST__ALONG:
				return getALong();
			case DatetypesPackage.DATA_TYPE_TEST__ANAME:
				return getAName();
			case DatetypesPackage.DATA_TYPE_TEST__ANC_NAME:
				return getANCName();
			case DatetypesPackage.DATA_TYPE_TEST__ANMTOKEN:
				return getANMTOKEN();
			case DatetypesPackage.DATA_TYPE_TEST__ANMTOKENS:
				return getANMTOKENS();
			case DatetypesPackage.DATA_TYPE_TEST__ANON_NEGATIVE_INTEGER:
				return getANonNegativeInteger();
			case DatetypesPackage.DATA_TYPE_TEST__ANON_POSITIVE_INTEGER:
				return getANonPositiveInteger();
			case DatetypesPackage.DATA_TYPE_TEST__APOSITIVE_INTEGER:
				return getAPositiveInteger();
			case DatetypesPackage.DATA_TYPE_TEST__AQ_NAME:
				return getAQName();
			case DatetypesPackage.DATA_TYPE_TEST__ASHORT:
				return getAShort();
			case DatetypesPackage.DATA_TYPE_TEST__ASTRING:
				return getAString();
			case DatetypesPackage.DATA_TYPE_TEST__ATIME:
				return getATime();
			case DatetypesPackage.DATA_TYPE_TEST__ATOKEN:
				return getAToken();
			case DatetypesPackage.DATA_TYPE_TEST__AUNSIGNED_BYTE:
				return getAUnsignedByte();
			case DatetypesPackage.DATA_TYPE_TEST__AUNSIGNED_INT:
				return getAUnsignedInt();
			case DatetypesPackage.DATA_TYPE_TEST__AUNSIGNED_LONG:
				return getAUnsignedLong();
			case DatetypesPackage.DATA_TYPE_TEST__AUNSIGNED_SHORT:
				return getAUnsignedShort();
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
			case DatetypesPackage.DATA_TYPE_TEST__AANY_SIMPLE_TYPE:
				setAAnySimpleType(newValue);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__AANY_URI:
				setAAnyURI((String)newValue);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__ABASE64_BINARY:
				setABase64Binary((byte[])newValue);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__ABOOLEAN:
				setABoolean((Boolean)newValue);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__ABYTE:
				setAByte((Byte)newValue);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__ADATE:
				setADate((XMLGregorianCalendar)newValue);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__ADATE_TIME:
				setADateTime((XMLGregorianCalendar)newValue);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__ADECIMAL:
				setADecimal((BigDecimal)newValue);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__ADOUBLE:
				setADouble((Double)newValue);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__ADURATION:
				setADuration((Duration)newValue);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__AENTITIES:
				setAEntities((List<String>)newValue);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__AENTITY:
				setAEntity((String)newValue);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__AFLOAT:
				setAFloat((Float)newValue);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__AG_DAY:
				setAGDay((XMLGregorianCalendar)newValue);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__AG_MONTH:
				setAGMonth((XMLGregorianCalendar)newValue);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__AG_MONTH_DAY:
				setAGMonthDay((XMLGregorianCalendar)newValue);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__AG_YEAR:
				setAGYear((XMLGregorianCalendar)newValue);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__AG_YEAR_MONTH:
				setAGYearMonth((XMLGregorianCalendar)newValue);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__AHEX_BINARY:
				setAHexBinary((byte[])newValue);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__AID:
				setAID((String)newValue);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__AIDREF:
				setAIDREF((String)newValue);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__AIDREFS:
				setAIDREFS((List<String>)newValue);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__AINT:
				setAInt((Integer)newValue);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__AINTEGER:
				setAInteger((BigInteger)newValue);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__ALANGUAGE:
				setALanguage((String)newValue);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__ALONG:
				setALong((Long)newValue);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__ANAME:
				setAName((String)newValue);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__ANC_NAME:
				setANCName((String)newValue);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__ANMTOKEN:
				setANMTOKEN((String)newValue);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__ANMTOKENS:
				setANMTOKENS((List<String>)newValue);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__ANON_NEGATIVE_INTEGER:
				setANonNegativeInteger((BigInteger)newValue);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__ANON_POSITIVE_INTEGER:
				setANonPositiveInteger((BigInteger)newValue);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__APOSITIVE_INTEGER:
				setAPositiveInteger((BigInteger)newValue);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__AQ_NAME:
				setAQName((QName)newValue);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__ASHORT:
				setAShort((Short)newValue);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__ASTRING:
				setAString((String)newValue);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__ATIME:
				setATime((XMLGregorianCalendar)newValue);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__ATOKEN:
				setAToken((String)newValue);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__AUNSIGNED_BYTE:
				setAUnsignedByte((Short)newValue);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__AUNSIGNED_INT:
				setAUnsignedInt((Long)newValue);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__AUNSIGNED_LONG:
				setAUnsignedLong((BigInteger)newValue);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__AUNSIGNED_SHORT:
				setAUnsignedShort((Integer)newValue);
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
			case DatetypesPackage.DATA_TYPE_TEST__AANY_SIMPLE_TYPE:
				setAAnySimpleType(AANY_SIMPLE_TYPE_EDEFAULT);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__AANY_URI:
				setAAnyURI(AANY_URI_EDEFAULT);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__ABASE64_BINARY:
				setABase64Binary(ABASE64_BINARY_EDEFAULT);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__ABOOLEAN:
				unsetABoolean();
				return;
			case DatetypesPackage.DATA_TYPE_TEST__ABYTE:
				unsetAByte();
				return;
			case DatetypesPackage.DATA_TYPE_TEST__ADATE:
				setADate(ADATE_EDEFAULT);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__ADATE_TIME:
				setADateTime(ADATE_TIME_EDEFAULT);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__ADECIMAL:
				setADecimal(ADECIMAL_EDEFAULT);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__ADOUBLE:
				unsetADouble();
				return;
			case DatetypesPackage.DATA_TYPE_TEST__ADURATION:
				setADuration(ADURATION_EDEFAULT);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__AENTITIES:
				setAEntities(AENTITIES_EDEFAULT);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__AENTITY:
				setAEntity(AENTITY_EDEFAULT);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__AFLOAT:
				unsetAFloat();
				return;
			case DatetypesPackage.DATA_TYPE_TEST__AG_DAY:
				setAGDay(AG_DAY_EDEFAULT);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__AG_MONTH:
				setAGMonth(AG_MONTH_EDEFAULT);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__AG_MONTH_DAY:
				setAGMonthDay(AG_MONTH_DAY_EDEFAULT);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__AG_YEAR:
				setAGYear(AG_YEAR_EDEFAULT);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__AG_YEAR_MONTH:
				setAGYearMonth(AG_YEAR_MONTH_EDEFAULT);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__AHEX_BINARY:
				setAHexBinary(AHEX_BINARY_EDEFAULT);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__AID:
				setAID(AID_EDEFAULT);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__AIDREF:
				setAIDREF(AIDREF_EDEFAULT);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__AIDREFS:
				setAIDREFS(AIDREFS_EDEFAULT);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__AINT:
				unsetAInt();
				return;
			case DatetypesPackage.DATA_TYPE_TEST__AINTEGER:
				setAInteger(AINTEGER_EDEFAULT);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__ALANGUAGE:
				setALanguage(ALANGUAGE_EDEFAULT);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__ALONG:
				unsetALong();
				return;
			case DatetypesPackage.DATA_TYPE_TEST__ANAME:
				setAName(ANAME_EDEFAULT);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__ANC_NAME:
				setANCName(ANC_NAME_EDEFAULT);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__ANMTOKEN:
				setANMTOKEN(ANMTOKEN_EDEFAULT);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__ANMTOKENS:
				setANMTOKENS(ANMTOKENS_EDEFAULT);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__ANON_NEGATIVE_INTEGER:
				setANonNegativeInteger(ANON_NEGATIVE_INTEGER_EDEFAULT);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__ANON_POSITIVE_INTEGER:
				setANonPositiveInteger(ANON_POSITIVE_INTEGER_EDEFAULT);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__APOSITIVE_INTEGER:
				setAPositiveInteger(APOSITIVE_INTEGER_EDEFAULT);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__AQ_NAME:
				setAQName(AQ_NAME_EDEFAULT);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__ASHORT:
				unsetAShort();
				return;
			case DatetypesPackage.DATA_TYPE_TEST__ASTRING:
				setAString(ASTRING_EDEFAULT);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__ATIME:
				setATime(ATIME_EDEFAULT);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__ATOKEN:
				setAToken(ATOKEN_EDEFAULT);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__AUNSIGNED_BYTE:
				unsetAUnsignedByte();
				return;
			case DatetypesPackage.DATA_TYPE_TEST__AUNSIGNED_INT:
				unsetAUnsignedInt();
				return;
			case DatetypesPackage.DATA_TYPE_TEST__AUNSIGNED_LONG:
				setAUnsignedLong(AUNSIGNED_LONG_EDEFAULT);
				return;
			case DatetypesPackage.DATA_TYPE_TEST__AUNSIGNED_SHORT:
				unsetAUnsignedShort();
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
			case DatetypesPackage.DATA_TYPE_TEST__AANY_SIMPLE_TYPE:
				return AANY_SIMPLE_TYPE_EDEFAULT == null ? aAnySimpleType != null : !AANY_SIMPLE_TYPE_EDEFAULT.equals(aAnySimpleType);
			case DatetypesPackage.DATA_TYPE_TEST__AANY_URI:
				return AANY_URI_EDEFAULT == null ? aAnyURI != null : !AANY_URI_EDEFAULT.equals(aAnyURI);
			case DatetypesPackage.DATA_TYPE_TEST__ABASE64_BINARY:
				return ABASE64_BINARY_EDEFAULT == null ? aBase64Binary != null : !ABASE64_BINARY_EDEFAULT.equals(aBase64Binary);
			case DatetypesPackage.DATA_TYPE_TEST__ABOOLEAN:
				return isSetABoolean();
			case DatetypesPackage.DATA_TYPE_TEST__ABYTE:
				return isSetAByte();
			case DatetypesPackage.DATA_TYPE_TEST__ADATE:
				return ADATE_EDEFAULT == null ? aDate != null : !ADATE_EDEFAULT.equals(aDate);
			case DatetypesPackage.DATA_TYPE_TEST__ADATE_TIME:
				return ADATE_TIME_EDEFAULT == null ? aDateTime != null : !ADATE_TIME_EDEFAULT.equals(aDateTime);
			case DatetypesPackage.DATA_TYPE_TEST__ADECIMAL:
				return ADECIMAL_EDEFAULT == null ? aDecimal != null : !ADECIMAL_EDEFAULT.equals(aDecimal);
			case DatetypesPackage.DATA_TYPE_TEST__ADOUBLE:
				return isSetADouble();
			case DatetypesPackage.DATA_TYPE_TEST__ADURATION:
				return ADURATION_EDEFAULT == null ? aDuration != null : !ADURATION_EDEFAULT.equals(aDuration);
			case DatetypesPackage.DATA_TYPE_TEST__AENTITIES:
				return AENTITIES_EDEFAULT == null ? aEntities != null : !AENTITIES_EDEFAULT.equals(aEntities);
			case DatetypesPackage.DATA_TYPE_TEST__AENTITY:
				return AENTITY_EDEFAULT == null ? aEntity != null : !AENTITY_EDEFAULT.equals(aEntity);
			case DatetypesPackage.DATA_TYPE_TEST__AFLOAT:
				return isSetAFloat();
			case DatetypesPackage.DATA_TYPE_TEST__AG_DAY:
				return AG_DAY_EDEFAULT == null ? aGDay != null : !AG_DAY_EDEFAULT.equals(aGDay);
			case DatetypesPackage.DATA_TYPE_TEST__AG_MONTH:
				return AG_MONTH_EDEFAULT == null ? aGMonth != null : !AG_MONTH_EDEFAULT.equals(aGMonth);
			case DatetypesPackage.DATA_TYPE_TEST__AG_MONTH_DAY:
				return AG_MONTH_DAY_EDEFAULT == null ? aGMonthDay != null : !AG_MONTH_DAY_EDEFAULT.equals(aGMonthDay);
			case DatetypesPackage.DATA_TYPE_TEST__AG_YEAR:
				return AG_YEAR_EDEFAULT == null ? aGYear != null : !AG_YEAR_EDEFAULT.equals(aGYear);
			case DatetypesPackage.DATA_TYPE_TEST__AG_YEAR_MONTH:
				return AG_YEAR_MONTH_EDEFAULT == null ? aGYearMonth != null : !AG_YEAR_MONTH_EDEFAULT.equals(aGYearMonth);
			case DatetypesPackage.DATA_TYPE_TEST__AHEX_BINARY:
				return AHEX_BINARY_EDEFAULT == null ? aHexBinary != null : !AHEX_BINARY_EDEFAULT.equals(aHexBinary);
			case DatetypesPackage.DATA_TYPE_TEST__AID:
				return AID_EDEFAULT == null ? aID != null : !AID_EDEFAULT.equals(aID);
			case DatetypesPackage.DATA_TYPE_TEST__AIDREF:
				return AIDREF_EDEFAULT == null ? aIDREF != null : !AIDREF_EDEFAULT.equals(aIDREF);
			case DatetypesPackage.DATA_TYPE_TEST__AIDREFS:
				return AIDREFS_EDEFAULT == null ? aIDREFS != null : !AIDREFS_EDEFAULT.equals(aIDREFS);
			case DatetypesPackage.DATA_TYPE_TEST__AINT:
				return isSetAInt();
			case DatetypesPackage.DATA_TYPE_TEST__AINTEGER:
				return AINTEGER_EDEFAULT == null ? aInteger != null : !AINTEGER_EDEFAULT.equals(aInteger);
			case DatetypesPackage.DATA_TYPE_TEST__ALANGUAGE:
				return ALANGUAGE_EDEFAULT == null ? aLanguage != null : !ALANGUAGE_EDEFAULT.equals(aLanguage);
			case DatetypesPackage.DATA_TYPE_TEST__ALONG:
				return isSetALong();
			case DatetypesPackage.DATA_TYPE_TEST__ANAME:
				return ANAME_EDEFAULT == null ? aName != null : !ANAME_EDEFAULT.equals(aName);
			case DatetypesPackage.DATA_TYPE_TEST__ANC_NAME:
				return ANC_NAME_EDEFAULT == null ? aNCName != null : !ANC_NAME_EDEFAULT.equals(aNCName);
			case DatetypesPackage.DATA_TYPE_TEST__ANMTOKEN:
				return ANMTOKEN_EDEFAULT == null ? aNMTOKEN != null : !ANMTOKEN_EDEFAULT.equals(aNMTOKEN);
			case DatetypesPackage.DATA_TYPE_TEST__ANMTOKENS:
				return ANMTOKENS_EDEFAULT == null ? aNMTOKENS != null : !ANMTOKENS_EDEFAULT.equals(aNMTOKENS);
			case DatetypesPackage.DATA_TYPE_TEST__ANON_NEGATIVE_INTEGER:
				return ANON_NEGATIVE_INTEGER_EDEFAULT == null ? aNonNegativeInteger != null : !ANON_NEGATIVE_INTEGER_EDEFAULT.equals(aNonNegativeInteger);
			case DatetypesPackage.DATA_TYPE_TEST__ANON_POSITIVE_INTEGER:
				return ANON_POSITIVE_INTEGER_EDEFAULT == null ? aNonPositiveInteger != null : !ANON_POSITIVE_INTEGER_EDEFAULT.equals(aNonPositiveInteger);
			case DatetypesPackage.DATA_TYPE_TEST__APOSITIVE_INTEGER:
				return APOSITIVE_INTEGER_EDEFAULT == null ? aPositiveInteger != null : !APOSITIVE_INTEGER_EDEFAULT.equals(aPositiveInteger);
			case DatetypesPackage.DATA_TYPE_TEST__AQ_NAME:
				return AQ_NAME_EDEFAULT == null ? aQName != null : !AQ_NAME_EDEFAULT.equals(aQName);
			case DatetypesPackage.DATA_TYPE_TEST__ASHORT:
				return isSetAShort();
			case DatetypesPackage.DATA_TYPE_TEST__ASTRING:
				return ASTRING_EDEFAULT == null ? aString != null : !ASTRING_EDEFAULT.equals(aString);
			case DatetypesPackage.DATA_TYPE_TEST__ATIME:
				return ATIME_EDEFAULT == null ? aTime != null : !ATIME_EDEFAULT.equals(aTime);
			case DatetypesPackage.DATA_TYPE_TEST__ATOKEN:
				return ATOKEN_EDEFAULT == null ? aToken != null : !ATOKEN_EDEFAULT.equals(aToken);
			case DatetypesPackage.DATA_TYPE_TEST__AUNSIGNED_BYTE:
				return isSetAUnsignedByte();
			case DatetypesPackage.DATA_TYPE_TEST__AUNSIGNED_INT:
				return isSetAUnsignedInt();
			case DatetypesPackage.DATA_TYPE_TEST__AUNSIGNED_LONG:
				return AUNSIGNED_LONG_EDEFAULT == null ? aUnsignedLong != null : !AUNSIGNED_LONG_EDEFAULT.equals(aUnsignedLong);
			case DatetypesPackage.DATA_TYPE_TEST__AUNSIGNED_SHORT:
				return isSetAUnsignedShort();
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
		result.append(" (aAnySimpleType: ");
		result.append(aAnySimpleType);
		result.append(", aAnyURI: ");
		result.append(aAnyURI);
		result.append(", aBase64Binary: ");
		result.append(aBase64Binary);
		result.append(", aBoolean: ");
		if (aBooleanESet) result.append(aBoolean); else result.append("<unset>");
		result.append(", aByte: ");
		if (aByteESet) result.append(aByte); else result.append("<unset>");
		result.append(", aDate: ");
		result.append(aDate);
		result.append(", aDateTime: ");
		result.append(aDateTime);
		result.append(", aDecimal: ");
		result.append(aDecimal);
		result.append(", aDouble: ");
		if (aDoubleESet) result.append(aDouble); else result.append("<unset>");
		result.append(", aDuration: ");
		result.append(aDuration);
		result.append(", aEntities: ");
		result.append(aEntities);
		result.append(", aEntity: ");
		result.append(aEntity);
		result.append(", aFloat: ");
		if (aFloatESet) result.append(aFloat); else result.append("<unset>");
		result.append(", aGDay: ");
		result.append(aGDay);
		result.append(", aGMonth: ");
		result.append(aGMonth);
		result.append(", aGMonthDay: ");
		result.append(aGMonthDay);
		result.append(", aGYear: ");
		result.append(aGYear);
		result.append(", aGYearMonth: ");
		result.append(aGYearMonth);
		result.append(", aHexBinary: ");
		result.append(aHexBinary);
		result.append(", aID: ");
		result.append(aID);
		result.append(", aIDREF: ");
		result.append(aIDREF);
		result.append(", aIDREFS: ");
		result.append(aIDREFS);
		result.append(", aInt: ");
		if (aIntESet) result.append(aInt); else result.append("<unset>");
		result.append(", aInteger: ");
		result.append(aInteger);
		result.append(", aLanguage: ");
		result.append(aLanguage);
		result.append(", aLong: ");
		if (aLongESet) result.append(aLong); else result.append("<unset>");
		result.append(", aName: ");
		result.append(aName);
		result.append(", aNCName: ");
		result.append(aNCName);
		result.append(", aNMTOKEN: ");
		result.append(aNMTOKEN);
		result.append(", aNMTOKENS: ");
		result.append(aNMTOKENS);
		result.append(", aNonNegativeInteger: ");
		result.append(aNonNegativeInteger);
		result.append(", aNonPositiveInteger: ");
		result.append(aNonPositiveInteger);
		result.append(", aPositiveInteger: ");
		result.append(aPositiveInteger);
		result.append(", aQName: ");
		result.append(aQName);
		result.append(", aShort: ");
		if (aShortESet) result.append(aShort); else result.append("<unset>");
		result.append(", aString: ");
		result.append(aString);
		result.append(", aTime: ");
		result.append(aTime);
		result.append(", aToken: ");
		result.append(aToken);
		result.append(", aUnsignedByte: ");
		if (aUnsignedByteESet) result.append(aUnsignedByte); else result.append("<unset>");
		result.append(", aUnsignedInt: ");
		if (aUnsignedIntESet) result.append(aUnsignedInt); else result.append("<unset>");
		result.append(", aUnsignedLong: ");
		result.append(aUnsignedLong);
		result.append(", aUnsignedShort: ");
		if (aUnsignedShortESet) result.append(aUnsignedShort); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DataTypeTestImpl
