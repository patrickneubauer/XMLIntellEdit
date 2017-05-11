/**
 */
package org_sl_planet_bgfSimplified.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org_sl_planet_bgfSimplified.Grammar;
import org_sl_planet_bgfSimplified.Org_sl_planet_bgfSimplifiedPackage;
import org_sl_planet_bgfSimplified.Production;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grammar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org_sl_planet_bgfSimplified.impl.GrammarImpl#getRoots <em>Roots</em>}</li>
 *   <li>{@link org_sl_planet_bgfSimplified.impl.GrammarImpl#getProductions <em>Productions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GrammarImpl extends MinimalEObjectImpl.Container implements Grammar {
	/**
	 * The cached value of the '{@link #getRoots() <em>Roots</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoots()
	 * @generated
	 * @ordered
	 */
	protected EList<String> roots;

	/**
	 * The cached value of the '{@link #getProductions() <em>Productions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductions()
	 * @generated
	 * @ordered
	 */
	protected EList<Production> productions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GrammarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Org_sl_planet_bgfSimplifiedPackage.Literals.GRAMMAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRoots() {
		if (roots == null) {
			roots = new EDataTypeEList<String>(String.class, this, Org_sl_planet_bgfSimplifiedPackage.GRAMMAR__ROOTS);
		}
		return roots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Production> getProductions() {
		if (productions == null) {
			productions = new EObjectContainmentEList<Production>(Production.class, this, Org_sl_planet_bgfSimplifiedPackage.GRAMMAR__PRODUCTIONS);
		}
		return productions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Org_sl_planet_bgfSimplifiedPackage.GRAMMAR__PRODUCTIONS:
				return ((InternalEList<?>)getProductions()).basicRemove(otherEnd, msgs);
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
			case Org_sl_planet_bgfSimplifiedPackage.GRAMMAR__ROOTS:
				return getRoots();
			case Org_sl_planet_bgfSimplifiedPackage.GRAMMAR__PRODUCTIONS:
				return getProductions();
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
			case Org_sl_planet_bgfSimplifiedPackage.GRAMMAR__ROOTS:
				getRoots().clear();
				getRoots().addAll((Collection<? extends String>)newValue);
				return;
			case Org_sl_planet_bgfSimplifiedPackage.GRAMMAR__PRODUCTIONS:
				getProductions().clear();
				getProductions().addAll((Collection<? extends Production>)newValue);
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
			case Org_sl_planet_bgfSimplifiedPackage.GRAMMAR__ROOTS:
				getRoots().clear();
				return;
			case Org_sl_planet_bgfSimplifiedPackage.GRAMMAR__PRODUCTIONS:
				getProductions().clear();
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
			case Org_sl_planet_bgfSimplifiedPackage.GRAMMAR__ROOTS:
				return roots != null && !roots.isEmpty();
			case Org_sl_planet_bgfSimplifiedPackage.GRAMMAR__PRODUCTIONS:
				return productions != null && !productions.isEmpty();
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
		result.append(" (roots: ");
		result.append(roots);
		result.append(')');
		return result.toString();
	}

} //GrammarImpl
