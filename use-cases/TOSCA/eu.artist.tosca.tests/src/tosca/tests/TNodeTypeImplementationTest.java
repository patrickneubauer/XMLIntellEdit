/**
 */
package tosca.tests;

import junit.textui.TestRunner;

import tosca.TNodeTypeImplementation;
import tosca.ToscaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>TNode Type Implementation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TNodeTypeImplementationTest extends TExtensibleElementsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TNodeTypeImplementationTest.class);
	}

	/**
	 * Constructs a new TNode Type Implementation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TNodeTypeImplementationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this TNode Type Implementation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TNodeTypeImplementation getFixture() {
		return (TNodeTypeImplementation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ToscaFactory.eINSTANCE.createTNodeTypeImplementation());
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

} //TNodeTypeImplementationTest
