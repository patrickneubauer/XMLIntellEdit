/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CONTEXTPARAMETERCONSTRAINTS;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CONTEXTRESTRICTIONCONSTRAINT;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CONTEXTRESTRICTIONCONSTRAINT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.CONTEXTRESTRICTIONCONSTRAINTImpl#getContextParameterConstraints <em>Context Parameter Constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CONTEXTRESTRICTIONCONSTRAINTImpl extends PROPERTYCONSTRAINTImpl implements CONTEXTRESTRICTIONCONSTRAINT {
	/**
	 * The cached value of the '{@link #getContextParameterConstraints() <em>Context Parameter Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextParameterConstraints()
	 * @generated
	 * @ordered
	 */
	protected CONTEXTPARAMETERCONSTRAINTS contextParameterConstraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CONTEXTRESTRICTIONCONSTRAINTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.CONTEXTRESTRICTIONCONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONTEXTPARAMETERCONSTRAINTS getContextParameterConstraints() {
		return contextParameterConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContextParameterConstraints(CONTEXTPARAMETERCONSTRAINTS newContextParameterConstraints, NotificationChain msgs) {
		CONTEXTPARAMETERCONSTRAINTS oldContextParameterConstraints = contextParameterConstraints;
		contextParameterConstraints = newContextParameterConstraints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONTEXTRESTRICTIONCONSTRAINT__CONTEXT_PARAMETER_CONSTRAINTS, oldContextParameterConstraints, newContextParameterConstraints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextParameterConstraints(CONTEXTPARAMETERCONSTRAINTS newContextParameterConstraints) {
		if (newContextParameterConstraints != contextParameterConstraints) {
			NotificationChain msgs = null;
			if (contextParameterConstraints != null)
				msgs = ((InternalEObject)contextParameterConstraints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONTEXTRESTRICTIONCONSTRAINT__CONTEXT_PARAMETER_CONSTRAINTS, null, msgs);
			if (newContextParameterConstraints != null)
				msgs = ((InternalEObject)newContextParameterConstraints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONTEXTRESTRICTIONCONSTRAINT__CONTEXT_PARAMETER_CONSTRAINTS, null, msgs);
			msgs = basicSetContextParameterConstraints(newContextParameterConstraints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONTEXTRESTRICTIONCONSTRAINT__CONTEXT_PARAMETER_CONSTRAINTS, newContextParameterConstraints, newContextParameterConstraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONTEXTRESTRICTIONCONSTRAINT__CONTEXT_PARAMETER_CONSTRAINTS:
				return basicSetContextParameterConstraints(null, msgs);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONTEXTRESTRICTIONCONSTRAINT__CONTEXT_PARAMETER_CONSTRAINTS:
				return getContextParameterConstraints();
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONTEXTRESTRICTIONCONSTRAINT__CONTEXT_PARAMETER_CONSTRAINTS:
				setContextParameterConstraints((CONTEXTPARAMETERCONSTRAINTS)newValue);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONTEXTRESTRICTIONCONSTRAINT__CONTEXT_PARAMETER_CONSTRAINTS:
				setContextParameterConstraints((CONTEXTPARAMETERCONSTRAINTS)null);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONTEXTRESTRICTIONCONSTRAINT__CONTEXT_PARAMETER_CONSTRAINTS:
				return contextParameterConstraints != null;
		}
		return super.eIsSet(featureID);
	}

} //CONTEXTRESTRICTIONCONSTRAINTImpl
