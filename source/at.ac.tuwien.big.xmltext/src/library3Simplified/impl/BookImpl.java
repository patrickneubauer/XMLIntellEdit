/**
 */
package library3Simplified.impl;

import library3Simplified.Book;
import library3Simplified.BookInfo;
import library3Simplified.library3SimplifiedPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Book</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link library3Simplified.impl.BookImpl#getName <em>Name</em>}</li>
 *   <li>{@link library3Simplified.impl.BookImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link library3Simplified.impl.BookImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link library3Simplified.impl.BookImpl#getPages <em>Pages</em>}</li>
 *   <li>{@link library3Simplified.impl.BookImpl#getDimension <em>Dimension</em>}</li>
 *   <li>{@link library3Simplified.impl.BookImpl#getDownload <em>Download</em>}</li>
 *   <li>{@link library3Simplified.impl.BookImpl#getIsbn <em>Isbn</em>}</li>
 *   <li>{@link library3Simplified.impl.BookImpl#getBookInfo <em>Book Info</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BookImpl extends MinimalEObjectImpl.Container implements Book {
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
	 * The default value of the '{@link #getDimension() <em>Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimension()
	 * @generated
	 * @ordered
	 */
	protected static final String DIMENSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDimension() <em>Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimension()
	 * @generated
	 * @ordered
	 */
	protected String dimension = DIMENSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDownload() <em>Download</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDownload()
	 * @generated
	 * @ordered
	 */
	protected static final String DOWNLOAD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDownload() <em>Download</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDownload()
	 * @generated
	 * @ordered
	 */
	protected String download = DOWNLOAD_EDEFAULT;

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
	 * The cached value of the '{@link #getBookInfo() <em>Book Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookInfo()
	 * @generated
	 * @ordered
	 */
	protected BookInfo bookInfo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return library3SimplifiedPackage.Literals.BOOK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, library3SimplifiedPackage.BOOK__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, library3SimplifiedPackage.BOOK__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, library3SimplifiedPackage.BOOK__AUTHOR, oldAuthor, author));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, library3SimplifiedPackage.BOOK__PAGES, oldPages, pages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDimension() {
		return dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDimension(String newDimension) {
		String oldDimension = dimension;
		dimension = newDimension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, library3SimplifiedPackage.BOOK__DIMENSION, oldDimension, dimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDownload() {
		return download;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDownload(String newDownload) {
		String oldDownload = download;
		download = newDownload;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, library3SimplifiedPackage.BOOK__DOWNLOAD, oldDownload, download));
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
			eNotify(new ENotificationImpl(this, Notification.SET, library3SimplifiedPackage.BOOK__ISBN, oldIsbn, isbn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookInfo getBookInfo() {
		return bookInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBookInfo(BookInfo newBookInfo, NotificationChain msgs) {
		BookInfo oldBookInfo = bookInfo;
		bookInfo = newBookInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, library3SimplifiedPackage.BOOK__BOOK_INFO, oldBookInfo, newBookInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookInfo(BookInfo newBookInfo) {
		if (newBookInfo != bookInfo) {
			NotificationChain msgs = null;
			if (bookInfo != null)
				msgs = ((InternalEObject)bookInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - library3SimplifiedPackage.BOOK__BOOK_INFO, null, msgs);
			if (newBookInfo != null)
				msgs = ((InternalEObject)newBookInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - library3SimplifiedPackage.BOOK__BOOK_INFO, null, msgs);
			msgs = basicSetBookInfo(newBookInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, library3SimplifiedPackage.BOOK__BOOK_INFO, newBookInfo, newBookInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case library3SimplifiedPackage.BOOK__BOOK_INFO:
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
			case library3SimplifiedPackage.BOOK__NAME:
				return getName();
			case library3SimplifiedPackage.BOOK__TITLE:
				return getTitle();
			case library3SimplifiedPackage.BOOK__AUTHOR:
				return getAuthor();
			case library3SimplifiedPackage.BOOK__PAGES:
				return getPages();
			case library3SimplifiedPackage.BOOK__DIMENSION:
				return getDimension();
			case library3SimplifiedPackage.BOOK__DOWNLOAD:
				return getDownload();
			case library3SimplifiedPackage.BOOK__ISBN:
				return getIsbn();
			case library3SimplifiedPackage.BOOK__BOOK_INFO:
				return getBookInfo();
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
			case library3SimplifiedPackage.BOOK__NAME:
				setName((String)newValue);
				return;
			case library3SimplifiedPackage.BOOK__TITLE:
				setTitle((String)newValue);
				return;
			case library3SimplifiedPackage.BOOK__AUTHOR:
				setAuthor((String)newValue);
				return;
			case library3SimplifiedPackage.BOOK__PAGES:
				setPages((Integer)newValue);
				return;
			case library3SimplifiedPackage.BOOK__DIMENSION:
				setDimension((String)newValue);
				return;
			case library3SimplifiedPackage.BOOK__DOWNLOAD:
				setDownload((String)newValue);
				return;
			case library3SimplifiedPackage.BOOK__ISBN:
				setIsbn((String)newValue);
				return;
			case library3SimplifiedPackage.BOOK__BOOK_INFO:
				setBookInfo((BookInfo)newValue);
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
			case library3SimplifiedPackage.BOOK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case library3SimplifiedPackage.BOOK__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case library3SimplifiedPackage.BOOK__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case library3SimplifiedPackage.BOOK__PAGES:
				setPages(PAGES_EDEFAULT);
				return;
			case library3SimplifiedPackage.BOOK__DIMENSION:
				setDimension(DIMENSION_EDEFAULT);
				return;
			case library3SimplifiedPackage.BOOK__DOWNLOAD:
				setDownload(DOWNLOAD_EDEFAULT);
				return;
			case library3SimplifiedPackage.BOOK__ISBN:
				setIsbn(ISBN_EDEFAULT);
				return;
			case library3SimplifiedPackage.BOOK__BOOK_INFO:
				setBookInfo((BookInfo)null);
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
			case library3SimplifiedPackage.BOOK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case library3SimplifiedPackage.BOOK__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case library3SimplifiedPackage.BOOK__AUTHOR:
				return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
			case library3SimplifiedPackage.BOOK__PAGES:
				return pages != PAGES_EDEFAULT;
			case library3SimplifiedPackage.BOOK__DIMENSION:
				return DIMENSION_EDEFAULT == null ? dimension != null : !DIMENSION_EDEFAULT.equals(dimension);
			case library3SimplifiedPackage.BOOK__DOWNLOAD:
				return DOWNLOAD_EDEFAULT == null ? download != null : !DOWNLOAD_EDEFAULT.equals(download);
			case library3SimplifiedPackage.BOOK__ISBN:
				return ISBN_EDEFAULT == null ? isbn != null : !ISBN_EDEFAULT.equals(isbn);
			case library3SimplifiedPackage.BOOK__BOOK_INFO:
				return bookInfo != null;
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
		result.append(pages);
		result.append(", dimension: ");
		result.append(dimension);
		result.append(", download: ");
		result.append(download);
		result.append(", isbn: ");
		result.append(isbn);
		result.append(')');
		return result.toString();
	}

} //BookImpl
