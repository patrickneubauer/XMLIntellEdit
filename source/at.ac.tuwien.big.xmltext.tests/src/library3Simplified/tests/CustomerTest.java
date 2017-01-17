/**
 */
package library3Simplified.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import library3Simplified.Customer;
import library3Simplified.library3SimplifiedFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CustomerTest extends TestCase {

	/**
	 * The fixture for this Customer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Customer fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CustomerTest.class);
	}

	/**
	 * Constructs a new Customer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Customer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Customer fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Customer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Customer getFixture() {
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
		setFixture(library3SimplifiedFactory.eINSTANCE.createCustomer());
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

} //CustomerTest
