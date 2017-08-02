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

import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASSPRESENTATIONONSCREEN;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.ILLUSTRATION;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CLASSPRESENTATIONONSCREEN</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.CLASSPRESENTATIONONSCREENImpl#getIllustrations <em>Illustrations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CLASSPRESENTATIONONSCREENImpl extends MinimalEObjectImpl.Container implements CLASSPRESENTATIONONSCREEN {
	/**
	 * The cached value of the '{@link #getIllustrations() <em>Illustrations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIllustrations()
	 * @generated
	 * @ordered
	 */
	protected EList<ILLUSTRATION> illustrations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CLASSPRESENTATIONONSCREENImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.CLASSPRESENTATIONONSCREEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ILLUSTRATION> getIllustrations() {
		if (illustrations == null) {
			illustrations = new EObjectContainmentEList<ILLUSTRATION>(ILLUSTRATION.class, this, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSPRESENTATIONONSCREEN__ILLUSTRATIONS);
		}
		return illustrations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSPRESENTATIONONSCREEN__ILLUSTRATIONS:
				return ((InternalEList<?>)getIllustrations()).basicRemove(otherEnd, msgs);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSPRESENTATIONONSCREEN__ILLUSTRATIONS:
				return getIllustrations();
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSPRESENTATIONONSCREEN__ILLUSTRATIONS:
				getIllustrations().clear();
				getIllustrations().addAll((Collection<? extends ILLUSTRATION>)newValue);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSPRESENTATIONONSCREEN__ILLUSTRATIONS:
				getIllustrations().clear();
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSPRESENTATIONONSCREEN__ILLUSTRATIONS:
				return illustrations != null && !illustrations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CLASSPRESENTATIONONSCREENImpl
