/**
 */
package com.example.example.with.anytypefeature.impl;

import com.example.example.with.anytypefeature.AnytypefeaturePackage;
import com.example.example.with.anytypefeature.Properties;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.example.example.with.anytypefeature.impl.PropertiesImpl#getAnything <em>Anything</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertiesImpl extends MinimalEObjectImpl.Container implements Properties {
	/**
	 * The cached value of the '{@link #getAnything() <em>Anything</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnything()
	 * @generated
	 * @ordered
	 */
	protected EObject anything;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnytypefeaturePackage.Literals.PROPERTIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getAnything() {
		return anything;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnything(EObject newAnything, NotificationChain msgs) {
		EObject oldAnything = anything;
		anything = newAnything;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnytypefeaturePackage.PROPERTIES__ANYTHING, oldAnything, newAnything);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnything(EObject newAnything) {
		if (newAnything != anything) {
			NotificationChain msgs = null;
			if (anything != null)
				msgs = ((InternalEObject)anything).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnytypefeaturePackage.PROPERTIES__ANYTHING, null, msgs);
			if (newAnything != null)
				msgs = ((InternalEObject)newAnything).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnytypefeaturePackage.PROPERTIES__ANYTHING, null, msgs);
			msgs = basicSetAnything(newAnything, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnytypefeaturePackage.PROPERTIES__ANYTHING, newAnything, newAnything));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnytypefeaturePackage.PROPERTIES__ANYTHING:
				return basicSetAnything(null, msgs);
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
			case AnytypefeaturePackage.PROPERTIES__ANYTHING:
				return getAnything();
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
			case AnytypefeaturePackage.PROPERTIES__ANYTHING:
				setAnything((EObject)newValue);
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
			case AnytypefeaturePackage.PROPERTIES__ANYTHING:
				setAnything((EObject)null);
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
			case AnytypefeaturePackage.PROPERTIES__ANYTHING:
				return anything != null;
		}
		return super.eIsSet(featureID);
	}

} //PropertiesImpl
