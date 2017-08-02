/**
 */
package tosca.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tosca.ToscaFactory;
import tosca.ValidTargetType;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Valid Target Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ValidTargetTypeTest extends TestCase {

	/**
	 * The fixture for this Valid Target Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValidTargetType fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ValidTargetTypeTest.class);
	}

	/**
	 * Constructs a new Valid Target Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidTargetTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Valid Target Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ValidTargetType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Valid Target Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValidTargetType getFixture() {
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
		setFixture(ToscaFactory.eINSTANCE.createValidTargetType());
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

} //ValidTargetTypeTest
