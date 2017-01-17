/**
 */
package simpleanySimplified.tests;

import junit.textui.TestRunner;

import simpleanySimplified.MixedFeature;
import simpleanySimplified.simpleanySimplifiedFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Mixed Feature</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MixedFeatureTest extends MixedDataTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MixedFeatureTest.class);
	}

	/**
	 * Constructs a new Mixed Feature test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MixedFeatureTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Mixed Feature test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MixedFeature getFixture() {
		return (MixedFeature)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(simpleanySimplifiedFactory.eINSTANCE.createMixedFeature());
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

} //MixedFeatureTest
