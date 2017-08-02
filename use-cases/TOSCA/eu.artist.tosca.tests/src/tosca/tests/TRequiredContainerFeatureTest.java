/**
 */
package tosca.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tosca.TRequiredContainerFeature;
import tosca.ToscaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>TRequired Container Feature</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TRequiredContainerFeatureTest extends TestCase {

	/**
	 * The fixture for this TRequired Container Feature test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TRequiredContainerFeature fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TRequiredContainerFeatureTest.class);
	}

	/**
	 * Constructs a new TRequired Container Feature test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRequiredContainerFeatureTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this TRequired Container Feature test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TRequiredContainerFeature fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this TRequired Container Feature test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TRequiredContainerFeature getFixture() {
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
		setFixture(ToscaFactory.eINSTANCE.createTRequiredContainerFeature());
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

} //TRequiredContainerFeatureTest
