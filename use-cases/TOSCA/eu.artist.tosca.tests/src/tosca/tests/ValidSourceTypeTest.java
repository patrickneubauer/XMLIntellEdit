ï»¿/**
 */
package tosca.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tosca.ToscaFactory;
import tosca.ValidSourceType;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Valid Source Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ValidSourceTypeTest extends TestCase {

	/**
	 * The fixture for this Valid Source Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValidSourceType fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ValidSourceTypeTest.class);
	}

	/**
	 * Constructs a new Valid Source Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidSourceTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Valid Source Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ValidSourceType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Valid Source Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValidSourceType getFixture() {
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
		setFixture(ToscaFactory.eINSTANCE.createValidSourceType());
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

} //ValidSourceTypeTest
