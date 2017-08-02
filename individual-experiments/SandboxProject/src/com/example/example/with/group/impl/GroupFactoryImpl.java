/**
 */
package com.example.example.with.group.impl;

import com.example.example.with.group.*;

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
public class GroupFactoryImpl extends EFactoryImpl implements GroupFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GroupFactory init() {
		try {
			GroupFactory theGroupFactory = (GroupFactory)EPackage.Registry.INSTANCE.getEFactory(GroupPackage.eNS_URI);
			if (theGroupFactory != null) {
				return theGroupFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GroupFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupFactoryImpl() {
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
			case GroupPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case GroupPackage.ELEMENT1: return createElement1();
			case GroupPackage.ELEMENT2: return createElement2();
			case GroupPackage.ELEMENT3: return createElement3();
			case GroupPackage.ROOT_ELEMENT_TYPE: return createRootElementType();
			case GroupPackage.ELEMENT1_CHOICE: return createElement1Choice();
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
	public Element1Choice createElement1Choice() {
		Element1ChoiceImpl element1Choice = new Element1ChoiceImpl();
		return element1Choice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupPackage getGroupPackage() {
		return (GroupPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GroupPackage getPackage() {
		return GroupPackage.eINSTANCE;
	}

} //GroupFactoryImpl
