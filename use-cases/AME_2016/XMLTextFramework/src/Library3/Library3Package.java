/**
 */
package Library3;

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
 * @see Library3.Library3Factory
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
	String eNAME = "Library3";

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
	Library3Package eINSTANCE = Library3.impl.Library3PackageImpl.init();

	/**
	 * The meta object id for the '{@link Library3.impl.BookInfoTypeImpl <em>Book Info Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Library3.impl.BookInfoTypeImpl
	 * @see Library3.impl.Library3PackageImpl#getBookInfoType()
	 * @generated
	 */
	int BOOK_INFO_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' containment reference list.
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
	 * The meta object id for the '{@link Library3.impl.BookTypeImpl <em>Book Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Library3.impl.BookTypeImpl
	 * @see Library3.impl.Library3PackageImpl#getBookType()
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
	 * The meta object id for the '{@link Library3.impl.CustomerTypeImpl <em>Customer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Library3.impl.CustomerTypeImpl
	 * @see Library3.impl.Library3PackageImpl#getCustomerType()
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
	 * The feature id for the '<em><b>Borrowed Book Id</b></em>' reference.
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
	 * The meta object id for the '{@link Library3.impl.LibraryTypeImpl <em>Library Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Library3.impl.LibraryTypeImpl
	 * @see Library3.impl.Library3PackageImpl#getLibraryType()
	 * @generated
	 */
	int LIBRARY_TYPE = 3;

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
	 * The meta object id for the '{@link Library3.impl.AnyGenericConstructImpl <em>Any Generic Construct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Library3.impl.AnyGenericConstructImpl
	 * @see Library3.impl.Library3PackageImpl#getAnyGenericConstruct()
	 * @generated
	 */
	int ANY_GENERIC_CONSTRUCT = 4;

	/**
	 * The number of structural features of the '<em>Any Generic Construct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_GENERIC_CONSTRUCT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Any Generic Construct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_GENERIC_CONSTRUCT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Library3.impl.AnyGenericElementImpl <em>Any Generic Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Library3.impl.AnyGenericElementImpl
	 * @see Library3.impl.Library3PackageImpl#getAnyGenericElement()
	 * @generated
	 */
	int ANY_GENERIC_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Elem Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_GENERIC_ELEMENT__ELEM_NAME = ANY_GENERIC_CONSTRUCT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Any Generic Attr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_GENERIC_ELEMENT__ANY_GENERIC_ATTR = ANY_GENERIC_CONSTRUCT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Elem Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_GENERIC_ELEMENT__ELEM_VALUE = ANY_GENERIC_CONSTRUCT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Any Generic Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_GENERIC_ELEMENT__ANY_GENERIC_ELEMENT = ANY_GENERIC_CONSTRUCT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Any Generic Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_GENERIC_ELEMENT_FEATURE_COUNT = ANY_GENERIC_CONSTRUCT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Any Generic Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_GENERIC_ELEMENT_OPERATION_COUNT = ANY_GENERIC_CONSTRUCT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Library3.impl.AnyGenericAttributeImpl <em>Any Generic Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Library3.impl.AnyGenericAttributeImpl
	 * @see Library3.impl.Library3PackageImpl#getAnyGenericAttribute()
	 * @generated
	 */
	int ANY_GENERIC_ATTRIBUTE = 6;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_GENERIC_ATTRIBUTE__ATTR_NAME = 0;

	/**
	 * The feature id for the '<em><b>Attr Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_GENERIC_ATTRIBUTE__ATTR_VALUE = 1;

	/**
	 * The number of structural features of the '<em>Any Generic Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_GENERIC_ATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Any Generic Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_GENERIC_ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Library3.impl.AnyGenericTextImpl <em>Any Generic Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Library3.impl.AnyGenericTextImpl
	 * @see Library3.impl.Library3PackageImpl#getAnyGenericText()
	 * @generated
	 */
	int ANY_GENERIC_TEXT = 7;

	/**
	 * The feature id for the '<em><b>Text Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_GENERIC_TEXT__TEXT_VALUE = ANY_GENERIC_CONSTRUCT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Any Generic Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_GENERIC_TEXT_FEATURE_COUNT = ANY_GENERIC_CONSTRUCT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Any Generic Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_GENERIC_TEXT_OPERATION_COUNT = ANY_GENERIC_CONSTRUCT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>Desc Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see Library3.impl.Library3PackageImpl#getDescType()
	 * @generated
	 */
	int DESC_TYPE = 8;

	/**
	 * The meta object id for the '<em>Isbn Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see Library3.impl.Library3PackageImpl#getIsbnType()
	 * @generated
	 */
	int ISBN_TYPE = 9;

	/**
	 * The meta object id for the '<em>Name Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see Library3.impl.Library3PackageImpl#getNameType()
	 * @generated
	 */
	int NAME_TYPE = 10;

	/**
	 * The meta object id for the '<em>Pages Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Library3.impl.Library3PackageImpl#getPagesType()
	 * @generated
	 */
	int PAGES_TYPE = 11;

	/**
	 * The meta object id for the '<em>Pages Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see Library3.impl.Library3PackageImpl#getPagesTypeObject()
	 * @generated
	 */
	int PAGES_TYPE_OBJECT = 12;

	/**
	 * The meta object id for the '<em>Since Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see Library3.impl.Library3PackageImpl#getSinceType()
	 * @generated
	 */
	int SINCE_TYPE = 13;


	/**
	 * Returns the meta object for class '{@link Library3.BookInfoType <em>Book Info Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Book Info Type</em>'.
	 * @see Library3.BookInfoType
	 * @generated
	 */
	EClass getBookInfoType();

	/**
	 * Returns the meta object for the containment reference list '{@link Library3.BookInfoType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Any</em>'.
	 * @see Library3.BookInfoType#getAny()
	 * @see #getBookInfoType()
	 * @generated
	 */
	EReference getBookInfoType_Any();

	/**
	 * Returns the meta object for class '{@link Library3.BookType <em>Book Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Book Type</em>'.
	 * @see Library3.BookType
	 * @generated
	 */
	EClass getBookType();

	/**
	 * Returns the meta object for the attribute '{@link Library3.BookType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Library3.BookType#getName()
	 * @see #getBookType()
	 * @generated
	 */
	EAttribute getBookType_Name();

	/**
	 * Returns the meta object for the attribute '{@link Library3.BookType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see Library3.BookType#getTitle()
	 * @see #getBookType()
	 * @generated
	 */
	EAttribute getBookType_Title();

	/**
	 * Returns the meta object for the attribute '{@link Library3.BookType#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see Library3.BookType#getAuthor()
	 * @see #getBookType()
	 * @generated
	 */
	EAttribute getBookType_Author();

	/**
	 * Returns the meta object for the attribute '{@link Library3.BookType#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pages</em>'.
	 * @see Library3.BookType#getPages()
	 * @see #getBookType()
	 * @generated
	 */
	EAttribute getBookType_Pages();

	/**
	 * Returns the meta object for the containment reference '{@link Library3.BookType#getBookInfo <em>Book Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Book Info</em>'.
	 * @see Library3.BookType#getBookInfo()
	 * @see #getBookType()
	 * @generated
	 */
	EReference getBookType_BookInfo();

	/**
	 * Returns the meta object for the attribute '{@link Library3.BookType#getIsbn <em>Isbn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Isbn</em>'.
	 * @see Library3.BookType#getIsbn()
	 * @see #getBookType()
	 * @generated
	 */
	EAttribute getBookType_Isbn();

	/**
	 * Returns the meta object for class '{@link Library3.CustomerType <em>Customer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer Type</em>'.
	 * @see Library3.CustomerType
	 * @generated
	 */
	EClass getCustomerType();

	/**
	 * Returns the meta object for the attribute '{@link Library3.CustomerType#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see Library3.CustomerType#getFirstName()
	 * @see #getCustomerType()
	 * @generated
	 */
	EAttribute getCustomerType_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link Library3.CustomerType#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see Library3.CustomerType#getLastName()
	 * @see #getCustomerType()
	 * @generated
	 */
	EAttribute getCustomerType_LastName();

	/**
	 * Returns the meta object for the reference '{@link Library3.CustomerType#getBorrowedBookId <em>Borrowed Book Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Borrowed Book Id</em>'.
	 * @see Library3.CustomerType#getBorrowedBookId()
	 * @see #getCustomerType()
	 * @generated
	 */
	EReference getCustomerType_BorrowedBookId();

	/**
	 * Returns the meta object for class '{@link Library3.LibraryType <em>Library Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library Type</em>'.
	 * @see Library3.LibraryType
	 * @generated
	 */
	EClass getLibraryType();

	/**
	 * Returns the meta object for the containment reference list '{@link Library3.LibraryType#getBook <em>Book</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Book</em>'.
	 * @see Library3.LibraryType#getBook()
	 * @see #getLibraryType()
	 * @generated
	 */
	EReference getLibraryType_Book();

	/**
	 * Returns the meta object for the containment reference list '{@link Library3.LibraryType#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Customer</em>'.
	 * @see Library3.LibraryType#getCustomer()
	 * @see #getLibraryType()
	 * @generated
	 */
	EReference getLibraryType_Customer();

	/**
	 * Returns the meta object for class '{@link Library3.AnyGenericConstruct <em>Any Generic Construct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any Generic Construct</em>'.
	 * @see Library3.AnyGenericConstruct
	 * @generated
	 */
	EClass getAnyGenericConstruct();

	/**
	 * Returns the meta object for class '{@link Library3.AnyGenericElement <em>Any Generic Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any Generic Element</em>'.
	 * @see Library3.AnyGenericElement
	 * @generated
	 */
	EClass getAnyGenericElement();

	/**
	 * Returns the meta object for the attribute '{@link Library3.AnyGenericElement#getElemName <em>Elem Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elem Name</em>'.
	 * @see Library3.AnyGenericElement#getElemName()
	 * @see #getAnyGenericElement()
	 * @generated
	 */
	EAttribute getAnyGenericElement_ElemName();

	/**
	 * Returns the meta object for the containment reference list '{@link Library3.AnyGenericElement#getAnyGenericAttr <em>Any Generic Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Any Generic Attr</em>'.
	 * @see Library3.AnyGenericElement#getAnyGenericAttr()
	 * @see #getAnyGenericElement()
	 * @generated
	 */
	EReference getAnyGenericElement_AnyGenericAttr();

	/**
	 * Returns the meta object for the attribute '{@link Library3.AnyGenericElement#getElemValue <em>Elem Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elem Value</em>'.
	 * @see Library3.AnyGenericElement#getElemValue()
	 * @see #getAnyGenericElement()
	 * @generated
	 */
	EAttribute getAnyGenericElement_ElemValue();

	/**
	 * Returns the meta object for the containment reference list '{@link Library3.AnyGenericElement#getAnyGenericElement <em>Any Generic Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Any Generic Element</em>'.
	 * @see Library3.AnyGenericElement#getAnyGenericElement()
	 * @see #getAnyGenericElement()
	 * @generated
	 */
	EReference getAnyGenericElement_AnyGenericElement();

	/**
	 * Returns the meta object for class '{@link Library3.AnyGenericAttribute <em>Any Generic Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any Generic Attribute</em>'.
	 * @see Library3.AnyGenericAttribute
	 * @generated
	 */
	EClass getAnyGenericAttribute();

	/**
	 * Returns the meta object for the attribute '{@link Library3.AnyGenericAttribute#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see Library3.AnyGenericAttribute#getAttrName()
	 * @see #getAnyGenericAttribute()
	 * @generated
	 */
	EAttribute getAnyGenericAttribute_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link Library3.AnyGenericAttribute#getAttrValue <em>Attr Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Value</em>'.
	 * @see Library3.AnyGenericAttribute#getAttrValue()
	 * @see #getAnyGenericAttribute()
	 * @generated
	 */
	EAttribute getAnyGenericAttribute_AttrValue();

	/**
	 * Returns the meta object for class '{@link Library3.AnyGenericText <em>Any Generic Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any Generic Text</em>'.
	 * @see Library3.AnyGenericText
	 * @generated
	 */
	EClass getAnyGenericText();

	/**
	 * Returns the meta object for the attribute '{@link Library3.AnyGenericText#getTextValue <em>Text Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Value</em>'.
	 * @see Library3.AnyGenericText#getTextValue()
	 * @see #getAnyGenericText()
	 * @generated
	 */
	EAttribute getAnyGenericText_TextValue();

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
	 *        extendedMetaData="name='isbnType' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='10' maxLength='13'"
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
		 * The meta object literal for the '{@link Library3.impl.BookInfoTypeImpl <em>Book Info Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Library3.impl.BookInfoTypeImpl
		 * @see Library3.impl.Library3PackageImpl#getBookInfoType()
		 * @generated
		 */
		EClass BOOK_INFO_TYPE = eINSTANCE.getBookInfoType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOK_INFO_TYPE__ANY = eINSTANCE.getBookInfoType_Any();

		/**
		 * The meta object literal for the '{@link Library3.impl.BookTypeImpl <em>Book Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Library3.impl.BookTypeImpl
		 * @see Library3.impl.Library3PackageImpl#getBookType()
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
		 * The meta object literal for the '{@link Library3.impl.CustomerTypeImpl <em>Customer Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Library3.impl.CustomerTypeImpl
		 * @see Library3.impl.Library3PackageImpl#getCustomerType()
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
		 * The meta object literal for the '<em><b>Borrowed Book Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER_TYPE__BORROWED_BOOK_ID = eINSTANCE.getCustomerType_BorrowedBookId();

		/**
		 * The meta object literal for the '{@link Library3.impl.LibraryTypeImpl <em>Library Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Library3.impl.LibraryTypeImpl
		 * @see Library3.impl.Library3PackageImpl#getLibraryType()
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
		 * The meta object literal for the '{@link Library3.impl.AnyGenericConstructImpl <em>Any Generic Construct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Library3.impl.AnyGenericConstructImpl
		 * @see Library3.impl.Library3PackageImpl#getAnyGenericConstruct()
		 * @generated
		 */
		EClass ANY_GENERIC_CONSTRUCT = eINSTANCE.getAnyGenericConstruct();

		/**
		 * The meta object literal for the '{@link Library3.impl.AnyGenericElementImpl <em>Any Generic Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Library3.impl.AnyGenericElementImpl
		 * @see Library3.impl.Library3PackageImpl#getAnyGenericElement()
		 * @generated
		 */
		EClass ANY_GENERIC_ELEMENT = eINSTANCE.getAnyGenericElement();

		/**
		 * The meta object literal for the '<em><b>Elem Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANY_GENERIC_ELEMENT__ELEM_NAME = eINSTANCE.getAnyGenericElement_ElemName();

		/**
		 * The meta object literal for the '<em><b>Any Generic Attr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANY_GENERIC_ELEMENT__ANY_GENERIC_ATTR = eINSTANCE.getAnyGenericElement_AnyGenericAttr();

		/**
		 * The meta object literal for the '<em><b>Elem Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANY_GENERIC_ELEMENT__ELEM_VALUE = eINSTANCE.getAnyGenericElement_ElemValue();

		/**
		 * The meta object literal for the '<em><b>Any Generic Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANY_GENERIC_ELEMENT__ANY_GENERIC_ELEMENT = eINSTANCE.getAnyGenericElement_AnyGenericElement();

		/**
		 * The meta object literal for the '{@link Library3.impl.AnyGenericAttributeImpl <em>Any Generic Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Library3.impl.AnyGenericAttributeImpl
		 * @see Library3.impl.Library3PackageImpl#getAnyGenericAttribute()
		 * @generated
		 */
		EClass ANY_GENERIC_ATTRIBUTE = eINSTANCE.getAnyGenericAttribute();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANY_GENERIC_ATTRIBUTE__ATTR_NAME = eINSTANCE.getAnyGenericAttribute_AttrName();

		/**
		 * The meta object literal for the '<em><b>Attr Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANY_GENERIC_ATTRIBUTE__ATTR_VALUE = eINSTANCE.getAnyGenericAttribute_AttrValue();

		/**
		 * The meta object literal for the '{@link Library3.impl.AnyGenericTextImpl <em>Any Generic Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Library3.impl.AnyGenericTextImpl
		 * @see Library3.impl.Library3PackageImpl#getAnyGenericText()
		 * @generated
		 */
		EClass ANY_GENERIC_TEXT = eINSTANCE.getAnyGenericText();

		/**
		 * The meta object literal for the '<em><b>Text Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANY_GENERIC_TEXT__TEXT_VALUE = eINSTANCE.getAnyGenericText_TextValue();

		/**
		 * The meta object literal for the '<em>Desc Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see Library3.impl.Library3PackageImpl#getDescType()
		 * @generated
		 */
		EDataType DESC_TYPE = eINSTANCE.getDescType();

		/**
		 * The meta object literal for the '<em>Isbn Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see Library3.impl.Library3PackageImpl#getIsbnType()
		 * @generated
		 */
		EDataType ISBN_TYPE = eINSTANCE.getIsbnType();

		/**
		 * The meta object literal for the '<em>Name Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see Library3.impl.Library3PackageImpl#getNameType()
		 * @generated
		 */
		EDataType NAME_TYPE = eINSTANCE.getNameType();

		/**
		 * The meta object literal for the '<em>Pages Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Library3.impl.Library3PackageImpl#getPagesType()
		 * @generated
		 */
		EDataType PAGES_TYPE = eINSTANCE.getPagesType();

		/**
		 * The meta object literal for the '<em>Pages Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see Library3.impl.Library3PackageImpl#getPagesTypeObject()
		 * @generated
		 */
		EDataType PAGES_TYPE_OBJECT = eINSTANCE.getPagesTypeObject();

		/**
		 * The meta object literal for the '<em>Since Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.xml.datatype.XMLGregorianCalendar
		 * @see Library3.impl.Library3PackageImpl#getSinceType()
		 * @generated
		 */
		EDataType SINCE_TYPE = eINSTANCE.getSinceType();

	}

} //Library3Package
