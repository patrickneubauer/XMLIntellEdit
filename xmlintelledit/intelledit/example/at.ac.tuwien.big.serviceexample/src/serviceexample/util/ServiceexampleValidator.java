/**
 */
package serviceexample.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import serviceexample.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see serviceexample.ServiceexamplePackage
 * @generated
 */
public class ServiceexampleValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ServiceexampleValidator INSTANCE = new ServiceexampleValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "serviceexample";

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
	public ServiceexampleValidator() {
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
	  return ServiceexamplePackage.eINSTANCE;
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
			case ServiceexamplePackage.CLUSTER:
				return validateCluster((Cluster)value, diagnostics, context);
			case ServiceexamplePackage.SERVICE:
				return validateService((Service)value, diagnostics, context);
			case ServiceexamplePackage.SERVER:
				return validateServer((Server)value, diagnostics, context);
			case ServiceexamplePackage.CONTAINER:
				return validateContainer((Container)value, diagnostics, context);
			case ServiceexamplePackage.NAMED_THING:
				return validateNamedThing((NamedThing)value, diagnostics, context);
			case ServiceexamplePackage.SERVICE_TYPE:
				return validateServiceType((ServiceType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCluster(Cluster cluster, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cluster, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cluster, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cluster, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cluster, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cluster, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cluster, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cluster, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cluster, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cluster, diagnostics, context);
		if (result || diagnostics != null) result &= validateCluster_sameServics(cluster, diagnostics, context);
		if (result || diagnostics != null) result &= validateCluster_goodSpeed(cluster, diagnostics, context);
		if (result || diagnostics != null) result &= validateCluster_onlyOneImportant(cluster, diagnostics, context);
		if (result || diagnostics != null) result &= validateCluster_backupDifferent(cluster, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the sameServics constraint of '<em>Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLUSTER__SAME_SERVICS__EEXPRESSION = "backup = null or backup.services->includesAll(services)";

	/**
	 * Validates the sameServics constraint of '<em>Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCluster_sameServics(Cluster cluster, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ServiceexamplePackage.Literals.CLUSTER,
				 cluster,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "sameServics",
				 CLUSTER__SAME_SERVICS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the goodSpeed constraint of '<em>Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLUSTER__GOOD_SPEED__EEXPRESSION = "designSpeed <= server.speed->sum()";

	/**
	 * Validates the goodSpeed constraint of '<em>Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCluster_goodSpeed(Cluster cluster, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ServiceexamplePackage.Literals.CLUSTER,
				 cluster,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "goodSpeed",
				 CLUSTER__GOOD_SPEED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the onlyOneImportant constraint of '<em>Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLUSTER__ONLY_ONE_IMPORTANT__EEXPRESSION = "services->select(s | s.type = ServiceType::IMPORTANT)->size() <= 1";

	/**
	 * Validates the onlyOneImportant constraint of '<em>Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCluster_onlyOneImportant(Cluster cluster, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ServiceexamplePackage.Literals.CLUSTER,
				 cluster,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "onlyOneImportant",
				 CLUSTER__ONLY_ONE_IMPORTANT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the backupDifferent constraint of '<em>Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLUSTER__BACKUP_DIFFERENT__EEXPRESSION = "backup <> self";

	/**
	 * Validates the backupDifferent constraint of '<em>Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCluster_backupDifferent(Cluster cluster, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ServiceexamplePackage.Literals.CLUSTER,
				 cluster,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "backupDifferent",
				 CLUSTER__BACKUP_DIFFERENT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateService(Service service, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(service, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(service, diagnostics, context);
		if (result || diagnostics != null) result &= validateService_speedFulfilled(service, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the speedFulfilled constraint of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE__SPEED_FULFILLED__EEXPRESSION = "type = ServiceType::BESTEFFORT or ( \n" +
		"\t\t\tdesignSpeed <= providedBy.designSpeed and (if type = ServiceType::IMPORTANT then designSpeed <= providedBy.backup.designSpeed\n" +
		"\t\t\t\telse type = ServiceType::WEAKCONTRACT or providedBy.backup <> null endif))";

	/**
	 * Validates the speedFulfilled constraint of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateService_speedFulfilled(Service service, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ServiceexamplePackage.Literals.SERVICE,
				 service,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "speedFulfilled",
				 SERVICE__SPEED_FULFILLED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServer(Server server, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(server, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(server, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(server, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(server, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(server, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(server, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(server, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(server, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(server, diagnostics, context);
		if (result || diagnostics != null) result &= validateServer_speedValid(server, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the speedValid constraint of '<em>Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVER__SPEED_VALID__EEXPRESSION = "speed > 0 and speed <= 5";

	/**
	 * Validates the speedValid constraint of '<em>Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServer_speedValid(Server server, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ServiceexamplePackage.Literals.SERVER,
				 server,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "speedValid",
				 SERVER__SPEED_VALID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContainer(Container container, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(container, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedThing(NamedThing namedThing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedThing, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceType(ServiceType serviceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //ServiceexampleValidator
