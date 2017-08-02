/**
 */
package tosca.tests;

import junit.textui.TestRunner;

import tosca.TPropertyConstraint;
import tosca.ToscaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>TProperty Constraint</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TPropertyConstraintTest extends TConstraintTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TPropertyConstraintTest.class);
	}

	/**
	 * Constructs a new TProperty Constraint test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPropertyConstraintTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this TProperty Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TPropertyConstraint getFixture() {
		return (TPropertyConstraint)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ToscaFactory.eINSTANCE.createTPropertyConstraint());
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

} //TPropertyConstraintTest
