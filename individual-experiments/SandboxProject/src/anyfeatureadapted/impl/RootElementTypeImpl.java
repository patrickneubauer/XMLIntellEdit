/**
 */
package anyfeatureadapted.impl;

import anyfeatureadapted.AnyfeatureadaptedPackage;
import anyfeatureadapted.Element1;
import anyfeatureadapted.Properties;
import anyfeatureadapted.RootElementType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root Element Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link anyfeatureadapted.impl.RootElementTypeImpl#getElement1 <em>Element1</em>}</li>
 *   <li>{@link anyfeatureadapted.impl.RootElementTypeImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RootElementTypeImpl extends MinimalEObjectImpl.Container implements RootElementType {
	/**
	 * The cached value of the '{@link #getElement1() <em>Element1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement1()
	 * @generated
	 * @ordered
	 */
	protected Element1 element1;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected Properties properties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootElementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnyfeatureadaptedPackage.Literals.ROOT_ELEMENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element1 getElement1() {
		return element1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElement1(Element1 newElement1, NotificationChain msgs) {
		Element1 oldElement1 = element1;
		element1 = newElement1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnyfeatureadaptedPackage.ROOT_ELEMENT_TYPE__ELEMENT1, oldElement1, newElement1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement1(Element1 newElement1) {
		if (newElement1 != element1) {
			NotificationChain msgs = null;
			if (element1 != null)
				msgs = ((InternalEObject)element1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnyfeatureadaptedPackage.ROOT_ELEMENT_TYPE__ELEMENT1, null, msgs);
			if (newElement1 != null)
				msgs = ((InternalEObject)newElement1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnyfeatureadaptedPackage.ROOT_ELEMENT_TYPE__ELEMENT1, null, msgs);
			msgs = basicSetElement1(newElement1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnyfeatureadaptedPackage.ROOT_ELEMENT_TYPE__ELEMENT1, newElement1, newElement1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Properties getProperties() {
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperties(Properties newProperties, NotificationChain msgs) {
		Properties oldProperties = properties;
		properties = newProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnyfeatureadaptedPackage.ROOT_ELEMENT_TYPE__PROPERTIES, oldProperties, newProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperties(Properties newProperties) {
		if (newProperties != properties) {
			NotificationChain msgs = null;
			if (properties != null)
				msgs = ((InternalEObject)properties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnyfeatureadaptedPackage.ROOT_ELEMENT_TYPE__PROPERTIES, null, msgs);
			if (newProperties != null)
				msgs = ((InternalEObject)newProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnyfeatureadaptedPackage.ROOT_ELEMENT_TYPE__PROPERTIES, null, msgs);
			msgs = basicSetProperties(newProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnyfeatureadaptedPackage.ROOT_ELEMENT_TYPE__PROPERTIES, newProperties, newProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnyfeatureadaptedPackage.ROOT_ELEMENT_TYPE__ELEMENT1:
				return basicSetElement1(null, msgs);
			case AnyfeatureadaptedPackage.ROOT_ELEMENT_TYPE__PROPERTIES:
				return basicSetProperties(null, msgs);
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
			case AnyfeatureadaptedPackage.ROOT_ELEMENT_TYPE__ELEMENT1:
				return getElement1();
			case AnyfeatureadaptedPackage.ROOT_ELEMENT_TYPE__PROPERTIES:
				return getProperties();
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
			case AnyfeatureadaptedPackage.ROOT_ELEMENT_TYPE__ELEMENT1:
				setElement1((Element1)newValue);
				return;
			case AnyfeatureadaptedPackage.ROOT_ELEMENT_TYPE__PROPERTIES:
				setProperties((Properties)newValue);
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
			case AnyfeatureadaptedPackage.ROOT_ELEMENT_TYPE__ELEMENT1:
				setElement1((Element1)null);
				return;
			case AnyfeatureadaptedPackage.ROOT_ELEMENT_TYPE__PROPERTIES:
				setProperties((Properties)null);
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
			case AnyfeatureadaptedPackage.ROOT_ELEMENT_TYPE__ELEMENT1:
				return element1 != null;
			case AnyfeatureadaptedPackage.ROOT_ELEMENT_TYPE__PROPERTIES:
				return properties != null;
		}
		return super.eIsSet(featureID);
	}

} //RootElementTypeImpl
