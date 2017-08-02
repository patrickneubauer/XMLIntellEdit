/**
 */
package com.example.example.referencesuntypedimports.impl;

import com.example.example.referencesuntypedimports.OrderDetail1;
import com.example.example.referencesuntypedimports.OrderDetail2;
import com.example.example.referencesuntypedimports.OrderRef1;
import com.example.example.referencesuntypedimports.OrderRef2;
import com.example.example.referencesuntypedimports.OrdersType;
import com.example.example.referencesuntypedimports.ReferencesuntypedimportsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Orders Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.example.example.referencesuntypedimports.impl.OrdersTypeImpl#getOrder1 <em>Order1</em>}</li>
 *   <li>{@link com.example.example.referencesuntypedimports.impl.OrdersTypeImpl#getOrder2 <em>Order2</em>}</li>
 *   <li>{@link com.example.example.referencesuntypedimports.impl.OrdersTypeImpl#getOrderReference1 <em>Order Reference1</em>}</li>
 *   <li>{@link com.example.example.referencesuntypedimports.impl.OrdersTypeImpl#getOrderReference2 <em>Order Reference2</em>}</li>
 *   <li>{@link com.example.example.referencesuntypedimports.impl.OrdersTypeImpl#getImportURI <em>Import URI</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrdersTypeImpl extends MinimalEObjectImpl.Container implements OrdersType {
	/**
	 * The cached value of the '{@link #getOrder1() <em>Order1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder1()
	 * @generated
	 * @ordered
	 */
	protected EList<OrderDetail1> order1;

	/**
	 * The cached value of the '{@link #getOrder2() <em>Order2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder2()
	 * @generated
	 * @ordered
	 */
	protected EList<OrderDetail2> order2;

	/**
	 * The cached value of the '{@link #getOrderReference1() <em>Order Reference1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderReference1()
	 * @generated
	 * @ordered
	 */
	protected EList<OrderRef1> orderReference1;

	/**
	 * The cached value of the '{@link #getOrderReference2() <em>Order Reference2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderReference2()
	 * @generated
	 * @ordered
	 */
	protected EList<OrderRef2> orderReference2;

	/**
	 * The default value of the '{@link #getImportURI() <em>Import URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportURI()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPORT_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImportURI() <em>Import URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportURI()
	 * @generated
	 * @ordered
	 */
	protected String importURI = IMPORT_URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrdersTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReferencesuntypedimportsPackage.Literals.ORDERS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrderDetail1> getOrder1() {
		if (order1 == null) {
			order1 = new EObjectContainmentEList<OrderDetail1>(OrderDetail1.class, this, ReferencesuntypedimportsPackage.ORDERS_TYPE__ORDER1);
		}
		return order1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrderDetail2> getOrder2() {
		if (order2 == null) {
			order2 = new EObjectContainmentEList<OrderDetail2>(OrderDetail2.class, this, ReferencesuntypedimportsPackage.ORDERS_TYPE__ORDER2);
		}
		return order2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrderRef1> getOrderReference1() {
		if (orderReference1 == null) {
			orderReference1 = new EObjectContainmentEList<OrderRef1>(OrderRef1.class, this, ReferencesuntypedimportsPackage.ORDERS_TYPE__ORDER_REFERENCE1);
		}
		return orderReference1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrderRef2> getOrderReference2() {
		if (orderReference2 == null) {
			orderReference2 = new EObjectContainmentEList<OrderRef2>(OrderRef2.class, this, ReferencesuntypedimportsPackage.ORDERS_TYPE__ORDER_REFERENCE2);
		}
		return orderReference2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImportURI() {
		return importURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportURI(String newImportURI) {
		String oldImportURI = importURI;
		importURI = newImportURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferencesuntypedimportsPackage.ORDERS_TYPE__IMPORT_URI, oldImportURI, importURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReferencesuntypedimportsPackage.ORDERS_TYPE__ORDER1:
				return ((InternalEList<?>)getOrder1()).basicRemove(otherEnd, msgs);
			case ReferencesuntypedimportsPackage.ORDERS_TYPE__ORDER2:
				return ((InternalEList<?>)getOrder2()).basicRemove(otherEnd, msgs);
			case ReferencesuntypedimportsPackage.ORDERS_TYPE__ORDER_REFERENCE1:
				return ((InternalEList<?>)getOrderReference1()).basicRemove(otherEnd, msgs);
			case ReferencesuntypedimportsPackage.ORDERS_TYPE__ORDER_REFERENCE2:
				return ((InternalEList<?>)getOrderReference2()).basicRemove(otherEnd, msgs);
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
			case ReferencesuntypedimportsPackage.ORDERS_TYPE__ORDER1:
				return getOrder1();
			case ReferencesuntypedimportsPackage.ORDERS_TYPE__ORDER2:
				return getOrder2();
			case ReferencesuntypedimportsPackage.ORDERS_TYPE__ORDER_REFERENCE1:
				return getOrderReference1();
			case ReferencesuntypedimportsPackage.ORDERS_TYPE__ORDER_REFERENCE2:
				return getOrderReference2();
			case ReferencesuntypedimportsPackage.ORDERS_TYPE__IMPORT_URI:
				return getImportURI();
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
			case ReferencesuntypedimportsPackage.ORDERS_TYPE__ORDER1:
				getOrder1().clear();
				getOrder1().addAll((Collection<? extends OrderDetail1>)newValue);
				return;
			case ReferencesuntypedimportsPackage.ORDERS_TYPE__ORDER2:
				getOrder2().clear();
				getOrder2().addAll((Collection<? extends OrderDetail2>)newValue);
				return;
			case ReferencesuntypedimportsPackage.ORDERS_TYPE__ORDER_REFERENCE1:
				getOrderReference1().clear();
				getOrderReference1().addAll((Collection<? extends OrderRef1>)newValue);
				return;
			case ReferencesuntypedimportsPackage.ORDERS_TYPE__ORDER_REFERENCE2:
				getOrderReference2().clear();
				getOrderReference2().addAll((Collection<? extends OrderRef2>)newValue);
				return;
			case ReferencesuntypedimportsPackage.ORDERS_TYPE__IMPORT_URI:
				setImportURI((String)newValue);
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
			case ReferencesuntypedimportsPackage.ORDERS_TYPE__ORDER1:
				getOrder1().clear();
				return;
			case ReferencesuntypedimportsPackage.ORDERS_TYPE__ORDER2:
				getOrder2().clear();
				return;
			case ReferencesuntypedimportsPackage.ORDERS_TYPE__ORDER_REFERENCE1:
				getOrderReference1().clear();
				return;
			case ReferencesuntypedimportsPackage.ORDERS_TYPE__ORDER_REFERENCE2:
				getOrderReference2().clear();
				return;
			case ReferencesuntypedimportsPackage.ORDERS_TYPE__IMPORT_URI:
				setImportURI(IMPORT_URI_EDEFAULT);
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
			case ReferencesuntypedimportsPackage.ORDERS_TYPE__ORDER1:
				return order1 != null && !order1.isEmpty();
			case ReferencesuntypedimportsPackage.ORDERS_TYPE__ORDER2:
				return order2 != null && !order2.isEmpty();
			case ReferencesuntypedimportsPackage.ORDERS_TYPE__ORDER_REFERENCE1:
				return orderReference1 != null && !orderReference1.isEmpty();
			case ReferencesuntypedimportsPackage.ORDERS_TYPE__ORDER_REFERENCE2:
				return orderReference2 != null && !orderReference2.isEmpty();
			case ReferencesuntypedimportsPackage.ORDERS_TYPE__IMPORT_URI:
				return IMPORT_URI_EDEFAULT == null ? importURI != null : !IMPORT_URI_EDEFAULT.equals(importURI);
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
		result.append(" (importURI: ");
		result.append(importURI);
		result.append(')');
		return result.toString();
	}

} //OrdersTypeImpl
