/**
 */
package library3.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import library3.BookType;
import library3.Library3Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Book Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BookTypeTest extends TestCase {

	/**
	 * The fixture for this Book Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookType fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BookTypeTest.class);
	}

	/**
	 * Constructs a new Book Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Book Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(BookType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Book Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookType getFixture() {
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
		setFixture(Library3Factory.eINSTANCE.createBookType());
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

} //BookTypeTest
