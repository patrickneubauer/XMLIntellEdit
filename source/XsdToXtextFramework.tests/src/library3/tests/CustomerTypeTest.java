/**
 */
package library3.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import library3.CustomerType;
import library3.Library3Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Customer Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CustomerTypeTest extends TestCase {

	/**
	 * The fixture for this Customer Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerType fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CustomerTypeTest.class);
	}

	/**
	 * Constructs a new Customer Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Customer Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(CustomerType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Customer Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerType getFixture() {
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
		setFixture(Library3Factory.eINSTANCE.createCustomerType());
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

} //CustomerTypeTest
