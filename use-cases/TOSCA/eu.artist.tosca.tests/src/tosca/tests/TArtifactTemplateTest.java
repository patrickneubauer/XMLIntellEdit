/**
 */
package tosca.tests;

import junit.textui.TestRunner;

import tosca.TArtifactTemplate;
import tosca.ToscaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>TArtifact Template</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TArtifactTemplateTest extends TEntityTemplateTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TArtifactTemplateTest.class);
	}

	/**
	 * Constructs a new TArtifact Template test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TArtifactTemplateTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this TArtifact Template test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TArtifactTemplate getFixture() {
		return (TArtifactTemplate)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ToscaFactory.eINSTANCE.createTArtifactTemplate());
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

} //TArtifactTemplateTest
