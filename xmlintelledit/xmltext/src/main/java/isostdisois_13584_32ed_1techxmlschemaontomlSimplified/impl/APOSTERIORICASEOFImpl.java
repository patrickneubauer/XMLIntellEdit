/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.APOSTERIORICASEOF;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASSREFERENCE;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CORRESPONDINGPROPERTIES;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>APOSTERIORICASEOF</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.APOSTERIORICASEOFImpl#getCaseOfSuper <em>Case Of Super</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.APOSTERIORICASEOFImpl#getCaseOfSub <em>Case Of Sub</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.APOSTERIORICASEOFImpl#getCorrespondingProperties <em>Corresponding Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class APOSTERIORICASEOFImpl extends APOSTERIORISEMANTICRELATIONSHIPImpl implements APOSTERIORICASEOF {
	/**
	 * The cached value of the '{@link #getCaseOfSuper() <em>Case Of Super</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseOfSuper()
	 * @generated
	 * @ordered
	 */
	protected CLASSREFERENCE caseOfSuper;

	/**
	 * The cached value of the '{@link #getCaseOfSub() <em>Case Of Sub</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseOfSub()
	 * @generated
	 * @ordered
	 */
	protected CLASSREFERENCE caseOfSub;

	/**
	 * The cached value of the '{@link #getCorrespondingProperties() <em>Corresponding Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrespondingProperties()
	 * @generated
	 * @ordered
	 */
	protected CORRESPONDINGPROPERTIES correspondingProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APOSTERIORICASEOFImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.APOSTERIORICASEOF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLASSREFERENCE getCaseOfSuper() {
		return caseOfSuper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCaseOfSuper(CLASSREFERENCE newCaseOfSuper, NotificationChain msgs) {
		CLASSREFERENCE oldCaseOfSuper = caseOfSuper;
		caseOfSuper = newCaseOfSuper;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.APOSTERIORICASEOF__CASE_OF_SUPER, oldCaseOfSuper, newCaseOfSuper);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaseOfSuper(CLASSREFERENCE newCaseOfSuper) {
		if (newCaseOfSuper != caseOfSuper) {
			NotificationChain msgs = null;
			if (caseOfSuper != null)
				msgs = ((InternalEObject)caseOfSuper).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.APOSTERIORICASEOF__CASE_OF_SUPER, null, msgs);
			if (newCaseOfSuper != null)
				msgs = ((InternalEObject)newCaseOfSuper).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.APOSTERIORICASEOF__CASE_OF_SUPER, null, msgs);
			msgs = basicSetCaseOfSuper(newCaseOfSuper, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.APOSTERIORICASEOF__CASE_OF_SUPER, newCaseOfSuper, newCaseOfSuper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLASSREFERENCE getCaseOfSub() {
		return caseOfSub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCaseOfSub(CLASSREFERENCE newCaseOfSub, NotificationChain msgs) {
		CLASSREFERENCE oldCaseOfSub = caseOfSub;
		caseOfSub = newCaseOfSub;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.APOSTERIORICASEOF__CASE_OF_SUB, oldCaseOfSub, newCaseOfSub);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaseOfSub(CLASSREFERENCE newCaseOfSub) {
		if (newCaseOfSub != caseOfSub) {
			NotificationChain msgs = null;
			if (caseOfSub != null)
				msgs = ((InternalEObject)caseOfSub).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.APOSTERIORICASEOF__CASE_OF_SUB, null, msgs);
			if (newCaseOfSub != null)
				msgs = ((InternalEObject)newCaseOfSub).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.APOSTERIORICASEOF__CASE_OF_SUB, null, msgs);
			msgs = basicSetCaseOfSub(newCaseOfSub, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.APOSTERIORICASEOF__CASE_OF_SUB, newCaseOfSub, newCaseOfSub));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CORRESPONDINGPROPERTIES getCorrespondingProperties() {
		return correspondingProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCorrespondingProperties(CORRESPONDINGPROPERTIES newCorrespondingProperties, NotificationChain msgs) {
		CORRESPONDINGPROPERTIES oldCorrespondingProperties = correspondingProperties;
		correspondingProperties = newCorrespondingProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.APOSTERIORICASEOF__CORRESPONDING_PROPERTIES, oldCorrespondingProperties, newCorrespondingProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrespondingProperties(CORRESPONDINGPROPERTIES newCorrespondingProperties) {
		if (newCorrespondingProperties != correspondingProperties) {
			NotificationChain msgs = null;
			if (correspondingProperties != null)
				msgs = ((InternalEObject)correspondingProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.APOSTERIORICASEOF__CORRESPONDING_PROPERTIES, null, msgs);
			if (newCorrespondingProperties != null)
				msgs = ((InternalEObject)newCorrespondingProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.APOSTERIORICASEOF__CORRESPONDING_PROPERTIES, null, msgs);
			msgs = basicSetCorrespondingProperties(newCorrespondingProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.APOSTERIORICASEOF__CORRESPONDING_PROPERTIES, newCorrespondingProperties, newCorrespondingProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.APOSTERIORICASEOF__CASE_OF_SUPER:
				return basicSetCaseOfSuper(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.APOSTERIORICASEOF__CASE_OF_SUB:
				return basicSetCaseOfSub(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.APOSTERIORICASEOF__CORRESPONDING_PROPERTIES:
				return basicSetCorrespondingProperties(null, msgs);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.APOSTERIORICASEOF__CASE_OF_SUPER:
				return getCaseOfSuper();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.APOSTERIORICASEOF__CASE_OF_SUB:
				return getCaseOfSub();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.APOSTERIORICASEOF__CORRESPONDING_PROPERTIES:
				return getCorrespondingProperties();
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.APOSTERIORICASEOF__CASE_OF_SUPER:
				setCaseOfSuper((CLASSREFERENCE)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.APOSTERIORICASEOF__CASE_OF_SUB:
				setCaseOfSub((CLASSREFERENCE)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.APOSTERIORICASEOF__CORRESPONDING_PROPERTIES:
				setCorrespondingProperties((CORRESPONDINGPROPERTIES)newValue);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.APOSTERIORICASEOF__CASE_OF_SUPER:
				setCaseOfSuper((CLASSREFERENCE)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.APOSTERIORICASEOF__CASE_OF_SUB:
				setCaseOfSub((CLASSREFERENCE)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.APOSTERIORICASEOF__CORRESPONDING_PROPERTIES:
				setCorrespondingProperties((CORRESPONDINGPROPERTIES)null);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.APOSTERIORICASEOF__CASE_OF_SUPER:
				return caseOfSuper != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.APOSTERIORICASEOF__CASE_OF_SUB:
				return caseOfSub != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.APOSTERIORICASEOF__CORRESPONDING_PROPERTIES:
				return correspondingProperties != null;
		}
		return super.eIsSet(featureID);
	}

} //APOSTERIORICASEOFImpl
