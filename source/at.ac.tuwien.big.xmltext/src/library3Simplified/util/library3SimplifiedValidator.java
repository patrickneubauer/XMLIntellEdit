/**
 */
package library3Simplified.util;

import java.util.Map;

import library3Simplified.*;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see library3Simplified.library3SimplifiedPackage
 * @generated
 */
public class library3SimplifiedValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final library3SimplifiedValidator INSTANCE = new library3SimplifiedValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "library3Simplified";

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
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public library3SimplifiedValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return library3SimplifiedPackage.eINSTANCE;
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
			case library3SimplifiedPackage.BOOK_INFO:
				return validateBookInfo((BookInfo)value, diagnostics, context);
			case library3SimplifiedPackage.BOOK:
				return validateBook((Book)value, diagnostics, context);
			case library3SimplifiedPackage.CUSTOMER:
				return validateCustomer((Customer)value, diagnostics, context);
			case library3SimplifiedPackage.LIBRARY:
				return validateLibrary((Library)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBookInfo(BookInfo bookInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bookInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBook(Book book, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(book, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(book, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(book, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(book, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(book, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(book, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(book, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(book, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(book, diagnostics, context);
		if (result || diagnostics != null) result &= validateBook_maxLengthAuthor(book, diagnostics, context);
		if (result || diagnostics != null) result &= validateBook_patternDimension(book, diagnostics, context);
		if (result || diagnostics != null) result &= validateBook_patternIsbn(book, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the maxLengthAuthor constraint of '<em>Book</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BOOK__MAX_LENGTH_AUTHOR__EEXPRESSION = "self.author.size() <= 32";

	/**
	 * Validates the maxLengthAuthor constraint of '<em>Book</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBook_maxLengthAuthor(Book book, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(library3SimplifiedPackage.Literals.BOOK,
				 book,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxLengthAuthor",
				 BOOK__MAX_LENGTH_AUTHOR__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the patternDimension constraint of '<em>Book</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BOOK__PATTERN_DIMENSION__EEXPRESSION = "self.dimension.matches('([0-9]|([1-9][0-9]+))([.][0-9]+)? x ([0-9]|([1-9][0-9]+))([.][0-9]+)? x ([0-9]|([1-9][0-9]+))([.][0-9]+)? (centimeters|cm|in|inches)')";

	/**
	 * Validates the patternDimension constraint of '<em>Book</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBook_patternDimension(Book book, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(library3SimplifiedPackage.Literals.BOOK,
				 book,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternDimension",
				 BOOK__PATTERN_DIMENSION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the patternIsbn constraint of '<em>Book</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BOOK__PATTERN_ISBN__EEXPRESSION = "self.isbn.matches('[0-9]{3}-[0-9]{2}-[0-9]{4}-[0-9]{3}-[0-9]')";

	/**
	 * Validates the patternIsbn constraint of '<em>Book</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBook_patternIsbn(Book book, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(library3SimplifiedPackage.Literals.BOOK,
				 book,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternIsbn",
				 BOOK__PATTERN_ISBN__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomer(Customer customer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(customer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLibrary(Library library, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(library, diagnostics, context);
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

} //library3SimplifiedValidator
