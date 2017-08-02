/**
 */
package isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import isostdisots_29002_10ed_1techxmlschemavalueSimplified.Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.MeasureQualifiedNumberValue;
import isostdisots_29002_10ed_1techxmlschemavalueSimplified.QualifiedValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure Qualified Number Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemavalueSimplified.impl.MeasureQualifiedNumberValueImpl#getQualifiedValues <em>Qualified Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasureQualifiedNumberValueImpl extends MeasureValueImpl implements MeasureQualifiedNumberValue {
	/**
	 * The cached value of the '{@link #getQualifiedValues() <em>Qualified Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedValues()
	 * @generated
	 * @ordered
	 */
	protected EList<QualifiedValue> qualifiedValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasureQualifiedNumberValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.Literals.MEASURE_QUALIFIED_NUMBER_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QualifiedValue> getQualifiedValues() {
		if (qualifiedValues == null) {
			qualifiedValues = new EObjectContainmentEList<QualifiedValue>(QualifiedValue.class, this, Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.MEASURE_QUALIFIED_NUMBER_VALUE__QUALIFIED_VALUES);
		}
		return qualifiedValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.MEASURE_QUALIFIED_NUMBER_VALUE__QUALIFIED_VALUES:
				return ((InternalEList<?>)getQualifiedValues()).basicRemove(otherEnd, msgs);
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
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.MEASURE_QUALIFIED_NUMBER_VALUE__QUALIFIED_VALUES:
				return getQualifiedValues();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.MEASURE_QUALIFIED_NUMBER_VALUE__QUALIFIED_VALUES:
				getQualifiedValues().clear();
				getQualifiedValues().addAll((Collection<? extends QualifiedValue>)newValue);
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
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.MEASURE_QUALIFIED_NUMBER_VALUE__QUALIFIED_VALUES:
				getQualifiedValues().clear();
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
			case Isostdisots_29002_10ed_1techxmlschemavalueSimplifiedPackage.MEASURE_QUALIFIED_NUMBER_VALUE__QUALIFIED_VALUES:
				return qualifiedValues != null && !qualifiedValues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MeasureQualifiedNumberValueImpl
