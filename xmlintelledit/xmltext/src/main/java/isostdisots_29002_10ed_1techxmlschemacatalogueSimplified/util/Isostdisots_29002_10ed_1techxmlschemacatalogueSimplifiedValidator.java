/**
 */
package isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

import isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Catalogue;
import isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage;
import isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Item;
import isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.PropertyValue;
import isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Reference;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage
 * @generated
 */
public class Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedValidator INSTANCE = new Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "isostdisots_29002_10ed_1techxmlschemacatalogueSimplified";

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
	public Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedValidator() {
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
	  return Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.eINSTANCE;
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
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.CATALOGUE:
				return validateCatalogue((Catalogue)value, diagnostics, context);
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.ITEM:
				return validateItem((Item)value, diagnostics, context);
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.PROPERTY_VALUE:
				return validatePropertyValue((PropertyValue)value, diagnostics, context);
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.REFERENCE:
				return validateReference((Reference)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCatalogue(Catalogue catalogue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(catalogue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItem(Item item, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(item, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(item, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(item, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(item, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(item, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(item, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(item, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(item, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(item, diagnostics, context);
		if (result || diagnostics != null) result &= validateItem_patternClassificationRefs(item, diagnostics, context);
		if (result || diagnostics != null) result &= validateItem_patternClassRef(item, diagnostics, context);
		if (result || diagnostics != null) result &= validateItem_patternCreatedView(item, diagnostics, context);
		if (result || diagnostics != null) result &= validateItem_patternDataSpecificationRef(item, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the patternClassificationRefs constraint of '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ITEM__PATTERN_CLASSIFICATION_REFS__EEXPRESSION = "self.classificationRefs->forAll(x | x.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?')) or self.classificationRefs->forAll(x | x.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?')) or self.classificationRefs->forAll(x | x.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?'))";

	/**
	 * Validates the patternClassificationRefs constraint of '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItem_patternClassificationRefs(Item item, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.Literals.ITEM,
				 item,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternClassificationRefs",
				 ITEM__PATTERN_CLASSIFICATION_REFS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the patternClassRef constraint of '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ITEM__PATTERN_CLASS_REF__EEXPRESSION = "self.classRef.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.classRef.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.classRef.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?')";

	/**
	 * Validates the patternClassRef constraint of '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItem_patternClassRef(Item item, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.Literals.ITEM,
				 item,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternClassRef",
				 ITEM__PATTERN_CLASS_REF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the patternCreatedView constraint of '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ITEM__PATTERN_CREATED_VIEW__EEXPRESSION = "(self.createdView=null) or self.createdView.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.createdView.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.createdView.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?')";

	/**
	 * Validates the patternCreatedView constraint of '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItem_patternCreatedView(Item item, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.Literals.ITEM,
				 item,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternCreatedView",
				 ITEM__PATTERN_CREATED_VIEW__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the patternDataSpecificationRef constraint of '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ITEM__PATTERN_DATA_SPECIFICATION_REF__EEXPRESSION = "(self.dataSpecificationRef=null) or self.dataSpecificationRef.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.dataSpecificationRef.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.dataSpecificationRef.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?')";

	/**
	 * Validates the patternDataSpecificationRef constraint of '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItem_patternDataSpecificationRef(Item item, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.Literals.ITEM,
				 item,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternDataSpecificationRef",
				 ITEM__PATTERN_DATA_SPECIFICATION_REF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyValue(PropertyValue propertyValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(propertyValue, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(propertyValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(propertyValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(propertyValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(propertyValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(propertyValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(propertyValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(propertyValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(propertyValue, diagnostics, context);
		if (result || diagnostics != null) result &= validatePropertyValue_patternPropertyRef(propertyValue, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the patternPropertyRef constraint of '<em>Property Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROPERTY_VALUE__PATTERN_PROPERTY_REF__EEXPRESSION = "self.propertyRef.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.propertyRef.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.propertyRef.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?')";

	/**
	 * Validates the patternPropertyRef constraint of '<em>Property Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyValue_patternPropertyRef(PropertyValue propertyValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.Literals.PROPERTY_VALUE,
				 propertyValue,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternPropertyRef",
				 PROPERTY_VALUE__PATTERN_PROPERTY_REF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReference(Reference reference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(reference, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(reference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(reference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(reference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(reference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(reference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(reference, diagnostics, context);
		if (result || diagnostics != null) result &= validateReference_patternOrganizationRef(reference, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the patternOrganizationRef constraint of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REFERENCE__PATTERN_ORGANIZATION_REF__EEXPRESSION = "(self.organizationRef=null) or self.organizationRef.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z]{1,1}(-[0-9A-Z:_\\\\.]{1,70})?)?)?(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.organizationRef.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}(-[0-9A-Z:_\\\\.]{1,35})?--[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?') or self.organizationRef.matches('[0-9]{4}-[0-9A-Z:_\\\\.]{1,35}---[0-9A-Z:_\\\\.]{1,70}(#[0-9A-Z]{2,2}-[0-9A-Z:_\\\\.]{1,131}#[0-9]{1,10})?')";

	/**
	 * Validates the patternOrganizationRef constraint of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReference_patternOrganizationRef(Reference reference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.Literals.REFERENCE,
				 reference,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "patternOrganizationRef",
				 REFERENCE__PATTERN_ORGANIZATION_REF__EEXPRESSION,
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

} //Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedValidator
