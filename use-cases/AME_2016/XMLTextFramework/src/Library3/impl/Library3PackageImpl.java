/**
 */
package Library3.impl;

import Library3.AnyGenericAttribute;
import Library3.AnyGenericConstruct;
import Library3.AnyGenericElement;
import Library3.AnyGenericText;
import Library3.BookInfoType;
import Library3.BookType;
import Library3.CustomerType;
import Library3.Library3Factory;
import Library3.Library3Package;
import Library3.LibraryType;

import Library3.util.Library3Validator;

import javax.xml.datatype.XMLGregorianCalendar;

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
	private EClass libraryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anyGenericConstructEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anyGenericElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anyGenericAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anyGenericTextEClass = null;

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
	 * @see Library3.Library3Package#eNS_URI
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
	public EReference getBookInfoType_Any() {
		return (EReference)bookInfoTypeEClass.getEStructuralFeatures().get(0);
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
	public EReference getCustomerType_BorrowedBookId() {
		return (EReference)customerTypeEClass.getEStructuralFeatures().get(2);
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
	public EClass getAnyGenericConstruct() {
		return anyGenericConstructEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnyGenericElement() {
		return anyGenericElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnyGenericElement_ElemName() {
		return (EAttribute)anyGenericElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnyGenericElement_AnyGenericAttr() {
		return (EReference)anyGenericElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnyGenericElement_ElemValue() {
		return (EAttribute)anyGenericElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnyGenericElement_AnyGenericElement() {
		return (EReference)anyGenericElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnyGenericAttribute() {
		return anyGenericAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnyGenericAttribute_AttrName() {
		return (EAttribute)anyGenericAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnyGenericAttribute_AttrValue() {
		return (EAttribute)anyGenericAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnyGenericText() {
		return anyGenericTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnyGenericText_TextValue() {
		return (EAttribute)anyGenericTextEClass.getEStructuralFeatures().get(0);
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
		createEReference(bookInfoTypeEClass, BOOK_INFO_TYPE__ANY);

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
		createEReference(customerTypeEClass, CUSTOMER_TYPE__BORROWED_BOOK_ID);

		libraryTypeEClass = createEClass(LIBRARY_TYPE);
		createEReference(libraryTypeEClass, LIBRARY_TYPE__BOOK);
		createEReference(libraryTypeEClass, LIBRARY_TYPE__CUSTOMER);

		anyGenericConstructEClass = createEClass(ANY_GENERIC_CONSTRUCT);

		anyGenericElementEClass = createEClass(ANY_GENERIC_ELEMENT);
		createEAttribute(anyGenericElementEClass, ANY_GENERIC_ELEMENT__ELEM_NAME);
		createEReference(anyGenericElementEClass, ANY_GENERIC_ELEMENT__ANY_GENERIC_ATTR);
		createEAttribute(anyGenericElementEClass, ANY_GENERIC_ELEMENT__ELEM_VALUE);
		createEReference(anyGenericElementEClass, ANY_GENERIC_ELEMENT__ANY_GENERIC_ELEMENT);

		anyGenericAttributeEClass = createEClass(ANY_GENERIC_ATTRIBUTE);
		createEAttribute(anyGenericAttributeEClass, ANY_GENERIC_ATTRIBUTE__ATTR_NAME);
		createEAttribute(anyGenericAttributeEClass, ANY_GENERIC_ATTRIBUTE__ATTR_VALUE);

		anyGenericTextEClass = createEClass(ANY_GENERIC_TEXT);
		createEAttribute(anyGenericTextEClass, ANY_GENERIC_TEXT__TEXT_VALUE);

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
		anyGenericElementEClass.getESuperTypes().add(this.getAnyGenericConstruct());
		anyGenericTextEClass.getESuperTypes().add(this.getAnyGenericConstruct());

		// Initialize classes, features, and operations; add parameters
		initEClass(bookInfoTypeEClass, BookInfoType.class, "BookInfoType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBookInfoType_Any(), this.getAnyGenericElement(), null, "any", null, 1, -1, BookInfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEReference(getCustomerType_BorrowedBookId(), ecorePackage.getEObject(), null, "borrowedBookId", null, 0, 1, CustomerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(libraryTypeEClass, LibraryType.class, "LibraryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLibraryType_Book(), this.getBookType(), null, "book", null, 0, -1, LibraryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLibraryType_Customer(), this.getCustomerType(), null, "customer", null, 0, -1, LibraryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anyGenericConstructEClass, AnyGenericConstruct.class, "AnyGenericConstruct", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(anyGenericElementEClass, AnyGenericElement.class, "AnyGenericElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnyGenericElement_ElemName(), theXMLTypePackage.getString(), "elemName", null, 0, 1, AnyGenericElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnyGenericElement_AnyGenericAttr(), this.getAnyGenericAttribute(), null, "anyGenericAttr", null, 0, -1, AnyGenericElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnyGenericElement_ElemValue(), theXMLTypePackage.getString(), "elemValue", null, 0, 1, AnyGenericElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnyGenericElement_AnyGenericElement(), this.getAnyGenericElement(), null, "anyGenericElement", null, 0, -1, AnyGenericElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anyGenericAttributeEClass, AnyGenericAttribute.class, "AnyGenericAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnyGenericAttribute_AttrName(), theXMLTypePackage.getString(), "attrName", null, 1, 1, AnyGenericAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnyGenericAttribute_AttrValue(), theXMLTypePackage.getString(), "attrValue", null, 1, 1, AnyGenericAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anyGenericTextEClass, AnyGenericText.class, "AnyGenericText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnyGenericText_TextValue(), theXMLTypePackage.getString(), "textValue", null, 0, 1, AnyGenericText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
			 "kind", "mixed"
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
		  (descTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "descType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });	
		addAnnotation
		  (isbnTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "isbnType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "minLength", "10",
			 "maxLength", "13"
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
