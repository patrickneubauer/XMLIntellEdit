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

import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.CLASSIFICATION;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PROPERTYCLASSIFICATION;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CLASSIFICATION</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.CLASSIFICATIONImpl#getPropertyClassifications <em>Property Classifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CLASSIFICATIONImpl extends MinimalEObjectImpl.Container implements CLASSIFICATION {
	/**
	 * The cached value of the '{@link #getPropertyClassifications() <em>Property Classifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyClassifications()
	 * @generated
	 * @ordered
	 */
	protected EList<PROPERTYCLASSIFICATION> propertyClassifications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CLASSIFICATIONImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.CLASSIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PROPERTYCLASSIFICATION> getPropertyClassifications() {
		if (propertyClassifications == null) {
			propertyClassifications = new EObjectContainmentEList<PROPERTYCLASSIFICATION>(PROPERTYCLASSIFICATION.class, this, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSIFICATION__PROPERTY_CLASSIFICATIONS);
		}
		return propertyClassifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSIFICATION__PROPERTY_CLASSIFICATIONS:
				return ((InternalEList<?>)getPropertyClassifications()).basicRemove(otherEnd, msgs);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSIFICATION__PROPERTY_CLASSIFICATIONS:
				return getPropertyClassifications();
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSIFICATION__PROPERTY_CLASSIFICATIONS:
				getPropertyClassifications().clear();
				getPropertyClassifications().addAll((Collection<? extends PROPERTYCLASSIFICATION>)newValue);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSIFICATION__PROPERTY_CLASSIFICATIONS:
				getPropertyClassifications().clear();
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.CLASSIFICATION__PROPERTY_CLASSIFICATIONS:
				return propertyClassifications != null && !propertyClassifications.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CLASSIFICATIONImpl
