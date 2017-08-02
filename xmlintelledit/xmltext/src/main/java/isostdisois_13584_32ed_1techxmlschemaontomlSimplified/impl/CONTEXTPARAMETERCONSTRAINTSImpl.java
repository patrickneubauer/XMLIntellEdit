/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CONTEXTPARAMETERCONSTRAINTS;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.INTEGRITYCONSTRAINT;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CONTEXTPARAMETERCONSTRAINTS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.CONTEXTPARAMETERCONSTRAINTSImpl#getIntegrityConstraints <em>Integrity Constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CONTEXTPARAMETERCONSTRAINTSImpl extends MinimalEObjectImpl.Container implements CONTEXTPARAMETERCONSTRAINTS {
	/**
	 * The cached value of the '{@link #getIntegrityConstraints() <em>Integrity Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegrityConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<INTEGRITYCONSTRAINT> integrityConstraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CONTEXTPARAMETERCONSTRAINTSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.CONTEXTPARAMETERCONSTRAINTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<INTEGRITYCONSTRAINT> getIntegrityConstraints() {
		if (integrityConstraints == null) {
			integrityConstraints = new EObjectContainmentEList<INTEGRITYCONSTRAINT>(INTEGRITYCONSTRAINT.class, this, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONTEXTPARAMETERCONSTRAINTS__INTEGRITY_CONSTRAINTS);
		}
		return integrityConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONTEXTPARAMETERCONSTRAINTS__INTEGRITY_CONSTRAINTS:
				return ((InternalEList<?>)getIntegrityConstraints()).basicRemove(otherEnd, msgs);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONTEXTPARAMETERCONSTRAINTS__INTEGRITY_CONSTRAINTS:
				return getIntegrityConstraints();
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONTEXTPARAMETERCONSTRAINTS__INTEGRITY_CONSTRAINTS:
				getIntegrityConstraints().clear();
				getIntegrityConstraints().addAll((Collection<? extends INTEGRITYCONSTRAINT>)newValue);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONTEXTPARAMETERCONSTRAINTS__INTEGRITY_CONSTRAINTS:
				getIntegrityConstraints().clear();
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONTEXTPARAMETERCONSTRAINTS__INTEGRITY_CONSTRAINTS:
				return integrityConstraints != null && !integrityConstraints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CONTEXTPARAMETERCONSTRAINTSImpl
