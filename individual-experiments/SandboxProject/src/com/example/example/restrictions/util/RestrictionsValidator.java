/**
 */
package com.example.example.restrictions.util;

import com.example.example.restrictions.*;

import java.math.BigInteger;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see com.example.example.restrictions.RestrictionsPackage
 * @generated
 */
public class RestrictionsValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RestrictionsValidator INSTANCE = new RestrictionsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "com.example.example.restrictions";

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
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestrictionsValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return RestrictionsPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (value instanceof String) {
			String stringValue = (String) value;
			stringValue = stringValue.replaceAll("\"", "");
			stringValue = stringValue.replaceAll("\'", "");
			value = (Object) stringValue;
		}
		switch (classifierID) {
			case RestrictionsPackage.ADDRESS:
				return validateAddress((Address)value, diagnostics, context);
			case RestrictionsPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case RestrictionsPackage.ORDER_DETAIL:
				return validateOrderDetail((OrderDetail)value, diagnostics, context);
			case RestrictionsPackage.ORDERS_TYPE:
				return validateOrdersType((OrdersType)value, diagnostics, context);
			case RestrictionsPackage.RESTRICTED_ADDRESS:
				return validateRestrictedAddress((RestrictedAddress)value, diagnostics, context);
			case RestrictionsPackage.US_STATE:
				return validateUSState((USState)value, diagnostics, context);
			case RestrictionsPackage.CUSTOMER_AGE:
				return validateCustomerAge((BigInteger)value, diagnostics, context);
			case RestrictionsPackage.CUSTOMER_CONTACT_NUMBER1:
				return validateCustomerContactNumber1((BigInteger)value, diagnostics, context);
			case RestrictionsPackage.CUSTOMER_FIRST_NAME:
				return validateCustomerFirstName((String)value, diagnostics, context);
			case RestrictionsPackage.CUSTOMER_LAST_NAME:
				return validateCustomerLastName((String)value, diagnostics, context);
			case RestrictionsPackage.CUSTOMER_NUMBER:
				return validateCustomerNumber((String)value, diagnostics, context);
			case RestrictionsPackage.CUSTOMER_PASSWORD:
				return validateCustomerPassword((String)value, diagnostics, context);
			case RestrictionsPackage.US_STATE_OBJECT:
				return validateUSStateObject((USState)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddress(Address address, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(address, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrderDetail(OrderDetail orderDetail, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(orderDetail, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrdersType(OrdersType ordersType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ordersType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRestrictedAddress(RestrictedAddress restrictedAddress, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(restrictedAddress, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUSState(USState usState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomerAge(BigInteger customerAge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCustomerAge_Min(customerAge, diagnostics, context);
		if (result || diagnostics != null) result &= validateCustomerAge_Max(customerAge, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateCustomerAge_Min
	 */
	public static final BigInteger CUSTOMER_AGE__MIN__VALUE = new BigInteger("18");

	/**
	 * Validates the Min constraint of '<em>Customer Age</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomerAge_Min(BigInteger customerAge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = customerAge.compareTo(CUSTOMER_AGE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(RestrictionsPackage.Literals.CUSTOMER_AGE, customerAge, CUSTOMER_AGE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateCustomerAge_Max
	 */
	public static final BigInteger CUSTOMER_AGE__MAX__VALUE = new BigInteger("65");

	/**
	 * Validates the Max constraint of '<em>Customer Age</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomerAge_Max(BigInteger customerAge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = customerAge.compareTo(CUSTOMER_AGE__MAX__VALUE) <= 0;
		if (!result && diagnostics != null)
			reportMaxViolation(RestrictionsPackage.Literals.CUSTOMER_AGE, customerAge, CUSTOMER_AGE__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomerContactNumber1(BigInteger customerContactNumber1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCustomerContactNumber1_Pattern(customerContactNumber1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateCustomerContactNumber1_Pattern
	 */
	public static final  PatternMatcher [][] CUSTOMER_CONTACT_NUMBER1__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9][0-9][0-9][0-9][0-9]")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Customer Contact Number1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomerContactNumber1_Pattern(BigInteger customerContactNumber1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(RestrictionsPackage.Literals.CUSTOMER_CONTACT_NUMBER1, customerContactNumber1, CUSTOMER_CONTACT_NUMBER1__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomerFirstName(String customerFirstName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCustomerFirstName_MinLength(customerFirstName, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Customer First Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomerFirstName_MinLength(String customerFirstName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = customerFirstName.length();
		boolean result = length >= 8;
		if (!result && diagnostics != null)
			reportMinLengthViolation(RestrictionsPackage.Literals.CUSTOMER_FIRST_NAME, customerFirstName, length, 8, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomerLastName(String customerLastName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCustomerLastName_MinLength(customerLastName, diagnostics, context);
		if (result || diagnostics != null) result &= validateCustomerLastName_MaxLength(customerLastName, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Customer Last Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomerLastName_MinLength(String customerLastName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = customerLastName.length();
		boolean result = length >= 10;
		if (!result && diagnostics != null)
			reportMinLengthViolation(RestrictionsPackage.Literals.CUSTOMER_LAST_NAME, customerLastName, length, 10, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Customer Last Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomerLastName_MaxLength(String customerLastName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = customerLastName.length();
		boolean result = length <= 10;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(RestrictionsPackage.Literals.CUSTOMER_LAST_NAME, customerLastName, length, 10, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomerNumber(String customerNumber, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomerPassword(String customerPassword, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCustomerPassword_Pattern(customerPassword, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateCustomerPassword_Pattern
	 */
	public static final  PatternMatcher [][] CUSTOMER_PASSWORD__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[a-zA-Z0-9]{8}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Customer Password</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomerPassword_Pattern(String customerPassword, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(RestrictionsPackage.Literals.CUSTOMER_PASSWORD, customerPassword, CUSTOMER_PASSWORD__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUSStateObject(USState usStateObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
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

} //RestrictionsValidator
