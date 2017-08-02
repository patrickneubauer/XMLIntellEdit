/**
 */
package com.example.example.with.group.impl;

import com.example.example.with.group.Element1;
import com.example.example.with.group.Element1Choice;
import com.example.example.with.group.GroupPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.example.example.with.group.impl.Element1Impl#getElement1Choice <em>Element1 Choice</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Element1Impl extends MinimalEObjectImpl.Container implements Element1 {
	/**
	 * The cached value of the '{@link #getElement1Choice() <em>Element1 Choice</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement1Choice()
	 * @generated
	 * @ordered
	 */
	protected Element1Choice element1Choice;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Element1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GroupPackage.Literals.ELEMENT1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element1Choice getElement1Choice() {
		return element1Choice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElement1Choice(Element1Choice newElement1Choice, NotificationChain msgs) {
		Element1Choice oldElement1Choice = element1Choice;
		element1Choice = newElement1Choice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GroupPackage.ELEMENT1__ELEMENT1_CHOICE, oldElement1Choice, newElement1Choice);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement1Choice(Element1Choice newElement1Choice) {
		if (newElement1Choice != element1Choice) {
			NotificationChain msgs = null;
			if (element1Choice != null)
				msgs = ((InternalEObject)element1Choice).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GroupPackage.ELEMENT1__ELEMENT1_CHOICE, null, msgs);
			if (newElement1Choice != null)
				msgs = ((InternalEObject)newElement1Choice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GroupPackage.ELEMENT1__ELEMENT1_CHOICE, null, msgs);
			msgs = basicSetElement1Choice(newElement1Choice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupPackage.ELEMENT1__ELEMENT1_CHOICE, newElement1Choice, newElement1Choice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GroupPackage.ELEMENT1__ELEMENT1_CHOICE:
				return basicSetElement1Choice(null, msgs);
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
			case GroupPackage.ELEMENT1__ELEMENT1_CHOICE:
				return getElement1Choice();
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
			case GroupPackage.ELEMENT1__ELEMENT1_CHOICE:
				setElement1Choice((Element1Choice)newValue);
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
			case GroupPackage.ELEMENT1__ELEMENT1_CHOICE:
				setElement1Choice((Element1Choice)null);
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
			case GroupPackage.ELEMENT1__ELEMENT1_CHOICE:
				return element1Choice != null;
		}
		return super.eIsSet(featureID);
	}

} //Element1Impl
