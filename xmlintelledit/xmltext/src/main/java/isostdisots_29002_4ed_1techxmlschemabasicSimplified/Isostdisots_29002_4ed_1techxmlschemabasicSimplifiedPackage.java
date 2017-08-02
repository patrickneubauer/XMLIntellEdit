/**
 */
package isostdisots_29002_4ed_1techxmlschemabasicSimplified;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see isostdisots_29002_4ed_1techxmlschemabasicSimplified.Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "isostdisots_29002_4ed_1techxmlschemabasicSimplified";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:iso:std:iso:ts:29002:-4:ed-1:tech:xml-schema:basicsimplified";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "basics";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage eINSTANCE = isostdisots_29002_4ed_1techxmlschemabasicSimplified.impl.Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackageImpl.init();

	/**
	 * The meta object id for the '{@link isostdisots_29002_4ed_1techxmlschemabasicSimplified.impl.InternationalTextImpl <em>International Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see isostdisots_29002_4ed_1techxmlschemabasicSimplified.impl.InternationalTextImpl
	 * @see isostdisots_29002_4ed_1techxmlschemabasicSimplified.impl.Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackageImpl#getInternationalText()
	 * @generated
	 */
	int INTERNATIONAL_TEXT = 0;

	/**
	 * The feature id for the '<em><b>Local Strings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNATIONAL_TEXT__LOCAL_STRINGS = 0;

	/**
	 * The number of structural features of the '<em>International Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNATIONAL_TEXT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>International Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNATIONAL_TEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link isostdisots_29002_4ed_1techxmlschemabasicSimplified.impl.LanguageStringImpl <em>Language String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see isostdisots_29002_4ed_1techxmlschemabasicSimplified.impl.LanguageStringImpl
	 * @see isostdisots_29002_4ed_1techxmlschemabasicSimplified.impl.Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackageImpl#getLanguageString()
	 * @generated
	 */
	int LANGUAGE_STRING = 1;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_STRING__CONTENT = 0;

	/**
	 * The feature id for the '<em><b>Language Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_STRING__LANGUAGE_REF = 1;

	/**
	 * The feature id for the '<em><b>Language Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_STRING__LANGUAGE_CODE = 2;

	/**
	 * The feature id for the '<em><b>Country Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_STRING__COUNTRY_CODE = 3;

	/**
	 * The number of structural features of the '<em>Language String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_STRING_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Language String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_STRING_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link isostdisots_29002_4ed_1techxmlschemabasicSimplified.InternationalText <em>International Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>International Text</em>'.
	 * @see isostdisots_29002_4ed_1techxmlschemabasicSimplified.InternationalText
	 * @generated
	 */
	EClass getInternationalText();

	/**
	 * Returns the meta object for the containment reference list '{@link isostdisots_29002_4ed_1techxmlschemabasicSimplified.InternationalText#getLocalStrings <em>Local Strings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Local Strings</em>'.
	 * @see isostdisots_29002_4ed_1techxmlschemabasicSimplified.InternationalText#getLocalStrings()
	 * @see #getInternationalText()
	 * @generated
	 */
	EReference getInternationalText_LocalStrings();

	/**
	 * Returns the meta object for class '{@link isostdisots_29002_4ed_1techxmlschemabasicSimplified.LanguageString <em>Language String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language String</em>'.
	 * @see isostdisots_29002_4ed_1techxmlschemabasicSimplified.LanguageString
	 * @generated
	 */
	EClass getLanguageString();

	/**
	 * Returns the meta object for the attribute '{@link isostdisots_29002_4ed_1techxmlschemabasicSimplified.LanguageString#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see isostdisots_29002_4ed_1techxmlschemabasicSimplified.LanguageString#getContent()
	 * @see #getLanguageString()
	 * @generated
	 */
	EAttribute getLanguageString_Content();

	/**
	 * Returns the meta object for the attribute '{@link isostdisots_29002_4ed_1techxmlschemabasicSimplified.LanguageString#getLanguageRef <em>Language Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language Ref</em>'.
	 * @see isostdisots_29002_4ed_1techxmlschemabasicSimplified.LanguageString#getLanguageRef()
	 * @see #getLanguageString()
	 * @generated
	 */
	EAttribute getLanguageString_LanguageRef();

	/**
	 * Returns the meta object for the attribute '{@link isostdisots_29002_4ed_1techxmlschemabasicSimplified.LanguageString#getLanguageCode <em>Language Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language Code</em>'.
	 * @see isostdisots_29002_4ed_1techxmlschemabasicSimplified.LanguageString#getLanguageCode()
	 * @see #getLanguageString()
	 * @generated
	 */
	EAttribute getLanguageString_LanguageCode();

	/**
	 * Returns the meta object for the attribute '{@link isostdisots_29002_4ed_1techxmlschemabasicSimplified.LanguageString#getCountryCode <em>Country Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country Code</em>'.
	 * @see isostdisots_29002_4ed_1techxmlschemabasicSimplified.LanguageString#getCountryCode()
	 * @see #getLanguageString()
	 * @generated
	 */
	EAttribute getLanguageString_CountryCode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedFactory getIsostdisots_29002_4ed_1techxmlschemabasicSimplifiedFactory();

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
		 * The meta object literal for the '{@link isostdisots_29002_4ed_1techxmlschemabasicSimplified.impl.InternationalTextImpl <em>International Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see isostdisots_29002_4ed_1techxmlschemabasicSimplified.impl.InternationalTextImpl
		 * @see isostdisots_29002_4ed_1techxmlschemabasicSimplified.impl.Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackageImpl#getInternationalText()
		 * @generated
		 */
		EClass INTERNATIONAL_TEXT = eINSTANCE.getInternationalText();

		/**
		 * The meta object literal for the '<em><b>Local Strings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNATIONAL_TEXT__LOCAL_STRINGS = eINSTANCE.getInternationalText_LocalStrings();

		/**
		 * The meta object literal for the '{@link isostdisots_29002_4ed_1techxmlschemabasicSimplified.impl.LanguageStringImpl <em>Language String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see isostdisots_29002_4ed_1techxmlschemabasicSimplified.impl.LanguageStringImpl
		 * @see isostdisots_29002_4ed_1techxmlschemabasicSimplified.impl.Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackageImpl#getLanguageString()
		 * @generated
		 */
		EClass LANGUAGE_STRING = eINSTANCE.getLanguageString();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE_STRING__CONTENT = eINSTANCE.getLanguageString_Content();

		/**
		 * The meta object literal for the '<em><b>Language Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE_STRING__LANGUAGE_REF = eINSTANCE.getLanguageString_LanguageRef();

		/**
		 * The meta object literal for the '<em><b>Language Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE_STRING__LANGUAGE_CODE = eINSTANCE.getLanguageString_LanguageCode();

		/**
		 * The meta object literal for the '<em><b>Country Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE_STRING__COUNTRY_CODE = eINSTANCE.getLanguageString_CountryCode();

	}

} //Isostdisots_29002_4ed_1techxmlschemabasicSimplifiedPackage
