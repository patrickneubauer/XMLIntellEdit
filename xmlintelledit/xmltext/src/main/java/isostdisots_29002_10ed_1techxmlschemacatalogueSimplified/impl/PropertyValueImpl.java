/**
 */
package isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage;
import isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.PropertyValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.impl.PropertyValueImpl#isIsProprietary <em>Is Proprietary</em>}</li>
 *   <li>{@link isostdisots_29002_10ed_1techxmlschemacatalogueSimplified.impl.PropertyValueImpl#getPropertyRef <em>Property Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyValueImpl extends MinimalEObjectImpl.Container implements PropertyValue {
	/**
	 * The default value of the '{@link #isIsProprietary() <em>Is Proprietary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsProprietary()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PROPRIETARY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsProprietary() <em>Is Proprietary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsProprietary()
	 * @generated
	 * @ordered
	 */
	protected boolean isProprietary = IS_PROPRIETARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPropertyRef() <em>Property Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyRef()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertyRef() <em>Property Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyRef()
	 * @generated
	 * @ordered
	 */
	protected String propertyRef = PROPERTY_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.Literals.PROPERTY_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsProprietary() {
		return isProprietary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsProprietary(boolean newIsProprietary) {
		boolean oldIsProprietary = isProprietary;
		isProprietary = newIsProprietary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.PROPERTY_VALUE__IS_PROPRIETARY, oldIsProprietary, isProprietary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPropertyRef() {
		return propertyRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyRef(String newPropertyRef) {
		String oldPropertyRef = propertyRef;
		propertyRef = newPropertyRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.PROPERTY_VALUE__PROPERTY_REF, oldPropertyRef, propertyRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.PROPERTY_VALUE__IS_PROPRIETARY:
				return isIsProprietary();
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.PROPERTY_VALUE__PROPERTY_REF:
				return getPropertyRef();
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
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.PROPERTY_VALUE__IS_PROPRIETARY:
				setIsProprietary((Boolean)newValue);
				return;
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.PROPERTY_VALUE__PROPERTY_REF:
				setPropertyRef((String)newValue);
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
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.PROPERTY_VALUE__IS_PROPRIETARY:
				setIsProprietary(IS_PROPRIETARY_EDEFAULT);
				return;
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.PROPERTY_VALUE__PROPERTY_REF:
				setPropertyRef(PROPERTY_REF_EDEFAULT);
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
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.PROPERTY_VALUE__IS_PROPRIETARY:
				return isProprietary != IS_PROPRIETARY_EDEFAULT;
			case Isostdisots_29002_10ed_1techxmlschemacatalogueSimplifiedPackage.PROPERTY_VALUE__PROPERTY_REF:
				return PROPERTY_REF_EDEFAULT == null ? propertyRef != null : !PROPERTY_REF_EDEFAULT.equals(propertyRef);
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
		result.append(" (isProprietary: ");
		result.append(isProprietary);
		result.append(", propertyRef: ");
		result.append(propertyRef);
		result.append(')');
		return result.toString();
	}

} //PropertyValueImpl
