/**
 */
package eclassxmlschemacommon_2_0Simplified.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import eclassxmlschemacommon_2_0Simplified.Eclassxmlschemacommon_2_0SimplifiedPackage;
import eclassxmlschemacommon_2_0Simplified.PROPERTYELM;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PROPERTYELM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eclassxmlschemacommon_2_0Simplified.impl.PROPERTYELMImpl#getOrdinalNumber <em>Ordinal Number</em>}</li>
 *   <li>{@link eclassxmlschemacommon_2_0Simplified.impl.PROPERTYELMImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link eclassxmlschemacommon_2_0Simplified.impl.PROPERTYELMImpl#getTargetClassRef <em>Target Class Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PROPERTYELMImpl extends MinimalEObjectImpl.Container implements PROPERTYELM {
	/**
	 * The default value of the '{@link #getOrdinalNumber() <em>Ordinal Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdinalNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int ORDINAL_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOrdinalNumber() <em>Ordinal Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdinalNumber()
	 * @generated
	 * @ordered
	 */
	protected int ordinalNumber = ORDINAL_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getRef() <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRef() <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected String ref = REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetClassRef() <em>Target Class Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetClassRef()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_CLASS_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetClassRef() <em>Target Class Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetClassRef()
	 * @generated
	 * @ordered
	 */
	protected String targetClassRef = TARGET_CLASS_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PROPERTYELMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Eclassxmlschemacommon_2_0SimplifiedPackage.Literals.PROPERTYELM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOrdinalNumber() {
		return ordinalNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrdinalNumber(int newOrdinalNumber) {
		int oldOrdinalNumber = ordinalNumber;
		ordinalNumber = newOrdinalNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eclassxmlschemacommon_2_0SimplifiedPackage.PROPERTYELM__ORDINAL_NUMBER, oldOrdinalNumber, ordinalNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRef() {
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRef(String newRef) {
		String oldRef = ref;
		ref = newRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eclassxmlschemacommon_2_0SimplifiedPackage.PROPERTYELM__REF, oldRef, ref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetClassRef() {
		return targetClassRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetClassRef(String newTargetClassRef) {
		String oldTargetClassRef = targetClassRef;
		targetClassRef = newTargetClassRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Eclassxmlschemacommon_2_0SimplifiedPackage.PROPERTYELM__TARGET_CLASS_REF, oldTargetClassRef, targetClassRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Eclassxmlschemacommon_2_0SimplifiedPackage.PROPERTYELM__ORDINAL_NUMBER:
				return getOrdinalNumber();
			case Eclassxmlschemacommon_2_0SimplifiedPackage.PROPERTYELM__REF:
				return getRef();
			case Eclassxmlschemacommon_2_0SimplifiedPackage.PROPERTYELM__TARGET_CLASS_REF:
				return getTargetClassRef();
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
			case Eclassxmlschemacommon_2_0SimplifiedPackage.PROPERTYELM__ORDINAL_NUMBER:
				setOrdinalNumber((Integer)newValue);
				return;
			case Eclassxmlschemacommon_2_0SimplifiedPackage.PROPERTYELM__REF:
				setRef((String)newValue);
				return;
			case Eclassxmlschemacommon_2_0SimplifiedPackage.PROPERTYELM__TARGET_CLASS_REF:
				setTargetClassRef((String)newValue);
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
			case Eclassxmlschemacommon_2_0SimplifiedPackage.PROPERTYELM__ORDINAL_NUMBER:
				setOrdinalNumber(ORDINAL_NUMBER_EDEFAULT);
				return;
			case Eclassxmlschemacommon_2_0SimplifiedPackage.PROPERTYELM__REF:
				setRef(REF_EDEFAULT);
				return;
			case Eclassxmlschemacommon_2_0SimplifiedPackage.PROPERTYELM__TARGET_CLASS_REF:
				setTargetClassRef(TARGET_CLASS_REF_EDEFAULT);
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
			case Eclassxmlschemacommon_2_0SimplifiedPackage.PROPERTYELM__ORDINAL_NUMBER:
				return ordinalNumber != ORDINAL_NUMBER_EDEFAULT;
			case Eclassxmlschemacommon_2_0SimplifiedPackage.PROPERTYELM__REF:
				return REF_EDEFAULT == null ? ref != null : !REF_EDEFAULT.equals(ref);
			case Eclassxmlschemacommon_2_0SimplifiedPackage.PROPERTYELM__TARGET_CLASS_REF:
				return TARGET_CLASS_REF_EDEFAULT == null ? targetClassRef != null : !TARGET_CLASS_REF_EDEFAULT.equals(targetClassRef);
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
		result.append(" (ordinalNumber: ");
		result.append(ordinalNumber);
		result.append(", ref: ");
		result.append(ref);
		result.append(", targetClassRef: ");
		result.append(targetClassRef);
		result.append(')');
		return result.toString();
	}

} //PROPERTYELMImpl
