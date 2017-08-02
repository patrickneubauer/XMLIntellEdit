/**
 */
package isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.MeasureValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.MeasureValueImpl#getUOMCode <em>UOM Code</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.MeasureValueImpl#getUOMRef <em>UOM Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasureValueImpl extends MinimalEObjectImpl.Container implements MeasureValue {
	/**
	 * The default value of the '{@link #getUOMCode() <em>UOM Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUOMCode()
	 * @generated
	 * @ordered
	 */
	protected static final String UOM_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUOMCode() <em>UOM Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUOMCode()
	 * @generated
	 * @ordered
	 */
	protected String uOMCode = UOM_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUOMRef() <em>UOM Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUOMRef()
	 * @generated
	 * @ordered
	 */
	protected static final String UOM_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUOMRef() <em>UOM Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUOMRef()
	 * @generated
	 * @ordered
	 */
	protected String uOMRef = UOM_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasureValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.Literals.MEASURE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUOMCode() {
		return uOMCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUOMCode(String newUOMCode) {
		String oldUOMCode = uOMCode;
		uOMCode = newUOMCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.MEASURE_VALUE__UOM_CODE, oldUOMCode, uOMCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUOMRef() {
		return uOMRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUOMRef(String newUOMRef) {
		String oldUOMRef = uOMRef;
		uOMRef = newUOMRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.MEASURE_VALUE__UOM_REF, oldUOMRef, uOMRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.MEASURE_VALUE__UOM_CODE:
				return getUOMCode();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.MEASURE_VALUE__UOM_REF:
				return getUOMRef();
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
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.MEASURE_VALUE__UOM_CODE:
				setUOMCode((String)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.MEASURE_VALUE__UOM_REF:
				setUOMRef((String)newValue);
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
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.MEASURE_VALUE__UOM_CODE:
				setUOMCode(UOM_CODE_EDEFAULT);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.MEASURE_VALUE__UOM_REF:
				setUOMRef(UOM_REF_EDEFAULT);
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
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.MEASURE_VALUE__UOM_CODE:
				return UOM_CODE_EDEFAULT == null ? uOMCode != null : !UOM_CODE_EDEFAULT.equals(uOMCode);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.MEASURE_VALUE__UOM_REF:
				return UOM_REF_EDEFAULT == null ? uOMRef != null : !UOM_REF_EDEFAULT.equals(uOMRef);
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
		result.append(" (uOMCode: ");
		result.append(uOMCode);
		result.append(", uOMRef: ");
		result.append(uOMRef);
		result.append(')');
		return result.toString();
	}

} //MeasureValueImpl
