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
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PROPERTYVALUERECOMMENDEDPRESENTATION;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.RECOMMENDEDPRESENTATION;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RECOMMENDEDPRESENTATION</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.RECOMMENDEDPRESENTATIONImpl#getPropertyValueRecommendedPresentations <em>Property Value Recommended Presentations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RECOMMENDEDPRESENTATIONImpl extends MinimalEObjectImpl.Container implements RECOMMENDEDPRESENTATION {
	/**
	 * The cached value of the '{@link #getPropertyValueRecommendedPresentations() <em>Property Value Recommended Presentations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyValueRecommendedPresentations()
	 * @generated
	 * @ordered
	 */
	protected EList<PROPERTYVALUERECOMMENDEDPRESENTATION> propertyValueRecommendedPresentations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RECOMMENDEDPRESENTATIONImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.RECOMMENDEDPRESENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PROPERTYVALUERECOMMENDEDPRESENTATION> getPropertyValueRecommendedPresentations() {
		if (propertyValueRecommendedPresentations == null) {
			propertyValueRecommendedPresentations = new EObjectContainmentEList<PROPERTYVALUERECOMMENDEDPRESENTATION>(PROPERTYVALUERECOMMENDEDPRESENTATION.class, this, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.RECOMMENDEDPRESENTATION__PROPERTY_VALUE_RECOMMENDED_PRESENTATIONS);
		}
		return propertyValueRecommendedPresentations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.RECOMMENDEDPRESENTATION__PROPERTY_VALUE_RECOMMENDED_PRESENTATIONS:
				return ((InternalEList<?>)getPropertyValueRecommendedPresentations()).basicRemove(otherEnd, msgs);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.RECOMMENDEDPRESENTATION__PROPERTY_VALUE_RECOMMENDED_PRESENTATIONS:
				return getPropertyValueRecommendedPresentations();
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.RECOMMENDEDPRESENTATION__PROPERTY_VALUE_RECOMMENDED_PRESENTATIONS:
				getPropertyValueRecommendedPresentations().clear();
				getPropertyValueRecommendedPresentations().addAll((Collection<? extends PROPERTYVALUERECOMMENDEDPRESENTATION>)newValue);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.RECOMMENDEDPRESENTATION__PROPERTY_VALUE_RECOMMENDED_PRESENTATIONS:
				getPropertyValueRecommendedPresentations().clear();
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.RECOMMENDEDPRESENTATION__PROPERTY_VALUE_RECOMMENDED_PRESENTATIONS:
				return propertyValueRecommendedPresentations != null && !propertyValueRecommendedPresentations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RECOMMENDEDPRESENTATIONImpl
