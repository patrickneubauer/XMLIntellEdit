/**
 */
package library3Simplified.impl;

import library3Simplified.Customer;
import library3Simplified.library3SimplifiedPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link library3Simplified.impl.CustomerImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link library3Simplified.impl.CustomerImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link library3Simplified.impl.CustomerImpl#getBorrowedBookId <em>Borrowed Book Id</em>}</li>
 *   <li>{@link library3Simplified.impl.CustomerImpl#getBorrowedBookSince <em>Borrowed Book Since</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerImpl extends MinimalEObjectImpl.Container implements Customer {
	/**
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected String firstName = FIRST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected String lastName = LAST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBorrowedBookId() <em>Borrowed Book Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorrowedBookId()
	 * @generated
	 * @ordered
	 */
	protected static final String BORROWED_BOOK_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBorrowedBookId() <em>Borrowed Book Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorrowedBookId()
	 * @generated
	 * @ordered
	 */
	protected String borrowedBookId = BORROWED_BOOK_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getBorrowedBookSince() <em>Borrowed Book Since</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorrowedBookSince()
	 * @generated
	 * @ordered
	 */
	protected static final String BORROWED_BOOK_SINCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBorrowedBookSince() <em>Borrowed Book Since</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorrowedBookSince()
	 * @generated
	 * @ordered
	 */
	protected String borrowedBookSince = BORROWED_BOOK_SINCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return library3SimplifiedPackage.Literals.CUSTOMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstName(String newFirstName) {
		String oldFirstName = firstName;
		firstName = newFirstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, library3SimplifiedPackage.CUSTOMER__FIRST_NAME, oldFirstName, firstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastName(String newLastName) {
		String oldLastName = lastName;
		lastName = newLastName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, library3SimplifiedPackage.CUSTOMER__LAST_NAME, oldLastName, lastName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBorrowedBookId() {
		return borrowedBookId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorrowedBookId(String newBorrowedBookId) {
		String oldBorrowedBookId = borrowedBookId;
		borrowedBookId = newBorrowedBookId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, library3SimplifiedPackage.CUSTOMER__BORROWED_BOOK_ID, oldBorrowedBookId, borrowedBookId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBorrowedBookSince() {
		return borrowedBookSince;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorrowedBookSince(String newBorrowedBookSince) {
		String oldBorrowedBookSince = borrowedBookSince;
		borrowedBookSince = newBorrowedBookSince;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, library3SimplifiedPackage.CUSTOMER__BORROWED_BOOK_SINCE, oldBorrowedBookSince, borrowedBookSince));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case library3SimplifiedPackage.CUSTOMER__FIRST_NAME:
				return getFirstName();
			case library3SimplifiedPackage.CUSTOMER__LAST_NAME:
				return getLastName();
			case library3SimplifiedPackage.CUSTOMER__BORROWED_BOOK_ID:
				return getBorrowedBookId();
			case library3SimplifiedPackage.CUSTOMER__BORROWED_BOOK_SINCE:
				return getBorrowedBookSince();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case library3SimplifiedPackage.CUSTOMER__FIRST_NAME:
				setFirstName((String)newValue);
				return;
			case library3SimplifiedPackage.CUSTOMER__LAST_NAME:
				setLastName((String)newValue);
				return;
			case library3SimplifiedPackage.CUSTOMER__BORROWED_BOOK_ID:
				setBorrowedBookId((String)newValue);
				return;
			case library3SimplifiedPackage.CUSTOMER__BORROWED_BOOK_SINCE:
				setBorrowedBookSince((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case library3SimplifiedPackage.CUSTOMER__FIRST_NAME:
				setFirstName(FIRST_NAME_EDEFAULT);
				return;
			case library3SimplifiedPackage.CUSTOMER__LAST_NAME:
				setLastName(LAST_NAME_EDEFAULT);
				return;
			case library3SimplifiedPackage.CUSTOMER__BORROWED_BOOK_ID:
				setBorrowedBookId(BORROWED_BOOK_ID_EDEFAULT);
				return;
			case library3SimplifiedPackage.CUSTOMER__BORROWED_BOOK_SINCE:
				setBorrowedBookSince(BORROWED_BOOK_SINCE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case library3SimplifiedPackage.CUSTOMER__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
			case library3SimplifiedPackage.CUSTOMER__LAST_NAME:
				return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
			case library3SimplifiedPackage.CUSTOMER__BORROWED_BOOK_ID:
				return BORROWED_BOOK_ID_EDEFAULT == null ? borrowedBookId != null : !BORROWED_BOOK_ID_EDEFAULT.equals(borrowedBookId);
			case library3SimplifiedPackage.CUSTOMER__BORROWED_BOOK_SINCE:
				return BORROWED_BOOK_SINCE_EDEFAULT == null ? borrowedBookSince != null : !BORROWED_BOOK_SINCE_EDEFAULT.equals(borrowedBookSince);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (firstName: ");
		result.append(firstName);
		result.append(", lastName: ");
		result.append(lastName);
		result.append(", borrowedBookId: ");
		result.append(borrowedBookId);
		result.append(", borrowedBookSince: ");
		result.append(borrowedBookSince);
		result.append(')');
		return result.toString();
	}

} //CustomerImpl
