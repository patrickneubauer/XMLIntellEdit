/**
 */
package com.example.example.with.substitutiongroup;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.example.example.with.substitutiongroup.SubstitutiongroupPackage
 * @generated
 */
public interface SubstitutiongroupFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SubstitutiongroupFactory eINSTANCE = com.example.example.with.substitutiongroup.impl.SubstitutiongroupFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Custinfo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custinfo</em>'.
	 * @generated
	 */
	Custinfo createCustinfo();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SubstitutiongroupPackage getSubstitutiongroupPackage();

} //SubstitutiongroupFactory
