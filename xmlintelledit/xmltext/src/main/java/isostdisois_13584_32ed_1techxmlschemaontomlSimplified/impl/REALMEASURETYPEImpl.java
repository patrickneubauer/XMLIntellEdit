/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ALTERNATIVEUNITS;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DICUNIT;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DICUNITREFERENCE;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.DICUNITSREFERENCE;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.REALMEASURETYPE;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>REALMEASURETYPE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.REALMEASURETYPEImpl#getValueFormat <em>Value Format</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.REALMEASURETYPEImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.REALMEASURETYPEImpl#getAlternativeUnits <em>Alternative Units</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.REALMEASURETYPEImpl#getUnitId <em>Unit Id</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.REALMEASURETYPEImpl#getAlternativeUnitIds <em>Alternative Unit Ids</em>}</li>
 * </ul>
 *
 * @generated
 */
public class REALMEASURETYPEImpl extends ANYTYPEImpl implements REALMEASURETYPE {
	/**
	 * The default value of the '{@link #getValueFormat() <em>Value Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueFormat() <em>Value Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueFormat()
	 * @generated
	 * @ordered
	 */
	protected String valueFormat = VALUE_FORMAT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected DICUNIT unit;

	/**
	 * The cached value of the '{@link #getAlternativeUnits() <em>Alternative Units</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternativeUnits()
	 * @generated
	 * @ordered
	 */
	protected ALTERNATIVEUNITS alternativeUnits;

	/**
	 * The cached value of the '{@link #getUnitId() <em>Unit Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitId()
	 * @generated
	 * @ordered
	 */
	protected DICUNITREFERENCE unitId;

