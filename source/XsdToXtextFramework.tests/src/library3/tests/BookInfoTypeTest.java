/**
 */
package library3.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import library3.BookInfoType;
import library3.Library3Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Book Info Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BookInfoTypeTest extends TestCase {

	/**
	 * The fixture for this Book Info Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookInfoType fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BookInfoTypeTest.class);
	}

	/**
	 * Constructs a new Book Info Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookInfoTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Book Info Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(BookInfoType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Book Info Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookInfoType getFixture() {
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
		setFixture(Library3Factory.eINSTANCE.createBookInfoType());
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

} //BookInfoTypeTest
