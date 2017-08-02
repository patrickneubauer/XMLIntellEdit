/**
 */
package serviceexample.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import serviceexample.NamedThing;
import serviceexample.ServiceexampleFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Named Thing</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NamedThingTest extends TestCase {

	/**
	 * The fixture for this Named Thing test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedThing fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NamedThingTest.class);
	}

	/**
	 * Constructs a new Named Thing test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedThingTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Named Thing test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(NamedThing fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Named Thing test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedThing getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ServiceexampleFactory.eINSTANCE.createNamedThing());
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

} //NamedThingTest
