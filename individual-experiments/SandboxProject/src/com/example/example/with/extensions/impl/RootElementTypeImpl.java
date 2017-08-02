/**
 */
package com.example.example.with.extensions.impl;

import com.example.example.with.extensions.Address;
import com.example.example.with.extensions.ExtendedAddress;
import com.example.example.with.extensions.ExtensionsPackage;
import com.example.example.with.extensions.Language;
import com.example.example.with.extensions.RootElementType;

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
 *   <li>{@link com.example.example.with.extensions.impl.RootElementTypeImpl#getExtendedAddress <em>Extended Address</em>}</li>
 *   <li>{@link com.example.example.with.extensions.impl.RootElementTypeImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link com.example.example.with.extensions.impl.RootElementTypeImpl#getLanguage <em>Language</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RootElementTypeImpl extends MinimalEObjectImpl.Container implements RootElementType {
	/**
	 * The cached value of the '{@link #getExtendedAddress() <em>Extended Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedAddress()
	 * @generated
	 * @ordered
	 */
	protected ExtendedAddress extendedAddress;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected Address address;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected Language language;

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
		return ExtensionsPackage.Literals.ROOT_ELEMENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedAddress getExtendedAddress() {
		return extendedAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtendedAddress(ExtendedAddress newExtendedAddress, NotificationChain msgs) {
		ExtendedAddress oldExtendedAddress = extendedAddress;
		extendedAddress = newExtendedAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtensionsPackage.ROOT_ELEMENT_TYPE__EXTENDED_ADDRESS, oldExtendedAddress, newExtendedAddress);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendedAddress(ExtendedAddress newExtendedAddress) {
		if (newExtendedAddress != extendedAddress) {
			NotificationChain msgs = null;
			if (extendedAddress != null)
				msgs = ((InternalEObject)extendedAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtensionsPackage.ROOT_ELEMENT_TYPE__EXTENDED_ADDRESS, null, msgs);
			if (newExtendedAddress != null)
				msgs = ((InternalEObject)newExtendedAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExtensionsPackage.ROOT_ELEMENT_TYPE__EXTENDED_ADDRESS, null, msgs);
			msgs = basicSetExtendedAddress(newExtendedAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionsPackage.ROOT_ELEMENT_TYPE__EXTENDED_ADDRESS, newExtendedAddress, newExtendedAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddress(Address newAddress, NotificationChain msgs) {
		Address oldAddress = address;
		address = newAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtensionsPackage.ROOT_ELEMENT_TYPE__ADDRESS, oldAddress, newAddress);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(Address newAddress) {
		if (newAddress != address) {
			NotificationChain msgs = null;
			if (address != null)
				msgs = ((InternalEObject)address).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtensionsPackage.ROOT_ELEMENT_TYPE__ADDRESS, null, msgs);
			if (newAddress != null)
				msgs = ((InternalEObject)newAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExtensionsPackage.ROOT_ELEMENT_TYPE__ADDRESS, null, msgs);
			msgs = basicSetAddress(newAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionsPackage.ROOT_ELEMENT_TYPE__ADDRESS, newAddress, newAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Language getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLanguage(Language newLanguage, NotificationChain msgs) {
		Language oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtensionsPackage.ROOT_ELEMENT_TYPE__LANGUAGE, oldLanguage, newLanguage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(Language newLanguage) {
		if (newLanguage != language) {
			NotificationChain msgs = null;
			if (language != null)
				msgs = ((InternalEObject)language).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtensionsPackage.ROOT_ELEMENT_TYPE__LANGUAGE, null, msgs);
			if (newLanguage != null)
				msgs = ((InternalEObject)newLanguage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExtensionsPackage.ROOT_ELEMENT_TYPE__LANGUAGE, null, msgs);
			msgs = basicSetLanguage(newLanguage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionsPackage.ROOT_ELEMENT_TYPE__LANGUAGE, newLanguage, newLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExtensionsPackage.ROOT_ELEMENT_TYPE__EXTENDED_ADDRESS:
				return basicSetExtendedAddress(null, msgs);
			case ExtensionsPackage.ROOT_ELEMENT_TYPE__ADDRESS:
				return basicSetAddress(null, msgs);
			case ExtensionsPackage.ROOT_ELEMENT_TYPE__LANGUAGE:
				return basicSetLanguage(null, msgs);
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
			case ExtensionsPackage.ROOT_ELEMENT_TYPE__EXTENDED_ADDRESS:
				return getExtendedAddress();
			case ExtensionsPackage.ROOT_ELEMENT_TYPE__ADDRESS:
				return getAddress();
			case ExtensionsPackage.ROOT_ELEMENT_TYPE__LANGUAGE:
				return getLanguage();
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
			case ExtensionsPackage.ROOT_ELEMENT_TYPE__EXTENDED_ADDRESS:
				setExtendedAddress((ExtendedAddress)newValue);
				return;
			case ExtensionsPackage.ROOT_ELEMENT_TYPE__ADDRESS:
				setAddress((Address)newValue);
				return;
			case ExtensionsPackage.ROOT_ELEMENT_TYPE__LANGUAGE:
				setLanguage((Language)newValue);
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
			case ExtensionsPackage.ROOT_ELEMENT_TYPE__EXTENDED_ADDRESS:
				setExtendedAddress((ExtendedAddress)null);
				return;
			case ExtensionsPackage.ROOT_ELEMENT_TYPE__ADDRESS:
				setAddress((Address)null);
				return;
			case ExtensionsPackage.ROOT_ELEMENT_TYPE__LANGUAGE:
				setLanguage((Language)null);
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
			case ExtensionsPackage.ROOT_ELEMENT_TYPE__EXTENDED_ADDRESS:
				return extendedAddress != null;
			case ExtensionsPackage.ROOT_ELEMENT_TYPE__ADDRESS:
				return address != null;
			case ExtensionsPackage.ROOT_ELEMENT_TYPE__LANGUAGE:
				return language != null;
		}
		return super.eIsSet(featureID);
	}

} //RootElementTypeImpl
