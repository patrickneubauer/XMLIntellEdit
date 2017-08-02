/**
 */
package isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PROPERTYREFERENCE;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.PROPERTYVALUERECOMMENDEDPRESENTATION;
import isostdisois_13584_32ed_1techxmlschemaontomlSimplified.UNIT;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PROPERTYVALUERECOMMENDEDPRESENTATION</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.PROPERTYVALUERECOMMENDEDPRESENTATIONImpl#getRecommendedPresentationFormat <em>Recommended Presentation Format</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.PROPERTYVALUERECOMMENDEDPRESENTATIONImpl#getPropDef <em>Prop Def</em>}</li>
 *   <li>{@link isostdisois_13584_32ed_1techxmlschemaontomlSimplified.impl.PROPERTYVALUERECOMMENDEDPRESENTATIONImpl#getRecommendedPresentationUnit <em>Recommended Presentation Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PROPERTYVALUERECOMMENDEDPRESENTATIONImpl extends MinimalEObjectImpl.Container implements PROPERTYVALUERECOMMENDEDPRESENTATION {
	/**
	 * The default value of the '{@link #getRecommendedPresentationFormat() <em>Recommended Presentation Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecommendedPresentationFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String RECOMMENDED_PRESENTATION_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecommendedPresentationFormat() <em>Recommended Presentation Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecommendedPresentationFormat()
	 * @generated
	 * @ordered
	 */
	protected String recommendedPresentationFormat = RECOMMENDED_PRESENTATION_FORMAT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPropDef() <em>Prop Def</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropDef()
	 * @generated
	 * @ordered
	 */
	protected PROPERTYREFERENCE propDef;

	/**
	 * The cached value of the '{@link #getRecommendedPresentationUnit() <em>Recommended Presentation Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecommendedPresentationUnit()
	 * @generated
	 * @ordered
	 */
	protected UNIT recommendedPresentationUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PROPERTYVALUERECOMMENDEDPRESENTATIONImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.Literals.PROPERTYVALUERECOMMENDEDPRESENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRecommendedPresentationFormat() {
		return recommendedPresentationFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecommendedPresentationFormat(String newRecommendedPresentationFormat) {
		String oldRecommendedPresentationFormat = recommendedPresentationFormat;
		recommendedPresentationFormat = newRecommendedPresentationFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROPERTYVALUERECOMMENDEDPRESENTATION__RECOMMENDED_PRESENTATION_FORMAT, oldRecommendedPresentationFormat, recommendedPresentationFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROPERTYREFERENCE getPropDef() {
		return propDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropDef(PROPERTYREFERENCE newPropDef, NotificationChain msgs) {
		PROPERTYREFERENCE oldPropDef = propDef;
		propDef = newPropDef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROPERTYVALUERECOMMENDEDPRESENTATION__PROP_DEF, oldPropDef, newPropDef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropDef(PROPERTYREFERENCE newPropDef) {
		if (newPropDef != propDef) {
			NotificationChain msgs = null;
			if (propDef != null)
				msgs = ((InternalEObject)propDef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROPERTYVALUERECOMMENDEDPRESENTATION__PROP_DEF, null, msgs);
			if (newPropDef != null)
				msgs = ((InternalEObject)newPropDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROPERTYVALUERECOMMENDEDPRESENTATION__PROP_DEF, null, msgs);
			msgs = basicSetPropDef(newPropDef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROPERTYVALUERECOMMENDEDPRESENTATION__PROP_DEF, newPropDef, newPropDef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UNIT getRecommendedPresentationUnit() {
		return recommendedPresentationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecommendedPresentationUnit(UNIT newRecommendedPresentationUnit, NotificationChain msgs) {
		UNIT oldRecommendedPresentationUnit = recommendedPresentationUnit;
		recommendedPresentationUnit = newRecommendedPresentationUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROPERTYVALUERECOMMENDEDPRESENTATION__RECOMMENDED_PRESENTATION_UNIT, oldRecommendedPresentationUnit, newRecommendedPresentationUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecommendedPresentationUnit(UNIT newRecommendedPresentationUnit) {
		if (newRecommendedPresentationUnit != recommendedPresentationUnit) {
			NotificationChain msgs = null;
			if (recommendedPresentationUnit != null)
				msgs = ((InternalEObject)recommendedPresentationUnit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROPERTYVALUERECOMMENDEDPRESENTATION__RECOMMENDED_PRESENTATION_UNIT, null, msgs);
			if (newRecommendedPresentationUnit != null)
				msgs = ((InternalEObject)newRecommendedPresentationUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROPERTYVALUERECOMMENDEDPRESENTATION__RECOMMENDED_PRESENTATION_UNIT, null, msgs);
			msgs = basicSetRecommendedPresentationUnit(newRecommendedPresentationUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROPERTYVALUERECOMMENDEDPRESENTATION__RECOMMENDED_PRESENTATION_UNIT, newRecommendedPresentationUnit, newRecommendedPresentationUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROPERTYVALUERECOMMENDEDPRESENTATION__PROP_DEF:
				return basicSetPropDef(null, msgs);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROPERTYVALUERECOMMENDEDPRESENTATION__RECOMMENDED_PRESENTATION_UNIT:
				return basicSetRecommendedPresentationUnit(null, msgs);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROPERTYVALUERECOMMENDEDPRESENTATION__RECOMMENDED_PRESENTATION_FORMAT:
				return getRecommendedPresentationFormat();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROPERTYVALUERECOMMENDEDPRESENTATION__PROP_DEF:
				return getPropDef();
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROPERTYVALUERECOMMENDEDPRESENTATION__RECOMMENDED_PRESENTATION_UNIT:
				return getRecommendedPresentationUnit();
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROPERTYVALUERECOMMENDEDPRESENTATION__RECOMMENDED_PRESENTATION_FORMAT:
				setRecommendedPresentationFormat((String)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROPERTYVALUERECOMMENDEDPRESENTATION__PROP_DEF:
				setPropDef((PROPERTYREFERENCE)newValue);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROPERTYVALUERECOMMENDEDPRESENTATION__RECOMMENDED_PRESENTATION_UNIT:
				setRecommendedPresentationUnit((UNIT)newValue);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROPERTYVALUERECOMMENDEDPRESENTATION__RECOMMENDED_PRESENTATION_FORMAT:
				setRecommendedPresentationFormat(RECOMMENDED_PRESENTATION_FORMAT_EDEFAULT);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROPERTYVALUERECOMMENDEDPRESENTATION__PROP_DEF:
				setPropDef((PROPERTYREFERENCE)null);
				return;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROPERTYVALUERECOMMENDEDPRESENTATION__RECOMMENDED_PRESENTATION_UNIT:
				setRecommendedPresentationUnit((UNIT)null);
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
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROPERTYVALUERECOMMENDEDPRESENTATION__RECOMMENDED_PRESENTATION_FORMAT:
				return RECOMMENDED_PRESENTATION_FORMAT_EDEFAULT == null ? recommendedPresentationFormat != null : !RECOMMENDED_PRESENTATION_FORMAT_EDEFAULT.equals(recommendedPresentationFormat);
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROPERTYVALUERECOMMENDEDPRESENTATION__PROP_DEF:
				return propDef != null;
			case Isostdisois_13584_32ed_1techxmlschemaontomlSimplifiedPackage.PROPERTYVALUERECOMMENDEDPRESENTATION__RECOMMENDED_PRESENTATION_UNIT:
				return recommendedPresentationUnit != null;
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
		result.append(" (recommendedPresentationFormat: ");
		result.append(recommendedPresentationFormat);
		result.append(')');
		return result.toString();
	}

} //PROPERTYVALUERECOMMENDEDPRESENTATIONImpl
