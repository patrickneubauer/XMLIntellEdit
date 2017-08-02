/**
 */
package com.example.example.with.datetypes;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.example.example.with.datetypes.DatetypesPackage
 * @generated
 */
public interface DatetypesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatetypesFactory eINSTANCE = com.example.example.with.datetypes.impl.DatetypesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Data Type Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Type Test</em>'.
	 * @generated
	 */
	DataTypeTest createDataTypeTest();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DatetypesPackage getDatetypesPackage();

} //DatetypesFactory
