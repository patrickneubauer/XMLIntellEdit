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

import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.TRANSLATION;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.TRANSLATIONDATA;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TRANSLATION</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.TRANSLATIONImpl#getTranslationDatas <em>Translation Datas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TRANSLATIONImpl extends MinimalEObjectImpl.Container implements TRANSLATION {
	/**
	 * The cached value of the '{@link #getTranslationDatas() <em>Translation Datas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslationDatas()
	 * @generated
	 * @ordered
	 */
	protected EList<TRANSLATIONDATA> translationDatas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TRANSLATIONImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.TRANSLATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TRANSLATIONDATA> getTranslationDatas() {
		if (translationDatas == null) {
			translationDatas = new EObjectContainmentEList<TRANSLATIONDATA>(TRANSLATIONDATA.class, this, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.TRANSLATION__TRANSLATION_DATAS);
		}
		return translationDatas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.TRANSLATION__TRANSLATION_DATAS:
				return ((InternalEList<?>)getTranslationDatas()).basicRemove(otherEnd, msgs);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.TRANSLATION__TRANSLATION_DATAS:
				return getTranslationDatas();
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.TRANSLATION__TRANSLATION_DATAS:
				getTranslationDatas().clear();
				getTranslationDatas().addAll((Collection<? extends TRANSLATIONDATA>)newValue);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.TRANSLATION__TRANSLATION_DATAS:
				getTranslationDatas().clear();
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.TRANSLATION__TRANSLATION_DATAS:
				return translationDatas != null && !translationDatas.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TRANSLATIONImpl
