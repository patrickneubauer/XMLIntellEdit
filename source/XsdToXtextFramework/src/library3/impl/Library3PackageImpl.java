/**
 */
package library3.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import library3.BookInfoType;
import library3.BookType;
import library3.CustomerType;
import library3.DocumentRoot;
import library3.Library3Factory;
import library3.Library3Package;
import library3.LibraryType;

import library3.util.Library3Validator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Library3PackageImpl extends EPackageImpl implements Library3Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookInfoTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libraryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType descTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType isbnTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nameTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pagesTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pagesTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sinceTypeEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see library3.Library3Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Library3PackageImpl() {
		super(eNS_URI, Library3Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Library3Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Library3Package init() {
		if (isInited) return (Library3Package)EPackage.Registry.INSTANCE.getEPackage(Library3Package.eNS_URI);

		// Obtain or create and register package
		Library3PackageImpl theLibrary3Package = (Library3PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Library3PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Library3PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theLibrary3Package.createPackageContents();

		// Initialize created meta-data
		theLibrary3Package.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theLibrary3Package, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return Library3Validator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theLibrary3Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Library3Package.eNS_URI, theLibrary3Package);
		return theLibrary3Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBookInfoType() {
		return bookInfoTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookInfoType_Any() {
		return (EAttribute)bookInfoTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBookType() {
		return bookTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookType_Name() {
		return (EAttribute)bookTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookType_Title() {
		return (EAttribute)bookTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookType_Author() {
		return (EAttribute)bookTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookType_Pages() {
		return (EAttribute)bookTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookType_BookInfo() {
		return (EReference)bookTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookType_Isbn() {
		return (EAttribute)bookTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomerType() {
		return customerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomerType_FirstName() {
		return (EAttribute)customerTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomerType_LastName() {
		return (EAttribute)customerTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomerType_BorrowedBookId() {
		return (EAttribute)customerTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Library() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibraryType() {
		return libraryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryType_Book() {
		return (EReference)libraryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryType_Customer() {
		return (EReference)libraryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDescType() {
		return descTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIsbnType() {
		return isbnTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNameType() {
		return nameTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPagesType() {
		return pagesTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPagesTypeObject() {
		return pagesTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSinceType() {
		return sinceTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Library3Factory getLibrary3Factory() {
		return (Library3Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		bookInfoTypeEClass = createEClass(BOOK_INFO_TYPE);
		createEAttribute(bookInfoTypeEClass, BOOK_INFO_TYPE__ANY);

		bookTypeEClass = createEClass(BOOK_TYPE);
		createEAttribute(bookTypeEClass, BOOK_TYPE__NAME);
		createEAttribute(bookTypeEClass, BOOK_TYPE__TITLE);
		createEAttribute(bookTypeEClass, BOOK_TYPE__AUTHOR);
		createEAttribute(bookTypeEClass, BOOK_TYPE__PAGES);
		createEReference(bookTypeEClass, BOOK_TYPE__BOOK_INFO);
		createEAttribute(bookTypeEClass, BOOK_TYPE__ISBN);

		customerTypeEClass = createEClass(CUSTOMER_TYPE);
		createEAttribute(customerTypeEClass, CUSTOMER_TYPE__FIRST_NAME);
		createEAttribute(customerTypeEClass, CUSTOMER_TYPE__LAST_NAME);
		createEAttribute(customerTypeEClass, CUSTOMER_TYPE__BORROWED_BOOK_ID);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LIBRARY);

		libraryTypeEClass = createEClass(LIBRARY_TYPE);
		createEReference(libraryTypeEClass, LIBRARY_TYPE__BOOK);
		createEReference(libraryTypeEClass, LIBRARY_TYPE__CUSTOMER);

		// Create data types
		descTypeEDataType = createEDataType(DESC_TYPE);
		isbnTypeEDataType = createEDataType(ISBN_TYPE);
		nameTypeEDataType = createEDataType(NAME_TYPE);
		pagesTypeEDataType = createEDataType(PAGES_TYPE);
		pagesTypeObjectEDataType = createEDataType(PAGES_TYPE_OBJECT);
		sinceTypeEDataType = createEDataType(SINCE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(bookInfoTypeEClass, BookInfoType.class, "BookInfoType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBookInfoType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 1, -1, BookInfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bookTypeEClass, BookType.class, "BookType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBookType_Name(), theXMLTypePackage.getID(), "name", null, 1, 1, BookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBookType_Title(), theXMLTypePackage.getString(), "title", null, 1, 1, BookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBookType_Author(), this.getNameType(), "author", null, 1, 1, BookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBookType_Pages(), theXMLTypePackage.getInt(), "pages", null, 1, 1, BookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBookType_BookInfo(), this.getBookInfoType(), null, "bookInfo", null, 0, 1, BookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBookType_Isbn(), this.getIsbnType(), "isbn", null, 1, 1, BookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customerTypeEClass, CustomerType.class, "CustomerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomerType_FirstName(), theXMLTypePackage.getString(), "firstName", null, 1, 1, CustomerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerType_LastName(), theXMLTypePackage.getString(), "lastName", null, 1, 1, CustomerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomerType_BorrowedBookId(), theXMLTypePackage.getIDREF(), "borrowedBookId", null, 1, 1, CustomerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Library(), this.getLibraryType(), null, "library", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(libraryTypeEClass, LibraryType.class, "LibraryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLibraryType_Book(), this.getBookType(), null, "book", null, 0, -1, LibraryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLibraryType_Customer(), this.getCustomerType(), null, "customer", null, 0, -1, LibraryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(descTypeEDataType, String.class, "DescType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(isbnTypeEDataType, String.class, "IsbnType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(nameTypeEDataType, String.class, "NameType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(pagesTypeEDataType, int.class, "PagesType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(pagesTypeObjectEDataType, Integer.class, "PagesTypeObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(sinceTypeEDataType, XMLGregorianCalendar.class, "SinceType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "qualified", "false"
		   });	
		addAnnotation
		  (bookInfoTypeEClass, 
		   source, 
		   new String[] {
			 "name", "bookInfoType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getBookInfoType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##any",
			 "name", ":0",
			 "processing", "lax"
		   });	
		addAnnotation
		  (bookTypeEClass, 
		   source, 
		   new String[] {
			 "name", "bookType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getBookType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getBookType_Title(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "title",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getBookType_Author(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "author",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getBookType_Pages(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "pages",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getBookType_BookInfo(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "bookInfo",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getBookType_Isbn(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "isbn",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (customerTypeEClass, 
		   source, 
		   new String[] {
			 "name", "customerType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getCustomerType_FirstName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "firstName",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCustomerType_LastName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lastName",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCustomerType_BorrowedBookId(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "borrowedBookId",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (descTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "descType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });	
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });	
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });	
		addAnnotation
		  (getDocumentRoot_Library(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "library",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (isbnTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "isbnType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "pattern", "[0-9]{10}"
		   });	
		addAnnotation
		  (libraryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "libraryType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getLibraryType_Book(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "book",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getLibraryType_Customer(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "customer",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (nameTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "nameType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "maxLength", "32"
		   });	
		addAnnotation
		  (pagesTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "pagesType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#int"
		   });	
		addAnnotation
		  (pagesTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "pagesType:Object",
			 "baseType", "pagesType"
		   });	
		addAnnotation
		  (sinceTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "sinceType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#date"
		   });
	}

} //Library3PackageImpl
