/**
 */
package eclassxmlschemacommon_2_0Simplified.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import eclassxmlschemacommon_2_0Simplified.Eclassxmlschemacommon_2_0SimplifiedPackage;
import eclassxmlschemacommon_2_0Simplified.QUERYAMOUNT;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QUERYAMOUNT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eclassxmlschemacommon_2_0Simplified.impl.QUERYAMOUNTImpl#getAlternativeUnit <em>Alternative Unit</em>}</li>
 *   <li>{@link eclassxmlschemacommon_2_0Simplified.impl.QUERYAMOUNTImpl#getBaseUnit <em>Base Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QUERYAMOUNTImpl extends MinimalEObjectImpl.Container implements QUERYAMOUNT {
	/**
	 * The default value of the '{@link #getAlternativeUnit() <em>Alternative Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternativeUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String ALTERNATIVE_UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlternativeUnit() <em>Alternative Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternativeUnit()
	 * @generated
	 * @ordered
	 */
	protected String alternativeUnit = ALTERNATIVE_UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBaseUnit() <em>Base Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseUnit() <em>Base Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseUnit()
	 * @generated
	 * @ordered
	 */
	protected String baseUnit = BASE_UNIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QUERYAMOUNTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Eclassxmlschemacommon_2_0SimplifiedPackage.Literals.QUERYAMOUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlternativeUnit() {
		return alternativeUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlternativeUnit(String newAlternativeUnit) {
		String oldAlternativeUnit = alternativeUnit;
		alternativeUnit = newAlternativeUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eclassxmlschemacommon_2_0SimplifiedPackage.QUERYAMOUNT__ALTERNATIVE_UNIT, oldAlternativeUnit, alternativeUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBaseUnit() {
		return baseUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseUnit(String newBaseUnit) {
		String oldBaseUnit = baseUnit;
		baseUnit = newBaseUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eclassxmlschemacommon_2_0SimplifiedPackage.QUERYAMOUNT__BASE_UNIT, oldBaseUnit, baseUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Eclassxmlschemacommon_2_0SimplifiedPackage.QUERYAMOUNT__ALTERNATIVE_UNIT:
				return getAlternativeUnit();
			case Eclassxmlschemacommon_2_0SimplifiedPackage.QUERYAMOUNT__BASE_UNIT:
				return getBaseUnit();
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
			case Eclassxmlschemacommon_2_0SimplifiedPackage.QUERYAMOUNT__ALTERNATIVE_UNIT:
				setAlternativeUnit((String)newValue);
				return;
			case Eclassxmlschemacommon_2_0SimplifiedPackage.QUERYAMOUNT__BASE_UNIT:
				setBaseUnit((String)newValue);
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
			case Eclassxmlschemacommon_2_0SimplifiedPackage.QUERYAMOUNT__ALTERNATIVE_UNIT:
				setAlternativeUnit(ALTERNATIVE_UNIT_EDEFAULT);
				return;
			case Eclassxmlschemacommon_2_0SimplifiedPackage.QUERYAMOUNT__BASE_UNIT:
				setBaseUnit(BASE_UNIT_EDEFAULT);
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
			case Eclassxmlschemacommon_2_0SimplifiedPackage.QUERYAMOUNT__ALTERNATIVE_UNIT:
				return ALTERNATIVE_UNIT_EDEFAULT == null ? alternativeUnit != null : !ALTERNATIVE_UNIT_EDEFAULT.equals(alternativeUnit);
			case Eclassxmlschemacommon_2_0SimplifiedPackage.QUERYAMOUNT__BASE_UNIT:
				return BASE_UNIT_EDEFAULT == null ? baseUnit != null : !BASE_UNIT_EDEFAULT.equals(baseUnit);
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
		result.append(" (alternativeUnit: ");
		result.append(alternativeUnit);
		result.append(", baseUnit: ");
		result.append(baseUnit);
		result.append(')');
		return result.toString();
	}

} //QUERYAMOUNTImpl
