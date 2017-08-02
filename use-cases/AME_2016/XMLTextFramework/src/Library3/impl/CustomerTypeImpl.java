/**
 */
package Library3.impl;

import Library3.CustomerType;
import Library3.Library3Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Library3.impl.CustomerTypeImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link Library3.impl.CustomerTypeImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link Library3.impl.CustomerTypeImpl#getBorrowedBookId <em>Borrowed Book Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerTypeImpl extends MinimalEObjectImpl.Container implements CustomerType {
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
	 * The cached value of the '{@link #getBorrowedBookId() <em>Borrowed Book Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorrowedBookId()
	 * @generated
	 * @ordered
	 */
	protected EObject borrowedBookId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Library3Package.Literals.CUSTOMER_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Library3Package.CUSTOMER_TYPE__FIRST_NAME, oldFirstName, firstName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Library3Package.CUSTOMER_TYPE__LAST_NAME, oldLastName, lastName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getBorrowedBookId() {
		if (borrowedBookId != null && borrowedBookId.eIsProxy()) {
			InternalEObject oldBorrowedBookId = (InternalEObject)borrowedBookId;
			borrowedBookId = eResolveProxy(oldBorrowedBookId);
			if (borrowedBookId != oldBorrowedBookId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Library3Package.CUSTOMER_TYPE__BORROWED_BOOK_ID, oldBorrowedBookId, borrowedBookId));
			}
		}
		return borrowedBookId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetBorrowedBookId() {
		return borrowedBookId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorrowedBookId(EObject newBorrowedBookId) {
		EObject oldBorrowedBookId = borrowedBookId;
		borrowedBookId = newBorrowedBookId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Library3Package.CUSTOMER_TYPE__BORROWED_BOOK_ID, oldBorrowedBookId, borrowedBookId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Library3Package.CUSTOMER_TYPE__FIRST_NAME:
				return getFirstName();
			case Library3Package.CUSTOMER_TYPE__LAST_NAME:
				return getLastName();
			case Library3Package.CUSTOMER_TYPE__BORROWED_BOOK_ID:
				if (resolve) return getBorrowedBookId();
				return basicGetBorrowedBookId();
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
			case Library3Package.CUSTOMER_TYPE__FIRST_NAME:
				setFirstName((String)newValue);
				return;
			case Library3Package.CUSTOMER_TYPE__LAST_NAME:
				setLastName((String)newValue);
				return;
			case Library3Package.CUSTOMER_TYPE__BORROWED_BOOK_ID:
				setBorrowedBookId((EObject)newValue);
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
			case Library3Package.CUSTOMER_TYPE__FIRST_NAME:
				setFirstName(FIRST_NAME_EDEFAULT);
				return;
			case Library3Package.CUSTOMER_TYPE__LAST_NAME:
				setLastName(LAST_NAME_EDEFAULT);
				return;
			case Library3Package.CUSTOMER_TYPE__BORROWED_BOOK_ID:
				setBorrowedBookId((EObject)null);
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
			case Library3Package.CUSTOMER_TYPE__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
			case Library3Package.CUSTOMER_TYPE__LAST_NAME:
				return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
			case Library3Package.CUSTOMER_TYPE__BORROWED_BOOK_ID:
				return borrowedBookId != null;
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
		result.append(')');
		return result.toString();
	}

} //CustomerTypeImpl
