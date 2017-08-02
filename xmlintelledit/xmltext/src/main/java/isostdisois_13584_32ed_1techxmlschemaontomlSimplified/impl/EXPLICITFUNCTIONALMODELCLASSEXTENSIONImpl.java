/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CONTEXTPARAMICON;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.EXPLICITFUNCTIONALMODELCLASSEXTENSION;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ILLUSTRATION;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.MESSAGE;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PROPERTIESREFERENCE;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EXPLICITFUNCTIONALMODELCLASSEXTENSION</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.EXPLICITFUNCTIONALMODELCLASSEXTENSIONImpl#getRequiredItemValues <em>Required Item Values</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.EXPLICITFUNCTIONALMODELCLASSEXTENSIONImpl#getAvailableViewsIcon <em>Available Views Icon</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.EXPLICITFUNCTIONALMODELCLASSEXTENSIONImpl#getAvailableViewsMsg <em>Available Views Msg</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.EXPLICITFUNCTIONALMODELCLASSEXTENSIONImpl#getContextParamIcon <em>Context Param Icon</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.EXPLICITFUNCTIONALMODELCLASSEXTENSIONImpl#getContextParamMsg <em>Context Param Msg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EXPLICITFUNCTIONALMODELCLASSEXTENSIONImpl extends CLASSEXTENSIONImpl implements EXPLICITFUNCTIONALMODELCLASSEXTENSION {
	/**
	 * The cached value of the '{@link #getRequiredItemValues() <em>Required Item Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredItemValues()
	 * @generated
	 * @ordered
	 */
	protected PROPERTIESREFERENCE requiredItemValues;

	/**
	 * The cached value of the '{@link #getAvailableViewsIcon() <em>Available Views Icon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableViewsIcon()
	 * @generated
	 * @ordered
	 */
	protected ILLUSTRATION availableViewsIcon;

	/**
	 * The cached value of the '{@link #getAvailableViewsMsg() <em>Available Views Msg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableViewsMsg()
	 * @generated
	 * @ordered
	 */
	protected MESSAGE availableViewsMsg;

	/**
	 * The cached value of the '{@link #getContextParamIcon() <em>Context Param Icon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextParamIcon()
	 * @generated
	 * @ordered
	 */
	protected CONTEXTPARAMICON contextParamIcon;

	/**
	 * The cached value of the '{@link #getContextParamMsg() <em>Context Param Msg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextParamMsg()
	 * @generated
	 * @ordered
	 */
	protected MESSAGE contextParamMsg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EXPLICITFUNCTIONALMODELCLASSEXTENSIONImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.EXPLICITFUNCTIONALMODELCLASSEXTENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROPERTIESREFERENCE getRequiredItemValues() {
		return requiredItemValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequiredItemValues(PROPERTIESREFERENCE newRequiredItemValues, NotificationChain msgs) {
		PROPERTIESREFERENCE oldRequiredItemValues = requiredItemValues;
		requiredItemValues = newRequiredItemValues;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION__REQUIRED_ITEM_VALUES, oldRequiredItemValues, newRequiredItemValues);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredItemValues(PROPERTIESREFERENCE newRequiredItemValues) {
		if (newRequiredItemValues != requiredItemValues) {
			NotificationChain msgs = null;
			if (requiredItemValues != null)
				msgs = ((InternalEObject)requiredItemValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION__REQUIRED_ITEM_VALUES, null, msgs);
			if (newRequiredItemValues != null)
				msgs = ((InternalEObject)newRequiredItemValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION__REQUIRED_ITEM_VALUES, null, msgs);
			msgs = basicSetRequiredItemValues(newRequiredItemValues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION__REQUIRED_ITEM_VALUES, newRequiredItemValues, newRequiredItemValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ILLUSTRATION getAvailableViewsIcon() {
		return availableViewsIcon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAvailableViewsIcon(ILLUSTRATION newAvailableViewsIcon, NotificationChain msgs) {
		ILLUSTRATION oldAvailableViewsIcon = availableViewsIcon;
		availableViewsIcon = newAvailableViewsIcon;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION__AVAILABLE_VIEWS_ICON, oldAvailableViewsIcon, newAvailableViewsIcon);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailableViewsIcon(ILLUSTRATION newAvailableViewsIcon) {
		if (newAvailableViewsIcon != availableViewsIcon) {
			NotificationChain msgs = null;
			if (availableViewsIcon != null)
				msgs = ((InternalEObject)availableViewsIcon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION__AVAILABLE_VIEWS_ICON, null, msgs);
			if (newAvailableViewsIcon != null)
				msgs = ((InternalEObject)newAvailableViewsIcon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION__AVAILABLE_VIEWS_ICON, null, msgs);
			msgs = basicSetAvailableViewsIcon(newAvailableViewsIcon, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION__AVAILABLE_VIEWS_ICON, newAvailableViewsIcon, newAvailableViewsIcon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MESSAGE getAvailableViewsMsg() {
		return availableViewsMsg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAvailableViewsMsg(MESSAGE newAvailableViewsMsg, NotificationChain msgs) {
		MESSAGE oldAvailableViewsMsg = availableViewsMsg;
		availableViewsMsg = newAvailableViewsMsg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION__AVAILABLE_VIEWS_MSG, oldAvailableViewsMsg, newAvailableViewsMsg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailableViewsMsg(MESSAGE newAvailableViewsMsg) {
		if (newAvailableViewsMsg != availableViewsMsg) {
			NotificationChain msgs = null;
			if (availableViewsMsg != null)
				msgs = ((InternalEObject)availableViewsMsg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION__AVAILABLE_VIEWS_MSG, null, msgs);
			if (newAvailableViewsMsg != null)
				msgs = ((InternalEObject)newAvailableViewsMsg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION__AVAILABLE_VIEWS_MSG, null, msgs);
			msgs = basicSetAvailableViewsMsg(newAvailableViewsMsg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION__AVAILABLE_VIEWS_MSG, newAvailableViewsMsg, newAvailableViewsMsg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONTEXTPARAMICON getContextParamIcon() {
		return contextParamIcon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContextParamIcon(CONTEXTPARAMICON newContextParamIcon, NotificationChain msgs) {
		CONTEXTPARAMICON oldContextParamIcon = contextParamIcon;
		contextParamIcon = newContextParamIcon;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION__CONTEXT_PARAM_ICON, oldContextParamIcon, newContextParamIcon);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextParamIcon(CONTEXTPARAMICON newContextParamIcon) {
		if (newContextParamIcon != contextParamIcon) {
			NotificationChain msgs = null;
			if (contextParamIcon != null)
				msgs = ((InternalEObject)contextParamIcon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION__CONTEXT_PARAM_ICON, null, msgs);
			if (newContextParamIcon != null)
				msgs = ((InternalEObject)newContextParamIcon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION__CONTEXT_PARAM_ICON, null, msgs);
			msgs = basicSetContextParamIcon(newContextParamIcon, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION__CONTEXT_PARAM_ICON, newContextParamIcon, newContextParamIcon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MESSAGE getContextParamMsg() {
		return contextParamMsg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContextParamMsg(MESSAGE newContextParamMsg, NotificationChain msgs) {
		MESSAGE oldContextParamMsg = contextParamMsg;
		contextParamMsg = newContextParamMsg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION__CONTEXT_PARAM_MSG, oldContextParamMsg, newContextParamMsg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextParamMsg(MESSAGE newContextParamMsg) {
		if (newContextParamMsg != contextParamMsg) {
			NotificationChain msgs = null;
			if (contextParamMsg != null)
				msgs = ((InternalEObject)contextParamMsg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION__CONTEXT_PARAM_MSG, null, msgs);
			if (newContextParamMsg != null)
				msgs = ((InternalEObject)newContextParamMsg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION__CONTEXT_PARAM_MSG, null, msgs);
			msgs = basicSetContextParamMsg(newContextParamMsg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION__CONTEXT_PARAM_MSG, newContextParamMsg, newContextParamMsg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION__REQUIRED_ITEM_VALUES:
				return basicSetRequiredItemValues(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION__AVAILABLE_VIEWS_ICON:
				return basicSetAvailableViewsIcon(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION__AVAILABLE_VIEWS_MSG:
				return basicSetAvailableViewsMsg(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION__CONTEXT_PARAM_ICON:
				return basicSetContextParamIcon(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION__CONTEXT_PARAM_MSG:
				return basicSetContextParamMsg(null, msgs);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION__REQUIRED_ITEM_VALUES:
				return getRequiredItemValues();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION__AVAILABLE_VIEWS_ICON:
				return getAvailableViewsIcon();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION__AVAILABLE_VIEWS_MSG:
				return getAvailableViewsMsg();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION__CONTEXT_PARAM_ICON:
				return getContextParamIcon();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION__CONTEXT_PARAM_MSG:
				return getContextParamMsg();
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION__REQUIRED_ITEM_VALUES:
				setRequiredItemValues((PROPERTIESREFERENCE)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION__AVAILABLE_VIEWS_ICON:
				setAvailableViewsIcon((ILLUSTRATION)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION__AVAILABLE_VIEWS_MSG:
				setAvailableViewsMsg((MESSAGE)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION__CONTEXT_PARAM_ICON:
				setContextParamIcon((CONTEXTPARAMICON)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION__CONTEXT_PARAM_MSG:
				setContextParamMsg((MESSAGE)newValue);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION__REQUIRED_ITEM_VALUES:
				setRequiredItemValues((PROPERTIESREFERENCE)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION__AVAILABLE_VIEWS_ICON:
				setAvailableViewsIcon((ILLUSTRATION)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION__AVAILABLE_VIEWS_MSG:
				setAvailableViewsMsg((MESSAGE)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION__CONTEXT_PARAM_ICON:
				setContextParamIcon((CONTEXTPARAMICON)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION__CONTEXT_PARAM_MSG:
				setContextParamMsg((MESSAGE)null);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION__REQUIRED_ITEM_VALUES:
				return requiredItemValues != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION__AVAILABLE_VIEWS_ICON:
				return availableViewsIcon != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION__AVAILABLE_VIEWS_MSG:
				return availableViewsMsg != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION__CONTEXT_PARAM_ICON:
				return contextParamIcon != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.EXPLICITFUNCTIONALMODELCLASSEXTENSION__CONTEXT_PARAM_MSG:
				return contextParamMsg != null;
		}
		return super.eIsSet(featureID);
	}

} //EXPLICITFUNCTIONALMODELCLASSEXTENSIONImpl
