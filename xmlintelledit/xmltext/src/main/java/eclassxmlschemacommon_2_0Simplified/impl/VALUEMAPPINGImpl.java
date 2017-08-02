/**
 */
package eclassxmlschemacommon_2_0Simplified.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import eclassxmlschemacommon_2_0Simplified.Eclassxmlschemacommon_2_0SimplifiedPackage;
import eclassxmlschemacommon_2_0Simplified.TargetValues;
import eclassxmlschemacommon_2_0Simplified.VALUEMAPPING;
import eclassxmlschemacommon_2_0Simplified.VALUEREF;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VALUEMAPPING</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eclassxmlschemacommon_2_0Simplified.impl.VALUEMAPPINGImpl#getSourceValue <em>Source Value</em>}</li>
 *   <li>{@link eclassxmlschemacommon_2_0Simplified.impl.VALUEMAPPINGImpl#getTargetValue <em>Target Value</em>}</li>
 *   <li>{@link eclassxmlschemacommon_2_0Simplified.impl.VALUEMAPPINGImpl#getTargetValues <em>Target Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VALUEMAPPINGImpl extends MinimalEObjectImpl.Container implements VALUEMAPPING {
	/**
	 * The cached value of the '{@link #getSourceValue() <em>Source Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceValue()
	 * @generated
	 * @ordered
	 */
	protected VALUEREF sourceValue;

	/**
	 * The cached value of the '{@link #getTargetValue() <em>Target Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetValue()
	 * @generated
	 * @ordered
	 */
	protected VALUEREF targetValue;

	/**
	 * The cached value of the '{@link #getTargetValues() <em>Target Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetValues()
	 * @generated
	 * @ordered
	 */
	protected TargetValues targetValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VALUEMAPPINGImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Eclassxmlschemacommon_2_0SimplifiedPackage.Literals.VALUEMAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VALUEREF getSourceValue() {
		return sourceValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceValue(VALUEREF newSourceValue, NotificationChain msgs) {
		VALUEREF oldSourceValue = sourceValue;
		sourceValue = newSourceValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Eclassxmlschemacommon_2_0SimplifiedPackage.VALUEMAPPING__SOURCE_VALUE, oldSourceValue, newSourceValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceValue(VALUEREF newSourceValue) {
		if (newSourceValue != sourceValue) {
			NotificationChain msgs = null;
			if (sourceValue != null)
				msgs = ((InternalEObject)sourceValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Eclassxmlschemacommon_2_0SimplifiedPackage.VALUEMAPPING__SOURCE_VALUE, null, msgs);
			if (newSourceValue != null)
				msgs = ((InternalEObject)newSourceValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Eclassxmlschemacommon_2_0SimplifiedPackage.VALUEMAPPING__SOURCE_VALUE, null, msgs);
			msgs = basicSetSourceValue(newSourceValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eclassxmlschemacommon_2_0SimplifiedPackage.VALUEMAPPING__SOURCE_VALUE, newSourceValue, newSourceValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VALUEREF getTargetValue() {
		return targetValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetValue(VALUEREF newTargetValue, NotificationChain msgs) {
		VALUEREF oldTargetValue = targetValue;
		targetValue = newTargetValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Eclassxmlschemacommon_2_0SimplifiedPackage.VALUEMAPPING__TARGET_VALUE, oldTargetValue, newTargetValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetValue(VALUEREF newTargetValue) {
		if (newTargetValue != targetValue) {
			NotificationChain msgs = null;
			if (targetValue != null)
				msgs = ((InternalEObject)targetValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Eclassxmlschemacommon_2_0SimplifiedPackage.VALUEMAPPING__TARGET_VALUE, null, msgs);
			if (newTargetValue != null)
				msgs = ((InternalEObject)newTargetValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Eclassxmlschemacommon_2_0SimplifiedPackage.VALUEMAPPING__TARGET_VALUE, null, msgs);
			msgs = basicSetTargetValue(newTargetValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eclassxmlschemacommon_2_0SimplifiedPackage.VALUEMAPPING__TARGET_VALUE, newTargetValue, newTargetValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetValues getTargetValues() {
		return targetValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetValues(TargetValues newTargetValues, NotificationChain msgs) {
		TargetValues oldTargetValues = targetValues;
		targetValues = newTargetValues;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Eclassxmlschemacommon_2_0SimplifiedPackage.VALUEMAPPING__TARGET_VALUES, oldTargetValues, newTargetValues);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetValues(TargetValues newTargetValues) {
		if (newTargetValues != targetValues) {
			NotificationChain msgs = null;
			if (targetValues != null)
				msgs = ((InternalEObject)targetValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Eclassxmlschemacommon_2_0SimplifiedPackage.VALUEMAPPING__TARGET_VALUES, null, msgs);
			if (newTargetValues != null)
				msgs = ((InternalEObject)newTargetValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Eclassxmlschemacommon_2_0SimplifiedPackage.VALUEMAPPING__TARGET_VALUES, null, msgs);
			msgs = basicSetTargetValues(newTargetValues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eclassxmlschemacommon_2_0SimplifiedPackage.VALUEMAPPING__TARGET_VALUES, newTargetValues, newTargetValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Eclassxmlschemacommon_2_0SimplifiedPackage.VALUEMAPPING__SOURCE_VALUE:
				return basicSetSourceValue(null, msgs);
			case Eclassxmlschemacommon_2_0SimplifiedPackage.VALUEMAPPING__TARGET_VALUE:
				return basicSetTargetValue(null, msgs);
			case Eclassxmlschemacommon_2_0SimplifiedPackage.VALUEMAPPING__TARGET_VALUES:
				return basicSetTargetValues(null, msgs);
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
			case Eclassxmlschemacommon_2_0SimplifiedPackage.VALUEMAPPING__SOURCE_VALUE:
				return getSourceValue();
			case Eclassxmlschemacommon_2_0SimplifiedPackage.VALUEMAPPING__TARGET_VALUE:
				return getTargetValue();
			case Eclassxmlschemacommon_2_0SimplifiedPackage.VALUEMAPPING__TARGET_VALUES:
				return getTargetValues();
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
			case Eclassxmlschemacommon_2_0SimplifiedPackage.VALUEMAPPING__SOURCE_VALUE:
				setSourceValue((VALUEREF)newValue);
				return;
			case Eclassxmlschemacommon_2_0SimplifiedPackage.VALUEMAPPING__TARGET_VALUE:
				setTargetValue((VALUEREF)newValue);
				return;
			case Eclassxmlschemacommon_2_0SimplifiedPackage.VALUEMAPPING__TARGET_VALUES:
				setTargetValues((TargetValues)newValue);
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
			case Eclassxmlschemacommon_2_0SimplifiedPackage.VALUEMAPPING__SOURCE_VALUE:
				setSourceValue((VALUEREF)null);
				return;
			case Eclassxmlschemacommon_2_0SimplifiedPackage.VALUEMAPPING__TARGET_VALUE:
				setTargetValue((VALUEREF)null);
				return;
			case Eclassxmlschemacommon_2_0SimplifiedPackage.VALUEMAPPING__TARGET_VALUES:
				setTargetValues((TargetValues)null);
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
			case Eclassxmlschemacommon_2_0SimplifiedPackage.VALUEMAPPING__SOURCE_VALUE:
				return sourceValue != null;
			case Eclassxmlschemacommon_2_0SimplifiedPackage.VALUEMAPPING__TARGET_VALUE:
				return targetValue != null;
			case Eclassxmlschemacommon_2_0SimplifiedPackage.VALUEMAPPING__TARGET_VALUES:
				return targetValues != null;
		}
		return super.eIsSet(featureID);
	}

} //VALUEMAPPINGImpl
