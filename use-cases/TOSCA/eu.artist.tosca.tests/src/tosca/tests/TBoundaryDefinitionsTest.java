/**
 */
package tosca.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tosca.TBoundaryDefinitions;
import tosca.ToscaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>TBoundary Definitions</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TBoundaryDefinitionsTest extends TestCase {

	/**
	 * The fixture for this TBoundary Definitions test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TBoundaryDefinitions fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TBoundaryDefinitionsTest.class);
	}

	/**
	 * Constructs a new TBoundary Definitions test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TBoundaryDefinitionsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this TBoundary Definitions test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TBoundaryDefinitions fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this TBoundary Definitions test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TBoundaryDefinitions getFixture() {
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
		setFixture(ToscaFactory.eINSTANCE.createTBoundaryDefinitions());
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

} //TBoundaryDefinitionsTest
