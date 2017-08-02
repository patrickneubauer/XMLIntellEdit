/**
 */
package tosca.tests;

import junit.textui.TestRunner;

import tosca.TCapabilityDefinition;
import tosca.ToscaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>TCapability Definition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TCapabilityDefinitionTest extends TExtensibleElementsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TCapabilityDefinitionTest.class);
	}

	/**
	 * Constructs a new TCapability Definition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCapabilityDefinitionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this TCapability Definition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TCapabilityDefinition getFixture() {
		return (TCapabilityDefinition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ToscaFactory.eINSTANCE.createTCapabilityDefinition());
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

} //TCapabilityDefinitionTest
