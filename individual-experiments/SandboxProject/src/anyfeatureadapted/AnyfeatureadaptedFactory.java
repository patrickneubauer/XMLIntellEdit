/**
 */
package anyfeatureadapted;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see anyfeatureadapted.AnyfeatureadaptedPackage
 * @generated
 */
public interface AnyfeatureadaptedFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnyfeatureadaptedFactory eINSTANCE = anyfeatureadapted.impl.AnyfeatureadaptedFactoryImpl.init();

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
	 * Returns a new object of class '<em>Properties</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Properties</em>'.
	 * @generated
	 */
	Properties createProperties();

	/**
	 * Returns a new object of class '<em>Root Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root Element Type</em>'.
	 * @generated
	 */
	RootElementType createRootElementType();

	/**
	 * Returns a new object of class '<em>Any Generic Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Any Generic Element</em>'.
	 * @generated
	 */
	AnyGenericElement createAnyGenericElement();

	/**
	 * Returns a new object of class '<em>Any Generic Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Any Generic Attribute</em>'.
	 * @generated
	 */
	AnyGenericAttribute createAnyGenericAttribute();

	/**
	 * Returns a new object of class '<em>Any Generic Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Any Generic Text</em>'.
	 * @generated
	 */
	AnyGenericText createAnyGenericText();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AnyfeatureadaptedPackage getAnyfeatureadaptedPackage();

} //AnyfeatureadaptedFactory
