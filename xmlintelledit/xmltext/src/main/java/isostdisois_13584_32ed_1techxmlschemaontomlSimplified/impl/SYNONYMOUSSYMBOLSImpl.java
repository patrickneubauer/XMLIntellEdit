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
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.MATHEMATICALSTRING;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.SYNONYMOUSSYMBOLS;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SYNONYMOUSSYMBOLS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.SYNONYMOUSSYMBOLSImpl#getMathematicalStrings <em>Mathematical Strings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SYNONYMOUSSYMBOLSImpl extends MinimalEObjectImpl.Container implements SYNONYMOUSSYMBOLS {
	/**
	 * The cached value of the '{@link #getMathematicalStrings() <em>Mathematical Strings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMathematicalStrings()
	 * @generated
	 * @ordered
	 */
	protected EList<MATHEMATICALSTRING> mathematicalStrings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SYNONYMOUSSYMBOLSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.SYNONYMOUSSYMBOLS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MATHEMATICALSTRING> getMathematicalStrings() {
		if (mathematicalStrings == null) {
			mathematicalStrings = new EObjectContainmentEList<MATHEMATICALSTRING>(MATHEMATICALSTRING.class, this, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SYNONYMOUSSYMBOLS__MATHEMATICAL_STRINGS);
		}
		return mathematicalStrings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SYNONYMOUSSYMBOLS__MATHEMATICAL_STRINGS:
				return ((InternalEList<?>)getMathematicalStrings()).basicRemove(otherEnd, msgs);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SYNONYMOUSSYMBOLS__MATHEMATICAL_STRINGS:
				return getMathematicalStrings();
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SYNONYMOUSSYMBOLS__MATHEMATICAL_STRINGS:
				getMathematicalStrings().clear();
				getMathematicalStrings().addAll((Collection<? extends MATHEMATICALSTRING>)newValue);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SYNONYMOUSSYMBOLS__MATHEMATICAL_STRINGS:
				getMathematicalStrings().clear();
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.SYNONYMOUSSYMBOLS__MATHEMATICAL_STRINGS:
				return mathematicalStrings != null && !mathematicalStrings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SYNONYMOUSSYMBOLSImpl
