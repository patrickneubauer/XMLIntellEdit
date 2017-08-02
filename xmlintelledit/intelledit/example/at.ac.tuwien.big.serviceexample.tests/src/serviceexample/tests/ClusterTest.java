/**
 */
package serviceexample.tests;

import junit.textui.TestRunner;

import serviceexample.Cluster;
import serviceexample.ServiceexampleFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cluster</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClusterTest extends NamedThingTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ClusterTest.class);
	}

	/**
	 * Constructs a new Cluster test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClusterTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Cluster test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Cluster getFixture() {
		return (Cluster)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ServiceexampleFactory.eINSTANCE.createCluster());
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

} //ClusterTest
