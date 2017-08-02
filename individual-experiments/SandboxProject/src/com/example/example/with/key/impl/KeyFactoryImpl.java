/**
 */
package com.example.example.with.key.impl;

import com.example.example.with.key.*;

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
public class KeyFactoryImpl extends EFactoryImpl implements KeyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KeyFactory init() {
		try {
			KeyFactory theKeyFactory = (KeyFactory)EPackage.Registry.INSTANCE.getEFactory(KeyPackage.eNS_URI);
			if (theKeyFactory != null) {
				return theKeyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new KeyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyFactoryImpl() {
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
			case KeyPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case KeyPackage.INFANT_TYPE: return createInfantType();
			case KeyPackage.PASSENGERS_TYPE: return createPassengersType();
			case KeyPackage.PASSENGER_TYPE: return createPassengerType();
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
	public InfantType createInfantType() {
		InfantTypeImpl infantType = new InfantTypeImpl();
		return infantType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassengersType createPassengersType() {
		PassengersTypeImpl passengersType = new PassengersTypeImpl();
		return passengersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassengerType createPassengerType() {
		PassengerTypeImpl passengerType = new PassengerTypeImpl();
		return passengerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyPackage getKeyPackage() {
		return (KeyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static KeyPackage getPackage() {
		return KeyPackage.eINSTANCE;
	}

} //KeyFactoryImpl
