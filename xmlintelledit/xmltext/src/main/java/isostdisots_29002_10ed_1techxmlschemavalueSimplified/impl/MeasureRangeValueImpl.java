/**
 */
package isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.MeasureRangeValue;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.NumericValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure Range Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.MeasureRangeValueImpl#getLowerValue <em>Lower Value</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.MeasureRangeValueImpl#getUpperValue <em>Upper Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasureRangeValueImpl extends MeasureValueImpl implements MeasureRangeValue {
	/**
	 * The cached value of the '{@link #getLowerValue() <em>Lower Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerValue()
	 * @generated
	 * @ordered
	 */
	protected NumericValue lowerValue;

	/**
	 * The cached value of the '{@link #getUpperValue() <em>Upper Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperValue()
	 * @generated
	 * @ordered
	 */
	protected NumericValue upperValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasureRangeValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.Literals.MEASURE_RANGE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericValue getLowerValue() {
		return lowerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLowerValue(NumericValue newLowerValue, NotificationChain msgs) {
		NumericValue oldLowerValue = lowerValue;
		lowerValue = newLowerValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.MEASURE_RANGE_VALUE__LOWER_VALUE, oldLowerValue, newLowerValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerValue(NumericValue newLowerValue) {
		if (newLowerValue != lowerValue) {
			NotificationChain msgs = null;
			if (lowerValue != null)
				msgs = ((InternalEObject)lowerValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.MEASURE_RANGE_VALUE__LOWER_VALUE, null, msgs);
			if (newLowerValue != null)
				msgs = ((InternalEObject)newLowerValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.MEASURE_RANGE_VALUE__LOWER_VALUE, null, msgs);
			msgs = basicSetLowerValue(newLowerValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.MEASURE_RANGE_VALUE__LOWER_VALUE, newLowerValue, newLowerValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericValue getUpperValue() {
		return upperValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpperValue(NumericValue newUpperValue, NotificationChain msgs) {
		NumericValue oldUpperValue = upperValue;
		upperValue = newUpperValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.MEASURE_RANGE_VALUE__UPPER_VALUE, oldUpperValue, newUpperValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperValue(NumericValue newUpperValue) {
		if (newUpperValue != upperValue) {
			NotificationChain msgs = null;
			if (upperValue != null)
				msgs = ((InternalEObject)upperValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.MEASURE_RANGE_VALUE__UPPER_VALUE, null, msgs);
			if (newUpperValue != null)
				msgs = ((InternalEObject)newUpperValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.MEASURE_RANGE_VALUE__UPPER_VALUE, null, msgs);
			msgs = basicSetUpperValue(newUpperValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.MEASURE_RANGE_VALUE__UPPER_VALUE, newUpperValue, newUpperValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.MEASURE_RANGE_VALUE__LOWER_VALUE:
				return basicSetLowerValue(null, msgs);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.MEASURE_RANGE_VALUE__UPPER_VALUE:
				return basicSetUpperValue(null, msgs);
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
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.MEASURE_RANGE_VALUE__LOWER_VALUE:
				return getLowerValue();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.MEASURE_RANGE_VALUE__UPPER_VALUE:
				return getUpperValue();
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
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.MEASURE_RANGE_VALUE__LOWER_VALUE:
				setLowerValue((NumericValue)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.MEASURE_RANGE_VALUE__UPPER_VALUE:
				setUpperValue((NumericValue)newValue);
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
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.MEASURE_RANGE_VALUE__LOWER_VALUE:
				setLowerValue((NumericValue)null);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.MEASURE_RANGE_VALUE__UPPER_VALUE:
				setUpperValue((NumericValue)null);
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
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.MEASURE_RANGE_VALUE__LOWER_VALUE:
				return lowerValue != null;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.MEASURE_RANGE_VALUE__UPPER_VALUE:
				return upperValue != null;
		}
		return super.eIsSet(featureID);
	}

} //MeasureRangeValueImpl
