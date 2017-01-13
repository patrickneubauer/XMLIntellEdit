/**
 */
package library3Simplified;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see library3Simplified.library3SimplifiedFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface library3SimplifiedPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "library3Simplified";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://platform:/plugin/library3.xsdsimplified";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Library3s";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	library3SimplifiedPackage eINSTANCE = library3Simplified.impl.library3SimplifiedPackageImpl.init();

	/**
	 * The meta object id for the '{@link library3Simplified.impl.BookInfoImpl <em>Book Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see library3Simplified.impl.BookInfoImpl
	 * @see library3Simplified.impl.library3SimplifiedPackageImpl#getBookInfo()
	 * @generated
	 */
	int BOOK_INFO = 0;

	/**
	 * The number of structural features of the '<em>Book Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_INFO_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Book Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link library3Simplified.impl.BookImpl <em>Book</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see library3Simplified.impl.BookImpl
	 * @see library3Simplified.impl.library3SimplifiedPackageImpl#getBook()
	 * @generated
	 */
	int BOOK = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__AUTHOR = 2;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__PAGES = 3;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__DIMENSION = 4;

	/**
	 * The feature id for the '<em><b>Isbn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__ISBN = 5;

	/**
	 * The feature id for the '<em><b>Book Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__BOOK_INFO = 6;

	/**
	 * The number of structural features of the '<em>Book</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Book</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link library3Simplified.impl.CustomerImpl <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see library3Simplified.impl.CustomerImpl
	 * @see library3Simplified.impl.library3SimplifiedPackageImpl#getCustomer()
	 * @generated
	 */
	int CUSTOMER = 2;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__FIRST_NAME = 0;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__LAST_NAME = 1;

	/**
	 * The feature id for the '<em><b>Borrowed Book Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__BORROWED_BOOK_ID = 2;

	/**
	 * The feature id for the '<em><b>Borrowed Book Since</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__BORROWED_BOOK_SINCE = 3;

	/**
	 * The number of structural features of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link library3Simplified.impl.LibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see library3Simplified.impl.LibraryImpl
	 * @see library3Simplified.impl.library3SimplifiedPackageImpl#getLibrary()
	 * @generated
	 */
	int LIBRARY = 3;

	/**
	 * The feature id for the '<em><b>Books</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__BOOKS = 0;

	/**
	 * The feature id for the '<em><b>Customers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__CUSTOMERS = 1;

	/**
	 * The number of structural features of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link library3Simplified.BookInfo <em>Book Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Book Info</em>'.
	 * @see library3Simplified.BookInfo
	 * @generated
	 */
	EClass getBookInfo();

	/**
	 * Returns the meta object for class '{@link library3Simplified.Book <em>Book</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Book</em>'.
	 * @see library3Simplified.Book
	 * @generated
	 */
	EClass getBook();

	/**
	 * Returns the meta object for the attribute '{@link library3Simplified.Book#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see library3Simplified.Book#getName()
	 * @see #getBook()
	 * @generated
	 */
	EAttribute getBook_Name();

	/**
	 * Returns the meta object for the attribute '{@link library3Simplified.Book#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see library3Simplified.Book#getTitle()
	 * @see #getBook()
	 * @generated
	 */
	EAttribute getBook_Title();

	/**
	 * Returns the meta object for the attribute '{@link library3Simplified.Book#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see library3Simplified.Book#getAuthor()
	 * @see #getBook()
	 * @generated
	 */
	EAttribute getBook_Author();

	/**
	 * Returns the meta object for the attribute '{@link library3Simplified.Book#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pages</em>'.
	 * @see library3Simplified.Book#getPages()
	 * @see #getBook()
	 * @generated
	 */
	EAttribute getBook_Pages();

	/**
	 * Returns the meta object for the attribute '{@link library3Simplified.Book#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dimension</em>'.
	 * @see library3Simplified.Book#getDimension()
	 * @see #getBook()
	 * @generated
	 */
	EAttribute getBook_Dimension();

	/**
	 * Returns the meta object for the attribute '{@link library3Simplified.Book#getIsbn <em>Isbn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Isbn</em>'.
	 * @see library3Simplified.Book#getIsbn()
	 * @see #getBook()
	 * @generated
	 */
	EAttribute getBook_Isbn();

	/**
	 * Returns the meta object for the containment reference '{@link library3Simplified.Book#getBookInfo <em>Book Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Book Info</em>'.
	 * @see library3Simplified.Book#getBookInfo()
	 * @see #getBook()
	 * @generated
	 */
	EReference getBook_BookInfo();

	/**
	 * Returns the meta object for class '{@link library3Simplified.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer</em>'.
	 * @see library3Simplified.Customer
	 * @generated
	 */
	EClass getCustomer();

	/**
	 * Returns the meta object for the attribute '{@link library3Simplified.Customer#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see library3Simplified.Customer#getFirstName()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link library3Simplified.Customer#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see library3Simplified.Customer#getLastName()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_LastName();

	/**
	 * Returns the meta object for the attribute '{@link library3Simplified.Customer#getBorrowedBookId <em>Borrowed Book Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Borrowed Book Id</em>'.
	 * @see library3Simplified.Customer#getBorrowedBookId()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_BorrowedBookId();

	/**
	 * Returns the meta object for the attribute '{@link library3Simplified.Customer#getBorrowedBookSince <em>Borrowed Book Since</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Borrowed Book Since</em>'.
	 * @see library3Simplified.Customer#getBorrowedBookSince()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_BorrowedBookSince();

	/**
	 * Returns the meta object for class '{@link library3Simplified.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library</em>'.
	 * @see library3Simplified.Library
	 * @generated
	 */
	EClass getLibrary();

	/**
	 * Returns the meta object for the containment reference list '{@link library3Simplified.Library#getBooks <em>Books</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Books</em>'.
	 * @see library3Simplified.Library#getBooks()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_Books();

	/**
	 * Returns the meta object for the containment reference list '{@link library3Simplified.Library#getCustomers <em>Customers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Customers</em>'.
	 * @see library3Simplified.Library#getCustomers()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_Customers();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	library3SimplifiedFactory getlibrary3SimplifiedFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link library3Simplified.impl.BookInfoImpl <em>Book Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see library3Simplified.impl.BookInfoImpl
		 * @see library3Simplified.impl.library3SimplifiedPackageImpl#getBookInfo()
		 * @generated
		 */
		EClass BOOK_INFO = eINSTANCE.getBookInfo();

		/**
		 * The meta object literal for the '{@link library3Simplified.impl.BookImpl <em>Book</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see library3Simplified.impl.BookImpl
		 * @see library3Simplified.impl.library3SimplifiedPackageImpl#getBook()
		 * @generated
		 */
		EClass BOOK = eINSTANCE.getBook();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOK__NAME = eINSTANCE.getBook_Name();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOK__TITLE = eINSTANCE.getBook_Title();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOK__AUTHOR = eINSTANCE.getBook_Author();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOK__PAGES = eINSTANCE.getBook_Pages();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOK__DIMENSION = eINSTANCE.getBook_Dimension();

		/**
		 * The meta object literal for the '<em><b>Isbn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOK__ISBN = eINSTANCE.getBook_Isbn();

		/**
		 * The meta object literal for the '<em><b>Book Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOK__BOOK_INFO = eINSTANCE.getBook_BookInfo();

		/**
		 * The meta object literal for the '{@link library3Simplified.impl.CustomerImpl <em>Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see library3Simplified.impl.CustomerImpl
		 * @see library3Simplified.impl.library3SimplifiedPackageImpl#getCustomer()
		 * @generated
		 */
		EClass CUSTOMER = eINSTANCE.getCustomer();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__FIRST_NAME = eINSTANCE.getCustomer_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__LAST_NAME = eINSTANCE.getCustomer_LastName();

		/**
		 * The meta object literal for the '<em><b>Borrowed Book Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__BORROWED_BOOK_ID = eINSTANCE.getCustomer_BorrowedBookId();

		/**
		 * The meta object literal for the '<em><b>Borrowed Book Since</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__BORROWED_BOOK_SINCE = eINSTANCE.getCustomer_BorrowedBookSince();

		/**
		 * The meta object literal for the '{@link library3Simplified.impl.LibraryImpl <em>Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see library3Simplified.impl.LibraryImpl
		 * @see library3Simplified.impl.library3SimplifiedPackageImpl#getLibrary()
		 * @generated
		 */
		EClass LIBRARY = eINSTANCE.getLibrary();

		/**
		 * The meta object literal for the '<em><b>Books</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__BOOKS = eINSTANCE.getLibrary_Books();

		/**
		 * The meta object literal for the '<em><b>Customers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__CUSTOMERS = eINSTANCE.getLibrary_Customers();

	}

} //library3SimplifiedPackage
