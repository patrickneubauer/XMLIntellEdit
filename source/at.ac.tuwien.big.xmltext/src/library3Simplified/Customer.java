/**
 */
package library3Simplified;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link library3Simplified.Customer#getFirstName <em>First Name</em>}</li>
 *   <li>{@link library3Simplified.Customer#getLastName <em>Last Name</em>}</li>
 *   <li>{@link library3Simplified.Customer#getBorrowedBookId <em>Borrowed Book Id</em>}</li>
 *   <li>{@link library3Simplified.Customer#getBorrowedBookSince <em>Borrowed Book Since</em>}</li>
 * </ul>
 *
 * @see library3Simplified.library3SimplifiedPackage#getCustomer()
 * @model
 * @generated
 */
public interface Customer extends EObject {
	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see library3Simplified.library3SimplifiedPackage#getCustomer_FirstName()
	 * @model required="true"
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link library3Simplified.Customer#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #setLastName(String)
	 * @see library3Simplified.library3SimplifiedPackage#getCustomer_LastName()
	 * @model required="true"
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link library3Simplified.Customer#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

	/**
	 * Returns the value of the '<em><b>Borrowed Book Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Borrowed Book Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Borrowed Book Id</em>' reference.
	 * @see #setBorrowedBookId(Book)
	 * @see library3Simplified.library3SimplifiedPackage#getCustomer_BorrowedBookId()
	 * @model
	 * @generated
	 */
	Book getBorrowedBookId();

	/**
	 * Sets the value of the '{@link library3Simplified.Customer#getBorrowedBookId <em>Borrowed Book Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Borrowed Book Id</em>' reference.
	 * @see #getBorrowedBookId()
	 * @generated
	 */
	void setBorrowedBookId(Book value);

	/**
	 * Returns the value of the '<em><b>Borrowed Book Since</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Borrowed Book Since</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Borrowed Book Since</em>' attribute.
	 * @see #setBorrowedBookSince(String)
	 * @see library3Simplified.library3SimplifiedPackage#getCustomer_BorrowedBookSince()
	 * @model
	 * @generated
	 */
	String getBorrowedBookSince();

	/**
	 * Sets the value of the '{@link library3Simplified.Customer#getBorrowedBookSince <em>Borrowed Book Since</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Borrowed Book Since</em>' attribute.
	 * @see #getBorrowedBookSince()
	 * @generated
	 */
	void setBorrowedBookSince(String value);

} // Customer
