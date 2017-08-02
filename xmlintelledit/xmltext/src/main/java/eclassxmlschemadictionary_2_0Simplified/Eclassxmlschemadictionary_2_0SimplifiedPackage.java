/**
 */
package eclassxmlschemadictionary_2_0Simplified;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see eclassxmlschemadictionary_2_0Simplified.Eclassxmlschemadictionary_2_0SimplifiedFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface Eclassxmlschemadictionary_2_0SimplifiedPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "eclassxmlschemadictionary_2_0Simplified";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:eclass:xml-schema:dictionary:2.0simplified";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "_0s";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Eclassxmlschemadictionary_2_0SimplifiedPackage eINSTANCE = eclassxmlschemadictionary_2_0Simplified.impl.Eclassxmlschemadictionary_2_0SimplifiedPackageImpl.init();

	/**
	 * The meta object id for the '{@link eclassxmlschemadictionary_2_0Simplified.impl.ECLASSDICTIONARYImpl <em>ECLASSDICTIONARY</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eclassxmlschemadictionary_2_0Simplified.impl.ECLASSDICTIONARYImpl
	 * @see eclassxmlschemadictionary_2_0Simplified.impl.Eclassxmlschemadictionary_2_0SimplifiedPackageImpl#getECLASSDICTIONARY()
	 * @generated
	 */
	int ECLASSDICTIONARY = 0;

	/**
	 * The feature id for the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSDICTIONARY__HEADER = 0;

	/**
	 * The feature id for the '<em><b>Ontoml</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSDICTIONARY__ONTOML = 1;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSDICTIONARY__EXTENSIONS = 2;

	/**
	 * The number of structural features of the '<em>ECLASSDICTIONARY</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSDICTIONARY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>ECLASSDICTIONARY</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSDICTIONARY_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link eclassxmlschemadictionary_2_0Simplified.ECLASSDICTIONARY <em>ECLASSDICTIONARY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ECLASSDICTIONARY</em>'.
	 * @see eclassxmlschemadictionary_2_0Simplified.ECLASSDICTIONARY
	 * @generated
	 */
	EClass getECLASSDICTIONARY();

	/**
	 * Returns the meta object for the containment reference '{@link eclassxmlschemadictionary_2_0Simplified.ECLASSDICTIONARY#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Header</em>'.
	 * @see eclassxmlschemadictionary_2_0Simplified.ECLASSDICTIONARY#getHeader()
	 * @see #getECLASSDICTIONARY()
	 * @generated
	 */
	EReference getECLASSDICTIONARY_Header();

	/**
	 * Returns the meta object for the containment reference '{@link eclassxmlschemadictionary_2_0Simplified.ECLASSDICTIONARY#getOntoml <em>Ontoml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ontoml</em>'.
	 * @see eclassxmlschemadictionary_2_0Simplified.ECLASSDICTIONARY#getOntoml()
	 * @see #getECLASSDICTIONARY()
	 * @generated
	 */
	EReference getECLASSDICTIONARY_Ontoml();

	/**
	 * Returns the meta object for the containment reference '{@link eclassxmlschemadictionary_2_0Simplified.ECLASSDICTIONARY#getExtensions <em>Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extensions</em>'.
	 * @see eclassxmlschemadictionary_2_0Simplified.ECLASSDICTIONARY#getExtensions()
	 * @see #getECLASSDICTIONARY()
	 * @generated
	 */
	EReference getECLASSDICTIONARY_Extensions();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Eclassxmlschemadictionary_2_0SimplifiedFactory getEclassxmlschemadictionary_2_0SimplifiedFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link eclassxmlschemadictionary_2_0Simplified.impl.ECLASSDICTIONARYImpl <em>ECLASSDICTIONARY</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eclassxmlschemadictionary_2_0Simplified.impl.ECLASSDICTIONARYImpl
		 * @see eclassxmlschemadictionary_2_0Simplified.impl.Eclassxmlschemadictionary_2_0SimplifiedPackageImpl#getECLASSDICTIONARY()
		 * @generated
		 */
		EClass ECLASSDICTIONARY = eINSTANCE.getECLASSDICTIONARY();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASSDICTIONARY__HEADER = eINSTANCE.getECLASSDICTIONARY_Header();

		/**
		 * The meta object literal for the '<em><b>Ontoml</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASSDICTIONARY__ONTOML = eINSTANCE.getECLASSDICTIONARY_Ontoml();

		/**
		 * The meta object literal for the '<em><b>Extensions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASSDICTIONARY__EXTENSIONS = eINSTANCE.getECLASSDICTIONARY_Extensions();

	}

} //Eclassxmlschemadictionary_2_0SimplifiedPackage
