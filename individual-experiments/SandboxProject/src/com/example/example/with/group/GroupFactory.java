/**
 */
package com.example.example.with.group;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.example.example.with.group.GroupPackage
 * @generated
 */
public interface GroupFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GroupFactory eINSTANCE = com.example.example.with.group.impl.GroupFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Element1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element1</em>'.
	 * @generated
	 */
	Element1 createElement1();

	/**
	 * Returns a new object of class '<em>Element2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element2</em>'.
	 * @generated
	 */
	Element2 createElement2();

	/**
	 * Returns a new object of class '<em>Element3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element3</em>'.
	 * @generated
	 */
	Element3 createElement3();

	/**
	 * Returns a new object of class '<em>Root Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root Element Type</em>'.
	 * @generated
	 */
	RootElementType createRootElementType();

	/**
	 * Returns a new object of class '<em>Element1 Choice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element1 Choice</em>'.
	 * @generated
	 */
	Element1Choice createElement1Choice();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GroupPackage getGroupPackage();

} //GroupFactory
