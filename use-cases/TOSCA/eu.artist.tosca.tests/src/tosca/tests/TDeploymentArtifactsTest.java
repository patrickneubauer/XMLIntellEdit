/**
 */
package tosca.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tosca.TDeploymentArtifacts;
import tosca.ToscaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>TDeployment Artifacts</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TDeploymentArtifactsTest extends TestCase {

	/**
	 * The fixture for this TDeployment Artifacts test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TDeploymentArtifacts fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TDeploymentArtifactsTest.class);
	}

	/**
	 * Constructs a new TDeployment Artifacts test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDeploymentArtifactsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this TDeployment Artifacts test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TDeploymentArtifacts fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this TDeployment Artifacts test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TDeploymentArtifacts getFixture() {
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
		setFixture(ToscaFactory.eINSTANCE.createTDeploymentArtifacts());
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

} //TDeploymentArtifactsTest
