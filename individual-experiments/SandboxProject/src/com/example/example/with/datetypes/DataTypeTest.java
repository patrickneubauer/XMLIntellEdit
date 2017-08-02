/**
 */
package com.example.example.with.datetypes;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.List;

import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;

import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.example.example.with.datetypes.DataTypeTest#getAAnySimpleType <em>AAny Simple Type</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.DataTypeTest#getAAnyURI <em>AAny URI</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.DataTypeTest#getABase64Binary <em>ABase64 Binary</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.DataTypeTest#isABoolean <em>ABoolean</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.DataTypeTest#getAByte <em>AByte</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.DataTypeTest#getADate <em>ADate</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.DataTypeTest#getADateTime <em>ADate Time</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.DataTypeTest#getADecimal <em>ADecimal</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.DataTypeTest#getADouble <em>ADouble</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.DataTypeTest#getADuration <em>ADuration</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.DataTypeTest#getAEntities <em>AEntities</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.DataTypeTest#getAEntity <em>AEntity</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.DataTypeTest#getAFloat <em>AFloat</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.DataTypeTest#getAGDay <em>AG Day</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.DataTypeTest#getAGMonth <em>AG Month</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.DataTypeTest#getAGMonthDay <em>AG Month Day</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.DataTypeTest#getAGYear <em>AG Year</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.DataTypeTest#getAGYearMonth <em>AG Year Month</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.DataTypeTest#getAHexBinary <em>AHex Binary</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.DataTypeTest#getAID <em>AID</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.DataTypeTest#getAIDREF <em>AIDREF</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.DataTypeTest#getAIDREFS <em>AIDREFS</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.DataTypeTest#getAInt <em>AInt</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.DataTypeTest#getAInteger <em>AInteger</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.DataTypeTest#getALanguage <em>ALanguage</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.DataTypeTest#getALong <em>ALong</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.DataTypeTest#getAName <em>AName</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.DataTypeTest#getANCName <em>ANC Name</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.DataTypeTest#getANMTOKEN <em>ANMTOKEN</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.DataTypeTest#getANMTOKENS <em>ANMTOKENS</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.DataTypeTest#getANonNegativeInteger <em>ANon Negative Integer</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.DataTypeTest#getANonPositiveInteger <em>ANon Positive Integer</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.DataTypeTest#getAPositiveInteger <em>APositive Integer</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.DataTypeTest#getAQName <em>AQ Name</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.DataTypeTest#getAShort <em>AShort</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.DataTypeTest#getAString <em>AString</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.DataTypeTest#getATime <em>ATime</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.DataTypeTest#getAToken <em>AToken</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.DataTypeTest#getAUnsignedByte <em>AUnsigned Byte</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.DataTypeTest#getAUnsignedInt <em>AUnsigned Int</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.DataTypeTest#getAUnsignedLong <em>AUnsigned Long</em>}</li>
 *   <li>{@link com.example.example.with.datetypes.DataTypeTest#getAUnsignedShort <em>AUnsigned Short</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.example.with.datetypes.DatetypesPackage#getDataTypeTest()
 * @model extendedMetaData="name='DataTypeTest' kind='empty'"
 * @generated
 */
public interface DataTypeTest extends EObject {
	/**
	 * Returns the value of the '<em><b>AAny Simple Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AAny Simple Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AAny Simple Type</em>' attribute.
	 * @see #setAAnySimpleType(Object)
	 * @see com.example.example.with.datetypes.DatetypesPackage#getDataTypeTest_AAnySimpleType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='aAnySimpleType'"
	 * @generated
	 */
	Object getAAnySimpleType();

	/**
	 * Sets the value of the '{@link com.example.example.with.datetypes.DataTypeTest#getAAnySimpleType <em>AAny Simple Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AAny Simple Type</em>' attribute.
	 * @see #getAAnySimpleType()
	 * @generated
	 */
	void setAAnySimpleType(Object value);

	/**
	 * Returns the value of the '<em><b>AAny URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AAny URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AAny URI</em>' attribute.
	 * @see #setAAnyURI(String)
	 * @see com.example.example.with.datetypes.DatetypesPackage#getDataTypeTest_AAnyURI()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='aAnyURI'"
	 * @generated
	 */
	String getAAnyURI();

	/**
	 * Sets the value of the '{@link com.example.example.with.datetypes.DataTypeTest#getAAnyURI <em>AAny URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AAny URI</em>' attribute.
	 * @see #getAAnyURI()
	 * @generated
	 */
	void setAAnyURI(String value);

	/**
	 * Returns the value of the '<em><b>ABase64 Binary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ABase64 Binary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ABase64 Binary</em>' attribute.
	 * @see #setABase64Binary(byte[])
	 * @see com.example.example.with.datetypes.DatetypesPackage#getDataTypeTest_ABase64Binary()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 *        extendedMetaData="kind='attribute' name='aBase64Binary'"
	 * @generated
	 */
	byte[] getABase64Binary();

	/**
	 * Sets the value of the '{@link com.example.example.with.datetypes.DataTypeTest#getABase64Binary <em>ABase64 Binary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ABase64 Binary</em>' attribute.
	 * @see #getABase64Binary()
	 * @generated
	 */
	void setABase64Binary(byte[] value);

	/**
	 * Returns the value of the '<em><b>ABoolean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ABoolean</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ABoolean</em>' attribute.
	 * @see #isSetABoolean()
	 * @see #unsetABoolean()
	 * @see #setABoolean(boolean)
	 * @see com.example.example.with.datetypes.DatetypesPackage#getDataTypeTest_ABoolean()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='aBoolean'"
	 * @generated
	 */
	boolean isABoolean();

	/**
	 * Sets the value of the '{@link com.example.example.with.datetypes.DataTypeTest#isABoolean <em>ABoolean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ABoolean</em>' attribute.
	 * @see #isSetABoolean()
	 * @see #unsetABoolean()
	 * @see #isABoolean()
	 * @generated
	 */
	void setABoolean(boolean value);

	/**
	 * Unsets the value of the '{@link com.example.example.with.datetypes.DataTypeTest#isABoolean <em>ABoolean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetABoolean()
	 * @see #isABoolean()
	 * @see #setABoolean(boolean)
	 * @generated
	 */
	void unsetABoolean();

	/**
	 * Returns whether the value of the '{@link com.example.example.with.datetypes.DataTypeTest#isABoolean <em>ABoolean</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ABoolean</em>' attribute is set.
	 * @see #unsetABoolean()
	 * @see #isABoolean()
	 * @see #setABoolean(boolean)
	 * @generated
	 */
	boolean isSetABoolean();

	/**
	 * Returns the value of the '<em><b>AByte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AByte</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AByte</em>' attribute.
	 * @see #isSetAByte()
	 * @see #unsetAByte()
	 * @see #setAByte(byte)
	 * @see com.example.example.with.datetypes.DatetypesPackage#getDataTypeTest_AByte()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Byte"
	 *        extendedMetaData="kind='attribute' name='aByte'"
	 * @generated
	 */
	byte getAByte();

	/**
	 * Sets the value of the '{@link com.example.example.with.datetypes.DataTypeTest#getAByte <em>AByte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AByte</em>' attribute.
	 * @see #isSetAByte()
	 * @see #unsetAByte()
	 * @see #getAByte()
	 * @generated
	 */
	void setAByte(byte value);

	/**
	 * Unsets the value of the '{@link com.example.example.with.datetypes.DataTypeTest#getAByte <em>AByte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAByte()
	 * @see #getAByte()
	 * @see #setAByte(byte)
	 * @generated
	 */
	void unsetAByte();

	/**
	 * Returns whether the value of the '{@link com.example.example.with.datetypes.DataTypeTest#getAByte <em>AByte</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>AByte</em>' attribute is set.
	 * @see #unsetAByte()
	 * @see #getAByte()
	 * @see #setAByte(byte)
	 * @generated
	 */
	boolean isSetAByte();

	/**
	 * Returns the value of the '<em><b>ADate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ADate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ADate</em>' attribute.
	 * @see #setADate(XMLGregorianCalendar)
	 * @see com.example.example.with.datetypes.DatetypesPackage#getDataTypeTest_ADate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='attribute' name='aDate'"
	 * @generated
	 */
	XMLGregorianCalendar getADate();

	/**
	 * Sets the value of the '{@link com.example.example.with.datetypes.DataTypeTest#getADate <em>ADate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ADate</em>' attribute.
	 * @see #getADate()
	 * @generated
	 */
	void setADate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>ADate Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ADate Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ADate Time</em>' attribute.
	 * @see #setADateTime(XMLGregorianCalendar)
	 * @see com.example.example.with.datetypes.DatetypesPackage#getDataTypeTest_ADateTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='attribute' name='aDateTime'"
	 * @generated
	 */
	XMLGregorianCalendar getADateTime();

	/**
	 * Sets the value of the '{@link com.example.example.with.datetypes.DataTypeTest#getADateTime <em>ADate Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ADate Time</em>' attribute.
	 * @see #getADateTime()
	 * @generated
	 */
	void setADateTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>ADecimal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ADecimal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ADecimal</em>' attribute.
	 * @see #setADecimal(BigDecimal)
	 * @see com.example.example.with.datetypes.DatetypesPackage#getDataTypeTest_ADecimal()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='attribute' name='aDecimal'"
	 * @generated
	 */
	BigDecimal getADecimal();

	/**
	 * Sets the value of the '{@link com.example.example.with.datetypes.DataTypeTest#getADecimal <em>ADecimal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ADecimal</em>' attribute.
	 * @see #getADecimal()
	 * @generated
	 */
	void setADecimal(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>ADouble</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ADouble</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ADouble</em>' attribute.
	 * @see #isSetADouble()
	 * @see #unsetADouble()
	 * @see #setADouble(double)
	 * @see com.example.example.with.datetypes.DatetypesPackage#getDataTypeTest_ADouble()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='aDouble'"
	 * @generated
	 */
	double getADouble();

	/**
	 * Sets the value of the '{@link com.example.example.with.datetypes.DataTypeTest#getADouble <em>ADouble</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ADouble</em>' attribute.
	 * @see #isSetADouble()
	 * @see #unsetADouble()
	 * @see #getADouble()
	 * @generated
	 */
	void setADouble(double value);

	/**
	 * Unsets the value of the '{@link com.example.example.with.datetypes.DataTypeTest#getADouble <em>ADouble</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetADouble()
	 * @see #getADouble()
	 * @see #setADouble(double)
	 * @generated
	 */
	void unsetADouble();

	/**
	 * Returns whether the value of the '{@link com.example.example.with.datetypes.DataTypeTest#getADouble <em>ADouble</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ADouble</em>' attribute is set.
	 * @see #unsetADouble()
	 * @see #getADouble()
	 * @see #setADouble(double)
	 * @generated
	 */
	boolean isSetADouble();

	/**
	 * Returns the value of the '<em><b>ADuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ADuration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ADuration</em>' attribute.
	 * @see #setADuration(Duration)
	 * @see com.example.example.with.datetypes.DatetypesPackage#getDataTypeTest_ADuration()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Duration"
	 *        extendedMetaData="kind='attribute' name='aDuration'"
	 * @generated
	 */
	Duration getADuration();

	/**
	 * Sets the value of the '{@link com.example.example.with.datetypes.DataTypeTest#getADuration <em>ADuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ADuration</em>' attribute.
	 * @see #getADuration()
	 * @generated
	 */
	void setADuration(Duration value);

	/**
	 * Returns the value of the '<em><b>AEntities</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AEntities</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AEntities</em>' attribute.
	 * @see #setAEntities(List)
	 * @see com.example.example.with.datetypes.DatetypesPackage#getDataTypeTest_AEntities()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.ENTITIES" many="false"
	 *        extendedMetaData="kind='attribute' name='aEntities'"
	 * @generated
	 */
	List<String> getAEntities();

	/**
	 * Sets the value of the '{@link com.example.example.with.datetypes.DataTypeTest#getAEntities <em>AEntities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AEntities</em>' attribute.
	 * @see #getAEntities()
	 * @generated
	 */
	void setAEntities(List<String> value);

	/**
	 * Returns the value of the '<em><b>AEntity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AEntity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AEntity</em>' attribute.
	 * @see #setAEntity(String)
	 * @see com.example.example.with.datetypes.DatetypesPackage#getDataTypeTest_AEntity()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.ENTITY"
	 *        extendedMetaData="kind='attribute' name='aEntity'"
	 * @generated
	 */
	String getAEntity();

	/**
	 * Sets the value of the '{@link com.example.example.with.datetypes.DataTypeTest#getAEntity <em>AEntity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AEntity</em>' attribute.
	 * @see #getAEntity()
	 * @generated
	 */
	void setAEntity(String value);

	/**
	 * Returns the value of the '<em><b>AFloat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AFloat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AFloat</em>' attribute.
	 * @see #isSetAFloat()
	 * @see #unsetAFloat()
	 * @see #setAFloat(float)
	 * @see com.example.example.with.datetypes.DatetypesPackage#getDataTypeTest_AFloat()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='aFloat'"
	 * @generated
	 */
	float getAFloat();

	/**
	 * Sets the value of the '{@link com.example.example.with.datetypes.DataTypeTest#getAFloat <em>AFloat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AFloat</em>' attribute.
	 * @see #isSetAFloat()
	 * @see #unsetAFloat()
	 * @see #getAFloat()
	 * @generated
	 */
	void setAFloat(float value);

	/**
	 * Unsets the value of the '{@link com.example.example.with.datetypes.DataTypeTest#getAFloat <em>AFloat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAFloat()
	 * @see #getAFloat()
	 * @see #setAFloat(float)
	 * @generated
	 */
	void unsetAFloat();

	/**
	 * Returns whether the value of the '{@link com.example.example.with.datetypes.DataTypeTest#getAFloat <em>AFloat</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>AFloat</em>' attribute is set.
	 * @see #unsetAFloat()
	 * @see #getAFloat()
	 * @see #setAFloat(float)
	 * @generated
	 */
	boolean isSetAFloat();

	/**
	 * Returns the value of the '<em><b>AG Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AG Day</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AG Day</em>' attribute.
	 * @see #setAGDay(XMLGregorianCalendar)
	 * @see com.example.example.with.datetypes.DatetypesPackage#getDataTypeTest_AGDay()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.GDay"
	 *        extendedMetaData="kind='attribute' name='aGDay'"
	 * @generated
	 */
	XMLGregorianCalendar getAGDay();

	/**
	 * Sets the value of the '{@link com.example.example.with.datetypes.DataTypeTest#getAGDay <em>AG Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AG Day</em>' attribute.
	 * @see #getAGDay()
	 * @generated
	 */
	void setAGDay(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>AG Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AG Month</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AG Month</em>' attribute.
	 * @see #setAGMonth(XMLGregorianCalendar)
	 * @see com.example.example.with.datetypes.DatetypesPackage#getDataTypeTest_AGMonth()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.GMonth"
	 *        extendedMetaData="kind='attribute' name='aGMonth'"
	 * @generated
	 */
	XMLGregorianCalendar getAGMonth();

	/**
	 * Sets the value of the '{@link com.example.example.with.datetypes.DataTypeTest#getAGMonth <em>AG Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AG Month</em>' attribute.
	 * @see #getAGMonth()
	 * @generated
	 */
	void setAGMonth(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>AG Month Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AG Month Day</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AG Month Day</em>' attribute.
	 * @see #setAGMonthDay(XMLGregorianCalendar)
	 * @see com.example.example.with.datetypes.DatetypesPackage#getDataTypeTest_AGMonthDay()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.GMonthDay"
	 *        extendedMetaData="kind='attribute' name='aGMonthDay'"
	 * @generated
	 */
	XMLGregorianCalendar getAGMonthDay();

	/**
	 * Sets the value of the '{@link com.example.example.with.datetypes.DataTypeTest#getAGMonthDay <em>AG Month Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AG Month Day</em>' attribute.
	 * @see #getAGMonthDay()
	 * @generated
	 */
	void setAGMonthDay(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>AG Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AG Year</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AG Year</em>' attribute.
	 * @see #setAGYear(XMLGregorianCalendar)
	 * @see com.example.example.with.datetypes.DatetypesPackage#getDataTypeTest_AGYear()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.GYear"
	 *        extendedMetaData="kind='attribute' name='aGYear'"
	 * @generated
	 */
	XMLGregorianCalendar getAGYear();

	/**
	 * Sets the value of the '{@link com.example.example.with.datetypes.DataTypeTest#getAGYear <em>AG Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AG Year</em>' attribute.
	 * @see #getAGYear()
	 * @generated
	 */
	void setAGYear(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>AG Year Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AG Year Month</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AG Year Month</em>' attribute.
	 * @see #setAGYearMonth(XMLGregorianCalendar)
	 * @see com.example.example.with.datetypes.DatetypesPackage#getDataTypeTest_AGYearMonth()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.GYearMonth"
	 *        extendedMetaData="kind='attribute' name='aGYearMonth'"
	 * @generated
	 */
	XMLGregorianCalendar getAGYearMonth();

	/**
	 * Sets the value of the '{@link com.example.example.with.datetypes.DataTypeTest#getAGYearMonth <em>AG Year Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AG Year Month</em>' attribute.
	 * @see #getAGYearMonth()
	 * @generated
	 */
	void setAGYearMonth(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>AHex Binary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AHex Binary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AHex Binary</em>' attribute.
	 * @see #setAHexBinary(byte[])
	 * @see com.example.example.with.datetypes.DatetypesPackage#getDataTypeTest_AHexBinary()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.HexBinary"
	 *        extendedMetaData="kind='attribute' name='aHexBinary'"
	 * @generated
	 */
	byte[] getAHexBinary();

	/**
	 * Sets the value of the '{@link com.example.example.with.datetypes.DataTypeTest#getAHexBinary <em>AHex Binary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AHex Binary</em>' attribute.
	 * @see #getAHexBinary()
	 * @generated
	 */
	void setAHexBinary(byte[] value);

	/**
	 * Returns the value of the '<em><b>AID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AID</em>' attribute.
	 * @see #setAID(String)
	 * @see com.example.example.with.datetypes.DatetypesPackage#getDataTypeTest_AID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='aID'"
	 * @generated
	 */
	String getAID();

	/**
	 * Sets the value of the '{@link com.example.example.with.datetypes.DataTypeTest#getAID <em>AID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AID</em>' attribute.
	 * @see #getAID()
	 * @generated
	 */
	void setAID(String value);

	/**
	 * Returns the value of the '<em><b>AIDREF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AIDREF</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AIDREF</em>' attribute.
	 * @see #setAIDREF(String)
	 * @see com.example.example.with.datetypes.DatetypesPackage#getDataTypeTest_AIDREF()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="kind='attribute' name='aIDREF'"
	 * @generated
	 */
	String getAIDREF();

	/**
	 * Sets the value of the '{@link com.example.example.with.datetypes.DataTypeTest#getAIDREF <em>AIDREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AIDREF</em>' attribute.
	 * @see #getAIDREF()
	 * @generated
	 */
	void setAIDREF(String value);

	/**
	 * Returns the value of the '<em><b>AIDREFS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AIDREFS</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AIDREFS</em>' attribute.
	 * @see #setAIDREFS(List)
	 * @see com.example.example.with.datetypes.DatetypesPackage#getDataTypeTest_AIDREFS()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREFS" many="false"
	 *        extendedMetaData="kind='attribute' name='aIDREFS'"
	 * @generated
	 */
	List<String> getAIDREFS();

	/**
	 * Sets the value of the '{@link com.example.example.with.datetypes.DataTypeTest#getAIDREFS <em>AIDREFS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AIDREFS</em>' attribute.
	 * @see #getAIDREFS()
	 * @generated
	 */
	void setAIDREFS(List<String> value);

	/**
	 * Returns the value of the '<em><b>AInt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AInt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AInt</em>' attribute.
	 * @see #isSetAInt()
	 * @see #unsetAInt()
	 * @see #setAInt(int)
	 * @see com.example.example.with.datetypes.DatetypesPackage#getDataTypeTest_AInt()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='aInt'"
	 * @generated
	 */
	int getAInt();

	/**
	 * Sets the value of the '{@link com.example.example.with.datetypes.DataTypeTest#getAInt <em>AInt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AInt</em>' attribute.
	 * @see #isSetAInt()
	 * @see #unsetAInt()
	 * @see #getAInt()
	 * @generated
	 */
	void setAInt(int value);

	/**
	 * Unsets the value of the '{@link com.example.example.with.datetypes.DataTypeTest#getAInt <em>AInt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAInt()
	 * @see #getAInt()
	 * @see #setAInt(int)
	 * @generated
	 */
	void unsetAInt();

	/**
	 * Returns whether the value of the '{@link com.example.example.with.datetypes.DataTypeTest#getAInt <em>AInt</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>AInt</em>' attribute is set.
	 * @see #unsetAInt()
	 * @see #getAInt()
	 * @see #setAInt(int)
	 * @generated
	 */
	boolean isSetAInt();

	/**
	 * Returns the value of the '<em><b>AInteger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AInteger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AInteger</em>' attribute.
	 * @see #setAInteger(BigInteger)
	 * @see com.example.example.with.datetypes.DatetypesPackage#getDataTypeTest_AInteger()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='attribute' name='aInteger'"
	 * @generated
	 */
	BigInteger getAInteger();

	/**
	 * Sets the value of the '{@link com.example.example.with.datetypes.DataTypeTest#getAInteger <em>AInteger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AInteger</em>' attribute.
	 * @see #getAInteger()
	 * @generated
	 */
	void setAInteger(BigInteger value);

	/**
	 * Returns the value of the '<em><b>ALanguage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ALanguage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ALanguage</em>' attribute.
	 * @see #setALanguage(String)
	 * @see com.example.example.with.datetypes.DatetypesPackage#getDataTypeTest_ALanguage()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Language"
	 *        extendedMetaData="kind='attribute' name='aLanguage'"
	 * @generated
	 */
	String getALanguage();

	/**
	 * Sets the value of the '{@link com.example.example.with.datetypes.DataTypeTest#getALanguage <em>ALanguage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ALanguage</em>' attribute.
	 * @see #getALanguage()
	 * @generated
	 */
	void setALanguage(String value);

	/**
	 * Returns the value of the '<em><b>ALong</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ALong</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ALong</em>' attribute.
	 * @see #isSetALong()
	 * @see #unsetALong()
	 * @see #setALong(long)
	 * @see com.example.example.with.datetypes.DatetypesPackage#getDataTypeTest_ALong()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 *        extendedMetaData="kind='attribute' name='aLong'"
	 * @generated
	 */
	long getALong();

	/**
	 * Sets the value of the '{@link com.example.example.with.datetypes.DataTypeTest#getALong <em>ALong</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ALong</em>' attribute.
	 * @see #isSetALong()
	 * @see #unsetALong()
	 * @see #getALong()
	 * @generated
	 */
	void setALong(long value);

	/**
	 * Unsets the value of the '{@link com.example.example.with.datetypes.DataTypeTest#getALong <em>ALong</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetALong()
	 * @see #getALong()
	 * @see #setALong(long)
	 * @generated
	 */
	void unsetALong();

	/**
	 * Returns whether the value of the '{@link com.example.example.with.datetypes.DataTypeTest#getALong <em>ALong</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ALong</em>' attribute is set.
	 * @see #unsetALong()
	 * @see #getALong()
	 * @see #setALong(long)
	 * @generated
	 */
	boolean isSetALong();

	/**
	 * Returns the value of the '<em><b>AName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AName</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AName</em>' attribute.
	 * @see #setAName(String)
	 * @see com.example.example.with.datetypes.DatetypesPackage#getDataTypeTest_AName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Name"
	 *        extendedMetaData="kind='attribute' name='aName'"
	 * @generated
	 */
	String getAName();

	/**
	 * Sets the value of the '{@link com.example.example.with.datetypes.DataTypeTest#getAName <em>AName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AName</em>' attribute.
	 * @see #getAName()
	 * @generated
	 */
	void setAName(String value);

	/**
	 * Returns the value of the '<em><b>ANC Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ANC Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ANC Name</em>' attribute.
	 * @see #setANCName(String)
	 * @see com.example.example.with.datetypes.DatetypesPackage#getDataTypeTest_ANCName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
	 *        extendedMetaData="kind='attribute' name='aNCName'"
	 * @generated
	 */
	String getANCName();

	/**
	 * Sets the value of the '{@link com.example.example.with.datetypes.DataTypeTest#getANCName <em>ANC Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ANC Name</em>' attribute.
	 * @see #getANCName()
	 * @generated
	 */
	void setANCName(String value);

	/**
	 * Returns the value of the '<em><b>ANMTOKEN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ANMTOKEN</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ANMTOKEN</em>' attribute.
	 * @see #setANMTOKEN(String)
	 * @see com.example.example.with.datetypes.DatetypesPackage#getDataTypeTest_ANMTOKEN()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
	 *        extendedMetaData="kind='attribute' name='aNMTOKEN'"
	 * @generated
	 */
	String getANMTOKEN();

	/**
	 * Sets the value of the '{@link com.example.example.with.datetypes.DataTypeTest#getANMTOKEN <em>ANMTOKEN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ANMTOKEN</em>' attribute.
	 * @see #getANMTOKEN()
	 * @generated
	 */
	void setANMTOKEN(String value);

	/**
	 * Returns the value of the '<em><b>ANMTOKENS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ANMTOKENS</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ANMTOKENS</em>' attribute.
	 * @see #setANMTOKENS(List)
	 * @see com.example.example.with.datetypes.DatetypesPackage#getDataTypeTest_ANMTOKENS()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKENS" many="false"
	 *        extendedMetaData="kind='attribute' name='aNMTOKENS'"
	 * @generated
	 */
	List<String> getANMTOKENS();

	/**
	 * Sets the value of the '{@link com.example.example.with.datetypes.DataTypeTest#getANMTOKENS <em>ANMTOKENS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ANMTOKENS</em>' attribute.
	 * @see #getANMTOKENS()
	 * @generated
	 */
	void setANMTOKENS(List<String> value);

	/**
	 * Returns the value of the '<em><b>ANon Negative Integer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ANon Negative Integer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ANon Negative Integer</em>' attribute.
	 * @see #setANonNegativeInteger(BigInteger)
	 * @see com.example.example.with.datetypes.DatetypesPackage#getDataTypeTest_ANonNegativeInteger()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='aNonNegativeInteger'"
	 * @generated
	 */
	BigInteger getANonNegativeInteger();

	/**
	 * Sets the value of the '{@link com.example.example.with.datetypes.DataTypeTest#getANonNegativeInteger <em>ANon Negative Integer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ANon Negative Integer</em>' attribute.
	 * @see #getANonNegativeInteger()
	 * @generated
	 */
	void setANonNegativeInteger(BigInteger value);

	/**
	 * Returns the value of the '<em><b>ANon Positive Integer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ANon Positive Integer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ANon Positive Integer</em>' attribute.
	 * @see #setANonPositiveInteger(BigInteger)
	 * @see com.example.example.with.datetypes.DatetypesPackage#getDataTypeTest_ANonPositiveInteger()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonPositiveInteger"
	 *        extendedMetaData="kind='attribute' name='aNonPositiveInteger'"
	 * @generated
	 */
	BigInteger getANonPositiveInteger();

	/**
	 * Sets the value of the '{@link com.example.example.with.datetypes.DataTypeTest#getANonPositiveInteger <em>ANon Positive Integer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ANon Positive Integer</em>' attribute.
	 * @see #getANonPositiveInteger()
	 * @generated
	 */
	void setANonPositiveInteger(BigInteger value);

	/**
	 * Returns the value of the '<em><b>APositive Integer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APositive Integer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APositive Integer</em>' attribute.
	 * @see #setAPositiveInteger(BigInteger)
	 * @see com.example.example.with.datetypes.DatetypesPackage#getDataTypeTest_APositiveInteger()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='aPositiveInteger'"
	 * @generated
	 */
	BigInteger getAPositiveInteger();

	/**
	 * Sets the value of the '{@link com.example.example.with.datetypes.DataTypeTest#getAPositiveInteger <em>APositive Integer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APositive Integer</em>' attribute.
	 * @see #getAPositiveInteger()
	 * @generated
	 */
	void setAPositiveInteger(BigInteger value);

	/**
	 * Returns the value of the '<em><b>AQ Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AQ Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AQ Name</em>' attribute.
	 * @see #setAQName(QName)
	 * @see com.example.example.with.datetypes.DatetypesPackage#getDataTypeTest_AQName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='aQName'"
	 * @generated
	 */
	QName getAQName();

	/**
	 * Sets the value of the '{@link com.example.example.with.datetypes.DataTypeTest#getAQName <em>AQ Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AQ Name</em>' attribute.
	 * @see #getAQName()
	 * @generated
	 */
	void setAQName(QName value);

	/**
	 * Returns the value of the '<em><b>AShort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AShort</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AShort</em>' attribute.
	 * @see #isSetAShort()
	 * @see #unsetAShort()
	 * @see #setAShort(short)
	 * @see com.example.example.with.datetypes.DatetypesPackage#getDataTypeTest_AShort()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Short"
	 *        extendedMetaData="kind='attribute' name='aShort'"
	 * @generated
	 */
	short getAShort();

	/**
	 * Sets the value of the '{@link com.example.example.with.datetypes.DataTypeTest#getAShort <em>AShort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AShort</em>' attribute.
	 * @see #isSetAShort()
	 * @see #unsetAShort()
	 * @see #getAShort()
	 * @generated
	 */
	void setAShort(short value);

	/**
	 * Unsets the value of the '{@link com.example.example.with.datetypes.DataTypeTest#getAShort <em>AShort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAShort()
	 * @see #getAShort()
	 * @see #setAShort(short)
	 * @generated
	 */
	void unsetAShort();

	/**
	 * Returns whether the value of the '{@link com.example.example.with.datetypes.DataTypeTest#getAShort <em>AShort</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>AShort</em>' attribute is set.
	 * @see #unsetAShort()
	 * @see #getAShort()
	 * @see #setAShort(short)
	 * @generated
	 */
	boolean isSetAShort();

	/**
	 * Returns the value of the '<em><b>AString</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AString</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AString</em>' attribute.
	 * @see #setAString(String)
	 * @see com.example.example.with.datetypes.DatetypesPackage#getDataTypeTest_AString()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='aString'"
	 * @generated
	 */
	String getAString();

	/**
	 * Sets the value of the '{@link com.example.example.with.datetypes.DataTypeTest#getAString <em>AString</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AString</em>' attribute.
	 * @see #getAString()
	 * @generated
	 */
	void setAString(String value);

	/**
	 * Returns the value of the '<em><b>ATime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATime</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATime</em>' attribute.
	 * @see #setATime(XMLGregorianCalendar)
	 * @see com.example.example.with.datetypes.DatetypesPackage#getDataTypeTest_ATime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Time"
	 *        extendedMetaData="kind='attribute' name='aTime'"
	 * @generated
	 */
	XMLGregorianCalendar getATime();

	/**
	 * Sets the value of the '{@link com.example.example.with.datetypes.DataTypeTest#getATime <em>ATime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ATime</em>' attribute.
	 * @see #getATime()
	 * @generated
	 */
	void setATime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>AToken</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AToken</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AToken</em>' attribute.
	 * @see #setAToken(String)
	 * @see com.example.example.with.datetypes.DatetypesPackage#getDataTypeTest_AToken()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Token"
	 *        extendedMetaData="kind='attribute' name='aToken'"
	 * @generated
	 */
	String getAToken();

	/**
	 * Sets the value of the '{@link com.example.example.with.datetypes.DataTypeTest#getAToken <em>AToken</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AToken</em>' attribute.
	 * @see #getAToken()
	 * @generated
	 */
	void setAToken(String value);

	/**
	 * Returns the value of the '<em><b>AUnsigned Byte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AUnsigned Byte</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AUnsigned Byte</em>' attribute.
	 * @see #isSetAUnsignedByte()
	 * @see #unsetAUnsignedByte()
	 * @see #setAUnsignedByte(short)
	 * @see com.example.example.with.datetypes.DatetypesPackage#getDataTypeTest_AUnsignedByte()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedByte"
	 *        extendedMetaData="kind='attribute' name='aUnsignedByte'"
	 * @generated
	 */
	short getAUnsignedByte();

	/**
	 * Sets the value of the '{@link com.example.example.with.datetypes.DataTypeTest#getAUnsignedByte <em>AUnsigned Byte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AUnsigned Byte</em>' attribute.
	 * @see #isSetAUnsignedByte()
	 * @see #unsetAUnsignedByte()
	 * @see #getAUnsignedByte()
	 * @generated
	 */
	void setAUnsignedByte(short value);

	/**
	 * Unsets the value of the '{@link com.example.example.with.datetypes.DataTypeTest#getAUnsignedByte <em>AUnsigned Byte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAUnsignedByte()
	 * @see #getAUnsignedByte()
	 * @see #setAUnsignedByte(short)
	 * @generated
	 */
	void unsetAUnsignedByte();

	/**
	 * Returns whether the value of the '{@link com.example.example.with.datetypes.DataTypeTest#getAUnsignedByte <em>AUnsigned Byte</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>AUnsigned Byte</em>' attribute is set.
	 * @see #unsetAUnsignedByte()
	 * @see #getAUnsignedByte()
	 * @see #setAUnsignedByte(short)
	 * @generated
	 */
	boolean isSetAUnsignedByte();

	/**
	 * Returns the value of the '<em><b>AUnsigned Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AUnsigned Int</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AUnsigned Int</em>' attribute.
	 * @see #isSetAUnsignedInt()
	 * @see #unsetAUnsignedInt()
	 * @see #setAUnsignedInt(long)
	 * @see com.example.example.with.datetypes.DatetypesPackage#getDataTypeTest_AUnsignedInt()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='attribute' name='aUnsignedInt'"
	 * @generated
	 */
	long getAUnsignedInt();

	/**
	 * Sets the value of the '{@link com.example.example.with.datetypes.DataTypeTest#getAUnsignedInt <em>AUnsigned Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AUnsigned Int</em>' attribute.
	 * @see #isSetAUnsignedInt()
	 * @see #unsetAUnsignedInt()
	 * @see #getAUnsignedInt()
	 * @generated
	 */
	void setAUnsignedInt(long value);

	/**
	 * Unsets the value of the '{@link com.example.example.with.datetypes.DataTypeTest#getAUnsignedInt <em>AUnsigned Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAUnsignedInt()
	 * @see #getAUnsignedInt()
	 * @see #setAUnsignedInt(long)
	 * @generated
	 */
	void unsetAUnsignedInt();

	/**
	 * Returns whether the value of the '{@link com.example.example.with.datetypes.DataTypeTest#getAUnsignedInt <em>AUnsigned Int</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>AUnsigned Int</em>' attribute is set.
	 * @see #unsetAUnsignedInt()
	 * @see #getAUnsignedInt()
	 * @see #setAUnsignedInt(long)
	 * @generated
	 */
	boolean isSetAUnsignedInt();

	/**
	 * Returns the value of the '<em><b>AUnsigned Long</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AUnsigned Long</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AUnsigned Long</em>' attribute.
	 * @see #setAUnsignedLong(BigInteger)
	 * @see com.example.example.with.datetypes.DatetypesPackage#getDataTypeTest_AUnsignedLong()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.UnsignedLong"
	 *        extendedMetaData="kind='attribute' name='aUnsignedLong'"
	 * @generated
	 */
	BigInteger getAUnsignedLong();

	/**
	 * Sets the value of the '{@link com.example.example.with.datetypes.DataTypeTest#getAUnsignedLong <em>AUnsigned Long</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AUnsigned Long</em>' attribute.
	 * @see #getAUnsignedLong()
	 * @generated
	 */
	void setAUnsignedLong(BigInteger value);

	/**
	 * Returns the value of the '<em><b>AUnsigned Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AUnsigned Short</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AUnsigned Short</em>' attribute.
	 * @see #isSetAUnsignedShort()
	 * @see #unsetAUnsignedShort()
	 * @see #setAUnsignedShort(int)
	 * @see com.example.example.with.datetypes.DatetypesPackage#getDataTypeTest_AUnsignedShort()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedShort"
	 *        extendedMetaData="kind='attribute' name='aUnsignedShort'"
	 * @generated
	 */
	int getAUnsignedShort();

	/**
	 * Sets the value of the '{@link com.example.example.with.datetypes.DataTypeTest#getAUnsignedShort <em>AUnsigned Short</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AUnsigned Short</em>' attribute.
	 * @see #isSetAUnsignedShort()
	 * @see #unsetAUnsignedShort()
	 * @see #getAUnsignedShort()
	 * @generated
	 */
	void setAUnsignedShort(int value);

	/**
	 * Unsets the value of the '{@link com.example.example.with.datetypes.DataTypeTest#getAUnsignedShort <em>AUnsigned Short</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAUnsignedShort()
	 * @see #getAUnsignedShort()
	 * @see #setAUnsignedShort(int)
	 * @generated
	 */
	void unsetAUnsignedShort();

	/**
	 * Returns whether the value of the '{@link com.example.example.with.datetypes.DataTypeTest#getAUnsignedShort <em>AUnsigned Short</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>AUnsigned Short</em>' attribute is set.
	 * @see #unsetAUnsignedShort()
	 * @see #getAUnsignedShort()
	 * @see #setAUnsignedShort(int)
	 * @generated
	 */
	boolean isSetAUnsignedShort();

} // DataTypeTest
