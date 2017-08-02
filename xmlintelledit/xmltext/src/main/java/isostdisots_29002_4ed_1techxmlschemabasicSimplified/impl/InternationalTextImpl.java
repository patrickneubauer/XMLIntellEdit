/**
 */
package isostdisots_29002_4ed_1techxmlschemabasicSimplified.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import isostdisots_29002_4ed_1techxmlschemabasicSimplified.InternationalText;
import isostdisots_29002_4ed_1techxmlschemabasicSimplified.Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage;
import isostdisots_29002_4ed_1techxmlschemabasicSimplified.LanguageString;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>International Text</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isostdisots_29002_4ed_1techxmlschemabasicSimplified.impl.InternationalTextImpl#getLocalStrings <em>Local Strings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InternationalTextImpl extends MinimalEObjectImpl.Container implements InternationalText {
	/**
	 * The cached value of the '{@link #getLocalStrings() <em>Local Strings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalStrings()
	 * @generated
	 * @ordered
	 */
	protected EList<LanguageString> localStrings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternationalTextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage.Literals.INTERNATIONAL_TEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LanguageString> getLocalStrings() {
		if (localStrings == null) {
			localStrings = new EObjectContainmentEList<LanguageString>(LanguageString.class, this, Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage.INTERNATIONAL_TEXT__LOCAL_STRINGS);
		}
		return localStrings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage.INTERNATIONAL_TEXT__LOCAL_STRINGS:
				return ((InternalEList<?>)getLocalStrings()).basicRemove(otherEnd, msgs);
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
			case Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage.INTERNATIONAL_TEXT__LOCAL_STRINGS:
				return getLocalStrings();
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
			case Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage.INTERNATIONAL_TEXT__LOCAL_STRINGS:
				getLocalStrings().clear();
				getLocalStrings().addAll((Collection<? extends LanguageString>)newValue);
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
			case Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage.INTERNATIONAL_TEXT__LOCAL_STRINGS:
				getLocalStrings().clear();
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
			case Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage.INTERNATIONAL_TEXT__LOCAL_STRINGS:
				return localStrings != null && !localStrings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InternationalTextImpl
