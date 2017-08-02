/**
 */
package DataPackage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see DataPackage.DataPackagePackage
 * @generated
 */
public interface DataPackageFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataPackageFactory eINSTANCE = DataPackage.impl.DataPackageFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Data Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Class</em>'.
	 * @generated
	 */
	DataClass createDataClass();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DataPackagePackage getDataPackagePackage();

} //DataPackageFactory
