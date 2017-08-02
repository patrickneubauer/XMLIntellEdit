/**
 */
package xontomlextensionsschemacoreSimplified.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

import xontomlextensionsschemacoreSimplified.CONTAINEDEAINSTANCES;
import xontomlextensionsschemacoreSimplified.CONTAINEDEATEMPLATES;
import xontomlextensionsschemacoreSimplified.CONTAINEDRELATIONDEPRECATION;
import xontomlextensionsschemacoreSimplified.DEPRECATION;
import xontomlextensionsschemacoreSimplified.EAENTITYTYPEType;
import xontomlextensionsschemacoreSimplified.EAREFERENCE;
import xontomlextensionsschemacoreSimplified.EATEMPLATE;
import xontomlextensionsschemacoreSimplified.EAVALUATION;
import xontomlextensionsschemacoreSimplified.ENTITYEXTENDEDATTRIBUTES;
import xontomlextensionsschemacoreSimplified.EXTENSIONS;
import xontomlextensionsschemacoreSimplified.XontomlextensionsschemacoreSimplifiedPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see xontomlextensionsschemacoreSimplified.XontomlextensionsschemacoreSimplifiedPackage
 * @generated
 */
public class XontomlextensionsschemacoreSimplifiedValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final XontomlextensionsschemacoreSimplifiedValidator INSTANCE = new XontomlextensionsschemacoreSimplifiedValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "xontomlextensionsschemacoreSimplified";

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
	public XontomlextensionsschemacoreSimplifiedValidator() {
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
	  return XontomlextensionsschemacoreSimplifiedPackage.eINSTANCE;
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
			case XontomlextensionsschemacoreSimplifiedPackage.CONTAINEDEAINSTANCES:
				return validateCONTAINEDEAINSTANCES((CONTAINEDEAINSTANCES)value, diagnostics, context);
			case XontomlextensionsschemacoreSimplifiedPackage.CONTAINEDEATEMPLATES:
				return validateCONTAINEDEATEMPLATES((CONTAINEDEATEMPLATES)value, diagnostics, context);
			case XontomlextensionsschemacoreSimplifiedPackage.CONTAINEDRELATIONDEPRECATION:
				return validateCONTAINEDRELATIONDEPRECATION((CONTAINEDRELATIONDEPRECATION)value, diagnostics, context);
			case XontomlextensionsschemacoreSimplifiedPackage.DEPRECATION:
				return validateDEPRECATION((DEPRECATION)value, diagnostics, context);
			case XontomlextensionsschemacoreSimplifiedPackage.EAREFERENCE:
				return validateEAREFERENCE((EAREFERENCE)value, diagnostics, context);
			case XontomlextensionsschemacoreSimplifiedPackage.EATEMPLATE:
				return validateEATEMPLATE((EATEMPLATE)value, diagnostics, context);
			case XontomlextensionsschemacoreSimplifiedPackage.EAVALUATION:
				return validateEAVALUATION((EAVALUATION)value, diagnostics, context);
			case XontomlextensionsschemacoreSimplifiedPackage.ENTITYEXTENDEDATTRIBUTES:
				return validateENTITYEXTENDEDATTRIBUTES((ENTITYEXTENDEDATTRIBUTES)value, diagnostics, context);
			case XontomlextensionsschemacoreSimplifiedPackage.EXTENSIONS:
				return validateEXTENSIONS((EXTENSIONS)value, diagnostics, context);
			case XontomlextensionsschemacoreSimplifiedPackage.EAENTITYTYPE_TYPE:
				return validateEAENTITYTYPEType((EAENTITYTYPEType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCONTAINEDEAINSTANCES(CONTAINEDEAINSTANCES containedeainstances, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(containedeainstances, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCONTAINEDEATEMPLATES(CONTAINEDEATEMPLATES containedeatemplates, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(containedeatemplates, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCONTAINEDRELATIONDEPRECATION(CONTAINEDRELATIONDEPRECATION containedrelationdeprecation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(containedrelationdeprecation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDEPRECATION(DEPRECATION deprecation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(deprecation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(deprecation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(deprecation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(deprecation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(deprecation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(deprecation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(deprecation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(deprecation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(deprecation, diagnostics, context);
		if (result || diagnostics != null) result &= validateDEPRECATION_patternContext(deprecation, diagnostics, context);
		if (result || diagnostics != null) result &= validateDEPRECATION_patternEntity(deprecation, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the patternContext constraint of '<em>DEPRECATION</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DEPRECATION__PATTERN_CONTEXT__EEXPRESSION = "self.context.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.context.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.context.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?')";

	/**
	 * Validates the patternContext constraint of '<em>DEPRECATION</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDEPRECATION_patternContext(DEPRECATION deprecation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(XontomlextensionsschemacoreSimplifiedPackage.Literals.DEPRECATION,
				 deprecation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternContext",
				 DEPRECATION__PATTERN_CONTEXT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the patternEntity constraint of '<em>DEPRECATION</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DEPRECATION__PATTERN_ENTITY__EEXPRESSION = "(self.entity=null) or self.entity.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.entity.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.entity.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?')";

	/**
	 * Validates the patternEntity constraint of '<em>DEPRECATION</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDEPRECATION_patternEntity(DEPRECATION deprecation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(XontomlextensionsschemacoreSimplifiedPackage.Literals.DEPRECATION,
				 deprecation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternEntity",
				 DEPRECATION__PATTERN_ENTITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEAREFERENCE(EAREFERENCE eareference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eareference, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eareference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eareference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eareference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eareference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eareference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eareference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eareference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eareference, diagnostics, context);
		if (result || diagnostics != null) result &= validateEAREFERENCE_maxLengthTemplateId(eareference, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the maxLengthTemplateId constraint of '<em>EAREFERENCE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EAREFERENCE__MAX_LENGTH_TEMPLATE_ID__EEXPRESSION = "self.templateId.size() <= 100";

	/**
	 * Validates the maxLengthTemplateId constraint of '<em>EAREFERENCE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEAREFERENCE_maxLengthTemplateId(EAREFERENCE eareference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(XontomlextensionsschemacoreSimplifiedPackage.Literals.EAREFERENCE,
				 eareference,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxLengthTemplateId",
				 EAREFERENCE__MAX_LENGTH_TEMPLATE_ID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEATEMPLATE(EATEMPLATE eatemplate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eatemplate, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eatemplate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eatemplate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eatemplate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eatemplate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eatemplate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eatemplate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eatemplate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eatemplate, diagnostics, context);
		if (result || diagnostics != null) result &= validateEATEMPLATE_maxLengthCode(eatemplate, diagnostics, context);
		if (result || diagnostics != null) result &= validateEATEMPLATE_maxLengthId(eatemplate, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the maxLengthCode constraint of '<em>EATEMPLATE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EATEMPLATE__MAX_LENGTH_CODE__EEXPRESSION = "(self.code = null) or self.code.size() <= 100";

	/**
	 * Validates the maxLengthCode constraint of '<em>EATEMPLATE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEATEMPLATE_maxLengthCode(EATEMPLATE eatemplate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(XontomlextensionsschemacoreSimplifiedPackage.Literals.EATEMPLATE,
				 eatemplate,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxLengthCode",
				 EATEMPLATE__MAX_LENGTH_CODE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the maxLengthId constraint of '<em>EATEMPLATE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EATEMPLATE__MAX_LENGTH_ID__EEXPRESSION = "self.id.size() <= 100";

	/**
	 * Validates the maxLengthId constraint of '<em>EATEMPLATE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEATEMPLATE_maxLengthId(EATEMPLATE eatemplate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(XontomlextensionsschemacoreSimplifiedPackage.Literals.EATEMPLATE,
				 eatemplate,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxLengthId",
				 EATEMPLATE__MAX_LENGTH_ID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEAVALUATION(EAVALUATION eavaluation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eavaluation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eavaluation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eavaluation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eavaluation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eavaluation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eavaluation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eavaluation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eavaluation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eavaluation, diagnostics, context);
		if (result || diagnostics != null) result &= validateEAVALUATION_maxLengthTemplateId(eavaluation, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the maxLengthTemplateId constraint of '<em>EAVALUATION</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EAVALUATION__MAX_LENGTH_TEMPLATE_ID__EEXPRESSION = "self.templateId.size() <= 100";

	/**
	 * Validates the maxLengthTemplateId constraint of '<em>EAVALUATION</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEAVALUATION_maxLengthTemplateId(EAVALUATION eavaluation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(XontomlextensionsschemacoreSimplifiedPackage.Literals.EAVALUATION,
				 eavaluation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "maxLengthTemplateId",
				 EAVALUATION__MAX_LENGTH_TEMPLATE_ID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENTITYEXTENDEDATTRIBUTES(ENTITYEXTENDEDATTRIBUTES entityextendedattributes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(entityextendedattributes, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(entityextendedattributes, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(entityextendedattributes, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(entityextendedattributes, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(entityextendedattributes, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(entityextendedattributes, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(entityextendedattributes, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(entityextendedattributes, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(entityextendedattributes, diagnostics, context);
		if (result || diagnostics != null) result &= validateENTITYEXTENDEDATTRIBUTES_patternEntityRef(entityextendedattributes, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the patternEntityRef constraint of '<em>ENTITYEXTENDEDATTRIBUTES</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENTITYEXTENDEDATTRIBUTES__PATTERN_ENTITY_REF__EEXPRESSION = "self.entityRef.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.entityRef.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.entityRef.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?')";

	/**
	 * Validates the patternEntityRef constraint of '<em>ENTITYEXTENDEDATTRIBUTES</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENTITYEXTENDEDATTRIBUTES_patternEntityRef(ENTITYEXTENDEDATTRIBUTES entityextendedattributes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(XontomlextensionsschemacoreSimplifiedPackage.Literals.ENTITYEXTENDEDATTRIBUTES,
				 entityextendedattributes,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternEntityRef",
				 ENTITYEXTENDEDATTRIBUTES__PATTERN_ENTITY_REF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEXTENSIONS(EXTENSIONS extensions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(extensions, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEAENTITYTYPEType(EAENTITYTYPEType eaentitytypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //XontomlextensionsschemacoreSimplifiedValidator
