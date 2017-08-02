/**
 */
package tosca.tests;

import junit.textui.TestRunner;

import tosca.TNodeTemplate;
import tosca.ToscaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>TNode Template</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TNodeTemplateTest extends TEntityTemplateTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TNodeTemplateTest.class);
	}

	/**
	 * Constructs a new TNode Template test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TNodeTemplateTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this TNode Template test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TNodeTemplate getFixture() {
		return (TNodeTemplate)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ToscaFactory.eINSTANCE.createTNodeTemplate());
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

} //TNodeTemplateTest
