/**
 */
package serviceexample.tests;

import junit.textui.TestRunner;

import serviceexample.Service;
import serviceexample.ServiceexampleFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceTest extends NamedThingTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ServiceTest.class);
	}

	/**
	 * Constructs a new Service test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Service test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Service getFixture() {
		return (Service)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ServiceexampleFactory.eINSTANCE.createService());
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

} //ServiceTest
