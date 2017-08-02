/**
 */
package eclassxmlschemacommon_2_0Simplified.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import eclassxmlschemacommon_2_0Simplified.Eclassxmlschemacommon_2_0SimplifiedPackage;
import eclassxmlschemacommon_2_0Simplified.UNITMAPPING;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UNITMAPPING</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eclassxmlschemacommon_2_0Simplified.impl.UNITMAPPINGImpl#getSourceUnit <em>Source Unit</em>}</li>
 *   <li>{@link eclassxmlschemacommon_2_0Simplified.impl.UNITMAPPINGImpl#getTargetUnit <em>Target Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UNITMAPPINGImpl extends MinimalEObjectImpl.Container implements UNITMAPPING {
	/**
	 * The default value of the '{@link #getSourceUnit() <em>Source Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceUnit() <em>Source Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceUnit()
	 * @generated
	 * @ordered
	 */
	protected String sourceUnit = SOURCE_UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetUnit() <em>Target Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetUnit() <em>Target Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetUnit()
	 * @generated
	 * @ordered
	 */
	protected String targetUnit = TARGET_UNIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UNITMAPPINGImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Eclassxmlschemacommon_2_0SimplifiedPackage.Literals.UNITMAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceUnit() {
		return sourceUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceUnit(String newSourceUnit) {
		String oldSourceUnit = sourceUnit;
		sourceUnit = newSourceUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eclassxmlschemacommon_2_0SimplifiedPackage.UNITMAPPING__SOURCE_UNIT, oldSourceUnit, sourceUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetUnit() {
		return targetUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetUnit(String newTargetUnit) {
		String oldTargetUnit = targetUnit;
		targetUnit = newTargetUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eclassxmlschemacommon_2_0SimplifiedPackage.UNITMAPPING__TARGET_UNIT, oldTargetUnit, targetUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Eclassxmlschemacommon_2_0SimplifiedPackage.UNITMAPPING__SOURCE_UNIT:
				return getSourceUnit();
			case Eclassxmlschemacommon_2_0SimplifiedPackage.UNITMAPPING__TARGET_UNIT:
				return getTargetUnit();
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
			case Eclassxmlschemacommon_2_0SimplifiedPackage.UNITMAPPING__SOURCE_UNIT:
				setSourceUnit((String)newValue);
				return;
			case Eclassxmlschemacommon_2_0SimplifiedPackage.UNITMAPPING__TARGET_UNIT:
				setTargetUnit((String)newValue);
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
			case Eclassxmlschemacommon_2_0SimplifiedPackage.UNITMAPPING__SOURCE_UNIT:
				setSourceUnit(SOURCE_UNIT_EDEFAULT);
				return;
			case Eclassxmlschemacommon_2_0SimplifiedPackage.UNITMAPPING__TARGET_UNIT:
				setTargetUnit(TARGET_UNIT_EDEFAULT);
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
			case Eclassxmlschemacommon_2_0SimplifiedPackage.UNITMAPPING__SOURCE_UNIT:
				return SOURCE_UNIT_EDEFAULT == null ? sourceUnit != null : !SOURCE_UNIT_EDEFAULT.equals(sourceUnit);
			case Eclassxmlschemacommon_2_0SimplifiedPackage.UNITMAPPING__TARGET_UNIT:
				return TARGET_UNIT_EDEFAULT == null ? targetUnit != null : !TARGET_UNIT_EDEFAULT.equals(targetUnit);
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
		result.append(" (sourceUnit: ");
		result.append(sourceUnit);
		result.append(", targetUnit: ");
		result.append(targetUnit);
		result.append(')');
		return result.toString();
	}

} //UNITMAPPINGImpl
