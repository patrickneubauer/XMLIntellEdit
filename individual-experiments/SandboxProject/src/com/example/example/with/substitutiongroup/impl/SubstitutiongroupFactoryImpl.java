/**
 */
package com.example.example.with.substitutiongroup.impl;

import com.example.example.with.substitutiongroup.*;

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
public class SubstitutiongroupFactoryImpl extends EFactoryImpl implements SubstitutiongroupFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SubstitutiongroupFactory init() {
		try {
			SubstitutiongroupFactory theSubstitutiongroupFactory = (SubstitutiongroupFactory)EPackage.Registry.INSTANCE.getEFactory(SubstitutiongroupPackage.eNS_URI);
			if (theSubstitutiongroupFactory != null) {
				return theSubstitutiongroupFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SubstitutiongroupFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstitutiongroupFactoryImpl() {
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
			case SubstitutiongroupPackage.CUSTINFO: return createCustinfo();
			case SubstitutiongroupPackage.DOCUMENT_ROOT: return createDocumentRoot();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Custinfo createCustinfo() {
		CustinfoImpl custinfo = new CustinfoImpl();
		return custinfo;
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
	public SubstitutiongroupPackage getSubstitutiongroupPackage() {
		return (SubstitutiongroupPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SubstitutiongroupPackage getPackage() {
		return SubstitutiongroupPackage.eINSTANCE;
	}

} //SubstitutiongroupFactoryImpl
