/**
 */
package isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import isostdisots_29002_10ed_1techxmlschemavalueSimplified.ControlledValue;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controlled Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.ControlledValueImpl#getValueCode <em>Value Code</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.ControlledValueImpl#getValueRef <em>Value Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlledValueImpl extends MinimalEObjectImpl.Container implements ControlledValue {
	/**
	 * The default value of the '{@link #getValueCode() <em>Value Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueCode()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueCode() <em>Value Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueCode()
	 * @generated
	 * @ordered
	 */
	protected String valueCode = VALUE_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueRef() <em>Value Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueRef()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueRef() <em>Value Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueRef()
	 * @generated
	 * @ordered
	 */
	protected String valueRef = VALUE_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlledValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.Literals.CONTROLLED_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueCode() {
		return valueCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueCode(String newValueCode) {
		String oldValueCode = valueCode;
		valueCode = newValueCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.CONTROLLED_VALUE__VALUE_CODE, oldValueCode, valueCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueRef() {
		return valueRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueRef(String newValueRef) {
		String oldValueRef = valueRef;
		valueRef = newValueRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.CONTROLLED_VALUE__VALUE_REF, oldValueRef, valueRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.CONTROLLED_VALUE__VALUE_CODE:
				return getValueCode();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.CONTROLLED_VALUE__VALUE_REF:
				return getValueRef();
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
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.CONTROLLED_VALUE__VALUE_CODE:
				setValueCode((String)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.CONTROLLED_VALUE__VALUE_REF:
				setValueRef((String)newValue);
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
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.CONTROLLED_VALUE__VALUE_CODE:
				setValueCode(VALUE_CODE_EDEFAULT);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.CONTROLLED_VALUE__VALUE_REF:
				setValueRef(VALUE_REF_EDEFAULT);
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
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.CONTROLLED_VALUE__VALUE_CODE:
				return VALUE_CODE_EDEFAULT == null ? valueCode != null : !VALUE_CODE_EDEFAULT.equals(valueCode);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.CONTROLLED_VALUE__VALUE_REF:
				return VALUE_REF_EDEFAULT == null ? valueRef != null : !VALUE_REF_EDEFAULT.equals(valueRef);
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
		result.append(" (valueCode: ");
		result.append(valueCode);
		result.append(", valueRef: ");
		result.append(valueRef);
		result.append(')');
		return result.toString();
	}

} //ControlledValueImpl
