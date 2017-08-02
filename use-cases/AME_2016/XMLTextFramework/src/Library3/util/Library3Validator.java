/**
 */
package Library3.util;

import Library3.*;

import java.util.Map;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see Library3.Library3Package
 * @generated
 */
public class Library3Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Library3Validator INSTANCE = new Library3Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "Library3";

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
	public Library3Validator() {
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
	  return Library3Package.eINSTANCE;
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
			case Library3Package.BOOK_INFO_TYPE:
				return validateBookInfoType((BookInfoType)value, diagnostics, context);
			case Library3Package.BOOK_TYPE:
				return validateBookType((BookType)value, diagnostics, context);
			case Library3Package.CUSTOMER_TYPE:
				return validateCustomerType((CustomerType)value, diagnostics, context);
			case Library3Package.LIBRARY_TYPE:
				return validateLibraryType((LibraryType)value, diagnostics, context);
			case Library3Package.ANY_GENERIC_CONSTRUCT:
				return validateAnyGenericConstruct((AnyGenericConstruct)value, diagnostics, context);
			case Library3Package.ANY_GENERIC_ELEMENT:
				return validateAnyGenericElement((AnyGenericElement)value, diagnostics, context);
			case Library3Package.ANY_GENERIC_ATTRIBUTE:
				return validateAnyGenericAttribute((AnyGenericAttribute)value, diagnostics, context);
			case Library3Package.ANY_GENERIC_TEXT:
				return validateAnyGenericText((AnyGenericText)value, diagnostics, context);
			case Library3Package.DESC_TYPE:
				return validateDescType((String)value, diagnostics, context);
			case Library3Package.ISBN_TYPE:
				return validateIsbnType((String)value, diagnostics, context);
			case Library3Package.NAME_TYPE:
				return validateNameType((String)value, diagnostics, context);
			case Library3Package.PAGES_TYPE:
				return validatePagesType((Integer)value, diagnostics, context);
			case Library3Package.PAGES_TYPE_OBJECT:
				return validatePagesTypeObject((Integer)value, diagnostics, context);
			case Library3Package.SINCE_TYPE:
				return validateSinceType((XMLGregorianCalendar)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBookInfoType(BookInfoType bookInfoType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bookInfoType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBookType(BookType bookType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bookType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomerType(CustomerType customerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(customerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLibraryType(LibraryType libraryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(libraryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnyGenericConstruct(AnyGenericConstruct anyGenericConstruct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(anyGenericConstruct, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnyGenericElement(AnyGenericElement anyGenericElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(anyGenericElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnyGenericAttribute(AnyGenericAttribute anyGenericAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(anyGenericAttribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnyGenericText(AnyGenericText anyGenericText, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(anyGenericText, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescType(String descType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIsbnType(String isbnType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIsbnType_MinLength(isbnType, diagnostics, context);
		if (result || diagnostics != null) result &= validateIsbnType_MaxLength(isbnType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Isbn Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIsbnType_MinLength(String isbnType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = isbnType.length();
		boolean result = length >= 10;
		if (!result && diagnostics != null)
			reportMinLengthViolation(Library3Package.Literals.ISBN_TYPE, isbnType, length, 10, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Isbn Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIsbnType_MaxLength(String isbnType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = isbnType.length();
		boolean result = length <= 13;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(Library3Package.Literals.ISBN_TYPE, isbnType, length, 13, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameType(String nameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNameType_MaxLength(nameType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameType_MaxLength(String nameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = nameType.length();
		boolean result = length <= 32;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(Library3Package.Literals.NAME_TYPE, nameType, length, 32, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePagesType(int pagesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePagesTypeObject(Integer pagesTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSinceType(XMLGregorianCalendar sinceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //Library3Validator
