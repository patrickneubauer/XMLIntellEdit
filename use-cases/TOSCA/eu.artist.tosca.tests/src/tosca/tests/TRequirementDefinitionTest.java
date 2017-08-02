/**
 */
package tosca.tests;

import junit.textui.TestRunner;

import tosca.TRequirementDefinition;
import tosca.ToscaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>TRequirement Definition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TRequirementDefinitionTest extends TExtensibleElementsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TRequirementDefinitionTest.class);
	}

	/**
	 * Constructs a new TRequirement Definition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRequirementDefinitionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this TRequirement Definition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TRequirementDefinition getFixture() {
		return (TRequirementDefinition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ToscaFactory.eINSTANCE.createTRequirementDefinition());
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

} //TRequirementDefinitionTest
