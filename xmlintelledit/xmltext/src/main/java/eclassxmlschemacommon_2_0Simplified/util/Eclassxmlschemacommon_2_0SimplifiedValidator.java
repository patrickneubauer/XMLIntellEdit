/**
 */
package eclassxmlschemacommon_2_0Simplified.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

import eclassxmlschemacommon_2_0Simplified.ADVANCEDPROPERTYPATH;
import eclassxmlschemacommon_2_0Simplified.BASICPROPERTYPATH;
import eclassxmlschemacommon_2_0Simplified.CONTENTMODELType;
import eclassxmlschemacommon_2_0Simplified.Contact;
import eclassxmlschemacommon_2_0Simplified.Eclassxmlschemacommon_2_0SimplifiedPackage;
import eclassxmlschemacommon_2_0Simplified.IDENTIFICATION;
import eclassxmlschemacommon_2_0Simplified.LOCALE;
import eclassxmlschemacommon_2_0Simplified.LOCALIZEDSTRING;
import eclassxmlschemacommon_2_0Simplified.NUMERICVALUE;
import eclassxmlschemacommon_2_0Simplified.PARTY;
import eclassxmlschemacommon_2_0Simplified.PROPERTYELM;
import eclassxmlschemacommon_2_0Simplified.PROPERTYPATH;
import eclassxmlschemacommon_2_0Simplified.QUERYAMOUNT;
import eclassxmlschemacommon_2_0Simplified.TYPEDSTRING;
import eclassxmlschemacommon_2_0Simplified.TargetValues;
import eclassxmlschemacommon_2_0Simplified.UNITMAPPING;
import eclassxmlschemacommon_2_0Simplified.VALUEMAPPING;
import eclassxmlschemacommon_2_0Simplified.VALUEREF;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see eclassxmlschemacommon_2_0Simplified.Eclassxmlschemacommon_2_0SimplifiedPackage
 * @generated
 */
