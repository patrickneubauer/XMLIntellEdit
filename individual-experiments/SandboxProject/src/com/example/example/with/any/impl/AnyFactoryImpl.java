/**
 */
package com.example.example.with.any.impl;

import com.example.example.with.any.*;

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
public class AnyFactoryImpl extends EFactoryImpl implements AnyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AnyFactory init() {
		try {
			AnyFactory theAnyFactory = (AnyFactory)EPackage.Registry.INSTANCE.getEFactory(AnyPackage.eNS_URI);
			if (theAnyFactory != null) {
				return theAnyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AnyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnyFactoryImpl() {
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
			case AnyPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case AnyPackage.ELEMENT1: return createElement1();
			case AnyPackage.ELEMENT2: return createElement2();
			case AnyPackage.ELEMENT3: return createElement3();
			case AnyPackage.ROOT_ELEMENT_TYPE: return createRootElementType();
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
	public Element2 createElement2() {
		Element2Impl element2 = new Element2Impl();
		return element2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element3 createElement3() {
		Element3Impl element3 = new Element3Impl();
		return element3;
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
	public AnyPackage getAnyPackage() {
		return (AnyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AnyPackage getPackage() {
		return AnyPackage.eINSTANCE;
	}

} //AnyFactoryImpl
