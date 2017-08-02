/**
 */
package tosca.tests;

import junit.textui.TestRunner;

import tosca.TRelationshipTemplate;
import tosca.ToscaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>TRelationship Template</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TRelationshipTemplateTest extends TEntityTemplateTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TRelationshipTemplateTest.class);
	}

	/**
	 * Constructs a new TRelationship Template test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRelationshipTemplateTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this TRelationship Template test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TRelationshipTemplate getFixture() {
		return (TRelationshipTemplate)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ToscaFactory.eINSTANCE.createTRelationshipTemplate());
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

} //TRelationshipTemplateTest
