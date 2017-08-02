/**
 */
package tosca.tests;

import junit.textui.TestRunner;

import tosca.ImplementationArtifactType;
import tosca.ToscaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Implementation Artifact Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImplementationArtifactTypeTest extends TImplementationArtifactTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ImplementationArtifactTypeTest.class);
	}

	/**
	 * Constructs a new Implementation Artifact Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationArtifactTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Implementation Artifact Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ImplementationArtifactType getFixture() {
		return (ImplementationArtifactType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ToscaFactory.eINSTANCE.createImplementationArtifactType());
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

} //ImplementationArtifactTypeTest
