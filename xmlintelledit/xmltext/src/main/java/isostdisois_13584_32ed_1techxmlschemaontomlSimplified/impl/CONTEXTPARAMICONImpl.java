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

import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CONTEXTPARAMICON;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ILLUSTRATION;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CONTEXTPARAMICON</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.CONTEXTPARAMICONImpl#getA6Illustrations <em>A6 Illustrations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CONTEXTPARAMICONImpl extends MinimalEObjectImpl.Container implements CONTEXTPARAMICON {
	/**
	 * The cached value of the '{@link #getA6Illustrations() <em>A6 Illustrations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA6Illustrations()
	 * @generated
	 * @ordered
	 */
	protected EList<ILLUSTRATION> a6Illustrations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CONTEXTPARAMICONImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.CONTEXTPARAMICON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ILLUSTRATION> getA6Illustrations() {
		if (a6Illustrations == null) {
			a6Illustrations = new EObjectContainmentEList<ILLUSTRATION>(ILLUSTRATION.class, this, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONTEXTPARAMICON__A6_ILLUSTRATIONS);
		}
		return a6Illustrations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONTEXTPARAMICON__A6_ILLUSTRATIONS:
				return ((InternalEList<?>)getA6Illustrations()).basicRemove(otherEnd, msgs);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONTEXTPARAMICON__A6_ILLUSTRATIONS:
				return getA6Illustrations();
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONTEXTPARAMICON__A6_ILLUSTRATIONS:
				getA6Illustrations().clear();
				getA6Illustrations().addAll((Collection<? extends ILLUSTRATION>)newValue);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONTEXTPARAMICON__A6_ILLUSTRATIONS:
				getA6Illustrations().clear();
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CONTEXTPARAMICON__A6_ILLUSTRATIONS:
				return a6Illustrations != null && !a6Illustrations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CONTEXTPARAMICONImpl
