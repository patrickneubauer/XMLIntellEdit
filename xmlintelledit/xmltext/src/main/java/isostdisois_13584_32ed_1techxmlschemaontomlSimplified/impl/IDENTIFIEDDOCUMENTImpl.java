/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DOCUMENTIDENTIFIER;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.IDENTIFIEDDOCUMENT;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IDENTIFIEDDOCUMENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.IDENTIFIEDDOCUMENTImpl#getDocumentIdentifier <em>Document Identifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IDENTIFIEDDOCUMENTImpl extends SOURCEDOCUMENTImpl implements IDENTIFIEDDOCUMENT {
	/**
	 * The cached value of the '{@link #getDocumentIdentifier() <em>Document Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentIdentifier()
	 * @generated
	 * @ordered
	 */
	protected DOCUMENTIDENTIFIER documentIdentifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IDENTIFIEDDOCUMENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.IDENTIFIEDDOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DOCUMENTIDENTIFIER getDocumentIdentifier() {
		return documentIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentIdentifier(DOCUMENTIDENTIFIER newDocumentIdentifier, NotificationChain msgs) {
		DOCUMENTIDENTIFIER oldDocumentIdentifier = documentIdentifier;
		documentIdentifier = newDocumentIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.IDENTIFIEDDOCUMENT__DOCUMENT_IDENTIFIER, oldDocumentIdentifier, newDocumentIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentIdentifier(DOCUMENTIDENTIFIER newDocumentIdentifier) {
		if (newDocumentIdentifier != documentIdentifier) {
			NotificationChain msgs = null;
			if (documentIdentifier != null)
				msgs = ((InternalEObject)documentIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.IDENTIFIEDDOCUMENT__DOCUMENT_IDENTIFIER, null, msgs);
			if (newDocumentIdentifier != null)
				msgs = ((InternalEObject)newDocumentIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.IDENTIFIEDDOCUMENT__DOCUMENT_IDENTIFIER, null, msgs);
			msgs = basicSetDocumentIdentifier(newDocumentIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.IDENTIFIEDDOCUMENT__DOCUMENT_IDENTIFIER, newDocumentIdentifier, newDocumentIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.IDENTIFIEDDOCUMENT__DOCUMENT_IDENTIFIER:
				return basicSetDocumentIdentifier(null, msgs);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.IDENTIFIEDDOCUMENT__DOCUMENT_IDENTIFIER:
				return getDocumentIdentifier();
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.IDENTIFIEDDOCUMENT__DOCUMENT_IDENTIFIER:
				setDocumentIdentifier((DOCUMENTIDENTIFIER)newValue);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.IDENTIFIEDDOCUMENT__DOCUMENT_IDENTIFIER:
				setDocumentIdentifier((DOCUMENTIDENTIFIER)null);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.IDENTIFIEDDOCUMENT__DOCUMENT_IDENTIFIER:
				return documentIdentifier != null;
		}
		return super.eIsSet(featureID);
	}

} //IDENTIFIEDDOCUMENTImpl
