/**
 */
package simpleanySimplified;

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
 * @see simpleanySimplified.simpleanySimplifiedFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface simpleanySimplifiedPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "simpleanySimplified";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://platform:/plugin/simpleany.xsdsimplified";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Simpleanys";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	simpleanySimplifiedPackage eINSTANCE = simpleanySimplified.impl.simpleanySimplifiedPackageImpl.init();

	/**
	 * The meta object id for the '{@link simpleanySimplified.impl.BookImpl <em>Book</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleanySimplified.impl.BookImpl
	 * @see simpleanySimplified.impl.simpleanySimplifiedPackageImpl#getBook()
	 * @generated
	 */
	int BOOK = 0;

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
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Book</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Book</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link simpleanySimplified.impl.MixedBaseClassImpl <em>Mixed Base Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleanySimplified.impl.MixedBaseClassImpl
	 * @see simpleanySimplified.impl.simpleanySimplifiedPackageImpl#getMixedBaseClass()
	 * @generated
	 */
	int MIXED_BASE_CLASS = 6;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXED_BASE_CLASS__MIXED = 0;

	/**
	 * The number of structural features of the '<em>Mixed Base Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXED_BASE_CLASS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Mixed Base Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXED_BASE_CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link simpleanySimplified.impl.DescriptionImpl <em>Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleanySimplified.impl.DescriptionImpl
	 * @see simpleanySimplified.impl.simpleanySimplifiedPackageImpl#getDescription()
	 * @generated
	 */
	int DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__MIXED = MIXED_BASE_CLASS__MIXED;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__KEYWORDS = MIXED_BASE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__DESCRIPTIONS = MIXED_BASE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_FEATURE_COUNT = MIXED_BASE_CLASS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_OPERATION_COUNT = MIXED_BASE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simpleanySimplified.impl.LibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleanySimplified.impl.LibraryImpl
	 * @see simpleanySimplified.impl.simpleanySimplifiedPackageImpl#getLibrary()
	 * @generated
	 */
	int LIBRARY = 2;

	/**
	 * The feature id for the '<em><b>Books</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__BOOKS = 0;

	/**
	 * The number of structural features of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link simpleanySimplified.impl.MixedDataImpl <em>Mixed Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleanySimplified.impl.MixedDataImpl
	 * @see simpleanySimplified.impl.simpleanySimplifiedPackageImpl#getMixedData()
	 * @generated
	 */
	int MIXED_DATA = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXED_DATA__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Mixed Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXED_DATA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Mixed Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXED_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link simpleanySimplified.impl.MixedTextImpl <em>Mixed Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleanySimplified.impl.MixedTextImpl
	 * @see simpleanySimplified.impl.simpleanySimplifiedPackageImpl#getMixedText()
	 * @generated
	 */
	int MIXED_TEXT = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXED_TEXT__VALUE = MIXED_DATA__VALUE;

	/**
	 * The number of structural features of the '<em>Mixed Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXED_TEXT_FEATURE_COUNT = MIXED_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mixed Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXED_TEXT_OPERATION_COUNT = MIXED_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simpleanySimplified.impl.MixedFeatureImpl <em>Mixed Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleanySimplified.impl.MixedFeatureImpl
	 * @see simpleanySimplified.impl.simpleanySimplifiedPackageImpl#getMixedFeature()
	 * @generated
	 */
	int MIXED_FEATURE = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXED_FEATURE__VALUE = MIXED_DATA__VALUE;

	/**
	 * The number of structural features of the '<em>Mixed Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXED_FEATURE_FEATURE_COUNT = MIXED_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mixed Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXED_FEATURE_OPERATION_COUNT = MIXED_DATA_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link simpleanySimplified.Book <em>Book</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Book</em>'.
	 * @see simpleanySimplified.Book
	 * @generated
	 */
	EClass getBook();

	/**
	 * Returns the meta object for the attribute '{@link simpleanySimplified.Book#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see simpleanySimplified.Book#getName()
	 * @see #getBook()
	 * @generated
	 */
	EAttribute getBook_Name();

	/**
	 * Returns the meta object for the attribute '{@link simpleanySimplified.Book#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see simpleanySimplified.Book#getTitle()
	 * @see #getBook()
	 * @generated
	 */
	EAttribute getBook_Title();

	/**
	 * Returns the meta object for the attribute '{@link simpleanySimplified.Book#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see simpleanySimplified.Book#getAuthor()
	 * @see #getBook()
	 * @generated
	 */
	EAttribute getBook_Author();

	/**
	 * Returns the meta object for the containment reference '{@link simpleanySimplified.Book#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see simpleanySimplified.Book#getDescription()
	 * @see #getBook()
	 * @generated
	 */
	EReference getBook_Description();

	/**
	 * Returns the meta object for class '{@link simpleanySimplified.Description <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description</em>'.
	 * @see simpleanySimplified.Description
	 * @generated
	 */
	EClass getDescription();

	/**
	 * Returns the meta object for the attribute list '{@link simpleanySimplified.Description#getKeywords <em>Keywords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Keywords</em>'.
	 * @see simpleanySimplified.Description#getKeywords()
	 * @see #getDescription()
	 * @generated
	 */
	EAttribute getDescription_Keywords();

	/**
	 * Returns the meta object for the containment reference list '{@link simpleanySimplified.Description#getDescriptions <em>Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptions</em>'.
	 * @see simpleanySimplified.Description#getDescriptions()
	 * @see #getDescription()
	 * @generated
	 */
	EReference getDescription_Descriptions();

	/**
	 * Returns the meta object for class '{@link simpleanySimplified.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library</em>'.
	 * @see simpleanySimplified.Library
	 * @generated
	 */
	EClass getLibrary();

	/**
	 * Returns the meta object for the containment reference list '{@link simpleanySimplified.Library#getBooks <em>Books</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Books</em>'.
	 * @see simpleanySimplified.Library#getBooks()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_Books();

	/**
	 * Returns the meta object for class '{@link simpleanySimplified.MixedData <em>Mixed Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mixed Data</em>'.
	 * @see simpleanySimplified.MixedData
	 * @generated
	 */
	EClass getMixedData();

	/**
	 * Returns the meta object for the attribute '{@link simpleanySimplified.MixedData#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see simpleanySimplified.MixedData#getValue()
	 * @see #getMixedData()
	 * @generated
	 */
	EAttribute getMixedData_Value();

	/**
	 * Returns the meta object for class '{@link simpleanySimplified.MixedText <em>Mixed Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mixed Text</em>'.
	 * @see simpleanySimplified.MixedText
	 * @generated
	 */
	EClass getMixedText();

	/**
	 * Returns the meta object for class '{@link simpleanySimplified.MixedFeature <em>Mixed Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mixed Feature</em>'.
	 * @see simpleanySimplified.MixedFeature
	 * @generated
	 */
	EClass getMixedFeature();

	/**
	 * Returns the meta object for class '{@link simpleanySimplified.MixedBaseClass <em>Mixed Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mixed Base Class</em>'.
	 * @see simpleanySimplified.MixedBaseClass
	 * @generated
	 */
	EClass getMixedBaseClass();

	/**
	 * Returns the meta object for the containment reference list '{@link simpleanySimplified.MixedBaseClass#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mixed</em>'.
	 * @see simpleanySimplified.MixedBaseClass#getMixed()
	 * @see #getMixedBaseClass()
	 * @generated
	 */
	EReference getMixedBaseClass_Mixed();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	simpleanySimplifiedFactory getsimpleanySimplifiedFactory();

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
		 * The meta object literal for the '{@link simpleanySimplified.impl.BookImpl <em>Book</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleanySimplified.impl.BookImpl
		 * @see simpleanySimplified.impl.simpleanySimplifiedPackageImpl#getBook()
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
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOK__DESCRIPTION = eINSTANCE.getBook_Description();

		/**
		 * The meta object literal for the '{@link simpleanySimplified.impl.DescriptionImpl <em>Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleanySimplified.impl.DescriptionImpl
		 * @see simpleanySimplified.impl.simpleanySimplifiedPackageImpl#getDescription()
		 * @generated
		 */
		EClass DESCRIPTION = eINSTANCE.getDescription();

		/**
		 * The meta object literal for the '<em><b>Keywords</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION__KEYWORDS = eINSTANCE.getDescription_Keywords();

		/**
		 * The meta object literal for the '<em><b>Descriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCRIPTION__DESCRIPTIONS = eINSTANCE.getDescription_Descriptions();

		/**
		 * The meta object literal for the '{@link simpleanySimplified.impl.LibraryImpl <em>Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleanySimplified.impl.LibraryImpl
		 * @see simpleanySimplified.impl.simpleanySimplifiedPackageImpl#getLibrary()
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
		 * The meta object literal for the '{@link simpleanySimplified.impl.MixedDataImpl <em>Mixed Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleanySimplified.impl.MixedDataImpl
		 * @see simpleanySimplified.impl.simpleanySimplifiedPackageImpl#getMixedData()
		 * @generated
		 */
		EClass MIXED_DATA = eINSTANCE.getMixedData();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIXED_DATA__VALUE = eINSTANCE.getMixedData_Value();

		/**
		 * The meta object literal for the '{@link simpleanySimplified.impl.MixedTextImpl <em>Mixed Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleanySimplified.impl.MixedTextImpl
		 * @see simpleanySimplified.impl.simpleanySimplifiedPackageImpl#getMixedText()
		 * @generated
		 */
		EClass MIXED_TEXT = eINSTANCE.getMixedText();

		/**
		 * The meta object literal for the '{@link simpleanySimplified.impl.MixedFeatureImpl <em>Mixed Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleanySimplified.impl.MixedFeatureImpl
		 * @see simpleanySimplified.impl.simpleanySimplifiedPackageImpl#getMixedFeature()
		 * @generated
		 */
		EClass MIXED_FEATURE = eINSTANCE.getMixedFeature();

		/**
		 * The meta object literal for the '{@link simpleanySimplified.impl.MixedBaseClassImpl <em>Mixed Base Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleanySimplified.impl.MixedBaseClassImpl
		 * @see simpleanySimplified.impl.simpleanySimplifiedPackageImpl#getMixedBaseClass()
		 * @generated
		 */
		EClass MIXED_BASE_CLASS = eINSTANCE.getMixedBaseClass();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIXED_BASE_CLASS__MIXED = eINSTANCE.getMixedBaseClass_Mixed();

	}

} //simpleanySimplifiedPackage