	/**
	 * The cached value of the '{@link #getAlternativeUnitIds() <em>Alternative Unit Ids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternativeUnitIds()
	 * @generated
	 * @ordered
	 */
	protected DICUNITSREFERENCE alternativeUnitIds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected REALMEASURETYPEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.REALMEASURETYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueFormat() {
		return valueFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueFormat(String newValueFormat) {
		String oldValueFormat = valueFormat;
		valueFormat = newValueFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REALMEASURETYPE__VALUE_FORMAT, oldValueFormat, valueFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DICUNIT getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnit(DICUNIT newUnit, NotificationChain msgs) {
		DICUNIT oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REALMEASURETYPE__UNIT, oldUnit, newUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(DICUNIT newUnit) {
		if (newUnit != unit) {
			NotificationChain msgs = null;
			if (unit != null)
				msgs = ((InternalEObject)unit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REALMEASURETYPE__UNIT, null, msgs);
			if (newUnit != null)
				msgs = ((InternalEObject)newUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REALMEASURETYPE__UNIT, null, msgs);
			msgs = basicSetUnit(newUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REALMEASURETYPE__UNIT, newUnit, newUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ALTERNATIVEUNITS getAlternativeUnits() {
		return alternativeUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlternativeUnits(ALTERNATIVEUNITS newAlternativeUnits, NotificationChain msgs) {
		ALTERNATIVEUNITS oldAlternativeUnits = alternativeUnits;
		alternativeUnits = newAlternativeUnits;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REALMEASURETYPE__ALTERNATIVE_UNITS, oldAlternativeUnits, newAlternativeUnits);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlternativeUnits(ALTERNATIVEUNITS newAlternativeUnits) {
		if (newAlternativeUnits != alternativeUnits) {
			NotificationChain msgs = null;
			if (alternativeUnits != null)
				msgs = ((InternalEObject)alternativeUnits).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REALMEASURETYPE__ALTERNATIVE_UNITS, null, msgs);
			if (newAlternativeUnits != null)
				msgs = ((InternalEObject)newAlternativeUnits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REALMEASURETYPE__ALTERNATIVE_UNITS, null, msgs);
			msgs = basicSetAlternativeUnits(newAlternativeUnits, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REALMEASURETYPE__ALTERNATIVE_UNITS, newAlternativeUnits, newAlternativeUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DICUNITREFERENCE getUnitId() {
		return unitId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnitId(DICUNITREFERENCE newUnitId, NotificationChain msgs) {
		DICUNITREFERENCE oldUnitId = unitId;
		unitId = newUnitId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REALMEASURETYPE__UNIT_ID, oldUnitId, newUnitId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitId(DICUNITREFERENCE newUnitId) {
		if (newUnitId != unitId) {
			NotificationChain msgs = null;
			if (unitId != null)
				msgs = ((InternalEObject)unitId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REALMEASURETYPE__UNIT_ID, null, msgs);
			if (newUnitId != null)
				msgs = ((InternalEObject)newUnitId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REALMEASURETYPE__UNIT_ID, null, msgs);
			msgs = basicSetUnitId(newUnitId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REALMEASURETYPE__UNIT_ID, newUnitId, newUnitId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DICUNITSREFERENCE getAlternativeUnitIds() {
		return alternativeUnitIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlternativeUnitIds(DICUNITSREFERENCE newAlternativeUnitIds, NotificationChain msgs) {
		DICUNITSREFERENCE oldAlternativeUnitIds = alternativeUnitIds;
		alternativeUnitIds = newAlternativeUnitIds;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REALMEASURETYPE__ALTERNATIVE_UNIT_IDS, oldAlternativeUnitIds, newAlternativeUnitIds);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlternativeUnitIds(DICUNITSREFERENCE newAlternativeUnitIds) {
		if (newAlternativeUnitIds != alternativeUnitIds) {
			NotificationChain msgs = null;
			if (alternativeUnitIds != null)
				msgs = ((InternalEObject)alternativeUnitIds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REALMEASURETYPE__ALTERNATIVE_UNIT_IDS, null, msgs);
			if (newAlternativeUnitIds != null)
				msgs = ((InternalEObject)newAlternativeUnitIds).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REALMEASURETYPE__ALTERNATIVE_UNIT_IDS, null, msgs);
			msgs = basicSetAlternativeUnitIds(newAlternativeUnitIds, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REALMEASURETYPE__ALTERNATIVE_UNIT_IDS, newAlternativeUnitIds, newAlternativeUnitIds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REALMEASURETYPE__UNIT:
				return basicSetUnit(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REALMEASURETYPE__ALTERNATIVE_UNITS:
				return basicSetAlternativeUnits(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REALMEASURETYPE__UNIT_ID:
				return basicSetUnitId(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REALMEASURETYPE__ALTERNATIVE_UNIT_IDS:
				return basicSetAlternativeUnitIds(null, msgs);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REALMEASURETYPE__VALUE_FORMAT:
				return getValueFormat();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REALMEASURETYPE__UNIT:
				return getUnit();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REALMEASURETYPE__ALTERNATIVE_UNITS:
				return getAlternativeUnits();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REALMEASURETYPE__UNIT_ID:
				return getUnitId();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REALMEASURETYPE__ALTERNATIVE_UNIT_IDS:
				return getAlternativeUnitIds();
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REALMEASURETYPE__VALUE_FORMAT:
				setValueFormat((String)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REALMEASURETYPE__UNIT:
				setUnit((DICUNIT)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REALMEASURETYPE__ALTERNATIVE_UNITS:
				setAlternativeUnits((ALTERNATIVEUNITS)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REALMEASURETYPE__UNIT_ID:
				setUnitId((DICUNITREFERENCE)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REALMEASURETYPE__ALTERNATIVE_UNIT_IDS:
				setAlternativeUnitIds((DICUNITSREFERENCE)newValue);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REALMEASURETYPE__VALUE_FORMAT:
				setValueFormat(VALUE_FORMAT_EDEFAULT);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REALMEASURETYPE__UNIT:
				setUnit((DICUNIT)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REALMEASURETYPE__ALTERNATIVE_UNITS:
				setAlternativeUnits((ALTERNATIVEUNITS)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REALMEASURETYPE__UNIT_ID:
				setUnitId((DICUNITREFERENCE)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REALMEASURETYPE__ALTERNATIVE_UNIT_IDS:
				setAlternativeUnitIds((DICUNITSREFERENCE)null);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REALMEASURETYPE__VALUE_FORMAT:
				return VALUE_FORMAT_EDEFAULT == null ? valueFormat != null : !VALUE_FORMAT_EDEFAULT.equals(valueFormat);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REALMEASURETYPE__UNIT:
				return unit != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REALMEASURETYPE__ALTERNATIVE_UNITS:
				return alternativeUnits != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REALMEASURETYPE__UNIT_ID:
				return unitId != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.REALMEASURETYPE__ALTERNATIVE_UNIT_IDS:
				return alternativeUnitIds != null;
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
		result.append(" (valueFormat: ");
		result.append(valueFormat);
		result.append(')');
		return result.toString();
	}

} //REALMEASURETYPEImpl
