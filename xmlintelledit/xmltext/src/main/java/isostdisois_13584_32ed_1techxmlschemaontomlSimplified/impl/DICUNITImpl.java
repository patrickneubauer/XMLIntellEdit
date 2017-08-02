/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DICUNIT;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.MATHEMATICALSTRING;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.UNIT;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DICUNIT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.DICUNITImpl#getUnitRef <em>Unit Ref</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.DICUNITImpl#getStructuredRepresentation <em>Structured Representation</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.DICUNITImpl#getStringRepresentation <em>String Representation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DICUNITImpl extends MinimalEObjectImpl.Container implements DICUNIT {
	/**
	 * The default value of the '{@link #getUnitRef() <em>Unit Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitRef()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnitRef() <em>Unit Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitRef()
	 * @generated
	 * @ordered
	 */
	protected String unitRef = UNIT_REF_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStructuredRepresentation() <em>Structured Representation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuredRepresentation()
	 * @generated
	 * @ordered
	 */
	protected UNIT structuredRepresentation;

	/**
	 * The cached value of the '{@link #getStringRepresentation() <em>String Representation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringRepresentation()
	 * @generated
	 * @ordered
	 */
	protected MATHEMATICALSTRING stringRepresentation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DICUNITImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.DICUNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnitRef() {
		return unitRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitRef(String newUnitRef) {
		String oldUnitRef = unitRef;
		unitRef = newUnitRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICUNIT__UNIT_REF, oldUnitRef, unitRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UNIT getStructuredRepresentation() {
		return structuredRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructuredRepresentation(UNIT newStructuredRepresentation, NotificationChain msgs) {
		UNIT oldStructuredRepresentation = structuredRepresentation;
		structuredRepresentation = newStructuredRepresentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICUNIT__STRUCTURED_REPRESENTATION, oldStructuredRepresentation, newStructuredRepresentation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructuredRepresentation(UNIT newStructuredRepresentation) {
		if (newStructuredRepresentation != structuredRepresentation) {
			NotificationChain msgs = null;
			if (structuredRepresentation != null)
				msgs = ((InternalEObject)structuredRepresentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICUNIT__STRUCTURED_REPRESENTATION, null, msgs);
			if (newStructuredRepresentation != null)
				msgs = ((InternalEObject)newStructuredRepresentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICUNIT__STRUCTURED_REPRESENTATION, null, msgs);
			msgs = basicSetStructuredRepresentation(newStructuredRepresentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICUNIT__STRUCTURED_REPRESENTATION, newStructuredRepresentation, newStructuredRepresentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MATHEMATICALSTRING getStringRepresentation() {
		return stringRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStringRepresentation(MATHEMATICALSTRING newStringRepresentation, NotificationChain msgs) {
		MATHEMATICALSTRING oldStringRepresentation = stringRepresentation;
		stringRepresentation = newStringRepresentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICUNIT__STRING_REPRESENTATION, oldStringRepresentation, newStringRepresentation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStringRepresentation(MATHEMATICALSTRING newStringRepresentation) {
		if (newStringRepresentation != stringRepresentation) {
			NotificationChain msgs = null;
			if (stringRepresentation != null)
				msgs = ((InternalEObject)stringRepresentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICUNIT__STRING_REPRESENTATION, null, msgs);
			if (newStringRepresentation != null)
				msgs = ((InternalEObject)newStringRepresentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICUNIT__STRING_REPRESENTATION, null, msgs);
			msgs = basicSetStringRepresentation(newStringRepresentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICUNIT__STRING_REPRESENTATION, newStringRepresentation, newStringRepresentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICUNIT__STRUCTURED_REPRESENTATION:
				return basicSetStructuredRepresentation(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICUNIT__STRING_REPRESENTATION:
				return basicSetStringRepresentation(null, msgs);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICUNIT__UNIT_REF:
				return getUnitRef();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICUNIT__STRUCTURED_REPRESENTATION:
				return getStructuredRepresentation();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICUNIT__STRING_REPRESENTATION:
				return getStringRepresentation();
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICUNIT__UNIT_REF:
				setUnitRef((String)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICUNIT__STRUCTURED_REPRESENTATION:
				setStructuredRepresentation((UNIT)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICUNIT__STRING_REPRESENTATION:
				setStringRepresentation((MATHEMATICALSTRING)newValue);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICUNIT__UNIT_REF:
				setUnitRef(UNIT_REF_EDEFAULT);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICUNIT__STRUCTURED_REPRESENTATION:
				setStructuredRepresentation((UNIT)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICUNIT__STRING_REPRESENTATION:
				setStringRepresentation((MATHEMATICALSTRING)null);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICUNIT__UNIT_REF:
				return UNIT_REF_EDEFAULT == null ? unitRef != null : !UNIT_REF_EDEFAULT.equals(unitRef);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICUNIT__STRUCTURED_REPRESENTATION:
				return structuredRepresentation != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.DICUNIT__STRING_REPRESENTATION:
				return stringRepresentation != null;
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
		result.append(" (unitRef: ");
		result.append(unitRef);
		result.append(')');
		return result.toString();
	}

} //DICUNITImpl
