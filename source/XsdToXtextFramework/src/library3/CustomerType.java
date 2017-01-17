/**
 */
package library3;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link library3.CustomerType#getFirstName <em>First Name</em>}</li>
 *   <li>{@link library3.CustomerType#getLastName <em>Last Name</em>}</li>
 *   <li>{@link library3.CustomerType#getBorrowedBookId <em>Borrowed Book Id</em>}</li>
 * </ul>
 *
 * @see library3.Library3Package#getCustomerType()
 * @model extendedMetaData="name='customerType' kind='elementOnly'"
 * @generated
 */
public interface CustomerType extends EObject {
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
	 * @see library3.Library3Package#getCustomerType_FirstName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='firstName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link library3.CustomerType#getFirstName <em>First Name</em>}' attribute.
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
	 * @see library3.Library3Package#getCustomerType_LastName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='lastName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link library3.CustomerType#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

	/**
	 * Returns the value of the '<em><b>Borrowed Book Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Borrowed Book Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Borrowed Book Id</em>' attribute.
	 * @see #setBorrowedBookId(String)
	 * @see library3.Library3Package#getCustomerType_BorrowedBookId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF" required="true"
	 *        extendedMetaData="kind='element' name='borrowedBookId' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBorrowedBookId();

	/**
	 * Sets the value of the '{@link library3.CustomerType#getBorrowedBookId <em>Borrowed Book Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Borrowed Book Id</em>' attribute.
	 * @see #getBorrowedBookId()
	 * @generated
	 */
	void setBorrowedBookId(String value);

} // CustomerType
