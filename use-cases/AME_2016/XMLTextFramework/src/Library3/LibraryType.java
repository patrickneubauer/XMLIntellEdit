/**
 */
package Library3;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Library3.LibraryType#getBook <em>Book</em>}</li>
 *   <li>{@link Library3.LibraryType#getCustomer <em>Customer</em>}</li>
 * </ul>
 *
 * @see Library3.Library3Package#getLibraryType()
 * @model extendedMetaData="name='libraryType' kind='elementOnly'"
 * @generated
 */
public interface LibraryType extends EObject {
	/**
	 * Returns the value of the '<em><b>Book</b></em>' containment reference list.
	 * The list contents are of type {@link Library3.BookType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Book</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Book</em>' containment reference list.
	 * @see Library3.Library3Package#getLibraryType_Book()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='book' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BookType> getBook();

	/**
	 * Returns the value of the '<em><b>Customer</b></em>' containment reference list.
	 * The list contents are of type {@link Library3.CustomerType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' containment reference list.
	 * @see Library3.Library3Package#getLibraryType_Customer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='customer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CustomerType> getCustomer();

} // LibraryType
