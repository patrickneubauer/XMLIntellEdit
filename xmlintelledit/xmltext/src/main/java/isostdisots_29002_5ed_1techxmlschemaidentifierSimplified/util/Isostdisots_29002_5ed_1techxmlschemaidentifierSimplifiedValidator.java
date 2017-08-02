/**
 */
package isostdisots_29002_5ed_1techxmlschemaidentifierSimplified.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

import isostdisots_29002_5ed_1techxmlschemaidentifierSimplified.IRDISequence;
import isostdisots_29002_5ed_1techxmlschemaidentifierSimplified.Isostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see isostdisots_29002_5ed_1techxmlschemaidentifierSimplified.Isostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedPackage
 * @generated
 */
public class Isostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Isostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedValidator INSTANCE = new Isostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "isostdisots_29002_5ed_1techxmlschemaidentifierSimplified";

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
	public Isostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedValidator() {
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
	  return Isostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedPackage.eINSTANCE;
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
			case Isostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedPackage.IRDI_SEQUENCE:
				return validateIRDISequence((IRDISequence)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIRDISequence(IRDISequence irdiSequence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(irdiSequence, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(irdiSequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(irdiSequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(irdiSequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(irdiSequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(irdiSequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(irdiSequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(irdiSequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(irdiSequence, diagnostics, context);
		if (result || diagnostics != null) result &= validateIRDISequence_patternIRDIs(irdiSequence, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the patternIRDIs constraint of '<em>IRDI Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String IRDI_SEQUENCE__PATTERN_IRD_IS__EEXPRESSION = "self.iRDIs->forAll(x | x.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?')) or self.iRDIs->forAll(x | x.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?')) or self.iRDIs->forAll(x | x.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?'))";

	/**
	 * Validates the patternIRDIs constraint of '<em>IRDI Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIRDISequence_patternIRDIs(IRDISequence irdiSequence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedPackage.Literals.IRDI_SEQUENCE,
				 irdiSequence,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternIRDIs",
				 IRDI_SEQUENCE__PATTERN_IRD_IS__EEXPRESSION,
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

} //Isostdisots_29002_5ed_1techxmlschemaidentifierSimplifiedValidator
