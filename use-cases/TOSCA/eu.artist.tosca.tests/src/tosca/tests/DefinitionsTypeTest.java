/**
 */
package tosca.tests;

import junit.textui.TestRunner;

import tosca.DefinitionsType;
import tosca.ToscaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Definitions Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DefinitionsTypeTest extends TDefinitionsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DefinitionsTypeTest.class);
	}

	/**
	 * Constructs a new Definitions Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinitionsTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Definitions Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DefinitionsType getFixture() {
		return (DefinitionsType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ToscaFactory.eINSTANCE.createDefinitionsType());
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

} //DefinitionsTypeTest
