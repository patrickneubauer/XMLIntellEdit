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
import org_sl_planet_bgfSimplified.Production;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Production</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org_sl_planet_bgfSimplified.impl.ProductionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org_sl_planet_bgfSimplified.impl.ProductionImpl#getNonterminal <em>Nonterminal</em>}</li>
 *   <li>{@link org_sl_planet_bgfSimplified.impl.ProductionImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductionImpl extends MinimalEObjectImpl.Container implements Production {
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getNonterminal() <em>Nonterminal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonterminal()
	 * @generated
	 * @ordered
	 */
	protected static final String NONTERMINAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNonterminal() <em>Nonterminal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonterminal()
	 * @generated
	 * @ordered
	 */
	protected String nonterminal = NONTERMINAL_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Org_sl_planet_bgfSimplifiedPackage.Literals.PRODUCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Org_sl_planet_bgfSimplifiedPackage.PRODUCTION__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNonterminal() {
		return nonterminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNonterminal(String newNonterminal) {
		String oldNonterminal = nonterminal;
		nonterminal = newNonterminal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Org_sl_planet_bgfSimplifiedPackage.PRODUCTION__NONTERMINAL, oldNonterminal, nonterminal));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Org_sl_planet_bgfSimplifiedPackage.PRODUCTION__EXPRESSION, oldExpression, newExpression);
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
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Org_sl_planet_bgfSimplifiedPackage.PRODUCTION__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Org_sl_planet_bgfSimplifiedPackage.PRODUCTION__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Org_sl_planet_bgfSimplifiedPackage.PRODUCTION__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Org_sl_planet_bgfSimplifiedPackage.PRODUCTION__EXPRESSION:
				return basicSetExpression(null, msgs);
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
			case Org_sl_planet_bgfSimplifiedPackage.PRODUCTION__LABEL:
				return getLabel();
			case Org_sl_planet_bgfSimplifiedPackage.PRODUCTION__NONTERMINAL:
				return getNonterminal();
			case Org_sl_planet_bgfSimplifiedPackage.PRODUCTION__EXPRESSION:
				return getExpression();
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
			case Org_sl_planet_bgfSimplifiedPackage.PRODUCTION__LABEL:
				setLabel((String)newValue);
				return;
			case Org_sl_planet_bgfSimplifiedPackage.PRODUCTION__NONTERMINAL:
				setNonterminal((String)newValue);
				return;
			case Org_sl_planet_bgfSimplifiedPackage.PRODUCTION__EXPRESSION:
				setExpression((Expression)newValue);
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
			case Org_sl_planet_bgfSimplifiedPackage.PRODUCTION__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case Org_sl_planet_bgfSimplifiedPackage.PRODUCTION__NONTERMINAL:
				setNonterminal(NONTERMINAL_EDEFAULT);
				return;
			case Org_sl_planet_bgfSimplifiedPackage.PRODUCTION__EXPRESSION:
				setExpression((Expression)null);
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
			case Org_sl_planet_bgfSimplifiedPackage.PRODUCTION__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case Org_sl_planet_bgfSimplifiedPackage.PRODUCTION__NONTERMINAL:
				return NONTERMINAL_EDEFAULT == null ? nonterminal != null : !NONTERMINAL_EDEFAULT.equals(nonterminal);
			case Org_sl_planet_bgfSimplifiedPackage.PRODUCTION__EXPRESSION:
				return expression != null;
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
		result.append(" (label: ");
		result.append(label);
		result.append(", nonterminal: ");
		result.append(nonterminal);
		result.append(')');
		return result.toString();
	}

} //ProductionImpl
