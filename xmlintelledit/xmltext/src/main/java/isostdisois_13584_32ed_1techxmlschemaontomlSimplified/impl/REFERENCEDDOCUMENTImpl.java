/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DOCUMENTREFERENCE;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.REFERENCEDDOCUMENT;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>REFERENCEDDOCUMENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.REFERENCEDDOCUMENTImpl#getDocumentReference <em>Document Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class REFERENCEDDOCUMENTImpl extends SOURCEDOCUMENTImpl implements REFERENCEDDOCUMENT {
	/**
	 * The cached value of the '{@link #getDocumentReference() <em>Document Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentReference()
	 * @generated
	 * @ordered
	 */
	protected DOCUMENTREFERENCE documentReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected REFERENCEDDOCUMENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.REFERENCEDDOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DOCUMENTREFERENCE getDocumentReference() {
		return documentReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentReference(DOCUMENTREFERENCE newDocumentReference, NotificationChain msgs) {
		DOCUMENTREFERENCE oldDocumentReference = documentReference;
		documentReference = newDocumentReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REFERENCEDDOCUMENT__DOCUMENT_REFERENCE, oldDocumentReference, newDocumentReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentReference(DOCUMENTREFERENCE newDocumentReference) {
		if (newDocumentReference != documentReference) {
			NotificationChain msgs = null;
			if (documentReference != null)
				msgs = ((InternalEObject)documentReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REFERENCEDDOCUMENT__DOCUMENT_REFERENCE, null, msgs);
			if (newDocumentReference != null)
				msgs = ((InternalEObject)newDocumentReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REFERENCEDDOCUMENT__DOCUMENT_REFERENCE, null, msgs);
			msgs = basicSetDocumentReference(newDocumentReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REFERENCEDDOCUMENT__DOCUMENT_REFERENCE, newDocumentReference, newDocumentReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REFERENCEDDOCUMENT__DOCUMENT_REFERENCE:
				return basicSetDocumentReference(null, msgs);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REFERENCEDDOCUMENT__DOCUMENT_REFERENCE:
				return getDocumentReference();
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REFERENCEDDOCUMENT__DOCUMENT_REFERENCE:
				setDocumentReference((DOCUMENTREFERENCE)newValue);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REFERENCEDDOCUMENT__DOCUMENT_REFERENCE:
				setDocumentReference((DOCUMENTREFERENCE)null);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REFERENCEDDOCUMENT__DOCUMENT_REFERENCE:
				return documentReference != null;
		}
		return super.eIsSet(featureID);
	}

} //REFERENCEDDOCUMENTImpl
