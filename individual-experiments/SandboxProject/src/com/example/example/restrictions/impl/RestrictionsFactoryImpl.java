/**
 */
package com.example.example.restrictions.impl;

import com.example.example.restrictions.*;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RestrictionsFactoryImpl extends EFactoryImpl implements RestrictionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RestrictionsFactory init() {
		try {
			RestrictionsFactory theRestrictionsFactory = (RestrictionsFactory)EPackage.Registry.INSTANCE.getEFactory(RestrictionsPackage.eNS_URI);
			if (theRestrictionsFactory != null) {
				return theRestrictionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RestrictionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestrictionsFactoryImpl() {
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
			case RestrictionsPackage.ADDRESS: return createAddress();
			case RestrictionsPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case RestrictionsPackage.ORDER_DETAIL: return createOrderDetail();
			case RestrictionsPackage.ORDERS_TYPE: return createOrdersType();
			case RestrictionsPackage.RESTRICTED_ADDRESS: return createRestrictedAddress();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case RestrictionsPackage.US_STATE:
				return createUSStateFromString(eDataType, initialValue);
			case RestrictionsPackage.CUSTOMER_AGE:
				return createCustomerAgeFromString(eDataType, initialValue);
			case RestrictionsPackage.CUSTOMER_CONTACT_NUMBER1:
				return createCustomerContactNumber1FromString(eDataType, initialValue);
			case RestrictionsPackage.CUSTOMER_FIRST_NAME:
				return createCustomerFirstNameFromString(eDataType, initialValue);
			case RestrictionsPackage.CUSTOMER_LAST_NAME:
				return createCustomerLastNameFromString(eDataType, initialValue);
			case RestrictionsPackage.CUSTOMER_NUMBER:
				return createCustomerNumberFromString(eDataType, initialValue);
			case RestrictionsPackage.CUSTOMER_PASSWORD:
				return createCustomerPasswordFromString(eDataType, initialValue);
			case RestrictionsPackage.US_STATE_OBJECT:
				return createUSStateObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case RestrictionsPackage.US_STATE:
				return convertUSStateToString(eDataType, instanceValue);
			case RestrictionsPackage.CUSTOMER_AGE:
				return convertCustomerAgeToString(eDataType, instanceValue);
			case RestrictionsPackage.CUSTOMER_CONTACT_NUMBER1:
				return convertCustomerContactNumber1ToString(eDataType, instanceValue);
			case RestrictionsPackage.CUSTOMER_FIRST_NAME:
				return convertCustomerFirstNameToString(eDataType, instanceValue);
			case RestrictionsPackage.CUSTOMER_LAST_NAME:
				return convertCustomerLastNameToString(eDataType, instanceValue);
			case RestrictionsPackage.CUSTOMER_NUMBER:
				return convertCustomerNumberToString(eDataType, instanceValue);
			case RestrictionsPackage.CUSTOMER_PASSWORD:
				return convertCustomerPasswordToString(eDataType, instanceValue);
			case RestrictionsPackage.US_STATE_OBJECT:
				return convertUSStateObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Address createAddress() {
		AddressImpl address = new AddressImpl();
		return address;
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
	public OrderDetail createOrderDetail() {
		OrderDetailImpl orderDetail = new OrderDetailImpl();
		return orderDetail;
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
	public RestrictedAddress createRestrictedAddress() {
		RestrictedAddressImpl restrictedAddress = new RestrictedAddressImpl();
		return restrictedAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public USState createUSStateFromString(EDataType eDataType, String initialValue) {
		USState result = USState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUSStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createCustomerAgeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCustomerAgeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createCustomerContactNumber1FromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCustomerContactNumber1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCustomerFirstNameFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCustomerFirstNameToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCustomerLastNameFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCustomerLastNameToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCustomerNumberFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCustomerNumberToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCustomerPasswordFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCustomerPasswordToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public USState createUSStateObjectFromString(EDataType eDataType, String initialValue) {
		return createUSStateFromString(RestrictionsPackage.Literals.US_STATE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUSStateObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUSStateToString(RestrictionsPackage.Literals.US_STATE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestrictionsPackage getRestrictionsPackage() {
		return (RestrictionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RestrictionsPackage getPackage() {
		return RestrictionsPackage.eINSTANCE;
	}

} //RestrictionsFactoryImpl
