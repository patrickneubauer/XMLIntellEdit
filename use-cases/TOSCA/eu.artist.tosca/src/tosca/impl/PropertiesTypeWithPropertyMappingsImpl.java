/**
 */
package tosca.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import tosca.PropertiesTypeWithPropertyMappings;
import tosca.PropertyMappingsType;
import tosca.ToscaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Properties Type With Property Mappings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tosca.impl.PropertiesTypeWithPropertyMappingsImpl#getAny <em>Any</em>}</li>
 *   <li>{@link tosca.impl.PropertiesTypeWithPropertyMappingsImpl#getPropertyMappings <em>Property Mappings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertiesTypeWithPropertyMappingsImpl extends MinimalEObjectImpl.Container implements PropertiesTypeWithPropertyMappings {
	/**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap any;

	/**
	 * The cached value of the '{@link #getPropertyMappings() <em>Property Mappings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyMappings()
	 * @generated
	 * @ordered
	 */
	protected PropertyMappingsType propertyMappings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertiesTypeWithPropertyMappingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToscaPackage.Literals.PROPERTIES_TYPE_WITH_PROPERTY_MAPPINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, ToscaPackage.PROPERTIES_TYPE_WITH_PROPERTY_MAPPINGS__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyMappingsType getPropertyMappings() {
		return propertyMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyMappings(PropertyMappingsType newPropertyMappings, NotificationChain msgs) {
		PropertyMappingsType oldPropertyMappings = propertyMappings;
		propertyMappings = newPropertyMappings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToscaPackage.PROPERTIES_TYPE_WITH_PROPERTY_MAPPINGS__PROPERTY_MAPPINGS, oldPropertyMappings, newPropertyMappings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyMappings(PropertyMappingsType newPropertyMappings) {
		if (newPropertyMappings != propertyMappings) {
			NotificationChain msgs = null;
			if (propertyMappings != null)
				msgs = ((InternalEObject)propertyMappings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.PROPERTIES_TYPE_WITH_PROPERTY_MAPPINGS__PROPERTY_MAPPINGS, null, msgs);
			if (newPropertyMappings != null)
				msgs = ((InternalEObject)newPropertyMappings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.PROPERTIES_TYPE_WITH_PROPERTY_MAPPINGS__PROPERTY_MAPPINGS, null, msgs);
			msgs = basicSetPropertyMappings(newPropertyMappings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.PROPERTIES_TYPE_WITH_PROPERTY_MAPPINGS__PROPERTY_MAPPINGS, newPropertyMappings, newPropertyMappings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToscaPackage.PROPERTIES_TYPE_WITH_PROPERTY_MAPPINGS__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case ToscaPackage.PROPERTIES_TYPE_WITH_PROPERTY_MAPPINGS__PROPERTY_MAPPINGS:
				return basicSetPropertyMappings(null, msgs);
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
			case ToscaPackage.PROPERTIES_TYPE_WITH_PROPERTY_MAPPINGS__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case ToscaPackage.PROPERTIES_TYPE_WITH_PROPERTY_MAPPINGS__PROPERTY_MAPPINGS:
				return getPropertyMappings();
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
			case ToscaPackage.PROPERTIES_TYPE_WITH_PROPERTY_MAPPINGS__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case ToscaPackage.PROPERTIES_TYPE_WITH_PROPERTY_MAPPINGS__PROPERTY_MAPPINGS:
				setPropertyMappings((PropertyMappingsType)newValue);
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
			case ToscaPackage.PROPERTIES_TYPE_WITH_PROPERTY_MAPPINGS__ANY:
				getAny().clear();
				return;
			case ToscaPackage.PROPERTIES_TYPE_WITH_PROPERTY_MAPPINGS__PROPERTY_MAPPINGS:
				setPropertyMappings((PropertyMappingsType)null);
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
			case ToscaPackage.PROPERTIES_TYPE_WITH_PROPERTY_MAPPINGS__ANY:
				return any != null && !any.isEmpty();
			case ToscaPackage.PROPERTIES_TYPE_WITH_PROPERTY_MAPPINGS__PROPERTY_MAPPINGS:
				return propertyMappings != null;
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
		result.append(" (any: ");
		result.append(any);
		result.append(')');
		return result.toString();
	}

} //PropertiesTypeWithPropertyMappingsImpl