public class Eclassxmlschemacommon_2_0SimplifiedValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Eclassxmlschemacommon_2_0SimplifiedValidator INSTANCE = new Eclassxmlschemacommon_2_0SimplifiedValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "eclassxmlschemacommon_2_0Simplified";

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
	public Eclassxmlschemacommon_2_0SimplifiedValidator() {
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
	  return Eclassxmlschemacommon_2_0SimplifiedPackage.eINSTANCE;
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
			case Eclassxmlschemacommon_2_0SimplifiedPackage.ADVANCEDPROPERTYPATH:
				return validateADVANCEDPROPERTYPATH((ADVANCEDPROPERTYPATH)value, diagnostics, context);
			case Eclassxmlschemacommon_2_0SimplifiedPackage.BASICPROPERTYPATH:
				return validateBASICPROPERTYPATH((BASICPROPERTYPATH)value, diagnostics, context);
			case Eclassxmlschemacommon_2_0SimplifiedPackage.CONTACT:
				return validateContact((Contact)value, diagnostics, context);
			case Eclassxmlschemacommon_2_0SimplifiedPackage.IDENTIFICATION:
				return validateIDENTIFICATION((IDENTIFICATION)value, diagnostics, context);
			case Eclassxmlschemacommon_2_0SimplifiedPackage.LOCALE:
				return validateLOCALE((LOCALE)value, diagnostics, context);
			case Eclassxmlschemacommon_2_0SimplifiedPackage.LOCALIZEDSTRING:
				return validateLOCALIZEDSTRING((LOCALIZEDSTRING)value, diagnostics, context);
			case Eclassxmlschemacommon_2_0SimplifiedPackage.NUMERICVALUE:
				return validateNUMERICVALUE((NUMERICVALUE)value, diagnostics, context);
			case Eclassxmlschemacommon_2_0SimplifiedPackage.PARTY:
				return validatePARTY((PARTY)value, diagnostics, context);
			case Eclassxmlschemacommon_2_0SimplifiedPackage.PROPERTYELM:
				return validatePROPERTYELM((PROPERTYELM)value, diagnostics, context);
			case Eclassxmlschemacommon_2_0SimplifiedPackage.PROPERTYPATH:
				return validatePROPERTYPATH((PROPERTYPATH)value, diagnostics, context);
			case Eclassxmlschemacommon_2_0SimplifiedPackage.QUERYAMOUNT:
				return validateQUERYAMOUNT((QUERYAMOUNT)value, diagnostics, context);
			case Eclassxmlschemacommon_2_0SimplifiedPackage.TARGET_VALUES:
				return validateTargetValues((TargetValues)value, diagnostics, context);
			case Eclassxmlschemacommon_2_0SimplifiedPackage.TYPEDSTRING:
				return validateTYPEDSTRING((TYPEDSTRING)value, diagnostics, context);
			case Eclassxmlschemacommon_2_0SimplifiedPackage.UNITMAPPING:
				return validateUNITMAPPING((UNITMAPPING)value, diagnostics, context);
			case Eclassxmlschemacommon_2_0SimplifiedPackage.VALUEMAPPING:
				return validateVALUEMAPPING((VALUEMAPPING)value, diagnostics, context);
			case Eclassxmlschemacommon_2_0SimplifiedPackage.VALUEREF:
				return validateVALUEREF((VALUEREF)value, diagnostics, context);
			case Eclassxmlschemacommon_2_0SimplifiedPackage.CONTENTMODEL_TYPE:
				return validateCONTENTMODELType((CONTENTMODELType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateADVANCEDPROPERTYPATH(ADVANCEDPROPERTYPATH advancedpropertypath, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(advancedpropertypath, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(advancedpropertypath, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(advancedpropertypath, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(advancedpropertypath, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(advancedpropertypath, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(advancedpropertypath, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(advancedpropertypath, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(advancedpropertypath, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(advancedpropertypath, diagnostics, context);
		if (result || diagnostics != null) result &= validateADVANCEDPROPERTYPATH_patternAc(advancedpropertypath, diagnostics, context);
		if (result || diagnostics != null) result &= validateADVANCEDPROPERTYPATH_patternAspect(advancedpropertypath, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the patternAc constraint of '<em>ADVANCEDPROPERTYPATH</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ADVANCEDPROPERTYPATH__PATTERN_AC__EEXPRESSION = "self.ac.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.ac.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.ac.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?')";

	/**
	 * Validates the patternAc constraint of '<em>ADVANCEDPROPERTYPATH</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateADVANCEDPROPERTYPATH_patternAc(ADVANCEDPROPERTYPATH advancedpropertypath, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Eclassxmlschemacommon_2_0SimplifiedPackage.Literals.ADVANCEDPROPERTYPATH,
				 advancedpropertypath,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternAc",
				 ADVANCEDPROPERTYPATH__PATTERN_AC__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the patternAspect constraint of '<em>ADVANCEDPROPERTYPATH</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ADVANCEDPROPERTYPATH__PATTERN_ASPECT__EEXPRESSION = "(self.aspect=null) or self.aspect.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.aspect.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.aspect.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?')";

	/**
	 * Validates the patternAspect constraint of '<em>ADVANCEDPROPERTYPATH</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateADVANCEDPROPERTYPATH_patternAspect(ADVANCEDPROPERTYPATH advancedpropertypath, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Eclassxmlschemacommon_2_0SimplifiedPackage.Literals.ADVANCEDPROPERTYPATH,
				 advancedpropertypath,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternAspect",
				 ADVANCEDPROPERTYPATH__PATTERN_ASPECT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBASICPROPERTYPATH(BASICPROPERTYPATH basicpropertypath, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(basicpropertypath, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(basicpropertypath, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(basicpropertypath, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(basicpropertypath, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(basicpropertypath, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(basicpropertypath, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(basicpropertypath, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(basicpropertypath, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(basicpropertypath, diagnostics, context);
		if (result || diagnostics != null) result &= validateBASICPROPERTYPATH_patternAc(basicpropertypath, diagnostics, context);
		if (result || diagnostics != null) result &= validateBASICPROPERTYPATH_patternAspect(basicpropertypath, diagnostics, context);
		if (result || diagnostics != null) result &= validateBASICPROPERTYPATH_patternPropRef(basicpropertypath, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the patternAc constraint of '<em>BASICPROPERTYPATH</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BASICPROPERTYPATH__PATTERN_AC__EEXPRESSION = "self.ac.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.ac.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.ac.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?')";

	/**
	 * Validates the patternAc constraint of '<em>BASICPROPERTYPATH</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBASICPROPERTYPATH_patternAc(BASICPROPERTYPATH basicpropertypath, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Eclassxmlschemacommon_2_0SimplifiedPackage.Literals.BASICPROPERTYPATH,
				 basicpropertypath,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternAc",
				 BASICPROPERTYPATH__PATTERN_AC__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the patternAspect constraint of '<em>BASICPROPERTYPATH</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BASICPROPERTYPATH__PATTERN_ASPECT__EEXPRESSION = "(self.aspect=null) or self.aspect.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.aspect.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.aspect.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?')";

	/**
	 * Validates the patternAspect constraint of '<em>BASICPROPERTYPATH</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBASICPROPERTYPATH_patternAspect(BASICPROPERTYPATH basicpropertypath, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Eclassxmlschemacommon_2_0SimplifiedPackage.Literals.BASICPROPERTYPATH,
				 basicpropertypath,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternAspect",
				 BASICPROPERTYPATH__PATTERN_ASPECT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the patternPropRef constraint of '<em>BASICPROPERTYPATH</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BASICPROPERTYPATH__PATTERN_PROP_REF__EEXPRESSION = "self.propRef.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.propRef.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.propRef.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?')";

	/**
	 * Validates the patternPropRef constraint of '<em>BASICPROPERTYPATH</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBASICPROPERTYPATH_patternPropRef(BASICPROPERTYPATH basicpropertypath, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Eclassxmlschemacommon_2_0SimplifiedPackage.Literals.BASICPROPERTYPATH,
				 basicpropertypath,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternPropRef",
				 BASICPROPERTYPATH__PATTERN_PROP_REF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContact(Contact contact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contact, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIDENTIFICATION(IDENTIFICATION identification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(identification, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(identification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(identification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(identification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(identification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(identification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(identification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(identification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(identification, diagnostics, context);
		if (result || diagnostics != null) result &= validateIDENTIFICATION_patternIrdi(identification, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the patternIrdi constraint of '<em>IDENTIFICATION</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String IDENTIFICATION__PATTERN_IRDI__EEXPRESSION = "(self.irdi=null) or self.irdi.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.irdi.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.irdi.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?')";

	/**
	 * Validates the patternIrdi constraint of '<em>IDENTIFICATION</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIDENTIFICATION_patternIrdi(IDENTIFICATION identification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Eclassxmlschemacommon_2_0SimplifiedPackage.Literals.IDENTIFICATION,
				 identification,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternIrdi",
				 IDENTIFICATION__PATTERN_IRDI__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLOCALE(LOCALE locale, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(locale, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(locale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(locale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(locale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(locale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(locale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(locale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(locale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(locale, diagnostics, context);
		if (result || diagnostics != null) result &= validateLOCALE_patternCountryRef(locale, diagnostics, context);
		if (result || diagnostics != null) result &= validateLOCALE_patternLanguageRef(locale, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the patternCountryRef constraint of '<em>LOCALE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LOCALE__PATTERN_COUNTRY_REF__EEXPRESSION = "(self.countryRef=null) or self.countryRef.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.countryRef.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.countryRef.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?')";

	/**
	 * Validates the patternCountryRef constraint of '<em>LOCALE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLOCALE_patternCountryRef(LOCALE locale, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Eclassxmlschemacommon_2_0SimplifiedPackage.Literals.LOCALE,
				 locale,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternCountryRef",
				 LOCALE__PATTERN_COUNTRY_REF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the patternLanguageRef constraint of '<em>LOCALE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LOCALE__PATTERN_LANGUAGE_REF__EEXPRESSION = "(self.languageRef=null) or self.languageRef.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.languageRef.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.languageRef.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?')";

	/**
	 * Validates the patternLanguageRef constraint of '<em>LOCALE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLOCALE_patternLanguageRef(LOCALE locale, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Eclassxmlschemacommon_2_0SimplifiedPackage.Literals.LOCALE,
				 locale,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternLanguageRef",
				 LOCALE__PATTERN_LANGUAGE_REF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLOCALIZEDSTRING(LOCALIZEDSTRING localizedstring, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(localizedstring, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(localizedstring, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(localizedstring, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(localizedstring, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(localizedstring, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(localizedstring, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(localizedstring, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(localizedstring, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(localizedstring, diagnostics, context);
		if (result || diagnostics != null) result &= validateLOCALIZEDSTRING_patternCountryCode(localizedstring, diagnostics, context);
		if (result || diagnostics != null) result &= validateLOCALIZEDSTRING_patternLanguageCode(localizedstring, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the patternCountryCode constraint of '<em>LOCALIZEDSTRING</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LOCALIZEDSTRING__PATTERN_COUNTRY_CODE__EEXPRESSION = "(self.countryCode=null) or self.countryCode.matches('[A-z]*')";

	/**
	 * Validates the patternCountryCode constraint of '<em>LOCALIZEDSTRING</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLOCALIZEDSTRING_patternCountryCode(LOCALIZEDSTRING localizedstring, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Eclassxmlschemacommon_2_0SimplifiedPackage.Literals.LOCALIZEDSTRING,
				 localizedstring,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternCountryCode",
				 LOCALIZEDSTRING__PATTERN_COUNTRY_CODE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the patternLanguageCode constraint of '<em>LOCALIZEDSTRING</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LOCALIZEDSTRING__PATTERN_LANGUAGE_CODE__EEXPRESSION = "self.languageCode.matches('[A-z]*')";

	/**
	 * Validates the patternLanguageCode constraint of '<em>LOCALIZEDSTRING</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLOCALIZEDSTRING_patternLanguageCode(LOCALIZEDSTRING localizedstring, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Eclassxmlschemacommon_2_0SimplifiedPackage.Literals.LOCALIZEDSTRING,
				 localizedstring,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternLanguageCode",
				 LOCALIZEDSTRING__PATTERN_LANGUAGE_CODE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNUMERICVALUE(NUMERICVALUE numericvalue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(numericvalue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePARTY(PARTY party, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(party, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePROPERTYELM(PROPERTYELM propertyelm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(propertyelm, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(propertyelm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(propertyelm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(propertyelm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(propertyelm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(propertyelm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(propertyelm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(propertyelm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(propertyelm, diagnostics, context);
		if (result || diagnostics != null) result &= validatePROPERTYELM_patternRef(propertyelm, diagnostics, context);
		if (result || diagnostics != null) result &= validatePROPERTYELM_patternTargetClassRef(propertyelm, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the patternRef constraint of '<em>PROPERTYELM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROPERTYELM__PATTERN_REF__EEXPRESSION = "self.ref.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.ref.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.ref.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?')";

	/**
	 * Validates the patternRef constraint of '<em>PROPERTYELM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePROPERTYELM_patternRef(PROPERTYELM propertyelm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Eclassxmlschemacommon_2_0SimplifiedPackage.Literals.PROPERTYELM,
				 propertyelm,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternRef",
				 PROPERTYELM__PATTERN_REF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the patternTargetClassRef constraint of '<em>PROPERTYELM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROPERTYELM__PATTERN_TARGET_CLASS_REF__EEXPRESSION = "(self.targetClassRef=null) or self.targetClassRef.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.targetClassRef.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.targetClassRef.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?')";

	/**
	 * Validates the patternTargetClassRef constraint of '<em>PROPERTYELM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePROPERTYELM_patternTargetClassRef(PROPERTYELM propertyelm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Eclassxmlschemacommon_2_0SimplifiedPackage.Literals.PROPERTYELM,
				 propertyelm,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternTargetClassRef",
				 PROPERTYELM__PATTERN_TARGET_CLASS_REF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePROPERTYPATH(PROPERTYPATH propertypath, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(propertypath, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(propertypath, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(propertypath, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(propertypath, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(propertypath, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(propertypath, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(propertypath, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(propertypath, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(propertypath, diagnostics, context);
		if (result || diagnostics != null) result &= validatePROPERTYPATH_patternAc(propertypath, diagnostics, context);
		if (result || diagnostics != null) result &= validatePROPERTYPATH_patternAspect(propertypath, diagnostics, context);
		if (result || diagnostics != null) result &= validatePROPERTYPATH_patternCc(propertypath, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the patternAc constraint of '<em>PROPERTYPATH</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROPERTYPATH__PATTERN_AC__EEXPRESSION = "(self.ac=null) or self.ac.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.ac.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.ac.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?')";

	/**
	 * Validates the patternAc constraint of '<em>PROPERTYPATH</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePROPERTYPATH_patternAc(PROPERTYPATH propertypath, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Eclassxmlschemacommon_2_0SimplifiedPackage.Literals.PROPERTYPATH,
				 propertypath,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternAc",
				 PROPERTYPATH__PATTERN_AC__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the patternAspect constraint of '<em>PROPERTYPATH</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROPERTYPATH__PATTERN_ASPECT__EEXPRESSION = "(self.aspect=null) or self.aspect.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.aspect.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.aspect.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?')";

	/**
	 * Validates the patternAspect constraint of '<em>PROPERTYPATH</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePROPERTYPATH_patternAspect(PROPERTYPATH propertypath, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Eclassxmlschemacommon_2_0SimplifiedPackage.Literals.PROPERTYPATH,
				 propertypath,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternAspect",
				 PROPERTYPATH__PATTERN_ASPECT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the patternCc constraint of '<em>PROPERTYPATH</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROPERTYPATH__PATTERN_CC__EEXPRESSION = "(self.cc=null) or self.cc.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.cc.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.cc.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?')";

	/**
	 * Validates the patternCc constraint of '<em>PROPERTYPATH</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePROPERTYPATH_patternCc(PROPERTYPATH propertypath, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Eclassxmlschemacommon_2_0SimplifiedPackage.Literals.PROPERTYPATH,
				 propertypath,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternCc",
				 PROPERTYPATH__PATTERN_CC__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQUERYAMOUNT(QUERYAMOUNT queryamount, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(queryamount, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(queryamount, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(queryamount, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(queryamount, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(queryamount, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(queryamount, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(queryamount, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(queryamount, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(queryamount, diagnostics, context);
		if (result || diagnostics != null) result &= validateQUERYAMOUNT_patternAlternativeUnit(queryamount, diagnostics, context);
		if (result || diagnostics != null) result &= validateQUERYAMOUNT_patternBaseUnit(queryamount, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the patternAlternativeUnit constraint of '<em>QUERYAMOUNT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String QUERYAMOUNT__PATTERN_ALTERNATIVE_UNIT__EEXPRESSION = "(self.alternativeUnit=null) or self.alternativeUnit.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.alternativeUnit.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.alternativeUnit.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?')";

	/**
	 * Validates the patternAlternativeUnit constraint of '<em>QUERYAMOUNT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQUERYAMOUNT_patternAlternativeUnit(QUERYAMOUNT queryamount, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Eclassxmlschemacommon_2_0SimplifiedPackage.Literals.QUERYAMOUNT,
				 queryamount,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternAlternativeUnit",
				 QUERYAMOUNT__PATTERN_ALTERNATIVE_UNIT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the patternBaseUnit constraint of '<em>QUERYAMOUNT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String QUERYAMOUNT__PATTERN_BASE_UNIT__EEXPRESSION = "self.baseUnit.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.baseUnit.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.baseUnit.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?')";

	/**
	 * Validates the patternBaseUnit constraint of '<em>QUERYAMOUNT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQUERYAMOUNT_patternBaseUnit(QUERYAMOUNT queryamount, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Eclassxmlschemacommon_2_0SimplifiedPackage.Literals.QUERYAMOUNT,
				 queryamount,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternBaseUnit",
				 QUERYAMOUNT__PATTERN_BASE_UNIT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTargetValues(TargetValues targetValues, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(targetValues, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTYPEDSTRING(TYPEDSTRING typedstring, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(typedstring, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(typedstring, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(typedstring, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(typedstring, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(typedstring, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(typedstring, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(typedstring, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(typedstring, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(typedstring, diagnostics, context);
		if (result || diagnostics != null) result &= validateLOCALIZEDSTRING_patternCountryCode(typedstring, diagnostics, context);
		if (result || diagnostics != null) result &= validateLOCALIZEDSTRING_patternLanguageCode(typedstring, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUNITMAPPING(UNITMAPPING unitmapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(unitmapping, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(unitmapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(unitmapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(unitmapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(unitmapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(unitmapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(unitmapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(unitmapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(unitmapping, diagnostics, context);
		if (result || diagnostics != null) result &= validateUNITMAPPING_patternSourceUnit(unitmapping, diagnostics, context);
		if (result || diagnostics != null) result &= validateUNITMAPPING_patternTargetUnit(unitmapping, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the patternSourceUnit constraint of '<em>UNITMAPPING</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String UNITMAPPING__PATTERN_SOURCE_UNIT__EEXPRESSION = "self.sourceUnit.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.sourceUnit.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.sourceUnit.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?')";

	/**
	 * Validates the patternSourceUnit constraint of '<em>UNITMAPPING</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUNITMAPPING_patternSourceUnit(UNITMAPPING unitmapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Eclassxmlschemacommon_2_0SimplifiedPackage.Literals.UNITMAPPING,
				 unitmapping,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternSourceUnit",
				 UNITMAPPING__PATTERN_SOURCE_UNIT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the patternTargetUnit constraint of '<em>UNITMAPPING</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String UNITMAPPING__PATTERN_TARGET_UNIT__EEXPRESSION = "self.targetUnit.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.targetUnit.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.targetUnit.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?')";

	/**
	 * Validates the patternTargetUnit constraint of '<em>UNITMAPPING</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUNITMAPPING_patternTargetUnit(UNITMAPPING unitmapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Eclassxmlschemacommon_2_0SimplifiedPackage.Literals.UNITMAPPING,
				 unitmapping,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternTargetUnit",
				 UNITMAPPING__PATTERN_TARGET_UNIT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVALUEMAPPING(VALUEMAPPING valuemapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valuemapping, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVALUEREF(VALUEREF valueref, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueref, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCONTENTMODELType(CONTENTMODELType contentmodelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //Eclassxmlschemacommon_2_0SimplifiedValidator
