/**
 */
package tosca.tests;

import junit.textui.TestRunner;

import tosca.TRelationshipTypeImplementation;
import tosca.ToscaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>TRelationship Type Implementation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TRelationshipTypeImplementationTest extends TExtensibleElementsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TRelationshipTypeImplementationTest.class);
	}

	/**
	 * Constructs a new TRelationship Type Implementation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRelationshipTypeImplementationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this TRelationship Type Implementation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TRelationshipTypeImplementation getFixture() {
		return (TRelationshipTypeImplementation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ToscaFactory.eINSTANCE.createTRelationshipTypeImplementation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //TRelationshipTypeImplementationTest
