/**
 */
package tosca.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tosca.TExportedInterface;
import tosca.ToscaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>TExported Interface</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TExportedInterfaceTest extends TestCase {

	/**
	 * The fixture for this TExported Interface test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TExportedInterface fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TExportedInterfaceTest.class);
	}

	/**
	 * Constructs a new TExported Interface test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TExportedInterfaceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this TExported Interface test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TExportedInterface fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this TExported Interface test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TExportedInterface getFixture() {
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
		setFixture(ToscaFactory.eINSTANCE.createTExportedInterface());
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

} //TExportedInterfaceTest
