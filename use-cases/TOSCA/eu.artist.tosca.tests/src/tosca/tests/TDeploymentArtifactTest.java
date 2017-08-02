/**
 */
package tosca.tests;

import junit.textui.TestRunner;

import tosca.TDeploymentArtifact;
import tosca.ToscaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>TDeployment Artifact</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TDeploymentArtifactTest extends TExtensibleElementsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TDeploymentArtifactTest.class);
	}

	/**
	 * Constructs a new TDeployment Artifact test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDeploymentArtifactTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this TDeployment Artifact test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TDeploymentArtifact getFixture() {
		return (TDeploymentArtifact)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ToscaFactory.eINSTANCE.createTDeploymentArtifact());
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

} //TDeploymentArtifactTest
