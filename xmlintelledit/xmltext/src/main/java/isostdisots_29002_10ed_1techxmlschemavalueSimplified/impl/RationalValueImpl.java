/**
 */
package isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.RationalValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rational Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.RationalValueImpl#getWholePart <em>Whole Part</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.RationalValueImpl#getNumerator <em>Numerator</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.RationalValueImpl#getDenominator <em>Denominator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RationalValueImpl extends MinimalEObjectImpl.Container implements RationalValue {
	/**
	 * The default value of the '{@link #getWholePart() <em>Whole Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWholePart()
	 * @generated
	 * @ordered
	 */
	protected static final int WHOLE_PART_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWholePart() <em>Whole Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWholePart()
	 * @generated
	 * @ordered
	 */
	protected int wholePart = WHOLE_PART_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumerator() <em>Numerator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumerator()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMERATOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumerator() <em>Numerator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumerator()
	 * @generated
	 * @ordered
	 */
	protected int numerator = NUMERATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDenominator() <em>Denominator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDenominator()
	 * @generated
	 * @ordered
	 */
	protected static final int DENOMINATOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDenominator() <em>Denominator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDenominator()
	 * @generated
	 * @ordered
	 */
	protected int denominator = DENOMINATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RationalValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.Literals.RATIONAL_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWholePart() {
		return wholePart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWholePart(int newWholePart) {
		int oldWholePart = wholePart;
		wholePart = newWholePart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.RATIONAL_VALUE__WHOLE_PART, oldWholePart, wholePart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumerator() {
		return numerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumerator(int newNumerator) {
		int oldNumerator = numerator;
		numerator = newNumerator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.RATIONAL_VALUE__NUMERATOR, oldNumerator, numerator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDenominator() {
		return denominator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDenominator(int newDenominator) {
		int oldDenominator = denominator;
		denominator = newDenominator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.RATIONAL_VALUE__DENOMINATOR, oldDenominator, denominator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.RATIONAL_VALUE__WHOLE_PART:
				return getWholePart();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.RATIONAL_VALUE__NUMERATOR:
				return getNumerator();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.RATIONAL_VALUE__DENOMINATOR:
				return getDenominator();
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
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.RATIONAL_VALUE__WHOLE_PART:
				setWholePart((Integer)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.RATIONAL_VALUE__NUMERATOR:
				setNumerator((Integer)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.RATIONAL_VALUE__DENOMINATOR:
				setDenominator((Integer)newValue);
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
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.RATIONAL_VALUE__WHOLE_PART:
				setWholePart(WHOLE_PART_EDEFAULT);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.RATIONAL_VALUE__NUMERATOR:
				setNumerator(NUMERATOR_EDEFAULT);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.RATIONAL_VALUE__DENOMINATOR:
				setDenominator(DENOMINATOR_EDEFAULT);
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
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.RATIONAL_VALUE__WHOLE_PART:
				return wholePart != WHOLE_PART_EDEFAULT;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.RATIONAL_VALUE__NUMERATOR:
				return numerator != NUMERATOR_EDEFAULT;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.RATIONAL_VALUE__DENOMINATOR:
				return denominator != DENOMINATOR_EDEFAULT;
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
		result.append(" (wholePart: ");
		result.append(wholePart);
		result.append(", numerator: ");
		result.append(numerator);
		result.append(", denominator: ");
		result.append(denominator);
		result.append(')');
		return result.toString();
	}

} //RationalValueImpl
