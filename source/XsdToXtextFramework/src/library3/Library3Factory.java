/**
 */
package library3;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see library3.Library3Package
 * @generated
 */
public interface Library3Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Library3Factory eINSTANCE = library3.impl.Library3FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Book Info Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Book Info Type</em>'.
	 * @generated
	 */
	BookInfoType createBookInfoType();

	/**
	 * Returns a new object of class '<em>Book Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Book Type</em>'.
	 * @generated
	 */
	BookType createBookType();

	/**
	 * Returns a new object of class '<em>Customer Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer Type</em>'.
	 * @generated
	 */
	CustomerType createCustomerType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Library Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Library Type</em>'.
	 * @generated
	 */
	LibraryType createLibraryType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Library3Package getLibrary3Package();

} //Library3Factory
