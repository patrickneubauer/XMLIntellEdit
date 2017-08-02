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
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DICUNITREFERENCE;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.GEOMETRICUNITCONTEXT;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GEOMETRICUNITCONTEXT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.GEOMETRICUNITCONTEXTImpl#getLengthUnit <em>Length Unit</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.GEOMETRICUNITCONTEXTImpl#getLengthUnitId <em>Length Unit Id</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.GEOMETRICUNITCONTEXTImpl#getLangleUnit <em>Langle Unit</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.GEOMETRICUNITCONTEXTImpl#getAngleUnitId <em>Angle Unit Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GEOMETRICUNITCONTEXTImpl extends MinimalEObjectImpl.Container implements GEOMETRICUNITCONTEXT {
	/**
	 * The cached value of the '{@link #getLengthUnit() <em>Length Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLengthUnit()
	 * @generated
	 * @ordered
	 */
	protected DICUNIT lengthUnit;

	/**
	 * The cached value of the '{@link #getLengthUnitId() <em>Length Unit Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLengthUnitId()
	 * @generated
	 * @ordered
	 */
	protected DICUNITREFERENCE lengthUnitId;

	/**
	 * The cached value of the '{@link #getLangleUnit() <em>Langle Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangleUnit()
	 * @generated
	 * @ordered
	 */
	protected DICUNIT langleUnit;

	/**
	 * The cached value of the '{@link #getAngleUnitId() <em>Angle Unit Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngleUnitId()
	 * @generated
	 * @ordered
	 */
	protected DICUNITREFERENCE angleUnitId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GEOMETRICUNITCONTEXTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.GEOMETRICUNITCONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DICUNIT getLengthUnit() {
		return lengthUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLengthUnit(DICUNIT newLengthUnit, NotificationChain msgs) {
		DICUNIT oldLengthUnit = lengthUnit;
		lengthUnit = newLengthUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.GEOMETRICUNITCONTEXT__LENGTH_UNIT, oldLengthUnit, newLengthUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLengthUnit(DICUNIT newLengthUnit) {
		if (newLengthUnit != lengthUnit) {
			NotificationChain msgs = null;
			if (lengthUnit != null)
				msgs = ((InternalEObject)lengthUnit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.GEOMETRICUNITCONTEXT__LENGTH_UNIT, null, msgs);
			if (newLengthUnit != null)
				msgs = ((InternalEObject)newLengthUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.GEOMETRICUNITCONTEXT__LENGTH_UNIT, null, msgs);
			msgs = basicSetLengthUnit(newLengthUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.GEOMETRICUNITCONTEXT__LENGTH_UNIT, newLengthUnit, newLengthUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DICUNITREFERENCE getLengthUnitId() {
		return lengthUnitId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLengthUnitId(DICUNITREFERENCE newLengthUnitId, NotificationChain msgs) {
		DICUNITREFERENCE oldLengthUnitId = lengthUnitId;
		lengthUnitId = newLengthUnitId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.GEOMETRICUNITCONTEXT__LENGTH_UNIT_ID, oldLengthUnitId, newLengthUnitId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLengthUnitId(DICUNITREFERENCE newLengthUnitId) {
		if (newLengthUnitId != lengthUnitId) {
			NotificationChain msgs = null;
			if (lengthUnitId != null)
				msgs = ((InternalEObject)lengthUnitId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.GEOMETRICUNITCONTEXT__LENGTH_UNIT_ID, null, msgs);
			if (newLengthUnitId != null)
				msgs = ((InternalEObject)newLengthUnitId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.GEOMETRICUNITCONTEXT__LENGTH_UNIT_ID, null, msgs);
			msgs = basicSetLengthUnitId(newLengthUnitId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.GEOMETRICUNITCONTEXT__LENGTH_UNIT_ID, newLengthUnitId, newLengthUnitId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DICUNIT getLangleUnit() {
		return langleUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLangleUnit(DICUNIT newLangleUnit, NotificationChain msgs) {
		DICUNIT oldLangleUnit = langleUnit;
		langleUnit = newLangleUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.GEOMETRICUNITCONTEXT__LANGLE_UNIT, oldLangleUnit, newLangleUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLangleUnit(DICUNIT newLangleUnit) {
		if (newLangleUnit != langleUnit) {
			NotificationChain msgs = null;
			if (langleUnit != null)
				msgs = ((InternalEObject)langleUnit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.GEOMETRICUNITCONTEXT__LANGLE_UNIT, null, msgs);
			if (newLangleUnit != null)
				msgs = ((InternalEObject)newLangleUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.GEOMETRICUNITCONTEXT__LANGLE_UNIT, null, msgs);
			msgs = basicSetLangleUnit(newLangleUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.GEOMETRICUNITCONTEXT__LANGLE_UNIT, newLangleUnit, newLangleUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DICUNITREFERENCE getAngleUnitId() {
		return angleUnitId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngleUnitId(DICUNITREFERENCE newAngleUnitId, NotificationChain msgs) {
		DICUNITREFERENCE oldAngleUnitId = angleUnitId;
		angleUnitId = newAngleUnitId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.GEOMETRICUNITCONTEXT__ANGLE_UNIT_ID, oldAngleUnitId, newAngleUnitId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngleUnitId(DICUNITREFERENCE newAngleUnitId) {
		if (newAngleUnitId != angleUnitId) {
			NotificationChain msgs = null;
			if (angleUnitId != null)
				msgs = ((InternalEObject)angleUnitId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.GEOMETRICUNITCONTEXT__ANGLE_UNIT_ID, null, msgs);
			if (newAngleUnitId != null)
				msgs = ((InternalEObject)newAngleUnitId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.GEOMETRICUNITCONTEXT__ANGLE_UNIT_ID, null, msgs);
			msgs = basicSetAngleUnitId(newAngleUnitId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.GEOMETRICUNITCONTEXT__ANGLE_UNIT_ID, newAngleUnitId, newAngleUnitId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.GEOMETRICUNITCONTEXT__LENGTH_UNIT:
				return basicSetLengthUnit(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.GEOMETRICUNITCONTEXT__LENGTH_UNIT_ID:
				return basicSetLengthUnitId(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.GEOMETRICUNITCONTEXT__LANGLE_UNIT:
				return basicSetLangleUnit(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.GEOMETRICUNITCONTEXT__ANGLE_UNIT_ID:
				return basicSetAngleUnitId(null, msgs);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.GEOMETRICUNITCONTEXT__LENGTH_UNIT:
				return getLengthUnit();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.GEOMETRICUNITCONTEXT__LENGTH_UNIT_ID:
				return getLengthUnitId();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.GEOMETRICUNITCONTEXT__LANGLE_UNIT:
				return getLangleUnit();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.GEOMETRICUNITCONTEXT__ANGLE_UNIT_ID:
				return getAngleUnitId();
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.GEOMETRICUNITCONTEXT__LENGTH_UNIT:
				setLengthUnit((DICUNIT)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.GEOMETRICUNITCONTEXT__LENGTH_UNIT_ID:
				setLengthUnitId((DICUNITREFERENCE)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.GEOMETRICUNITCONTEXT__LANGLE_UNIT:
				setLangleUnit((DICUNIT)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.GEOMETRICUNITCONTEXT__ANGLE_UNIT_ID:
				setAngleUnitId((DICUNITREFERENCE)newValue);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.GEOMETRICUNITCONTEXT__LENGTH_UNIT:
				setLengthUnit((DICUNIT)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.GEOMETRICUNITCONTEXT__LENGTH_UNIT_ID:
				setLengthUnitId((DICUNITREFERENCE)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.GEOMETRICUNITCONTEXT__LANGLE_UNIT:
				setLangleUnit((DICUNIT)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.GEOMETRICUNITCONTEXT__ANGLE_UNIT_ID:
				setAngleUnitId((DICUNITREFERENCE)null);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.GEOMETRICUNITCONTEXT__LENGTH_UNIT:
				return lengthUnit != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.GEOMETRICUNITCONTEXT__LENGTH_UNIT_ID:
				return lengthUnitId != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.GEOMETRICUNITCONTEXT__LANGLE_UNIT:
				return langleUnit != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.GEOMETRICUNITCONTEXT__ANGLE_UNIT_ID:
				return angleUnitId != null;
		}
		return super.eIsSet(featureID);
	}

} //GEOMETRICUNITCONTEXTImpl
