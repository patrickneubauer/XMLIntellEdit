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
import eclassxmlschemacommon_2_0Simplified.VALUEREF;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target Values</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eclassxmlschemacommon_2_0Simplified.impl.TargetValuesImpl#getTargetValue <em>Target Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TargetValuesImpl extends MinimalEObjectImpl.Container implements TargetValues {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetValuesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Eclassxmlschemacommon_2_0SimplifiedPackage.Literals.TARGET_VALUES;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Eclassxmlschemacommon_2_0SimplifiedPackage.TARGET_VALUES__TARGET_VALUE, oldTargetValue, newTargetValue);
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
				msgs = ((InternalEObject)targetValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Eclassxmlschemacommon_2_0SimplifiedPackage.TARGET_VALUES__TARGET_VALUE, null, msgs);
			if (newTargetValue != null)
				msgs = ((InternalEObject)newTargetValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Eclassxmlschemacommon_2_0SimplifiedPackage.TARGET_VALUES__TARGET_VALUE, null, msgs);
			msgs = basicSetTargetValue(newTargetValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eclassxmlschemacommon_2_0SimplifiedPackage.TARGET_VALUES__TARGET_VALUE, newTargetValue, newTargetValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Eclassxmlschemacommon_2_0SimplifiedPackage.TARGET_VALUES__TARGET_VALUE:
				return basicSetTargetValue(null, msgs);
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
			case Eclassxmlschemacommon_2_0SimplifiedPackage.TARGET_VALUES__TARGET_VALUE:
				return getTargetValue();
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
			case Eclassxmlschemacommon_2_0SimplifiedPackage.TARGET_VALUES__TARGET_VALUE:
				setTargetValue((VALUEREF)newValue);
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
			case Eclassxmlschemacommon_2_0SimplifiedPackage.TARGET_VALUES__TARGET_VALUE:
				setTargetValue((VALUEREF)null);
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
			case Eclassxmlschemacommon_2_0SimplifiedPackage.TARGET_VALUES__TARGET_VALUE:
				return targetValue != null;
		}
		return super.eIsSet(featureID);
	}

} //TargetValuesImpl
