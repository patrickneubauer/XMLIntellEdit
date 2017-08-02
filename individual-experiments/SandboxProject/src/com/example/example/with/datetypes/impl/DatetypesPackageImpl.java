/**
 */
package com.example.example.with.datetypes.impl;

import com.example.example.with.datetypes.DataTypeTest;
import com.example.example.with.datetypes.DatetypesFactory;
import com.example.example.with.datetypes.DatetypesPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatetypesPackageImpl extends EPackageImpl implements DatetypesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeTestEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.example.example.with.datetypes.DatetypesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DatetypesPackageImpl() {
		super(eNS_URI, DatetypesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DatetypesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DatetypesPackage init() {
		if (isInited) return (DatetypesPackage)EPackage.Registry.INSTANCE.getEPackage(DatetypesPackage.eNS_URI);

		// Obtain or create and register package
		DatetypesPackageImpl theDatetypesPackage = (DatetypesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DatetypesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DatetypesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDatetypesPackage.createPackageContents();

		// Initialize created meta-data
		theDatetypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDatetypesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DatetypesPackage.eNS_URI, theDatetypesPackage);
		return theDatetypesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataTypeTest() {
		return dataTypeTestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeTest_AAnySimpleType() {
		return (EAttribute)dataTypeTestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeTest_AAnyURI() {
		return (EAttribute)dataTypeTestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeTest_ABase64Binary() {
		return (EAttribute)dataTypeTestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeTest_ABoolean() {
		return (EAttribute)dataTypeTestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeTest_AByte() {
		return (EAttribute)dataTypeTestEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeTest_ADate() {
		return (EAttribute)dataTypeTestEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeTest_ADateTime() {
		return (EAttribute)dataTypeTestEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeTest_ADecimal() {
		return (EAttribute)dataTypeTestEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeTest_ADouble() {
		return (EAttribute)dataTypeTestEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeTest_ADuration() {
		return (EAttribute)dataTypeTestEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeTest_AEntities() {
		return (EAttribute)dataTypeTestEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeTest_AEntity() {
		return (EAttribute)dataTypeTestEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeTest_AFloat() {
		return (EAttribute)dataTypeTestEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeTest_AGDay() {
		return (EAttribute)dataTypeTestEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeTest_AGMonth() {
		return (EAttribute)dataTypeTestEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeTest_AGMonthDay() {
		return (EAttribute)dataTypeTestEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeTest_AGYear() {
		return (EAttribute)dataTypeTestEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeTest_AGYearMonth() {
		return (EAttribute)dataTypeTestEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeTest_AHexBinary() {
		return (EAttribute)dataTypeTestEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeTest_AID() {
		return (EAttribute)dataTypeTestEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeTest_AIDREF() {
		return (EAttribute)dataTypeTestEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeTest_AIDREFS() {
		return (EAttribute)dataTypeTestEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeTest_AInt() {
		return (EAttribute)dataTypeTestEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeTest_AInteger() {
		return (EAttribute)dataTypeTestEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeTest_ALanguage() {
		return (EAttribute)dataTypeTestEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeTest_ALong() {
		return (EAttribute)dataTypeTestEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeTest_AName() {
		return (EAttribute)dataTypeTestEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeTest_ANCName() {
		return (EAttribute)dataTypeTestEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeTest_ANMTOKEN() {
		return (EAttribute)dataTypeTestEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeTest_ANMTOKENS() {
		return (EAttribute)dataTypeTestEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeTest_ANonNegativeInteger() {
		return (EAttribute)dataTypeTestEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeTest_ANonPositiveInteger() {
		return (EAttribute)dataTypeTestEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeTest_APositiveInteger() {
		return (EAttribute)dataTypeTestEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeTest_AQName() {
		return (EAttribute)dataTypeTestEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeTest_AShort() {
		return (EAttribute)dataTypeTestEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeTest_AString() {
		return (EAttribute)dataTypeTestEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeTest_ATime() {
		return (EAttribute)dataTypeTestEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeTest_AToken() {
		return (EAttribute)dataTypeTestEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeTest_AUnsignedByte() {
		return (EAttribute)dataTypeTestEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeTest_AUnsignedInt() {
		return (EAttribute)dataTypeTestEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeTest_AUnsignedLong() {
		return (EAttribute)dataTypeTestEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeTest_AUnsignedShort() {
		return (EAttribute)dataTypeTestEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatetypesFactory getDatetypesFactory() {
		return (DatetypesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		dataTypeTestEClass = createEClass(DATA_TYPE_TEST);
		createEAttribute(dataTypeTestEClass, DATA_TYPE_TEST__AANY_SIMPLE_TYPE);
		createEAttribute(dataTypeTestEClass, DATA_TYPE_TEST__AANY_URI);
		createEAttribute(dataTypeTestEClass, DATA_TYPE_TEST__ABASE64_BINARY);
		createEAttribute(dataTypeTestEClass, DATA_TYPE_TEST__ABOOLEAN);
		createEAttribute(dataTypeTestEClass, DATA_TYPE_TEST__ABYTE);
		createEAttribute(dataTypeTestEClass, DATA_TYPE_TEST__ADATE);
		createEAttribute(dataTypeTestEClass, DATA_TYPE_TEST__ADATE_TIME);
		createEAttribute(dataTypeTestEClass, DATA_TYPE_TEST__ADECIMAL);
		createEAttribute(dataTypeTestEClass, DATA_TYPE_TEST__ADOUBLE);
		createEAttribute(dataTypeTestEClass, DATA_TYPE_TEST__ADURATION);
		createEAttribute(dataTypeTestEClass, DATA_TYPE_TEST__AENTITIES);
		createEAttribute(dataTypeTestEClass, DATA_TYPE_TEST__AENTITY);
		createEAttribute(dataTypeTestEClass, DATA_TYPE_TEST__AFLOAT);
		createEAttribute(dataTypeTestEClass, DATA_TYPE_TEST__AG_DAY);
		createEAttribute(dataTypeTestEClass, DATA_TYPE_TEST__AG_MONTH);
		createEAttribute(dataTypeTestEClass, DATA_TYPE_TEST__AG_MONTH_DAY);
		createEAttribute(dataTypeTestEClass, DATA_TYPE_TEST__AG_YEAR);
		createEAttribute(dataTypeTestEClass, DATA_TYPE_TEST__AG_YEAR_MONTH);
		createEAttribute(dataTypeTestEClass, DATA_TYPE_TEST__AHEX_BINARY);
		createEAttribute(dataTypeTestEClass, DATA_TYPE_TEST__AID);
		createEAttribute(dataTypeTestEClass, DATA_TYPE_TEST__AIDREF);
		createEAttribute(dataTypeTestEClass, DATA_TYPE_TEST__AIDREFS);
		createEAttribute(dataTypeTestEClass, DATA_TYPE_TEST__AINT);
		createEAttribute(dataTypeTestEClass, DATA_TYPE_TEST__AINTEGER);
		createEAttribute(dataTypeTestEClass, DATA_TYPE_TEST__ALANGUAGE);
		createEAttribute(dataTypeTestEClass, DATA_TYPE_TEST__ALONG);
		createEAttribute(dataTypeTestEClass, DATA_TYPE_TEST__ANAME);
		createEAttribute(dataTypeTestEClass, DATA_TYPE_TEST__ANC_NAME);
		createEAttribute(dataTypeTestEClass, DATA_TYPE_TEST__ANMTOKEN);
		createEAttribute(dataTypeTestEClass, DATA_TYPE_TEST__ANMTOKENS);
		createEAttribute(dataTypeTestEClass, DATA_TYPE_TEST__ANON_NEGATIVE_INTEGER);
		createEAttribute(dataTypeTestEClass, DATA_TYPE_TEST__ANON_POSITIVE_INTEGER);
		createEAttribute(dataTypeTestEClass, DATA_TYPE_TEST__APOSITIVE_INTEGER);
		createEAttribute(dataTypeTestEClass, DATA_TYPE_TEST__AQ_NAME);
		createEAttribute(dataTypeTestEClass, DATA_TYPE_TEST__ASHORT);
		createEAttribute(dataTypeTestEClass, DATA_TYPE_TEST__ASTRING);
		createEAttribute(dataTypeTestEClass, DATA_TYPE_TEST__ATIME);
		createEAttribute(dataTypeTestEClass, DATA_TYPE_TEST__ATOKEN);
		createEAttribute(dataTypeTestEClass, DATA_TYPE_TEST__AUNSIGNED_BYTE);
		createEAttribute(dataTypeTestEClass, DATA_TYPE_TEST__AUNSIGNED_INT);
		createEAttribute(dataTypeTestEClass, DATA_TYPE_TEST__AUNSIGNED_LONG);
		createEAttribute(dataTypeTestEClass, DATA_TYPE_TEST__AUNSIGNED_SHORT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(dataTypeTestEClass, DataTypeTest.class, "DataTypeTest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataTypeTest_AAnySimpleType(), theXMLTypePackage.getAnySimpleType(), "aAnySimpleType", null, 0, 1, DataTypeTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTypeTest_AAnyURI(), theXMLTypePackage.getAnyURI(), "aAnyURI", null, 0, 1, DataTypeTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTypeTest_ABase64Binary(), theXMLTypePackage.getBase64Binary(), "aBase64Binary", null, 0, 1, DataTypeTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTypeTest_ABoolean(), theXMLTypePackage.getBoolean(), "aBoolean", null, 0, 1, DataTypeTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTypeTest_AByte(), theXMLTypePackage.getByte(), "aByte", null, 0, 1, DataTypeTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTypeTest_ADate(), theXMLTypePackage.getDate(), "aDate", null, 0, 1, DataTypeTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTypeTest_ADateTime(), theXMLTypePackage.getDateTime(), "aDateTime", null, 0, 1, DataTypeTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTypeTest_ADecimal(), theXMLTypePackage.getDecimal(), "aDecimal", null, 0, 1, DataTypeTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTypeTest_ADouble(), theXMLTypePackage.getDouble(), "aDouble", null, 0, 1, DataTypeTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTypeTest_ADuration(), theXMLTypePackage.getDuration(), "aDuration", null, 0, 1, DataTypeTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTypeTest_AEntities(), theXMLTypePackage.getENTITIES(), "aEntities", null, 0, 1, DataTypeTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTypeTest_AEntity(), theXMLTypePackage.getENTITY(), "aEntity", null, 0, 1, DataTypeTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTypeTest_AFloat(), theXMLTypePackage.getFloat(), "aFloat", null, 0, 1, DataTypeTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTypeTest_AGDay(), theXMLTypePackage.getGDay(), "aGDay", null, 0, 1, DataTypeTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTypeTest_AGMonth(), theXMLTypePackage.getGMonth(), "aGMonth", null, 0, 1, DataTypeTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTypeTest_AGMonthDay(), theXMLTypePackage.getGMonthDay(), "aGMonthDay", null, 0, 1, DataTypeTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTypeTest_AGYear(), theXMLTypePackage.getGYear(), "aGYear", null, 0, 1, DataTypeTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTypeTest_AGYearMonth(), theXMLTypePackage.getGYearMonth(), "aGYearMonth", null, 0, 1, DataTypeTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTypeTest_AHexBinary(), theXMLTypePackage.getHexBinary(), "aHexBinary", null, 0, 1, DataTypeTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTypeTest_AID(), theXMLTypePackage.getID(), "aID", null, 0, 1, DataTypeTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTypeTest_AIDREF(), theXMLTypePackage.getIDREF(), "aIDREF", null, 0, 1, DataTypeTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTypeTest_AIDREFS(), theXMLTypePackage.getIDREFS(), "aIDREFS", null, 0, 1, DataTypeTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTypeTest_AInt(), theXMLTypePackage.getInt(), "aInt", null, 0, 1, DataTypeTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTypeTest_AInteger(), theXMLTypePackage.getInteger(), "aInteger", null, 0, 1, DataTypeTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTypeTest_ALanguage(), theXMLTypePackage.getLanguage(), "aLanguage", null, 0, 1, DataTypeTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTypeTest_ALong(), theXMLTypePackage.getLong(), "aLong", null, 0, 1, DataTypeTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTypeTest_AName(), theXMLTypePackage.getName_(), "aName", null, 0, 1, DataTypeTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTypeTest_ANCName(), theXMLTypePackage.getNCName(), "aNCName", null, 0, 1, DataTypeTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTypeTest_ANMTOKEN(), theXMLTypePackage.getNMTOKEN(), "aNMTOKEN", null, 0, 1, DataTypeTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTypeTest_ANMTOKENS(), theXMLTypePackage.getNMTOKENS(), "aNMTOKENS", null, 0, 1, DataTypeTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTypeTest_ANonNegativeInteger(), theXMLTypePackage.getNonNegativeInteger(), "aNonNegativeInteger", null, 0, 1, DataTypeTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTypeTest_ANonPositiveInteger(), theXMLTypePackage.getNonPositiveInteger(), "aNonPositiveInteger", null, 0, 1, DataTypeTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTypeTest_APositiveInteger(), theXMLTypePackage.getPositiveInteger(), "aPositiveInteger", null, 0, 1, DataTypeTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTypeTest_AQName(), theXMLTypePackage.getQName(), "aQName", null, 0, 1, DataTypeTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTypeTest_AShort(), theXMLTypePackage.getShort(), "aShort", null, 0, 1, DataTypeTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTypeTest_AString(), theXMLTypePackage.getString(), "aString", null, 0, 1, DataTypeTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTypeTest_ATime(), theXMLTypePackage.getTime(), "aTime", null, 0, 1, DataTypeTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTypeTest_AToken(), theXMLTypePackage.getToken(), "aToken", null, 0, 1, DataTypeTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTypeTest_AUnsignedByte(), theXMLTypePackage.getUnsignedByte(), "aUnsignedByte", null, 0, 1, DataTypeTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTypeTest_AUnsignedInt(), theXMLTypePackage.getUnsignedInt(), "aUnsignedInt", null, 0, 1, DataTypeTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTypeTest_AUnsignedLong(), theXMLTypePackage.getUnsignedLong(), "aUnsignedLong", null, 0, 1, DataTypeTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTypeTest_AUnsignedShort(), theXMLTypePackage.getUnsignedShort(), "aUnsignedShort", null, 0, 1, DataTypeTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (dataTypeTestEClass, 
		   source, 
		   new String[] {
			 "name", "DataTypeTest",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getDataTypeTest_AAnySimpleType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "aAnySimpleType"
		   });	
		addAnnotation
		  (getDataTypeTest_AAnyURI(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "aAnyURI"
		   });	
		addAnnotation
		  (getDataTypeTest_ABase64Binary(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "aBase64Binary"
		   });	
		addAnnotation
		  (getDataTypeTest_ABoolean(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "aBoolean"
		   });	
		addAnnotation
		  (getDataTypeTest_AByte(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "aByte"
		   });	
		addAnnotation
		  (getDataTypeTest_ADate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "aDate"
		   });	
		addAnnotation
		  (getDataTypeTest_ADateTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "aDateTime"
		   });	
		addAnnotation
		  (getDataTypeTest_ADecimal(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "aDecimal"
		   });	
		addAnnotation
		  (getDataTypeTest_ADouble(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "aDouble"
		   });	
		addAnnotation
		  (getDataTypeTest_ADuration(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "aDuration"
		   });	
		addAnnotation
		  (getDataTypeTest_AEntities(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "aEntities"
		   });	
		addAnnotation
		  (getDataTypeTest_AEntity(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "aEntity"
		   });	
		addAnnotation
		  (getDataTypeTest_AFloat(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "aFloat"
		   });	
		addAnnotation
		  (getDataTypeTest_AGDay(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "aGDay"
		   });	
		addAnnotation
		  (getDataTypeTest_AGMonth(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "aGMonth"
		   });	
		addAnnotation
		  (getDataTypeTest_AGMonthDay(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "aGMonthDay"
		   });	
		addAnnotation
		  (getDataTypeTest_AGYear(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "aGYear"
		   });	
		addAnnotation
		  (getDataTypeTest_AGYearMonth(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "aGYearMonth"
		   });	
		addAnnotation
		  (getDataTypeTest_AHexBinary(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "aHexBinary"
		   });	
		addAnnotation
		  (getDataTypeTest_AID(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "aID"
		   });	
		addAnnotation
		  (getDataTypeTest_AIDREF(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "aIDREF"
		   });	
		addAnnotation
		  (getDataTypeTest_AIDREFS(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "aIDREFS"
		   });	
		addAnnotation
		  (getDataTypeTest_AInt(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "aInt"
		   });	
		addAnnotation
		  (getDataTypeTest_AInteger(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "aInteger"
		   });	
		addAnnotation
		  (getDataTypeTest_ALanguage(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "aLanguage"
		   });	
		addAnnotation
		  (getDataTypeTest_ALong(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "aLong"
		   });	
		addAnnotation
		  (getDataTypeTest_AName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "aName"
		   });	
		addAnnotation
		  (getDataTypeTest_ANCName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "aNCName"
		   });	
		addAnnotation
		  (getDataTypeTest_ANMTOKEN(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "aNMTOKEN"
		   });	
		addAnnotation
		  (getDataTypeTest_ANMTOKENS(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "aNMTOKENS"
		   });	
		addAnnotation
		  (getDataTypeTest_ANonNegativeInteger(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "aNonNegativeInteger"
		   });	
		addAnnotation
		  (getDataTypeTest_ANonPositiveInteger(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "aNonPositiveInteger"
		   });	
		addAnnotation
		  (getDataTypeTest_APositiveInteger(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "aPositiveInteger"
		   });	
		addAnnotation
		  (getDataTypeTest_AQName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "aQName"
		   });	
		addAnnotation
		  (getDataTypeTest_AShort(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "aShort"
		   });	
		addAnnotation
		  (getDataTypeTest_AString(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "aString"
		   });	
		addAnnotation
		  (getDataTypeTest_ATime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "aTime"
		   });	
		addAnnotation
		  (getDataTypeTest_AToken(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "aToken"
		   });	
		addAnnotation
		  (getDataTypeTest_AUnsignedByte(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "aUnsignedByte"
		   });	
		addAnnotation
		  (getDataTypeTest_AUnsignedInt(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "aUnsignedInt"
		   });	
		addAnnotation
		  (getDataTypeTest_AUnsignedLong(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "aUnsignedLong"
		   });	
		addAnnotation
		  (getDataTypeTest_AUnsignedShort(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "aUnsignedShort"
		   });
	}

} //DatetypesPackageImpl
