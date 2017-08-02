/**
 */
package tosca.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tosca.TRequiredContainerFeatures;
import tosca.ToscaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>TRequired Container Features</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TRequiredContainerFeaturesTest extends TestCase {

	/**
	 * The fixture for this TRequired Container Features test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TRequiredContainerFeatures fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TRequiredContainerFeaturesTest.class);
	}

	/**
	 * Constructs a new TRequired Container Features test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRequiredContainerFeaturesTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this TRequired Container Features test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TRequiredContainerFeatures fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this TRequired Container Features test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TRequiredContainerFeatures getFixture() {
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
		setFixture(ToscaFactory.eINSTANCE.createTRequiredContainerFeatures());
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

} //TRequiredContainerFeaturesTest
