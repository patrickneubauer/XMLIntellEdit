/**
 */
package com.example.example.with.mixed.unchanged;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.example.example.with.mixed.unchanged.UnchangedPackage
 * @generated
 */
public interface UnchangedFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UnchangedFactory eINSTANCE = com.example.example.with.mixed.unchanged.impl.UnchangedFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Customers Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customers Type</em>'.
	 * @generated
	 */
	CustomersType createCustomersType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Mixed Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mixed Type</em>'.
	 * @generated
	 */
	MixedType createMixedType();

	/**
	 * Returns a new object of class '<em>Root Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root Element Type</em>'.
	 * @generated
	 */
	RootElementType createRootElementType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UnchangedPackage getUnchangedPackage();

} //UnchangedFactory
