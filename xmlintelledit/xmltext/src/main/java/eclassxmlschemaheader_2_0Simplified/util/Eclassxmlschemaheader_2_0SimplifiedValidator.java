/**
 */
package eclassxmlschemaheader_2_0Simplified.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

import eclassxmlschemaheader_2_0Simplified.DOCUMENTHEADER;
import eclassxmlschemaheader_2_0Simplified.Eclassxmlschemaheader_2_0SimplifiedPackage;
import eclassxmlschemaheader_2_0Simplified.MESSAGE;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see eclassxmlschemaheader_2_0Simplified.Eclassxmlschemaheader_2_0SimplifiedPackage
 * @generated
 */
public class Eclassxmlschemaheader_2_0SimplifiedValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Eclassxmlschemaheader_2_0SimplifiedValidator INSTANCE = new Eclassxmlschemaheader_2_0SimplifiedValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "eclassxmlschemaheader_2_0Simplified";

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
	public Eclassxmlschemaheader_2_0SimplifiedValidator() {
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
	  return Eclassxmlschemaheader_2_0SimplifiedPackage.eINSTANCE;
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
			case Eclassxmlschemaheader_2_0SimplifiedPackage.DOCUMENTHEADER:
				return validateDOCUMENTHEADER((DOCUMENTHEADER)value, diagnostics, context);
			case Eclassxmlschemaheader_2_0SimplifiedPackage.MESSAGE:
				return validateMESSAGE((MESSAGE)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDOCUMENTHEADER(DOCUMENTHEADER documentheader, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(documentheader, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(documentheader, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(documentheader, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(documentheader, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(documentheader, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(documentheader, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(documentheader, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(documentheader, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(documentheader, diagnostics, context);
		if (result || diagnostics != null) result &= validateDOCUMENTHEADER_patternSchemaVersion(documentheader, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the patternSchemaVersion constraint of '<em>DOCUMENTHEADER</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DOCUMENTHEADER__PATTERN_SCHEMA_VERSION__EEXPRESSION = "self.schemaVersion.matches('eCl@ss XML 2.0')";

	/**
	 * Validates the patternSchemaVersion constraint of '<em>DOCUMENTHEADER</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDOCUMENTHEADER_patternSchemaVersion(DOCUMENTHEADER documentheader, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Eclassxmlschemaheader_2_0SimplifiedPackage.Literals.DOCUMENTHEADER,
				 documentheader,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternSchemaVersion",
				 DOCUMENTHEADER__PATTERN_SCHEMA_VERSION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMESSAGE(MESSAGE message, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(message, diagnostics, context);
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

} //Eclassxmlschemaheader_2_0SimplifiedValidator
