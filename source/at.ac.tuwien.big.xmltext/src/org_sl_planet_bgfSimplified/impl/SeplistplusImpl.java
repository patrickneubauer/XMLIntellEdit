/**
 */
package org_sl_planet_bgfSimplified.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org_sl_planet_bgfSimplified.Expression;
import org_sl_planet_bgfSimplified.Org_sl_planet_bgfSimplifiedPackage;
import org_sl_planet_bgfSimplified.Seplistplus;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Seplistplus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org_sl_planet_bgfSimplified.impl.SeplistplusImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org_sl_planet_bgfSimplified.impl.SeplistplusImpl#getExpression1 <em>Expression1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SeplistplusImpl extends MinimalEObjectImpl.Container implements Seplistplus {
	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression expression;

	/**
	 * The cached value of the '{@link #getExpression1() <em>Expression1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression1()
	 * @generated
	 * @ordered
	 */
	protected Expression expression1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeplistplusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Org_sl_planet_bgfSimplifiedPackage.Literals.SEPLISTPLUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs) {
		Expression oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Org_sl_planet_bgfSimplifiedPackage.SEPLISTPLUS__EXPRESSION, oldExpression, newExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(Expression newExpression) {
		if (newExpression != expression) {
			NotificationChain msgs = null;
			if (expression != null)
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Org_sl_planet_bgfSimplifiedPackage.SEPLISTPLUS__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Org_sl_planet_bgfSimplifiedPackage.SEPLISTPLUS__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Org_sl_planet_bgfSimplifiedPackage.SEPLISTPLUS__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExpression1() {
		return expression1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression1(Expression newExpression1, NotificationChain msgs) {
		Expression oldExpression1 = expression1;
		expression1 = newExpression1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Org_sl_planet_bgfSimplifiedPackage.SEPLISTPLUS__EXPRESSION1, oldExpression1, newExpression1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression1(Expression newExpression1) {
		if (newExpression1 != expression1) {
			NotificationChain msgs = null;
			if (expression1 != null)
				msgs = ((InternalEObject)expression1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Org_sl_planet_bgfSimplifiedPackage.SEPLISTPLUS__EXPRESSION1, null, msgs);
			if (newExpression1 != null)
				msgs = ((InternalEObject)newExpression1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Org_sl_planet_bgfSimplifiedPackage.SEPLISTPLUS__EXPRESSION1, null, msgs);
			msgs = basicSetExpression1(newExpression1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Org_sl_planet_bgfSimplifiedPackage.SEPLISTPLUS__EXPRESSION1, newExpression1, newExpression1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Org_sl_planet_bgfSimplifiedPackage.SEPLISTPLUS__EXPRESSION:
				return basicSetExpression(null, msgs);
			case Org_sl_planet_bgfSimplifiedPackage.SEPLISTPLUS__EXPRESSION1:
				return basicSetExpression1(null, msgs);
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
			case Org_sl_planet_bgfSimplifiedPackage.SEPLISTPLUS__EXPRESSION:
				return getExpression();
			case Org_sl_planet_bgfSimplifiedPackage.SEPLISTPLUS__EXPRESSION1:
				return getExpression1();
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
			case Org_sl_planet_bgfSimplifiedPackage.SEPLISTPLUS__EXPRESSION:
				setExpression((Expression)newValue);
				return;
			case Org_sl_planet_bgfSimplifiedPackage.SEPLISTPLUS__EXPRESSION1:
				setExpression1((Expression)newValue);
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
			case Org_sl_planet_bgfSimplifiedPackage.SEPLISTPLUS__EXPRESSION:
				setExpression((Expression)null);
				return;
			case Org_sl_planet_bgfSimplifiedPackage.SEPLISTPLUS__EXPRESSION1:
				setExpression1((Expression)null);
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
			case Org_sl_planet_bgfSimplifiedPackage.SEPLISTPLUS__EXPRESSION:
				return expression != null;
			case Org_sl_planet_bgfSimplifiedPackage.SEPLISTPLUS__EXPRESSION1:
				return expression1 != null;
		}
		return super.eIsSet(featureID);
	}

} //SeplistplusImpl
