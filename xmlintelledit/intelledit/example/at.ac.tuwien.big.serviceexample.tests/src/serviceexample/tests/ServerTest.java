/**
 */
package serviceexample.tests;

import junit.textui.TestRunner;

import serviceexample.Server;
import serviceexample.ServiceexampleFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServerTest extends NamedThingTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ServerTest.class);
	}

	/**
	 * Constructs a new Server test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Server test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Server getFixture() {
		return (Server)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ServiceexampleFactory.eINSTANCE.createServer());
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

} //ServerTest
