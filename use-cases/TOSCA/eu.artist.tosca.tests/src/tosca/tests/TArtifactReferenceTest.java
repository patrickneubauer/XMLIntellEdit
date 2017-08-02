/**
 */
package tosca.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tosca.TArtifactReference;
import tosca.ToscaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>TArtifact Reference</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TArtifactReferenceTest extends TestCase {

	/**
	 * The fixture for this TArtifact Reference test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TArtifactReference fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TArtifactReferenceTest.class);
	}

	/**
	 * Constructs a new TArtifact Reference test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TArtifactReferenceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this TArtifact Reference test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TArtifactReference fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this TArtifact Reference test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TArtifactReference getFixture() {
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
		setFixture(ToscaFactory.eINSTANCE.createTArtifactReference());
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

} //TArtifactReferenceTest
