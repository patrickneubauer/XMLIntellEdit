/**
 */
package com.example.example.with.anytypefeature.impl;

import com.example.example.with.anytypefeature.*;

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
public class AnytypefeatureFactoryImpl extends EFactoryImpl implements AnytypefeatureFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AnytypefeatureFactory init() {
		try {
			AnytypefeatureFactory theAnytypefeatureFactory = (AnytypefeatureFactory)EPackage.Registry.INSTANCE.getEFactory(AnytypefeaturePackage.eNS_URI);
			if (theAnytypefeatureFactory != null) {
				return theAnytypefeatureFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AnytypefeatureFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnytypefeatureFactoryImpl() {
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
			case AnytypefeaturePackage.DOCUMENT_ROOT: return createDocumentRoot();
			case AnytypefeaturePackage.ELEMENT1: return createElement1();
			case AnytypefeaturePackage.PROPERTIES: return createProperties();
			case AnytypefeaturePackage.ROOT_ELEMENT_TYPE: return createRootElementType();
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
	public Element1 createElement1() {
		Element1Impl element1 = new Element1Impl();
		return element1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Properties createProperties() {
		PropertiesImpl properties = new PropertiesImpl();
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootElementType createRootElementType() {
		RootElementTypeImpl rootElementType = new RootElementTypeImpl();
		return rootElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnytypefeaturePackage getAnytypefeaturePackage() {
		return (AnytypefeaturePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AnytypefeaturePackage getPackage() {
		return AnytypefeaturePackage.eINSTANCE;
	}

} //AnytypefeatureFactoryImpl
