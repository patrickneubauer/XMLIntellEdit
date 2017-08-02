/**
 */
package tosca.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tosca.TPropertyMapping;
import tosca.ToscaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>TProperty Mapping</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TPropertyMappingTest extends TestCase {

	/**
	 * The fixture for this TProperty Mapping test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TPropertyMapping fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TPropertyMappingTest.class);
	}

	/**
	 * Constructs a new TProperty Mapping test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPropertyMappingTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this TProperty Mapping test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TPropertyMapping fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this TProperty Mapping test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TPropertyMapping getFixture() {
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
		setFixture(ToscaFactory.eINSTANCE.createTPropertyMapping());
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

} //TPropertyMappingTest
