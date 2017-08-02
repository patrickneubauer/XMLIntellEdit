/**
 */
package Library3.impl;

import Library3.BookInfoType;
import Library3.BookType;
import Library3.Library3Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Book Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Library3.impl.BookTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Library3.impl.BookTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link Library3.impl.BookTypeImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link Library3.impl.BookTypeImpl#getPages <em>Pages</em>}</li>
 *   <li>{@link Library3.impl.BookTypeImpl#getBookInfo <em>Book Info</em>}</li>
 *   <li>{@link Library3.impl.BookTypeImpl#getIsbn <em>Isbn</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BookTypeImpl extends MinimalEObjectImpl.Container implements BookType {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected String author = AUTHOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getPages() <em>Pages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPages()
	 * @generated
	 * @ordered
	 */
	protected static final int PAGES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPages() <em>Pages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPages()
	 * @generated
	 * @ordered
	 */
	protected int pages = PAGES_EDEFAULT;

	/**
	 * This is true if the Pages attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pagesESet;

	/**
	 * The cached value of the '{@link #getBookInfo() <em>Book Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookInfo()
	 * @generated
	 * @ordered
	 */
	protected BookInfoType bookInfo;

	/**
	 * The default value of the '{@link #getIsbn() <em>Isbn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsbn()
	 * @generated
	 * @ordered
	 */
	protected static final String ISBN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsbn() <em>Isbn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsbn()
	 * @generated
	 * @ordered
	 */
	protected String isbn = ISBN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Library3Package.Literals.BOOK_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Library3Package.BOOK_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Library3Package.BOOK_TYPE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(String newAuthor) {
		String oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Library3Package.BOOK_TYPE__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPages() {
		return pages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPages(int newPages) {
		int oldPages = pages;
		pages = newPages;
		boolean oldPagesESet = pagesESet;
		pagesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Library3Package.BOOK_TYPE__PAGES, oldPages, pages, !oldPagesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPages() {
		int oldPages = pages;
		boolean oldPagesESet = pagesESet;
		pages = PAGES_EDEFAULT;
		pagesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Library3Package.BOOK_TYPE__PAGES, oldPages, PAGES_EDEFAULT, oldPagesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPages() {
		return pagesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookInfoType getBookInfo() {
		return bookInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBookInfo(BookInfoType newBookInfo, NotificationChain msgs) {
		BookInfoType oldBookInfo = bookInfo;
		bookInfo = newBookInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Library3Package.BOOK_TYPE__BOOK_INFO, oldBookInfo, newBookInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookInfo(BookInfoType newBookInfo) {
		if (newBookInfo != bookInfo) {
			NotificationChain msgs = null;
			if (bookInfo != null)
				msgs = ((InternalEObject)bookInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Library3Package.BOOK_TYPE__BOOK_INFO, null, msgs);
			if (newBookInfo != null)
				msgs = ((InternalEObject)newBookInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Library3Package.BOOK_TYPE__BOOK_INFO, null, msgs);
			msgs = basicSetBookInfo(newBookInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Library3Package.BOOK_TYPE__BOOK_INFO, newBookInfo, newBookInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsbn(String newIsbn) {
		String oldIsbn = isbn;
		isbn = newIsbn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Library3Package.BOOK_TYPE__ISBN, oldIsbn, isbn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Library3Package.BOOK_TYPE__BOOK_INFO:
				return basicSetBookInfo(null, msgs);
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
			case Library3Package.BOOK_TYPE__NAME:
				return getName();
			case Library3Package.BOOK_TYPE__TITLE:
				return getTitle();
			case Library3Package.BOOK_TYPE__AUTHOR:
				return getAuthor();
			case Library3Package.BOOK_TYPE__PAGES:
				return getPages();
			case Library3Package.BOOK_TYPE__BOOK_INFO:
				return getBookInfo();
			case Library3Package.BOOK_TYPE__ISBN:
				return getIsbn();
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
			case Library3Package.BOOK_TYPE__NAME:
				setName((String)newValue);
				return;
			case Library3Package.BOOK_TYPE__TITLE:
				setTitle((String)newValue);
				return;
			case Library3Package.BOOK_TYPE__AUTHOR:
				setAuthor((String)newValue);
				return;
			case Library3Package.BOOK_TYPE__PAGES:
				setPages((Integer)newValue);
				return;
			case Library3Package.BOOK_TYPE__BOOK_INFO:
				setBookInfo((BookInfoType)newValue);
				return;
			case Library3Package.BOOK_TYPE__ISBN:
				setIsbn((String)newValue);
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
			case Library3Package.BOOK_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Library3Package.BOOK_TYPE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case Library3Package.BOOK_TYPE__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case Library3Package.BOOK_TYPE__PAGES:
				unsetPages();
				return;
			case Library3Package.BOOK_TYPE__BOOK_INFO:
				setBookInfo((BookInfoType)null);
				return;
			case Library3Package.BOOK_TYPE__ISBN:
				setIsbn(ISBN_EDEFAULT);
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
			case Library3Package.BOOK_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Library3Package.BOOK_TYPE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case Library3Package.BOOK_TYPE__AUTHOR:
				return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
			case Library3Package.BOOK_TYPE__PAGES:
				return isSetPages();
			case Library3Package.BOOK_TYPE__BOOK_INFO:
				return bookInfo != null;
			case Library3Package.BOOK_TYPE__ISBN:
				return ISBN_EDEFAULT == null ? isbn != null : !ISBN_EDEFAULT.equals(isbn);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", title: ");
		result.append(title);
		result.append(", author: ");
		result.append(author);
		result.append(", pages: ");
		if (pagesESet) result.append(pages); else result.append("<unset>");
		result.append(", isbn: ");
		result.append(isbn);
		result.append(')');
		return result.toString();
	}

} //BookTypeImpl
