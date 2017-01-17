/**
 */
package library3.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import library3.Library3Factory;
import library3.LibraryType;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Library Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LibraryTypeTest extends TestCase {

	/**
	 * The fixture for this Library Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LibraryType fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LibraryTypeTest.class);
	}

	/**
	 * Constructs a new Library Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Library Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(LibraryType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Library Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LibraryType getFixture() {
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
		setFixture(Library3Factory.eINSTANCE.createLibraryType());
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

} //LibraryTypeTest
