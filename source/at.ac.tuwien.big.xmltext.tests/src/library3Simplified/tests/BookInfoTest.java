/**
 */
package library3Simplified.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import library3Simplified.BookInfo;
import library3Simplified.library3SimplifiedFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Book Info</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BookInfoTest extends TestCase {

	/**
	 * The fixture for this Book Info test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookInfo fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BookInfoTest.class);
	}

	/**
	 * Constructs a new Book Info test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookInfoTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Book Info test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(BookInfo fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Book Info test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookInfo getFixture() {
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
		setFixture(library3SimplifiedFactory.eINSTANCE.createBookInfo());
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

} //BookInfoTest
