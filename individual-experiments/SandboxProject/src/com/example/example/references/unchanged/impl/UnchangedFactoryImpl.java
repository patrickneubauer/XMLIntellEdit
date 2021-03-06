/**
 */
package com.example.example.references.unchanged.impl;

import com.example.example.references.unchanged.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UnchangedFactoryImpl extends EFactoryImpl implements UnchangedFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UnchangedFactory init() {
		try {
			UnchangedFactory theUnchangedFactory = (UnchangedFactory)EPackage.Registry.INSTANCE.getEFactory(UnchangedPackage.eNS_URI);
			if (theUnchangedFactory != null) {
				return theUnchangedFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UnchangedFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnchangedFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case UnchangedPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case UnchangedPackage.ORDER_DETAIL1: return createOrderDetail1();
			case UnchangedPackage.ORDER_DETAIL2: return createOrderDetail2();
			case UnchangedPackage.ORDER_REF1: return createOrderRef1();
			case UnchangedPackage.ORDER_REF2: return createOrderRef2();
			case UnchangedPackage.ORDERS_TYPE: return createOrdersType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderDetail1 createOrderDetail1() {
		OrderDetail1Impl orderDetail1 = new OrderDetail1Impl();
		return orderDetail1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderDetail2 createOrderDetail2() {
		OrderDetail2Impl orderDetail2 = new OrderDetail2Impl();
		return orderDetail2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderRef1 createOrderRef1() {
		OrderRef1Impl orderRef1 = new OrderRef1Impl();
		return orderRef1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderRef2 createOrderRef2() {
		OrderRef2Impl orderRef2 = new OrderRef2Impl();
		return orderRef2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrdersType createOrdersType() {
		OrdersTypeImpl ordersType = new OrdersTypeImpl();
		return ordersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnchangedPackage getUnchangedPackage() {
		return (UnchangedPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UnchangedPackage getPackage() {
		return UnchangedPackage.eINSTANCE;
	}

} //UnchangedFactoryImpl
