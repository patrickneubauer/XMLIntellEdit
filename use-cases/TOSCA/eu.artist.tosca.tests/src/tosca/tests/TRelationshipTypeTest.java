/**
 */
package tosca.tests;

import junit.textui.TestRunner;

import tosca.TRelationshipType;
import tosca.ToscaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>TRelationship Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TRelationshipTypeTest extends TEntityTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TRelationshipTypeTest.class);
	}

	/**
	 * Constructs a new TRelationship Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRelationshipTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this TRelationship Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TRelationshipType getFixture() {
		return (TRelationshipType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ToscaFactory.eINSTANCE.createTRelationshipType());
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

} //TRelationshipTypeTest
