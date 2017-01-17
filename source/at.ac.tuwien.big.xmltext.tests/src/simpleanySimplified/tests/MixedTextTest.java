/**
 */
package simpleanySimplified.tests;

import junit.textui.TestRunner;

import simpleanySimplified.MixedText;
import simpleanySimplified.simpleanySimplifiedFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Mixed Text</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MixedTextTest extends MixedDataTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MixedTextTest.class);
	}

	/**
	 * Constructs a new Mixed Text test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MixedTextTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Mixed Text test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MixedText getFixture() {
		return (MixedText)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(simpleanySimplifiedFactory.eINSTANCE.createMixedText());
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

} //MixedTextTest
