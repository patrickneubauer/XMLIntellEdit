/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ANYTYPE;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.LISTTYPE;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LISTTYPE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.LISTTYPEImpl#isUniqueness <em>Uniqueness</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.LISTTYPEImpl#getValueType <em>Value Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LISTTYPEImpl extends ANYTYPEImpl implements LISTTYPE {
	/**
	 * The default value of the '{@link #isUniqueness() <em>Uniqueness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUniqueness()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNIQUENESS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUniqueness() <em>Uniqueness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUniqueness()
	 * @generated
	 * @ordered
	 */
	protected boolean uniqueness = UNIQUENESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValueType() <em>Value Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueType()
	 * @generated
	 * @ordered
	 */
	protected ANYTYPE valueType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LISTTYPEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.LISTTYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUniqueness() {
		return uniqueness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniqueness(boolean newUniqueness) {
		boolean oldUniqueness = uniqueness;
		uniqueness = newUniqueness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.LISTTYPE__UNIQUENESS, oldUniqueness, uniqueness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ANYTYPE getValueType() {
		return valueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueType(ANYTYPE newValueType, NotificationChain msgs) {
		ANYTYPE oldValueType = valueType;
		valueType = newValueType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.LISTTYPE__VALUE_TYPE, oldValueType, newValueType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueType(ANYTYPE newValueType) {
		if (newValueType != valueType) {
			NotificationChain msgs = null;
			if (valueType != null)
				msgs = ((InternalEObject)valueType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.LISTTYPE__VALUE_TYPE, null, msgs);
			if (newValueType != null)
				msgs = ((InternalEObject)newValueType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.LISTTYPE__VALUE_TYPE, null, msgs);
			msgs = basicSetValueType(newValueType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.LISTTYPE__VALUE_TYPE, newValueType, newValueType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.LISTTYPE__VALUE_TYPE:
				return basicSetValueType(null, msgs);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.LISTTYPE__UNIQUENESS:
				return isUniqueness();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.LISTTYPE__VALUE_TYPE:
				return getValueType();
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.LISTTYPE__UNIQUENESS:
				setUniqueness((Boolean)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.LISTTYPE__VALUE_TYPE:
				setValueType((ANYTYPE)newValue);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.LISTTYPE__UNIQUENESS:
				setUniqueness(UNIQUENESS_EDEFAULT);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.LISTTYPE__VALUE_TYPE:
				setValueType((ANYTYPE)null);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.LISTTYPE__UNIQUENESS:
				return uniqueness != UNIQUENESS_EDEFAULT;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.LISTTYPE__VALUE_TYPE:
				return valueType != null;
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
		result.append(" (uniqueness: ");
		result.append(uniqueness);
		result.append(')');
		return result.toString();
	}

} //LISTTYPEImpl
