/**
 */
package com.example.example.with.anyattribute.impl;

import com.example.example.with.anyattribute.AnyattributePackage;
import com.example.example.with.anyattribute.Element1;
import com.example.example.with.anyattribute.Element2;
import com.example.example.with.anyattribute.Element3;
import com.example.example.with.anyattribute.RootElementType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root Element Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.example.example.with.anyattribute.impl.RootElementTypeImpl#getElement1 <em>Element1</em>}</li>
 *   <li>{@link com.example.example.with.anyattribute.impl.RootElementTypeImpl#getElement2 <em>Element2</em>}</li>
 *   <li>{@link com.example.example.with.anyattribute.impl.RootElementTypeImpl#getElement3 <em>Element3</em>}</li>
 *   <li>{@link com.example.example.with.anyattribute.impl.RootElementTypeImpl#getAny <em>Any</em>}</li>
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
	 * The cached value of the '{@link #getElement2() <em>Element2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement2()
	 * @generated
	 * @ordered
	 */
	protected Element2 element2;

	/**
	 * The cached value of the '{@link #getElement3() <em>Element3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement3()
	 * @generated
	 * @ordered
	 */
	protected Element3 element3;

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
		return AnyattributePackage.Literals.ROOT_ELEMENT_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnyattributePackage.ROOT_ELEMENT_TYPE__ELEMENT1, oldElement1, newElement1);
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
				msgs = ((InternalEObject)element1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnyattributePackage.ROOT_ELEMENT_TYPE__ELEMENT1, null, msgs);
			if (newElement1 != null)
				msgs = ((InternalEObject)newElement1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnyattributePackage.ROOT_ELEMENT_TYPE__ELEMENT1, null, msgs);
			msgs = basicSetElement1(newElement1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnyattributePackage.ROOT_ELEMENT_TYPE__ELEMENT1, newElement1, newElement1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element2 getElement2() {
		return element2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElement2(Element2 newElement2, NotificationChain msgs) {
		Element2 oldElement2 = element2;
		element2 = newElement2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnyattributePackage.ROOT_ELEMENT_TYPE__ELEMENT2, oldElement2, newElement2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement2(Element2 newElement2) {
		if (newElement2 != element2) {
			NotificationChain msgs = null;
			if (element2 != null)
				msgs = ((InternalEObject)element2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnyattributePackage.ROOT_ELEMENT_TYPE__ELEMENT2, null, msgs);
			if (newElement2 != null)
				msgs = ((InternalEObject)newElement2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnyattributePackage.ROOT_ELEMENT_TYPE__ELEMENT2, null, msgs);
			msgs = basicSetElement2(newElement2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnyattributePackage.ROOT_ELEMENT_TYPE__ELEMENT2, newElement2, newElement2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element3 getElement3() {
		return element3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElement3(Element3 newElement3, NotificationChain msgs) {
		Element3 oldElement3 = element3;
		element3 = newElement3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnyattributePackage.ROOT_ELEMENT_TYPE__ELEMENT3, oldElement3, newElement3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement3(Element3 newElement3) {
		if (newElement3 != element3) {
			NotificationChain msgs = null;
			if (element3 != null)
				msgs = ((InternalEObject)element3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnyattributePackage.ROOT_ELEMENT_TYPE__ELEMENT3, null, msgs);
			if (newElement3 != null)
				msgs = ((InternalEObject)newElement3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnyattributePackage.ROOT_ELEMENT_TYPE__ELEMENT3, null, msgs);
			msgs = basicSetElement3(newElement3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnyattributePackage.ROOT_ELEMENT_TYPE__ELEMENT3, newElement3, newElement3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, AnyattributePackage.ROOT_ELEMENT_TYPE__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnyattributePackage.ROOT_ELEMENT_TYPE__ELEMENT1:
				return basicSetElement1(null, msgs);
			case AnyattributePackage.ROOT_ELEMENT_TYPE__ELEMENT2:
				return basicSetElement2(null, msgs);
			case AnyattributePackage.ROOT_ELEMENT_TYPE__ELEMENT3:
				return basicSetElement3(null, msgs);
			case AnyattributePackage.ROOT_ELEMENT_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
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
			case AnyattributePackage.ROOT_ELEMENT_TYPE__ELEMENT1:
				return getElement1();
			case AnyattributePackage.ROOT_ELEMENT_TYPE__ELEMENT2:
				return getElement2();
			case AnyattributePackage.ROOT_ELEMENT_TYPE__ELEMENT3:
				return getElement3();
			case AnyattributePackage.ROOT_ELEMENT_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
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
			case AnyattributePackage.ROOT_ELEMENT_TYPE__ELEMENT1:
				setElement1((Element1)newValue);
				return;
			case AnyattributePackage.ROOT_ELEMENT_TYPE__ELEMENT2:
				setElement2((Element2)newValue);
				return;
			case AnyattributePackage.ROOT_ELEMENT_TYPE__ELEMENT3:
				setElement3((Element3)newValue);
				return;
			case AnyattributePackage.ROOT_ELEMENT_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
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
			case AnyattributePackage.ROOT_ELEMENT_TYPE__ELEMENT1:
				setElement1((Element1)null);
				return;
			case AnyattributePackage.ROOT_ELEMENT_TYPE__ELEMENT2:
				setElement2((Element2)null);
				return;
			case AnyattributePackage.ROOT_ELEMENT_TYPE__ELEMENT3:
				setElement3((Element3)null);
				return;
			case AnyattributePackage.ROOT_ELEMENT_TYPE__ANY:
				getAny().clear();
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
			case AnyattributePackage.ROOT_ELEMENT_TYPE__ELEMENT1:
				return element1 != null;
			case AnyattributePackage.ROOT_ELEMENT_TYPE__ELEMENT2:
				return element2 != null;
			case AnyattributePackage.ROOT_ELEMENT_TYPE__ELEMENT3:
				return element3 != null;
			case AnyattributePackage.ROOT_ELEMENT_TYPE__ANY:
				return any != null && !any.isEmpty();
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

} //RootElementTypeImpl
