/**
 */
package eclassxmlschemaheader_2_0Simplified.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import eclassxmlschemacommon_2_0Simplified.IDENTIFICATION;
import eclassxmlschemacommon_2_0Simplified.PARTY;
import eclassxmlschemaheader_2_0Simplified.Eclassxmlschemaheader_2_0SimplifiedPackage;
import eclassxmlschemaheader_2_0Simplified.MESSAGE;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MESSAGE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eclassxmlschemaheader_2_0Simplified.impl.MESSAGEImpl#getIdentification <em>Identification</em>}</li>
 *   <li>{@link eclassxmlschemaheader_2_0Simplified.impl.MESSAGEImpl#getSender <em>Sender</em>}</li>
 *   <li>{@link eclassxmlschemaheader_2_0Simplified.impl.MESSAGEImpl#getRecipient <em>Recipient</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MESSAGEImpl extends MinimalEObjectImpl.Container implements MESSAGE {
	/**
	 * The cached value of the '{@link #getIdentification() <em>Identification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentification()
	 * @generated
	 * @ordered
	 */
	protected IDENTIFICATION identification;

	/**
	 * The cached value of the '{@link #getSender() <em>Sender</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSender()
	 * @generated
	 * @ordered
	 */
	protected PARTY sender;

	/**
	 * The cached value of the '{@link #getRecipient() <em>Recipient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipient()
	 * @generated
	 * @ordered
	 */
	protected PARTY recipient;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MESSAGEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Eclassxmlschemaheader_2_0SimplifiedPackage.Literals.MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDENTIFICATION getIdentification() {
		return identification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentification(IDENTIFICATION newIdentification, NotificationChain msgs) {
		IDENTIFICATION oldIdentification = identification;
		identification = newIdentification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Eclassxmlschemaheader_2_0SimplifiedPackage.MESSAGE__IDENTIFICATION, oldIdentification, newIdentification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentification(IDENTIFICATION newIdentification) {
		if (newIdentification != identification) {
			NotificationChain msgs = null;
			if (identification != null)
				msgs = ((InternalEObject)identification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Eclassxmlschemaheader_2_0SimplifiedPackage.MESSAGE__IDENTIFICATION, null, msgs);
			if (newIdentification != null)
				msgs = ((InternalEObject)newIdentification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Eclassxmlschemaheader_2_0SimplifiedPackage.MESSAGE__IDENTIFICATION, null, msgs);
			msgs = basicSetIdentification(newIdentification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eclassxmlschemaheader_2_0SimplifiedPackage.MESSAGE__IDENTIFICATION, newIdentification, newIdentification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PARTY getSender() {
		return sender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSender(PARTY newSender, NotificationChain msgs) {
		PARTY oldSender = sender;
		sender = newSender;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Eclassxmlschemaheader_2_0SimplifiedPackage.MESSAGE__SENDER, oldSender, newSender);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSender(PARTY newSender) {
		if (newSender != sender) {
			NotificationChain msgs = null;
			if (sender != null)
				msgs = ((InternalEObject)sender).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Eclassxmlschemaheader_2_0SimplifiedPackage.MESSAGE__SENDER, null, msgs);
			if (newSender != null)
				msgs = ((InternalEObject)newSender).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Eclassxmlschemaheader_2_0SimplifiedPackage.MESSAGE__SENDER, null, msgs);
			msgs = basicSetSender(newSender, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eclassxmlschemaheader_2_0SimplifiedPackage.MESSAGE__SENDER, newSender, newSender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PARTY getRecipient() {
		return recipient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecipient(PARTY newRecipient, NotificationChain msgs) {
		PARTY oldRecipient = recipient;
		recipient = newRecipient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Eclassxmlschemaheader_2_0SimplifiedPackage.MESSAGE__RECIPIENT, oldRecipient, newRecipient);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecipient(PARTY newRecipient) {
		if (newRecipient != recipient) {
			NotificationChain msgs = null;
			if (recipient != null)
				msgs = ((InternalEObject)recipient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Eclassxmlschemaheader_2_0SimplifiedPackage.MESSAGE__RECIPIENT, null, msgs);
			if (newRecipient != null)
				msgs = ((InternalEObject)newRecipient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Eclassxmlschemaheader_2_0SimplifiedPackage.MESSAGE__RECIPIENT, null, msgs);
			msgs = basicSetRecipient(newRecipient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eclassxmlschemaheader_2_0SimplifiedPackage.MESSAGE__RECIPIENT, newRecipient, newRecipient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Eclassxmlschemaheader_2_0SimplifiedPackage.MESSAGE__IDENTIFICATION:
				return basicSetIdentification(null, msgs);
			case Eclassxmlschemaheader_2_0SimplifiedPackage.MESSAGE__SENDER:
				return basicSetSender(null, msgs);
			case Eclassxmlschemaheader_2_0SimplifiedPackage.MESSAGE__RECIPIENT:
				return basicSetRecipient(null, msgs);
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
			case Eclassxmlschemaheader_2_0SimplifiedPackage.MESSAGE__IDENTIFICATION:
				return getIdentification();
			case Eclassxmlschemaheader_2_0SimplifiedPackage.MESSAGE__SENDER:
				return getSender();
			case Eclassxmlschemaheader_2_0SimplifiedPackage.MESSAGE__RECIPIENT:
				return getRecipient();
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
			case Eclassxmlschemaheader_2_0SimplifiedPackage.MESSAGE__IDENTIFICATION:
				setIdentification((IDENTIFICATION)newValue);
				return;
			case Eclassxmlschemaheader_2_0SimplifiedPackage.MESSAGE__SENDER:
				setSender((PARTY)newValue);
				return;
			case Eclassxmlschemaheader_2_0SimplifiedPackage.MESSAGE__RECIPIENT:
				setRecipient((PARTY)newValue);
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
			case Eclassxmlschemaheader_2_0SimplifiedPackage.MESSAGE__IDENTIFICATION:
				setIdentification((IDENTIFICATION)null);
				return;
			case Eclassxmlschemaheader_2_0SimplifiedPackage.MESSAGE__SENDER:
				setSender((PARTY)null);
				return;
			case Eclassxmlschemaheader_2_0SimplifiedPackage.MESSAGE__RECIPIENT:
				setRecipient((PARTY)null);
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
			case Eclassxmlschemaheader_2_0SimplifiedPackage.MESSAGE__IDENTIFICATION:
				return identification != null;
			case Eclassxmlschemaheader_2_0SimplifiedPackage.MESSAGE__SENDER:
				return sender != null;
			case Eclassxmlschemaheader_2_0SimplifiedPackage.MESSAGE__RECIPIENT:
				return recipient != null;
		}
		return super.eIsSet(featureID);
	}

} //MESSAGEImpl
