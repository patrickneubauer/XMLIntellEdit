/**
 */
package library3;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see library3.Library3Factory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
public interface Library3Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "library3";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/library3.xsd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Library3";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Library3Package eINSTANCE = library3.impl.Library3PackageImpl.init();

	/**
	 * The meta object id for the '{@link library3.impl.BookInfoTypeImpl <em>Book Info Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see library3.impl.BookInfoTypeImpl
	 * @see library3.impl.Library3PackageImpl#getBookInfoType()
	 * @generated
	 */
	int BOOK_INFO_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_INFO_TYPE__ANY = 0;

	/**
	 * The number of structural features of the '<em>Book Info Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_INFO_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Book Info Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_INFO_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link library3.impl.BookTypeImpl <em>Book Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see library3.impl.BookTypeImpl
	 * @see library3.impl.Library3PackageImpl#getBookType()
	 * @generated
	 */
	int BOOK_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_TYPE__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_TYPE__AUTHOR = 2;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_TYPE__PAGES = 3;

	/**
	 * The feature id for the '<em><b>Book Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_TYPE__BOOK_INFO = 4;

	/**
	 * The feature id for the '<em><b>Isbn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_TYPE__ISBN = 5;

	/**
	 * The number of structural features of the '<em>Book Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Book Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link library3.impl.CustomerTypeImpl <em>Customer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see library3.impl.CustomerTypeImpl
	 * @see library3.impl.Library3PackageImpl#getCustomerType()
	 * @generated
	 */
	int CUSTOMER_TYPE = 2;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_TYPE__FIRST_NAME = 0;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_TYPE__LAST_NAME = 1;

	/**
	 * The feature id for the '<em><b>Borrowed Book Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_TYPE__BORROWED_BOOK_ID = 2;

	/**
	 * The number of structural features of the '<em>Customer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Customer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link library3.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see library3.impl.DocumentRootImpl
	 * @see library3.impl.Library3PackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 3;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Library</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LIBRARY = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link library3.impl.LibraryTypeImpl <em>Library Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see library3.impl.LibraryTypeImpl
	 * @see library3.impl.Library3PackageImpl#getLibraryType()
	 * @generated
	 */
	int LIBRARY_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Book</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_TYPE__BOOK = 0;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_TYPE__CUSTOMER = 1;

	/**
	 * The number of structural features of the '<em>Library Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Library Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Desc Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see library3.impl.Library3PackageImpl#getDescType()
	 * @generated
	 */
	int DESC_TYPE = 5;

	/**
	 * The meta object id for the '<em>Isbn Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see library3.impl.Library3PackageImpl#getIsbnType()
	 * @generated
	 */
	int ISBN_TYPE = 6;

	/**
	 * The meta object id for the '<em>Name Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see library3.impl.Library3PackageImpl#getNameType()
	 * @generated
	 */
	int NAME_TYPE = 7;

	/**
	 * The meta object id for the '<em>Pages Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see library3.impl.Library3PackageImpl#getPagesType()
	 * @generated
	 */
	int PAGES_TYPE = 8;

	/**
	 * The meta object id for the '<em>Pages Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see library3.impl.Library3PackageImpl#getPagesTypeObject()
	 * @generated
	 */
	int PAGES_TYPE_OBJECT = 9;

	/**
	 * The meta object id for the '<em>Since Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see library3.impl.Library3PackageImpl#getSinceType()
	 * @generated
	 */
	int SINCE_TYPE = 10;


	/**
	 * Returns the meta object for class '{@link library3.BookInfoType <em>Book Info Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Book Info Type</em>'.
	 * @see library3.BookInfoType
	 * @generated
	 */
	EClass getBookInfoType();

	/**
	 * Returns the meta object for the attribute list '{@link library3.BookInfoType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see library3.BookInfoType#getAny()
	 * @see #getBookInfoType()
	 * @generated
	 */
	EAttribute getBookInfoType_Any();

	/**
	 * Returns the meta object for class '{@link library3.BookType <em>Book Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Book Type</em>'.
	 * @see library3.BookType
	 * @generated
	 */
	EClass getBookType();

	/**
	 * Returns the meta object for the attribute '{@link library3.BookType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see library3.BookType#getName()
	 * @see #getBookType()
	 * @generated
	 */
	EAttribute getBookType_Name();

	/**
	 * Returns the meta object for the attribute '{@link library3.BookType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see library3.BookType#getTitle()
	 * @see #getBookType()
	 * @generated
	 */
	EAttribute getBookType_Title();

	/**
	 * Returns the meta object for the attribute '{@link library3.BookType#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see library3.BookType#getAuthor()
	 * @see #getBookType()
	 * @generated
	 */
	EAttribute getBookType_Author();

	/**
	 * Returns the meta object for the attribute '{@link library3.BookType#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pages</em>'.
	 * @see library3.BookType#getPages()
	 * @see #getBookType()
	 * @generated
	 */
	EAttribute getBookType_Pages();

	/**
	 * Returns the meta object for the containment reference '{@link library3.BookType#getBookInfo <em>Book Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Book Info</em>'.
	 * @see library3.BookType#getBookInfo()
	 * @see #getBookType()
	 * @generated
	 */
	EReference getBookType_BookInfo();

	/**
	 * Returns the meta object for the attribute '{@link library3.BookType#getIsbn <em>Isbn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Isbn</em>'.
	 * @see library3.BookType#getIsbn()
	 * @see #getBookType()
	 * @generated
	 */
	EAttribute getBookType_Isbn();

	/**
	 * Returns the meta object for class '{@link library3.CustomerType <em>Customer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer Type</em>'.
	 * @see library3.CustomerType
	 * @generated
	 */
	EClass getCustomerType();

	/**
	 * Returns the meta object for the attribute '{@link library3.CustomerType#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see library3.CustomerType#getFirstName()
	 * @see #getCustomerType()
	 * @generated
	 */
	EAttribute getCustomerType_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link library3.CustomerType#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see library3.CustomerType#getLastName()
	 * @see #getCustomerType()
	 * @generated
	 */
	EAttribute getCustomerType_LastName();

	/**
	 * Returns the meta object for the attribute '{@link library3.CustomerType#getBorrowedBookId <em>Borrowed Book Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Borrowed Book Id</em>'.
	 * @see library3.CustomerType#getBorrowedBookId()
	 * @see #getCustomerType()
	 * @generated
	 */
	EAttribute getCustomerType_BorrowedBookId();

	/**
	 * Returns the meta object for class '{@link library3.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see library3.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link library3.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see library3.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link library3.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see library3.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link library3.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see library3.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link library3.DocumentRoot#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Library</em>'.
	 * @see library3.DocumentRoot#getLibrary()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Library();

	/**
	 * Returns the meta object for class '{@link library3.LibraryType <em>Library Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library Type</em>'.
	 * @see library3.LibraryType
	 * @generated
	 */
	EClass getLibraryType();

	/**
	 * Returns the meta object for the containment reference list '{@link library3.LibraryType#getBook <em>Book</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Book</em>'.
	 * @see library3.LibraryType#getBook()
	 * @see #getLibraryType()
	 * @generated
	 */
	EReference getLibraryType_Book();

	/**
	 * Returns the meta object for the containment reference list '{@link library3.LibraryType#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Customer</em>'.
	 * @see library3.LibraryType#getCustomer()
	 * @see #getLibraryType()
	 * @generated
	 */
	EReference getLibraryType_Customer();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Desc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Desc Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='descType' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getDescType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Isbn Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Isbn Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='isbnType' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[0-9]{10}'"
	 * @generated
	 */
	EDataType getIsbnType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Name Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='nameType' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='32'"
	 * @generated
	 */
	EDataType getNameType();

	/**
	 * Returns the meta object for data type '<em>Pages Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Pages Type</em>'.
	 * @model instanceClass="int"
	 *        extendedMetaData="name='pagesType' baseType='http://www.eclipse.org/emf/2003/XMLType#int'"
	 * @generated
	 */
	EDataType getPagesType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Pages Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Pages Type Object</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 *        extendedMetaData="name='pagesType:Object' baseType='pagesType'"
	 * @generated
	 */
	EDataType getPagesTypeObject();

	/**
	 * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>Since Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Since Type</em>'.
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
	 *        extendedMetaData="name='sinceType' baseType='http://www.eclipse.org/emf/2003/XMLType#date'"
	 * @generated
	 */
	EDataType getSinceType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Library3Factory getLibrary3Factory();

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
		 * The meta object literal for the '{@link library3.impl.BookInfoTypeImpl <em>Book Info Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see library3.impl.BookInfoTypeImpl
		 * @see library3.impl.Library3PackageImpl#getBookInfoType()
		 * @generated
		 */
		EClass BOOK_INFO_TYPE = eINSTANCE.getBookInfoType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOK_INFO_TYPE__ANY = eINSTANCE.getBookInfoType_Any();

		/**
		 * The meta object literal for the '{@link library3.impl.BookTypeImpl <em>Book Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see library3.impl.BookTypeImpl
		 * @see library3.impl.Library3PackageImpl#getBookType()
		 * @generated
		 */
		EClass BOOK_TYPE = eINSTANCE.getBookType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOK_TYPE__NAME = eINSTANCE.getBookType_Name();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOK_TYPE__TITLE = eINSTANCE.getBookType_Title();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOK_TYPE__AUTHOR = eINSTANCE.getBookType_Author();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOK_TYPE__PAGES = eINSTANCE.getBookType_Pages();

		/**
		 * The meta object literal for the '<em><b>Book Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOK_TYPE__BOOK_INFO = eINSTANCE.getBookType_BookInfo();

		/**
		 * The meta object literal for the '<em><b>Isbn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOK_TYPE__ISBN = eINSTANCE.getBookType_Isbn();

		/**
		 * The meta object literal for the '{@link library3.impl.CustomerTypeImpl <em>Customer Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see library3.impl.CustomerTypeImpl
		 * @see library3.impl.Library3PackageImpl#getCustomerType()
		 * @generated
		 */
		EClass CUSTOMER_TYPE = eINSTANCE.getCustomerType();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_TYPE__FIRST_NAME = eINSTANCE.getCustomerType_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_TYPE__LAST_NAME = eINSTANCE.getCustomerType_LastName();

		/**
		 * The meta object literal for the '<em><b>Borrowed Book Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER_TYPE__BORROWED_BOOK_ID = eINSTANCE.getCustomerType_BorrowedBookId();

		/**
		 * The meta object literal for the '{@link library3.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see library3.impl.DocumentRootImpl
		 * @see library3.impl.Library3PackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Library</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LIBRARY = eINSTANCE.getDocumentRoot_Library();

		/**
		 * The meta object literal for the '{@link library3.impl.LibraryTypeImpl <em>Library Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see library3.impl.LibraryTypeImpl
		 * @see library3.impl.Library3PackageImpl#getLibraryType()
		 * @generated
		 */
		EClass LIBRARY_TYPE = eINSTANCE.getLibraryType();

		/**
		 * The meta object literal for the '<em><b>Book</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY_TYPE__BOOK = eINSTANCE.getLibraryType_Book();

		/**
		 * The meta object literal for the '<em><b>Customer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY_TYPE__CUSTOMER = eINSTANCE.getLibraryType_Customer();

		/**
		 * The meta object literal for the '<em>Desc Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see library3.impl.Library3PackageImpl#getDescType()
		 * @generated
		 */
		EDataType DESC_TYPE = eINSTANCE.getDescType();

		/**
		 * The meta object literal for the '<em>Isbn Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see library3.impl.Library3PackageImpl#getIsbnType()
		 * @generated
		 */
		EDataType ISBN_TYPE = eINSTANCE.getIsbnType();

		/**
		 * The meta object literal for the '<em>Name Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see library3.impl.Library3PackageImpl#getNameType()
		 * @generated
		 */
		EDataType NAME_TYPE = eINSTANCE.getNameType();

		/**
		 * The meta object literal for the '<em>Pages Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see library3.impl.Library3PackageImpl#getPagesType()
		 * @generated
		 */
		EDataType PAGES_TYPE = eINSTANCE.getPagesType();

		/**
		 * The meta object literal for the '<em>Pages Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see library3.impl.Library3PackageImpl#getPagesTypeObject()
		 * @generated
		 */
		EDataType PAGES_TYPE_OBJECT = eINSTANCE.getPagesTypeObject();

		/**
		 * The meta object literal for the '<em>Since Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.xml.datatype.XMLGregorianCalendar
		 * @see library3.impl.Library3PackageImpl#getSinceType()
		 * @generated
		 */
		EDataType SINCE_TYPE = eINSTANCE.getSinceType();

	}

} //Library3Package
