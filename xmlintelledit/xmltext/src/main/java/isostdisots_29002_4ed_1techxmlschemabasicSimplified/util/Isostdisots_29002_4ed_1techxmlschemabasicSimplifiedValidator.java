/**
 */
package isostdisots_29002_4ed_1techxmlschemabasicSimplified.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

import isostdisots_29002_4ed_1techxmlschemabasicSimplified.InternationalText;
import isostdisots_29002_4ed_1techxmlschemabasicSimplified.Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage;
import isostdisots_29002_4ed_1techxmlschemabasicSimplified.LanguageString;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see isostdisots_29002_4ed_1techxmlschemabasicSimplified.Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage
 * @generated
 */
public class Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedValidator INSTANCE = new Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "isostdisots_29002_4ed_1techxmlschemabasicSimplified";

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
	public Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedValidator() {
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
	  return Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage.eINSTANCE;
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
			case Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage.INTERNATIONAL_TEXT:
				return validateInternationalText((InternationalText)value, diagnostics, context);
			case Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage.LANGUAGE_STRING:
				return validateLanguageString((LanguageString)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternationalText(InternationalText internationalText, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(internationalText, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguageString(LanguageString languageString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(languageString, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(languageString, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(languageString, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(languageString, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(languageString, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(languageString, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(languageString, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(languageString, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(languageString, diagnostics, context);
		if (result || diagnostics != null) result &= validateLanguageString_patternLanguageRef(languageString, diagnostics, context);
		if (result || diagnostics != null) result &= validateLanguageString_patternLanguageCode(languageString, diagnostics, context);
		if (result || diagnostics != null) result &= validateLanguageString_patternCountryCode(languageString, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the patternLanguageRef constraint of '<em>Language String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LANGUAGE_STRING__PATTERN_LANGUAGE_REF__EEXPRESSION = "(self.languageRef=null) or self.languageRef.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.languageRef.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.languageRef.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?')";

	/**
	 * Validates the patternLanguageRef constraint of '<em>Language String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguageString_patternLanguageRef(LanguageString languageString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage.Literals.LANGUAGE_STRING,
				 languageString,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternLanguageRef",
				 LANGUAGE_STRING__PATTERN_LANGUAGE_REF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the patternLanguageCode constraint of '<em>Language String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LANGUAGE_STRING__PATTERN_LANGUAGE_CODE__EEXPRESSION = "(self.languageCode=null) or self.languageCode.matches('[a-z]{2}') or self.languageCode.matches('[a-z]{3}')";

	/**
	 * Validates the patternLanguageCode constraint of '<em>Language String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguageString_patternLanguageCode(LanguageString languageString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage.Literals.LANGUAGE_STRING,
				 languageString,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternLanguageCode",
				 LANGUAGE_STRING__PATTERN_LANGUAGE_CODE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the patternCountryCode constraint of '<em>Language String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LANGUAGE_STRING__PATTERN_COUNTRY_CODE__EEXPRESSION = "(self.countryCode=null) or self.countryCode.matches('[A-Z]{2}')";

	/**
	 * Validates the patternCountryCode constraint of '<em>Language String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguageString_patternCountryCode(LanguageString languageString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage.Literals.LANGUAGE_STRING,
				 languageString,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternCountryCode",
				 LANGUAGE_STRING__PATTERN_COUNTRY_CODE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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

} //Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedValidator
