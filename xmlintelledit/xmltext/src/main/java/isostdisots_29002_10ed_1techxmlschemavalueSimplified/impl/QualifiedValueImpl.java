/**
 */
package isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import isostdisots_29002_10ed_1techxmlschemavalueSimplified.ComplexValue;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.IntegerValue;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.QualifiedValue;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.RationalValue;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.RealValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qualified Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.QualifiedValueImpl#getQualifierCode <em>Qualifier Code</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.QualifiedValueImpl#getQualifierRef <em>Qualifier Ref</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.QualifiedValueImpl#getRealValue <em>Real Value</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.QualifiedValueImpl#getComplexValue <em>Complex Value</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.QualifiedValueImpl#getIntegerValue <em>Integer Value</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.QualifiedValueImpl#getRationalValue <em>Rational Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QualifiedValueImpl extends MinimalEObjectImpl.Container implements QualifiedValue {
	/**
	 * The default value of the '{@link #getQualifierCode() <em>Qualifier Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifierCode()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFIER_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQualifierCode() <em>Qualifier Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifierCode()
	 * @generated
	 * @ordered
	 */
	protected String qualifierCode = QUALIFIER_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getQualifierRef() <em>Qualifier Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifierRef()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFIER_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQualifierRef() <em>Qualifier Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifierRef()
	 * @generated
	 * @ordered
	 */
	protected String qualifierRef = QUALIFIER_REF_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRealValue() <em>Real Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealValue()
	 * @generated
	 * @ordered
	 */
	protected RealValue realValue;

	/**
	 * The cached value of the '{@link #getComplexValue() <em>Complex Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplexValue()
	 * @generated
	 * @ordered
	 */
	protected ComplexValue complexValue;

	/**
	 * The cached value of the '{@link #getIntegerValue() <em>Integer Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegerValue()
	 * @generated
	 * @ordered
	 */
	protected IntegerValue integerValue;

	/**
	 * The cached value of the '{@link #getRationalValue() <em>Rational Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationalValue()
	 * @generated
	 * @ordered
	 */
	protected RationalValue rationalValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualifiedValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.Literals.QUALIFIED_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQualifierCode() {
		return qualifierCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifierCode(String newQualifierCode) {
		String oldQualifierCode = qualifierCode;
		qualifierCode = newQualifierCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.QUALIFIED_VALUE__QUALIFIER_CODE, oldQualifierCode, qualifierCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQualifierRef() {
		return qualifierRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifierRef(String newQualifierRef) {
		String oldQualifierRef = qualifierRef;
		qualifierRef = newQualifierRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.QUALIFIED_VALUE__QUALIFIER_REF, oldQualifierRef, qualifierRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealValue getRealValue() {
		return realValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRealValue(RealValue newRealValue, NotificationChain msgs) {
		RealValue oldRealValue = realValue;
		realValue = newRealValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.QUALIFIED_VALUE__REAL_VALUE, oldRealValue, newRealValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealValue(RealValue newRealValue) {
		if (newRealValue != realValue) {
			NotificationChain msgs = null;
			if (realValue != null)
				msgs = ((InternalEObject)realValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.QUALIFIED_VALUE__REAL_VALUE, null, msgs);
			if (newRealValue != null)
				msgs = ((InternalEObject)newRealValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.QUALIFIED_VALUE__REAL_VALUE, null, msgs);
			msgs = basicSetRealValue(newRealValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.QUALIFIED_VALUE__REAL_VALUE, newRealValue, newRealValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexValue getComplexValue() {
		return complexValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComplexValue(ComplexValue newComplexValue, NotificationChain msgs) {
		ComplexValue oldComplexValue = complexValue;
		complexValue = newComplexValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.QUALIFIED_VALUE__COMPLEX_VALUE, oldComplexValue, newComplexValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplexValue(ComplexValue newComplexValue) {
		if (newComplexValue != complexValue) {
			NotificationChain msgs = null;
			if (complexValue != null)
				msgs = ((InternalEObject)complexValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.QUALIFIED_VALUE__COMPLEX_VALUE, null, msgs);
			if (newComplexValue != null)
				msgs = ((InternalEObject)newComplexValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.QUALIFIED_VALUE__COMPLEX_VALUE, null, msgs);
			msgs = basicSetComplexValue(newComplexValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.QUALIFIED_VALUE__COMPLEX_VALUE, newComplexValue, newComplexValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerValue getIntegerValue() {
		return integerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntegerValue(IntegerValue newIntegerValue, NotificationChain msgs) {
		IntegerValue oldIntegerValue = integerValue;
		integerValue = newIntegerValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.QUALIFIED_VALUE__INTEGER_VALUE, oldIntegerValue, newIntegerValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntegerValue(IntegerValue newIntegerValue) {
		if (newIntegerValue != integerValue) {
			NotificationChain msgs = null;
			if (integerValue != null)
				msgs = ((InternalEObject)integerValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.QUALIFIED_VALUE__INTEGER_VALUE, null, msgs);
			if (newIntegerValue != null)
				msgs = ((InternalEObject)newIntegerValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.QUALIFIED_VALUE__INTEGER_VALUE, null, msgs);
			msgs = basicSetIntegerValue(newIntegerValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.QUALIFIED_VALUE__INTEGER_VALUE, newIntegerValue, newIntegerValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RationalValue getRationalValue() {
		return rationalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRationalValue(RationalValue newRationalValue, NotificationChain msgs) {
		RationalValue oldRationalValue = rationalValue;
		rationalValue = newRationalValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.QUALIFIED_VALUE__RATIONAL_VALUE, oldRationalValue, newRationalValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRationalValue(RationalValue newRationalValue) {
		if (newRationalValue != rationalValue) {
			NotificationChain msgs = null;
			if (rationalValue != null)
				msgs = ((InternalEObject)rationalValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.QUALIFIED_VALUE__RATIONAL_VALUE, null, msgs);
			if (newRationalValue != null)
				msgs = ((InternalEObject)newRationalValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.QUALIFIED_VALUE__RATIONAL_VALUE, null, msgs);
			msgs = basicSetRationalValue(newRationalValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.QUALIFIED_VALUE__RATIONAL_VALUE, newRationalValue, newRationalValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.QUALIFIED_VALUE__REAL_VALUE:
				return basicSetRealValue(null, msgs);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.QUALIFIED_VALUE__COMPLEX_VALUE:
				return basicSetComplexValue(null, msgs);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.QUALIFIED_VALUE__INTEGER_VALUE:
				return basicSetIntegerValue(null, msgs);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.QUALIFIED_VALUE__RATIONAL_VALUE:
				return basicSetRationalValue(null, msgs);
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
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.QUALIFIED_VALUE__QUALIFIER_CODE:
				return getQualifierCode();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.QUALIFIED_VALUE__QUALIFIER_REF:
				return getQualifierRef();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.QUALIFIED_VALUE__REAL_VALUE:
				return getRealValue();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.QUALIFIED_VALUE__COMPLEX_VALUE:
				return getComplexValue();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.QUALIFIED_VALUE__INTEGER_VALUE:
				return getIntegerValue();
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.QUALIFIED_VALUE__RATIONAL_VALUE:
				return getRationalValue();
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
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.QUALIFIED_VALUE__QUALIFIER_CODE:
				setQualifierCode((String)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.QUALIFIED_VALUE__QUALIFIER_REF:
				setQualifierRef((String)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.QUALIFIED_VALUE__REAL_VALUE:
				setRealValue((RealValue)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.QUALIFIED_VALUE__COMPLEX_VALUE:
				setComplexValue((ComplexValue)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.QUALIFIED_VALUE__INTEGER_VALUE:
				setIntegerValue((IntegerValue)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.QUALIFIED_VALUE__RATIONAL_VALUE:
				setRationalValue((RationalValue)newValue);
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
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.QUALIFIED_VALUE__QUALIFIER_CODE:
				setQualifierCode(QUALIFIER_CODE_EDEFAULT);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.QUALIFIED_VALUE__QUALIFIER_REF:
				setQualifierRef(QUALIFIER_REF_EDEFAULT);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.QUALIFIED_VALUE__REAL_VALUE:
				setRealValue((RealValue)null);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.QUALIFIED_VALUE__COMPLEX_VALUE:
				setComplexValue((ComplexValue)null);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.QUALIFIED_VALUE__INTEGER_VALUE:
				setIntegerValue((IntegerValue)null);
				return;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.QUALIFIED_VALUE__RATIONAL_VALUE:
				setRationalValue((RationalValue)null);
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
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.QUALIFIED_VALUE__QUALIFIER_CODE:
				return QUALIFIER_CODE_EDEFAULT == null ? qualifierCode != null : !QUALIFIER_CODE_EDEFAULT.equals(qualifierCode);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.QUALIFIED_VALUE__QUALIFIER_REF:
				return QUALIFIER_REF_EDEFAULT == null ? qualifierRef != null : !QUALIFIER_REF_EDEFAULT.equals(qualifierRef);
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.QUALIFIED_VALUE__REAL_VALUE:
				return realValue != null;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.QUALIFIED_VALUE__COMPLEX_VALUE:
				return complexValue != null;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.QUALIFIED_VALUE__INTEGER_VALUE:
				return integerValue != null;
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.QUALIFIED_VALUE__RATIONAL_VALUE:
				return rationalValue != null;
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
		result.append(" (qualifierCode: ");
		result.append(qualifierCode);
		result.append(", qualifierRef: ");
		result.append(qualifierRef);
		result.append(')');
		return result.toString();
	}

} //QualifiedValueImpl
