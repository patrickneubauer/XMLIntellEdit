/**
 */
package library3.impl;

import java.util.Collection;

import library3.BookType;
import library3.CustomerType;
import library3.Library3Package;
import library3.LibraryType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Library Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link library3.impl.LibraryTypeImpl#getBook <em>Book</em>}</li>
 *   <li>{@link library3.impl.LibraryTypeImpl#getCustomer <em>Customer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LibraryTypeImpl extends MinimalEObjectImpl.Container implements LibraryType {
	/**
	 * The cached value of the '{@link #getBook() <em>Book</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBook()
	 * @generated
	 * @ordered
	 */
	protected EList<BookType> book;

	/**
	 * The cached value of the '{@link #getCustomer() <em>Customer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomer()
	 * @generated
	 * @ordered
	 */
	protected EList<CustomerType> customer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LibraryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Library3Package.Literals.LIBRARY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BookType> getBook() {
		if (book == null) {
			book = new EObjectContainmentEList<BookType>(BookType.class, this, Library3Package.LIBRARY_TYPE__BOOK);
		}
		return book;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CustomerType> getCustomer() {
		if (customer == null) {
			customer = new EObjectContainmentEList<CustomerType>(CustomerType.class, this, Library3Package.LIBRARY_TYPE__CUSTOMER);
		}
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Library3Package.LIBRARY_TYPE__BOOK:
				return ((InternalEList<?>)getBook()).basicRemove(otherEnd, msgs);
			case Library3Package.LIBRARY_TYPE__CUSTOMER:
				return ((InternalEList<?>)getCustomer()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Library3Package.LIBRARY_TYPE__BOOK:
				return getBook();
			case Library3Package.LIBRARY_TYPE__CUSTOMER:
				return getCustomer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Library3Package.LIBRARY_TYPE__BOOK:
				getBook().clear();
				getBook().addAll((Collection<? extends BookType>)newValue);
				return;
			case Library3Package.LIBRARY_TYPE__CUSTOMER:
				getCustomer().clear();
				getCustomer().addAll((Collection<? extends CustomerType>)newValue);
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
			case Library3Package.LIBRARY_TYPE__BOOK:
				getBook().clear();
				return;
			case Library3Package.LIBRARY_TYPE__CUSTOMER:
				getCustomer().clear();
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
			case Library3Package.LIBRARY_TYPE__BOOK:
				return book != null && !book.isEmpty();
			case Library3Package.LIBRARY_TYPE__CUSTOMER:
				return customer != null && !customer.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LibraryTypeImpl
