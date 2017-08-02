/**
 */
package tosca.tests;

import junit.textui.TestRunner;

import tosca.TPolicyTemplate;
import tosca.ToscaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>TPolicy Template</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TPolicyTemplateTest extends TEntityTemplateTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TPolicyTemplateTest.class);
	}

	/**
	 * Constructs a new TPolicy Template test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPolicyTemplateTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this TPolicy Template test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TPolicyTemplate getFixture() {
		return (TPolicyTemplate)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ToscaFactory.eINSTANCE.createTPolicyTemplate());
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

} //TPolicyTemplateTest
